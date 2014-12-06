tree grammar RecTranslator;

options{
	tokenVocab = RecParser;
	ASTLabelType = CommonTree;
	output = template;
	//language = java;
}

@header{
	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.ReoLangCP2;
	import pt.uminho.di.reolang.ReoLangSemantics;
	import pt.uminho.di.reolang.parsing.Semantics;
	import pt.uminho.di.reolang.parsing.CPBuilder;
	import pt.uminho.di.reolang.reclang.Constants;
	import pt.uminho.di.reolang.parsing.util.*;
	import pt.uminho.di.cp.model.CPModelInternal;
	import java.util.Set;
	import java.util.HashSet;
	import java.util.LinkedHashMap;
	import java.io.File;
	import java.util.regex.Pattern;	
	import java.util.regex.Matcher;
}

@members{
	private HashMap<String,String> reconfigurations;
	
	public HashMap<String,String> getReconfigurations(){
		return this.reconfigurations;
	}
	
	/* unused */
	private Pair<String,String> main;
	
	public Pair<String,String> getMain(){
		return this.main;
	}
	
	
	
	private String file_path;
	
	public void setFilePath(String file) {
		this.file_path = file;
	}
	
	private String retrivePathFromFilePath(String file_path) {
		int idx = file_path.lastIndexOf('/');
		String path = file_path.substring(0, idx + 1);
		return path;
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
	
	
	private boolean argsContainsVar(String args, String var){
		Pattern pattern = Pattern.compile("\\b_"+ var +"\\b");
	    	Matcher matcher = pattern.matcher(args);
	    	return matcher.find();
	}
}



//GRAMMAR

reclang[TinySymbolsTable global_table]
scope{
	TinySymbolsTable ids_table;
	SymbolsTable coopla_table;
	List<String> imported_coopla_files;
	LinkedHashMap<String, CPModelInternal> patterns;

	int scope_id;
	int parent_id;
	int aux_id;
	List<Integer> scopes;
}
@init{
	$reclang::ids_table = $reclang.global_table;
	$reclang::coopla_table = new SymbolsTable();
	$reclang::imported_coopla_files = new ArrayList<String>();
	$reclang::coopla_table = new SymbolsTable();
	$reclang::patterns = new LinkedHashMap<String, CPModelInternal>();
	
	this.reconfigurations = new HashMap<String, String>();
	
	$reclang::scope_id = 0;
	$reclang::parent_id = 0;
	$reclang::aux_id = 0;
	
	$reclang::scopes = new ArrayList<Integer>(); //LinkedList or Stack
	$reclang::scopes.add(0);
	
}
	: ^(RECONFIGS directive_def* content)
	
	;




directive_def
	: directive_import
	;

	
directive_import
	: ^(IMPORT STRING
	{
		String file_name = $STRING.text;
		String file = file_name.substring(1, file_name.length()-1); //remove " from string
		
	    	File f = new File( file );
	    	if( !f.exists() ){
	    		String path = retrivePathFromFilePath(this.file_path);
	    		file = path + file;
	    		f = new File( file );
	    	}
	    	if( f.exists() ){
			String file_extension = file_name.substring(file_name.length()-5, file_name.length()-1); //eg: "overlap.rpl" -> rpl
			
			if (file_extension.equals(Constants.RECOOPLA_FILE_EXTENSION)) {	//rpla
				ReCooPLaProcessor p = new ReCooPLaProcessor(file, "");
				TinySymbolsTable imported_ids_table = p.getIdentifiersTable($reclang::ids_table);
				HashMap<String, String> imported_translation = p.getTranslation(imported_ids_table);
				
				this.reconfigurations.putAll(imported_translation);
			}
			else if (file_extension.equals(Constants.COOPLA_FILE_EXTENSION)) {	//*.cpla
				$reclang::imported_coopla_files.add(file);
				/*
				CPBuilder cp_model_builder = new CPBuilder(file);
				ReoLangCP2 res = cp_model_builder.performModelConstruction(this.patterns, $reclang::coopla_table);
				this.patterns = res.getPatterns() != null ? res.getPatterns() : this.patterns;
				*/
				Semantics semantics = new Semantics(file);
				ReoLangSemantics.reolang_return imported_atts = semantics.performSemanticAnalysis($reclang::coopla_table);
				$reclang::coopla_table = imported_atts != null ? imported_atts.symbols : $reclang::coopla_table ;
				
				
				CPBuilder cp_model_builder = new CPBuilder(file);
				ReoLangCP2 res = cp_model_builder.performModelConstruction($reclang::patterns, $reclang::coopla_table);
				$reclang::patterns = res.getPatterns() != null ? res.getPatterns() : $reclang::patterns;
			}
		}
	}
	)
	;




content
scope{
	TinySymbol ts;
	TinySymbolsTable current_scope;
}
	: (element
	{	
		this.reconfigurations.put($element.name, $element.st.toString());
	}
	)*
	
	(main
	{	
		this.reconfigurations.put($main.name, $main.st.toString());
		//this.main = new Pair<String, String>($main.name, $main.st.toString());
	}
	)?
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
	;

main returns[String name]
	: ^(MAIN main_def
	{
		$main.name = $main_def.id;
	}
	)
	-> {$main_def.st}
	;


reconfiguration_def returns[String id]
scope{
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
	$content::ts = new TinySymbol();
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
		$content::ts = ts;
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
scope{
	Integer i;
}
@init {
	$reconfiguration_block::i = 0;
}
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
	String dt;
}
@init{
	$content::current_scope = this.getScope( $reclang::scopes.get($reclang::scopes.size()-1) ); //rever
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
@init{
	Integer i = $reconfiguration_block::i++;
}
	: ^(OP_APPLY reconfiguration_call 
	{
		String op = $reconfiguration_call.name;
		//eg: par -> P + ar = Par
		String class_name = Character.toUpperCase(op.charAt(0)) + op.substring(1);
		
		boolean isPrimitive = false;
		if (class_name.equals("Id") || class_name.equals("Const") || class_name.equals("Par") 
			|| class_name.equals("Join") || class_name.equals("Split") || class_name.equals("Remove")){
			isPrimitive = true;	
		}
		
		
		List<String> dts = new ArrayList<String>();
		
		for (String dt : $reconfiguration_call.dts){
			int j = dt.indexOf('<');
			if (j > 0){
				dts.add(dt.substring(0, j) + ".class"); //eg: Pair<Node,Node> -> Pair
			} else {
				dts.add(dt + ".class");
			}
		}
		String datatypes = listToString(dts);
		
		String rec = "";
				
		if (isPrimitive){
			$reconfiguration_def::reconfs.add(class_name + " " + op + ";");
		}
		else{
			String aux = "\nClass " + op + " = Class.forName( \"" + class_name + "\" );\n";
			aux += "Constructor " + op + "_constructor = " + op + ".getConstructor(" + datatypes + ");\n";	
			$reconfiguration_def::reconfs.add(aux);
		}
		
		String args = $reconfiguration_call.args;
		
		if (isAssignment){
			String var_name = "_" + $assignment::ts.getId();
			String dt = $instruction::dt;
			//List<String> dt = new ArrayList<String>( this.convertRecooplaDatatype( $assignment::ts.getDataType() ) );
			//String datatype = datatypeToString(dt);
			if (isPrimitive){
				rec = op + " = new " + class_name + "(" + args + ");\n";
				rec += "final " + dt + var_name + " = " + op + ".apply(\$cp)"; //add template
			}
			else{
				rec += "Object " + op + i + "_obj = " + op + "_constructor.newInstance(" + args + ");\n";
				rec += "Method " + op + i + "_apply = " + op + ".getMethod(\"apply\", CoordinationPattern2.class);\n";
				
				String invoke = "(CoordinationPattern2) " + op + i + "_apply.invoke(" + op + i + "_obj, \$cp )";
				rec += "final " + dt + var_name + " = " + invoke;
			}
			
		}
		else{
			if (isPrimitive){
				rec = op + " = new " + class_name + "(" + args + ");\n" + op + ".apply(\$cp)"; //add template
			}
			else{
				rec += "Object " + op + i + "_obj = " + op + "_constructor.newInstance(" + args + ");\n";
				rec += "Method " + op + i + "_apply = " + op + ".getMethod(\"apply\", CoordinationPattern2.class);\n";
				
				rec += op + i + "_apply.invoke(" + op + i + "_obj, \$cp )";
			}
		}
		
		$reconfiguration_apply.value = rec + ";";
		$reconfiguration_block::i = i;
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
				decls.add("final " + $instruction::dt + v + ";"); //" = null;"
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
		Integer s_id = $content::current_scope.getScopeRel().fst();	
		$assignment::ts = $content::current_scope.containsSymbol($ID.text) ? $content::current_scope.getSymbols().get($ID.text) : $content::ts.hasValue($ID.text, s_id);	
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
	
reconfiguration_call returns[String name, String args, List<String> dts]
	: ^(OP_JOIN operation_args)
	{
		$reconfiguration_call.name = $OP_JOIN.text;
		$reconfiguration_call.args = $operation_args.values;
		$reconfiguration_call.dts  = $operation_args.datatypes;
	}
	| ^(OP_SPLIT operation_args)
	{
		$reconfiguration_call.name = $OP_SPLIT.text;
		$reconfiguration_call.args = $operation_args.values;
		$reconfiguration_call.dts  = $operation_args.datatypes;
	}
	| ^(OP_PAR operation_args)
	{
		$reconfiguration_call.name = $OP_PAR.text;
		$reconfiguration_call.args = $operation_args.values;
		$reconfiguration_call.dts  = $operation_args.datatypes;		
	}
	| ^(OP_REMOVE operation_args)
	{
		$reconfiguration_call.name = $OP_REMOVE.text;
		$reconfiguration_call.args = $operation_args.values;
		$reconfiguration_call.dts  = $operation_args.datatypes;
	}
	| ^(OP_CONST operation_args)
	{
		$reconfiguration_call.name = $OP_CONST.text;
		$reconfiguration_call.args = $operation_args.values;
		$reconfiguration_call.dts  = $operation_args.datatypes;
	}
	| ^(OP_ID operation_args)
	{
		$reconfiguration_call.name = $OP_ID.text;
		$reconfiguration_call.args = ""; //id does not have args
		$reconfiguration_call.dts  = new ArrayList<String>();
	}
	| ^(ID operation_args)
	{
		$reconfiguration_call.name = $ID.text;
		$reconfiguration_call.args = $operation_args.values;
		$reconfiguration_call.dts  = $operation_args.datatypes;
	}
	;
	
	
structure_operation_call
	: ^(OP_PATH operation_args)
	| ^(OP_UPDATE operation_args)
	;
	
	
operation_args returns[String values, List<String> datatypes]
@init{
	String args = "";
	List<String> datatypes = new ArrayList<String>();
}
	: (args
	{
		args = $args.values;
		datatypes = $args.datatypes;
	}
	)?
	
	{
		$operation_args.values = args;
		$operation_args.datatypes = datatypes;
	}
	;
	
args returns[String values, List<String> datatypes]
@init{
	List<String> args = new ArrayList<String>();
	List<String> datatypes = new ArrayList<String>();
}
	: (expression
	{
		args.add($expression.value);
		datatypes.add($expression.dt);
	}
	)+
	
	{
		//convert list args to string, separated by ','
		$args.values = listToString(args);
		$args.datatypes = datatypes;
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
		$content::current_scope = this.getScope($reclang::parent_id); //rever
	
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
		if ($content::ts.getId().equals("\$main")){
			datatype = "LinkedHashSet<" + $s1.dt + ">";
		} else{
			dt = this.convertRecooplaDatatype( $assignment::ts.getDataType() );
			datatype = this.datatypeToString(dt);
		}
	
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
		if ($content::ts.getId().equals("\$main")){
			datatype = "LinkedHashSet<" + $s1.dt + ">";
		} else{
			dt = this.convertRecooplaDatatype( $assignment::ts.getDataType() );
			datatype = this.datatypeToString(dt);
		}
		
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
		if ($content::ts.getId().equals("\$main")){
			datatype = "LinkedHashSet<" + $s1.dt + ">";
		} else{
			dt = this.convertRecooplaDatatype( $assignment::ts.getDataType() );
			datatype = this.datatypeToString(dt);
		}
		
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
		Integer s_id = $content::current_scope.getScopeRel().fst();	
		TinySymbol ts = $content::current_scope.containsSymbol($ID.text) ? $content::current_scope.getSymbols().get($ID.text) : $content::ts.hasValue($ID.text, s_id);	
		
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
		
		Integer s_id = $content::current_scope.getScopeRel().fst();	
		TinySymbol ts = $content::current_scope.containsSymbol($id1.text) ? $content::current_scope.getSymbols().get($id1.text) : $content::ts.hasValue($id1.text, s_id);	
	}
	(^(STRUCTURE id2=ID) 
	{
		op += ".getChannel(\"" + $id2.text + "\")"; //"_" + id
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
//	| node_cons	{ $constructor.value = $node_cons.value; 	$constructor.dt = $node_cons.dt; }
//	| xor_cons	{ $constructor.value = $xor_cons.value; 	$constructor.dt = $xor_cons.dt; }
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
	
	List<String> datatype = new ArrayList<String>( this.convertRecooplaDatatype(ts.getDataType()) );
	datatype.remove(0); //remove Pair or Triple type -> eg: Pair<Node> ([PAIR,NODE]) => [Node]
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
	
/*		
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
*/


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





main_def returns[String id]
scope{
	List<String> imported_cps;
	List<String> arg_instances;
	HashMap<String,String> declared_cps;
}
@init{
	$content::ts = $reclang::ids_table.getSymbols().get("\$main");
	$content::current_scope = $content::ts.getScopes().get(0); //main has only one scope
		
	$main_def::imported_cps = new ArrayList<String>();
	$main_def::arg_instances = new ArrayList<String>();
	$main_def::declared_cps = new HashMap<String,String>();
	$main_def.id = "Run";
	
	HashMap<String, Symbol> coopla_symbols = $reclang::coopla_table.getSymbols();
	for (String key : coopla_symbols.keySet()){
		Symbol s = coopla_symbols.get(key);
		if (s.getType().equals("PATTERN")){
			$main_def::imported_cps.add(s.getId());
		}
	}
}
	: main_args? 
	{
		String value = "";
		for (String key : $reclang::patterns.keySet()){
			//CPModelInternal -> Set<stoch_instances (String, CP2)> -> Set<String>
			Set<String> instances = $reclang::patterns.get(key).getStochInstances().keySet();
			
			for(String instance : instances){
				value += "CoordinationPattern2 _" + instance + " = new CoordinationPattern2(" +
					"imported_patterns.get(\"" + key + "\").getStochInstances().get(\"" + instance + "\"));\n";
			}
		}	
		List<String> values = new ArrayList<String>();
		values.add(value);
		if ($main_args.values != null){
			values.addAll($main_args.values);
		}
	}
	
	main_block
	
	-> mkmain(files={$reclang::imported_coopla_files}, args={values}, insts={$main_block.values})
	;

main_args returns[List<String> values]
@init {
	List<String> args = new ArrayList<String>();
}
	: ^(ARGUMENTS (main_arg
	{
		args.add($main_arg.st.toString());
	}
	)+
	
	)
	{
		$main_args.values = args;
	}
	
	;

main_arg
	: ^(ARGUMENT ID ids
	{
		for (String var : $ids.values){
			$main_def::declared_cps.put(var,$ID.text);
			$main_def::arg_instances.add(var);
		}
		String first_id = $ids.values.get(0);
		String cp_delays = "delays = new HashMap<Node, Pair<Double, Double>>();\n" +
			"for (Node n : _" + first_id + ".getPorts()){\n" +
			"\tdelays.put(n, new Pair<Double, Double>(1.0,0.0));\n}" +
			"for (Node n : _" + first_id + ".getMixed()){\n" +
			"\tdelays.put(n, new Pair<Double, Double>(10000.0,10000.0));\n}";	
		boolean isEmpty = false;
		if ($ID.text.equals("Empty")){
			isEmpty = true;
		}
	}
	)
	-> list_args(empty={isEmpty}, cp={$ID.text}, ids={$ids.values}) //, delays={cp_delays}
	;	

ids returns[List<String> values]
@init {
	List<String> ids = new ArrayList<String>();
}
	: ^(IDS (ID
	{
		ids.add($ID.text); //"_" + $ID.text
	}
	)+
	)
	{
		$ids.values = ids;
	}
	;	
	

main_block returns[List<String> values]
scope{
	Set<String> reconfs;
	Integer i;
}
@init {
	$main_block::reconfs = new HashSet<String>();
	$main_block::i = 0;
	List<String> insts = new ArrayList<String>();
}
	: ^(INSTRUCTIONS (main_instruction
	{
		insts.add($main_instruction.value);
	}
	)+
	
	)
	{
		List<String> all_instructions = new ArrayList<String>($main_block::reconfs);
		all_instructions.addAll(insts);
		
		$main_block.values = all_instructions;
	}
	;

main_instruction returns[String value]
//	: main_declaration	{ $main_instruction.value = $main_declaration.value; }
	//-> {$main_declaration.st}
	
	: main_assignment	{ $main_instruction.value = $main_assignment.value; }
	//-> {$main_assignment.st}
	| reconf_apply		{ $main_instruction.value = $reconf_apply.value; }
	;

main_assignment returns[String value]
@init{
	Integer i = $main_block::i++;
	String value = "";
	String invoke = "";
	List<String> instances = new ArrayList<String>();
	String cp_type = "";
	
	String first_id = "";
	
	String add_pattern = "";
}
	: ^( APPLICATION ^(DECLARATION id1=ID ids) 
	{
		List<String> ids = new ArrayList<String>();
		for (String id : $ids.values){
			ids.add("_" + id);
		}
		instances = new ArrayList<String>(ids); //n�o cria apontador para values -> cria copia das instancias
		
		first_id = ids.get(0);
		//first_decl = first_id + " = "; //(CoordinationPattern2) 
	
		value += "\nCoordinationPattern2 " + first_id + " = new CoordinationPattern2();\n"; 
		$main_def::declared_cps.put(first_id.substring(1), $id1.text);
						
		ids.remove(0);
		for (String id : ids){
			//remaining += ...
			value += "CoordinationPattern2 " + id + " = new CoordinationPattern2(" + first_id + ");\n";
			//id = _so; id.substring(1) = so
			$main_def::declared_cps.put(id.substring(1), $id1.text);
		}
		
		//adiciona novo tipo de padrao a um map de padroes (eg: Replicator x = ... -> add "Replicator")
		add_pattern += "\n\t\$new_cp = new CoordinationPattern2(" + first_id + ");\n";
		add_pattern += "\t\$new_cp.setId(\"" + $id1.text + "\");\n";
	}
	
	^(OP_APPLY id2=ID reconfiguration_call
	{
		String op = $reconfiguration_call.name; //.toLowerCase();
		//String var_name = op.toLowerCase();
		
		//eg: par -> P + ar = Par
		String class_name = Character.toUpperCase(op.charAt(0)) + op.substring(1);
		
		String args = $reconfiguration_call.args;
		
		boolean isPrimitive = false;
		if (class_name.equals("Id") || class_name.equals("Const") || class_name.equals("Par") 
			|| class_name.equals("Join") || class_name.equals("Split") || class_name.equals("Remove")){
			isPrimitive = true;	
		}
		
		
		//rever try - catch
		value += "\ntry{\n";
		String aux = "_" + $id2.text;
//		if ($main_def::declared_cps.containsKey(aux)){
		//if (!$main_def::arg_instances.contains(aux)){
//			value += "\tfinal CoordinationPattern2 aux_cp" + i + " = new CoordinationPattern2(" + aux + ");\n"; //variavel auxiliar para evitar problemas com sets
//			args = args.replace(aux, "aux_cp" + i);
//			aux = "aux_cp" + i;
//		}
	
		for (String var : $main_def::declared_cps.keySet()){
			//if (args.contains(var)){
			//if (args.matches("(.*)\\b_" + var + "\\b(.*)")){
			if (this.argsContainsVar(args, var)){
				value += "\tfinal CoordinationPattern2 _aux_cp" + i + " = new CoordinationPattern2(_" + var + ");\n"; //variavel auxiliar para evitar problemas com sets
				args = args.replace("_" + var, "_aux_cp" + i);
				i++;
			}
		}
		
					
		if (isPrimitive){
			//String rec = class_name + " _" + op + " = new " + class_name + "(" + args + ");\n"; //const RW -> _const
			String rec = class_name + " " + op + "_primitive;\n"; //const RW -> _const
			$main_block::reconfs.add(rec);
			
			value += "\t" + op + "_primitive = new " + class_name + "(" + args + ");\n";
			invoke = "(CoordinationPattern2) " + op + "_primitive.apply( " + aux + " )";
			//value += first_decl + "_" op + ".apply(_" + $id2 + ");\n";
			//value += remaining;
			//value += add_pattern;
		}
		else{
			List<String> dts = new ArrayList<String>();
			
			for (String dt : $reconfiguration_call.dts){
				int j = dt.indexOf('<');
				if (j > 0){
					dts.add(dt.substring(0, j) + ".class"); //eg: Pair<Node,Node> -> Pair
				} else {
					dts.add(dt + ".class");
				}
			}
			String datatypes = listToString(dts);
			
			String rec = "\nClass " + op + " = Class.forName( \"" + class_name + "\" );\n";
			rec += "Constructor " + op + "_constructor = " + op + ".getConstructor(" + datatypes + ");\n";	
			$main_block::reconfs.add(rec);
			
			value += "\tObject " + op + i + "_obj = " + op + "_constructor.newInstance(" + args + ");\n";
			value += "\tMethod " + op + i + "_apply = " + op + ".getMethod(\"apply\", CoordinationPattern2.class);\n";
			
			invoke = "(CoordinationPattern2) " + op + i + "_apply.invoke(" + op + i + "_obj, " + aux + " )"; //_" + $id2 + "
		}
		
		instances.add("_" + $id2.text);
		//------------check if new instance has the same structure
		add_pattern += "\n\t//se o pattern já existir...\n";
		add_pattern += "\tif(this.getPattern(" + instances.get(0) + ".getId()) != null){\n";
		add_pattern += "\t\tif(this.comparePatterns(this.getPattern(" + instances.get(0) + ".getId()), \$new_cp)){\n";
		add_pattern += "\t\t\tif(imported_patterns.keySet().contains(" + instances.get(0) + ".getId()) ){\n";
		add_pattern += "\t\t\t\tthis.removeInstance(\"" + $id2.text +"\");\n";
		add_pattern += "\t\t\t\t" + aux + ".setId(" + instances.get(0) + ".getId());\n";
		for (String id : instances){
			add_pattern += "\t\t\t\timported_patterns.get(" + instances.get(0) + ".getId()).getStochInstances().put(\"" + id.substring(1) + "\", " + id +");\n";
		}
		add_pattern += "\t\t\t\tcreated_patterns.put( " + instances.get(0) + ".getId(), imported_patterns.get(" + instances.get(0) + ".getId()) );\n";
		add_pattern += "\t\t\t\timported_patterns.remove(" + instances.get(0) + ".getId());\n\t\t\t}\n";
		
		add_pattern += "\t\t\telse{\n";
		add_pattern += "\t\t\t\tthis.removeInstance(\"" + $id2.text +"\");\n";
		add_pattern += "\t\t\t\t" + aux + ".setId(" + instances.get(0) + ".getId());\n";
		for (String id : instances){
			add_pattern += "\t\t\t\tcreated_patterns.get(" + instances.get(0) + ".getId()).getStochInstances().put(\"" + id.substring(1) + "\", " + id +");\n";
		}
		add_pattern += "\t\t\t}\n";
		add_pattern += "\t\t}\n";
		
		add_pattern += "\t\telse{\n";
		add_pattern += "\t\t\tthrow new Exception(\"Instance " + instances.get(0).substring(1)
					+ " (" + $ids.start.getLine() + ":" + $ids.start.getCharPositionInLine() + ") " 
					+ "can not be declared with type " + $id1.text + "! \"\n";
		add_pattern += "\t\t\t\t+ \"\\nIts internal structure does not match with pattern " + $id1.text + ".\");\n";
		add_pattern += "\t\t}\n";
		add_pattern += "\t}\n";
		//-------------------------
		instances.remove("_" + $id2.text);
		
		add_pattern += "\telse{\n";
		
		add_pattern += "\t\t\$cpmi = new CPModelInternal();\n";
		add_pattern += "\t\t\$cpmi.setSimplePattern(\$new_cp);\n";
		//remove padrão do tipo anterior -> foi reconfigurado logo já a sua estrutura já não corresponde ao tipo anterior
		add_pattern += "\t\tthis.removeInstance(\"" + $id2.text +"\");\n";
		add_pattern += "\t\t" + aux + ".setId(" + instances.get(0) + ".getId());\n";
		for (String id : instances){
			value += "\t" + id + " = " + invoke + ";\n";
			//rever -> será necessário mudar nome das instancias para o novo tipo?
			value += "\t" + id + ".setId(\"" + $id1.text + "\");\n";
			//value += "t" + aux + ".setId(\"Reconfigured_\" + " + aux + ".getId() );\n"; //eg.: Reconfigured_Original
			
			//id.substring(1) -> remove "_"
			add_pattern += "\t\t\$cpmi.getStochInstances().put(\"" + id.substring(1) + "\", " + id +");\n";
//				if (id.equals(first_id)){
//					value += "\t" + id + " = " + invoke + ";\n";
//				} else{
//					value += "\t" + id + " = " + first_id + ";\n";
//				}
			
			//eg, rec = x.invoke(); rec2 = rec;
//				value += "\t" + id + " = ";
//				value += id.equals(first_id) ? invoke + ";\n" : first_id + ";\n"; 
		}
		add_pattern += "\t\t\$cpmi.getStochInstances().put(\"" + $id2.text + "\", _" + $id2.text +");\n";
		add_pattern += "\t\tcreated_patterns.put( \"" + $id1.text + "\", \$cpmi );\n";
		
		//final else
		add_pattern += "\t}\n";
		
		//value += remaining;
		value += add_pattern;
		
		value += "} catch(Exception e) {\n";
		value += "\terrors.add(e); \n"; //}\n";
		value += "\tthrow e; \n}\n";
	}
	) 
	
	{
		$main_assignment.value = value;
		$main_block::i = i;
	}
	)
		//rever -> optional parts
	//-> assignment(name={class_name}, var={op}, dts={dts}, ids={args}, cp={"_" + $id2}, res={$ids.values})
	;
	
reconf_apply returns[String value]
@init{
	Integer i = $main_block::i++;
	String value = "";
	String invoke = "";
	String cp_type = "";
	
	//String add_pattern = "";
}
	: ^(OP_APPLY ID reconfiguration_call
	{
	
		String op = $reconfiguration_call.name; //.toLowerCase();
		//String var_name = op.toLowerCase();
		
		//eg: par -> P + ar = Par
		String class_name = Character.toUpperCase(op.charAt(0)) + op.substring(1);
		
		String args = $reconfiguration_call.args;
		
		boolean isPrimitive = false;
		if (class_name.equals("Id") || class_name.equals("Const") || class_name.equals("Par") 
			|| class_name.equals("Join") || class_name.equals("Split") || class_name.equals("Remove")){
			isPrimitive = true;	
		}
		
		
		//rever try - catch
		value += "\ntry{\n";
		String aux = "_" + $ID.text;
		for (String var : $main_def::declared_cps.keySet()){
			//if (args.contains(var)){
			//if (args.matches("(.*)\\b_" + var + "\\b(.*)")){
			if (this.argsContainsVar(args, var)){
				value += "\tfinal CoordinationPattern2 _aux_cp" + i + " = new CoordinationPattern2(_" + var + ");\n"; //variavel auxiliar para evitar problemas com sets
				args = args.replace("_" + var, "_aux_cp" + i);
				i++;
			}
		}
		
					
		if (isPrimitive){
			//String rec = class_name + " _" + op + " = new " + class_name + "(" + args + ");\n"; //const RW -> _const
			String rec = class_name + " " + op + "_primitive;\n"; //const RW -> _const
			$main_block::reconfs.add(rec);
			
			value += "\t" + op + "_primitive = new " + class_name + "(" + args + ");\n";
			invoke = "(CoordinationPattern2) " + op + "_primitive.apply( " + aux + " )";
			//value += first_decl + "_" op + ".apply(_" + $ID + ");\n";
			//value += remaining;
			//value += add_pattern;
		}
		else{
			List<String> dts = new ArrayList<String>();
			
			for (String dt : $reconfiguration_call.dts){
				int j = dt.indexOf('<');
				if (j > 0){
					dts.add(dt.substring(0, j) + ".class"); //eg: Pair<Node,Node> -> Pair
				} else {
					dts.add(dt + ".class");
				}
			}
			String datatypes = listToString(dts);
			
			String rec = "\nClass " + op + " = Class.forName( \"" + class_name + "\" );\n";
			rec += "Constructor " + op + "_constructor = " + op + ".getConstructor(" + datatypes + ");\n";	
			$main_block::reconfs.add(rec);
			
			value += "\tObject " + op + i + "_obj = " + op + "_constructor.newInstance(" + args + ");\n";
			value += "\tMethod " + op + i + "_apply = " + op + ".getMethod(\"apply\", CoordinationPattern2.class);\n";
			
			invoke = "(CoordinationPattern2) " + op + i + "_apply.invoke(" + op + i + "_obj, " + aux + " )"; //_" + $ID + "
		}
	
		Set<String> new_cps = new HashSet<String>();
		cp_type = $main_def::declared_cps.get(aux);
		new_cps.add(cp_type);
		//remaining += "\tfinal CoordinationPattern2 " + $ID.text + " = new CoordinationPattern2( imported_patterns.get(\"" + $main_def::declared_cps.get($ID.text) + "\").getSimplePattern() );\n";
		value += "\t" + aux + " = " + invoke + ";\n";
		
		if(op.equals("id")){
			value += "\tif( imported_patterns.keySet().contains(" + aux + ".getId()) ){\n";
			value += "\t\tthis.removeInstance(\"" + $ID.text +"\");\n";
			//value += "\t\timported_patterns.get(" + aux + ".getId()).getStochInstances().put(\"" + $ID.text + "\", " + aux +");\n";
			value += "\t\tcreated_patterns.put(" + aux + ".getId(), imported_patterns.get(" + aux + ".getId()) );\n\t}\n";
			
			//value += "\telse{\n";
			//value += "\t\tcreated_patterns.get(" + aux + ".getId()).getStochInstances().put(\"" + $ID.text + "\", " + aux +");\n\t}\n";
		}
		else{
			//value += "\t" + aux + ".setId(\"Reconfigured_" + $ID.text + "\");\n"; //eg.: Reconfigured_so
			
			value += "\t" + aux + ".setId(\"Reconfigured_\" + " + aux + ".getId() );\n"; //eg.: Reconfigured_Original
		
			//remove padrão do tipo anterior -> foi reconfigurado logo já a sua estrutura já não corresponde ao tipo anterior
			value += "\tthis.removeInstance(\"" + $ID.text +"\");\n";
			//System.out.println($main_def::declared_cps);
			for (String cp : new_cps){
				//adiciona novo tipo de padrao a um map de padroes (eg: main[Replicator x}{ x @ ... -> add "Replicator")
//				add_pattern += "\n\t\$new_cp = new CoordinationPattern2( " + aux + " );\n"; //invoke
//				add_pattern += "\t\$new_cp.setId(\"" + cp + "\");\n";
				//add_pattern += "\t\$cpmi = new CPModelInternal();\n";
				value += "\t\$cpmi = created_patterns.get(\"Reconfigured\");\n";
//				add_pattern += "\t\$cpmi.setSimplePattern(\$new_cp);\n";

				//FIXED BUG - se alterar nome instancia, quando a pretender remover, não será removida devido ao sufixo Reconfigured_
//				value += "\t\$cpmi.getStochInstances().put(\"Reconfigured_" + $ID.text + "\", " + aux +");\n";
				value += "\t\$cpmi.getStochInstances().put(\"" + $ID.text + "\", " + aux +");\n";
				value += "\tcreated_patterns.put( \"Reconfigured\", \$cpmi );\n";
			}
			//value += remaining;
//			value += add_pattern;
		}
		
		value += "} catch(Exception e) {\n";
		value += "\terrors.add(e); \n"; //}\n";
		value += "\tthrow e; \n}\n";
		
		
		$reconf_apply.value = value;
		$reconf_apply.value = value;
	}
	)
	;