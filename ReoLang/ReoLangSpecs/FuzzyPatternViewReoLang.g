lexer grammar FuzzyPatternViewReoLang;
options {filter=true;}

@header{
	package pt.uminho.di.reolang;
	import pt.uminho.di.reolang.parsing.util.*;
	import pt.uminho.di.ap.model.graph.*;
	import pt.uminho.di.ap.model.*;
	import java.util.HashMap;
}

@lexer::members{

	private ArchPatternAbstractGraph graph;
	private HashMap<String, String> replacements = new HashMap<String, String>();
	private ArrayList<String> current_instance_in_ports;
	private ArrayList<String> current_instance_out_ports;
	private String current_type, complete_type;

	private EContext context;
	private SimpleSymbol table;
	
	private String file;
	
	
	//Constructor
	public FuzzyPatternViewReoLang(CharStream input, SimpleSymbol global_table) {
        this(input, new RecognizerSharedState());
        this.table = global_table;
        this.graph = new ArchPatternAbstractGraph();
    }
	
		
	public void setFile(String name){
		this.file = name;
	}
	
	public ArchPatternAbstractGraph getGraph(){
		return this.graph;
	}
	
	
	public HashMap<String, String> getReplacements(){
		return this.replacements;
	}
	
}








//// CONTEXT CONTROLLERS


//Sart context use
USE	
@after{context = EContext.PATTERN_USE;}
	:	'use' WS? ':'
	;
	
//start context in
IN	
@after{context = EContext.PATTERN_IN;}
	:	{context==EContext.PATTERN_USE}? =>
		'in' WS? ':' 
	;





//PATTERNS

PATTERN_NAME
@after{context = EContext.PATTERN;}
	:	'pattern' WS pat_name=ID
	
	{
		graph.setGraphName(pat_name.getText());		
	}
	;




PORTS_IN
	:  	{context == EContext.PATTERN || context == EContext.PATTERN_INSTANCE_DEFINITION }? => 
		'(' WS? port1=ID  
		
	{
		if(context == EContext.PATTERN) {
			graph.addInNode(new Node(port1.getText()));
		}
		else {
			current_instance_in_ports.add(port1.getText());
		}
	}	
		
		(WS? ',' WS? port2=ID 
		
	{
		if(context == EContext.PATTERN) {
			graph.addInNode(new Node(port2.getText()));
		}
		else {
			current_instance_in_ports.add(port2.getText());
		}
	}
	
		)* WS?
	;



PORTS_OUT
	:	{context == EContext.PATTERN || context == EContext.PATTERN_INSTANCE_DEFINITION}? =>
		':' WS? port1=ID 
		
	{
		if(context == EContext.PATTERN) {
			graph.addOutNode(new Node(port1.getText()));
		}
		else {
			current_instance_out_ports.add(port1.getText());
		}
	}
		
		(WS? ',' WS? port2=ID 
		
	{
		if(context == EContext.PATTERN) {
			graph.addOutNode(new Node(port2.getText()));
		}
		else {
			current_instance_out_ports.add(port2.getText());
		}
	}
		
		)* WS? 

	;
	
	
	
USES
@after{context = EContext.PATTERN_INSTANCE_DEFINITION;}
	:	{context == EContext.PATTERN_USE}? =>	
		('(' WS? obs=ID WS? ')')? type=ID
	{
		
		current_type = type.getText() ;
			complete_type = obs!=null? type.getText()+"(" + obs.getText() + ")" : current_type;
		
		this.current_instance_in_ports = new ArrayList<String>(2); 
		this.current_instance_out_ports = new ArrayList<String>(2); 
	} 
	;	
	
	
INSTANCES
@init{	
	SimpleSymbol s = table.getScope().getSymbols().get(current_type); 
	Type type =  s != null ? s.getType() : Type.NULL;
}
@after{context=EContext.PATTERN_USE;}
	:	{context == EContext.PATTERN_INSTANCE_DEFINITION}? => 	
		'as' WS inst1=ID  
	
	{
		
		if(type==Type.CHANNEL){
			switch(current_instance_in_ports.size()){
				case 1 : {graph.addEdge(new Edge(inst1.getText() + "." + current_instance_in_ports.get(0), inst1.getText() + "." + current_instance_out_ports.get(0), true, inst1.getText() + "::" + complete_type)); } break;		
				case 2 : break;
				case 0 : break;
				default : break;
			}
		}
		else {
			ArrayList<String> ports = new ArrayList<String>();
			ports.addAll(current_instance_in_ports);
			ports.addAll(current_instance_out_ports);
			for(String port : ports){
				replacements.put(inst1.getText() + "." + port, inst1.getText()+"::"+complete_type);
			}
		}
	}
	
		(WS? ',' WS? inst2=ID 
		
	{
		if(type==Type.CHANNEL){
			switch(current_instance_in_ports.size()){
				case 1 : {graph.addEdge(new Edge(inst2.getText() + "." + current_instance_in_ports.get(0), inst2.getText() + "." + current_instance_out_ports.get(0), true, inst2.getText() + "::" + current_type)); } break;		
				case 2 : break;
				case 0 : break;
				default : break;
			}
		}
		else {
				ArrayList<String> ports = new ArrayList<String>();
				ports.addAll(current_instance_in_ports);
				ports.addAll(current_instance_out_ports);
				for(String port : ports){
					replacements.put(inst2.getText() + "." + port, inst2.getText() + "::" + complete_type);
				}
		}
	}
		
		)* WS?
	
	
	;
	
	

PORT_DEFINITION1
	:	{context==EContext.PATTERN_IN}? =>
		port=ID WS? '=' WS? p=PORT_ACCESS
		
	{
		if(! replacements.containsKey(p.getText())){
			replacements.put(p.getText(), port.getText());
		}
		else {
			graph.addEdge(new Edge(port.getText(), replacements.get(p.getText()) , false, "" ));
		}
	}	
		
	;
	

PORT_DEFINITION2
	:	{context==EContext.PATTERN_IN}? =>
		port=ID WS? '=' WS? 'join' WS? '[' WS? p1=PORT_ACCESS 
		
	{
		if(! replacements.containsKey(p1.getText())){
			replacements.put(p1.getText(), port.getText());
		}
		else {
			graph.addEdge(new Edge(port.getText(), replacements.get(p1.getText()) , false, "" ));
		}
	}	
		
		(WS? ',' WS? p2=PORT_ACCESS
		
	{
		if(! replacements.containsKey(p2.getText())){
			replacements.put(p2.getText(), port.getText());
		}
		else {
			graph.addEdge(new Edge(port.getText(), replacements.get(p2.getText()) , false, "" ));
		}
	}
		
		)* WS? ']'
	;
	
		
JOINS
@init{ArrayList<String> accesses = new ArrayList<String>();}
	:	{context==EContext.PATTERN_IN}? =>
		'join' WS? ('[' WS? p1=PORT_ACCESS 
		
	{
		accesses.add(p1.getText());
	}	
		
		(WS? ',' WS? p2=PORT_ACCESS 
		
	{
		accesses.add(p2.getText());
	}
	
		)* WS? ']' | 'remaining') WS 'as' WS node=ID
		
	{
		for(String s : accesses) {
			if(! replacements.containsKey(s)){
				replacements.put(s, node.getText());
			}
			else {
				graph.addEdge(new Edge(node.getText(), replacements.get(s) , false, "" ));
			}
		}
	}
	;
	
	
	
fragment
PORT_ACCESS
	:	pat=ID '.' port=ID
	;


	

	
fragment
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
    



  
fragment
INT :	'0'..'9'+
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




WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ 
    ;






QUALQUEROUTRACOISA
	: .	
	;
