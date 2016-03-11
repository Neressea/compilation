// $ANTLR 3.5.1 D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g 2016-03-11 17:38:03

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class Tiger3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEGIN", "BLOCK", "CELL", "COMMENT", 
		"COMP", "COND", "CONST", "DECLARATIONS", "EMPTY_SEQ", "END", "FIELD", 
		"FUNC_CALL", "FUNC_DECL", "ID", "IDF", "INIT", "INT", "NEG", "NEWLINE", 
		"PARAM", "PARAMSEFF", "PARAMSFORM", "PRIMITIF", "SIZE", "STRING", "STRUCT", 
		"TAB", "TAIGA", "TYPE", "WS", "'&'", "'('", "')'", "'*'", "'+'", "','", 
		"'-'", "'.'", "'/'", "':'", "':='", "';'", "'<'", "'='", "'>'", "'['", 
		"']'", "'array of'", "'array'", "'block'", "'break'", "'do'", "'else'", 
		"'end'", "'for'", "'function'", "'if'", "'in'", "'int'", "'let'", "'nil'", 
		"'of'", "'string'", "'then'", "'to'", "'type'", "'typedef'", "'var'", 
		"'while'", "'{'", "'|'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int BEGIN=4;
	public static final int BLOCK=5;
	public static final int CELL=6;
	public static final int COMMENT=7;
	public static final int COMP=8;
	public static final int COND=9;
	public static final int CONST=10;
	public static final int DECLARATIONS=11;
	public static final int EMPTY_SEQ=12;
	public static final int END=13;
	public static final int FIELD=14;
	public static final int FUNC_CALL=15;
	public static final int FUNC_DECL=16;
	public static final int ID=17;
	public static final int IDF=18;
	public static final int INIT=19;
	public static final int INT=20;
	public static final int NEG=21;
	public static final int NEWLINE=22;
	public static final int PARAM=23;
	public static final int PARAMSEFF=24;
	public static final int PARAMSFORM=25;
	public static final int PRIMITIF=26;
	public static final int SIZE=27;
	public static final int STRING=28;
	public static final int STRUCT=29;
	public static final int TAB=30;
	public static final int TAIGA=31;
	public static final int TYPE=32;
	public static final int WS=33;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public Tiger3Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public Tiger3Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return Tiger3Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g"; }


	/** Map variable name to Integer object holding value */
	HashMap<String,Integer>  memory = new HashMap<String,Integer>();


	public static class tiger3_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tiger3"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:46:1: tiger3 : e1= expr -> ^( TAIGA $e1) ;
	public final Tiger3Parser.tiger3_return tiger3() throws RecognitionException {
		Tiger3Parser.tiger3_return retval = new Tiger3Parser.tiger3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope e1 =null;

		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:46:8: (e1= expr -> ^( TAIGA $e1) )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:46:10: e1= expr
			{
			pushFollow(FOLLOW_expr_in_tiger3122);
			e1=expr();
			state._fsp--;

			stream_expr.add(e1.getTree());
			// AST REWRITE
			// elements: e1
			// token labels: 
			// rule labels: e1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 46:18: -> ^( TAIGA $e1)
			{
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:46:21: ^( TAIGA $e1)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TAIGA, "TAIGA"), root_1);
				adaptor.addChild(root_1, stream_e1.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tiger3"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:48:1: expr : ( nilexp | affect | type_id ( '{' ( field_list )* '}' )? | ifop | forop | whileop | breakexp |l= letexp (decl= declaration_list )? inexp (e= expr_seq )? endexp -> ^( $l ( ^( DECLARATIONS $decl) )? ( ^( BLOCK $e) )? ) );
	public final Tiger3Parser.expr_return expr() throws RecognitionException {
		Tiger3Parser.expr_return retval = new Tiger3Parser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal4=null;
		Token char_literal6=null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope decl =null;
		ParserRuleReturnScope e =null;
		ParserRuleReturnScope nilexp1 =null;
		ParserRuleReturnScope affect2 =null;
		ParserRuleReturnScope type_id3 =null;
		ParserRuleReturnScope field_list5 =null;
		ParserRuleReturnScope ifop7 =null;
		ParserRuleReturnScope forop8 =null;
		ParserRuleReturnScope whileop9 =null;
		ParserRuleReturnScope breakexp10 =null;
		ParserRuleReturnScope inexp11 =null;
		ParserRuleReturnScope endexp12 =null;

		Object char_literal4_tree=null;
		Object char_literal6_tree=null;
		RewriteRuleSubtreeStream stream_expr_seq=new RewriteRuleSubtreeStream(adaptor,"rule expr_seq");
		RewriteRuleSubtreeStream stream_letexp=new RewriteRuleSubtreeStream(adaptor,"rule letexp");
		RewriteRuleSubtreeStream stream_inexp=new RewriteRuleSubtreeStream(adaptor,"rule inexp");
		RewriteRuleSubtreeStream stream_endexp=new RewriteRuleSubtreeStream(adaptor,"rule endexp");
		RewriteRuleSubtreeStream stream_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule declaration_list");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:48:6: ( nilexp | affect | type_id ( '{' ( field_list )* '}' )? | ifop | forop | whileop | breakexp |l= letexp (decl= declaration_list )? inexp (e= expr_seq )? endexp -> ^( $l ( ^( DECLARATIONS $decl) )? ( ^( BLOCK $e) )? ) )
			int alt5=8;
			switch ( input.LA(1) ) {
			case 64:
				{
				alt5=1;
				}
				break;
			case ID:
			case INT:
			case STRING:
			case 35:
			case 40:
				{
				alt5=2;
				}
				break;
			case 62:
			case 66:
				{
				alt5=3;
				}
				break;
			case 60:
				{
				alt5=4;
				}
				break;
			case 58:
				{
				alt5=5;
				}
				break;
			case 72:
				{
				alt5=6;
				}
				break;
			case 54:
				{
				alt5=7;
				}
				break;
			case 63:
				{
				alt5=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:48:8: nilexp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nilexp_in_expr139);
					nilexp1=nilexp();
					state._fsp--;

					adaptor.addChild(root_0, nilexp1.getTree());

					}
					break;
				case 2 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:49:4: affect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_affect_in_expr144);
					affect2=affect();
					state._fsp--;

					adaptor.addChild(root_0, affect2.getTree());

					}
					break;
				case 3 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:50:4: type_id ( '{' ( field_list )* '}' )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_id_in_expr149);
					type_id3=type_id();
					state._fsp--;

					adaptor.addChild(root_0, type_id3.getTree());

					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:50:12: ( '{' ( field_list )* '}' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==73) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:50:14: '{' ( field_list )* '}'
							{
							char_literal4=(Token)match(input,73,FOLLOW_73_in_expr153); 
							char_literal4_tree = (Object)adaptor.create(char_literal4);
							adaptor.addChild(root_0, char_literal4_tree);

							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:50:18: ( field_list )*
							loop1:
							while (true) {
								int alt1=2;
								int LA1_0 = input.LA(1);
								if ( (LA1_0==ID) ) {
									alt1=1;
								}

								switch (alt1) {
								case 1 :
									// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:50:18: field_list
									{
									pushFollow(FOLLOW_field_list_in_expr155);
									field_list5=field_list();
									state._fsp--;

									adaptor.addChild(root_0, field_list5.getTree());

									}
									break;

								default :
									break loop1;
								}
							}

							char_literal6=(Token)match(input,75,FOLLOW_75_in_expr158); 
							char_literal6_tree = (Object)adaptor.create(char_literal6);
							adaptor.addChild(root_0, char_literal6_tree);

							}
							break;

					}

					}
					break;
				case 4 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:51:4: ifop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifop_in_expr165);
					ifop7=ifop();
					state._fsp--;

					adaptor.addChild(root_0, ifop7.getTree());

					}
					break;
				case 5 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:52:4: forop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forop_in_expr170);
					forop8=forop();
					state._fsp--;

					adaptor.addChild(root_0, forop8.getTree());

					}
					break;
				case 6 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:53:4: whileop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileop_in_expr175);
					whileop9=whileop();
					state._fsp--;

					adaptor.addChild(root_0, whileop9.getTree());

					}
					break;
				case 7 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:54:4: breakexp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_breakexp_in_expr180);
					breakexp10=breakexp();
					state._fsp--;

					adaptor.addChild(root_0, breakexp10.getTree());

					}
					break;
				case 8 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:55:4: l= letexp (decl= declaration_list )? inexp (e= expr_seq )? endexp
					{
					pushFollow(FOLLOW_letexp_in_expr187);
					l=letexp();
					state._fsp--;

					stream_letexp.add(l.getTree());
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:55:18: (decl= declaration_list )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==59||LA3_0==69||LA3_0==71) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:55:18: decl= declaration_list
							{
							pushFollow(FOLLOW_declaration_list_in_expr192);
							decl=declaration_list();
							state._fsp--;

							stream_declaration_list.add(decl.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_inexp_in_expr196);
					inexp11=inexp();
					state._fsp--;

					stream_inexp.add(inexp11.getTree());
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:55:45: (e= expr_seq )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==ID||LA4_0==INT||LA4_0==STRING||LA4_0==35||LA4_0==40||LA4_0==54||LA4_0==58||LA4_0==60||(LA4_0 >= 62 && LA4_0 <= 64)||LA4_0==66||LA4_0==72) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:55:45: e= expr_seq
							{
							pushFollow(FOLLOW_expr_seq_in_expr200);
							e=expr_seq();
							state._fsp--;

							stream_expr_seq.add(e.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_endexp_in_expr204);
					endexp12=endexp();
					state._fsp--;

					stream_endexp.add(endexp12.getTree());
					// AST REWRITE
					// elements: e, decl, l
					// token labels: 
					// rule labels: decl, e, l, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl",decl!=null?decl.getTree():null);
					RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
					RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 56:4: -> ^( $l ( ^( DECLARATIONS $decl) )? ( ^( BLOCK $e) )? )
					{
						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:56:7: ^( $l ( ^( DECLARATIONS $decl) )? ( ^( BLOCK $e) )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_l.nextNode(), root_1);
						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:56:12: ( ^( DECLARATIONS $decl) )?
						if ( stream_decl.hasNext() ) {
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:56:12: ^( DECLARATIONS $decl)
							{
							Object root_2 = (Object)adaptor.nil();
							root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_2);
							adaptor.addChild(root_2, stream_decl.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_decl.reset();

						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:56:35: ( ^( BLOCK $e) )?
						if ( stream_e.hasNext() ) {
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:56:35: ^( BLOCK $e)
							{
							Object root_2 = (Object)adaptor.nil();
							root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
							adaptor.addChild(root_2, stream_e.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_e.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class expr_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_list"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:59:1: expr_list : e1= expr ( ',' e2= expr_list )? -> $e1 ( $e2)? ;
	public final Tiger3Parser.expr_list_return expr_list() throws RecognitionException {
		Tiger3Parser.expr_list_return retval = new Tiger3Parser.expr_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal13=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		Object char_literal13_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:59:12: (e1= expr ( ',' e2= expr_list )? -> $e1 ( $e2)? )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:59:14: e1= expr ( ',' e2= expr_list )?
			{
			pushFollow(FOLLOW_expr_in_expr_list243);
			e1=expr();
			state._fsp--;

			stream_expr.add(e1.getTree());
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:59:22: ( ',' e2= expr_list )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==39) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:59:23: ',' e2= expr_list
					{
					char_literal13=(Token)match(input,39,FOLLOW_39_in_expr_list246);  
					stream_39.add(char_literal13);

					pushFollow(FOLLOW_expr_list_in_expr_list250);
					e2=expr_list();
					state._fsp--;

					stream_expr_list.add(e2.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: e1, e2
			// token labels: 
			// rule labels: e1, e2, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 60:4: -> $e1 ( $e2)?
			{
				adaptor.addChild(root_0, stream_e1.nextTree());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:60:12: ( $e2)?
				if ( stream_e2.hasNext() ) {
					adaptor.addChild(root_0, stream_e2.nextTree());
				}
				stream_e2.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_list"


	public static class expr_seq_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_seq"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:63:1: expr_seq : e1= expr (pv= ';' e2= expr_seq )? -> $e1 ( $e2)? ;
	public final Tiger3Parser.expr_seq_return expr_seq() throws RecognitionException {
		Tiger3Parser.expr_seq_return retval = new Tiger3Parser.expr_seq_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token pv=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		Object pv_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleSubtreeStream stream_expr_seq=new RewriteRuleSubtreeStream(adaptor,"rule expr_seq");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:63:10: (e1= expr (pv= ';' e2= expr_seq )? -> $e1 ( $e2)? )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:63:12: e1= expr (pv= ';' e2= expr_seq )?
			{
			pushFollow(FOLLOW_expr_in_expr_seq278);
			e1=expr();
			state._fsp--;

			stream_expr.add(e1.getTree());
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:63:21: (pv= ';' e2= expr_seq )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==45) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:63:22: pv= ';' e2= expr_seq
					{
					pv=(Token)match(input,45,FOLLOW_45_in_expr_seq284);  
					stream_45.add(pv);

					pushFollow(FOLLOW_expr_seq_in_expr_seq290);
					e2=expr_seq();
					state._fsp--;

					stream_expr_seq.add(e2.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: e2, e1
			// token labels: 
			// rule labels: e1, e2, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 64:4: -> $e1 ( $e2)?
			{
				adaptor.addChild(root_0, stream_e1.nextTree());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:64:12: ( $e2)?
				if ( stream_e2.hasNext() ) {
					adaptor.addChild(root_0, stream_e2.nextTree());
				}
				stream_e2.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_seq"


	public static class field_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "field_list"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:67:1: field_list : i1= ID ':=' e1= expr (v= ',' f= field_list )? -> {$v.text != null}? ^( $i1 $e1) $f -> ^( $i1 $e1) ;
	public final Tiger3Parser.field_list_return field_list() throws RecognitionException {
		Tiger3Parser.field_list_return retval = new Tiger3Parser.field_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token i1=null;
		Token v=null;
		Token string_literal14=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope f =null;

		Object i1_tree=null;
		Object v_tree=null;
		Object string_literal14_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_field_list=new RewriteRuleSubtreeStream(adaptor,"rule field_list");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:67:12: (i1= ID ':=' e1= expr (v= ',' f= field_list )? -> {$v.text != null}? ^( $i1 $e1) $f -> ^( $i1 $e1) )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:67:14: i1= ID ':=' e1= expr (v= ',' f= field_list )?
			{
			i1=(Token)match(input,ID,FOLLOW_ID_in_field_list317);  
			stream_ID.add(i1);

			string_literal14=(Token)match(input,44,FOLLOW_44_in_field_list319);  
			stream_44.add(string_literal14);

			pushFollow(FOLLOW_expr_in_field_list323);
			e1=expr();
			state._fsp--;

			stream_expr.add(e1.getTree());
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:67:33: (v= ',' f= field_list )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==39) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:67:34: v= ',' f= field_list
					{
					v=(Token)match(input,39,FOLLOW_39_in_field_list328);  
					stream_39.add(v);

					pushFollow(FOLLOW_field_list_in_field_list332);
					f=field_list();
					state._fsp--;

					stream_field_list.add(f.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: i1, e1, i1, e1, f
			// token labels: i1
			// rule labels: f, e1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_i1=new RewriteRuleTokenStream(adaptor,"token i1",i1);
			RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.getTree():null);
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 68:5: -> {$v.text != null}? ^( $i1 $e1) $f
			if ((v!=null?v.getText():null) != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:68:27: ^( $i1 $e1)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_i1.nextNode(), root_1);
				adaptor.addChild(root_1, stream_e1.nextTree());
				adaptor.addChild(root_0, root_1);
				}

				adaptor.addChild(root_0, stream_f.nextTree());
			}

			else // 69:5: -> ^( $i1 $e1)
			{
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:69:9: ^( $i1 $e1)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_i1.nextNode(), root_1);
				adaptor.addChild(root_1, stream_e1.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field_list"


	public static class ifop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifop"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:72:1: ifop : fi= ifexp e1= expr th= thenexp e2= expr (els= elseexp e3= expr )? -> ^( $fi ^( COND $e1) ^( $th $e2) ( ^( $els $e3) )? ) ;
	public final Tiger3Parser.ifop_return ifop() throws RecognitionException {
		Tiger3Parser.ifop_return retval = new Tiger3Parser.ifop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope fi =null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope th =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope els =null;
		ParserRuleReturnScope e3 =null;

		RewriteRuleSubtreeStream stream_elseexp=new RewriteRuleSubtreeStream(adaptor,"rule elseexp");
		RewriteRuleSubtreeStream stream_ifexp=new RewriteRuleSubtreeStream(adaptor,"rule ifexp");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_thenexp=new RewriteRuleSubtreeStream(adaptor,"rule thenexp");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:72:6: (fi= ifexp e1= expr th= thenexp e2= expr (els= elseexp e3= expr )? -> ^( $fi ^( COND $e1) ^( $th $e2) ( ^( $els $e3) )? ) )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:72:8: fi= ifexp e1= expr th= thenexp e2= expr (els= elseexp e3= expr )?
			{
			pushFollow(FOLLOW_ifexp_in_ifop382);
			fi=ifexp();
			state._fsp--;

			stream_ifexp.add(fi.getTree());
			pushFollow(FOLLOW_expr_in_ifop386);
			e1=expr();
			state._fsp--;

			stream_expr.add(e1.getTree());
			pushFollow(FOLLOW_thenexp_in_ifop392);
			th=thenexp();
			state._fsp--;

			stream_thenexp.add(th.getTree());
			pushFollow(FOLLOW_expr_in_ifop398);
			e2=expr();
			state._fsp--;

			stream_expr.add(e2.getTree());
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:72:50: (els= elseexp e3= expr )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==56) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:72:51: els= elseexp e3= expr
					{
					pushFollow(FOLLOW_elseexp_in_ifop405);
					els=elseexp();
					state._fsp--;

					stream_elseexp.add(els.getTree());
					pushFollow(FOLLOW_expr_in_ifop411);
					e3=expr();
					state._fsp--;

					stream_expr.add(e3.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: e1, e3, e2, els, fi, th
			// token labels: 
			// rule labels: fi, th, e1, e2, els, e3, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_fi=new RewriteRuleSubtreeStream(adaptor,"rule fi",fi!=null?fi.getTree():null);
			RewriteRuleSubtreeStream stream_th=new RewriteRuleSubtreeStream(adaptor,"rule th",th!=null?th.getTree():null);
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);
			RewriteRuleSubtreeStream stream_els=new RewriteRuleSubtreeStream(adaptor,"rule els",els!=null?els.getTree():null);
			RewriteRuleSubtreeStream stream_e3=new RewriteRuleSubtreeStream(adaptor,"rule e3",e3!=null?e3.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 73:4: -> ^( $fi ^( COND $e1) ^( $th $e2) ( ^( $els $e3) )? )
			{
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:73:7: ^( $fi ^( COND $e1) ^( $th $e2) ( ^( $els $e3) )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_fi.nextNode(), root_1);
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:73:13: ^( COND $e1)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
				adaptor.addChild(root_2, stream_e1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:73:25: ^( $th $e2)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_th.nextNode(), root_2);
				adaptor.addChild(root_2, stream_e2.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:73:36: ( ^( $els $e3) )?
				if ( stream_e3.hasNext()||stream_els.hasNext() ) {
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:73:36: ^( $els $e3)
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot(stream_els.nextNode(), root_2);
					adaptor.addChild(root_2, stream_e3.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_e3.reset();
				stream_els.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifop"


	public static class forop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forop"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:77:1: forop : fo= forexp dd= ID ':=' e1= expr toexp e2= expr doexp e3= expr -> ^( $fo ^( $dd ^( BEGIN $e1) ^( END $e2) ) ^( BLOCK $e3) ) ;
	public final Tiger3Parser.forop_return forop() throws RecognitionException {
		Tiger3Parser.forop_return retval = new Tiger3Parser.forop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token dd=null;
		Token string_literal15=null;
		ParserRuleReturnScope fo =null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope e3 =null;
		ParserRuleReturnScope toexp16 =null;
		ParserRuleReturnScope doexp17 =null;

		Object dd_tree=null;
		Object string_literal15_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_toexp=new RewriteRuleSubtreeStream(adaptor,"rule toexp");
		RewriteRuleSubtreeStream stream_doexp=new RewriteRuleSubtreeStream(adaptor,"rule doexp");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_forexp=new RewriteRuleSubtreeStream(adaptor,"rule forexp");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:77:7: (fo= forexp dd= ID ':=' e1= expr toexp e2= expr doexp e3= expr -> ^( $fo ^( $dd ^( BEGIN $e1) ^( END $e2) ) ^( BLOCK $e3) ) )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:77:9: fo= forexp dd= ID ':=' e1= expr toexp e2= expr doexp e3= expr
			{
			pushFollow(FOLLOW_forexp_in_forop466);
			fo=forexp();
			state._fsp--;

			stream_forexp.add(fo.getTree());
			dd=(Token)match(input,ID,FOLLOW_ID_in_forop470);  
			stream_ID.add(dd);

			string_literal15=(Token)match(input,44,FOLLOW_44_in_forop472);  
			stream_44.add(string_literal15);

			pushFollow(FOLLOW_expr_in_forop476);
			e1=expr();
			state._fsp--;

			stream_expr.add(e1.getTree());
			pushFollow(FOLLOW_toexp_in_forop478);
			toexp16=toexp();
			state._fsp--;

			stream_toexp.add(toexp16.getTree());
			pushFollow(FOLLOW_expr_in_forop482);
			e2=expr();
			state._fsp--;

			stream_expr.add(e2.getTree());
			pushFollow(FOLLOW_doexp_in_forop486);
			doexp17=doexp();
			state._fsp--;

			stream_doexp.add(doexp17.getTree());
			pushFollow(FOLLOW_expr_in_forop492);
			e3=expr();
			state._fsp--;

			stream_expr.add(e3.getTree());
			// AST REWRITE
			// elements: dd, e1, fo, e2, e3
			// token labels: dd
			// rule labels: fo, e1, e2, e3, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_dd=new RewriteRuleTokenStream(adaptor,"token dd",dd);
			RewriteRuleSubtreeStream stream_fo=new RewriteRuleSubtreeStream(adaptor,"rule fo",fo!=null?fo.getTree():null);
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);
			RewriteRuleSubtreeStream stream_e3=new RewriteRuleSubtreeStream(adaptor,"rule e3",e3!=null?e3.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 78:4: -> ^( $fo ^( $dd ^( BEGIN $e1) ^( END $e2) ) ^( BLOCK $e3) )
			{
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:78:7: ^( $fo ^( $dd ^( BEGIN $e1) ^( END $e2) ) ^( BLOCK $e3) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_fo.nextNode(), root_1);
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:78:13: ^( $dd ^( BEGIN $e1) ^( END $e2) )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_dd.nextNode(), root_2);
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:78:19: ^( BEGIN $e1)
				{
				Object root_3 = (Object)adaptor.nil();
				root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(BEGIN, "BEGIN"), root_3);
				adaptor.addChild(root_3, stream_e1.nextTree());
				adaptor.addChild(root_2, root_3);
				}

				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:78:32: ^( END $e2)
				{
				Object root_3 = (Object)adaptor.nil();
				root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(END, "END"), root_3);
				adaptor.addChild(root_3, stream_e2.nextTree());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:78:44: ^( BLOCK $e3)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				adaptor.addChild(root_2, stream_e3.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forop"


	public static class whileop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileop"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:81:1: whileop : whi= whileexp e1= expr doexp e2= expr -> ^( $whi ^( COND $e1) ^( BLOCK $e2) ) ;
	public final Tiger3Parser.whileop_return whileop() throws RecognitionException {
		Tiger3Parser.whileop_return retval = new Tiger3Parser.whileop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope whi =null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope doexp18 =null;

		RewriteRuleSubtreeStream stream_doexp=new RewriteRuleSubtreeStream(adaptor,"rule doexp");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_whileexp=new RewriteRuleSubtreeStream(adaptor,"rule whileexp");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:81:9: (whi= whileexp e1= expr doexp e2= expr -> ^( $whi ^( COND $e1) ^( BLOCK $e2) ) )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:81:11: whi= whileexp e1= expr doexp e2= expr
			{
			pushFollow(FOLLOW_whileexp_in_whileop543);
			whi=whileexp();
			state._fsp--;

			stream_whileexp.add(whi.getTree());
			pushFollow(FOLLOW_expr_in_whileop547);
			e1=expr();
			state._fsp--;

			stream_expr.add(e1.getTree());
			pushFollow(FOLLOW_doexp_in_whileop551);
			doexp18=doexp();
			state._fsp--;

			stream_doexp.add(doexp18.getTree());
			pushFollow(FOLLOW_expr_in_whileop557);
			e2=expr();
			state._fsp--;

			stream_expr.add(e2.getTree());
			// AST REWRITE
			// elements: e2, whi, e1
			// token labels: 
			// rule labels: whi, e1, e2, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_whi=new RewriteRuleSubtreeStream(adaptor,"rule whi",whi!=null?whi.getTree():null);
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 82:4: -> ^( $whi ^( COND $e1) ^( BLOCK $e2) )
			{
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:82:7: ^( $whi ^( COND $e1) ^( BLOCK $e2) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_whi.nextNode(), root_1);
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:82:14: ^( COND $e1)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
				adaptor.addChild(root_2, stream_e1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:82:26: ^( BLOCK $e2)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				adaptor.addChild(root_2, stream_e2.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileop"


	public static class affect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "affect"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:85:1: affect : o= orop (af= ':=' e1= expr )? -> {$af != null}? ^( $af $o $e1) -> $o;
	public final Tiger3Parser.affect_return affect() throws RecognitionException {
		Tiger3Parser.affect_return retval = new Tiger3Parser.affect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token af=null;
		ParserRuleReturnScope o =null;
		ParserRuleReturnScope e1 =null;

		Object af_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleSubtreeStream stream_orop=new RewriteRuleSubtreeStream(adaptor,"rule orop");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:85:8: (o= orop (af= ':=' e1= expr )? -> {$af != null}? ^( $af $o $e1) -> $o)
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:85:10: o= orop (af= ':=' e1= expr )?
			{
			pushFollow(FOLLOW_orop_in_affect594);
			o=orop();
			state._fsp--;

			stream_orop.add(o.getTree());
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:85:17: (af= ':=' e1= expr )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==44) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:85:18: af= ':=' e1= expr
					{
					af=(Token)match(input,44,FOLLOW_44_in_affect599);  
					stream_44.add(af);

					pushFollow(FOLLOW_expr_in_affect603);
					e1=expr();
					state._fsp--;

					stream_expr.add(e1.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: af, e1, o, o
			// token labels: af
			// rule labels: e1, retval, o
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_af=new RewriteRuleTokenStream(adaptor,"token af",af);
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 86:4: -> {$af != null}? ^( $af $o $e1)
			if (af != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:86:22: ^( $af $o $e1)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_af.nextNode(), root_1);
				adaptor.addChild(root_1, stream_o.nextTree());
				adaptor.addChild(root_1, stream_e1.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 87:4: -> $o
			{
				adaptor.addChild(root_0, stream_o.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "affect"


	public static class orop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orop"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:90:1: orop : a1= andop (ortoken= '|' ^ andop )* ;
	public final Tiger3Parser.orop_return orop() throws RecognitionException {
		Tiger3Parser.orop_return retval = new Tiger3Parser.orop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ortoken=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope andop19 =null;

		Object ortoken_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:90:6: (a1= andop (ortoken= '|' ^ andop )* )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:90:8: a1= andop (ortoken= '|' ^ andop )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andop_in_orop643);
			a1=andop();
			state._fsp--;

			adaptor.addChild(root_0, a1.getTree());

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:90:17: (ortoken= '|' ^ andop )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==74) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:90:18: ortoken= '|' ^ andop
					{
					ortoken=(Token)match(input,74,FOLLOW_74_in_orop648); 
					ortoken_tree = (Object)adaptor.create(ortoken);
					root_0 = (Object)adaptor.becomeRoot(ortoken_tree, root_0);

					pushFollow(FOLLOW_andop_in_orop651);
					andop19=andop();
					state._fsp--;

					adaptor.addChild(root_0, andop19.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orop"


	public static class andop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andop"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:93:1: andop : c1= comp (andtoken= '&' ^ comp )* ;
	public final Tiger3Parser.andop_return andop() throws RecognitionException {
		Tiger3Parser.andop_return retval = new Tiger3Parser.andop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token andtoken=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope comp20 =null;

		Object andtoken_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:93:7: (c1= comp (andtoken= '&' ^ comp )* )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:93:9: c1= comp (andtoken= '&' ^ comp )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_comp_in_andop666);
			c1=comp();
			state._fsp--;

			adaptor.addChild(root_0, c1.getTree());

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:93:17: (andtoken= '&' ^ comp )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==34) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:93:18: andtoken= '&' ^ comp
					{
					andtoken=(Token)match(input,34,FOLLOW_34_in_andop671); 
					andtoken_tree = (Object)adaptor.create(andtoken);
					root_0 = (Object)adaptor.becomeRoot(andtoken_tree, root_0);

					pushFollow(FOLLOW_comp_in_andop674);
					comp20=comp();
					state._fsp--;

					adaptor.addChild(root_0, comp20.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "andop"


	public static class comp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:1: comp : b1= binary ( (sup1= '>' (eg1= '=' )? |inf1= '<' (sup2= '>' |eg2= '=' )? |eg3= '=' ) b2= binary )? -> {$sup1 != null && $eg1 != null}? ^( COMP[\">=\"] $b1 ^( $b2) ) -> {$inf1 != null && $eg2 != null}? ^( COMP[\"<=\"] $b1 ^( $b2) ) -> {$inf1 != null && $sup2 != null}? ^( COMP[\"<>\"] $b1 ^( $b2) ) -> {$sup1 != null }? ^( $sup1 $b1 ^( $b2) ) -> {$inf1 != null }? ^( $inf1 $b1 ^( $b2) ) -> {$eg3 != null}? ^( $eg3 $b1 ^( $b2) ) -> $b1;
	public final Tiger3Parser.comp_return comp() throws RecognitionException {
		Tiger3Parser.comp_return retval = new Tiger3Parser.comp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token sup1=null;
		Token eg1=null;
		Token inf1=null;
		Token sup2=null;
		Token eg2=null;
		Token eg3=null;
		ParserRuleReturnScope b1 =null;
		ParserRuleReturnScope b2 =null;

		Object sup1_tree=null;
		Object eg1_tree=null;
		Object inf1_tree=null;
		Object sup2_tree=null;
		Object eg2_tree=null;
		Object eg3_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleSubtreeStream stream_binary=new RewriteRuleSubtreeStream(adaptor,"rule binary");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:6: (b1= binary ( (sup1= '>' (eg1= '=' )? |inf1= '<' (sup2= '>' |eg2= '=' )? |eg3= '=' ) b2= binary )? -> {$sup1 != null && $eg1 != null}? ^( COMP[\">=\"] $b1 ^( $b2) ) -> {$inf1 != null && $eg2 != null}? ^( COMP[\"<=\"] $b1 ^( $b2) ) -> {$inf1 != null && $sup2 != null}? ^( COMP[\"<>\"] $b1 ^( $b2) ) -> {$sup1 != null }? ^( $sup1 $b1 ^( $b2) ) -> {$inf1 != null }? ^( $inf1 $b1 ^( $b2) ) -> {$eg3 != null}? ^( $eg3 $b1 ^( $b2) ) -> $b1)
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:8: b1= binary ( (sup1= '>' (eg1= '=' )? |inf1= '<' (sup2= '>' |eg2= '=' )? |eg3= '=' ) b2= binary )?
			{
			pushFollow(FOLLOW_binary_in_comp688);
			b1=binary();
			state._fsp--;

			stream_binary.add(b1.getTree());
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:18: ( (sup1= '>' (eg1= '=' )? |inf1= '<' (sup2= '>' |eg2= '=' )? |eg3= '=' ) b2= binary )?
			int alt16=2;
			switch ( input.LA(1) ) {
				case 48:
					{
					alt16=1;
					}
					break;
				case 46:
					{
					alt16=1;
					}
					break;
				case 47:
					{
					alt16=1;
					}
					break;
			}
			switch (alt16) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:19: (sup1= '>' (eg1= '=' )? |inf1= '<' (sup2= '>' |eg2= '=' )? |eg3= '=' ) b2= binary
					{
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:19: (sup1= '>' (eg1= '=' )? |inf1= '<' (sup2= '>' |eg2= '=' )? |eg3= '=' )
					int alt15=3;
					switch ( input.LA(1) ) {
					case 48:
						{
						alt15=1;
						}
						break;
					case 46:
						{
						alt15=2;
						}
						break;
					case 47:
						{
						alt15=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}
					switch (alt15) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:20: sup1= '>' (eg1= '=' )?
							{
							sup1=(Token)match(input,48,FOLLOW_48_in_comp694);  
							stream_48.add(sup1);

							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:28: (eg1= '=' )?
							int alt13=2;
							int LA13_0 = input.LA(1);
							if ( (LA13_0==47) ) {
								alt13=1;
							}
							switch (alt13) {
								case 1 :
									// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:29: eg1= '='
									{
									eg1=(Token)match(input,47,FOLLOW_47_in_comp698);  
									stream_47.add(eg1);

									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:41: inf1= '<' (sup2= '>' |eg2= '=' )?
							{
							inf1=(Token)match(input,46,FOLLOW_46_in_comp706);  
							stream_46.add(inf1);

							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:50: (sup2= '>' |eg2= '=' )?
							int alt14=3;
							int LA14_0 = input.LA(1);
							if ( (LA14_0==48) ) {
								alt14=1;
							}
							else if ( (LA14_0==47) ) {
								alt14=2;
							}
							switch (alt14) {
								case 1 :
									// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:51: sup2= '>'
									{
									sup2=(Token)match(input,48,FOLLOW_48_in_comp711);  
									stream_48.add(sup2);

									}
									break;
								case 2 :
									// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:62: eg2= '='
									{
									eg2=(Token)match(input,47,FOLLOW_47_in_comp717);  
									stream_47.add(eg2);

									}
									break;

							}

							}
							break;
						case 3 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:96:74: eg3= '='
							{
							eg3=(Token)match(input,47,FOLLOW_47_in_comp725);  
							stream_47.add(eg3);

							}
							break;

					}

					pushFollow(FOLLOW_binary_in_comp730);
					b2=binary();
					state._fsp--;

					stream_binary.add(b2.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: b2, b1, eg3, b2, b2, b1, b2, b2, b1, sup1, b1, inf1, b1, b2, b1, b1
			// token labels: eg3, inf1, sup1
			// rule labels: b2, retval, b1
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_eg3=new RewriteRuleTokenStream(adaptor,"token eg3",eg3);
			RewriteRuleTokenStream stream_inf1=new RewriteRuleTokenStream(adaptor,"token inf1",inf1);
			RewriteRuleTokenStream stream_sup1=new RewriteRuleTokenStream(adaptor,"token sup1",sup1);
			RewriteRuleSubtreeStream stream_b2=new RewriteRuleSubtreeStream(adaptor,"rule b2",b2!=null?b2.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_b1=new RewriteRuleSubtreeStream(adaptor,"rule b1",b1!=null?b1.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 97:4: -> {$sup1 != null && $eg1 != null}? ^( COMP[\">=\"] $b1 ^( $b2) )
			if (sup1 != null && eg1 != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:97:40: ^( COMP[\">=\"] $b1 ^( $b2) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMP, ">="), root_1);
				adaptor.addChild(root_1, stream_b1.nextTree());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:97:57: ^( $b2)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 98:4: -> {$inf1 != null && $eg2 != null}? ^( COMP[\"<=\"] $b1 ^( $b2) )
			if (inf1 != null && eg2 != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:98:40: ^( COMP[\"<=\"] $b1 ^( $b2) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMP, "<="), root_1);
				adaptor.addChild(root_1, stream_b1.nextTree());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:98:57: ^( $b2)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 99:4: -> {$inf1 != null && $sup2 != null}? ^( COMP[\"<>\"] $b1 ^( $b2) )
			if (inf1 != null && sup2 != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:99:41: ^( COMP[\"<>\"] $b1 ^( $b2) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMP, "<>"), root_1);
				adaptor.addChild(root_1, stream_b1.nextTree());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:99:58: ^( $b2)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 100:4: -> {$sup1 != null }? ^( $sup1 $b1 ^( $b2) )
			if (sup1 != null ) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:100:25: ^( $sup1 $b1 ^( $b2) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_sup1.nextNode(), root_1);
				adaptor.addChild(root_1, stream_b1.nextTree());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:100:37: ^( $b2)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 101:4: -> {$inf1 != null }? ^( $inf1 $b1 ^( $b2) )
			if (inf1 != null ) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:101:25: ^( $inf1 $b1 ^( $b2) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_inf1.nextNode(), root_1);
				adaptor.addChild(root_1, stream_b1.nextTree());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:101:37: ^( $b2)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 102:4: -> {$eg3 != null}? ^( $eg3 $b1 ^( $b2) )
			if (eg3 != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:102:23: ^( $eg3 $b1 ^( $b2) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_eg3.nextNode(), root_1);
				adaptor.addChild(root_1, stream_b1.nextTree());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:102:34: ^( $b2)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 103:4: -> $b1
			{
				adaptor.addChild(root_0, stream_b1.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comp"


	public static class binary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binary"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:105:1: binary : b2= binary2 ( addminexp ^b21= binary2 )* ;
	public final Tiger3Parser.binary_return binary() throws RecognitionException {
		Tiger3Parser.binary_return retval = new Tiger3Parser.binary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope b2 =null;
		ParserRuleReturnScope b21 =null;
		ParserRuleReturnScope addminexp21 =null;


		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:105:8: (b2= binary2 ( addminexp ^b21= binary2 )* )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:105:10: b2= binary2 ( addminexp ^b21= binary2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_binary2_in_binary871);
			b2=binary2();
			state._fsp--;

			adaptor.addChild(root_0, b2.getTree());

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:105:21: ( addminexp ^b21= binary2 )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==40) ) {
					alt17=1;
				}
				else if ( (LA17_0==38) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:105:22: addminexp ^b21= binary2
					{
					pushFollow(FOLLOW_addminexp_in_binary874);
					addminexp21=addminexp();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(addminexp21.getTree(), root_0);
					pushFollow(FOLLOW_binary2_in_binary879);
					b21=binary2();
					state._fsp--;

					adaptor.addChild(root_0, b21.getTree());

					}
					break;

				default :
					break loop17;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binary"


	public static class binary2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binary2"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:108:1: binary2 : n1= neg ( (mul= '*' ^|div= '/' ^) neg )* ;
	public final Tiger3Parser.binary2_return binary2() throws RecognitionException {
		Tiger3Parser.binary2_return retval = new Tiger3Parser.binary2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token mul=null;
		Token div=null;
		ParserRuleReturnScope n1 =null;
		ParserRuleReturnScope neg22 =null;

		Object mul_tree=null;
		Object div_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:108:9: (n1= neg ( (mul= '*' ^|div= '/' ^) neg )* )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:108:11: n1= neg ( (mul= '*' ^|div= '/' ^) neg )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_neg_in_binary2894);
			n1=neg();
			state._fsp--;

			adaptor.addChild(root_0, n1.getTree());

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:108:18: ( (mul= '*' ^|div= '/' ^) neg )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==37) ) {
					alt19=1;
				}
				else if ( (LA19_0==42) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:108:19: (mul= '*' ^|div= '/' ^) neg
					{
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:108:19: (mul= '*' ^|div= '/' ^)
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==37) ) {
						alt18=1;
					}
					else if ( (LA18_0==42) ) {
						alt18=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}

					switch (alt18) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:108:20: mul= '*' ^
							{
							mul=(Token)match(input,37,FOLLOW_37_in_binary2900); 
							mul_tree = (Object)adaptor.create(mul);
							root_0 = (Object)adaptor.becomeRoot(mul_tree, root_0);

							}
							break;
						case 2 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:108:29: div= '/' ^
							{
							div=(Token)match(input,42,FOLLOW_42_in_binary2905); 
							div_tree = (Object)adaptor.create(div);
							root_0 = (Object)adaptor.becomeRoot(div_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_neg_in_binary2909);
					neg22=neg();
					state._fsp--;

					adaptor.addChild(root_0, neg22.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binary2"


	public static class neg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "neg"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:111:1: neg : (minus= '-' )? a= atom -> {$minus != null}? ^( NEG $a) -> $a;
	public final Tiger3Parser.neg_return neg() throws RecognitionException {
		Tiger3Parser.neg_return retval = new Tiger3Parser.neg_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token minus=null;
		ParserRuleReturnScope a =null;

		Object minus_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:111:5: ( (minus= '-' )? a= atom -> {$minus != null}? ^( NEG $a) -> $a)
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:111:7: (minus= '-' )? a= atom
			{
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:111:12: (minus= '-' )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==40) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:111:12: minus= '-'
					{
					minus=(Token)match(input,40,FOLLOW_40_in_neg923);  
					stream_40.add(minus);

					}
					break;

			}

			pushFollow(FOLLOW_atom_in_neg928);
			a=atom();
			state._fsp--;

			stream_atom.add(a.getTree());
			// AST REWRITE
			// elements: a, a
			// token labels: 
			// rule labels: a, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 112:4: -> {$minus != null}? ^( NEG $a)
			if (minus != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:112:25: ^( NEG $a)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEG, "NEG"), root_1);
				adaptor.addChild(root_1, stream_a.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 113:4: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "neg"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:116:1: atom : ( '(' (e= expr_seq )? ')' -> {$e.tree != null}? $e -> EMPTY_SEQ | lvalue | INT | STRING );
	public final Tiger3Parser.atom_return atom() throws RecognitionException {
		Tiger3Parser.atom_return retval = new Tiger3Parser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal23=null;
		Token char_literal24=null;
		Token INT26=null;
		Token STRING27=null;
		ParserRuleReturnScope e =null;
		ParserRuleReturnScope lvalue25 =null;

		Object char_literal23_tree=null;
		Object char_literal24_tree=null;
		Object INT26_tree=null;
		Object STRING27_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleSubtreeStream stream_expr_seq=new RewriteRuleSubtreeStream(adaptor,"rule expr_seq");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:116:6: ( '(' (e= expr_seq )? ')' -> {$e.tree != null}? $e -> EMPTY_SEQ | lvalue | INT | STRING )
			int alt22=4;
			switch ( input.LA(1) ) {
			case 35:
				{
				alt22=1;
				}
				break;
			case ID:
				{
				alt22=2;
				}
				break;
			case INT:
				{
				alt22=3;
				}
				break;
			case STRING:
				{
				alt22=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:116:8: '(' (e= expr_seq )? ')'
					{
					char_literal23=(Token)match(input,35,FOLLOW_35_in_atom963);  
					stream_35.add(char_literal23);

					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:116:13: (e= expr_seq )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==ID||LA21_0==INT||LA21_0==STRING||LA21_0==35||LA21_0==40||LA21_0==54||LA21_0==58||LA21_0==60||(LA21_0 >= 62 && LA21_0 <= 64)||LA21_0==66||LA21_0==72) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:116:13: e= expr_seq
							{
							pushFollow(FOLLOW_expr_seq_in_atom967);
							e=expr_seq();
							state._fsp--;

							stream_expr_seq.add(e.getTree());
							}
							break;

					}

					char_literal24=(Token)match(input,36,FOLLOW_36_in_atom970);  
					stream_36.add(char_literal24);

					// AST REWRITE
					// elements: e
					// token labels: 
					// rule labels: e, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 117:4: -> {$e.tree != null}? $e
					if ((e!=null?((Object)e.getTree()):null) != null) {
						adaptor.addChild(root_0, stream_e.nextTree());
					}

					else // 118:4: -> EMPTY_SEQ
					{
						adaptor.addChild(root_0, (Object)adaptor.create(EMPTY_SEQ, "EMPTY_SEQ"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:119:5: lvalue
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lvalue_in_atom993);
					lvalue25=lvalue();
					state._fsp--;

					adaptor.addChild(root_0, lvalue25.getTree());

					}
					break;
				case 3 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:120:4: INT
					{
					root_0 = (Object)adaptor.nil();


					INT26=(Token)match(input,INT,FOLLOW_INT_in_atom998); 
					INT26_tree = (Object)adaptor.create(INT26);
					adaptor.addChild(root_0, INT26_tree);

					}
					break;
				case 4 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:121:4: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING27=(Token)match(input,STRING,FOLLOW_STRING_in_atom1003); 
					STRING27_tree = (Object)adaptor.create(STRING27);
					adaptor.addChild(root_0, STRING27_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class lvalue_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lvalue"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:124:1: lvalue : i= ID (v= lvalue2 |par= '(' (e= expr_list )? ')' |acc= '{' (l= field_list )? '}' )? -> {$par.text != null && $e.tree != null}? ^( FUNC_CALL $i ^( PARAMSEFF $e) ) -> {$par.text != null}? ^( FUNC_CALL $i) -> {$v.tree != null}? ^( $i $v) -> {$acc.text != null}? ^( $i $l) -> $i;
	public final Tiger3Parser.lvalue_return lvalue() throws RecognitionException {
		Tiger3Parser.lvalue_return retval = new Tiger3Parser.lvalue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token i=null;
		Token par=null;
		Token acc=null;
		Token char_literal28=null;
		Token char_literal29=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope e =null;
		ParserRuleReturnScope l =null;

		Object i_tree=null;
		Object par_tree=null;
		Object acc_tree=null;
		Object char_literal28_tree=null;
		Object char_literal29_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
		RewriteRuleSubtreeStream stream_lvalue2=new RewriteRuleSubtreeStream(adaptor,"rule lvalue2");
		RewriteRuleSubtreeStream stream_field_list=new RewriteRuleSubtreeStream(adaptor,"rule field_list");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:124:8: (i= ID (v= lvalue2 |par= '(' (e= expr_list )? ')' |acc= '{' (l= field_list )? '}' )? -> {$par.text != null && $e.tree != null}? ^( FUNC_CALL $i ^( PARAMSEFF $e) ) -> {$par.text != null}? ^( FUNC_CALL $i) -> {$v.tree != null}? ^( $i $v) -> {$acc.text != null}? ^( $i $l) -> $i)
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:124:10: i= ID (v= lvalue2 |par= '(' (e= expr_list )? ')' |acc= '{' (l= field_list )? '}' )?
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_lvalue1017);  
			stream_ID.add(i);

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:124:15: (v= lvalue2 |par= '(' (e= expr_list )? ')' |acc= '{' (l= field_list )? '}' )?
			int alt25=4;
			switch ( input.LA(1) ) {
				case 41:
					{
					alt25=1;
					}
					break;
				case 49:
					{
					alt25=1;
					}
					break;
				case 35:
					{
					alt25=2;
					}
					break;
				case 73:
					{
					alt25=3;
					}
					break;
			}
			switch (alt25) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:124:16: v= lvalue2
					{
					pushFollow(FOLLOW_lvalue2_in_lvalue1022);
					v=lvalue2();
					state._fsp--;

					stream_lvalue2.add(v.getTree());
					}
					break;
				case 2 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:124:28: par= '(' (e= expr_list )? ')'
					{
					par=(Token)match(input,35,FOLLOW_35_in_lvalue1028);  
					stream_35.add(par);

					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:124:37: (e= expr_list )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ID||LA23_0==INT||LA23_0==STRING||LA23_0==35||LA23_0==40||LA23_0==54||LA23_0==58||LA23_0==60||(LA23_0 >= 62 && LA23_0 <= 64)||LA23_0==66||LA23_0==72) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:124:37: e= expr_list
							{
							pushFollow(FOLLOW_expr_list_in_lvalue1032);
							e=expr_list();
							state._fsp--;

							stream_expr_list.add(e.getTree());
							}
							break;

					}

					char_literal28=(Token)match(input,36,FOLLOW_36_in_lvalue1035);  
					stream_36.add(char_literal28);

					}
					break;
				case 3 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:124:55: acc= '{' (l= field_list )? '}'
					{
					acc=(Token)match(input,73,FOLLOW_73_in_lvalue1041);  
					stream_73.add(acc);

					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:124:64: (l= field_list )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ID) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:124:64: l= field_list
							{
							pushFollow(FOLLOW_field_list_in_lvalue1045);
							l=field_list();
							state._fsp--;

							stream_field_list.add(l.getTree());
							}
							break;

					}

					char_literal29=(Token)match(input,75,FOLLOW_75_in_lvalue1048);  
					stream_75.add(char_literal29);

					}
					break;

			}

			// AST REWRITE
			// elements: v, l, i, e, i, i, i, i
			// token labels: i
			// rule labels: e, v, l, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
			RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
			RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 125:4: -> {$par.text != null && $e.tree != null}? ^( FUNC_CALL $i ^( PARAMSEFF $e) )
			if ((par!=null?par.getText():null) != null && (e!=null?((Object)e.getTree()):null) != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:125:47: ^( FUNC_CALL $i ^( PARAMSEFF $e) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
				adaptor.addChild(root_1, stream_i.nextNode());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:125:62: ^( PARAMSEFF $e)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMSEFF, "PARAMSEFF"), root_2);
				adaptor.addChild(root_2, stream_e.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 126:4: -> {$par.text != null}? ^( FUNC_CALL $i)
			if ((par!=null?par.getText():null) != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:126:28: ^( FUNC_CALL $i)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
				adaptor.addChild(root_1, stream_i.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 127:4: -> {$v.tree != null}? ^( $i $v)
			if ((v!=null?((Object)v.getTree()):null) != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:127:26: ^( $i $v)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_i.nextNode(), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 128:4: -> {$acc.text != null}? ^( $i $l)
			if ((acc!=null?acc.getText():null) != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:128:28: ^( $i $l)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_i.nextNode(), root_1);
				adaptor.addChild(root_1, stream_l.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 129:4: -> $i
			{
				adaptor.addChild(root_0, stream_i.nextNode());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lvalue"


	public static class lvalue2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lvalue2"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:132:1: lvalue2 : ( '.' ID (v= lvalue2 )? -> ^( FIELD ID ( $v)? ) | '[' e1= expr ']' (val= lvalue2 |o= ofexp e2= expr )? -> {$o.text != null}? ^( SIZE $e1) ^( INIT $e2) -> {$val.tree != null}? ^( CELL $e1) $val -> ^( CELL $e1) );
	public final Tiger3Parser.lvalue2_return lvalue2() throws RecognitionException {
		Tiger3Parser.lvalue2_return retval = new Tiger3Parser.lvalue2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal30=null;
		Token ID31=null;
		Token char_literal32=null;
		Token char_literal33=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope val =null;
		ParserRuleReturnScope o =null;
		ParserRuleReturnScope e2 =null;

		Object char_literal30_tree=null;
		Object ID31_tree=null;
		Object char_literal32_tree=null;
		Object char_literal33_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_ofexp=new RewriteRuleSubtreeStream(adaptor,"rule ofexp");
		RewriteRuleSubtreeStream stream_lvalue2=new RewriteRuleSubtreeStream(adaptor,"rule lvalue2");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:132:10: ( '.' ID (v= lvalue2 )? -> ^( FIELD ID ( $v)? ) | '[' e1= expr ']' (val= lvalue2 |o= ofexp e2= expr )? -> {$o.text != null}? ^( SIZE $e1) ^( INIT $e2) -> {$val.tree != null}? ^( CELL $e1) $val -> ^( CELL $e1) )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==41) ) {
				alt28=1;
			}
			else if ( (LA28_0==49) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:132:12: '.' ID (v= lvalue2 )?
					{
					char_literal30=(Token)match(input,41,FOLLOW_41_in_lvalue21140);  
					stream_41.add(char_literal30);

					ID31=(Token)match(input,ID,FOLLOW_ID_in_lvalue21142);  
					stream_ID.add(ID31);

					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:132:20: (v= lvalue2 )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==41) ) {
						alt26=1;
					}
					else if ( (LA26_0==49) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:132:20: v= lvalue2
							{
							pushFollow(FOLLOW_lvalue2_in_lvalue21146);
							v=lvalue2();
							state._fsp--;

							stream_lvalue2.add(v.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: v, ID
					// token labels: 
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 132:30: -> ^( FIELD ID ( $v)? )
					{
						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:132:33: ^( FIELD ID ( $v)? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:132:45: ( $v)?
						if ( stream_v.hasNext() ) {
							adaptor.addChild(root_1, stream_v.nextTree());
						}
						stream_v.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:133:4: '[' e1= expr ']' (val= lvalue2 |o= ofexp e2= expr )?
					{
					char_literal32=(Token)match(input,49,FOLLOW_49_in_lvalue21164);  
					stream_49.add(char_literal32);

					pushFollow(FOLLOW_expr_in_lvalue21168);
					e1=expr();
					state._fsp--;

					stream_expr.add(e1.getTree());
					char_literal33=(Token)match(input,50,FOLLOW_50_in_lvalue21170);  
					stream_50.add(char_literal33);

					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:133:20: (val= lvalue2 |o= ofexp e2= expr )?
					int alt27=3;
					switch ( input.LA(1) ) {
						case 41:
							{
							alt27=1;
							}
							break;
						case 49:
							{
							alt27=1;
							}
							break;
						case 65:
							{
							alt27=2;
							}
							break;
					}
					switch (alt27) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:133:21: val= lvalue2
							{
							pushFollow(FOLLOW_lvalue2_in_lvalue21175);
							val=lvalue2();
							state._fsp--;

							stream_lvalue2.add(val.getTree());
							}
							break;
						case 2 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:133:35: o= ofexp e2= expr
							{
							pushFollow(FOLLOW_ofexp_in_lvalue21181);
							o=ofexp();
							state._fsp--;

							stream_ofexp.add(o.getTree());
							pushFollow(FOLLOW_expr_in_lvalue21185);
							e2=expr();
							state._fsp--;

							stream_expr.add(e2.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: val, e1, e1, e2, e1
					// token labels: 
					// rule labels: val, e1, e2, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_val=new RewriteRuleSubtreeStream(adaptor,"rule val",val!=null?val.getTree():null);
					RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
					RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 134:4: -> {$o.text != null}? ^( SIZE $e1) ^( INIT $e2)
					if ((o!=null?input.toString(o.start,o.stop):null) != null) {
						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:134:27: ^( SIZE $e1)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIZE, "SIZE"), root_1);
						adaptor.addChild(root_1, stream_e1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:134:39: ^( INIT $e2)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_1);
						adaptor.addChild(root_1, stream_e2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 135:4: -> {$val.tree != null}? ^( CELL $e1) $val
					if ((val!=null?((Object)val.getTree()):null) != null) {
						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:135:28: ^( CELL $e1)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_1);
						adaptor.addChild(root_1, stream_e1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

						adaptor.addChild(root_0, stream_val.nextTree());
					}

					else // 136:4: -> ^( CELL $e1)
					{
						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:136:7: ^( CELL $e1)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_1);
						adaptor.addChild(root_1, stream_e1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lvalue2"


	public static class declaration_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration_list"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:139:1: declaration_list : d1= declaration (d2= declaration_list )? -> $d1 ( $d2)? ;
	public final Tiger3Parser.declaration_list_return declaration_list() throws RecognitionException {
		Tiger3Parser.declaration_list_return retval = new Tiger3Parser.declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope d1 =null;
		ParserRuleReturnScope d2 =null;

		RewriteRuleSubtreeStream stream_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule declaration_list");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:139:18: (d1= declaration (d2= declaration_list )? -> $d1 ( $d2)? )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:139:20: d1= declaration (d2= declaration_list )?
			{
			pushFollow(FOLLOW_declaration_in_declaration_list1255);
			d1=declaration();
			state._fsp--;

			stream_declaration.add(d1.getTree());
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:139:35: (d2= declaration_list )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==59||LA29_0==69||LA29_0==71) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:139:36: d2= declaration_list
					{
					pushFollow(FOLLOW_declaration_list_in_declaration_list1260);
					d2=declaration_list();
					state._fsp--;

					stream_declaration_list.add(d2.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: d1, d2
			// token labels: 
			// rule labels: d1, d2, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_d1=new RewriteRuleSubtreeStream(adaptor,"rule d1",d1!=null?d1.getTree():null);
			RewriteRuleSubtreeStream stream_d2=new RewriteRuleSubtreeStream(adaptor,"rule d2",d2!=null?d2.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 140:4: -> $d1 ( $d2)?
			{
				adaptor.addChild(root_0, stream_d1.nextTree());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:140:12: ( $d2)?
				if ( stream_d2.hasNext() ) {
					adaptor.addChild(root_0, stream_d2.nextTree());
				}
				stream_d2.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration_list"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:143:1: declaration : ( type_declaration | variable_declaration | function_declaration );
	public final Tiger3Parser.declaration_return declaration() throws RecognitionException {
		Tiger3Parser.declaration_return retval = new Tiger3Parser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration34 =null;
		ParserRuleReturnScope variable_declaration35 =null;
		ParserRuleReturnScope function_declaration36 =null;


		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:143:13: ( type_declaration | variable_declaration | function_declaration )
			int alt30=3;
			switch ( input.LA(1) ) {
			case 69:
				{
				alt30=1;
				}
				break;
			case 71:
				{
				alt30=2;
				}
				break;
			case 59:
				{
				alt30=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:143:15: type_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_declaration_in_declaration1287);
					type_declaration34=type_declaration();
					state._fsp--;

					adaptor.addChild(root_0, type_declaration34.getTree());

					}
					break;
				case 2 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:144:4: variable_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_declaration_in_declaration1292);
					variable_declaration35=variable_declaration();
					state._fsp--;

					adaptor.addChild(root_0, variable_declaration35.getTree());

					}
					break;
				case 3 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:145:4: function_declaration
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_declaration_in_declaration1297);
					function_declaration36=function_declaration();
					state._fsp--;

					adaptor.addChild(root_0, function_declaration36.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class type_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_declaration"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:148:1: type_declaration : t1= typeexp i= ID '=' t2= type -> ^( $t1 $i $t2) ;
	public final Tiger3Parser.type_declaration_return type_declaration() throws RecognitionException {
		Tiger3Parser.type_declaration_return retval = new Tiger3Parser.type_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token i=null;
		Token char_literal37=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		Object i_tree=null;
		Object char_literal37_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_typeexp=new RewriteRuleSubtreeStream(adaptor,"rule typeexp");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:149:2: (t1= typeexp i= ID '=' t2= type -> ^( $t1 $i $t2) )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:149:4: t1= typeexp i= ID '=' t2= type
			{
			pushFollow(FOLLOW_typeexp_in_type_declaration1311);
			t1=typeexp();
			state._fsp--;

			stream_typeexp.add(t1.getTree());
			i=(Token)match(input,ID,FOLLOW_ID_in_type_declaration1315);  
			stream_ID.add(i);

			char_literal37=(Token)match(input,47,FOLLOW_47_in_type_declaration1317);  
			stream_47.add(char_literal37);

			pushFollow(FOLLOW_type_in_type_declaration1321);
			t2=type();
			state._fsp--;

			stream_type.add(t2.getTree());
			// AST REWRITE
			// elements: i, t2, t1
			// token labels: i
			// rule labels: t1, t2, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.getTree():null);
			RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 150:4: -> ^( $t1 $i $t2)
			{
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:150:7: ^( $t1 $i $t2)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_t1.nextNode(), root_1);
				adaptor.addChild(root_1, stream_i.nextNode());
				adaptor.addChild(root_1, stream_t2.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_declaration"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:153:1: type : (t= type_id -> ^( PRIMITIF $t) | '{' (t= type_fields )? '}' -> {$t.tree != null}? ^( STRUCT $t) -> ^( STRUCT ) | 'array of' (t= type_id |i= ID ) -> {$t.text != null}? ^( TAB $t) -> ^( TAB $i) );
	public final Tiger3Parser.type_return type() throws RecognitionException {
		Tiger3Parser.type_return retval = new Tiger3Parser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token i=null;
		Token char_literal38=null;
		Token char_literal39=null;
		Token string_literal40=null;
		ParserRuleReturnScope t =null;

		Object i_tree=null;
		Object char_literal38_tree=null;
		Object char_literal39_tree=null;
		Object string_literal40_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
		RewriteRuleSubtreeStream stream_type_fields=new RewriteRuleSubtreeStream(adaptor,"rule type_fields");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:153:6: (t= type_id -> ^( PRIMITIF $t) | '{' (t= type_fields )? '}' -> {$t.tree != null}? ^( STRUCT $t) -> ^( STRUCT ) | 'array of' (t= type_id |i= ID ) -> {$t.text != null}? ^( TAB $t) -> ^( TAB $i) )
			int alt33=3;
			switch ( input.LA(1) ) {
			case 62:
			case 66:
				{
				alt33=1;
				}
				break;
			case 73:
				{
				alt33=2;
				}
				break;
			case 51:
				{
				alt33=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:153:8: t= type_id
					{
					pushFollow(FOLLOW_type_id_in_type1350);
					t=type_id();
					state._fsp--;

					stream_type_id.add(t.getTree());
					// AST REWRITE
					// elements: t
					// token labels: 
					// rule labels: t, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 153:18: -> ^( PRIMITIF $t)
					{
						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:153:21: ^( PRIMITIF $t)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRIMITIF, "PRIMITIF"), root_1);
						adaptor.addChild(root_1, stream_t.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:154:4: '{' (t= type_fields )? '}'
					{
					char_literal38=(Token)match(input,73,FOLLOW_73_in_type1364);  
					stream_73.add(char_literal38);

					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:154:9: (t= type_fields )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==ID) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:154:9: t= type_fields
							{
							pushFollow(FOLLOW_type_fields_in_type1368);
							t=type_fields();
							state._fsp--;

							stream_type_fields.add(t.getTree());
							}
							break;

					}

					char_literal39=(Token)match(input,75,FOLLOW_75_in_type1371);  
					stream_75.add(char_literal39);

					// AST REWRITE
					// elements: t
					// token labels: 
					// rule labels: t, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 155:4: -> {$t.tree != null}? ^( STRUCT $t)
					if ((t!=null?((Object)t.getTree()):null) != null) {
						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:155:26: ^( STRUCT $t)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRUCT, "STRUCT"), root_1);
						adaptor.addChild(root_1, stream_t.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 156:4: -> ^( STRUCT )
					{
						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:156:7: ^( STRUCT )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRUCT, "STRUCT"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:157:4: 'array of' (t= type_id |i= ID )
					{
					string_literal40=(Token)match(input,51,FOLLOW_51_in_type1401);  
					stream_51.add(string_literal40);

					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:157:15: (t= type_id |i= ID )
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==62||LA32_0==66) ) {
						alt32=1;
					}
					else if ( (LA32_0==ID) ) {
						alt32=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 32, 0, input);
						throw nvae;
					}

					switch (alt32) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:157:16: t= type_id
							{
							pushFollow(FOLLOW_type_id_in_type1406);
							t=type_id();
							state._fsp--;

							stream_type_id.add(t.getTree());
							}
							break;
						case 2 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:157:28: i= ID
							{
							i=(Token)match(input,ID,FOLLOW_ID_in_type1412);  
							stream_ID.add(i);

							}
							break;

					}

					// AST REWRITE
					// elements: t, i
					// token labels: i
					// rule labels: t, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
					RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 158:4: -> {$t.text != null}? ^( TAB $t)
					if ((t!=null?input.toString(t.start,t.stop):null) != null) {
						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:158:26: ^( TAB $t)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TAB, "TAB"), root_1);
						adaptor.addChild(root_1, stream_t.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 159:4: -> ^( TAB $i)
					{
						// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:159:7: ^( TAB $i)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TAB, "TAB"), root_1);
						adaptor.addChild(root_1, stream_i.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class variable_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variable_declaration"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:162:1: variable_declaration : vava= varexp nom= ID (depoi= ':' (typenew= ID |typebase= type_id ) )? ':=' e= expr -> {$depoi != null && $typenew.text!=null}? ^( $vava $nom $typenew $e) -> {$depoi != null && $typebase.text!=null}? ^( $vava $nom $typebase $e) -> ^( $vava $nom $e) ;
	public final Tiger3Parser.variable_declaration_return variable_declaration() throws RecognitionException {
		Tiger3Parser.variable_declaration_return retval = new Tiger3Parser.variable_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token nom=null;
		Token depoi=null;
		Token typenew=null;
		Token string_literal41=null;
		ParserRuleReturnScope vava =null;
		ParserRuleReturnScope typebase =null;
		ParserRuleReturnScope e =null;

		Object nom_tree=null;
		Object depoi_tree=null;
		Object typenew_tree=null;
		Object string_literal41_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_varexp=new RewriteRuleSubtreeStream(adaptor,"rule varexp");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:163:2: (vava= varexp nom= ID (depoi= ':' (typenew= ID |typebase= type_id ) )? ':=' e= expr -> {$depoi != null && $typenew.text!=null}? ^( $vava $nom $typenew $e) -> {$depoi != null && $typebase.text!=null}? ^( $vava $nom $typebase $e) -> ^( $vava $nom $e) )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:163:4: vava= varexp nom= ID (depoi= ':' (typenew= ID |typebase= type_id ) )? ':=' e= expr
			{
			pushFollow(FOLLOW_varexp_in_variable_declaration1452);
			vava=varexp();
			state._fsp--;

			stream_varexp.add(vava.getTree());
			nom=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration1456);  
			stream_ID.add(nom);

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:163:23: (depoi= ':' (typenew= ID |typebase= type_id ) )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==43) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:163:25: depoi= ':' (typenew= ID |typebase= type_id )
					{
					depoi=(Token)match(input,43,FOLLOW_43_in_variable_declaration1462);  
					stream_43.add(depoi);

					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:163:35: (typenew= ID |typebase= type_id )
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==ID) ) {
						alt34=1;
					}
					else if ( (LA34_0==62||LA34_0==66) ) {
						alt34=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						throw nvae;
					}

					switch (alt34) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:163:36: typenew= ID
							{
							typenew=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration1467);  
							stream_ID.add(typenew);

							}
							break;
						case 2 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:163:49: typebase= type_id
							{
							pushFollow(FOLLOW_type_id_in_variable_declaration1473);
							typebase=type_id();
							state._fsp--;

							stream_type_id.add(typebase.getTree());
							}
							break;

					}

					}
					break;

			}

			string_literal41=(Token)match(input,44,FOLLOW_44_in_variable_declaration1478);  
			stream_44.add(string_literal41);

			pushFollow(FOLLOW_expr_in_variable_declaration1482);
			e=expr();
			state._fsp--;

			stream_expr.add(e.getTree());
			// AST REWRITE
			// elements: nom, e, nom, e, vava, e, typenew, typebase, vava, nom, vava
			// token labels: typenew, nom
			// rule labels: vava, e, typebase, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_typenew=new RewriteRuleTokenStream(adaptor,"token typenew",typenew);
			RewriteRuleTokenStream stream_nom=new RewriteRuleTokenStream(adaptor,"token nom",nom);
			RewriteRuleSubtreeStream stream_vava=new RewriteRuleSubtreeStream(adaptor,"rule vava",vava!=null?vava.getTree():null);
			RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
			RewriteRuleSubtreeStream stream_typebase=new RewriteRuleSubtreeStream(adaptor,"rule typebase",typebase!=null?typebase.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 164:5: -> {$depoi != null && $typenew.text!=null}? ^( $vava $nom $typenew $e)
			if (depoi != null && (typenew!=null?typenew.getText():null)!=null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:164:49: ^( $vava $nom $typenew $e)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_vava.nextNode(), root_1);
				adaptor.addChild(root_1, stream_nom.nextNode());
				adaptor.addChild(root_1, stream_typenew.nextNode());
				adaptor.addChild(root_1, stream_e.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 165:5: -> {$depoi != null && $typebase.text!=null}? ^( $vava $nom $typebase $e)
			if (depoi != null && (typebase!=null?input.toString(typebase.start,typebase.stop):null)!=null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:165:50: ^( $vava $nom $typebase $e)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_vava.nextNode(), root_1);
				adaptor.addChild(root_1, stream_nom.nextNode());
				adaptor.addChild(root_1, stream_typebase.nextTree());
				adaptor.addChild(root_1, stream_e.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 166:5: -> ^( $vava $nom $e)
			{
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:166:8: ^( $vava $nom $e)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_vava.nextNode(), root_1);
				adaptor.addChild(root_1, stream_nom.nextNode());
				adaptor.addChild(root_1, stream_e.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable_declaration"


	public static class function_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_declaration"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:169:1: function_declaration : functionexp ID '(' (par= type_fields )? ')' ( ':' (ty= type_id |i= ID ) )? '=' (e= expr )+ -> {$par.text != null && $ty.text != null}? ^( FUNC_DECL ID ^( PARAMSFORM $par) ^( TYPE $ty) ^( BLOCK $e) ) -> {$par.text != null && $i != null}? ^( FUNC_DECL ID ^( PARAMSFORM $par) ^( TYPE $i) ^( BLOCK $e) ) -> {$par.text != null}? ^( FUNC_DECL ID ^( PARAMSFORM $par) ^( BLOCK $e) ) -> {$ty.text != null}? ^( FUNC_DECL ID ^( TYPE $ty) ^( BLOCK $e) ) -> {$i != null}? ^( FUNC_DECL ID ^( TYPE $i) ^( BLOCK $e) ) -> ^( FUNC_DECL ID ^( BLOCK $e) ) ;
	public final Tiger3Parser.function_declaration_return function_declaration() throws RecognitionException {
		Tiger3Parser.function_declaration_return retval = new Tiger3Parser.function_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token i=null;
		Token ID43=null;
		Token char_literal44=null;
		Token char_literal45=null;
		Token char_literal46=null;
		Token char_literal47=null;
		ParserRuleReturnScope par =null;
		ParserRuleReturnScope ty =null;
		ParserRuleReturnScope e =null;
		ParserRuleReturnScope functionexp42 =null;

		Object i_tree=null;
		Object ID43_tree=null;
		Object char_literal44_tree=null;
		Object char_literal45_tree=null;
		Object char_literal46_tree=null;
		Object char_literal47_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
		RewriteRuleSubtreeStream stream_type_fields=new RewriteRuleSubtreeStream(adaptor,"rule type_fields");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_functionexp=new RewriteRuleSubtreeStream(adaptor,"rule functionexp");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:170:2: ( functionexp ID '(' (par= type_fields )? ')' ( ':' (ty= type_id |i= ID ) )? '=' (e= expr )+ -> {$par.text != null && $ty.text != null}? ^( FUNC_DECL ID ^( PARAMSFORM $par) ^( TYPE $ty) ^( BLOCK $e) ) -> {$par.text != null && $i != null}? ^( FUNC_DECL ID ^( PARAMSFORM $par) ^( TYPE $i) ^( BLOCK $e) ) -> {$par.text != null}? ^( FUNC_DECL ID ^( PARAMSFORM $par) ^( BLOCK $e) ) -> {$ty.text != null}? ^( FUNC_DECL ID ^( TYPE $ty) ^( BLOCK $e) ) -> {$i != null}? ^( FUNC_DECL ID ^( TYPE $i) ^( BLOCK $e) ) -> ^( FUNC_DECL ID ^( BLOCK $e) ) )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:170:4: functionexp ID '(' (par= type_fields )? ')' ( ':' (ty= type_id |i= ID ) )? '=' (e= expr )+
			{
			pushFollow(FOLLOW_functionexp_in_function_declaration1556);
			functionexp42=functionexp();
			state._fsp--;

			stream_functionexp.add(functionexp42.getTree());
			ID43=(Token)match(input,ID,FOLLOW_ID_in_function_declaration1558);  
			stream_ID.add(ID43);

			char_literal44=(Token)match(input,35,FOLLOW_35_in_function_declaration1560);  
			stream_35.add(char_literal44);

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:170:26: (par= type_fields )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==ID) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:170:26: par= type_fields
					{
					pushFollow(FOLLOW_type_fields_in_function_declaration1564);
					par=type_fields();
					state._fsp--;

					stream_type_fields.add(par.getTree());
					}
					break;

			}

			char_literal45=(Token)match(input,36,FOLLOW_36_in_function_declaration1567);  
			stream_36.add(char_literal45);

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:170:44: ( ':' (ty= type_id |i= ID ) )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==43) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:170:45: ':' (ty= type_id |i= ID )
					{
					char_literal46=(Token)match(input,43,FOLLOW_43_in_function_declaration1570);  
					stream_43.add(char_literal46);

					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:170:49: (ty= type_id |i= ID )
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==62||LA37_0==66) ) {
						alt37=1;
					}
					else if ( (LA37_0==ID) ) {
						alt37=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						throw nvae;
					}

					switch (alt37) {
						case 1 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:170:50: ty= type_id
							{
							pushFollow(FOLLOW_type_id_in_function_declaration1575);
							ty=type_id();
							state._fsp--;

							stream_type_id.add(ty.getTree());
							}
							break;
						case 2 :
							// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:170:61: i= ID
							{
							i=(Token)match(input,ID,FOLLOW_ID_in_function_declaration1579);  
							stream_ID.add(i);

							}
							break;

					}

					}
					break;

			}

			char_literal47=(Token)match(input,47,FOLLOW_47_in_function_declaration1585);  
			stream_47.add(char_literal47);

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:170:76: (e= expr )+
			int cnt39=0;
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==ID||LA39_0==INT||LA39_0==STRING||LA39_0==35||LA39_0==40||LA39_0==54||LA39_0==58||LA39_0==60||(LA39_0 >= 62 && LA39_0 <= 64)||LA39_0==66||LA39_0==72) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:170:77: e= expr
					{
					pushFollow(FOLLOW_expr_in_function_declaration1592);
					e=expr();
					state._fsp--;

					stream_expr.add(e.getTree());
					}
					break;

				default :
					if ( cnt39 >= 1 ) break loop39;
					EarlyExitException eee = new EarlyExitException(39, input);
					throw eee;
				}
				cnt39++;
			}

			// AST REWRITE
			// elements: ID, par, i, ID, ty, ty, par, e, e, ID, e, par, i, e, e, ID, e, ID, ID
			// token labels: i
			// rule labels: par, ty, e, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_par=new RewriteRuleSubtreeStream(adaptor,"rule par",par!=null?par.getTree():null);
			RewriteRuleSubtreeStream stream_ty=new RewriteRuleSubtreeStream(adaptor,"rule ty",ty!=null?ty.getTree():null);
			RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 171:4: -> {$par.text != null && $ty.text != null}? ^( FUNC_DECL ID ^( PARAMSFORM $par) ^( TYPE $ty) ^( BLOCK $e) )
			if ((par!=null?input.toString(par.start,par.stop):null) != null && (ty!=null?input.toString(ty.start,ty.stop):null) != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:171:48: ^( FUNC_DECL ID ^( PARAMSFORM $par) ^( TYPE $ty) ^( BLOCK $e) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:171:63: ^( PARAMSFORM $par)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMSFORM, "PARAMSFORM"), root_2);
				adaptor.addChild(root_2, stream_par.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:171:82: ^( TYPE $ty)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_2);
				adaptor.addChild(root_2, stream_ty.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:171:94: ^( BLOCK $e)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				adaptor.addChild(root_2, stream_e.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 172:4: -> {$par.text != null && $i != null}? ^( FUNC_DECL ID ^( PARAMSFORM $par) ^( TYPE $i) ^( BLOCK $e) )
			if ((par!=null?input.toString(par.start,par.stop):null) != null && i != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:172:42: ^( FUNC_DECL ID ^( PARAMSFORM $par) ^( TYPE $i) ^( BLOCK $e) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:172:57: ^( PARAMSFORM $par)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMSFORM, "PARAMSFORM"), root_2);
				adaptor.addChild(root_2, stream_par.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:172:76: ^( TYPE $i)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_2);
				adaptor.addChild(root_2, stream_i.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:172:87: ^( BLOCK $e)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				adaptor.addChild(root_2, stream_e.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 173:4: -> {$par.text != null}? ^( FUNC_DECL ID ^( PARAMSFORM $par) ^( BLOCK $e) )
			if ((par!=null?input.toString(par.start,par.stop):null) != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:173:28: ^( FUNC_DECL ID ^( PARAMSFORM $par) ^( BLOCK $e) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:173:43: ^( PARAMSFORM $par)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMSFORM, "PARAMSFORM"), root_2);
				adaptor.addChild(root_2, stream_par.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:173:62: ^( BLOCK $e)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				adaptor.addChild(root_2, stream_e.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 174:4: -> {$ty.text != null}? ^( FUNC_DECL ID ^( TYPE $ty) ^( BLOCK $e) )
			if ((ty!=null?input.toString(ty.start,ty.stop):null) != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:174:27: ^( FUNC_DECL ID ^( TYPE $ty) ^( BLOCK $e) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:174:42: ^( TYPE $ty)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_2);
				adaptor.addChild(root_2, stream_ty.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:174:54: ^( BLOCK $e)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				adaptor.addChild(root_2, stream_e.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 175:4: -> {$i != null}? ^( FUNC_DECL ID ^( TYPE $i) ^( BLOCK $e) )
			if (i != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:175:21: ^( FUNC_DECL ID ^( TYPE $i) ^( BLOCK $e) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:175:36: ^( TYPE $i)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_2);
				adaptor.addChild(root_2, stream_i.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:175:47: ^( BLOCK $e)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				adaptor.addChild(root_2, stream_e.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 176:4: -> ^( FUNC_DECL ID ^( BLOCK $e) )
			{
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:176:7: ^( FUNC_DECL ID ^( BLOCK $e) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:176:22: ^( BLOCK $e)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				adaptor.addChild(root_2, stream_e.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_declaration"


	public static class type_fields_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_fields"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:179:1: type_fields : t1= type_field (t2= type_fields2 )? -> $t1 ( $t2)? ;
	public final Tiger3Parser.type_fields_return type_fields() throws RecognitionException {
		Tiger3Parser.type_fields_return retval = new Tiger3Parser.type_fields_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		RewriteRuleSubtreeStream stream_type_field=new RewriteRuleSubtreeStream(adaptor,"rule type_field");
		RewriteRuleSubtreeStream stream_type_fields2=new RewriteRuleSubtreeStream(adaptor,"rule type_fields2");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:179:13: (t1= type_field (t2= type_fields2 )? -> $t1 ( $t2)? )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:179:15: t1= type_field (t2= type_fields2 )?
			{
			pushFollow(FOLLOW_type_field_in_type_fields1776);
			t1=type_field();
			state._fsp--;

			stream_type_field.add(t1.getTree());
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:179:31: (t2= type_fields2 )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==39) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:179:31: t2= type_fields2
					{
					pushFollow(FOLLOW_type_fields2_in_type_fields1780);
					t2=type_fields2();
					state._fsp--;

					stream_type_fields2.add(t2.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: t2, t1
			// token labels: 
			// rule labels: t1, t2, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.getTree():null);
			RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 180:4: -> $t1 ( $t2)?
			{
				adaptor.addChild(root_0, stream_t1.nextTree());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:180:12: ( $t2)?
				if ( stream_t2.hasNext() ) {
					adaptor.addChild(root_0, stream_t2.nextTree());
				}
				stream_t2.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_fields"


	public static class type_fields2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_fields2"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:183:1: type_fields2 : ',' t1= type_field (t2= type_fields2 )? -> $t1 ( $t2)? ;
	public final Tiger3Parser.type_fields2_return type_fields2() throws RecognitionException {
		Tiger3Parser.type_fields2_return retval = new Tiger3Parser.type_fields2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal48=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		Object char_literal48_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_type_field=new RewriteRuleSubtreeStream(adaptor,"rule type_field");
		RewriteRuleSubtreeStream stream_type_fields2=new RewriteRuleSubtreeStream(adaptor,"rule type_fields2");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:183:14: ( ',' t1= type_field (t2= type_fields2 )? -> $t1 ( $t2)? )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:183:16: ',' t1= type_field (t2= type_fields2 )?
			{
			char_literal48=(Token)match(input,39,FOLLOW_39_in_type_fields21804);  
			stream_39.add(char_literal48);

			pushFollow(FOLLOW_type_field_in_type_fields21808);
			t1=type_field();
			state._fsp--;

			stream_type_field.add(t1.getTree());
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:183:36: (t2= type_fields2 )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==39) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:183:36: t2= type_fields2
					{
					pushFollow(FOLLOW_type_fields2_in_type_fields21812);
					t2=type_fields2();
					state._fsp--;

					stream_type_fields2.add(t2.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: t2, t1
			// token labels: 
			// rule labels: t1, t2, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.getTree():null);
			RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 184:4: -> $t1 ( $t2)?
			{
				adaptor.addChild(root_0, stream_t1.nextTree());
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:184:12: ( $t2)?
				if ( stream_t2.hasNext() ) {
					adaptor.addChild(root_0, stream_t2.nextTree());
				}
				stream_t2.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_fields2"


	public static class type_field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_field"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:187:1: type_field : i1= ID ':' (t= type_id |i2= ID ) -> {$i2.text != null}? ^( PARAM[\"p\"] $i1 $i2) -> ^( PARAM[\"p\"] $i1 $t) ;
	public final Tiger3Parser.type_field_return type_field() throws RecognitionException {
		Tiger3Parser.type_field_return retval = new Tiger3Parser.type_field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token i1=null;
		Token i2=null;
		Token char_literal49=null;
		ParserRuleReturnScope t =null;

		Object i1_tree=null;
		Object i2_tree=null;
		Object char_literal49_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:187:12: (i1= ID ':' (t= type_id |i2= ID ) -> {$i2.text != null}? ^( PARAM[\"p\"] $i1 $i2) -> ^( PARAM[\"p\"] $i1 $t) )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:187:14: i1= ID ':' (t= type_id |i2= ID )
			{
			i1=(Token)match(input,ID,FOLLOW_ID_in_type_field1838);  
			stream_ID.add(i1);

			char_literal49=(Token)match(input,43,FOLLOW_43_in_type_field1840);  
			stream_43.add(char_literal49);

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:187:24: (t= type_id |i2= ID )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==62||LA42_0==66) ) {
				alt42=1;
			}
			else if ( (LA42_0==ID) ) {
				alt42=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:187:25: t= type_id
					{
					pushFollow(FOLLOW_type_id_in_type_field1845);
					t=type_id();
					state._fsp--;

					stream_type_id.add(t.getTree());
					}
					break;
				case 2 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:187:35: i2= ID
					{
					i2=(Token)match(input,ID,FOLLOW_ID_in_type_field1849);  
					stream_ID.add(i2);

					}
					break;

			}

			// AST REWRITE
			// elements: i1, t, i1, i2
			// token labels: i1, i2
			// rule labels: t, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_i1=new RewriteRuleTokenStream(adaptor,"token i1",i1);
			RewriteRuleTokenStream stream_i2=new RewriteRuleTokenStream(adaptor,"token i2",i2);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 188:4: -> {$i2.text != null}? ^( PARAM[\"p\"] $i1 $i2)
			if ((i2!=null?i2.getText():null) != null) {
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:188:27: ^( PARAM[\"p\"] $i1 $i2)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "p"), root_1);
				adaptor.addChild(root_1, stream_i1.nextNode());
				adaptor.addChild(root_1, stream_i2.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 189:4: -> ^( PARAM[\"p\"] $i1 $t)
			{
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:189:7: ^( PARAM[\"p\"] $i1 $t)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "p"), root_1);
				adaptor.addChild(root_1, stream_i1.nextNode());
				adaptor.addChild(root_1, stream_t.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_field"


	public static class type_id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_id"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:192:1: type_id : (i= 'int' |s= 'string' ) ( lvalue2 )* ;
	public final Tiger3Parser.type_id_return type_id() throws RecognitionException {
		Tiger3Parser.type_id_return retval = new Tiger3Parser.type_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token i=null;
		Token s=null;
		ParserRuleReturnScope lvalue250 =null;

		Object i_tree=null;
		Object s_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:192:9: ( (i= 'int' |s= 'string' ) ( lvalue2 )* )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:192:11: (i= 'int' |s= 'string' ) ( lvalue2 )*
			{
			root_0 = (Object)adaptor.nil();


			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:192:11: (i= 'int' |s= 'string' )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==62) ) {
				alt43=1;
			}
			else if ( (LA43_0==66) ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:192:12: i= 'int'
					{
					i=(Token)match(input,62,FOLLOW_62_in_type_id1896); 
					i_tree = (Object)adaptor.create(i);
					adaptor.addChild(root_0, i_tree);

					}
					break;
				case 2 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:192:22: s= 'string'
					{
					s=(Token)match(input,66,FOLLOW_66_in_type_id1902); 
					s_tree = (Object)adaptor.create(s);
					adaptor.addChild(root_0, s_tree);

					}
					break;

			}

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:192:34: ( lvalue2 )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==41) ) {
					alt44=1;
				}
				else if ( (LA44_0==49) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:192:34: lvalue2
					{
					pushFollow(FOLLOW_lvalue2_in_type_id1905);
					lvalue250=lvalue2();
					state._fsp--;

					adaptor.addChild(root_0, lvalue250.getTree());

					}
					break;

				default :
					break loop44;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_id"


	public static class arrayexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:195:1: arrayexp : 'array' ;
	public final Tiger3Parser.arrayexp_return arrayexp() throws RecognitionException {
		Tiger3Parser.arrayexp_return retval = new Tiger3Parser.arrayexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal51=null;

		Object string_literal51_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:195:10: ( 'array' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:195:12: 'array'
			{
			root_0 = (Object)adaptor.nil();


			string_literal51=(Token)match(input,52,FOLLOW_52_in_arrayexp1916); 
			string_literal51_tree = (Object)adaptor.create(string_literal51);
			adaptor.addChild(root_0, string_literal51_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayexp"


	public static class breakexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "breakexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:196:1: breakexp : 'break' ;
	public final Tiger3Parser.breakexp_return breakexp() throws RecognitionException {
		Tiger3Parser.breakexp_return retval = new Tiger3Parser.breakexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal52=null;

		Object string_literal52_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:196:10: ( 'break' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:196:12: 'break'
			{
			root_0 = (Object)adaptor.nil();


			string_literal52=(Token)match(input,54,FOLLOW_54_in_breakexp1925); 
			string_literal52_tree = (Object)adaptor.create(string_literal52);
			adaptor.addChild(root_0, string_literal52_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "breakexp"


	public static class doexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "doexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:197:1: doexp : 'do' ;
	public final Tiger3Parser.doexp_return doexp() throws RecognitionException {
		Tiger3Parser.doexp_return retval = new Tiger3Parser.doexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal53=null;

		Object string_literal53_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:197:8: ( 'do' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:197:10: 'do'
			{
			root_0 = (Object)adaptor.nil();


			string_literal53=(Token)match(input,55,FOLLOW_55_in_doexp1934); 
			string_literal53_tree = (Object)adaptor.create(string_literal53);
			adaptor.addChild(root_0, string_literal53_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doexp"


	public static class elseexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elseexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:198:1: elseexp : 'else' ;
	public final Tiger3Parser.elseexp_return elseexp() throws RecognitionException {
		Tiger3Parser.elseexp_return retval = new Tiger3Parser.elseexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal54=null;

		Object string_literal54_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:198:10: ( 'else' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:198:12: 'else'
			{
			root_0 = (Object)adaptor.nil();


			string_literal54=(Token)match(input,56,FOLLOW_56_in_elseexp1944); 
			string_literal54_tree = (Object)adaptor.create(string_literal54);
			adaptor.addChild(root_0, string_literal54_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseexp"


	public static class endexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "endexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:199:1: endexp : 'end' ;
	public final Tiger3Parser.endexp_return endexp() throws RecognitionException {
		Tiger3Parser.endexp_return retval = new Tiger3Parser.endexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal55=null;

		Object string_literal55_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:199:9: ( 'end' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:199:11: 'end'
			{
			root_0 = (Object)adaptor.nil();


			string_literal55=(Token)match(input,57,FOLLOW_57_in_endexp1955); 
			string_literal55_tree = (Object)adaptor.create(string_literal55);
			adaptor.addChild(root_0, string_literal55_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "endexp"


	public static class forexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:200:1: forexp : 'for' ;
	public final Tiger3Parser.forexp_return forexp() throws RecognitionException {
		Tiger3Parser.forexp_return retval = new Tiger3Parser.forexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal56=null;

		Object string_literal56_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:200:9: ( 'for' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:200:11: 'for'
			{
			root_0 = (Object)adaptor.nil();


			string_literal56=(Token)match(input,58,FOLLOW_58_in_forexp1965); 
			string_literal56_tree = (Object)adaptor.create(string_literal56);
			adaptor.addChild(root_0, string_literal56_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forexp"


	public static class functionexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:201:1: functionexp : 'function' ;
	public final Tiger3Parser.functionexp_return functionexp() throws RecognitionException {
		Tiger3Parser.functionexp_return retval = new Tiger3Parser.functionexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal57=null;

		Object string_literal57_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:201:13: ( 'function' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:201:15: 'function'
			{
			root_0 = (Object)adaptor.nil();


			string_literal57=(Token)match(input,59,FOLLOW_59_in_functionexp1974); 
			string_literal57_tree = (Object)adaptor.create(string_literal57);
			adaptor.addChild(root_0, string_literal57_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionexp"


	public static class ifexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:202:1: ifexp : 'if' ;
	public final Tiger3Parser.ifexp_return ifexp() throws RecognitionException {
		Tiger3Parser.ifexp_return retval = new Tiger3Parser.ifexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal58=null;

		Object string_literal58_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:202:7: ( 'if' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:202:9: 'if'
			{
			root_0 = (Object)adaptor.nil();


			string_literal58=(Token)match(input,60,FOLLOW_60_in_ifexp1982); 
			string_literal58_tree = (Object)adaptor.create(string_literal58);
			adaptor.addChild(root_0, string_literal58_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifexp"


	public static class inexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:203:1: inexp : 'in' ;
	public final Tiger3Parser.inexp_return inexp() throws RecognitionException {
		Tiger3Parser.inexp_return retval = new Tiger3Parser.inexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal59=null;

		Object string_literal59_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:203:7: ( 'in' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:203:9: 'in'
			{
			root_0 = (Object)adaptor.nil();


			string_literal59=(Token)match(input,61,FOLLOW_61_in_inexp1991); 
			string_literal59_tree = (Object)adaptor.create(string_literal59);
			adaptor.addChild(root_0, string_literal59_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inexp"


	public static class nilexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nilexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:204:1: nilexp : 'nil' ;
	public final Tiger3Parser.nilexp_return nilexp() throws RecognitionException {
		Tiger3Parser.nilexp_return retval = new Tiger3Parser.nilexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal60=null;

		Object string_literal60_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:204:8: ( 'nil' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:204:10: 'nil'
			{
			root_0 = (Object)adaptor.nil();


			string_literal60=(Token)match(input,64,FOLLOW_64_in_nilexp2000); 
			string_literal60_tree = (Object)adaptor.create(string_literal60);
			adaptor.addChild(root_0, string_literal60_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nilexp"


	public static class letexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "letexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:205:1: letexp : 'let' ;
	public final Tiger3Parser.letexp_return letexp() throws RecognitionException {
		Tiger3Parser.letexp_return retval = new Tiger3Parser.letexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal61=null;

		Object string_literal61_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:205:8: ( 'let' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:205:10: 'let'
			{
			root_0 = (Object)adaptor.nil();


			string_literal61=(Token)match(input,63,FOLLOW_63_in_letexp2009); 
			string_literal61_tree = (Object)adaptor.create(string_literal61);
			adaptor.addChild(root_0, string_literal61_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "letexp"


	public static class ofexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ofexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:206:1: ofexp : 'of' ;
	public final Tiger3Parser.ofexp_return ofexp() throws RecognitionException {
		Tiger3Parser.ofexp_return retval = new Tiger3Parser.ofexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal62=null;

		Object string_literal62_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:206:7: ( 'of' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:206:9: 'of'
			{
			root_0 = (Object)adaptor.nil();


			string_literal62=(Token)match(input,65,FOLLOW_65_in_ofexp2018); 
			string_literal62_tree = (Object)adaptor.create(string_literal62);
			adaptor.addChild(root_0, string_literal62_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ofexp"


	public static class thenexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "thenexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:207:1: thenexp : 'then' ;
	public final Tiger3Parser.thenexp_return thenexp() throws RecognitionException {
		Tiger3Parser.thenexp_return retval = new Tiger3Parser.thenexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal63=null;

		Object string_literal63_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:207:9: ( 'then' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:207:11: 'then'
			{
			root_0 = (Object)adaptor.nil();


			string_literal63=(Token)match(input,67,FOLLOW_67_in_thenexp2027); 
			string_literal63_tree = (Object)adaptor.create(string_literal63);
			adaptor.addChild(root_0, string_literal63_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "thenexp"


	public static class toexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "toexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:208:1: toexp : 'to' ;
	public final Tiger3Parser.toexp_return toexp() throws RecognitionException {
		Tiger3Parser.toexp_return retval = new Tiger3Parser.toexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal64=null;

		Object string_literal64_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:208:7: ( 'to' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:208:9: 'to'
			{
			root_0 = (Object)adaptor.nil();


			string_literal64=(Token)match(input,68,FOLLOW_68_in_toexp2035); 
			string_literal64_tree = (Object)adaptor.create(string_literal64);
			adaptor.addChild(root_0, string_literal64_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "toexp"


	public static class typeexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typeexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:209:1: typeexp : 'type' ;
	public final Tiger3Parser.typeexp_return typeexp() throws RecognitionException {
		Tiger3Parser.typeexp_return retval = new Tiger3Parser.typeexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal65=null;

		Object string_literal65_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:209:9: ( 'type' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:209:11: 'type'
			{
			root_0 = (Object)adaptor.nil();


			string_literal65=(Token)match(input,69,FOLLOW_69_in_typeexp2044); 
			string_literal65_tree = (Object)adaptor.create(string_literal65);
			adaptor.addChild(root_0, string_literal65_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeexp"


	public static class varexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "varexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:210:1: varexp : 'var' ;
	public final Tiger3Parser.varexp_return varexp() throws RecognitionException {
		Tiger3Parser.varexp_return retval = new Tiger3Parser.varexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal66=null;

		Object string_literal66_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:210:8: ( 'var' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:210:10: 'var'
			{
			root_0 = (Object)adaptor.nil();


			string_literal66=(Token)match(input,71,FOLLOW_71_in_varexp2052); 
			string_literal66_tree = (Object)adaptor.create(string_literal66);
			adaptor.addChild(root_0, string_literal66_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "varexp"


	public static class whileexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:211:1: whileexp : 'while' ;
	public final Tiger3Parser.whileexp_return whileexp() throws RecognitionException {
		Tiger3Parser.whileexp_return retval = new Tiger3Parser.whileexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal67=null;

		Object string_literal67_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:211:10: ( 'while' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:211:12: 'while'
			{
			root_0 = (Object)adaptor.nil();


			string_literal67=(Token)match(input,72,FOLLOW_72_in_whileexp2061); 
			string_literal67_tree = (Object)adaptor.create(string_literal67);
			adaptor.addChild(root_0, string_literal67_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileexp"


	public static class typedefexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typedefexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:212:1: typedefexp : 'typedef' ;
	public final Tiger3Parser.typedefexp_return typedefexp() throws RecognitionException {
		Tiger3Parser.typedefexp_return retval = new Tiger3Parser.typedefexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal68=null;

		Object string_literal68_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:212:13: ( 'typedef' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:212:15: 'typedef'
			{
			root_0 = (Object)adaptor.nil();


			string_literal68=(Token)match(input,70,FOLLOW_70_in_typedefexp2070); 
			string_literal68_tree = (Object)adaptor.create(string_literal68);
			adaptor.addChild(root_0, string_literal68_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedefexp"


	public static class blockexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "blockexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:213:1: blockexp : 'block' ;
	public final Tiger3Parser.blockexp_return blockexp() throws RecognitionException {
		Tiger3Parser.blockexp_return retval = new Tiger3Parser.blockexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal69=null;

		Object string_literal69_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:213:11: ( 'block' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:213:13: 'block'
			{
			root_0 = (Object)adaptor.nil();


			string_literal69=(Token)match(input,53,FOLLOW_53_in_blockexp2080); 
			string_literal69_tree = (Object)adaptor.create(string_literal69);
			adaptor.addChild(root_0, string_literal69_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "blockexp"


	public static class addminexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addminexp"
	// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:214:1: addminexp : ( '+' | '-' );
	public final Tiger3Parser.addminexp_return addminexp() throws RecognitionException {
		Tiger3Parser.addminexp_return retval = new Tiger3Parser.addminexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set70=null;

		Object set70_tree=null;

		try {
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:214:11: ( '+' | '-' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:
			{
			root_0 = (Object)adaptor.nil();


			set70=input.LT(1);
			if ( input.LA(1)==38||input.LA(1)==40 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set70));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addminexp"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_tiger3122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nilexp_in_expr139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_affect_in_expr144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_id_in_expr149 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_expr153 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000800L});
	public static final BitSet FOLLOW_field_list_in_expr155 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_expr158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifop_in_expr165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forop_in_expr170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileop_in_expr175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breakexp_in_expr180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_letexp_in_expr187 = new BitSet(new long[]{0x2800000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_declaration_list_in_expr192 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_inexp_in_expr196 = new BitSet(new long[]{0xD640010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_seq_in_expr200 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_endexp_in_expr204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_list243 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_expr_list246 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_list_in_expr_list250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_seq278 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_expr_seq284 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_seq_in_expr_seq290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_field_list317 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_field_list319 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_field_list323 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_field_list328 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_field_list_in_field_list332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifexp_in_ifop382 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_ifop386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_thenexp_in_ifop392 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_ifop398 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_elseexp_in_ifop405 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_ifop411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forexp_in_forop466 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_forop470 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_forop472 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_forop476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_toexp_in_forop478 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_forop482 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_doexp_in_forop486 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_forop492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileexp_in_whileop543 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_whileop547 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_doexp_in_whileop551 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_whileop557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orop_in_affect594 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_affect599 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_affect603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andop_in_orop643 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_orop648 = new BitSet(new long[]{0x0000010810120000L});
	public static final BitSet FOLLOW_andop_in_orop651 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_comp_in_andop666 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_andop671 = new BitSet(new long[]{0x0000010810120000L});
	public static final BitSet FOLLOW_comp_in_andop674 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_binary_in_comp688 = new BitSet(new long[]{0x0001C00000000002L});
	public static final BitSet FOLLOW_48_in_comp694 = new BitSet(new long[]{0x0000810810120000L});
	public static final BitSet FOLLOW_47_in_comp698 = new BitSet(new long[]{0x0000010810120000L});
	public static final BitSet FOLLOW_46_in_comp706 = new BitSet(new long[]{0x0001810810120000L});
	public static final BitSet FOLLOW_48_in_comp711 = new BitSet(new long[]{0x0000010810120000L});
	public static final BitSet FOLLOW_47_in_comp717 = new BitSet(new long[]{0x0000010810120000L});
	public static final BitSet FOLLOW_47_in_comp725 = new BitSet(new long[]{0x0000010810120000L});
	public static final BitSet FOLLOW_binary_in_comp730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary2_in_binary871 = new BitSet(new long[]{0x0000014000000002L});
	public static final BitSet FOLLOW_addminexp_in_binary874 = new BitSet(new long[]{0x0000010810120000L});
	public static final BitSet FOLLOW_binary2_in_binary879 = new BitSet(new long[]{0x0000014000000002L});
	public static final BitSet FOLLOW_neg_in_binary2894 = new BitSet(new long[]{0x0000042000000002L});
	public static final BitSet FOLLOW_37_in_binary2900 = new BitSet(new long[]{0x0000010810120000L});
	public static final BitSet FOLLOW_42_in_binary2905 = new BitSet(new long[]{0x0000010810120000L});
	public static final BitSet FOLLOW_neg_in_binary2909 = new BitSet(new long[]{0x0000042000000002L});
	public static final BitSet FOLLOW_40_in_neg923 = new BitSet(new long[]{0x0000000810120000L});
	public static final BitSet FOLLOW_atom_in_neg928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_atom963 = new BitSet(new long[]{0xD440011810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_seq_in_atom967 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_atom970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_atom993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom1003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_lvalue1017 = new BitSet(new long[]{0x0002020800000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_lvalue2_in_lvalue1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_lvalue1028 = new BitSet(new long[]{0xD440011810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_list_in_lvalue1032 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_lvalue1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_lvalue1041 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000800L});
	public static final BitSet FOLLOW_field_list_in_lvalue1045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_lvalue1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_lvalue21140 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_lvalue21142 = new BitSet(new long[]{0x0002020000000002L});
	public static final BitSet FOLLOW_lvalue2_in_lvalue21146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_lvalue21164 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_lvalue21168 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_lvalue21170 = new BitSet(new long[]{0x0002020000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue2_in_lvalue21175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ofexp_in_lvalue21181 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_lvalue21185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declaration_list1255 = new BitSet(new long[]{0x0800000000000002L,0x00000000000000A0L});
	public static final BitSet FOLLOW_declaration_list_in_declaration_list1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_declaration_in_declaration1287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_declaration1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_in_declaration1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeexp_in_type_declaration1311 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_type_declaration1315 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_type_declaration1317 = new BitSet(new long[]{0x4008000000000000L,0x0000000000000204L});
	public static final BitSet FOLLOW_type_in_type_declaration1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_id_in_type1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_type1364 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000800L});
	public static final BitSet FOLLOW_type_fields_in_type1368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_type1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_type1401 = new BitSet(new long[]{0x4000000000020000L,0x0000000000000004L});
	public static final BitSet FOLLOW_type_id_in_type1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type1412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varexp_in_variable_declaration1452 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_variable_declaration1456 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_43_in_variable_declaration1462 = new BitSet(new long[]{0x4000000000020000L,0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_variable_declaration1467 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_type_id_in_variable_declaration1473 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_variable_declaration1478 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_variable_declaration1482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionexp_in_function_declaration1556 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_function_declaration1558 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_function_declaration1560 = new BitSet(new long[]{0x0000001000020000L});
	public static final BitSet FOLLOW_type_fields_in_function_declaration1564 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_function_declaration1567 = new BitSet(new long[]{0x0000880000000000L});
	public static final BitSet FOLLOW_43_in_function_declaration1570 = new BitSet(new long[]{0x4000000000020000L,0x0000000000000004L});
	public static final BitSet FOLLOW_type_id_in_function_declaration1575 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_function_declaration1579 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_function_declaration1585 = new BitSet(new long[]{0xD440010810120000L,0x0000000000000105L});
	public static final BitSet FOLLOW_expr_in_function_declaration1592 = new BitSet(new long[]{0xD440010810120002L,0x0000000000000105L});
	public static final BitSet FOLLOW_type_field_in_type_fields1776 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_type_fields2_in_type_fields1780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_type_fields21804 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_type_field_in_type_fields21808 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_type_fields2_in_type_fields21812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type_field1838 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_type_field1840 = new BitSet(new long[]{0x4000000000020000L,0x0000000000000004L});
	public static final BitSet FOLLOW_type_id_in_type_field1845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type_field1849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_type_id1896 = new BitSet(new long[]{0x0002020000000002L});
	public static final BitSet FOLLOW_66_in_type_id1902 = new BitSet(new long[]{0x0002020000000002L});
	public static final BitSet FOLLOW_lvalue2_in_type_id1905 = new BitSet(new long[]{0x0002020000000002L});
	public static final BitSet FOLLOW_52_in_arrayexp1916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_breakexp1925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_doexp1934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_elseexp1944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_endexp1955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_forexp1965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_functionexp1974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_ifexp1982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_inexp1991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_nilexp2000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_letexp2009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_ofexp2018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_thenexp2027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_toexp2035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_typeexp2044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_varexp2052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_whileexp2061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_typedefexp2070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_blockexp2080 = new BitSet(new long[]{0x0000000000000002L});
}
