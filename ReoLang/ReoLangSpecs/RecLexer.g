lexer grammar RecLexer;

@header {
	package pt.uminho.di.reolang.reclang;
}


//Reserved words

RW_RECONFIGURATION 
	:	'reconfiguration'
	;
	
RW_FORALL
	:	'forall'
	;
	
RW_IMPORT
	:	'import'
	;
		
	


//DataTypes

DT_PATTERN
	:	'Pattern'
	;
	
DT_CHANNEL
	:	'Channel'
	;
	
DT_NAME
	:	'Name'
	;
	
DT_NODE
	: 	'Node'
	;
	
DT_LIST
	:	'List'
	;
	
DT_PAIR
	:	'Pair'
	;
	
DT_TRIPLE
	:	'Triple'
	;
	

	
//operations

OP_PAR
	:	'par'
	;
	
OP_JOIN
	:	'join'
	;
	
OP_SPLIT
	:	'split'
	;
	
OP_REMOVE
	: 'remove'
	;
	
OP_PATH
	:	'path'
	;
	
OP_UPDATE
	:	'update'
	;
	
OP_FST
	:	'fst'
	;
	
OP_SND
	:	'snd'
	;
	
OP_TRD
	:	'trd'
	;	
	
// binary operations

OP_APPLY
	:	'@'
	;

OP_UNION
	: '+'
	;

OP_INTERSECTION
	:	'&'
	;
	
OP_MINUS
	:	'\\'
	;

OP_EQUAL
	:	'='
	;
	

//Separators

SEP_BLOCK_START
	:	'{'
	;
	
SEP_BLOCK_END
	:	'}'
	;

SEP_COMMA
	:	','
	;
	
SEP_SEMICOLON
	:	';'
	;
	
SEP_COLON
	:	':'
	;
	
SEP_ARGS_START
	:	'('
	;
	
SEP_ARGS_END
	:	')'
	;
	
SEP_OPTIONAL
	:	'!'
	;
	
SEP_TRIGGER
	:	'#'
	;
	
SEP_LIST_START
	:	'['
	;
	
SEP_LIST_END
	:	']'
	;
	
SEP_SUBTYPE_START
	: '<'
	;
	
SEP_SUBTYPE_END
	:	'>'
	;

SEP_ACCESSOR
	:	'.'
	;

//Constructors

CONS_PAIR
	:	'P'
	;
	
CONS_TRIPLE
	:	'T'
	;



ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
    
    
STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;


