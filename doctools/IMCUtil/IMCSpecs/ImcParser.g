grammar ImcParser;

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
	:	initial_states goal_states? transitions
	;


	
initial_states
	:	( state 
	{
		this.imc.addInitialState($state.name);
	}
	)+ COMMENT 
	;




goal_states
	: ( state 
	{
		this.imc.addGoalState($state.name);
	}
	)+ COMMENT
	;



	
transitions
@init{
	Transition t;
}
	:	(i=state f=state transition_label
	{
		if($transition_label.type.equals("MARKOVIAN")){
			t = new MarkovianTransition($i.name, $f.name, Double.parseDouble($transition_label.label));		
		}
		else {
			t = new InteractiveTransition($i.name, $f.name, $transition_label.label);
		}
		
		this.imc.addTransition(t);
		this.imc.addState($i.name);
		this.imc.addState($f.name);
	}
	)+
	;




transition_label returns [String label, String type]
	:	action 
	{
		$transition_label.label = $action.name;
		$transition_label.type = "INTERACTIVE";
	}
	|	rate
	{
		$transition_label.label = $rate.value;
		$transition_label.type = "MARKOVIAN";
	}
	;





state returns [String name]
	: 	STATE_ID
	{
		$state.name = $STATE_ID.text;
	}
	| NAME 
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
	
	
	
rate returns [String value]
	:	NUMBER
	{
		$rate.value = $NUMBER.text;
	}
	;
	
	
	
	
NAME:	('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z')*
	;

NUMBER
	:	('0'..'9')+
	| FLOAT
	;


STATE_ID  :	('a'..'z'|'A'..'Z'|'0'..'9'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
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

