grammar Tiger2;

options{
k=1;
backtrack=false;
output=AST;
}

@header {
import java.util.HashMap;
}

@members {
/** Map variable name to Integer object holding value */
HashMap<String,Integer>  memory = new HashMap<String,Integer>();
}

tiger2	:	expr
	;

expr	:	declaration (NEWLINE declaration)?
	| 	affect
	| 	binary
	;

declaration	:	variable
	|	fonction
	;
	
variable	:	varexp ID (':' type_id)?  ':=' EXPR=expr -> ^(varexp ID type_id ^(':=' $EXPR))
	;
	
fonction	:	functionexp ID '('(PARAM=formalParam (',' formalParam)*)?')' ':' type_id '=' EXPR=expr -> ^(functionexp ID type_id ^($PARAM) $EXPR)
	| 	forop
	| 	ifop
	;
	
formalParam
	:	ID ':' type_id
	;
	
forop	: 	forexp ID ':=' EXPR_FROM=expr toexp EXPR_TO=expr doexp EXPR_DO=expr -> ^(forexp ^(ID $EXPR_FROM $EXPR_TO) ^(doexp $EXPR_DO))
	;
	
ifop	:	ifexp binary thenexp NEWLINE EXPR1=expr (elseexp EXPR2=expr)? -> ^(ifexp ^(thenexp $EXPR1) ^(elseexp $EXPR2))
	;

affect	:	ID ':=' E=expr -> ^(':='  ID $E)
	;
	
binary	:	a
	;

a	:	 b orop
	;

orop	:	'|' B=b OR=orop -> ^('|' $B $OR)
	|
	;


b	:	c andop
	;

andop	:	'&' C=c AND=andop -> ^('&' $C $AND)
	|
	;

c	:	e comp
	;

comp	:	'<' COMP=comp_inf -> ^('<' $COMP)
	|	'>' COMP=comp_sup -> ^('>' $COMP)
	|	'=' E=e COMP=comp -> ^('=' $E $COMP)
	|
	;

comp_inf	:	'>' E=e COMP=comp -> ^('>' $E $ COMP)
	|	'=' E=e COMP=comp -> ^('=' $E $COMP)
	|	E=e COMP=comp
	;

comp_sup	:	E=e COMP=comp
	|	'=' E=e COMP=comp -> ^('=' $E $COMP)
	;	

e	:	t addmin
	;


t	:	atom muldiv
	;
addmin	:	'+' T=t ADD=addmin -> ^('+' $T $ADD)
	|	'-' T=t ADD=addmin -> ^('-' $T $ADD)
	|
	;


muldiv	: 	'*' ATOM=atom MUL=muldiv -> ^('*' $ATOM $MUL)
	|	'/' ATOM=atom MUL=muldiv -> ^('/' $ATOM $MUL)
	|
	;

atom	:	'('a')'
	|	INT
	|	ID
	;

type_id	:	intexp | stringexp;

arrayexp	:	'array'	; 
breakexp	:	'break'	;
doexp 	:	'do'		;
elseexp 	:	'else'		;	
endexp 	:	'end'		;
forexp 	:	'for'		;
functionexp	:	'function'	;
ifexp	:	'if'		;
inexp	:	'in'		;
nilexp	:	'nil'		;
letexp	:	'let'		;
ofexp	:	'of'		;
thenexp	:	'then'	;
toexp	:	'to'		;
typeexp	:	'type'	;
varexp	:	'var'		;
whileexp	:	'while'	;
typedefexp  :	'typedef' ; 
blockexp 	:	'block' ;
intexp 	:	'int';
stringexp 
	:	'string';

ID 	:	('a'..'z'|'A'..'Z')(('a'..'z'|'A'..'Z'|'0'..'9'|'_')*);
INT	:	'0'..'9'+;	
STRING 	:	'"'.+'"'; /* . correspond à n'importe quel caractère ou n'importe quel caractère affichable ?*/
WS 	:	(' '|'\t')+ {$channel=HIDDEN;};
NEWLINE	:	('\r'? '\n') | '\r' {$channel=HIDDEN;};
COMMENT	: 	'/*'.* '*/' {$channel=HIDDEN;};