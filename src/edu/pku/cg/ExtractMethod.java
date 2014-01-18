package edu.pku.cg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedList;
import java.util.List;

public class ExtractMethod {
	class Code {
		String[] code;
		int pos;
		String filepath;

		String getCode() {
			return code[pos];
		}

		void next() {
			pos++;
		}

		boolean hasNext() {
			if (code == null) {
				return false;
			}
			return pos < code.length;
		}
	}

	List<CodeMethod> code_collection = new LinkedList<CodeMethod>();

	public List<CodeMethod> getCode_collection() {
		return code_collection;
	}

	public List<CodeMethod> getFilteredCode_collection(int threshold) {
		List<CodeMethod> filter_code_collection = new LinkedList<CodeMethod>();
		for (CodeMethod cm : code_collection) {
			if (cm.body.size() > threshold) {
				filter_code_collection.add(cm);
			}
		}
		return filter_code_collection;
	}

	public String methodToString(CodeMethod cm) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		pw.println(cm.name);
		for (String line : cm.body) {
			pw.println(line);
		}
		pw.println("\n");
		return sw.toString();
	}

	public String commentToString(CodeMethod cm) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		pw.println(cm.name);
		try {
			for (String line : cm.comment) {
				pw.println("#" + line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		pw.println("\n");
		return sw.toString();
	}

	public String printCodeCollection() {
		String result = "";
		for (CodeMethod cm : code_collection) {

			result += methodToString(cm);
		}

		result += "================================================================\n\n\n\n";
		for (CodeMethod cm : code_collection) {
			result += commentToString(cm);
		}
		return result;
	}

	public void getMethod(Code sourcecode) {
		// mining functions in a file
		while (sourcecode.hasNext()) {
			if (sourcecode.getCode().trim().startsWith("def")) {
				CodeMethod tmp = new CodeMethod();
				tmp.name = sourcecode.getCode().trim();
				tmp.filepath = sourcecode.filepath;
				int pre = calcuSpace(sourcecode.getCode());
				sourcecode.next();
				tmp.body = getMethodBody(sourcecode, pre + 4);
				splitCodeAndComment(tmp);
				code_collection.add(tmp);
			} else {
				sourcecode.next();
			}
		}
	}

	public List<CodeMethod> processFile(File file) {
		Code code = new Code();
		code.code = getSourceCode(file);
		code.pos = 0;
		try {
			code.filepath = file.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		getMethod(code);
		return code_collection;
	}

	public List<String> getMethodBody(Code sourcecode, int offset) {
		// mining specific function's body
		List<String> body = new LinkedList<String>();
		while (sourcecode.hasNext()) {
			int pre = calcuSpace(sourcecode.getCode());
			if (sourcecode.getCode().equals("")) {
				sourcecode.next();
				continue;
			}
			if (pre < offset) {
				break;
			} else if (sourcecode.getCode().trim().startsWith("def")) {
				CodeMethod tmp = new CodeMethod();
				tmp.name = sourcecode.getCode().trim();
				tmp.filepath = sourcecode.filepath;
				sourcecode.next();
				tmp.body = getMethodBody(sourcecode, offset + 4);
				splitCodeAndComment(tmp);
				code_collection.add(tmp);
			} else if (pre >= offset) {
				body.add(sourcecode.getCode().substring(offset - 4));
				sourcecode.next();
			}
		}
		return body;
	}

	public int calcuSpace(String s) {
		// calculate how many space in front of a string
		int pre = 0;
		while (pre < s.length()) {
			if (s.charAt(pre) == ' ') {
				pre++;
			} else {
				break;
			}
		}
		return pre;
	}

	public void splitCodeAndComment(CodeMethod cm) {
		List<String> src = new LinkedList<String>();
		List<String> comment = new LinkedList<String>();
		boolean comment_mode = false; // multi-line comment mode
		String comment_mark = "";
		StringBuilder sb = null;
		for (String sen : cm.body) {
			if (comment_mode) {
				if (sen.trim().endsWith(comment_mark)) {
					sb.append(sen.trim().substring(0, sen.trim().length() - 3));
					comment.add(sb.toString());
					comment_mode = false;
				} else {
					sb.append(sen.trim());
				}
			} else {
				if (sen.trim().startsWith("\"\"\"")
						|| sen.trim().startsWith("'''")) {
					comment_mode = true;
					comment_mark = sen.trim().substring(0, 3);
					sb = new StringBuilder();
					sb.append(sen.trim().substring(3));
				} else if (sen.trim().startsWith("#")) {
					comment.add(sen.trim().substring(1));
				} else {
					String[] tmp = sen.split("#");
					src.add(tmp[0]);
					if (tmp.length > 1) {
						comment.add(tmp[1]);
					}
				}
			}
		}
		cm.body = src;
		cm.comment = comment;
	}

	public String[] getSourceCode(File file) {
		List<String> list = new LinkedList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s;
			while ((s = br.readLine()) != null) {
				s = s.replace("	", "    ");
				list.add(s);
			}
		} catch (Exception e) {
			try {
				System.err.println(file.getCanonicalPath());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		if (list.size() < 1) {
			return null;
		}
		return list.toArray(new String[1]);
	}

}
