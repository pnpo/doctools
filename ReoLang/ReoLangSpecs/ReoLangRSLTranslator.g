tree grammar ReoLangRSLTranslator;

options{
	tokenVocab = ReoLangParser;
	ASTLabelType = CommonTree;
	output = template;
}



@header{
	package pt.uminho.di.reolang;
	
	import java.util.HashMap;
}

@members{	
	private void pair_joins(List<StringTemplate> accesses, String id, StringTemplate st, List<StringTemplate> joins, List<String> _nodes_to_hide) {
		String prev_name = "";
		for(int i = 0; i < accesses.size() ; i++) {
			List<StringTemplate> parts = new ArrayList<StringTemplate>();
			if(i==0){
	    			parts.add(accesses.get(i++));
	    			parts.add(accesses.get(i));				
	    			prev_name = id;
	    			st = %rsl_join();
	    			%{st}.join_name=id;
			 	%{st}.join_body= parts;
			 	
			 	joins.add(st);
		 	}
		 	else {
		 		parts.add(accesses.get(i));
	    			parts.add(%{prev_name});				
	    			prev_name = id + "_" + i;
		 		
		 		st = %rsl_join();
	    			%{st}.join_name = prev_name;  
			 	%{st}.join_body= parts;

			 	joins.add(st);
			 	_nodes_to_hide.add(prev_name);
		 	}
		}
	}
	
}



//RULES

reolang 
	:	^(REO_LANG directive_def* e+=element*) 
		-> rsl_script(circuits={$e})
	;
	
element
	:	^(ELEMENT channel_def) -> {$channel_def.st}
	|	^(ELEMENT pattern_def) -> {$pattern_def.st} 
	;





directive_def
	:	^(DIRECTIVE directive_import)
	;

	
directive_import
	:	^(IMPORT FILE_PATH) 
	;












channel_def
	:	^(CHANNEL channel_signature["CHANNEL"] extension? channel_body) 
	;


	
channel_signature[String context] returns [String id, String structure]
	:	^(SIGNATURE name=ID option? ^(CHANNEL_PORTS (^(IN_PORTS ports["IN", $channel_signature.context]))? (^(OUT_PORTS ports["OUT", $channel_signature.context]))?) (^(CONDITION ID condition))?
	{
		$channel_signature.id = $name.text;
		$channel_signature.structure = $option.structure != null ? $option.structure : "";
	}
	)
	;


option returns [String structure]
	:	^(OPTION timed 		{$option.structure = "" ; } )
	|	^(OPTION structured	{$option.structure = $structured.dim ; } )
	;


timed
	:	^(TIMED time)
	;

	
time
	: 	^(TIME ID)
	| 	^(TIME INT)
	;

	
structured returns [String dim]
@init{
	String d = "";
}
	:	^(STRUCTURED (structure_dimension
	{
		d+= $structure_dimension.dim + " ";
	}
	)+
	{
		$structured.dim = d.trim();
	}
	)
	;

	
structure_dimension returns [String dim] 
	: 	^(DIMENSION ID  {$structure_dimension.dim = $ID.text;})
	| 	^(DIMENSION INT {$structure_dimension.dim = $INT.text;})
	;


ports[String type, String context]
	:	^(PORT (ID
	{
		if($ports.context.equals("PATTERN")) {
			if($ports.type.equals("IN")) {
				$pattern_def::source.put($ID.text, $pattern_def::source.size());
			}
			else {
				$pattern_def::sink.put($ID.text, $pattern_def::sink.size());
			}
		}
		else {
			if($ports.context.equals("PATTERN.CHANNEL")){
				
				if($ports.type.equals("IN")) {
					$pattern_def::declaration_inst_source.add($ID.text);
				}
				else {
					$pattern_def::declaration_inst_sink.add($ID.text);
				}
			}
		}	
	}
	)+)
	;

	
condition
	:	^(COND_ELEMENTS ID+)
	;

	
extension
	:	^(EXTENSION ID)
	;

	
channel_body
	:	^(CHANNEL_BODY state_def? ^( FLOWS flow_def+))
	;

	
state_def
	:	^(CHANNEL_STATE ^(STATE_REF ID) ^(STATE_OBS ID+) )
	;

	
flow_def
	:	^(FLOW requests flow_type)
	;


	
requests
	:	^(REQUESTS request+)	
	;

	
request
	:	^(REQUEST ID)
	|	^(REQUEST NOT_MARK ID)
	;

	
flow_type
	:	^(FLOW_TYPE normal_flow (flow_operation normal_flow)? flow_label?)
	|	^(FLOW_TYPE if_flow)
	;

	
normal_flow
	:	^(NORMAL_FLOW flow_point timed? flow_point)
	;

	
flow_point 
	:	^(FLOW_POINT ID)
	| 	^(FLOW_POINT RW_NULL)
	;

flow_operation
	:	^(FLOW_OP OP_SYNC)
	;

	
if_flow
	:	^(IF_FLOW ID ^(FLOW_TRUE flow_type flow_label?) ^(FLOW_FALSE flow_type flow_label?))
	;

	
	
flow_label 
	:	ID
	;














pattern_def
scope{
	HashMap<String, Integer> source;
	HashMap<String, Integer> sink;
	HashMap<String, List<String>> inst_source;
	HashMap<String, List<String>> inst_sink;
	List<String> declaration_inst_source;
	List<String> declaration_inst_sink;
}
@init{
	$pattern_def::source = new HashMap<String, Integer>();
	$pattern_def::sink = new HashMap<String, Integer>();
	$pattern_def::inst_source = new HashMap<String, List<String>>();
	$pattern_def::inst_sink = new HashMap<String, List<String>>();
}
	:	^(PATTERN pattern_signature pattern_body
	{
		List<String> ports_to_export_source = new ArrayList<String>();
		for(String s : $pattern_def::source.keySet()){
			ports_to_export_source.add("source[" + $pattern_def::source.get(s) + "] = " + s);
		}
		
		List<String> ports_to_export_sink = new ArrayList<String>();
		for(String s : $pattern_def::sink.keySet()){
			ports_to_export_sink.add("sink[" + $pattern_def::sink.get(s) + "] = " + s);
		}
		
	}
	)  
		-> rsl_circuit(name={$pattern_signature.name}, body={$pattern_body.st}, sources={ports_to_export_source}, sinks={ports_to_export_sink})
	;
	
	
	
pattern_signature returns [String name]

	:	^(PATTERN_SIGNATURE ID ^(PATTERN_PORTS (^(IN_PORTS ports["IN", "PATTERN"]))? (^(OUT_PORTS ports["OUT", "PATTERN"]))? ) 
	{
		$pattern_signature.name = $ID.text;
	}
	)
	;
	
	
	
	
	
	
	
	
pattern_body
	:	^(PATTERN_BODY pattern_declarations pattern_compositions)
		-> rsl_body(decls={$pattern_declarations.st}, comps={$pattern_compositions.st})
	;
	
	
	
	
	
	
	
	
	
pattern_declarations
	:	^(PATTERN_DECLARATIONS dec+=declaration+)
		-> rsl_declarations(decls={$dec})
	;
	
	
	
	
	
	
	
declaration 
@init{
	$pattern_def::declaration_inst_source = new ArrayList<String>();
	$pattern_def::declaration_inst_sink = new ArrayList<String>();
}
@after{
	$pattern_def::declaration_inst_source = null;
	$pattern_def::declaration_inst_sink = null;
}
	:	^(DECLARATION reference_signature instances[$reference_signature.type_id])
		-> {$instances.st}
	;
	
	
	
	
	
	
	
	
reference_signature returns [String type_id]
	:	^(DECLARATION_TYPE ID? channel_signature["PATTERN.CHANNEL"]
	{
		
		String state = ($ID.text != null) ? (($ID.text.equals("F"))?  "_f": "" ) : "" ;
		$reference_signature.type_id = $channel_signature.id + $channel_signature.structure + state;
	}
	) 
	;
	
	
	
	
	
	
	
	
	
instances[String type]
@init{
	List<String> insts = new ArrayList<String>();
}
	:	^(INSTANCES i1=ID 
	{
		insts.add($i1.text);
		$pattern_def::inst_source.put($i1.text, $pattern_def::declaration_inst_source);
		$pattern_def::inst_sink.put($i1.text, $pattern_def::declaration_inst_sink);
	}
		stochastic_values? (i2=ID 
	{
		insts.add($i2.text);
		$pattern_def::inst_source.put($i2.text, $pattern_def::declaration_inst_source);
		$pattern_def::inst_sink.put($i2.text, $pattern_def::declaration_inst_sink);
	} 
		stochastic_values? )* 
	)
		-> rsl_declaration(ids={insts}, type={$instances.type})
	;	










stochastic_values
	:	^(STOCH (ID FLOAT)+ )
	;









pattern_compositions 
	: 	^(PATTERN_COMPOSITIONS pds+=port_definition+ js+=join_operation*)
		-> rsl_compositions(ports={$pds}, joins={$js})
	;
	
	
	
	
	
	
	
	
	
port_definition
	:	^(PORT_DEFINITION ID port_actual_definition[$ID.text] )
		-> {$port_actual_definition.st}
	;
	



port_actual_definition[String id]
	: 	^(PORT_ACTUAL_DEFINITION port_access) 	
		-> rsl_port(node={$port_actual_definition.id}, definition={$port_access.st})
	| 	^(PORT_ACTUAL_DEFINITION join_part
	{
		List<String> _nodes_to_hide = new ArrayList<String>();
		List<StringTemplate> joins = new ArrayList<StringTemplate>();
		pair_joins($join_part.accesses, $port_actual_definition.id, $st, joins, _nodes_to_hide);
	}
	) 	
		-> rsl_paired_joins(joins={joins}, hide={_nodes_to_hide})
	;



port_access 
	:	^(PORT_ACCESS comp=ID port=ID
	{
		String _access ;
		if($pattern_def::inst_source.get($comp.text).contains($port.text)) {
			_access = ($pattern_def::inst_source.get($comp.text).size() > 1) ? "source[" + $pattern_def::inst_source.get($comp.text).indexOf($port.text) + "]" : "source";
		} 
		else {
			_access = ($pattern_def::inst_sink.get($comp.text).size() > 1) ? "sink[" + $pattern_def::inst_sink.get($comp.text).indexOf($port.text) + "]" : "sink";
		}
	}
	)
		-> rsl_access(comp={$comp.text}, port={_access})
	;
	
join_operation
	:	^(JOIN_OP ID join_part
	{
		
		List<String> _nodes_to_hide = new ArrayList<String>();
		List<StringTemplate> joins = new ArrayList<StringTemplate>();
		pair_joins($join_part.accesses, $ID.text, $st, joins, _nodes_to_hide);
			
	}
	) 
		-> rsl_paired_joins(joins={joins}, hide={_nodes_to_hide})
	;
	
join_part returns [List<StringTemplate> accesses]
	: 	^(RW_JOIN port_access_list
	{
		$join_part.accesses = $port_access_list.accesses ;
	}
	) 
		-> {$port_access_list.st}
	|	 ^(RW_DECIDE special_port_access_list)
	{
		$join_part.accesses = $special_port_access_list.accesses ;
	}
		-> {$special_port_access_list.st}
	;	 
	
port_access_list returns [List<StringTemplate> accesses]
	:	^(PORT_ACCESS_LIST pa+=port_access+ 
	{
		$port_access_list.accesses = $pa;
	}
	)
	//|	^(PORT_ACCESS_LIST RW_REMAINING)	-> {%{""}}
	;
	
	
special_port_access_list returns [List<StringTemplate> accesses]
	:	 ^(PORT_ACCESS_LIST p1=port_access p2=port_access p3=port_access p4+=port_access*
	{
		List<StringTemplate> accesses_aux = new ArrayList<StringTemplate>();
		accesses_aux.add($p1.st);
		accesses_aux.add($p2.st);
		accesses_aux.add($p3.st);
		accesses_aux.addAll($p4);
		
		$special_port_access_list.accesses = accesses_aux;
	}
	)
	;


