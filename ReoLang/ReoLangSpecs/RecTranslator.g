tree grammar RecTranslator;

options{
	tokenVocab = RecParser;
	ASTLabelType = CommonTree;
	output = template;
	//language = java;
}

@header{
	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.parsing.util.*;
	import pt.uminho.di.reolang.reclang.PkgConstants;
}

@members{


	private ArrayList<String> reconfigurations;
	
	public ArrayList<String> getReconfigurations(){
		return this.reconfigurations;
	}
	
	
	public String datatypeToString(List<String> full_dt){
		String datatype = "";
		
		for (int i = full_dt.size()-1; i>=0; i--){
			String dt = full_dt.get(i);
			if (dt.equals("Pair")){
				datatype = dt + "<" + datatype + ", " + datatype +  ">";
			}
			else if(dt.equals("Triple")){
				datatype = dt + "<" + datatype + ", " + datatype + ", " + datatype + ">";
			}
			else if(i != full_dt.size()-1){
				datatype = dt + "<" + datatype + ">";
			}
			else {
				datatype = dt;		
			}
		}
		
		return datatype;
	}
}



//GRAMMAR

reclang
@init{
	this.reconfigurations = new ArrayList<String>();
}
	: ^(RECONFIGS directive_def* (element
	{	
		this.reconfigurations.add($element.st.toString()); 
	}
	)*)
	
	;




directive_def
	: directive_import
	;

	
directive_import
	: ^(IMPORT STRING)
	;





	
element
	: ^(RECONFIGURATION reconfiguration_def) -> {$reconfiguration_def.st}
	| ^(APPLICATION applicaiton_def)	 -> {$applicaiton_def.st}
	;



reconfiguration_def
scope{
	List<String> datatype;
}
	: ^(ID args_def? reconfiguration_block) -> mkclass(name={$ID.text}, rec_pkg={PkgConstants.CP_RECONFIGURATIONS}, 
	attributes={$args_def.values}, constructor={$args_def.st}, body={""}) //body={$reconfiguration_block.code}
	;

args_def returns[List<String> values]
@init{
	List<String> ctfields = new ArrayList<String>();
	List<String> ids = new ArrayList<String>();
	List<String> dts = new ArrayList<String>();
}
	: ^(ARGUMENTS 
	(arg_def
	{
		ctfields.add($arg_def.st.toString());
		ids.addAll($arg_def.values);
		for (int i = 0; i < $arg_def.values.size(); i++){
			dts.add($arg_def.datatype);
		}
	}
	)+ )
	{	
		$args_def.values = ctfields;// + constructor;
	}
	
	-> constructor(dts={dts}, ids={ids})
	;
	
arg_def returns[String datatype, List<String> values]
@init{
	$reconfiguration_def::datatype = new ArrayList<String>();
	List<String> args = new ArrayList<String>();	
}
	: ^(ARGUMENT datatype 
	{
		String dt = datatypeToString($reconfiguration_def::datatype);
	}
	list_ids[dt]) 
	{
		$arg_def.values = $list_ids.values;
		$arg_def.datatype = dt;
	}
	
	-> {$list_ids.st}
	;
	
datatype
	: DT_PATTERN	{ $reconfiguration_def::datatype.add("CoordinationPattern2"); }
	| DT_CHANNEL	{ $reconfiguration_def::datatype.add("CommunicationMean2"); }
	| DT_NAME 	{ $reconfiguration_def::datatype.add("String"); }
	| DT_NODE	{ $reconfiguration_def::datatype.add("Node"); }
	| DT_XOR 	{ $reconfiguration_def::datatype.add("Node"); }
	| ^( other_type	{ $reconfiguration_def::datatype.add($other_type.name); }
	subtype)
	;
	
other_type returns [String name]
	: DT_SET    	{ $other_type.name = "LinkedHashSet"; }
	| DT_PAIR 	{ $other_type.name = "Pair"; }
	| DT_TRIPLE	{ $other_type.name = "Triple"; }
	;

subtype
	: datatype
	;
	
list_ids [String dt] returns[List<String> values]
@init{
	List<String> ids = new ArrayList<String>();
}
	:(ID
	{
		ids.add($ID.text);
	}
	)+ 
	{
		$list_ids.values = ids; 
		//System.out.println(ids);
	}
	
	-> list_args(datatype={$list_ids.dt}, ids={ids})
	
	;
	
	
reconfiguration_block
	: ^(INSTRUCTIONS instruction+)
	;
	
instruction
	: declaration
	| assignment
	| reconfiguration_apply
	| for_instruction
	;
	
reconfiguration_apply
	: ^(OP_APPLY reconfiguration_call ID?)
	;
	
declaration 
	: ^(DECLARATION datatype var_def+)
	;
	
var_def
	: ID
	| assignment
	;
	
assignment
	: ^(ASSIGNMENT ID assignment_member) 
	; 
	
assignment_member
	: expression 
	| reconfiguration_apply
	;
	
reconfiguration_call
	: ^(OP_JOIN operation_args)
	| ^(OP_SPLIT operation_args)
	| ^(OP_PAR operation_args)
	| ^(OP_REMOVE operation_args)
	| ^(OP_CONST operation_args)
	| ^(OP_ID operation_args)
	| ^(ID operation_args)
	;
	
	
structure_operation_call
	: ^(OP_PATH operation_args)
	| ^(OP_UPDATE operation_args)
	;
	
	
operation_args
	: args?
	;
	
args
	: expression+
	;
	
	
for_instruction
	: ^(FORALL datatype id1=ID id2=ID reconfiguration_block)
	;
	
	
expression
	: ^(OP_UNION expression expression)
	| ^(OP_INTERSECTION expression expression)
	| ^(OP_MINUS expression expression)
	| factor 
	;


factor
	: ^(ID ID)
	| ID
	| operation
	| constructor
	;
	
operation
	: ^(ACCESS ID (^(STRUCTURE ID))? attribute_call)
//	| single_return_operation
	| structure_operation_call
	;	

constructor
	: triple_cons
	| pair_cons
	| set_cons
	| node_cons
	| xor_cons
	;
	
//single_return_operation
//	: ^(OP_FST operation_args)
//	| ^(OP_SND operation_args) 
//	| ^(OP_TRD operation_args)
//	;
	
attribute_call
	: ^(OP_IN INT?)
	| ^(OP_OUT INT?)
	| OP_NAME
	| OP_NODES
	| OP_NAMES
	| ^(OP_ENDS expression) 
	| OP_FST
	| OP_SND
	| OP_TRD
	| ID
	;
	
	
triple_cons
	: ^(TRIPLE expression expression expression)
	;
	
	
pair_cons 
	: ^(PAIR expression expression)
	;
	
	
	
set_cons
	: ^(SET expression*) 
	;
	
		
node_cons
	: ^(NODE ID+ ) 
	;

xor_cons
	: ^(XOR  ^(IN ID ID*) ^(OUT ID ID+) )
	;



applicaiton_def 
	: ID list_reconfigurations trigger_def?
	;
	
list_reconfigurations
	: reconfiguration_call+
	;
	
trigger_def
	: trigger_block
	;
	
trigger_block
	: SEP_BLOCK_START SEP_BLOCK_END
	;

