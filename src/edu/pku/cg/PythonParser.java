package edu.pku.cg;

// $ANTLR 3.5.1 Python.g 2014-01-06 22:01:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/** Python 2.3.3 Grammar
 *
 *  Terence Parr and Loring Craymer
 *  February 2004
 *
 *  Converted to ANTLR v3 November 2005 by Terence Parr.
 *
 *  This grammar was derived automatically from the Python 2.3.3
 *  parser grammar to get a syntactically correct ANTLR grammar
 *  for Python.  Then Terence hand tweaked it to be semantically
 *  correct; i.e., removed lookahead issues etc...  It is LL(1)
 *  except for the (sometimes optional) trailing commas and semi-colons.
 *  It needs two symbols of lookahead in this case.
 *
 *  Starting with Loring's preliminary lexer for Python, I modified it
 *  to do my version of the whole nasty INDENT/DEDENT issue just so I
 *  could understand the problem better.  This grammar requires
 *  PythonTokenStream.java to work.  Also I used some rules from the
 *  semi-formal grammar on the web for Python (automatically
 *  translated to ANTLR format by an ANTLR grammar, naturally <grin>).
 *  The lexical rules for python are particularly nasty and it took me
 *  a long time to get it 'right'; i.e., think about it in the proper
 *  way.  Resist changing the lexer unless you've used ANTLR a lot. ;)
 *
 *  I (Terence) tested this by running it on the jython-2.1/Lib
 *  directory of 40k lines of Python.
 *  
 */
@SuppressWarnings("all")
public class PythonParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALT_NOTEQUAL", "AMPER", "AMPEREQUAL", 
		"AND", "ASSIGN", "AT", "BACKQUOTE", "CIRCUMFLEX", "CIRCUMFLEXEQUAL", "COLON", 
		"COMMA", "COMMENT", "COMPLEX", "CONTINUED_LINE", "DEDENT", "DIGITS", "DOT", 
		"DOUBLESLASH", "DOUBLESLASHEQUAL", "DOUBLESTAR", "DOUBLESTAREQUAL", "EQUAL", 
		"ESC", "Exponent", "FLOAT", "GREATER", "GREATEREQUAL", "INDENT", "INT", 
		"LBRACK", "LCURLY", "LEADING_WS", "LEFTSHIFT", "LEFTSHIFTEQUAL", "LESS", 
		"LESSEQUAL", "LONGINT", "LPAREN", "MINUS", "MINUSEQUAL", "NAME", "NEWLINE", 
		"NOT", "NOTEQUAL", "OR", "PERCENT", "PERCENTEQUAL", "PLUS", "PLUSEQUAL", 
		"RBRACK", "RCURLY", "RIGHTSHIFT", "RIGHTSHIFTEQUAL", "RPAREN", "SEMI", 
		"SLASH", "SLASHEQUAL", "STAR", "STAREQUAL", "STRING", "TILDE", "TRIAPOS", 
		"TRIQUOTE", "VBAR", "VBAREQUAL", "WS", "'as'", "'assert'", "'break'", 
		"'class'", "'continue'", "'def'", "'del'", "'elif'", "'else'", "'except'", 
		"'exec'", "'finally'", "'for'", "'from'", "'global'", "'if'", "'import'", 
		"'in'", "'is'", "'lambda'", "'pass'", "'print'", "'raise'", "'return'", 
		"'try'", "'while'", "'with'", "'yield'"
	};
	public static final int EOF=-1;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int ALT_NOTEQUAL=4;
	public static final int AMPER=5;
	public static final int AMPEREQUAL=6;
	public static final int AND=7;
	public static final int ASSIGN=8;
	public static final int AT=9;
	public static final int BACKQUOTE=10;
	public static final int CIRCUMFLEX=11;
	public static final int CIRCUMFLEXEQUAL=12;
	public static final int COLON=13;
	public static final int COMMA=14;
	public static final int COMMENT=15;
	public static final int COMPLEX=16;
	public static final int CONTINUED_LINE=17;
	public static final int DEDENT=18;
	public static final int DIGITS=19;
	public static final int DOT=20;
	public static final int DOUBLESLASH=21;
	public static final int DOUBLESLASHEQUAL=22;
	public static final int DOUBLESTAR=23;
	public static final int DOUBLESTAREQUAL=24;
	public static final int EQUAL=25;
	public static final int ESC=26;
	public static final int Exponent=27;
	public static final int FLOAT=28;
	public static final int GREATER=29;
	public static final int GREATEREQUAL=30;
	public static final int INDENT=31;
	public static final int INT=32;
	public static final int LBRACK=33;
	public static final int LCURLY=34;
	public static final int LEADING_WS=35;
	public static final int LEFTSHIFT=36;
	public static final int LEFTSHIFTEQUAL=37;
	public static final int LESS=38;
	public static final int LESSEQUAL=39;
	public static final int LONGINT=40;
	public static final int LPAREN=41;
	public static final int MINUS=42;
	public static final int MINUSEQUAL=43;
	public static final int NAME=44;
	public static final int NEWLINE=45;
	public static final int NOT=46;
	public static final int NOTEQUAL=47;
	public static final int OR=48;
	public static final int PERCENT=49;
	public static final int PERCENTEQUAL=50;
	public static final int PLUS=51;
	public static final int PLUSEQUAL=52;
	public static final int RBRACK=53;
	public static final int RCURLY=54;
	public static final int RIGHTSHIFT=55;
	public static final int RIGHTSHIFTEQUAL=56;
	public static final int RPAREN=57;
	public static final int SEMI=58;
	public static final int SLASH=59;
	public static final int SLASHEQUAL=60;
	public static final int STAR=61;
	public static final int STAREQUAL=62;
	public static final int STRING=63;
	public static final int TILDE=64;
	public static final int TRIAPOS=65;
	public static final int TRIQUOTE=66;
	public static final int VBAR=67;
	public static final int VBAREQUAL=68;
	public static final int WS=69;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PythonParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PythonParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return PythonParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Python.g"; }



	// $ANTLR start "single_input"
	// Python.g:75:1: single_input : ( NEWLINE | simple_stmt | compound_stmt NEWLINE );
	public final void single_input() throws RecognitionException {
		try {
			// Python.g:75:14: ( NEWLINE | simple_stmt | compound_stmt NEWLINE )
			int alt1=3;
			switch ( input.LA(1) ) {
			case NEWLINE:
				{
				alt1=1;
				}
				break;
			case BACKQUOTE:
			case COMPLEX:
			case FLOAT:
			case INT:
			case LBRACK:
			case LCURLY:
			case LONGINT:
			case LPAREN:
			case MINUS:
			case NAME:
			case NOT:
			case PLUS:
			case STRING:
			case TILDE:
			case 71:
			case 72:
			case 74:
			case 76:
			case 80:
			case 83:
			case 84:
			case 86:
			case 89:
			case 90:
			case 91:
			case 92:
			case 93:
			case 97:
				{
				alt1=2;
				}
				break;
			case AT:
			case 73:
			case 75:
			case 82:
			case 85:
			case 94:
			case 95:
			case 96:
				{
				alt1=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// Python.g:75:16: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_single_input44); if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:76:16: simple_stmt
					{
					pushFollow(FOLLOW_simple_stmt_in_single_input61);
					simple_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Python.g:77:16: compound_stmt NEWLINE
					{
					pushFollow(FOLLOW_compound_stmt_in_single_input78);
					compound_stmt();
					state._fsp--;
					if (state.failed) return;
					match(input,NEWLINE,FOLLOW_NEWLINE_in_single_input80); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "single_input"



	// $ANTLR start "file_input"
	// Python.g:80:1: file_input : ( NEWLINE | stmt )* ;
	public final void file_input() throws RecognitionException {
		try {
			// Python.g:80:12: ( ( NEWLINE | stmt )* )
			// Python.g:80:14: ( NEWLINE | stmt )*
			{
			// Python.g:80:14: ( NEWLINE | stmt )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==NEWLINE) ) {
					alt2=1;
				}
				else if ( ((LA2_0 >= AT && LA2_0 <= BACKQUOTE)||LA2_0==COMPLEX||LA2_0==FLOAT||(LA2_0 >= INT && LA2_0 <= LCURLY)||(LA2_0 >= LONGINT && LA2_0 <= MINUS)||LA2_0==NAME||LA2_0==NOT||LA2_0==PLUS||(LA2_0 >= STRING && LA2_0 <= TILDE)||(LA2_0 >= 71 && LA2_0 <= 76)||LA2_0==80||(LA2_0 >= 82 && LA2_0 <= 86)||(LA2_0 >= 89 && LA2_0 <= 97)) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// Python.g:80:15: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_file_input103); if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:80:25: stmt
					{
					pushFollow(FOLLOW_stmt_in_file_input107);
					stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop2;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "file_input"



	// $ANTLR start "eval_input"
	// Python.g:83:1: eval_input : ( NEWLINE )* testlist ( NEWLINE )* ;
	public final void eval_input() throws RecognitionException {
		try {
			// Python.g:83:12: ( ( NEWLINE )* testlist ( NEWLINE )* )
			// Python.g:83:14: ( NEWLINE )* testlist ( NEWLINE )*
			{
			// Python.g:83:14: ( NEWLINE )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==NEWLINE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Python.g:83:15: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_eval_input130); if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			pushFollow(FOLLOW_testlist_in_eval_input134);
			testlist();
			state._fsp--;
			if (state.failed) return;
			// Python.g:83:34: ( NEWLINE )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==NEWLINE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Python.g:83:35: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_eval_input137); if (state.failed) return;
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "eval_input"



	// $ANTLR start "decorators"
	// Python.g:86:1: decorators : ( decorator )+ ;
	public final void decorators() throws RecognitionException {
		try {
			// Python.g:86:11: ( ( decorator )+ )
			// Python.g:86:13: ( decorator )+
			{
			// Python.g:86:13: ( decorator )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==AT) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Python.g:86:13: decorator
					{
					pushFollow(FOLLOW_decorator_in_decorators158);
					decorator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decorators"



	// $ANTLR start "decorator"
	// Python.g:89:1: decorator : AT dotted_attr ( LPAREN ( arglist )? RPAREN )? NEWLINE ;
	public final void decorator() throws RecognitionException {
		try {
			// Python.g:89:10: ( AT dotted_attr ( LPAREN ( arglist )? RPAREN )? NEWLINE )
			// Python.g:89:12: AT dotted_attr ( LPAREN ( arglist )? RPAREN )? NEWLINE
			{
			match(input,AT,FOLLOW_AT_in_decorator177); if (state.failed) return;
			pushFollow(FOLLOW_dotted_attr_in_decorator179);
			dotted_attr();
			state._fsp--;
			if (state.failed) return;
			// Python.g:89:27: ( LPAREN ( arglist )? RPAREN )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LPAREN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Python.g:89:28: LPAREN ( arglist )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_decorator182); if (state.failed) return;
					// Python.g:89:35: ( arglist )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==BACKQUOTE||LA6_0==COMPLEX||LA6_0==DOUBLESTAR||LA6_0==FLOAT||(LA6_0 >= INT && LA6_0 <= LCURLY)||(LA6_0 >= LONGINT && LA6_0 <= MINUS)||LA6_0==NAME||LA6_0==NOT||LA6_0==PLUS||LA6_0==STAR||(LA6_0 >= STRING && LA6_0 <= TILDE)||LA6_0==89) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// Python.g:89:35: arglist
							{
							pushFollow(FOLLOW_arglist_in_decorator184);
							arglist();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_decorator187); if (state.failed) return;
					}
					break;

			}

			match(input,NEWLINE,FOLLOW_NEWLINE_in_decorator191); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decorator"



	// $ANTLR start "dotted_attr"
	// Python.g:92:1: dotted_attr : NAME ( DOT NAME )* ;
	public final void dotted_attr() throws RecognitionException {
		try {
			// Python.g:93:5: ( NAME ( DOT NAME )* )
			// Python.g:93:7: NAME ( DOT NAME )*
			{
			match(input,NAME,FOLLOW_NAME_in_dotted_attr213); if (state.failed) return;
			// Python.g:93:12: ( DOT NAME )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==DOT) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Python.g:93:13: DOT NAME
					{
					match(input,DOT,FOLLOW_DOT_in_dotted_attr216); if (state.failed) return;
					match(input,NAME,FOLLOW_NAME_in_dotted_attr218); if (state.failed) return;
					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dotted_attr"



	// $ANTLR start "funcdef"
	// Python.g:96:1: funcdef : ( decorators )? 'def' NAME parameters COLON suite ;
	public final void funcdef() throws RecognitionException {
		try {
			// Python.g:96:9: ( ( decorators )? 'def' NAME parameters COLON suite )
			// Python.g:96:11: ( decorators )? 'def' NAME parameters COLON suite
			{
			// Python.g:96:11: ( decorators )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==AT) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Python.g:96:11: decorators
					{
					pushFollow(FOLLOW_decorators_in_funcdef233);
					decorators();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,75,FOLLOW_75_in_funcdef236); if (state.failed) return;
			match(input,NAME,FOLLOW_NAME_in_funcdef238); if (state.failed) return;
			pushFollow(FOLLOW_parameters_in_funcdef240);
			parameters();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_funcdef242); if (state.failed) return;
			pushFollow(FOLLOW_suite_in_funcdef244);
			suite();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funcdef"



	// $ANTLR start "parameters"
	// Python.g:99:1: parameters : LPAREN ( varargslist )? RPAREN ;
	public final void parameters() throws RecognitionException {
		try {
			// Python.g:99:12: ( LPAREN ( varargslist )? RPAREN )
			// Python.g:99:14: LPAREN ( varargslist )? RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_parameters261); if (state.failed) return;
			// Python.g:99:21: ( varargslist )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==DOUBLESTAR||LA10_0==LPAREN||LA10_0==NAME||LA10_0==STAR) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// Python.g:99:22: varargslist
					{
					pushFollow(FOLLOW_varargslist_in_parameters264);
					varargslist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_parameters268); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parameters"



	// $ANTLR start "varargslist"
	// Python.g:102:1: varargslist : ( defparameter ( options {greedy=true; } : COMMA defparameter )* ( COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )? )? | STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME );
	public final void varargslist() throws RecognitionException {
		try {
			// Python.g:102:13: ( defparameter ( options {greedy=true; } : COMMA defparameter )* ( COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )? )? | STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )
			int alt16=3;
			switch ( input.LA(1) ) {
			case LPAREN:
			case NAME:
				{
				alt16=1;
				}
				break;
			case STAR:
				{
				alt16=2;
				}
				break;
			case DOUBLESTAR:
				{
				alt16=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// Python.g:102:15: defparameter ( options {greedy=true; } : COMMA defparameter )* ( COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )? )?
					{
					pushFollow(FOLLOW_defparameter_in_varargslist288);
					defparameter();
					state._fsp--;
					if (state.failed) return;
					// Python.g:102:28: ( options {greedy=true; } : COMMA defparameter )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==COMMA) ) {
							int LA11_1 = input.LA(2);
							if ( (LA11_1==LPAREN||LA11_1==NAME) ) {
								alt11=1;
							}

						}

						switch (alt11) {
						case 1 :
							// Python.g:102:52: COMMA defparameter
							{
							match(input,COMMA,FOLLOW_COMMA_in_varargslist298); if (state.failed) return;
							pushFollow(FOLLOW_defparameter_in_varargslist300);
							defparameter();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop11;
						}
					}

					// Python.g:103:15: ( COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )? )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==COMMA) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// Python.g:103:16: COMMA ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_varargslist319); if (state.failed) return;
							// Python.g:104:19: ( STAR NAME ( COMMA DOUBLESTAR NAME )? | DOUBLESTAR NAME )?
							int alt13=3;
							int LA13_0 = input.LA(1);
							if ( (LA13_0==STAR) ) {
								alt13=1;
							}
							else if ( (LA13_0==DOUBLESTAR) ) {
								alt13=2;
							}
							switch (alt13) {
								case 1 :
									// Python.g:104:21: STAR NAME ( COMMA DOUBLESTAR NAME )?
									{
									match(input,STAR,FOLLOW_STAR_in_varargslist341); if (state.failed) return;
									match(input,NAME,FOLLOW_NAME_in_varargslist343); if (state.failed) return;
									// Python.g:104:31: ( COMMA DOUBLESTAR NAME )?
									int alt12=2;
									int LA12_0 = input.LA(1);
									if ( (LA12_0==COMMA) ) {
										alt12=1;
									}
									switch (alt12) {
										case 1 :
											// Python.g:104:32: COMMA DOUBLESTAR NAME
											{
											match(input,COMMA,FOLLOW_COMMA_in_varargslist346); if (state.failed) return;
											match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_varargslist348); if (state.failed) return;
											match(input,NAME,FOLLOW_NAME_in_varargslist350); if (state.failed) return;
											}
											break;

									}

									}
									break;
								case 2 :
									// Python.g:105:21: DOUBLESTAR NAME
									{
									match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_varargslist374); if (state.failed) return;
									match(input,NAME,FOLLOW_NAME_in_varargslist376); if (state.failed) return;
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// Python.g:108:15: STAR NAME ( COMMA DOUBLESTAR NAME )?
					{
					match(input,STAR,FOLLOW_STAR_in_varargslist430); if (state.failed) return;
					match(input,NAME,FOLLOW_NAME_in_varargslist432); if (state.failed) return;
					// Python.g:108:25: ( COMMA DOUBLESTAR NAME )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==COMMA) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// Python.g:108:26: COMMA DOUBLESTAR NAME
							{
							match(input,COMMA,FOLLOW_COMMA_in_varargslist435); if (state.failed) return;
							match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_varargslist437); if (state.failed) return;
							match(input,NAME,FOLLOW_NAME_in_varargslist439); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 3 :
					// Python.g:109:15: DOUBLESTAR NAME
					{
					match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_varargslist457); if (state.failed) return;
					match(input,NAME,FOLLOW_NAME_in_varargslist459); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varargslist"



	// $ANTLR start "defparameter"
	// Python.g:112:1: defparameter : fpdef ( ASSIGN test )? ;
	public final void defparameter() throws RecognitionException {
		try {
			// Python.g:112:14: ( fpdef ( ASSIGN test )? )
			// Python.g:112:16: fpdef ( ASSIGN test )?
			{
			pushFollow(FOLLOW_fpdef_in_defparameter480);
			fpdef();
			state._fsp--;
			if (state.failed) return;
			// Python.g:112:22: ( ASSIGN test )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ASSIGN) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// Python.g:112:23: ASSIGN test
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_defparameter483); if (state.failed) return;
					pushFollow(FOLLOW_test_in_defparameter485);
					test();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "defparameter"



	// $ANTLR start "fpdef"
	// Python.g:115:1: fpdef : ( NAME | LPAREN fplist RPAREN );
	public final void fpdef() throws RecognitionException {
		try {
			// Python.g:115:7: ( NAME | LPAREN fplist RPAREN )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==NAME) ) {
				alt18=1;
			}
			else if ( (LA18_0==LPAREN) ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// Python.g:115:9: NAME
					{
					match(input,NAME,FOLLOW_NAME_in_fpdef509); if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:116:9: LPAREN fplist RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_fpdef519); if (state.failed) return;
					pushFollow(FOLLOW_fplist_in_fpdef521);
					fplist();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_fpdef523); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fpdef"



	// $ANTLR start "fplist"
	// Python.g:119:1: fplist : fpdef ( options {greedy=true; } : COMMA fpdef )* ( COMMA )? ;
	public final void fplist() throws RecognitionException {
		try {
			// Python.g:119:8: ( fpdef ( options {greedy=true; } : COMMA fpdef )* ( COMMA )? )
			// Python.g:119:10: fpdef ( options {greedy=true; } : COMMA fpdef )* ( COMMA )?
			{
			pushFollow(FOLLOW_fpdef_in_fplist538);
			fpdef();
			state._fsp--;
			if (state.failed) return;
			// Python.g:119:16: ( options {greedy=true; } : COMMA fpdef )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					int LA19_1 = input.LA(2);
					if ( (LA19_1==LPAREN||LA19_1==NAME) ) {
						alt19=1;
					}

				}

				switch (alt19) {
				case 1 :
					// Python.g:119:40: COMMA fpdef
					{
					match(input,COMMA,FOLLOW_COMMA_in_fplist548); if (state.failed) return;
					pushFollow(FOLLOW_fpdef_in_fplist550);
					fpdef();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop19;
				}
			}

			// Python.g:119:54: ( COMMA )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==COMMA) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Python.g:119:55: COMMA
					{
					match(input,COMMA,FOLLOW_COMMA_in_fplist555); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fplist"



	// $ANTLR start "stmt"
	// Python.g:122:1: stmt : ( simple_stmt | compound_stmt );
	public final void stmt() throws RecognitionException {
		try {
			// Python.g:122:6: ( simple_stmt | compound_stmt )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==BACKQUOTE||LA21_0==COMPLEX||LA21_0==FLOAT||(LA21_0 >= INT && LA21_0 <= LCURLY)||(LA21_0 >= LONGINT && LA21_0 <= MINUS)||LA21_0==NAME||LA21_0==NOT||LA21_0==PLUS||(LA21_0 >= STRING && LA21_0 <= TILDE)||(LA21_0 >= 71 && LA21_0 <= 72)||LA21_0==74||LA21_0==76||LA21_0==80||(LA21_0 >= 83 && LA21_0 <= 84)||LA21_0==86||(LA21_0 >= 89 && LA21_0 <= 93)||LA21_0==97) ) {
				alt21=1;
			}
			else if ( (LA21_0==AT||LA21_0==73||LA21_0==75||LA21_0==82||LA21_0==85||(LA21_0 >= 94 && LA21_0 <= 96)) ) {
				alt21=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// Python.g:122:8: simple_stmt
					{
					pushFollow(FOLLOW_simple_stmt_in_stmt573);
					simple_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:123:8: compound_stmt
					{
					pushFollow(FOLLOW_compound_stmt_in_stmt582);
					compound_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stmt"



	// $ANTLR start "simple_stmt"
	// Python.g:126:1: simple_stmt : small_stmt ( options {greedy=true; } : SEMI small_stmt )* ( SEMI )? NEWLINE ;
	public final void simple_stmt() throws RecognitionException {
		try {
			// Python.g:126:13: ( small_stmt ( options {greedy=true; } : SEMI small_stmt )* ( SEMI )? NEWLINE )
			// Python.g:126:15: small_stmt ( options {greedy=true; } : SEMI small_stmt )* ( SEMI )? NEWLINE
			{
			pushFollow(FOLLOW_small_stmt_in_simple_stmt596);
			small_stmt();
			state._fsp--;
			if (state.failed) return;
			// Python.g:126:26: ( options {greedy=true; } : SEMI small_stmt )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==SEMI) ) {
					int LA22_1 = input.LA(2);
					if ( (LA22_1==BACKQUOTE||LA22_1==COMPLEX||LA22_1==FLOAT||(LA22_1 >= INT && LA22_1 <= LCURLY)||(LA22_1 >= LONGINT && LA22_1 <= MINUS)||LA22_1==NAME||LA22_1==NOT||LA22_1==PLUS||(LA22_1 >= STRING && LA22_1 <= TILDE)||(LA22_1 >= 71 && LA22_1 <= 72)||LA22_1==74||LA22_1==76||LA22_1==80||(LA22_1 >= 83 && LA22_1 <= 84)||LA22_1==86||(LA22_1 >= 89 && LA22_1 <= 93)||LA22_1==97) ) {
						alt22=1;
					}

				}

				switch (alt22) {
				case 1 :
					// Python.g:126:50: SEMI small_stmt
					{
					match(input,SEMI,FOLLOW_SEMI_in_simple_stmt606); if (state.failed) return;
					pushFollow(FOLLOW_small_stmt_in_simple_stmt608);
					small_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
				}
			}

			// Python.g:126:68: ( SEMI )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==SEMI) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Python.g:126:69: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_simple_stmt613); if (state.failed) return;
					}
					break;

			}

			match(input,NEWLINE,FOLLOW_NEWLINE_in_simple_stmt617); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "simple_stmt"



	// $ANTLR start "small_stmt"
	// Python.g:129:1: small_stmt : ( expr_stmt | print_stmt | del_stmt | pass_stmt | flow_stmt | import_stmt | global_stmt | exec_stmt | assert_stmt );
	public final void small_stmt() throws RecognitionException {
		try {
			// Python.g:129:12: ( expr_stmt | print_stmt | del_stmt | pass_stmt | flow_stmt | import_stmt | global_stmt | exec_stmt | assert_stmt )
			int alt24=9;
			switch ( input.LA(1) ) {
			case BACKQUOTE:
			case COMPLEX:
			case FLOAT:
			case INT:
			case LBRACK:
			case LCURLY:
			case LONGINT:
			case LPAREN:
			case MINUS:
			case NAME:
			case NOT:
			case PLUS:
			case STRING:
			case TILDE:
			case 89:
				{
				alt24=1;
				}
				break;
			case 91:
				{
				alt24=2;
				}
				break;
			case 76:
				{
				alt24=3;
				}
				break;
			case 90:
				{
				alt24=4;
				}
				break;
			case 72:
			case 74:
			case 92:
			case 93:
			case 97:
				{
				alt24=5;
				}
				break;
			case 83:
			case 86:
				{
				alt24=6;
				}
				break;
			case 84:
				{
				alt24=7;
				}
				break;
			case 80:
				{
				alt24=8;
				}
				break;
			case 71:
				{
				alt24=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// Python.g:129:14: expr_stmt
					{
					pushFollow(FOLLOW_expr_stmt_in_small_stmt638);
					expr_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:130:14: print_stmt
					{
					pushFollow(FOLLOW_print_stmt_in_small_stmt653);
					print_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Python.g:131:14: del_stmt
					{
					pushFollow(FOLLOW_del_stmt_in_small_stmt668);
					del_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Python.g:132:14: pass_stmt
					{
					pushFollow(FOLLOW_pass_stmt_in_small_stmt683);
					pass_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Python.g:133:14: flow_stmt
					{
					pushFollow(FOLLOW_flow_stmt_in_small_stmt698);
					flow_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Python.g:134:14: import_stmt
					{
					pushFollow(FOLLOW_import_stmt_in_small_stmt713);
					import_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Python.g:135:14: global_stmt
					{
					pushFollow(FOLLOW_global_stmt_in_small_stmt728);
					global_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// Python.g:136:14: exec_stmt
					{
					pushFollow(FOLLOW_exec_stmt_in_small_stmt743);
					exec_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// Python.g:137:14: assert_stmt
					{
					pushFollow(FOLLOW_assert_stmt_in_small_stmt758);
					assert_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "small_stmt"



	// $ANTLR start "expr_stmt"
	// Python.g:140:1: expr_stmt : testlist ( augassign yield_expr | augassign testlist | assigns )? ;
	public final void expr_stmt() throws RecognitionException {
		try {
			// Python.g:140:11: ( testlist ( augassign yield_expr | augassign testlist | assigns )? )
			// Python.g:140:13: testlist ( augassign yield_expr | augassign testlist | assigns )?
			{
			pushFollow(FOLLOW_testlist_in_expr_stmt778);
			testlist();
			state._fsp--;
			if (state.failed) return;
			// Python.g:141:13: ( augassign yield_expr | augassign testlist | assigns )?
			int alt25=4;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==AMPEREQUAL||LA25_0==CIRCUMFLEXEQUAL||LA25_0==DOUBLESLASHEQUAL||LA25_0==DOUBLESTAREQUAL||LA25_0==LEFTSHIFTEQUAL||LA25_0==MINUSEQUAL||LA25_0==PERCENTEQUAL||LA25_0==PLUSEQUAL||LA25_0==RIGHTSHIFTEQUAL||LA25_0==SLASHEQUAL||LA25_0==STAREQUAL||LA25_0==VBAREQUAL) ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1==97) ) {
					alt25=1;
				}
				else if ( (LA25_1==BACKQUOTE||LA25_1==COMPLEX||LA25_1==FLOAT||(LA25_1 >= INT && LA25_1 <= LCURLY)||(LA25_1 >= LONGINT && LA25_1 <= MINUS)||LA25_1==NAME||LA25_1==NOT||LA25_1==PLUS||(LA25_1 >= STRING && LA25_1 <= TILDE)||LA25_1==89) ) {
					alt25=2;
				}
			}
			else if ( (LA25_0==ASSIGN) ) {
				alt25=3;
			}
			switch (alt25) {
				case 1 :
					// Python.g:141:15: augassign yield_expr
					{
					pushFollow(FOLLOW_augassign_in_expr_stmt794);
					augassign();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_yield_expr_in_expr_stmt796);
					yield_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:142:15: augassign testlist
					{
					pushFollow(FOLLOW_augassign_in_expr_stmt812);
					augassign();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_testlist_in_expr_stmt814);
					testlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Python.g:143:15: assigns
					{
					pushFollow(FOLLOW_assigns_in_expr_stmt830);
					assigns();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_stmt"



	// $ANTLR start "assigns"
	// Python.g:147:1: assigns : ( ( assign_testlist )+ | ( assign_yield )+ );
	public final void assigns() throws RecognitionException {
		try {
			// Python.g:148:5: ( ( assign_testlist )+ | ( assign_yield )+ )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==ASSIGN) ) {
				int LA28_1 = input.LA(2);
				if ( (LA28_1==BACKQUOTE||LA28_1==COMPLEX||LA28_1==FLOAT||(LA28_1 >= INT && LA28_1 <= LCURLY)||(LA28_1 >= LONGINT && LA28_1 <= MINUS)||LA28_1==NAME||LA28_1==NOT||LA28_1==PLUS||(LA28_1 >= STRING && LA28_1 <= TILDE)||LA28_1==89) ) {
					alt28=1;
				}
				else if ( (LA28_1==97) ) {
					alt28=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// Python.g:148:7: ( assign_testlist )+
					{
					// Python.g:148:7: ( assign_testlist )+
					int cnt26=0;
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==ASSIGN) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// Python.g:148:7: assign_testlist
							{
							pushFollow(FOLLOW_assign_testlist_in_assigns868);
							assign_testlist();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt26 >= 1 ) break loop26;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(26, input);
							throw eee;
						}
						cnt26++;
					}

					}
					break;
				case 2 :
					// Python.g:149:7: ( assign_yield )+
					{
					// Python.g:149:7: ( assign_yield )+
					int cnt27=0;
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==ASSIGN) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// Python.g:149:7: assign_yield
							{
							pushFollow(FOLLOW_assign_yield_in_assigns877);
							assign_yield();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt27 >= 1 ) break loop27;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(27, input);
							throw eee;
						}
						cnt27++;
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assigns"



	// $ANTLR start "assign_testlist"
	// Python.g:152:1: assign_testlist : ASSIGN testlist ;
	public final void assign_testlist() throws RecognitionException {
		try {
			// Python.g:153:8: ( ASSIGN testlist )
			// Python.g:153:10: ASSIGN testlist
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_testlist898); if (state.failed) return;
			pushFollow(FOLLOW_testlist_in_assign_testlist900);
			testlist();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assign_testlist"



	// $ANTLR start "assign_yield"
	// Python.g:156:1: assign_yield : ASSIGN yield_expr ;
	public final void assign_yield() throws RecognitionException {
		try {
			// Python.g:157:5: ( ASSIGN yield_expr )
			// Python.g:157:7: ASSIGN yield_expr
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_yield920); if (state.failed) return;
			pushFollow(FOLLOW_yield_expr_in_assign_yield922);
			yield_expr();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assign_yield"



	// $ANTLR start "augassign"
	// Python.g:160:1: augassign : ( PLUSEQUAL | MINUSEQUAL | STAREQUAL | SLASHEQUAL | PERCENTEQUAL | AMPEREQUAL | VBAREQUAL | CIRCUMFLEXEQUAL | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL | DOUBLESLASHEQUAL );
	public final void augassign() throws RecognitionException {
		try {
			// Python.g:160:11: ( PLUSEQUAL | MINUSEQUAL | STAREQUAL | SLASHEQUAL | PERCENTEQUAL | AMPEREQUAL | VBAREQUAL | CIRCUMFLEXEQUAL | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL | DOUBLESLASHEQUAL )
			// Python.g:
			{
			if ( input.LA(1)==AMPEREQUAL||input.LA(1)==CIRCUMFLEXEQUAL||input.LA(1)==DOUBLESLASHEQUAL||input.LA(1)==DOUBLESTAREQUAL||input.LA(1)==LEFTSHIFTEQUAL||input.LA(1)==MINUSEQUAL||input.LA(1)==PERCENTEQUAL||input.LA(1)==PLUSEQUAL||input.LA(1)==RIGHTSHIFTEQUAL||input.LA(1)==SLASHEQUAL||input.LA(1)==STAREQUAL||input.LA(1)==VBAREQUAL ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "augassign"



	// $ANTLR start "print_stmt"
	// Python.g:174:1: print_stmt : 'print' ( printlist | RIGHTSHIFT printlist )? ;
	public final void print_stmt() throws RecognitionException {
		try {
			// Python.g:174:12: ( 'print' ( printlist | RIGHTSHIFT printlist )? )
			// Python.g:174:14: 'print' ( printlist | RIGHTSHIFT printlist )?
			{
			match(input,91,FOLLOW_91_in_print_stmt1108); if (state.failed) return;
			// Python.g:174:22: ( printlist | RIGHTSHIFT printlist )?
			int alt29=3;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==BACKQUOTE||LA29_0==COMPLEX||LA29_0==FLOAT||(LA29_0 >= INT && LA29_0 <= LCURLY)||(LA29_0 >= LONGINT && LA29_0 <= MINUS)||LA29_0==NAME||LA29_0==NOT||LA29_0==PLUS||(LA29_0 >= STRING && LA29_0 <= TILDE)||LA29_0==89) ) {
				alt29=1;
			}
			else if ( (LA29_0==RIGHTSHIFT) ) {
				alt29=2;
			}
			switch (alt29) {
				case 1 :
					// Python.g:174:23: printlist
					{
					pushFollow(FOLLOW_printlist_in_print_stmt1111);
					printlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:174:35: RIGHTSHIFT printlist
					{
					match(input,RIGHTSHIFT,FOLLOW_RIGHTSHIFT_in_print_stmt1115); if (state.failed) return;
					pushFollow(FOLLOW_printlist_in_print_stmt1117);
					printlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print_stmt"



	// $ANTLR start "printlist"
	// Python.g:177:1: printlist returns [boolean newline] : test ( options {k=2; } : COMMA test )* ( COMMA )? ;
	public final boolean printlist() throws RecognitionException {
		boolean newline = false;


		try {
			// Python.g:178:5: ( test ( options {k=2; } : COMMA test )* ( COMMA )? )
			// Python.g:178:7: test ( options {k=2; } : COMMA test )* ( COMMA )?
			{
			pushFollow(FOLLOW_test_in_printlist1147);
			test();
			state._fsp--;
			if (state.failed) return newline;
			// Python.g:178:12: ( options {k=2; } : COMMA test )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==COMMA) ) {
					int LA30_1 = input.LA(2);
					if ( (LA30_1==BACKQUOTE||LA30_1==COMPLEX||LA30_1==FLOAT||(LA30_1 >= INT && LA30_1 <= LCURLY)||(LA30_1 >= LONGINT && LA30_1 <= MINUS)||LA30_1==NAME||LA30_1==NOT||LA30_1==PLUS||(LA30_1 >= STRING && LA30_1 <= TILDE)||LA30_1==89) ) {
						alt30=1;
					}

				}

				switch (alt30) {
				case 1 :
					// Python.g:178:29: COMMA test
					{
					match(input,COMMA,FOLLOW_COMMA_in_printlist1158); if (state.failed) return newline;
					pushFollow(FOLLOW_test_in_printlist1160);
					test();
					state._fsp--;
					if (state.failed) return newline;
					}
					break;

				default :
					break loop30;
				}
			}

			// Python.g:178:42: ( COMMA )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==COMMA) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// Python.g:178:43: COMMA
					{
					match(input,COMMA,FOLLOW_COMMA_in_printlist1165); if (state.failed) return newline;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return newline;
	}
	// $ANTLR end "printlist"



	// $ANTLR start "del_stmt"
	// Python.g:182:1: del_stmt : 'del' exprlist ;
	public final void del_stmt() throws RecognitionException {
		try {
			// Python.g:182:10: ( 'del' exprlist )
			// Python.g:182:12: 'del' exprlist
			{
			match(input,76,FOLLOW_76_in_del_stmt1181); if (state.failed) return;
			pushFollow(FOLLOW_exprlist_in_del_stmt1183);
			exprlist();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "del_stmt"



	// $ANTLR start "pass_stmt"
	// Python.g:185:1: pass_stmt : 'pass' ;
	public final void pass_stmt() throws RecognitionException {
		try {
			// Python.g:185:11: ( 'pass' )
			// Python.g:185:13: 'pass'
			{
			match(input,90,FOLLOW_90_in_pass_stmt1201); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pass_stmt"



	// $ANTLR start "flow_stmt"
	// Python.g:188:1: flow_stmt : ( break_stmt | continue_stmt | return_stmt | raise_stmt | yield_stmt );
	public final void flow_stmt() throws RecognitionException {
		try {
			// Python.g:188:11: ( break_stmt | continue_stmt | return_stmt | raise_stmt | yield_stmt )
			int alt32=5;
			switch ( input.LA(1) ) {
			case 72:
				{
				alt32=1;
				}
				break;
			case 74:
				{
				alt32=2;
				}
				break;
			case 93:
				{
				alt32=3;
				}
				break;
			case 92:
				{
				alt32=4;
				}
				break;
			case 97:
				{
				alt32=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// Python.g:188:13: break_stmt
					{
					pushFollow(FOLLOW_break_stmt_in_flow_stmt1220);
					break_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:189:13: continue_stmt
					{
					pushFollow(FOLLOW_continue_stmt_in_flow_stmt1234);
					continue_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Python.g:190:13: return_stmt
					{
					pushFollow(FOLLOW_return_stmt_in_flow_stmt1248);
					return_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Python.g:191:13: raise_stmt
					{
					pushFollow(FOLLOW_raise_stmt_in_flow_stmt1262);
					raise_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Python.g:192:13: yield_stmt
					{
					pushFollow(FOLLOW_yield_stmt_in_flow_stmt1276);
					yield_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "flow_stmt"



	// $ANTLR start "break_stmt"
	// Python.g:195:1: break_stmt : 'break' ;
	public final void break_stmt() throws RecognitionException {
		try {
			// Python.g:195:12: ( 'break' )
			// Python.g:195:14: 'break'
			{
			match(input,72,FOLLOW_72_in_break_stmt1295); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "break_stmt"



	// $ANTLR start "continue_stmt"
	// Python.g:198:1: continue_stmt : 'continue' ;
	public final void continue_stmt() throws RecognitionException {
		try {
			// Python.g:198:15: ( 'continue' )
			// Python.g:198:17: 'continue'
			{
			match(input,74,FOLLOW_74_in_continue_stmt1315); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "continue_stmt"



	// $ANTLR start "return_stmt"
	// Python.g:201:1: return_stmt : 'return' ( testlist )? ;
	public final void return_stmt() throws RecognitionException {
		try {
			// Python.g:201:13: ( 'return' ( testlist )? )
			// Python.g:201:15: 'return' ( testlist )?
			{
			match(input,93,FOLLOW_93_in_return_stmt1338); if (state.failed) return;
			// Python.g:201:24: ( testlist )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==BACKQUOTE||LA33_0==COMPLEX||LA33_0==FLOAT||(LA33_0 >= INT && LA33_0 <= LCURLY)||(LA33_0 >= LONGINT && LA33_0 <= MINUS)||LA33_0==NAME||LA33_0==NOT||LA33_0==PLUS||(LA33_0 >= STRING && LA33_0 <= TILDE)||LA33_0==89) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// Python.g:201:25: testlist
					{
					pushFollow(FOLLOW_testlist_in_return_stmt1341);
					testlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "return_stmt"



	// $ANTLR start "yield_stmt"
	// Python.g:204:1: yield_stmt : yield_expr ;
	public final void yield_stmt() throws RecognitionException {
		try {
			// Python.g:204:12: ( yield_expr )
			// Python.g:204:14: yield_expr
			{
			pushFollow(FOLLOW_yield_expr_in_yield_stmt1364);
			yield_expr();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "yield_stmt"



	// $ANTLR start "raise_stmt"
	// Python.g:207:1: raise_stmt : 'raise' ( test ( COMMA test ( COMMA test )? )? )? ;
	public final void raise_stmt() throws RecognitionException {
		try {
			// Python.g:207:11: ( 'raise' ( test ( COMMA test ( COMMA test )? )? )? )
			// Python.g:207:13: 'raise' ( test ( COMMA test ( COMMA test )? )? )?
			{
			match(input,92,FOLLOW_92_in_raise_stmt1383); if (state.failed) return;
			// Python.g:207:21: ( test ( COMMA test ( COMMA test )? )? )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==BACKQUOTE||LA36_0==COMPLEX||LA36_0==FLOAT||(LA36_0 >= INT && LA36_0 <= LCURLY)||(LA36_0 >= LONGINT && LA36_0 <= MINUS)||LA36_0==NAME||LA36_0==NOT||LA36_0==PLUS||(LA36_0 >= STRING && LA36_0 <= TILDE)||LA36_0==89) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// Python.g:207:22: test ( COMMA test ( COMMA test )? )?
					{
					pushFollow(FOLLOW_test_in_raise_stmt1386);
					test();
					state._fsp--;
					if (state.failed) return;
					// Python.g:207:27: ( COMMA test ( COMMA test )? )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==COMMA) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// Python.g:207:28: COMMA test ( COMMA test )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_raise_stmt1389); if (state.failed) return;
							pushFollow(FOLLOW_test_in_raise_stmt1391);
							test();
							state._fsp--;
							if (state.failed) return;
							// Python.g:207:39: ( COMMA test )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==COMMA) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// Python.g:207:40: COMMA test
									{
									match(input,COMMA,FOLLOW_COMMA_in_raise_stmt1394); if (state.failed) return;
									pushFollow(FOLLOW_test_in_raise_stmt1396);
									test();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "raise_stmt"



	// $ANTLR start "import_stmt"
	// Python.g:210:1: import_stmt : ( import_name | import_from );
	public final void import_stmt() throws RecognitionException {
		try {
			// Python.g:210:13: ( import_name | import_from )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==86) ) {
				alt37=1;
			}
			else if ( (LA37_0==83) ) {
				alt37=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// Python.g:210:15: import_name
					{
					pushFollow(FOLLOW_import_name_in_import_stmt1421);
					import_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:211:15: import_from
					{
					pushFollow(FOLLOW_import_from_in_import_stmt1437);
					import_from();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "import_stmt"



	// $ANTLR start "import_name"
	// Python.g:214:1: import_name : 'import' dotted_as_names ;
	public final void import_name() throws RecognitionException {
		try {
			// Python.g:214:13: ( 'import' dotted_as_names )
			// Python.g:214:15: 'import' dotted_as_names
			{
			match(input,86,FOLLOW_86_in_import_name1458); if (state.failed) return;
			pushFollow(FOLLOW_dotted_as_names_in_import_name1460);
			dotted_as_names();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "import_name"



	// $ANTLR start "import_from"
	// Python.g:217:1: import_from : 'from' ( ( DOT )* dotted_name | ( DOT )+ ) 'import' ( STAR | import_as_names | LPAREN import_as_names RPAREN ) ;
	public final void import_from() throws RecognitionException {
		try {
			// Python.g:217:12: ( 'from' ( ( DOT )* dotted_name | ( DOT )+ ) 'import' ( STAR | import_as_names | LPAREN import_as_names RPAREN ) )
			// Python.g:217:14: 'from' ( ( DOT )* dotted_name | ( DOT )+ ) 'import' ( STAR | import_as_names | LPAREN import_as_names RPAREN )
			{
			match(input,83,FOLLOW_83_in_import_from1480); if (state.failed) return;
			// Python.g:217:21: ( ( DOT )* dotted_name | ( DOT )+ )
			int alt40=2;
			alt40 = dfa40.predict(input);
			switch (alt40) {
				case 1 :
					// Python.g:217:22: ( DOT )* dotted_name
					{
					// Python.g:217:22: ( DOT )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==DOT) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// Python.g:217:22: DOT
							{
							match(input,DOT,FOLLOW_DOT_in_import_from1483); if (state.failed) return;
							}
							break;

						default :
							break loop38;
						}
					}

					pushFollow(FOLLOW_dotted_name_in_import_from1486);
					dotted_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:217:41: ( DOT )+
					{
					// Python.g:217:41: ( DOT )+
					int cnt39=0;
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==DOT) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// Python.g:217:41: DOT
							{
							match(input,DOT,FOLLOW_DOT_in_import_from1490); if (state.failed) return;
							}
							break;

						default :
							if ( cnt39 >= 1 ) break loop39;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(39, input);
							throw eee;
						}
						cnt39++;
					}

					}
					break;

			}

			match(input,86,FOLLOW_86_in_import_from1494); if (state.failed) return;
			// Python.g:218:15: ( STAR | import_as_names | LPAREN import_as_names RPAREN )
			int alt41=3;
			switch ( input.LA(1) ) {
			case STAR:
				{
				alt41=1;
				}
				break;
			case NAME:
				{
				alt41=2;
				}
				break;
			case LPAREN:
				{
				alt41=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// Python.g:218:16: STAR
					{
					match(input,STAR,FOLLOW_STAR_in_import_from1511); if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:219:17: import_as_names
					{
					pushFollow(FOLLOW_import_as_names_in_import_from1529);
					import_as_names();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Python.g:220:17: LPAREN import_as_names RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_import_from1547); if (state.failed) return;
					pushFollow(FOLLOW_import_as_names_in_import_from1549);
					import_as_names();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_import_from1551); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "import_from"



	// $ANTLR start "import_as_names"
	// Python.g:224:1: import_as_names : import_as_name ( COMMA import_as_name )* ( COMMA )? ;
	public final void import_as_names() throws RecognitionException {
		try {
			// Python.g:224:17: ( import_as_name ( COMMA import_as_name )* ( COMMA )? )
			// Python.g:224:19: import_as_name ( COMMA import_as_name )* ( COMMA )?
			{
			pushFollow(FOLLOW_import_as_name_in_import_as_names1587);
			import_as_name();
			state._fsp--;
			if (state.failed) return;
			// Python.g:224:34: ( COMMA import_as_name )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==COMMA) ) {
					int LA42_1 = input.LA(2);
					if ( (LA42_1==NAME) ) {
						alt42=1;
					}

				}

				switch (alt42) {
				case 1 :
					// Python.g:224:35: COMMA import_as_name
					{
					match(input,COMMA,FOLLOW_COMMA_in_import_as_names1590); if (state.failed) return;
					pushFollow(FOLLOW_import_as_name_in_import_as_names1592);
					import_as_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop42;
				}
			}

			// Python.g:224:58: ( COMMA )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==COMMA) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// Python.g:224:59: COMMA
					{
					match(input,COMMA,FOLLOW_COMMA_in_import_as_names1597); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "import_as_names"



	// $ANTLR start "import_as_name"
	// Python.g:227:1: import_as_name : NAME ( 'as' NAME )? ;
	public final void import_as_name() throws RecognitionException {
		try {
			// Python.g:227:16: ( NAME ( 'as' NAME )? )
			// Python.g:227:18: NAME ( 'as' NAME )?
			{
			match(input,NAME,FOLLOW_NAME_in_import_as_name1624); if (state.failed) return;
			// Python.g:227:23: ( 'as' NAME )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==70) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// Python.g:227:24: 'as' NAME
					{
					match(input,70,FOLLOW_70_in_import_as_name1627); if (state.failed) return;
					match(input,NAME,FOLLOW_NAME_in_import_as_name1629); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "import_as_name"



	// $ANTLR start "dotted_as_name"
	// Python.g:230:1: dotted_as_name : dotted_name ( 'as' NAME )? ;
	public final void dotted_as_name() throws RecognitionException {
		try {
			// Python.g:230:16: ( dotted_name ( 'as' NAME )? )
			// Python.g:230:18: dotted_name ( 'as' NAME )?
			{
			pushFollow(FOLLOW_dotted_name_in_dotted_as_name1655);
			dotted_name();
			state._fsp--;
			if (state.failed) return;
			// Python.g:230:30: ( 'as' NAME )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==70) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// Python.g:230:31: 'as' NAME
					{
					match(input,70,FOLLOW_70_in_dotted_as_name1658); if (state.failed) return;
					match(input,NAME,FOLLOW_NAME_in_dotted_as_name1660); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dotted_as_name"



	// $ANTLR start "dotted_as_names"
	// Python.g:233:1: dotted_as_names : dotted_as_name ( COMMA dotted_as_name )* ;
	public final void dotted_as_names() throws RecognitionException {
		try {
			// Python.g:233:17: ( dotted_as_name ( COMMA dotted_as_name )* )
			// Python.g:233:19: dotted_as_name ( COMMA dotted_as_name )*
			{
			pushFollow(FOLLOW_dotted_as_name_in_dotted_as_names1686);
			dotted_as_name();
			state._fsp--;
			if (state.failed) return;
			// Python.g:233:34: ( COMMA dotted_as_name )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==COMMA) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// Python.g:233:35: COMMA dotted_as_name
					{
					match(input,COMMA,FOLLOW_COMMA_in_dotted_as_names1689); if (state.failed) return;
					pushFollow(FOLLOW_dotted_as_name_in_dotted_as_names1691);
					dotted_as_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop46;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dotted_as_names"



	// $ANTLR start "dotted_name"
	// Python.g:235:1: dotted_name : NAME ( DOT NAME )* ;
	public final void dotted_name() throws RecognitionException {
		try {
			// Python.g:235:13: ( NAME ( DOT NAME )* )
			// Python.g:235:15: NAME ( DOT NAME )*
			{
			match(input,NAME,FOLLOW_NAME_in_dotted_name1717); if (state.failed) return;
			// Python.g:235:20: ( DOT NAME )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==DOT) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// Python.g:235:21: DOT NAME
					{
					match(input,DOT,FOLLOW_DOT_in_dotted_name1720); if (state.failed) return;
					match(input,NAME,FOLLOW_NAME_in_dotted_name1722); if (state.failed) return;
					}
					break;

				default :
					break loop47;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dotted_name"



	// $ANTLR start "global_stmt"
	// Python.g:238:1: global_stmt : 'global' NAME ( COMMA NAME )* ;
	public final void global_stmt() throws RecognitionException {
		try {
			// Python.g:238:13: ( 'global' NAME ( COMMA NAME )* )
			// Python.g:238:15: 'global' NAME ( COMMA NAME )*
			{
			match(input,84,FOLLOW_84_in_global_stmt1745); if (state.failed) return;
			match(input,NAME,FOLLOW_NAME_in_global_stmt1747); if (state.failed) return;
			// Python.g:238:29: ( COMMA NAME )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==COMMA) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// Python.g:238:30: COMMA NAME
					{
					match(input,COMMA,FOLLOW_COMMA_in_global_stmt1750); if (state.failed) return;
					match(input,NAME,FOLLOW_NAME_in_global_stmt1752); if (state.failed) return;
					}
					break;

				default :
					break loop48;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "global_stmt"



	// $ANTLR start "exec_stmt"
	// Python.g:241:1: exec_stmt : 'exec' expr ( 'in' test ( COMMA test )? )? ;
	public final void exec_stmt() throws RecognitionException {
		try {
			// Python.g:241:11: ( 'exec' expr ( 'in' test ( COMMA test )? )? )
			// Python.g:241:13: 'exec' expr ( 'in' test ( COMMA test )? )?
			{
			match(input,80,FOLLOW_80_in_exec_stmt1775); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_exec_stmt1777);
			expr();
			state._fsp--;
			if (state.failed) return;
			// Python.g:241:25: ( 'in' test ( COMMA test )? )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==87) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// Python.g:241:26: 'in' test ( COMMA test )?
					{
					match(input,87,FOLLOW_87_in_exec_stmt1780); if (state.failed) return;
					pushFollow(FOLLOW_test_in_exec_stmt1782);
					test();
					state._fsp--;
					if (state.failed) return;
					// Python.g:241:36: ( COMMA test )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==COMMA) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// Python.g:241:37: COMMA test
							{
							match(input,COMMA,FOLLOW_COMMA_in_exec_stmt1785); if (state.failed) return;
							pushFollow(FOLLOW_test_in_exec_stmt1787);
							test();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exec_stmt"



	// $ANTLR start "assert_stmt"
	// Python.g:244:1: assert_stmt : 'assert' test ( COMMA test )? ;
	public final void assert_stmt() throws RecognitionException {
		try {
			// Python.g:244:13: ( 'assert' test ( COMMA test )? )
			// Python.g:244:15: 'assert' test ( COMMA test )?
			{
			match(input,71,FOLLOW_71_in_assert_stmt1810); if (state.failed) return;
			pushFollow(FOLLOW_test_in_assert_stmt1812);
			test();
			state._fsp--;
			if (state.failed) return;
			// Python.g:244:29: ( COMMA test )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==COMMA) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// Python.g:244:30: COMMA test
					{
					match(input,COMMA,FOLLOW_COMMA_in_assert_stmt1815); if (state.failed) return;
					pushFollow(FOLLOW_test_in_assert_stmt1817);
					test();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assert_stmt"



	// $ANTLR start "compound_stmt"
	// Python.g:247:1: compound_stmt : ( if_stmt | while_stmt | for_stmt | try_stmt | with_stmt | funcdef | classdef );
	public final void compound_stmt() throws RecognitionException {
		try {
			// Python.g:247:15: ( if_stmt | while_stmt | for_stmt | try_stmt | with_stmt | funcdef | classdef )
			int alt52=7;
			switch ( input.LA(1) ) {
			case 85:
				{
				alt52=1;
				}
				break;
			case 95:
				{
				alt52=2;
				}
				break;
			case 82:
				{
				alt52=3;
				}
				break;
			case 94:
				{
				alt52=4;
				}
				break;
			case 96:
				{
				alt52=5;
				}
				break;
			case AT:
			case 75:
				{
				alt52=6;
				}
				break;
			case 73:
				{
				alt52=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// Python.g:247:17: if_stmt
					{
					pushFollow(FOLLOW_if_stmt_in_compound_stmt1840);
					if_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:248:17: while_stmt
					{
					pushFollow(FOLLOW_while_stmt_in_compound_stmt1858);
					while_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Python.g:249:17: for_stmt
					{
					pushFollow(FOLLOW_for_stmt_in_compound_stmt1876);
					for_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Python.g:250:17: try_stmt
					{
					pushFollow(FOLLOW_try_stmt_in_compound_stmt1894);
					try_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Python.g:251:17: with_stmt
					{
					pushFollow(FOLLOW_with_stmt_in_compound_stmt1912);
					with_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Python.g:252:17: funcdef
					{
					pushFollow(FOLLOW_funcdef_in_compound_stmt1930);
					funcdef();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// Python.g:253:17: classdef
					{
					pushFollow(FOLLOW_classdef_in_compound_stmt1948);
					classdef();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "compound_stmt"



	// $ANTLR start "if_stmt"
	// Python.g:256:1: if_stmt : 'if' test COLON suite ( elif_clause )* ( 'else' COLON suite )? ;
	public final void if_stmt() throws RecognitionException {
		try {
			// Python.g:256:8: ( 'if' test COLON suite ( elif_clause )* ( 'else' COLON suite )? )
			// Python.g:256:10: 'if' test COLON suite ( elif_clause )* ( 'else' COLON suite )?
			{
			match(input,85,FOLLOW_85_in_if_stmt1970); if (state.failed) return;
			pushFollow(FOLLOW_test_in_if_stmt1972);
			test();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_if_stmt1974); if (state.failed) return;
			pushFollow(FOLLOW_suite_in_if_stmt1976);
			suite();
			state._fsp--;
			if (state.failed) return;
			// Python.g:256:32: ( elif_clause )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==77) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// Python.g:256:32: elif_clause
					{
					pushFollow(FOLLOW_elif_clause_in_if_stmt1978);
					elif_clause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop53;
				}
			}

			// Python.g:256:46: ( 'else' COLON suite )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==78) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// Python.g:256:47: 'else' COLON suite
					{
					match(input,78,FOLLOW_78_in_if_stmt1983); if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_if_stmt1985); if (state.failed) return;
					pushFollow(FOLLOW_suite_in_if_stmt1987);
					suite();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_stmt"



	// $ANTLR start "elif_clause"
	// Python.g:259:1: elif_clause : 'elif' test COLON suite ;
	public final void elif_clause() throws RecognitionException {
		try {
			// Python.g:259:13: ( 'elif' test COLON suite )
			// Python.g:259:15: 'elif' test COLON suite
			{
			match(input,77,FOLLOW_77_in_elif_clause2005); if (state.failed) return;
			pushFollow(FOLLOW_test_in_elif_clause2007);
			test();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_elif_clause2009); if (state.failed) return;
			pushFollow(FOLLOW_suite_in_elif_clause2011);
			suite();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "elif_clause"



	// $ANTLR start "while_stmt"
	// Python.g:262:1: while_stmt : 'while' test COLON suite ( 'else' COLON suite )? ;
	public final void while_stmt() throws RecognitionException {
		try {
			// Python.g:262:12: ( 'while' test COLON suite ( 'else' COLON suite )? )
			// Python.g:262:14: 'while' test COLON suite ( 'else' COLON suite )?
			{
			match(input,95,FOLLOW_95_in_while_stmt2032); if (state.failed) return;
			pushFollow(FOLLOW_test_in_while_stmt2034);
			test();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_while_stmt2036); if (state.failed) return;
			pushFollow(FOLLOW_suite_in_while_stmt2038);
			suite();
			state._fsp--;
			if (state.failed) return;
			// Python.g:262:39: ( 'else' COLON suite )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==78) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// Python.g:262:40: 'else' COLON suite
					{
					match(input,78,FOLLOW_78_in_while_stmt2041); if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_while_stmt2043); if (state.failed) return;
					pushFollow(FOLLOW_suite_in_while_stmt2045);
					suite();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "while_stmt"



	// $ANTLR start "for_stmt"
	// Python.g:265:1: for_stmt : 'for' exprlist 'in' testlist COLON suite ( 'else' COLON suite )? ;
	public final void for_stmt() throws RecognitionException {
		try {
			// Python.g:265:10: ( 'for' exprlist 'in' testlist COLON suite ( 'else' COLON suite )? )
			// Python.g:265:12: 'for' exprlist 'in' testlist COLON suite ( 'else' COLON suite )?
			{
			match(input,82,FOLLOW_82_in_for_stmt2067); if (state.failed) return;
			pushFollow(FOLLOW_exprlist_in_for_stmt2069);
			exprlist();
			state._fsp--;
			if (state.failed) return;
			match(input,87,FOLLOW_87_in_for_stmt2071); if (state.failed) return;
			pushFollow(FOLLOW_testlist_in_for_stmt2073);
			testlist();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_for_stmt2075); if (state.failed) return;
			pushFollow(FOLLOW_suite_in_for_stmt2077);
			suite();
			state._fsp--;
			if (state.failed) return;
			// Python.g:265:53: ( 'else' COLON suite )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==78) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// Python.g:265:54: 'else' COLON suite
					{
					match(input,78,FOLLOW_78_in_for_stmt2080); if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_for_stmt2082); if (state.failed) return;
					pushFollow(FOLLOW_suite_in_for_stmt2084);
					suite();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "for_stmt"



	// $ANTLR start "try_stmt"
	// Python.g:268:1: try_stmt : 'try' COLON suite ( ( except_clause )+ ( 'else' COLON suite )? ( 'finally' COLON suite )? | 'finally' COLON suite ) ;
	public final void try_stmt() throws RecognitionException {
		try {
			// Python.g:268:10: ( 'try' COLON suite ( ( except_clause )+ ( 'else' COLON suite )? ( 'finally' COLON suite )? | 'finally' COLON suite ) )
			// Python.g:268:12: 'try' COLON suite ( ( except_clause )+ ( 'else' COLON suite )? ( 'finally' COLON suite )? | 'finally' COLON suite )
			{
			match(input,94,FOLLOW_94_in_try_stmt2104); if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_try_stmt2106); if (state.failed) return;
			pushFollow(FOLLOW_suite_in_try_stmt2108);
			suite();
			state._fsp--;
			if (state.failed) return;
			// Python.g:269:12: ( ( except_clause )+ ( 'else' COLON suite )? ( 'finally' COLON suite )? | 'finally' COLON suite )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==79) ) {
				alt60=1;
			}
			else if ( (LA60_0==81) ) {
				alt60=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// Python.g:269:14: ( except_clause )+ ( 'else' COLON suite )? ( 'finally' COLON suite )?
					{
					// Python.g:269:14: ( except_clause )+
					int cnt57=0;
					loop57:
					while (true) {
						int alt57=2;
						int LA57_0 = input.LA(1);
						if ( (LA57_0==79) ) {
							alt57=1;
						}

						switch (alt57) {
						case 1 :
							// Python.g:269:14: except_clause
							{
							pushFollow(FOLLOW_except_clause_in_try_stmt2123);
							except_clause();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt57 >= 1 ) break loop57;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(57, input);
							throw eee;
						}
						cnt57++;
					}

					// Python.g:269:29: ( 'else' COLON suite )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==78) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// Python.g:269:30: 'else' COLON suite
							{
							match(input,78,FOLLOW_78_in_try_stmt2127); if (state.failed) return;
							match(input,COLON,FOLLOW_COLON_in_try_stmt2129); if (state.failed) return;
							pushFollow(FOLLOW_suite_in_try_stmt2131);
							suite();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// Python.g:269:51: ( 'finally' COLON suite )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==81) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// Python.g:269:52: 'finally' COLON suite
							{
							match(input,81,FOLLOW_81_in_try_stmt2136); if (state.failed) return;
							match(input,COLON,FOLLOW_COLON_in_try_stmt2138); if (state.failed) return;
							pushFollow(FOLLOW_suite_in_try_stmt2140);
							suite();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// Python.g:270:14: 'finally' COLON suite
					{
					match(input,81,FOLLOW_81_in_try_stmt2157); if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_try_stmt2159); if (state.failed) return;
					pushFollow(FOLLOW_suite_in_try_stmt2161);
					suite();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "try_stmt"



	// $ANTLR start "with_stmt"
	// Python.g:274:1: with_stmt : 'with' test ( with_var )? COLON suite ;
	public final void with_stmt() throws RecognitionException {
		try {
			// Python.g:274:10: ( 'with' test ( with_var )? COLON suite )
			// Python.g:274:12: 'with' test ( with_var )? COLON suite
			{
			match(input,96,FOLLOW_96_in_with_stmt2191); if (state.failed) return;
			pushFollow(FOLLOW_test_in_with_stmt2193);
			test();
			state._fsp--;
			if (state.failed) return;
			// Python.g:274:24: ( with_var )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==NAME||LA61_0==70) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// Python.g:274:25: with_var
					{
					pushFollow(FOLLOW_with_var_in_with_stmt2196);
					with_var();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,COLON,FOLLOW_COLON_in_with_stmt2200); if (state.failed) return;
			pushFollow(FOLLOW_suite_in_with_stmt2202);
			suite();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "with_stmt"



	// $ANTLR start "with_var"
	// Python.g:277:1: with_var : ( 'as' | NAME ) expr ;
	public final void with_var() throws RecognitionException {
		try {
			// Python.g:277:9: ( ( 'as' | NAME ) expr )
			// Python.g:277:11: ( 'as' | NAME ) expr
			{
			if ( input.LA(1)==NAME||input.LA(1)==70 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_expr_in_with_var2227);
			expr();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "with_var"



	// $ANTLR start "except_clause"
	// Python.g:280:1: except_clause : 'except' ( test ( COMMA test )? )? COLON suite ;
	public final void except_clause() throws RecognitionException {
		try {
			// Python.g:280:15: ( 'except' ( test ( COMMA test )? )? COLON suite )
			// Python.g:280:17: 'except' ( test ( COMMA test )? )? COLON suite
			{
			match(input,79,FOLLOW_79_in_except_clause2244); if (state.failed) return;
			// Python.g:280:26: ( test ( COMMA test )? )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==BACKQUOTE||LA63_0==COMPLEX||LA63_0==FLOAT||(LA63_0 >= INT && LA63_0 <= LCURLY)||(LA63_0 >= LONGINT && LA63_0 <= MINUS)||LA63_0==NAME||LA63_0==NOT||LA63_0==PLUS||(LA63_0 >= STRING && LA63_0 <= TILDE)||LA63_0==89) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// Python.g:280:27: test ( COMMA test )?
					{
					pushFollow(FOLLOW_test_in_except_clause2247);
					test();
					state._fsp--;
					if (state.failed) return;
					// Python.g:280:32: ( COMMA test )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==COMMA) ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// Python.g:280:33: COMMA test
							{
							match(input,COMMA,FOLLOW_COMMA_in_except_clause2250); if (state.failed) return;
							pushFollow(FOLLOW_test_in_except_clause2252);
							test();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}

			match(input,COLON,FOLLOW_COLON_in_except_clause2258); if (state.failed) return;
			pushFollow(FOLLOW_suite_in_except_clause2260);
			suite();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "except_clause"



	// $ANTLR start "suite"
	// Python.g:283:1: suite : ( simple_stmt | NEWLINE INDENT ( stmt )+ DEDENT );
	public final void suite() throws RecognitionException {
		try {
			// Python.g:283:7: ( simple_stmt | NEWLINE INDENT ( stmt )+ DEDENT )
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==BACKQUOTE||LA65_0==COMPLEX||LA65_0==FLOAT||(LA65_0 >= INT && LA65_0 <= LCURLY)||(LA65_0 >= LONGINT && LA65_0 <= MINUS)||LA65_0==NAME||LA65_0==NOT||LA65_0==PLUS||(LA65_0 >= STRING && LA65_0 <= TILDE)||(LA65_0 >= 71 && LA65_0 <= 72)||LA65_0==74||LA65_0==76||LA65_0==80||(LA65_0 >= 83 && LA65_0 <= 84)||LA65_0==86||(LA65_0 >= 89 && LA65_0 <= 93)||LA65_0==97) ) {
				alt65=1;
			}
			else if ( (LA65_0==NEWLINE) ) {
				alt65=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// Python.g:283:9: simple_stmt
					{
					pushFollow(FOLLOW_simple_stmt_in_suite2283);
					simple_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:284:9: NEWLINE INDENT ( stmt )+ DEDENT
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_suite2293); if (state.failed) return;
					match(input,INDENT,FOLLOW_INDENT_in_suite2295); if (state.failed) return;
					// Python.g:284:24: ( stmt )+
					int cnt64=0;
					loop64:
					while (true) {
						int alt64=2;
						int LA64_0 = input.LA(1);
						if ( ((LA64_0 >= AT && LA64_0 <= BACKQUOTE)||LA64_0==COMPLEX||LA64_0==FLOAT||(LA64_0 >= INT && LA64_0 <= LCURLY)||(LA64_0 >= LONGINT && LA64_0 <= MINUS)||LA64_0==NAME||LA64_0==NOT||LA64_0==PLUS||(LA64_0 >= STRING && LA64_0 <= TILDE)||(LA64_0 >= 71 && LA64_0 <= 76)||LA64_0==80||(LA64_0 >= 82 && LA64_0 <= 86)||(LA64_0 >= 89 && LA64_0 <= 97)) ) {
							alt64=1;
						}

						switch (alt64) {
						case 1 :
							// Python.g:284:25: stmt
							{
							pushFollow(FOLLOW_stmt_in_suite2298);
							stmt();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt64 >= 1 ) break loop64;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(64, input);
							throw eee;
						}
						cnt64++;
					}

					match(input,DEDENT,FOLLOW_DEDENT_in_suite2302); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "suite"



	// $ANTLR start "test"
	// Python.g:287:1: test : ( or_test ( ( 'if' or_test 'else' )=> 'if' or_test 'else' test )? | lambdef );
	public final void test() throws RecognitionException {
		try {
			// Python.g:287:5: ( or_test ( ( 'if' or_test 'else' )=> 'if' or_test 'else' test )? | lambdef )
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==BACKQUOTE||LA67_0==COMPLEX||LA67_0==FLOAT||(LA67_0 >= INT && LA67_0 <= LCURLY)||(LA67_0 >= LONGINT && LA67_0 <= MINUS)||LA67_0==NAME||LA67_0==NOT||LA67_0==PLUS||(LA67_0 >= STRING && LA67_0 <= TILDE)) ) {
				alt67=1;
			}
			else if ( (LA67_0==89) ) {
				alt67=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// Python.g:287:7: or_test ( ( 'if' or_test 'else' )=> 'if' or_test 'else' test )?
					{
					pushFollow(FOLLOW_or_test_in_test2316);
					or_test();
					state._fsp--;
					if (state.failed) return;
					// Python.g:288:5: ( ( 'if' or_test 'else' )=> 'if' or_test 'else' test )?
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==85) ) {
						int LA66_1 = input.LA(2);
						if ( (synpred1_Python()) ) {
							alt66=1;
						}
					}
					switch (alt66) {
						case 1 :
							// Python.g:288:7: ( 'if' or_test 'else' )=> 'if' or_test 'else' test
							{
							match(input,85,FOLLOW_85_in_test2334); if (state.failed) return;
							pushFollow(FOLLOW_or_test_in_test2336);
							or_test();
							state._fsp--;
							if (state.failed) return;
							match(input,78,FOLLOW_78_in_test2338); if (state.failed) return;
							pushFollow(FOLLOW_test_in_test2340);
							test();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// Python.g:289:7: lambdef
					{
					pushFollow(FOLLOW_lambdef_in_test2350);
					lambdef();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "test"



	// $ANTLR start "or_test"
	// Python.g:292:1: or_test : and_test ( OR and_test )* ;
	public final void or_test() throws RecognitionException {
		try {
			// Python.g:292:9: ( and_test ( OR and_test )* )
			// Python.g:292:11: and_test ( OR and_test )*
			{
			pushFollow(FOLLOW_and_test_in_or_test2363);
			and_test();
			state._fsp--;
			if (state.failed) return;
			// Python.g:292:20: ( OR and_test )*
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==OR) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// Python.g:292:21: OR and_test
					{
					match(input,OR,FOLLOW_OR_in_or_test2366); if (state.failed) return;
					pushFollow(FOLLOW_and_test_in_or_test2368);
					and_test();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop68;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "or_test"



	// $ANTLR start "and_test"
	// Python.g:295:1: and_test : not_test ( AND not_test )* ;
	public final void and_test() throws RecognitionException {
		try {
			// Python.g:295:10: ( not_test ( AND not_test )* )
			// Python.g:295:12: not_test ( AND not_test )*
			{
			pushFollow(FOLLOW_not_test_in_and_test2387);
			not_test();
			state._fsp--;
			if (state.failed) return;
			// Python.g:295:21: ( AND not_test )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==AND) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// Python.g:295:22: AND not_test
					{
					match(input,AND,FOLLOW_AND_in_and_test2390); if (state.failed) return;
					pushFollow(FOLLOW_not_test_in_and_test2392);
					not_test();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop69;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "and_test"



	// $ANTLR start "not_test"
	// Python.g:298:1: not_test : ( NOT not_test | comparison );
	public final void not_test() throws RecognitionException {
		try {
			// Python.g:298:10: ( NOT not_test | comparison )
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==NOT) ) {
				alt70=1;
			}
			else if ( (LA70_0==BACKQUOTE||LA70_0==COMPLEX||LA70_0==FLOAT||(LA70_0 >= INT && LA70_0 <= LCURLY)||(LA70_0 >= LONGINT && LA70_0 <= MINUS)||LA70_0==NAME||LA70_0==PLUS||(LA70_0 >= STRING && LA70_0 <= TILDE)) ) {
				alt70=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}

			switch (alt70) {
				case 1 :
					// Python.g:298:12: NOT not_test
					{
					match(input,NOT,FOLLOW_NOT_in_not_test2412); if (state.failed) return;
					pushFollow(FOLLOW_not_test_in_not_test2414);
					not_test();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:299:12: comparison
					{
					pushFollow(FOLLOW_comparison_in_not_test2427);
					comparison();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "not_test"



	// $ANTLR start "comparison"
	// Python.g:302:1: comparison : expr ( comp_op expr )* ;
	public final void comparison() throws RecognitionException {
		try {
			// Python.g:302:11: ( expr ( comp_op expr )* )
			// Python.g:302:13: expr ( comp_op expr )*
			{
			pushFollow(FOLLOW_expr_in_comparison2444);
			expr();
			state._fsp--;
			if (state.failed) return;
			// Python.g:302:18: ( comp_op expr )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==ALT_NOTEQUAL||LA71_0==EQUAL||(LA71_0 >= GREATER && LA71_0 <= GREATEREQUAL)||(LA71_0 >= LESS && LA71_0 <= LESSEQUAL)||(LA71_0 >= NOT && LA71_0 <= NOTEQUAL)||(LA71_0 >= 87 && LA71_0 <= 88)) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// Python.g:302:19: comp_op expr
					{
					pushFollow(FOLLOW_comp_op_in_comparison2447);
					comp_op();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_comparison2449);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop71;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "comparison"



	// $ANTLR start "comp_op"
	// Python.g:305:1: comp_op : ( LESS | GREATER | EQUAL | GREATEREQUAL | LESSEQUAL | ALT_NOTEQUAL | NOTEQUAL | 'in' | NOT 'in' | 'is' | 'is' NOT );
	public final void comp_op() throws RecognitionException {
		try {
			// Python.g:305:9: ( LESS | GREATER | EQUAL | GREATEREQUAL | LESSEQUAL | ALT_NOTEQUAL | NOTEQUAL | 'in' | NOT 'in' | 'is' | 'is' NOT )
			int alt72=11;
			switch ( input.LA(1) ) {
			case LESS:
				{
				alt72=1;
				}
				break;
			case GREATER:
				{
				alt72=2;
				}
				break;
			case EQUAL:
				{
				alt72=3;
				}
				break;
			case GREATEREQUAL:
				{
				alt72=4;
				}
				break;
			case LESSEQUAL:
				{
				alt72=5;
				}
				break;
			case ALT_NOTEQUAL:
				{
				alt72=6;
				}
				break;
			case NOTEQUAL:
				{
				alt72=7;
				}
				break;
			case 87:
				{
				alt72=8;
				}
				break;
			case NOT:
				{
				alt72=9;
				}
				break;
			case 88:
				{
				int LA72_10 = input.LA(2);
				if ( (LA72_10==NOT) ) {
					alt72=11;
				}
				else if ( (LA72_10==BACKQUOTE||LA72_10==COMPLEX||LA72_10==FLOAT||(LA72_10 >= INT && LA72_10 <= LCURLY)||(LA72_10 >= LONGINT && LA72_10 <= MINUS)||LA72_10==NAME||LA72_10==PLUS||(LA72_10 >= STRING && LA72_10 <= TILDE)) ) {
					alt72=10;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}
			switch (alt72) {
				case 1 :
					// Python.g:305:11: LESS
					{
					match(input,LESS,FOLLOW_LESS_in_comp_op2470); if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:306:11: GREATER
					{
					match(input,GREATER,FOLLOW_GREATER_in_comp_op2482); if (state.failed) return;
					}
					break;
				case 3 :
					// Python.g:307:11: EQUAL
					{
					match(input,EQUAL,FOLLOW_EQUAL_in_comp_op2494); if (state.failed) return;
					}
					break;
				case 4 :
					// Python.g:308:11: GREATEREQUAL
					{
					match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_comp_op2506); if (state.failed) return;
					}
					break;
				case 5 :
					// Python.g:309:11: LESSEQUAL
					{
					match(input,LESSEQUAL,FOLLOW_LESSEQUAL_in_comp_op2518); if (state.failed) return;
					}
					break;
				case 6 :
					// Python.g:310:11: ALT_NOTEQUAL
					{
					match(input,ALT_NOTEQUAL,FOLLOW_ALT_NOTEQUAL_in_comp_op2530); if (state.failed) return;
					}
					break;
				case 7 :
					// Python.g:311:11: NOTEQUAL
					{
					match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_comp_op2542); if (state.failed) return;
					}
					break;
				case 8 :
					// Python.g:312:11: 'in'
					{
					match(input,87,FOLLOW_87_in_comp_op2554); if (state.failed) return;
					}
					break;
				case 9 :
					// Python.g:313:11: NOT 'in'
					{
					match(input,NOT,FOLLOW_NOT_in_comp_op2566); if (state.failed) return;
					match(input,87,FOLLOW_87_in_comp_op2568); if (state.failed) return;
					}
					break;
				case 10 :
					// Python.g:314:11: 'is'
					{
					match(input,88,FOLLOW_88_in_comp_op2580); if (state.failed) return;
					}
					break;
				case 11 :
					// Python.g:315:11: 'is' NOT
					{
					match(input,88,FOLLOW_88_in_comp_op2592); if (state.failed) return;
					match(input,NOT,FOLLOW_NOT_in_comp_op2594); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "comp_op"



	// $ANTLR start "expr"
	// Python.g:318:1: expr : xor_expr ( VBAR xor_expr )* ;
	public final void expr() throws RecognitionException {
		try {
			// Python.g:318:6: ( xor_expr ( VBAR xor_expr )* )
			// Python.g:318:8: xor_expr ( VBAR xor_expr )*
			{
			pushFollow(FOLLOW_xor_expr_in_expr2611);
			xor_expr();
			state._fsp--;
			if (state.failed) return;
			// Python.g:318:17: ( VBAR xor_expr )*
			loop73:
			while (true) {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==VBAR) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// Python.g:318:18: VBAR xor_expr
					{
					match(input,VBAR,FOLLOW_VBAR_in_expr2614); if (state.failed) return;
					pushFollow(FOLLOW_xor_expr_in_expr2616);
					xor_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop73;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "xor_expr"
	// Python.g:321:1: xor_expr : and_expr ( CIRCUMFLEX and_expr )* ;
	public final void xor_expr() throws RecognitionException {
		try {
			// Python.g:321:10: ( and_expr ( CIRCUMFLEX and_expr )* )
			// Python.g:321:12: and_expr ( CIRCUMFLEX and_expr )*
			{
			pushFollow(FOLLOW_and_expr_in_xor_expr2632);
			and_expr();
			state._fsp--;
			if (state.failed) return;
			// Python.g:321:21: ( CIRCUMFLEX and_expr )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==CIRCUMFLEX) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// Python.g:321:22: CIRCUMFLEX and_expr
					{
					match(input,CIRCUMFLEX,FOLLOW_CIRCUMFLEX_in_xor_expr2635); if (state.failed) return;
					pushFollow(FOLLOW_and_expr_in_xor_expr2637);
					and_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop74;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "xor_expr"



	// $ANTLR start "and_expr"
	// Python.g:324:1: and_expr : shift_expr ( AMPER shift_expr )* ;
	public final void and_expr() throws RecognitionException {
		try {
			// Python.g:324:10: ( shift_expr ( AMPER shift_expr )* )
			// Python.g:324:12: shift_expr ( AMPER shift_expr )*
			{
			pushFollow(FOLLOW_shift_expr_in_and_expr2657);
			shift_expr();
			state._fsp--;
			if (state.failed) return;
			// Python.g:324:23: ( AMPER shift_expr )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==AMPER) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// Python.g:324:24: AMPER shift_expr
					{
					match(input,AMPER,FOLLOW_AMPER_in_and_expr2660); if (state.failed) return;
					pushFollow(FOLLOW_shift_expr_in_and_expr2662);
					shift_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop75;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "and_expr"



	// $ANTLR start "shift_expr"
	// Python.g:327:1: shift_expr : arith_expr ( ( LEFTSHIFT | RIGHTSHIFT ) arith_expr )* ;
	public final void shift_expr() throws RecognitionException {
		try {
			// Python.g:327:12: ( arith_expr ( ( LEFTSHIFT | RIGHTSHIFT ) arith_expr )* )
			// Python.g:327:14: arith_expr ( ( LEFTSHIFT | RIGHTSHIFT ) arith_expr )*
			{
			pushFollow(FOLLOW_arith_expr_in_shift_expr2682);
			arith_expr();
			state._fsp--;
			if (state.failed) return;
			// Python.g:327:25: ( ( LEFTSHIFT | RIGHTSHIFT ) arith_expr )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==LEFTSHIFT||LA76_0==RIGHTSHIFT) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// Python.g:327:26: ( LEFTSHIFT | RIGHTSHIFT ) arith_expr
					{
					if ( input.LA(1)==LEFTSHIFT||input.LA(1)==RIGHTSHIFT ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_arith_expr_in_shift_expr2691);
					arith_expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop76;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "shift_expr"



	// $ANTLR start "arith_expr"
	// Python.g:330:1: arith_expr : term ( ( PLUS | MINUS ) term )* ;
	public final void arith_expr() throws RecognitionException {
		try {
			// Python.g:330:11: ( term ( ( PLUS | MINUS ) term )* )
			// Python.g:330:13: term ( ( PLUS | MINUS ) term )*
			{
			pushFollow(FOLLOW_term_in_arith_expr2712);
			term();
			state._fsp--;
			if (state.failed) return;
			// Python.g:330:18: ( ( PLUS | MINUS ) term )*
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==MINUS||LA77_0==PLUS) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// Python.g:330:19: ( PLUS | MINUS ) term
					{
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_term_in_arith_expr2721);
					term();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop77;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arith_expr"



	// $ANTLR start "term"
	// Python.g:333:1: term : factor ( ( STAR | SLASH | PERCENT | DOUBLESLASH ) factor )* ;
	public final void term() throws RecognitionException {
		try {
			// Python.g:333:6: ( factor ( ( STAR | SLASH | PERCENT | DOUBLESLASH ) factor )* )
			// Python.g:333:8: factor ( ( STAR | SLASH | PERCENT | DOUBLESLASH ) factor )*
			{
			pushFollow(FOLLOW_factor_in_term2742);
			factor();
			state._fsp--;
			if (state.failed) return;
			// Python.g:333:15: ( ( STAR | SLASH | PERCENT | DOUBLESLASH ) factor )*
			loop78:
			while (true) {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==DOUBLESLASH||LA78_0==PERCENT||LA78_0==SLASH||LA78_0==STAR) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// Python.g:333:16: ( STAR | SLASH | PERCENT | DOUBLESLASH ) factor
					{
					if ( input.LA(1)==DOUBLESLASH||input.LA(1)==PERCENT||input.LA(1)==SLASH||input.LA(1)==STAR ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factor_in_term2762);
					factor();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop78;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// Python.g:336:1: factor : ( PLUS factor | MINUS factor | TILDE factor | power );
	public final void factor() throws RecognitionException {
		try {
			// Python.g:336:8: ( PLUS factor | MINUS factor | TILDE factor | power )
			int alt79=4;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt79=1;
				}
				break;
			case MINUS:
				{
				alt79=2;
				}
				break;
			case TILDE:
				{
				alt79=3;
				}
				break;
			case BACKQUOTE:
			case COMPLEX:
			case FLOAT:
			case INT:
			case LBRACK:
			case LCURLY:
			case LONGINT:
			case LPAREN:
			case NAME:
			case STRING:
				{
				alt79=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}
			switch (alt79) {
				case 1 :
					// Python.g:336:10: PLUS factor
					{
					match(input,PLUS,FOLLOW_PLUS_in_factor2778); if (state.failed) return;
					pushFollow(FOLLOW_factor_in_factor2780);
					factor();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:337:10: MINUS factor
					{
					match(input,MINUS,FOLLOW_MINUS_in_factor2791); if (state.failed) return;
					pushFollow(FOLLOW_factor_in_factor2793);
					factor();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Python.g:338:10: TILDE factor
					{
					match(input,TILDE,FOLLOW_TILDE_in_factor2804); if (state.failed) return;
					pushFollow(FOLLOW_factor_in_factor2806);
					factor();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Python.g:339:10: power
					{
					pushFollow(FOLLOW_power_in_factor2817);
					power();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "factor"



	// $ANTLR start "power"
	// Python.g:342:1: power : atom ( trailer )* ( options {greedy=true; } : DOUBLESTAR factor )? ;
	public final void power() throws RecognitionException {
		try {
			// Python.g:342:7: ( atom ( trailer )* ( options {greedy=true; } : DOUBLESTAR factor )? )
			// Python.g:342:9: atom ( trailer )* ( options {greedy=true; } : DOUBLESTAR factor )?
			{
			pushFollow(FOLLOW_atom_in_power2833);
			atom();
			state._fsp--;
			if (state.failed) return;
			// Python.g:342:14: ( trailer )*
			loop80:
			while (true) {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==DOT||LA80_0==LBRACK||LA80_0==LPAREN) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// Python.g:342:15: trailer
					{
					pushFollow(FOLLOW_trailer_in_power2836);
					trailer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop80;
				}
			}

			// Python.g:342:25: ( options {greedy=true; } : DOUBLESTAR factor )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==DOUBLESTAR) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// Python.g:342:49: DOUBLESTAR factor
					{
					match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_power2848); if (state.failed) return;
					pushFollow(FOLLOW_factor_in_power2850);
					factor();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "power"



	// $ANTLR start "atom"
	// Python.g:345:1: atom : ( LPAREN ( yield_expr | testlist_gexp )? RPAREN | LBRACK ( listmaker )? RBRACK | LCURLY ( dictmaker )? RCURLY | BACKQUOTE testlist BACKQUOTE | NAME | INT | LONGINT | FLOAT | COMPLEX | ( STRING )+ );
	public final void atom() throws RecognitionException {
		try {
			// Python.g:345:6: ( LPAREN ( yield_expr | testlist_gexp )? RPAREN | LBRACK ( listmaker )? RBRACK | LCURLY ( dictmaker )? RCURLY | BACKQUOTE testlist BACKQUOTE | NAME | INT | LONGINT | FLOAT | COMPLEX | ( STRING )+ )
			int alt86=10;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				alt86=1;
				}
				break;
			case LBRACK:
				{
				alt86=2;
				}
				break;
			case LCURLY:
				{
				alt86=3;
				}
				break;
			case BACKQUOTE:
				{
				alt86=4;
				}
				break;
			case NAME:
				{
				alt86=5;
				}
				break;
			case INT:
				{
				alt86=6;
				}
				break;
			case LONGINT:
				{
				alt86=7;
				}
				break;
			case FLOAT:
				{
				alt86=8;
				}
				break;
			case COMPLEX:
				{
				alt86=9;
				}
				break;
			case STRING:
				{
				alt86=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}
			switch (alt86) {
				case 1 :
					// Python.g:345:8: LPAREN ( yield_expr | testlist_gexp )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom2867); if (state.failed) return;
					// Python.g:346:8: ( yield_expr | testlist_gexp )?
					int alt82=3;
					int LA82_0 = input.LA(1);
					if ( (LA82_0==97) ) {
						alt82=1;
					}
					else if ( (LA82_0==BACKQUOTE||LA82_0==COMPLEX||LA82_0==FLOAT||(LA82_0 >= INT && LA82_0 <= LCURLY)||(LA82_0 >= LONGINT && LA82_0 <= MINUS)||LA82_0==NAME||LA82_0==NOT||LA82_0==PLUS||(LA82_0 >= STRING && LA82_0 <= TILDE)||LA82_0==89) ) {
						alt82=2;
					}
					switch (alt82) {
						case 1 :
							// Python.g:346:10: yield_expr
							{
							pushFollow(FOLLOW_yield_expr_in_atom2879);
							yield_expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// Python.g:347:10: testlist_gexp
							{
							pushFollow(FOLLOW_testlist_gexp_in_atom2890);
							testlist_gexp();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_atom2909); if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:350:8: LBRACK ( listmaker )? RBRACK
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_atom2918); if (state.failed) return;
					// Python.g:350:15: ( listmaker )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==BACKQUOTE||LA83_0==COMPLEX||LA83_0==FLOAT||(LA83_0 >= INT && LA83_0 <= LCURLY)||(LA83_0 >= LONGINT && LA83_0 <= MINUS)||LA83_0==NAME||LA83_0==NOT||LA83_0==PLUS||(LA83_0 >= STRING && LA83_0 <= TILDE)||LA83_0==89) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// Python.g:350:16: listmaker
							{
							pushFollow(FOLLOW_listmaker_in_atom2921);
							listmaker();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,RBRACK,FOLLOW_RBRACK_in_atom2925); if (state.failed) return;
					}
					break;
				case 3 :
					// Python.g:351:8: LCURLY ( dictmaker )? RCURLY
					{
					match(input,LCURLY,FOLLOW_LCURLY_in_atom2934); if (state.failed) return;
					// Python.g:351:15: ( dictmaker )?
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==BACKQUOTE||LA84_0==COMPLEX||LA84_0==FLOAT||(LA84_0 >= INT && LA84_0 <= LCURLY)||(LA84_0 >= LONGINT && LA84_0 <= MINUS)||LA84_0==NAME||LA84_0==NOT||LA84_0==PLUS||(LA84_0 >= STRING && LA84_0 <= TILDE)||LA84_0==89) ) {
						alt84=1;
					}
					switch (alt84) {
						case 1 :
							// Python.g:351:16: dictmaker
							{
							pushFollow(FOLLOW_dictmaker_in_atom2937);
							dictmaker();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,RCURLY,FOLLOW_RCURLY_in_atom2941); if (state.failed) return;
					}
					break;
				case 4 :
					// Python.g:352:8: BACKQUOTE testlist BACKQUOTE
					{
					match(input,BACKQUOTE,FOLLOW_BACKQUOTE_in_atom2950); if (state.failed) return;
					pushFollow(FOLLOW_testlist_in_atom2952);
					testlist();
					state._fsp--;
					if (state.failed) return;
					match(input,BACKQUOTE,FOLLOW_BACKQUOTE_in_atom2954); if (state.failed) return;
					}
					break;
				case 5 :
					// Python.g:353:8: NAME
					{
					match(input,NAME,FOLLOW_NAME_in_atom2963); if (state.failed) return;
					}
					break;
				case 6 :
					// Python.g:354:8: INT
					{
					match(input,INT,FOLLOW_INT_in_atom2972); if (state.failed) return;
					}
					break;
				case 7 :
					// Python.g:355:8: LONGINT
					{
					match(input,LONGINT,FOLLOW_LONGINT_in_atom2981); if (state.failed) return;
					}
					break;
				case 8 :
					// Python.g:356:8: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_atom2990); if (state.failed) return;
					}
					break;
				case 9 :
					// Python.g:357:8: COMPLEX
					{
					match(input,COMPLEX,FOLLOW_COMPLEX_in_atom2999); if (state.failed) return;
					}
					break;
				case 10 :
					// Python.g:358:8: ( STRING )+
					{
					// Python.g:358:8: ( STRING )+
					int cnt85=0;
					loop85:
					while (true) {
						int alt85=2;
						int LA85_0 = input.LA(1);
						if ( (LA85_0==STRING) ) {
							alt85=1;
						}

						switch (alt85) {
						case 1 :
							// Python.g:358:9: STRING
							{
							match(input,STRING,FOLLOW_STRING_in_atom3009); if (state.failed) return;
							}
							break;

						default :
							if ( cnt85 >= 1 ) break loop85;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(85, input);
							throw eee;
						}
						cnt85++;
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atom"



	// $ANTLR start "listmaker"
	// Python.g:361:1: listmaker : test ( list_for | ( options {greedy=true; } : COMMA test )* ) ( COMMA )? ;
	public final void listmaker() throws RecognitionException {
		try {
			// Python.g:361:11: ( test ( list_for | ( options {greedy=true; } : COMMA test )* ) ( COMMA )? )
			// Python.g:361:13: test ( list_for | ( options {greedy=true; } : COMMA test )* ) ( COMMA )?
			{
			pushFollow(FOLLOW_test_in_listmaker3025);
			test();
			state._fsp--;
			if (state.failed) return;
			// Python.g:362:13: ( list_for | ( options {greedy=true; } : COMMA test )* )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==82) ) {
				alt88=1;
			}
			else if ( (LA88_0==COMMA||LA88_0==RBRACK) ) {
				alt88=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}

			switch (alt88) {
				case 1 :
					// Python.g:362:15: list_for
					{
					pushFollow(FOLLOW_list_for_in_listmaker3042);
					list_for();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:363:15: ( options {greedy=true; } : COMMA test )*
					{
					// Python.g:363:15: ( options {greedy=true; } : COMMA test )*
					loop87:
					while (true) {
						int alt87=2;
						int LA87_0 = input.LA(1);
						if ( (LA87_0==COMMA) ) {
							int LA87_1 = input.LA(2);
							if ( (LA87_1==BACKQUOTE||LA87_1==COMPLEX||LA87_1==FLOAT||(LA87_1 >= INT && LA87_1 <= LCURLY)||(LA87_1 >= LONGINT && LA87_1 <= MINUS)||LA87_1==NAME||LA87_1==NOT||LA87_1==PLUS||(LA87_1 >= STRING && LA87_1 <= TILDE)||LA87_1==89) ) {
								alt87=1;
							}

						}

						switch (alt87) {
						case 1 :
							// Python.g:363:39: COMMA test
							{
							match(input,COMMA,FOLLOW_COMMA_in_listmaker3066); if (state.failed) return;
							pushFollow(FOLLOW_test_in_listmaker3068);
							test();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop87;
						}
					}

					}
					break;

			}

			// Python.g:364:15: ( COMMA )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==COMMA) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// Python.g:364:16: COMMA
					{
					match(input,COMMA,FOLLOW_COMMA_in_listmaker3087); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "listmaker"



	// $ANTLR start "testlist_gexp"
	// Python.g:367:1: testlist_gexp : test ( ( options {k=2; } : COMMA test )* ( COMMA )? | gen_for ) ;
	public final void testlist_gexp() throws RecognitionException {
		try {
			// Python.g:368:5: ( test ( ( options {k=2; } : COMMA test )* ( COMMA )? | gen_for ) )
			// Python.g:368:7: test ( ( options {k=2; } : COMMA test )* ( COMMA )? | gen_for )
			{
			pushFollow(FOLLOW_test_in_testlist_gexp3112);
			test();
			state._fsp--;
			if (state.failed) return;
			// Python.g:368:12: ( ( options {k=2; } : COMMA test )* ( COMMA )? | gen_for )
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==COMMA||LA92_0==RPAREN) ) {
				alt92=1;
			}
			else if ( (LA92_0==82) ) {
				alt92=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}

			switch (alt92) {
				case 1 :
					// Python.g:368:14: ( options {k=2; } : COMMA test )* ( COMMA )?
					{
					// Python.g:368:14: ( options {k=2; } : COMMA test )*
					loop90:
					while (true) {
						int alt90=2;
						int LA90_0 = input.LA(1);
						if ( (LA90_0==COMMA) ) {
							int LA90_1 = input.LA(2);
							if ( (LA90_1==BACKQUOTE||LA90_1==COMPLEX||LA90_1==FLOAT||(LA90_1 >= INT && LA90_1 <= LCURLY)||(LA90_1 >= LONGINT && LA90_1 <= MINUS)||LA90_1==NAME||LA90_1==NOT||LA90_1==PLUS||(LA90_1 >= STRING && LA90_1 <= TILDE)||LA90_1==89) ) {
								alt90=1;
							}

						}

						switch (alt90) {
						case 1 :
							// Python.g:368:31: COMMA test
							{
							match(input,COMMA,FOLLOW_COMMA_in_testlist_gexp3125); if (state.failed) return;
							pushFollow(FOLLOW_test_in_testlist_gexp3127);
							test();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop90;
						}
					}

					// Python.g:368:44: ( COMMA )?
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( (LA91_0==COMMA) ) {
						alt91=1;
					}
					switch (alt91) {
						case 1 :
							// Python.g:368:45: COMMA
							{
							match(input,COMMA,FOLLOW_COMMA_in_testlist_gexp3132); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// Python.g:369:14: gen_for
					{
					pushFollow(FOLLOW_gen_for_in_testlist_gexp3149);
					gen_for();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "testlist_gexp"



	// $ANTLR start "lambdef"
	// Python.g:374:1: lambdef : 'lambda' ( varargslist )? COLON test ;
	public final void lambdef() throws RecognitionException {
		try {
			// Python.g:374:8: ( 'lambda' ( varargslist )? COLON test )
			// Python.g:374:10: 'lambda' ( varargslist )? COLON test
			{
			match(input,89,FOLLOW_89_in_lambdef3186); if (state.failed) return;
			// Python.g:374:19: ( varargslist )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==DOUBLESTAR||LA93_0==LPAREN||LA93_0==NAME||LA93_0==STAR) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// Python.g:374:20: varargslist
					{
					pushFollow(FOLLOW_varargslist_in_lambdef3189);
					varargslist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,COLON,FOLLOW_COLON_in_lambdef3193); if (state.failed) return;
			pushFollow(FOLLOW_test_in_lambdef3195);
			test();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lambdef"



	// $ANTLR start "trailer"
	// Python.g:377:1: trailer : ( LPAREN ( arglist )? RPAREN | LBRACK subscriptlist RBRACK | DOT NAME );
	public final void trailer() throws RecognitionException {
		try {
			// Python.g:377:9: ( LPAREN ( arglist )? RPAREN | LBRACK subscriptlist RBRACK | DOT NAME )
			int alt95=3;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				alt95=1;
				}
				break;
			case LBRACK:
				{
				alt95=2;
				}
				break;
			case DOT:
				{
				alt95=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}
			switch (alt95) {
				case 1 :
					// Python.g:377:11: LPAREN ( arglist )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_trailer3211); if (state.failed) return;
					// Python.g:377:18: ( arglist )?
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==BACKQUOTE||LA94_0==COMPLEX||LA94_0==DOUBLESTAR||LA94_0==FLOAT||(LA94_0 >= INT && LA94_0 <= LCURLY)||(LA94_0 >= LONGINT && LA94_0 <= MINUS)||LA94_0==NAME||LA94_0==NOT||LA94_0==PLUS||LA94_0==STAR||(LA94_0 >= STRING && LA94_0 <= TILDE)||LA94_0==89) ) {
						alt94=1;
					}
					switch (alt94) {
						case 1 :
							// Python.g:377:19: arglist
							{
							pushFollow(FOLLOW_arglist_in_trailer3214);
							arglist();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_trailer3218); if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:378:11: LBRACK subscriptlist RBRACK
					{
					match(input,LBRACK,FOLLOW_LBRACK_in_trailer3230); if (state.failed) return;
					pushFollow(FOLLOW_subscriptlist_in_trailer3232);
					subscriptlist();
					state._fsp--;
					if (state.failed) return;
					match(input,RBRACK,FOLLOW_RBRACK_in_trailer3234); if (state.failed) return;
					}
					break;
				case 3 :
					// Python.g:379:11: DOT NAME
					{
					match(input,DOT,FOLLOW_DOT_in_trailer3246); if (state.failed) return;
					match(input,NAME,FOLLOW_NAME_in_trailer3248); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "trailer"



	// $ANTLR start "subscriptlist"
	// Python.g:382:1: subscriptlist : subscript ( options {greedy=true; } : COMMA subscript )* ( COMMA )? ;
	public final void subscriptlist() throws RecognitionException {
		try {
			// Python.g:382:15: ( subscript ( options {greedy=true; } : COMMA subscript )* ( COMMA )? )
			// Python.g:382:17: subscript ( options {greedy=true; } : COMMA subscript )* ( COMMA )?
			{
			pushFollow(FOLLOW_subscript_in_subscriptlist3265);
			subscript();
			state._fsp--;
			if (state.failed) return;
			// Python.g:382:27: ( options {greedy=true; } : COMMA subscript )*
			loop96:
			while (true) {
				int alt96=2;
				int LA96_0 = input.LA(1);
				if ( (LA96_0==COMMA) ) {
					int LA96_1 = input.LA(2);
					if ( (LA96_1==BACKQUOTE||LA96_1==COLON||LA96_1==COMPLEX||LA96_1==DOT||LA96_1==FLOAT||(LA96_1 >= INT && LA96_1 <= LCURLY)||(LA96_1 >= LONGINT && LA96_1 <= MINUS)||LA96_1==NAME||LA96_1==NOT||LA96_1==PLUS||(LA96_1 >= STRING && LA96_1 <= TILDE)||LA96_1==89) ) {
						alt96=1;
					}

				}

				switch (alt96) {
				case 1 :
					// Python.g:382:51: COMMA subscript
					{
					match(input,COMMA,FOLLOW_COMMA_in_subscriptlist3275); if (state.failed) return;
					pushFollow(FOLLOW_subscript_in_subscriptlist3277);
					subscript();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop96;
				}
			}

			// Python.g:382:69: ( COMMA )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==COMMA) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// Python.g:382:70: COMMA
					{
					match(input,COMMA,FOLLOW_COMMA_in_subscriptlist3282); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subscriptlist"



	// $ANTLR start "subscript"
	// Python.g:385:1: subscript : ( DOT DOT DOT | test ( COLON ( test )? ( sliceop )? )? | COLON ( test )? ( sliceop )? );
	public final void subscript() throws RecognitionException {
		try {
			// Python.g:385:11: ( DOT DOT DOT | test ( COLON ( test )? ( sliceop )? )? | COLON ( test )? ( sliceop )? )
			int alt103=3;
			switch ( input.LA(1) ) {
			case DOT:
				{
				alt103=1;
				}
				break;
			case BACKQUOTE:
			case COMPLEX:
			case FLOAT:
			case INT:
			case LBRACK:
			case LCURLY:
			case LONGINT:
			case LPAREN:
			case MINUS:
			case NAME:
			case NOT:
			case PLUS:
			case STRING:
			case TILDE:
			case 89:
				{
				alt103=2;
				}
				break;
			case COLON:
				{
				alt103=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}
			switch (alt103) {
				case 1 :
					// Python.g:385:13: DOT DOT DOT
					{
					match(input,DOT,FOLLOW_DOT_in_subscript3307); if (state.failed) return;
					match(input,DOT,FOLLOW_DOT_in_subscript3309); if (state.failed) return;
					match(input,DOT,FOLLOW_DOT_in_subscript3311); if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:386:13: test ( COLON ( test )? ( sliceop )? )?
					{
					pushFollow(FOLLOW_test_in_subscript3325);
					test();
					state._fsp--;
					if (state.failed) return;
					// Python.g:386:18: ( COLON ( test )? ( sliceop )? )?
					int alt100=2;
					int LA100_0 = input.LA(1);
					if ( (LA100_0==COLON) ) {
						alt100=1;
					}
					switch (alt100) {
						case 1 :
							// Python.g:386:19: COLON ( test )? ( sliceop )?
							{
							match(input,COLON,FOLLOW_COLON_in_subscript3328); if (state.failed) return;
							// Python.g:386:25: ( test )?
							int alt98=2;
							int LA98_0 = input.LA(1);
							if ( (LA98_0==BACKQUOTE||LA98_0==COMPLEX||LA98_0==FLOAT||(LA98_0 >= INT && LA98_0 <= LCURLY)||(LA98_0 >= LONGINT && LA98_0 <= MINUS)||LA98_0==NAME||LA98_0==NOT||LA98_0==PLUS||(LA98_0 >= STRING && LA98_0 <= TILDE)||LA98_0==89) ) {
								alt98=1;
							}
							switch (alt98) {
								case 1 :
									// Python.g:386:26: test
									{
									pushFollow(FOLLOW_test_in_subscript3331);
									test();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							// Python.g:386:33: ( sliceop )?
							int alt99=2;
							int LA99_0 = input.LA(1);
							if ( (LA99_0==COLON) ) {
								alt99=1;
							}
							switch (alt99) {
								case 1 :
									// Python.g:386:34: sliceop
									{
									pushFollow(FOLLOW_sliceop_in_subscript3336);
									sliceop();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 3 :
					// Python.g:387:13: COLON ( test )? ( sliceop )?
					{
					match(input,COLON,FOLLOW_COLON_in_subscript3354); if (state.failed) return;
					// Python.g:387:19: ( test )?
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==BACKQUOTE||LA101_0==COMPLEX||LA101_0==FLOAT||(LA101_0 >= INT && LA101_0 <= LCURLY)||(LA101_0 >= LONGINT && LA101_0 <= MINUS)||LA101_0==NAME||LA101_0==NOT||LA101_0==PLUS||(LA101_0 >= STRING && LA101_0 <= TILDE)||LA101_0==89) ) {
						alt101=1;
					}
					switch (alt101) {
						case 1 :
							// Python.g:387:20: test
							{
							pushFollow(FOLLOW_test_in_subscript3357);
							test();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// Python.g:387:27: ( sliceop )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==COLON) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// Python.g:387:28: sliceop
							{
							pushFollow(FOLLOW_sliceop_in_subscript3362);
							sliceop();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subscript"



	// $ANTLR start "sliceop"
	// Python.g:390:1: sliceop : COLON ( test )? ;
	public final void sliceop() throws RecognitionException {
		try {
			// Python.g:390:9: ( COLON ( test )? )
			// Python.g:390:11: COLON ( test )?
			{
			match(input,COLON,FOLLOW_COLON_in_sliceop3383); if (state.failed) return;
			// Python.g:390:17: ( test )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==BACKQUOTE||LA104_0==COMPLEX||LA104_0==FLOAT||(LA104_0 >= INT && LA104_0 <= LCURLY)||(LA104_0 >= LONGINT && LA104_0 <= MINUS)||LA104_0==NAME||LA104_0==NOT||LA104_0==PLUS||(LA104_0 >= STRING && LA104_0 <= TILDE)||LA104_0==89) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// Python.g:390:18: test
					{
					pushFollow(FOLLOW_test_in_sliceop3386);
					test();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sliceop"



	// $ANTLR start "exprlist"
	// Python.g:393:1: exprlist : expr ( options {k=2; } : COMMA expr )* ( COMMA )? ;
	public final void exprlist() throws RecognitionException {
		try {
			// Python.g:393:10: ( expr ( options {k=2; } : COMMA expr )* ( COMMA )? )
			// Python.g:393:12: expr ( options {k=2; } : COMMA expr )* ( COMMA )?
			{
			pushFollow(FOLLOW_expr_in_exprlist3405);
			expr();
			state._fsp--;
			if (state.failed) return;
			// Python.g:393:17: ( options {k=2; } : COMMA expr )*
			loop105:
			while (true) {
				int alt105=2;
				int LA105_0 = input.LA(1);
				if ( (LA105_0==COMMA) ) {
					int LA105_1 = input.LA(2);
					if ( (LA105_1==BACKQUOTE||LA105_1==COMPLEX||LA105_1==FLOAT||(LA105_1 >= INT && LA105_1 <= LCURLY)||(LA105_1 >= LONGINT && LA105_1 <= MINUS)||LA105_1==NAME||LA105_1==PLUS||(LA105_1 >= STRING && LA105_1 <= TILDE)) ) {
						alt105=1;
					}

				}

				switch (alt105) {
				case 1 :
					// Python.g:393:34: COMMA expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprlist3416); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_exprlist3418);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop105;
				}
			}

			// Python.g:393:47: ( COMMA )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==COMMA) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// Python.g:393:48: COMMA
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprlist3423); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exprlist"



	// $ANTLR start "testlist"
	// Python.g:396:1: testlist : test ( options {k=2; } : COMMA test )* ( COMMA )? ;
	public final void testlist() throws RecognitionException {
		try {
			// Python.g:397:5: ( test ( options {k=2; } : COMMA test )* ( COMMA )? )
			// Python.g:397:7: test ( options {k=2; } : COMMA test )* ( COMMA )?
			{
			pushFollow(FOLLOW_test_in_testlist3447);
			test();
			state._fsp--;
			if (state.failed) return;
			// Python.g:397:12: ( options {k=2; } : COMMA test )*
			loop107:
			while (true) {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==COMMA) ) {
					int LA107_1 = input.LA(2);
					if ( (LA107_1==BACKQUOTE) ) {
						alt107=1;
					}
					else if ( (LA107_1==COMPLEX||LA107_1==FLOAT||(LA107_1 >= INT && LA107_1 <= LCURLY)||(LA107_1 >= LONGINT && LA107_1 <= MINUS)||LA107_1==NAME||LA107_1==NOT||LA107_1==PLUS||(LA107_1 >= STRING && LA107_1 <= TILDE)||LA107_1==89) ) {
						alt107=1;
					}

				}

				switch (alt107) {
				case 1 :
					// Python.g:397:29: COMMA test
					{
					match(input,COMMA,FOLLOW_COMMA_in_testlist3458); if (state.failed) return;
					pushFollow(FOLLOW_test_in_testlist3460);
					test();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop107;
				}
			}

			// Python.g:397:42: ( COMMA )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==COMMA) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// Python.g:397:43: COMMA
					{
					match(input,COMMA,FOLLOW_COMMA_in_testlist3465); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "testlist"



	// $ANTLR start "dictmaker"
	// Python.g:400:1: dictmaker : test COLON test ( options {k=2; } : COMMA test COLON test )* ( COMMA )? ;
	public final void dictmaker() throws RecognitionException {
		try {
			// Python.g:400:11: ( test COLON test ( options {k=2; } : COMMA test COLON test )* ( COMMA )? )
			// Python.g:400:13: test COLON test ( options {k=2; } : COMMA test COLON test )* ( COMMA )?
			{
			pushFollow(FOLLOW_test_in_dictmaker3480);
			test();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_dictmaker3482); if (state.failed) return;
			pushFollow(FOLLOW_test_in_dictmaker3484);
			test();
			state._fsp--;
			if (state.failed) return;
			// Python.g:400:29: ( options {k=2; } : COMMA test COLON test )*
			loop109:
			while (true) {
				int alt109=2;
				int LA109_0 = input.LA(1);
				if ( (LA109_0==COMMA) ) {
					int LA109_1 = input.LA(2);
					if ( (LA109_1==BACKQUOTE||LA109_1==COMPLEX||LA109_1==FLOAT||(LA109_1 >= INT && LA109_1 <= LCURLY)||(LA109_1 >= LONGINT && LA109_1 <= MINUS)||LA109_1==NAME||LA109_1==NOT||LA109_1==PLUS||(LA109_1 >= STRING && LA109_1 <= TILDE)||LA109_1==89) ) {
						alt109=1;
					}

				}

				switch (alt109) {
				case 1 :
					// Python.g:400:45: COMMA test COLON test
					{
					match(input,COMMA,FOLLOW_COMMA_in_dictmaker3494); if (state.failed) return;
					pushFollow(FOLLOW_test_in_dictmaker3496);
					test();
					state._fsp--;
					if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_dictmaker3498); if (state.failed) return;
					pushFollow(FOLLOW_test_in_dictmaker3500);
					test();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop109;
				}
			}

			// Python.g:400:69: ( COMMA )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==COMMA) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// Python.g:400:70: COMMA
					{
					match(input,COMMA,FOLLOW_COMMA_in_dictmaker3505); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "dictmaker"



	// $ANTLR start "classdef"
	// Python.g:403:1: classdef : 'class' NAME ( LPAREN ( testlist )? RPAREN )? COLON suite ;
	public final void classdef() throws RecognitionException {
		try {
			// Python.g:403:9: ( 'class' NAME ( LPAREN ( testlist )? RPAREN )? COLON suite )
			// Python.g:403:11: 'class' NAME ( LPAREN ( testlist )? RPAREN )? COLON suite
			{
			match(input,73,FOLLOW_73_in_classdef3525); if (state.failed) return;
			match(input,NAME,FOLLOW_NAME_in_classdef3527); if (state.failed) return;
			// Python.g:403:24: ( LPAREN ( testlist )? RPAREN )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==LPAREN) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// Python.g:403:25: LPAREN ( testlist )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_classdef3530); if (state.failed) return;
					// Python.g:403:32: ( testlist )?
					int alt111=2;
					int LA111_0 = input.LA(1);
					if ( (LA111_0==BACKQUOTE||LA111_0==COMPLEX||LA111_0==FLOAT||(LA111_0 >= INT && LA111_0 <= LCURLY)||(LA111_0 >= LONGINT && LA111_0 <= MINUS)||LA111_0==NAME||LA111_0==NOT||LA111_0==PLUS||(LA111_0 >= STRING && LA111_0 <= TILDE)||LA111_0==89) ) {
						alt111=1;
					}
					switch (alt111) {
						case 1 :
							// Python.g:403:32: testlist
							{
							pushFollow(FOLLOW_testlist_in_classdef3532);
							testlist();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_classdef3535); if (state.failed) return;
					}
					break;

			}

			match(input,COLON,FOLLOW_COLON_in_classdef3539); if (state.failed) return;
			pushFollow(FOLLOW_suite_in_classdef3541);
			suite();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classdef"



	// $ANTLR start "arglist"
	// Python.g:406:1: arglist : ( argument ( COMMA argument )* ( COMMA ( STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )? )? | STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test );
	public final void arglist() throws RecognitionException {
		try {
			// Python.g:406:9: ( argument ( COMMA argument )* ( COMMA ( STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )? )? | STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )
			int alt118=3;
			switch ( input.LA(1) ) {
			case BACKQUOTE:
			case COMPLEX:
			case FLOAT:
			case INT:
			case LBRACK:
			case LCURLY:
			case LONGINT:
			case LPAREN:
			case MINUS:
			case NAME:
			case NOT:
			case PLUS:
			case STRING:
			case TILDE:
			case 89:
				{
				alt118=1;
				}
				break;
			case STAR:
				{
				alt118=2;
				}
				break;
			case DOUBLESTAR:
				{
				alt118=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 118, 0, input);
				throw nvae;
			}
			switch (alt118) {
				case 1 :
					// Python.g:406:11: argument ( COMMA argument )* ( COMMA ( STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )? )?
					{
					pushFollow(FOLLOW_argument_in_arglist3558);
					argument();
					state._fsp--;
					if (state.failed) return;
					// Python.g:406:20: ( COMMA argument )*
					loop113:
					while (true) {
						int alt113=2;
						int LA113_0 = input.LA(1);
						if ( (LA113_0==COMMA) ) {
							int LA113_1 = input.LA(2);
							if ( (LA113_1==BACKQUOTE||LA113_1==COMPLEX||LA113_1==FLOAT||(LA113_1 >= INT && LA113_1 <= LCURLY)||(LA113_1 >= LONGINT && LA113_1 <= MINUS)||LA113_1==NAME||LA113_1==NOT||LA113_1==PLUS||(LA113_1 >= STRING && LA113_1 <= TILDE)||LA113_1==89) ) {
								alt113=1;
							}

						}

						switch (alt113) {
						case 1 :
							// Python.g:406:21: COMMA argument
							{
							match(input,COMMA,FOLLOW_COMMA_in_arglist3561); if (state.failed) return;
							pushFollow(FOLLOW_argument_in_arglist3563);
							argument();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop113;
						}
					}

					// Python.g:407:11: ( COMMA ( STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )? )?
					int alt116=2;
					int LA116_0 = input.LA(1);
					if ( (LA116_0==COMMA) ) {
						alt116=1;
					}
					switch (alt116) {
						case 1 :
							// Python.g:407:13: COMMA ( STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_arglist3579); if (state.failed) return;
							// Python.g:408:13: ( STAR test ( COMMA DOUBLESTAR test )? | DOUBLESTAR test )?
							int alt115=3;
							int LA115_0 = input.LA(1);
							if ( (LA115_0==STAR) ) {
								alt115=1;
							}
							else if ( (LA115_0==DOUBLESTAR) ) {
								alt115=2;
							}
							switch (alt115) {
								case 1 :
									// Python.g:408:15: STAR test ( COMMA DOUBLESTAR test )?
									{
									match(input,STAR,FOLLOW_STAR_in_arglist3595); if (state.failed) return;
									pushFollow(FOLLOW_test_in_arglist3597);
									test();
									state._fsp--;
									if (state.failed) return;
									// Python.g:408:25: ( COMMA DOUBLESTAR test )?
									int alt114=2;
									int LA114_0 = input.LA(1);
									if ( (LA114_0==COMMA) ) {
										alt114=1;
									}
									switch (alt114) {
										case 1 :
											// Python.g:408:26: COMMA DOUBLESTAR test
											{
											match(input,COMMA,FOLLOW_COMMA_in_arglist3600); if (state.failed) return;
											match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_arglist3602); if (state.failed) return;
											pushFollow(FOLLOW_test_in_arglist3604);
											test();
											state._fsp--;
											if (state.failed) return;
											}
											break;

									}

									}
									break;
								case 2 :
									// Python.g:409:15: DOUBLESTAR test
									{
									match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_arglist3622); if (state.failed) return;
									pushFollow(FOLLOW_test_in_arglist3624);
									test();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// Python.g:412:13: STAR test ( COMMA DOUBLESTAR test )?
					{
					match(input,STAR,FOLLOW_STAR_in_arglist3666); if (state.failed) return;
					pushFollow(FOLLOW_test_in_arglist3668);
					test();
					state._fsp--;
					if (state.failed) return;
					// Python.g:412:23: ( COMMA DOUBLESTAR test )?
					int alt117=2;
					int LA117_0 = input.LA(1);
					if ( (LA117_0==COMMA) ) {
						alt117=1;
					}
					switch (alt117) {
						case 1 :
							// Python.g:412:24: COMMA DOUBLESTAR test
							{
							match(input,COMMA,FOLLOW_COMMA_in_arglist3671); if (state.failed) return;
							match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_arglist3673); if (state.failed) return;
							pushFollow(FOLLOW_test_in_arglist3675);
							test();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 3 :
					// Python.g:413:13: DOUBLESTAR test
					{
					match(input,DOUBLESTAR,FOLLOW_DOUBLESTAR_in_arglist3691); if (state.failed) return;
					pushFollow(FOLLOW_test_in_arglist3693);
					test();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arglist"



	// $ANTLR start "argument"
	// Python.g:416:1: argument : test ( ( ASSIGN test ) | gen_for )? ;
	public final void argument() throws RecognitionException {
		try {
			// Python.g:416:10: ( test ( ( ASSIGN test ) | gen_for )? )
			// Python.g:416:12: test ( ( ASSIGN test ) | gen_for )?
			{
			pushFollow(FOLLOW_test_in_argument3710);
			test();
			state._fsp--;
			if (state.failed) return;
			// Python.g:416:17: ( ( ASSIGN test ) | gen_for )?
			int alt119=3;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==ASSIGN) ) {
				alt119=1;
			}
			else if ( (LA119_0==82) ) {
				alt119=2;
			}
			switch (alt119) {
				case 1 :
					// Python.g:416:19: ( ASSIGN test )
					{
					// Python.g:416:19: ( ASSIGN test )
					// Python.g:416:20: ASSIGN test
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_argument3715); if (state.failed) return;
					pushFollow(FOLLOW_test_in_argument3717);
					test();
					state._fsp--;
					if (state.failed) return;
					}

					}
					break;
				case 2 :
					// Python.g:416:35: gen_for
					{
					pushFollow(FOLLOW_gen_for_in_argument3722);
					gen_for();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "argument"



	// $ANTLR start "list_iter"
	// Python.g:419:1: list_iter : ( list_for | list_if );
	public final void list_iter() throws RecognitionException {
		try {
			// Python.g:419:11: ( list_for | list_if )
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==82) ) {
				alt120=1;
			}
			else if ( (LA120_0==85) ) {
				alt120=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 120, 0, input);
				throw nvae;
			}

			switch (alt120) {
				case 1 :
					// Python.g:419:13: list_for
					{
					pushFollow(FOLLOW_list_for_in_list_iter3742);
					list_for();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:420:13: list_if
					{
					pushFollow(FOLLOW_list_if_in_list_iter3756);
					list_if();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "list_iter"



	// $ANTLR start "list_for"
	// Python.g:423:1: list_for : 'for' exprlist 'in' testlist ( list_iter )? ;
	public final void list_for() throws RecognitionException {
		try {
			// Python.g:423:10: ( 'for' exprlist 'in' testlist ( list_iter )? )
			// Python.g:423:12: 'for' exprlist 'in' testlist ( list_iter )?
			{
			match(input,82,FOLLOW_82_in_list_for3775); if (state.failed) return;
			pushFollow(FOLLOW_exprlist_in_list_for3777);
			exprlist();
			state._fsp--;
			if (state.failed) return;
			match(input,87,FOLLOW_87_in_list_for3779); if (state.failed) return;
			pushFollow(FOLLOW_testlist_in_list_for3781);
			testlist();
			state._fsp--;
			if (state.failed) return;
			// Python.g:423:41: ( list_iter )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==82||LA121_0==85) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// Python.g:423:42: list_iter
					{
					pushFollow(FOLLOW_list_iter_in_list_for3784);
					list_iter();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "list_for"



	// $ANTLR start "list_if"
	// Python.g:426:1: list_if : 'if' test ( list_iter )? ;
	public final void list_if() throws RecognitionException {
		try {
			// Python.g:426:9: ( 'if' test ( list_iter )? )
			// Python.g:426:11: 'if' test ( list_iter )?
			{
			match(input,85,FOLLOW_85_in_list_if3804); if (state.failed) return;
			pushFollow(FOLLOW_test_in_list_if3806);
			test();
			state._fsp--;
			if (state.failed) return;
			// Python.g:426:21: ( list_iter )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==82||LA122_0==85) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// Python.g:426:22: list_iter
					{
					pushFollow(FOLLOW_list_iter_in_list_if3809);
					list_iter();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "list_if"



	// $ANTLR start "gen_iter"
	// Python.g:429:1: gen_iter : ( gen_for | gen_if );
	public final void gen_iter() throws RecognitionException {
		try {
			// Python.g:429:9: ( gen_for | gen_if )
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==82) ) {
				alt123=1;
			}
			else if ( (LA123_0==85) ) {
				alt123=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 123, 0, input);
				throw nvae;
			}

			switch (alt123) {
				case 1 :
					// Python.g:429:11: gen_for
					{
					pushFollow(FOLLOW_gen_for_in_gen_iter3827);
					gen_for();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Python.g:430:11: gen_if
					{
					pushFollow(FOLLOW_gen_if_in_gen_iter3839);
					gen_if();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gen_iter"



	// $ANTLR start "gen_for"
	// Python.g:433:1: gen_for : 'for' exprlist 'in' or_test ( gen_iter )? ;
	public final void gen_for() throws RecognitionException {
		try {
			// Python.g:433:8: ( 'for' exprlist 'in' or_test ( gen_iter )? )
			// Python.g:433:10: 'for' exprlist 'in' or_test ( gen_iter )?
			{
			match(input,82,FOLLOW_82_in_gen_for3855); if (state.failed) return;
			pushFollow(FOLLOW_exprlist_in_gen_for3857);
			exprlist();
			state._fsp--;
			if (state.failed) return;
			match(input,87,FOLLOW_87_in_gen_for3859); if (state.failed) return;
			pushFollow(FOLLOW_or_test_in_gen_for3861);
			or_test();
			state._fsp--;
			if (state.failed) return;
			// Python.g:433:38: ( gen_iter )?
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==82||LA124_0==85) ) {
				alt124=1;
			}
			switch (alt124) {
				case 1 :
					// Python.g:433:38: gen_iter
					{
					pushFollow(FOLLOW_gen_iter_in_gen_for3863);
					gen_iter();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gen_for"



	// $ANTLR start "gen_if"
	// Python.g:436:1: gen_if : 'if' test ( gen_iter )? ;
	public final void gen_if() throws RecognitionException {
		try {
			// Python.g:436:7: ( 'if' test ( gen_iter )? )
			// Python.g:436:9: 'if' test ( gen_iter )?
			{
			match(input,85,FOLLOW_85_in_gen_if3879); if (state.failed) return;
			pushFollow(FOLLOW_test_in_gen_if3881);
			test();
			state._fsp--;
			if (state.failed) return;
			// Python.g:436:19: ( gen_iter )?
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==82||LA125_0==85) ) {
				alt125=1;
			}
			switch (alt125) {
				case 1 :
					// Python.g:436:19: gen_iter
					{
					pushFollow(FOLLOW_gen_iter_in_gen_if3883);
					gen_iter();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "gen_if"



	// $ANTLR start "yield_expr"
	// Python.g:439:1: yield_expr : 'yield' ( testlist )? ;
	public final void yield_expr() throws RecognitionException {
		try {
			// Python.g:439:12: ( 'yield' ( testlist )? )
			// Python.g:439:14: 'yield' ( testlist )?
			{
			match(input,97,FOLLOW_97_in_yield_expr3899); if (state.failed) return;
			// Python.g:439:22: ( testlist )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==BACKQUOTE||LA126_0==COMPLEX||LA126_0==FLOAT||(LA126_0 >= INT && LA126_0 <= LCURLY)||(LA126_0 >= LONGINT && LA126_0 <= MINUS)||LA126_0==NAME||LA126_0==NOT||LA126_0==PLUS||(LA126_0 >= STRING && LA126_0 <= TILDE)||LA126_0==89) ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// Python.g:439:22: testlist
					{
					pushFollow(FOLLOW_testlist_in_yield_expr3901);
					testlist();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "yield_expr"

	// $ANTLR start synpred1_Python
	public final void synpred1_Python_fragment() throws RecognitionException {
		// Python.g:288:7: ( 'if' or_test 'else' )
		// Python.g:288:8: 'if' or_test 'else'
		{
		match(input,85,FOLLOW_85_in_synpred1_Python2325); if (state.failed) return;
		pushFollow(FOLLOW_or_test_in_synpred1_Python2327);
		or_test();
		state._fsp--;
		if (state.failed) return;
		match(input,78,FOLLOW_78_in_synpred1_Python2329); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_Python

	// Delegated rules

	public final boolean synpred1_Python() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Python_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA40 dfa40 = new DFA40(this);
	static final String DFA40_eotS =
		"\4\uffff";
	static final String DFA40_eofS =
		"\4\uffff";
	static final String DFA40_minS =
		"\2\24\2\uffff";
	static final String DFA40_maxS =
		"\1\54\1\126\2\uffff";
	static final String DFA40_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA40_specialS =
		"\4\uffff}>";
	static final String[] DFA40_transitionS = {
			"\1\1\27\uffff\1\2",
			"\1\1\27\uffff\1\2\51\uffff\1\3",
			"",
			""
	};

	static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
	static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
	static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
	static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
	static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
	static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
	static final short[][] DFA40_transition;

	static {
		int numStates = DFA40_transitionS.length;
		DFA40_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
		}
	}

	protected class DFA40 extends DFA {

		public DFA40(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 40;
			this.eot = DFA40_eot;
			this.eof = DFA40_eof;
			this.min = DFA40_min;
			this.max = DFA40_max;
			this.accept = DFA40_accept;
			this.special = DFA40_special;
			this.transition = DFA40_transition;
		}
		@Override
		public String getDescription() {
			return "217:21: ( ( DOT )* dotted_name | ( DOT )+ )";
		}
	}

	public static final BitSet FOLLOW_NEWLINE_in_single_input44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_stmt_in_single_input61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_stmt_in_single_input78 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_NEWLINE_in_single_input80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_file_input103 = new BitSet(new long[]{0x8008770710010602L,0x00000003FE7D1F81L});
	public static final BitSet FOLLOW_stmt_in_file_input107 = new BitSet(new long[]{0x8008770710010602L,0x00000003FE7D1F81L});
	public static final BitSet FOLLOW_NEWLINE_in_eval_input130 = new BitSet(new long[]{0x8008770710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_testlist_in_eval_input134 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_eval_input137 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_decorator_in_decorators158 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_AT_in_decorator177 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_dotted_attr_in_decorator179 = new BitSet(new long[]{0x0000220000000000L});
	public static final BitSet FOLLOW_LPAREN_in_decorator182 = new BitSet(new long[]{0xA208570710810400L,0x0000000002000001L});
	public static final BitSet FOLLOW_arglist_in_decorator184 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_decorator187 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_NEWLINE_in_decorator191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_dotted_attr213 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_DOT_in_dotted_attr216 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_dotted_attr218 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_decorators_in_funcdef233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_funcdef236 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_funcdef238 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_parameters_in_funcdef240 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_funcdef242 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_funcdef244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_parameters261 = new BitSet(new long[]{0x2200120000800000L});
	public static final BitSet FOLLOW_varargslist_in_parameters264 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_parameters268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_defparameter_in_varargslist288 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_varargslist298 = new BitSet(new long[]{0x0000120000000000L});
	public static final BitSet FOLLOW_defparameter_in_varargslist300 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_varargslist319 = new BitSet(new long[]{0x2000000000800002L});
	public static final BitSet FOLLOW_STAR_in_varargslist341 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_varargslist343 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_varargslist346 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_DOUBLESTAR_in_varargslist348 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_varargslist350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLESTAR_in_varargslist374 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_varargslist376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_varargslist430 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_varargslist432 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_varargslist435 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_DOUBLESTAR_in_varargslist437 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_varargslist439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLESTAR_in_varargslist457 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_varargslist459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fpdef_in_defparameter480 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_ASSIGN_in_defparameter483 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_defparameter485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_fpdef509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_fpdef519 = new BitSet(new long[]{0x0000120000000000L});
	public static final BitSet FOLLOW_fplist_in_fpdef521 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_fpdef523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fpdef_in_fplist538 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_fplist548 = new BitSet(new long[]{0x0000120000000000L});
	public static final BitSet FOLLOW_fpdef_in_fplist550 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_fplist555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_stmt_in_stmt573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_stmt_in_stmt582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_small_stmt_in_simple_stmt596 = new BitSet(new long[]{0x0400200000000000L});
	public static final BitSet FOLLOW_SEMI_in_simple_stmt606 = new BitSet(new long[]{0x8008570710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_small_stmt_in_simple_stmt608 = new BitSet(new long[]{0x0400200000000000L});
	public static final BitSet FOLLOW_SEMI_in_simple_stmt613 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_NEWLINE_in_simple_stmt617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_stmt_in_small_stmt638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_stmt_in_small_stmt653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_del_stmt_in_small_stmt668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pass_stmt_in_small_stmt683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_flow_stmt_in_small_stmt698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_import_stmt_in_small_stmt713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_global_stmt_in_small_stmt728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exec_stmt_in_small_stmt743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assert_stmt_in_small_stmt758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_testlist_in_expr_stmt778 = new BitSet(new long[]{0x5114082001401142L,0x0000000000000010L});
	public static final BitSet FOLLOW_augassign_in_expr_stmt794 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_yield_expr_in_expr_stmt796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_augassign_in_expr_stmt812 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_testlist_in_expr_stmt814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assigns_in_expr_stmt830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_testlist_in_assigns868 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_assign_yield_in_assigns877 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_ASSIGN_in_assign_testlist898 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_testlist_in_assign_testlist900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_assign_yield920 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_yield_expr_in_assign_yield922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_print_stmt1108 = new BitSet(new long[]{0x8088570710010402L,0x0000000002000001L});
	public static final BitSet FOLLOW_printlist_in_print_stmt1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHTSHIFT_in_print_stmt1115 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_printlist_in_print_stmt1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_test_in_printlist1147 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_printlist1158 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_printlist1160 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_printlist1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_del_stmt1181 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprlist_in_del_stmt1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_pass_stmt1201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_break_stmt_in_flow_stmt1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_continue_stmt_in_flow_stmt1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return_stmt_in_flow_stmt1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_raise_stmt_in_flow_stmt1262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_yield_stmt_in_flow_stmt1276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_break_stmt1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_continue_stmt1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_return_stmt1338 = new BitSet(new long[]{0x8008570710010402L,0x0000000002000001L});
	public static final BitSet FOLLOW_testlist_in_return_stmt1341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_yield_expr_in_yield_stmt1364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_raise_stmt1383 = new BitSet(new long[]{0x8008570710010402L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_raise_stmt1386 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_raise_stmt1389 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_raise_stmt1391 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_raise_stmt1394 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_raise_stmt1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_import_name_in_import_stmt1421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_import_from_in_import_stmt1437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_import_name1458 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_dotted_as_names_in_import_name1460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_import_from1480 = new BitSet(new long[]{0x0000100000100000L});
	public static final BitSet FOLLOW_DOT_in_import_from1483 = new BitSet(new long[]{0x0000100000100000L});
	public static final BitSet FOLLOW_dotted_name_in_import_from1486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_DOT_in_import_from1490 = new BitSet(new long[]{0x0000000000100000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_import_from1494 = new BitSet(new long[]{0x2000120000000000L});
	public static final BitSet FOLLOW_STAR_in_import_from1511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_import_as_names_in_import_from1529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_import_from1547 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_import_as_names_in_import_from1549 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_import_from1551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_import_as_name_in_import_as_names1587 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_import_as_names1590 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_import_as_name_in_import_as_names1592 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_import_as_names1597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_import_as_name1624 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_import_as_name1627 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_import_as_name1629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotted_name_in_dotted_as_name1655 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_dotted_as_name1658 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_dotted_as_name1660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dotted_as_name_in_dotted_as_names1686 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_dotted_as_names1689 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_dotted_as_name_in_dotted_as_names1691 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_NAME_in_dotted_name1717 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_DOT_in_dotted_name1720 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_dotted_name1722 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_84_in_global_stmt1745 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_global_stmt1747 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_global_stmt1750 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_global_stmt1752 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_80_in_exec_stmt1775 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_exec_stmt1777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_exec_stmt1780 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_exec_stmt1782 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_exec_stmt1785 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_exec_stmt1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_assert_stmt1810 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_assert_stmt1812 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_assert_stmt1815 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_assert_stmt1817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_compound_stmt1840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_stmt_in_compound_stmt1858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_stmt_in_compound_stmt1876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_try_stmt_in_compound_stmt1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_with_stmt_in_compound_stmt1912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcdef_in_compound_stmt1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classdef_in_compound_stmt1948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_if_stmt1970 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_if_stmt1972 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_if_stmt1974 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_if_stmt1976 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
	public static final BitSet FOLLOW_elif_clause_in_if_stmt1978 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_if_stmt1983 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_if_stmt1985 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_if_stmt1987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_elif_clause2005 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_elif_clause2007 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_elif_clause2009 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_elif_clause2011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_while_stmt2032 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_while_stmt2034 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_while_stmt2036 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_while_stmt2038 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_while_stmt2041 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_while_stmt2043 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_while_stmt2045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_for_stmt2067 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprlist_in_for_stmt2069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_for_stmt2071 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_testlist_in_for_stmt2073 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_for_stmt2075 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_for_stmt2077 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_for_stmt2080 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_for_stmt2082 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_for_stmt2084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_try_stmt2104 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_try_stmt2106 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_try_stmt2108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000028000L});
	public static final BitSet FOLLOW_except_clause_in_try_stmt2123 = new BitSet(new long[]{0x0000000000000002L,0x000000000002C000L});
	public static final BitSet FOLLOW_78_in_try_stmt2127 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_try_stmt2129 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_try_stmt2131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_try_stmt2136 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_try_stmt2138 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_try_stmt2140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_try_stmt2157 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_try_stmt2159 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_try_stmt2161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_with_stmt2191 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_with_stmt2193 = new BitSet(new long[]{0x0000100000002000L,0x0000000000000040L});
	public static final BitSet FOLLOW_with_var_in_with_stmt2196 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_with_stmt2200 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_with_stmt2202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_with_var2219 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_with_var2227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_except_clause2244 = new BitSet(new long[]{0x8008570710012400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_except_clause2247 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_COMMA_in_except_clause2250 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_except_clause2252 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_except_clause2258 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_except_clause2260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_stmt_in_suite2283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_suite2293 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_INDENT_in_suite2295 = new BitSet(new long[]{0x8008570710010600L,0x00000003FE7D1F81L});
	public static final BitSet FOLLOW_stmt_in_suite2298 = new BitSet(new long[]{0x8008570710050600L,0x00000003FE7D1F81L});
	public static final BitSet FOLLOW_DEDENT_in_suite2302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_or_test_in_test2316 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_test2334 = new BitSet(new long[]{0x8008570710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_or_test_in_test2336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_test2338 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_test2340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lambdef_in_test2350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_test_in_or_test2363 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_OR_in_or_test2366 = new BitSet(new long[]{0x8008570710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_and_test_in_or_test2368 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_not_test_in_and_test2387 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_AND_in_and_test2390 = new BitSet(new long[]{0x8008570710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_not_test_in_and_test2392 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_NOT_in_not_test2412 = new BitSet(new long[]{0x8008570710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_not_test_in_not_test2414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_not_test2427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_comparison2444 = new BitSet(new long[]{0x0000C0C062000012L,0x0000000001800000L});
	public static final BitSet FOLLOW_comp_op_in_comparison2447 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_comparison2449 = new BitSet(new long[]{0x0000C0C062000012L,0x0000000001800000L});
	public static final BitSet FOLLOW_LESS_in_comp_op2470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATER_in_comp_op2482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUAL_in_comp_op2494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATEREQUAL_in_comp_op2506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESSEQUAL_in_comp_op2518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALT_NOTEQUAL_in_comp_op2530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTEQUAL_in_comp_op2542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_comp_op2554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_comp_op2566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_comp_op2568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_comp_op2580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_comp_op2592 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_NOT_in_comp_op2594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_xor_expr_in_expr2611 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_VBAR_in_expr2614 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_xor_expr_in_expr2616 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_and_expr_in_xor_expr2632 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_CIRCUMFLEX_in_xor_expr2635 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_and_expr_in_xor_expr2637 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_shift_expr_in_and_expr2657 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AMPER_in_and_expr2660 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_shift_expr_in_and_expr2662 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_arith_expr_in_shift_expr2682 = new BitSet(new long[]{0x0080001000000002L});
	public static final BitSet FOLLOW_set_in_shift_expr2685 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_arith_expr_in_shift_expr2691 = new BitSet(new long[]{0x0080001000000002L});
	public static final BitSet FOLLOW_term_in_arith_expr2712 = new BitSet(new long[]{0x0008040000000002L});
	public static final BitSet FOLLOW_set_in_arith_expr2715 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_arith_expr2721 = new BitSet(new long[]{0x0008040000000002L});
	public static final BitSet FOLLOW_factor_in_term2742 = new BitSet(new long[]{0x2802000000200002L});
	public static final BitSet FOLLOW_set_in_term2745 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_factor_in_term2762 = new BitSet(new long[]{0x2802000000200002L});
	public static final BitSet FOLLOW_PLUS_in_factor2778 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_factor_in_factor2780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_factor2791 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_factor_in_factor2793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TILDE_in_factor2804 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_factor_in_factor2806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_power_in_factor2817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_power2833 = new BitSet(new long[]{0x0000020200900002L});
	public static final BitSet FOLLOW_trailer_in_power2836 = new BitSet(new long[]{0x0000020200900002L});
	public static final BitSet FOLLOW_DOUBLESTAR_in_power2848 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_factor_in_power2850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom2867 = new BitSet(new long[]{0x8208570710010400L,0x0000000202000001L});
	public static final BitSet FOLLOW_yield_expr_in_atom2879 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_testlist_gexp_in_atom2890 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atom2909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_atom2918 = new BitSet(new long[]{0x8028570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_listmaker_in_atom2921 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_atom2925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_atom2934 = new BitSet(new long[]{0x8048570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_dictmaker_in_atom2937 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_atom2941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BACKQUOTE_in_atom2950 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_testlist_in_atom2952 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BACKQUOTE_in_atom2954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atom2963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom2972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONGINT_in_atom2981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom2990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMPLEX_in_atom2999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom3009 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_test_in_listmaker3025 = new BitSet(new long[]{0x0000000000004002L,0x0000000000040000L});
	public static final BitSet FOLLOW_list_for_in_listmaker3042 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_listmaker3066 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_listmaker3068 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_listmaker3087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_test_in_testlist_gexp3112 = new BitSet(new long[]{0x0000000000004002L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_testlist_gexp3125 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_testlist_gexp3127 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_testlist_gexp3132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gen_for_in_testlist_gexp3149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_lambdef3186 = new BitSet(new long[]{0x2000120000802000L});
	public static final BitSet FOLLOW_varargslist_in_lambdef3189 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_lambdef3193 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_lambdef3195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_trailer3211 = new BitSet(new long[]{0xA208570710810400L,0x0000000002000001L});
	public static final BitSet FOLLOW_arglist_in_trailer3214 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_trailer3218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_trailer3230 = new BitSet(new long[]{0x8008570710112400L,0x0000000002000001L});
	public static final BitSet FOLLOW_subscriptlist_in_trailer3232 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACK_in_trailer3234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_trailer3246 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_trailer3248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subscript_in_subscriptlist3265 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_subscriptlist3275 = new BitSet(new long[]{0x8008570710112400L,0x0000000002000001L});
	public static final BitSet FOLLOW_subscript_in_subscriptlist3277 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_subscriptlist3282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_subscript3307 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_DOT_in_subscript3309 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_DOT_in_subscript3311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_test_in_subscript3325 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COLON_in_subscript3328 = new BitSet(new long[]{0x8008570710012402L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_subscript3331 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_sliceop_in_subscript3336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_subscript3354 = new BitSet(new long[]{0x8008570710012402L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_subscript3357 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_sliceop_in_subscript3362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_sliceop3383 = new BitSet(new long[]{0x8008570710010402L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_sliceop3386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprlist3405 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_exprlist3416 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_expr_in_exprlist3418 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_exprlist3423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_test_in_testlist3447 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_testlist3458 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_testlist3460 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_testlist3465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_test_in_dictmaker3480 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_dictmaker3482 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_dictmaker3484 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_dictmaker3494 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_dictmaker3496 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_dictmaker3498 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_dictmaker3500 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_dictmaker3505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_classdef3525 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NAME_in_classdef3527 = new BitSet(new long[]{0x0000020000002000L});
	public static final BitSet FOLLOW_LPAREN_in_classdef3530 = new BitSet(new long[]{0x8208570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_testlist_in_classdef3532 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_classdef3535 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COLON_in_classdef3539 = new BitSet(new long[]{0x8008770710010400L,0x000000023E591581L});
	public static final BitSet FOLLOW_suite_in_classdef3541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argument_in_arglist3558 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_arglist3561 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_argument_in_arglist3563 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_arglist3579 = new BitSet(new long[]{0x2000000000800002L});
	public static final BitSet FOLLOW_STAR_in_arglist3595 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_arglist3597 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_arglist3600 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_DOUBLESTAR_in_arglist3602 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_arglist3604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLESTAR_in_arglist3622 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_arglist3624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_arglist3666 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_arglist3668 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_arglist3671 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_DOUBLESTAR_in_arglist3673 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_arglist3675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLESTAR_in_arglist3691 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_arglist3693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_test_in_argument3710 = new BitSet(new long[]{0x0000000000000102L,0x0000000000040000L});
	public static final BitSet FOLLOW_ASSIGN_in_argument3715 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_argument3717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gen_for_in_argument3722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_for_in_list_iter3742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_if_in_list_iter3756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_list_for3775 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprlist_in_list_for3777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_list_for3779 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_testlist_in_list_for3781 = new BitSet(new long[]{0x0000000000000002L,0x0000000000240000L});
	public static final BitSet FOLLOW_list_iter_in_list_for3784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_list_if3804 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_list_if3806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000240000L});
	public static final BitSet FOLLOW_list_iter_in_list_if3809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gen_for_in_gen_iter3827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gen_if_in_gen_iter3839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_gen_for3855 = new BitSet(new long[]{0x8008170710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_exprlist_in_gen_for3857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_gen_for3859 = new BitSet(new long[]{0x8008570710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_or_test_in_gen_for3861 = new BitSet(new long[]{0x0000000000000002L,0x0000000000240000L});
	public static final BitSet FOLLOW_gen_iter_in_gen_for3863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_gen_if3879 = new BitSet(new long[]{0x8008570710010400L,0x0000000002000001L});
	public static final BitSet FOLLOW_test_in_gen_if3881 = new BitSet(new long[]{0x0000000000000002L,0x0000000000240000L});
	public static final BitSet FOLLOW_gen_iter_in_gen_if3883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_yield_expr3899 = new BitSet(new long[]{0x8008570710010402L,0x0000000002000001L});
	public static final BitSet FOLLOW_testlist_in_yield_expr3901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_synpred1_Python2325 = new BitSet(new long[]{0x8008570710010400L,0x0000000000000001L});
	public static final BitSet FOLLOW_or_test_in_synpred1_Python2327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred1_Python2329 = new BitSet(new long[]{0x0000000000000002L});
}
