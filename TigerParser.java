// $ANTLR 3.3 Nov 30, 2010 12:50:56 Tiger.g 2016-02-12 16:20:40

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TigerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "INT", "ID", "NEWLINE", "WS", "COMMENT", "'-'", "'('", "')'", "':='", "'{'", "'}'", "';'", "','", "'='", "'.'", "'['", "']'", "':'", "'<'", "'+'", "'<='", "'>'", "'>='", "'<>'", "'!='", "'&'", "'*'", "'/'", "'|'", "'array'", "'break'", "'do'", "'else'", "'end'", "'for'", "'function'", "'if'", "'in'", "'let'", "'nil'", "'of'", "'then'", "'to'", "'type'", "'var'", "'while'", "'typedef'"
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
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
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
        

    public String[] getTokenNames() { return TigerParser.tokenNames; }
    public String getGrammarFileName() { return "Tiger.g"; }


    /** Map variable name to Integer object holding value */
    HashMap<String,Integer>  memory = new HashMap<String,Integer>();



    // $ANTLR start "tiger"
    // Tiger.g:16:1: tiger : expr ;
    public final void tiger() throws RecognitionException {
        try {
            // Tiger.g:16:7: ( expr )
            // Tiger.g:16:9: expr
            {
            pushFollow(FOLLOW_expr_in_tiger32);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "tiger"


    // $ANTLR start "expr"
    // Tiger.g:18:1: expr : ( STRING expr2 | INT expr2 | nilexp expr2 | '-' expr expr2 | ID lvalue | '(' ( expr_seq )? ')' expr2 | ifexp expr thenexp expr else_ou_pas_else expr2 | whileexp expr doexp expr expr2 | forexp ID ':=' expr toexp expr doexp expr expr2 | breakexp expr2 | letexp declaration_list inexp ( expr_seq )* endexp expr2 | declaration expr2 );
    public final void expr() throws RecognitionException {
        try {
            // Tiger.g:18:6: ( STRING expr2 | INT expr2 | nilexp expr2 | '-' expr expr2 | ID lvalue | '(' ( expr_seq )? ')' expr2 | ifexp expr thenexp expr else_ou_pas_else expr2 | whileexp expr doexp expr expr2 | forexp ID ':=' expr toexp expr doexp expr expr2 | breakexp expr2 | letexp declaration_list inexp ( expr_seq )* endexp expr2 | declaration expr2 )
            int alt3=12;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // Tiger.g:18:8: STRING expr2
                    {
                    match(input,STRING,FOLLOW_STRING_in_expr40); 
                    pushFollow(FOLLOW_expr2_in_expr42);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:19:4: INT expr2
                    {
                    match(input,INT,FOLLOW_INT_in_expr47); 
                    pushFollow(FOLLOW_expr2_in_expr49);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Tiger.g:20:4: nilexp expr2
                    {
                    pushFollow(FOLLOW_nilexp_in_expr54);
                    nilexp();

                    state._fsp--;

                    pushFollow(FOLLOW_expr2_in_expr56);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // Tiger.g:21:4: '-' expr expr2
                    {
                    match(input,10,FOLLOW_10_in_expr61); 
                    pushFollow(FOLLOW_expr_in_expr63);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr2_in_expr65);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // Tiger.g:22:4: ID lvalue
                    {
                    match(input,ID,FOLLOW_ID_in_expr70); 
                    pushFollow(FOLLOW_lvalue_in_expr72);
                    lvalue();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // Tiger.g:23:4: '(' ( expr_seq )? ')' expr2
                    {
                    match(input,11,FOLLOW_11_in_expr77); 
                    // Tiger.g:23:8: ( expr_seq )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=STRING && LA1_0<=ID)||(LA1_0>=10 && LA1_0<=11)||LA1_0==35||(LA1_0>=39 && LA1_0<=41)||(LA1_0>=43 && LA1_0<=44)||(LA1_0>=48 && LA1_0<=50)) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // Tiger.g:23:8: expr_seq
                            {
                            pushFollow(FOLLOW_expr_seq_in_expr79);
                            expr_seq();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_expr82); 
                    pushFollow(FOLLOW_expr2_in_expr84);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // Tiger.g:24:4: ifexp expr thenexp expr else_ou_pas_else expr2
                    {
                    pushFollow(FOLLOW_ifexp_in_expr89);
                    ifexp();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr91);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_thenexp_in_expr93);
                    thenexp();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr95);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_else_ou_pas_else_in_expr97);
                    else_ou_pas_else();

                    state._fsp--;

                    pushFollow(FOLLOW_expr2_in_expr99);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // Tiger.g:25:4: whileexp expr doexp expr expr2
                    {
                    pushFollow(FOLLOW_whileexp_in_expr104);
                    whileexp();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr106);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_doexp_in_expr108);
                    doexp();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr110);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr2_in_expr112);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // Tiger.g:26:4: forexp ID ':=' expr toexp expr doexp expr expr2
                    {
                    pushFollow(FOLLOW_forexp_in_expr117);
                    forexp();

                    state._fsp--;

                    match(input,ID,FOLLOW_ID_in_expr119); 
                    match(input,13,FOLLOW_13_in_expr121); 
                    pushFollow(FOLLOW_expr_in_expr123);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_toexp_in_expr125);
                    toexp();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr127);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_doexp_in_expr129);
                    doexp();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr131);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr2_in_expr133);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // Tiger.g:27:4: breakexp expr2
                    {
                    pushFollow(FOLLOW_breakexp_in_expr138);
                    breakexp();

                    state._fsp--;

                    pushFollow(FOLLOW_expr2_in_expr140);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // Tiger.g:28:4: letexp declaration_list inexp ( expr_seq )* endexp expr2
                    {
                    pushFollow(FOLLOW_letexp_in_expr145);
                    letexp();

                    state._fsp--;

                    pushFollow(FOLLOW_declaration_list_in_expr147);
                    declaration_list();

                    state._fsp--;

                    pushFollow(FOLLOW_inexp_in_expr149);
                    inexp();

                    state._fsp--;

                    // Tiger.g:28:34: ( expr_seq )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=STRING && LA2_0<=ID)||(LA2_0>=10 && LA2_0<=11)||LA2_0==35||(LA2_0>=39 && LA2_0<=41)||(LA2_0>=43 && LA2_0<=44)||(LA2_0>=48 && LA2_0<=50)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Tiger.g:28:34: expr_seq
                    	    {
                    	    pushFollow(FOLLOW_expr_seq_in_expr151);
                    	    expr_seq();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    pushFollow(FOLLOW_endexp_in_expr154);
                    endexp();

                    state._fsp--;

                    pushFollow(FOLLOW_expr2_in_expr156);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // Tiger.g:29:4: declaration expr2
                    {
                    pushFollow(FOLLOW_declaration_in_expr162);
                    declaration();

                    state._fsp--;

                    pushFollow(FOLLOW_expr2_in_expr164);
                    expr2();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "expr2"
    // Tiger.g:32:1: expr2 : ( binary_operator expr expr2 | NEWLINE expr | );
    public final void expr2() throws RecognitionException {
        try {
            // Tiger.g:32:7: ( binary_operator expr expr2 | NEWLINE expr | )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // Tiger.g:32:11: binary_operator expr expr2
                    {
                    pushFollow(FOLLOW_binary_operator_in_expr2176);
                    binary_operator();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr2178);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr2_in_expr2180);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:33:4: NEWLINE expr
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_expr2185); 
                    pushFollow(FOLLOW_expr_in_expr2187);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Tiger.g:35:1: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr2"


    // $ANTLR start "parenthese_ou_accolade"
    // Tiger.g:38:1: parenthese_ou_accolade : ( '(' ( expr_list )? ')' expr2 | '{' ( field_list )? '}' expr2 );
    public final void parenthese_ou_accolade() throws RecognitionException {
        try {
            // Tiger.g:39:2: ( '(' ( expr_list )? ')' expr2 | '{' ( field_list )? '}' expr2 )
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
                    // Tiger.g:39:5: '(' ( expr_list )? ')' expr2
                    {
                    match(input,11,FOLLOW_11_in_parenthese_ou_accolade203); 
                    // Tiger.g:39:9: ( expr_list )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=STRING && LA5_0<=ID)||(LA5_0>=10 && LA5_0<=11)||LA5_0==35||(LA5_0>=39 && LA5_0<=41)||(LA5_0>=43 && LA5_0<=44)||(LA5_0>=48 && LA5_0<=50)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Tiger.g:39:9: expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_parenthese_ou_accolade205);
                            expr_list();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,12,FOLLOW_12_in_parenthese_ou_accolade208); 
                    pushFollow(FOLLOW_expr2_in_parenthese_ou_accolade210);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:40:4: '{' ( field_list )? '}' expr2
                    {
                    match(input,14,FOLLOW_14_in_parenthese_ou_accolade215); 
                    // Tiger.g:40:8: ( field_list )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==ID) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Tiger.g:40:8: field_list
                            {
                            pushFollow(FOLLOW_field_list_in_parenthese_ou_accolade217);
                            field_list();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,15,FOLLOW_15_in_parenthese_ou_accolade220); 
                    pushFollow(FOLLOW_expr2_in_parenthese_ou_accolade222);
                    expr2();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parenthese_ou_accolade"


    // $ANTLR start "else_ou_pas_else"
    // Tiger.g:43:1: else_ou_pas_else : ( elseexp expr | );
    public final void else_ou_pas_else() throws RecognitionException {
        try {
            // Tiger.g:44:2: ( elseexp expr | )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // Tiger.g:44:4: elseexp expr
                    {
                    pushFollow(FOLLOW_elseexp_in_else_ou_pas_else234);
                    elseexp();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_else_ou_pas_else236);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:46:1: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "else_ou_pas_else"


    // $ANTLR start "affect_ou_pas_affect"
    // Tiger.g:48:1: affect_ou_pas_affect : ( ':=' expr | );
    public final void affect_ou_pas_affect() throws RecognitionException {
        try {
            // Tiger.g:49:2: ( ':=' expr | )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // Tiger.g:49:4: ':=' expr
                    {
                    match(input,13,FOLLOW_13_in_affect_ou_pas_affect251); 
                    pushFollow(FOLLOW_expr_in_affect_ou_pas_affect253);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:51:1: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "affect_ou_pas_affect"


    // $ANTLR start "expr_seq"
    // Tiger.g:52:1: expr_seq : expr expr_seq2 ;
    public final void expr_seq() throws RecognitionException {
        try {
            // Tiger.g:53:2: ( expr expr_seq2 )
            // Tiger.g:53:4: expr expr_seq2
            {
            pushFollow(FOLLOW_expr_in_expr_seq266);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_expr_seq2_in_expr_seq268);
            expr_seq2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr_seq"


    // $ANTLR start "expr_seq2"
    // Tiger.g:55:1: expr_seq2 : ( ';' expr_seq | );
    public final void expr_seq2() throws RecognitionException {
        try {
            // Tiger.g:56:2: ( ';' expr_seq | )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=STRING && LA10_0<=ID)||(LA10_0>=10 && LA10_0<=12)||LA10_0==35||(LA10_0>=38 && LA10_0<=41)||(LA10_0>=43 && LA10_0<=44)||(LA10_0>=48 && LA10_0<=50)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // Tiger.g:56:4: ';' expr_seq
                    {
                    match(input,16,FOLLOW_16_in_expr_seq2277); 
                    pushFollow(FOLLOW_expr_seq_in_expr_seq2279);
                    expr_seq();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:58:1: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr_seq2"


    // $ANTLR start "expr_list"
    // Tiger.g:59:1: expr_list : expr expr_list2 ;
    public final void expr_list() throws RecognitionException {
        try {
            // Tiger.g:59:11: ( expr expr_list2 )
            // Tiger.g:59:13: expr expr_list2
            {
            pushFollow(FOLLOW_expr_in_expr_list290);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_expr_list2_in_expr_list292);
            expr_list2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr_list"


    // $ANTLR start "expr_list2"
    // Tiger.g:61:1: expr_list2 : ( ',' expr_list | );
    public final void expr_list2() throws RecognitionException {
        try {
            // Tiger.g:62:2: ( ',' expr_list | )
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
                    // Tiger.g:62:4: ',' expr_list
                    {
                    match(input,17,FOLLOW_17_in_expr_list2301); 
                    pushFollow(FOLLOW_expr_list_in_expr_list2303);
                    expr_list();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:64:1: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr_list2"


    // $ANTLR start "field_list"
    // Tiger.g:65:1: field_list : ID '=' expr field_list2 ;
    public final void field_list() throws RecognitionException {
        try {
            // Tiger.g:66:2: ( ID '=' expr field_list2 )
            // Tiger.g:66:4: ID '=' expr field_list2
            {
            match(input,ID,FOLLOW_ID_in_field_list315); 
            match(input,18,FOLLOW_18_in_field_list317); 
            pushFollow(FOLLOW_expr_in_field_list319);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_field_list2_in_field_list321);
            field_list2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "field_list"


    // $ANTLR start "field_list2"
    // Tiger.g:68:1: field_list2 : ( ',' field_list | );
    public final void field_list2() throws RecognitionException {
        try {
            // Tiger.g:69:2: ( ',' field_list | )
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
                    // Tiger.g:69:4: ',' field_list
                    {
                    match(input,17,FOLLOW_17_in_field_list2331); 
                    pushFollow(FOLLOW_field_list_in_field_list2333);
                    field_list();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:71:1: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "field_list2"


    // $ANTLR start "lvalue"
    // Tiger.g:72:1: lvalue : ( lvalue2 affect_ou_pas_affect expr2 | parenthese_ou_accolade );
    public final void lvalue() throws RecognitionException {
        try {
            // Tiger.g:72:8: ( lvalue2 affect_ou_pas_affect expr2 | parenthese_ou_accolade )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // Tiger.g:72:10: lvalue2 affect_ou_pas_affect expr2
                    {
                    pushFollow(FOLLOW_lvalue2_in_lvalue344);
                    lvalue2();

                    state._fsp--;

                    pushFollow(FOLLOW_affect_ou_pas_affect_in_lvalue346);
                    affect_ou_pas_affect();

                    state._fsp--;

                    pushFollow(FOLLOW_expr2_in_lvalue348);
                    expr2();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:73:4: parenthese_ou_accolade
                    {
                    pushFollow(FOLLOW_parenthese_ou_accolade_in_lvalue353);
                    parenthese_ou_accolade();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "lvalue"


    // $ANTLR start "lvalue2"
    // Tiger.g:76:1: lvalue2 : ( id_ou_expr lvalue2 | );
    public final void lvalue2() throws RecognitionException {
        try {
            // Tiger.g:76:9: ( id_ou_expr lvalue2 | )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=19 && LA14_0<=20)) ) {
                alt14=1;
            }
            else if ( (LA14_0==EOF||(LA14_0>=STRING && LA14_0<=NEWLINE)||(LA14_0>=10 && LA14_0<=13)||(LA14_0>=15 && LA14_0<=17)||LA14_0==21||(LA14_0>=23 && LA14_0<=33)||(LA14_0>=35 && LA14_0<=44)||(LA14_0>=46 && LA14_0<=50)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // Tiger.g:76:11: id_ou_expr lvalue2
                    {
                    pushFollow(FOLLOW_id_ou_expr_in_lvalue2362);
                    id_ou_expr();

                    state._fsp--;

                    pushFollow(FOLLOW_lvalue2_in_lvalue2364);
                    lvalue2();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:78:1: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "lvalue2"


    // $ANTLR start "id_ou_expr"
    // Tiger.g:79:1: id_ou_expr : ( '.' ID | '[' expr ']' );
    public final void id_ou_expr() throws RecognitionException {
        try {
            // Tiger.g:80:2: ( '.' ID | '[' expr ']' )
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
                    // Tiger.g:80:4: '.' ID
                    {
                    match(input,19,FOLLOW_19_in_id_ou_expr377); 
                    match(input,ID,FOLLOW_ID_in_id_ou_expr379); 

                    }
                    break;
                case 2 :
                    // Tiger.g:81:4: '[' expr ']'
                    {
                    match(input,20,FOLLOW_20_in_id_ou_expr385); 
                    pushFollow(FOLLOW_expr_in_id_ou_expr387);
                    expr();

                    state._fsp--;

                    match(input,21,FOLLOW_21_in_id_ou_expr389); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "id_ou_expr"


    // $ANTLR start "declaration_list"
    // Tiger.g:83:1: declaration_list : ( declaration declaration_list | );
    public final void declaration_list() throws RecognitionException {
        try {
            // Tiger.g:84:2: ( declaration declaration_list | )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40||(LA16_0>=48 && LA16_0<=49)) ) {
                alt16=1;
            }
            else if ( (LA16_0==42) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // Tiger.g:84:4: declaration declaration_list
                    {
                    pushFollow(FOLLOW_declaration_in_declaration_list399);
                    declaration();

                    state._fsp--;

                    pushFollow(FOLLOW_declaration_list_in_declaration_list401);
                    declaration_list();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:86:1: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declaration_list"


    // $ANTLR start "declaration"
    // Tiger.g:87:1: declaration : ( type_declaration | variable_declaration | function_declaration );
    public final void declaration() throws RecognitionException {
        try {
            // Tiger.g:88:2: ( type_declaration | variable_declaration | function_declaration )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt17=1;
                }
                break;
            case 49:
                {
                alt17=2;
                }
                break;
            case 40:
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
                    // Tiger.g:88:4: type_declaration
                    {
                    pushFollow(FOLLOW_type_declaration_in_declaration413);
                    type_declaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:89:4: variable_declaration
                    {
                    pushFollow(FOLLOW_variable_declaration_in_declaration418);
                    variable_declaration();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Tiger.g:90:4: function_declaration
                    {
                    pushFollow(FOLLOW_function_declaration_in_declaration423);
                    function_declaration();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "type_declaration"
    // Tiger.g:92:1: type_declaration : typeexp type_id '=' type ;
    public final void type_declaration() throws RecognitionException {
        try {
            // Tiger.g:93:2: ( typeexp type_id '=' type )
            // Tiger.g:93:4: typeexp type_id '=' type
            {
            pushFollow(FOLLOW_typeexp_in_type_declaration432);
            typeexp();

            state._fsp--;

            pushFollow(FOLLOW_type_id_in_type_declaration434);
            type_id();

            state._fsp--;

            match(input,18,FOLLOW_18_in_type_declaration436); 
            pushFollow(FOLLOW_type_in_type_declaration438);
            type();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type_declaration"


    // $ANTLR start "type"
    // Tiger.g:95:1: type : ( type_id | '{' ( type_fields )? '}' | arrayexp ofexp type_id );
    public final void type() throws RecognitionException {
        try {
            // Tiger.g:95:6: ( type_id | '{' ( type_fields )? '}' | arrayexp ofexp type_id )
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
            case 34:
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
                    // Tiger.g:95:8: type_id
                    {
                    pushFollow(FOLLOW_type_id_in_type446);
                    type_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:96:4: '{' ( type_fields )? '}'
                    {
                    match(input,14,FOLLOW_14_in_type451); 
                    // Tiger.g:96:8: ( type_fields )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ID) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Tiger.g:96:8: type_fields
                            {
                            pushFollow(FOLLOW_type_fields_in_type453);
                            type_fields();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,15,FOLLOW_15_in_type456); 

                    }
                    break;
                case 3 :
                    // Tiger.g:97:4: arrayexp ofexp type_id
                    {
                    pushFollow(FOLLOW_arrayexp_in_type461);
                    arrayexp();

                    state._fsp--;

                    pushFollow(FOLLOW_ofexp_in_type463);
                    ofexp();

                    state._fsp--;

                    pushFollow(FOLLOW_type_id_in_type465);
                    type_id();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "type_fields"
    // Tiger.g:99:1: type_fields : type_field type_fields2 ;
    public final void type_fields() throws RecognitionException {
        try {
            // Tiger.g:100:2: ( type_field type_fields2 )
            // Tiger.g:100:4: type_field type_fields2
            {
            pushFollow(FOLLOW_type_field_in_type_fields474);
            type_field();

            state._fsp--;

            pushFollow(FOLLOW_type_fields2_in_type_fields476);
            type_fields2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type_fields"


    // $ANTLR start "type_fields2"
    // Tiger.g:102:1: type_fields2 : ( ',' type_fields | );
    public final void type_fields2() throws RecognitionException {
        try {
            // Tiger.g:103:2: ( ',' type_fields | )
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
                    // Tiger.g:103:4: ',' type_fields
                    {
                    match(input,17,FOLLOW_17_in_type_fields2485); 
                    pushFollow(FOLLOW_type_fields_in_type_fields2487);
                    type_fields();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:105:1: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type_fields2"


    // $ANTLR start "type_field"
    // Tiger.g:106:1: type_field : ID ':' type_id ;
    public final void type_field() throws RecognitionException {
        try {
            // Tiger.g:107:2: ( ID ':' type_id )
            // Tiger.g:107:4: ID ':' type_id
            {
            match(input,ID,FOLLOW_ID_in_type_field499); 
            match(input,22,FOLLOW_22_in_type_field501); 
            pushFollow(FOLLOW_type_id_in_type_field503);
            type_id();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type_field"


    // $ANTLR start "variable_declaration"
    // Tiger.g:109:1: variable_declaration : varexp ID type_ou_pas_type ':=' expr ;
    public final void variable_declaration() throws RecognitionException {
        try {
            // Tiger.g:110:2: ( varexp ID type_ou_pas_type ':=' expr )
            // Tiger.g:110:4: varexp ID type_ou_pas_type ':=' expr
            {
            pushFollow(FOLLOW_varexp_in_variable_declaration513);
            varexp();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_variable_declaration515); 
            pushFollow(FOLLOW_type_ou_pas_type_in_variable_declaration517);
            type_ou_pas_type();

            state._fsp--;

            match(input,13,FOLLOW_13_in_variable_declaration519); 
            pushFollow(FOLLOW_expr_in_variable_declaration521);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variable_declaration"


    // $ANTLR start "function_declaration"
    // Tiger.g:112:1: function_declaration : functionexp ID '(' ( type_fields )? ')' type_ou_pas_type '=' expr ;
    public final void function_declaration() throws RecognitionException {
        try {
            // Tiger.g:113:2: ( functionexp ID '(' ( type_fields )? ')' type_ou_pas_type '=' expr )
            // Tiger.g:113:4: functionexp ID '(' ( type_fields )? ')' type_ou_pas_type '=' expr
            {
            pushFollow(FOLLOW_functionexp_in_function_declaration530);
            functionexp();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_function_declaration532); 
            match(input,11,FOLLOW_11_in_function_declaration534); 
            // Tiger.g:113:23: ( type_fields )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Tiger.g:113:23: type_fields
                    {
                    pushFollow(FOLLOW_type_fields_in_function_declaration536);
                    type_fields();

                    state._fsp--;


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_function_declaration539); 
            pushFollow(FOLLOW_type_ou_pas_type_in_function_declaration541);
            type_ou_pas_type();

            state._fsp--;

            match(input,18,FOLLOW_18_in_function_declaration543); 
            pushFollow(FOLLOW_expr_in_function_declaration545);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "function_declaration"


    // $ANTLR start "type_ou_pas_type"
    // Tiger.g:115:1: type_ou_pas_type : ( ':' type_id | );
    public final void type_ou_pas_type() throws RecognitionException {
        try {
            // Tiger.g:116:2: ( ':' type_id | )
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
                    // Tiger.g:116:4: ':' type_id
                    {
                    match(input,22,FOLLOW_22_in_type_ou_pas_type554); 
                    pushFollow(FOLLOW_type_id_in_type_ou_pas_type556);
                    type_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Tiger.g:118:1: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type_ou_pas_type"


    // $ANTLR start "binary_operator"
    // Tiger.g:120:1: binary_operator : ( '<' | '+' | '<=' | '>' | '>=' | '<>' | '!=' | '-' | '&' | ':=' | '*' | '/' | '|' );
    public final void binary_operator() throws RecognitionException {
        try {
            // Tiger.g:121:2: ( '<' | '+' | '<=' | '>' | '>=' | '<>' | '!=' | '-' | '&' | ':=' | '*' | '/' | '|' )
            // Tiger.g:
            {
            if ( input.LA(1)==10||input.LA(1)==13||(input.LA(1)>=23 && input.LA(1)<=33) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
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
        }
        return ;
    }
    // $ANTLR end "binary_operator"


    // $ANTLR start "type_id"
    // Tiger.g:123:1: type_id : ID ;
    public final void type_id() throws RecognitionException {
        try {
            // Tiger.g:123:9: ( ID )
            // Tiger.g:123:11: ID
            {
            match(input,ID,FOLLOW_ID_in_type_id602); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type_id"


    // $ANTLR start "arrayexp"
    // Tiger.g:126:1: arrayexp : 'array' ;
    public final void arrayexp() throws RecognitionException {
        try {
            // Tiger.g:126:10: ( 'array' )
            // Tiger.g:126:12: 'array'
            {
            match(input,34,FOLLOW_34_in_arrayexp611); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arrayexp"


    // $ANTLR start "breakexp"
    // Tiger.g:127:1: breakexp : 'break' ;
    public final void breakexp() throws RecognitionException {
        try {
            // Tiger.g:127:10: ( 'break' )
            // Tiger.g:127:12: 'break'
            {
            match(input,35,FOLLOW_35_in_breakexp620); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "breakexp"


    // $ANTLR start "doexp"
    // Tiger.g:128:1: doexp : 'do' ;
    public final void doexp() throws RecognitionException {
        try {
            // Tiger.g:128:8: ( 'do' )
            // Tiger.g:128:10: 'do'
            {
            match(input,36,FOLLOW_36_in_doexp629); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "doexp"


    // $ANTLR start "elseexp"
    // Tiger.g:129:1: elseexp : 'else' ;
    public final void elseexp() throws RecognitionException {
        try {
            // Tiger.g:129:10: ( 'else' )
            // Tiger.g:129:12: 'else'
            {
            match(input,37,FOLLOW_37_in_elseexp639); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "elseexp"


    // $ANTLR start "endexp"
    // Tiger.g:130:1: endexp : 'end' ;
    public final void endexp() throws RecognitionException {
        try {
            // Tiger.g:130:9: ( 'end' )
            // Tiger.g:130:11: 'end'
            {
            match(input,38,FOLLOW_38_in_endexp650); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "endexp"


    // $ANTLR start "forexp"
    // Tiger.g:131:1: forexp : 'for' ;
    public final void forexp() throws RecognitionException {
        try {
            // Tiger.g:131:9: ( 'for' )
            // Tiger.g:131:11: 'for'
            {
            match(input,39,FOLLOW_39_in_forexp660); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "forexp"


    // $ANTLR start "functionexp"
    // Tiger.g:132:1: functionexp : 'function' ;
    public final void functionexp() throws RecognitionException {
        try {
            // Tiger.g:132:13: ( 'function' )
            // Tiger.g:132:15: 'function'
            {
            match(input,40,FOLLOW_40_in_functionexp669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "functionexp"


    // $ANTLR start "ifexp"
    // Tiger.g:133:1: ifexp : 'if' ;
    public final void ifexp() throws RecognitionException {
        try {
            // Tiger.g:133:7: ( 'if' )
            // Tiger.g:133:9: 'if'
            {
            match(input,41,FOLLOW_41_in_ifexp677); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ifexp"


    // $ANTLR start "inexp"
    // Tiger.g:134:1: inexp : 'in' ;
    public final void inexp() throws RecognitionException {
        try {
            // Tiger.g:134:7: ( 'in' )
            // Tiger.g:134:9: 'in'
            {
            match(input,42,FOLLOW_42_in_inexp686); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "inexp"


    // $ANTLR start "letexp"
    // Tiger.g:135:1: letexp : 'let' ;
    public final void letexp() throws RecognitionException {
        try {
            // Tiger.g:135:8: ( 'let' )
            // Tiger.g:135:10: 'let'
            {
            match(input,43,FOLLOW_43_in_letexp695); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "letexp"


    // $ANTLR start "nilexp"
    // Tiger.g:136:1: nilexp : 'nil' ;
    public final void nilexp() throws RecognitionException {
        try {
            // Tiger.g:136:8: ( 'nil' )
            // Tiger.g:136:10: 'nil'
            {
            match(input,44,FOLLOW_44_in_nilexp704); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "nilexp"


    // $ANTLR start "ofexp"
    // Tiger.g:137:1: ofexp : 'of' ;
    public final void ofexp() throws RecognitionException {
        try {
            // Tiger.g:137:7: ( 'of' )
            // Tiger.g:137:9: 'of'
            {
            match(input,45,FOLLOW_45_in_ofexp713); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ofexp"


    // $ANTLR start "thenexp"
    // Tiger.g:138:1: thenexp : 'then' ;
    public final void thenexp() throws RecognitionException {
        try {
            // Tiger.g:138:9: ( 'then' )
            // Tiger.g:138:11: 'then'
            {
            match(input,46,FOLLOW_46_in_thenexp722); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "thenexp"


    // $ANTLR start "toexp"
    // Tiger.g:139:1: toexp : 'to' ;
    public final void toexp() throws RecognitionException {
        try {
            // Tiger.g:139:7: ( 'to' )
            // Tiger.g:139:9: 'to'
            {
            match(input,47,FOLLOW_47_in_toexp730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "toexp"


    // $ANTLR start "typeexp"
    // Tiger.g:140:1: typeexp : 'type' ;
    public final void typeexp() throws RecognitionException {
        try {
            // Tiger.g:140:9: ( 'type' )
            // Tiger.g:140:11: 'type'
            {
            match(input,48,FOLLOW_48_in_typeexp739); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "typeexp"


    // $ANTLR start "varexp"
    // Tiger.g:141:1: varexp : 'var' ;
    public final void varexp() throws RecognitionException {
        try {
            // Tiger.g:141:8: ( 'var' )
            // Tiger.g:141:10: 'var'
            {
            match(input,49,FOLLOW_49_in_varexp747); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "varexp"


    // $ANTLR start "whileexp"
    // Tiger.g:142:1: whileexp : 'while' ;
    public final void whileexp() throws RecognitionException {
        try {
            // Tiger.g:142:10: ( 'while' )
            // Tiger.g:142:12: 'while'
            {
            match(input,50,FOLLOW_50_in_whileexp756); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "whileexp"


    // $ANTLR start "typedefexp"
    // Tiger.g:143:1: typedefexp : 'typedef' ;
    public final void typedefexp() throws RecognitionException {
        try {
            // Tiger.g:143:13: ( 'typedef' )
            // Tiger.g:143:15: 'typedef'
            {
            match(input,51,FOLLOW_51_in_typedefexp765); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "typedefexp"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\15\uffff";
    static final String DFA3_minS =
        "\1\4\14\uffff";
    static final String DFA3_maxS =
        "\1\62\14\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\2\1\5\3\uffff\1\4\1\6\27\uffff\1\12\3\uffff\1\11\1\14"+
            "\1\7\1\uffff\1\13\1\3\3\uffff\2\14\1\10",
            "",
            "",
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
            return "18:1: expr : ( STRING expr2 | INT expr2 | nilexp expr2 | '-' expr expr2 | ID lvalue | '(' ( expr_seq )? ')' expr2 | ifexp expr thenexp expr else_ou_pas_else expr2 | whileexp expr doexp expr expr2 | forexp ID ':=' expr toexp expr doexp expr expr2 | breakexp expr2 | letexp declaration_list inexp ( expr_seq )* endexp expr2 | declaration expr2 );";
        }
    }
    static final String DFA4_eotS =
        "\35\uffff";
    static final String DFA4_eofS =
        "\1\3\34\uffff";
    static final String DFA4_minS =
        "\1\4\34\uffff";
    static final String DFA4_maxS =
        "\1\62\34\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\12\uffff\1\1\16\uffff";
    static final String DFA4_specialS =
        "\35\uffff}>";
    static final String[] DFA4_transitionS = {
            "\3\3\1\2\2\uffff\1\1\2\3\1\16\1\uffff\3\3\3\uffff\1\3\1\uffff"+
            "\13\16\1\uffff\12\3\1\uffff\5\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "32:1: expr2 : ( binary_operator expr expr2 | NEWLINE expr | );";
        }
    }
    static final String DFA8_eotS =
        "\35\uffff";
    static final String DFA8_eofS =
        "\1\2\34\uffff";
    static final String DFA8_minS =
        "\1\4\34\uffff";
    static final String DFA8_maxS =
        "\1\62\34\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\32\uffff";
    static final String DFA8_specialS =
        "\35\uffff}>";
    static final String[] DFA8_transitionS = {
            "\4\2\2\uffff\4\2\1\uffff\3\2\3\uffff\1\2\1\uffff\13\2\1\uffff"+
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
            return "43:1: else_ou_pas_else : ( elseexp expr | );";
        }
    }
    static final String DFA9_eotS =
        "\36\uffff";
    static final String DFA9_eofS =
        "\1\2\35\uffff";
    static final String DFA9_minS =
        "\1\4\35\uffff";
    static final String DFA9_maxS =
        "\1\62\35\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\33\uffff";
    static final String DFA9_specialS =
        "\36\uffff}>";
    static final String[] DFA9_transitionS = {
            "\4\2\2\uffff\3\2\1\1\1\uffff\3\2\3\uffff\1\2\1\uffff\13\2\1"+
            "\uffff\12\2\1\uffff\5\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "48:1: affect_ou_pas_affect : ( ':=' expr | );";
        }
    }
    static final String DFA13_eotS =
        "\41\uffff";
    static final String DFA13_eofS =
        "\1\1\40\uffff";
    static final String DFA13_minS =
        "\1\4\40\uffff";
    static final String DFA13_maxS =
        "\1\62\40\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\21\uffff\1\1\14\uffff\1\2";
    static final String DFA13_specialS =
        "\41\uffff}>";
    static final String[] DFA13_transitionS = {
            "\4\1\2\uffff\1\1\1\23\2\1\1\40\3\1\1\uffff\3\1\1\uffff\13\1"+
            "\1\uffff\12\1\1\uffff\5\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "72:1: lvalue : ( lvalue2 affect_ou_pas_affect expr2 | parenthese_ou_accolade );";
        }
    }
 

    public static final BitSet FOLLOW_expr_in_tiger32 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr40 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_expr42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr47 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_expr49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nilexp_in_expr54 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_expr56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_expr61 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_expr63 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_expr65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr70 = new BitSet(new long[]{0x00000003FF986C80L});
    public static final BitSet FOLLOW_lvalue_in_expr72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_expr77 = new BitSet(new long[]{0x00071B8800001C70L});
    public static final BitSet FOLLOW_expr_seq_in_expr79 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_expr82 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_expr84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifexp_in_expr89 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_expr91 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_thenexp_in_expr93 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_expr95 = new BitSet(new long[]{0x00000023FF802480L});
    public static final BitSet FOLLOW_else_ou_pas_else_in_expr97 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_expr99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileexp_in_expr104 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_expr106 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_doexp_in_expr108 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_expr110 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_expr112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forexp_in_expr117 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_expr119 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_expr121 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_expr123 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_toexp_in_expr125 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_expr127 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_doexp_in_expr129 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_expr131 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_expr133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakexp_in_expr138 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_expr140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letexp_in_expr145 = new BitSet(new long[]{0x00071F8800000C70L});
    public static final BitSet FOLLOW_declaration_list_in_expr147 = new BitSet(new long[]{0x00071F8800000C70L});
    public static final BitSet FOLLOW_inexp_in_expr149 = new BitSet(new long[]{0x00071BC800000C70L});
    public static final BitSet FOLLOW_expr_seq_in_expr151 = new BitSet(new long[]{0x00071BC800000C70L});
    public static final BitSet FOLLOW_endexp_in_expr154 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_expr156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_expr162 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_expr164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_operator_in_expr2176 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_expr2178 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_expr2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_expr2185 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_expr2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parenthese_ou_accolade203 = new BitSet(new long[]{0x00071B8800001C70L});
    public static final BitSet FOLLOW_expr_list_in_parenthese_ou_accolade205 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parenthese_ou_accolade208 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_parenthese_ou_accolade210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parenthese_ou_accolade215 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_field_list_in_parenthese_ou_accolade217 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parenthese_ou_accolade220 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_parenthese_ou_accolade222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseexp_in_else_ou_pas_else234 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_else_ou_pas_else236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_affect_ou_pas_affect251 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_affect_ou_pas_affect253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_seq266 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_expr_seq2_in_expr_seq268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_expr_seq2277 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_seq_in_expr_seq2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list290 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_expr_list2_in_expr_list292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_expr_list2301 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_list_in_expr_list2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_field_list315 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_field_list317 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_field_list319 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_field_list2_in_field_list321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_field_list2331 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_field_list_in_field_list2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue2_in_lvalue344 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_affect_ou_pas_affect_in_lvalue346 = new BitSet(new long[]{0x00000003FF802480L});
    public static final BitSet FOLLOW_expr2_in_lvalue348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthese_ou_accolade_in_lvalue353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_ou_expr_in_lvalue2362 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_lvalue2_in_lvalue2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_id_ou_expr377 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_id_ou_expr379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_id_ou_expr385 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_id_ou_expr387 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_id_ou_expr389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declaration_list399 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_declaration_list_in_declaration_list401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_declaration_in_declaration413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_declaration418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_in_declaration423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeexp_in_type_declaration432 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_type_id_in_type_declaration434 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_type_declaration436 = new BitSet(new long[]{0x0000000400004040L});
    public static final BitSet FOLLOW_type_in_type_declaration438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_id_in_type446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_type451 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_type_fields_in_type453 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_type456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayexp_in_type461 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ofexp_in_type463 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_type_id_in_type465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_field_in_type_fields474 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_type_fields2_in_type_fields476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_type_fields2485 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_type_fields_in_type_fields2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_field499 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_type_field501 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_type_id_in_type_field503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varexp_in_variable_declaration513 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_variable_declaration515 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_type_ou_pas_type_in_variable_declaration517 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_variable_declaration519 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_variable_declaration521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionexp_in_function_declaration530 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_function_declaration532 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_function_declaration534 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_type_fields_in_function_declaration536 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_function_declaration539 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_type_ou_pas_type_in_function_declaration541 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_function_declaration543 = new BitSet(new long[]{0x00071B8800000C70L});
    public static final BitSet FOLLOW_expr_in_function_declaration545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_type_ou_pas_type554 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_type_id_in_type_ou_pas_type556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_binary_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_id602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_arrayexp611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_breakexp620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_doexp629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_elseexp639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_endexp650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_forexp660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_functionexp669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ifexp677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_inexp686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_letexp695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_nilexp704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ofexp713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_thenexp722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_toexp730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_typeexp739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_varexp747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_whileexp756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_typedefexp765 = new BitSet(new long[]{0x0000000000000002L});

}