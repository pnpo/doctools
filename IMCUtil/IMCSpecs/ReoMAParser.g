grammar ReoMAParser;

@lexer::header {
	package pt.uminho.di.imc.reo.parsing;
}


@header{
	package pt.uminho.di.imc.reo.parsing;
	import pt.uminho.di.imc.reo.*;
	import pt.uminho.di.imc.util.Pair;
	import java.util.HashSet;
	import java.util.LinkedList;
}


@members{
	private IMCREOimc<IMCREOState> imc;
	
	public IMCREOimc<IMCREOState> getIMC(){
		return this.imc;
	}
}


imc
@init {
	this.imc = new IMCREOimc<IMCREOState>();
}
	:	'#PORTS' port_relations? '#INITIALS' initial_state '#GOALS' goal_states '#TRANSITIONS' transitions
	;

port_relations 
@init{
	String p1="", p2="";
}
	:	(
		'(' bfr=ID ( '#' {p1 += "#";} )? ',' aft=ID  ( '#' {p2 += "#";} )? ')' 
	{
		this.imc.getPoset().addSinglePOSet(new Pair<String, String>($bfr.text + p1, $aft.text + p2));
	}
		)+
	;
	
	
initial_state
	:	state 
	{
		this.imc.setInitial_state($state.value);
	}
	;




goal_states
@init{
	HashSet<IMCREOState> goals = new HashSet<IMCREOState>();
}
	: ( state 
	{
		//goals.add($state.value);
	}
	)+
	{
		//this.imc.setFinal_states(goals);
	}
	;



	
transitions
@init{
	LinkedList<IMCREOTransition<IMCREOState>> trans = new LinkedList<IMCREOTransition<IMCREOState>>();
}
	:	(state transition_label (transition_edge[$transition_label.type, $transition_label.actions]
	{
		trans.add($transition_edge.transition);
	}
	)+ 
	{
		if(this.imc.getChain().containsKey($state.value)){
			this.imc.getChain().get($state.value).addAll(trans);
		}
		else{
			this.imc.getChain().put($state.value, trans);	
		}
		trans = new LinkedList<IMCREOTransition<IMCREOState>>();
	}
	)+
	;




transition_label returns [String type, IMCREOAction actions]
	:	actions 
	{
		$transition_label.type = "INTERACTIVE";
		$transition_label.actions = $actions.actions;
	}
	|	'!'
	{
		$transition_label.type = "MARKOVIAN";
		$transition_label.actions = null;
	}
	;




transition_edge [String in_type, IMCREOAction in_action] returns [IMCREOTransition transition]
@init{
	IMCREOTransition<IMCREOState> t;
}	
	:	'*' state rate ('@' ID '@')?
	{
		if($transition_edge.in_type.equals("INTERACTIVE")){
			t = new IMCREOInteractiveTransition<IMCREOState>($state.value, in_action);
		}
		else {
			t = new IMCREOMarkovianTransition<IMCREOState>($state.value, $rate.value, $ID.text);	
		}
		
		$transition_edge.transition = t;
	}
	;




state returns [IMCREOState value]
@init{
	IMCREOState st = new IMCREOState();
	String bs = null;
}

	: 	requests 
	{
		st.setRequests($requests.reqset);
	}
	(transmissions
	{
		st.setTransmissions($transmissions.transset);
	}
	)? 
	('#' {bs="#"; st.getBuffer().add(IMCREOBufferState.FULL);} 
	|'&' {bs="&"; st.getBuffer().add(IMCREOBufferState.EMPTY);} 
	)*
	{
		if(bs==null){st.getBuffer().add(IMCREOBufferState.NONE);}
		$state.value = st;
	}
	;
	

	
requests returns [HashSet<String> reqset]
@init{
	HashSet<String> reqs = new HashSet<String>();
}
	:	'[' (ID 
	{
		reqs.add($ID.text);
	}
	)* ']'
	{
		$requests.reqset = reqs;
	}
	;
	


transmissions returns [HashSet<String> transset]
@init{
	HashSet<String> trans = new HashSet<String>();
}
	:	'{' (ID 
	{
		trans.add($ID.text);
	}
	)+ '}'
	{
		$transmissions.transset = trans;
	}
	;



actions returns [IMCREOAction actions]
	: actions_sync {$actions.actions = new IMCREOAction($actions_sync.actionset);}
	;
	


actions_sync returns [HashSet<String> actionset]
@init{
	HashSet<String> acts = new HashSet<String>();
}
	:	'<' (ID
	{
		acts.add($ID.text);
	}
	)* '>'
	{
		$actions_sync.actionset = acts;
	}
	;
	

	
rate returns [Double value]
	:	NUMBER
	{
		$rate.value = Double.parseDouble($NUMBER.text);
	}
	;
	
	
	

NUMBER
	:	('0'..'9')+
	| FLOAT
	;


ID  :	('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$'|'|')*
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

