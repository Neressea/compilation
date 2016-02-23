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

tiger2	:	declaration NEWLINE declaration
	|
	;

declaration	:	variable
	|	fonction
	;
	
variable	:	ID ':=' expr	
	;
	
fonction	:	ifop
	;
	
ifop	:	ifexp expr thenexp NEWLINE expr ifop2
	;
	
ifop2	:	elseexp expr
	|
	;
	
expr	:	a
	;

a	:	 b a2
	;

a2	:	'|' b a2
	|
	;


b	:	c b2
	;

b2	:	'&' c b2
	|
	;

c	:	e c2
	;

c2	:	'<' c3
	|	'>' c4
	|	'=' e c2
	|
	;

c3	:	'>' e c2
	|	'=' e c3
	|	e c2
	;

c4	:	e c2
	|	'=' e c2
	;	

e	:	t e2
	;

e2	:	'+' t e2	
	|	'-' t e2
	|
	;

t	:	f t2
	;

t2	: 	'*' f t2
	|	'/' f t2
	|
	;

f	:	'('a')'
	|	INT	
	|	ID
	;

type_id	:	ID
;

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

ID 	:	('a'..'z'|'A'..'Z')(('a'..'z'|'A'..'Z'|'0'..'9'|'_')*);
INT	:	'0'..'9'+;	
STRING 	:	'"'.+'"'; /* . correspond à n'importe quel caractère ou n'importe quel caractère affichable ?*/
WS 	:	(' '|'\t')+ {$channel=HIDDEN;};
NEWLINE	:	('\r'? '\n') | '\r' {$channel=HIDDEN;};
COMMENT	: 	'/*'.* '*/' {$channel=HIDDEN;};
