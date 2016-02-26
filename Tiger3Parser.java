// $ANTLR 3.3 Nov 30, 2010 12:50:56 Tiger3.g 2016-02-26 15:12:21

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Tiger3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TAIGA", "DECLARATIONS", "BLOCK", "COMP", "COND", "BEGIN", "END", "PARAMSFORM", "PARAMSEFF", "PARAM", "TYPE", "TAB", "FIELD", "STRUCT", "CELL", "SIZE", "INIT", "PRIMITIF", "IDF", "CONST", "ID", "INT", "STRING", "WS", "NEWLINE", "COMMENT", "'{'", "'}'", "','", "';'", "':='", "'|'", "'&'", "'>'", "'='", "'<'", "'*'", "'/'", "'-'", "'('", "')'", "'.'", "'['", "']'", "'array of'", "':'", "'int'", "'string'", "'array'", "'break'", "'do'", "'else'", "'end'", "'for'", "'function'", "'if'", "'in'", "'nil'", "'let'", "'of'", "'then'", "'to'", "'type'", "'var'", "'while'", "'typedef'", "'block'", "'+'"
    };
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
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
    public static final int TAIGA=4;
    public static final int DECLARATIONS=5;
    public static final int BLOCK=6;
    public static final int COMP=7;
    public static final int COND=8;
    public static final int BEGIN=9;
    public static final int END=10;
    public static final int PARAMSFORM=11;
    public static final int PARAMSEFF=12;
    public static final int PARAM=13;
    public static final int TYPE=14;
    public static final int TAB=15;
    public static final int FIELD=16;
    public static final int STRUCT=17;
    public static final int CELL=18;
    public static final int SIZE=19;
    public static final int INIT=20;
    public static final int PRIMITIF=21;
    public static final int IDF=22;
    public static final int CONST=23;
    public static final int ID=24;
    public static final int INT=25;
    public static final int STRING=26;
    public static final int WS=27;
    public static final int NEWLINE=28;
    public static final int COMMENT=29;

    // delegates
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

    public String[] getTokenNames() { return Tiger3Parser.tokenNames; }
    public String getGrammarFileName() { return "Tiger3.g"; }


    /** Map variable name to Integer object holding value */
    HashMap<String,Integer>  memory = new HashMap<String,Integer>();


    public static class tiger3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tiger3"
    // Tiger3.g:41:1: tiger3 : e1= expr -> ^( TAIGA $e1) ;
    public final Tiger3Parser.tiger3_return tiger3() throws RecognitionException {
        Tiger3Parser.tiger3_return retval = new Tiger3Parser.tiger3_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Tiger3Parser.expr_return e1 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Tiger3.g:41:8: (e1= expr -> ^( TAIGA $e1) )
            // Tiger3.g:41:10: e1= expr
            {
            pushFollow(FOLLOW_expr_in_tiger3109);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());


            // AST REWRITE
            // elements: e1
            // token labels: 
            // rule labels: retval, e1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 41:18: -> ^( TAIGA $e1)
            {
                // Tiger3.g:41:21: ^( TAIGA $e1)
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
        }
        return retval;
    }
    // $ANTLR end "tiger3"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // Tiger3.g:43:1: expr : ( nilexp | affect | type_id ( '{' ( field_list )* '}' )? | ifop | forop | whileop | breakexp | l= letexp (decl= declaration_list )? inexp (e= expr_seq )? endexp -> ^( $l ( ^( DECLARATIONS $decl) )? ( ^( BLOCK $e) )? ) );
    public final Tiger3Parser.expr_return expr() throws RecognitionException {
        Tiger3Parser.expr_return retval = new Tiger3Parser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal4=null;
        Token char_literal6=null;
        Tiger3Parser.letexp_return l = null;

        Tiger3Parser.declaration_list_return decl = null;

        Tiger3Parser.expr_seq_return e = null;

        Tiger3Parser.nilexp_return nilexp1 = null;

        Tiger3Parser.affect_return affect2 = null;

        Tiger3Parser.type_id_return type_id3 = null;

        Tiger3Parser.field_list_return field_list5 = null;

        Tiger3Parser.ifop_return ifop7 = null;

        Tiger3Parser.forop_return forop8 = null;

        Tiger3Parser.whileop_return whileop9 = null;

        Tiger3Parser.breakexp_return breakexp10 = null;

        Tiger3Parser.inexp_return inexp11 = null;

        Tiger3Parser.endexp_return endexp12 = null;


        Object char_literal4_tree=null;
        Object char_literal6_tree=null;
        RewriteRuleSubtreeStream stream_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule declaration_list");
        RewriteRuleSubtreeStream stream_inexp=new RewriteRuleSubtreeStream(adaptor,"rule inexp");
        RewriteRuleSubtreeStream stream_letexp=new RewriteRuleSubtreeStream(adaptor,"rule letexp");
        RewriteRuleSubtreeStream stream_endexp=new RewriteRuleSubtreeStream(adaptor,"rule endexp");
        RewriteRuleSubtreeStream stream_expr_seq=new RewriteRuleSubtreeStream(adaptor,"rule expr_seq");
        try {
            // Tiger3.g:43:6: ( nilexp | affect | type_id ( '{' ( field_list )* '}' )? | ifop | forop | whileop | breakexp | l= letexp (decl= declaration_list )? inexp (e= expr_seq )? endexp -> ^( $l ( ^( DECLARATIONS $decl) )? ( ^( BLOCK $e) )? ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt5=1;
                }
                break;
            case ID:
            case INT:
            case STRING:
            case 42:
            case 43:
                {
                alt5=2;
                }
                break;
            case 50:
            case 51:
                {
                alt5=3;
                }
                break;
            case 59:
                {
                alt5=4;
                }
                break;
            case 57:
                {
                alt5=5;
                }
                break;
            case 68:
                {
                alt5=6;
                }
                break;
            case 53:
                {
                alt5=7;
                }
                break;
            case 62:
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
                    // Tiger3.g:43:8: nilexp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nilexp_in_expr126);
                    nilexp1=nilexp();

                    state._fsp--;

                    adaptor.addChild(root_0, nilexp1.getTree());

                    }
                    break;
                case 2 :
                    // Tiger3.g:44:4: affect
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_affect_in_expr131);
                    affect2=affect();

                    state._fsp--;

                    adaptor.addChild(root_0, affect2.getTree());

                    }
                    break;
                case 3 :
                    // Tiger3.g:45:4: type_id ( '{' ( field_list )* '}' )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_id_in_expr136);
                    type_id3=type_id();

                    state._fsp--;

                    adaptor.addChild(root_0, type_id3.getTree());
                    // Tiger3.g:45:12: ( '{' ( field_list )* '}' )?
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // Tiger3.g:45:14: '{' ( field_list )* '}'
                            {
                            char_literal4=(Token)match(input,30,FOLLOW_30_in_expr140); 
                            char_literal4_tree = (Object)adaptor.create(char_literal4);
                            adaptor.addChild(root_0, char_literal4_tree);

                            // Tiger3.g:45:18: ( field_list )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==ID||LA1_0==32) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // Tiger3.g:45:18: field_list
                            	    {
                            	    pushFollow(FOLLOW_field_list_in_expr142);
                            	    field_list5=field_list();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, field_list5.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop1;
                                }
                            } while (true);

                            char_literal6=(Token)match(input,31,FOLLOW_31_in_expr145); 
                            char_literal6_tree = (Object)adaptor.create(char_literal6);
                            adaptor.addChild(root_0, char_literal6_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // Tiger3.g:46:4: ifop
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifop_in_expr152);
                    ifop7=ifop();

                    state._fsp--;

                    adaptor.addChild(root_0, ifop7.getTree());

                    }
                    break;
                case 5 :
                    // Tiger3.g:47:4: forop
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forop_in_expr157);
                    forop8=forop();

                    state._fsp--;

                    adaptor.addChild(root_0, forop8.getTree());

                    }
                    break;
                case 6 :
                    // Tiger3.g:48:4: whileop
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileop_in_expr162);
                    whileop9=whileop();

                    state._fsp--;

                    adaptor.addChild(root_0, whileop9.getTree());

                    }
                    break;
                case 7 :
                    // Tiger3.g:49:4: breakexp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakexp_in_expr167);
                    breakexp10=breakexp();

                    state._fsp--;

                    adaptor.addChild(root_0, breakexp10.getTree());

                    }
                    break;
                case 8 :
                    // Tiger3.g:50:4: l= letexp (decl= declaration_list )? inexp (e= expr_seq )? endexp
                    {
                    pushFollow(FOLLOW_letexp_in_expr174);
                    l=letexp();

                    state._fsp--;

                    stream_letexp.add(l.getTree());
                    // Tiger3.g:50:18: (decl= declaration_list )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==58||(LA3_0>=66 && LA3_0<=67)) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Tiger3.g:50:18: decl= declaration_list
                            {
                            pushFollow(FOLLOW_declaration_list_in_expr179);
                            decl=declaration_list();

                            state._fsp--;

                            stream_declaration_list.add(decl.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_inexp_in_expr183);
                    inexp11=inexp();

                    state._fsp--;

                    stream_inexp.add(inexp11.getTree());
                    // Tiger3.g:50:45: (e= expr_seq )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=ID && LA4_0<=STRING)||(LA4_0>=42 && LA4_0<=43)||(LA4_0>=50 && LA4_0<=51)||LA4_0==53||LA4_0==57||LA4_0==59||(LA4_0>=61 && LA4_0<=62)||LA4_0==68) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Tiger3.g:50:45: e= expr_seq
                            {
                            pushFollow(FOLLOW_expr_seq_in_expr187);
                            e=expr_seq();

                            state._fsp--;

                            stream_expr_seq.add(e.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_endexp_in_expr191);
                    endexp12=endexp();

                    state._fsp--;

                    stream_endexp.add(endexp12.getTree());


                    // AST REWRITE
                    // elements: l, decl, e
                    // token labels: 
                    // rule labels: retval, e, l, decl
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
                    RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);
                    RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl",decl!=null?decl.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 51:4: -> ^( $l ( ^( DECLARATIONS $decl) )? ( ^( BLOCK $e) )? )
                    {
                        // Tiger3.g:51:7: ^( $l ( ^( DECLARATIONS $decl) )? ( ^( BLOCK $e) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_l.nextNode(), root_1);

                        // Tiger3.g:51:12: ( ^( DECLARATIONS $decl) )?
                        if ( stream_decl.hasNext() ) {
                            // Tiger3.g:51:12: ^( DECLARATIONS $decl)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_2);

                            adaptor.addChild(root_2, stream_decl.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_decl.reset();
                        // Tiger3.g:51:35: ( ^( BLOCK $e) )?
                        if ( stream_e.hasNext() ) {
                            // Tiger3.g:51:35: ^( BLOCK $e)
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
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class expr_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_list"
    // Tiger3.g:54:1: expr_list : e1= expr ( ',' e2= expr_list )? -> $e1 ( $e2)? ;
    public final Tiger3Parser.expr_list_return expr_list() throws RecognitionException {
        Tiger3Parser.expr_list_return retval = new Tiger3Parser.expr_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        Tiger3Parser.expr_return e1 = null;

        Tiger3Parser.expr_list_return e2 = null;


        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // Tiger3.g:54:12: (e1= expr ( ',' e2= expr_list )? -> $e1 ( $e2)? )
            // Tiger3.g:54:14: e1= expr ( ',' e2= expr_list )?
            {
            pushFollow(FOLLOW_expr_in_expr_list230);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            // Tiger3.g:54:22: ( ',' e2= expr_list )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Tiger3.g:54:23: ',' e2= expr_list
                    {
                    char_literal13=(Token)match(input,32,FOLLOW_32_in_expr_list233);  
                    stream_32.add(char_literal13);

                    pushFollow(FOLLOW_expr_list_in_expr_list237);
                    e2=expr_list();

                    state._fsp--;

                    stream_expr_list.add(e2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: e2, e1
            // token labels: 
            // rule labels: retval, e1, e2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 55:4: -> $e1 ( $e2)?
            {
                adaptor.addChild(root_0, stream_e1.nextTree());
                // Tiger3.g:55:11: ( $e2)?
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
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    public static class expr_seq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_seq"
    // Tiger3.g:58:1: expr_seq : e1= expr (pv= ';' e2= expr_seq )? -> $e1 ( $e2)? ;
    public final Tiger3Parser.expr_seq_return expr_seq() throws RecognitionException {
        Tiger3Parser.expr_seq_return retval = new Tiger3Parser.expr_seq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token pv=null;
        Tiger3Parser.expr_return e1 = null;

        Tiger3Parser.expr_seq_return e2 = null;


        Object pv_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_expr_seq=new RewriteRuleSubtreeStream(adaptor,"rule expr_seq");
        try {
            // Tiger3.g:58:10: (e1= expr (pv= ';' e2= expr_seq )? -> $e1 ( $e2)? )
            // Tiger3.g:58:12: e1= expr (pv= ';' e2= expr_seq )?
            {
            pushFollow(FOLLOW_expr_in_expr_seq265);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            // Tiger3.g:58:21: (pv= ';' e2= expr_seq )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Tiger3.g:58:22: pv= ';' e2= expr_seq
                    {
                    pv=(Token)match(input,33,FOLLOW_33_in_expr_seq271);  
                    stream_33.add(pv);

                    pushFollow(FOLLOW_expr_seq_in_expr_seq277);
                    e2=expr_seq();

                    state._fsp--;

                    stream_expr_seq.add(e2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: e2, e1
            // token labels: 
            // rule labels: retval, e1, e2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 59:4: -> $e1 ( $e2)?
            {
                adaptor.addChild(root_0, stream_e1.nextTree());
                // Tiger3.g:59:11: ( $e2)?
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
        }
        return retval;
    }
    // $ANTLR end "expr_seq"

    public static class field_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_list"
    // Tiger3.g:62:1: field_list : ( ID ':=' expr | ',' ID ':=' expr );
    public final Tiger3Parser.field_list_return field_list() throws RecognitionException {
        Tiger3Parser.field_list_return retval = new Tiger3Parser.field_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID14=null;
        Token string_literal15=null;
        Token char_literal17=null;
        Token ID18=null;
        Token string_literal19=null;
        Tiger3Parser.expr_return expr16 = null;

        Tiger3Parser.expr_return expr20 = null;


        Object ID14_tree=null;
        Object string_literal15_tree=null;
        Object char_literal17_tree=null;
        Object ID18_tree=null;
        Object string_literal19_tree=null;

        try {
            // Tiger3.g:62:12: ( ID ':=' expr | ',' ID ':=' expr )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==32) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // Tiger3.g:62:14: ID ':=' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ID14=(Token)match(input,ID,FOLLOW_ID_in_field_list302); 
                    ID14_tree = (Object)adaptor.create(ID14);
                    adaptor.addChild(root_0, ID14_tree);

                    string_literal15=(Token)match(input,34,FOLLOW_34_in_field_list304); 
                    string_literal15_tree = (Object)adaptor.create(string_literal15);
                    adaptor.addChild(root_0, string_literal15_tree);

                    pushFollow(FOLLOW_expr_in_field_list306);
                    expr16=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr16.getTree());

                    }
                    break;
                case 2 :
                    // Tiger3.g:62:29: ',' ID ':=' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal17=(Token)match(input,32,FOLLOW_32_in_field_list310); 
                    char_literal17_tree = (Object)adaptor.create(char_literal17);
                    adaptor.addChild(root_0, char_literal17_tree);

                    ID18=(Token)match(input,ID,FOLLOW_ID_in_field_list312); 
                    ID18_tree = (Object)adaptor.create(ID18);
                    adaptor.addChild(root_0, ID18_tree);

                    string_literal19=(Token)match(input,34,FOLLOW_34_in_field_list314); 
                    string_literal19_tree = (Object)adaptor.create(string_literal19);
                    adaptor.addChild(root_0, string_literal19_tree);

                    pushFollow(FOLLOW_expr_in_field_list316);
                    expr20=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr20.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "field_list"

    public static class ifop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifop"
    // Tiger3.g:65:1: ifop : fi= ifexp e1= expr th= thenexp e2= expr (els= elseexp e3= expr )? -> ^( $fi ^( COND $e1) ^( $th $e2) ( ^( $els $e3) )? ) ;
    public final Tiger3Parser.ifop_return ifop() throws RecognitionException {
        Tiger3Parser.ifop_return retval = new Tiger3Parser.ifop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Tiger3Parser.ifexp_return fi = null;

        Tiger3Parser.expr_return e1 = null;

        Tiger3Parser.thenexp_return th = null;

        Tiger3Parser.expr_return e2 = null;

        Tiger3Parser.elseexp_return els = null;

        Tiger3Parser.expr_return e3 = null;


        RewriteRuleSubtreeStream stream_ifexp=new RewriteRuleSubtreeStream(adaptor,"rule ifexp");
        RewriteRuleSubtreeStream stream_elseexp=new RewriteRuleSubtreeStream(adaptor,"rule elseexp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_thenexp=new RewriteRuleSubtreeStream(adaptor,"rule thenexp");
        try {
            // Tiger3.g:65:6: (fi= ifexp e1= expr th= thenexp e2= expr (els= elseexp e3= expr )? -> ^( $fi ^( COND $e1) ^( $th $e2) ( ^( $els $e3) )? ) )
            // Tiger3.g:65:8: fi= ifexp e1= expr th= thenexp e2= expr (els= elseexp e3= expr )?
            {
            pushFollow(FOLLOW_ifexp_in_ifop330);
            fi=ifexp();

            state._fsp--;

            stream_ifexp.add(fi.getTree());
            pushFollow(FOLLOW_expr_in_ifop334);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            pushFollow(FOLLOW_thenexp_in_ifop340);
            th=thenexp();

            state._fsp--;

            stream_thenexp.add(th.getTree());
            pushFollow(FOLLOW_expr_in_ifop346);
            e2=expr();

            state._fsp--;

            stream_expr.add(e2.getTree());
            // Tiger3.g:65:50: (els= elseexp e3= expr )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // Tiger3.g:65:51: els= elseexp e3= expr
                    {
                    pushFollow(FOLLOW_elseexp_in_ifop353);
                    els=elseexp();

                    state._fsp--;

                    stream_elseexp.add(els.getTree());
                    pushFollow(FOLLOW_expr_in_ifop359);
                    e3=expr();

                    state._fsp--;

                    stream_expr.add(e3.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: e3, th, fi, els, e1, e2
            // token labels: 
            // rule labels: e3, retval, e1, e2, fi, els, th
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_e3=new RewriteRuleSubtreeStream(adaptor,"rule e3",e3!=null?e3.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);
            RewriteRuleSubtreeStream stream_fi=new RewriteRuleSubtreeStream(adaptor,"rule fi",fi!=null?fi.tree:null);
            RewriteRuleSubtreeStream stream_els=new RewriteRuleSubtreeStream(adaptor,"rule els",els!=null?els.tree:null);
            RewriteRuleSubtreeStream stream_th=new RewriteRuleSubtreeStream(adaptor,"rule th",th!=null?th.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:4: -> ^( $fi ^( COND $e1) ^( $th $e2) ( ^( $els $e3) )? )
            {
                // Tiger3.g:66:7: ^( $fi ^( COND $e1) ^( $th $e2) ( ^( $els $e3) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fi.nextNode(), root_1);

                // Tiger3.g:66:13: ^( COND $e1)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);

                adaptor.addChild(root_2, stream_e1.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // Tiger3.g:66:25: ^( $th $e2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_th.nextNode(), root_2);

                adaptor.addChild(root_2, stream_e2.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // Tiger3.g:66:36: ( ^( $els $e3) )?
                if ( stream_e3.hasNext()||stream_els.hasNext() ) {
                    // Tiger3.g:66:36: ^( $els $e3)
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
        }
        return retval;
    }
    // $ANTLR end "ifop"

    public static class forop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forop"
    // Tiger3.g:70:1: forop : fo= forexp dd= ID ':=' e1= expr toexp e2= expr doexp e3= expr -> ^( $fo ^( $dd ^( BEGIN $e1) ^( END $e2) ) ^( BLOCK $e3) ) ;
    public final Tiger3Parser.forop_return forop() throws RecognitionException {
        Tiger3Parser.forop_return retval = new Tiger3Parser.forop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token dd=null;
        Token string_literal21=null;
        Tiger3Parser.forexp_return fo = null;

        Tiger3Parser.expr_return e1 = null;

        Tiger3Parser.expr_return e2 = null;

        Tiger3Parser.expr_return e3 = null;

        Tiger3Parser.toexp_return toexp22 = null;

        Tiger3Parser.doexp_return doexp23 = null;


        Object dd_tree=null;
        Object string_literal21_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_toexp=new RewriteRuleSubtreeStream(adaptor,"rule toexp");
        RewriteRuleSubtreeStream stream_forexp=new RewriteRuleSubtreeStream(adaptor,"rule forexp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_doexp=new RewriteRuleSubtreeStream(adaptor,"rule doexp");
        try {
            // Tiger3.g:70:7: (fo= forexp dd= ID ':=' e1= expr toexp e2= expr doexp e3= expr -> ^( $fo ^( $dd ^( BEGIN $e1) ^( END $e2) ) ^( BLOCK $e3) ) )
            // Tiger3.g:70:9: fo= forexp dd= ID ':=' e1= expr toexp e2= expr doexp e3= expr
            {
            pushFollow(FOLLOW_forexp_in_forop414);
            fo=forexp();

            state._fsp--;

            stream_forexp.add(fo.getTree());
            dd=(Token)match(input,ID,FOLLOW_ID_in_forop418);  
            stream_ID.add(dd);

            string_literal21=(Token)match(input,34,FOLLOW_34_in_forop420);  
            stream_34.add(string_literal21);

            pushFollow(FOLLOW_expr_in_forop424);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            pushFollow(FOLLOW_toexp_in_forop426);
            toexp22=toexp();

            state._fsp--;

            stream_toexp.add(toexp22.getTree());
            pushFollow(FOLLOW_expr_in_forop430);
            e2=expr();

            state._fsp--;

            stream_expr.add(e2.getTree());
            pushFollow(FOLLOW_doexp_in_forop434);
            doexp23=doexp();

            state._fsp--;

            stream_doexp.add(doexp23.getTree());
            pushFollow(FOLLOW_expr_in_forop440);
            e3=expr();

            state._fsp--;

            stream_expr.add(e3.getTree());


            // AST REWRITE
            // elements: e3, dd, fo, e2, e1
            // token labels: dd
            // rule labels: e3, retval, e1, e2, fo
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_dd=new RewriteRuleTokenStream(adaptor,"token dd",dd);
            RewriteRuleSubtreeStream stream_e3=new RewriteRuleSubtreeStream(adaptor,"rule e3",e3!=null?e3.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);
            RewriteRuleSubtreeStream stream_fo=new RewriteRuleSubtreeStream(adaptor,"rule fo",fo!=null?fo.tree:null);

            root_0 = (Object)adaptor.nil();
            // 71:4: -> ^( $fo ^( $dd ^( BEGIN $e1) ^( END $e2) ) ^( BLOCK $e3) )
            {
                // Tiger3.g:71:7: ^( $fo ^( $dd ^( BEGIN $e1) ^( END $e2) ) ^( BLOCK $e3) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fo.nextNode(), root_1);

                // Tiger3.g:71:13: ^( $dd ^( BEGIN $e1) ^( END $e2) )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_dd.nextNode(), root_2);

                // Tiger3.g:71:19: ^( BEGIN $e1)
                {
                Object root_3 = (Object)adaptor.nil();
                root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(BEGIN, "BEGIN"), root_3);

                adaptor.addChild(root_3, stream_e1.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                // Tiger3.g:71:32: ^( END $e2)
                {
                Object root_3 = (Object)adaptor.nil();
                root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(END, "END"), root_3);

                adaptor.addChild(root_3, stream_e2.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }
                // Tiger3.g:71:44: ^( BLOCK $e3)
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
        }
        return retval;
    }
    // $ANTLR end "forop"

    public static class whileop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileop"
    // Tiger3.g:74:1: whileop : whi= whileexp e1= expr doexp e2= expr -> ^( $whi ^( COND $e1) ^( BLOCK $e2) ) ;
    public final Tiger3Parser.whileop_return whileop() throws RecognitionException {
        Tiger3Parser.whileop_return retval = new Tiger3Parser.whileop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Tiger3Parser.whileexp_return whi = null;

        Tiger3Parser.expr_return e1 = null;

        Tiger3Parser.expr_return e2 = null;

        Tiger3Parser.doexp_return doexp24 = null;


        RewriteRuleSubtreeStream stream_whileexp=new RewriteRuleSubtreeStream(adaptor,"rule whileexp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_doexp=new RewriteRuleSubtreeStream(adaptor,"rule doexp");
        try {
            // Tiger3.g:74:9: (whi= whileexp e1= expr doexp e2= expr -> ^( $whi ^( COND $e1) ^( BLOCK $e2) ) )
            // Tiger3.g:74:11: whi= whileexp e1= expr doexp e2= expr
            {
            pushFollow(FOLLOW_whileexp_in_whileop491);
            whi=whileexp();

            state._fsp--;

            stream_whileexp.add(whi.getTree());
            pushFollow(FOLLOW_expr_in_whileop495);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            pushFollow(FOLLOW_doexp_in_whileop499);
            doexp24=doexp();

            state._fsp--;

            stream_doexp.add(doexp24.getTree());
            pushFollow(FOLLOW_expr_in_whileop505);
            e2=expr();

            state._fsp--;

            stream_expr.add(e2.getTree());


            // AST REWRITE
            // elements: whi, e2, e1
            // token labels: 
            // rule labels: retval, e1, e2, whi
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);
            RewriteRuleSubtreeStream stream_whi=new RewriteRuleSubtreeStream(adaptor,"rule whi",whi!=null?whi.tree:null);

            root_0 = (Object)adaptor.nil();
            // 75:4: -> ^( $whi ^( COND $e1) ^( BLOCK $e2) )
            {
                // Tiger3.g:75:7: ^( $whi ^( COND $e1) ^( BLOCK $e2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_whi.nextNode(), root_1);

                // Tiger3.g:75:14: ^( COND $e1)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);

                adaptor.addChild(root_2, stream_e1.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // Tiger3.g:75:26: ^( BLOCK $e2)
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
        }
        return retval;
    }
    // $ANTLR end "whileop"

    public static class affect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "affect"
    // Tiger3.g:78:1: affect : o= orop (af= ':=' e1= expr )? -> {$af != null}? ^( $af $o $e1) -> $o;
    public final Tiger3Parser.affect_return affect() throws RecognitionException {
        Tiger3Parser.affect_return retval = new Tiger3Parser.affect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token af=null;
        Tiger3Parser.orop_return o = null;

        Tiger3Parser.expr_return e1 = null;


        Object af_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_orop=new RewriteRuleSubtreeStream(adaptor,"rule orop");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Tiger3.g:78:8: (o= orop (af= ':=' e1= expr )? -> {$af != null}? ^( $af $o $e1) -> $o)
            // Tiger3.g:78:10: o= orop (af= ':=' e1= expr )?
            {
            pushFollow(FOLLOW_orop_in_affect542);
            o=orop();

            state._fsp--;

            stream_orop.add(o.getTree());
            // Tiger3.g:78:17: (af= ':=' e1= expr )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // Tiger3.g:78:18: af= ':=' e1= expr
                    {
                    af=(Token)match(input,34,FOLLOW_34_in_affect547);  
                    stream_34.add(af);

                    pushFollow(FOLLOW_expr_in_affect551);
                    e1=expr();

                    state._fsp--;

                    stream_expr.add(e1.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: e1, o, af, o
            // token labels: af
            // rule labels: retval, e1, o
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_af=new RewriteRuleTokenStream(adaptor,"token af",af);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:4: -> {$af != null}? ^( $af $o $e1)
            if (af != null) {
                // Tiger3.g:79:22: ^( $af $o $e1)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_af.nextNode(), root_1);

                adaptor.addChild(root_1, stream_o.nextTree());
                adaptor.addChild(root_1, stream_e1.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 80:4: -> $o
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
        }
        return retval;
    }
    // $ANTLR end "affect"

    public static class orop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orop"
    // Tiger3.g:83:1: orop : a1= andop (ortoken= '|' andop )* ;
    public final Tiger3Parser.orop_return orop() throws RecognitionException {
        Tiger3Parser.orop_return retval = new Tiger3Parser.orop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ortoken=null;
        Tiger3Parser.andop_return a1 = null;

        Tiger3Parser.andop_return andop25 = null;


        Object ortoken_tree=null;

        try {
            // Tiger3.g:83:6: (a1= andop (ortoken= '|' andop )* )
            // Tiger3.g:83:8: a1= andop (ortoken= '|' andop )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andop_in_orop591);
            a1=andop();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());
            // Tiger3.g:83:17: (ortoken= '|' andop )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // Tiger3.g:83:18: ortoken= '|' andop
            	    {
            	    ortoken=(Token)match(input,35,FOLLOW_35_in_orop596); 
            	    ortoken_tree = (Object)adaptor.create(ortoken);
            	    root_0 = (Object)adaptor.becomeRoot(ortoken_tree, root_0);

            	    pushFollow(FOLLOW_andop_in_orop599);
            	    andop25=andop();

            	    state._fsp--;

            	    adaptor.addChild(root_0, andop25.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "orop"

    public static class andop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andop"
    // Tiger3.g:86:1: andop : c1= comp (andtoken= '&' comp )* ;
    public final Tiger3Parser.andop_return andop() throws RecognitionException {
        Tiger3Parser.andop_return retval = new Tiger3Parser.andop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token andtoken=null;
        Tiger3Parser.comp_return c1 = null;

        Tiger3Parser.comp_return comp26 = null;


        Object andtoken_tree=null;

        try {
            // Tiger3.g:86:7: (c1= comp (andtoken= '&' comp )* )
            // Tiger3.g:86:9: c1= comp (andtoken= '&' comp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_comp_in_andop614);
            c1=comp();

            state._fsp--;

            adaptor.addChild(root_0, c1.getTree());
            // Tiger3.g:86:17: (andtoken= '&' comp )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // Tiger3.g:86:18: andtoken= '&' comp
            	    {
            	    andtoken=(Token)match(input,36,FOLLOW_36_in_andop619); 
            	    andtoken_tree = (Object)adaptor.create(andtoken);
            	    root_0 = (Object)adaptor.becomeRoot(andtoken_tree, root_0);

            	    pushFollow(FOLLOW_comp_in_andop622);
            	    comp26=comp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comp26.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "andop"

    public static class comp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comp"
    // Tiger3.g:89:1: comp : b1= binary ( (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' ) b2= binary )? -> {$sup1 != null && $eg1 != null}? ^( COMP[\">=\"] $b1 ^( $b2) ) -> {$inf1 != null && $eg2 != null}? ^( COMP[\"<=\"] $b1 ^( $b2) ) -> {$inf1 != null && $sup2 != null}? ^( COMP[\"<>\"] $b1 ^( $b2) ) -> {$sup1 != null }? ^( $sup1 $b1 ^( $b2) ) -> {$inf1 != null }? ^( $inf1 $b1 ^( $b2) ) -> {$eg3 != null}? ^( $eg3 $b1 ^( $b2) ) -> $b1;
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
        Tiger3Parser.binary_return b1 = null;

        Tiger3Parser.binary_return b2 = null;


        Object sup1_tree=null;
        Object eg1_tree=null;
        Object inf1_tree=null;
        Object sup2_tree=null;
        Object eg2_tree=null;
        Object eg3_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_binary=new RewriteRuleSubtreeStream(adaptor,"rule binary");
        try {
            // Tiger3.g:89:6: (b1= binary ( (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' ) b2= binary )? -> {$sup1 != null && $eg1 != null}? ^( COMP[\">=\"] $b1 ^( $b2) ) -> {$inf1 != null && $eg2 != null}? ^( COMP[\"<=\"] $b1 ^( $b2) ) -> {$inf1 != null && $sup2 != null}? ^( COMP[\"<>\"] $b1 ^( $b2) ) -> {$sup1 != null }? ^( $sup1 $b1 ^( $b2) ) -> {$inf1 != null }? ^( $inf1 $b1 ^( $b2) ) -> {$eg3 != null}? ^( $eg3 $b1 ^( $b2) ) -> $b1)
            // Tiger3.g:89:8: b1= binary ( (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' ) b2= binary )?
            {
            pushFollow(FOLLOW_binary_in_comp636);
            b1=binary();

            state._fsp--;

            stream_binary.add(b1.getTree());
            // Tiger3.g:89:18: ( (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' ) b2= binary )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // Tiger3.g:89:19: (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' ) b2= binary
                    {
                    // Tiger3.g:89:19: (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' )
                    int alt15=3;
                    switch ( input.LA(1) ) {
                    case 37:
                        {
                        alt15=1;
                        }
                        break;
                    case 39:
                        {
                        alt15=2;
                        }
                        break;
                    case 38:
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
                            // Tiger3.g:89:20: sup1= '>' (eg1= '=' )?
                            {
                            sup1=(Token)match(input,37,FOLLOW_37_in_comp642);  
                            stream_37.add(sup1);

                            // Tiger3.g:89:28: (eg1= '=' )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==38) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // Tiger3.g:89:29: eg1= '='
                                    {
                                    eg1=(Token)match(input,38,FOLLOW_38_in_comp646);  
                                    stream_38.add(eg1);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // Tiger3.g:89:41: inf1= '<' (sup2= '>' | eg2= '=' )?
                            {
                            inf1=(Token)match(input,39,FOLLOW_39_in_comp654);  
                            stream_39.add(inf1);

                            // Tiger3.g:89:50: (sup2= '>' | eg2= '=' )?
                            int alt14=3;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==37) ) {
                                alt14=1;
                            }
                            else if ( (LA14_0==38) ) {
                                alt14=2;
                            }
                            switch (alt14) {
                                case 1 :
                                    // Tiger3.g:89:51: sup2= '>'
                                    {
                                    sup2=(Token)match(input,37,FOLLOW_37_in_comp659);  
                                    stream_37.add(sup2);


                                    }
                                    break;
                                case 2 :
                                    // Tiger3.g:89:62: eg2= '='
                                    {
                                    eg2=(Token)match(input,38,FOLLOW_38_in_comp665);  
                                    stream_38.add(eg2);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // Tiger3.g:89:74: eg3= '='
                            {
                            eg3=(Token)match(input,38,FOLLOW_38_in_comp673);  
                            stream_38.add(eg3);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_binary_in_comp678);
                    b2=binary();

                    state._fsp--;

                    stream_binary.add(b2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: eg3, inf1, b2, b1, b2, sup1, b1, b2, b1, b2, b1, b2, b1, b1, b1, b2
            // token labels: eg3, sup1, inf1
            // rule labels: retval, b1, b2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_eg3=new RewriteRuleTokenStream(adaptor,"token eg3",eg3);
            RewriteRuleTokenStream stream_sup1=new RewriteRuleTokenStream(adaptor,"token sup1",sup1);
            RewriteRuleTokenStream stream_inf1=new RewriteRuleTokenStream(adaptor,"token inf1",inf1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b1=new RewriteRuleSubtreeStream(adaptor,"rule b1",b1!=null?b1.tree:null);
            RewriteRuleSubtreeStream stream_b2=new RewriteRuleSubtreeStream(adaptor,"rule b2",b2!=null?b2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 90:4: -> {$sup1 != null && $eg1 != null}? ^( COMP[\">=\"] $b1 ^( $b2) )
            if (sup1 != null && eg1 != null) {
                // Tiger3.g:90:40: ^( COMP[\">=\"] $b1 ^( $b2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMP, ">="), root_1);

                adaptor.addChild(root_1, stream_b1.nextTree());
                // Tiger3.g:90:57: ^( $b2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 91:4: -> {$inf1 != null && $eg2 != null}? ^( COMP[\"<=\"] $b1 ^( $b2) )
            if (inf1 != null && eg2 != null) {
                // Tiger3.g:91:40: ^( COMP[\"<=\"] $b1 ^( $b2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMP, "<="), root_1);

                adaptor.addChild(root_1, stream_b1.nextTree());
                // Tiger3.g:91:57: ^( $b2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 92:4: -> {$inf1 != null && $sup2 != null}? ^( COMP[\"<>\"] $b1 ^( $b2) )
            if (inf1 != null && sup2 != null) {
                // Tiger3.g:92:41: ^( COMP[\"<>\"] $b1 ^( $b2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMP, "<>"), root_1);

                adaptor.addChild(root_1, stream_b1.nextTree());
                // Tiger3.g:92:58: ^( $b2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 93:4: -> {$sup1 != null }? ^( $sup1 $b1 ^( $b2) )
            if (sup1 != null ) {
                // Tiger3.g:93:25: ^( $sup1 $b1 ^( $b2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_sup1.nextNode(), root_1);

                adaptor.addChild(root_1, stream_b1.nextTree());
                // Tiger3.g:93:37: ^( $b2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 94:4: -> {$inf1 != null }? ^( $inf1 $b1 ^( $b2) )
            if (inf1 != null ) {
                // Tiger3.g:94:25: ^( $inf1 $b1 ^( $b2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_inf1.nextNode(), root_1);

                adaptor.addChild(root_1, stream_b1.nextTree());
                // Tiger3.g:94:37: ^( $b2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 95:4: -> {$eg3 != null}? ^( $eg3 $b1 ^( $b2) )
            if (eg3 != null) {
                // Tiger3.g:95:23: ^( $eg3 $b1 ^( $b2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_eg3.nextNode(), root_1);

                adaptor.addChild(root_1, stream_b1.nextTree());
                // Tiger3.g:95:34: ^( $b2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 96:4: -> $b1
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
        }
        return retval;
    }
    // $ANTLR end "comp"

    public static class binary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binary"
    // Tiger3.g:98:1: binary : b2= binary2 ( addminexp b21= binary2 )* ;
    public final Tiger3Parser.binary_return binary() throws RecognitionException {
        Tiger3Parser.binary_return retval = new Tiger3Parser.binary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Tiger3Parser.binary2_return b2 = null;

        Tiger3Parser.binary2_return b21 = null;

        Tiger3Parser.addminexp_return addminexp27 = null;



        try {
            // Tiger3.g:98:8: (b2= binary2 ( addminexp b21= binary2 )* )
            // Tiger3.g:98:10: b2= binary2 ( addminexp b21= binary2 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_binary2_in_binary819);
            b2=binary2();

            state._fsp--;

            adaptor.addChild(root_0, b2.getTree());
            // Tiger3.g:98:21: ( addminexp b21= binary2 )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // Tiger3.g:98:22: addminexp b21= binary2
            	    {
            	    pushFollow(FOLLOW_addminexp_in_binary822);
            	    addminexp27=addminexp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(addminexp27.getTree(), root_0);
            	    pushFollow(FOLLOW_binary2_in_binary827);
            	    b21=binary2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b21.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "binary"

    public static class binary2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binary2"
    // Tiger3.g:101:1: binary2 : n1= neg ( (mul= '*' | div= '/' ) neg )* ;
    public final Tiger3Parser.binary2_return binary2() throws RecognitionException {
        Tiger3Parser.binary2_return retval = new Tiger3Parser.binary2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token mul=null;
        Token div=null;
        Tiger3Parser.neg_return n1 = null;

        Tiger3Parser.neg_return neg28 = null;


        Object mul_tree=null;
        Object div_tree=null;

        try {
            // Tiger3.g:101:9: (n1= neg ( (mul= '*' | div= '/' ) neg )* )
            // Tiger3.g:101:11: n1= neg ( (mul= '*' | div= '/' ) neg )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_neg_in_binary2842);
            n1=neg();

            state._fsp--;

            adaptor.addChild(root_0, n1.getTree());
            // Tiger3.g:101:18: ( (mul= '*' | div= '/' ) neg )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // Tiger3.g:101:19: (mul= '*' | div= '/' ) neg
            	    {
            	    // Tiger3.g:101:19: (mul= '*' | div= '/' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==40) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==41) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // Tiger3.g:101:20: mul= '*'
            	            {
            	            mul=(Token)match(input,40,FOLLOW_40_in_binary2848); 
            	            mul_tree = (Object)adaptor.create(mul);
            	            root_0 = (Object)adaptor.becomeRoot(mul_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // Tiger3.g:101:29: div= '/'
            	            {
            	            div=(Token)match(input,41,FOLLOW_41_in_binary2853); 
            	            div_tree = (Object)adaptor.create(div);
            	            root_0 = (Object)adaptor.becomeRoot(div_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_neg_in_binary2857);
            	    neg28=neg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, neg28.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "binary2"

    public static class neg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "neg"
    // Tiger3.g:104:1: neg : (minus= '-' )? a= atom -> {$minus != null}? ^( '-' $a) -> $a;
    public final Tiger3Parser.neg_return neg() throws RecognitionException {
        Tiger3Parser.neg_return retval = new Tiger3Parser.neg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token minus=null;
        Tiger3Parser.atom_return a = null;


        Object minus_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // Tiger3.g:104:5: ( (minus= '-' )? a= atom -> {$minus != null}? ^( '-' $a) -> $a)
            // Tiger3.g:104:7: (minus= '-' )? a= atom
            {
            // Tiger3.g:104:12: (minus= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Tiger3.g:104:12: minus= '-'
                    {
                    minus=(Token)match(input,42,FOLLOW_42_in_neg871);  
                    stream_42.add(minus);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_in_neg876);
            a=atom();

            state._fsp--;

            stream_atom.add(a.getTree());


            // AST REWRITE
            // elements: a, 42, a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (Object)adaptor.nil();
            // 105:4: -> {$minus != null}? ^( '-' $a)
            if (minus != null) {
                // Tiger3.g:105:25: ^( '-' $a)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_42.nextNode(), root_1);

                adaptor.addChild(root_1, stream_a.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 106:4: -> $a
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
        }
        return retval;
    }
    // $ANTLR end "neg"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // Tiger3.g:109:1: atom : ( '(' (e= expr_seq )? ')' -> {$e.tree != null}? $e -> '(' ')' | lvalue | INT | STRING );
    public final Tiger3Parser.atom_return atom() throws RecognitionException {
        Tiger3Parser.atom_return retval = new Tiger3Parser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal29=null;
        Token char_literal30=null;
        Token INT32=null;
        Token STRING33=null;
        Tiger3Parser.expr_seq_return e = null;

        Tiger3Parser.lvalue_return lvalue31 = null;


        Object char_literal29_tree=null;
        Object char_literal30_tree=null;
        Object INT32_tree=null;
        Object STRING33_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleSubtreeStream stream_expr_seq=new RewriteRuleSubtreeStream(adaptor,"rule expr_seq");
        try {
            // Tiger3.g:109:6: ( '(' (e= expr_seq )? ')' -> {$e.tree != null}? $e -> '(' ')' | lvalue | INT | STRING )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 43:
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
                    // Tiger3.g:109:8: '(' (e= expr_seq )? ')'
                    {
                    char_literal29=(Token)match(input,43,FOLLOW_43_in_atom911);  
                    stream_43.add(char_literal29);

                    // Tiger3.g:109:13: (e= expr_seq )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=ID && LA21_0<=STRING)||(LA21_0>=42 && LA21_0<=43)||(LA21_0>=50 && LA21_0<=51)||LA21_0==53||LA21_0==57||LA21_0==59||(LA21_0>=61 && LA21_0<=62)||LA21_0==68) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Tiger3.g:109:13: e= expr_seq
                            {
                            pushFollow(FOLLOW_expr_seq_in_atom915);
                            e=expr_seq();

                            state._fsp--;

                            stream_expr_seq.add(e.getTree());

                            }
                            break;

                    }

                    char_literal30=(Token)match(input,44,FOLLOW_44_in_atom918);  
                    stream_44.add(char_literal30);



                    // AST REWRITE
                    // elements: e, 43, 44
                    // token labels: 
                    // rule labels: retval, e
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:4: -> {$e.tree != null}? $e
                    if ((e!=null?((Object)e.tree):null) != null) {
                        adaptor.addChild(root_0, stream_e.nextTree());

                    }
                    else // 111:4: -> '(' ')'
                    {
                        adaptor.addChild(root_0, stream_43.nextNode());
                        adaptor.addChild(root_0, stream_44.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Tiger3.g:112:5: lvalue
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_atom942);
                    lvalue31=lvalue();

                    state._fsp--;

                    adaptor.addChild(root_0, lvalue31.getTree());

                    }
                    break;
                case 3 :
                    // Tiger3.g:113:4: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT32=(Token)match(input,INT,FOLLOW_INT_in_atom947); 
                    INT32_tree = (Object)adaptor.create(INT32);
                    adaptor.addChild(root_0, INT32_tree);


                    }
                    break;
                case 4 :
                    // Tiger3.g:114:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING33=(Token)match(input,STRING,FOLLOW_STRING_in_atom952); 
                    STRING33_tree = (Object)adaptor.create(STRING33);
                    adaptor.addChild(root_0, STRING33_tree);


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
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class lvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lvalue"
    // Tiger3.g:117:1: lvalue : i= ID (v= lvalue2 | par= '(' (e= expr_list )? ')' )? -> {$par.text != null && $e.tree != null}? ^( TYPE[\"function\"] $i ^( PARAMSEFF $e) ) -> {$par.text != null}? ^( TYPE[\"function\"] $i) -> {$v.tree != null}? ^( $i $v) -> $i;
    public final Tiger3Parser.lvalue_return lvalue() throws RecognitionException {
        Tiger3Parser.lvalue_return retval = new Tiger3Parser.lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i=null;
        Token par=null;
        Token char_literal34=null;
        Tiger3Parser.lvalue2_return v = null;

        Tiger3Parser.expr_list_return e = null;


        Object i_tree=null;
        Object par_tree=null;
        Object char_literal34_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_lvalue2=new RewriteRuleSubtreeStream(adaptor,"rule lvalue2");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // Tiger3.g:117:8: (i= ID (v= lvalue2 | par= '(' (e= expr_list )? ')' )? -> {$par.text != null && $e.tree != null}? ^( TYPE[\"function\"] $i ^( PARAMSEFF $e) ) -> {$par.text != null}? ^( TYPE[\"function\"] $i) -> {$v.tree != null}? ^( $i $v) -> $i)
            // Tiger3.g:117:10: i= ID (v= lvalue2 | par= '(' (e= expr_list )? ')' )?
            {
            i=(Token)match(input,ID,FOLLOW_ID_in_lvalue966);  
            stream_ID.add(i);

            // Tiger3.g:117:15: (v= lvalue2 | par= '(' (e= expr_list )? ')' )?
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // Tiger3.g:117:16: v= lvalue2
                    {
                    pushFollow(FOLLOW_lvalue2_in_lvalue971);
                    v=lvalue2();

                    state._fsp--;

                    stream_lvalue2.add(v.getTree());

                    }
                    break;
                case 2 :
                    // Tiger3.g:117:28: par= '(' (e= expr_list )? ')'
                    {
                    par=(Token)match(input,43,FOLLOW_43_in_lvalue977);  
                    stream_43.add(par);

                    // Tiger3.g:117:37: (e= expr_list )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=ID && LA23_0<=STRING)||(LA23_0>=42 && LA23_0<=43)||(LA23_0>=50 && LA23_0<=51)||LA23_0==53||LA23_0==57||LA23_0==59||(LA23_0>=61 && LA23_0<=62)||LA23_0==68) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // Tiger3.g:117:37: e= expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_lvalue981);
                            e=expr_list();

                            state._fsp--;

                            stream_expr_list.add(e.getTree());

                            }
                            break;

                    }

                    char_literal34=(Token)match(input,44,FOLLOW_44_in_lvalue984);  
                    stream_44.add(char_literal34);


                    }
                    break;

            }



            // AST REWRITE
            // elements: i, v, i, e, i, i
            // token labels: i
            // rule labels: v, retval, e
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
            RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:4: -> {$par.text != null && $e.tree != null}? ^( TYPE[\"function\"] $i ^( PARAMSEFF $e) )
            if ((par!=null?par.getText():null) != null && (e!=null?((Object)e.tree):null) != null) {
                // Tiger3.g:118:47: ^( TYPE[\"function\"] $i ^( PARAMSEFF $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "function"), root_1);

                adaptor.addChild(root_1, stream_i.nextNode());
                // Tiger3.g:118:69: ^( PARAMSEFF $e)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMSEFF, "PARAMSEFF"), root_2);

                adaptor.addChild(root_2, stream_e.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 119:4: -> {$par.text != null}? ^( TYPE[\"function\"] $i)
            if ((par!=null?par.getText():null) != null) {
                // Tiger3.g:119:28: ^( TYPE[\"function\"] $i)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "function"), root_1);

                adaptor.addChild(root_1, stream_i.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 120:4: -> {$v.tree != null}? ^( $i $v)
            if ((v!=null?((Object)v.tree):null) != null) {
                // Tiger3.g:120:26: ^( $i $v)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_i.nextNode(), root_1);

                adaptor.addChild(root_1, stream_v.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 121:4: -> $i
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
        }
        return retval;
    }
    // $ANTLR end "lvalue"

    public static class lvalue2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lvalue2"
    // Tiger3.g:124:1: lvalue2 : ( '.' ID (v= lvalue2 )? -> ^( FIELD ID ( $v)? ) | '[' e1= expr ']' (val= lvalue2 | o= ofexp e2= expr )? -> {$o.text != null}? ^( SIZE $e1) ^( INIT $e2) -> {$val.tree != null}? ^( CELL $e1) $val -> ^( CELL $e1) );
    public final Tiger3Parser.lvalue2_return lvalue2() throws RecognitionException {
        Tiger3Parser.lvalue2_return retval = new Tiger3Parser.lvalue2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal35=null;
        Token ID36=null;
        Token char_literal37=null;
        Token char_literal38=null;
        Tiger3Parser.lvalue2_return v = null;

        Tiger3Parser.expr_return e1 = null;

        Tiger3Parser.lvalue2_return val = null;

        Tiger3Parser.ofexp_return o = null;

        Tiger3Parser.expr_return e2 = null;


        Object char_literal35_tree=null;
        Object ID36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal38_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_lvalue2=new RewriteRuleSubtreeStream(adaptor,"rule lvalue2");
        RewriteRuleSubtreeStream stream_ofexp=new RewriteRuleSubtreeStream(adaptor,"rule ofexp");
        try {
            // Tiger3.g:124:10: ( '.' ID (v= lvalue2 )? -> ^( FIELD ID ( $v)? ) | '[' e1= expr ']' (val= lvalue2 | o= ofexp e2= expr )? -> {$o.text != null}? ^( SIZE $e1) ^( INIT $e2) -> {$val.tree != null}? ^( CELL $e1) $val -> ^( CELL $e1) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            else if ( (LA27_0==46) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // Tiger3.g:124:12: '.' ID (v= lvalue2 )?
                    {
                    char_literal35=(Token)match(input,45,FOLLOW_45_in_lvalue21062);  
                    stream_45.add(char_literal35);

                    ID36=(Token)match(input,ID,FOLLOW_ID_in_lvalue21064);  
                    stream_ID.add(ID36);

                    // Tiger3.g:124:20: (v= lvalue2 )?
                    int alt25=2;
                    alt25 = dfa25.predict(input);
                    switch (alt25) {
                        case 1 :
                            // Tiger3.g:124:20: v= lvalue2
                            {
                            pushFollow(FOLLOW_lvalue2_in_lvalue21068);
                            v=lvalue2();

                            state._fsp--;

                            stream_lvalue2.add(v.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ID, v
                    // token labels: 
                    // rule labels: v, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:30: -> ^( FIELD ID ( $v)? )
                    {
                        // Tiger3.g:124:33: ^( FIELD ID ( $v)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // Tiger3.g:124:44: ( $v)?
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
                    // Tiger3.g:125:4: '[' e1= expr ']' (val= lvalue2 | o= ofexp e2= expr )?
                    {
                    char_literal37=(Token)match(input,46,FOLLOW_46_in_lvalue21086);  
                    stream_46.add(char_literal37);

                    pushFollow(FOLLOW_expr_in_lvalue21090);
                    e1=expr();

                    state._fsp--;

                    stream_expr.add(e1.getTree());
                    char_literal38=(Token)match(input,47,FOLLOW_47_in_lvalue21092);  
                    stream_47.add(char_literal38);

                    // Tiger3.g:125:20: (val= lvalue2 | o= ofexp e2= expr )?
                    int alt26=3;
                    alt26 = dfa26.predict(input);
                    switch (alt26) {
                        case 1 :
                            // Tiger3.g:125:21: val= lvalue2
                            {
                            pushFollow(FOLLOW_lvalue2_in_lvalue21097);
                            val=lvalue2();

                            state._fsp--;

                            stream_lvalue2.add(val.getTree());

                            }
                            break;
                        case 2 :
                            // Tiger3.g:125:35: o= ofexp e2= expr
                            {
                            pushFollow(FOLLOW_ofexp_in_lvalue21103);
                            o=ofexp();

                            state._fsp--;

                            stream_ofexp.add(o.getTree());
                            pushFollow(FOLLOW_expr_in_lvalue21107);
                            e2=expr();

                            state._fsp--;

                            stream_expr.add(e2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: e1, e1, val, e2, e1
                    // token labels: 
                    // rule labels: val, retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_val=new RewriteRuleSubtreeStream(adaptor,"rule val",val!=null?val.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:4: -> {$o.text != null}? ^( SIZE $e1) ^( INIT $e2)
                    if ((o!=null?input.toString(o.start,o.stop):null) != null) {
                        // Tiger3.g:126:27: ^( SIZE $e1)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIZE, "SIZE"), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // Tiger3.g:126:39: ^( INIT $e2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_1);

                        adaptor.addChild(root_1, stream_e2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 127:4: -> {$val.tree != null}? ^( CELL $e1) $val
                    if ((val!=null?((Object)val.tree):null) != null) {
                        // Tiger3.g:127:28: ^( CELL $e1)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_val.nextTree());

                    }
                    else // 128:4: -> ^( CELL $e1)
                    {
                        // Tiger3.g:128:7: ^( CELL $e1)
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
        }
        return retval;
    }
    // $ANTLR end "lvalue2"

    public static class declaration_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration_list"
    // Tiger3.g:131:1: declaration_list : d1= declaration (d2= declaration_list )? -> $d1 ( $d2)? ;
    public final Tiger3Parser.declaration_list_return declaration_list() throws RecognitionException {
        Tiger3Parser.declaration_list_return retval = new Tiger3Parser.declaration_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Tiger3Parser.declaration_return d1 = null;

        Tiger3Parser.declaration_list_return d2 = null;


        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule declaration_list");
        try {
            // Tiger3.g:131:18: (d1= declaration (d2= declaration_list )? -> $d1 ( $d2)? )
            // Tiger3.g:131:20: d1= declaration (d2= declaration_list )?
            {
            pushFollow(FOLLOW_declaration_in_declaration_list1177);
            d1=declaration();

            state._fsp--;

            stream_declaration.add(d1.getTree());
            // Tiger3.g:131:35: (d2= declaration_list )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==58||(LA28_0>=66 && LA28_0<=67)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Tiger3.g:131:36: d2= declaration_list
                    {
                    pushFollow(FOLLOW_declaration_list_in_declaration_list1182);
                    d2=declaration_list();

                    state._fsp--;

                    stream_declaration_list.add(d2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: d2, d1
            // token labels: 
            // rule labels: d1, retval, d2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_d1=new RewriteRuleSubtreeStream(adaptor,"rule d1",d1!=null?d1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_d2=new RewriteRuleSubtreeStream(adaptor,"rule d2",d2!=null?d2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 132:4: -> $d1 ( $d2)?
            {
                adaptor.addChild(root_0, stream_d1.nextTree());
                // Tiger3.g:132:11: ( $d2)?
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
        }
        return retval;
    }
    // $ANTLR end "declaration_list"

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // Tiger3.g:135:1: declaration : ( type_declaration | variable_declaration | function_declaration );
    public final Tiger3Parser.declaration_return declaration() throws RecognitionException {
        Tiger3Parser.declaration_return retval = new Tiger3Parser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Tiger3Parser.type_declaration_return type_declaration39 = null;

        Tiger3Parser.variable_declaration_return variable_declaration40 = null;

        Tiger3Parser.function_declaration_return function_declaration41 = null;



        try {
            // Tiger3.g:135:13: ( type_declaration | variable_declaration | function_declaration )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt29=1;
                }
                break;
            case 67:
                {
                alt29=2;
                }
                break;
            case 58:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // Tiger3.g:135:15: type_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_declaration_in_declaration1209);
                    type_declaration39=type_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, type_declaration39.getTree());

                    }
                    break;
                case 2 :
                    // Tiger3.g:136:4: variable_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_declaration_in_declaration1214);
                    variable_declaration40=variable_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_declaration40.getTree());

                    }
                    break;
                case 3 :
                    // Tiger3.g:137:4: function_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_declaration_in_declaration1219);
                    function_declaration41=function_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, function_declaration41.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class type_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_declaration"
    // Tiger3.g:140:1: type_declaration : t1= typeexp i= ID '=' t2= type -> ^( $t1 $i $t2) ;
    public final Tiger3Parser.type_declaration_return type_declaration() throws RecognitionException {
        Tiger3Parser.type_declaration_return retval = new Tiger3Parser.type_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i=null;
        Token char_literal42=null;
        Tiger3Parser.typeexp_return t1 = null;

        Tiger3Parser.type_return t2 = null;


        Object i_tree=null;
        Object char_literal42_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_typeexp=new RewriteRuleSubtreeStream(adaptor,"rule typeexp");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Tiger3.g:141:2: (t1= typeexp i= ID '=' t2= type -> ^( $t1 $i $t2) )
            // Tiger3.g:141:4: t1= typeexp i= ID '=' t2= type
            {
            pushFollow(FOLLOW_typeexp_in_type_declaration1233);
            t1=typeexp();

            state._fsp--;

            stream_typeexp.add(t1.getTree());
            i=(Token)match(input,ID,FOLLOW_ID_in_type_declaration1237);  
            stream_ID.add(i);

            char_literal42=(Token)match(input,38,FOLLOW_38_in_type_declaration1239);  
            stream_38.add(char_literal42);

            pushFollow(FOLLOW_type_in_type_declaration1243);
            t2=type();

            state._fsp--;

            stream_type.add(t2.getTree());


            // AST REWRITE
            // elements: i, t2, t1
            // token labels: i
            // rule labels: t2, retval, t1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
            RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 142:4: -> ^( $t1 $i $t2)
            {
                // Tiger3.g:142:7: ^( $t1 $i $t2)
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
        }
        return retval;
    }
    // $ANTLR end "type_declaration"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // Tiger3.g:145:1: type : (t= type_id -> ^( PRIMITIF $t) | '{' (t= type_fields )? '}' -> {$t.tree != null}? ^( STRUCT $t) -> ^( STRUCT ) | 'array of' (t= type_id | i= ID ) -> {$t.text != null}? ^( TAB $t) -> ^( TAB $i) );
    public final Tiger3Parser.type_return type() throws RecognitionException {
        Tiger3Parser.type_return retval = new Tiger3Parser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i=null;
        Token char_literal43=null;
        Token char_literal44=null;
        Token string_literal45=null;
        Tiger3Parser.type_id_return t = null;


        Object i_tree=null;
        Object char_literal43_tree=null;
        Object char_literal44_tree=null;
        Object string_literal45_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type_fields=new RewriteRuleSubtreeStream(adaptor,"rule type_fields");
        RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
        try {
            // Tiger3.g:145:6: (t= type_id -> ^( PRIMITIF $t) | '{' (t= type_fields )? '}' -> {$t.tree != null}? ^( STRUCT $t) -> ^( STRUCT ) | 'array of' (t= type_id | i= ID ) -> {$t.text != null}? ^( TAB $t) -> ^( TAB $i) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 50:
            case 51:
                {
                alt32=1;
                }
                break;
            case 30:
                {
                alt32=2;
                }
                break;
            case 48:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // Tiger3.g:145:8: t= type_id
                    {
                    pushFollow(FOLLOW_type_id_in_type1272);
                    t=type_id();

                    state._fsp--;

                    stream_type_id.add(t.getTree());


                    // AST REWRITE
                    // elements: t
                    // token labels: 
                    // rule labels: retval, t
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 145:18: -> ^( PRIMITIF $t)
                    {
                        // Tiger3.g:145:21: ^( PRIMITIF $t)
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
                    // Tiger3.g:146:4: '{' (t= type_fields )? '}'
                    {
                    char_literal43=(Token)match(input,30,FOLLOW_30_in_type1286);  
                    stream_30.add(char_literal43);

                    // Tiger3.g:146:9: (t= type_fields )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==ID) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // Tiger3.g:146:9: t= type_fields
                            {
                            pushFollow(FOLLOW_type_fields_in_type1290);
                            t=type_fields();

                            state._fsp--;

                            stream_type_fields.add(t.getTree());

                            }
                            break;

                    }

                    char_literal44=(Token)match(input,31,FOLLOW_31_in_type1293);  
                    stream_31.add(char_literal44);



                    // AST REWRITE
                    // elements: t
                    // token labels: 
                    // rule labels: retval, t
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:4: -> {$t.tree != null}? ^( STRUCT $t)
                    if ((t!=null?((Object)t.tree):null) != null) {
                        // Tiger3.g:147:26: ^( STRUCT $t)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRUCT, "STRUCT"), root_1);

                        adaptor.addChild(root_1, stream_t.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 148:4: -> ^( STRUCT )
                    {
                        // Tiger3.g:148:7: ^( STRUCT )
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
                    // Tiger3.g:149:4: 'array of' (t= type_id | i= ID )
                    {
                    string_literal45=(Token)match(input,48,FOLLOW_48_in_type1323);  
                    stream_48.add(string_literal45);

                    // Tiger3.g:149:15: (t= type_id | i= ID )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>=50 && LA31_0<=51)) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==ID) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // Tiger3.g:149:16: t= type_id
                            {
                            pushFollow(FOLLOW_type_id_in_type1328);
                            t=type_id();

                            state._fsp--;

                            stream_type_id.add(t.getTree());

                            }
                            break;
                        case 2 :
                            // Tiger3.g:149:28: i= ID
                            {
                            i=(Token)match(input,ID,FOLLOW_ID_in_type1334);  
                            stream_ID.add(i);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: t, i
                    // token labels: i
                    // rule labels: retval, t
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 150:4: -> {$t.text != null}? ^( TAB $t)
                    if ((t!=null?input.toString(t.start,t.stop):null) != null) {
                        // Tiger3.g:150:26: ^( TAB $t)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TAB, "TAB"), root_1);

                        adaptor.addChild(root_1, stream_t.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 151:4: -> ^( TAB $i)
                    {
                        // Tiger3.g:151:7: ^( TAB $i)
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
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class variable_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_declaration"
    // Tiger3.g:154:1: variable_declaration : vava= varexp nom= ID (depoi= ':' (typenew= ID | typebase= type_id ) )? ':=' e= expr -> {$depoi != null && $typenew.text!=null}? ^( $vava $nom $typenew $e) -> {$depoi != null && $typebase.text!=null}? ^( $vava $nom $typebase $e) -> ^( $vava $nom $e) ;
    public final Tiger3Parser.variable_declaration_return variable_declaration() throws RecognitionException {
        Tiger3Parser.variable_declaration_return retval = new Tiger3Parser.variable_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token nom=null;
        Token depoi=null;
        Token typenew=null;
        Token string_literal46=null;
        Tiger3Parser.varexp_return vava = null;

        Tiger3Parser.type_id_return typebase = null;

        Tiger3Parser.expr_return e = null;


        Object nom_tree=null;
        Object depoi_tree=null;
        Object typenew_tree=null;
        Object string_literal46_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_varexp=new RewriteRuleSubtreeStream(adaptor,"rule varexp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
        try {
            // Tiger3.g:155:2: (vava= varexp nom= ID (depoi= ':' (typenew= ID | typebase= type_id ) )? ':=' e= expr -> {$depoi != null && $typenew.text!=null}? ^( $vava $nom $typenew $e) -> {$depoi != null && $typebase.text!=null}? ^( $vava $nom $typebase $e) -> ^( $vava $nom $e) )
            // Tiger3.g:155:4: vava= varexp nom= ID (depoi= ':' (typenew= ID | typebase= type_id ) )? ':=' e= expr
            {
            pushFollow(FOLLOW_varexp_in_variable_declaration1374);
            vava=varexp();

            state._fsp--;

            stream_varexp.add(vava.getTree());
            nom=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration1378);  
            stream_ID.add(nom);

            // Tiger3.g:155:23: (depoi= ':' (typenew= ID | typebase= type_id ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Tiger3.g:155:25: depoi= ':' (typenew= ID | typebase= type_id )
                    {
                    depoi=(Token)match(input,49,FOLLOW_49_in_variable_declaration1384);  
                    stream_49.add(depoi);

                    // Tiger3.g:155:35: (typenew= ID | typebase= type_id )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==ID) ) {
                        alt33=1;
                    }
                    else if ( ((LA33_0>=50 && LA33_0<=51)) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // Tiger3.g:155:36: typenew= ID
                            {
                            typenew=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration1389);  
                            stream_ID.add(typenew);


                            }
                            break;
                        case 2 :
                            // Tiger3.g:155:49: typebase= type_id
                            {
                            pushFollow(FOLLOW_type_id_in_variable_declaration1395);
                            typebase=type_id();

                            state._fsp--;

                            stream_type_id.add(typebase.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            string_literal46=(Token)match(input,34,FOLLOW_34_in_variable_declaration1400);  
            stream_34.add(string_literal46);

            pushFollow(FOLLOW_expr_in_variable_declaration1404);
            e=expr();

            state._fsp--;

            stream_expr.add(e.getTree());


            // AST REWRITE
            // elements: nom, typebase, vava, e, nom, typenew, nom, vava, vava, e, e
            // token labels: typenew, nom
            // rule labels: vava, retval, e, typebase
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_typenew=new RewriteRuleTokenStream(adaptor,"token typenew",typenew);
            RewriteRuleTokenStream stream_nom=new RewriteRuleTokenStream(adaptor,"token nom",nom);
            RewriteRuleSubtreeStream stream_vava=new RewriteRuleSubtreeStream(adaptor,"rule vava",vava!=null?vava.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            RewriteRuleSubtreeStream stream_typebase=new RewriteRuleSubtreeStream(adaptor,"rule typebase",typebase!=null?typebase.tree:null);

            root_0 = (Object)adaptor.nil();
            // 156:5: -> {$depoi != null && $typenew.text!=null}? ^( $vava $nom $typenew $e)
            if (depoi != null && (typenew!=null?typenew.getText():null)!=null) {
                // Tiger3.g:156:49: ^( $vava $nom $typenew $e)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_vava.nextNode(), root_1);

                adaptor.addChild(root_1, stream_nom.nextNode());
                adaptor.addChild(root_1, stream_typenew.nextNode());
                adaptor.addChild(root_1, stream_e.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 157:5: -> {$depoi != null && $typebase.text!=null}? ^( $vava $nom $typebase $e)
            if (depoi != null && (typebase!=null?input.toString(typebase.start,typebase.stop):null)!=null) {
                // Tiger3.g:157:50: ^( $vava $nom $typebase $e)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_vava.nextNode(), root_1);

                adaptor.addChild(root_1, stream_nom.nextNode());
                adaptor.addChild(root_1, stream_typebase.nextTree());
                adaptor.addChild(root_1, stream_e.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 158:5: -> ^( $vava $nom $e)
            {
                // Tiger3.g:158:8: ^( $vava $nom $e)
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
        }
        return retval;
    }
    // $ANTLR end "variable_declaration"

    public static class function_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_declaration"
    // Tiger3.g:161:1: function_declaration : fun= functionexp ID '(' (par= type_fields )? ')' ( ':' (ty= type_id | i= ID ) )? '=' (e= expr )+ -> {$par.text != null && $ty.text != null}? ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $ty) ^( BLOCK $e) ) -> {$par.text != null && $i != null}? ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $i) ^( BLOCK $e) ) -> {$par.text != null}? ^( $fun ID ^( PARAMSFORM $par) ^( BLOCK $e) ) -> {$ty.text != null}? ^( $fun ID ^( TYPE $ty) ^( BLOCK $e) ) -> {$i != null}? ^( $fun ID ^( TYPE $i) ^( BLOCK $e) ) -> ^( $fun ID ^( BLOCK $e) ) ;
    public final Tiger3Parser.function_declaration_return function_declaration() throws RecognitionException {
        Tiger3Parser.function_declaration_return retval = new Tiger3Parser.function_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i=null;
        Token ID47=null;
        Token char_literal48=null;
        Token char_literal49=null;
        Token char_literal50=null;
        Token char_literal51=null;
        Tiger3Parser.functionexp_return fun = null;

        Tiger3Parser.type_fields_return par = null;

        Tiger3Parser.type_id_return ty = null;

        Tiger3Parser.expr_return e = null;


        Object i_tree=null;
        Object ID47_tree=null;
        Object char_literal48_tree=null;
        Object char_literal49_tree=null;
        Object char_literal50_tree=null;
        Object char_literal51_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_type_fields=new RewriteRuleSubtreeStream(adaptor,"rule type_fields");
        RewriteRuleSubtreeStream stream_functionexp=new RewriteRuleSubtreeStream(adaptor,"rule functionexp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
        try {
            // Tiger3.g:162:2: (fun= functionexp ID '(' (par= type_fields )? ')' ( ':' (ty= type_id | i= ID ) )? '=' (e= expr )+ -> {$par.text != null && $ty.text != null}? ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $ty) ^( BLOCK $e) ) -> {$par.text != null && $i != null}? ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $i) ^( BLOCK $e) ) -> {$par.text != null}? ^( $fun ID ^( PARAMSFORM $par) ^( BLOCK $e) ) -> {$ty.text != null}? ^( $fun ID ^( TYPE $ty) ^( BLOCK $e) ) -> {$i != null}? ^( $fun ID ^( TYPE $i) ^( BLOCK $e) ) -> ^( $fun ID ^( BLOCK $e) ) )
            // Tiger3.g:162:4: fun= functionexp ID '(' (par= type_fields )? ')' ( ':' (ty= type_id | i= ID ) )? '=' (e= expr )+
            {
            pushFollow(FOLLOW_functionexp_in_function_declaration1480);
            fun=functionexp();

            state._fsp--;

            stream_functionexp.add(fun.getTree());
            ID47=(Token)match(input,ID,FOLLOW_ID_in_function_declaration1482);  
            stream_ID.add(ID47);

            char_literal48=(Token)match(input,43,FOLLOW_43_in_function_declaration1484);  
            stream_43.add(char_literal48);

            // Tiger3.g:162:30: (par= type_fields )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // Tiger3.g:162:30: par= type_fields
                    {
                    pushFollow(FOLLOW_type_fields_in_function_declaration1488);
                    par=type_fields();

                    state._fsp--;

                    stream_type_fields.add(par.getTree());

                    }
                    break;

            }

            char_literal49=(Token)match(input,44,FOLLOW_44_in_function_declaration1491);  
            stream_44.add(char_literal49);

            // Tiger3.g:162:48: ( ':' (ty= type_id | i= ID ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // Tiger3.g:162:49: ':' (ty= type_id | i= ID )
                    {
                    char_literal50=(Token)match(input,49,FOLLOW_49_in_function_declaration1494);  
                    stream_49.add(char_literal50);

                    // Tiger3.g:162:53: (ty= type_id | i= ID )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=50 && LA36_0<=51)) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==ID) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // Tiger3.g:162:54: ty= type_id
                            {
                            pushFollow(FOLLOW_type_id_in_function_declaration1499);
                            ty=type_id();

                            state._fsp--;

                            stream_type_id.add(ty.getTree());

                            }
                            break;
                        case 2 :
                            // Tiger3.g:162:65: i= ID
                            {
                            i=(Token)match(input,ID,FOLLOW_ID_in_function_declaration1503);  
                            stream_ID.add(i);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal51=(Token)match(input,38,FOLLOW_38_in_function_declaration1509);  
            stream_38.add(char_literal51);

            // Tiger3.g:162:80: (e= expr )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=ID && LA38_0<=STRING)||(LA38_0>=42 && LA38_0<=43)||(LA38_0>=50 && LA38_0<=51)||LA38_0==53||LA38_0==57||LA38_0==59||(LA38_0>=61 && LA38_0<=62)||LA38_0==68) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Tiger3.g:162:81: e= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_function_declaration1516);
            	    e=expr();

            	    state._fsp--;

            	    stream_expr.add(e.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);



            // AST REWRITE
            // elements: e, ty, e, e, e, e, i, ID, i, fun, fun, par, ty, ID, par, ID, e, ID, ID, par, fun, fun, fun, ID, fun
            // token labels: i
            // rule labels: par, ty, retval, e, fun
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
            RewriteRuleSubtreeStream stream_par=new RewriteRuleSubtreeStream(adaptor,"rule par",par!=null?par.tree:null);
            RewriteRuleSubtreeStream stream_ty=new RewriteRuleSubtreeStream(adaptor,"rule ty",ty!=null?ty.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            RewriteRuleSubtreeStream stream_fun=new RewriteRuleSubtreeStream(adaptor,"rule fun",fun!=null?fun.tree:null);

            root_0 = (Object)adaptor.nil();
            // 163:4: -> {$par.text != null && $ty.text != null}? ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $ty) ^( BLOCK $e) )
            if ((par!=null?input.toString(par.start,par.stop):null) != null && (ty!=null?input.toString(ty.start,ty.stop):null) != null) {
                // Tiger3.g:163:48: ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $ty) ^( BLOCK $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fun.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // Tiger3.g:163:58: ^( PARAMSFORM $par)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMSFORM, "PARAMSFORM"), root_2);

                adaptor.addChild(root_2, stream_par.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // Tiger3.g:163:77: ^( TYPE $ty)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, stream_ty.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // Tiger3.g:163:89: ^( BLOCK $e)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                adaptor.addChild(root_2, stream_e.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 164:4: -> {$par.text != null && $i != null}? ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $i) ^( BLOCK $e) )
            if ((par!=null?input.toString(par.start,par.stop):null) != null && i != null) {
                // Tiger3.g:164:42: ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $i) ^( BLOCK $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fun.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // Tiger3.g:164:52: ^( PARAMSFORM $par)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMSFORM, "PARAMSFORM"), root_2);

                adaptor.addChild(root_2, stream_par.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // Tiger3.g:164:71: ^( TYPE $i)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, stream_i.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // Tiger3.g:164:82: ^( BLOCK $e)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                adaptor.addChild(root_2, stream_e.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 165:4: -> {$par.text != null}? ^( $fun ID ^( PARAMSFORM $par) ^( BLOCK $e) )
            if ((par!=null?input.toString(par.start,par.stop):null) != null) {
                // Tiger3.g:165:28: ^( $fun ID ^( PARAMSFORM $par) ^( BLOCK $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fun.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // Tiger3.g:165:38: ^( PARAMSFORM $par)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMSFORM, "PARAMSFORM"), root_2);

                adaptor.addChild(root_2, stream_par.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // Tiger3.g:165:57: ^( BLOCK $e)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                adaptor.addChild(root_2, stream_e.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 166:4: -> {$ty.text != null}? ^( $fun ID ^( TYPE $ty) ^( BLOCK $e) )
            if ((ty!=null?input.toString(ty.start,ty.stop):null) != null) {
                // Tiger3.g:166:27: ^( $fun ID ^( TYPE $ty) ^( BLOCK $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fun.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // Tiger3.g:166:37: ^( TYPE $ty)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, stream_ty.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // Tiger3.g:166:49: ^( BLOCK $e)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                adaptor.addChild(root_2, stream_e.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 167:4: -> {$i != null}? ^( $fun ID ^( TYPE $i) ^( BLOCK $e) )
            if (i != null) {
                // Tiger3.g:167:21: ^( $fun ID ^( TYPE $i) ^( BLOCK $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fun.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // Tiger3.g:167:31: ^( TYPE $i)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, stream_i.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // Tiger3.g:167:42: ^( BLOCK $e)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                adaptor.addChild(root_2, stream_e.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 168:4: -> ^( $fun ID ^( BLOCK $e) )
            {
                // Tiger3.g:168:7: ^( $fun ID ^( BLOCK $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fun.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // Tiger3.g:168:17: ^( BLOCK $e)
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
        }
        return retval;
    }
    // $ANTLR end "function_declaration"

    public static class type_fields_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_fields"
    // Tiger3.g:171:1: type_fields : t1= type_field (t2= type_fields2 )? -> $t1 ( $t2)? ;
    public final Tiger3Parser.type_fields_return type_fields() throws RecognitionException {
        Tiger3Parser.type_fields_return retval = new Tiger3Parser.type_fields_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Tiger3Parser.type_field_return t1 = null;

        Tiger3Parser.type_fields2_return t2 = null;


        RewriteRuleSubtreeStream stream_type_field=new RewriteRuleSubtreeStream(adaptor,"rule type_field");
        RewriteRuleSubtreeStream stream_type_fields2=new RewriteRuleSubtreeStream(adaptor,"rule type_fields2");
        try {
            // Tiger3.g:171:13: (t1= type_field (t2= type_fields2 )? -> $t1 ( $t2)? )
            // Tiger3.g:171:15: t1= type_field (t2= type_fields2 )?
            {
            pushFollow(FOLLOW_type_field_in_type_fields1706);
            t1=type_field();

            state._fsp--;

            stream_type_field.add(t1.getTree());
            // Tiger3.g:171:31: (t2= type_fields2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // Tiger3.g:171:31: t2= type_fields2
                    {
                    pushFollow(FOLLOW_type_fields2_in_type_fields1710);
                    t2=type_fields2();

                    state._fsp--;

                    stream_type_fields2.add(t2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: t2, t1
            // token labels: 
            // rule labels: t2, retval, t1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 172:4: -> $t1 ( $t2)?
            {
                adaptor.addChild(root_0, stream_t1.nextTree());
                // Tiger3.g:172:11: ( $t2)?
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
        }
        return retval;
    }
    // $ANTLR end "type_fields"

    public static class type_fields2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_fields2"
    // Tiger3.g:175:1: type_fields2 : ',' t1= type_field (t2= type_fields2 )? -> $t1 ( $t2)? ;
    public final Tiger3Parser.type_fields2_return type_fields2() throws RecognitionException {
        Tiger3Parser.type_fields2_return retval = new Tiger3Parser.type_fields2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal52=null;
        Tiger3Parser.type_field_return t1 = null;

        Tiger3Parser.type_fields2_return t2 = null;


        Object char_literal52_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_type_field=new RewriteRuleSubtreeStream(adaptor,"rule type_field");
        RewriteRuleSubtreeStream stream_type_fields2=new RewriteRuleSubtreeStream(adaptor,"rule type_fields2");
        try {
            // Tiger3.g:175:14: ( ',' t1= type_field (t2= type_fields2 )? -> $t1 ( $t2)? )
            // Tiger3.g:175:16: ',' t1= type_field (t2= type_fields2 )?
            {
            char_literal52=(Token)match(input,32,FOLLOW_32_in_type_fields21734);  
            stream_32.add(char_literal52);

            pushFollow(FOLLOW_type_field_in_type_fields21738);
            t1=type_field();

            state._fsp--;

            stream_type_field.add(t1.getTree());
            // Tiger3.g:175:36: (t2= type_fields2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==32) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // Tiger3.g:175:36: t2= type_fields2
                    {
                    pushFollow(FOLLOW_type_fields2_in_type_fields21742);
                    t2=type_fields2();

                    state._fsp--;

                    stream_type_fields2.add(t2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: t1, t2
            // token labels: 
            // rule labels: t2, retval, t1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_t2=new RewriteRuleSubtreeStream(adaptor,"rule t2",t2!=null?t2.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_t1=new RewriteRuleSubtreeStream(adaptor,"rule t1",t1!=null?t1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 176:4: -> $t1 ( $t2)?
            {
                adaptor.addChild(root_0, stream_t1.nextTree());
                // Tiger3.g:176:11: ( $t2)?
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
        }
        return retval;
    }
    // $ANTLR end "type_fields2"

    public static class type_field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_field"
    // Tiger3.g:179:1: type_field : i1= ID ':' (t= type_id | i2= ID ) -> {$i2.text != null}? ^( PARAM[\"p\"] $i1 $i2) -> ^( PARAM[\"p\"] $i1 $t) ;
    public final Tiger3Parser.type_field_return type_field() throws RecognitionException {
        Tiger3Parser.type_field_return retval = new Tiger3Parser.type_field_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i1=null;
        Token i2=null;
        Token char_literal53=null;
        Tiger3Parser.type_id_return t = null;


        Object i1_tree=null;
        Object i2_tree=null;
        Object char_literal53_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
        try {
            // Tiger3.g:179:12: (i1= ID ':' (t= type_id | i2= ID ) -> {$i2.text != null}? ^( PARAM[\"p\"] $i1 $i2) -> ^( PARAM[\"p\"] $i1 $t) )
            // Tiger3.g:179:14: i1= ID ':' (t= type_id | i2= ID )
            {
            i1=(Token)match(input,ID,FOLLOW_ID_in_type_field1768);  
            stream_ID.add(i1);

            char_literal53=(Token)match(input,49,FOLLOW_49_in_type_field1770);  
            stream_49.add(char_literal53);

            // Tiger3.g:179:24: (t= type_id | i2= ID )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=50 && LA41_0<=51)) ) {
                alt41=1;
            }
            else if ( (LA41_0==ID) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // Tiger3.g:179:25: t= type_id
                    {
                    pushFollow(FOLLOW_type_id_in_type_field1775);
                    t=type_id();

                    state._fsp--;

                    stream_type_id.add(t.getTree());

                    }
                    break;
                case 2 :
                    // Tiger3.g:179:35: i2= ID
                    {
                    i2=(Token)match(input,ID,FOLLOW_ID_in_type_field1779);  
                    stream_ID.add(i2);


                    }
                    break;

            }



            // AST REWRITE
            // elements: i1, t, i1, i2
            // token labels: i2, i1
            // rule labels: retval, t
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_i2=new RewriteRuleTokenStream(adaptor,"token i2",i2);
            RewriteRuleTokenStream stream_i1=new RewriteRuleTokenStream(adaptor,"token i1",i1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

            root_0 = (Object)adaptor.nil();
            // 180:4: -> {$i2.text != null}? ^( PARAM[\"p\"] $i1 $i2)
            if ((i2!=null?i2.getText():null) != null) {
                // Tiger3.g:180:27: ^( PARAM[\"p\"] $i1 $i2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "p"), root_1);

                adaptor.addChild(root_1, stream_i1.nextNode());
                adaptor.addChild(root_1, stream_i2.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 181:4: -> ^( PARAM[\"p\"] $i1 $t)
            {
                // Tiger3.g:181:7: ^( PARAM[\"p\"] $i1 $t)
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
        }
        return retval;
    }
    // $ANTLR end "type_field"

    public static class type_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_id"
    // Tiger3.g:184:1: type_id : (i= 'int' | s= 'string' ) ( lvalue2 )* ;
    public final Tiger3Parser.type_id_return type_id() throws RecognitionException {
        Tiger3Parser.type_id_return retval = new Tiger3Parser.type_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i=null;
        Token s=null;
        Tiger3Parser.lvalue2_return lvalue254 = null;


        Object i_tree=null;
        Object s_tree=null;

        try {
            // Tiger3.g:184:9: ( (i= 'int' | s= 'string' ) ( lvalue2 )* )
            // Tiger3.g:184:11: (i= 'int' | s= 'string' ) ( lvalue2 )*
            {
            root_0 = (Object)adaptor.nil();

            // Tiger3.g:184:11: (i= 'int' | s= 'string' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            else if ( (LA42_0==51) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // Tiger3.g:184:12: i= 'int'
                    {
                    i=(Token)match(input,50,FOLLOW_50_in_type_id1826); 
                    i_tree = (Object)adaptor.create(i);
                    adaptor.addChild(root_0, i_tree);


                    }
                    break;
                case 2 :
                    // Tiger3.g:184:22: s= 'string'
                    {
                    s=(Token)match(input,51,FOLLOW_51_in_type_id1832); 
                    s_tree = (Object)adaptor.create(s);
                    adaptor.addChild(root_0, s_tree);


                    }
                    break;

            }

            // Tiger3.g:184:34: ( lvalue2 )*
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // Tiger3.g:184:34: lvalue2
            	    {
            	    pushFollow(FOLLOW_lvalue2_in_type_id1835);
            	    lvalue254=lvalue2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue254.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "type_id"

    public static class arrayexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayexp"
    // Tiger3.g:187:1: arrayexp : 'array' ;
    public final Tiger3Parser.arrayexp_return arrayexp() throws RecognitionException {
        Tiger3Parser.arrayexp_return retval = new Tiger3Parser.arrayexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal55=null;

        Object string_literal55_tree=null;

        try {
            // Tiger3.g:187:10: ( 'array' )
            // Tiger3.g:187:12: 'array'
            {
            root_0 = (Object)adaptor.nil();

            string_literal55=(Token)match(input,52,FOLLOW_52_in_arrayexp1846); 
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
        }
        return retval;
    }
    // $ANTLR end "arrayexp"

    public static class breakexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakexp"
    // Tiger3.g:188:1: breakexp : 'break' ;
    public final Tiger3Parser.breakexp_return breakexp() throws RecognitionException {
        Tiger3Parser.breakexp_return retval = new Tiger3Parser.breakexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal56=null;

        Object string_literal56_tree=null;

        try {
            // Tiger3.g:188:10: ( 'break' )
            // Tiger3.g:188:12: 'break'
            {
            root_0 = (Object)adaptor.nil();

            string_literal56=(Token)match(input,53,FOLLOW_53_in_breakexp1855); 
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
        }
        return retval;
    }
    // $ANTLR end "breakexp"

    public static class doexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doexp"
    // Tiger3.g:189:1: doexp : 'do' ;
    public final Tiger3Parser.doexp_return doexp() throws RecognitionException {
        Tiger3Parser.doexp_return retval = new Tiger3Parser.doexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal57=null;

        Object string_literal57_tree=null;

        try {
            // Tiger3.g:189:8: ( 'do' )
            // Tiger3.g:189:10: 'do'
            {
            root_0 = (Object)adaptor.nil();

            string_literal57=(Token)match(input,54,FOLLOW_54_in_doexp1864); 
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
        }
        return retval;
    }
    // $ANTLR end "doexp"

    public static class elseexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseexp"
    // Tiger3.g:190:1: elseexp : 'else' ;
    public final Tiger3Parser.elseexp_return elseexp() throws RecognitionException {
        Tiger3Parser.elseexp_return retval = new Tiger3Parser.elseexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal58=null;

        Object string_literal58_tree=null;

        try {
            // Tiger3.g:190:10: ( 'else' )
            // Tiger3.g:190:12: 'else'
            {
            root_0 = (Object)adaptor.nil();

            string_literal58=(Token)match(input,55,FOLLOW_55_in_elseexp1874); 
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
        }
        return retval;
    }
    // $ANTLR end "elseexp"

    public static class endexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endexp"
    // Tiger3.g:191:1: endexp : 'end' ;
    public final Tiger3Parser.endexp_return endexp() throws RecognitionException {
        Tiger3Parser.endexp_return retval = new Tiger3Parser.endexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal59=null;

        Object string_literal59_tree=null;

        try {
            // Tiger3.g:191:9: ( 'end' )
            // Tiger3.g:191:11: 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal59=(Token)match(input,56,FOLLOW_56_in_endexp1885); 
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
        }
        return retval;
    }
    // $ANTLR end "endexp"

    public static class forexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forexp"
    // Tiger3.g:192:1: forexp : 'for' ;
    public final Tiger3Parser.forexp_return forexp() throws RecognitionException {
        Tiger3Parser.forexp_return retval = new Tiger3Parser.forexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal60=null;

        Object string_literal60_tree=null;

        try {
            // Tiger3.g:192:9: ( 'for' )
            // Tiger3.g:192:11: 'for'
            {
            root_0 = (Object)adaptor.nil();

            string_literal60=(Token)match(input,57,FOLLOW_57_in_forexp1895); 
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
        }
        return retval;
    }
    // $ANTLR end "forexp"

    public static class functionexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionexp"
    // Tiger3.g:193:1: functionexp : 'function' ;
    public final Tiger3Parser.functionexp_return functionexp() throws RecognitionException {
        Tiger3Parser.functionexp_return retval = new Tiger3Parser.functionexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal61=null;

        Object string_literal61_tree=null;

        try {
            // Tiger3.g:193:13: ( 'function' )
            // Tiger3.g:193:15: 'function'
            {
            root_0 = (Object)adaptor.nil();

            string_literal61=(Token)match(input,58,FOLLOW_58_in_functionexp1904); 
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
        }
        return retval;
    }
    // $ANTLR end "functionexp"

    public static class ifexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifexp"
    // Tiger3.g:194:1: ifexp : 'if' ;
    public final Tiger3Parser.ifexp_return ifexp() throws RecognitionException {
        Tiger3Parser.ifexp_return retval = new Tiger3Parser.ifexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal62=null;

        Object string_literal62_tree=null;

        try {
            // Tiger3.g:194:7: ( 'if' )
            // Tiger3.g:194:9: 'if'
            {
            root_0 = (Object)adaptor.nil();

            string_literal62=(Token)match(input,59,FOLLOW_59_in_ifexp1912); 
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
        }
        return retval;
    }
    // $ANTLR end "ifexp"

    public static class inexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inexp"
    // Tiger3.g:195:1: inexp : 'in' ;
    public final Tiger3Parser.inexp_return inexp() throws RecognitionException {
        Tiger3Parser.inexp_return retval = new Tiger3Parser.inexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal63=null;

        Object string_literal63_tree=null;

        try {
            // Tiger3.g:195:7: ( 'in' )
            // Tiger3.g:195:9: 'in'
            {
            root_0 = (Object)adaptor.nil();

            string_literal63=(Token)match(input,60,FOLLOW_60_in_inexp1921); 
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
        }
        return retval;
    }
    // $ANTLR end "inexp"

    public static class nilexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nilexp"
    // Tiger3.g:196:1: nilexp : 'nil' ;
    public final Tiger3Parser.nilexp_return nilexp() throws RecognitionException {
        Tiger3Parser.nilexp_return retval = new Tiger3Parser.nilexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal64=null;

        Object string_literal64_tree=null;

        try {
            // Tiger3.g:196:8: ( 'nil' )
            // Tiger3.g:196:10: 'nil'
            {
            root_0 = (Object)adaptor.nil();

            string_literal64=(Token)match(input,61,FOLLOW_61_in_nilexp1930); 
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
        }
        return retval;
    }
    // $ANTLR end "nilexp"

    public static class letexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "letexp"
    // Tiger3.g:197:1: letexp : 'let' ;
    public final Tiger3Parser.letexp_return letexp() throws RecognitionException {
        Tiger3Parser.letexp_return retval = new Tiger3Parser.letexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal65=null;

        Object string_literal65_tree=null;

        try {
            // Tiger3.g:197:8: ( 'let' )
            // Tiger3.g:197:10: 'let'
            {
            root_0 = (Object)adaptor.nil();

            string_literal65=(Token)match(input,62,FOLLOW_62_in_letexp1939); 
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
        }
        return retval;
    }
    // $ANTLR end "letexp"

    public static class ofexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ofexp"
    // Tiger3.g:198:1: ofexp : 'of' ;
    public final Tiger3Parser.ofexp_return ofexp() throws RecognitionException {
        Tiger3Parser.ofexp_return retval = new Tiger3Parser.ofexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal66=null;

        Object string_literal66_tree=null;

        try {
            // Tiger3.g:198:7: ( 'of' )
            // Tiger3.g:198:9: 'of'
            {
            root_0 = (Object)adaptor.nil();

            string_literal66=(Token)match(input,63,FOLLOW_63_in_ofexp1948); 
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
        }
        return retval;
    }
    // $ANTLR end "ofexp"

    public static class thenexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "thenexp"
    // Tiger3.g:199:1: thenexp : 'then' ;
    public final Tiger3Parser.thenexp_return thenexp() throws RecognitionException {
        Tiger3Parser.thenexp_return retval = new Tiger3Parser.thenexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal67=null;

        Object string_literal67_tree=null;

        try {
            // Tiger3.g:199:9: ( 'then' )
            // Tiger3.g:199:11: 'then'
            {
            root_0 = (Object)adaptor.nil();

            string_literal67=(Token)match(input,64,FOLLOW_64_in_thenexp1957); 
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
        }
        return retval;
    }
    // $ANTLR end "thenexp"

    public static class toexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "toexp"
    // Tiger3.g:200:1: toexp : 'to' ;
    public final Tiger3Parser.toexp_return toexp() throws RecognitionException {
        Tiger3Parser.toexp_return retval = new Tiger3Parser.toexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal68=null;

        Object string_literal68_tree=null;

        try {
            // Tiger3.g:200:7: ( 'to' )
            // Tiger3.g:200:9: 'to'
            {
            root_0 = (Object)adaptor.nil();

            string_literal68=(Token)match(input,65,FOLLOW_65_in_toexp1965); 
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
        }
        return retval;
    }
    // $ANTLR end "toexp"

    public static class typeexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeexp"
    // Tiger3.g:201:1: typeexp : 'type' ;
    public final Tiger3Parser.typeexp_return typeexp() throws RecognitionException {
        Tiger3Parser.typeexp_return retval = new Tiger3Parser.typeexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal69=null;

        Object string_literal69_tree=null;

        try {
            // Tiger3.g:201:9: ( 'type' )
            // Tiger3.g:201:11: 'type'
            {
            root_0 = (Object)adaptor.nil();

            string_literal69=(Token)match(input,66,FOLLOW_66_in_typeexp1974); 
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
        }
        return retval;
    }
    // $ANTLR end "typeexp"

    public static class varexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varexp"
    // Tiger3.g:202:1: varexp : 'var' ;
    public final Tiger3Parser.varexp_return varexp() throws RecognitionException {
        Tiger3Parser.varexp_return retval = new Tiger3Parser.varexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal70=null;

        Object string_literal70_tree=null;

        try {
            // Tiger3.g:202:8: ( 'var' )
            // Tiger3.g:202:10: 'var'
            {
            root_0 = (Object)adaptor.nil();

            string_literal70=(Token)match(input,67,FOLLOW_67_in_varexp1982); 
            string_literal70_tree = (Object)adaptor.create(string_literal70);
            adaptor.addChild(root_0, string_literal70_tree);


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
        }
        return retval;
    }
    // $ANTLR end "varexp"

    public static class whileexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileexp"
    // Tiger3.g:203:1: whileexp : 'while' ;
    public final Tiger3Parser.whileexp_return whileexp() throws RecognitionException {
        Tiger3Parser.whileexp_return retval = new Tiger3Parser.whileexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal71=null;

        Object string_literal71_tree=null;

        try {
            // Tiger3.g:203:10: ( 'while' )
            // Tiger3.g:203:12: 'while'
            {
            root_0 = (Object)adaptor.nil();

            string_literal71=(Token)match(input,68,FOLLOW_68_in_whileexp1991); 
            string_literal71_tree = (Object)adaptor.create(string_literal71);
            adaptor.addChild(root_0, string_literal71_tree);


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
        }
        return retval;
    }
    // $ANTLR end "whileexp"

    public static class typedefexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedefexp"
    // Tiger3.g:204:1: typedefexp : 'typedef' ;
    public final Tiger3Parser.typedefexp_return typedefexp() throws RecognitionException {
        Tiger3Parser.typedefexp_return retval = new Tiger3Parser.typedefexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal72=null;

        Object string_literal72_tree=null;

        try {
            // Tiger3.g:204:13: ( 'typedef' )
            // Tiger3.g:204:15: 'typedef'
            {
            root_0 = (Object)adaptor.nil();

            string_literal72=(Token)match(input,69,FOLLOW_69_in_typedefexp2000); 
            string_literal72_tree = (Object)adaptor.create(string_literal72);
            adaptor.addChild(root_0, string_literal72_tree);


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
        }
        return retval;
    }
    // $ANTLR end "typedefexp"

    public static class blockexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockexp"
    // Tiger3.g:205:1: blockexp : 'block' ;
    public final Tiger3Parser.blockexp_return blockexp() throws RecognitionException {
        Tiger3Parser.blockexp_return retval = new Tiger3Parser.blockexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal73=null;

        Object string_literal73_tree=null;

        try {
            // Tiger3.g:205:11: ( 'block' )
            // Tiger3.g:205:13: 'block'
            {
            root_0 = (Object)adaptor.nil();

            string_literal73=(Token)match(input,70,FOLLOW_70_in_blockexp2010); 
            string_literal73_tree = (Object)adaptor.create(string_literal73);
            adaptor.addChild(root_0, string_literal73_tree);


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
        }
        return retval;
    }
    // $ANTLR end "blockexp"

    public static class addminexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addminexp"
    // Tiger3.g:206:1: addminexp : ( '+' | '-' );
    public final Tiger3Parser.addminexp_return addminexp() throws RecognitionException {
        Tiger3Parser.addminexp_return retval = new Tiger3Parser.addminexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set74=null;

        Object set74_tree=null;

        try {
            // Tiger3.g:206:11: ( '+' | '-' )
            // Tiger3.g:
            {
            root_0 = (Object)adaptor.nil();

            set74=(Token)input.LT(1);
            if ( input.LA(1)==42||input.LA(1)==71 ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set74));
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
        }
        return retval;
    }
    // $ANTLR end "addminexp"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA2_eotS =
        "\51\uffff";
    static final String DFA2_eofS =
        "\1\2\50\uffff";
    static final String DFA2_minS =
        "\1\30\50\uffff";
    static final String DFA2_maxS =
        "\1\107\50\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\46\uffff";
    static final String DFA2_specialS =
        "\51\uffff}>";
    static final String[] DFA2_transitionS = {
            "\3\2\3\uffff\1\1\21\2\2\uffff\2\2\1\uffff\12\2\1\uffff\5\2\2"+
            "\uffff\1\2",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "45:12: ( '{' ( field_list )* '}' )?";
        }
    }
    static final String DFA9_eotS =
        "\51\uffff";
    static final String DFA9_eofS =
        "\1\2\50\uffff";
    static final String DFA9_minS =
        "\1\30\50\uffff";
    static final String DFA9_maxS =
        "\1\107\50\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\46\uffff";
    static final String DFA9_specialS =
        "\51\uffff}>";
    static final String[] DFA9_transitionS = {
            "\3\2\3\uffff\22\2\2\uffff\2\2\1\uffff\2\2\1\1\7\2\1\uffff\5"+
            "\2\2\uffff\1\2",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "65:50: (els= elseexp e3= expr )?";
        }
    }
    static final String DFA10_eotS =
        "\51\uffff";
    static final String DFA10_eofS =
        "\1\2\50\uffff";
    static final String DFA10_minS =
        "\1\30\50\uffff";
    static final String DFA10_maxS =
        "\1\107\50\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\46\uffff";
    static final String DFA10_specialS =
        "\51\uffff}>";
    static final String[] DFA10_transitionS = {
            "\3\2\3\uffff\4\2\1\1\15\2\2\uffff\2\2\1\uffff\12\2\1\uffff\5"+
            "\2\2\uffff\1\2",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "78:17: (af= ':=' e1= expr )?";
        }
    }
    static final String DFA11_eotS =
        "\51\uffff";
    static final String DFA11_eofS =
        "\1\1\50\uffff";
    static final String DFA11_minS =
        "\1\30\50\uffff";
    static final String DFA11_maxS =
        "\1\107\50\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\23\uffff\1\1\23\uffff";
    static final String DFA11_specialS =
        "\51\uffff}>";
    static final String[] DFA11_transitionS = {
            "\3\1\3\uffff\5\1\1\25\14\1\2\uffff\2\1\1\uffff\12\1\1\uffff"+
            "\5\1\2\uffff\1\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 83:17: (ortoken= '|' andop )*";
        }
    }
    static final String DFA12_eotS =
        "\51\uffff";
    static final String DFA12_eofS =
        "\1\1\50\uffff";
    static final String DFA12_minS =
        "\1\30\50\uffff";
    static final String DFA12_maxS =
        "\1\107\50\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\2\23\uffff\1\1\23\uffff";
    static final String DFA12_specialS =
        "\51\uffff}>";
    static final String[] DFA12_transitionS = {
            "\3\1\3\uffff\6\1\1\25\13\1\2\uffff\2\1\1\uffff\12\1\1\uffff"+
            "\5\1\2\uffff\1\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

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
        public String getDescription() {
            return "()* loopback of 86:17: (andtoken= '&' comp )*";
        }
    }
    static final String DFA16_eotS =
        "\51\uffff";
    static final String DFA16_eofS =
        "\1\4\50\uffff";
    static final String DFA16_minS =
        "\1\30\50\uffff";
    static final String DFA16_maxS =
        "\1\107\50\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\3\1\1\2\44\uffff";
    static final String DFA16_specialS =
        "\51\uffff}>";
    static final String[] DFA16_transitionS = {
            "\3\4\3\uffff\7\4\1\1\1\3\1\2\10\4\2\uffff\2\4\1\uffff\12\4\1"+
            "\uffff\5\4\2\uffff\1\4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "89:18: ( (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' ) b2= binary )?";
        }
    }
    static final String DFA17_eotS =
        "\51\uffff";
    static final String DFA17_eofS =
        "\1\1\50\uffff";
    static final String DFA17_minS =
        "\1\30\50\uffff";
    static final String DFA17_maxS =
        "\1\107\50\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\2\23\uffff\1\1\10\uffff\1\1\12\uffff";
    static final String DFA17_specialS =
        "\51\uffff}>";
    static final String[] DFA17_transitionS = {
            "\3\1\3\uffff\14\1\1\25\5\1\2\uffff\2\1\1\uffff\12\1\1\uffff"+
            "\5\1\2\uffff\1\36",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 98:21: ( addminexp b21= binary2 )*";
        }
    }
    static final String DFA19_eotS =
        "\51\uffff";
    static final String DFA19_eofS =
        "\1\1\50\uffff";
    static final String DFA19_minS =
        "\1\30\50\uffff";
    static final String DFA19_maxS =
        "\1\107\50\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\2\22\uffff\2\1\23\uffff";
    static final String DFA19_specialS =
        "\51\uffff}>";
    static final String[] DFA19_transitionS = {
            "\3\1\3\uffff\12\1\1\24\1\25\6\1\2\uffff\2\1\1\uffff\12\1\1\uffff"+
            "\5\1\2\uffff\1\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 101:18: ( (mul= '*' | div= '/' ) neg )*";
        }
    }
    static final String DFA24_eotS =
        "\51\uffff";
    static final String DFA24_eofS =
        "\1\4\50\uffff";
    static final String DFA24_minS =
        "\1\30\50\uffff";
    static final String DFA24_maxS =
        "\1\107\50\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\2\1\1\2\1\3\44\uffff";
    static final String DFA24_specialS =
        "\51\uffff}>";
    static final String[] DFA24_transitionS = {
            "\3\4\3\uffff\15\4\1\3\1\4\1\1\1\2\1\4\2\uffff\2\4\1\uffff\12"+
            "\4\1\uffff\5\4\2\uffff\1\4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "117:15: (v= lvalue2 | par= '(' (e= expr_list )? ')' )?";
        }
    }
    static final String DFA25_eotS =
        "\51\uffff";
    static final String DFA25_eofS =
        "\1\3\50\uffff";
    static final String DFA25_minS =
        "\1\30\50\uffff";
    static final String DFA25_maxS =
        "\1\107\50\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\2\1\1\2\45\uffff";
    static final String DFA25_specialS =
        "\51\uffff}>";
    static final String[] DFA25_transitionS = {
            "\3\3\3\uffff\17\3\1\1\1\2\1\3\2\uffff\2\3\1\uffff\12\3\1\uffff"+
            "\5\3\2\uffff\1\3",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "124:20: (v= lvalue2 )?";
        }
    }
    static final String DFA26_eotS =
        "\52\uffff";
    static final String DFA26_eofS =
        "\1\4\51\uffff";
    static final String DFA26_minS =
        "\1\30\51\uffff";
    static final String DFA26_maxS =
        "\1\107\51\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\2\1\1\2\1\3\45\uffff";
    static final String DFA26_specialS =
        "\52\uffff}>";
    static final String[] DFA26_transitionS = {
            "\3\4\3\uffff\17\4\1\1\1\2\1\4\2\uffff\2\4\1\uffff\12\4\1\3\5"+
            "\4\2\uffff\1\4",
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
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "125:20: (val= lvalue2 | o= ofexp e2= expr )?";
        }
    }
    static final String DFA43_eotS =
        "\51\uffff";
    static final String DFA43_eofS =
        "\1\1\50\uffff";
    static final String DFA43_minS =
        "\1\30\50\uffff";
    static final String DFA43_maxS =
        "\1\107\50\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\2\25\uffff\2\1\20\uffff";
    static final String DFA43_specialS =
        "\51\uffff}>";
    static final String[] DFA43_transitionS = {
            "\3\1\3\uffff\17\1\1\27\1\30\1\1\2\uffff\2\1\1\uffff\12\1\1\uffff"+
            "\5\1\2\uffff\1\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

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
        public String getDescription() {
            return "()* loopback of 184:34: ( lvalue2 )*";
        }
    }
 

    public static final BitSet FOLLOW_expr_in_tiger3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nilexp_in_expr126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affect_in_expr131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_id_in_expr136 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_expr140 = new BitSet(new long[]{0x0000000181000000L});
    public static final BitSet FOLLOW_field_list_in_expr142 = new BitSet(new long[]{0x0000000181000000L});
    public static final BitSet FOLLOW_31_in_expr145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifop_in_expr152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forop_in_expr157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileop_in_expr162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakexp_in_expr167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letexp_in_expr174 = new BitSet(new long[]{0x1400000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_declaration_list_in_expr179 = new BitSet(new long[]{0x1400000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_inexp_in_expr183 = new BitSet(new long[]{0x6B2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_seq_in_expr187 = new BitSet(new long[]{0x6B2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_endexp_in_expr191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list230 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_expr_list233 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_list_in_expr_list237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_seq265 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_expr_seq271 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_seq_in_expr_seq277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_field_list302 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_field_list304 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_field_list306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_field_list310 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_field_list312 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_field_list314 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_field_list316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifexp_in_ifop330 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_ifop334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_thenexp_in_ifop340 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_ifop346 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_elseexp_in_ifop353 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_ifop359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forexp_in_forop414 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_forop418 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_forop420 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_forop424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_toexp_in_forop426 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_forop430 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_doexp_in_forop434 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_forop440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileexp_in_whileop491 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_whileop495 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_doexp_in_whileop499 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_whileop505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orop_in_affect542 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_affect547 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_affect551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andop_in_orop591 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_orop596 = new BitSet(new long[]{0x00000C0007000000L});
    public static final BitSet FOLLOW_andop_in_orop599 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_comp_in_andop614 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_andop619 = new BitSet(new long[]{0x00000C0007000000L});
    public static final BitSet FOLLOW_comp_in_andop622 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_binary_in_comp636 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_37_in_comp642 = new BitSet(new long[]{0x00000C4007000000L});
    public static final BitSet FOLLOW_38_in_comp646 = new BitSet(new long[]{0x00000C0007000000L});
    public static final BitSet FOLLOW_39_in_comp654 = new BitSet(new long[]{0x00000C6007000000L});
    public static final BitSet FOLLOW_37_in_comp659 = new BitSet(new long[]{0x00000C0007000000L});
    public static final BitSet FOLLOW_38_in_comp665 = new BitSet(new long[]{0x00000C0007000000L});
    public static final BitSet FOLLOW_38_in_comp673 = new BitSet(new long[]{0x00000C0007000000L});
    public static final BitSet FOLLOW_binary_in_comp678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary2_in_binary819 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_addminexp_in_binary822 = new BitSet(new long[]{0x00000C0007000000L});
    public static final BitSet FOLLOW_binary2_in_binary827 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_neg_in_binary2842 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_40_in_binary2848 = new BitSet(new long[]{0x00000C0007000000L});
    public static final BitSet FOLLOW_41_in_binary2853 = new BitSet(new long[]{0x00000C0007000000L});
    public static final BitSet FOLLOW_neg_in_binary2857 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_42_in_neg871 = new BitSet(new long[]{0x00000C0007000000L});
    public static final BitSet FOLLOW_atom_in_neg876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_atom911 = new BitSet(new long[]{0x6A2C1C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_seq_in_atom915 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_atom918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_atom942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lvalue966 = new BitSet(new long[]{0x0000680000000002L});
    public static final BitSet FOLLOW_lvalue2_in_lvalue971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_lvalue977 = new BitSet(new long[]{0x6A2C1C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_list_in_lvalue981 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_lvalue984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_lvalue21062 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_lvalue21064 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_lvalue2_in_lvalue21068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_lvalue21086 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_lvalue21090 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_lvalue21092 = new BitSet(new long[]{0x8000600000000002L});
    public static final BitSet FOLLOW_lvalue2_in_lvalue21097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ofexp_in_lvalue21103 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_lvalue21107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declaration_list1177 = new BitSet(new long[]{0x0400000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_declaration_list_in_declaration_list1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_declaration1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_declaration1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_in_declaration1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeexp_in_type_declaration1233 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_type_declaration1237 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_type_declaration1239 = new BitSet(new long[]{0x000D000040000000L});
    public static final BitSet FOLLOW_type_in_type_declaration1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_id_in_type1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_type1286 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_type_fields_in_type1290 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_type1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_type1323 = new BitSet(new long[]{0x000C000001000000L});
    public static final BitSet FOLLOW_type_id_in_type1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varexp_in_variable_declaration1374 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_variable_declaration1378 = new BitSet(new long[]{0x0002000400000000L});
    public static final BitSet FOLLOW_49_in_variable_declaration1384 = new BitSet(new long[]{0x000C000001000000L});
    public static final BitSet FOLLOW_ID_in_variable_declaration1389 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_type_id_in_variable_declaration1395 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_variable_declaration1400 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_variable_declaration1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionexp_in_function_declaration1480 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_function_declaration1482 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_function_declaration1484 = new BitSet(new long[]{0x0000100001000000L});
    public static final BitSet FOLLOW_type_fields_in_function_declaration1488 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_function_declaration1491 = new BitSet(new long[]{0x0002004000000000L});
    public static final BitSet FOLLOW_49_in_function_declaration1494 = new BitSet(new long[]{0x000C000001000000L});
    public static final BitSet FOLLOW_type_id_in_function_declaration1499 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_function_declaration1503 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_function_declaration1509 = new BitSet(new long[]{0x6A2C0C0007000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_function_declaration1516 = new BitSet(new long[]{0x6A2C0C0007000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_field_in_type_fields1706 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_type_fields2_in_type_fields1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_type_fields21734 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_type_field_in_type_fields21738 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_type_fields2_in_type_fields21742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_field1768 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_type_field1770 = new BitSet(new long[]{0x000C000001000000L});
    public static final BitSet FOLLOW_type_id_in_type_field1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_field1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_type_id1826 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_51_in_type_id1832 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_lvalue2_in_type_id1835 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_52_in_arrayexp1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_breakexp1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_doexp1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_elseexp1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_endexp1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_forexp1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_functionexp1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ifexp1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_inexp1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_nilexp1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_letexp1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ofexp1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_thenexp1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_toexp1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_typeexp1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_varexp1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_whileexp1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_typedefexp2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_blockexp2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_addminexp0 = new BitSet(new long[]{0x0000000000000002L});

}