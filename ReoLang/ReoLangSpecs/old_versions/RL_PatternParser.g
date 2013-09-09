parser grammar RL_PatternParser;

options{
	output=AST;
}

tokens{
	PATTERN;
	PATTERN_SIGNATURE;
	PATTERN_PORTS;
	PATTERN_BODY;
	PATTERN_DECLARATIONS;
	DECLARATION;
	DECLARATION_TYPE;
	PATTERN_COMPOSITIONS;
	PORT_DEFINITION;
	PORT_ACCESS;
	JOIN_OP;
	PORT_ACCESS_LIST;
}


@members{
	private String syntaxe_errors = "";
	
	public void emitErrorMessage(String msg) {
        syntaxe_errors += Error.report(ErrorType.ERROR, msg);
    }
	
	public String getErrors() {
		return syntaxe_errors;
	}
}

pattern_def 
	:	RW_PATTERN pattern_signature BODY_OPEN pattern_body BODY_CLOSE 
		-> ^(PATTERN pattern_signature pattern_body) 
	;
	
pattern_signature
	:	ID PORTS_OPEN in=ports? COLON out=ports? PORTS_CLOSE
		-> ^(PATTERN_SIGNATURE ID ^(PATTERN_PORTS (^(IN_PORTS $in))? (^(OUT_PORTS $out))? ) )
	;
	
pattern_body
	:	RW_USE COLON pattern_declarations RW_IN COLON pattern_compositions
		-> ^(PATTERN_BODY pattern_declarations pattern_compositions)
	;
	
pattern_declarations
	:	declaration SEMICOLON (declaration SEMICOLON)*
		-> ^(PATTERN_DECLARATIONS declaration+)
	;
	
declaration 
	:	INT RW_OF reference_signature RW_AS ID
		-> ^(DECLARATION INT reference_signature ID)
	;
	
reference_signature
	:	(PORTS_OPEN ID PORTS_CLOSE)? channel_signature
		-> ^(DECLARATION_TYPE ID? channel_signature) 
	;
	
pattern_compositions 
	: 	port_definition SEMICOLON (port_definition SEMICOLON)* join_operation SEMICOLON (join_operation SEMICOLON)*
		-> ^(PATTERN_COMPOSITIONS port_definition+ join_operation+)
	;
	
port_definition
	:	ID EQUALS port_access
		-> ^(PORT_DEFINITION ID port_access)
	;

port_access
	:	ID APOST_MARK INT APOST_MARK ID
		-> ^(PORT_ACCESS ID INT ID)
	;
	
join_operation
	:	RW_JOIN port_access_list
		-> ^(JOIN_OP port_access_list)
	;
	
port_access_list
	:	LIST_OPEN port_access (COMMA port_access)* LIST_CLOSE
		-> ^(PORT_ACCESS_LIST port_access+)
	|	RW_REMAINING
		-> ^(PORT_ACCESS_LIST RW_REMAINING)
	;

