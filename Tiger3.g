grammar Tiger3;

options{
k=1;
backtrack=false;
output=AST;
}

tokens{
TAIGA;
COMP;
COND;
BLOCK;
BEGIN;
END;
PARAMS;
TYPE;
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
	|	affect
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

ifop	:	fi=ifexp e1=expr NEWLINE* th=thenexp NEWLINE* e2=expr NEWLINE* (els=elseexp NEWLINE* e3=expr)? 
				-> {$els.text != null}? ^($fi ^(COND $e1) ^($th $e2) ^($els $e3))
				-> ^($fi ^(COND $e1) ^($th $e2))				 
	;
	
forop	:	fo=forexp dd=ID ':=' e1=expr toexp e2=expr NEWLINE* doexp NEWLINE* e3=expr 
				-> ^($fo ^($dd ^(BEGIN $e1) ^(END $e2)) ^(BLOCK $e3)) 
	;
	
whileop	:	whi=whileexp e1=expr NEWLINE* doexp NEWLINE* e2=expr -> ^($whi ^(COND $e1) ^(BLOCK $e2))
	;

affect	:	o=orop (af=':=' e1=expr)? -> {$af != null}? ^($af $o $e1)
					-> $o
	;

orop	:	a1=andop (ortoken='|' a2=andop)* -> {$ortoken != null}? ^($ortoken $a1 $a2) -> $a1
	;
	
andop	:	c1=comp (andtoken='&' c2=comp)* -> {$andtoken != null}? ^($andtoken $c1 $c2) -> $c1
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
	:	vava=varexp nom=ID ( depoi=':' (typenew=ID | typebase=type_id))? ':=' e=expr 
				-> {$depoi != null && $typenew.text!=null}? ^($vava $nom $typenew ^(BLOCK $e))
				-> {$depoi != null && $typebase.text!=null}? ^($vava $nom $typebase ^(BLOCK $e))
				-> ^($vava $nom ^(BLOCK $e))
	;

function_declaration
	:	fun=functionexp ID '(' par=type_fields? ')' (':' (ty=type_id|i=ID))?  '=' NEWLINE* (e=expr NEWLINE*)+
			-> {$par.text != null && $ty.text != null}? ^($fun ID ^(PARAMS $par) ^(TYPE $ty) ^(BLOCK $e))
			-> {$par.text != null && $i != null}? ^($fun ID ^(PARAMS $par) ^(TYPE $i) ^(BLOCK $e))
			-> {$par.text != null}? ^($fun ID ^(PARAMS $par) ^(BLOCK $e))
			-> {$ty.text != null}? ^($fun ID ^(TYPE $ty) ^(BLOCK $e))
			-> {$i != null}? ^($fun ID ^(TYPE $i) ^(BLOCK $e))
			-> ^($fun ID ^(BLOCK $e))
	;
	
type_fields	:	type_field type_fields2
	;
	
type_fields2	:	',' type_field type_fields2
	|
	;
	
type_field	:	ID ':' (type_id|ID)
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
