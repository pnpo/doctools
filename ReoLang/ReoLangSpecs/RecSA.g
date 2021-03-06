tree grammar RecSA;

options{
	tokenVocab = RecParser;
	ASTLabelType = CommonTree;
	//backtrack = true;
}

@header{
	package pt.uminho.di.reolang.reclang;
		
	import pt.uminho.di.reolang.ReoLangSemantics;
	import pt.uminho.di.reolang.parsing.Semantics;
	
	import pt.uminho.di.reolang.ReoLangCP2;
	import pt.uminho.di.reolang.parsing.CPBuilder;
	import pt.uminho.di.cp.model.CPModelInternal;
	
	import pt.uminho.di.reolang.parsing.util.Error;
	import pt.uminho.di.reolang.parsing.util.*;
	//import java.util.*;
	import java.util.Map;
	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import java.util.Set;
	import java.util.HashSet;
	import java.util.Collections;
	import java.util.Comparator;
	import java.io.File;
}

@members{
	private String file_path;

	public void setFilePath(String file) {
		this.file_path = file;
	}

	private String retriveResourceFromFilePath(String file_path) {
		int idx = file_path.lastIndexOf('/');
		String resource = file_path.substring(idx + 1);
		return resource;
	}
	
	private String retrivePathFromFilePath(String file_path) {
		int idx = file_path.lastIndexOf('/');
		String path = file_path.substring(0, idx + 1);
		return path;
	}
	

	//Error se = new Error();
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
	
	
	private ArrayList<Error> removeRepeatedErrors(ArrayList<Error> errors){
		ArrayList<Error> local_errors = new ArrayList<Error>(errors);
		
		for (int i=0; i<local_errors.size(); i++) {
			for (int j=0; j<local_errors.size(); j++) {
				if (local_errors.get(i).getMessage().equals(local_errors.get(j).getMessage()) && i != j) {
					if (local_errors.get(i).getLine() < local_errors.get(j).getLine()){
						local_errors.remove(j);
					} else{
						local_errors.remove(i);
					}
				}
			}
		}
		
		return local_errors;
	}
       	
       		
	
	//method used in expression prduction
	private Triple<List<Error>, HashSet<List<Type>>, Integer> getData(String n, List<Type> t, List<Error> e, CommonTree v){
    		
    		List<Error> local_errors = new ArrayList<Error>();
    		HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
    		Integer nulls = 0;
    		
    		if (t.isEmpty()){
    			local_errors.addAll(e);
    			nulls++;
    		}
    		else{
    			//if dt is a Set<T>
    			if (t.get(0).equals(Type.SET)){
    				datatypes.add(t);
    			}
    			else{
    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(n, "Set<T>"), v.getLine(), v.getCharPositionInLine(), this.file_path) );
    				nulls++;
    			}
    		}
    		
    		Triple<List<Error>, HashSet<List<Type>>, Integer> res = new Triple<List<Error>, HashSet<List<Type>>, Integer>();
    		res.setFirst(local_errors);
    		res.setSecond(datatypes);
    		res.setThird(nulls);
    		
    		return res;
    	}
}



//GRAMMAR

reclang[TinySymbolsTable global_table] returns[ArrayList<Error> errors]
scope{
	TinySymbolsTable ids_table; 
	SymbolsTable coopla_table;
	LinkedHashMap<String, CPModelInternal> patterns;
	int scope_id;
	int parent_id;
	int aux_id;	
	List<Integer> scopes;
	HashMap<Integer,Integer> scope_rel;
}
@init{
	$reclang::ids_table = $reclang.global_table;
	$reclang::coopla_table = new SymbolsTable();
	$reclang::patterns = new LinkedHashMap<String, CPModelInternal>();
	$reclang::scope_id = 0;
	$reclang::parent_id = 0;	
	$reclang::aux_id = 0;
	$reclang::scopes = new ArrayList<Integer>(); //LinkedList
	$reclang::scopes.add(0);
	$reclang::scope_rel = new HashMap<Integer,Integer>();

	ArrayList<Error> local_errors = new ArrayList<Error>();
	boolean exist_imported_errors = false;
}
	: ^(RECONFIGS (directive_def
	{
		local_errors.addAll($directive_def.errors);
		if ( !$directive_def.errors.isEmpty() ){
			exist_imported_errors = true;
		}
	}
	
	)* 
	
	content
	{
		
		//rever -> join imported errors to file errors?
		/*
		if( !exist_imported_errors ){ 
			local_errors.addAll($content.errors);
		}
		*/
		local_errors.addAll($content.errors);
	}
	
	) 
	{
		//System.out.println($reclang::scope_rel);
		
		//local_errors = this.removeRepeatedErrors(local_errors);
		$reclang.errors = local_errors;
	}
	
	;




directive_def returns[ArrayList<Error> errors]
	: directive_import
	{
		$directive_def.errors = $directive_import.errors;
	}
	;

	
directive_import returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();

}
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
	    	if( !f.exists() ){
    			local_errors.add( Error.report(ErrorType.ERROR, Error.fileDoesNotExist(file), $STRING.line, $STRING.pos, this.file_path) );
    		}
	    	else{
			String file_extension = file_name.substring(file_name.length()-5, file_name.length()-1); //eg: "overlap.rpl" -> rpl
			
			if (file_extension.equals(Constants.RECOOPLA_FILE_EXTENSION)) {		//*.rpla
				ReCooPLaProcessor p = new ReCooPLaProcessor(file, "");
				TinySymbolsTable imported_ids_table = p.getIdentifiersTable($reclang::ids_table);
				ArrayList<Error> imported_semantic_errors = p.getSemanticErrors( imported_ids_table );
				
				if ( !imported_semantic_errors.isEmpty() ){
					local_errors.addAll( imported_semantic_errors );
				}
			}
			else if (file_extension.equals(Constants.COOPLA_FILE_EXTENSION)) {	//*.cpla
				Semantics semantics = new Semantics(file);
				
				ReoLangSemantics.reolang_return imported_atts = semantics.performSemanticAnalysis($reclang::coopla_table);
				ArrayList<Error> coopla_errors = imported_atts != null ? imported_atts.errors : new ArrayList<Error>(0);
				if ( !coopla_errors.isEmpty() ){
					local_errors.addAll( coopla_errors );
				}
				$reclang::coopla_table = imported_atts != null ? imported_atts.symbols : $reclang::coopla_table ;
				
				CPBuilder cp_model_builder = new CPBuilder(file);
				ReoLangCP2 res = cp_model_builder.performModelConstruction($reclang::patterns, $reclang::coopla_table);
				$reclang::patterns = res.getPatterns() != null ? res.getPatterns() : $reclang::patterns;
//				if($reclang::patterns != null){
//					System.out.println($reclang::patterns);
//				}
			}
			else{
				local_errors.add( Error.report(ErrorType.ERROR, Error.invalidFile(file), $STRING.line, $STRING.pos, this.file_path) );
			}
		}
		
		$directive_import.errors = local_errors;
	}
	)
	;




content returns[ArrayList<Error> errors]
scope{
	TinySymbol name;
	boolean onMain;
	Set<String> structureless;
		
	//attributes changed on instruction
	TinySymbolsTable current_scope;
	String rec_type;
}
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
	$content::onMain = false;
	$content::structureless = new HashSet<String>();

}
	: (element
	{
		local_errors.addAll($element.errors);
	}
	)* 
	
	(main
	{
		local_errors.addAll($main.errors);
	}
	)?
	
	{
		$content.errors = local_errors;
	}
	;
	
element returns[ArrayList<Error> errors]
	: ^(RECONFIGURATION reconfiguration_def 
	{
		$element.errors = $reconfiguration_def.errors;
	}
	)
	
	| ^(APPLICATION applicaiton_def)
	;
	
main returns[ArrayList<Error> errors]
	: ^(MAIN main_def
	{
		$main.errors = $main_def.errors;
	}
	)
	;	



reconfiguration_def returns[ArrayList<Error> errors]
scope{
	ArrayList<TinySymbolsTable> scopes;
}
@init{
	$content::name = new TinySymbol();
	$reconfiguration_def::scopes = new ArrayList<TinySymbolsTable>();
	ArrayList<Error> local_errors = new ArrayList<Error>();

	$reclang::scope_id = 0;
	
	boolean recAlreadyDefined = false;
}
	: ^(ID 
	{		
		TinySymbol ts = $reclang::ids_table.getSymbols().get($ID.text);
		$content::name = ts;
		$reconfiguration_def::scopes = (ArrayList<TinySymbolsTable>) ts.getScopes();

		if ($reclang::ids_table.containsSymbol($ID.text)){
			String resource = this.retriveResourceFromFilePath(ts.getFile());
			if ( !($ID.line == ts.getLine() && $ID.pos == ts.getPosition() && this.file_path.equals(ts.getFile())) ){
				//System.out.println(resource + " -> rec: " + $ID.text);
				local_errors.add( Error.report(ErrorType.ERROR, Error.recAlreadyDefined($ID.text, ts.getLine(), ts.getPosition(), resource), $ID.line, $ID.pos, this.file_path) );
				recAlreadyDefined = true;
			}
		}
	}
	(args_def
	{
		if (!recAlreadyDefined){
			local_errors.addAll($args_def.errors);
		}
	}
	)? reconfiguration_block
	{
		if (!recAlreadyDefined){
			local_errors.addAll($reconfiguration_block.errors);
		}
	}
	) 

	{
		$reconfiguration_def.errors = local_errors;
	}
	;

args_def returns[ArrayList<Error> errors]
scope{
	TinySymbolsTable scope;
}
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
	$args_def::scope = $reconfiguration_def::scopes.get(0);
	//$reclang::scope_id++;
	TinySymbolsTable tst = new TinySymbolsTable($reclang::ids_table);
	for (TinySymbol ts : tst.getSymbols().values()){
		ts.getScopes().clear();
		$args_def::scope.addSymbol(ts);
	}
}
	: ^(ARGUMENTS (arg_def
	{
		local_errors.addAll($arg_def.errors);
	}
	)+
	)

	{
		$args_def.errors = local_errors;
	}
	;

arg_def returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();

}
	: ^(ARGUMENT datatype list_ids
	{
		local_errors.addAll($list_ids.errors);
	}
	)

	{
		$arg_def.errors = local_errors;
	}
	;

datatype
	: DT_PATTERN
	| DT_CHANNEL
	| DT_NAME
	| DT_NODE
	| DT_XOR
	|  ^( other_type subtype )
	;

other_type
	: DT_SET
	| DT_PAIR
	| DT_TRIPLE
	;

subtype
	: datatype
	;

list_ids returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();

}
	: (ID
	{
		//if ($reclang::ids_table
		if ($args_def::scope.containsSymbol($ID.text)){
			TinySymbol ts = $args_def::scope.getSymbols().get($ID.text);
			if ( !($ID.line == ts.getLine() && $ID.pos == ts.getPosition()) ){
				local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos, this.file_path) );
			}
		}
	}
	)+

	{
		$list_ids.errors = local_errors;
	}
	;


reconfiguration_block returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();

}
	: ^(INSTRUCTIONS (instruction
	{
		local_errors.addAll($instruction.errors);
	}
	)+
	)

	{
		$reconfiguration_block.errors = local_errors;
	}
	;

instruction returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
	$content::rec_type = "";
	$content::current_scope = this.getScope( $reclang::scopes.get($reclang::scopes.size()-1) ); //rever
}
	: declaration 
	{ 
		local_errors.addAll($declaration.errors); 
		$instruction.errors = local_errors;
	}
	| assignment[false] 
	{ 
		local_errors.addAll($assignment.errors); 
		$instruction.errors = local_errors; 
	}
	| reconfiguration_apply 
	{ 
		local_errors.addAll($reconfiguration_apply.errors); 
		$instruction.errors = local_errors; 
	}
	| for_instruction
	{
		local_errors.addAll($for_instruction.errors);
		$instruction.errors = local_errors;	

		$reclang::scopes.remove($reclang::scopes.size()-1);
		$reclang::parent_id = $reclang::scopes.get($reclang::scopes.size()-1);
		$reclang::aux_id--;
	}
	;

reconfiguration_apply returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();

}
	: ^(OP_APPLY reconfiguration_call
	{
		local_errors.addAll($reconfiguration_call.errors);
	}

	ID?)

	{
		$reconfiguration_apply.errors = local_errors;
	}
	;

declaration returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();

}
	: ^(DECLARATION datatype (var_def
	{
		local_errors.addAll($var_def.errors);
	}
	)+)

	{
		$declaration.errors = local_errors;
	}
	;

var_def returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();

}
	: ID
	{
		if ($content::current_scope.containsSymbol($ID.text)){
			TinySymbol ts = $content::current_scope.getSymbols().get($ID.text);
			if ( !($ID.line == ts.getLine() && $ID.pos == ts.getPosition()) ){
				local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos, this.file_path) );
			}
		}
		else {
			Integer s_id = $content::current_scope.getScopeRel().fst();
			TinySymbol ts = $content::name.hasValue($ID.text, s_id);

			if ( ts != null && !($ID.line == ts.getLine() && $ID.pos == ts.getPosition())){ //rever
				local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos, this.file_path) );
			}
		}
		$var_def.errors = local_errors;
	}

	| assignment[true] 
	{
		local_errors.addAll($assignment.errors);
		$var_def.errors = local_errors; 
	}
	;

assignment[boolean isDeclaration] returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
	TinySymbol ts = new TinySymbol();

}
	: ^(ASSIGNMENT ID
	{		
		Integer s_id = $content::current_scope.getScopeRel().fst();	
/*		
		ts = $content::current_scope.containsSymbol($ID.text) ? $content::current_scope.getSymbols().get($ID.text) : $content::name.hasValue($ID.text, s_id);	

		if (isDeclaration){
			if ( ts != null && !($ID.line == ts.getLine() && $ID.pos == ts.getPosition()) ){
				local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos, this.file_path) );
			}
		}
		else{
			if ( ts == null){
				local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, this.file_path) );
			}
		}				
*/				
		if (isDeclaration){
			if ($content::current_scope.containsSymbol($ID.text)) {
				ts = $content::current_scope.getSymbols().get($ID.text);
				if ( !($ID.line == ts.getLine() && $ID.pos == ts.getPosition()) ){
					local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos, this.file_path) );
				}
			}
			else {
				ts = $content::name.hasValue($ID.text, s_id);
				if ( ts != null && !($ID.line == ts.getLine() && $ID.pos == ts.getPosition())){ //rever
					local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos, this.file_path) );
				}
			}
		}
		else{
			ts = $content::current_scope.containsSymbol($ID.text) ? $content::current_scope.getSymbols().get($ID.text) : $content::name.hasValue($ID.text, s_id);
	
			if ( ts == null || $ID.line < ts.getLine() ){
				local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, this.file_path) );
			}
		}

		ts = $content::current_scope.containsSymbol($ID.text) ? $content::current_scope.getSymbols().get($ID.text) : $content::name.hasValue($ID.text, s_id);	
	}
	assignment_member[ts, $ID.line, $ID.pos]) 
	{
		local_errors.addAll($assignment_member.errors);
		$assignment.errors = local_errors;
	}
	; 

assignment_member[TinySymbol symbol, int id_line, int id_pos] returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
	TinySymbol ts = $assignment_member.symbol;
}
	: expression 
	{
/**/		if (!$expression.errors.isEmpty()){
			local_errors.addAll($expression.errors);
		}
		else{
//*/
			if (ts != null) {	
				if ( !ts.getDataType().equals($expression.datatype) ){
					local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($expression.name, ts.dataTypeToString()), $expression.start.getLine(), $expression.start.getCharPositionInLine(), this.file_path) );
			 	}
			}
		}
/*
		if (local_errors.isEmpty()){
			local_errors.addAll($expression.errors);
		}
*/
		$assignment_member.errors = local_errors; 
	}
	| reconfiguration_apply 
	{ 
		if (ts != null){
			List<Type> dt = new ArrayList<Type>();
			dt.add(Type.PATTERN);
			if (!ts.getDataType().equals(dt)){
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(ts.getId(), "Pattern") , $assignment_member.id_line, $assignment_member.id_pos, this.file_path) );
			}	
			else{
				local_errors.addAll($reconfiguration_apply.errors); 
			}
		}
		$assignment_member.errors = local_errors; 
	}
	;

reconfiguration_call returns[ArrayList<Error> errors]
scope{
	List<TinySymbol> args;
	String name;
}
@init{
	$reconfiguration_call::name = "";
	$reconfiguration_call::args = new ArrayList<TinySymbol>();
	ArrayList<Error> local_errors = new ArrayList<Error>();
}
	: ^(OP_JOIN 	{ $content::rec_type = "join"; }
	operation_args) 
	{ 
		if($operation_args.start != null){
			local_errors.addAll($operation_args.errors);
		}
		else{
			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments($OP_JOIN.text) , $OP_JOIN.line, $OP_JOIN.pos, this.file_path) );
		}
		$reconfiguration_call.errors = local_errors;
		$content::rec_type = ""; //reset
	}

	| ^(OP_SPLIT 	{ $content::rec_type = "split"; }
	operation_args) 
	{ 
		if($operation_args.start != null){
			local_errors.addAll($operation_args.errors);
		}
		else{
			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments($OP_SPLIT.text) , $OP_SPLIT.line, $OP_SPLIT.pos, this.file_path) );
		}
		$reconfiguration_call.errors = local_errors;
		$content::rec_type = ""; //reset
	}

	| ^(OP_PAR 	{ $content::rec_type = "par"; }
	operation_args)
	{ 
		if($operation_args.start != null){
			local_errors.addAll($operation_args.errors);
		}
		else{
			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments($OP_PAR.text) , $OP_PAR.line, $OP_PAR.pos, this.file_path) ); 
		}
		$reconfiguration_call.errors = local_errors;
		$content::rec_type = ""; //reset
	}

	| ^(OP_REMOVE 	{ $content::rec_type = "remove"; }
	operation_args)	
	{ 
		if($operation_args.start != null){
			local_errors.addAll($operation_args.errors);
		}
		else{
			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments($OP_REMOVE.text) , $OP_REMOVE.line, $OP_REMOVE.pos, this.file_path) );
		}
		$reconfiguration_call.errors = local_errors;
		$content::rec_type = ""; //reset
	}

	| ^(OP_CONST 	{ $content::rec_type = "const"; }
	operation_args)
	{ 
		if($operation_args.start != null){
			local_errors.addAll($operation_args.errors);
		}
		else{
			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments($OP_CONST.text) , $OP_CONST.line, $OP_CONST.pos, this.file_path) );
		}
		$reconfiguration_call.errors = local_errors;
		$content::rec_type = ""; //reset
	}

	| ^(OP_ID 	{ $content::rec_type = "id"; }
	operation_args)  
	{
		if($operation_args.start != null){
			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments($content::rec_type) , $OP_ID.line, $OP_ID.pos, this.file_path) );
			//local_errors.add( Error.report(ErrorType.ERROR, Error.invalidArgument($operation_args.start.toString()) , $OP_ID.line, $OP_ID.pos+4, this.file_path) );			

			////is not necessary since 'id' has no arguments
			//local_errors.addAll($operation_args.errors);
		}


		$reconfiguration_call.errors = local_errors;
		$content::rec_type = ""; //reset
	}

	| ^(ID 		
	{ 
		$content::rec_type = "custom"; 
		$reconfiguration_call::name = $ID.text;

		if ($reclang::ids_table.containsSymbol($ID.text)){
			TinySymbol ts = $reclang::ids_table.getSymbols().get($ID.text);
				
			if (ts.getLine() > $content::name.getLine()){
				local_errors.add( Error.report(ErrorType.ERROR, Error.recNotDefined($ID.text), $ID.line, $ID.pos, this.file_path) );
			}
			else{
				TinySymbolsTable tst = ts.getScopes().get(0);
				List<TinySymbol> symbols = new ArrayList<TinySymbol>(tst.getSymbols().values());

				Collections.sort(symbols, new Comparator<TinySymbol>() {
			        	public int compare(TinySymbol ts1, TinySymbol ts2) {
						int value;

				        	if (ts1.getLine() == ts2.getLine()){
				        		value = ts1.getPosition() - ts2.getPosition();
				        	}
				        	else{
				    	        	value = ts1.getLine() - ts2.getLine();
				        	}
						return value;
				        }
				});

				for (TinySymbol symbol : symbols){		
					if (symbol.getClassType().equals(Type.ARG)){
						$reconfiguration_call::args.add(symbol);
					}
				}
			}
		}
		else{
			local_errors.add( Error.report(ErrorType.ERROR, Error.recNotDefined($ID.text), $ID.line, $ID.pos, this.file_path) );
		}
	}
	operation_args)	
	{	
		if($operation_args.start != null){
			local_errors.addAll($operation_args.errors);
		}
		else{
			if (!$reconfiguration_call::args.isEmpty()){
				local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments($ID.text) , $ID.line, $ID.pos, this.file_path) ); //$ID.pos
			}
		}
		$reconfiguration_call.errors = local_errors;
		$content::rec_type = ""; //reset
	}
	;


structure_operation_call
	: ^(OP_PATH operation_args)
	| ^(OP_UPDATE operation_args)
	;


operation_args returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
}
	: (args 
	{
		//reconfiguration of type "custom" can have more than one argument; id primitive tested before (do not even have one argument)
		if ($args.counter > 1 && !$content::rec_type.equals("custom") && !$content::rec_type.equals("id")){
			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments($content::rec_type) , $args.start.getLine(), $args.start.getCharPositionInLine(), this.file_path) );
		}
		//if the number of arguments are correct, check their type (possible errors)
		else {
			if ($content::rec_type.equals("custom") && $args.counter < $reconfiguration_call::args.size()){
				local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments($reconfiguration_call::name) , $args.start.getLine(), $args.start.getCharPositionInLine(), this.file_path) );
			}
			else{
				local_errors.addAll($args.errors);
			}
		}
	})? 

	{
		$operation_args.errors = local_errors; 
	}
	;

args returns[ArrayList<Error> errors, int counter]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
	ArrayList<Error> global_errors = new ArrayList<Error>();
	int i = 0;
	boolean exceeded = false;
	List<Type> dt = new ArrayList<Type>();
}
	: (expression
	{
		String value = $expression.name;
		if ($content::rec_type.equals("custom")){
			if ($reconfiguration_call::args.size() > i){
				//original argument
				TinySymbol ts1 = $reconfiguration_call::args.get(i);

//			if (ts1 != null){				
				Integer s_id = $content::current_scope.getScopeRel().fst();
				//if contains symbol, value of new argument is obtained from $content::current_scope, else from $content::name
				TinySymbol ts2 = $content::current_scope.containsSymbol(value) ? $content::current_scope.getSymbols().get(value) : $content::name.hasValue(value, s_id);
				
				if (ts2 != null){
					dt = ts2.getDataType();
				} else {
					dt = $expression.datatype;
				}
				
				//if ( ts2 != null && !ts2.getDataType().equals(ts1.getDataType()) ){
				if ( !dt.equals(ts1.getDataType()) ){
					String datatype = ts1.dataTypeToString();
					local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(value, datatype) , $expression.start.getLine(), $expression.start.getCharPositionInLine(), this.file_path ) );
				}
			}
			else{
				exceeded = true;
			}
		}
	
		//rever ******LAST UPDATE******
		if (local_errors.isEmpty()){
			List<Type> aux_dt = new ArrayList<Type>();
			aux_dt.clear();
			aux_dt.add(Type.PATTERN);
			if ($content::rec_type.equals("const") && !$expression.datatype.equals(aux_dt) ){
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(value, "Pattern"), $expression.start.getLine(), $expression.start.getCharPositionInLine(), this.file_path) );
			}
	
			if ($content::rec_type.equals("par") && !$expression.datatype.equals(aux_dt) ){
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(value, "Pattern"), $expression.start.getLine(), $expression.start.getCharPositionInLine(), this.file_path) );
			}
	
			aux_dt.clear();
			aux_dt.add(Type.SET);
			aux_dt.add(Type.NODE);
			if ($content::rec_type.equals("join") && !$expression.datatype.equals(aux_dt) ){
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(value, "Set<Node>"), $expression.start.getLine(), $expression.start.getCharPositionInLine(), this.file_path) );
			}
	
			aux_dt.clear();
			aux_dt.add(Type.NODE);
			if ($content::rec_type.equals("split") && !$expression.datatype.equals(aux_dt) ){
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(value, "Node"), $expression.start.getLine(), $expression.start.getCharPositionInLine(), this.file_path) );
			}
	
			aux_dt.clear();
			aux_dt.add(Type.NAME);
			if ($content::rec_type.equals("remove") && !$expression.datatype.equals(aux_dt) ){
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(value, "Name"), $expression.start.getLine(), $expression.start.getCharPositionInLine(), this.file_path) );
			}
		}
		//************************
		
		local_errors.addAll($expression.errors);
		i++;
	}
	)+

	{
		if (exceeded){
			global_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments($reconfiguration_call::name) , $expression.start.getLine(), $expression.start.getCharPositionInLine(), this.file_path ) );
		}
		else{
			global_errors.addAll(local_errors);
		}
		$args.errors = global_errors;
		$args.counter = i;
	}

	;


for_instruction returns[ArrayList<Error> errors]
@init{
	if ($reclang::scopes.contains($reclang::aux_id)){
		$reclang::parent_id = $reclang::aux_id;
	}
	else{
		$reclang::parent_id = $reclang::scopes.get($reclang::scopes.size()-1);
	}
	$reclang::scope_id++;
	$reclang::scope_rel.put($reclang::scope_id, $reclang::parent_id); 

	$reclang::scopes.add($reclang::scope_id);
	$reclang::aux_id++;

	ArrayList<Error> local_errors = new ArrayList<Error>();
}
	: ^(FORALL datatype id1=ID
	{	
		$content::current_scope = this.getScope($reclang::parent_id); //rever

		Integer s_id = $content::current_scope.getScopeRel().fst();
		TinySymbol ts = $content::name.hasValue($id1.text, s_id);
		if ( ts != null ){
			local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($id1.text, ts.getLine(), ts.getPosition()), $id1.line, $id1.pos, this.file_path) );
		}
	}

	id2=ID 
	{
		ts = $content::current_scope.containsSymbol($id2.text) ? $content::current_scope.getSymbols().get($id2.text) : $content::name.hasValue($id2.text, s_id);

		if ( ts == null || $id2.line < ts.getLine() ){
			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined($id2.text), $id2.line, $id2.pos, this.file_path) );
		}
		//if (local_errors.isEmpty()){
		else{
			TinySymbol ts1 = $content::current_scope.containsSymbol($id1.text) ? $content::current_scope.getSymbols().get($id1.text) : $content::name.hasValue($id1.text, s_id);
			TinySymbol ts2 = $content::current_scope.containsSymbol($id2.text) ? $content::current_scope.getSymbols().get($id2.text) : $content::name.hasValue($id2.text, s_id);				

				if (!ts2.getDataType().get(0).equals(Type.SET)){
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($id2.text, "Set<T>"), $id2.line, $id2.pos, this.file_path) );
			}
			else{
				if (ts1 != null){
					List<Type> datatype = new ArrayList<Type>(ts2.getDataType());
					datatype.remove(0);
					if (!ts1.getDataType().equals(datatype)){
						local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($id1.text, ts2.dataTypeToString()), $id1.line, $id1.pos, this.file_path) );
					}
				}
			}
		}
	}

	reconfiguration_block
	{
		local_errors.addAll($reconfiguration_block.errors);
	}
	)

	{
		$for_instruction.errors = local_errors;
	}

	;


expression returns[ArrayList<Error> errors, List<Type> datatype, String name]
@init{
	Triple<List<Error>, HashSet<List<Type>>, Integer> res = null;

	ArrayList<Error> local_errors = new ArrayList<Error>();
	List<Type> dt = new ArrayList<Type>();

	HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
	int nulls = 0;
}

	: ^(OP_UNION f1=factor	f2=factor
	{
		res = getData($f1.name, $f1.datatype, $f1.errors, $f1.start);
		local_errors.addAll( res.fst() );
		datatypes.addAll( res.snd() );
		nulls = nulls + res.trd();

		res = getData($f2.name, $f2.datatype, $f2.errors, $f2.start);
		local_errors.addAll( res.fst() );
		datatypes.addAll( res.snd() );
		nulls = nulls + res.trd();

		$expression.errors = local_errors;
		$expression.name = $f1.name + " + " + $f2.name;

		if(datatypes.size() + nulls == 1){
			dt.addAll(datatypes.iterator().next());
		}
		$expression.datatype = dt;
	}
	)

	| ^(OP_INTERSECTION f1=factor	f2=factor
	{
		res = getData($f1.name, $f1.datatype, $f1.errors, $f1.start);
		local_errors.addAll( res.fst() );
		datatypes.addAll( res.snd() );
		nulls = nulls + res.trd();

		res = getData($f2.name, $f2.datatype, $f2.errors, $f2.start);
		local_errors.addAll( res.fst() );
		datatypes.addAll( res.snd() );
		nulls = nulls + res.trd();

		$expression.errors = local_errors;
		$expression.name = $f1.name + "& " + $f2.name;

		if(datatypes.size() + nulls == 1){
			dt.addAll(datatypes.iterator().next());
		}
		/*
		else {
			local_errors.add( Error.report(ErrorType.ERROR, Error.invalidElements("SET"), $SET.line, $SET.pos, this.file_path) );
		}
		*/
		$expression.datatype = dt;
	}
	)

	| ^(OP_MINUS f1=factor	f2=factor
	{
		res = getData($f1.name, $f1.datatype, $f1.errors, $f1.start);
		local_errors.addAll( res.fst() );
		datatypes.addAll( res.snd() );
		nulls = nulls + res.trd();

		res = getData($f2.name, $f2.datatype, $f2.errors, $f2.start);
		local_errors.addAll( res.fst() );
		datatypes.addAll( res.snd() );
		nulls = nulls + res.trd();

		$expression.errors = local_errors;
		$expression.name = $f1.name + "- " + $f2.name;

		if(datatypes.size() + nulls == 1){
			dt.addAll(datatypes.iterator().next());
		}
		$expression.datatype = dt;
	}
	)

	| factor 
	{
		$expression.errors = $factor.errors; 
		$expression.name = $factor.name; 
		$expression.datatype = $factor.datatype;
	}
	;


factor returns[ArrayList<Error> errors, List<Type> datatype, String name]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
	List<Type> dt = new ArrayList<Type>();
}
	: ^(ID ID) 
	{
		$factor.errors = local_errors;
		$factor.datatype = dt;
	}

	| ID
	{
		$factor.name = $ID.text;
		
		Integer s_id = $content::current_scope.getScopeRel().fst();
		TinySymbol ts = $content::current_scope.containsSymbol($ID.text) ? $content::current_scope.getSymbols().get($ID.text) : $content::name.hasValue($ID.text, s_id);

		if ( ts == null || $ID.line < ts.getLine() ){
			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, this.file_path) );
		}
		
		//if (local_errors.isEmpty()){
		else{
			TinySymbol symbol = ts;

			dt.clear();
			dt.addAll( symbol.getDataType() );
		}

		$factor.datatype = dt;
		$factor.errors = local_errors; 
	}
	| operation 
	{
		$factor.name = $operation.name;
		$factor.datatype = $operation.datatype;
		$factor.errors = $operation.errors; 
	}

	| constructor 
	{
		$factor.name = $constructor.name;
		$factor.datatype = $constructor.datatype;
		$factor.errors = $constructor.errors; 

	}
	;

operation returns[ArrayList<Error> errors, List<Type> datatype, String name]
scope{
	String id;
	int line;
	int pos;
}
@init{
	$operation::id = "";
	$operation::line = 0;
	$operation::pos = 0;

	boolean accessed = false;	
	ArrayList<Error> local_errors = new ArrayList<Error>();

}
	: ^(ACCESS id1=ID
	{
		$operation::id = $id1.text;
		$operation::line = $id1.line;
		$operation::pos = $id1.pos;

		Integer s_id = $content::current_scope.getScopeRel().fst();
		//if contains symbol, tiny symbol is obtained from $content::current_scope, else from $content::name
		TinySymbol ts = $content::current_scope.containsSymbol($id1.text) ? $content::current_scope.getSymbols().get($id1.text) : $content::name.hasValue($id1.text, s_id);

		if ( ts == null || $id1.line < ts.getLine() ){
			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined($id1.text), $id1.line, $id1.pos, this.file_path) );
		}
		else{
			List<Type> dt = new ArrayList<Type>();
			dt.add(Type.PATTERN);
			if (ts.getDataType().containsAll(dt) && $content::onMain && $content::structureless.contains($id1.text)){
				local_errors.add( Error.report(ErrorType.WARNING, Error.structurelessPattern($id1.text), $id1.line, $id1.pos, this.file_path) );
			}
		}
		
	}
	(^(STRUCTURE id2=ID
	{
		$operation::id += "#" + $id2.text;
		$operation::line = $id2.line;
		$operation::pos = $id2.pos;
		accessed = true;
	}
	))? attribute_call[ts, accessed])
	{
		if($attribute_call.errors != null){
			local_errors.addAll($attribute_call.errors);
		}

		$operation.errors = local_errors;
		$operation.name = $operation::id + "." + $attribute_call.name;
		$operation.datatype = $attribute_call.datatype;
	}

//	| single_return_operation
	| structure_operation_call 	
	{ 
		$operation.errors = local_errors; 
	}
	;	

constructor returns[ArrayList<Error> errors, List<Type> datatype, String name]
	: triple_cons	
	{ 
		$constructor.errors = $triple_cons.errors; 
		$constructor.name = $triple_cons.name; 
		$constructor.datatype = $triple_cons.datatype; 
	}

	| pair_cons	
	{ 
		$constructor.errors = $pair_cons.errors; 		
		$constructor.name = $pair_cons.name; 
		$constructor.datatype = $pair_cons.datatype; 

	}

	| set_cons	
	{ 
		$constructor.errors = $set_cons.errors;
		$constructor.name = $set_cons.name; 
		$constructor.datatype = $set_cons.datatype; 
 
	}
/*
	| node_cons	
	{ 
		$constructor.errors = $node_cons.errors; 
		$constructor.name = $node_cons.name; 
		$constructor.datatype = $node_cons.datatype; 

	}

	| xor_cons	
	{ 
		$constructor.errors = $xor_cons.errors; 
		$constructor.name = $xor_cons.name; 
		$constructor.datatype = $xor_cons.datatype; 
	}
*/	
	;


//single_return_operation
//	: ^(OP_FST operation_args)
//	| ^(OP_SND operation_args) 
//	| ^(OP_TRD operation_args)
//	;

attribute_call[TinySymbol ts, boolean accessed] returns[ArrayList<Error> errors, List<Type> datatype, String name]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();	
	List<Type> datatype = new ArrayList<Type>();
	if ($attribute_call.ts != null){
		if (accessed){			
			datatype.add(Type.CHANNEL);
		} else{
			datatype = new ArrayList<Type>($attribute_call.ts.getDataType());
		}
	}

	List<Type> dt = new ArrayList<Type>();
	String int_id = "";
}
	: ^(OP_IN 
	{
		if ($attribute_call.ts != null){
			dt = new ArrayList<Type>();
			dt.add(Type.SET);
			dt.add(Type.NODE);
		}
	}

	(INT
	{
		if ($attribute_call.ts != null){		
			dt = new ArrayList<Type>();
			dt.add(Type.CHANNEL);
			if ( Integer.parseInt($INT.text) > 1 && datatype.containsAll(dt) ){
				local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments("attribute", $OP_IN.text) , $INT.line, $INT.pos, this.file_path) );
			}

			dt = new ArrayList<Type>();
			dt.add(Type.NODE);
		}
		int_id = "[" + $INT.text + "]";
	}
	)?) 	
	{
		if ($attribute_call.ts != null){
			Type t = datatype.get(0);
		 	if( !(t.equals(Type.PATTERN) || t.equals(Type.CHANNEL)) ) {
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($operation::id, "Pattern' or 'Channel"), $operation::line, $operation::pos, this.file_path) );
			}
			//else
		}

		if (!local_errors.isEmpty()){
			dt = new ArrayList<Type>();
		}

		$attribute_call.datatype = dt;
		$attribute_call.name = "in" + int_id;
		$attribute_call.errors = local_errors;
	}

	| ^(OP_OUT
	{
		if ($attribute_call.ts != null){
			dt = new ArrayList<Type>();
			dt.add(Type.SET);
			dt.add(Type.NODE);
		}
	} 

	(INT
	{
		if ($attribute_call.ts != null){		
			dt = new ArrayList<Type>();
			dt.add(Type.CHANNEL);
			if ( Integer.parseInt($INT.text) > 1 && datatype.containsAll(dt) ){
				local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments("attribute", $OP_OUT.text) , $INT.line, $INT.pos, this.file_path) );
			}

			dt = new ArrayList<Type>();
			dt.add(Type.NODE);
		}
		int_id = "[" + $INT.text + "]";
	}
	)?)	
	{
		if ($attribute_call.ts != null){
			Type t = datatype.get(0);
		 	if( !(t.equals(Type.PATTERN) || t.equals(Type.CHANNEL)) ) {
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($operation::id, "Pattern' or 'Channel"), $operation::line, $operation::pos, this.file_path) );
			}
			//else
		}

		if (!local_errors.isEmpty()){
			dt = new ArrayList<Type>();
		}

		$attribute_call.datatype = dt;
		$attribute_call.name = "out" + int_id;
		$attribute_call.errors = local_errors;
	}

	| OP_NAME		
	{
		if ($attribute_call.ts != null){
			Type t = datatype.get(0);
		 	if( !t.equals(Type.CHANNEL) ) {
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($operation::id, "Channel"), $operation::line, $operation::pos, this.file_path) );
			}
			//else
			if (local_errors.isEmpty()){
				dt.add(Type.NAME);
			}
		}

		$attribute_call.datatype = dt;
		$attribute_call.name = "name";
		$attribute_call.errors = local_errors;
	}

	| OP_NODES		
	{
//		System.out.println($attribute_call.ts);
		if ($attribute_call.ts != null){
			Type t = datatype.get(0);
		 	if( !(t.equals(Type.PATTERN) || t.equals(Type.CHANNEL)) ) {
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($operation::id, "Pattern' or 'Channel"), $operation::line, $operation::pos, this.file_path) );
			}
			//else
			if (local_errors.isEmpty()){
				dt.add(Type.SET);
				dt.add(Type.NODE);
			}
		}

		$attribute_call.datatype = dt;		
		$attribute_call.name = "nodes";
		$attribute_call.errors = local_errors;
	}

	| OP_NAMES		
	{
		if ($attribute_call.ts != null){
			Type t = datatype.get(0);
		 	if( !t.equals(Type.PATTERN) ) {
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($operation::id, "Pattern"), $operation::line, $operation::pos, this.file_path) );
			}
			//else
			if (local_errors.isEmpty()){
				dt.add(Type.SET);
				dt.add(Type.NAME);
			}
		}

		$attribute_call.datatype = dt;		
		$attribute_call.name = "names";
		$attribute_call.errors = local_errors;
	}
	/*
	| ^(OP_ENDS ID) 
	{
		if ($attribute_call.ts != null){
			Type t = datatype.get(0);
		 	if( !t.equals(Type.CHANNEL) || t.equals(Type.PATTERN)) {
				//local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($operation::id, "Channel"), $operation::line, $operation::pos, this.file_path) );
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($operation::id, "Pattern' or 'Channel"), $operation::line, $operation::pos, this.file_path) );
			}
			//else
			if (local_errors.isEmpty()){
				dt.add(Type.SET);
				dt.add(Type.NODE);
			}
		}

		$attribute_call.datatype = dt;		
		$attribute_call.name = "ends";
		$attribute_call.errors = local_errors;
	}
	*/

	| OP_FST		
	{
		if ($attribute_call.ts != null){
			Type t = datatype.get(0);
		 	if( !(t.equals(Type.PAIR) || t.equals(Type.TRIPLE)) ) {
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($operation::id, "Pair' or 'Triple"), $operation::line, $operation::pos, this.file_path) );
			}
			//else
			if (local_errors.isEmpty()){
				datatype.remove(0);
				dt.addAll(datatype);
			}
		}

		$attribute_call.datatype = dt;				
		$attribute_call.name = "fst";
		$attribute_call.errors = local_errors;
	}

	| OP_SND		
	{
		if ($attribute_call.ts != null){
			Type t = datatype.get(0);
		 	if( !(t.equals(Type.PAIR) || t.equals(Type.TRIPLE)) ) {
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($operation::id, "Pair' or 'Triple"), $operation::line, $operation::pos, this.file_path) );
			}
			//else
			if (local_errors.isEmpty()){
				datatype.remove(0);
				dt.addAll(datatype);
			}
		}

		$attribute_call.datatype = dt;		
		$attribute_call.name = "snd";
		$attribute_call.errors = local_errors;
	}
	| OP_TRD		
	{
		if ($attribute_call.ts != null){
			Type t = datatype.get(0);
		 	if( !t.equals(Type.TRIPLE) ) {
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($operation::id, "Triple"), $operation::line, $operation::pos, this.file_path) );
			}
			//else
			if (local_errors.isEmpty()){
				datatype.remove(0);
				dt.addAll(datatype);
			}
		}

		$attribute_call.datatype = dt;		
		$attribute_call.name = "trd";
		$attribute_call.errors = local_errors;
	}

	| ID			
	{
		$attribute_call.datatype = dt;
		$attribute_call.name = $ID.text;		
		$attribute_call.errors = local_errors;
	}
	;


triple_cons returns[ArrayList<Error> errors, List<Type> datatype, String name]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
	List<Type> dt = new ArrayList<Type>();
	HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
	int nulls = 0;
	String name = "T(";
}
	: ^(TRIPLE e1=expression
	{
		local_errors.addAll($e1.errors);
		if ( !$e1.datatype.isEmpty() ) {
			datatypes.add($e1.datatype);
		}
		else{
			nulls++;
		}
		name += $e1.name + ", ";
	} 

	e2=expression 
	{
		local_errors.addAll($e2.errors);
		if ( !$e2.datatype.isEmpty() ) {
			datatypes.add($e2.datatype);
		}
		else{
			nulls++;
		}
		name += $e2.name + ", ";
	} 

	e3=expression
	{
		local_errors.addAll($e3.errors);
		if ( !$e3.datatype.isEmpty() ) {
			datatypes.add($e3.datatype);
		}
		else{
			nulls++;
		}
		name += $e3.name;
	}

	)
	{

		$triple_cons.errors = local_errors;

		name = name.substring(0, name.length()-1);
		$triple_cons.name = name + ")";

		if (local_errors.isEmpty()){
			if(datatypes.size() + nulls == 1){
				dt.add(Type.TRIPLE);
				dt.addAll(datatypes.iterator().next());
			}
			else {
				local_errors.add( Error.report(ErrorType.ERROR, Error.invalidElements($triple_cons.name), $TRIPLE.line, $TRIPLE.pos, this.file_path) );
			}
		}

		$triple_cons.datatype = dt;
	}
	;



set_cons returns[ArrayList<Error> errors, List<Type> datatype, String name]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();	
	List<Type> dt = new ArrayList<Type>();
	HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
	int nulls = 0;
	String name = "S(";
}
	: ^(SET (expression
	{
		local_errors.addAll($expression.errors);
		if ( !$expression.datatype.isEmpty() ) {
			datatypes.add($expression.datatype);
		}
		else{
			nulls++;
		}
		name += $expression.name + ",";
	}
	)*

	{

		$set_cons.errors = local_errors;

		name = name.substring(0, name.length()-1);
		$set_cons.name = name + ")";

		if (local_errors.isEmpty()){
			if(datatypes.size() + nulls == 1){
				dt.add(Type.SET);
				dt.addAll(datatypes.iterator().next());
			}
			else {
				local_errors.add( Error.report(ErrorType.ERROR, Error.invalidElements($set_cons.name), $SET.line, $SET.pos, this.file_path) );
			}
		}

		$set_cons.datatype = dt;
	}
	) 
	;
pair_cons returns[ArrayList<Error> errors, List<Type> datatype, String name]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
	List<Type> dt = new ArrayList<Type>();
	HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
	int nulls = 0;
	String name = "P(";
}
	: ^(PAIR e1=expression
	{
		local_errors.addAll($e1.errors);
		if ( !$e1.datatype.isEmpty() ) {
			datatypes.add($e1.datatype);
		}
		else{
			nulls++;
		}
		name += $e1.name + ", ";
	} 
	e2=expression
	{
		local_errors.addAll($e2.errors);

		if ( !$e2.datatype.isEmpty() ) {
			datatypes.add($e2.datatype);
		}
		else{
			nulls++;
		}
		name += $e2.name;
	}
	)

	{

		$pair_cons.errors = local_errors;

		name = name.substring(0, name.length()-1);
		$pair_cons.name = name + ")";

		if (local_errors.isEmpty()){
			if(datatypes.size() + nulls == 1){
				dt.add(Type.PAIR);
				dt.addAll(datatypes.iterator().next());
			}
			else {
				local_errors.add( Error.report(ErrorType.ERROR, Error.invalidElements($pair_cons.name), $PAIR.line, $PAIR.pos, this.file_path) );
			}
		}

		$pair_cons.datatype = dt;
	}
	;




/*
node_cons returns[ArrayList<Error> errors, List<Type> datatype, String name]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();	
	List<Type> dt = new ArrayList<Type>();
	String name = "N(";
}
	: ^(NODE (ID
	{
		Integer s_id = $content::current_scope.getScopeRel().fst();
		TinySymbol ts = $content::current_scope.containsSymbol($ID.text) ? $content::current_scope.getSymbols().get($ID.text) : $content::name.hasValue($ID.text, s_id);

		if (ts == null || $ID.line < ts.getLine()){
			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, this.file_path) );
		}
		else{
			dt = new ArrayList<Type>();
			dt.add(Type.NAME);
			if (!ts.getDataType().equals(dt)){
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($ID.text, "Name"), $ID.line, $ID.pos, this.file_path) );
			}
		}
		name += $ID.text + ",";

	}
	)+

	{
		$node_cons.errors = local_errors;

		name = name.substring(0, name.length()-1);
		$node_cons.name = name + ")";

		if (local_errors.isEmpty()){
			dt = new ArrayList<Type>();
			dt.add(Type.NODE);
		}	
		$node_cons.datatype = dt;
	}
	)
	;


xor_cons returns[ArrayList<Error> errors, List<Type> datatype, String name]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();	

	Integer s_id = $content::current_scope.getScopeRel().fst();
	TinySymbol ts = null;

	List<Type> dt = new ArrayList<Type>();
	String name = "X(";

}
	: ^(XOR  ^(IN id1=ID
	{
		ts = $content::current_scope.containsSymbol($id1.text) ? $content::current_scope.getSymbols().get($id1.text) : $content::name.hasValue($id1.text, s_id);

		if (ts == null || $id1.line < ts.getLine()){
			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined($id1.text), $id1.line, $id1.pos, this.file_path) );
		}
		else{
			dt = new ArrayList<Type>();
			dt.add(Type.NAME);
			if (!ts.getDataType().equals(dt)){
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($id1.text, "Name"), $id1.line, $id1.pos, this.file_path) );
			}
		}
		name += $id1.text + ",";		
	} 

	(id2=ID
	{
		ts = $content::current_scope.containsSymbol($id2.text) ? $content::current_scope.getSymbols().get($id2.text) : $content::name.hasValue($id2.text, s_id);

		if (ts == null || $id2.line < ts.getLine()){
			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined($id2.text), $id2.line, $id2.pos, this.file_path) );
		}
		else{
			dt = new ArrayList<Type>();
			dt.add(Type.NAME);
			if (!ts.getDataType().equals(dt)){
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($id2.text, "Name"), $id2.line, $id2.pos, this.file_path) );
			}
		}
		name += $id2.text + ",";
	} 
	)*
	) ^(OUT id3=ID
	{
		name = name.substring(0, name.length()-1);
		name += ":";

		ts = $content::current_scope.containsSymbol($id3.text) ? $content::current_scope.getSymbols().get($id3.text) : $content::name.hasValue($id3.text, s_id);

		if (ts == null || $id3.line < ts.getLine()){
			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined($id3.text), $id3.line, $id3.pos, this.file_path) );
		}
		else{
			dt = new ArrayList<Type>();
			dt.add(Type.NAME);
			if (!ts.getDataType().equals(dt)){
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($id3.text, "Name"), $id3.line, $id3.pos, this.file_path) );
			}
		}
		name += $id3.text + ",";		
	} 
	(id4=ID
	{
		ts = $content::current_scope.containsSymbol($id4.text) ? $content::current_scope.getSymbols().get($id4.text) : $content::name.hasValue($id4.text, s_id);

		if (ts == null || $id4.line < ts.getLine()){
			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined($id4.text), $id4.line, $id4.pos, this.file_path) );
		}
		else{
			dt = new ArrayList<Type>();
			dt.add(Type.NAME);
			if (!ts.getDataType().equals(dt)){
				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype($id4.text, "Name"), $id4.line, $id4.pos, this.file_path) );
			}
		}
		name += $id4.text + ",";
	} 
	)+)
	{
		$xor_cons.errors = local_errors;

		name = name.substring(0, name.length()-1);
		$xor_cons.name = name + ")";

		if (local_errors.isEmpty()){
			dt = new ArrayList<Type>();
			dt.add(Type.XOR);
		}

		$xor_cons.datatype = dt;
	}
	)
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




main_def returns[ArrayList<Error> errors]
scope{
	//imported coopla patterns
	List<String> coopla_patterns;
	List<String> imported_patterns;
	List<String> created_patterns;
	Map<String, Set<String>> new_instances;
}
@init{
	$content::onMain = true;
	
	$content::name = $reclang::ids_table.getSymbols().get("\$main");
	$content::current_scope = $content::name.getScopes().get(0); //main has only one scope
	
	ArrayList<Error> local_errors = new ArrayList<Error>();

	// coopla data
	$main_def::coopla_patterns = new ArrayList<String>();
	$main_def::imported_patterns = new ArrayList<String>();
	
	$main_def::created_patterns = new ArrayList<String>();
	$main_def::new_instances = new HashMap<String, Set<String>>();

	//rever isto : patterns criados s�o guardados em separado dos importados, logo n�o haver� problema criar um pattern com um nome j� existente
//	HashMap<String, Symbol> coopla_symbols = $reclang::coopla_table.getSymbols();
	for (String key : $reclang::patterns.keySet()){
		$main_def::coopla_patterns.add(key);
		
		//CPModelInternal -> Set<stoch_instances (String, CP2)> -> Set<String>
		Set<String> intances = $reclang::patterns.get(key).getStochInstances().keySet();
		$main_def::new_instances.put(key, intances);
	}
	
	
	boolean recAlreadyDefined = false;
}
	: (main_args
	{		
		local_errors.addAll($main_args.errors);
	}
	)? main_block
	{
		local_errors.addAll($main_block.errors);
		
		TinySymbol ts = $content::name;
		String resource = this.retriveResourceFromFilePath(ts.getFile());
		if ( !(ts.getLine() == $main_block.start.getLine() && ts.getPosition() == 0 && ts.getFile().equals(this.file_path)) ){
			local_errors = new ArrayList<Error>(); //ignore other main errors
			local_errors.add( Error.report(ErrorType.WARNING, Error.multipleMain(ts.getLine(), ts.getPosition(), resource), $main_block.start.getLine(), 0, this.file_path) );
		}
		$main_def.errors = local_errors;
	}
	;

//testar aqui imports CooPLa
main_args returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
}
	: ^(ARGUMENTS (main_arg
	{
		local_errors.addAll($main_arg.errors);
	}
	)+
	
	{
		$main_args.errors = local_errors;
	}
	)
	;

main_arg returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
	String pattern_name = "";
}
	: ^(ARGUMENT dt=ID
	{
		if (!$main_def::coopla_patterns.contains($dt.text) && !$dt.text.toLowerCase().equals("empty")){ //empty is a special pattern
			local_errors.add( Error.report(ErrorType.ERROR, Error.patternNotDefined($dt.text), $dt.line, $dt.pos, this.file_path) );
		}
		else{
			pattern_name = $dt.text;
			$main_def::imported_patterns.add(pattern_name);
		}
	}
	ids[pattern_name, true]
	{
		if (local_errors.isEmpty()){
			local_errors.addAll($ids.errors);
		}
		$main_arg.errors = local_errors;
	}
	)
	;	

ids[String pattern_name, boolean toTest] returns[ArrayList<Error> errors, List<String> values]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
	List<String> ids = new ArrayList<String>();
	
	CPModelInternal cpmi = new CPModelInternal();
	Set<String> stoch_instances = new HashSet<String>();
	boolean isImported = false;
	if (toTest){
		isImported = $main_def::coopla_patterns.contains(pattern_name);//!pattern_name.toLowerCase().equals("empty");
		if (isImported){
			cpmi = $reclang::patterns.get(pattern_name);
			for (String key : cpmi.getStochInstances().keySet()){
				stoch_instances.add(key);
			}
		}
	}
}
	: ^(IDS (ID
	{
		if ($content::current_scope.containsSymbol($ID.text)){
			TinySymbol ts = $content::current_scope.getSymbols().get($ID.text);
			
			if ( !($ID.line == ts.getLine() && $ID.pos == ts.getPosition()) ){
				local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos, this.file_path) );
			}
			else if (toTest && isImported && stoch_instances.contains($ID.text)){
				local_errors.add( Error.report(ErrorType.ERROR, Error.instanceAlreadyExists(pattern_name, $ID.text), $ID.line, $ID.pos, this.file_path) );
			}
		}
		ids.add($ID.text);
		
	}
	)+
	
	{
		Set<String> instances = new HashSet<String>(ids);
		if ($main_def::new_instances.keySet().contains(pattern_name)){
			instances.addAll($main_def::new_instances.get(pattern_name));
		}
		$main_def::new_instances.put(pattern_name, instances);
		
			
		$ids.errors = local_errors;
		$ids.values = ids;
	}
	)
	;	
	

main_block returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
}
	: ^(INSTRUCTIONS (main_instruction
	{
		local_errors.addAll($main_instruction.errors);
	}
	)+
	
	{
		$main_block.errors = local_errors;
	}
	)
	;

main_instruction returns[ArrayList<Error> errors]
@init{
	$content::rec_type = "";
}
	: main_assignment	{ $main_instruction.errors = $main_assignment.errors; }
	| reconf_apply		{ $main_instruction.errors = $reconf_apply.errors; }
	;

main_assignment returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();	
	String pattern_name = "";
}
	: ^( APPLICATION ^(DECLARATION dt=ID
	{	
		//reformulação: pode-se definir instancias do mesmo tipo e posteriormente na tradução é feito o match entre as instancias
		//para verificar se são iguais, ou seja, do mesmo tipo; caso contrário, lança excepção
		
//		if ($main_def::imported_patterns.contains($dt.text) || $main_def::created_patterns.contains($dt.text)){
//			local_errors.add( Error.report(ErrorType.ERROR, Error.patternAlreadyDefined($dt.text), $dt.line, $dt.pos, this.file_path) );
//		} else {
		$main_def::created_patterns.add($dt.text);
		pattern_name = $dt.text;
//		}
	}
	ids[pattern_name, false]
	{
		local_errors.addAll($ids.errors);
	}
	)
	
	^(OP_APPLY rec=ID reconfiguration_call
	{
		local_errors.addAll($reconfiguration_call.errors);
		
		boolean exists = false;
		for (Set<String> instances : $main_def::new_instances.values()){
			for (String instance : instances){
				if ($rec.text.equals(instance)){
					exists = true;
					break;
				}
			}
		}
		
		if (!exists){
			local_errors.add( Error.report(ErrorType.ERROR, Error.instanceDoesNotExists($rec.text), $rec.line, $rec.pos, this.file_path) );
		}
	}
	) 
	
	{	
		$main_assignment.errors = local_errors;
	}
	)
	;
	
reconf_apply returns[ArrayList<Error> errors]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();	
}
	: ^(OP_APPLY ID 
	{
		boolean exists = false;
		for (Set<String> instances : $main_def::new_instances.values()){
			for (String instance : instances){
				if ($ID.text.equals(instance)){
					exists = true;
					break;
				}
			}
		}
		
		if (!exists){
			local_errors.add( Error.report(ErrorType.ERROR, Error.instanceDoesNotExists($ID.text), $ID.line, $ID.pos, this.file_path) );
		}
	}
	
	reconfiguration_call
	{
		local_errors.addAll($reconfiguration_call.errors);
		$reconf_apply.errors = local_errors;
	}
	)
	;