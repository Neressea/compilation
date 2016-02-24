grammar Tiger3;

options{
k=1;
backtrack=false;
output=AST;
}

tokens{
TAIGA;
COMP;
}

@header {
import java.util.HashMap;
}

@members {
/** Map variable name to Integer object holding value */
HashMap<String,Integer>  memory = new HashMap<String,Integer>();
}

tiger3	:	e1=expr NEWLINE* (e2=expr)? -> ^(TAIGA $e1 $e2?);

expr	:	nilexp
	|	orop (':=' expr)?
	|	type_id ( '{' field_list* '}')?
	|	ifop
	|	forop
	|	whileop
	|	breakexp
	|	letexp declaration_list NEWLINE? inexp expr NEWLINE? endexp 
	;

expr_list 	:	expr | ',' expr
	;	
	
expr_seq	:	expr ';'?
	;
	
field_list	:	ID ':=' expr | ',' ID ':=' expr
	;		

ifop	:	ifexp expr NEWLINE* thenexp NEWLINE* expr NEWLINE* (elseexp NEWLINE* expr)?
	;
	
forop	:	forexp ID ':=' expr toexp expr NEWLINE? doexp NEWLINE? expr
	;
	
whileop	:	whileexp expr doexp expr
	;

affect	:	orop
	;

orop	:	andop ('|' andop)*
	;
	
andop	:	comp ('&' comp)*
	;

comp	:	b1=binary ((sup1='>'(eg1='=')? | inf1='<' (sup2='>' | eg2='=')? | eg3='=') b2=binary)* -> {$sup1 != null && $eg1 != null}? ^(COMP[">="] $b1 $b2)+
							-> {$inf1 != null && $eg2 != null}? ^(COMP["<="] $b1 $b2)+
							-> {$inf1 != null && $sup2 != null}? ^(COMP["<>"] $b1 $b2)+
							-> {$sup1 != null }? ^($sup1 $b1 $b2)+
							-> {$inf1 != null }? ^($inf1 $b1 $b2)+
							-> {$eg3 != null}? ^($eg3 $b1 $b2)+
							-> $b1
	;
binary	:	b1=binary2 ((add='+'|minus='-') b2=binary2)* -> {$add != null}? ^($add $b1 $b2)+-> {$minus !=null}? ^($minus $b1 $b2)+ -> $b1
	;
	
binary2	:	n1=neg ((mul='*'|div='/') n2=neg)* -> {$mul != null}? ^($mul $n1 $n2)+-> {$div !=null}? ^($div $n1 $n2)+ -> $n1
	;
	
neg	:	minus='-'? a=atom -> {$minus != null}? ^('-' $a) -> $a
	;
	
atom	:	'(' (NEWLINE? e=expr_seq NEWLINE?)* ')' -> $e*
	| 	lvalue
	|	INT
	|	STRING	
	;
	
lvalue	:	ID (lvalue2 | '(' expr_list* ')')?
	;
	
lvalue2 	:	'.' ID lvalue2
	|	'[' expr ']' (lvalue2 | ofexp expr)?
	;
	
	declaration_list 
	:	(NEWLINE* declaration NEWLINE*)+
	|	
	;
	
declaration	:	type_declaration
	|	variable_declaration
	|	function_declaration
	;
	
type_declaration
	:	typeexp ID '=' type 
	;
	
type	:	type_id
	|	'{' (type_fields)? '}'
	|	'array of' type_id
	;
	
variable_declaration
	:	varexp ID ( ':' ID)? ':=' expr
	;

function_declaration
	:	functionexp ID '(' (type_fields)? ')' (':' type_id)?  '=' NEWLINE* (expr NEWLINE*)+
	;
	
type_fields	:	type_field type_fields2
	;
	
type_fields2	:	',' type_field type_fields2
	|
	;
	
type_field	:	ID ':' type_id
	;

type_id	:	('int' | 'string') lvalue2*
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
NEWLINE	:	'\r'? '\n' | '\r' {$channel=HIDDEN;};
COMMENT	: 	'/*'.* '*/' {$channel=HIDDEN;};
