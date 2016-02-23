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
	;

declaration	:	variable
	|	fonction
	;
	
variable	:	varexp ID (':' type_id)?  ':=' expr
	;
	
fonction	:	functionexp ID '('(formalParam (',' formalParam)*)?')' ':' type_id '=' expr
	| 	forop
	| 	ifop
	;
	
formalParam
	:	ID ':' type_id 
	;
	
forop	: 	forexp ID ':=' expr toexp expr doexp expr
	;
	
ifop	:	ifexp binary thenexp NEWLINE expr (elseexp expr)?
	;
	
ifop2	:	elseexp expr
	|
	;
	
binary	:	a
	;

a	:	 b orop
	;

orop	:	'|' b orop
	|
	;


b	:	c andop
	;

andop	:	'&' c andop
	|
	;

c	:	e comp
	;

comp	:	'<' comp_inf
	|	'>' comp_sup
	|	'=' e comp
	|
	;

comp_inf	:	'>' e comp
	|	'=' e comp_inf
	|	e comp
	;

comp_sup	:	e comp
	|	'=' e comp
	;	

e	:	t addmin
	;

addmin	:	'+' t addmin
	|	'-' t addmin
	|
	;

t	:	parenth muldiv
	;

muldiv	: 	'*' parenth muldiv
	|	'/' parenth muldiv
	|
	;

parenth	:	'('a')'
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