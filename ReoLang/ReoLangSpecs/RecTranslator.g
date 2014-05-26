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
	//import pt.uminho.di.reolang.reclang.PkgConstants;
	import java.util.Set;
	import java.util.HashSet;
}

@members{


	private HashMap<String,String> reconfigurations;
	
	public HashMap<String,String> getReconfigurations(){
		return this.reconfigurations;
	}
	
	
	private String datatypeToString(List<String> full_dt){
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
	
	private List<String> convertRecooplaDatatype(List<Type> recoopla_datatype){
		List<String> datatype = new ArrayList<String>();
		for (Type t : recoopla_datatype){
			String type = t.toString().toLowerCase();
			type = Character.toUpperCase(type.charAt(0)) + type.substring(1);
						
			//convert ReCooPLa datatypes to java datatypes
			type = type.replace("Set", "LinkedHashSet").replace("Pattern", "CoordinationPattern2").replace("Channel", "CommunicationMean2").replace("Name", "String");
			
			datatype.add(type);
		}
		return datatype;
	}
	
	//convert list args to string, separated by ','
	private String listToString(List<String> args){
		String sep = "";
		String values = "";
		for (String a : args){
			values += sep;
			values += a;
			
		        sep = ", ";
		}
		return values;
	}
	
	private TinySymbolsTable getScope(Integer id){
		TinySymbolsTable scope = null;
		for (int i = 0; i < $reconfiguration_def::scopes.size(); i++){
			TinySymbolsTable tst = $reconfiguration_def::scopes.get(i);
			if ( tst.getScopeRel().fst().equals(id) ) {
				scope = $reconfiguration_def::scopes.get(i);
				break;
			}
		}
		return scope;
	}
}



//GRAMMAR

reclang[TinySymbolsTable identifiers_table]
scope{
	TinySymbolsTable ids_table;

	int scope_id;
	int parent_id;
	int aux_id;
	List<Integer> scopes;
}
@init{
	$reclang::ids_table = $reclang.identifiers_table;
	this.reconfigurations = new HashMap<String, String>();
	
	$reclang::scope_id = 0;
	$reclang::parent_id = 0;
	$reclang::aux_id = 0;
	
	$reclang::scopes = new ArrayList<Integer>(); //LinkedList or Stack
	$reclang::scopes.add(0);
	
}
	: ^(RECONFIGS directive_def* (element
	{	
		this.reconfigurations.put($element.name, $element.st.toString()); 
	}
	)*)
	
	;




directive_def
	: directive_import
	;

	
directive_import
	: ^(IMPORT STRING)
	;





	
element returns[String name]
	: ^(RECONFIGURATION reconfiguration_def
	{
		$element.name = $reconfiguration_def.id;
	}
	)
	-> {$reconfiguration_def.st}
	
	| ^(APPLICATION applicaiton_def)	 
	-> {$applicaiton_def.st}
	
	| ^(MAIN main_def)
	;



reconfiguration_def returns[String id]
scope{
	TinySymbol name;
	ArrayList<TinySymbolsTable> scopes;
	
	List<String> datatype;
	String class_name;
	List<String> args;
	
	//body	
	Set<String> reconfs;
	List<String> insts;
	
	//tabs
	String adv;
}
@init{
	$reconfiguration_def::name = new TinySymbol();
	$reconfiguration_def::scopes = new ArrayList<TinySymbolsTable>();
	$reclang::scope_id = 0;
	
	$reconfiguration_def::class_name = "";
	$reconfiguration_def::args = new ArrayList<String>();
	
	//body
	$reconfiguration_def::reconfs = new HashSet<String>();
	$reconfiguration_def::insts = new ArrayList<String>();
	
	$reconfiguration_def::adv = "";
}
	: ^(ID 
	{
		$reconfiguration_def::class_name = Character.toUpperCase($ID.text.charAt(0)) + $ID.text.substring(1);
		
		TinySymbol ts = $reclang::ids_table.getSymbols().get($ID.text);
		$reconfiguration_def::name = ts;
		$reconfiguration_def.id = $reconfiguration_def::class_name;
		
		$reconfiguration_def::scopes = (ArrayList<TinySymbolsTable>) ts.getScopes();
	}
	
	args_def? reconfiguration_block[false] ) -> mkclass(name={$reconfiguration_def::class_name},
	fields={$args_def.values}, constructor={$args_def.st}, method={$reconfiguration_block.st})
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
		ids.add("_" + $ID.text);
		$reconfiguration_def::args.add($ID.text);
	}
	)+ 
	{
		$list_ids.values = ids; 
		//System.out.println(ids);
	}
	
	-> list_fields(datatype={$list_ids.dt}, ids={ids})
	
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
	) -> apply_method(reconfs={$reconfiguration_def::reconfs}, insts={$reconfiguration_def::insts})
	;
	
instruction returns[String value]
scope{
	TinySymbolsTable scope;
	String dt;
}
@init{
	$instruction::scope = this.getScope( $reclang::scopes.get($reclang::scopes.size()-1) ); //rever
	$instruction::dt = "";
}
	: declaration			{ $instruction.value = $declaration.value; }
	| assignment			{ $instruction.value = $assignment.value; }
	| reconfiguration_apply[false]	{ $instruction.value = $reconfiguration_apply.value; }
	| for_instruction		
	{ 
		$instruction.value = $for_instruction.value; 

		$reclang::scopes.remove($reclang::scopes.size()-1);
		$reclang::parent_id = $reclang::scopes.get($reclang::scopes.size()-1);
		$reclang::aux_id--;
	}
	;
	
reconfiguration_apply[boolean isAssignment] returns[String value]
	: ^(OP_APPLY reconfiguration_call 
	{
		String op = $reconfiguration_call.name;
		//eg: par -> P + ar = Par
		String class_name = Character.toUpperCase(op.charAt(0)) + op.substring(1);
		$reconfiguration_def::reconfs.add(class_name + " " + op + ";");
		
		String args = $reconfiguration_call.args;
		
		String rec = "";
		if (isAssignment){
			String var_name = "_" + $assignment::ts.getId();
			String dt = $instruction::dt;
			//List<String> dt = new ArrayList<String>( this.convertRecooplaDatatype( $assignment::ts.getDataType() ) );
			//String datatype = datatypeToString(dt);
			rec = op + " = new " + class_name + "(" + args + ");\n";
			rec += "final " + dt + var_name + " = " + op + ".apply(\$cp)"; //add template
		}
		else{
			rec = op + " = new " + class_name + "(" + args + ");\n" + op + ".apply(\$cp)"; //add template
		}
		
		$reconfiguration_apply.value = rec + ";";
	}
	
	ID?)
	;
	
declaration returns[String value]
@init{
	$reconfiguration_def::datatype = new ArrayList<String>();
	
	List<String> decls = new ArrayList<String>();
}
	: ^(DECLARATION datatype
	{
		$instruction::dt = datatypeToString($reconfiguration_def::datatype) + " ";
	}
	 
	(var_def
	{	
		if ($var_def.isRec) {
			decls.add($var_def.value);
		}
		else {
			if ($var_def.isAssignment){
				decls.add("final " + $instruction::dt + $var_def.value);
			}
			else {
				String v = $var_def.value;
				v = v.substring(0, v.length()-1); //remove ';'
				decls.add("final " + $instruction::dt + v + " = null;");
			}
		}
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
	
var_def returns[String value, boolean isRec, boolean isAssignment]
	: ID 
	{ 
		$var_def.value = "_" + $ID.text + ";"; 
		$var_def.isAssignment = false;
	}
	
	| assignment 
	{ 
		$var_def.value = $assignment.value;
		$var_def.isRec = $assignment.isRec;		
		$var_def.isAssignment = true;
		
	}
	;
	
assignment returns[String value, boolean isRec]
scope{
	TinySymbol ts;
}
@init{
	$assignment::ts = new TinySymbol();
}
	: ^(ASSIGNMENT ID 
	{
		Integer s_id = $instruction::scope.getScopeRel().fst();	
		$assignment::ts = $instruction::scope.containsSymbol($ID.text) ? $instruction::scope.getSymbols().get($ID.text) : $reconfiguration_def::name.hasValue($ID.text, s_id);	
	}
	
	assignment_member
	{
		if ($assignment_member.isRec) {
			$assignment.value = $assignment_member.value;
		}
		else{	
			$assignment.value = "_" + $ID.text + " = " + $assignment_member.value + ";";
		}
		$assignment.isRec = $assignment_member.isRec;
	}
	) 
	; 
	
assignment_member returns[String value, boolean isRec]
	: expression 			
	{ 
		//conditional isOp -> if (isOp) { $assignment_member.value = " bla bla" + $expression.value;}
		$assignment_member.value = $expression.value;
		$assignment_member.isRec = false;
	}
	
	| reconfiguration_apply[true]	
	{ 
		$assignment_member.value = $reconfiguration_apply.value;
		$assignment_member.isRec = true; 	
	}
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
		$reconfiguration_call.args = ""; //id does not have args
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
		$args.values = listToString(args);
	}
	;
	
	
for_instruction returns[String value]
scope{
	List<String> insts;
	TinySymbolsTable forall_table;
}
@init{
	$reconfiguration_def::datatype = new ArrayList<String>();
	$reconfiguration_def::adv += "\t";
	
	$for_instruction::insts = new ArrayList<String>();
	
	
	if ($reclang::scopes.contains($reclang::aux_id)){
		$reclang::parent_id = $reclang::aux_id;
	}
	else{
		$reclang::parent_id = $reclang::scopes.get($reclang::scopes.size()-1);
	}
	$reclang::scope_id++;
	
	$reclang::scopes.add($reclang::scope_id);
	$reclang::aux_id++;
}


	: ^(FORALL datatype 
	{
		String dt = datatypeToString($reconfiguration_def::datatype);
	}
	
	id1=ID id2=ID 
	{
		$instruction::scope = this.getScope($reclang::parent_id); //rever
	
		String value = "_" + $id1.text;
		
		//name of set to iterate
		String set_name = "";
		/*
		if ($reconfiguration_def::args.contains($id2.text)){
			set_name = "this." + "_" + $id2.text;
		}
		else{
			set_name = "_" + $id2.text;
		}
		*/
		set_name = "_" + $id2.text;
	}
	
	reconfiguration_block[true]
	{
		//String adv = $reconfiguration_def::adv.substring(0, $reconfiguration_def::adv.length() - 2);
		String for_insts = "for(" + dt + " " + value + " : " + set_name + ") {\n"; //add template -> for(dt,v,set,insts)
		
		for (String i : $for_instruction::insts) {
			String[] parts = i.split("\n"); //separate instructions by line breaks
			for (String p : parts){
				for_insts += "\t" + p + "\n";
			}
		}
		for_insts += "}";
		
		$for_instruction.value = for_insts;
	}
	)
	;
	
	
expression returns[String value, String dt, boolean isOp]
@init{
	String value = "";
	
	List<String> dt = new ArrayList<String>();
	String datatype = "";
}
	: ^(OP_UNION s1=factor s2=factor)
	{
		dt = this.convertRecooplaDatatype( $assignment::ts.getDataType() );
		datatype = this.datatypeToString(dt);
	
		value += "new " + datatype + "(" + $s1.value + "){{ \n";
		
		value += "\taddAll( ";
		if ($s2.value.contains("\n")){
			String[] parts = $s2.value.split("\n"); //separate instructions by line breaks
			for (String p : parts){
				value += p + "\n\t\t";
			}
			value = value.substring(0, value.length()-1) + ");";
		}
		else {
			value += $s2.value + " );";
		}
		value += "\n}}";
		
		$expression.value = value;
				
		$expression.dt = $s1.dt; //s1 and s2 have the same datatype
		$expression.isOp = false; //true
	}
	
	| ^(OP_INTERSECTION s1=factor s2=factor)
	{
		dt = this.convertRecooplaDatatype( $assignment::ts.getDataType() );
		datatype = this.datatypeToString(dt);
		
		//rever
		value += "new " + datatype + "(" + $s1.value + "){{ \n";
		//value += "retainAll( " + $s1.value + " ); \n}}";
		////value += "_" + $assignment::ts.getId() + ".retainAll( " + $s2.value + " )";
		value += "\tretainAll( ";
		if ($s2.value.contains("\n")){
			String[] parts = $s2.value.split("\n"); //separate instructions by line breaks
			for (String p : parts){
				value += p + "\n\t\t";
			}
			value = value.substring(0, value.length()-1) + ");";
		}
		else {
			value += $s2.value + " );";
		}
		value += "\n}}";
		
		$expression.value = value;
				
		$expression.dt = $s1.dt; //s1 and s2 have the same datatype
		$expression.isOp = false; //true
	}
	
	| ^(OP_MINUS s1=factor s2=factor)
	{
		dt = this.convertRecooplaDatatype( $assignment::ts.getDataType() );
		datatype = this.datatypeToString(dt);
		
		//rever
		value += "new " + datatype + "(" + $s1.value + "){{ \n";
		//value += "removeAll( " + $s1.value + " ); \n}}";
		////value += "_" + $assignment::ts.getId() + ".removeAll( " + $s2.value + " )";
		value += "\tremoveAll( ";
		if ($s2.value.contains("\n")){
			String[] parts = $s2.value.split("\n"); //separate instructions by line breaks
			for (String p : parts){
				value += p + "\n\t\t";
			}
			value = value.substring(0, value.length()-1) + ");";
		}
		else {
			value += $s2.value + " );";
		}
		value += "\n}}";
		
		$expression.value = value;
				
		$expression.dt = $s1.dt; //s1 and s2 have the same datatype
		$expression.isOp = false; //true
	}
		
	| factor 
	{
		$expression.value = $factor.value;
		$expression.dt = $factor.dt;
		$expression.isOp = false;		
	}
	;


factor returns[String value, String dt]
@init{
	List<String> dt = new ArrayList<String>();
}
	: ^(ID ID)
	| ID 
	{
		/*
		if ($reconfiguration_def::args.contains($ID.text)){
			$factor.value = "this." + "_" + $ID.text;
		}
		else{
			$factor.value = "_" + $ID.text;
		}
		*/
		$factor.value = "_" + $ID.text;
		
		Integer s_id = $instruction::scope.getScopeRel().fst();	
		TinySymbol ts = $instruction::scope.containsSymbol($ID.text) ? $instruction::scope.getSymbols().get($ID.text) : $reconfiguration_def::name.hasValue($ID.text, s_id);	
		
		dt = this.convertRecooplaDatatype( ts.getDataType() );
		$factor.dt = this.datatypeToString(dt);
	}
	| operation 	{ $factor.value = $operation.value; 	$factor.dt = $operation.dt; }
	| constructor	{ $factor.value = $constructor.value; 	$factor.dt = $constructor.dt; }
	;
	
operation returns[String value, String dt]
@init{
	String op = "";
}
	: ^(ACCESS id1=ID 
	{
		op += "_" + $id1.text;
		
		Integer s_id = $instruction::scope.getScopeRel().fst();	
		TinySymbol ts = $instruction::scope.containsSymbol($id1.text) ? $instruction::scope.getSymbols().get($id1.text) : $reconfiguration_def::name.hasValue($id1.text, s_id);	
	}
	(^(STRUCTURE id2=ID) 
	{
		op += ".getChannel(" + "_" + $id2.text + ")";
	}
	)? 

	attribute_call[ts]
	{
		op += "." + $attribute_call.value;
		
		$operation.value = op;
		$operation.dt = $attribute_call.dt;
	}
	)
//	| single_return_operation
	| structure_operation_call
	;	

constructor returns[String value, String dt]
	: triple_cons	{ $constructor.value = $triple_cons.value; 	$constructor.dt = $triple_cons.dt; }
	| pair_cons	{ $constructor.value = $pair_cons.value; 	$constructor.dt = $pair_cons.dt; }
	| set_cons 	{ $constructor.value = $set_cons.value; 	$constructor.dt = $set_cons.dt; }
	| node_cons	{ $constructor.value = $node_cons.value; 	$constructor.dt = $node_cons.dt; }
	| xor_cons	{ $constructor.value = $xor_cons.value; 	$constructor.dt = $xor_cons.dt; }
	;
	
//single_return_operation
//	: ^(OP_FST operation_args)
//	| ^(OP_SND operation_args) 
//	| ^(OP_TRD operation_args)
//	;
	
attribute_call[TinySymbol ts] returns[String value, String dt]
@init{
	String value = "";
	String dt = "";
	
	List<String> datatype = new ArrayList<String>( this.convertRecooplaDatatype($attribute_call.ts.getDataType()) );
}
	: ^(OP_IN INT?)
	{
		if ($INT.text != null){
			value = "getIn(" + $INT.text + ")";
			dt = "Node";
		}
		else{
			value = "getIn()";
			dt = "LinkedHashSet<Node>";
		}
		
		$attribute_call.value = value;
		$attribute_call.dt = dt;
	}
	
	| ^(OP_OUT INT?)
	{
		if ($INT.text != null){
			value = "getOut(" + $INT.text + ")";
			dt = "Node";
		}
		else{
			value = "getOut()";
			dt = "LinkedHashSet<Node>";
		}
		
		$attribute_call.value = value;
		$attribute_call.dt = dt;
	}
	
	| OP_NAME //channel
	{ 
		$attribute_call.value = "getId()"; 
		$attribute_call.dt = "String";
	} 
	
	| OP_NODES //pattern
	{ 
		$attribute_call.value = "getNodes()"; 
		$attribute_call.dt = "LinkedHashSet<Node>";
	}
	
	| OP_NAMES //pattern
	{ 
		$attribute_call.value = "getNames()"; 
		$attribute_call.dt = "LinkedHashSet<String>";
	}
	/*
	| ^(OP_ENDS ID) //channel -> pattern : getEndsOf(id)?
	{ 
		$attribute_call.value = "getEnds()"; 
		$attribute_call.dt = "LinkedHashSet<Node>";
	}
	*/
	
	| OP_FST //pair or triple
	{ 
		$attribute_call.value = "fst()";
		$attribute_call.dt = this.datatypeToString(datatype);
	}
	
	| OP_SND //pair or triple
	{ 
		$attribute_call.value = "snd()"; 
		$attribute_call.dt = this.datatypeToString(datatype);
	}
	
	| OP_TRD //triple
	{ 
		$attribute_call.value = "trd()"; 
		$attribute_call.dt = this.datatypeToString(datatype);
	} 
	
	| ID	//rever
	;
	
	
triple_cons returns[String value, String dt]
@init{
	String dt = "";
}
	: ^(TRIPLE e1=expression e2=expression e3=expression)
	{
		dt = $e1.dt;
		$triple_cons.dt = "Triple<" + dt + ", " + dt + ", " + dt + ">";
		$triple_cons.value = "new " + $triple_cons.dt + "(" + $e1.value + ", " + $e2.value + ", " + $e3.value + ")"; //add template		
	}
	;
	
	
pair_cons returns[String value, String dt]
@init{
	String dt = "";
}
	: ^(PAIR e1=expression e2=expression)
	{
		dt = $e1.dt;
		$pair_cons.dt = "Pair<" + dt + ", " + dt + ">";		
		$pair_cons.value = "new " + $pair_cons.dt + "(" + $e1.value + ", " + $e2.value + ")"; //add template
	}
	;
	
	
	
set_cons returns[String value, String dt]
@init{
	//List<String> exps = new ArrayList<String>();
	String exps = "";
}
	: ^(SET (expression
	{
		exps += "\tadd(" + $expression.value + "); \n";
	}
	)*
	
	{
		$set_cons.dt = "LinkedHashSet<" + $expression.dt + ">";
		$set_cons.value = "new " + $set_cons.dt + "() {{ \n" + exps + "}}";  //add template
		//Arrays.asList(" + listToString(exps) + "))"; //add template
	}
	) 
	;
	
		
node_cons returns[String value, String dt]
@init{
	String ends = "";
}
	: ^(NODE (ID
	{
		ends += "addEnd(\"" + $ID.text + "\"); "; //rever -> "id" ou id
	}
	)+
	
	{
		$node_cons.dt = "Node";
		$node_cons.value = "new " + $node_cons.dt + "(){{ " + ends + "}}"; //add template
	}
	)
	;

xor_cons returns[String value, String dt]
	: ^(XOR  ^(IN ID ID*) ^(OUT ID ID+) )
	{
		$xor_cons.dt = "";
		$xor_cons.value = "";
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





main_def
	: main_args? main_block
	;

main_args
	: ^(ARGUMENTS main_arg+)
	;

main_arg
	: ^(ARGUMENT ID ids)
	;	

ids
	: ^(IDS ID+)
	;	
	

main_block
	: ^(INSTRUCTIONS main_instruction+)
	;

main_instruction
	: main_declaration
	| main_assignment
	;

main_declaration
	: ^(DECLARATION ID ids)
	;

main_assignment
	: ^( APPLICATION ( ^(DECLARATION ID? ids) )? ^(OP_APPLY ID reconfiguration_call) )
	;