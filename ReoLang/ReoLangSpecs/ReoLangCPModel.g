tree grammar ReoLangCPModel;

options{
	tokenVocab=ReoLangParser;
	ASTLabelType = CommonTree;
}



@header{
	package pt.uminho.di.reolang;
	
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import pt.uminho.di.cp.model.*;
	import pt.uminho.di.reolang.parsing.CPBuilder;
	import pt.uminho.di.reolang.parsing.util.*;
}



@members {

	private HashMap<String, CPModelInternal> patterns;
	public HashMap<String, CPModelInternal> getPatterns() {return patterns;}
	public void setPatterns(HashMap<String, CPModelInternal> p) {patterns = p;}
	
	
	public static class CPModelInternal {
		private ArrayList<String> in_ports;
		private ArrayList<String> out_ports;
		private CoordinationPattern cp;
		
		public ArrayList<String> getInPorts() {return in_ports;}
		public ArrayList<String> getOutPorts() {return out_ports;}
		public CoordinationPattern getCP() {return cp;}
		public void setInPorts(ArrayList<String> p) {in_ports = p;}
		public void setOutPorts(ArrayList<String> p) {out_ports = p;}
		public void setCP(CoordinationPattern p) {cp = p;}
		
		public String toString(){return cp.toString();}
	}
}


//RULES

reolang [String file, HashMap<String, ReoLangCPModel.CPModelInternal> ps, SymbolsTable symbols]
scope{
	SymbolsTable global_table; 
}
@init{
	$reolang::global_table = $reolang.symbols;
}
	:	^( REO_LANG 
	{
		this.patterns = ps==null? new HashMap<String, ReoLangCPModel.CPModelInternal>() : ps;
	}
		directive_def* element*)
	;
	
element
	:	^(ELEMENT channel_def)
	|	^(ELEMENT pattern_def)
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
		HashMap<String, ReoLangCPModel.CPModelInternal> imported_patterns = cp_model_builder.performModelConstruction(this.patterns, $reolang::global_table);
		this.patterns = imported_patterns != null ? imported_patterns : this.patterns;
	}
	;












channel_def
	:	 ^(CHANNEL channel_signature[InspectionMode.DECLARATION] extension? channel_body) 
	;


	
channel_signature [InspectionMode mode] returns [String o_name, int o_dim, ArrayList<String> o_ins, ArrayList<String> o_outs]
	:	 ^(SIGNATURE id1=ID o=option? ^(CHANNEL_PORTS (^(IN_PORTS p1=ports))? (^(OUT_PORTS p2=ports))?) (^(CONDITION ID condition))?
	
	{
		$channel_signature.o_name = $id1.text;
		$channel_signature.o_dim  = $o.dim;
		$channel_signature.o_ins  = $p1.o_ports != null ? $p1.o_ports : new ArrayList<String>(0);
		$channel_signature.o_outs = $p2.o_ports != null ? $p2.o_ports : new ArrayList<String>(0);
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


ports returns [ArrayList<String> o_ports]
@init {
	ArrayList<String> _ports = new ArrayList<String>();
}
	:	 ^(PORT (ID
	{
		_ports.add($ID.text);
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
		cpmi.setInPorts($p1.o_ports !=null ? $p1.o_ports : new ArrayList<String>(0));
		cpmi.setOutPorts($p2.o_ports !=null ? $p2.o_ports : new ArrayList<String>(0));
		cpmi.setCP(new CoordinationPattern($ID.text));
		this.patterns.put($ID.text,cpmi);
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
	
	
	
	
	
	
	
	
reference_signature returns [String o_name, String o_type, int o_dim, ArrayList<String> o_ins, ArrayList<String> o_outs]
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
	
	
	
	
	
	
	
	
	
	
instances [String i_name, String i_type, ArrayList<String> i_ins, ArrayList<String> i_outs, String patt_name]
	:	 ^(INSTANCES (ID sv=stochastic_values?
	{
		//CHANNELS
		if(! this.patterns.containsKey($instances.i_name)) {
			//if it is a channel then it always has 2 ports
			//lets check the number of in ports and decide how to
			//build the communicationmeans.
			int n_ports = $instances.i_ins.size();
			switch(n_ports){
				case 1 : {
					CommunicationMean cm;
					if($sv.o_values != null && $sv.o_values.size()>0) {
						cm = new StochasticCommunicationMean(
							$instances.i_ins.get(0), $ID.text, $instances.i_type, $instances.i_outs.get(0), new LinkedHashMap<String, Double>($sv.o_values)
							);
					}
					else {
						cm = new CommunicationMean(
							$instances.i_ins.get(0), $ID.text, $instances.i_type, $instances.i_outs.get(0)
							);
					}
					this.patterns.get($instances.patt_name).getCP().getPattern().add(cm);
				} ; break;
				
				case 2 : {
					CommunicationMean cm1, cm2;
					if($sv.o_values != null && $sv.o_values.size()>0) {
						cm1 = new StochasticCommunicationMean(
							$instances.i_ins.get(0), $ID.text, $instances.i_type, "NULL", new LinkedHashMap<String, Double>($sv.o_values)
							);
						cm2 = new StochasticCommunicationMean(
							$instances.i_ins.get(1), $ID.text, $instances.i_type, "NULL", new LinkedHashMap<String, Double>($sv.o_values)
							);
					}
					else {
						cm1 = new CommunicationMean(
							$instances.i_ins.get(0), $ID.text, $instances.i_type, "NULL"
							);
						cm2 = new CommunicationMean(
							$instances.i_ins.get(1), $ID.text, $instances.i_type, "NULL"
							);
					}	
					this.patterns.get($instances.patt_name).getCP().getPattern().add(cm1);
					this.patterns.get($instances.patt_name).getCP().getPattern().add(cm2);
				} ; break;
				
				default : {
					CommunicationMean cm1, cm2;
					if($sv.o_values != null && $sv.o_values.size()>0) {
						cm1 = new StochasticCommunicationMean(
							"NULL", $ID.text, $instances.i_type, $instances.i_outs.get(0), new LinkedHashMap<String, Double>($sv.o_values)
							);
						cm2 = new StochasticCommunicationMean(
							"NULL", $ID.text, $instances.i_type, $instances.i_outs.get(1), new LinkedHashMap<String, Double>($sv.o_values)
							);
					}
					else {
						cm1 = new CommunicationMean(
							"NULL", $ID.text, $instances.i_type,  $instances.i_outs.get(0)
							);
						cm2 = new CommunicationMean(
							"NULL", $ID.text, $instances.i_type,  $instances.i_outs.get(1)
							);
					}	
					this.patterns.get($instances.patt_name).getCP().getPattern().add(cm1);
					this.patterns.get($instances.patt_name).getCP().getPattern().add(cm2);
				} ; break;
			}				
			
			if($sv.o_values!=null) {$sv.o_values.clear();}
		
		}
		else { //PATTERNS
			CPModelInternal cpmi = this.patterns.get($instances.i_name);
			CoordinationPattern p = new CoordinationPattern(cpmi.getCP());
			for(CommunicationMean cm : p.getPattern() ){
				cm.setInode(cpmi.getInPorts().contains(cm.getInode()) ? 
						$ID.text + "." + $instances.i_ins.get(cpmi.getInPorts().indexOf(cm.getInode())) :
						(cm.getInode().equals("NULL")) ? "NULL" : $ID.text + "::" + cm.getInode()
					);
				
				cm.setFnode(cpmi.getOutPorts().contains(cm.getFnode()) ? 
						$ID.text + "." + $instances.i_outs.get(cpmi.getOutPorts().indexOf(cm.getFnode())) :
						(cm.getFnode().equals("NULL")) ? "NULL" : $ID.text + "::" + cm.getFnode()
					); 
				cm.setId($ID.text + "::" + cm.getId());
			}
			this.patterns.get($instances.patt_name).getCP().getPattern().addAll(p.getPattern());
		}
		
		
	}
	)+ 
	
	)
	;












stochastic_values returns [LinkedHashMap<String, Double> o_values]
@init{
	LinkedHashMap<String, Double> stoch_map = new LinkedHashMap<String, Double>();
}
	:	^(STOCH (ID FLOAT 
	{
		stoch_map.put($ID.text, Double.parseDouble($FLOAT.text));
	}
	)+ 
	{
		$stochastic_values.o_values = stoch_map;
		
		//TODO : complete with undefined stochastic values...
	}
	)
	;
	
	
	
	
	

pattern_compositions [String patt_name]
	: 	 ^(PATTERN_COMPOSITIONS port_definition[$pattern_compositions.patt_name]+ join_operation[$pattern_compositions.patt_name]*)
	;
	
	
	
	
port_definition [String patt_name]
	:	 ^(PORT_DEFINITION ID port_actual_definition[$port_definition.patt_name, $ID.text])
	;
	
port_actual_definition [String patt_name, String port]
	: 	^(PORT_ACTUAL_DEFINITION port_access[$port_actual_definition.patt_name, $port_actual_definition.port])
	| 	^(PORT_ACTUAL_DEFINITION join_part[$port_actual_definition.patt_name, $port_actual_definition.port])
	;

port_access [String patt_name, String port]
	:	^(PORT_ACCESS i1=ID i2=ID
	{
		CoordinationPattern p = this.patterns.get($port_access.patt_name).getCP();
		p.replacePortNames($i2.text, $i1.text, $port_access.port);
		p.getRouter_nodes().add($port_access.port);
	}
	)
	;
	
join_operation [String patt_name]
	:	^(JOIN_OP ID join_part [$join_operation.patt_name, $ID.text] )
	;
	
join_part [String patt_name, String port]
	: 	^(RW_JOIN port_access_list [$join_part.patt_name, $join_part.port])
	| 	^(RW_DECIDE special_port_access_list[$join_part.patt_name, $join_part.port])
		
	;	 
	
port_access_list [String patt_name, String port]
	:	^(PORT_ACCESS_LIST port_access[$port_access_list.patt_name, $port_access_list.port]+)
	//|	^(PORT_ACCESS_LIST RW_REMAINING)
	;
	
	
special_port_access_list [String patt_name, String port]
	:	^(PORT_ACCESS_LIST port_access[$special_port_access_list.patt_name, $special_port_access_list.port]+)
	;


