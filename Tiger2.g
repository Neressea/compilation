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
	| 	binary
	|	ifop
	| 	forop
	| 	NEWLINE expr
	;

declaration	:	variable
	|	fonction
	;
	
variable	:	varexp ID (':' type_id)?  ':=' array_or_var
	;

array_or_var:	EXPR=expr | type_id '[' binary ']' ofexp binary
	;
	
fonction	:	functionexp ID '('(PARAM=formalParam (',' formalParam)*)?')' ':' type_id '=' EXPR=expr //-> ^(functionexp ID type_id ^($PARAM) $EXPR)
	;
	
formalParam
	:	ID ':' type_id
	;
	
forop	: 	forexp ID ':=' expr 'to' EXPR_TO=expr doexp EXPR_DO=expr //-> ^(forexp ^(ID $EXPR_FROM $EXPR_TO) ^(doexp $EXPR_DO))
	;
	
ifop	:	ifexp binary thenexp NEWLINE EXPR1=expr+ (elseexp EXPR2=expr)? //-> ^(ifexp ^(thenexp $EXPR1) ^(elseexp $EXPR2))
	;
	
binary	:	a z?
	;
	
z	:	':=' expr
	;

a	:	 b orop
	;

orop	:	'|' B=b OR=orop //-> ^('|' $B $OR)
	|
	;


b	:	c andop
	;

andop	:	'&' C=c AND=andop //-> ^('&' $C $AND)
	|
	;

c	:	e comp
	;

comp	:	'<' COMP=comp_inf //-> ^('<' $COMP)
	|	'>' COMP=comp_sup //-> ^('>' $COMP)
	|	'=' E=e COMP=comp //-> ^('=' $E $COMP)
	|
	;

comp_inf	:	'>' E=e COMP=comp //-> ^('>' $E $ COMP)
	|	'=' E=e COMP=comp //-> ^('=' $E $COMP)
	|	E=e COMP=comp
	;

comp_sup	:	E=e COMP=comp
	|	'=' E=e COMP=comp //-> ^('=' $E $COMP)
	;	

e	:	t addmin
	;


t	:	neg muldiv
	;
addmin	:	'+' T=t ADD=addmin //-> ^('+' $T $ADD)
	|	'-' T=t ADD=addmin //-> ^('-' $T $ADD)
	|
	;


muldiv	: 	'*' ATOM=neg MUL=muldiv //-> ^('*' $ATOM $MUL)
	|	'/' ATOM=neg MUL=muldiv //-> ^('/' $ATOM $MUL)
	|
	;

neg	:	'-' atom | atom	
	;

atom	:	'('a')'
	|	INT
	|	ID
	| 	STRING
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