package edu.pku.cg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

public class Test {
	public static void main1(String[] args) {
		String s = "a";
		for (String a : s.split(s.trim())) {
			System.out.println(a + ":" + a.length());
		}
		File file = new File("D:/testa");
		List<File> file_list = travelDir(file);
		for (File f : file_list) {
			try {
				System.out.println(f.getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main5(String[] args) {
		ExtractMethod em = new ExtractMethod();
		List<CodeMethod> code_collection = em.processFile(new File(
				"D:\\code_respo\\test\\test.py"));
		System.out.println(code_collection);
	}

	public static void main2(String[] args) {

		preProcess(new File("D:\\code_respo\\django"), new File(
				"D:/code_respo/well_data"));

	}

	public static void main(String args[]) {
		try {
			Directory index = FSDirectory
					.open(new File("D:\\code_respo\\index"));
			IndexReader reader = DirectoryReader.open(index);
			IndexSearcher searcher = new IndexSearcher(reader);
			System.out.println(reader.numDocs());
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void preProcess(File source_path, File target_path) {
		List<File> src_list = Util.travelDir(source_path);
		for (File f : src_list) {
			if (Util.fileFileter(f)) {
				String path = "";
				try {

					path = target_path.getCanonicalPath()
							+ f.getCanonicalPath().substring(
									source_path.getCanonicalPath().length());
					System.out.println(path);
					ExtractMethod em = new ExtractMethod();
					em.processFile(f);
					String result = em.printCodeCollection();
					File file = new File(path);
					file.getParentFile().mkdirs();
					FileWriter fw = new FileWriter(file);
					fw.write(result);
					fw.close();

				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}

	public static List<File> travelDir(File file) {
		List<File> list = new LinkedList<File>();
		for (File f : file.listFiles()) {
			if (f.isDirectory()) {
				list.addAll(travelDir(f));
			} else if (f.isFile()) {
				list.add(f);
			}
		}
		return list;
	}
}
