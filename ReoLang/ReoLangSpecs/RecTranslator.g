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
	String class_name;
	List<String> args;
	
	//body	
	List<String> reconfs;
	List<String> insts;
	
	//tabs
	String adv;
}
@init{
	$reconfiguration_def::class_name = "";
	$reconfiguration_def::args = new ArrayList<String>();
	
	//body
	$reconfiguration_def::reconfs = new ArrayList<String>();
	$reconfiguration_def::insts = new ArrayList<String>();
	
	$reconfiguration_def::adv = "";
}
	: ^(ID 
	{
		$reconfiguration_def::class_name = Character.toUpperCase($ID.text.charAt(0)) + $ID.text.substring(1);
	}
	
	args_def? reconfiguration_block[false]
	{
		System.out.println($reconfiguration_def::reconfs.toString());
		System.out.println($reconfiguration_def::insts.toString());
	}
	
	) -> mkclass(name={$reconfiguration_def::class_name}, rec_pkg={PkgConstants.CP_RECONFIGURATIONS}, 
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
	
	-> constructor(n={$reconfiguration_def::class_name}, dts={dts}, ids={ids})
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
	| DT_XOR 	{ $reconfiguration_def::datatype.add("Node"); } //rever
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
		$reconfiguration_def::args.add($ID.text);
	}
	)+ 
	{
		$list_ids.values = ids; 
		//System.out.println(ids);
	}
	
	-> list_args(datatype={$list_ids.dt}, ids={ids})
	
	;
	
	
reconfiguration_block[boolean isForall]
	: ^(INSTRUCTIONS (instruction
	{
		if (isForall){
			$for_instruction::insts.add($instruction.value);
		}
		else{
			$reconfiguration_def::insts.add($instruction.value);
		}
	}
	)+
	) -> apply_method(body={""})
	;
	
instruction returns[String value]
	: declaration			{ $instruction.value = $declaration.value; }
	| assignment			{ $instruction.value = $assignment.value; }
	| reconfiguration_apply[false]	{ $instruction.value = $reconfiguration_apply.value; }
	| for_instruction		{ $instruction.value = $for_instruction.value; }
	;
	
reconfiguration_apply[boolean isAssign] returns[String value]
	: ^(OP_APPLY reconfiguration_call 
	{
		String op = $reconfiguration_call.name;
		//eg: par -> P + ar = Par
		String class_name = Character.toUpperCase(op.charAt(0)) + op.substring(1);
		$reconfiguration_def::reconfs.add(class_name + " " + op + ";");
		
		String args = $reconfiguration_call.args;
		
		String rec = op + " = new " + class_name + "(" + args + ");\n" + op + ".apply(\$cp);"; //add template
		$reconfiguration_apply.value = rec;
	}
	
	ID?)
	;
	
declaration returns[String value]
scope{
	String dt;
}
@init{
	$reconfiguration_def::datatype = new ArrayList<String>();
	
	$declaration::dt = "";
	List<String> decls = new ArrayList<String>();
}
	: ^(DECLARATION datatype
	{
		$declaration::dt = datatypeToString($reconfiguration_def::datatype);
	}
	 
	(var_def
	{
		decls.add($declaration::dt + " " + $var_def.value + ";");
	}
	)+
	{
		//convert list decls to string
		String all_decls = "";
		for (String d : decls){
			all_decls += d + "\n";
		}		
		$declaration.value = all_decls;
	}
	)
	;
	
var_def returns[String value]
	: ID { $var_def.value = $ID.text; }
	| assignment { $var_def.value = $assignment.value; }
	;
	
assignment returns[String value]
	: ^(ASSIGNMENT ID assignment_member 
	{
		$assignment.value = $ID.text + " = " + $assignment_member.value;
	}
	) 
	; 
	
assignment_member returns[String value]
	: expression 			{ $assignment_member.value = $expression.value; }
	| reconfiguration_apply[true]	{ $assignment_member.value = $reconfiguration_apply.value; } //rever
	;
	
reconfiguration_call returns[String name, String args]
	: ^(OP_JOIN operation_args)
	{
		$reconfiguration_call.name = $OP_JOIN.text;
		$reconfiguration_call.args = $operation_args.values;
	}
	| ^(OP_SPLIT operation_args)
	{
		$reconfiguration_call.name = $OP_SPLIT.text;
		$reconfiguration_call.args = $operation_args.values;
	}
	| ^(OP_PAR operation_args)
	{
		$reconfiguration_call.name = $OP_PAR.text;
		$reconfiguration_call.args = $operation_args.values;
	}
	| ^(OP_REMOVE operation_args)
	{
		$reconfiguration_call.name = $OP_REMOVE.text;
		$reconfiguration_call.args = $operation_args.values;
	}
	| ^(OP_CONST operation_args)
	{
		$reconfiguration_call.name = $OP_CONST.text;
		$reconfiguration_call.args = $operation_args.values;
	}
	| ^(OP_ID operation_args)
	{
		$reconfiguration_call.name = $OP_ID.text;
		$reconfiguration_call.args = $operation_args.values;
	}
	| ^(ID operation_args)
	{
		$reconfiguration_call.name = $ID.text;
		$reconfiguration_call.args = $operation_args.values;
	}
	;
	
	
structure_operation_call
	: ^(OP_PATH operation_args)
	| ^(OP_UPDATE operation_args)
	;
	
	
operation_args returns[String values]
@init{
	String args = "";
}
	: (args
	{
		args = $args.values;
	}
	)?
	
	{
		$operation_args.values = args;
	}
	;
	
args returns[String values]
@init{
	List<String> args = new ArrayList<String>();
}
	: (expression
	{
		args.add($expression.value);
	}
	)+
	
	{
		//convert list args to string, separated by ','
		String sep = "";
		String values = "";
		for (String a : args){
			values += sep;
			values += a;
			
		        sep = ", ";
		}
		
		$args.values = values;
	}
	;
	
	
for_instruction returns[String value]
scope{
	List<String> insts;
}
@init{
	$reconfiguration_def::datatype = new ArrayList<String>();
	$reconfiguration_def::adv += "\t";
	
	$for_instruction::insts = new ArrayList<String>();
}
	: ^(FORALL datatype 
	{
		String dt = datatypeToString($reconfiguration_def::datatype);
	}
	
	id1=ID id2=ID 
	{
		String value = $id1.text;
		
		//name of set to iterate
		String set_name = "";
		if ($reconfiguration_def::args.contains($id2.text)){
			set_name = "this." + $id2.text;
		}
		else{
			set_name = $id2.text;
		}
	}
	
	reconfiguration_block[true]
	{
		//String adv = $reconfiguration_def::adv.substring(0, $reconfiguration_def::adv.length() - 2);
		String for_insts = "for(" + dt + " " + value + " : " + set_name + ") {\n"; //add template -> for(dt,v,set,insts)
		
		for (String i : $for_instruction::insts) {
			for_insts += i + "\n";
		}
		for_insts += "}";
		
		$for_instruction.value = for_insts;
	}
	)
	;
	
	
expression returns[String value]
@init{
	String value = "";
}
	: ^(OP_UNION s1=expression s2=expression)
	{
		value = "(new LinkedHashSet<T>(" + s1 + ")).addAll(" + s2 + ")";
	}
	
	| ^(OP_INTERSECTION s1=expression s2=expression)
	{
		value = "(new LinkedHashSet<T>(" + s1 + ")).removeAll(" + s2 + ")";
	}
	
	| ^(OP_MINUS s1=expression s2=expression)
	{
		value = "(new LinkedHashSet<T>(" + s1 + ")).retainAll(" + s2 + ")";
	}
		
	| factor 
	{
		$expression.value = $factor.value;
	}
	;


factor returns[String value]
	: ^(ID ID)
	| ID 
	{
		if ($reconfiguration_def::args.contains($ID.text)){
			$factor.value = "this." + $ID.text;
		}
		else{
			$factor.value = $ID.text;
		}
	}
	| operation 	{ $factor.value = $operation.value; }
	| constructor	{ $factor.value = $constructor.value; }
	;
	
operation returns[String value]
@init{
	String op = "";
	String var = "";
}
	: ^(ACCESS id1=ID 
	{
		op += $id1.text;
		var = $id1.text;
	}
	(^(STRUCTURE id2=ID) 
	{
		op += ".getChannel(" + $id2.text + ")";
		var = $id2.text;
	}
	)? 

	attribute_call[var] //rever
	{
		op += "." + $attribute_call.value + ";";
		
		$operation.value = op;
	}
	)
//	| single_return_operation
	| structure_operation_call
	;	

constructor returns[String value]
	: triple_cons	{ $constructor.value = $triple_cons.value; }
	| pair_cons	{ $constructor.value = $pair_cons.value; }
	| set_cons 	{ $constructor.value = $set_cons.value; }
	| node_cons	{ $constructor.value = $node_cons.value; }
	| xor_cons	{ $constructor.value = $xor_cons.value; }
	;
	
//single_return_operation
//	: ^(OP_FST operation_args)
//	| ^(OP_SND operation_args) 
//	| ^(OP_TRD operation_args)
//	;
	
attribute_call[String var] returns[String value]
@init{
	String value = "";
}
	: ^(OP_IN INT?)
	{
		if ($INT.text != null){
			value = "getIn(" + $INT.text + ")";
		}
		else{
			value = "getInodes()";
		}
		
		$attribute_call.value = value;
	}
	
	| ^(OP_OUT INT?)
	{
		if ($INT.text != null){
			value = "getOut(" + $INT.text + ")";
		}
		else{
			value = "getOnodes()";
		}
		
		$attribute_call.value = value;
	}
	
	| OP_NAME 	{ $attribute_call.value = "getId()"; } //channel
	| OP_NODES	{ $attribute_call.value = "getNodes()"; } //pattern
	| OP_NAMES	{ $attribute_call.value = "getNames()"; } //pattern	
	| ^(OP_ENDS ID)	{ $attribute_call.value = "getEnds()"; } //channel -> pattern : getEndsOf(id)?
	| OP_FST	{ $attribute_call.value = "fst()"; } //pair or triple	
	| OP_SND	{ $attribute_call.value = "snd()"; } //pair or triple
	| OP_TRD	{ $attribute_call.value = "trd()"; } //triple
	| ID	//rever
	;
	
	
triple_cons returns[String value, String dt]
@init{
	String dt = "";
}
	: ^(TRIPLE expression expression expression)
	{
		$triple_cons.dt = "Triple<" + dt + ", " + dt + ", " + dt + ">";
	}
	;
	
	
pair_cons returns[String value, String dt]
@init{
	String dt = "";
}
	: ^(PAIR expression expression)
	{
		$pair_cons.dt = "Pair<" + dt + ", " + dt + ">";
	}
	;
	
	
	
set_cons returns[String value, String dt]
@init{
	String dt = "";
	String value = "";
}
	: ^(SET 
	{
		value += "new " + $declaration::dt + "();\n"; //rever
	}
	
	expression*) 
	
	{
		$set_cons.dt = "LinkedHashSet<" + dt + ">";
	}
	;
	
		
node_cons returns[String value, String dt]
	: ^(NODE ID+ ) 
	{
		$node_cons.dt = "Node";
	}
	;

xor_cons returns[String value, String dt]
	: ^(XOR  ^(IN ID ID*) ^(OUT ID ID+) )
	{
		$xor_cons.dt = "Node";
	}
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

