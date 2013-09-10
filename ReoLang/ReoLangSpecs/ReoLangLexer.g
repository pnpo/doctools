lexer grammar ReoLangLexer;


@header {
	package pt.uminho.di.reolang;
}

@members{
	boolean importMode = false;	
}


//RESERVED WORDS



	
RW_DECIDE
	:	'decide'
	;
	
RW_JOIN
	:	'join'
	;
	
RW_AS
	:	'as'
	;
	
RW_OF
	:	'of'
	;
	
RW_USE
	:	'use'
	;
	
RW_IN
	:	'in'
	;
	
RW_NULL
	:	'NULL'
	;
	
RW_PATTERN
	:	'pattern'
	;
		
RW_EXTENDS
	: 'extends'	
	;
	
RW_FLOW
	:	'flow'
	;
	
RW_TO
	:	'to'
	;
	
RW_OBSERVERS 
	:	'observers'
	;
	
RW_STATE
	:	'state'
	;
	
RW_CHANNEL
	:	'channel'
	;
	
RW_IMPORT
	:	'import' {importMode = true;}
	;
	
	
	
RW_RUN
	: 	'stochastic'
	;


//GENERAL PONCTUATION

LIST_OPEN
	:	'['
	;

LIST_CLOSE
	:	']'
	;
		
EQUALS
	:	'='
	;
	
SEMICOLON
	:	';'
	;
	
COMMA
	:	','
	;

COLON
	:	':'
	;
	
PORTS_OPEN
	:	'('
	;
	
PORTS_CLOSE
	:	')'
	;
	
BODY_OPEN
	:	'{'
	;
	
BODY_CLOSE
	:	'}'
	;
	
ACCESS_MARK
	:	'.'
	;

QUESTION_MARK
	:	'?'
	;
	
NOT_MARK
	:	'!'
	;
	
ARROW_MARK
	:	'->'
	;

LABEL_MARK
	:	'#'
	;
	
STRUCTURE_MARK
	:	'~'
	;
	
TIME_MARK
	:	'@'
	;

OP_SYNC
	:	'|'
	;
	
	
COND_OPEN
	:	'<'
	;
	
COND_CLOSE
	:	'>'
	;
	
	
	
	
// DIRECTIVE SPECIFIC

/*DIRECTIVE_START
	:	'#' {importMode = true;}
	;
	
FILE_OPEN
	:	{importMode}? => '<'
	;
	
FILE_CLOSE
	:	{importMode}? => '>' {importMode=false;}
	;
*/	
FILE_PATH
	:	{importMode}? =>  STRING /*('/'|'./')? FID ('/' FID)*('.' ID)? */{importMode=false;}
	;

/*fragment 	
FID	:	{importMode}? => ID | '..'
	;
*/




ID  
	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
    ;
    

INT :	'0'..'9'+
    ;
    
    
FLOAT	:	INT? '.' INT 
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

fragment
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
