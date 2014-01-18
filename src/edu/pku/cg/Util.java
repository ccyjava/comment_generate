package edu.pku.cg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.Token;

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

	public static void processMethod(CodeMethod cm) {

		try {
			String code = "";
			for (String s : cm.body) {
				code = code + "\n" + s;
			}

			ANTLRReaderStream input = null;
			try {
				input = new ANTLRReaderStream(new StringReader(code));
			} catch (IOException e) {
				e.printStackTrace();
			}
			Lexer lex = new PythonLexer(input);
			Token token = null;
			while ((token = lex.nextToken()).getType() != -1) {

				cm.tokens.clear();
				cm.tokens.add(new CodeMethod.Token(token.getText(), token
						.getType()));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
