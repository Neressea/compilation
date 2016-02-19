grammar Tiger;

options{
k=1;
backtrack=false;
}

@header {
import java.util.HashMap;
}

@members {
/** Map variable name to Integer object holding value */
HashMap<String,Integer>  memory = new HashMap<String,Integer>();
}

tiger	:	expr;

expr	:	STRING expr2
	|	INT expr2
	|	nilexp expr2
	|	'-' expr expr2
	|	ID lvalue
	|	'(' expr_seq? ')' expr2
	|	ifexp expr thenexp expr else_ou_pas_else expr2
	|	whileexp expr doexp expr expr2
	|	forexp ID ':=' expr toexp expr doexp expr expr2
	|	breakexp expr2
	|	letexp declaration_list inexp expr_seq* endexp expr2 
	|	declaration expr2
	|	NEWLINE expr

	;

expr2	:  	binary_operator expr expr2
	|
	;


parenthese_ou_accolade 
	:	 '(' expr_list? ')' expr2
	|	'{' field_list? '}' expr2
;
	
else_ou_pas_else 
	:	elseexp expr 
	|
;

affect_ou_pas_affect 
	:	':=' expr
	|
;
expr_seq 
	:	expr expr_seq2
;
expr_seq2
	:	';' expr_seq
	|
;
expr_list	:	expr expr_list2
;
expr_list2
	:	',' expr_list
	|
;
field_list
	:	ID '=' expr field_list2
;
field_list2 
	:	',' field_list
	|
;
lvalue	:	lvalue2 affect_ou_pas_affect expr2
	|	parenthese_ou_accolade
;

lvalue2	:	id_ou_expr lvalue2
	|	
;
id_ou_expr
	:	'.' ID 
	|	'[' expr ']'
;
declaration_list 
	:	declaration declaration_list
	|
;
declaration
	:	type_declaration
	|	variable_declaration
	|	function_declaration
;
type_declaration
	:	typeexp type_id '=' type
;
type	:	type_id
	|	'{' type_fields? '}'
	|	arrayexp ofexp type_id
;
type_fields
	:	type_field type_fields2
;
type_fields2
	:	',' type_fields
	|
;
type_field
	:	ID ':' type_id
;
variable_declaration 
	:	varexp ID type_ou_pas_type ':=' expr
;
function_declaration
	:	functionexp ID '(' type_fields? ')' type_ou_pas_type '=' expr
;
type_ou_pas_type
	:	':' type_id 
	|
;

binary_operator
	:	':='| condition_or
;

condition_or
	:	'|' | condition_and
;

condition_and	
	:	'&'| comparateur
;

comparateur
	:	'<' r1 | '>' r2  | '='|addsous
;

r1 	
	: 	'>'| '=' |;

r2	
	:	'='|;
	
addsous
	:	'+'|'-'|multidiv
;

multidiv
	:	'*'|div
;

div	:	'/';

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
letexp	:	'let'		;
nilexp	:	'nil'		;
ofexp	:	'of'		;
thenexp	:	'then'	;
toexp	:	'to'		;
typeexp	:	'type'	;
varexp	:	'var'		;
whileexp	:	'while'	;
typedefexp  :	'typedef' ; 

ID 	:	('a'..'z'|'A'..'Z')(('a'..'z'|'A'..'Z'|'0'..'9'|'_')*);
INT	:	'0'..'9'+;	
STRING 	:	'"'.+'"'; /* . correspond à n'importe quel caractère ou n'importe quel caractère affichable ?*/
WS 	:	(' '|'\t')+ {$channel=HIDDEN;};
NEWLINE	:	('\r'? '\n') | '\r';
COMMENT	: 	'/*'.* '*/';