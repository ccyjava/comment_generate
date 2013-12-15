package edu.pku.cg;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

public class IndexBuilder {
	String data_path;
	ExtractMethod em = new ExtractMethod();

	public IndexBuilder(String data_path) {
		this.data_path = data_path;
	}

	public Directory buildIndex(Analyzer analyzer, String index_path)
			throws IOException {
		Directory index = FSDirectory.open(new File(index_path));
		IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_40,
				analyzer);
		IndexWriter w = new IndexWriter(index, config);

		File datadir = new File(data_path);
		List<File> file_list = Util.travelDir(datadir);
		for (File file : file_list) {
			if (Util.fileFileter(file)) {
				System.out.println("-----indexing:processing "
						+ file.getCanonicalPath());
				em.processFile(file);
				// addDoc(w, file);
			}
		}
		addDoc(w, em.getCode_collection());
		w.close();
		return index;
	}

	private void addDoc(IndexWriter w, List<CodeMethod> code_collection)
			throws IOException {

		for (CodeMethod method : code_collection) {
			if (method.comment.size() > 0) {
				System.out.println("  adding " + method.name);
				Document doc_tmp = new Document();
				String code = "";
				for (String s : method.body) {
					code += s;
				}
				String comment = "";
				for (String s : method.comment) {
					comment = comment + "\n" + s;
				}
				doc_tmp.add(new Field("code", code, Field.Store.NO,
						Field.Index.ANALYZED));
				doc_tmp.add(new Field("comment", comment, Field.Store.YES,
						Field.Index.ANALYZED));
				doc_tmp.add(new Field("function_name", method.name,
						Field.Store.YES, Field.Index.ANALYZED));
				doc_tmp.add(new Field("file_path", method.filepath,
						Field.Store.YES, Field.Index.ANALYZED));
				w.addDocument(doc_tmp);
			}

		}
		// doc.add(new Field("code", new FileReader(file),
		// Field.TermVector.WITH_POSITIONS_OFFSETS));
		// doc.add(new Field("path", file.getCanonicalPath(), Field.Store.YES,
		// Field.Index.NOT_ANALYZED));
		// w.addDocument(doc);
	}
}
