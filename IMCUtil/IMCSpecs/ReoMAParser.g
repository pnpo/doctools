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
	:	'#PORTS' port_relations? '#INITIALS' initial_state[$port_relations.ports] '#GOALS' goal_states[$port_relations.ports] '#TRANSITIONS' transitions[$port_relations.ports]
	;

port_relations returns [LinkedHashSet<String> ports]
@init{
	String p1="", p2="";
	LinkedHashSet<String> _ports = new LinkedHashSet<String>();
}
	:	(
		'(' bfr=ID ( '#' {p1 += "#";} )? ',' aft=ID  ( '#' {p2 += "#";} )? ')' 
	{
		this.imc.getPoset().addSinglePOSet(new Pair<String, String>($bfr.text + p1, $aft.text + p2));
		_ports.add($bfr.text);
		_ports.add($aft.text);
	}
		)+
	{
		$port_relations.ports = _ports;
	}
	;
	
	
initial_state[LinkedHashSet<String> ports]
	:	state[$initial_state.ports] 
	{
		this.imc.setInitial_state($state.value);
	}
	;




goal_states[LinkedHashSet<String> ports]
@init{
	LinkedHashSet<IMCREOState> goals = new LinkedHashSet<IMCREOState>();
}
	: ( state [$goal_states.ports] 
	{
		//goals.add($state.value);
	}
	)+
	{
		//this.imc.setFinal_states(goals);
	}
	;



	
transitions [LinkedHashSet<String> ports]
@init{
	LinkedList<IMCREOTransition> trans = new LinkedList<IMCREOTransition>();
}
	:	(state[$transitions.ports] transition_label[$state.value.getInternalState()] (transition_edge[$transition_label.type, 
														$transition_label.actions, 
															$transitions.ports]
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




transition_label[IMCREOBufferState buf_s] returns [String type, LinkedHashSet<String> actions]
	:	actions 
	{
		$transition_label.type = "INTERACTIVE";
		LinkedHashSet<String> actual_actions = $actions.actions;
		if($transition_label.buf_s.equals(IMCREOBufferState.FULL) || $transition_label.buf_s.equals(IMCREOBufferState.EMPTY)){
			actual_actions.add("#");
		}
		$transition_label.actions = actual_actions;
	}
	|	'!'
	{
		$transition_label.type = "MARKOVIAN";
		$transition_label.actions = null;
	}
	;




transition_edge [String in_type, LinkedHashSet<String> in_action, LinkedHashSet<String> ports] returns [IMCREOTransition transition]
@init{
	IMCREOTransition t;
}	
	:	'*' state[$transition_edge.ports] rate ('@' LABEL '@')?
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




state[LinkedHashSet<String> ports] returns [IMCREOState value]
@init{
	IMCREOState st = new IMCREOState();
	IMCREOInternalState is = new IMCREOInternalState();
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
	('#' {bs="#"; st.getBuffer().add(new IMCREOInternalState(IMCREOBufferState.FULL, new LinkedHashSet<String>(ports)));} 
	|'&' {bs="&"; st.getBuffer().add(new IMCREOInternalState(IMCREOBufferState.EMPTY, new LinkedHashSet<String>()));} 
	)*
	{
		
		if(bs==null){st.getBuffer().add(new IMCREOInternalState(IMCREOBufferState.NONE, new LinkedHashSet<String>()));}
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
	:	('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'['|']'|','|'|')*
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

