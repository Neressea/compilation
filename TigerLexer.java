// $ANTLR 3.3 Nov 30, 2010 12:50:56 Tiger.g 2016-02-12 16:20:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TigerLexer extends Lexer {
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

    public TigerLexer() {;} 
    public TigerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TigerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Tiger.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:3:7: ( '-' )
            // Tiger.g:3:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:4:7: ( '(' )
            // Tiger.g:4:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:5:7: ( ')' )
            // Tiger.g:5:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:6:7: ( ':=' )
            // Tiger.g:6:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:7:7: ( '{' )
            // Tiger.g:7:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:8:7: ( '}' )
            // Tiger.g:8:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:9:7: ( ';' )
            // Tiger.g:9:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:10:7: ( ',' )
            // Tiger.g:10:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:11:7: ( '=' )
            // Tiger.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:12:7: ( '.' )
            // Tiger.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:13:7: ( '[' )
            // Tiger.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:14:7: ( ']' )
            // Tiger.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:15:7: ( ':' )
            // Tiger.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:16:7: ( '<' )
            // Tiger.g:16:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:17:7: ( '+' )
            // Tiger.g:17:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:18:7: ( '<=' )
            // Tiger.g:18:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:19:7: ( '>' )
            // Tiger.g:19:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:20:7: ( '>=' )
            // Tiger.g:20:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:21:7: ( '<>' )
            // Tiger.g:21:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:22:7: ( '!=' )
            // Tiger.g:22:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:23:7: ( '&' )
            // Tiger.g:23:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:24:7: ( '*' )
            // Tiger.g:24:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:25:7: ( '/' )
            // Tiger.g:25:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:26:7: ( '|' )
            // Tiger.g:26:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:27:7: ( 'array' )
            // Tiger.g:27:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:28:7: ( 'break' )
            // Tiger.g:28:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:29:7: ( 'do' )
            // Tiger.g:29:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:30:7: ( 'else' )
            // Tiger.g:30:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:31:7: ( 'end' )
            // Tiger.g:31:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:32:7: ( 'for' )
            // Tiger.g:32:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:33:7: ( 'function' )
            // Tiger.g:33:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:34:7: ( 'if' )
            // Tiger.g:34:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:35:7: ( 'in' )
            // Tiger.g:35:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:36:7: ( 'let' )
            // Tiger.g:36:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:37:7: ( 'nil' )
            // Tiger.g:37:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:38:7: ( 'of' )
            // Tiger.g:38:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:39:7: ( 'then' )
            // Tiger.g:39:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:40:7: ( 'to' )
            // Tiger.g:40:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:41:7: ( 'type' )
            // Tiger.g:41:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:42:7: ( 'var' )
            // Tiger.g:42:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:43:7: ( 'while' )
            // Tiger.g:43:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:44:7: ( 'typedef' )
            // Tiger.g:44:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:145:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* ) )
            // Tiger.g:145:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Tiger.g:145:26: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Tiger.g:145:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            // Tiger.g:145:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Tiger.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:146:5: ( ( '0' .. '9' )+ )
            // Tiger.g:146:7: ( '0' .. '9' )+
            {
            // Tiger.g:146:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Tiger.g:146:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:147:9: ( '\"' ( . )+ '\"' )
            // Tiger.g:147:11: '\"' ( . )+ '\"'
            {
            match('\"'); 
            // Tiger.g:147:14: ( . )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\"') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Tiger.g:147:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:148:5: ( ( ' ' | '\\t' )+ )
            // Tiger.g:148:7: ( ' ' | '\\t' )+
            {
            // Tiger.g:148:7: ( ' ' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Tiger.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:149:9: ( ( ( '\\r' )? '\\n' ) | '\\r' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='\n') ) {
                    alt6=1;
                }
                else {
                    alt6=2;}
            }
            else if ( (LA6_0=='\n') ) {
                alt6=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // Tiger.g:149:11: ( ( '\\r' )? '\\n' )
                    {
                    // Tiger.g:149:11: ( ( '\\r' )? '\\n' )
                    // Tiger.g:149:12: ( '\\r' )? '\\n'
                    {
                    // Tiger.g:149:12: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Tiger.g:149:12: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }


                    }
                    break;
                case 2 :
                    // Tiger.g:149:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger.g:150:9: ( '/*' ( . )* '*/' )
            // Tiger.g:150:12: '/*' ( . )* '*/'
            {
            match("/*"); 

            // Tiger.g:150:16: ( . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Tiger.g:150:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // Tiger.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | ID | INT | STRING | WS | NEWLINE | COMMENT )
        int alt8=48;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // Tiger.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // Tiger.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // Tiger.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // Tiger.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // Tiger.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // Tiger.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // Tiger.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // Tiger.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // Tiger.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // Tiger.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // Tiger.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // Tiger.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // Tiger.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // Tiger.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // Tiger.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // Tiger.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // Tiger.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // Tiger.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // Tiger.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // Tiger.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // Tiger.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // Tiger.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // Tiger.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // Tiger.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // Tiger.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // Tiger.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // Tiger.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // Tiger.g:1:172: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // Tiger.g:1:178: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // Tiger.g:1:184: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // Tiger.g:1:190: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // Tiger.g:1:196: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // Tiger.g:1:202: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // Tiger.g:1:208: T__43
                {
                mT__43(); 

                }
                break;
            case 35 :
                // Tiger.g:1:214: T__44
                {
                mT__44(); 

                }
                break;
            case 36 :
                // Tiger.g:1:220: T__45
                {
                mT__45(); 

                }
                break;
            case 37 :
                // Tiger.g:1:226: T__46
                {
                mT__46(); 

                }
                break;
            case 38 :
                // Tiger.g:1:232: T__47
                {
                mT__47(); 

                }
                break;
            case 39 :
                // Tiger.g:1:238: T__48
                {
                mT__48(); 

                }
                break;
            case 40 :
                // Tiger.g:1:244: T__49
                {
                mT__49(); 

                }
                break;
            case 41 :
                // Tiger.g:1:250: T__50
                {
                mT__50(); 

                }
                break;
            case 42 :
                // Tiger.g:1:256: T__51
                {
                mT__51(); 

                }
                break;
            case 43 :
                // Tiger.g:1:262: ID
                {
                mID(); 

                }
                break;
            case 44 :
                // Tiger.g:1:265: INT
                {
                mINT(); 

                }
                break;
            case 45 :
                // Tiger.g:1:269: STRING
                {
                mSTRING(); 

                }
                break;
            case 46 :
                // Tiger.g:1:276: WS
                {
                mWS(); 

                }
                break;
            case 47 :
                // Tiger.g:1:279: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 48 :
                // Tiger.g:1:287: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\4\uffff\1\47\10\uffff\1\52\1\uffff\1\54\3\uffff\1\56\1\uffff\14"+
        "\41\16\uffff\2\41\1\102\4\41\1\107\1\110\2\41\1\113\1\41\1\115\5"+
        "\41\1\uffff\1\41\1\124\1\125\1\41\2\uffff\1\127\1\130\1\uffff\1"+
        "\41\1\uffff\1\41\1\133\3\41\1\137\2\uffff\1\41\2\uffff\1\141\1\143"+
        "\1\uffff\1\41\1\145\1\146\1\uffff\1\41\1\uffff\1\41\1\uffff\1\151"+
        "\2\uffff\2\41\1\uffff\1\41\1\155\1\156\2\uffff";
    static final String DFA8_eofS =
        "\157\uffff";
    static final String DFA8_minS =
        "\1\11\3\uffff\1\75\10\uffff\1\75\1\uffff\1\75\3\uffff\1\52\1\uffff"+
        "\2\162\1\157\1\154\1\157\1\146\1\145\1\151\1\146\1\150\1\141\1\150"+
        "\16\uffff\1\162\1\145\1\60\1\163\1\144\1\162\1\156\2\60\1\164\1"+
        "\154\1\60\1\145\1\60\1\160\1\162\1\151\2\141\1\uffff\1\145\2\60"+
        "\1\143\2\uffff\2\60\1\uffff\1\156\1\uffff\1\145\1\60\1\154\1\171"+
        "\1\153\1\60\2\uffff\1\164\2\uffff\2\60\1\uffff\1\145\2\60\1\uffff"+
        "\1\151\1\uffff\1\145\1\uffff\1\60\2\uffff\1\157\1\146\1\uffff\1"+
        "\156\2\60\2\uffff";
    static final String DFA8_maxS =
        "\1\175\3\uffff\1\75\10\uffff\1\76\1\uffff\1\75\3\uffff\1\52\1\uffff"+
        "\2\162\1\157\1\156\1\165\1\156\1\145\1\151\1\146\1\171\1\141\1\150"+
        "\16\uffff\1\162\1\145\1\172\1\163\1\144\1\162\1\156\2\172\1\164"+
        "\1\154\1\172\1\145\1\172\1\160\1\162\1\151\2\141\1\uffff\1\145\2"+
        "\172\1\143\2\uffff\2\172\1\uffff\1\156\1\uffff\1\145\1\172\1\154"+
        "\1\171\1\153\1\172\2\uffff\1\164\2\uffff\2\172\1\uffff\1\145\2\172"+
        "\1\uffff\1\151\1\uffff\1\145\1\uffff\1\172\2\uffff\1\157\1\146\1"+
        "\uffff\1\156\2\172\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\uffff\1\17\1\uffff\1\24\1\25\1\26\1\uffff\1\30\14\uffff\1\53"+
        "\1\54\1\55\1\56\1\57\1\4\1\15\1\20\1\23\1\16\1\22\1\21\1\60\1\27"+
        "\23\uffff\1\33\4\uffff\1\40\1\41\2\uffff\1\44\1\uffff\1\46\6\uffff"+
        "\1\35\1\36\1\uffff\1\42\1\43\2\uffff\1\50\3\uffff\1\34\1\uffff\1"+
        "\45\1\uffff\1\47\1\uffff\1\31\1\32\2\uffff\1\51\3\uffff\1\52\1\37";
    static final String DFA8_specialS =
        "\157\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\44\1\45\2\uffff\1\45\22\uffff\1\44\1\20\1\43\3\uffff\1\21"+
            "\1\uffff\1\2\1\3\1\22\1\16\1\10\1\1\1\12\1\23\12\42\1\4\1\7"+
            "\1\15\1\11\1\17\2\uffff\32\41\1\13\1\uffff\1\14\3\uffff\1\25"+
            "\1\26\1\41\1\27\1\30\1\31\2\41\1\32\2\41\1\33\1\41\1\34\1\35"+
            "\4\41\1\36\1\41\1\37\1\40\3\41\1\5\1\24\1\6",
            "",
            "",
            "",
            "\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\1\51",
            "",
            "\1\53",
            "",
            "",
            "",
            "\1\55",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62\1\uffff\1\63",
            "\1\64\5\uffff\1\65",
            "\1\66\7\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73\6\uffff\1\74\11\uffff\1\75",
            "\1\76",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\111",
            "\1\112",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\114",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\126",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\131",
            "",
            "\1\132",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\140",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\3\41\1\142\26\41",
            "",
            "\1\144",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\147",
            "",
            "\1\150",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | ID | INT | STRING | WS | NEWLINE | COMMENT );";
        }
    }
 

}