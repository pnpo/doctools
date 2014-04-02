grammar IMCREOScriptParser;

@lexer::header {
	package pt.uminho.di.imc.reo.parsing;
}


@header{
	package pt.uminho.di.imc.reo.parsing;
	import pt.uminho.di.imc.reo.imc.*;
	import pt.uminho.di.imc.util.Pair;
	import java.util.LinkedHashSet;
	import java.util.LinkedList;
}


@members{
}


script 
	:	element+ environment+
	;

element	:	channel 
	| 	node
	;
	
channel	:	'sync_' identification stoch
	|	'drain_' identification stoch
	|	'lossy_' identification stoch stoch
	|	'fifo1e_' identification stoch stoch
	|	'fifo1f_' identification stoch stoch
	;
	
identification
	:	 id=ID p1=ID p2=ID
	;

stoch 	:	 NUMBER
	;
	
node	:	'mer_rep' identification2 (stoch stoch)?
	|	'mer_xor' identification2 (stoch stoch)?
	;
	
identification2
	:	'[' ID+']' '[' ID+']'
	;
	
environment 
	:	'env' ID stoch
	;
	

	
	
	

NUMBER
	:	('0'..'9')+
	| FLOAT
	;


ID  :	('a'..'z'|'0'..'9'|'_'|'$') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$'|'|')*
    ;


LABEL  
	:	('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'['|']'|','|'|')*
    	;

fragment
FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n'
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

