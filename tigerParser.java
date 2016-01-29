// $ANTLR 3.3 Nov 30, 2010 12:50:56 tiger.g 2016-01-29 17:27:18

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class tigerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "STRING", "WS", "NEWLINE", "COMMENT", "'array'", "'break'", "'do'", "'else'", "'end'", "'for'", "'function'", "'if'", "'in'", "'let'", "'nil'", "'of'", "'then'", "'to'", "'type'", "'var'", "'while'"
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
    public static final int ID=4;
    public static final int INT=5;
    public static final int STRING=6;
    public static final int WS=7;
    public static final int NEWLINE=8;
    public static final int COMMENT=9;

    // delegates
    // delegators


        public tigerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public tigerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return tigerParser.tokenNames; }
    public String getGrammarFileName() { return "tiger.g"; }


    /** Map variable name to Integer object holding value */
    HashMap<String,Integer>  memory = new HashMap<String,Integer>();



    // $ANTLR start "arrayexp"
    // tiger.g:11:1: arrayexp : 'array' ;
    public final void arrayexp() throws RecognitionException {
        try {
            // tiger.g:11:10: ( 'array' )
            // tiger.g:11:12: 'array'
            {
            match(input,10,FOLLOW_10_in_arrayexp21); 

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
    // tiger.g:12:1: breakexp : 'break' ;
    public final void breakexp() throws RecognitionException {
        try {
            // tiger.g:12:10: ( 'break' )
            // tiger.g:12:12: 'break'
            {
            match(input,11,FOLLOW_11_in_breakexp30); 

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
    // tiger.g:13:1: doexp : 'do' ;
    public final void doexp() throws RecognitionException {
        try {
            // tiger.g:13:8: ( 'do' )
            // tiger.g:13:10: 'do'
            {
            match(input,12,FOLLOW_12_in_doexp39); 

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
    // tiger.g:14:1: elseexp : 'else' ;
    public final void elseexp() throws RecognitionException {
        try {
            // tiger.g:14:10: ( 'else' )
            // tiger.g:14:12: 'else'
            {
            match(input,13,FOLLOW_13_in_elseexp49); 

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
    // tiger.g:15:1: endexp : 'end' ;
    public final void endexp() throws RecognitionException {
        try {
            // tiger.g:15:9: ( 'end' )
            // tiger.g:15:11: 'end'
            {
            match(input,14,FOLLOW_14_in_endexp60); 

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
    // tiger.g:16:1: forexp : 'for' ;
    public final void forexp() throws RecognitionException {
        try {
            // tiger.g:16:9: ( 'for' )
            // tiger.g:16:11: 'for'
            {
            match(input,15,FOLLOW_15_in_forexp70); 

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
    // tiger.g:17:1: functionexp : 'function' ;
    public final void functionexp() throws RecognitionException {
        try {
            // tiger.g:17:13: ( 'function' )
            // tiger.g:17:15: 'function'
            {
            match(input,16,FOLLOW_16_in_functionexp79); 

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
    // tiger.g:18:1: ifexp : 'if' ;
    public final void ifexp() throws RecognitionException {
        try {
            // tiger.g:18:8: ( 'if' )
            // tiger.g:18:10: 'if'
            {
            match(input,17,FOLLOW_17_in_ifexp88); 

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
    // tiger.g:19:1: inexp : 'in' ;
    public final void inexp() throws RecognitionException {
        try {
            // tiger.g:19:7: ( 'in' )
            // tiger.g:19:9: 'in'
            {
            match(input,18,FOLLOW_18_in_inexp97); 

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
    // tiger.g:20:1: letexp : 'let' ;
    public final void letexp() throws RecognitionException {
        try {
            // tiger.g:20:8: ( 'let' )
            // tiger.g:20:10: 'let'
            {
            match(input,19,FOLLOW_19_in_letexp106); 

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
    // tiger.g:21:1: nilexp : 'nil' ;
    public final void nilexp() throws RecognitionException {
        try {
            // tiger.g:21:8: ( 'nil' )
            // tiger.g:21:10: 'nil'
            {
            match(input,20,FOLLOW_20_in_nilexp115); 

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
    // tiger.g:22:1: ofexp : 'of' ;
    public final void ofexp() throws RecognitionException {
        try {
            // tiger.g:22:7: ( 'of' )
            // tiger.g:22:9: 'of'
            {
            match(input,21,FOLLOW_21_in_ofexp124); 

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
    // tiger.g:23:1: thenexp : 'then' ;
    public final void thenexp() throws RecognitionException {
        try {
            // tiger.g:23:9: ( 'then' )
            // tiger.g:23:11: 'then'
            {
            match(input,22,FOLLOW_22_in_thenexp133); 

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
    // tiger.g:24:1: toexp : 'to' ;
    public final void toexp() throws RecognitionException {
        try {
            // tiger.g:24:7: ( 'to' )
            // tiger.g:24:9: 'to'
            {
            match(input,23,FOLLOW_23_in_toexp141); 

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
    // tiger.g:25:1: typeexp : 'type' ;
    public final void typeexp() throws RecognitionException {
        try {
            // tiger.g:25:9: ( 'type' )
            // tiger.g:25:11: 'type'
            {
            match(input,24,FOLLOW_24_in_typeexp150); 

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
    // tiger.g:26:1: varexp : 'var' ;
    public final void varexp() throws RecognitionException {
        try {
            // tiger.g:26:8: ( 'var' )
            // tiger.g:26:10: 'var'
            {
            match(input,25,FOLLOW_25_in_varexp158); 

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
    // tiger.g:27:1: whileexp : 'while' ;
    public final void whileexp() throws RecognitionException {
        try {
            // tiger.g:27:10: ( 'while' )
            // tiger.g:27:12: 'while'
            {
            match(input,26,FOLLOW_26_in_whileexp167); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_10_in_arrayexp21 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_breakexp30 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_doexp39 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_elseexp49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_endexp60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_forexp70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_functionexp79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ifexp88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_inexp97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_letexp106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_nilexp115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ofexp124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_thenexp133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_toexp141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_typeexp150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_varexp158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_whileexp167 = new BitSet(new long[]{0x0000000000000002L});

}