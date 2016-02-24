grammar Tiger3;

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

tiger3	:	expr NEWLINE* (expr)?;

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

comp	:	binary (('>'('=')? | '<' ('>' | '=')? | '=') binary)*
	;

binary	:	binary2 (('+'|'-') binary2)* 
	;
	
binary2	:	neg (('*'|'/') neg)*
	;
	
neg	:	'-'? atom
	;
	
atom	:	'(' (NEWLINE? expr_seq NEWLINE?)* ')'
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
	:	varexp ID ( ':' type_id)? ':=' expr
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
