package edu.pku.cg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.core.WhitespaceAnalyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

public class Evaluation {
	public static void main(String[] args) throws Exception {
		Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_40);
		analyzer = new WhitespaceAnalyzer(Version.LUCENE_40);
		String index_path = "D:/code_respo/index";
		String data_path = "D:/code_respo/respo";
		String query_path = "D:/code_respo/query.py";
		String search_path = "D:/code_respo/tornado";

		IndexBuilder ib = new IndexBuilder(data_path);
		Directory index;
		File index_file = new File(index_path);
		if (index_file.exists()) {
			System.out.println("load index!");
			index = FSDirectory.open(index_file);
		} else {
			System.out.println("build index!");
			index = ib.buildIndex(analyzer, index_path);
		}

		System.out.println("index complete!");

		// ===========================================================
		ExtractMethod em = new ExtractMethod();
		File datadir = new File(search_path);
		List<File> file_list = Util.travelDir(datadir);
		for (File file : file_list) {
			if (Util.fileFileter(file)) {
				System.out.println("-----prepare method of "
						+ file.getCanonicalPath());
				em.processFile(file);
			}
		}

		List<CodeMethod> code_collection = em.getFilteredCode_collection(50);

		// ============================================================

		Searcher searcher = new Searcher(index, analyzer);
		int score[] = { 0, 0, 0, 0 };
		Scanner in = new Scanner(System.in);
		int count = 0;
		for (CodeMethod cm : code_collection) {
			count++;
			FileWriter fw = new FileWriter(query_path);
			PrintWriter pw = new PrintWriter(fw);
			fw.write(em.commentToString(cm));
			fw.write(em.methodToString(cm));

			String q = em.methodToString(cm);
			searcher.doSearch(QueryParser.escape(q), searcher.searcher
					.getIndexReader().maxDoc());
			searcher.printResult(0.3, pw);// set threshold to print
			System.out.print("No." + count + " please score the result(0-3): ");
			int tmp = in.nextInt();
			if (tmp == -1) {
				break;
			}
			if (tmp == -2) {
				continue;
			}
			score[tmp]++;
			fw.close();
		}
		System.out.print("score : ");
		for (int i = 0; i < score.length; i++) {
			System.out.print(" " + score[i]);
		}
		System.out.println();
		searcher.close();

	}
}
