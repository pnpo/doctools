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
		
RW_MAIN
	:	'main'
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
	
DT_XOR
	: 	'Xor'
	;
	
DT_SET
	:	'Set'
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
	: 	'remove'
	;
	
OP_CONST
	: 	'const'
	;
		
OP_ID
	: 	'id'
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
	
OP_IN
	:	'in'
	;

OP_OUT
	:	'out'
	;
	
OP_NAME
	:	'name'
	;

OP_ENDS
	:	'ends'
	;
	
OP_NODES
	:	'nodes'
	;
	
OP_NAMES
	:	'names'
	;
	
OP_CHANNELS
	:	'channels'
	;
	
OP_READ
	:	'read'
	;
	
OP_WRITE
	:	'write'
	;
	
	
// binary operations

OP_APPLY
	:	'@'
	;

OP_UNION
	: 	'+'
	;

OP_INTERSECTION
	:	'&'
	;
	
OP_MINUS
	:	'-'
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
	:	'$'
	;
	
SEP_LIST_START
	:	'['
	;
	
SEP_LIST_END
	:	']'
	;
	
SEP_SUBTYPE_START
	: 	'<'
	;
	
SEP_SUBTYPE_END
	:	'>'
	;

SEP_ACCESSOR
	:	'.'
	;
	
SEP_STRUCTURE
	:	'#'
	;

//Constructors

CONS_PAIR
	:	'P'
	;
	
CONS_TRIPLE
	:	'T'
	;

CONS_SET
	:	'S'
	;

CONS_NODE
	:	'N'
	;
	
CONS_XOR
	:	'X'
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


