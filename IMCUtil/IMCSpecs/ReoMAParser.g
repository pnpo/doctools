grammar ReoMAParser;

@lexer::header {
	package pt.uminho.di.imc.reo.parsing;
}


@header{
	package pt.uminho.di.imc.reo.parsing;
	import pt.uminho.di.imc.reo.imc.*;
	import pt.uminho.di.imc.util.Pair;
	import java.util.LinkedHashSet;
	import java.util.LinkedList;
}


@members{
	private IMCREOimc imc;
	
	public IMCREOimc getIMC(){
		return this.imc;
	}
}


imc
@init {
	this.imc = new IMCREOimc();
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
	LinkedHashSet<IMCREOState> goals = new LinkedHashSet<IMCREOState>();
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
	LinkedList<IMCREOTransition> trans = new LinkedList<IMCREOTransition>();
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
		trans = new LinkedList<IMCREOTransition>();
	}
	)+
	;




transition_label returns [String type, LinkedHashSet<String> actions]
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




transition_edge [String in_type, LinkedHashSet<String> in_action] returns [IMCREOTransition transition]
@init{
	IMCREOTransition t;
}	
	:	'*' state rate ('@' LABEL '@')?
	{
		if($transition_edge.in_type.equals("INTERACTIVE")){
			t = new IMCREOInteractiveTransition($state.value, in_action);
		}
		else {
			t = new IMCREOMarkovianTransition($state.value, $rate.value, $LABEL.text == null ? "" : $LABEL.text);	
		}
		
		$transition_edge.transition = t;
	}
	;




state returns [IMCREOState value]
@init{
	IMCREOState st = new IMCREOState();
	String bs = null;
	String state_id = "";
}

	: 	requests 
	{
		state_id = $requests.reqset;
	}
	(transmissions
	{
		state_id = ( state_id.equals("E") && ! $transmissions.transset.equals("") ) ? $transmissions.transset : state_id + $transmissions.transset;
	}
	)? 
	('#' {bs="#"; st.getBuffer().add(IMCREOBufferState.FULL);} 
	|'&' {bs="&"; st.getBuffer().add(IMCREOBufferState.EMPTY);} 
	)*
	{
		
		if(bs==null){st.getBuffer().add(IMCREOBufferState.NONE);}
		st.setId(state_id);
		$state.value = st;
	}
	;
	

	
requests returns [String reqset]
@init{
	String reqs = "";
}
	:	'[' (ID 
	{
		reqs += $ID.text + ",";
	}
	)* ']'
	{
		$requests.reqset = reqs.length() == 0 ? "E" : "[" + reqs.substring(0,reqs.length()-1) + "]";
	}
	;
	


transmissions returns [String transset]
@init{
	String trans = "{";
}
	:	'{' (ID 
	{
		trans += $ID.text + ",";
	}
	)+ '}'
	{
		$transmissions.transset = trans.substring(0,trans.length()-1) + "}";
	}
	;



actions returns [LinkedHashSet<String> actions]
	: actions_sync 
	{
		$actions.actions = $actions_sync.actionset;
	}
	;
	


actions_sync returns [LinkedHashSet<String> actionset]
@init{
	LinkedHashSet<String> acts = new LinkedHashSet<String>();
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


ID  :	('a'..'z'|'0'..'9'|'_'|'$') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$'|'|')*
    ;


LABEL  
	:	('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'['|']'|',')*
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

