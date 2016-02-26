// $ANTLR 3.3 Nov 30, 2010 12:50:56 albert22u/Tiger3.g 2016-02-26 09:40:10

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Tiger3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TAIGA", "DECLARATIONS", "BLOCK", "COMP", "COND", "BEGIN", "END", "PARAMSFORM", "PARAMSEFF", "PARAM", "TYPE", "TAB", "STRUCT", "CELL", "SIZE", "INIT", "PRIMITIF", "NEWLINE", "ID", "INT", "STRING", "WS", "COMMENT", "'{'", "'}'", "','", "';'", "':='", "'|'", "'&'", "'>'", "'='", "'<'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'.'", "'['", "']'", "'array of'", "':'", "'int'", "'string'", "'array'", "'break'", "'do'", "'else'", "'end'", "'for'", "'function'", "'if'", "'in'", "'nil'", "'let'", "'of'", "'then'", "'to'", "'type'", "'var'", "'while'", "'typedef'", "'block'"
    };
    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
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
    public static final int STRUCT=16;
    public static final int CELL=17;
    public static final int SIZE=18;
    public static final int INIT=19;
    public static final int PRIMITIF=20;
    public static final int NEWLINE=21;
    public static final int ID=22;
    public static final int INT=23;
    public static final int STRING=24;
    public static final int WS=25;
    public static final int COMMENT=26;

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
    public String getGrammarFileName() { return "albert22u/Tiger3.g"; }


    /** Map variable name to Integer object holding value */
    HashMap<String,Integer>  memory = new HashMap<String,Integer>();


    public static class tiger3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tiger3"
    // albert22u/Tiger3.g:38:1: tiger3 : e1= expr ( NEWLINE )* -> ^( TAIGA $e1) ;
    public final Tiger3Parser.tiger3_return tiger3() throws RecognitionException {
        Tiger3Parser.tiger3_return retval = new Tiger3Parser.tiger3_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE1=null;
        Tiger3Parser.expr_return e1 = null;


        Object NEWLINE1_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // albert22u/Tiger3.g:38:8: (e1= expr ( NEWLINE )* -> ^( TAIGA $e1) )
            // albert22u/Tiger3.g:38:10: e1= expr ( NEWLINE )*
            {
            pushFollow(FOLLOW_expr_in_tiger3100);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            // albert22u/Tiger3.g:38:18: ( NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NEWLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // albert22u/Tiger3.g:38:18: NEWLINE
            	    {
            	    NEWLINE1=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_tiger3102);  
            	    stream_NEWLINE.add(NEWLINE1);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



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
            // 38:27: -> ^( TAIGA $e1)
            {
                // albert22u/Tiger3.g:38:30: ^( TAIGA $e1)
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
    // albert22u/Tiger3.g:40:1: expr : ( nilexp | affect | type_id ( '{' ( field_list )* '}' )? | ifop | forop | whileop | breakexp | l= letexp decl= declaration_list ( NEWLINE )? inexp (e= expr_seq )? ( NEWLINE )? endexp -> {$e.tree != null}? ^( $l ^( DECLARATIONS $decl) ^( BLOCK $e) ) -> ^( $l ^( DECLARATIONS $decl) ) );
    public final Tiger3Parser.expr_return expr() throws RecognitionException {
        Tiger3Parser.expr_return retval = new Tiger3Parser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal5=null;
        Token char_literal7=null;
        Token NEWLINE12=null;
        Token NEWLINE14=null;
        Tiger3Parser.letexp_return l = null;

        Tiger3Parser.declaration_list_return decl = null;

        Tiger3Parser.expr_seq_return e = null;

        Tiger3Parser.nilexp_return nilexp2 = null;

        Tiger3Parser.affect_return affect3 = null;

        Tiger3Parser.type_id_return type_id4 = null;

        Tiger3Parser.field_list_return field_list6 = null;

        Tiger3Parser.ifop_return ifop8 = null;

        Tiger3Parser.forop_return forop9 = null;

        Tiger3Parser.whileop_return whileop10 = null;

        Tiger3Parser.breakexp_return breakexp11 = null;

        Tiger3Parser.inexp_return inexp13 = null;

        Tiger3Parser.endexp_return endexp15 = null;


        Object char_literal5_tree=null;
        Object char_literal7_tree=null;
        Object NEWLINE12_tree=null;
        Object NEWLINE14_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule declaration_list");
        RewriteRuleSubtreeStream stream_inexp=new RewriteRuleSubtreeStream(adaptor,"rule inexp");
        RewriteRuleSubtreeStream stream_letexp=new RewriteRuleSubtreeStream(adaptor,"rule letexp");
        RewriteRuleSubtreeStream stream_endexp=new RewriteRuleSubtreeStream(adaptor,"rule endexp");
        RewriteRuleSubtreeStream stream_expr_seq=new RewriteRuleSubtreeStream(adaptor,"rule expr_seq");
        try {
            // albert22u/Tiger3.g:40:6: ( nilexp | affect | type_id ( '{' ( field_list )* '}' )? | ifop | forop | whileop | breakexp | l= letexp decl= declaration_list ( NEWLINE )? inexp (e= expr_seq )? ( NEWLINE )? endexp -> {$e.tree != null}? ^( $l ^( DECLARATIONS $decl) ^( BLOCK $e) ) -> ^( $l ^( DECLARATIONS $decl) ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt7=1;
                }
                break;
            case ID:
            case INT:
            case STRING:
            case 38:
            case 41:
                {
                alt7=2;
                }
                break;
            case 48:
            case 49:
                {
                alt7=3;
                }
                break;
            case 57:
                {
                alt7=4;
                }
                break;
            case 55:
                {
                alt7=5;
                }
                break;
            case 66:
                {
                alt7=6;
                }
                break;
            case 51:
                {
                alt7=7;
                }
                break;
            case 60:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // albert22u/Tiger3.g:40:8: nilexp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nilexp_in_expr120);
                    nilexp2=nilexp();

                    state._fsp--;

                    adaptor.addChild(root_0, nilexp2.getTree());

                    }
                    break;
                case 2 :
                    // albert22u/Tiger3.g:41:4: affect
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_affect_in_expr125);
                    affect3=affect();

                    state._fsp--;

                    adaptor.addChild(root_0, affect3.getTree());

                    }
                    break;
                case 3 :
                    // albert22u/Tiger3.g:42:4: type_id ( '{' ( field_list )* '}' )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_id_in_expr130);
                    type_id4=type_id();

                    state._fsp--;

                    adaptor.addChild(root_0, type_id4.getTree());
                    // albert22u/Tiger3.g:42:12: ( '{' ( field_list )* '}' )?
                    int alt3=2;
                    alt3 = dfa3.predict(input);
                    switch (alt3) {
                        case 1 :
                            // albert22u/Tiger3.g:42:14: '{' ( field_list )* '}'
                            {
                            char_literal5=(Token)match(input,27,FOLLOW_27_in_expr134); 
                            char_literal5_tree = (Object)adaptor.create(char_literal5);
                            adaptor.addChild(root_0, char_literal5_tree);

                            // albert22u/Tiger3.g:42:18: ( field_list )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( (LA2_0==ID||LA2_0==29) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // albert22u/Tiger3.g:42:18: field_list
                            	    {
                            	    pushFollow(FOLLOW_field_list_in_expr136);
                            	    field_list6=field_list();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, field_list6.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);

                            char_literal7=(Token)match(input,28,FOLLOW_28_in_expr139); 
                            char_literal7_tree = (Object)adaptor.create(char_literal7);
                            adaptor.addChild(root_0, char_literal7_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // albert22u/Tiger3.g:43:4: ifop
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifop_in_expr146);
                    ifop8=ifop();

                    state._fsp--;

                    adaptor.addChild(root_0, ifop8.getTree());

                    }
                    break;
                case 5 :
                    // albert22u/Tiger3.g:44:4: forop
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forop_in_expr151);
                    forop9=forop();

                    state._fsp--;

                    adaptor.addChild(root_0, forop9.getTree());

                    }
                    break;
                case 6 :
                    // albert22u/Tiger3.g:45:4: whileop
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileop_in_expr156);
                    whileop10=whileop();

                    state._fsp--;

                    adaptor.addChild(root_0, whileop10.getTree());

                    }
                    break;
                case 7 :
                    // albert22u/Tiger3.g:46:4: breakexp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakexp_in_expr161);
                    breakexp11=breakexp();

                    state._fsp--;

                    adaptor.addChild(root_0, breakexp11.getTree());

                    }
                    break;
                case 8 :
                    // albert22u/Tiger3.g:47:4: l= letexp decl= declaration_list ( NEWLINE )? inexp (e= expr_seq )? ( NEWLINE )? endexp
                    {
                    pushFollow(FOLLOW_letexp_in_expr168);
                    l=letexp();

                    state._fsp--;

                    stream_letexp.add(l.getTree());
                    pushFollow(FOLLOW_declaration_list_in_expr172);
                    decl=declaration_list();

                    state._fsp--;

                    stream_declaration_list.add(decl.getTree());
                    // albert22u/Tiger3.g:47:35: ( NEWLINE )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==NEWLINE) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // albert22u/Tiger3.g:47:35: NEWLINE
                            {
                            NEWLINE12=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_expr174);  
                            stream_NEWLINE.add(NEWLINE12);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_inexp_in_expr177);
                    inexp13=inexp();

                    state._fsp--;

                    stream_inexp.add(inexp13.getTree());
                    // albert22u/Tiger3.g:47:51: (e= expr_seq )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=ID && LA5_0<=STRING)||LA5_0==38||LA5_0==41||(LA5_0>=48 && LA5_0<=49)||LA5_0==51||LA5_0==55||LA5_0==57||(LA5_0>=59 && LA5_0<=60)||LA5_0==66) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // albert22u/Tiger3.g:47:51: e= expr_seq
                            {
                            pushFollow(FOLLOW_expr_seq_in_expr181);
                            e=expr_seq();

                            state._fsp--;

                            stream_expr_seq.add(e.getTree());

                            }
                            break;

                    }

                    // albert22u/Tiger3.g:47:62: ( NEWLINE )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==NEWLINE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // albert22u/Tiger3.g:47:62: NEWLINE
                            {
                            NEWLINE14=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_expr184);  
                            stream_NEWLINE.add(NEWLINE14);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_endexp_in_expr187);
                    endexp15=endexp();

                    state._fsp--;

                    stream_endexp.add(endexp15.getTree());


                    // AST REWRITE
                    // elements: decl, l, decl, l, e
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
                    // 48:4: -> {$e.tree != null}? ^( $l ^( DECLARATIONS $decl) ^( BLOCK $e) )
                    if ((e!=null?((Object)e.tree):null) != null) {
                        // albert22u/Tiger3.g:48:26: ^( $l ^( DECLARATIONS $decl) ^( BLOCK $e) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_l.nextNode(), root_1);

                        // albert22u/Tiger3.g:48:31: ^( DECLARATIONS $decl)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_2);

                        adaptor.addChild(root_2, stream_decl.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // albert22u/Tiger3.g:48:53: ^( BLOCK $e)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                        adaptor.addChild(root_2, stream_e.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 49:4: -> ^( $l ^( DECLARATIONS $decl) )
                    {
                        // albert22u/Tiger3.g:49:7: ^( $l ^( DECLARATIONS $decl) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_l.nextNode(), root_1);

                        // albert22u/Tiger3.g:49:12: ^( DECLARATIONS $decl)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_2);

                        adaptor.addChild(root_2, stream_decl.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

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
    // albert22u/Tiger3.g:52:1: expr_list : e1= expr (v= ',' e2= expr_list )? -> {$v.text != null}? $e1 $e2 -> $e1;
    public final Tiger3Parser.expr_list_return expr_list() throws RecognitionException {
        Tiger3Parser.expr_list_return retval = new Tiger3Parser.expr_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token v=null;
        Tiger3Parser.expr_return e1 = null;

        Tiger3Parser.expr_list_return e2 = null;


        Object v_tree=null;
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // albert22u/Tiger3.g:52:12: (e1= expr (v= ',' e2= expr_list )? -> {$v.text != null}? $e1 $e2 -> $e1)
            // albert22u/Tiger3.g:52:14: e1= expr (v= ',' e2= expr_list )?
            {
            pushFollow(FOLLOW_expr_in_expr_list243);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            // albert22u/Tiger3.g:52:22: (v= ',' e2= expr_list )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // albert22u/Tiger3.g:52:23: v= ',' e2= expr_list
                    {
                    v=(Token)match(input,29,FOLLOW_29_in_expr_list248);  
                    stream_29.add(v);

                    pushFollow(FOLLOW_expr_list_in_expr_list252);
                    e2=expr_list();

                    state._fsp--;

                    stream_expr_list.add(e2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: e2, e1, e1
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
            // 53:4: -> {$v.text != null}? $e1 $e2
            if ((v!=null?v.getText():null) != null) {
                adaptor.addChild(root_0, stream_e1.nextTree());
                adaptor.addChild(root_0, stream_e2.nextTree());

            }
            else // 54:4: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

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
    // albert22u/Tiger3.g:57:1: expr_seq : e1= expr ( NEWLINE )* (pv= ';' ( NEWLINE )* e2= expr_seq )? -> {$pv.text != null}? $e1 $e2 -> $e1;
    public final Tiger3Parser.expr_seq_return expr_seq() throws RecognitionException {
        Tiger3Parser.expr_seq_return retval = new Tiger3Parser.expr_seq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token pv=null;
        Token NEWLINE16=null;
        Token NEWLINE17=null;
        Tiger3Parser.expr_return e1 = null;

        Tiger3Parser.expr_seq_return e2 = null;


        Object pv_tree=null;
        Object NEWLINE16_tree=null;
        Object NEWLINE17_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_expr_seq=new RewriteRuleSubtreeStream(adaptor,"rule expr_seq");
        try {
            // albert22u/Tiger3.g:57:10: (e1= expr ( NEWLINE )* (pv= ';' ( NEWLINE )* e2= expr_seq )? -> {$pv.text != null}? $e1 $e2 -> $e1)
            // albert22u/Tiger3.g:57:12: e1= expr ( NEWLINE )* (pv= ';' ( NEWLINE )* e2= expr_seq )?
            {
            pushFollow(FOLLOW_expr_in_expr_seq289);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            // albert22u/Tiger3.g:57:20: ( NEWLINE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==NEWLINE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // albert22u/Tiger3.g:57:20: NEWLINE
            	    {
            	    NEWLINE16=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_expr_seq291);  
            	    stream_NEWLINE.add(NEWLINE16);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // albert22u/Tiger3.g:57:30: (pv= ';' ( NEWLINE )* e2= expr_seq )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // albert22u/Tiger3.g:57:31: pv= ';' ( NEWLINE )* e2= expr_seq
                    {
                    pv=(Token)match(input,30,FOLLOW_30_in_expr_seq298);  
                    stream_30.add(pv);

                    // albert22u/Tiger3.g:57:38: ( NEWLINE )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==NEWLINE) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // albert22u/Tiger3.g:57:38: NEWLINE
                    	    {
                    	    NEWLINE17=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_expr_seq300);  
                    	    stream_NEWLINE.add(NEWLINE17);


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    pushFollow(FOLLOW_expr_seq_in_expr_seq305);
                    e2=expr_seq();

                    state._fsp--;

                    stream_expr_seq.add(e2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: e1, e1, e2
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
            // 58:4: -> {$pv.text != null}? $e1 $e2
            if ((pv!=null?pv.getText():null) != null) {
                adaptor.addChild(root_0, stream_e1.nextTree());
                adaptor.addChild(root_0, stream_e2.nextTree());

            }
            else // 59:4: -> $e1
            {
                adaptor.addChild(root_0, stream_e1.nextTree());

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
    // albert22u/Tiger3.g:62:1: field_list : ( ID ':=' expr | ',' ID ':=' expr );
    public final Tiger3Parser.field_list_return field_list() throws RecognitionException {
        Tiger3Parser.field_list_return retval = new Tiger3Parser.field_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID18=null;
        Token string_literal19=null;
        Token char_literal21=null;
        Token ID22=null;
        Token string_literal23=null;
        Tiger3Parser.expr_return expr20 = null;

        Tiger3Parser.expr_return expr24 = null;


        Object ID18_tree=null;
        Object string_literal19_tree=null;
        Object char_literal21_tree=null;
        Object ID22_tree=null;
        Object string_literal23_tree=null;

        try {
            // albert22u/Tiger3.g:62:12: ( ID ':=' expr | ',' ID ':=' expr )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // albert22u/Tiger3.g:62:14: ID ':=' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ID18=(Token)match(input,ID,FOLLOW_ID_in_field_list339); 
                    ID18_tree = (Object)adaptor.create(ID18);
                    adaptor.addChild(root_0, ID18_tree);

                    string_literal19=(Token)match(input,31,FOLLOW_31_in_field_list341); 
                    string_literal19_tree = (Object)adaptor.create(string_literal19);
                    adaptor.addChild(root_0, string_literal19_tree);

                    pushFollow(FOLLOW_expr_in_field_list343);
                    expr20=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr20.getTree());

                    }
                    break;
                case 2 :
                    // albert22u/Tiger3.g:62:29: ',' ID ':=' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal21=(Token)match(input,29,FOLLOW_29_in_field_list347); 
                    char_literal21_tree = (Object)adaptor.create(char_literal21);
                    adaptor.addChild(root_0, char_literal21_tree);

                    ID22=(Token)match(input,ID,FOLLOW_ID_in_field_list349); 
                    ID22_tree = (Object)adaptor.create(ID22);
                    adaptor.addChild(root_0, ID22_tree);

                    string_literal23=(Token)match(input,31,FOLLOW_31_in_field_list351); 
                    string_literal23_tree = (Object)adaptor.create(string_literal23);
                    adaptor.addChild(root_0, string_literal23_tree);

                    pushFollow(FOLLOW_expr_in_field_list353);
                    expr24=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr24.getTree());

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
    // albert22u/Tiger3.g:65:1: ifop : fi= ifexp e1= expr ( NEWLINE )* th= thenexp ( NEWLINE )* e2= expr ( NEWLINE )* (els= elseexp ( NEWLINE )* e3= expr )? -> {$els.text != null}? ^( $fi ^( COND $e1) ^( $th $e2) ^( $els $e3) ) -> ^( $fi ^( COND $e1) ^( $th $e2) ) ;
    public final Tiger3Parser.ifop_return ifop() throws RecognitionException {
        Tiger3Parser.ifop_return retval = new Tiger3Parser.ifop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE25=null;
        Token NEWLINE26=null;
        Token NEWLINE27=null;
        Token NEWLINE28=null;
        Tiger3Parser.ifexp_return fi = null;

        Tiger3Parser.expr_return e1 = null;

        Tiger3Parser.thenexp_return th = null;

        Tiger3Parser.expr_return e2 = null;

        Tiger3Parser.elseexp_return els = null;

        Tiger3Parser.expr_return e3 = null;


        Object NEWLINE25_tree=null;
        Object NEWLINE26_tree=null;
        Object NEWLINE27_tree=null;
        Object NEWLINE28_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_ifexp=new RewriteRuleSubtreeStream(adaptor,"rule ifexp");
        RewriteRuleSubtreeStream stream_elseexp=new RewriteRuleSubtreeStream(adaptor,"rule elseexp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_thenexp=new RewriteRuleSubtreeStream(adaptor,"rule thenexp");
        try {
            // albert22u/Tiger3.g:65:6: (fi= ifexp e1= expr ( NEWLINE )* th= thenexp ( NEWLINE )* e2= expr ( NEWLINE )* (els= elseexp ( NEWLINE )* e3= expr )? -> {$els.text != null}? ^( $fi ^( COND $e1) ^( $th $e2) ^( $els $e3) ) -> ^( $fi ^( COND $e1) ^( $th $e2) ) )
            // albert22u/Tiger3.g:65:8: fi= ifexp e1= expr ( NEWLINE )* th= thenexp ( NEWLINE )* e2= expr ( NEWLINE )* (els= elseexp ( NEWLINE )* e3= expr )?
            {
            pushFollow(FOLLOW_ifexp_in_ifop367);
            fi=ifexp();

            state._fsp--;

            stream_ifexp.add(fi.getTree());
            pushFollow(FOLLOW_expr_in_ifop371);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            // albert22u/Tiger3.g:65:25: ( NEWLINE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==NEWLINE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // albert22u/Tiger3.g:65:25: NEWLINE
            	    {
            	    NEWLINE25=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ifop373);  
            	    stream_NEWLINE.add(NEWLINE25);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            pushFollow(FOLLOW_thenexp_in_ifop378);
            th=thenexp();

            state._fsp--;

            stream_thenexp.add(th.getTree());
            // albert22u/Tiger3.g:65:45: ( NEWLINE )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==NEWLINE) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // albert22u/Tiger3.g:65:45: NEWLINE
            	    {
            	    NEWLINE26=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ifop380);  
            	    stream_NEWLINE.add(NEWLINE26);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            pushFollow(FOLLOW_expr_in_ifop385);
            e2=expr();

            state._fsp--;

            stream_expr.add(e2.getTree());
            // albert22u/Tiger3.g:65:62: ( NEWLINE )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // albert22u/Tiger3.g:65:62: NEWLINE
            	    {
            	    NEWLINE27=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ifop387);  
            	    stream_NEWLINE.add(NEWLINE27);


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // albert22u/Tiger3.g:65:71: (els= elseexp ( NEWLINE )* e3= expr )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // albert22u/Tiger3.g:65:72: els= elseexp ( NEWLINE )* e3= expr
                    {
                    pushFollow(FOLLOW_elseexp_in_ifop393);
                    els=elseexp();

                    state._fsp--;

                    stream_elseexp.add(els.getTree());
                    // albert22u/Tiger3.g:65:84: ( NEWLINE )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==NEWLINE) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // albert22u/Tiger3.g:65:84: NEWLINE
                    	    {
                    	    NEWLINE28=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ifop395);  
                    	    stream_NEWLINE.add(NEWLINE28);


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    pushFollow(FOLLOW_expr_in_ifop400);
                    e3=expr();

                    state._fsp--;

                    stream_expr.add(e3.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: th, e1, fi, e1, e2, els, fi, th, e3, e2
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
            // 66:4: -> {$els.text != null}? ^( $fi ^( COND $e1) ^( $th $e2) ^( $els $e3) )
            if ((els!=null?input.toString(els.start,els.stop):null) != null) {
                // albert22u/Tiger3.g:66:28: ^( $fi ^( COND $e1) ^( $th $e2) ^( $els $e3) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fi.nextNode(), root_1);

                // albert22u/Tiger3.g:66:34: ^( COND $e1)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);

                adaptor.addChild(root_2, stream_e1.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // albert22u/Tiger3.g:66:46: ^( $th $e2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_th.nextNode(), root_2);

                adaptor.addChild(root_2, stream_e2.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // albert22u/Tiger3.g:66:57: ^( $els $e3)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_els.nextNode(), root_2);

                adaptor.addChild(root_2, stream_e3.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 67:4: -> ^( $fi ^( COND $e1) ^( $th $e2) )
            {
                // albert22u/Tiger3.g:67:7: ^( $fi ^( COND $e1) ^( $th $e2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fi.nextNode(), root_1);

                // albert22u/Tiger3.g:67:13: ^( COND $e1)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);

                adaptor.addChild(root_2, stream_e1.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // albert22u/Tiger3.g:67:25: ^( $th $e2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_th.nextNode(), root_2);

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
    // $ANTLR end "ifop"

    public static class forop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forop"
    // albert22u/Tiger3.g:70:1: forop : fo= forexp dd= ID ':=' e1= expr toexp e2= expr ( NEWLINE )* doexp ( NEWLINE )* e3= expr -> ^( $fo ^( $dd ^( BEGIN $e1) ^( END $e2) ) ^( BLOCK $e3) ) ;
    public final Tiger3Parser.forop_return forop() throws RecognitionException {
        Tiger3Parser.forop_return retval = new Tiger3Parser.forop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token dd=null;
        Token string_literal29=null;
        Token NEWLINE31=null;
        Token NEWLINE33=null;
        Tiger3Parser.forexp_return fo = null;

        Tiger3Parser.expr_return e1 = null;

        Tiger3Parser.expr_return e2 = null;

        Tiger3Parser.expr_return e3 = null;

        Tiger3Parser.toexp_return toexp30 = null;

        Tiger3Parser.doexp_return doexp32 = null;


        Object dd_tree=null;
        Object string_literal29_tree=null;
        Object NEWLINE31_tree=null;
        Object NEWLINE33_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_toexp=new RewriteRuleSubtreeStream(adaptor,"rule toexp");
        RewriteRuleSubtreeStream stream_forexp=new RewriteRuleSubtreeStream(adaptor,"rule forexp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_doexp=new RewriteRuleSubtreeStream(adaptor,"rule doexp");
        try {
            // albert22u/Tiger3.g:70:7: (fo= forexp dd= ID ':=' e1= expr toexp e2= expr ( NEWLINE )* doexp ( NEWLINE )* e3= expr -> ^( $fo ^( $dd ^( BEGIN $e1) ^( END $e2) ) ^( BLOCK $e3) ) )
            // albert22u/Tiger3.g:70:9: fo= forexp dd= ID ':=' e1= expr toexp e2= expr ( NEWLINE )* doexp ( NEWLINE )* e3= expr
            {
            pushFollow(FOLLOW_forexp_in_forop481);
            fo=forexp();

            state._fsp--;

            stream_forexp.add(fo.getTree());
            dd=(Token)match(input,ID,FOLLOW_ID_in_forop485);  
            stream_ID.add(dd);

            string_literal29=(Token)match(input,31,FOLLOW_31_in_forop487);  
            stream_31.add(string_literal29);

            pushFollow(FOLLOW_expr_in_forop491);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            pushFollow(FOLLOW_toexp_in_forop493);
            toexp30=toexp();

            state._fsp--;

            stream_toexp.add(toexp30.getTree());
            pushFollow(FOLLOW_expr_in_forop497);
            e2=expr();

            state._fsp--;

            stream_expr.add(e2.getTree());
            // albert22u/Tiger3.g:70:52: ( NEWLINE )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==NEWLINE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // albert22u/Tiger3.g:70:52: NEWLINE
            	    {
            	    NEWLINE31=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_forop499);  
            	    stream_NEWLINE.add(NEWLINE31);


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            pushFollow(FOLLOW_doexp_in_forop502);
            doexp32=doexp();

            state._fsp--;

            stream_doexp.add(doexp32.getTree());
            // albert22u/Tiger3.g:70:67: ( NEWLINE )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==NEWLINE) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // albert22u/Tiger3.g:70:67: NEWLINE
            	    {
            	    NEWLINE33=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_forop504);  
            	    stream_NEWLINE.add(NEWLINE33);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            pushFollow(FOLLOW_expr_in_forop509);
            e3=expr();

            state._fsp--;

            stream_expr.add(e3.getTree());


            // AST REWRITE
            // elements: dd, e2, e1, e3, fo
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
                // albert22u/Tiger3.g:71:7: ^( $fo ^( $dd ^( BEGIN $e1) ^( END $e2) ) ^( BLOCK $e3) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fo.nextNode(), root_1);

                // albert22u/Tiger3.g:71:13: ^( $dd ^( BEGIN $e1) ^( END $e2) )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_dd.nextNode(), root_2);

                // albert22u/Tiger3.g:71:19: ^( BEGIN $e1)
                {
                Object root_3 = (Object)adaptor.nil();
                root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(BEGIN, "BEGIN"), root_3);

                adaptor.addChild(root_3, stream_e1.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                // albert22u/Tiger3.g:71:32: ^( END $e2)
                {
                Object root_3 = (Object)adaptor.nil();
                root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(END, "END"), root_3);

                adaptor.addChild(root_3, stream_e2.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }
                // albert22u/Tiger3.g:71:44: ^( BLOCK $e3)
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
    // albert22u/Tiger3.g:74:1: whileop : whi= whileexp e1= expr ( NEWLINE )* doexp ( NEWLINE )* e2= expr -> ^( $whi ^( COND $e1) ^( BLOCK $e2) ) ;
    public final Tiger3Parser.whileop_return whileop() throws RecognitionException {
        Tiger3Parser.whileop_return retval = new Tiger3Parser.whileop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE34=null;
        Token NEWLINE36=null;
        Tiger3Parser.whileexp_return whi = null;

        Tiger3Parser.expr_return e1 = null;

        Tiger3Parser.expr_return e2 = null;

        Tiger3Parser.doexp_return doexp35 = null;


        Object NEWLINE34_tree=null;
        Object NEWLINE36_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_whileexp=new RewriteRuleSubtreeStream(adaptor,"rule whileexp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_doexp=new RewriteRuleSubtreeStream(adaptor,"rule doexp");
        try {
            // albert22u/Tiger3.g:74:9: (whi= whileexp e1= expr ( NEWLINE )* doexp ( NEWLINE )* e2= expr -> ^( $whi ^( COND $e1) ^( BLOCK $e2) ) )
            // albert22u/Tiger3.g:74:11: whi= whileexp e1= expr ( NEWLINE )* doexp ( NEWLINE )* e2= expr
            {
            pushFollow(FOLLOW_whileexp_in_whileop560);
            whi=whileexp();

            state._fsp--;

            stream_whileexp.add(whi.getTree());
            pushFollow(FOLLOW_expr_in_whileop564);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());
            // albert22u/Tiger3.g:74:32: ( NEWLINE )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==NEWLINE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // albert22u/Tiger3.g:74:32: NEWLINE
            	    {
            	    NEWLINE34=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_whileop566);  
            	    stream_NEWLINE.add(NEWLINE34);


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            pushFollow(FOLLOW_doexp_in_whileop569);
            doexp35=doexp();

            state._fsp--;

            stream_doexp.add(doexp35.getTree());
            // albert22u/Tiger3.g:74:47: ( NEWLINE )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==NEWLINE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // albert22u/Tiger3.g:74:47: NEWLINE
            	    {
            	    NEWLINE36=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_whileop571);  
            	    stream_NEWLINE.add(NEWLINE36);


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            pushFollow(FOLLOW_expr_in_whileop576);
            e2=expr();

            state._fsp--;

            stream_expr.add(e2.getTree());


            // AST REWRITE
            // elements: e1, e2, whi
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
                // albert22u/Tiger3.g:75:7: ^( $whi ^( COND $e1) ^( BLOCK $e2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_whi.nextNode(), root_1);

                // albert22u/Tiger3.g:75:14: ^( COND $e1)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);

                adaptor.addChild(root_2, stream_e1.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // albert22u/Tiger3.g:75:26: ^( BLOCK $e2)
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
    // albert22u/Tiger3.g:78:1: affect : o= orop (af= ':=' e1= expr )? -> {$af != null}? ^( $af $o $e1) -> $o;
    public final Tiger3Parser.affect_return affect() throws RecognitionException {
        Tiger3Parser.affect_return retval = new Tiger3Parser.affect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token af=null;
        Tiger3Parser.orop_return o = null;

        Tiger3Parser.expr_return e1 = null;


        Object af_tree=null;
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_orop=new RewriteRuleSubtreeStream(adaptor,"rule orop");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // albert22u/Tiger3.g:78:8: (o= orop (af= ':=' e1= expr )? -> {$af != null}? ^( $af $o $e1) -> $o)
            // albert22u/Tiger3.g:78:10: o= orop (af= ':=' e1= expr )?
            {
            pushFollow(FOLLOW_orop_in_affect613);
            o=orop();

            state._fsp--;

            stream_orop.add(o.getTree());
            // albert22u/Tiger3.g:78:17: (af= ':=' e1= expr )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // albert22u/Tiger3.g:78:18: af= ':=' e1= expr
                    {
                    af=(Token)match(input,31,FOLLOW_31_in_affect618);  
                    stream_31.add(af);

                    pushFollow(FOLLOW_expr_in_affect622);
                    e1=expr();

                    state._fsp--;

                    stream_expr.add(e1.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: o, e1, o, af
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
                // albert22u/Tiger3.g:79:22: ^( $af $o $e1)
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
    // albert22u/Tiger3.g:83:1: orop : a1= andop (ortoken= '|' andop )* ;
    public final Tiger3Parser.orop_return orop() throws RecognitionException {
        Tiger3Parser.orop_return retval = new Tiger3Parser.orop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ortoken=null;
        Tiger3Parser.andop_return a1 = null;

        Tiger3Parser.andop_return andop37 = null;


        Object ortoken_tree=null;

        try {
            // albert22u/Tiger3.g:83:6: (a1= andop (ortoken= '|' andop )* )
            // albert22u/Tiger3.g:83:8: a1= andop (ortoken= '|' andop )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andop_in_orop662);
            a1=andop();

            state._fsp--;

            adaptor.addChild(root_0, a1.getTree());
            // albert22u/Tiger3.g:83:17: (ortoken= '|' andop )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // albert22u/Tiger3.g:83:18: ortoken= '|' andop
            	    {
            	    ortoken=(Token)match(input,32,FOLLOW_32_in_orop667); 
            	    ortoken_tree = (Object)adaptor.create(ortoken);
            	    root_0 = (Object)adaptor.becomeRoot(ortoken_tree, root_0);

            	    pushFollow(FOLLOW_andop_in_orop670);
            	    andop37=andop();

            	    state._fsp--;

            	    adaptor.addChild(root_0, andop37.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // albert22u/Tiger3.g:88:1: andop : c1= comp (andtoken= '&' comp )* ;
    public final Tiger3Parser.andop_return andop() throws RecognitionException {
        Tiger3Parser.andop_return retval = new Tiger3Parser.andop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token andtoken=null;
        Tiger3Parser.comp_return c1 = null;

        Tiger3Parser.comp_return comp38 = null;


        Object andtoken_tree=null;

        try {
            // albert22u/Tiger3.g:88:7: (c1= comp (andtoken= '&' comp )* )
            // albert22u/Tiger3.g:88:9: c1= comp (andtoken= '&' comp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_comp_in_andop693);
            c1=comp();

            state._fsp--;

            adaptor.addChild(root_0, c1.getTree());
            // albert22u/Tiger3.g:88:17: (andtoken= '&' comp )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // albert22u/Tiger3.g:88:18: andtoken= '&' comp
            	    {
            	    andtoken=(Token)match(input,33,FOLLOW_33_in_andop698); 
            	    andtoken_tree = (Object)adaptor.create(andtoken);
            	    root_0 = (Object)adaptor.becomeRoot(andtoken_tree, root_0);

            	    pushFollow(FOLLOW_comp_in_andop701);
            	    comp38=comp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comp38.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // albert22u/Tiger3.g:93:1: comp : b1= binary ( (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' ) b2= binary )? -> {$sup1 != null && $eg1 != null}? ^( COMP[\">=\"] $b1 ^( $b2) ) -> {$inf1 != null && $eg2 != null}? ^( COMP[\"<=\"] $b1 ^( $b2) ) -> {$inf1 != null && $sup2 != null}? ^( COMP[\"<>\"] $b1 ^( $b2) ) -> {$sup1 != null }? ^( $sup1 $b1 ^( $b2) ) -> {$inf1 != null }? ^( $inf1 $b1 ^( $b2) ) -> {$eg3 != null}? ^( $eg3 $b1 ^( $b2) ) -> $b1;
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
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_binary=new RewriteRuleSubtreeStream(adaptor,"rule binary");
        try {
            // albert22u/Tiger3.g:93:6: (b1= binary ( (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' ) b2= binary )? -> {$sup1 != null && $eg1 != null}? ^( COMP[\">=\"] $b1 ^( $b2) ) -> {$inf1 != null && $eg2 != null}? ^( COMP[\"<=\"] $b1 ^( $b2) ) -> {$inf1 != null && $sup2 != null}? ^( COMP[\"<>\"] $b1 ^( $b2) ) -> {$sup1 != null }? ^( $sup1 $b1 ^( $b2) ) -> {$inf1 != null }? ^( $inf1 $b1 ^( $b2) ) -> {$eg3 != null}? ^( $eg3 $b1 ^( $b2) ) -> $b1)
            // albert22u/Tiger3.g:93:8: b1= binary ( (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' ) b2= binary )?
            {
            pushFollow(FOLLOW_binary_in_comp723);
            b1=binary();

            state._fsp--;

            stream_binary.add(b1.getTree());
            // albert22u/Tiger3.g:93:18: ( (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' ) b2= binary )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // albert22u/Tiger3.g:93:19: (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' ) b2= binary
                    {
                    // albert22u/Tiger3.g:93:19: (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' )
                    int alt27=3;
                    switch ( input.LA(1) ) {
                    case 34:
                        {
                        alt27=1;
                        }
                        break;
                    case 36:
                        {
                        alt27=2;
                        }
                        break;
                    case 35:
                        {
                        alt27=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }

                    switch (alt27) {
                        case 1 :
                            // albert22u/Tiger3.g:93:20: sup1= '>' (eg1= '=' )?
                            {
                            sup1=(Token)match(input,34,FOLLOW_34_in_comp729);  
                            stream_34.add(sup1);

                            // albert22u/Tiger3.g:93:28: (eg1= '=' )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==35) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // albert22u/Tiger3.g:93:29: eg1= '='
                                    {
                                    eg1=(Token)match(input,35,FOLLOW_35_in_comp733);  
                                    stream_35.add(eg1);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // albert22u/Tiger3.g:93:41: inf1= '<' (sup2= '>' | eg2= '=' )?
                            {
                            inf1=(Token)match(input,36,FOLLOW_36_in_comp741);  
                            stream_36.add(inf1);

                            // albert22u/Tiger3.g:93:50: (sup2= '>' | eg2= '=' )?
                            int alt26=3;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==34) ) {
                                alt26=1;
                            }
                            else if ( (LA26_0==35) ) {
                                alt26=2;
                            }
                            switch (alt26) {
                                case 1 :
                                    // albert22u/Tiger3.g:93:51: sup2= '>'
                                    {
                                    sup2=(Token)match(input,34,FOLLOW_34_in_comp746);  
                                    stream_34.add(sup2);


                                    }
                                    break;
                                case 2 :
                                    // albert22u/Tiger3.g:93:62: eg2= '='
                                    {
                                    eg2=(Token)match(input,35,FOLLOW_35_in_comp752);  
                                    stream_35.add(eg2);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // albert22u/Tiger3.g:93:74: eg3= '='
                            {
                            eg3=(Token)match(input,35,FOLLOW_35_in_comp760);  
                            stream_35.add(eg3);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_binary_in_comp765);
                    b2=binary();

                    state._fsp--;

                    stream_binary.add(b2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: b2, eg3, b2, b2, b1, b1, sup1, b2, b1, b2, b1, b1, b2, b1, inf1, b1
            // token labels: eg3, inf1, sup1
            // rule labels: retval, b1, b2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_eg3=new RewriteRuleTokenStream(adaptor,"token eg3",eg3);
            RewriteRuleTokenStream stream_inf1=new RewriteRuleTokenStream(adaptor,"token inf1",inf1);
            RewriteRuleTokenStream stream_sup1=new RewriteRuleTokenStream(adaptor,"token sup1",sup1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b1=new RewriteRuleSubtreeStream(adaptor,"rule b1",b1!=null?b1.tree:null);
            RewriteRuleSubtreeStream stream_b2=new RewriteRuleSubtreeStream(adaptor,"rule b2",b2!=null?b2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:4: -> {$sup1 != null && $eg1 != null}? ^( COMP[\">=\"] $b1 ^( $b2) )
            if (sup1 != null && eg1 != null) {
                // albert22u/Tiger3.g:94:40: ^( COMP[\">=\"] $b1 ^( $b2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMP, ">="), root_1);

                adaptor.addChild(root_1, stream_b1.nextTree());
                // albert22u/Tiger3.g:94:57: ^( $b2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 95:4: -> {$inf1 != null && $eg2 != null}? ^( COMP[\"<=\"] $b1 ^( $b2) )
            if (inf1 != null && eg2 != null) {
                // albert22u/Tiger3.g:95:40: ^( COMP[\"<=\"] $b1 ^( $b2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMP, "<="), root_1);

                adaptor.addChild(root_1, stream_b1.nextTree());
                // albert22u/Tiger3.g:95:57: ^( $b2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 96:4: -> {$inf1 != null && $sup2 != null}? ^( COMP[\"<>\"] $b1 ^( $b2) )
            if (inf1 != null && sup2 != null) {
                // albert22u/Tiger3.g:96:41: ^( COMP[\"<>\"] $b1 ^( $b2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMP, "<>"), root_1);

                adaptor.addChild(root_1, stream_b1.nextTree());
                // albert22u/Tiger3.g:96:58: ^( $b2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 97:4: -> {$sup1 != null }? ^( $sup1 $b1 ^( $b2) )
            if (sup1 != null ) {
                // albert22u/Tiger3.g:97:25: ^( $sup1 $b1 ^( $b2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_sup1.nextNode(), root_1);

                adaptor.addChild(root_1, stream_b1.nextTree());
                // albert22u/Tiger3.g:97:37: ^( $b2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 98:4: -> {$inf1 != null }? ^( $inf1 $b1 ^( $b2) )
            if (inf1 != null ) {
                // albert22u/Tiger3.g:98:25: ^( $inf1 $b1 ^( $b2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_inf1.nextNode(), root_1);

                adaptor.addChild(root_1, stream_b1.nextTree());
                // albert22u/Tiger3.g:98:37: ^( $b2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 99:4: -> {$eg3 != null}? ^( $eg3 $b1 ^( $b2) )
            if (eg3 != null) {
                // albert22u/Tiger3.g:99:23: ^( $eg3 $b1 ^( $b2) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_eg3.nextNode(), root_1);

                adaptor.addChild(root_1, stream_b1.nextTree());
                // albert22u/Tiger3.g:99:34: ^( $b2)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_b2.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 100:4: -> $b1
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
    // albert22u/Tiger3.g:102:1: binary : b2= binary2 ( (op1= '+' | op2= '-' ) b21= binary2 )* ;
    public final Tiger3Parser.binary_return binary() throws RecognitionException {
        Tiger3Parser.binary_return retval = new Tiger3Parser.binary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op1=null;
        Token op2=null;
        Tiger3Parser.binary2_return b2 = null;

        Tiger3Parser.binary2_return b21 = null;


        Object op1_tree=null;
        Object op2_tree=null;

        try {
            // albert22u/Tiger3.g:102:8: (b2= binary2 ( (op1= '+' | op2= '-' ) b21= binary2 )* )
            // albert22u/Tiger3.g:102:10: b2= binary2 ( (op1= '+' | op2= '-' ) b21= binary2 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_binary2_in_binary906);
            b2=binary2();

            state._fsp--;

            adaptor.addChild(root_0, b2.getTree());
            // albert22u/Tiger3.g:102:21: ( (op1= '+' | op2= '-' ) b21= binary2 )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // albert22u/Tiger3.g:102:22: (op1= '+' | op2= '-' ) b21= binary2
            	    {
            	    // albert22u/Tiger3.g:102:22: (op1= '+' | op2= '-' )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==37) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==38) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // albert22u/Tiger3.g:102:23: op1= '+'
            	            {
            	            op1=(Token)match(input,37,FOLLOW_37_in_binary912); 
            	            op1_tree = (Object)adaptor.create(op1);
            	            root_0 = (Object)adaptor.becomeRoot(op1_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // albert22u/Tiger3.g:102:32: op2= '-'
            	            {
            	            op2=(Token)match(input,38,FOLLOW_38_in_binary917); 
            	            op2_tree = (Object)adaptor.create(op2);
            	            root_0 = (Object)adaptor.becomeRoot(op2_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_binary2_in_binary923);
            	    b21=binary2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b21.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // albert22u/Tiger3.g:105:1: binary2 : n1= neg ( (mul= '*' | div= '/' ) neg )* ;
    public final Tiger3Parser.binary2_return binary2() throws RecognitionException {
        Tiger3Parser.binary2_return retval = new Tiger3Parser.binary2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token mul=null;
        Token div=null;
        Tiger3Parser.neg_return n1 = null;

        Tiger3Parser.neg_return neg39 = null;


        Object mul_tree=null;
        Object div_tree=null;

        try {
            // albert22u/Tiger3.g:105:9: (n1= neg ( (mul= '*' | div= '/' ) neg )* )
            // albert22u/Tiger3.g:105:11: n1= neg ( (mul= '*' | div= '/' ) neg )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_neg_in_binary2938);
            n1=neg();

            state._fsp--;

            adaptor.addChild(root_0, n1.getTree());
            // albert22u/Tiger3.g:105:18: ( (mul= '*' | div= '/' ) neg )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // albert22u/Tiger3.g:105:19: (mul= '*' | div= '/' ) neg
            	    {
            	    // albert22u/Tiger3.g:105:19: (mul= '*' | div= '/' )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==39) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==40) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // albert22u/Tiger3.g:105:20: mul= '*'
            	            {
            	            mul=(Token)match(input,39,FOLLOW_39_in_binary2944); 
            	            mul_tree = (Object)adaptor.create(mul);
            	            root_0 = (Object)adaptor.becomeRoot(mul_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // albert22u/Tiger3.g:105:29: div= '/'
            	            {
            	            div=(Token)match(input,40,FOLLOW_40_in_binary2949); 
            	            div_tree = (Object)adaptor.create(div);
            	            root_0 = (Object)adaptor.becomeRoot(div_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_neg_in_binary2953);
            	    neg39=neg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, neg39.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // albert22u/Tiger3.g:108:1: neg : (minus= '-' )? a= atom -> {$minus != null}? ^( '-' $a) -> $a;
    public final Tiger3Parser.neg_return neg() throws RecognitionException {
        Tiger3Parser.neg_return retval = new Tiger3Parser.neg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token minus=null;
        Tiger3Parser.atom_return a = null;


        Object minus_tree=null;
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // albert22u/Tiger3.g:108:5: ( (minus= '-' )? a= atom -> {$minus != null}? ^( '-' $a) -> $a)
            // albert22u/Tiger3.g:108:7: (minus= '-' )? a= atom
            {
            // albert22u/Tiger3.g:108:12: (minus= '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // albert22u/Tiger3.g:108:12: minus= '-'
                    {
                    minus=(Token)match(input,38,FOLLOW_38_in_neg967);  
                    stream_38.add(minus);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_in_neg972);
            a=atom();

            state._fsp--;

            stream_atom.add(a.getTree());


            // AST REWRITE
            // elements: a, a, 38
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (Object)adaptor.nil();
            // 109:4: -> {$minus != null}? ^( '-' $a)
            if (minus != null) {
                // albert22u/Tiger3.g:109:25: ^( '-' $a)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_38.nextNode(), root_1);

                adaptor.addChild(root_1, stream_a.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 110:4: -> $a
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
    // albert22u/Tiger3.g:113:1: atom : ( '(' ( NEWLINE )? (e= expr_seq )? ( NEWLINE )? ')' -> {$e.tree != null}? $e -> '(' ')' | lvalue | INT | STRING );
    public final Tiger3Parser.atom_return atom() throws RecognitionException {
        Tiger3Parser.atom_return retval = new Tiger3Parser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal40=null;
        Token NEWLINE41=null;
        Token NEWLINE42=null;
        Token char_literal43=null;
        Token INT45=null;
        Token STRING46=null;
        Tiger3Parser.expr_seq_return e = null;

        Tiger3Parser.lvalue_return lvalue44 = null;


        Object char_literal40_tree=null;
        Object NEWLINE41_tree=null;
        Object NEWLINE42_tree=null;
        Object char_literal43_tree=null;
        Object INT45_tree=null;
        Object STRING46_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_expr_seq=new RewriteRuleSubtreeStream(adaptor,"rule expr_seq");
        try {
            // albert22u/Tiger3.g:113:6: ( '(' ( NEWLINE )? (e= expr_seq )? ( NEWLINE )? ')' -> {$e.tree != null}? $e -> '(' ')' | lvalue | INT | STRING )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt37=1;
                }
                break;
            case ID:
                {
                alt37=2;
                }
                break;
            case INT:
                {
                alt37=3;
                }
                break;
            case STRING:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // albert22u/Tiger3.g:113:8: '(' ( NEWLINE )? (e= expr_seq )? ( NEWLINE )? ')'
                    {
                    char_literal40=(Token)match(input,41,FOLLOW_41_in_atom1007);  
                    stream_41.add(char_literal40);

                    // albert22u/Tiger3.g:113:12: ( NEWLINE )?
                    int alt34=2;
                    alt34 = dfa34.predict(input);
                    switch (alt34) {
                        case 1 :
                            // albert22u/Tiger3.g:113:12: NEWLINE
                            {
                            NEWLINE41=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_atom1009);  
                            stream_NEWLINE.add(NEWLINE41);


                            }
                            break;

                    }

                    // albert22u/Tiger3.g:113:22: (e= expr_seq )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=ID && LA35_0<=STRING)||LA35_0==38||LA35_0==41||(LA35_0>=48 && LA35_0<=49)||LA35_0==51||LA35_0==55||LA35_0==57||(LA35_0>=59 && LA35_0<=60)||LA35_0==66) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // albert22u/Tiger3.g:113:22: e= expr_seq
                            {
                            pushFollow(FOLLOW_expr_seq_in_atom1014);
                            e=expr_seq();

                            state._fsp--;

                            stream_expr_seq.add(e.getTree());

                            }
                            break;

                    }

                    // albert22u/Tiger3.g:113:33: ( NEWLINE )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==NEWLINE) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // albert22u/Tiger3.g:113:33: NEWLINE
                            {
                            NEWLINE42=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_atom1017);  
                            stream_NEWLINE.add(NEWLINE42);


                            }
                            break;

                    }

                    char_literal43=(Token)match(input,42,FOLLOW_42_in_atom1020);  
                    stream_42.add(char_literal43);



                    // AST REWRITE
                    // elements: e, 42, 41
                    // token labels: 
                    // rule labels: retval, e
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:4: -> {$e.tree != null}? $e
                    if ((e!=null?((Object)e.tree):null) != null) {
                        adaptor.addChild(root_0, stream_e.nextTree());

                    }
                    else // 115:4: -> '(' ')'
                    {
                        adaptor.addChild(root_0, stream_41.nextNode());
                        adaptor.addChild(root_0, stream_42.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // albert22u/Tiger3.g:116:5: lvalue
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_atom1044);
                    lvalue44=lvalue();

                    state._fsp--;

                    adaptor.addChild(root_0, lvalue44.getTree());

                    }
                    break;
                case 3 :
                    // albert22u/Tiger3.g:117:4: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT45=(Token)match(input,INT,FOLLOW_INT_in_atom1049); 
                    INT45_tree = (Object)adaptor.create(INT45);
                    adaptor.addChild(root_0, INT45_tree);


                    }
                    break;
                case 4 :
                    // albert22u/Tiger3.g:118:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING46=(Token)match(input,STRING,FOLLOW_STRING_in_atom1054); 
                    STRING46_tree = (Object)adaptor.create(STRING46);
                    adaptor.addChild(root_0, STRING46_tree);


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
    // albert22u/Tiger3.g:121:1: lvalue : i= ID (v= lvalue2 | par= '(' (e= expr_list )? ')' )? -> {$par.text != null && $e.tree != null}? ^( TYPE[\"function\"] $i ^( PARAMSEFF $e) ) -> {$par.text != null}? ^( TYPE[\"function\"] $i) -> {$v.tree != null}? ^( TAB $i $v) -> $i;
    public final Tiger3Parser.lvalue_return lvalue() throws RecognitionException {
        Tiger3Parser.lvalue_return retval = new Tiger3Parser.lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i=null;
        Token par=null;
        Token char_literal47=null;
        Tiger3Parser.lvalue2_return v = null;

        Tiger3Parser.expr_list_return e = null;


        Object i_tree=null;
        Object par_tree=null;
        Object char_literal47_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_lvalue2=new RewriteRuleSubtreeStream(adaptor,"rule lvalue2");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // albert22u/Tiger3.g:121:8: (i= ID (v= lvalue2 | par= '(' (e= expr_list )? ')' )? -> {$par.text != null && $e.tree != null}? ^( TYPE[\"function\"] $i ^( PARAMSEFF $e) ) -> {$par.text != null}? ^( TYPE[\"function\"] $i) -> {$v.tree != null}? ^( TAB $i $v) -> $i)
            // albert22u/Tiger3.g:121:10: i= ID (v= lvalue2 | par= '(' (e= expr_list )? ')' )?
            {
            i=(Token)match(input,ID,FOLLOW_ID_in_lvalue1068);  
            stream_ID.add(i);

            // albert22u/Tiger3.g:121:15: (v= lvalue2 | par= '(' (e= expr_list )? ')' )?
            int alt39=3;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // albert22u/Tiger3.g:121:16: v= lvalue2
                    {
                    pushFollow(FOLLOW_lvalue2_in_lvalue1073);
                    v=lvalue2();

                    state._fsp--;

                    stream_lvalue2.add(v.getTree());

                    }
                    break;
                case 2 :
                    // albert22u/Tiger3.g:121:28: par= '(' (e= expr_list )? ')'
                    {
                    par=(Token)match(input,41,FOLLOW_41_in_lvalue1079);  
                    stream_41.add(par);

                    // albert22u/Tiger3.g:121:37: (e= expr_list )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=ID && LA38_0<=STRING)||LA38_0==38||LA38_0==41||(LA38_0>=48 && LA38_0<=49)||LA38_0==51||LA38_0==55||LA38_0==57||(LA38_0>=59 && LA38_0<=60)||LA38_0==66) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // albert22u/Tiger3.g:121:37: e= expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_lvalue1083);
                            e=expr_list();

                            state._fsp--;

                            stream_expr_list.add(e.getTree());

                            }
                            break;

                    }

                    char_literal47=(Token)match(input,42,FOLLOW_42_in_lvalue1086);  
                    stream_42.add(char_literal47);


                    }
                    break;

            }



            // AST REWRITE
            // elements: i, i, i, v, e, i
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
            // 122:4: -> {$par.text != null && $e.tree != null}? ^( TYPE[\"function\"] $i ^( PARAMSEFF $e) )
            if ((par!=null?par.getText():null) != null && (e!=null?((Object)e.tree):null) != null) {
                // albert22u/Tiger3.g:122:47: ^( TYPE[\"function\"] $i ^( PARAMSEFF $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "function"), root_1);

                adaptor.addChild(root_1, stream_i.nextNode());
                // albert22u/Tiger3.g:122:69: ^( PARAMSEFF $e)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMSEFF, "PARAMSEFF"), root_2);

                adaptor.addChild(root_2, stream_e.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 123:4: -> {$par.text != null}? ^( TYPE[\"function\"] $i)
            if ((par!=null?par.getText():null) != null) {
                // albert22u/Tiger3.g:123:28: ^( TYPE[\"function\"] $i)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "function"), root_1);

                adaptor.addChild(root_1, stream_i.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 124:4: -> {$v.tree != null}? ^( TAB $i $v)
            if ((v!=null?((Object)v.tree):null) != null) {
                // albert22u/Tiger3.g:124:26: ^( TAB $i $v)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TAB, "TAB"), root_1);

                adaptor.addChild(root_1, stream_i.nextNode());
                adaptor.addChild(root_1, stream_v.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 125:4: -> $i
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
    // albert22u/Tiger3.g:128:1: lvalue2 : ( '.' ID lvalue2 | '[' e1= expr ']' (val= lvalue2 | o= ofexp e2= expr )? -> {$o.text != null}? ^( SIZE $e1) ^( INIT $e2) -> {$val.tree != null}? ^( CELL $e1) $val -> ^( CELL $e1) );
    public final Tiger3Parser.lvalue2_return lvalue2() throws RecognitionException {
        Tiger3Parser.lvalue2_return retval = new Tiger3Parser.lvalue2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal48=null;
        Token ID49=null;
        Token char_literal51=null;
        Token char_literal52=null;
        Tiger3Parser.expr_return e1 = null;

        Tiger3Parser.lvalue2_return val = null;

        Tiger3Parser.ofexp_return o = null;

        Tiger3Parser.expr_return e2 = null;

        Tiger3Parser.lvalue2_return lvalue250 = null;


        Object char_literal48_tree=null;
        Object ID49_tree=null;
        Object char_literal51_tree=null;
        Object char_literal52_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_lvalue2=new RewriteRuleSubtreeStream(adaptor,"rule lvalue2");
        RewriteRuleSubtreeStream stream_ofexp=new RewriteRuleSubtreeStream(adaptor,"rule ofexp");
        try {
            // albert22u/Tiger3.g:128:10: ( '.' ID lvalue2 | '[' e1= expr ']' (val= lvalue2 | o= ofexp e2= expr )? -> {$o.text != null}? ^( SIZE $e1) ^( INIT $e2) -> {$val.tree != null}? ^( CELL $e1) $val -> ^( CELL $e1) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            else if ( (LA41_0==44) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // albert22u/Tiger3.g:128:12: '.' ID lvalue2
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal48=(Token)match(input,43,FOLLOW_43_in_lvalue21166); 
                    char_literal48_tree = (Object)adaptor.create(char_literal48);
                    adaptor.addChild(root_0, char_literal48_tree);

                    ID49=(Token)match(input,ID,FOLLOW_ID_in_lvalue21168); 
                    ID49_tree = (Object)adaptor.create(ID49);
                    adaptor.addChild(root_0, ID49_tree);

                    pushFollow(FOLLOW_lvalue2_in_lvalue21170);
                    lvalue250=lvalue2();

                    state._fsp--;

                    adaptor.addChild(root_0, lvalue250.getTree());

                    }
                    break;
                case 2 :
                    // albert22u/Tiger3.g:129:4: '[' e1= expr ']' (val= lvalue2 | o= ofexp e2= expr )?
                    {
                    char_literal51=(Token)match(input,44,FOLLOW_44_in_lvalue21175);  
                    stream_44.add(char_literal51);

                    pushFollow(FOLLOW_expr_in_lvalue21179);
                    e1=expr();

                    state._fsp--;

                    stream_expr.add(e1.getTree());
                    char_literal52=(Token)match(input,45,FOLLOW_45_in_lvalue21181);  
                    stream_45.add(char_literal52);

                    // albert22u/Tiger3.g:129:20: (val= lvalue2 | o= ofexp e2= expr )?
                    int alt40=3;
                    alt40 = dfa40.predict(input);
                    switch (alt40) {
                        case 1 :
                            // albert22u/Tiger3.g:129:21: val= lvalue2
                            {
                            pushFollow(FOLLOW_lvalue2_in_lvalue21186);
                            val=lvalue2();

                            state._fsp--;

                            stream_lvalue2.add(val.getTree());

                            }
                            break;
                        case 2 :
                            // albert22u/Tiger3.g:129:35: o= ofexp e2= expr
                            {
                            pushFollow(FOLLOW_ofexp_in_lvalue21192);
                            o=ofexp();

                            state._fsp--;

                            stream_ofexp.add(o.getTree());
                            pushFollow(FOLLOW_expr_in_lvalue21196);
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
                    // 130:4: -> {$o.text != null}? ^( SIZE $e1) ^( INIT $e2)
                    if ((o!=null?input.toString(o.start,o.stop):null) != null) {
                        // albert22u/Tiger3.g:130:27: ^( SIZE $e1)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIZE, "SIZE"), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // albert22u/Tiger3.g:130:39: ^( INIT $e2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_1);

                        adaptor.addChild(root_1, stream_e2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 131:4: -> {$val.tree != null}? ^( CELL $e1) $val
                    if ((val!=null?((Object)val.tree):null) != null) {
                        // albert22u/Tiger3.g:131:28: ^( CELL $e1)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_val.nextTree());

                    }
                    else // 132:4: -> ^( CELL $e1)
                    {
                        // albert22u/Tiger3.g:132:7: ^( CELL $e1)
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
    // albert22u/Tiger3.g:135:1: declaration_list : ( NEWLINE )* d1= declaration (d2= declaration_list )? ( NEWLINE )* -> {$d2.tree != null}? $d1 $d2 -> $d1;
    public final Tiger3Parser.declaration_list_return declaration_list() throws RecognitionException {
        Tiger3Parser.declaration_list_return retval = new Tiger3Parser.declaration_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE53=null;
        Token NEWLINE54=null;
        Tiger3Parser.declaration_return d1 = null;

        Tiger3Parser.declaration_list_return d2 = null;


        Object NEWLINE53_tree=null;
        Object NEWLINE54_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule declaration_list");
        try {
            // albert22u/Tiger3.g:135:18: ( ( NEWLINE )* d1= declaration (d2= declaration_list )? ( NEWLINE )* -> {$d2.tree != null}? $d1 $d2 -> $d1)
            // albert22u/Tiger3.g:135:20: ( NEWLINE )* d1= declaration (d2= declaration_list )? ( NEWLINE )*
            {
            // albert22u/Tiger3.g:135:20: ( NEWLINE )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==NEWLINE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // albert22u/Tiger3.g:135:20: NEWLINE
            	    {
            	    NEWLINE53=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_declaration_list1264);  
            	    stream_NEWLINE.add(NEWLINE53);


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            pushFollow(FOLLOW_declaration_in_declaration_list1269);
            d1=declaration();

            state._fsp--;

            stream_declaration.add(d1.getTree());
            // albert22u/Tiger3.g:135:44: (d2= declaration_list )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==NEWLINE) ) {
                alt43=1;
            }
            else if ( (LA43_0==56||(LA43_0>=64 && LA43_0<=65)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // albert22u/Tiger3.g:135:45: d2= declaration_list
                    {
                    pushFollow(FOLLOW_declaration_list_in_declaration_list1274);
                    d2=declaration_list();

                    state._fsp--;

                    stream_declaration_list.add(d2.getTree());

                    }
                    break;

            }

            // albert22u/Tiger3.g:135:67: ( NEWLINE )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==NEWLINE) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // albert22u/Tiger3.g:135:67: NEWLINE
            	    {
            	    NEWLINE54=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_declaration_list1278);  
            	    stream_NEWLINE.add(NEWLINE54);


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);



            // AST REWRITE
            // elements: d1, d2, d1
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
            // 136:4: -> {$d2.tree != null}? $d1 $d2
            if ((d2!=null?((Object)d2.tree):null) != null) {
                adaptor.addChild(root_0, stream_d1.nextTree());
                adaptor.addChild(root_0, stream_d2.nextTree());

            }
            else // 137:4: -> $d1
            {
                adaptor.addChild(root_0, stream_d1.nextTree());

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
    // albert22u/Tiger3.g:140:1: declaration : ( type_declaration | variable_declaration | function_declaration );
    public final Tiger3Parser.declaration_return declaration() throws RecognitionException {
        Tiger3Parser.declaration_return retval = new Tiger3Parser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Tiger3Parser.type_declaration_return type_declaration55 = null;

        Tiger3Parser.variable_declaration_return variable_declaration56 = null;

        Tiger3Parser.function_declaration_return function_declaration57 = null;



        try {
            // albert22u/Tiger3.g:140:13: ( type_declaration | variable_declaration | function_declaration )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt45=1;
                }
                break;
            case 65:
                {
                alt45=2;
                }
                break;
            case 56:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // albert22u/Tiger3.g:140:15: type_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_declaration_in_declaration1310);
                    type_declaration55=type_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, type_declaration55.getTree());

                    }
                    break;
                case 2 :
                    // albert22u/Tiger3.g:141:4: variable_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_declaration_in_declaration1315);
                    variable_declaration56=variable_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_declaration56.getTree());

                    }
                    break;
                case 3 :
                    // albert22u/Tiger3.g:142:4: function_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_declaration_in_declaration1320);
                    function_declaration57=function_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, function_declaration57.getTree());

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
    // albert22u/Tiger3.g:145:1: type_declaration : t1= typeexp i= ID '=' t2= type ( NEWLINE )* -> ^( $t1 $i $t2) ;
    public final Tiger3Parser.type_declaration_return type_declaration() throws RecognitionException {
        Tiger3Parser.type_declaration_return retval = new Tiger3Parser.type_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i=null;
        Token char_literal58=null;
        Token NEWLINE59=null;
        Tiger3Parser.typeexp_return t1 = null;

        Tiger3Parser.type_return t2 = null;


        Object i_tree=null;
        Object char_literal58_tree=null;
        Object NEWLINE59_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_typeexp=new RewriteRuleSubtreeStream(adaptor,"rule typeexp");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // albert22u/Tiger3.g:146:2: (t1= typeexp i= ID '=' t2= type ( NEWLINE )* -> ^( $t1 $i $t2) )
            // albert22u/Tiger3.g:146:4: t1= typeexp i= ID '=' t2= type ( NEWLINE )*
            {
            pushFollow(FOLLOW_typeexp_in_type_declaration1334);
            t1=typeexp();

            state._fsp--;

            stream_typeexp.add(t1.getTree());
            i=(Token)match(input,ID,FOLLOW_ID_in_type_declaration1338);  
            stream_ID.add(i);

            char_literal58=(Token)match(input,35,FOLLOW_35_in_type_declaration1340);  
            stream_35.add(char_literal58);

            pushFollow(FOLLOW_type_in_type_declaration1344);
            t2=type();

            state._fsp--;

            stream_type.add(t2.getTree());
            // albert22u/Tiger3.g:146:32: ( NEWLINE )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==NEWLINE) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // albert22u/Tiger3.g:146:32: NEWLINE
            	    {
            	    NEWLINE59=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_type_declaration1346);  
            	    stream_NEWLINE.add(NEWLINE59);


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);



            // AST REWRITE
            // elements: i, t1, t2
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
            // 147:4: -> ^( $t1 $i $t2)
            {
                // albert22u/Tiger3.g:147:7: ^( $t1 $i $t2)
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
    // albert22u/Tiger3.g:150:1: type : (t= type_id -> ^( PRIMITIF $t) | '{' (t= type_fields )? '}' -> {$t.tree != null}? ^( STRUCT $t) -> ^( STRUCT PARAM[\"rien\"] ) | 'array of' (t= type_id | i= ID ) -> {$t.text != null}? ^( TAB $t) -> ^( TAB $i) );
    public final Tiger3Parser.type_return type() throws RecognitionException {
        Tiger3Parser.type_return retval = new Tiger3Parser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i=null;
        Token char_literal60=null;
        Token char_literal61=null;
        Token string_literal62=null;
        Tiger3Parser.type_id_return t = null;


        Object i_tree=null;
        Object char_literal60_tree=null;
        Object char_literal61_tree=null;
        Object string_literal62_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_type_fields=new RewriteRuleSubtreeStream(adaptor,"rule type_fields");
        RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
        try {
            // albert22u/Tiger3.g:150:6: (t= type_id -> ^( PRIMITIF $t) | '{' (t= type_fields )? '}' -> {$t.tree != null}? ^( STRUCT $t) -> ^( STRUCT PARAM[\"rien\"] ) | 'array of' (t= type_id | i= ID ) -> {$t.text != null}? ^( TAB $t) -> ^( TAB $i) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 48:
            case 49:
                {
                alt49=1;
                }
                break;
            case 27:
                {
                alt49=2;
                }
                break;
            case 46:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // albert22u/Tiger3.g:150:8: t= type_id
                    {
                    pushFollow(FOLLOW_type_id_in_type1376);
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
                    // 150:18: -> ^( PRIMITIF $t)
                    {
                        // albert22u/Tiger3.g:150:21: ^( PRIMITIF $t)
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
                    // albert22u/Tiger3.g:151:4: '{' (t= type_fields )? '}'
                    {
                    char_literal60=(Token)match(input,27,FOLLOW_27_in_type1390);  
                    stream_27.add(char_literal60);

                    // albert22u/Tiger3.g:151:9: (t= type_fields )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==ID) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // albert22u/Tiger3.g:151:9: t= type_fields
                            {
                            pushFollow(FOLLOW_type_fields_in_type1394);
                            t=type_fields();

                            state._fsp--;

                            stream_type_fields.add(t.getTree());

                            }
                            break;

                    }

                    char_literal61=(Token)match(input,28,FOLLOW_28_in_type1397);  
                    stream_28.add(char_literal61);



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
                    // 152:4: -> {$t.tree != null}? ^( STRUCT $t)
                    if ((t!=null?((Object)t.tree):null) != null) {
                        // albert22u/Tiger3.g:152:26: ^( STRUCT $t)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRUCT, "STRUCT"), root_1);

                        adaptor.addChild(root_1, stream_t.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 153:4: -> ^( STRUCT PARAM[\"rien\"] )
                    {
                        // albert22u/Tiger3.g:153:7: ^( STRUCT PARAM[\"rien\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRUCT, "STRUCT"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(PARAM, "rien"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // albert22u/Tiger3.g:154:4: 'array of' (t= type_id | i= ID )
                    {
                    string_literal62=(Token)match(input,46,FOLLOW_46_in_type1430);  
                    stream_46.add(string_literal62);

                    // albert22u/Tiger3.g:154:15: (t= type_id | i= ID )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=48 && LA48_0<=49)) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==ID) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // albert22u/Tiger3.g:154:16: t= type_id
                            {
                            pushFollow(FOLLOW_type_id_in_type1435);
                            t=type_id();

                            state._fsp--;

                            stream_type_id.add(t.getTree());

                            }
                            break;
                        case 2 :
                            // albert22u/Tiger3.g:154:28: i= ID
                            {
                            i=(Token)match(input,ID,FOLLOW_ID_in_type1441);  
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
                    // 155:4: -> {$t.text != null}? ^( TAB $t)
                    if ((t!=null?input.toString(t.start,t.stop):null) != null) {
                        // albert22u/Tiger3.g:155:26: ^( TAB $t)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TAB, "TAB"), root_1);

                        adaptor.addChild(root_1, stream_t.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 156:4: -> ^( TAB $i)
                    {
                        // albert22u/Tiger3.g:156:7: ^( TAB $i)
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
    // albert22u/Tiger3.g:159:1: variable_declaration : vava= varexp nom= ID (depoi= ':' (typenew= ID | typebase= type_id ) )? ':=' e= expr ( NEWLINE )* -> {$depoi != null && $typenew.text!=null}? ^( $vava $nom $typenew $e) -> {$depoi != null && $typebase.text!=null}? ^( $vava $nom $typebase $e) -> ^( $vava $nom $e) ;
    public final Tiger3Parser.variable_declaration_return variable_declaration() throws RecognitionException {
        Tiger3Parser.variable_declaration_return retval = new Tiger3Parser.variable_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token nom=null;
        Token depoi=null;
        Token typenew=null;
        Token string_literal63=null;
        Token NEWLINE64=null;
        Tiger3Parser.varexp_return vava = null;

        Tiger3Parser.type_id_return typebase = null;

        Tiger3Parser.expr_return e = null;


        Object nom_tree=null;
        Object depoi_tree=null;
        Object typenew_tree=null;
        Object string_literal63_tree=null;
        Object NEWLINE64_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_varexp=new RewriteRuleSubtreeStream(adaptor,"rule varexp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
        try {
            // albert22u/Tiger3.g:160:2: (vava= varexp nom= ID (depoi= ':' (typenew= ID | typebase= type_id ) )? ':=' e= expr ( NEWLINE )* -> {$depoi != null && $typenew.text!=null}? ^( $vava $nom $typenew $e) -> {$depoi != null && $typebase.text!=null}? ^( $vava $nom $typebase $e) -> ^( $vava $nom $e) )
            // albert22u/Tiger3.g:160:4: vava= varexp nom= ID (depoi= ':' (typenew= ID | typebase= type_id ) )? ':=' e= expr ( NEWLINE )*
            {
            pushFollow(FOLLOW_varexp_in_variable_declaration1481);
            vava=varexp();

            state._fsp--;

            stream_varexp.add(vava.getTree());
            nom=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration1485);  
            stream_ID.add(nom);

            // albert22u/Tiger3.g:160:23: (depoi= ':' (typenew= ID | typebase= type_id ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==47) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // albert22u/Tiger3.g:160:25: depoi= ':' (typenew= ID | typebase= type_id )
                    {
                    depoi=(Token)match(input,47,FOLLOW_47_in_variable_declaration1491);  
                    stream_47.add(depoi);

                    // albert22u/Tiger3.g:160:35: (typenew= ID | typebase= type_id )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==ID) ) {
                        alt50=1;
                    }
                    else if ( ((LA50_0>=48 && LA50_0<=49)) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // albert22u/Tiger3.g:160:36: typenew= ID
                            {
                            typenew=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration1496);  
                            stream_ID.add(typenew);


                            }
                            break;
                        case 2 :
                            // albert22u/Tiger3.g:160:49: typebase= type_id
                            {
                            pushFollow(FOLLOW_type_id_in_variable_declaration1502);
                            typebase=type_id();

                            state._fsp--;

                            stream_type_id.add(typebase.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            string_literal63=(Token)match(input,31,FOLLOW_31_in_variable_declaration1507);  
            stream_31.add(string_literal63);

            pushFollow(FOLLOW_expr_in_variable_declaration1511);
            e=expr();

            state._fsp--;

            stream_expr.add(e.getTree());
            // albert22u/Tiger3.g:160:81: ( NEWLINE )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==NEWLINE) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // albert22u/Tiger3.g:160:81: NEWLINE
            	    {
            	    NEWLINE64=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_variable_declaration1513);  
            	    stream_NEWLINE.add(NEWLINE64);


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);



            // AST REWRITE
            // elements: nom, e, nom, typebase, typenew, vava, e, vava, nom, e, vava
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
            // 161:5: -> {$depoi != null && $typenew.text!=null}? ^( $vava $nom $typenew $e)
            if (depoi != null && (typenew!=null?typenew.getText():null)!=null) {
                // albert22u/Tiger3.g:161:49: ^( $vava $nom $typenew $e)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_vava.nextNode(), root_1);

                adaptor.addChild(root_1, stream_nom.nextNode());
                adaptor.addChild(root_1, stream_typenew.nextNode());
                adaptor.addChild(root_1, stream_e.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 162:5: -> {$depoi != null && $typebase.text!=null}? ^( $vava $nom $typebase $e)
            if (depoi != null && (typebase!=null?input.toString(typebase.start,typebase.stop):null)!=null) {
                // albert22u/Tiger3.g:162:50: ^( $vava $nom $typebase $e)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_vava.nextNode(), root_1);

                adaptor.addChild(root_1, stream_nom.nextNode());
                adaptor.addChild(root_1, stream_typebase.nextTree());
                adaptor.addChild(root_1, stream_e.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 163:5: -> ^( $vava $nom $e)
            {
                // albert22u/Tiger3.g:163:8: ^( $vava $nom $e)
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
    // albert22u/Tiger3.g:166:1: function_declaration : fun= functionexp ID '(' (par= type_fields )? ')' ( ':' (ty= type_id | i= ID ) )? '=' ( NEWLINE )* (e= expr ( NEWLINE )* )+ -> {$par.text != null && $ty.text != null}? ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $ty) ^( BLOCK $e) ) -> {$par.text != null && $i != null}? ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $i) ^( BLOCK $e) ) -> {$par.text != null}? ^( $fun ID ^( PARAMSFORM $par) ^( BLOCK $e) ) -> {$ty.text != null}? ^( $fun ID ^( TYPE $ty) ^( BLOCK $e) ) -> {$i != null}? ^( $fun ID ^( TYPE $i) ^( BLOCK $e) ) -> ^( $fun ID ^( BLOCK $e) ) ;
    public final Tiger3Parser.function_declaration_return function_declaration() throws RecognitionException {
        Tiger3Parser.function_declaration_return retval = new Tiger3Parser.function_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i=null;
        Token ID65=null;
        Token char_literal66=null;
        Token char_literal67=null;
        Token char_literal68=null;
        Token char_literal69=null;
        Token NEWLINE70=null;
        Token NEWLINE71=null;
        Tiger3Parser.functionexp_return fun = null;

        Tiger3Parser.type_fields_return par = null;

        Tiger3Parser.type_id_return ty = null;

        Tiger3Parser.expr_return e = null;


        Object i_tree=null;
        Object ID65_tree=null;
        Object char_literal66_tree=null;
        Object char_literal67_tree=null;
        Object char_literal68_tree=null;
        Object char_literal69_tree=null;
        Object NEWLINE70_tree=null;
        Object NEWLINE71_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_type_fields=new RewriteRuleSubtreeStream(adaptor,"rule type_fields");
        RewriteRuleSubtreeStream stream_functionexp=new RewriteRuleSubtreeStream(adaptor,"rule functionexp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
        try {
            // albert22u/Tiger3.g:167:2: (fun= functionexp ID '(' (par= type_fields )? ')' ( ':' (ty= type_id | i= ID ) )? '=' ( NEWLINE )* (e= expr ( NEWLINE )* )+ -> {$par.text != null && $ty.text != null}? ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $ty) ^( BLOCK $e) ) -> {$par.text != null && $i != null}? ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $i) ^( BLOCK $e) ) -> {$par.text != null}? ^( $fun ID ^( PARAMSFORM $par) ^( BLOCK $e) ) -> {$ty.text != null}? ^( $fun ID ^( TYPE $ty) ^( BLOCK $e) ) -> {$i != null}? ^( $fun ID ^( TYPE $i) ^( BLOCK $e) ) -> ^( $fun ID ^( BLOCK $e) ) )
            // albert22u/Tiger3.g:167:4: fun= functionexp ID '(' (par= type_fields )? ')' ( ':' (ty= type_id | i= ID ) )? '=' ( NEWLINE )* (e= expr ( NEWLINE )* )+
            {
            pushFollow(FOLLOW_functionexp_in_function_declaration1588);
            fun=functionexp();

            state._fsp--;

            stream_functionexp.add(fun.getTree());
            ID65=(Token)match(input,ID,FOLLOW_ID_in_function_declaration1590);  
            stream_ID.add(ID65);

            char_literal66=(Token)match(input,41,FOLLOW_41_in_function_declaration1592);  
            stream_41.add(char_literal66);

            // albert22u/Tiger3.g:167:30: (par= type_fields )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ID) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // albert22u/Tiger3.g:167:30: par= type_fields
                    {
                    pushFollow(FOLLOW_type_fields_in_function_declaration1596);
                    par=type_fields();

                    state._fsp--;

                    stream_type_fields.add(par.getTree());

                    }
                    break;

            }

            char_literal67=(Token)match(input,42,FOLLOW_42_in_function_declaration1599);  
            stream_42.add(char_literal67);

            // albert22u/Tiger3.g:167:48: ( ':' (ty= type_id | i= ID ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==47) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // albert22u/Tiger3.g:167:49: ':' (ty= type_id | i= ID )
                    {
                    char_literal68=(Token)match(input,47,FOLLOW_47_in_function_declaration1602);  
                    stream_47.add(char_literal68);

                    // albert22u/Tiger3.g:167:53: (ty= type_id | i= ID )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=48 && LA54_0<=49)) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==ID) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // albert22u/Tiger3.g:167:54: ty= type_id
                            {
                            pushFollow(FOLLOW_type_id_in_function_declaration1607);
                            ty=type_id();

                            state._fsp--;

                            stream_type_id.add(ty.getTree());

                            }
                            break;
                        case 2 :
                            // albert22u/Tiger3.g:167:65: i= ID
                            {
                            i=(Token)match(input,ID,FOLLOW_ID_in_function_declaration1611);  
                            stream_ID.add(i);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal69=(Token)match(input,35,FOLLOW_35_in_function_declaration1617);  
            stream_35.add(char_literal69);

            // albert22u/Tiger3.g:167:78: ( NEWLINE )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==NEWLINE) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // albert22u/Tiger3.g:167:78: NEWLINE
            	    {
            	    NEWLINE70=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_function_declaration1619);  
            	    stream_NEWLINE.add(NEWLINE70);


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // albert22u/Tiger3.g:167:87: (e= expr ( NEWLINE )* )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=ID && LA58_0<=STRING)||LA58_0==38||LA58_0==41||(LA58_0>=48 && LA58_0<=49)||LA58_0==51||LA58_0==55||LA58_0==57||(LA58_0>=59 && LA58_0<=60)||LA58_0==66) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // albert22u/Tiger3.g:167:88: e= expr ( NEWLINE )*
            	    {
            	    pushFollow(FOLLOW_expr_in_function_declaration1625);
            	    e=expr();

            	    state._fsp--;

            	    stream_expr.add(e.getTree());
            	    // albert22u/Tiger3.g:167:95: ( NEWLINE )*
            	    loop57:
            	    do {
            	        int alt57=2;
            	        alt57 = dfa57.predict(input);
            	        switch (alt57) {
            	    	case 1 :
            	    	    // albert22u/Tiger3.g:167:95: NEWLINE
            	    	    {
            	    	    NEWLINE71=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_function_declaration1627);  
            	    	    stream_NEWLINE.add(NEWLINE71);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop57;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);



            // AST REWRITE
            // elements: e, ty, ID, fun, ID, fun, i, fun, e, i, ID, e, ID, ID, e, par, e, ty, par, fun, par, fun, ID, e, fun
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
            // 168:4: -> {$par.text != null && $ty.text != null}? ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $ty) ^( BLOCK $e) )
            if ((par!=null?input.toString(par.start,par.stop):null) != null && (ty!=null?input.toString(ty.start,ty.stop):null) != null) {
                // albert22u/Tiger3.g:168:48: ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $ty) ^( BLOCK $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fun.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // albert22u/Tiger3.g:168:58: ^( PARAMSFORM $par)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMSFORM, "PARAMSFORM"), root_2);

                adaptor.addChild(root_2, stream_par.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // albert22u/Tiger3.g:168:77: ^( TYPE $ty)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, stream_ty.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // albert22u/Tiger3.g:168:89: ^( BLOCK $e)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                adaptor.addChild(root_2, stream_e.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 169:4: -> {$par.text != null && $i != null}? ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $i) ^( BLOCK $e) )
            if ((par!=null?input.toString(par.start,par.stop):null) != null && i != null) {
                // albert22u/Tiger3.g:169:42: ^( $fun ID ^( PARAMSFORM $par) ^( TYPE $i) ^( BLOCK $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fun.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // albert22u/Tiger3.g:169:52: ^( PARAMSFORM $par)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMSFORM, "PARAMSFORM"), root_2);

                adaptor.addChild(root_2, stream_par.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // albert22u/Tiger3.g:169:71: ^( TYPE $i)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, stream_i.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // albert22u/Tiger3.g:169:82: ^( BLOCK $e)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                adaptor.addChild(root_2, stream_e.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 170:4: -> {$par.text != null}? ^( $fun ID ^( PARAMSFORM $par) ^( BLOCK $e) )
            if ((par!=null?input.toString(par.start,par.stop):null) != null) {
                // albert22u/Tiger3.g:170:28: ^( $fun ID ^( PARAMSFORM $par) ^( BLOCK $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fun.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // albert22u/Tiger3.g:170:38: ^( PARAMSFORM $par)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMSFORM, "PARAMSFORM"), root_2);

                adaptor.addChild(root_2, stream_par.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // albert22u/Tiger3.g:170:57: ^( BLOCK $e)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                adaptor.addChild(root_2, stream_e.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 171:4: -> {$ty.text != null}? ^( $fun ID ^( TYPE $ty) ^( BLOCK $e) )
            if ((ty!=null?input.toString(ty.start,ty.stop):null) != null) {
                // albert22u/Tiger3.g:171:27: ^( $fun ID ^( TYPE $ty) ^( BLOCK $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fun.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // albert22u/Tiger3.g:171:37: ^( TYPE $ty)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, stream_ty.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // albert22u/Tiger3.g:171:49: ^( BLOCK $e)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                adaptor.addChild(root_2, stream_e.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 172:4: -> {$i != null}? ^( $fun ID ^( TYPE $i) ^( BLOCK $e) )
            if (i != null) {
                // albert22u/Tiger3.g:172:21: ^( $fun ID ^( TYPE $i) ^( BLOCK $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fun.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // albert22u/Tiger3.g:172:31: ^( TYPE $i)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, stream_i.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // albert22u/Tiger3.g:172:42: ^( BLOCK $e)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);

                adaptor.addChild(root_2, stream_e.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 173:4: -> ^( $fun ID ^( BLOCK $e) )
            {
                // albert22u/Tiger3.g:173:7: ^( $fun ID ^( BLOCK $e) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_fun.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // albert22u/Tiger3.g:173:17: ^( BLOCK $e)
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
    // albert22u/Tiger3.g:176:1: type_fields : t1= type_field (t2= type_fields2 )? -> {$t2.tree != null}? $t1 $t2 -> $t1;
    public final Tiger3Parser.type_fields_return type_fields() throws RecognitionException {
        Tiger3Parser.type_fields_return retval = new Tiger3Parser.type_fields_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Tiger3Parser.type_field_return t1 = null;

        Tiger3Parser.type_fields2_return t2 = null;


        RewriteRuleSubtreeStream stream_type_field=new RewriteRuleSubtreeStream(adaptor,"rule type_field");
        RewriteRuleSubtreeStream stream_type_fields2=new RewriteRuleSubtreeStream(adaptor,"rule type_fields2");
        try {
            // albert22u/Tiger3.g:176:13: (t1= type_field (t2= type_fields2 )? -> {$t2.tree != null}? $t1 $t2 -> $t1)
            // albert22u/Tiger3.g:176:15: t1= type_field (t2= type_fields2 )?
            {
            pushFollow(FOLLOW_type_field_in_type_fields1816);
            t1=type_field();

            state._fsp--;

            stream_type_field.add(t1.getTree());
            // albert22u/Tiger3.g:176:31: (t2= type_fields2 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==29) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // albert22u/Tiger3.g:176:31: t2= type_fields2
                    {
                    pushFollow(FOLLOW_type_fields2_in_type_fields1820);
                    t2=type_fields2();

                    state._fsp--;

                    stream_type_fields2.add(t2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: t1, t1, t2
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
            // 177:4: -> {$t2.tree != null}? $t1 $t2
            if ((t2!=null?((Object)t2.tree):null) != null) {
                adaptor.addChild(root_0, stream_t1.nextTree());
                adaptor.addChild(root_0, stream_t2.nextTree());

            }
            else // 178:4: -> $t1
            {
                adaptor.addChild(root_0, stream_t1.nextTree());

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
    // albert22u/Tiger3.g:181:1: type_fields2 : ',' t1= type_field (t2= type_fields2 )? -> {$t2.tree != null}? $t1 $t2 -> $t1;
    public final Tiger3Parser.type_fields2_return type_fields2() throws RecognitionException {
        Tiger3Parser.type_fields2_return retval = new Tiger3Parser.type_fields2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal72=null;
        Tiger3Parser.type_field_return t1 = null;

        Tiger3Parser.type_fields2_return t2 = null;


        Object char_literal72_tree=null;
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_type_field=new RewriteRuleSubtreeStream(adaptor,"rule type_field");
        RewriteRuleSubtreeStream stream_type_fields2=new RewriteRuleSubtreeStream(adaptor,"rule type_fields2");
        try {
            // albert22u/Tiger3.g:181:14: ( ',' t1= type_field (t2= type_fields2 )? -> {$t2.tree != null}? $t1 $t2 -> $t1)
            // albert22u/Tiger3.g:181:16: ',' t1= type_field (t2= type_fields2 )?
            {
            char_literal72=(Token)match(input,29,FOLLOW_29_in_type_fields21853);  
            stream_29.add(char_literal72);

            pushFollow(FOLLOW_type_field_in_type_fields21857);
            t1=type_field();

            state._fsp--;

            stream_type_field.add(t1.getTree());
            // albert22u/Tiger3.g:181:36: (t2= type_fields2 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==29) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // albert22u/Tiger3.g:181:36: t2= type_fields2
                    {
                    pushFollow(FOLLOW_type_fields2_in_type_fields21861);
                    t2=type_fields2();

                    state._fsp--;

                    stream_type_fields2.add(t2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: t2, t1, t1
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
            // 182:4: -> {$t2.tree != null}? $t1 $t2
            if ((t2!=null?((Object)t2.tree):null) != null) {
                adaptor.addChild(root_0, stream_t1.nextTree());
                adaptor.addChild(root_0, stream_t2.nextTree());

            }
            else // 183:4: -> $t1
            {
                adaptor.addChild(root_0, stream_t1.nextTree());

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
    // albert22u/Tiger3.g:186:1: type_field : i1= ID ':' (t= type_id | i2= ID ) -> {$i2.text != null}? ^( PARAM[\"p\"] $i1 $i2) -> ^( PARAM[\"p\"] $i1 $t) ;
    public final Tiger3Parser.type_field_return type_field() throws RecognitionException {
        Tiger3Parser.type_field_return retval = new Tiger3Parser.type_field_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i1=null;
        Token i2=null;
        Token char_literal73=null;
        Tiger3Parser.type_id_return t = null;


        Object i1_tree=null;
        Object i2_tree=null;
        Object char_literal73_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type_id=new RewriteRuleSubtreeStream(adaptor,"rule type_id");
        try {
            // albert22u/Tiger3.g:186:12: (i1= ID ':' (t= type_id | i2= ID ) -> {$i2.text != null}? ^( PARAM[\"p\"] $i1 $i2) -> ^( PARAM[\"p\"] $i1 $t) )
            // albert22u/Tiger3.g:186:14: i1= ID ':' (t= type_id | i2= ID )
            {
            i1=(Token)match(input,ID,FOLLOW_ID_in_type_field1896);  
            stream_ID.add(i1);

            char_literal73=(Token)match(input,47,FOLLOW_47_in_type_field1898);  
            stream_47.add(char_literal73);

            // albert22u/Tiger3.g:186:24: (t= type_id | i2= ID )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=48 && LA61_0<=49)) ) {
                alt61=1;
            }
            else if ( (LA61_0==ID) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // albert22u/Tiger3.g:186:25: t= type_id
                    {
                    pushFollow(FOLLOW_type_id_in_type_field1903);
                    t=type_id();

                    state._fsp--;

                    stream_type_id.add(t.getTree());

                    }
                    break;
                case 2 :
                    // albert22u/Tiger3.g:186:35: i2= ID
                    {
                    i2=(Token)match(input,ID,FOLLOW_ID_in_type_field1907);  
                    stream_ID.add(i2);


                    }
                    break;

            }



            // AST REWRITE
            // elements: i1, i1, i2, t
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
            // 187:4: -> {$i2.text != null}? ^( PARAM[\"p\"] $i1 $i2)
            if ((i2!=null?i2.getText():null) != null) {
                // albert22u/Tiger3.g:187:27: ^( PARAM[\"p\"] $i1 $i2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "p"), root_1);

                adaptor.addChild(root_1, stream_i1.nextNode());
                adaptor.addChild(root_1, stream_i2.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 188:4: -> ^( PARAM[\"p\"] $i1 $t)
            {
                // albert22u/Tiger3.g:188:7: ^( PARAM[\"p\"] $i1 $t)
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
    // albert22u/Tiger3.g:191:1: type_id : ( 'int' | 'string' ) ( lvalue2 )* ;
    public final Tiger3Parser.type_id_return type_id() throws RecognitionException {
        Tiger3Parser.type_id_return retval = new Tiger3Parser.type_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set74=null;
        Tiger3Parser.lvalue2_return lvalue275 = null;


        Object set74_tree=null;

        try {
            // albert22u/Tiger3.g:191:9: ( ( 'int' | 'string' ) ( lvalue2 )* )
            // albert22u/Tiger3.g:191:11: ( 'int' | 'string' ) ( lvalue2 )*
            {
            root_0 = (Object)adaptor.nil();

            set74=(Token)input.LT(1);
            if ( (input.LA(1)>=48 && input.LA(1)<=49) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set74));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // albert22u/Tiger3.g:191:30: ( lvalue2 )*
            loop62:
            do {
                int alt62=2;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // albert22u/Tiger3.g:191:30: lvalue2
            	    {
            	    pushFollow(FOLLOW_lvalue2_in_type_id1959);
            	    lvalue275=lvalue2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lvalue275.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // albert22u/Tiger3.g:194:1: arrayexp : 'array' ;
    public final Tiger3Parser.arrayexp_return arrayexp() throws RecognitionException {
        Tiger3Parser.arrayexp_return retval = new Tiger3Parser.arrayexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal76=null;

        Object string_literal76_tree=null;

        try {
            // albert22u/Tiger3.g:194:10: ( 'array' )
            // albert22u/Tiger3.g:194:12: 'array'
            {
            root_0 = (Object)adaptor.nil();

            string_literal76=(Token)match(input,50,FOLLOW_50_in_arrayexp1970); 
            string_literal76_tree = (Object)adaptor.create(string_literal76);
            adaptor.addChild(root_0, string_literal76_tree);


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
    // albert22u/Tiger3.g:195:1: breakexp : 'break' ;
    public final Tiger3Parser.breakexp_return breakexp() throws RecognitionException {
        Tiger3Parser.breakexp_return retval = new Tiger3Parser.breakexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal77=null;

        Object string_literal77_tree=null;

        try {
            // albert22u/Tiger3.g:195:10: ( 'break' )
            // albert22u/Tiger3.g:195:12: 'break'
            {
            root_0 = (Object)adaptor.nil();

            string_literal77=(Token)match(input,51,FOLLOW_51_in_breakexp1979); 
            string_literal77_tree = (Object)adaptor.create(string_literal77);
            adaptor.addChild(root_0, string_literal77_tree);


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
    // albert22u/Tiger3.g:196:1: doexp : 'do' ;
    public final Tiger3Parser.doexp_return doexp() throws RecognitionException {
        Tiger3Parser.doexp_return retval = new Tiger3Parser.doexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal78=null;

        Object string_literal78_tree=null;

        try {
            // albert22u/Tiger3.g:196:8: ( 'do' )
            // albert22u/Tiger3.g:196:10: 'do'
            {
            root_0 = (Object)adaptor.nil();

            string_literal78=(Token)match(input,52,FOLLOW_52_in_doexp1988); 
            string_literal78_tree = (Object)adaptor.create(string_literal78);
            adaptor.addChild(root_0, string_literal78_tree);


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
    // albert22u/Tiger3.g:197:1: elseexp : 'else' ;
    public final Tiger3Parser.elseexp_return elseexp() throws RecognitionException {
        Tiger3Parser.elseexp_return retval = new Tiger3Parser.elseexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal79=null;

        Object string_literal79_tree=null;

        try {
            // albert22u/Tiger3.g:197:10: ( 'else' )
            // albert22u/Tiger3.g:197:12: 'else'
            {
            root_0 = (Object)adaptor.nil();

            string_literal79=(Token)match(input,53,FOLLOW_53_in_elseexp1998); 
            string_literal79_tree = (Object)adaptor.create(string_literal79);
            adaptor.addChild(root_0, string_literal79_tree);


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
    // albert22u/Tiger3.g:198:1: endexp : 'end' ;
    public final Tiger3Parser.endexp_return endexp() throws RecognitionException {
        Tiger3Parser.endexp_return retval = new Tiger3Parser.endexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal80=null;

        Object string_literal80_tree=null;

        try {
            // albert22u/Tiger3.g:198:9: ( 'end' )
            // albert22u/Tiger3.g:198:11: 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal80=(Token)match(input,54,FOLLOW_54_in_endexp2009); 
            string_literal80_tree = (Object)adaptor.create(string_literal80);
            adaptor.addChild(root_0, string_literal80_tree);


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
    // albert22u/Tiger3.g:199:1: forexp : 'for' ;
    public final Tiger3Parser.forexp_return forexp() throws RecognitionException {
        Tiger3Parser.forexp_return retval = new Tiger3Parser.forexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal81=null;

        Object string_literal81_tree=null;

        try {
            // albert22u/Tiger3.g:199:9: ( 'for' )
            // albert22u/Tiger3.g:199:11: 'for'
            {
            root_0 = (Object)adaptor.nil();

            string_literal81=(Token)match(input,55,FOLLOW_55_in_forexp2019); 
            string_literal81_tree = (Object)adaptor.create(string_literal81);
            adaptor.addChild(root_0, string_literal81_tree);


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
    // albert22u/Tiger3.g:200:1: functionexp : 'function' ;
    public final Tiger3Parser.functionexp_return functionexp() throws RecognitionException {
        Tiger3Parser.functionexp_return retval = new Tiger3Parser.functionexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal82=null;

        Object string_literal82_tree=null;

        try {
            // albert22u/Tiger3.g:200:13: ( 'function' )
            // albert22u/Tiger3.g:200:15: 'function'
            {
            root_0 = (Object)adaptor.nil();

            string_literal82=(Token)match(input,56,FOLLOW_56_in_functionexp2028); 
            string_literal82_tree = (Object)adaptor.create(string_literal82);
            adaptor.addChild(root_0, string_literal82_tree);


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
    // albert22u/Tiger3.g:201:1: ifexp : 'if' ;
    public final Tiger3Parser.ifexp_return ifexp() throws RecognitionException {
        Tiger3Parser.ifexp_return retval = new Tiger3Parser.ifexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal83=null;

        Object string_literal83_tree=null;

        try {
            // albert22u/Tiger3.g:201:7: ( 'if' )
            // albert22u/Tiger3.g:201:9: 'if'
            {
            root_0 = (Object)adaptor.nil();

            string_literal83=(Token)match(input,57,FOLLOW_57_in_ifexp2036); 
            string_literal83_tree = (Object)adaptor.create(string_literal83);
            adaptor.addChild(root_0, string_literal83_tree);


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
    // albert22u/Tiger3.g:202:1: inexp : 'in' ;
    public final Tiger3Parser.inexp_return inexp() throws RecognitionException {
        Tiger3Parser.inexp_return retval = new Tiger3Parser.inexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal84=null;

        Object string_literal84_tree=null;

        try {
            // albert22u/Tiger3.g:202:7: ( 'in' )
            // albert22u/Tiger3.g:202:9: 'in'
            {
            root_0 = (Object)adaptor.nil();

            string_literal84=(Token)match(input,58,FOLLOW_58_in_inexp2045); 
            string_literal84_tree = (Object)adaptor.create(string_literal84);
            adaptor.addChild(root_0, string_literal84_tree);


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
    // albert22u/Tiger3.g:203:1: nilexp : 'nil' ;
    public final Tiger3Parser.nilexp_return nilexp() throws RecognitionException {
        Tiger3Parser.nilexp_return retval = new Tiger3Parser.nilexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal85=null;

        Object string_literal85_tree=null;

        try {
            // albert22u/Tiger3.g:203:8: ( 'nil' )
            // albert22u/Tiger3.g:203:10: 'nil'
            {
            root_0 = (Object)adaptor.nil();

            string_literal85=(Token)match(input,59,FOLLOW_59_in_nilexp2054); 
            string_literal85_tree = (Object)adaptor.create(string_literal85);
            adaptor.addChild(root_0, string_literal85_tree);


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
    // albert22u/Tiger3.g:204:1: letexp : 'let' ;
    public final Tiger3Parser.letexp_return letexp() throws RecognitionException {
        Tiger3Parser.letexp_return retval = new Tiger3Parser.letexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal86=null;

        Object string_literal86_tree=null;

        try {
            // albert22u/Tiger3.g:204:8: ( 'let' )
            // albert22u/Tiger3.g:204:10: 'let'
            {
            root_0 = (Object)adaptor.nil();

            string_literal86=(Token)match(input,60,FOLLOW_60_in_letexp2063); 
            string_literal86_tree = (Object)adaptor.create(string_literal86);
            adaptor.addChild(root_0, string_literal86_tree);


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
    // albert22u/Tiger3.g:205:1: ofexp : 'of' ;
    public final Tiger3Parser.ofexp_return ofexp() throws RecognitionException {
        Tiger3Parser.ofexp_return retval = new Tiger3Parser.ofexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal87=null;

        Object string_literal87_tree=null;

        try {
            // albert22u/Tiger3.g:205:7: ( 'of' )
            // albert22u/Tiger3.g:205:9: 'of'
            {
            root_0 = (Object)adaptor.nil();

            string_literal87=(Token)match(input,61,FOLLOW_61_in_ofexp2072); 
            string_literal87_tree = (Object)adaptor.create(string_literal87);
            adaptor.addChild(root_0, string_literal87_tree);


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
    // albert22u/Tiger3.g:206:1: thenexp : 'then' ;
    public final Tiger3Parser.thenexp_return thenexp() throws RecognitionException {
        Tiger3Parser.thenexp_return retval = new Tiger3Parser.thenexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal88=null;

        Object string_literal88_tree=null;

        try {
            // albert22u/Tiger3.g:206:9: ( 'then' )
            // albert22u/Tiger3.g:206:11: 'then'
            {
            root_0 = (Object)adaptor.nil();

            string_literal88=(Token)match(input,62,FOLLOW_62_in_thenexp2081); 
            string_literal88_tree = (Object)adaptor.create(string_literal88);
            adaptor.addChild(root_0, string_literal88_tree);


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
    // albert22u/Tiger3.g:207:1: toexp : 'to' ;
    public final Tiger3Parser.toexp_return toexp() throws RecognitionException {
        Tiger3Parser.toexp_return retval = new Tiger3Parser.toexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal89=null;

        Object string_literal89_tree=null;

        try {
            // albert22u/Tiger3.g:207:7: ( 'to' )
            // albert22u/Tiger3.g:207:9: 'to'
            {
            root_0 = (Object)adaptor.nil();

            string_literal89=(Token)match(input,63,FOLLOW_63_in_toexp2089); 
            string_literal89_tree = (Object)adaptor.create(string_literal89);
            adaptor.addChild(root_0, string_literal89_tree);


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
    // albert22u/Tiger3.g:208:1: typeexp : 'type' ;
    public final Tiger3Parser.typeexp_return typeexp() throws RecognitionException {
        Tiger3Parser.typeexp_return retval = new Tiger3Parser.typeexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal90=null;

        Object string_literal90_tree=null;

        try {
            // albert22u/Tiger3.g:208:9: ( 'type' )
            // albert22u/Tiger3.g:208:11: 'type'
            {
            root_0 = (Object)adaptor.nil();

            string_literal90=(Token)match(input,64,FOLLOW_64_in_typeexp2098); 
            string_literal90_tree = (Object)adaptor.create(string_literal90);
            adaptor.addChild(root_0, string_literal90_tree);


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
    // albert22u/Tiger3.g:209:1: varexp : 'var' ;
    public final Tiger3Parser.varexp_return varexp() throws RecognitionException {
        Tiger3Parser.varexp_return retval = new Tiger3Parser.varexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal91=null;

        Object string_literal91_tree=null;

        try {
            // albert22u/Tiger3.g:209:8: ( 'var' )
            // albert22u/Tiger3.g:209:10: 'var'
            {
            root_0 = (Object)adaptor.nil();

            string_literal91=(Token)match(input,65,FOLLOW_65_in_varexp2106); 
            string_literal91_tree = (Object)adaptor.create(string_literal91);
            adaptor.addChild(root_0, string_literal91_tree);


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
    // albert22u/Tiger3.g:210:1: whileexp : 'while' ;
    public final Tiger3Parser.whileexp_return whileexp() throws RecognitionException {
        Tiger3Parser.whileexp_return retval = new Tiger3Parser.whileexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal92=null;

        Object string_literal92_tree=null;

        try {
            // albert22u/Tiger3.g:210:10: ( 'while' )
            // albert22u/Tiger3.g:210:12: 'while'
            {
            root_0 = (Object)adaptor.nil();

            string_literal92=(Token)match(input,66,FOLLOW_66_in_whileexp2115); 
            string_literal92_tree = (Object)adaptor.create(string_literal92);
            adaptor.addChild(root_0, string_literal92_tree);


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
    // albert22u/Tiger3.g:211:1: typedefexp : 'typedef' ;
    public final Tiger3Parser.typedefexp_return typedefexp() throws RecognitionException {
        Tiger3Parser.typedefexp_return retval = new Tiger3Parser.typedefexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal93=null;

        Object string_literal93_tree=null;

        try {
            // albert22u/Tiger3.g:211:13: ( 'typedef' )
            // albert22u/Tiger3.g:211:15: 'typedef'
            {
            root_0 = (Object)adaptor.nil();

            string_literal93=(Token)match(input,67,FOLLOW_67_in_typedefexp2124); 
            string_literal93_tree = (Object)adaptor.create(string_literal93);
            adaptor.addChild(root_0, string_literal93_tree);


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
    // albert22u/Tiger3.g:212:1: blockexp : 'block' ;
    public final Tiger3Parser.blockexp_return blockexp() throws RecognitionException {
        Tiger3Parser.blockexp_return retval = new Tiger3Parser.blockexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal94=null;

        Object string_literal94_tree=null;

        try {
            // albert22u/Tiger3.g:212:11: ( 'block' )
            // albert22u/Tiger3.g:212:13: 'block'
            {
            root_0 = (Object)adaptor.nil();

            string_literal94=(Token)match(input,68,FOLLOW_68_in_blockexp2134); 
            string_literal94_tree = (Object)adaptor.create(string_literal94);
            adaptor.addChild(root_0, string_literal94_tree);


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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA62 dfa62 = new DFA62(this);
    static final String DFA3_eotS =
        "\51\uffff";
    static final String DFA3_eofS =
        "\1\2\50\uffff";
    static final String DFA3_minS =
        "\1\25\50\uffff";
    static final String DFA3_maxS =
        "\1\102\50\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\46\uffff";
    static final String DFA3_specialS =
        "\51\uffff}>";
    static final String[] DFA3_transitionS = {
            "\4\2\2\uffff\1\1\22\2\2\uffff\2\2\1\uffff\12\2\1\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "42:12: ( '{' ( field_list )* '}' )?";
        }
    }
    static final String DFA15_eotS =
        "\51\uffff";
    static final String DFA15_eofS =
        "\1\1\50\uffff";
    static final String DFA15_minS =
        "\1\25\50\uffff";
    static final String DFA15_maxS =
        "\1\102\50\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\1\1\46\uffff";
    static final String DFA15_specialS =
        "\51\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\3\1\2\uffff\23\1\2\uffff\2\1\1\uffff\12\1\1\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 65:62: ( NEWLINE )*";
        }
    }
    static final String DFA17_eotS =
        "\51\uffff";
    static final String DFA17_eofS =
        "\1\2\50\uffff";
    static final String DFA17_minS =
        "\1\25\50\uffff";
    static final String DFA17_maxS =
        "\1\102\50\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\46\uffff";
    static final String DFA17_specialS =
        "\51\uffff}>";
    static final String[] DFA17_transitionS = {
            "\4\2\2\uffff\23\2\2\uffff\2\2\1\uffff\2\2\1\1\7\2\1\uffff\5"+
            "\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "65:71: (els= elseexp ( NEWLINE )* e3= expr )?";
        }
    }
    static final String DFA22_eotS =
        "\51\uffff";
    static final String DFA22_eofS =
        "\1\2\50\uffff";
    static final String DFA22_minS =
        "\1\25\50\uffff";
    static final String DFA22_maxS =
        "\1\102\50\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\46\uffff";
    static final String DFA22_specialS =
        "\51\uffff}>";
    static final String[] DFA22_transitionS = {
            "\4\2\2\uffff\4\2\1\1\16\2\2\uffff\2\2\1\uffff\12\2\1\uffff\5"+
            "\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "78:17: (af= ':=' e1= expr )?";
        }
    }
    static final String DFA23_eotS =
        "\51\uffff";
    static final String DFA23_eofS =
        "\1\1\50\uffff";
    static final String DFA23_minS =
        "\1\25\50\uffff";
    static final String DFA23_maxS =
        "\1\102\50\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\2\25\uffff\1\1\21\uffff";
    static final String DFA23_specialS =
        "\51\uffff}>";
    static final String[] DFA23_transitionS = {
            "\4\1\2\uffff\5\1\1\27\15\1\2\uffff\2\1\1\uffff\12\1\1\uffff"+
            "\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()* loopback of 83:17: (ortoken= '|' andop )*";
        }
    }
    static final String DFA24_eotS =
        "\51\uffff";
    static final String DFA24_eofS =
        "\1\1\50\uffff";
    static final String DFA24_minS =
        "\1\25\50\uffff";
    static final String DFA24_maxS =
        "\1\102\50\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\2\25\uffff\1\1\21\uffff";
    static final String DFA24_specialS =
        "\51\uffff}>";
    static final String[] DFA24_transitionS = {
            "\4\1\2\uffff\6\1\1\27\14\1\2\uffff\2\1\1\uffff\12\1\1\uffff"+
            "\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 88:17: (andtoken= '&' comp )*";
        }
    }
    static final String DFA28_eotS =
        "\51\uffff";
    static final String DFA28_eofS =
        "\1\4\50\uffff";
    static final String DFA28_minS =
        "\1\25\50\uffff";
    static final String DFA28_maxS =
        "\1\102\50\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\3\1\1\2\44\uffff";
    static final String DFA28_specialS =
        "\51\uffff}>";
    static final String[] DFA28_transitionS = {
            "\4\4\2\uffff\7\4\1\1\1\3\1\2\11\4\2\uffff\2\4\1\uffff\12\4\1"+
            "\uffff\5\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "93:18: ( (sup1= '>' (eg1= '=' )? | inf1= '<' (sup2= '>' | eg2= '=' )? | eg3= '=' ) b2= binary )?";
        }
    }
    static final String DFA30_eotS =
        "\51\uffff";
    static final String DFA30_eofS =
        "\1\1\50\uffff";
    static final String DFA30_minS =
        "\1\25\50\uffff";
    static final String DFA30_maxS =
        "\1\102\50\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\2\24\uffff\2\1\21\uffff";
    static final String DFA30_specialS =
        "\51\uffff}>";
    static final String[] DFA30_transitionS = {
            "\4\1\2\uffff\12\1\1\26\1\27\7\1\2\uffff\2\1\1\uffff\12\1\1\uffff"+
            "\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "()* loopback of 102:21: ( (op1= '+' | op2= '-' ) b21= binary2 )*";
        }
    }
    static final String DFA32_eotS =
        "\51\uffff";
    static final String DFA32_eofS =
        "\1\1\50\uffff";
    static final String DFA32_minS =
        "\1\25\50\uffff";
    static final String DFA32_maxS =
        "\1\102\50\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\24\uffff\2\1\21\uffff";
    static final String DFA32_specialS =
        "\51\uffff}>";
    static final String[] DFA32_transitionS = {
            "\4\1\2\uffff\14\1\1\26\1\27\5\1\2\uffff\2\1\1\uffff\12\1\1\uffff"+
            "\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 105:18: ( (mul= '*' | div= '/' ) neg )*";
        }
    }
    static final String DFA34_eotS =
        "\17\uffff";
    static final String DFA34_eofS =
        "\17\uffff";
    static final String DFA34_minS =
        "\1\25\16\uffff";
    static final String DFA34_maxS =
        "\1\102\16\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA34_specialS =
        "\17\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\3\2\15\uffff\1\2\2\uffff\2\2\5\uffff\2\2\1\uffff\1\2\3"+
            "\uffff\1\2\1\uffff\1\2\1\uffff\2\2\5\uffff\1\2",
            "",
            "",
            "",
            "",
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "113:12: ( NEWLINE )?";
        }
    }
    static final String DFA39_eotS =
        "\51\uffff";
    static final String DFA39_eofS =
        "\1\4\50\uffff";
    static final String DFA39_minS =
        "\1\25\50\uffff";
    static final String DFA39_maxS =
        "\1\102\50\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\2\1\1\2\1\3\44\uffff";
    static final String DFA39_specialS =
        "\51\uffff}>";
    static final String[] DFA39_transitionS = {
            "\4\4\2\uffff\16\4\1\3\1\4\1\1\1\2\1\4\2\uffff\2\4\1\uffff\12"+
            "\4\1\uffff\5\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "121:15: (v= lvalue2 | par= '(' (e= expr_list )? ')' )?";
        }
    }
    static final String DFA40_eotS =
        "\52\uffff";
    static final String DFA40_eofS =
        "\1\4\51\uffff";
    static final String DFA40_minS =
        "\1\25\51\uffff";
    static final String DFA40_maxS =
        "\1\102\51\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\2\1\1\2\1\3\45\uffff";
    static final String DFA40_specialS =
        "\52\uffff}>";
    static final String[] DFA40_transitionS = {
            "\4\4\2\uffff\20\4\1\1\1\2\1\4\2\uffff\2\4\1\uffff\12\4\1\3\5"+
            "\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    class DFA40 extends DFA {

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
        public String getDescription() {
            return "129:20: (val= lvalue2 | o= ofexp e2= expr )?";
        }
    }
    static final String DFA57_eotS =
        "\22\uffff";
    static final String DFA57_eofS =
        "\22\uffff";
    static final String DFA57_minS =
        "\1\25\21\uffff";
    static final String DFA57_maxS =
        "\1\102\21\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\1\1\1\2\17\uffff";
    static final String DFA57_specialS =
        "\22\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\1\3\2\15\uffff\1\2\2\uffff\1\2\6\uffff\2\2\1\uffff\1\2\3"+
            "\uffff\6\2\3\uffff\3\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "()* loopback of 167:95: ( NEWLINE )*";
        }
    }
    static final String DFA62_eotS =
        "\51\uffff";
    static final String DFA62_eofS =
        "\1\1\50\uffff";
    static final String DFA62_minS =
        "\1\25\50\uffff";
    static final String DFA62_maxS =
        "\1\102\50\uffff";
    static final String DFA62_acceptS =
        "\1\uffff\1\2\27\uffff\2\1\16\uffff";
    static final String DFA62_specialS =
        "\51\uffff}>";
    static final String[] DFA62_transitionS = {
            "\4\1\2\uffff\20\1\1\31\1\32\1\1\2\uffff\2\1\1\uffff\12\1\1\uffff"+
            "\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "()* loopback of 191:30: ( lvalue2 )*";
        }
    }
 

    public static final BitSet FOLLOW_expr_in_tiger3100 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_NEWLINE_in_tiger3102 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_nilexp_in_expr120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affect_in_expr125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_id_in_expr130 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_expr134 = new BitSet(new long[]{0x0000000030400000L});
    public static final BitSet FOLLOW_field_list_in_expr136 = new BitSet(new long[]{0x0000000030400000L});
    public static final BitSet FOLLOW_28_in_expr139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifop_in_expr146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forop_in_expr151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileop_in_expr156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakexp_in_expr161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letexp_in_expr168 = new BitSet(new long[]{0x0100000000200000L,0x0000000000000003L});
    public static final BitSet FOLLOW_declaration_list_in_expr172 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_NEWLINE_in_expr174 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_inexp_in_expr177 = new BitSet(new long[]{0x1ACB024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_seq_in_expr181 = new BitSet(new long[]{0x1ACB024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_expr184 = new BitSet(new long[]{0x1ACB024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_endexp_in_expr187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list243 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_expr_list248 = new BitSet(new long[]{0x1A8B024001C00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_expr_list252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_seq289 = new BitSet(new long[]{0x0000000040200002L});
    public static final BitSet FOLLOW_NEWLINE_in_expr_seq291 = new BitSet(new long[]{0x0000000040200002L});
    public static final BitSet FOLLOW_30_in_expr_seq298 = new BitSet(new long[]{0x1A8B024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_expr_seq300 = new BitSet(new long[]{0x1A8B024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_seq_in_expr_seq305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_field_list339 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_field_list341 = new BitSet(new long[]{0x1A8B024001C00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_field_list343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_field_list347 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_field_list349 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_field_list351 = new BitSet(new long[]{0x1A8B024001C00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_field_list353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifexp_in_ifop367 = new BitSet(new long[]{0x1A8B024001C00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifop371 = new BitSet(new long[]{0x4000000000200000L});
    public static final BitSet FOLLOW_NEWLINE_in_ifop373 = new BitSet(new long[]{0x4000000000200000L});
    public static final BitSet FOLLOW_thenexp_in_ifop378 = new BitSet(new long[]{0x1A8B024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_ifop380 = new BitSet(new long[]{0x1A8B024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifop385 = new BitSet(new long[]{0x0020000000200002L});
    public static final BitSet FOLLOW_NEWLINE_in_ifop387 = new BitSet(new long[]{0x0020000000200002L});
    public static final BitSet FOLLOW_elseexp_in_ifop393 = new BitSet(new long[]{0x1A8B024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_ifop395 = new BitSet(new long[]{0x1A8B024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifop400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forexp_in_forop481 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_forop485 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_forop487 = new BitSet(new long[]{0x1A8B024001C00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_forop491 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_toexp_in_forop493 = new BitSet(new long[]{0x1A8B024001C00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_forop497 = new BitSet(new long[]{0x0010000000200000L});
    public static final BitSet FOLLOW_NEWLINE_in_forop499 = new BitSet(new long[]{0x0010000000200000L});
    public static final BitSet FOLLOW_doexp_in_forop502 = new BitSet(new long[]{0x1A8B024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_forop504 = new BitSet(new long[]{0x1A8B024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_forop509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileexp_in_whileop560 = new BitSet(new long[]{0x1A8B024001C00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_whileop564 = new BitSet(new long[]{0x0010000000200000L});
    public static final BitSet FOLLOW_NEWLINE_in_whileop566 = new BitSet(new long[]{0x0010000000200000L});
    public static final BitSet FOLLOW_doexp_in_whileop569 = new BitSet(new long[]{0x1A8B024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_whileop571 = new BitSet(new long[]{0x1A8B024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_whileop576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orop_in_affect613 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_affect618 = new BitSet(new long[]{0x1A8B024001C00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_affect622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andop_in_orop662 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_orop667 = new BitSet(new long[]{0x0000024001C00000L});
    public static final BitSet FOLLOW_andop_in_orop670 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_comp_in_andop693 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_andop698 = new BitSet(new long[]{0x0000024001C00000L});
    public static final BitSet FOLLOW_comp_in_andop701 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_binary_in_comp723 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_34_in_comp729 = new BitSet(new long[]{0x0000024801C00000L});
    public static final BitSet FOLLOW_35_in_comp733 = new BitSet(new long[]{0x0000024001C00000L});
    public static final BitSet FOLLOW_36_in_comp741 = new BitSet(new long[]{0x0000024C01C00000L});
    public static final BitSet FOLLOW_34_in_comp746 = new BitSet(new long[]{0x0000024001C00000L});
    public static final BitSet FOLLOW_35_in_comp752 = new BitSet(new long[]{0x0000024001C00000L});
    public static final BitSet FOLLOW_35_in_comp760 = new BitSet(new long[]{0x0000024001C00000L});
    public static final BitSet FOLLOW_binary_in_comp765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary2_in_binary906 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_binary912 = new BitSet(new long[]{0x0000024001C00000L});
    public static final BitSet FOLLOW_38_in_binary917 = new BitSet(new long[]{0x0000024001C00000L});
    public static final BitSet FOLLOW_binary2_in_binary923 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_neg_in_binary2938 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_binary2944 = new BitSet(new long[]{0x0000024001C00000L});
    public static final BitSet FOLLOW_40_in_binary2949 = new BitSet(new long[]{0x0000024001C00000L});
    public static final BitSet FOLLOW_neg_in_binary2953 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_38_in_neg967 = new BitSet(new long[]{0x0000024001C00000L});
    public static final BitSet FOLLOW_atom_in_neg972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_atom1007 = new BitSet(new long[]{0x1A8B064001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_atom1009 = new BitSet(new long[]{0x1A8B064001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_seq_in_atom1014 = new BitSet(new long[]{0x0000040000200000L});
    public static final BitSet FOLLOW_NEWLINE_in_atom1017 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_atom1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_atom1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lvalue1068 = new BitSet(new long[]{0x00001A0000000002L});
    public static final BitSet FOLLOW_lvalue2_in_lvalue1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_lvalue1079 = new BitSet(new long[]{0x1A8B064001C00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_lvalue1083 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_lvalue1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_lvalue21166 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_lvalue21168 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_lvalue2_in_lvalue21170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_lvalue21175 = new BitSet(new long[]{0x1A8B024001C00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_lvalue21179 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_lvalue21181 = new BitSet(new long[]{0x2000180000000002L});
    public static final BitSet FOLLOW_lvalue2_in_lvalue21186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ofexp_in_lvalue21192 = new BitSet(new long[]{0x1A8B024001C00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_lvalue21196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_declaration_list1264 = new BitSet(new long[]{0x0100000000200000L,0x0000000000000003L});
    public static final BitSet FOLLOW_declaration_in_declaration_list1269 = new BitSet(new long[]{0x0100000000200002L,0x0000000000000003L});
    public static final BitSet FOLLOW_declaration_list_in_declaration_list1274 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_NEWLINE_in_declaration_list1278 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_type_declaration_in_declaration1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_declaration1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_in_declaration1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeexp_in_type_declaration1334 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_type_declaration1338 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_type_declaration1340 = new BitSet(new long[]{0x0003400008000000L});
    public static final BitSet FOLLOW_type_in_type_declaration1344 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_NEWLINE_in_type_declaration1346 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_type_id_in_type1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type1390 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_type_fields_in_type1394 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_type1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_type1430 = new BitSet(new long[]{0x0003000000400000L});
    public static final BitSet FOLLOW_type_id_in_type1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varexp_in_variable_declaration1481 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_variable_declaration1485 = new BitSet(new long[]{0x0000800080000000L});
    public static final BitSet FOLLOW_47_in_variable_declaration1491 = new BitSet(new long[]{0x0003000000400000L});
    public static final BitSet FOLLOW_ID_in_variable_declaration1496 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_type_id_in_variable_declaration1502 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_variable_declaration1507 = new BitSet(new long[]{0x1A8B024001C00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_variable_declaration1511 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_NEWLINE_in_variable_declaration1513 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_functionexp_in_function_declaration1588 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_function_declaration1590 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_function_declaration1592 = new BitSet(new long[]{0x0000040000400000L});
    public static final BitSet FOLLOW_type_fields_in_function_declaration1596 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_function_declaration1599 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_47_in_function_declaration1602 = new BitSet(new long[]{0x0003000000400000L});
    public static final BitSet FOLLOW_type_id_in_function_declaration1607 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_function_declaration1611 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_function_declaration1617 = new BitSet(new long[]{0x1A8B024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_function_declaration1619 = new BitSet(new long[]{0x1A8B024001E00000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_function_declaration1625 = new BitSet(new long[]{0x1A8B024001E00002L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEWLINE_in_function_declaration1627 = new BitSet(new long[]{0x1A8B024001E00002L,0x0000000000000004L});
    public static final BitSet FOLLOW_type_field_in_type_fields1816 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_type_fields2_in_type_fields1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_type_fields21853 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_type_field_in_type_fields21857 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_type_fields2_in_type_fields21861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_field1896 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_type_field1898 = new BitSet(new long[]{0x0003000000400000L});
    public static final BitSet FOLLOW_type_id_in_type_field1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_field1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_id1951 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_lvalue2_in_type_id1959 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_50_in_arrayexp1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_breakexp1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_doexp1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_elseexp1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_endexp2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_forexp2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_functionexp2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ifexp2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_inexp2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_nilexp2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_letexp2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ofexp2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_thenexp2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_toexp2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_typeexp2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_varexp2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_whileexp2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_typedefexp2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_blockexp2134 = new BitSet(new long[]{0x0000000000000002L});

}