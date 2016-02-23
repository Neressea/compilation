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

tiger3	:	expr (NEWLINE expr)?;


expr	:	nilexp
	|	'-' expr
	|	binary (':=' expr)?
	|	type_id 
	|	ifop
	|	forop
	|	whileop
	|	breakexp
	|	letexp declaration_list inexp expr endexp 
	;
	
ifop	:	ifexp expr thenexp expr (elseexp expr)? 
	;
	
forop	:	forexp ID ':=' expr toexp expr doexp NEWLINE expr
	;
	
whileop	:	whileexp expr doexp expr
	;

binary	:	binary2 ('+' binary2)*
	;
	
binary2	:	atom ('*' atom)*
	;
	
atom	:	'(' expr ')'
	| 	lvalue
	|	INT
	|	STRING	
	;
	
lvalue	:	ID lvalue2
	;
	
lvalue2 	:	'.' ID lvalue2
	|	'[' expr ']' lvalue2
	|
	;
	
declaration_list 
	:	(declaration NEWLINE)+
	|	
	;
	
declaration	:
	|	type_declaration
	|	variable_declaration
	|	function_declaration
	;
	
type_declaration
	:	typeexp type_id '=' type 
	;
	
type	:	type_id
	|	'{' (type_fields)? '}'
	|	'array of' type_id
	;
	
variable_declaration
	:	varexp ID ( ':' type_id)? ':=' expr
	;

function_declaration
	:	functionexp ID '(' (type_fields)? ')' (':' type_id)?  '=' expr
	;
	
type_fields	:	type_field type_fields2
	;
	
type_fields2	:	',' type_field type_fields2
	|
	;
	
type_field	:	ID ':' type_id
	;

type_id	:	'int' | 'string'
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
