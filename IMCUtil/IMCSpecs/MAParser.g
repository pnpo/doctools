grammar MAParser;

@lexer::header {
	package pt.uminho.di.imc.parsing;
}


@header{
	package pt.uminho.di.imc.parsing;
	import pt.uminho.di.imc.*;
}


@members{
	private IMC imc;
	
	public IMC getIMC(){
		return this.imc;
	}
}


imc
@init {
	this.imc = new IMC();
}
	:	'#INITIALS' initial_states '#GOALS' goal_states '#TRANSITIONS' transitions
	;


	
initial_states
	:	( state 
	{
		this.imc.addInitialState($state.name);
	}
	)+ 
	;




goal_states
	: ( state 
	{
		this.imc.addGoalState($state.name);
	}
	)+
	;



	
transitions
	:	(state transition_label (transition_edge[$state.name, $transition_label.label, $transition_label.type])+ 
	{
		this.imc.addState($state.name);
	}
	)+
	;




transition_label returns [String label, String type]
	:	action 
	{
		$transition_label.label = $action.name;
		$transition_label.type = "INTERACTIVE";
	}
	|	'!'
	{
		$transition_label.label = "";
		$transition_label.type = "MARKOVIAN";
	}
	;




transition_edge [String initial_state, String action, String trans_type]
@init{
	Transition t;
}
	:	'*' state rate
	{
		if($transition_edge.trans_type.equals("MARKOVIAN")){
			t = new MarkovianTransition($transition_edge.initial_state, $state.name, $rate.value, "");		
		}
		else {
			t = new InteractiveTransition($transition_edge.initial_state, $state.name, $transition_edge.action);
		}
		
		this.imc.addTransition(t);
		this.imc.addState($state.name);
	}
	;



state returns [String name]
	: 	STATE_ID
	{
		$state.name = $STATE_ID.text;
	}
	| 	NAME
	{
		$state.name = $NAME.text;
	}
	;
	
	
	
	
action returns [String name]
	:	NAME
	{
		$action.name = $NAME.text;
	}
	;
	
	
	
rate returns [Double value]
	:	NUMBER
	{
		$rate.value = Double.parseDouble($NUMBER.text);
	}
	;
	
	
	
	
NAME:	('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z')*
	;

NUMBER
	:	('0'..'9')+
	| FLOAT
	;


STATE_ID  :	('a'..'z'|'A'..'Z'|'0'..'9'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'('|')')*
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

