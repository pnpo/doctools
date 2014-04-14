tree grammar ReoLangCP2;

options{
	tokenVocab=ReoLangParser;
	ASTLabelType = CommonTree;
}



@header{
	package pt.uminho.di.reolang;
	
	import java.util.ArrayList;
	import java.util.LinkedHashMap;
	import java.util.LinkedHashSet;
	import pt.uminho.di.cp.model.*;
	import pt.uminho.di.reolang.parsing.CPBuilder;
	import pt.uminho.di.reolang.parsing.util.*;
}



@members {
	
	private LinkedHashMap<String, CPModelInternal> patterns;
	public LinkedHashMap<String, CPModelInternal> getPatterns() {
		return this.patterns;
	}
	
	
}


//RULES

reolang [String file, LinkedHashMap<String, CPModelInternal> cps, SymbolsTable symbols]
scope{
	SymbolsTable global_table; 
}
@init{
	$reolang::global_table = $reolang.symbols;
}
	:	^( REO_LANG 
	{
		this.patterns = cps==null? new LinkedHashMap<String, CPModelInternal>() : cps;
	}
		directive_def* element*)
	;
	
element
	:	^(ELEMENT channel_def)
	|	^(ELEMENT pattern_def)
	|	^(ELEMENT stochastic_def)
	;





directive_def
	:	^(DIRECTIVE directive_import)
	;

	
directive_import
	:	^(IMPORT FILE_PATH) 
	{
		String file_string = $FILE_PATH.text;
		String file = file_string.substring(1,file_string.length()-1);
		CPBuilder cp_model_builder = new CPBuilder(file);
		ReoLangCP2 res = cp_model_builder.performModelConstruction(this.patterns, $reolang::global_table);
		this.patterns = res.getPatterns() != null ? res.getPatterns() : this.patterns;
		
	}
	;










channel_def
	:	 ^(CHANNEL channel_signature[InspectionMode.DECLARATION] extension? channel_body) 
	;


	
channel_signature [InspectionMode mode] returns [String o_name, int o_dim, LinkedHashSet<Node> o_ins, LinkedHashSet<Node> o_outs]
	:	 ^(SIGNATURE id1=ID o=option? ^(CHANNEL_PORTS (^(IN_PORTS p1=ports))? (^(OUT_PORTS p2=ports))?) (^(CONDITION ID condition))?
	
	{
		$channel_signature.o_name = $id1.text;
		$channel_signature.o_dim  = $o.dim;
		$channel_signature.o_ins  = $p1.o_ports != null ? $p1.o_ports : new LinkedHashSet<Node>(0);
		$channel_signature.o_outs = $p2.o_ports != null ? $p2.o_ports : new LinkedHashSet<Node>(0);
	}
	)
	;


option returns [int dim] 
	:	^(OPTION timed {$option.dim = 0;})
	|	^(OPTION structured {$option.dim = $structured.dim;})
	;


timed
	:	 ^(TIMED time)
	;

	
time
	:  ^(TIME ID)
	|  ^(TIME INT)
	;

	
structured returns [int dim]
	:	 ^(STRUCTURED structure_dimension+ 
	{
		//get only the last one (this will only work for 1 dimensino channels)
		$structured.dim = $structure_dimension.dim;
	}
	)
	;

	
structure_dimension returns [int dim] 
	: ^(DIMENSION ID {$structure_dimension.dim = 0;})
	|  ^(DIMENSION INT {$structure_dimension.dim = $INT.int;})
	;


ports returns [LinkedHashSet<Node> o_ports]
@init {
	LinkedHashSet<Node> _ports = new LinkedHashSet<Node>();
}
	:	 ^(PORT (ID
	{
		LinkedHashSet<String> ends = new LinkedHashSet<String>();
		ends.add($ID.text);
		_ports.add(new Node(ends));
	}
	)+
	{
		$ports.o_ports = _ports;
	}
	)
	;

	
condition
	:	 ^(COND_ELEMENTS ID+)
	;

	
extension
	:	 ^(EXTENSION ID)
	;

	
channel_body
	:	^(CHANNEL_BODY state_def? ^( FLOWS flow_def+))
	;

	
state_def
	:	 ^(CHANNEL_STATE ^(STATE_REF ID) ^(STATE_OBS ID+) )
	;

	
flow_def
	:	 ^(FLOW requests flow_type)
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
	:	 ^(NORMAL_FLOW flow_point timed? flow_point)
	;

	
flow_point 
	:	^(FLOW_POINT ID)
	| 	^(FLOW_POINT RW_NULL)
	;

flow_operation
	:	 ^(FLOW_OP OP_SYNC)
	;

	
if_flow
	:	^(IF_FLOW ID ^(FLOW_TRUE flow_type flow_label?) ^(FLOW_FALSE flow_type flow_label?))
	;

	
	
flow_label 
	:	 ID
	;











pattern_def
	:	^(PATTERN ps=pattern_signature pattern_body[$ps.o_name]) 
	;
	
	
	
	
	
	
pattern_signature returns [String o_name]
	:	 ^(PATTERN_SIGNATURE ID ^(PATTERN_PORTS (^(IN_PORTS p1=ports))? (^(OUT_PORTS p2=ports))? ) 
	{	
		$pattern_signature.o_name = $ID.text;
		
		CPModelInternal cpmi = new CPModelInternal();
		CoordinationPattern2 cp = new CoordinationPattern2();
		cp.setId($ID.text);
		cpmi.setSimplePattern(cp);
		
		
		LinkedHashSet<Node> env = new LinkedHashSet<Node>($p1.o_ports==null ? new LinkedHashSet<Node>(0) : $p1.o_ports);
		env.addAll($p2.o_ports==null ? new LinkedHashSet<Node>(0) : $p2.o_ports);
		cpmi.setEnvironment(env);
		this.patterns.put($ID.text, cpmi);
		
	}
	)
	;
	

	
	
	
	
	
	
pattern_body [String patt_name]
	:	 ^(PATTERN_BODY pattern_declarations[$pattern_body.patt_name] pattern_compositions[$pattern_body.patt_name])
	;
	
pattern_declarations [String patt_name]
	:	 ^(PATTERN_DECLARATIONS declaration[$pattern_declarations.patt_name]+)
	;
	
	
	
	
	
	
	
	
declaration [String patt_name]
	:	 ^(DECLARATION sig=reference_signature instances[$sig.o_name, $sig.o_type, $sig.o_ins, $sig.o_outs, $declaration.patt_name])
	;
	
	
	
	
	
	
	
	
reference_signature returns [String o_name, String o_type, int o_dim, LinkedHashSet<Node> o_ins, LinkedHashSet<Node> o_outs]
	:	^(DECLARATION_TYPE ID? cs=channel_signature[InspectionMode.REF_BY_INSTANCE]
	{
		$reference_signature.o_name = $cs.o_name;
		$reference_signature.o_type = 
			$cs.o_name + ($cs.o_dim > 0 ? $cs.o_dim : "") + ($ID.text!=null ? $ID.text.toLowerCase() : "") ;
		$reference_signature.o_ins = $cs.o_ins;
		$reference_signature.o_outs = $cs.o_outs;
	}
	) 
	;
	
	
	
	
	
	
	
	
	
	
instances [String i_name, String i_type, LinkedHashSet<Node> i_ins, LinkedHashSet<Node> i_outs, String patt_name]
	:	 ^(INSTANCES (ID 
	{
		//CHANNELS
		if(! this.patterns.containsKey($instances.i_name)) {
			LinkedHashSet<Node> _ins = new LinkedHashSet<Node>();
			LinkedHashSet<Node> _outs = new LinkedHashSet<Node>();
			Node n;
			for(Node _n : $instances.i_ins) {
				for(String e : _n.getEnds()) {
					n = new Node();
					n.addEnd($ID.text + "_" + e);
					_ins.add(n) ; 
				}
			}	
			for(Node _n : $instances.i_outs) {
				for(String e : _n.getEnds()) {
					n = new Node();
					n.addEnd($ID.text + "_" + e);
					_outs.add(n) ;
				}
			}			
			
			CommunicationMean2 cm;
			cm = new CommunicationMean2(
				_ins, _outs, $ID.text, 
				$instances.i_type, new LinkedHashMap<String, Double>()
			);
			this.patterns.get($instances.patt_name).getSimplePattern().getPattern().add(cm);

		}
		else { //PATTERNS
			CPModelInternal cpmi = this.patterns.get($instances.i_name);
			CoordinationPattern2 cp = cpmi.getSimplePattern();
			CPModelInternal cpmi_in_creation = this.patterns.get($instances.patt_name);
			//CoordinationPattern p = new CoordinationPattern(cpmi.getCP());
			for(CommunicationMean2 cm : cp.getPattern() ){
				CommunicationMean2 cm_new = new CommunicationMean2(cm);
				cm_new.setId(cp.getId() + "::" + cm.getId());
				cpmi_in_creation.getSimplePattern().getPattern().add(cm_new);
				//TODO: copy of internal nodes...
				
			}
		}
	}
	)+ 
	
	)
	;









	
	

pattern_compositions [String patt_name]
	: 	 ^(PATTERN_COMPOSITIONS port_definition[$pattern_compositions.patt_name]+ join_operation[$pattern_compositions.patt_name]*)
	;
	
	
	
	
port_definition [String patt_name]
	:	 ^(PORT_DEFINITION ID port_actual_definition[$port_definition.patt_name, $ID.text])
	;
	
port_actual_definition [String patt_name, String port]
	: 	^(PORT_ACTUAL_DEFINITION port_access[$port_actual_definition.patt_name])
	{
		CPModelInternal cpmi = this.patterns.get($port_actual_definition.patt_name);
		LinkedHashSet<String> access_node = new LinkedHashSet<String>();
				access_node.add($port_access.port_str);
		cpmi.getNodes().put(port, new Node(access_node));
	}
	| 	^(PORT_ACTUAL_DEFINITION join_part[$port_actual_definition.patt_name, $port_actual_definition.port]) 
	{
		CPModelInternal cpmi = this.patterns.get($port_actual_definition.patt_name);
		cpmi.getNodes().put(port, new Node($join_part.node));
		//replaces the nodes on the channels...
		cpmi.getSimplePattern().replaceNodesBy($join_part.node);
		if($join_part.isXOR){
			cpmi.getSimplePattern().getXors().add($join_part.node);
		}
	}
	;

port_access [String patt_name] returns [String port_str]
	:	^(PORT_ACCESS i1=ID i2=ID
	{
		$port_access.port_str = $i1.text + "_" + $i2.text;	
	}
	)
	;
	
join_operation [String patt_name]
	:	^(JOIN_OP ID join_part [$join_operation.patt_name, $ID.text] 
	{
		CPModelInternal cpmi = this.patterns.get($join_operation.patt_name);
		cpmi.getNodes().put($ID.text, new Node($join_part.node));
		//replaces the nodes on the channels...
		cpmi.getSimplePattern().replaceNodesBy($join_part.node);
		if($join_part.isXOR){
			cpmi.getSimplePattern().getXors().add($join_part.node);
		}
	}
	)
	;
	
join_part [String patt_name, String port] returns [Node node, Boolean isXOR]
	: 	^(RW_JOIN port_access_list [$join_part.patt_name, $join_part.port] 
	{
		$join_part.node = $port_access_list.node;
		$join_part.isXOR = false;
	}
	) 
	| 	^(RW_DECIDE special_port_access_list[$join_part.patt_name, $join_part.port]
	{
		$join_part.node = $special_port_access_list.node;
		$join_part.isXOR = true;
	}
	)
		
	;	 
	
port_access_list [String patt_name, String port] returns [Node node]
@init{
	Node _node = new Node(); 
}
	:	^(PORT_ACCESS_LIST (port_access[$port_access_list.patt_name]
	{
		_node.addEnd($port_access.port_str);
	}
	)+
	{
		$port_access_list.node = _node;
	}
	)
	;
	
	
special_port_access_list [String patt_name, String port] returns [Node node]
@init {
	Node _node = new Node();
}
	:	^(PORT_ACCESS_LIST (port_access[$special_port_access_list.patt_name] 
	{
		_node.addEnd($port_access.port_str);
	}
	)+
	{
		$special_port_access_list.node = _node;
	}
	)
	;





stochastic_def 
	:	^(RW_STOCHASTIC i1=ID i2=ID 
	{
		String patt_name = $i1.text;
		String inst_name = $i2.text;
		
		CPModelInternal cpmi = this.patterns.get(patt_name);
		cpmi.getStochInstances().put(inst_name, new CoordinationPattern2(cpmi.getSimplePattern()));
	}
		stochastic_list[patt_name, inst_name] )
	;
	
stochastic_list [String p, String i]
	:	( stoch_elem[p, i] ( stoch_elem[p, i])*)
	;





stoch_elem[String p, String i]
	:	^(STOCH i1=ID (i2=ID)? stoch_val 
	{
		CPModelInternal cpmi = this.patterns.get(p);
		CoordinationPattern2 si = cpmi.getStochInstances().get(i);
		if($i2==null){
			si.getDelays().put(cpmi.getNodes().get($i1.text), $stoch_val.val);
		}
		else {
			
			CommunicationMean2 cm = new CommunicationMean2();
			for(CommunicationMean2 _cm : si.getPattern()){
				if(_cm.getId().equals($i1.text)){
					cm = _cm;
					break;
				}
			}
			cm.getDelays().put($i2.text, $stoch_val.val.fst());
		}
	}
	)
	;
	
	
stoch_val returns [Pair<Double, Double> val]
	:	^(STOCH_VAL FLOAT
	{
//		$stoch_val.isRW = false;
		$stoch_val.val = new Pair<Double, Double>(Double.parseDouble($FLOAT.text),0.0);
	}
	)
	|	^(STOCH_VAL f1=FLOAT f2=FLOAT
	{
//		$stoch_val.isRW = true;
		$stoch_val.val = new Pair<Double, Double>(Double.parseDouble($f1.text),Double.parseDouble($f2.text));
	}
	)
	;
