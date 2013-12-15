package edu.pku.cg;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.core.WhitespaceAnalyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Torun {
	public static void main(String[] args) throws IOException, ParseException {

		Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_40);
		analyzer = new WhitespaceAnalyzer(Version.LUCENE_40);
		String index_path = "D:/code_respo/index";
		String data_path = "D:/code_respo/django";
		String query_path = "D:/code_respo/query.py";

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

		Searcher searcher = new Searcher(index, analyzer);
		BufferedReader br = new BufferedReader(new FileReader(query_path));
		String s = null;
		String q = "";
		while ((s = br.readLine()) != null) {
			q += s;
		}
		searcher.doSearch(QueryParser.escape(q), 10);
		searcher.printResult();
		searcher.close();

	}
}
