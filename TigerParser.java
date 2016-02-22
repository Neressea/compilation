// $ANTLR 3.3 Nov 30, 2010 12:50:56 ./albert22u/Tiger.g 2016-02-22 19:36:22

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class TigerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "INT", "ID", "NEWLINE", "WS", "COMMENT", "'-'", "'('", "')'", "':='", "'{'", "'}'", "';'", "','", "'='", "'.'", "'['", "']'", "':'", "'|'", "'&'", "'<'", "'>'", "'+'", "'*'", "'/'", "'array'", "'break'", "'do'", "'else'", "'end'", "'for'", "'function'", "'if'", "'in'", "'nil'", "'let'", "'of'", "'then'", "'to'", "'type'", "'var'", "'while'", "'typedef'", "'block'"
    };
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
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
    public static final int STRING=4;
    public static final int INT=5;
    public static final int ID=6;
    public static final int NEWLINE=7;
    public static final int WS=8;
    public static final int COMMENT=9;

    // delegates
    // delegators


        public TigerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TigerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TigerParser.tokenNames; }
    public String getGrammarFileName() { return "./albert22u/Tiger.g"; }


    /** Map variable name to Integer object holding value */
    HashMap<String,Integer>  memory = new HashMap<String,Integer>();


    public static class tiger_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tiger"
    // ./albert22u/Tiger.g:18:1: tiger : expr ;
    public final TigerParser.tiger_return tiger() throws RecognitionException {
        TigerParser.tiger_return retval = new TigerParser.tiger_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TigerParser.expr_return expr1 = null;



        try {
            // ./albert22u/Tiger.g:18:7: ( expr )
            // ./albert22u/Tiger.g:18:9: expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_tiger42);
            expr1=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr1.getTree());

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
    // $ANTLR end "tiger"

    public static class expr2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr2"
    // ./albert22u/Tiger.g:21:1: expr2 : ( binary_operator expr expr2 | );
    public final TigerParser.expr2_return expr2() throws RecognitionException {
        TigerParser.expr2_return retval = new TigerParser.expr2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TigerParser.binary_operator_return binary_operator2 = null;

        TigerParser.expr_return expr3 = null;

        TigerParser.expr2_return expr24 = null;



        try {
            // ./albert22u/Tiger.g:21:7: ( binary_operator expr expr2 | )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ./albert22u/Tiger.g:21:11: binary_operator expr expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_binary_operator_in_expr253);
                    binary_operator2=binary_operator();

                    state._fsp--;

                    adaptor.addChild(root_0, binary_operator2.getTree());
                    pushFollow(FOLLOW_expr_in_expr255);
                    expr3=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr3.getTree());
                    pushFollow(FOLLOW_expr2_in_expr257);
                    expr24=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr24.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:23:2: 
                    {
                    root_0 = (Object)adaptor.nil();

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
    // $ANTLR end "expr2"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // ./albert22u/Tiger.g:24:1: expr : ( STRING expr2 | INT expr2 | nilexp expr2 | '-' expr expr2 | ID lvalue | '(' ( expr_seq )? ')' expr2 | ifexp COND= expr thenexp DO= expr ELSE= else_ou_pas_else expr2 | whileexp expr doexp expr expr2 | forexp ID ':=' INIT= expr toexp DEST= expr doexp NEWLINE boucle= expr SUITE= expr2 | breakexp expr2 | letexp declaration_list inexp ( expr_seq )* endexp expr2 | declaration expr2 | NEWLINE expr );
    public final TigerParser.expr_return expr() throws RecognitionException {
        TigerParser.expr_return retval = new TigerParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING5=null;
        Token INT7=null;
        Token char_literal11=null;
        Token ID14=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Token ID29=null;
        Token string_literal30=null;
        Token NEWLINE33=null;
        Token NEWLINE44=null;
        TigerParser.expr_return COND = null;

        TigerParser.expr_return DO = null;

        TigerParser.else_ou_pas_else_return ELSE = null;

        TigerParser.expr_return INIT = null;

        TigerParser.expr_return DEST = null;

        TigerParser.expr_return boucle = null;

        TigerParser.expr2_return SUITE = null;

        TigerParser.expr_return expr26 = null;

        TigerParser.expr2_return expr28 = null;

        TigerParser.nilexp_return nilexp9 = null;

        TigerParser.expr2_return expr210 = null;

        TigerParser.expr_return expr12 = null;

        TigerParser.expr2_return expr213 = null;

        TigerParser.lvalue_return lvalue15 = null;

        TigerParser.expr_seq_return expr_seq17 = null;

        TigerParser.expr2_return expr219 = null;

        TigerParser.ifexp_return ifexp20 = null;

        TigerParser.thenexp_return thenexp21 = null;

        TigerParser.expr2_return expr222 = null;

        TigerParser.whileexp_return whileexp23 = null;

        TigerParser.expr_return expr24 = null;

        TigerParser.doexp_return doexp25 = null;

        TigerParser.expr2_return expr227 = null;

        TigerParser.forexp_return forexp28 = null;

        TigerParser.toexp_return toexp31 = null;

        TigerParser.doexp_return doexp32 = null;

        TigerParser.breakexp_return breakexp34 = null;

        TigerParser.expr2_return expr235 = null;

        TigerParser.letexp_return letexp36 = null;

        TigerParser.declaration_list_return declaration_list37 = null;

        TigerParser.inexp_return inexp38 = null;

        TigerParser.expr_seq_return expr_seq39 = null;

        TigerParser.endexp_return endexp40 = null;

        TigerParser.expr2_return expr241 = null;

        TigerParser.declaration_return declaration42 = null;

        TigerParser.expr2_return expr243 = null;

        TigerParser.expr_return expr45 = null;


        Object STRING5_tree=null;
        Object INT7_tree=null;
        Object char_literal11_tree=null;
        Object ID14_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        Object ID29_tree=null;
        Object string_literal30_tree=null;
        Object NEWLINE33_tree=null;
        Object NEWLINE44_tree=null;

        try {
            // ./albert22u/Tiger.g:24:6: ( STRING expr2 | INT expr2 | nilexp expr2 | '-' expr expr2 | ID lvalue | '(' ( expr_seq )? ')' expr2 | ifexp COND= expr thenexp DO= expr ELSE= else_ou_pas_else expr2 | whileexp expr doexp expr expr2 | forexp ID ':=' INIT= expr toexp DEST= expr doexp NEWLINE boucle= expr SUITE= expr2 | breakexp expr2 | letexp declaration_list inexp ( expr_seq )* endexp expr2 | declaration expr2 | NEWLINE expr )
            int alt4=13;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ./albert22u/Tiger.g:24:8: STRING expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_expr69); 
                    STRING5_tree = (Object)adaptor.create(STRING5);
                    adaptor.addChild(root_0, STRING5_tree);

                    pushFollow(FOLLOW_expr2_in_expr71);
                    expr26=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr26.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:25:4: INT expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    INT7=(Token)match(input,INT,FOLLOW_INT_in_expr76); 
                    INT7_tree = (Object)adaptor.create(INT7);
                    adaptor.addChild(root_0, INT7_tree);

                    pushFollow(FOLLOW_expr2_in_expr78);
                    expr28=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr28.getTree());

                    }
                    break;
                case 3 :
                    // ./albert22u/Tiger.g:26:4: nilexp expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nilexp_in_expr83);
                    nilexp9=nilexp();

                    state._fsp--;

                    adaptor.addChild(root_0, nilexp9.getTree());
                    pushFollow(FOLLOW_expr2_in_expr85);
                    expr210=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr210.getTree());

                    }
                    break;
                case 4 :
                    // ./albert22u/Tiger.g:27:4: '-' expr expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal11=(Token)match(input,10,FOLLOW_10_in_expr90); 
                    char_literal11_tree = (Object)adaptor.create(char_literal11);
                    adaptor.addChild(root_0, char_literal11_tree);

                    pushFollow(FOLLOW_expr_in_expr92);
                    expr12=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr12.getTree());
                    pushFollow(FOLLOW_expr2_in_expr94);
                    expr213=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr213.getTree());

                    }
                    break;
                case 5 :
                    // ./albert22u/Tiger.g:28:4: ID lvalue
                    {
                    root_0 = (Object)adaptor.nil();

                    ID14=(Token)match(input,ID,FOLLOW_ID_in_expr99); 
                    ID14_tree = (Object)adaptor.create(ID14);
                    adaptor.addChild(root_0, ID14_tree);

                    pushFollow(FOLLOW_lvalue_in_expr101);
                    lvalue15=lvalue();

                    state._fsp--;

                    adaptor.addChild(root_0, lvalue15.getTree());

                    }
                    break;
                case 6 :
                    // ./albert22u/Tiger.g:29:4: '(' ( expr_seq )? ')' expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal16=(Token)match(input,11,FOLLOW_11_in_expr106); 
                    char_literal16_tree = (Object)adaptor.create(char_literal16);
                    adaptor.addChild(root_0, char_literal16_tree);

                    // ./albert22u/Tiger.g:29:8: ( expr_seq )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=STRING && LA2_0<=NEWLINE)||(LA2_0>=10 && LA2_0<=11)||LA2_0==31||(LA2_0>=35 && LA2_0<=37)||(LA2_0>=39 && LA2_0<=40)||(LA2_0>=44 && LA2_0<=46)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ./albert22u/Tiger.g:29:8: expr_seq
                            {
                            pushFollow(FOLLOW_expr_seq_in_expr108);
                            expr_seq17=expr_seq();

                            state._fsp--;

                            adaptor.addChild(root_0, expr_seq17.getTree());

                            }
                            break;

                    }

                    char_literal18=(Token)match(input,12,FOLLOW_12_in_expr111); 
                    char_literal18_tree = (Object)adaptor.create(char_literal18);
                    adaptor.addChild(root_0, char_literal18_tree);

                    pushFollow(FOLLOW_expr2_in_expr113);
                    expr219=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr219.getTree());

                    }
                    break;
                case 7 :
                    // ./albert22u/Tiger.g:30:4: ifexp COND= expr thenexp DO= expr ELSE= else_ou_pas_else expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifexp_in_expr118);
                    ifexp20=ifexp();

                    state._fsp--;

                    adaptor.addChild(root_0, ifexp20.getTree());
                    pushFollow(FOLLOW_expr_in_expr122);
                    COND=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, COND.getTree());
                    pushFollow(FOLLOW_thenexp_in_expr124);
                    thenexp21=thenexp();

                    state._fsp--;

                    adaptor.addChild(root_0, thenexp21.getTree());
                    pushFollow(FOLLOW_expr_in_expr128);
                    DO=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, DO.getTree());
                    pushFollow(FOLLOW_else_ou_pas_else_in_expr132);
                    ELSE=else_ou_pas_else();

                    state._fsp--;

                    adaptor.addChild(root_0, ELSE.getTree());
                    pushFollow(FOLLOW_expr2_in_expr134);
                    expr222=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr222.getTree());

                    }
                    break;
                case 8 :
                    // ./albert22u/Tiger.g:31:4: whileexp expr doexp expr expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileexp_in_expr140);
                    whileexp23=whileexp();

                    state._fsp--;

                    adaptor.addChild(root_0, whileexp23.getTree());
                    pushFollow(FOLLOW_expr_in_expr142);
                    expr24=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr24.getTree());
                    pushFollow(FOLLOW_doexp_in_expr144);
                    doexp25=doexp();

                    state._fsp--;

                    adaptor.addChild(root_0, doexp25.getTree());
                    pushFollow(FOLLOW_expr_in_expr146);
                    expr26=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr26.getTree());
                    pushFollow(FOLLOW_expr2_in_expr148);
                    expr227=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr227.getTree());

                    }
                    break;
                case 9 :
                    // ./albert22u/Tiger.g:32:4: forexp ID ':=' INIT= expr toexp DEST= expr doexp NEWLINE boucle= expr SUITE= expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forexp_in_expr153);
                    forexp28=forexp();

                    state._fsp--;

                    adaptor.addChild(root_0, forexp28.getTree());
                    ID29=(Token)match(input,ID,FOLLOW_ID_in_expr155); 
                    ID29_tree = (Object)adaptor.create(ID29);
                    adaptor.addChild(root_0, ID29_tree);

                    string_literal30=(Token)match(input,13,FOLLOW_13_in_expr157); 
                    string_literal30_tree = (Object)adaptor.create(string_literal30);
                    adaptor.addChild(root_0, string_literal30_tree);

                    pushFollow(FOLLOW_expr_in_expr161);
                    INIT=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, INIT.getTree());
                    pushFollow(FOLLOW_toexp_in_expr163);
                    toexp31=toexp();

                    state._fsp--;

                    adaptor.addChild(root_0, toexp31.getTree());
                    pushFollow(FOLLOW_expr_in_expr169);
                    DEST=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, DEST.getTree());
                    pushFollow(FOLLOW_doexp_in_expr171);
                    doexp32=doexp();

                    state._fsp--;

                    adaptor.addChild(root_0, doexp32.getTree());
                    NEWLINE33=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_expr173); 
                    NEWLINE33_tree = (Object)adaptor.create(NEWLINE33);
                    adaptor.addChild(root_0, NEWLINE33_tree);

                    pushFollow(FOLLOW_expr_in_expr179);
                    boucle=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, boucle.getTree());
                    pushFollow(FOLLOW_expr2_in_expr185);
                    SUITE=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, SUITE.getTree());

                    }
                    break;
                case 10 :
                    // ./albert22u/Tiger.g:33:4: breakexp expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakexp_in_expr191);
                    breakexp34=breakexp();

                    state._fsp--;

                    adaptor.addChild(root_0, breakexp34.getTree());
                    pushFollow(FOLLOW_expr2_in_expr193);
                    expr235=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr235.getTree());

                    }
                    break;
                case 11 :
                    // ./albert22u/Tiger.g:34:4: letexp declaration_list inexp ( expr_seq )* endexp expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_letexp_in_expr198);
                    letexp36=letexp();

                    state._fsp--;

                    adaptor.addChild(root_0, letexp36.getTree());
                    pushFollow(FOLLOW_declaration_list_in_expr200);
                    declaration_list37=declaration_list();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration_list37.getTree());
                    pushFollow(FOLLOW_inexp_in_expr202);
                    inexp38=inexp();

                    state._fsp--;

                    adaptor.addChild(root_0, inexp38.getTree());
                    // ./albert22u/Tiger.g:34:34: ( expr_seq )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=STRING && LA3_0<=NEWLINE)||(LA3_0>=10 && LA3_0<=11)||LA3_0==31||(LA3_0>=35 && LA3_0<=37)||(LA3_0>=39 && LA3_0<=40)||(LA3_0>=44 && LA3_0<=46)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ./albert22u/Tiger.g:34:34: expr_seq
                    	    {
                    	    pushFollow(FOLLOW_expr_seq_in_expr204);
                    	    expr_seq39=expr_seq();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr_seq39.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    pushFollow(FOLLOW_endexp_in_expr207);
                    endexp40=endexp();

                    state._fsp--;

                    adaptor.addChild(root_0, endexp40.getTree());
                    pushFollow(FOLLOW_expr2_in_expr209);
                    expr241=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr241.getTree());

                    }
                    break;
                case 12 :
                    // ./albert22u/Tiger.g:35:4: declaration expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_declaration_in_expr215);
                    declaration42=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration42.getTree());
                    pushFollow(FOLLOW_expr2_in_expr217);
                    expr243=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr243.getTree());

                    }
                    break;
                case 13 :
                    // ./albert22u/Tiger.g:36:4: NEWLINE expr
                    {
                    root_0 = (Object)adaptor.nil();

                    NEWLINE44=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_expr222); 
                    NEWLINE44_tree = (Object)adaptor.create(NEWLINE44);
                    adaptor.addChild(root_0, NEWLINE44_tree);

                    pushFollow(FOLLOW_expr_in_expr224);
                    expr45=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr45.getTree());

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

    public static class parenthese_ou_accolade_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parenthese_ou_accolade"
    // ./albert22u/Tiger.g:41:1: parenthese_ou_accolade : ( '(' ( expr_list )? ')' expr2 | '{' ( field_list )? '}' expr2 );
    public final TigerParser.parenthese_ou_accolade_return parenthese_ou_accolade() throws RecognitionException {
        TigerParser.parenthese_ou_accolade_return retval = new TigerParser.parenthese_ou_accolade_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal46=null;
        Token char_literal48=null;
        Token char_literal50=null;
        Token char_literal52=null;
        TigerParser.expr_list_return expr_list47 = null;

        TigerParser.expr2_return expr249 = null;

        TigerParser.field_list_return field_list51 = null;

        TigerParser.expr2_return expr253 = null;


        Object char_literal46_tree=null;
        Object char_literal48_tree=null;
        Object char_literal50_tree=null;
        Object char_literal52_tree=null;

        try {
            // ./albert22u/Tiger.g:42:2: ( '(' ( expr_list )? ')' expr2 | '{' ( field_list )? '}' expr2 )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ./albert22u/Tiger.g:42:5: '(' ( expr_list )? ')' expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal46=(Token)match(input,11,FOLLOW_11_in_parenthese_ou_accolade239); 
                    char_literal46_tree = (Object)adaptor.create(char_literal46);
                    adaptor.addChild(root_0, char_literal46_tree);

                    // ./albert22u/Tiger.g:42:9: ( expr_list )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=STRING && LA5_0<=NEWLINE)||(LA5_0>=10 && LA5_0<=11)||LA5_0==31||(LA5_0>=35 && LA5_0<=37)||(LA5_0>=39 && LA5_0<=40)||(LA5_0>=44 && LA5_0<=46)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ./albert22u/Tiger.g:42:9: expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_parenthese_ou_accolade241);
                            expr_list47=expr_list();

                            state._fsp--;

                            adaptor.addChild(root_0, expr_list47.getTree());

                            }
                            break;

                    }

                    char_literal48=(Token)match(input,12,FOLLOW_12_in_parenthese_ou_accolade244); 
                    char_literal48_tree = (Object)adaptor.create(char_literal48);
                    adaptor.addChild(root_0, char_literal48_tree);

                    pushFollow(FOLLOW_expr2_in_parenthese_ou_accolade246);
                    expr249=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr249.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:43:4: '{' ( field_list )? '}' expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal50=(Token)match(input,14,FOLLOW_14_in_parenthese_ou_accolade251); 
                    char_literal50_tree = (Object)adaptor.create(char_literal50);
                    adaptor.addChild(root_0, char_literal50_tree);

                    // ./albert22u/Tiger.g:43:8: ( field_list )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==ID) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ./albert22u/Tiger.g:43:8: field_list
                            {
                            pushFollow(FOLLOW_field_list_in_parenthese_ou_accolade253);
                            field_list51=field_list();

                            state._fsp--;

                            adaptor.addChild(root_0, field_list51.getTree());

                            }
                            break;

                    }

                    char_literal52=(Token)match(input,15,FOLLOW_15_in_parenthese_ou_accolade256); 
                    char_literal52_tree = (Object)adaptor.create(char_literal52);
                    adaptor.addChild(root_0, char_literal52_tree);

                    pushFollow(FOLLOW_expr2_in_parenthese_ou_accolade258);
                    expr253=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr253.getTree());

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
    // $ANTLR end "parenthese_ou_accolade"

    public static class else_ou_pas_else_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "else_ou_pas_else"
    // ./albert22u/Tiger.g:46:1: else_ou_pas_else : ( elseexp expr | );
    public final TigerParser.else_ou_pas_else_return else_ou_pas_else() throws RecognitionException {
        TigerParser.else_ou_pas_else_return retval = new TigerParser.else_ou_pas_else_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TigerParser.elseexp_return elseexp54 = null;

        TigerParser.expr_return expr55 = null;



        try {
            // ./albert22u/Tiger.g:47:2: ( elseexp expr | )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ./albert22u/Tiger.g:47:4: elseexp expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elseexp_in_else_ou_pas_else270);
                    elseexp54=elseexp();

                    state._fsp--;

                    adaptor.addChild(root_0, elseexp54.getTree());
                    pushFollow(FOLLOW_expr_in_else_ou_pas_else272);
                    expr55=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr55.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:49:1: 
                    {
                    root_0 = (Object)adaptor.nil();

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
    // $ANTLR end "else_ou_pas_else"

    public static class affect_ou_pas_affect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "affect_ou_pas_affect"
    // ./albert22u/Tiger.g:51:1: affect_ou_pas_affect : ( ':=' expr | );
    public final TigerParser.affect_ou_pas_affect_return affect_ou_pas_affect() throws RecognitionException {
        TigerParser.affect_ou_pas_affect_return retval = new TigerParser.affect_ou_pas_affect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal56=null;
        TigerParser.expr_return expr57 = null;


        Object string_literal56_tree=null;

        try {
            // ./albert22u/Tiger.g:52:2: ( ':=' expr | )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ./albert22u/Tiger.g:52:4: ':=' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal56=(Token)match(input,13,FOLLOW_13_in_affect_ou_pas_affect287); 
                    string_literal56_tree = (Object)adaptor.create(string_literal56);
                    adaptor.addChild(root_0, string_literal56_tree);

                    pushFollow(FOLLOW_expr_in_affect_ou_pas_affect289);
                    expr57=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr57.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:54:1: 
                    {
                    root_0 = (Object)adaptor.nil();

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
    // $ANTLR end "affect_ou_pas_affect"

    public static class expr_seq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_seq"
    // ./albert22u/Tiger.g:55:1: expr_seq : expr expr_seq2 ;
    public final TigerParser.expr_seq_return expr_seq() throws RecognitionException {
        TigerParser.expr_seq_return retval = new TigerParser.expr_seq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TigerParser.expr_return expr58 = null;

        TigerParser.expr_seq2_return expr_seq259 = null;



        try {
            // ./albert22u/Tiger.g:56:2: ( expr expr_seq2 )
            // ./albert22u/Tiger.g:56:4: expr expr_seq2
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_expr_seq302);
            expr58=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr58.getTree());
            pushFollow(FOLLOW_expr_seq2_in_expr_seq304);
            expr_seq259=expr_seq2();

            state._fsp--;

            adaptor.addChild(root_0, expr_seq259.getTree());

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

    public static class expr_seq2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_seq2"
    // ./albert22u/Tiger.g:58:1: expr_seq2 : ( ';' expr_seq | );
    public final TigerParser.expr_seq2_return expr_seq2() throws RecognitionException {
        TigerParser.expr_seq2_return retval = new TigerParser.expr_seq2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal60=null;
        TigerParser.expr_seq_return expr_seq61 = null;


        Object char_literal60_tree=null;

        try {
            // ./albert22u/Tiger.g:59:2: ( ';' expr_seq | )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=STRING && LA10_0<=NEWLINE)||(LA10_0>=10 && LA10_0<=12)||LA10_0==31||(LA10_0>=34 && LA10_0<=37)||(LA10_0>=39 && LA10_0<=40)||(LA10_0>=44 && LA10_0<=46)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ./albert22u/Tiger.g:59:4: ';' expr_seq
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal60=(Token)match(input,16,FOLLOW_16_in_expr_seq2313); 
                    char_literal60_tree = (Object)adaptor.create(char_literal60);
                    adaptor.addChild(root_0, char_literal60_tree);

                    pushFollow(FOLLOW_expr_seq_in_expr_seq2315);
                    expr_seq61=expr_seq();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_seq61.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:61:1: 
                    {
                    root_0 = (Object)adaptor.nil();

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
    // $ANTLR end "expr_seq2"

    public static class expr_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_list"
    // ./albert22u/Tiger.g:62:1: expr_list : expr expr_list2 ;
    public final TigerParser.expr_list_return expr_list() throws RecognitionException {
        TigerParser.expr_list_return retval = new TigerParser.expr_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TigerParser.expr_return expr62 = null;

        TigerParser.expr_list2_return expr_list263 = null;



        try {
            // ./albert22u/Tiger.g:62:11: ( expr expr_list2 )
            // ./albert22u/Tiger.g:62:13: expr expr_list2
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_expr_list326);
            expr62=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr62.getTree());
            pushFollow(FOLLOW_expr_list2_in_expr_list328);
            expr_list263=expr_list2();

            state._fsp--;

            adaptor.addChild(root_0, expr_list263.getTree());

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

    public static class expr_list2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_list2"
    // ./albert22u/Tiger.g:64:1: expr_list2 : ( ',' expr_list | );
    public final TigerParser.expr_list2_return expr_list2() throws RecognitionException {
        TigerParser.expr_list2_return retval = new TigerParser.expr_list2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        TigerParser.expr_list_return expr_list65 = null;


        Object char_literal64_tree=null;

        try {
            // ./albert22u/Tiger.g:65:2: ( ',' expr_list | )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            else if ( (LA11_0==12) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ./albert22u/Tiger.g:65:4: ',' expr_list
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal64=(Token)match(input,17,FOLLOW_17_in_expr_list2337); 
                    char_literal64_tree = (Object)adaptor.create(char_literal64);
                    adaptor.addChild(root_0, char_literal64_tree);

                    pushFollow(FOLLOW_expr_list_in_expr_list2339);
                    expr_list65=expr_list();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_list65.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:67:1: 
                    {
                    root_0 = (Object)adaptor.nil();

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
    // $ANTLR end "expr_list2"

    public static class field_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_list"
    // ./albert22u/Tiger.g:68:1: field_list : ID '=' expr field_list2 ;
    public final TigerParser.field_list_return field_list() throws RecognitionException {
        TigerParser.field_list_return retval = new TigerParser.field_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID66=null;
        Token char_literal67=null;
        TigerParser.expr_return expr68 = null;

        TigerParser.field_list2_return field_list269 = null;


        Object ID66_tree=null;
        Object char_literal67_tree=null;

        try {
            // ./albert22u/Tiger.g:69:2: ( ID '=' expr field_list2 )
            // ./albert22u/Tiger.g:69:4: ID '=' expr field_list2
            {
            root_0 = (Object)adaptor.nil();

            ID66=(Token)match(input,ID,FOLLOW_ID_in_field_list351); 
            ID66_tree = (Object)adaptor.create(ID66);
            adaptor.addChild(root_0, ID66_tree);

            char_literal67=(Token)match(input,18,FOLLOW_18_in_field_list353); 
            char_literal67_tree = (Object)adaptor.create(char_literal67);
            adaptor.addChild(root_0, char_literal67_tree);

            pushFollow(FOLLOW_expr_in_field_list355);
            expr68=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr68.getTree());
            pushFollow(FOLLOW_field_list2_in_field_list357);
            field_list269=field_list2();

            state._fsp--;

            adaptor.addChild(root_0, field_list269.getTree());

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

    public static class field_list2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_list2"
    // ./albert22u/Tiger.g:71:1: field_list2 : ( ',' field_list | );
    public final TigerParser.field_list2_return field_list2() throws RecognitionException {
        TigerParser.field_list2_return retval = new TigerParser.field_list2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal70=null;
        TigerParser.field_list_return field_list71 = null;


        Object char_literal70_tree=null;

        try {
            // ./albert22u/Tiger.g:72:2: ( ',' field_list | )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ./albert22u/Tiger.g:72:4: ',' field_list
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal70=(Token)match(input,17,FOLLOW_17_in_field_list2367); 
                    char_literal70_tree = (Object)adaptor.create(char_literal70);
                    adaptor.addChild(root_0, char_literal70_tree);

                    pushFollow(FOLLOW_field_list_in_field_list2369);
                    field_list71=field_list();

                    state._fsp--;

                    adaptor.addChild(root_0, field_list71.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:74:1: 
                    {
                    root_0 = (Object)adaptor.nil();

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
    // $ANTLR end "field_list2"

    public static class lvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lvalue"
    // ./albert22u/Tiger.g:75:1: lvalue : ( lvalue2 affect_ou_pas_affect expr2 | parenthese_ou_accolade );
    public final TigerParser.lvalue_return lvalue() throws RecognitionException {
        TigerParser.lvalue_return retval = new TigerParser.lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TigerParser.lvalue2_return lvalue272 = null;

        TigerParser.affect_ou_pas_affect_return affect_ou_pas_affect73 = null;

        TigerParser.expr2_return expr274 = null;

        TigerParser.parenthese_ou_accolade_return parenthese_ou_accolade75 = null;



        try {
            // ./albert22u/Tiger.g:75:8: ( lvalue2 affect_ou_pas_affect expr2 | parenthese_ou_accolade )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ./albert22u/Tiger.g:75:10: lvalue2 affect_ou_pas_affect expr2
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lvalue2_in_lvalue380);
                    lvalue272=lvalue2();

                    state._fsp--;

                    adaptor.addChild(root_0, lvalue272.getTree());
                    pushFollow(FOLLOW_affect_ou_pas_affect_in_lvalue382);
                    affect_ou_pas_affect73=affect_ou_pas_affect();

                    state._fsp--;

                    adaptor.addChild(root_0, affect_ou_pas_affect73.getTree());
                    pushFollow(FOLLOW_expr2_in_lvalue384);
                    expr274=expr2();

                    state._fsp--;

                    adaptor.addChild(root_0, expr274.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:76:4: parenthese_ou_accolade
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_parenthese_ou_accolade_in_lvalue389);
                    parenthese_ou_accolade75=parenthese_ou_accolade();

                    state._fsp--;

                    adaptor.addChild(root_0, parenthese_ou_accolade75.getTree());

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
    // $ANTLR end "lvalue"

    public static class lvalue2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lvalue2"
    // ./albert22u/Tiger.g:79:1: lvalue2 : ( id_ou_expr lvalue2 | );
    public final TigerParser.lvalue2_return lvalue2() throws RecognitionException {
        TigerParser.lvalue2_return retval = new TigerParser.lvalue2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TigerParser.id_ou_expr_return id_ou_expr76 = null;

        TigerParser.lvalue2_return lvalue277 = null;



        try {
            // ./albert22u/Tiger.g:79:9: ( id_ou_expr lvalue2 | )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=19 && LA14_0<=20)) ) {
                alt14=1;
            }
            else if ( (LA14_0==EOF||(LA14_0>=STRING && LA14_0<=NEWLINE)||(LA14_0>=10 && LA14_0<=13)||(LA14_0>=15 && LA14_0<=18)||LA14_0==21||(LA14_0>=23 && LA14_0<=29)||(LA14_0>=31 && LA14_0<=40)||(LA14_0>=42 && LA14_0<=46)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ./albert22u/Tiger.g:79:11: id_ou_expr lvalue2
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_ou_expr_in_lvalue2398);
                    id_ou_expr76=id_ou_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, id_ou_expr76.getTree());
                    pushFollow(FOLLOW_lvalue2_in_lvalue2400);
                    lvalue277=lvalue2();

                    state._fsp--;

                    adaptor.addChild(root_0, lvalue277.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:81:1: 
                    {
                    root_0 = (Object)adaptor.nil();

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

    public static class id_ou_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id_ou_expr"
    // ./albert22u/Tiger.g:82:1: id_ou_expr : ( '.' ID | '[' expr ']' );
    public final TigerParser.id_ou_expr_return id_ou_expr() throws RecognitionException {
        TigerParser.id_ou_expr_return retval = new TigerParser.id_ou_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal78=null;
        Token ID79=null;
        Token char_literal80=null;
        Token char_literal82=null;
        TigerParser.expr_return expr81 = null;


        Object char_literal78_tree=null;
        Object ID79_tree=null;
        Object char_literal80_tree=null;
        Object char_literal82_tree=null;

        try {
            // ./albert22u/Tiger.g:83:2: ( '.' ID | '[' expr ']' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            else if ( (LA15_0==20) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ./albert22u/Tiger.g:83:4: '.' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal78=(Token)match(input,19,FOLLOW_19_in_id_ou_expr413); 
                    char_literal78_tree = (Object)adaptor.create(char_literal78);
                    adaptor.addChild(root_0, char_literal78_tree);

                    ID79=(Token)match(input,ID,FOLLOW_ID_in_id_ou_expr415); 
                    ID79_tree = (Object)adaptor.create(ID79);
                    adaptor.addChild(root_0, ID79_tree);


                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:84:4: '[' expr ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal80=(Token)match(input,20,FOLLOW_20_in_id_ou_expr421); 
                    char_literal80_tree = (Object)adaptor.create(char_literal80);
                    adaptor.addChild(root_0, char_literal80_tree);

                    pushFollow(FOLLOW_expr_in_id_ou_expr423);
                    expr81=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr81.getTree());
                    char_literal82=(Token)match(input,21,FOLLOW_21_in_id_ou_expr425); 
                    char_literal82_tree = (Object)adaptor.create(char_literal82);
                    adaptor.addChild(root_0, char_literal82_tree);


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
    // $ANTLR end "id_ou_expr"

    public static class declaration_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration_list"
    // ./albert22u/Tiger.g:86:1: declaration_list : ( declaration declaration_list | );
    public final TigerParser.declaration_list_return declaration_list() throws RecognitionException {
        TigerParser.declaration_list_return retval = new TigerParser.declaration_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TigerParser.declaration_return declaration83 = null;

        TigerParser.declaration_list_return declaration_list84 = null;



        try {
            // ./albert22u/Tiger.g:87:2: ( declaration declaration_list | )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36||(LA16_0>=44 && LA16_0<=45)) ) {
                alt16=1;
            }
            else if ( (LA16_0==38) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ./albert22u/Tiger.g:87:4: declaration declaration_list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_declaration_in_declaration_list435);
                    declaration83=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration83.getTree());
                    pushFollow(FOLLOW_declaration_list_in_declaration_list437);
                    declaration_list84=declaration_list();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration_list84.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:89:1: 
                    {
                    root_0 = (Object)adaptor.nil();

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
    // $ANTLR end "declaration_list"

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // ./albert22u/Tiger.g:90:1: declaration : ( type_declaration | variable_declaration | function_declaration );
    public final TigerParser.declaration_return declaration() throws RecognitionException {
        TigerParser.declaration_return retval = new TigerParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TigerParser.type_declaration_return type_declaration85 = null;

        TigerParser.variable_declaration_return variable_declaration86 = null;

        TigerParser.function_declaration_return function_declaration87 = null;



        try {
            // ./albert22u/Tiger.g:91:2: ( type_declaration | variable_declaration | function_declaration )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt17=1;
                }
                break;
            case 45:
                {
                alt17=2;
                }
                break;
            case 36:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ./albert22u/Tiger.g:91:4: type_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_declaration_in_declaration449);
                    type_declaration85=type_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, type_declaration85.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:92:4: variable_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_declaration_in_declaration454);
                    variable_declaration86=variable_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, variable_declaration86.getTree());

                    }
                    break;
                case 3 :
                    // ./albert22u/Tiger.g:93:4: function_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_declaration_in_declaration459);
                    function_declaration87=function_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, function_declaration87.getTree());

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
    // ./albert22u/Tiger.g:95:1: type_declaration : typeexp type_id '=' type ;
    public final TigerParser.type_declaration_return type_declaration() throws RecognitionException {
        TigerParser.type_declaration_return retval = new TigerParser.type_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal90=null;
        TigerParser.typeexp_return typeexp88 = null;

        TigerParser.type_id_return type_id89 = null;

        TigerParser.type_return type91 = null;


        Object char_literal90_tree=null;

        try {
            // ./albert22u/Tiger.g:96:2: ( typeexp type_id '=' type )
            // ./albert22u/Tiger.g:96:4: typeexp type_id '=' type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeexp_in_type_declaration468);
            typeexp88=typeexp();

            state._fsp--;

            adaptor.addChild(root_0, typeexp88.getTree());
            pushFollow(FOLLOW_type_id_in_type_declaration470);
            type_id89=type_id();

            state._fsp--;

            adaptor.addChild(root_0, type_id89.getTree());
            char_literal90=(Token)match(input,18,FOLLOW_18_in_type_declaration472); 
            char_literal90_tree = (Object)adaptor.create(char_literal90);
            adaptor.addChild(root_0, char_literal90_tree);

            pushFollow(FOLLOW_type_in_type_declaration474);
            type91=type();

            state._fsp--;

            adaptor.addChild(root_0, type91.getTree());

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
    // ./albert22u/Tiger.g:98:1: type : ( type_id | '{' ( type_fields )? '}' | arrayexp ofexp type_id );
    public final TigerParser.type_return type() throws RecognitionException {
        TigerParser.type_return retval = new TigerParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal93=null;
        Token char_literal95=null;
        TigerParser.type_id_return type_id92 = null;

        TigerParser.type_fields_return type_fields94 = null;

        TigerParser.arrayexp_return arrayexp96 = null;

        TigerParser.ofexp_return ofexp97 = null;

        TigerParser.type_id_return type_id98 = null;


        Object char_literal93_tree=null;
        Object char_literal95_tree=null;

        try {
            // ./albert22u/Tiger.g:98:6: ( type_id | '{' ( type_fields )? '}' | arrayexp ofexp type_id )
            int alt19=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt19=1;
                }
                break;
            case 14:
                {
                alt19=2;
                }
                break;
            case 30:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ./albert22u/Tiger.g:98:8: type_id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_id_in_type482);
                    type_id92=type_id();

                    state._fsp--;

                    adaptor.addChild(root_0, type_id92.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:99:4: '{' ( type_fields )? '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal93=(Token)match(input,14,FOLLOW_14_in_type487); 
                    char_literal93_tree = (Object)adaptor.create(char_literal93);
                    adaptor.addChild(root_0, char_literal93_tree);

                    // ./albert22u/Tiger.g:99:8: ( type_fields )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ID) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ./albert22u/Tiger.g:99:8: type_fields
                            {
                            pushFollow(FOLLOW_type_fields_in_type489);
                            type_fields94=type_fields();

                            state._fsp--;

                            adaptor.addChild(root_0, type_fields94.getTree());

                            }
                            break;

                    }

                    char_literal95=(Token)match(input,15,FOLLOW_15_in_type492); 
                    char_literal95_tree = (Object)adaptor.create(char_literal95);
                    adaptor.addChild(root_0, char_literal95_tree);


                    }
                    break;
                case 3 :
                    // ./albert22u/Tiger.g:100:4: arrayexp ofexp type_id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayexp_in_type497);
                    arrayexp96=arrayexp();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayexp96.getTree());
                    pushFollow(FOLLOW_ofexp_in_type499);
                    ofexp97=ofexp();

                    state._fsp--;

                    adaptor.addChild(root_0, ofexp97.getTree());
                    pushFollow(FOLLOW_type_id_in_type501);
                    type_id98=type_id();

                    state._fsp--;

                    adaptor.addChild(root_0, type_id98.getTree());

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

    public static class type_fields_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_fields"
    // ./albert22u/Tiger.g:102:1: type_fields : type_field type_fields2 ;
    public final TigerParser.type_fields_return type_fields() throws RecognitionException {
        TigerParser.type_fields_return retval = new TigerParser.type_fields_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TigerParser.type_field_return type_field99 = null;

        TigerParser.type_fields2_return type_fields2100 = null;



        try {
            // ./albert22u/Tiger.g:103:2: ( type_field type_fields2 )
            // ./albert22u/Tiger.g:103:4: type_field type_fields2
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_field_in_type_fields510);
            type_field99=type_field();

            state._fsp--;

            adaptor.addChild(root_0, type_field99.getTree());
            pushFollow(FOLLOW_type_fields2_in_type_fields512);
            type_fields2100=type_fields2();

            state._fsp--;

            adaptor.addChild(root_0, type_fields2100.getTree());

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
    // ./albert22u/Tiger.g:105:1: type_fields2 : ( ',' type_fields | );
    public final TigerParser.type_fields2_return type_fields2() throws RecognitionException {
        TigerParser.type_fields2_return retval = new TigerParser.type_fields2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal101=null;
        TigerParser.type_fields_return type_fields102 = null;


        Object char_literal101_tree=null;

        try {
            // ./albert22u/Tiger.g:106:2: ( ',' type_fields | )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            else if ( (LA20_0==12||LA20_0==15) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ./albert22u/Tiger.g:106:4: ',' type_fields
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal101=(Token)match(input,17,FOLLOW_17_in_type_fields2521); 
                    char_literal101_tree = (Object)adaptor.create(char_literal101);
                    adaptor.addChild(root_0, char_literal101_tree);

                    pushFollow(FOLLOW_type_fields_in_type_fields2523);
                    type_fields102=type_fields();

                    state._fsp--;

                    adaptor.addChild(root_0, type_fields102.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:108:1: 
                    {
                    root_0 = (Object)adaptor.nil();

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
    // $ANTLR end "type_fields2"

    public static class type_field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_field"
    // ./albert22u/Tiger.g:109:1: type_field : ID ':' type_id ;
    public final TigerParser.type_field_return type_field() throws RecognitionException {
        TigerParser.type_field_return retval = new TigerParser.type_field_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID103=null;
        Token char_literal104=null;
        TigerParser.type_id_return type_id105 = null;


        Object ID103_tree=null;
        Object char_literal104_tree=null;

        try {
            // ./albert22u/Tiger.g:110:2: ( ID ':' type_id )
            // ./albert22u/Tiger.g:110:4: ID ':' type_id
            {
            root_0 = (Object)adaptor.nil();

            ID103=(Token)match(input,ID,FOLLOW_ID_in_type_field535); 
            ID103_tree = (Object)adaptor.create(ID103);
            adaptor.addChild(root_0, ID103_tree);

            char_literal104=(Token)match(input,22,FOLLOW_22_in_type_field537); 
            char_literal104_tree = (Object)adaptor.create(char_literal104);
            adaptor.addChild(root_0, char_literal104_tree);

            pushFollow(FOLLOW_type_id_in_type_field539);
            type_id105=type_id();

            state._fsp--;

            adaptor.addChild(root_0, type_id105.getTree());

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

    public static class variable_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_declaration"
    // ./albert22u/Tiger.g:112:1: variable_declaration : varexp ID type_ou_pas_type ':=' expr ;
    public final TigerParser.variable_declaration_return variable_declaration() throws RecognitionException {
        TigerParser.variable_declaration_return retval = new TigerParser.variable_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID107=null;
        Token string_literal109=null;
        TigerParser.varexp_return varexp106 = null;

        TigerParser.type_ou_pas_type_return type_ou_pas_type108 = null;

        TigerParser.expr_return expr110 = null;


        Object ID107_tree=null;
        Object string_literal109_tree=null;

        try {
            // ./albert22u/Tiger.g:113:2: ( varexp ID type_ou_pas_type ':=' expr )
            // ./albert22u/Tiger.g:113:4: varexp ID type_ou_pas_type ':=' expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varexp_in_variable_declaration549);
            varexp106=varexp();

            state._fsp--;

            adaptor.addChild(root_0, varexp106.getTree());
            ID107=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration551); 
            ID107_tree = (Object)adaptor.create(ID107);
            adaptor.addChild(root_0, ID107_tree);

            pushFollow(FOLLOW_type_ou_pas_type_in_variable_declaration553);
            type_ou_pas_type108=type_ou_pas_type();

            state._fsp--;

            adaptor.addChild(root_0, type_ou_pas_type108.getTree());
            string_literal109=(Token)match(input,13,FOLLOW_13_in_variable_declaration555); 
            string_literal109_tree = (Object)adaptor.create(string_literal109);
            adaptor.addChild(root_0, string_literal109_tree);

            pushFollow(FOLLOW_expr_in_variable_declaration557);
            expr110=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr110.getTree());

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
    // ./albert22u/Tiger.g:115:1: function_declaration : functionexp ID '(' ( type_fields )? ')' type_ou_pas_type '=' expr ;
    public final TigerParser.function_declaration_return function_declaration() throws RecognitionException {
        TigerParser.function_declaration_return retval = new TigerParser.function_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID112=null;
        Token char_literal113=null;
        Token char_literal115=null;
        Token char_literal117=null;
        TigerParser.functionexp_return functionexp111 = null;

        TigerParser.type_fields_return type_fields114 = null;

        TigerParser.type_ou_pas_type_return type_ou_pas_type116 = null;

        TigerParser.expr_return expr118 = null;


        Object ID112_tree=null;
        Object char_literal113_tree=null;
        Object char_literal115_tree=null;
        Object char_literal117_tree=null;

        try {
            // ./albert22u/Tiger.g:116:2: ( functionexp ID '(' ( type_fields )? ')' type_ou_pas_type '=' expr )
            // ./albert22u/Tiger.g:116:4: functionexp ID '(' ( type_fields )? ')' type_ou_pas_type '=' expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_functionexp_in_function_declaration566);
            functionexp111=functionexp();

            state._fsp--;

            adaptor.addChild(root_0, functionexp111.getTree());
            ID112=(Token)match(input,ID,FOLLOW_ID_in_function_declaration568); 
            ID112_tree = (Object)adaptor.create(ID112);
            adaptor.addChild(root_0, ID112_tree);

            char_literal113=(Token)match(input,11,FOLLOW_11_in_function_declaration570); 
            char_literal113_tree = (Object)adaptor.create(char_literal113);
            adaptor.addChild(root_0, char_literal113_tree);

            // ./albert22u/Tiger.g:116:23: ( type_fields )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ./albert22u/Tiger.g:116:23: type_fields
                    {
                    pushFollow(FOLLOW_type_fields_in_function_declaration572);
                    type_fields114=type_fields();

                    state._fsp--;

                    adaptor.addChild(root_0, type_fields114.getTree());

                    }
                    break;

            }

            char_literal115=(Token)match(input,12,FOLLOW_12_in_function_declaration575); 
            char_literal115_tree = (Object)adaptor.create(char_literal115);
            adaptor.addChild(root_0, char_literal115_tree);

            pushFollow(FOLLOW_type_ou_pas_type_in_function_declaration577);
            type_ou_pas_type116=type_ou_pas_type();

            state._fsp--;

            adaptor.addChild(root_0, type_ou_pas_type116.getTree());
            char_literal117=(Token)match(input,18,FOLLOW_18_in_function_declaration579); 
            char_literal117_tree = (Object)adaptor.create(char_literal117);
            adaptor.addChild(root_0, char_literal117_tree);

            pushFollow(FOLLOW_expr_in_function_declaration581);
            expr118=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr118.getTree());

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

    public static class type_ou_pas_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_ou_pas_type"
    // ./albert22u/Tiger.g:118:1: type_ou_pas_type : ( ':' type_id | );
    public final TigerParser.type_ou_pas_type_return type_ou_pas_type() throws RecognitionException {
        TigerParser.type_ou_pas_type_return retval = new TigerParser.type_ou_pas_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal119=null;
        TigerParser.type_id_return type_id120 = null;


        Object char_literal119_tree=null;

        try {
            // ./albert22u/Tiger.g:119:2: ( ':' type_id | )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            else if ( (LA22_0==13||LA22_0==18) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ./albert22u/Tiger.g:119:4: ':' type_id
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal119=(Token)match(input,22,FOLLOW_22_in_type_ou_pas_type590); 
                    char_literal119_tree = (Object)adaptor.create(char_literal119);
                    adaptor.addChild(root_0, char_literal119_tree);

                    pushFollow(FOLLOW_type_id_in_type_ou_pas_type592);
                    type_id120=type_id();

                    state._fsp--;

                    adaptor.addChild(root_0, type_id120.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:121:1: 
                    {
                    root_0 = (Object)adaptor.nil();

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
    // $ANTLR end "type_ou_pas_type"

    public static class binary_operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binary_operator"
    // ./albert22u/Tiger.g:123:1: binary_operator : ( ':=' | condition_or );
    public final TigerParser.binary_operator_return binary_operator() throws RecognitionException {
        TigerParser.binary_operator_return retval = new TigerParser.binary_operator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal121=null;
        TigerParser.condition_or_return condition_or122 = null;


        Object string_literal121_tree=null;

        try {
            // ./albert22u/Tiger.g:124:2: ( ':=' | condition_or )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            else if ( (LA23_0==10||LA23_0==18||(LA23_0>=23 && LA23_0<=29)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ./albert22u/Tiger.g:124:4: ':='
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal121=(Token)match(input,13,FOLLOW_13_in_binary_operator606); 
                    string_literal121_tree = (Object)adaptor.create(string_literal121);
                    adaptor.addChild(root_0, string_literal121_tree);


                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:124:10: condition_or
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_condition_or_in_binary_operator609);
                    condition_or122=condition_or();

                    state._fsp--;

                    adaptor.addChild(root_0, condition_or122.getTree());

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
    // $ANTLR end "binary_operator"

    public static class condition_or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition_or"
    // ./albert22u/Tiger.g:127:1: condition_or : ( '|' | condition_and );
    public final TigerParser.condition_or_return condition_or() throws RecognitionException {
        TigerParser.condition_or_return retval = new TigerParser.condition_or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal123=null;
        TigerParser.condition_and_return condition_and124 = null;


        Object char_literal123_tree=null;

        try {
            // ./albert22u/Tiger.g:128:2: ( '|' | condition_and )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            else if ( (LA24_0==10||LA24_0==18||(LA24_0>=24 && LA24_0<=29)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ./albert22u/Tiger.g:128:4: '|'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal123=(Token)match(input,23,FOLLOW_23_in_condition_or619); 
                    char_literal123_tree = (Object)adaptor.create(char_literal123);
                    adaptor.addChild(root_0, char_literal123_tree);


                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:128:10: condition_and
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_condition_and_in_condition_or623);
                    condition_and124=condition_and();

                    state._fsp--;

                    adaptor.addChild(root_0, condition_and124.getTree());

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
    // $ANTLR end "condition_or"

    public static class condition_and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition_and"
    // ./albert22u/Tiger.g:131:1: condition_and : ( '&' | comparateur );
    public final TigerParser.condition_and_return condition_and() throws RecognitionException {
        TigerParser.condition_and_return retval = new TigerParser.condition_and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal125=null;
        TigerParser.comparateur_return comparateur126 = null;


        Object char_literal125_tree=null;

        try {
            // ./albert22u/Tiger.g:132:2: ( '&' | comparateur )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            else if ( (LA25_0==10||LA25_0==18||(LA25_0>=25 && LA25_0<=29)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ./albert22u/Tiger.g:132:4: '&'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal125=(Token)match(input,24,FOLLOW_24_in_condition_and634); 
                    char_literal125_tree = (Object)adaptor.create(char_literal125);
                    adaptor.addChild(root_0, char_literal125_tree);


                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:132:9: comparateur
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_comparateur_in_condition_and637);
                    comparateur126=comparateur();

                    state._fsp--;

                    adaptor.addChild(root_0, comparateur126.getTree());

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
    // $ANTLR end "condition_and"

    public static class comparateur_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparateur"
    // ./albert22u/Tiger.g:135:1: comparateur : ( '<' r1 | '>' r2 | '=' | addsous );
    public final TigerParser.comparateur_return comparateur() throws RecognitionException {
        TigerParser.comparateur_return retval = new TigerParser.comparateur_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal127=null;
        Token char_literal129=null;
        Token char_literal131=null;
        TigerParser.r1_return r1128 = null;

        TigerParser.r2_return r2130 = null;

        TigerParser.addsous_return addsous132 = null;


        Object char_literal127_tree=null;
        Object char_literal129_tree=null;
        Object char_literal131_tree=null;

        try {
            // ./albert22u/Tiger.g:136:2: ( '<' r1 | '>' r2 | '=' | addsous )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt26=1;
                }
                break;
            case 26:
                {
                alt26=2;
                }
                break;
            case 18:
                {
                alt26=3;
                }
                break;
            case 10:
            case 27:
            case 28:
            case 29:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ./albert22u/Tiger.g:136:4: '<' r1
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal127=(Token)match(input,25,FOLLOW_25_in_comparateur647); 
                    char_literal127_tree = (Object)adaptor.create(char_literal127);
                    adaptor.addChild(root_0, char_literal127_tree);

                    pushFollow(FOLLOW_r1_in_comparateur649);
                    r1128=r1();

                    state._fsp--;

                    adaptor.addChild(root_0, r1128.getTree());

                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:136:13: '>' r2
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal129=(Token)match(input,26,FOLLOW_26_in_comparateur653); 
                    char_literal129_tree = (Object)adaptor.create(char_literal129);
                    adaptor.addChild(root_0, char_literal129_tree);

                    pushFollow(FOLLOW_r2_in_comparateur655);
                    r2130=r2();

                    state._fsp--;

                    adaptor.addChild(root_0, r2130.getTree());

                    }
                    break;
                case 3 :
                    // ./albert22u/Tiger.g:136:22: '='
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal131=(Token)match(input,18,FOLLOW_18_in_comparateur659); 
                    char_literal131_tree = (Object)adaptor.create(char_literal131);
                    adaptor.addChild(root_0, char_literal131_tree);


                    }
                    break;
                case 4 :
                    // ./albert22u/Tiger.g:136:26: addsous
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_addsous_in_comparateur661);
                    addsous132=addsous();

                    state._fsp--;

                    adaptor.addChild(root_0, addsous132.getTree());

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
    // $ANTLR end "comparateur"

    public static class r1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "r1"
    // ./albert22u/Tiger.g:139:1: r1 : ( '>' | '=' | );
    public final TigerParser.r1_return r1() throws RecognitionException {
        TigerParser.r1_return retval = new TigerParser.r1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal133=null;
        Token char_literal134=null;

        Object char_literal133_tree=null;
        Object char_literal134_tree=null;

        try {
            // ./albert22u/Tiger.g:140:2: ( '>' | '=' | )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt27=1;
                }
                break;
            case 18:
                {
                alt27=2;
                }
                break;
            case STRING:
            case INT:
            case ID:
            case NEWLINE:
            case 10:
            case 11:
            case 31:
            case 35:
            case 36:
            case 37:
            case 39:
            case 40:
            case 44:
            case 45:
            case 46:
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
                    // ./albert22u/Tiger.g:140:5: '>'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal133=(Token)match(input,26,FOLLOW_26_in_r1674); 
                    char_literal133_tree = (Object)adaptor.create(char_literal133);
                    adaptor.addChild(root_0, char_literal133_tree);


                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:140:10: '='
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal134=(Token)match(input,18,FOLLOW_18_in_r1677); 
                    char_literal134_tree = (Object)adaptor.create(char_literal134);
                    adaptor.addChild(root_0, char_literal134_tree);


                    }
                    break;
                case 3 :
                    // ./albert22u/Tiger.g:140:15: 
                    {
                    root_0 = (Object)adaptor.nil();

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
    // $ANTLR end "r1"

    public static class r2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "r2"
    // ./albert22u/Tiger.g:142:1: r2 : ( '=' | );
    public final TigerParser.r2_return r2() throws RecognitionException {
        TigerParser.r2_return retval = new TigerParser.r2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal135=null;

        Object char_literal135_tree=null;

        try {
            // ./albert22u/Tiger.g:143:2: ( '=' | )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=STRING && LA28_0<=NEWLINE)||(LA28_0>=10 && LA28_0<=11)||LA28_0==31||(LA28_0>=35 && LA28_0<=37)||(LA28_0>=39 && LA28_0<=40)||(LA28_0>=44 && LA28_0<=46)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ./albert22u/Tiger.g:143:4: '='
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal135=(Token)match(input,18,FOLLOW_18_in_r2689); 
                    char_literal135_tree = (Object)adaptor.create(char_literal135);
                    adaptor.addChild(root_0, char_literal135_tree);


                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:143:8: 
                    {
                    root_0 = (Object)adaptor.nil();

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
    // $ANTLR end "r2"

    public static class addsous_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addsous"
    // ./albert22u/Tiger.g:145:1: addsous : ( '+' | '-' | multidiv );
    public final TigerParser.addsous_return addsous() throws RecognitionException {
        TigerParser.addsous_return retval = new TigerParser.addsous_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal136=null;
        Token char_literal137=null;
        TigerParser.multidiv_return multidiv138 = null;


        Object char_literal136_tree=null;
        Object char_literal137_tree=null;

        try {
            // ./albert22u/Tiger.g:146:2: ( '+' | '-' | multidiv )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt29=1;
                }
                break;
            case 10:
                {
                alt29=2;
                }
                break;
            case 28:
            case 29:
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
                    // ./albert22u/Tiger.g:146:4: '+'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal136=(Token)match(input,27,FOLLOW_27_in_addsous700); 
                    char_literal136_tree = (Object)adaptor.create(char_literal136);
                    adaptor.addChild(root_0, char_literal136_tree);


                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:146:8: '-'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal137=(Token)match(input,10,FOLLOW_10_in_addsous702); 
                    char_literal137_tree = (Object)adaptor.create(char_literal137);
                    adaptor.addChild(root_0, char_literal137_tree);


                    }
                    break;
                case 3 :
                    // ./albert22u/Tiger.g:146:12: multidiv
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_multidiv_in_addsous704);
                    multidiv138=multidiv();

                    state._fsp--;

                    adaptor.addChild(root_0, multidiv138.getTree());

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
    // $ANTLR end "addsous"

    public static class multidiv_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multidiv"
    // ./albert22u/Tiger.g:149:1: multidiv : ( '*' | div );
    public final TigerParser.multidiv_return multidiv() throws RecognitionException {
        TigerParser.multidiv_return retval = new TigerParser.multidiv_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal139=null;
        TigerParser.div_return div140 = null;


        Object char_literal139_tree=null;

        try {
            // ./albert22u/Tiger.g:150:2: ( '*' | div )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            else if ( (LA30_0==29) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ./albert22u/Tiger.g:150:4: '*'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal139=(Token)match(input,28,FOLLOW_28_in_multidiv714); 
                    char_literal139_tree = (Object)adaptor.create(char_literal139);
                    adaptor.addChild(root_0, char_literal139_tree);


                    }
                    break;
                case 2 :
                    // ./albert22u/Tiger.g:150:8: div
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_div_in_multidiv716);
                    div140=div();

                    state._fsp--;

                    adaptor.addChild(root_0, div140.getTree());

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
    // $ANTLR end "multidiv"

    public static class div_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "div"
    // ./albert22u/Tiger.g:153:1: div : '/' ;
    public final TigerParser.div_return div() throws RecognitionException {
        TigerParser.div_return retval = new TigerParser.div_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal141=null;

        Object char_literal141_tree=null;

        try {
            // ./albert22u/Tiger.g:153:5: ( '/' )
            // ./albert22u/Tiger.g:153:7: '/'
            {
            root_0 = (Object)adaptor.nil();

            char_literal141=(Token)match(input,29,FOLLOW_29_in_div725); 
            char_literal141_tree = (Object)adaptor.create(char_literal141);
            adaptor.addChild(root_0, char_literal141_tree);


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
    // $ANTLR end "div"

    public static class type_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_id"
    // ./albert22u/Tiger.g:155:1: type_id : ID ;
    public final TigerParser.type_id_return type_id() throws RecognitionException {
        TigerParser.type_id_return retval = new TigerParser.type_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID142=null;

        Object ID142_tree=null;

        try {
            // ./albert22u/Tiger.g:155:9: ( ID )
            // ./albert22u/Tiger.g:155:11: ID
            {
            root_0 = (Object)adaptor.nil();

            ID142=(Token)match(input,ID,FOLLOW_ID_in_type_id733); 
            ID142_tree = (Object)adaptor.create(ID142);
            adaptor.addChild(root_0, ID142_tree);


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
    // ./albert22u/Tiger.g:158:1: arrayexp : 'array' ;
    public final TigerParser.arrayexp_return arrayexp() throws RecognitionException {
        TigerParser.arrayexp_return retval = new TigerParser.arrayexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal143=null;

        Object string_literal143_tree=null;

        try {
            // ./albert22u/Tiger.g:158:10: ( 'array' )
            // ./albert22u/Tiger.g:158:12: 'array'
            {
            root_0 = (Object)adaptor.nil();

            string_literal143=(Token)match(input,30,FOLLOW_30_in_arrayexp742); 
            string_literal143_tree = (Object)adaptor.create(string_literal143);
            adaptor.addChild(root_0, string_literal143_tree);


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
    // ./albert22u/Tiger.g:159:1: breakexp : 'break' ;
    public final TigerParser.breakexp_return breakexp() throws RecognitionException {
        TigerParser.breakexp_return retval = new TigerParser.breakexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal144=null;

        Object string_literal144_tree=null;

        try {
            // ./albert22u/Tiger.g:159:10: ( 'break' )
            // ./albert22u/Tiger.g:159:12: 'break'
            {
            root_0 = (Object)adaptor.nil();

            string_literal144=(Token)match(input,31,FOLLOW_31_in_breakexp751); 
            string_literal144_tree = (Object)adaptor.create(string_literal144);
            adaptor.addChild(root_0, string_literal144_tree);


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
    // ./albert22u/Tiger.g:160:1: doexp : 'do' ;
    public final TigerParser.doexp_return doexp() throws RecognitionException {
        TigerParser.doexp_return retval = new TigerParser.doexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal145=null;

        Object string_literal145_tree=null;

        try {
            // ./albert22u/Tiger.g:160:8: ( 'do' )
            // ./albert22u/Tiger.g:160:10: 'do'
            {
            root_0 = (Object)adaptor.nil();

            string_literal145=(Token)match(input,32,FOLLOW_32_in_doexp760); 
            string_literal145_tree = (Object)adaptor.create(string_literal145);
            adaptor.addChild(root_0, string_literal145_tree);


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
    // ./albert22u/Tiger.g:161:1: elseexp : 'else' ;
    public final TigerParser.elseexp_return elseexp() throws RecognitionException {
        TigerParser.elseexp_return retval = new TigerParser.elseexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal146=null;

        Object string_literal146_tree=null;

        try {
            // ./albert22u/Tiger.g:161:10: ( 'else' )
            // ./albert22u/Tiger.g:161:12: 'else'
            {
            root_0 = (Object)adaptor.nil();

            string_literal146=(Token)match(input,33,FOLLOW_33_in_elseexp770); 
            string_literal146_tree = (Object)adaptor.create(string_literal146);
            adaptor.addChild(root_0, string_literal146_tree);


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
    // ./albert22u/Tiger.g:162:1: endexp : 'end' ;
    public final TigerParser.endexp_return endexp() throws RecognitionException {
        TigerParser.endexp_return retval = new TigerParser.endexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal147=null;

        Object string_literal147_tree=null;

        try {
            // ./albert22u/Tiger.g:162:9: ( 'end' )
            // ./albert22u/Tiger.g:162:11: 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal147=(Token)match(input,34,FOLLOW_34_in_endexp781); 
            string_literal147_tree = (Object)adaptor.create(string_literal147);
            adaptor.addChild(root_0, string_literal147_tree);


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
    // ./albert22u/Tiger.g:163:1: forexp : 'for' ;
    public final TigerParser.forexp_return forexp() throws RecognitionException {
        TigerParser.forexp_return retval = new TigerParser.forexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal148=null;

        Object string_literal148_tree=null;

        try {
            // ./albert22u/Tiger.g:163:9: ( 'for' )
            // ./albert22u/Tiger.g:163:11: 'for'
            {
            root_0 = (Object)adaptor.nil();

            string_literal148=(Token)match(input,35,FOLLOW_35_in_forexp791); 
            string_literal148_tree = (Object)adaptor.create(string_literal148);
            adaptor.addChild(root_0, string_literal148_tree);


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
    // ./albert22u/Tiger.g:164:1: functionexp : 'function' ;
    public final TigerParser.functionexp_return functionexp() throws RecognitionException {
        TigerParser.functionexp_return retval = new TigerParser.functionexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal149=null;

        Object string_literal149_tree=null;

        try {
            // ./albert22u/Tiger.g:164:13: ( 'function' )
            // ./albert22u/Tiger.g:164:15: 'function'
            {
            root_0 = (Object)adaptor.nil();

            string_literal149=(Token)match(input,36,FOLLOW_36_in_functionexp800); 
            string_literal149_tree = (Object)adaptor.create(string_literal149);
            adaptor.addChild(root_0, string_literal149_tree);


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
    // ./albert22u/Tiger.g:165:1: ifexp : 'if' ;
    public final TigerParser.ifexp_return ifexp() throws RecognitionException {
        TigerParser.ifexp_return retval = new TigerParser.ifexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal150=null;

        Object string_literal150_tree=null;

        try {
            // ./albert22u/Tiger.g:165:7: ( 'if' )
            // ./albert22u/Tiger.g:165:9: 'if'
            {
            root_0 = (Object)adaptor.nil();

            string_literal150=(Token)match(input,37,FOLLOW_37_in_ifexp808); 
            string_literal150_tree = (Object)adaptor.create(string_literal150);
            adaptor.addChild(root_0, string_literal150_tree);


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
    // ./albert22u/Tiger.g:166:1: inexp : 'in' ;
    public final TigerParser.inexp_return inexp() throws RecognitionException {
        TigerParser.inexp_return retval = new TigerParser.inexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal151=null;

        Object string_literal151_tree=null;

        try {
            // ./albert22u/Tiger.g:166:7: ( 'in' )
            // ./albert22u/Tiger.g:166:9: 'in'
            {
            root_0 = (Object)adaptor.nil();

            string_literal151=(Token)match(input,38,FOLLOW_38_in_inexp817); 
            string_literal151_tree = (Object)adaptor.create(string_literal151);
            adaptor.addChild(root_0, string_literal151_tree);


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
    // ./albert22u/Tiger.g:167:1: nilexp : 'nil' ;
    public final TigerParser.nilexp_return nilexp() throws RecognitionException {
        TigerParser.nilexp_return retval = new TigerParser.nilexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal152=null;

        Object string_literal152_tree=null;

        try {
            // ./albert22u/Tiger.g:167:8: ( 'nil' )
            // ./albert22u/Tiger.g:167:10: 'nil'
            {
            root_0 = (Object)adaptor.nil();

            string_literal152=(Token)match(input,39,FOLLOW_39_in_nilexp826); 
            string_literal152_tree = (Object)adaptor.create(string_literal152);
            adaptor.addChild(root_0, string_literal152_tree);


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
    // ./albert22u/Tiger.g:168:1: letexp : 'let' ;
    public final TigerParser.letexp_return letexp() throws RecognitionException {
        TigerParser.letexp_return retval = new TigerParser.letexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal153=null;

        Object string_literal153_tree=null;

        try {
            // ./albert22u/Tiger.g:168:8: ( 'let' )
            // ./albert22u/Tiger.g:168:10: 'let'
            {
            root_0 = (Object)adaptor.nil();

            string_literal153=(Token)match(input,40,FOLLOW_40_in_letexp835); 
            string_literal153_tree = (Object)adaptor.create(string_literal153);
            adaptor.addChild(root_0, string_literal153_tree);


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
    // ./albert22u/Tiger.g:169:1: ofexp : 'of' ;
    public final TigerParser.ofexp_return ofexp() throws RecognitionException {
        TigerParser.ofexp_return retval = new TigerParser.ofexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal154=null;

        Object string_literal154_tree=null;

        try {
            // ./albert22u/Tiger.g:169:7: ( 'of' )
            // ./albert22u/Tiger.g:169:9: 'of'
            {
            root_0 = (Object)adaptor.nil();

            string_literal154=(Token)match(input,41,FOLLOW_41_in_ofexp844); 
            string_literal154_tree = (Object)adaptor.create(string_literal154);
            adaptor.addChild(root_0, string_literal154_tree);


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
    // ./albert22u/Tiger.g:170:1: thenexp : 'then' ;
    public final TigerParser.thenexp_return thenexp() throws RecognitionException {
        TigerParser.thenexp_return retval = new TigerParser.thenexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal155=null;

        Object string_literal155_tree=null;

        try {
            // ./albert22u/Tiger.g:170:9: ( 'then' )
            // ./albert22u/Tiger.g:170:11: 'then'
            {
            root_0 = (Object)adaptor.nil();

            string_literal155=(Token)match(input,42,FOLLOW_42_in_thenexp853); 
            string_literal155_tree = (Object)adaptor.create(string_literal155);
            adaptor.addChild(root_0, string_literal155_tree);


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
    // ./albert22u/Tiger.g:171:1: toexp : 'to' ;
    public final TigerParser.toexp_return toexp() throws RecognitionException {
        TigerParser.toexp_return retval = new TigerParser.toexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal156=null;

        Object string_literal156_tree=null;

        try {
            // ./albert22u/Tiger.g:171:7: ( 'to' )
            // ./albert22u/Tiger.g:171:9: 'to'
            {
            root_0 = (Object)adaptor.nil();

            string_literal156=(Token)match(input,43,FOLLOW_43_in_toexp861); 
            string_literal156_tree = (Object)adaptor.create(string_literal156);
            adaptor.addChild(root_0, string_literal156_tree);


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
    // ./albert22u/Tiger.g:172:1: typeexp : 'type' ;
    public final TigerParser.typeexp_return typeexp() throws RecognitionException {
        TigerParser.typeexp_return retval = new TigerParser.typeexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal157=null;

        Object string_literal157_tree=null;

        try {
            // ./albert22u/Tiger.g:172:9: ( 'type' )
            // ./albert22u/Tiger.g:172:11: 'type'
            {
            root_0 = (Object)adaptor.nil();

            string_literal157=(Token)match(input,44,FOLLOW_44_in_typeexp870); 
            string_literal157_tree = (Object)adaptor.create(string_literal157);
            adaptor.addChild(root_0, string_literal157_tree);


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
    // ./albert22u/Tiger.g:173:1: varexp : 'var' ;
    public final TigerParser.varexp_return varexp() throws RecognitionException {
        TigerParser.varexp_return retval = new TigerParser.varexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal158=null;

        Object string_literal158_tree=null;

        try {
            // ./albert22u/Tiger.g:173:8: ( 'var' )
            // ./albert22u/Tiger.g:173:10: 'var'
            {
            root_0 = (Object)adaptor.nil();

            string_literal158=(Token)match(input,45,FOLLOW_45_in_varexp878); 
            string_literal158_tree = (Object)adaptor.create(string_literal158);
            adaptor.addChild(root_0, string_literal158_tree);


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
    // ./albert22u/Tiger.g:174:1: whileexp : 'while' ;
    public final TigerParser.whileexp_return whileexp() throws RecognitionException {
        TigerParser.whileexp_return retval = new TigerParser.whileexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal159=null;

        Object string_literal159_tree=null;

        try {
            // ./albert22u/Tiger.g:174:10: ( 'while' )
            // ./albert22u/Tiger.g:174:12: 'while'
            {
            root_0 = (Object)adaptor.nil();

            string_literal159=(Token)match(input,46,FOLLOW_46_in_whileexp887); 
            string_literal159_tree = (Object)adaptor.create(string_literal159);
            adaptor.addChild(root_0, string_literal159_tree);


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
    // ./albert22u/Tiger.g:175:1: typedefexp : 'typedef' ;
    public final TigerParser.typedefexp_return typedefexp() throws RecognitionException {
        TigerParser.typedefexp_return retval = new TigerParser.typedefexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal160=null;

        Object string_literal160_tree=null;

        try {
            // ./albert22u/Tiger.g:175:13: ( 'typedef' )
            // ./albert22u/Tiger.g:175:15: 'typedef'
            {
            root_0 = (Object)adaptor.nil();

            string_literal160=(Token)match(input,47,FOLLOW_47_in_typedefexp896); 
            string_literal160_tree = (Object)adaptor.create(string_literal160);
            adaptor.addChild(root_0, string_literal160_tree);


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
    // ./albert22u/Tiger.g:176:1: blockexp : 'block' ;
    public final TigerParser.blockexp_return blockexp() throws RecognitionException {
        TigerParser.blockexp_return retval = new TigerParser.blockexp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal161=null;

        Object string_literal161_tree=null;

        try {
            // ./albert22u/Tiger.g:176:11: ( 'block' )
            // ./albert22u/Tiger.g:176:13: 'block'
            {
            root_0 = (Object)adaptor.nil();

            string_literal161=(Token)match(input,48,FOLLOW_48_in_blockexp906); 
            string_literal161_tree = (Object)adaptor.create(string_literal161);
            adaptor.addChild(root_0, string_literal161_tree);


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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA1_eotS =
        "\45\uffff";
    static final String DFA1_eofS =
        "\1\13\44\uffff";
    static final String DFA1_minS =
        "\1\4\44\uffff";
    static final String DFA1_maxS =
        "\1\56\44\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\12\1\1\2\31\uffff";
    static final String DFA1_specialS =
        "\45\uffff}>";
    static final String[] DFA1_transitionS = {
            "\4\13\2\uffff\1\10\2\13\1\1\1\uffff\3\13\1\6\2\uffff\1\13\1"+
            "\uffff\1\2\1\3\1\4\1\5\1\7\1\11\1\12\1\uffff\12\13\1\uffff\5"+
            "\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "21:1: expr2 : ( binary_operator expr expr2 | );";
        }
    }
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\16\uffff";
    static final String DFA4_minS =
        "\1\4\15\uffff";
    static final String DFA4_maxS =
        "\1\56\15\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA4_specialS =
        "\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\5\1\15\2\uffff\1\4\1\6\23\uffff\1\12\3\uffff\1\11"+
            "\1\14\1\7\1\uffff\1\3\1\13\3\uffff\2\14\1\10",
            "",
            "",
            "",
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "24:1: expr : ( STRING expr2 | INT expr2 | nilexp expr2 | '-' expr expr2 | ID lvalue | '(' ( expr_seq )? ')' expr2 | ifexp COND= expr thenexp DO= expr ELSE= else_ou_pas_else expr2 | whileexp expr doexp expr expr2 | forexp ID ':=' INIT= expr toexp DEST= expr doexp NEWLINE boucle= expr SUITE= expr2 | breakexp expr2 | letexp declaration_list inexp ( expr_seq )* endexp expr2 | declaration expr2 | NEWLINE expr );";
        }
    }
    static final String DFA8_eotS =
        "\45\uffff";
    static final String DFA8_eofS =
        "\1\2\44\uffff";
    static final String DFA8_minS =
        "\1\4\44\uffff";
    static final String DFA8_maxS =
        "\1\56\44\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\42\uffff";
    static final String DFA8_specialS =
        "\45\uffff}>";
    static final String[] DFA8_transitionS = {
            "\4\2\2\uffff\4\2\1\uffff\4\2\2\uffff\1\2\1\uffff\7\2\1\uffff"+
            "\2\2\1\1\7\2\1\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "46:1: else_ou_pas_else : ( elseexp expr | );";
        }
    }
    static final String DFA9_eotS =
        "\45\uffff";
    static final String DFA9_eofS =
        "\1\2\44\uffff";
    static final String DFA9_minS =
        "\1\4\44\uffff";
    static final String DFA9_maxS =
        "\1\56\44\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\42\uffff";
    static final String DFA9_specialS =
        "\45\uffff}>";
    static final String[] DFA9_transitionS = {
            "\4\2\2\uffff\3\2\1\1\1\uffff\4\2\2\uffff\1\2\1\uffff\7\2\1\uffff"+
            "\12\2\1\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "51:1: affect_ou_pas_affect : ( ':=' expr | );";
        }
    }
    static final String DFA13_eotS =
        "\50\uffff";
    static final String DFA13_eofS =
        "\1\1\47\uffff";
    static final String DFA13_minS =
        "\1\4\47\uffff";
    static final String DFA13_maxS =
        "\1\56\47\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\27\uffff\1\1\15\uffff\1\2";
    static final String DFA13_specialS =
        "\50\uffff}>";
    static final String[] DFA13_transitionS = {
            "\4\1\2\uffff\1\1\1\31\2\1\1\47\7\1\1\uffff\7\1\1\uffff\12\1"+
            "\1\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "75:1: lvalue : ( lvalue2 affect_ou_pas_affect expr2 | parenthese_ou_accolade );";
        }
    }
 

    public static final BitSet FOLLOW_expr_in_tiger42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operator_in_expr253 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_expr255 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_expr257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr69 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_expr71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr76 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_expr78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nilexp_in_expr83 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_expr85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_expr90 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_expr92 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_expr94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr99 = new BitSet(new long[]{0x000000003F9C6C00L});
    public static final BitSet FOLLOW_lvalue_in_expr101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_expr106 = new BitSet(new long[]{0x000071B880001CF0L});
    public static final BitSet FOLLOW_expr_seq_in_expr108 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_expr111 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_expr113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifexp_in_expr118 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_expr122 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_thenexp_in_expr124 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_expr128 = new BitSet(new long[]{0x000000023F842400L});
    public static final BitSet FOLLOW_else_ou_pas_else_in_expr132 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_expr134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileexp_in_expr140 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_expr142 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_doexp_in_expr144 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_expr146 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_expr148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forexp_in_expr153 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_expr155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_expr157 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_expr161 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_toexp_in_expr163 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_expr169 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_doexp_in_expr171 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_expr173 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_expr179 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_expr185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakexp_in_expr191 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_expr193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letexp_in_expr198 = new BitSet(new long[]{0x0000305000000000L});
    public static final BitSet FOLLOW_declaration_list_in_expr200 = new BitSet(new long[]{0x0000305000000000L});
    public static final BitSet FOLLOW_inexp_in_expr202 = new BitSet(new long[]{0x000071BC80000CF0L});
    public static final BitSet FOLLOW_expr_seq_in_expr204 = new BitSet(new long[]{0x000071BC80000CF0L});
    public static final BitSet FOLLOW_endexp_in_expr207 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_expr209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_expr215 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_expr217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_expr222 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_expr224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parenthese_ou_accolade239 = new BitSet(new long[]{0x000071B880001CF0L});
    public static final BitSet FOLLOW_expr_list_in_parenthese_ou_accolade241 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parenthese_ou_accolade244 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_parenthese_ou_accolade246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parenthese_ou_accolade251 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_field_list_in_parenthese_ou_accolade253 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parenthese_ou_accolade256 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_parenthese_ou_accolade258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseexp_in_else_ou_pas_else270 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_else_ou_pas_else272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_affect_ou_pas_affect287 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_affect_ou_pas_affect289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_seq302 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_expr_seq2_in_expr_seq304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_expr_seq2313 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_seq_in_expr_seq2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list326 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_expr_list2_in_expr_list328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_expr_list2337 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_list_in_expr_list2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_field_list351 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_field_list353 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_field_list355 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_field_list2_in_field_list357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_field_list2367 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_field_list_in_field_list2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue2_in_lvalue380 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_affect_ou_pas_affect_in_lvalue382 = new BitSet(new long[]{0x000000003F842400L});
    public static final BitSet FOLLOW_expr2_in_lvalue384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthese_ou_accolade_in_lvalue389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_ou_expr_in_lvalue2398 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_lvalue2_in_lvalue2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_id_ou_expr413 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_id_ou_expr415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_id_ou_expr421 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_id_ou_expr423 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_id_ou_expr425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declaration_list435 = new BitSet(new long[]{0x0000301000000000L});
    public static final BitSet FOLLOW_declaration_list_in_declaration_list437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_declaration449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_declaration454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_in_declaration459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeexp_in_type_declaration468 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_type_id_in_type_declaration470 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_type_declaration472 = new BitSet(new long[]{0x0000000040004040L});
    public static final BitSet FOLLOW_type_in_type_declaration474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_id_in_type482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_type487 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_type_fields_in_type489 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_type492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayexp_in_type497 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ofexp_in_type499 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_type_id_in_type501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_field_in_type_fields510 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_type_fields2_in_type_fields512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_type_fields2521 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_type_fields_in_type_fields2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_field535 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_type_field537 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_type_id_in_type_field539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varexp_in_variable_declaration549 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_variable_declaration551 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_type_ou_pas_type_in_variable_declaration553 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_variable_declaration555 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_variable_declaration557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionexp_in_function_declaration566 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_function_declaration568 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_function_declaration570 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_type_fields_in_function_declaration572 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_function_declaration575 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_type_ou_pas_type_in_function_declaration577 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_function_declaration579 = new BitSet(new long[]{0x000071B880000CF0L});
    public static final BitSet FOLLOW_expr_in_function_declaration581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_type_ou_pas_type590 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_type_id_in_type_ou_pas_type592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_binary_operator606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_or_in_binary_operator609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_condition_or619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_and_in_condition_or623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_condition_and634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparateur_in_condition_and637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_comparateur647 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_r1_in_comparateur649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_comparateur653 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_r2_in_comparateur655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_comparateur659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addsous_in_comparateur661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_r1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_r1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_r2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_addsous700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_addsous702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multidiv_in_addsous704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_multidiv714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_div_in_multidiv716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_div725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_id733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_arrayexp742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_breakexp751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_doexp760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_elseexp770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_endexp781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_forexp791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_functionexp800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ifexp808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_inexp817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_nilexp826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_letexp835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ofexp844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_thenexp853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_toexp861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_typeexp870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_varexp878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_whileexp887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_typedefexp896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_blockexp906 = new BitSet(new long[]{0x0000000000000002L});

}