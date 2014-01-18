package edu.pku.cg;

import java.util.ArrayList;
import java.util.List;

class CodeMethod {
	String name;
	List<String> body;
	String filepath;
	List<String> comment;

	List<Token> tokens = new ArrayList<Token>();

	static class Token {
		public String text;
		public int type;

		public Token(String text, int type) {
			this.text = text;
			this.type = type;
		}
	}
}
