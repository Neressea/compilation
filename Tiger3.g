grammar Tiger3;

options{
k=1;
backtrack=false;
output=AST;
}

tokens{
TAIGA;
DECLARATIONS;
BLOCK;
COMP;
COND;
BEGIN;
END;
PARAMSFORM;
PARAMSEFF;
PARAM;
TYPE;
TAB;
STRUCT;
CELL;
SIZE;
INIT;
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
	|	l=letexp decl=declaration_list NEWLINE? inexp e=expr_seq? NEWLINE? endexp
			-> {$e.tree != null}? ^($l ^(DECLARATIONS $decl) ^(BLOCK $e))
			-> ^($l ^(DECLARATIONS $decl))
	;

expr_list 	:	e1=expr (v=',' e2=expr_list)?
			-> {$v.text != null}? $e1 $e2
			-> $e1
	;	
	
expr_seq	:	e1=expr NEWLINE*  (pv=';' NEWLINE* e2=expr_seq)?
			-> {$pv.text != null}? $e1 $e2
			-> $e1
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
	
whileop	:	whi=whileexp e1=expr NEWLINE* doexp NEWLINE* e2=expr 
			-> ^($whi ^(COND $e1) ^(BLOCK $e2))
	;

affect	:	o=orop (af=':=' e1=expr)?
			-> {$af != null}? ^($af $o $e1)
			-> $o
	;

orop	:	a1=andop (ortoken='|' andop)*
			//-> {$ortoken != null}? ^($ortoken $a1 ^($a2)) 
			//-> $a1
	;
	
andop	:	c1=comp (andtoken='&' comp)*
			//-> {$andtoken != null}? ^($andtoken $c1 ^($c2)) 
			//-> $c1
	;

comp	:	b1=binary ((sup1='>'(eg1='=')? | inf1='<' (sup2='>' | eg2='=')? | eg3='=') binary)*
			//-> {$sup1 != null && $eg1 != null}? ^(COMP[">="] $b1 ^($b2))
			//-> {$inf1 != null && $eg2 != null}? ^(COMP["<="] $b1 ^($b2))
			//-> {$inf1 != null && $sup2 != null}? ^(COMP["<>"] $b1 ^($b2))
			//-> {$sup1 != null }? ^($sup1 $b1 ^($b2))
			//-> {$inf1 != null }? ^($inf1 $b1 ^($b2))
			//-> {$eg3 != null}? ^($eg3 $b1 ^($b2))
			//-> $b1
	;
binary	:	b1=binary2 b3=binary3?
			//-> {$b3.tree != null}? ^($b3 $b1)
			//-> $b1
	;
	
binary3	:	op=('+'|'-') b2=binary2 b3=binary3?	
			-> {$b3.tree != null}? ^($op $b3 $b2)
			-> ^($op $b2)
	;
	
binary2	:	n1=neg ((mul='*'|div='/') neg)*
			//-> {$mul != null}? ^($mul $n1 ^($n2))
			//-> {$div !=null}? ^($div $n1 ^($n2)) 
			//-> $n1
	;

neg	:	minus='-'? a=atom 
			-> {$minus != null}? ^('-' $a) 
			-> $a
	;
	
atom	:	'(' NEWLINE? e=expr_seq? NEWLINE? ')'
			-> {$e.tree != null}? $e
			-> '('')'
	| 	lvalue
	|	INT
	|	STRING	
	;
	
lvalue	:	i=ID (v=lvalue2 | par='(' e=expr_list? ')')?
			-> {$par.text != null && $e.tree != null}? ^(TYPE["function"] $i ^(PARAMSEFF $e)) //Appel de fonction avec params
			-> {$par.text != null}? ^(TYPE["function"] $i) //Appel de fonction sans params
			-> {$v.tree != null}? ^(TAB $i $v)  //Accès tableau ou truc chelou
			-> $i
	;
	
lvalue2 	:	'.' ID lvalue2
	|	'[' e1=expr ']' (val=lvalue2 | o=ofexp e2=expr)?
			->  {$o.text != null}? ^(SIZE $e1) ^(INIT $e2)  //Initialisation de tableau
			-> {$val.tree != null}? ^(CELL $e1) $val //Successio de lval
			-> ^(CELL $e1) //Accès tableau
	;
	
declaration_list :	NEWLINE* d1=declaration (d2=declaration_list)? NEWLINE*
			-> {$d2.tree != null}? $d1 $d2
			-> $d1
;
	
declaration	:	type_declaration
	|	variable_declaration
	|	function_declaration
	;
	
type_declaration
	:	t1=typeexp i=ID '=' t2=type NEWLINE*
			-> ^($t1 $i $t2)
	;
	
type	:	type_id
	|	'{' t=type_fields? '}' 
			-> {$t.tree != null}? ^(STRUCT $t) 
			-> ^(STRUCT PARAM["rien"])
	|	'array of' (t=type_id | i=ID)
			-> {$t.text != null}? ^(TAB $t)
			-> ^(TAB $i)
;
	
variable_declaration
	:	vava=varexp nom=ID ( depoi=':' (typenew=ID | typebase=type_id))? ':=' e=expr NEWLINE*
				-> {$depoi != null && $typenew.text!=null}? ^($vava $nom $typenew $e)
				-> {$depoi != null && $typebase.text!=null}? ^($vava $nom $typebase $e)
				-> ^($vava $nom $e)
	;

function_declaration
	:	fun=functionexp ID '(' par=type_fields? ')' (':' (ty=type_id|i=ID))?  '=' NEWLINE* (e=expr NEWLINE*)+
			-> {$par.text != null && $ty.text != null}? ^($fun ID ^(PARAMSFORM $par) ^(TYPE $ty) ^(BLOCK $e))
			-> {$par.text != null && $i != null}? ^($fun ID ^(PARAMSFORM $par) ^(TYPE $i) ^(BLOCK $e))
			-> {$par.text != null}? ^($fun ID ^(PARAMSFORM $par) ^(BLOCK $e))
			-> {$ty.text != null}? ^($fun ID ^(TYPE $ty) ^(BLOCK $e))
			-> {$i != null}? ^($fun ID ^(TYPE $i) ^(BLOCK $e))
			-> ^($fun ID ^(BLOCK $e))
	;
	
type_fields	:	t1=type_field t2=type_fields2?
			-> {$t2.tree != null}? $t1 $t2
			-> $t1
	;
	
type_fields2	:	',' t1=type_field t2=type_fields2?
			-> {$t2.tree != null}? $t1 $t2
			-> $t1
	;
	
type_field	:	i1=ID ':' (t=type_id|i2=ID)
			-> {$i2.text != null}? ^(PARAM["p"] $i1 $i2)
			-> ^(PARAM["p"]$i1 $t)
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
