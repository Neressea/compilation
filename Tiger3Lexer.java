// $ANTLR 3.3 Nov 30, 2010 12:50:56 Tiger3.g 2016-02-26 15:12:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Tiger3Lexer extends Lexer {
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

    public Tiger3Lexer() {;} 
    public Tiger3Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Tiger3Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Tiger3.g"; }

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:3:7: ( '{' )
            // Tiger3.g:3:9: '{'
            {
            match('{'); 

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
            // Tiger3.g:4:7: ( '}' )
            // Tiger3.g:4:9: '}'
            {
            match('}'); 

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
            // Tiger3.g:5:7: ( ',' )
            // Tiger3.g:5:9: ','
            {
            match(','); 

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
            // Tiger3.g:6:7: ( ';' )
            // Tiger3.g:6:9: ';'
            {
            match(';'); 

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
            // Tiger3.g:7:7: ( ':=' )
            // Tiger3.g:7:9: ':='
            {
            match(":="); 


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
            // Tiger3.g:8:7: ( '|' )
            // Tiger3.g:8:9: '|'
            {
            match('|'); 

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
            // Tiger3.g:9:7: ( '&' )
            // Tiger3.g:9:9: '&'
            {
            match('&'); 

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
            // Tiger3.g:10:7: ( '>' )
            // Tiger3.g:10:9: '>'
            {
            match('>'); 

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
            // Tiger3.g:11:7: ( '=' )
            // Tiger3.g:11:9: '='
            {
            match('='); 

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
            // Tiger3.g:12:7: ( '<' )
            // Tiger3.g:12:9: '<'
            {
            match('<'); 

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
            // Tiger3.g:13:7: ( '*' )
            // Tiger3.g:13:9: '*'
            {
            match('*'); 

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
            // Tiger3.g:14:7: ( '/' )
            // Tiger3.g:14:9: '/'
            {
            match('/'); 

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
            // Tiger3.g:15:7: ( '-' )
            // Tiger3.g:15:9: '-'
            {
            match('-'); 

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
            // Tiger3.g:16:7: ( '(' )
            // Tiger3.g:16:9: '('
            {
            match('('); 

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
            // Tiger3.g:17:7: ( ')' )
            // Tiger3.g:17:9: ')'
            {
            match(')'); 

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
            // Tiger3.g:18:7: ( '.' )
            // Tiger3.g:18:9: '.'
            {
            match('.'); 

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
            // Tiger3.g:19:7: ( '[' )
            // Tiger3.g:19:9: '['
            {
            match('['); 

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
            // Tiger3.g:20:7: ( ']' )
            // Tiger3.g:20:9: ']'
            {
            match(']'); 

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
            // Tiger3.g:21:7: ( 'array of' )
            // Tiger3.g:21:9: 'array of'
            {
            match("array of"); 


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
            // Tiger3.g:22:7: ( ':' )
            // Tiger3.g:22:9: ':'
            {
            match(':'); 

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
            // Tiger3.g:23:7: ( 'int' )
            // Tiger3.g:23:9: 'int'
            {
            match("int"); 


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
            // Tiger3.g:24:7: ( 'string' )
            // Tiger3.g:24:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:25:7: ( 'array' )
            // Tiger3.g:25:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:26:7: ( 'break' )
            // Tiger3.g:26:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:27:7: ( 'do' )
            // Tiger3.g:27:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:28:7: ( 'else' )
            // Tiger3.g:28:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:29:7: ( 'end' )
            // Tiger3.g:29:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:30:7: ( 'for' )
            // Tiger3.g:30:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:31:7: ( 'function' )
            // Tiger3.g:31:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:32:7: ( 'if' )
            // Tiger3.g:32:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:33:7: ( 'in' )
            // Tiger3.g:33:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:34:7: ( 'nil' )
            // Tiger3.g:34:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:35:7: ( 'let' )
            // Tiger3.g:35:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:36:7: ( 'of' )
            // Tiger3.g:36:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:37:7: ( 'then' )
            // Tiger3.g:37:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:38:7: ( 'to' )
            // Tiger3.g:38:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:39:7: ( 'type' )
            // Tiger3.g:39:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:40:7: ( 'var' )
            // Tiger3.g:40:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:41:7: ( 'while' )
            // Tiger3.g:41:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:42:7: ( 'typedef' )
            // Tiger3.g:42:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:43:7: ( 'block' )
            // Tiger3.g:43:9: 'block'
            {
            match("block"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:44:7: ( '+' )
            // Tiger3.g:44:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Tiger3.g:208:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* ) )
            // Tiger3.g:208:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Tiger3.g:208:26: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Tiger3.g:208:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            // Tiger3.g:208:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Tiger3.g:
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
            // Tiger3.g:209:5: ( ( '0' .. '9' )+ )
            // Tiger3.g:209:7: ( '0' .. '9' )+
            {
            // Tiger3.g:209:7: ( '0' .. '9' )+
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
            	    // Tiger3.g:209:7: '0' .. '9'
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
            // Tiger3.g:210:9: ( '\"' ( . )+ '\"' )
            // Tiger3.g:210:11: '\"' ( . )+ '\"'
            {
            match('\"'); 
            // Tiger3.g:210:14: ( . )+
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
            	    // Tiger3.g:210:14: .
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
            // Tiger3.g:211:5: ( ( ' ' | '\\t' )+ )
            // Tiger3.g:211:7: ( ' ' | '\\t' )+
            {
            // Tiger3.g:211:7: ( ' ' | '\\t' )+
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
            	    // Tiger3.g:
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
            // Tiger3.g:212:9: ( ( '\\r' )? '\\n' )
            // Tiger3.g:212:11: ( '\\r' )? '\\n'
            {
            // Tiger3.g:212:11: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Tiger3.g:212:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

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
            // Tiger3.g:213:9: ( '/*' ( . )* '*/' )
            // Tiger3.g:213:12: '/*' ( . )* '*/'
            {
            match("/*"); 

            // Tiger3.g:213:16: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Tiger3.g:213:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // Tiger3.g:1:8: ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | ID | INT | STRING | WS | NEWLINE | COMMENT )
        int alt7=48;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // Tiger3.g:1:10: T__30
                {
                mT__30(); 

                }
                break;
            case 2 :
                // Tiger3.g:1:16: T__31
                {
                mT__31(); 

                }
                break;
            case 3 :
                // Tiger3.g:1:22: T__32
                {
                mT__32(); 

                }
                break;
            case 4 :
                // Tiger3.g:1:28: T__33
                {
                mT__33(); 

                }
                break;
            case 5 :
                // Tiger3.g:1:34: T__34
                {
                mT__34(); 

                }
                break;
            case 6 :
                // Tiger3.g:1:40: T__35
                {
                mT__35(); 

                }
                break;
            case 7 :
                // Tiger3.g:1:46: T__36
                {
                mT__36(); 

                }
                break;
            case 8 :
                // Tiger3.g:1:52: T__37
                {
                mT__37(); 

                }
                break;
            case 9 :
                // Tiger3.g:1:58: T__38
                {
                mT__38(); 

                }
                break;
            case 10 :
                // Tiger3.g:1:64: T__39
                {
                mT__39(); 

                }
                break;
            case 11 :
                // Tiger3.g:1:70: T__40
                {
                mT__40(); 

                }
                break;
            case 12 :
                // Tiger3.g:1:76: T__41
                {
                mT__41(); 

                }
                break;
            case 13 :
                // Tiger3.g:1:82: T__42
                {
                mT__42(); 

                }
                break;
            case 14 :
                // Tiger3.g:1:88: T__43
                {
                mT__43(); 

                }
                break;
            case 15 :
                // Tiger3.g:1:94: T__44
                {
                mT__44(); 

                }
                break;
            case 16 :
                // Tiger3.g:1:100: T__45
                {
                mT__45(); 

                }
                break;
            case 17 :
                // Tiger3.g:1:106: T__46
                {
                mT__46(); 

                }
                break;
            case 18 :
                // Tiger3.g:1:112: T__47
                {
                mT__47(); 

                }
                break;
            case 19 :
                // Tiger3.g:1:118: T__48
                {
                mT__48(); 

                }
                break;
            case 20 :
                // Tiger3.g:1:124: T__49
                {
                mT__49(); 

                }
                break;
            case 21 :
                // Tiger3.g:1:130: T__50
                {
                mT__50(); 

                }
                break;
            case 22 :
                // Tiger3.g:1:136: T__51
                {
                mT__51(); 

                }
                break;
            case 23 :
                // Tiger3.g:1:142: T__52
                {
                mT__52(); 

                }
                break;
            case 24 :
                // Tiger3.g:1:148: T__53
                {
                mT__53(); 

                }
                break;
            case 25 :
                // Tiger3.g:1:154: T__54
                {
                mT__54(); 

                }
                break;
            case 26 :
                // Tiger3.g:1:160: T__55
                {
                mT__55(); 

                }
                break;
            case 27 :
                // Tiger3.g:1:166: T__56
                {
                mT__56(); 

                }
                break;
            case 28 :
                // Tiger3.g:1:172: T__57
                {
                mT__57(); 

                }
                break;
            case 29 :
                // Tiger3.g:1:178: T__58
                {
                mT__58(); 

                }
                break;
            case 30 :
                // Tiger3.g:1:184: T__59
                {
                mT__59(); 

                }
                break;
            case 31 :
                // Tiger3.g:1:190: T__60
                {
                mT__60(); 

                }
                break;
            case 32 :
                // Tiger3.g:1:196: T__61
                {
                mT__61(); 

                }
                break;
            case 33 :
                // Tiger3.g:1:202: T__62
                {
                mT__62(); 

                }
                break;
            case 34 :
                // Tiger3.g:1:208: T__63
                {
                mT__63(); 

                }
                break;
            case 35 :
                // Tiger3.g:1:214: T__64
                {
                mT__64(); 

                }
                break;
            case 36 :
                // Tiger3.g:1:220: T__65
                {
                mT__65(); 

                }
                break;
            case 37 :
                // Tiger3.g:1:226: T__66
                {
                mT__66(); 

                }
                break;
            case 38 :
                // Tiger3.g:1:232: T__67
                {
                mT__67(); 

                }
                break;
            case 39 :
                // Tiger3.g:1:238: T__68
                {
                mT__68(); 

                }
                break;
            case 40 :
                // Tiger3.g:1:244: T__69
                {
                mT__69(); 

                }
                break;
            case 41 :
                // Tiger3.g:1:250: T__70
                {
                mT__70(); 

                }
                break;
            case 42 :
                // Tiger3.g:1:256: T__71
                {
                mT__71(); 

                }
                break;
            case 43 :
                // Tiger3.g:1:262: ID
                {
                mID(); 

                }
                break;
            case 44 :
                // Tiger3.g:1:265: INT
                {
                mINT(); 

                }
                break;
            case 45 :
                // Tiger3.g:1:269: STRING
                {
                mSTRING(); 

                }
                break;
            case 46 :
                // Tiger3.g:1:276: WS
                {
                mWS(); 

                }
                break;
            case 47 :
                // Tiger3.g:1:279: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 48 :
                // Tiger3.g:1:287: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\5\uffff\1\47\6\uffff\1\51\6\uffff\15\41\12\uffff\1\41\1\77\1\100"+
        "\3\41\1\104\6\41\1\113\1\41\1\115\4\41\1\122\2\uffff\3\41\1\uffff"+
        "\1\41\1\127\1\130\1\41\1\132\1\133\1\uffff\1\41\1\uffff\1\41\1\136"+
        "\2\41\1\uffff\3\41\1\144\2\uffff\1\41\2\uffff\1\146\1\150\1\uffff"+
        "\1\41\1\153\1\41\1\155\1\156\1\uffff\1\41\1\uffff\1\41\1\uffff\1"+
        "\161\2\uffff\1\162\2\uffff\2\41\2\uffff\1\41\1\166\1\167\2\uffff";
    static final String DFA7_eofS =
        "\170\uffff";
    static final String DFA7_minS =
        "\1\11\4\uffff\1\75\6\uffff\1\52\6\uffff\1\162\1\146\1\164\1\154"+
        "\1\157\1\154\1\157\1\151\1\145\1\146\1\150\1\141\1\150\12\uffff"+
        "\1\162\2\60\1\162\1\145\1\157\1\60\1\163\1\144\1\162\1\156\1\154"+
        "\1\164\1\60\1\145\1\60\1\160\1\162\1\151\1\141\1\60\2\uffff\1\151"+
        "\1\141\1\143\1\uffff\1\145\2\60\1\143\2\60\1\uffff\1\156\1\uffff"+
        "\1\145\1\60\1\154\1\171\1\uffff\1\156\2\153\1\60\2\uffff\1\164\2"+
        "\uffff\2\60\1\uffff\1\145\1\40\1\147\2\60\1\uffff\1\151\1\uffff"+
        "\1\145\1\uffff\1\60\2\uffff\1\60\2\uffff\1\157\1\146\2\uffff\1\156"+
        "\2\60\2\uffff";
    static final String DFA7_maxS =
        "\1\175\4\uffff\1\75\6\uffff\1\52\6\uffff\1\162\1\156\1\164\1\162"+
        "\1\157\1\156\1\165\1\151\1\145\1\146\1\171\1\141\1\150\12\uffff"+
        "\1\162\2\172\1\162\1\145\1\157\1\172\1\163\1\144\1\162\1\156\1\154"+
        "\1\164\1\172\1\145\1\172\1\160\1\162\1\151\1\141\1\172\2\uffff\1"+
        "\151\1\141\1\143\1\uffff\1\145\2\172\1\143\2\172\1\uffff\1\156\1"+
        "\uffff\1\145\1\172\1\154\1\171\1\uffff\1\156\2\153\1\172\2\uffff"+
        "\1\164\2\uffff\2\172\1\uffff\1\145\1\172\1\147\2\172\1\uffff\1\151"+
        "\1\uffff\1\145\1\uffff\1\172\2\uffff\1\172\2\uffff\1\157\1\146\2"+
        "\uffff\1\156\2\172\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\15\uffff\1\52\1\53\1\54\1\55\1\56"+
        "\1\57\1\5\1\24\1\60\1\14\25\uffff\1\37\1\36\3\uffff\1\31\6\uffff"+
        "\1\42\1\uffff\1\44\4\uffff\1\25\4\uffff\1\33\1\34\1\uffff\1\40\1"+
        "\41\2\uffff\1\46\5\uffff\1\32\1\uffff\1\43\1\uffff\1\45\1\uffff"+
        "\1\23\1\27\1\uffff\1\30\1\51\2\uffff\1\47\1\26\3\uffff\1\50\1\35";
    static final String DFA7_specialS =
        "\170\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\44\1\45\2\uffff\1\45\22\uffff\1\44\1\uffff\1\43\3\uffff\1"+
            "\7\1\uffff\1\16\1\17\1\13\1\40\1\3\1\15\1\20\1\14\12\42\1\5"+
            "\1\4\1\12\1\11\1\10\2\uffff\32\41\1\21\1\uffff\1\22\3\uffff"+
            "\1\23\1\26\1\41\1\27\1\30\1\31\2\41\1\24\2\41\1\33\1\41\1\32"+
            "\1\34\3\41\1\25\1\35\1\41\1\36\1\37\3\41\1\1\1\6\1\2",
            "",
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
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\54\7\uffff\1\53",
            "\1\55",
            "\1\57\5\uffff\1\56",
            "\1\60",
            "\1\61\1\uffff\1\62",
            "\1\63\5\uffff\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70\6\uffff\1\71\11\uffff\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\76\6\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\114",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "\1\126",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\131",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\134",
            "",
            "\1\135",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\145",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\3\41\1\147\26\41",
            "",
            "\1\151",
            "\1\152\17\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\154",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\157",
            "",
            "\1\160",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\163",
            "\1\164",
            "",
            "",
            "\1\165",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | ID | INT | STRING | WS | NEWLINE | COMMENT );";
        }
    }
 

}