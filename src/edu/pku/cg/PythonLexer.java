package edu.pku.cg;

// $ANTLR 3.5.1 Python.g 2014-01-07 21:06:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PythonLexer extends Lexer {
	public static final int EOF = -1;
	public static final int T__71 = 71;
	public static final int T__72 = 72;
	public static final int T__73 = 73;
	public static final int T__74 = 74;
	public static final int T__75 = 75;
	public static final int T__76 = 76;
	public static final int T__77 = 77;
	public static final int T__78 = 78;
	public static final int T__79 = 79;
	public static final int T__80 = 80;
	public static final int T__81 = 81;
	public static final int T__82 = 82;
	public static final int T__83 = 83;
	public static final int T__84 = 84;
	public static final int T__85 = 85;
	public static final int T__86 = 86;
	public static final int T__87 = 87;
	public static final int T__88 = 88;
	public static final int T__89 = 89;
	public static final int T__90 = 90;
	public static final int T__91 = 91;
	public static final int T__92 = 92;
	public static final int T__93 = 93;
	public static final int T__94 = 94;
	public static final int T__95 = 95;
	public static final int T__96 = 96;
	public static final int T__97 = 97;
	public static final int T__98 = 98;
	public static final int ALT_NOTEQUAL = 4;
	public static final int AMPER = 5;
	public static final int AMPEREQUAL = 6;
	public static final int AND = 7;
	public static final int ASSIGN = 8;
	public static final int AT = 9;
	public static final int BACKQUOTE = 10;
	public static final int CIRCUMFLEX = 11;
	public static final int CIRCUMFLEXEQUAL = 12;
	public static final int COLON = 13;
	public static final int COMMA = 14;
	public static final int COMMENT = 15;
	public static final int COMPLEX = 16;
	public static final int CONTINUED_LINE = 17;
	public static final int DEDENT = 18;
	public static final int DIGITS = 19;
	public static final int DOT = 20;
	public static final int DOUBLESLASH = 21;
	public static final int DOUBLESLASHEQUAL = 22;
	public static final int DOUBLESTAR = 23;
	public static final int DOUBLESTAREQUAL = 24;
	public static final int EQUAL = 25;
	public static final int ESC = 26;
	public static final int Exponent = 27;
	public static final int FLOAT = 28;
	public static final int GREATER = 29;
	public static final int GREATEREQUAL = 30;
	public static final int INDENT = 31;
	public static final int INT = 32;
	public static final int LBRACK = 33;
	public static final int LCURLY = 34;
	public static final int LEADING_WS = 35;
	public static final int LEFTSHIFT = 36;
	public static final int LEFTSHIFTEQUAL = 37;
	public static final int LESS = 38;
	public static final int LESSEQUAL = 39;
	public static final int LONGINT = 40;
	public static final int LPAREN = 41;
	public static final int MINUS = 42;
	public static final int MINUSEQUAL = 43;
	public static final int NAME = 44;
	public static final int NEWLINE = 45;
	public static final int NOT = 46;
	public static final int NOTEQUAL = 47;
	public static final int OR = 48;
	public static final int PERCENT = 49;
	public static final int PERCENTEQUAL = 50;
	public static final int PLUS = 51;
	public static final int PLUSEQUAL = 52;
	public static final int RBRACK = 53;
	public static final int RCURLY = 54;
	public static final int RIGHTSHIFT = 55;
	public static final int RIGHTSHIFTEQUAL = 56;
	public static final int RPAREN = 57;
	public static final int SEMI = 58;
	public static final int SLASH = 59;
	public static final int SLASHEQUAL = 60;
	public static final int STAR = 61;
	public static final int STAREQUAL = 62;
	public static final int STRING = 63;
	public static final int TILDE = 64;
	public static final int TRIAPOS = 65;
	public static final int TRIQUOTE = 66;
	public static final int VBAR = 67;
	public static final int VBAREQUAL = 68;
	public static final int WHITESPACE = 69;
	public static final int WS = 70;

	/**
	 * Handles context-sensitive lexing of implicit line joining such as the
	 * case where newline is ignored in cases like this: a = [3, 4]
	 */
	int implicitLineJoiningLevel = 0;
	int startPos = -1;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public PythonLexer() {
	}

	public PythonLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public PythonLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override
	public String getGrammarFileName() {
		return "Python.g";
	}

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:12:7: ( 'as' )
			// Python.g:12:9: 'as'
			{
				match("as");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:13:7: ( 'assert' )
			// Python.g:13:9: 'assert'
			{
				match("assert");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:14:7: ( 'break' )
			// Python.g:14:9: 'break'
			{
				match("break");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:15:7: ( 'class' )
			// Python.g:15:9: 'class'
			{
				match("class");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:16:7: ( 'continue' )
			// Python.g:16:9: 'continue'
			{
				match("continue");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:17:7: ( 'def' )
			// Python.g:17:9: 'def'
			{
				match("def");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:18:7: ( 'del' )
			// Python.g:18:9: 'del'
			{
				match("del");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:19:7: ( 'elif' )
			// Python.g:19:9: 'elif'
			{
				match("elif");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:20:7: ( 'else' )
			// Python.g:20:9: 'else'
			{
				match("else");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:21:7: ( 'except' )
			// Python.g:21:9: 'except'
			{
				match("except");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:22:7: ( 'exec' )
			// Python.g:22:9: 'exec'
			{
				match("exec");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:23:7: ( 'finally' )
			// Python.g:23:9: 'finally'
			{
				match("finally");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:24:7: ( 'for' )
			// Python.g:24:9: 'for'
			{
				match("for");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:25:7: ( 'from' )
			// Python.g:25:9: 'from'
			{
				match("from");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:26:7: ( 'global' )
			// Python.g:26:9: 'global'
			{
				match("global");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:27:7: ( 'if' )
			// Python.g:27:9: 'if'
			{
				match("if");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:28:7: ( 'import' )
			// Python.g:28:9: 'import'
			{
				match("import");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:29:7: ( 'in' )
			// Python.g:29:9: 'in'
			{
				match("in");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:30:7: ( 'is' )
			// Python.g:30:9: 'is'
			{
				match("is");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:31:7: ( 'lambda' )
			// Python.g:31:9: 'lambda'
			{
				match("lambda");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:32:7: ( 'pass' )
			// Python.g:32:9: 'pass'
			{
				match("pass");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:33:7: ( 'print' )
			// Python.g:33:9: 'print'
			{
				match("print");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:34:7: ( 'raise' )
			// Python.g:34:9: 'raise'
			{
				match("raise");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:35:7: ( 'return' )
			// Python.g:35:9: 'return'
			{
				match("return");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:36:7: ( 'try' )
			// Python.g:36:9: 'try'
			{
				match("try");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__95"

	// $ANTLR start "T__96"
	public final void mT__96() throws RecognitionException {
		try {
			int _type = T__96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:37:7: ( 'while' )
			// Python.g:37:9: 'while'
			{
				match("while");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__96"

	// $ANTLR start "T__97"
	public final void mT__97() throws RecognitionException {
		try {
			int _type = T__97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:38:7: ( 'with' )
			// Python.g:38:9: 'with'
			{
				match("with");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__97"

	// $ANTLR start "T__98"
	public final void mT__98() throws RecognitionException {
		try {
			int _type = T__98;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:39:7: ( 'yield' )
			// Python.g:39:9: 'yield'
			{
				match("yield");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T__98"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:75:11: ( ( ' ' | '\\t' )+ )
			// Python.g:75:13: ( ' ' | '\\t' )+
			{
				// Python.g:75:13: ( ' ' | '\\t' )+
				int cnt1 = 0;
				loop1: while (true) {
					int alt1 = 2;
					int LA1_0 = input.LA(1);
					if ((LA1_0 == '\t' || LA1_0 == ' ')) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
					// Python.g:
					{
						if (input.LA(1) == '\t' || input.LA(1) == ' ') {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						if (cnt1 >= 1)
							break loop1;
						EarlyExitException eee = new EarlyExitException(1,
								input);
						throw eee;
					}
					cnt1++;
				}

				_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "WHITESPACE"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:444:11: ( '(' )
			// Python.g:444:13: '('
			{
				match('(');
				implicitLineJoiningLevel++;
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:446:11: ( ')' )
			// Python.g:446:13: ')'
			{
				match(')');
				implicitLineJoiningLevel--;
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACK"
	public final void mLBRACK() throws RecognitionException {
		try {
			int _type = LBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:448:11: ( '[' )
			// Python.g:448:13: '['
			{
				match('[');
				implicitLineJoiningLevel++;
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LBRACK"

	// $ANTLR start "RBRACK"
	public final void mRBRACK() throws RecognitionException {
		try {
			int _type = RBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:450:11: ( ']' )
			// Python.g:450:13: ']'
			{
				match(']');
				implicitLineJoiningLevel--;
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "RBRACK"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:452:11: ( ':' )
			// Python.g:452:13: ':'
			{
				match(':');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:454:10: ( ',' )
			// Python.g:454:12: ','
			{
				match(',');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "COMMA"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:456:9: ( ';' )
			// Python.g:456:11: ';'
			{
				match(';');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "SEMI"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:458:9: ( '+' )
			// Python.g:458:11: '+'
			{
				match('+');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:460:10: ( '-' )
			// Python.g:460:12: '-'
			{
				match('-');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "MINUS"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:462:9: ( '*' )
			// Python.g:462:11: '*'
			{
				match('*');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "STAR"

	// $ANTLR start "SLASH"
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:464:10: ( '/' )
			// Python.g:464:12: '/'
			{
				match('/');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "SLASH"

	// $ANTLR start "VBAR"
	public final void mVBAR() throws RecognitionException {
		try {
			int _type = VBAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:466:9: ( '|' )
			// Python.g:466:11: '|'
			{
				match('|');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "VBAR"

	// $ANTLR start "AMPER"
	public final void mAMPER() throws RecognitionException {
		try {
			int _type = AMPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:468:10: ( '&' )
			// Python.g:468:12: '&'
			{
				match('&');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "AMPER"

	// $ANTLR start "LESS"
	public final void mLESS() throws RecognitionException {
		try {
			int _type = LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:470:9: ( '<' )
			// Python.g:470:11: '<'
			{
				match('<');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LESS"

	// $ANTLR start "GREATER"
	public final void mGREATER() throws RecognitionException {
		try {
			int _type = GREATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:472:12: ( '>' )
			// Python.g:472:14: '>'
			{
				match('>');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "GREATER"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:474:11: ( '=' )
			// Python.g:474:13: '='
			{
				match('=');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "ASSIGN"

	// $ANTLR start "PERCENT"
	public final void mPERCENT() throws RecognitionException {
		try {
			int _type = PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:476:12: ( '%' )
			// Python.g:476:14: '%'
			{
				match('%');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "PERCENT"

	// $ANTLR start "BACKQUOTE"
	public final void mBACKQUOTE() throws RecognitionException {
		try {
			int _type = BACKQUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:478:14: ( '`' )
			// Python.g:478:16: '`'
			{
				match('`');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "BACKQUOTE"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:480:11: ( '{' )
			// Python.g:480:13: '{'
			{
				match('{');
				implicitLineJoiningLevel++;
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:482:11: ( '}' )
			// Python.g:482:13: '}'
			{
				match('}');
				implicitLineJoiningLevel--;
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "RCURLY"

	// $ANTLR start "CIRCUMFLEX"
	public final void mCIRCUMFLEX() throws RecognitionException {
		try {
			int _type = CIRCUMFLEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:484:15: ( '^' )
			// Python.g:484:17: '^'
			{
				match('^');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "CIRCUMFLEX"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:486:10: ( '~' )
			// Python.g:486:12: '~'
			{
				match('~');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "TILDE"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:488:10: ( '==' )
			// Python.g:488:12: '=='
			{
				match("==");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "EQUAL"

	// $ANTLR start "NOTEQUAL"
	public final void mNOTEQUAL() throws RecognitionException {
		try {
			int _type = NOTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:490:13: ( '!=' )
			// Python.g:490:15: '!='
			{
				match("!=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "NOTEQUAL"

	// $ANTLR start "ALT_NOTEQUAL"
	public final void mALT_NOTEQUAL() throws RecognitionException {
		try {
			int _type = ALT_NOTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:492:13: ( '<>' )
			// Python.g:492:15: '<>'
			{
				match("<>");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "ALT_NOTEQUAL"

	// $ANTLR start "LESSEQUAL"
	public final void mLESSEQUAL() throws RecognitionException {
		try {
			int _type = LESSEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:494:14: ( '<=' )
			// Python.g:494:16: '<='
			{
				match("<=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LESSEQUAL"

	// $ANTLR start "LEFTSHIFT"
	public final void mLEFTSHIFT() throws RecognitionException {
		try {
			int _type = LEFTSHIFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:496:14: ( '<<' )
			// Python.g:496:16: '<<'
			{
				match("<<");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LEFTSHIFT"

	// $ANTLR start "GREATEREQUAL"
	public final void mGREATEREQUAL() throws RecognitionException {
		try {
			int _type = GREATEREQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:498:17: ( '>=' )
			// Python.g:498:19: '>='
			{
				match(">=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "GREATEREQUAL"

	// $ANTLR start "RIGHTSHIFT"
	public final void mRIGHTSHIFT() throws RecognitionException {
		try {
			int _type = RIGHTSHIFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:500:15: ( '>>' )
			// Python.g:500:17: '>>'
			{
				match(">>");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "RIGHTSHIFT"

	// $ANTLR start "PLUSEQUAL"
	public final void mPLUSEQUAL() throws RecognitionException {
		try {
			int _type = PLUSEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:502:14: ( '+=' )
			// Python.g:502:16: '+='
			{
				match("+=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "PLUSEQUAL"

	// $ANTLR start "MINUSEQUAL"
	public final void mMINUSEQUAL() throws RecognitionException {
		try {
			int _type = MINUSEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:504:15: ( '-=' )
			// Python.g:504:17: '-='
			{
				match("-=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "MINUSEQUAL"

	// $ANTLR start "DOUBLESTAR"
	public final void mDOUBLESTAR() throws RecognitionException {
		try {
			int _type = DOUBLESTAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:506:15: ( '**' )
			// Python.g:506:17: '**'
			{
				match("**");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DOUBLESTAR"

	// $ANTLR start "STAREQUAL"
	public final void mSTAREQUAL() throws RecognitionException {
		try {
			int _type = STAREQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:508:14: ( '*=' )
			// Python.g:508:16: '*='
			{
				match("*=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "STAREQUAL"

	// $ANTLR start "DOUBLESLASH"
	public final void mDOUBLESLASH() throws RecognitionException {
		try {
			int _type = DOUBLESLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:510:16: ( '//' )
			// Python.g:510:18: '//'
			{
				match("//");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DOUBLESLASH"

	// $ANTLR start "SLASHEQUAL"
	public final void mSLASHEQUAL() throws RecognitionException {
		try {
			int _type = SLASHEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:512:15: ( '/=' )
			// Python.g:512:17: '/='
			{
				match("/=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "SLASHEQUAL"

	// $ANTLR start "VBAREQUAL"
	public final void mVBAREQUAL() throws RecognitionException {
		try {
			int _type = VBAREQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:514:14: ( '|=' )
			// Python.g:514:16: '|='
			{
				match("|=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "VBAREQUAL"

	// $ANTLR start "PERCENTEQUAL"
	public final void mPERCENTEQUAL() throws RecognitionException {
		try {
			int _type = PERCENTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:516:17: ( '%=' )
			// Python.g:516:19: '%='
			{
				match("%=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "PERCENTEQUAL"

	// $ANTLR start "AMPEREQUAL"
	public final void mAMPEREQUAL() throws RecognitionException {
		try {
			int _type = AMPEREQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:518:15: ( '&=' )
			// Python.g:518:17: '&='
			{
				match("&=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "AMPEREQUAL"

	// $ANTLR start "CIRCUMFLEXEQUAL"
	public final void mCIRCUMFLEXEQUAL() throws RecognitionException {
		try {
			int _type = CIRCUMFLEXEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:520:20: ( '^=' )
			// Python.g:520:22: '^='
			{
				match("^=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "CIRCUMFLEXEQUAL"

	// $ANTLR start "LEFTSHIFTEQUAL"
	public final void mLEFTSHIFTEQUAL() throws RecognitionException {
		try {
			int _type = LEFTSHIFTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:522:19: ( '<<=' )
			// Python.g:522:21: '<<='
			{
				match("<<=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LEFTSHIFTEQUAL"

	// $ANTLR start "RIGHTSHIFTEQUAL"
	public final void mRIGHTSHIFTEQUAL() throws RecognitionException {
		try {
			int _type = RIGHTSHIFTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:524:20: ( '>>=' )
			// Python.g:524:22: '>>='
			{
				match(">>=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "RIGHTSHIFTEQUAL"

	// $ANTLR start "DOUBLESTAREQUAL"
	public final void mDOUBLESTAREQUAL() throws RecognitionException {
		try {
			int _type = DOUBLESTAREQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:526:20: ( '**=' )
			// Python.g:526:22: '**='
			{
				match("**=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DOUBLESTAREQUAL"

	// $ANTLR start "DOUBLESLASHEQUAL"
	public final void mDOUBLESLASHEQUAL() throws RecognitionException {
		try {
			int _type = DOUBLESLASHEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:528:21: ( '//=' )
			// Python.g:528:23: '//='
			{
				match("//=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DOUBLESLASHEQUAL"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:530:5: ( '.' )
			// Python.g:530:7: '.'
			{
				match('.');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DOT"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:532:4: ( '@' )
			// Python.g:532:6: '@'
			{
				match('@');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "AT"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:534:5: ( 'and' )
			// Python.g:534:7: 'and'
			{
				match("and");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:536:4: ( 'or' )
			// Python.g:536:6: 'or'
			{
				match("or");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:538:5: ( 'not' )
			// Python.g:538:7: 'not'
			{
				match("not");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "NOT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:541:5: ( '.' DIGITS ( Exponent )? | DIGITS '.' Exponent
			// | DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent ) )
			int alt6 = 3;
			alt6 = dfa6.predict(input);
			switch (alt6) {
			case 1:
			// Python.g:541:9: '.' DIGITS ( Exponent )?
			{
				match('.');
				mDIGITS();

				// Python.g:541:20: ( Exponent )?
				int alt2 = 2;
				int LA2_0 = input.LA(1);
				if ((LA2_0 == 'E' || LA2_0 == 'e')) {
					alt2 = 1;
				}
				switch (alt2) {
				case 1:
				// Python.g:541:21: Exponent
				{
					mExponent();

				}
					break;

				}

			}
				break;
			case 2:
			// Python.g:542:9: DIGITS '.' Exponent
			{
				mDIGITS();

				match('.');
				mExponent();

			}
				break;
			case 3:
			// Python.g:543:9: DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent
			// )
			{
				mDIGITS();

				// Python.g:543:16: ( '.' ( DIGITS ( Exponent )? )? | Exponent )
				int alt5 = 2;
				int LA5_0 = input.LA(1);
				if ((LA5_0 == '.')) {
					alt5 = 1;
				} else if ((LA5_0 == 'E' || LA5_0 == 'e')) {
					alt5 = 2;
				}

				else {
					NoViableAltException nvae = new NoViableAltException("", 5,
							0, input);
					throw nvae;
				}

				switch (alt5) {
				case 1:
				// Python.g:543:17: '.' ( DIGITS ( Exponent )? )?
				{
					match('.');
					// Python.g:543:21: ( DIGITS ( Exponent )? )?
					int alt4 = 2;
					int LA4_0 = input.LA(1);
					if (((LA4_0 >= '0' && LA4_0 <= '9'))) {
						alt4 = 1;
					}
					switch (alt4) {
					case 1:
					// Python.g:543:22: DIGITS ( Exponent )?
					{
						mDIGITS();

						// Python.g:543:29: ( Exponent )?
						int alt3 = 2;
						int LA3_0 = input.LA(1);
						if ((LA3_0 == 'E' || LA3_0 == 'e')) {
							alt3 = 1;
						}
						switch (alt3) {
						case 1:
						// Python.g:543:30: Exponent
						{
							mExponent();

						}
							break;

						}

					}
						break;

					}

				}
					break;
				case 2:
				// Python.g:543:45: Exponent
				{
					mExponent();

				}
					break;

				}

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "FLOAT"

	// $ANTLR start "LONGINT"
	public final void mLONGINT() throws RecognitionException {
		try {
			int _type = LONGINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:547:5: ( INT ( 'l' | 'L' ) )
			// Python.g:547:9: INT ( 'l' | 'L' )
			{
				mINT();

				if (input.LA(1) == 'L' || input.LA(1) == 'l') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LONGINT"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// Python.g:553:5: ( ( 'e' | 'E' ) ( '+' | '-' )? DIGITS )
			// Python.g:553:10: ( 'e' | 'E' ) ( '+' | '-' )? DIGITS
			{
				if (input.LA(1) == 'E' || input.LA(1) == 'e') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}
				// Python.g:553:22: ( '+' | '-' )?
				int alt7 = 2;
				int LA7_0 = input.LA(1);
				if ((LA7_0 == '+' || LA7_0 == '-')) {
					alt7 = 1;
				}
				switch (alt7) {
				case 1:
				// Python.g:
				{
					if (input.LA(1) == '+' || input.LA(1) == '-') {
						input.consume();
					} else {
						MismatchedSetException mse = new MismatchedSetException(
								null, input);
						recover(mse);
						throw mse;
					}
				}
					break;

				}

				mDIGITS();

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "Exponent"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:555:5: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' |
			// 'A' .. 'F' )+ | '0' ( DIGITS )* | '1' .. '9' ( DIGITS )* )
			int alt11 = 3;
			int LA11_0 = input.LA(1);
			if ((LA11_0 == '0')) {
				int LA11_1 = input.LA(2);
				if ((LA11_1 == 'X' || LA11_1 == 'x')) {
					alt11 = 1;
				}

				else {
					alt11 = 2;
				}

			} else if (((LA11_0 >= '1' && LA11_0 <= '9'))) {
				alt11 = 3;
			}

			else {
				NoViableAltException nvae = new NoViableAltException("", 11, 0,
						input);
				throw nvae;
			}

			switch (alt11) {
			case 1:
			// Python.g:556:9: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A'
			// .. 'F' )+
			{
				match('0');
				if (input.LA(1) == 'X' || input.LA(1) == 'x') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}
				// Python.g:556:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
				int cnt8 = 0;
				loop8: while (true) {
					int alt8 = 2;
					int LA8_0 = input.LA(1);
					if (((LA8_0 >= '0' && LA8_0 <= '9')
							|| (LA8_0 >= 'A' && LA8_0 <= 'F') || (LA8_0 >= 'a' && LA8_0 <= 'f'))) {
						alt8 = 1;
					}

					switch (alt8) {
					case 1:
					// Python.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')
								|| (input.LA(1) >= 'A' && input.LA(1) <= 'F')
								|| (input.LA(1) >= 'a' && input.LA(1) <= 'f')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						if (cnt8 >= 1)
							break loop8;
						EarlyExitException eee = new EarlyExitException(8,
								input);
						throw eee;
					}
					cnt8++;
				}

			}
				break;
			case 2:
			// Python.g:558:9: '0' ( DIGITS )*
			{
				match('0');
				// Python.g:558:13: ( DIGITS )*
				loop9: while (true) {
					int alt9 = 2;
					int LA9_0 = input.LA(1);
					if (((LA9_0 >= '0' && LA9_0 <= '9'))) {
						alt9 = 1;
					}

					switch (alt9) {
					case 1:
					// Python.g:558:13: DIGITS
					{
						mDIGITS();

					}
						break;

					default:
						break loop9;
					}
				}

			}
				break;
			case 3:
			// Python.g:559:9: '1' .. '9' ( DIGITS )*
			{
				matchRange('1', '9');
				// Python.g:559:18: ( DIGITS )*
				loop10: while (true) {
					int alt10 = 2;
					int LA10_0 = input.LA(1);
					if (((LA10_0 >= '0' && LA10_0 <= '9'))) {
						alt10 = 1;
					}

					switch (alt10) {
					case 1:
					// Python.g:559:18: DIGITS
					{
						mDIGITS();

					}
						break;

					default:
						break loop10;
					}
				}

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "INT"

	// $ANTLR start "COMPLEX"
	public final void mCOMPLEX() throws RecognitionException {
		try {
			int _type = COMPLEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:563:5: ( INT ( 'j' | 'J' ) | FLOAT ( 'j' | 'J' ) )
			int alt12 = 2;
			alt12 = dfa12.predict(input);
			switch (alt12) {
			case 1:
			// Python.g:563:9: INT ( 'j' | 'J' )
			{
				mINT();

				if (input.LA(1) == 'J' || input.LA(1) == 'j') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}
			}
				break;
			case 2:
			// Python.g:564:9: FLOAT ( 'j' | 'J' )
			{
				mFLOAT();

				if (input.LA(1) == 'J' || input.LA(1) == 'j') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}
			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "COMPLEX"

	// $ANTLR start "DIGITS"
	public final void mDIGITS() throws RecognitionException {
		try {
			// Python.g:569:8: ( ( '0' .. '9' )+ )
			// Python.g:569:10: ( '0' .. '9' )+
			{
				// Python.g:569:10: ( '0' .. '9' )+
				int cnt13 = 0;
				loop13: while (true) {
					int alt13 = 2;
					int LA13_0 = input.LA(1);
					if (((LA13_0 >= '0' && LA13_0 <= '9'))) {
						alt13 = 1;
					}

					switch (alt13) {
					case 1:
					// Python.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						if (cnt13 >= 1)
							break loop13;
						EarlyExitException eee = new EarlyExitException(13,
								input);
						throw eee;
					}
					cnt13++;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DIGITS"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:570:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z'
			// | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// Python.g:570:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' |
			// 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
						|| input.LA(1) == '_'
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}
				// Python.g:571:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9'
				// )*
				loop14: while (true) {
					int alt14 = 2;
					int LA14_0 = input.LA(1);
					if (((LA14_0 >= '0' && LA14_0 <= '9')
							|| (LA14_0 >= 'A' && LA14_0 <= 'Z')
							|| LA14_0 == '_' || (LA14_0 >= 'a' && LA14_0 <= 'z'))) {
						alt14 = 1;
					}

					switch (alt14) {
					case 1:
					// Python.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')
								|| (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
								|| input.LA(1) == '_'
								|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						break loop14;
					}
				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "NAME"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:581:5: ( ( 'r' | 'u' | 'ur' )? ( '\\'\\'\\'' ( options
			// {greedy=false; } : TRIAPOS )* '\\'\\'\\'' | '\"\"\"' ( options
			// {greedy=false; } : TRIQUOTE )* '\"\"\"' | '\"' ( ESC |~ ( '\\\\'
			// | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC |~ ( '\\\\' | '\\n' |
			// '\\'' ) )* '\\'' ) )
			// Python.g:581:9: ( 'r' | 'u' | 'ur' )? ( '\\'\\'\\'' ( options
			// {greedy=false; } : TRIAPOS )* '\\'\\'\\'' | '\"\"\"' ( options
			// {greedy=false; } : TRIQUOTE )* '\"\"\"' | '\"' ( ESC |~ ( '\\\\'
			// | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC |~ ( '\\\\' | '\\n' |
			// '\\'' ) )* '\\'' )
			{
				// Python.g:581:9: ( 'r' | 'u' | 'ur' )?
				int alt15 = 4;
				int LA15_0 = input.LA(1);
				if ((LA15_0 == 'r')) {
					alt15 = 1;
				} else if ((LA15_0 == 'u')) {
					int LA15_2 = input.LA(2);
					if ((LA15_2 == 'r')) {
						alt15 = 3;
					} else if ((LA15_2 == '\"' || LA15_2 == '\'')) {
						alt15 = 2;
					}
				}
				switch (alt15) {
				case 1:
				// Python.g:581:10: 'r'
				{
					match('r');
				}
					break;
				case 2:
				// Python.g:581:14: 'u'
				{
					match('u');
				}
					break;
				case 3:
				// Python.g:581:18: 'ur'
				{
					match("ur");

				}
					break;

				}

				// Python.g:582:9: ( '\\'\\'\\'' ( options {greedy=false; } :
				// TRIAPOS )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; }
				// : TRIQUOTE )* '\"\"\"' | '\"' ( ESC |~ ( '\\\\' | '\\n' |
				// '\"' ) )* '\"' | '\\'' ( ESC |~ ( '\\\\' | '\\n' | '\\'' ) )*
				// '\\'' )
				int alt20 = 4;
				int LA20_0 = input.LA(1);
				if ((LA20_0 == '\'')) {
					int LA20_1 = input.LA(2);
					if ((LA20_1 == '\'')) {
						int LA20_3 = input.LA(3);
						if ((LA20_3 == '\'')) {
							alt20 = 1;
						}

						else {
							alt20 = 4;
						}

					} else if (((LA20_1 >= '\u0000' && LA20_1 <= '\t')
							|| (LA20_1 >= '\u000B' && LA20_1 <= '&') || (LA20_1 >= '(' && LA20_1 <= '\uFFFF'))) {
						alt20 = 4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							input.consume();
							NoViableAltException nvae = new NoViableAltException(
									"", 20, 1, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				} else if ((LA20_0 == '\"')) {
					int LA20_2 = input.LA(2);
					if ((LA20_2 == '\"')) {
						int LA20_5 = input.LA(3);
						if ((LA20_5 == '\"')) {
							alt20 = 2;
						}

						else {
							alt20 = 3;
						}

					} else if (((LA20_2 >= '\u0000' && LA20_2 <= '\t')
							|| (LA20_2 >= '\u000B' && LA20_2 <= '!') || (LA20_2 >= '#' && LA20_2 <= '\uFFFF'))) {
						alt20 = 3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							input.consume();
							NoViableAltException nvae = new NoViableAltException(
									"", 20, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					NoViableAltException nvae = new NoViableAltException("",
							20, 0, input);
					throw nvae;
				}

				switch (alt20) {
				case 1:
				// Python.g:582:13: '\\'\\'\\'' ( options {greedy=false; } :
				// TRIAPOS )* '\\'\\'\\''
				{
					match("'''");

					// Python.g:582:22: ( options {greedy=false; } : TRIAPOS )*
					loop16: while (true) {
						int alt16 = 2;
						int LA16_0 = input.LA(1);
						if ((LA16_0 == '\'')) {
							int LA16_1 = input.LA(2);
							if ((LA16_1 == '\'')) {
								int LA16_3 = input.LA(3);
								if ((LA16_3 == '\'')) {
									alt16 = 2;
								} else if (((LA16_3 >= '\u0000' && LA16_3 <= '&') || (LA16_3 >= '(' && LA16_3 <= '\uFFFF'))) {
									alt16 = 1;
								}

							} else if (((LA16_1 >= '\u0000' && LA16_1 <= '&') || (LA16_1 >= '(' && LA16_1 <= '\uFFFF'))) {
								alt16 = 1;
							}

						} else if (((LA16_0 >= '\u0000' && LA16_0 <= '&') || (LA16_0 >= '(' && LA16_0 <= '\uFFFF'))) {
							alt16 = 1;
						}

						switch (alt16) {
						case 1:
						// Python.g:582:47: TRIAPOS
						{
							mTRIAPOS();

						}
							break;

						default:
							break loop16;
						}
					}

					match("'''");

				}
					break;
				case 2:
				// Python.g:583:13: '\"\"\"' ( options {greedy=false; } :
				// TRIQUOTE )* '\"\"\"'
				{
					match("\"\"\"");

					// Python.g:583:19: ( options {greedy=false; } : TRIQUOTE )*
					loop17: while (true) {
						int alt17 = 2;
						int LA17_0 = input.LA(1);
						if ((LA17_0 == '\"')) {
							int LA17_1 = input.LA(2);
							if ((LA17_1 == '\"')) {
								int LA17_3 = input.LA(3);
								if ((LA17_3 == '\"')) {
									alt17 = 2;
								} else if (((LA17_3 >= '\u0000' && LA17_3 <= '!') || (LA17_3 >= '#' && LA17_3 <= '\uFFFF'))) {
									alt17 = 1;
								}

							} else if (((LA17_1 >= '\u0000' && LA17_1 <= '!') || (LA17_1 >= '#' && LA17_1 <= '\uFFFF'))) {
								alt17 = 1;
							}

						} else if (((LA17_0 >= '\u0000' && LA17_0 <= '!') || (LA17_0 >= '#' && LA17_0 <= '\uFFFF'))) {
							alt17 = 1;
						}

						switch (alt17) {
						case 1:
						// Python.g:583:44: TRIQUOTE
						{
							mTRIQUOTE();

						}
							break;

						default:
							break loop17;
						}
					}

					match("\"\"\"");

				}
					break;
				case 3:
				// Python.g:584:13: '\"' ( ESC |~ ( '\\\\' | '\\n' | '\"' ) )*
				// '\"'
				{
					match('\"');
					// Python.g:584:17: ( ESC |~ ( '\\\\' | '\\n' | '\"' ) )*
					loop18: while (true) {
						int alt18 = 3;
						int LA18_0 = input.LA(1);
						if ((LA18_0 == '\\')) {
							alt18 = 1;
						} else if (((LA18_0 >= '\u0000' && LA18_0 <= '\t')
								|| (LA18_0 >= '\u000B' && LA18_0 <= '!')
								|| (LA18_0 >= '#' && LA18_0 <= '[') || (LA18_0 >= ']' && LA18_0 <= '\uFFFF'))) {
							alt18 = 2;
						}

						switch (alt18) {
						case 1:
						// Python.g:584:18: ESC
						{
							mESC();

						}
							break;
						case 2:
						// Python.g:584:22: ~ ( '\\\\' | '\\n' | '\"' )
						{
							if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
									|| (input.LA(1) >= '\u000B' && input.LA(1) <= '!')
									|| (input.LA(1) >= '#' && input.LA(1) <= '[')
									|| (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
								input.consume();
							} else {
								MismatchedSetException mse = new MismatchedSetException(
										null, input);
								recover(mse);
								throw mse;
							}
						}
							break;

						default:
							break loop18;
						}
					}

					match('\"');
				}
					break;
				case 4:
				// Python.g:585:13: '\\'' ( ESC |~ ( '\\\\' | '\\n' | '\\'' ) )*
				// '\\''
				{
					match('\'');
					// Python.g:585:18: ( ESC |~ ( '\\\\' | '\\n' | '\\'' ) )*
					loop19: while (true) {
						int alt19 = 3;
						int LA19_0 = input.LA(1);
						if ((LA19_0 == '\\')) {
							alt19 = 1;
						} else if (((LA19_0 >= '\u0000' && LA19_0 <= '\t')
								|| (LA19_0 >= '\u000B' && LA19_0 <= '&')
								|| (LA19_0 >= '(' && LA19_0 <= '[') || (LA19_0 >= ']' && LA19_0 <= '\uFFFF'))) {
							alt19 = 2;
						}

						switch (alt19) {
						case 1:
						// Python.g:585:19: ESC
						{
							mESC();

						}
							break;
						case 2:
						// Python.g:585:23: ~ ( '\\\\' | '\\n' | '\\'' )
						{
							if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
									|| (input.LA(1) >= '\u000B' && input.LA(1) <= '&')
									|| (input.LA(1) >= '(' && input.LA(1) <= '[')
									|| (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
								input.consume();
							} else {
								MismatchedSetException mse = new MismatchedSetException(
										null, input);
								recover(mse);
								throw mse;
							}
						}
							break;

						default:
							break loop19;
						}
					}

					match('\'');
				}
					break;

				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "STRING"

	// $ANTLR start "TRIQUOTE"
	public final void mTRIQUOTE() throws RecognitionException {
		try {
			// Python.g:591:5: ( ( '\"' )? ( '\"' )? ( ESC |~ ( '\\\\' | '\"' )
			// )+ )
			// Python.g:591:7: ( '\"' )? ( '\"' )? ( ESC |~ ( '\\\\' | '\"' ) )+
			{
				// Python.g:591:7: ( '\"' )?
				int alt21 = 2;
				int LA21_0 = input.LA(1);
				if ((LA21_0 == '\"')) {
					alt21 = 1;
				}
				switch (alt21) {
				case 1:
				// Python.g:591:7: '\"'
				{
					match('\"');
				}
					break;

				}

				// Python.g:591:12: ( '\"' )?
				int alt22 = 2;
				int LA22_0 = input.LA(1);
				if ((LA22_0 == '\"')) {
					alt22 = 1;
				}
				switch (alt22) {
				case 1:
				// Python.g:591:12: '\"'
				{
					match('\"');
				}
					break;

				}

				// Python.g:591:17: ( ESC |~ ( '\\\\' | '\"' ) )+
				int cnt23 = 0;
				loop23: while (true) {
					int alt23 = 3;
					int LA23_0 = input.LA(1);
					if ((LA23_0 == '\\')) {
						alt23 = 1;
					} else if (((LA23_0 >= '\u0000' && LA23_0 <= '!')
							|| (LA23_0 >= '#' && LA23_0 <= '[') || (LA23_0 >= ']' && LA23_0 <= '\uFFFF'))) {
						alt23 = 2;
					}

					switch (alt23) {
					case 1:
					// Python.g:591:18: ESC
					{
						mESC();

					}
						break;
					case 2:
					// Python.g:591:22: ~ ( '\\\\' | '\"' )
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '!')
								|| (input.LA(1) >= '#' && input.LA(1) <= '[')
								|| (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						if (cnt23 >= 1)
							break loop23;
						EarlyExitException eee = new EarlyExitException(23,
								input);
						throw eee;
					}
					cnt23++;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "TRIQUOTE"

	// $ANTLR start "TRIAPOS"
	public final void mTRIAPOS() throws RecognitionException {
		try {
			// Python.g:597:5: ( ( '\\'' )? ( '\\'' )? ( ESC |~ ( '\\\\' | '\\''
			// ) )+ )
			// Python.g:597:7: ( '\\'' )? ( '\\'' )? ( ESC |~ ( '\\\\' | '\\'' )
			// )+
			{
				// Python.g:597:7: ( '\\'' )?
				int alt24 = 2;
				int LA24_0 = input.LA(1);
				if ((LA24_0 == '\'')) {
					alt24 = 1;
				}
				switch (alt24) {
				case 1:
				// Python.g:597:7: '\\''
				{
					match('\'');
				}
					break;

				}

				// Python.g:597:13: ( '\\'' )?
				int alt25 = 2;
				int LA25_0 = input.LA(1);
				if ((LA25_0 == '\'')) {
					alt25 = 1;
				}
				switch (alt25) {
				case 1:
				// Python.g:597:13: '\\''
				{
					match('\'');
				}
					break;

				}

				// Python.g:597:19: ( ESC |~ ( '\\\\' | '\\'' ) )+
				int cnt26 = 0;
				loop26: while (true) {
					int alt26 = 3;
					int LA26_0 = input.LA(1);
					if ((LA26_0 == '\\')) {
						alt26 = 1;
					} else if (((LA26_0 >= '\u0000' && LA26_0 <= '&')
							|| (LA26_0 >= '(' && LA26_0 <= '[') || (LA26_0 >= ']' && LA26_0 <= '\uFFFF'))) {
						alt26 = 2;
					}

					switch (alt26) {
					case 1:
					// Python.g:597:20: ESC
					{
						mESC();

					}
						break;
					case 2:
					// Python.g:597:24: ~ ( '\\\\' | '\\'' )
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '&')
								|| (input.LA(1) >= '(' && input.LA(1) <= '[')
								|| (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						if (cnt26 >= 1)
							break loop26;
						EarlyExitException eee = new EarlyExitException(26,
								input);
						throw eee;
					}
					cnt26++;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "TRIAPOS"

	// $ANTLR start "ESC"
	public final void mESC() throws RecognitionException {
		try {
			// Python.g:601:5: ( '\\\\' . )
			// Python.g:601:10: '\\\\' .
			{
				match('\\');
				matchAny();
			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "ESC"

	// $ANTLR start "CONTINUED_LINE"
	public final void mCONTINUED_LINE() throws RecognitionException {
		try {
			int _type = CONTINUED_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken nl = null;

			// Python.g:612:5: ( '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* (nl=
			// NEWLINE |) )
			// Python.g:612:10: '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* (nl=
			// NEWLINE |)
			{
				match('\\');
				// Python.g:612:15: ( '\\r' )?
				int alt27 = 2;
				int LA27_0 = input.LA(1);
				if ((LA27_0 == '\r')) {
					alt27 = 1;
				}
				switch (alt27) {
				case 1:
				// Python.g:612:16: '\\r'
				{
					match('\r');
				}
					break;

				}

				match('\n');
				// Python.g:612:28: ( ' ' | '\\t' )*
				loop28: while (true) {
					int alt28 = 2;
					int LA28_0 = input.LA(1);
					if ((LA28_0 == '\t' || LA28_0 == ' ')) {
						alt28 = 1;
					}

					switch (alt28) {
					case 1:
					// Python.g:
					{
						if (input.LA(1) == '\t' || input.LA(1) == ' ') {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						break loop28;
					}
				}

				_channel = HIDDEN;
				// Python.g:613:10: (nl= NEWLINE |)
				int alt29 = 2;
				int LA29_0 = input.LA(1);
				if ((LA29_0 == '\n' || (LA29_0 >= '\f' && LA29_0 <= '\r'))) {
					alt29 = 1;
				}

				else {
					alt29 = 2;
				}

				switch (alt29) {
				case 1:
				// Python.g:613:12: nl= NEWLINE
				{
					int nlStart1426 = getCharIndex();
					int nlStartLine1426 = getLine();
					int nlStartCharPos1426 = getCharPositionInLine();
					mNEWLINE();
					nl = new CommonToken(input, Token.INVALID_TOKEN_TYPE,
							Token.DEFAULT_CHANNEL, nlStart1426,
							getCharIndex() - 1);
					nl.setLine(nlStartLine1426);
					nl.setCharPositionInLine(nlStartCharPos1426);

					emit(new ClassicToken(NEWLINE, nl.getText()));
				}
					break;
				case 2:
				// Python.g:615:10:
				{
				}
					break;

				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "CONTINUED_LINE"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:627:5: ( ( ( '\ ' )? ( '\\r' )? '\\n' )+ )
			// Python.g:627:9: ( ( '\ ' )? ( '\\r' )? '\\n' )+
			{
				// Python.g:627:9: ( ( '\ ' )? ( '\\r' )? '\\n' )+
				int cnt32 = 0;
				loop32: while (true) {
					int alt32 = 2;
					int LA32_0 = input.LA(1);
					if ((LA32_0 == '\n' || (LA32_0 >= '\f' && LA32_0 <= '\r'))) {
						alt32 = 1;
					}

					switch (alt32) {
					case 1:
					// Python.g:627:10: ( '\ ' )? ( '\\r' )? '\\n'
					{
						// Python.g:627:10: ( '\ ' )?
						int alt30 = 2;
						int LA30_0 = input.LA(1);
						if ((LA30_0 == '\f')) {
							alt30 = 1;
						}
						switch (alt30) {
						case 1:
						// Python.g:627:11: '\ '
						{
							match('\f');
						}
							break;

						}

						// Python.g:627:21: ( '\\r' )?
						int alt31 = 2;
						int LA31_0 = input.LA(1);
						if ((LA31_0 == '\r')) {
							alt31 = 1;
						}
						switch (alt31) {
						case 1:
						// Python.g:627:22: '\\r'
						{
							match('\r');
						}
							break;

						}

						match('\n');
					}
						break;

					default:
						if (cnt32 >= 1)
							break loop32;
						EarlyExitException eee = new EarlyExitException(32,
								input);
						throw eee;
					}
					cnt32++;
				}

				if (startPos == 0 || implicitLineJoiningLevel > 0)
					_channel = HIDDEN;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Python.g:627:5: ({...}? => ( ' ' | '\\t' | '\ ' )+ )
			// Python.g:627:10: {...}? => ( ' ' | '\\t' | '\ ' )+
			{
				if (!((startPos > 0))) {
					throw new FailedPredicateException(input, "WS",
							"startPos>0");
				}
				// Python.g:627:26: ( ' ' | '\\t' | '\ ' )+
				int cnt33 = 0;
				loop33: while (true) {
					int alt33 = 2;
					int LA33_0 = input.LA(1);
					if ((LA33_0 == '\t' || LA33_0 == '\f' || LA33_0 == ' ')) {
						alt33 = 1;
					}

					switch (alt33) {
					case 1:
					// Python.g:
					{
						if (input.LA(1) == '\t' || input.LA(1) == '\f'
								|| input.LA(1) == ' ') {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						if (cnt33 >= 1)
							break loop33;
						EarlyExitException eee = new EarlyExitException(33,
								input);
						throw eee;
					}
					cnt33++;
				}

				_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "WS"

	// $ANTLR start "LEADING_WS"
	public final void mLEADING_WS() throws RecognitionException {
		try {
			int _type = LEADING_WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;

			int spaces = 0;

			// Python.g:646:5: ({...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' |
			// '\\t' )+ ( ( '\\r' )? '\\n' )* ) )
			// Python.g:646:9: {...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' |
			// '\\t' )+ ( ( '\\r' )? '\\n' )* )
			{
				if (!((startPos == 0))) {
					throw new FailedPredicateException(input, "LEADING_WS",
							"startPos==0");
				}
				// Python.g:647:9: ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ (
				// ( '\\r' )? '\\n' )* )
				int alt38 = 2;
				int LA38_0 = input.LA(1);
				if ((LA38_0 == ' ')) {
					int LA38_1 = input.LA(2);
					if (((implicitLineJoiningLevel > 0))) {
						alt38 = 1;
					} else if ((true)) {
						alt38 = 2;
					}

				} else if ((LA38_0 == '\t')) {
					int LA38_2 = input.LA(2);
					if (((implicitLineJoiningLevel > 0))) {
						alt38 = 1;
					} else if ((true)) {
						alt38 = 2;
					}

				}

				else {
					NoViableAltException nvae = new NoViableAltException("",
							38, 0, input);
					throw nvae;
				}

				switch (alt38) {
				case 1:
				// Python.g:647:13: {...}? ( ' ' | '\\t' )+
				{
					if (!((implicitLineJoiningLevel > 0))) {
						throw new FailedPredicateException(input, "LEADING_WS",
								"implicitLineJoiningLevel>0");
					}
					// Python.g:647:43: ( ' ' | '\\t' )+
					int cnt34 = 0;
					loop34: while (true) {
						int alt34 = 2;
						int LA34_0 = input.LA(1);
						if ((LA34_0 == '\t' || LA34_0 == ' ')) {
							alt34 = 1;
						}

						switch (alt34) {
						case 1:
						// Python.g:
						{
							if (input.LA(1) == '\t' || input.LA(1) == ' ') {
								input.consume();
							} else {
								MismatchedSetException mse = new MismatchedSetException(
										null, input);
								recover(mse);
								throw mse;
							}
						}
							break;

						default:
							if (cnt34 >= 1)
								break loop34;
							EarlyExitException eee = new EarlyExitException(34,
									input);
							throw eee;
						}
						cnt34++;
					}

					_channel = HIDDEN;
				}
					break;
				case 2:
				// Python.g:648:17: ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )*
				{
					// Python.g:648:17: ( ' ' | '\\t' )+
					int cnt35 = 0;
					loop35: while (true) {
						int alt35 = 3;
						int LA35_0 = input.LA(1);
						if ((LA35_0 == ' ')) {
							alt35 = 1;
						} else if ((LA35_0 == '\t')) {
							alt35 = 2;
						}

						switch (alt35) {
						case 1:
						// Python.g:648:23: ' '
						{
							match(' ');
							spaces++;
						}
							break;
						case 2:
						// Python.g:649:18: '\\t'
						{
							match('\t');
							spaces += 8;
							spaces -= (spaces % 8);
						}
							break;

						default:
							if (cnt35 >= 1)
								break loop35;
							EarlyExitException eee = new EarlyExitException(35,
									input);
							throw eee;
						}
						cnt35++;
					}

					// make a string of n spaces where n is column number - 1
					char[] indentation = new char[spaces];
					for (int i = 0; i < spaces; i++) {
						indentation[i] = ' ';
					}
					String s = new String(indentation);
					emit(new ClassicToken(LEADING_WS, new String(indentation)));

					// Python.g:661:13: ( ( '\\r' )? '\\n' )*
					loop37: while (true) {
						int alt37 = 2;
						int LA37_0 = input.LA(1);
						if ((LA37_0 == '\n' || LA37_0 == '\r')) {
							alt37 = 1;
						}

						switch (alt37) {
						case 1:
						// Python.g:661:15: ( '\\r' )? '\\n'
						{
							// Python.g:661:15: ( '\\r' )?
							int alt36 = 2;
							int LA36_0 = input.LA(1);
							if ((LA36_0 == '\r')) {
								alt36 = 1;
							}
							switch (alt36) {
							case 1:
							// Python.g:661:16: '\\r'
							{
								match('\r');
							}
								break;

							}

							match('\n');

							_channel = HIDDEN;
						}
							break;

						default:
							break loop37;
						}
					}

				}
					break;

				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LEADING_WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;

			_channel = HIDDEN;

			// Python.g:698:5: ({...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* (
			// '\\n' )+ |{...}? => '#' (~ '\\n' )* )
			int alt43 = 2;
			alt43 = dfa43.predict(input);
			switch (alt43) {
			case 1:
			// Python.g:698:10: {...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* (
			// '\\n' )+
			{
				if (!((startPos == 0))) {
					throw new FailedPredicateException(input, "COMMENT",
							"startPos==0");
				}
				// Python.g:698:27: ( ' ' | '\\t' )*
				loop39: while (true) {
					int alt39 = 2;
					int LA39_0 = input.LA(1);
					if ((LA39_0 == '\t' || LA39_0 == ' ')) {
						alt39 = 1;
					}

					switch (alt39) {
					case 1:
					// Python.g:
					{
						if (input.LA(1) == '\t' || input.LA(1) == ' ') {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						break loop39;
					}
				}

				match('#');
				// Python.g:698:43: (~ '\\n' )*
				loop40: while (true) {
					int alt40 = 2;
					int LA40_0 = input.LA(1);
					if (((LA40_0 >= '\u0000' && LA40_0 <= '\t') || (LA40_0 >= '\u000B' && LA40_0 <= '\uFFFF'))) {
						alt40 = 1;
					}

					switch (alt40) {
					case 1:
					// Python.g:
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
								|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						break loop40;
					}
				}

				// Python.g:698:52: ( '\\n' )+
				int cnt41 = 0;
				loop41: while (true) {
					int alt41 = 2;
					int LA41_0 = input.LA(1);
					if ((LA41_0 == '\n')) {
						alt41 = 1;
					}

					switch (alt41) {
					case 1:
					// Python.g:698:52: '\\n'
					{
						match('\n');
					}
						break;

					default:
						if (cnt41 >= 1)
							break loop41;
						EarlyExitException eee = new EarlyExitException(41,
								input);
						throw eee;
					}
					cnt41++;
				}

			}
				break;
			case 2:
			// Python.g:699:10: {...}? => '#' (~ '\\n' )*
			{
				if (!((startPos > 0))) {
					throw new FailedPredicateException(input, "COMMENT",
							"startPos>0");
				}
				match('#');
				// Python.g:699:30: (~ '\\n' )*
				loop42: while (true) {
					int alt42 = 2;
					int LA42_0 = input.LA(1);
					if (((LA42_0 >= '\u0000' && LA42_0 <= '\t') || (LA42_0 >= '\u000B' && LA42_0 <= '\uFFFF'))) {
						alt42 = 1;
					}

					switch (alt42) {
					case 1:
					// Python.g:
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
								|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF')) {
							input.consume();
						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}
					}
						break;

					default:
						break loop42;
					}
				}

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// Python.g:1:8: ( T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77
		// | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 |
		// T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94
		// | T__95 | T__96 | T__97 | T__98 | WHITESPACE | LPAREN | RPAREN |
		// LBRACK | RBRACK | COLON | COMMA | SEMI | PLUS | MINUS | STAR | SLASH
		// | VBAR | AMPER | LESS | GREATER | ASSIGN | PERCENT | BACKQUOTE |
		// LCURLY | RCURLY | CIRCUMFLEX | TILDE | EQUAL | NOTEQUAL |
		// ALT_NOTEQUAL | LESSEQUAL | LEFTSHIFT | GREATEREQUAL | RIGHTSHIFT |
		// PLUSEQUAL | MINUSEQUAL | DOUBLESTAR | STAREQUAL | DOUBLESLASH |
		// SLASHEQUAL | VBAREQUAL | PERCENTEQUAL | AMPEREQUAL | CIRCUMFLEXEQUAL
		// | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL |
		// DOUBLESLASHEQUAL | DOT | AT | AND | OR | NOT | FLOAT | LONGINT | INT
		// | COMPLEX | NAME | STRING | CONTINUED_LINE | NEWLINE | WS |
		// LEADING_WS | COMMENT )
		int alt44 = 88;
		alt44 = dfa44.predict(input);
		switch (alt44) {
		case 1:
		// Python.g:1:10: T__71
		{
			mT__71();

		}
			break;
		case 2:
		// Python.g:1:16: T__72
		{
			mT__72();

		}
			break;
		case 3:
		// Python.g:1:22: T__73
		{
			mT__73();

		}
			break;
		case 4:
		// Python.g:1:28: T__74
		{
			mT__74();

		}
			break;
		case 5:
		// Python.g:1:34: T__75
		{
			mT__75();

		}
			break;
		case 6:
		// Python.g:1:40: T__76
		{
			mT__76();

		}
			break;
		case 7:
		// Python.g:1:46: T__77
		{
			mT__77();

		}
			break;
		case 8:
		// Python.g:1:52: T__78
		{
			mT__78();

		}
			break;
		case 9:
		// Python.g:1:58: T__79
		{
			mT__79();

		}
			break;
		case 10:
		// Python.g:1:64: T__80
		{
			mT__80();

		}
			break;
		case 11:
		// Python.g:1:70: T__81
		{
			mT__81();

		}
			break;
		case 12:
		// Python.g:1:76: T__82
		{
			mT__82();

		}
			break;
		case 13:
		// Python.g:1:82: T__83
		{
			mT__83();

		}
			break;
		case 14:
		// Python.g:1:88: T__84
		{
			mT__84();

		}
			break;
		case 15:
		// Python.g:1:94: T__85
		{
			mT__85();

		}
			break;
		case 16:
		// Python.g:1:100: T__86
		{
			mT__86();

		}
			break;
		case 17:
		// Python.g:1:106: T__87
		{
			mT__87();

		}
			break;
		case 18:
		// Python.g:1:112: T__88
		{
			mT__88();

		}
			break;
		case 19:
		// Python.g:1:118: T__89
		{
			mT__89();

		}
			break;
		case 20:
		// Python.g:1:124: T__90
		{
			mT__90();

		}
			break;
		case 21:
		// Python.g:1:130: T__91
		{
			mT__91();

		}
			break;
		case 22:
		// Python.g:1:136: T__92
		{
			mT__92();

		}
			break;
		case 23:
		// Python.g:1:142: T__93
		{
			mT__93();

		}
			break;
		case 24:
		// Python.g:1:148: T__94
		{
			mT__94();

		}
			break;
		case 25:
		// Python.g:1:154: T__95
		{
			mT__95();

		}
			break;
		case 26:
		// Python.g:1:160: T__96
		{
			mT__96();

		}
			break;
		case 27:
		// Python.g:1:166: T__97
		{
			mT__97();

		}
			break;
		case 28:
		// Python.g:1:172: T__98
		{
			mT__98();

		}
			break;
		case 29:
		// Python.g:1:178: WHITESPACE
		{
			mWHITESPACE();

		}
			break;
		case 30:
		// Python.g:1:189: LPAREN
		{
			mLPAREN();

		}
			break;
		case 31:
		// Python.g:1:196: RPAREN
		{
			mRPAREN();

		}
			break;
		case 32:
		// Python.g:1:203: LBRACK
		{
			mLBRACK();

		}
			break;
		case 33:
		// Python.g:1:210: RBRACK
		{
			mRBRACK();

		}
			break;
		case 34:
		// Python.g:1:217: COLON
		{
			mCOLON();

		}
			break;
		case 35:
		// Python.g:1:223: COMMA
		{
			mCOMMA();

		}
			break;
		case 36:
		// Python.g:1:229: SEMI
		{
			mSEMI();

		}
			break;
		case 37:
		// Python.g:1:234: PLUS
		{
			mPLUS();

		}
			break;
		case 38:
		// Python.g:1:239: MINUS
		{
			mMINUS();

		}
			break;
		case 39:
		// Python.g:1:245: STAR
		{
			mSTAR();

		}
			break;
		case 40:
		// Python.g:1:250: SLASH
		{
			mSLASH();

		}
			break;
		case 41:
		// Python.g:1:256: VBAR
		{
			mVBAR();

		}
			break;
		case 42:
		// Python.g:1:261: AMPER
		{
			mAMPER();

		}
			break;
		case 43:
		// Python.g:1:267: LESS
		{
			mLESS();

		}
			break;
		case 44:
		// Python.g:1:272: GREATER
		{
			mGREATER();

		}
			break;
		case 45:
		// Python.g:1:280: ASSIGN
		{
			mASSIGN();

		}
			break;
		case 46:
		// Python.g:1:287: PERCENT
		{
			mPERCENT();

		}
			break;
		case 47:
		// Python.g:1:295: BACKQUOTE
		{
			mBACKQUOTE();

		}
			break;
		case 48:
		// Python.g:1:305: LCURLY
		{
			mLCURLY();

		}
			break;
		case 49:
		// Python.g:1:312: RCURLY
		{
			mRCURLY();

		}
			break;
		case 50:
		// Python.g:1:319: CIRCUMFLEX
		{
			mCIRCUMFLEX();

		}
			break;
		case 51:
		// Python.g:1:330: TILDE
		{
			mTILDE();

		}
			break;
		case 52:
		// Python.g:1:336: EQUAL
		{
			mEQUAL();

		}
			break;
		case 53:
		// Python.g:1:342: NOTEQUAL
		{
			mNOTEQUAL();

		}
			break;
		case 54:
		// Python.g:1:351: ALT_NOTEQUAL
		{
			mALT_NOTEQUAL();

		}
			break;
		case 55:
		// Python.g:1:364: LESSEQUAL
		{
			mLESSEQUAL();

		}
			break;
		case 56:
		// Python.g:1:374: LEFTSHIFT
		{
			mLEFTSHIFT();

		}
			break;
		case 57:
		// Python.g:1:384: GREATEREQUAL
		{
			mGREATEREQUAL();

		}
			break;
		case 58:
		// Python.g:1:397: RIGHTSHIFT
		{
			mRIGHTSHIFT();

		}
			break;
		case 59:
		// Python.g:1:408: PLUSEQUAL
		{
			mPLUSEQUAL();

		}
			break;
		case 60:
		// Python.g:1:418: MINUSEQUAL
		{
			mMINUSEQUAL();

		}
			break;
		case 61:
		// Python.g:1:429: DOUBLESTAR
		{
			mDOUBLESTAR();

		}
			break;
		case 62:
		// Python.g:1:440: STAREQUAL
		{
			mSTAREQUAL();

		}
			break;
		case 63:
		// Python.g:1:450: DOUBLESLASH
		{
			mDOUBLESLASH();

		}
			break;
		case 64:
		// Python.g:1:462: SLASHEQUAL
		{
			mSLASHEQUAL();

		}
			break;
		case 65:
		// Python.g:1:473: VBAREQUAL
		{
			mVBAREQUAL();

		}
			break;
		case 66:
		// Python.g:1:483: PERCENTEQUAL
		{
			mPERCENTEQUAL();

		}
			break;
		case 67:
		// Python.g:1:496: AMPEREQUAL
		{
			mAMPEREQUAL();

		}
			break;
		case 68:
		// Python.g:1:507: CIRCUMFLEXEQUAL
		{
			mCIRCUMFLEXEQUAL();

		}
			break;
		case 69:
		// Python.g:1:523: LEFTSHIFTEQUAL
		{
			mLEFTSHIFTEQUAL();

		}
			break;
		case 70:
		// Python.g:1:538: RIGHTSHIFTEQUAL
		{
			mRIGHTSHIFTEQUAL();

		}
			break;
		case 71:
		// Python.g:1:554: DOUBLESTAREQUAL
		{
			mDOUBLESTAREQUAL();

		}
			break;
		case 72:
		// Python.g:1:570: DOUBLESLASHEQUAL
		{
			mDOUBLESLASHEQUAL();

		}
			break;
		case 73:
		// Python.g:1:587: DOT
		{
			mDOT();

		}
			break;
		case 74:
		// Python.g:1:591: AT
		{
			mAT();

		}
			break;
		case 75:
		// Python.g:1:594: AND
		{
			mAND();

		}
			break;
		case 76:
		// Python.g:1:598: OR
		{
			mOR();

		}
			break;
		case 77:
		// Python.g:1:601: NOT
		{
			mNOT();

		}
			break;
		case 78:
		// Python.g:1:605: FLOAT
		{
			mFLOAT();

		}
			break;
		case 79:
		// Python.g:1:611: LONGINT
		{
			mLONGINT();

		}
			break;
		case 80:
		// Python.g:1:619: INT
		{
			mINT();

		}
			break;
		case 81:
		// Python.g:1:623: COMPLEX
		{
			mCOMPLEX();

		}
			break;
		case 82:
		// Python.g:1:631: NAME
		{
			mNAME();

		}
			break;
		case 83:
		// Python.g:1:636: STRING
		{
			mSTRING();

		}
			break;
		case 84:
		// Python.g:1:643: CONTINUED_LINE
		{
			mCONTINUED_LINE();

		}
			break;
		case 85:
		// Python.g:1:658: NEWLINE
		{
			mNEWLINE();

		}
			break;
		case 86:
		// Python.g:1:666: WS
		{
			mWS();

		}
			break;
		case 87:
		// Python.g:1:669: LEADING_WS
		{
			mLEADING_WS();

		}
			break;
		case 88:
		// Python.g:1:680: COMMENT
		{
			mCOMMENT();

		}
			break;

		}
	}

	protected DFA6 dfa6 = new DFA6(this);
	protected DFA12 dfa12 = new DFA12(this);
	protected DFA43 dfa43 = new DFA43(this);
	protected DFA44 dfa44 = new DFA44(this);
	static final String DFA6_eotS = "\3\uffff\1\4\2\uffff";
	static final String DFA6_eofS = "\6\uffff";
	static final String DFA6_minS = "\1\56\1\uffff\1\56\1\105\2\uffff";
	static final String DFA6_maxS = "\1\71\1\uffff\2\145\2\uffff";
	static final String DFA6_acceptS = "\1\uffff\1\1\2\uffff\1\3\1\2";
	static final String DFA6_specialS = "\6\uffff}>";
	static final String[] DFA6_transitionS = { "\1\1\1\uffff\12\2", "",
			"\1\3\1\uffff\12\2\13\uffff\1\4\37\uffff\1\4", "\1\5\37\uffff\1\5",
			"", "" };

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}

		@Override
		public String getDescription() {
			return "540:1: FLOAT : ( '.' DIGITS ( Exponent )? | DIGITS '.' Exponent | DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent ) );";
		}
	}

	static final String DFA12_eotS = "\7\uffff";
	static final String DFA12_eofS = "\7\uffff";
	static final String DFA12_minS = "\3\56\2\uffff\2\56";
	static final String DFA12_maxS = "\1\71\1\170\1\152\2\uffff\2\152";
	static final String DFA12_acceptS = "\3\uffff\1\2\1\1\2\uffff";
	static final String DFA12_specialS = "\7\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\3\1\uffff\1\1\11\2",
			"\1\3\1\uffff\12\5\13\uffff\1\3\4\uffff\1\4\15\uffff\1\4\14\uffff\1\3"
					+ "\4\uffff\1\4\15\uffff\1\4",
			"\1\3\1\uffff\12\6\13\uffff\1\3\4\uffff\1\4\32\uffff\1\3\4\uffff\1\4",
			"",
			"",
			"\1\3\1\uffff\12\5\13\uffff\1\3\4\uffff\1\4\32\uffff\1\3\4\uffff\1\4",
			"\1\3\1\uffff\12\6\13\uffff\1\3\4\uffff\1\4\32\uffff\1\3\4\uffff\1\4" };

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA
			.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}

		@Override
		public String getDescription() {
			return "562:1: COMPLEX : ( INT ( 'j' | 'J' ) | FLOAT ( 'j' | 'J' ) );";
		}
	}

	static final String DFA43_eotS = "\2\uffff\2\4\1\uffff";
	static final String DFA43_eofS = "\5\uffff";
	static final String DFA43_minS = "\1\11\1\uffff\2\0\1\uffff";
	static final String DFA43_maxS = "\1\43\1\uffff\2\uffff\1\uffff";
	static final String DFA43_acceptS = "\1\uffff\1\1\2\uffff\1\2";
	static final String DFA43_specialS = "\1\2\1\uffff\1\0\1\1\1\uffff}>";
	static final String[] DFA43_transitionS = {
			"\1\1\26\uffff\1\1\2\uffff\1\2", "", "\12\3\1\1\ufff5\3",
			"\12\3\1\1\ufff5\3", "" };

	static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
	static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
	static final char[] DFA43_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA43_minS);
	static final char[] DFA43_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA43_maxS);
	static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
	static final short[] DFA43_special = DFA
			.unpackEncodedString(DFA43_specialS);
	static final short[][] DFA43_transition;

	static {
		int numStates = DFA43_transitionS.length;
		DFA43_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
		}
	}

	protected class DFA43 extends DFA {

		public DFA43(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 43;
			this.eot = DFA43_eot;
			this.eof = DFA43_eof;
			this.min = DFA43_min;
			this.max = DFA43_max;
			this.accept = DFA43_accept;
			this.special = DFA43_special;
			this.transition = DFA43_transition;
		}

		@Override
		public String getDescription() {
			return "694:1: COMMENT : ({...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+ |{...}? => '#' (~ '\\n' )* );";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA43_2 = input.LA(1);

				int index43_2 = input.index();
				input.rewind();
				s = -1;
				if (((LA43_2 >= '\u0000' && LA43_2 <= '\t') || (LA43_2 >= '\u000B' && LA43_2 <= '\uFFFF'))
						&& (((startPos == 0) || (startPos > 0)))) {
					s = 3;
				} else if ((LA43_2 == '\n') && ((startPos == 0))) {
					s = 1;
				} else
					s = 4;

				input.seek(index43_2);
				if (s >= 0)
					return s;
				break;

			case 1:
				int LA43_3 = input.LA(1);

				int index43_3 = input.index();
				input.rewind();
				s = -1;
				if ((LA43_3 == '\n') && ((startPos == 0))) {
					s = 1;
				} else if (((LA43_3 >= '\u0000' && LA43_3 <= '\t') || (LA43_3 >= '\u000B' && LA43_3 <= '\uFFFF'))
						&& (((startPos == 0) || (startPos > 0)))) {
					s = 3;
				} else
					s = 4;

				input.seek(index43_3);
				if (s >= 0)
					return s;
				break;

			case 2:
				int LA43_0 = input.LA(1);

				int index43_0 = input.index();
				input.rewind();
				s = -1;
				if ((LA43_0 == '\t' || LA43_0 == ' ') && ((startPos == 0))) {
					s = 1;
				} else if ((LA43_0 == '#')
						&& (((startPos == 0) || (startPos > 0)))) {
					s = 2;
				}

				input.seek(index43_0);
				if (s >= 0)
					return s;
				break;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 43, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA44_eotS = "\1\uffff\16\56\1\116\7\uffff\1\123\1\125\1\130\1\133\1\135\1\137\1\143"
			+ "\1\146\1\150\1\152\3\uffff\1\154\2\uffff\1\155\1\uffff\2\56\2\162\1\56"
			+ "\3\uffff\1\117\1\uffff\1\172\1\uffff\1\174\13\56\1\u008b\1\56\1\u008d"
			+ "\1\u008e\11\56\10\uffff\1\u009a\2\uffff\1\u009c\10\uffff\1\u009e\2\uffff"
			+ "\1\u00a0\10\uffff\1\u00a1\1\u00a3\1\56\2\uffff\1\u00a1\1\162\3\uffff\1"
			+ "\162\1\56\1\uffff\1\56\1\uffff\1\u00ab\3\56\1\u00af\1\u00b0\5\56\1\u00b6"
			+ "\2\56\1\uffff\1\56\2\uffff\5\56\1\u00bf\3\56\14\uffff\1\u00c5\1\162\1"
			+ "\uffff\1\u00a1\1\uffff\1\u00a1\1\56\1\uffff\3\56\2\uffff\1\u00cd\1\u00ce"
			+ "\1\56\1\u00d0\1\56\1\uffff\1\u00d2\3\56\1\u00d6\3\56\1\uffff\1\56\1\u00db"
			+ "\1\56\1\uffff\1\u00a1\2\uffff\1\u00a1\1\uffff\1\56\1\u00e0\1\u00e1\1\56"
			+ "\2\uffff\1\56\1\uffff\1\56\1\uffff\3\56\1\uffff\1\u00e8\1\u00e9\1\56\1"
			+ "\u00eb\1\uffff\1\u00ec\1\uffff\1\u00a1\1\u00ed\2\uffff\1\56\1\u00ef\1"
			+ "\56\1\u00f1\1\u00f2\1\u00f3\2\uffff\1\u00f4\3\uffff\1\56\1\uffff\1\u00f6"
			+ "\4\uffff\1\u00f7\2\uffff";
	static final String DFA44_eofS = "\u00f8\uffff";
	static final String DFA44_minS = "\1\11\1\156\1\162\1\154\1\145\1\154\1\151\1\154\1\146\2\141\1\42\1\162"
			+ "\1\150\1\151\1\11\7\uffff\2\75\1\52\1\57\2\75\1\74\3\75\3\uffff\1\75\2"
			+ "\uffff\1\60\1\uffff\1\162\1\157\2\56\1\42\3\uffff\1\12\1\uffff\1\11\1"
			+ "\uffff\1\60\1\144\1\145\1\141\1\156\1\146\1\151\1\143\1\156\1\162\2\157"
			+ "\1\60\1\160\2\60\1\155\1\163\2\151\1\164\1\171\1\151\1\164\1\145\1\0\7"
			+ "\uffff\1\75\2\uffff\1\75\10\uffff\1\75\2\uffff\1\75\10\uffff\2\60\1\164"
			+ "\1\60\1\uffff\1\60\1\56\1\53\2\uffff\1\56\1\42\1\0\1\145\1\uffff\1\60"
			+ "\1\141\1\163\1\164\2\60\1\146\2\145\1\143\1\141\1\60\1\155\1\142\1\uffff"
			+ "\1\157\2\uffff\1\142\1\163\1\156\1\163\1\165\1\60\1\154\1\150\1\154\12"
			+ "\uffff\1\53\1\uffff\2\60\1\53\3\60\1\162\1\uffff\1\153\1\163\1\151\2\uffff"
			+ "\2\60\1\160\1\60\1\154\1\uffff\1\60\1\141\1\162\1\144\1\60\1\164\1\145"
			+ "\1\162\1\uffff\1\145\1\60\1\144\2\60\1\uffff\2\60\1\53\1\164\2\60\1\156"
			+ "\2\uffff\1\164\1\uffff\1\154\1\uffff\1\154\1\164\1\141\1\uffff\2\60\1"
			+ "\156\1\60\1\uffff\4\60\2\uffff\1\165\1\60\1\171\3\60\2\uffff\1\60\3\uffff"
			+ "\1\145\1\uffff\1\60\4\uffff\1\60\2\uffff";
	static final String DFA44_maxS = "\1\176\1\163\1\162\1\157\1\145\1\170\1\162\1\154\1\163\1\141\1\162\1\145"
			+ "\1\162\2\151\1\43\7\uffff\6\75\2\76\2\75\3\uffff\1\75\2\uffff\1\71\1\uffff"
			+ "\1\162\1\157\1\170\1\154\1\162\3\uffff\1\15\1\uffff\1\43\1\uffff\1\172"
			+ "\1\144\1\145\1\141\1\156\1\154\1\163\1\145\1\156\1\162\2\157\1\172\1\160"
			+ "\2\172\1\155\1\163\2\151\1\164\1\171\1\151\1\164\1\145\1\0\7\uffff\1\75"
			+ "\2\uffff\1\75\10\uffff\1\75\2\uffff\1\75\10\uffff\1\152\1\172\1\164\1"
			+ "\146\1\uffff\1\152\1\154\1\71\2\uffff\1\154\1\47\1\0\1\145\1\uffff\1\172"
			+ "\1\141\1\163\1\164\2\172\1\146\2\145\1\143\1\141\1\172\1\155\1\142\1\uffff"
			+ "\1\157\2\uffff\1\142\1\163\1\156\1\163\1\165\1\172\1\154\1\150\1\154\12"
			+ "\uffff\1\71\1\uffff\1\172\1\154\1\71\1\152\1\71\1\152\1\162\1\uffff\1"
			+ "\153\1\163\1\151\2\uffff\2\172\1\160\1\172\1\154\1\uffff\1\172\1\141\1"
			+ "\162\1\144\1\172\1\164\1\145\1\162\1\uffff\1\145\1\172\1\144\1\71\1\152"
			+ "\1\uffff\1\71\1\152\1\71\1\164\2\172\1\156\2\uffff\1\164\1\uffff\1\154"
			+ "\1\uffff\1\154\1\164\1\141\1\uffff\2\172\1\156\1\172\1\uffff\1\172\1\71"
			+ "\1\152\1\172\2\uffff\1\165\1\172\1\171\3\172\2\uffff\1\172\3\uffff\1\145"
			+ "\1\uffff\1\172\4\uffff\1\172\2\uffff";
	static final String DFA44_acceptS = "\20\uffff\1\36\1\37\1\40\1\41\1\42\1\43\1\44\12\uffff\1\57\1\60\1\61\1"
			+ "\uffff\1\63\1\65\1\uffff\1\112\5\uffff\1\122\1\123\1\124\1\uffff\1\125"
			+ "\1\uffff\1\130\32\uffff\1\126\1\127\1\130\1\73\1\45\1\74\1\46\1\uffff"
			+ "\1\76\1\47\1\uffff\1\100\1\50\1\101\1\51\1\103\1\52\1\66\1\67\1\uffff"
			+ "\1\53\1\71\1\uffff\1\54\1\64\1\55\1\102\1\56\1\104\1\62\1\111\4\uffff"
			+ "\1\120\3\uffff\1\117\1\121\4\uffff\1\1\16\uffff\1\20\1\uffff\1\22\1\23"
			+ "\11\uffff\1\35\1\107\1\75\1\110\1\77\1\105\1\70\1\106\1\72\1\116\1\uffff"
			+ "\1\114\7\uffff\1\113\3\uffff\1\6\1\7\5\uffff\1\15\10\uffff\1\31\5\uffff"
			+ "\1\115\7\uffff\1\10\1\11\1\uffff\1\13\1\uffff\1\16\3\uffff\1\25\4\uffff"
			+ "\1\33\4\uffff\1\3\1\4\6\uffff\1\26\1\27\1\uffff\1\32\1\34\1\2\1\uffff"
			+ "\1\12\1\uffff\1\17\1\21\1\24\1\30\1\uffff\1\14\1\5";
	static final String DFA44_specialS = "\1\5\16\uffff\1\0\41\uffff\1\4\1\uffff\1\3\32\uffff\1\1\53\uffff\1\2\175"
			+ "\uffff}>";
	static final String[] DFA44_transitionS = {
			"\1\63\1\62\1\uffff\1\61\1\62\22\uffff\1\17\1\46\1\57\1\64\1\uffff\1\40"
					+ "\1\34\1\57\1\20\1\21\1\31\1\27\1\25\1\30\1\47\1\32\1\53\11\54\1\24\1"
					+ "\26\1\35\1\37\1\36\1\uffff\1\50\32\56\1\22\1\60\1\23\1\44\1\56\1\41\1"
					+ "\1\1\2\1\3\1\4\1\5\1\6\1\7\1\56\1\10\2\56\1\11\1\56\1\52\1\51\1\12\1"
					+ "\56\1\13\1\56\1\14\1\55\1\56\1\15\1\56\1\16\1\56\1\42\1\33\1\43\1\45",
			"\1\66\4\uffff\1\65",
			"\1\67",
			"\1\70\2\uffff\1\71",
			"\1\72",
			"\1\73\13\uffff\1\74",
			"\1\75\5\uffff\1\76\2\uffff\1\77",
			"\1\100",
			"\1\101\6\uffff\1\102\1\103\4\uffff\1\104",
			"\1\105",
			"\1\106\20\uffff\1\107",
			"\1\57\4\uffff\1\57\71\uffff\1\110\3\uffff\1\111",
			"\1\112",
			"\1\113\1\114",
			"\1\115",
			"\1\63\1\120\1\uffff\1\117\1\120\22\uffff\1\17\2\uffff\1\121",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\122",
			"\1\124",
			"\1\126\22\uffff\1\127",
			"\1\131\15\uffff\1\132",
			"\1\134",
			"\1\136",
			"\1\142\1\141\1\140",
			"\1\144\1\145",
			"\1\147",
			"\1\151",
			"",
			"",
			"",
			"\1\153",
			"",
			"",
			"\12\156",
			"",
			"\1\157",
			"\1\160",
			"\1\163\1\uffff\12\164\13\uffff\1\165\4\uffff\1\167\1\uffff\1\166\13"
					+ "\uffff\1\161\14\uffff\1\165\4\uffff\1\167\1\uffff\1\166\13\uffff\1\161",
			"\1\163\1\uffff\12\170\13\uffff\1\165\4\uffff\1\167\1\uffff\1\166\30"
					+ "\uffff\1\165\4\uffff\1\167\1\uffff\1\166",
			"\1\57\4\uffff\1\57\112\uffff\1\171",
			"",
			"",
			"",
			"\1\62\2\uffff\1\62",
			"",
			"\1\63\1\120\1\uffff\1\117\1\120\22\uffff\1\17\2\uffff\1\121",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\173\7\56",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081\5\uffff\1\u0082",
			"\1\u0083\11\uffff\1\u0084",
			"\1\u0085\1\uffff\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u008c",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0099",
			"",
			"",
			"\1\u009b",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u009d",
			"",
			"",
			"\1\u009f",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\156\13\uffff\1\u00a2\4\uffff\1\167\32\uffff\1\u00a2\4\uffff\1\167",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00a4",
			"\12\u00a5\7\uffff\6\u00a5\32\uffff\6\u00a5",
			"",
			"\12\u00a7\13\uffff\1\u00a6\4\uffff\1\167\32\uffff\1\u00a6\4\uffff\1"
					+ "\167",
			"\1\163\1\uffff\12\164\13\uffff\1\165\4\uffff\1\167\1\uffff\1\166\30"
					+ "\uffff\1\165\4\uffff\1\167\1\uffff\1\166",
			"\1\u00a8\1\uffff\1\u00a8\2\uffff\12\u00a9",
			"",
			"",
			"\1\163\1\uffff\12\170\13\uffff\1\165\4\uffff\1\167\1\uffff\1\166\30"
					+ "\uffff\1\165\4\uffff\1\167\1\uffff\1\166",
			"\1\57\4\uffff\1\57",
			"\1\uffff",
			"\1\u00aa",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00b7",
			"\1\u00b8",
			"",
			"\1\u00b9",
			"",
			"",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00c3\1\uffff\1\u00c3\2\uffff\12\u00c4",
			"",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\u00a5\7\uffff\6\u00a5\3\uffff\1\167\1\uffff\1\166\24\uffff\6\u00a5"
					+ "\3\uffff\1\167\1\uffff\1\166",
			"\1\u00c6\1\uffff\1\u00c6\2\uffff\12\u00c7",
			"\12\u00a7\13\uffff\1\u00c8\4\uffff\1\167\32\uffff\1\u00c8\4\uffff\1"
					+ "\167", "\12\u00a9",
			"\12\u00a9\20\uffff\1\167\37\uffff\1\167", "\1\u00c9", "",
			"\1\u00ca", "\1\u00cb", "\1\u00cc", "", "",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\u00cf",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\u00d1", "",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\u00d3",
			"\1\u00d4", "\1\u00d5",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\u00d7",
			"\1\u00d8", "\1\u00d9", "", "\1\u00da",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\u00dc",
			"\12\u00c4", "\12\u00c4\20\uffff\1\167\37\uffff\1\167", "",
			"\12\u00c7", "\12\u00c7\20\uffff\1\167\37\uffff\1\167",
			"\1\u00dd\1\uffff\1\u00dd\2\uffff\12\u00de", "\1\u00df",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\u00e2", "",
			"", "\1\u00e3", "", "\1\u00e4", "", "\1\u00e5", "\1\u00e6",
			"\1\u00e7", "", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\1\u00ea",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "\12\u00de",
			"\12\u00de\20\uffff\1\167\37\uffff\1\167",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "", "",
			"\1\u00ee", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00f0", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "", "",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "", "", "",
			"\1\u00f5", "", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"", "", "", "", "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"", "" };

	static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
	static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
	static final char[] DFA44_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA44_minS);
	static final char[] DFA44_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA44_maxS);
	static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
	static final short[] DFA44_special = DFA
			.unpackEncodedString(DFA44_specialS);
	static final short[][] DFA44_transition;

	static {
		int numStates = DFA44_transitionS.length;
		DFA44_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
		}
	}

	protected class DFA44 extends DFA {

		public DFA44(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 44;
			this.eot = DFA44_eot;
			this.eof = DFA44_eof;
			this.min = DFA44_min;
			this.max = DFA44_max;
			this.accept = DFA44_accept;
			this.special = DFA44_special;
			this.transition = DFA44_transition;
		}

		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | WHITESPACE | LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | ASSIGN | PERCENT | BACKQUOTE | LCURLY | RCURLY | CIRCUMFLEX | TILDE | EQUAL | NOTEQUAL | ALT_NOTEQUAL | LESSEQUAL | LEFTSHIFT | GREATEREQUAL | RIGHTSHIFT | PLUSEQUAL | MINUSEQUAL | DOUBLESTAR | STAREQUAL | DOUBLESLASH | SLASHEQUAL | VBAREQUAL | PERCENTEQUAL | AMPEREQUAL | CIRCUMFLEXEQUAL | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL | DOUBLESLASHEQUAL | DOT | AT | AND | OR | NOT | FLOAT | LONGINT | INT | COMPLEX | NAME | STRING | CONTINUED_LINE | NEWLINE | WS | LEADING_WS | COMMENT );";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA44_15 = input.LA(1);

				int index44_15 = input.index();
				input.rewind();
				s = -1;
				if ((LA44_15 == ' ')) {
					s = 15;
				} else if ((LA44_15 == '\f') && ((startPos > 0))) {
					s = 79;
				} else if ((LA44_15 == '\n' || LA44_15 == '\r')
						&& ((startPos == 0))) {
					s = 80;
				} else if ((LA44_15 == '\t')) {
					s = 51;
				} else if ((LA44_15 == '#') && ((startPos == 0))) {
					s = 81;
				} else
					s = 78;

				input.seek(index44_15);
				if (s >= 0)
					return s;
				break;

			case 1:
				int LA44_78 = input.LA(1);

				int index44_78 = input.index();
				input.rewind();
				s = -1;
				if ((!((((startPos == 0) || (startPos > 0)))))) {
					s = 152;
				} else if (((startPos > 0))) {
					s = 79;
				} else if (((startPos == 0))) {
					s = 80;
				}

				input.seek(index44_78);
				if (s >= 0)
					return s;
				break;

			case 2:
				int LA44_122 = input.LA(1);

				int index44_122 = input.index();
				input.rewind();
				s = -1;
				if ((!((((startPos == 0) || (startPos > 0)))))) {
					s = 152;
				} else if (((startPos > 0))) {
					s = 79;
				} else if (((startPos == 0))) {
					s = 80;
				}

				input.seek(index44_122);
				if (s >= 0)
					return s;
				break;

			case 3:
				int LA44_51 = input.LA(1);

				int index44_51 = input.index();
				input.rewind();
				s = -1;
				if ((LA44_51 == ' ')) {
					s = 15;
				} else if ((LA44_51 == '\f') && ((startPos > 0))) {
					s = 79;
				} else if ((LA44_51 == '\n' || LA44_51 == '\r')
						&& ((startPos == 0))) {
					s = 80;
				} else if ((LA44_51 == '\t')) {
					s = 51;
				} else if ((LA44_51 == '#') && ((startPos == 0))) {
					s = 81;
				} else
					s = 122;

				input.seek(index44_51);
				if (s >= 0)
					return s;
				break;

			case 4:
				int LA44_49 = input.LA(1);

				int index44_49 = input.index();
				input.rewind();
				s = -1;
				if ((LA44_49 == '\n' || LA44_49 == '\r')) {
					s = 50;
				} else
					s = 79;

				input.seek(index44_49);
				if (s >= 0)
					return s;
				break;

			case 5:
				int LA44_0 = input.LA(1);

				int index44_0 = input.index();
				input.rewind();
				s = -1;
				if ((LA44_0 == 'a')) {
					s = 1;
				} else if ((LA44_0 == 'b')) {
					s = 2;
				} else if ((LA44_0 == 'c')) {
					s = 3;
				} else if ((LA44_0 == 'd')) {
					s = 4;
				} else if ((LA44_0 == 'e')) {
					s = 5;
				} else if ((LA44_0 == 'f')) {
					s = 6;
				} else if ((LA44_0 == 'g')) {
					s = 7;
				} else if ((LA44_0 == 'i')) {
					s = 8;
				} else if ((LA44_0 == 'l')) {
					s = 9;
				} else if ((LA44_0 == 'p')) {
					s = 10;
				} else if ((LA44_0 == 'r')) {
					s = 11;
				} else if ((LA44_0 == 't')) {
					s = 12;
				} else if ((LA44_0 == 'w')) {
					s = 13;
				} else if ((LA44_0 == 'y')) {
					s = 14;
				} else if ((LA44_0 == ' ')) {
					s = 15;
				} else if ((LA44_0 == '(')) {
					s = 16;
				} else if ((LA44_0 == ')')) {
					s = 17;
				} else if ((LA44_0 == '[')) {
					s = 18;
				} else if ((LA44_0 == ']')) {
					s = 19;
				} else if ((LA44_0 == ':')) {
					s = 20;
				} else if ((LA44_0 == ',')) {
					s = 21;
				} else if ((LA44_0 == ';')) {
					s = 22;
				} else if ((LA44_0 == '+')) {
					s = 23;
				} else if ((LA44_0 == '-')) {
					s = 24;
				} else if ((LA44_0 == '*')) {
					s = 25;
				} else if ((LA44_0 == '/')) {
					s = 26;
				} else if ((LA44_0 == '|')) {
					s = 27;
				} else if ((LA44_0 == '&')) {
					s = 28;
				} else if ((LA44_0 == '<')) {
					s = 29;
				} else if ((LA44_0 == '>')) {
					s = 30;
				} else if ((LA44_0 == '=')) {
					s = 31;
				} else if ((LA44_0 == '%')) {
					s = 32;
				} else if ((LA44_0 == '`')) {
					s = 33;
				} else if ((LA44_0 == '{')) {
					s = 34;
				} else if ((LA44_0 == '}')) {
					s = 35;
				} else if ((LA44_0 == '^')) {
					s = 36;
				} else if ((LA44_0 == '~')) {
					s = 37;
				} else if ((LA44_0 == '!')) {
					s = 38;
				} else if ((LA44_0 == '.')) {
					s = 39;
				} else if ((LA44_0 == '@')) {
					s = 40;
				} else if ((LA44_0 == 'o')) {
					s = 41;
				} else if ((LA44_0 == 'n')) {
					s = 42;
				} else if ((LA44_0 == '0')) {
					s = 43;
				} else if (((LA44_0 >= '1' && LA44_0 <= '9'))) {
					s = 44;
				} else if ((LA44_0 == 'u')) {
					s = 45;
				} else if (((LA44_0 >= 'A' && LA44_0 <= 'Z') || LA44_0 == '_'
						|| LA44_0 == 'h' || (LA44_0 >= 'j' && LA44_0 <= 'k')
						|| LA44_0 == 'm' || LA44_0 == 'q' || LA44_0 == 's'
						|| LA44_0 == 'v' || LA44_0 == 'x' || LA44_0 == 'z')) {
					s = 46;
				} else if ((LA44_0 == '\"' || LA44_0 == '\'')) {
					s = 47;
				} else if ((LA44_0 == '\\')) {
					s = 48;
				} else if ((LA44_0 == '\f')) {
					s = 49;
				} else if ((LA44_0 == '\n' || LA44_0 == '\r')) {
					s = 50;
				} else if ((LA44_0 == '\t')) {
					s = 51;
				} else if ((LA44_0 == '#')
						&& (((startPos == 0) || (startPos > 0)))) {
					s = 52;
				}

				input.seek(index44_0);
				if (s >= 0)
					return s;
				break;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 44, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
