package edu.pku.cg;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Util {
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

	public static boolean fileFileter(File file) {
		if (file.getName().endsWith(".py"))
			return true;
		return false;
	}
}
