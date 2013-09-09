parser grammar RL_ChannelParser;

options{
	output=AST;
}

tokens{
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
	| FLOAT				-> ^(TIME FLOAT)
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
	:	normal_flow (flow_operation normal_flow)?
		-> ^(FLOW_TYPE normal_flow (flow_operation normal_flow)?)
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
	:	ID QUESTION_MARK flow_type COLON flow_type
		-> ^(IF_FLOW ID ^(FLOW_TRUE flow_type) ^(FLOW_FALSE flow_type))
	;
			
	
