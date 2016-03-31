// $ANTLR 3.5.1 D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g 2016-03-31 15:44:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Tiger3Lexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int T__76=76;
	public static final int BEGIN=4;
	public static final int BLOCK=5;
	public static final int CELL=6;
	public static final int COMMENT=7;
	public static final int COMMENT2=8;
	public static final int COMP=9;
	public static final int COND=10;
	public static final int CONST=11;
	public static final int DECLARATIONS=12;
	public static final int EMPTY_SEQ=13;
	public static final int END=14;
	public static final int FIELD=15;
	public static final int FUNC_CALL=16;
	public static final int FUNC_DECL=17;
	public static final int ID=18;
	public static final int IDF=19;
	public static final int INIT=20;
	public static final int INT=21;
	public static final int NEG=22;
	public static final int NEWLINE=23;
	public static final int PARAM=24;
	public static final int PARAMSEFF=25;
	public static final int PARAMSFORM=26;
	public static final int PRIMITIF=27;
	public static final int SIZE=28;
	public static final int STRING=29;
	public static final int STRUCT=30;
	public static final int TAB=31;
	public static final int TAIGA=32;
	public static final int TYPE=33;
	public static final int WS=34;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Tiger3Lexer() {} 
	public Tiger3Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public Tiger3Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g"; }

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:2:7: ( '&' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:2:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:3:7: ( '(' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:3:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:4:7: ( ')' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:4:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:5:7: ( '*' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:5:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:6:7: ( '+' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:6:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:7:7: ( ',' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:7:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:8:7: ( '-' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:8:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:9:7: ( '.' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:9:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:10:7: ( '/' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:10:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:11:7: ( ':' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:11:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:12:7: ( ':=' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:12:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:13:7: ( ';' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:13:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:14:7: ( '<' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:14:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:15:7: ( '=' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:15:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:16:7: ( '>' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:16:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:17:7: ( '[' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:17:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:18:7: ( ']' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:18:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:19:7: ( 'array of' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:19:9: 'array of'
			{
			match("array of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:20:7: ( 'array' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:20:9: 'array'
			{
			match("array"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:21:7: ( 'block' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:21:9: 'block'
			{
			match("block"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:22:7: ( 'break' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:22:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:23:7: ( 'do' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:23:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:24:7: ( 'else' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:24:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:25:7: ( 'end' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:25:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:26:7: ( 'for' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:26:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:27:7: ( 'function' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:27:9: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:28:7: ( 'if' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:28:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:29:7: ( 'in' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:29:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:30:7: ( 'int' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:30:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:31:7: ( 'let' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:31:9: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:32:7: ( 'nil' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:32:9: 'nil'
			{
			match("nil"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:33:7: ( 'of' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:33:9: 'of'
			{
			match("of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:34:7: ( 'string' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:34:9: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:35:7: ( 'then' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:35:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:36:7: ( 'to' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:36:9: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:37:7: ( 'type' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:37:9: 'type'
			{
			match("type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:38:7: ( 'typedef' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:38:9: 'typedef'
			{
			match("typedef"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:39:7: ( 'var' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:39:9: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:40:7: ( 'while' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:40:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:41:7: ( '{' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:41:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:42:7: ( '|' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:42:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:43:7: ( '}' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:43:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:218:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* ) )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:218:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:218:26: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:218:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:218:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:219:5: ( ( '0' .. '9' )+ )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:219:7: ( '0' .. '9' )+
			{
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:219:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:220:9: ( '\"' ( . )+ '\"' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:220:11: '\"' ( . )+ '\"'
			{
			match('\"'); 
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:220:14: ( . )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='\"') ) {
					alt3=2;
				}
				else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:220:14: .
					{
					matchAny(); 
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:221:5: ( ( ' ' | '\\t' )+ )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:221:7: ( ' ' | '\\t' )+
			{
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:221:7: ( ' ' | '\\t' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\t'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:222:9: ( ( '\\r' )? '\\n' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:222:11: ( '\\r' )? '\\n'
			{
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:222:11: ( '\\r' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='\r') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:222:11: '\\r'
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
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:223:9: ( '/*' ( . )* '*/' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:223:12: '/*' ( . )* '*/'
			{
			match("/*"); 

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:223:16: ( . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='*') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='/') ) {
						alt6=2;
					}
					else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:223:16: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:224:10: ( '//' ( . )* ( '\\r' )? '\\n' )
			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:224:12: '//' ( . )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:224:17: ( . )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\r') ) {
					alt7=2;
				}
				else if ( (LA7_0=='\n') ) {
					alt7=2;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:224:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop7;
				}
			}

			// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:224:20: ( '\\r' )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\r') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:224:20: '\\r'
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
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | ID | INT | STRING | WS | NEWLINE | COMMENT | COMMENT2 )
		int alt9=49;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:10: T__35
				{
				mT__35(); 

				}
				break;
			case 2 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:16: T__36
				{
				mT__36(); 

				}
				break;
			case 3 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:22: T__37
				{
				mT__37(); 

				}
				break;
			case 4 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:28: T__38
				{
				mT__38(); 

				}
				break;
			case 5 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:34: T__39
				{
				mT__39(); 

				}
				break;
			case 6 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:40: T__40
				{
				mT__40(); 

				}
				break;
			case 7 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:46: T__41
				{
				mT__41(); 

				}
				break;
			case 8 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:52: T__42
				{
				mT__42(); 

				}
				break;
			case 9 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:58: T__43
				{
				mT__43(); 

				}
				break;
			case 10 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:64: T__44
				{
				mT__44(); 

				}
				break;
			case 11 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:70: T__45
				{
				mT__45(); 

				}
				break;
			case 12 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:76: T__46
				{
				mT__46(); 

				}
				break;
			case 13 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:82: T__47
				{
				mT__47(); 

				}
				break;
			case 14 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:88: T__48
				{
				mT__48(); 

				}
				break;
			case 15 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:94: T__49
				{
				mT__49(); 

				}
				break;
			case 16 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:100: T__50
				{
				mT__50(); 

				}
				break;
			case 17 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:106: T__51
				{
				mT__51(); 

				}
				break;
			case 18 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:112: T__52
				{
				mT__52(); 

				}
				break;
			case 19 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:118: T__53
				{
				mT__53(); 

				}
				break;
			case 20 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:124: T__54
				{
				mT__54(); 

				}
				break;
			case 21 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:130: T__55
				{
				mT__55(); 

				}
				break;
			case 22 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:136: T__56
				{
				mT__56(); 

				}
				break;
			case 23 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:142: T__57
				{
				mT__57(); 

				}
				break;
			case 24 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:148: T__58
				{
				mT__58(); 

				}
				break;
			case 25 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:154: T__59
				{
				mT__59(); 

				}
				break;
			case 26 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:160: T__60
				{
				mT__60(); 

				}
				break;
			case 27 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:166: T__61
				{
				mT__61(); 

				}
				break;
			case 28 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:172: T__62
				{
				mT__62(); 

				}
				break;
			case 29 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:178: T__63
				{
				mT__63(); 

				}
				break;
			case 30 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:184: T__64
				{
				mT__64(); 

				}
				break;
			case 31 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:190: T__65
				{
				mT__65(); 

				}
				break;
			case 32 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:196: T__66
				{
				mT__66(); 

				}
				break;
			case 33 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:202: T__67
				{
				mT__67(); 

				}
				break;
			case 34 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:208: T__68
				{
				mT__68(); 

				}
				break;
			case 35 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:214: T__69
				{
				mT__69(); 

				}
				break;
			case 36 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:220: T__70
				{
				mT__70(); 

				}
				break;
			case 37 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:226: T__71
				{
				mT__71(); 

				}
				break;
			case 38 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:232: T__72
				{
				mT__72(); 

				}
				break;
			case 39 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:238: T__73
				{
				mT__73(); 

				}
				break;
			case 40 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:244: T__74
				{
				mT__74(); 

				}
				break;
			case 41 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:250: T__75
				{
				mT__75(); 

				}
				break;
			case 42 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:256: T__76
				{
				mT__76(); 

				}
				break;
			case 43 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:262: ID
				{
				mID(); 

				}
				break;
			case 44 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:265: INT
				{
				mINT(); 

				}
				break;
			case 45 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:269: STRING
				{
				mSTRING(); 

				}
				break;
			case 46 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:276: WS
				{
				mWS(); 

				}
				break;
			case 47 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:279: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 48 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:287: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 49 :
				// D:\\Programmation\\albert22u\\Analyse_lexicale_et_syntaxique\\Tiger3.g:1:295: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\11\uffff\1\50\1\52\6\uffff\15\41\15\uffff\3\41\1\101\4\41\1\106\1\110"+
		"\2\41\1\113\2\41\1\116\6\41\1\uffff\1\41\1\126\1\127\1\41\1\uffff\1\131"+
		"\1\uffff\1\132\1\133\1\uffff\2\41\1\uffff\1\41\1\137\4\41\1\144\2\uffff"+
		"\1\41\3\uffff\1\41\1\147\1\151\1\uffff\1\41\1\154\1\155\1\156\1\uffff"+
		"\2\41\1\uffff\1\41\1\uffff\1\162\4\uffff\1\41\1\164\1\41\1\uffff\1\41"+
		"\1\uffff\1\167\1\170\2\uffff";
	static final String DFA9_eofS =
		"\171\uffff";
	static final String DFA9_minS =
		"\1\11\10\uffff\1\52\1\75\6\uffff\1\162\1\154\1\157\1\154\1\157\1\146\1"+
		"\145\1\151\1\146\1\164\1\150\1\141\1\150\15\uffff\1\162\1\157\1\145\1"+
		"\60\1\163\1\144\1\162\1\156\2\60\1\164\1\154\1\60\1\162\1\145\1\60\1\160"+
		"\1\162\1\151\1\141\1\143\1\141\1\uffff\1\145\2\60\1\143\1\uffff\1\60\1"+
		"\uffff\2\60\1\uffff\1\151\1\156\1\uffff\1\145\1\60\1\154\1\171\2\153\1"+
		"\60\2\uffff\1\164\3\uffff\1\156\2\60\1\uffff\1\145\1\40\2\60\1\uffff\1"+
		"\151\1\147\1\uffff\1\145\1\uffff\1\60\4\uffff\1\157\1\60\1\146\1\uffff"+
		"\1\156\1\uffff\2\60\2\uffff";
	static final String DFA9_maxS =
		"\1\175\10\uffff\1\57\1\75\6\uffff\2\162\1\157\1\156\1\165\1\156\1\145"+
		"\1\151\1\146\1\164\1\171\1\141\1\150\15\uffff\1\162\1\157\1\145\1\172"+
		"\1\163\1\144\1\162\1\156\2\172\1\164\1\154\1\172\1\162\1\145\1\172\1\160"+
		"\1\162\1\151\1\141\1\143\1\141\1\uffff\1\145\2\172\1\143\1\uffff\1\172"+
		"\1\uffff\2\172\1\uffff\1\151\1\156\1\uffff\1\145\1\172\1\154\1\171\2\153"+
		"\1\172\2\uffff\1\164\3\uffff\1\156\2\172\1\uffff\1\145\3\172\1\uffff\1"+
		"\151\1\147\1\uffff\1\145\1\uffff\1\172\4\uffff\1\157\1\172\1\146\1\uffff"+
		"\1\156\1\uffff\2\172\2\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\14\1\15\1\16\1\17"+
		"\1\20\1\21\15\uffff\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61"+
		"\1\11\1\13\1\12\26\uffff\1\26\4\uffff\1\33\1\uffff\1\34\2\uffff\1\40\2"+
		"\uffff\1\43\7\uffff\1\30\1\31\1\uffff\1\35\1\36\1\37\3\uffff\1\46\4\uffff"+
		"\1\27\2\uffff\1\42\1\uffff\1\44\1\uffff\1\22\1\23\1\24\1\25\3\uffff\1"+
		"\47\1\uffff\1\41\2\uffff\1\45\1\32";
	static final String DFA9_specialS =
		"\171\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\44\1\45\2\uffff\1\45\22\uffff\1\44\1\uffff\1\43\3\uffff\1\1\1\uffff"+
			"\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\12\42\1\12\1\13\1\14\1\15\1\16\2\uffff"+
			"\32\41\1\17\1\uffff\1\20\3\uffff\1\21\1\22\1\41\1\23\1\24\1\25\2\41\1"+
			"\26\2\41\1\27\1\41\1\30\1\31\3\41\1\32\1\33\1\41\1\34\1\35\3\41\1\36"+
			"\1\37\1\40",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\46\4\uffff\1\47",
			"\1\51",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\53",
			"\1\54\5\uffff\1\55",
			"\1\56",
			"\1\57\1\uffff\1\60",
			"\1\61\5\uffff\1\62",
			"\1\63\7\uffff\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71\6\uffff\1\72\11\uffff\1\73",
			"\1\74",
			"\1\75",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\76",
			"\1\77",
			"\1\100",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\107\6\41",
			"\1\111",
			"\1\112",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\114",
			"\1\115",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"",
			"\1\125",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\130",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\134",
			"\1\135",
			"",
			"\1\136",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			"\1\145",
			"",
			"",
			"",
			"\1\146",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\3\41\1\150\26\41",
			"",
			"\1\152",
			"\1\153\17\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"\1\157",
			"\1\160",
			"",
			"\1\161",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"",
			"",
			"",
			"",
			"\1\163",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\1\165",
			"",
			"\1\166",
			"",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
			"\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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

	protected class DFA9 extends DFA {

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
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | ID | INT | STRING | WS | NEWLINE | COMMENT | COMMENT2 );";
		}
	}

}
