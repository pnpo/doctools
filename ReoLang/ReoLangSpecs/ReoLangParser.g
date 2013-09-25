parser grammar ReoLangParser;

options{
	tokenVocab=ReoLangLexer;
	output=AST;
	k = 2; //GRAMMAR IS LL(2) IN PATTENERNS DEFINITION
}

tokens{
	REO_LANG;
	ELEMENT;
	DIRECTIVE;
	IMPORT;
	CHANNEL;
	SIGNATURE;
	OPTION;
	TIMED;
	TIME;
	STRUCTURED;
	DIMENSION;
	CHANNEL_PORTS;
	IN_PORTS;
	OUT_PORTS;
	PORT;
	CONDITION;
	COND_ELEMENTS;
	EXTENSION;
	CHANNEL_BODY;
	FLOWS;
	CHANNEL_STATE;
	STATE_REF;
	STATE_OBS;
	FLOW;
	REQUESTS;
	REQUEST;
	FLOW_TYPE;
	NORMAL_FLOW;
	FLOW_POINT;
	FLOW_OP;
	IF_FLOW;
	FLOW_TRUE;
	FLOW_FALSE;
	PATTERN;
	PATTERN_SIGNATURE;
	PATTERN_PORTS;
	PATTERN_BODY;
	PATTERN_DECLARATIONS;
	DECLARATION;
	INSTANCES;
	DECLARATION_TYPE;
	PATTERN_COMPOSITIONS;
	PORT_DEFINITION;
	PORT_ACTUAL_DEFINITION;
	PORT_ACCESS;
	JOIN_OP;
	PORT_ACCESS_LIST;
	STOCH;
}

@header{
	package pt.uminho.di.reolang;
	import java.text.*;
	import java.util.Date;
	import pt.uminho.di.reolang.parsing.util.Error;
	import pt.uminho.di.reolang.parsing.util.ErrorType;
}

@members{
	private ArrayList<Error> syntax_errors = new ArrayList<Error>();
	private String file_path;
	
	public void emitErrorMessage(String msg) {
        syntax_errors.add(new Error(ErrorType.ERROR, msg, this.file_path));
    }
	
	//Notice the access to the errors of the imported grammars
	public ArrayList<Error> getErrors() {
		return this.syntax_errors;
	}
	
	public String getFilePath() {
		return this.file_path;
	}

	public void setFilePath(String file) {
		this.file_path = file;
	}
}



//RULES

reolang 
	:	directive_def* element* -> ^(REO_LANG directive_def* element*)
	;
	
element
	:	channel_def		-> ^(ELEMENT channel_def)
	|	pattern_def		-> ^(ELEMENT pattern_def)
	//|	stochastic_def		-> ^(ELEMENT stochastic_def)
	;





directive_def
	:	directive_import -> ^(DIRECTIVE directive_import)
	;

	
directive_import
	:	RW_IMPORT FILE_PATH SEMICOLON -> ^(IMPORT FILE_PATH) 
	;












channel_def
	:	RW_CHANNEL channel_signature extension? BODY_OPEN channel_body BODY_CLOSE
		-> ^(CHANNEL channel_signature extension? channel_body) 
	;


	
channel_signature
	:	ID option? PORTS_OPEN in=ports? COLON out=ports? (COLON ID EQUALS condition)? PORTS_CLOSE
		-> ^(SIGNATURE ID option? ^(CHANNEL_PORTS (^(IN_PORTS $in))? (^(OUT_PORTS $out))?) (^(CONDITION ID condition))?)
	;


option
	:	timed		-> ^(OPTION timed)
	|	structured	-> ^(OPTION structured)
	;


timed
	:	TIME_MARK time
		-> ^(TIMED time)
	;

	
time
	: ID 				-> ^(TIME ID)
	| INT				-> ^(TIME INT)
	;

	
structured
	:	STRUCTURE_MARK structure_dimension (COMMA structure_dimension)*
		-> ^(STRUCTURED structure_dimension+)
	;

	
structure_dimension 
	: ID				-> ^(DIMENSION ID)
	| INT				-> ^(DIMENSION INT)
	;


ports
	:	ID (COMMA ID)* 	-> ^(PORT (ID)+)
	;

	
condition
	:	COND_OPEN ID (COMMA ID)* COND_CLOSE	-> ^(COND_ELEMENTS ID+)
	;

	
extension
	:	RW_EXTENDS ID	-> ^(EXTENSION ID)
	;

	
channel_body
	:	state_def? flow_def SEMICOLON (flow_def SEMICOLON)*
		->	^(CHANNEL_BODY state_def? ^( FLOWS flow_def+))
	;

	
state_def
	:	RW_STATE COLON ID SEMICOLON RW_OBSERVERS COLON ID (COMMA ID)* SEMICOLON
		-> ^(CHANNEL_STATE ^(STATE_REF ID) ^(STATE_OBS ID+) )
	;

	
flow_def
	:	requests ARROW_MARK flow_type 	-> ^(FLOW requests flow_type)
	;


	
requests
	:	request (COMMA request)*	-> ^(REQUESTS request+)	
	;

	
request
	:	ID	-> ^(REQUEST ID)
	|	NOT_MARK ID -> ^(REQUEST NOT_MARK ID)
	;

	
flow_type
	:	normal_flow (flow_operation normal_flow)? flow_label?
		-> ^(FLOW_TYPE normal_flow (flow_operation normal_flow)? flow_label?)
	|	if_flow
		-> ^(FLOW_TYPE if_flow)
	;

	
normal_flow
	:	RW_FLOW flow_point RW_TO timed? flow_point
		-> ^(NORMAL_FLOW flow_point timed? flow_point)
	;

	
flow_point 
	:	ID 			-> ^(FLOW_POINT ID)
	| 	RW_NULL		-> ^(FLOW_POINT RW_NULL)
	;

flow_operation
	:	OP_SYNC		-> ^(FLOW_OP OP_SYNC)
	;

	
if_flow
	:	ID QUESTION_MARK flow_type f1=flow_label? COLON flow_type f2=flow_label?
		-> ^(IF_FLOW ID ^(FLOW_TRUE flow_type $f1?) ^(FLOW_FALSE flow_type $f2?))
	;

	
	
flow_label 
	:	LABEL_MARK ID
		-> ID
	;











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
	:	reference_signature RW_AS instances
		-> ^(DECLARATION reference_signature instances)
	;
	
reference_signature
	:	(PORTS_OPEN ID PORTS_CLOSE)? channel_signature
		-> ^(DECLARATION_TYPE ID? channel_signature) 
	;
	
instances
	:	i1=ID s1=stochastic_values? (COMMA i2=ID s2=stochastic_values?)*
		-> ^(INSTANCES ID $s1? (ID $s2?)* )
	;	


stochastic_values
	:	BODY_OPEN ID LABEL_MARK FLOAT (COMMA ID LABEL_MARK FLOAT)* BODY_CLOSE
		-> ^(STOCH (ID FLOAT)+ )
	;

pattern_compositions 
	: 	port_definition SEMICOLON (port_definition SEMICOLON)* (join_operation SEMICOLON (join_operation SEMICOLON)* )?
		-> ^(PATTERN_COMPOSITIONS port_definition+ join_operation*)
	;
	
port_definition
	:	ID EQUALS port_actual_definition
		-> ^(PORT_DEFINITION ID port_actual_definition)
	;
	
port_actual_definition
	: 	port_access	-> ^(PORT_ACTUAL_DEFINITION port_access)
	| 	join_part	-> ^(PORT_ACTUAL_DEFINITION join_part)
	;

port_access
	:	ID ACCESS_MARK ID
		-> ^(PORT_ACCESS ID ID)
	;
	
join_operation
	:	join_part RW_AS ID
		-> ^(JOIN_OP ID join_part )
	;
	
join_part
	: 	RW_JOIN port_access_list	
		-> ^(RW_JOIN port_access_list)
	| 	RW_DECIDE special_port_access_list
		-> ^(RW_DECIDE special_port_access_list)
		
	;	 
	
port_access_list
	:	LIST_OPEN port_access (COMMA port_access)* LIST_CLOSE
		-> ^(PORT_ACCESS_LIST port_access+)
	//|	RW_REMAINING
	//	-> ^(PORT_ACCESS_LIST RW_REMAINING)
	;
	
special_port_access_list
	:	LIST_OPEN p1=port_access COLON p2=port_access COMMA p3=port_access (COMMA p4=port_access)* LIST_CLOSE
		-> ^(PORT_ACCESS_LIST $p1 $p2 $p3 $p4*)
	;
	
	
	
	
	

/*stochastic_def
	:	RW_STOCHASTIC i1=ID TIME_MARK BODY_OPEN stochastic_list BODY_CLOSE RW_AS i2=ID
		-> ^(RW_RUN $i1 $i2 stochastic_list)
	;
	
stochastic_list
	:	(i1=ID (LABEL_MARK i2=ID)? EQUALS FLOAT SEMICOLON)+
		-> ^(STOCH ($i1 $i2? FLOAT)+ )
	;
*/
