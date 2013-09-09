lexer grammar FuzzyParserReoLang;
options {filter=true;}

@header{
	package pt.uminho.di.reolang;
	import pt.uminho.di.reolang.parsing.util.*;
}

@lexer::members{
	//private boolean importMode = false;
	private SimpleSymbol global_symbol = new SimpleSymbol("#GLOBAL#", Type.NULL, 0, 0, "", null, null);
	private SimpleSymbolsTable global_table = global_symbol.getScope();
	private SimpleSymbolsTable current_scope;
	private SimpleSymbolsTable current_instance_type;
	private String current_id;
	private SimpleSymbol instance_type;
	
	
	private EContext context;
	private String file;
	
	public SimpleSymbol getGlobalSymbol(){
		return this.global_symbol;
	}

	public SimpleSymbolsTable getGlobalTable(){
		return this.global_table;
	}
	
	public void setFile(String name){
		this.file = name;
	}
	
	private void flush_symbols() {
		if(this.current_scope != null){
			((SimpleSymbol)this.global_table.getSymbols().get(this.current_id)).setScope(this.current_scope);
			this.current_scope = null;
		}
	}
}











//// CONTEXT CONTROLLERS


//Sart context use
USE	
@after{context = EContext.PATTERN_USE; }
	:	'use' WS? ':' 
	;
	
//start context in
IN	
@after{context = EContext.PATTERN_IN; }
	:	'in' WS? ':'
	;


JOIN
	:	'join'
	;
	
	
//FINISH any context
EXIT_TO_DEFAULT_CONTEXT
@after{context = EContext.NONE; flush_symbols(); this.current_instance_type = null; }
	:	'}'
	;






IMPORT
@init	{context = EContext.IMPORT;}
@after	{context = EContext.NONE;}
	: 	'import' WS file=FILE_PATH 
	{System.out.println("IMPORT: " + file.getText());}
	;
	
	
	

CHANNEL_NAME
@after{context=EContext.CHANNEL; }
	:	'channel' WS channel_name=ID 
	
	{
		//System.out.println("CANAL: " + channel_name.getText());
		//set the symbols table to the global element and erase the current scope
		flush_symbols();

		SimpleSymbol current_symbol = new SimpleSymbol(channel_name.getText(),Type.CHANNEL,channel_name.getStartIndex(),channel_name.getStopIndex(),this.file, null, global_symbol);
		global_table.put(channel_name.getText(), current_symbol);

		this.current_id = channel_name.getText();
		//set a new symbol table for use
		current_scope = current_symbol.getScope();
	}
	;



EXTENSION
	:	{context==EContext.CHANNEL}? => 
		'extends' WS channel_name=ID
	{
		//System.out.println("EXTENSAO: " + channel_name.getText());
		current_scope.put(channel_name.getText(), new SimpleSymbol(channel_name.getText(), Type.EXTENSION, channel_name.getStartIndex(), channel_name.getStopIndex(), this.file, null, (SimpleSymbol)global_table.getSymbols().get(current_id)) );
	}
	;
	
	
STATE
	:	{context==EContext.CHANNEL}? =>	
		'state' WS? ':' WS? state_name=ID
	{
		//System.out.println("ESTADO: " + state_name.getText());
		current_scope.put( state_name.getText(), new SimpleSymbol( state_name.getText(), Type.STATE, state_name.getStartIndex(), state_name.getStopIndex(), this.file, null, (SimpleSymbol)global_table.getSymbols().get(current_id)) );
	}
	;
	
OBSERVERS
	:	{context==EContext.CHANNEL}? => //'observers' WS? ':' WS? obs_name1=ID WS? (',' WS? obs_name2=ID WS?)*	
		'observers' WS? ':' WS? obs_name1=ID 
	
	{
		current_scope.put(obs_name1.getText(), new SimpleSymbol(obs_name1.getText(), Type.OBSERVER, obs_name1.getStartIndex(), obs_name1.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
	}
	
		WS? (',' WS? obs_name2=ID 	
	
	{
		current_scope.put(obs_name2.getText(), new SimpleSymbol(obs_name2.getText(), Type.OBSERVER, obs_name2.getStartIndex(), obs_name2.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
	}
	
		WS?)*
	;
	
	
			
TIME
	:	{context==EContext.CHANNEL || context==EContext.PATTERN_USE}? =>
		'@' WS? (time=ID|INT)
	{
	//System.out.println("TEMPO");
		if(time!=null){
			current_scope.put(time.getText(), new SimpleSymbol(time.getText(), Type.TIME, time.getStartIndex(), time.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
		}
	}
	;
	
STRUCTURE
	:	{context==EContext.CHANNEL || context==EContext.PATTERN_USE}? => //'~' WS? (dim1=ID|INT) WS? ( ',' WS? (dim2=ID|INT) WS?)*
			
		'~' WS? (dim1=ID|INT) 
		
	{
		if(dim1!=null){
			current_scope.put(dim1.getText(), new SimpleSymbol(dim1.getText(), Type.STRUCTURE, dim1.getStartIndex(), dim1.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
		}
	}	
		
		WS? ( ',' WS? (dim2=ID|INT) 
		
	{
		if(dim2!=null){
			current_scope.put( dim2.getText(), new SimpleSymbol(dim2.getText(), Type.STRUCTURE, dim2.getStartIndex(), dim2.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
		}
	}		
		
		WS?)*
		
	;

CONDITION
	:	{context==EContext.CHANNEL || context==EContext.PATTERN_USE}? =>
		':' WS? cond_name=ID WS? '=' WS? '<' //WS? ID  WS? ( ',' WS? ID WS?)* '>'
	{
		//System.out.println("CONDICAO: " + cond_name.getText());
		current_scope.put( cond_name.getText(), new SimpleSymbol(cond_name.getText(), Type.CONDITION, cond_name.getStartIndex(), cond_name.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
	}
	;



PORTS_IN
	: 	{context==EContext.CHANNEL || context==EContext.PATTERN || context==EContext.PATTERN_INSTANCE_DEFINITION}? => //'(' WS? port1=ID (WS? ',' WS? port2=ID)* 
		'(' WS? port1=ID 
		
	{
		if(context==EContext.PATTERN_INSTANCE_DEFINITION){
			current_instance_type.put( port1.getText(), new SimpleSymbol(port1.getText(), Type.IN_PORT, port1.getStartIndex(), port1.getStopIndex(), this.file,null, instance_type));
		}
		else{
			current_scope.put( port1.getText(), new SimpleSymbol(port1.getText(), Type.IN_PORT, port1.getStartIndex(), port1.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
		}	
	}	
		
		(WS? ',' WS? port2=ID
		
	{
		if(context==EContext.PATTERN_INSTANCE_DEFINITION){
			current_instance_type.put( port2.getText(), new SimpleSymbol(port2.getText(), Type.IN_PORT, port2.getStartIndex(), port2.getStopIndex(), this.file,null, instance_type));
		}
		else{
			current_scope.put( port2.getText(), new SimpleSymbol(port2.getText(), Type.IN_PORT, port2.getStartIndex(), port2.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
		}
	}	
		
		)* WS?
	
	;



PORTS_OUT
	:	{context==EContext.CHANNEL || context==EContext.PATTERN || context==EContext.PATTERN_INSTANCE_DEFINITION}? => //':' WS? port1=ID (WS? ',' WS? port2=ID)*  
		':' WS? port1=ID 
		
	{
		if(context==EContext.PATTERN_INSTANCE_DEFINITION){
			current_instance_type.put(port1.getText(), new SimpleSymbol(port1.getText(), Type.OUT_PORT, port1.getStartIndex(), port1.getStopIndex(), this.file,null, instance_type));
		}
		else{
			current_scope.put(port1.getText(), new SimpleSymbol(port1.getText(), Type.OUT_PORT, port1.getStartIndex(), port1.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
		}	
	}	
		
		(WS? ',' WS? port2=ID
		
	{
		if(context==EContext.PATTERN_INSTANCE_DEFINITION){
			current_instance_type.put(port2.getText(), new SimpleSymbol(port2.getText(), Type.OUT_PORT, port2.getStartIndex(), port2.getStopIndex(), this.file,null, instance_type)	);
		}
		else{
			current_scope.put(port2.getText(), new SimpleSymbol(port2.getText(), Type.OUT_PORT, port2.getStartIndex(), port2.getStopIndex(), this.file,null, (SimpleSymbol)global_table.getSymbols().get(current_id)));
		}
	}	
		
		)* WS? 

	;
	

FLOW_REQUESTS
@after{flush_symbols(); context=EContext.FLOW_DEFS;}
	:	{context==EContext.CHANNEL}? =>
		('!' WS?)? req=ID (WS? ',' WS? ('!' WS?)? ID)* WS? '->'
	{
		//System.out.println("REQUESTS 1a: " + req.getText());
	}
	;
	
FLOW
@after{flush_symbols();}
	:	{context==EContext.FLOW_DEFS}? =>
		'flow' WS p1=ID WS 'to' (WS? '@' WS? (time=ID|time=INT))? WS p2=ID
	{
		//System.out.println("FLOW: " +p1.getText() + " to " + p2.getText() + (time!=null? " by " + time.getText() : "") );
	}
	; 	
	
	
	
	
	

//PATTERNS

PATTERN_NAME
@after{context=EContext.PATTERN; }
	:	'pattern' WS pat_name=ID
	
	{
		//System.out.println("PATTERN: " + pat_name.getText());
		//set the symbols table to the global element and erase the current scope
		flush_symbols();
		SimpleSymbol current_symbol = new SimpleSymbol(pat_name.getText(),Type.PATTERN,pat_name.getStartIndex(),pat_name.getStopIndex(),this.file, null, global_symbol);
		this.global_table.put(pat_name.getText(), current_symbol );
		this.current_id = pat_name.getText();
		//set a new symbol table for use
		current_scope = current_symbol.getScope();
	}
	;
	
	
USES
@after{context=EContext.PATTERN_INSTANCE_DEFINITION;}
	: 	{context==EContext.PATTERN_USE}? => 
		('(' WS? obs=ID WS? ')')? type=ID 
	{
		//System.out.println("TYPE: " + type.getText() + (obs!=null? " OBS: " + obs.getText() : "" ));
		current_instance_type = new SimpleSymbolsTable();
		if(obs!=null){
			current_instance_type.put(obs.getText(), new SimpleSymbol(obs.getText(), Type.OBSERVER, obs.getStartIndex(), obs.getStopIndex(), this.file,null,null));
		}
		current_instance_type.put(type.getText(), new SimpleSymbol(type.getText(), Type.TYPE, type.getStartIndex(), type.getStopIndex(), this.file,null, null));
		
	}
	;	
	
	
INSTANCES
@after{context=EContext.PATTERN_USE;}
	:	{context==EContext.PATTERN_INSTANCE_DEFINITION}? => //'as' WS inst1=ID (WS? ',' WS? inst2=ID )*
		'as' WS inst1=ID 
		
	{
		current_scope.put(inst1.getText(), new SimpleSymbol(inst1.getText(), Type.INSTANCE, inst1.getStartIndex(), inst1.getStopIndex(), this.file, new SimpleSymbolsTable(this.current_instance_type), (SimpleSymbol)global_table.getSymbols().get(current_id)));
	}	
		
		(WS? ',' WS? inst2=ID 
		
	{
		current_scope.put(inst2.getText(), new SimpleSymbol(inst2.getText(), Type.INSTANCE, inst2.getStartIndex(), inst2.getStopIndex(), this.file, new SimpleSymbolsTable(this.current_instance_type), (SimpleSymbol)global_table.getSymbols().get(current_id)));
	}	
		
		)* WS?
		
		//TODO
		//verify if it is necessary to clean current_instance_type?
	;
	
	

PORT_DEFINITION
	:	{context==EContext.PATTERN_IN}? =>
		port=ID WS? '='
	{
		//System.out.println("DEFINING PORT: " + port.getText() );
	}
	;
	
PORT_ACCESS
	:	{context==EContext.PATTERN_IN}? =>
		pat=ID '.' port=ID
	{
		//System.out.println("PORT ACCESS: " + pat.getText() + "." + port.getText());
	}
	;
	
JOINS
	:	(']' | 'remaining') WS 'as' WS node=ID
	{
		//System.out.println("INTERNAL NODE: " + node.getText());
	
		current_scope.put(node.getText(), new SimpleSymbol(node.getText(), Type.NODE, node.getStartIndex(), node.getStopIndex(), this.file, null, (SimpleSymbol)global_table.getSymbols().get(current_id)));		
	}
	;
	
	



	
FILE_PATH
	:	{context==EContext.IMPORT}? => STRING
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
