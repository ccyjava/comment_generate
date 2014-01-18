package edu.pku.cg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.Terms;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.apache.lucene.util.Version;

public class Searcher {
	Analyzer analyzer;

	IndexSearcher searcher;

	ScoreDoc[] hits = null;

	public Searcher(Directory index, Analyzer analyzer) {

		this.analyzer = analyzer;
		IndexReader reader;
		try {
			reader = DirectoryReader.open(index);
			searcher = new IndexSearcher(reader);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void close() {
		if (searcher != null) {
			try {
				searcher.getIndexReader().close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	public void doSearch(String querystr, int hitsPerPage) {
		Query q;
		try {
			q = new QueryParser(Version.LUCENE_40, "code", analyzer)
					.parse(querystr);

			// 3. search

			TopScoreDocCollector collector = TopScoreDocCollector.create(
					hitsPerPage, true);
			searcher.search(q, collector);
			hits = collector.topDocs().scoreDocs;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void printResult(double threshold, PrintWriter pw) {
		if (pw == null) {
			pw = new PrintWriter(System.out);
		}
		try {

			if (hits != null & searcher != null) {
				pw.println("Found " + hits.length + " hits.");
				for (int i = 0; i < hits.length; ++i) {
					if (i > 3 && hits[i].score < threshold) {
						break;
					}
					int docId = hits[i].doc;

					Document d = searcher.doc(docId);
					// Terms tv = searcher.getIndexReader().getTermVector(docId,
					// "content");
					// List<String> comments = getComment(d.get("path"));

					pw.println((i + 1) + ". " + d.get("function_name")
							+ hits[i].score + "                     "
							+ d.get("file_path"));
					pw.println(d.get("comment") + "\n");

					// printComment(comments);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private List<String> getComment(String path) {
		FileReader fr;
		List<String> list = new LinkedList<String>();
		try {
			fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			while ((s = br.readLine()) != null) {
				if (s.contains("#")) {
					s = s.substring(s.indexOf("#"));
					list.add(s);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	private void printComment(List<String> comments) {
		for (String comment : comments) {
			System.out.println("           " + comment);
		}
	}
}
