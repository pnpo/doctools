lexer grammar ReoLangLexer;


@header {
	package pt.uminho.di.reolang;
}

@members{
	boolean importMode = false;
}


//RESERVED WORDS

RW_REMAINING
	:	'remaining'
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
	:	'import'
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
	
APOST_MARK
	:	'\''
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
	:	{!importMode}? => '<'
	;
	
COND_CLOSE
	:	{!importMode}? '>'
	;
	
	
	
	
// DIRECTIVE SPECIFIC

DIRECTIVE_START
	:	'#' {importMode = true;}
	;
	
FILE_OPEN
	:	{importMode}? => '<'
	;
	
FILE_CLOSE
	:	{importMode}? => '>' {importMode=false;}
	;
	
FILE_PATH
	:	{importMode}? => ('/'|'./')? FID ('/' FID)*('.' ID)?
	;

fragment 	
FID	:	{importMode}? => ID | '..'
	;





ID  
	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
    ;
    

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
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
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

