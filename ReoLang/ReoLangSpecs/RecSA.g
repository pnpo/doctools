tree grammar RecSA;

options{
	tokenVocab = RecParser;
	ASTLabelType = CommonTree;
	//backtrack = true;
}

@header{
	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.parsing.util.SimpleError;
	import pt.uminho.di.reolang.parsing.util.*;
	//import java.util.*;
	import java.util.HashMap;
	import java.util.Collections;
	import java.util.Comparator;
}

@members{
	//SimpleError se = new SimpleError();
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

reclang[TinySymbolsTable global_table] returns[ArrayList<SimpleError> errors]
scope{
	TinySymbolsTable ids_table; 
	int scope_id;
	int parent_id;
	int id;
	HashMap<Integer,Integer> scope_rel;
}
@init{
	$reclang::ids_table = $reclang.global_table;
	$reclang::scope_id = 0;
	$reclang::parent_id = 0;
	$reclang::scope_rel = new HashMap<Integer,Integer>();
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
}
	: ^(RECONFIGS (directive_def
	{
		local_errors.addAll($directive_def.errors);
	}
	
	)* (element
	{
		local_errors.addAll($element.errors);
	}
	)*
	
	) 
	{
		System.out.println($reclang::scope_rel);
		for (int i=0; i<local_errors.size(); i++) {
          		for (int j=0; j<local_errors.size(); j++) {
       		        	if (local_errors.get(i).getMessage().equals(local_errors.get(j).getMessage()) && i != j) {
					if (local_errors.get(i).getLine() < local_errors.get(j).getLine()){
                   		        	local_errors.remove(j);
                   			}
                   		       	else{
                   		        	local_errors.remove(i);
                   		        }
       		         	}
       		    	}
       		}
		$reclang.errors = local_errors;
	}
	
	;




directive_def returns[ArrayList<SimpleError> errors]
	: directive_import
	{
		$directive_def.errors = $directive_import.errors;
	}
	;

	
directive_import returns[ArrayList<SimpleError> errors]
	: ^(IMPORT STRING)
	{
		$directive_import.errors = new ArrayList<SimpleError>(0);
	}
	;





	
element returns[ArrayList<SimpleError> errors]
	: ^(RECONFIGURATION reconfiguration_def 
	{
		$element.errors = $reconfiguration_def.errors;
	}
	)
	| ^(APPLICATION applicaiton_def)	
	;



reconfiguration_def returns[ArrayList<SimpleError> errors]
scope{
	TinySymbol name;
	ArrayList<TinySymbolsTable> scopes;
}
@init{
	$reconfiguration_def::name = new TinySymbol();
	$reconfiguration_def::scopes = new ArrayList<TinySymbolsTable>();
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
	$reclang::scope_id = 0;

}
	: ^(ID 
	{		
		TinySymbol ts = $reclang::ids_table.getSymbols().get($ID.text);
		$reconfiguration_def::name = ts;
		$reconfiguration_def::scopes = (ArrayList<TinySymbolsTable>) ts.getScopes();
		
		if ($reclang::ids_table.containsSymbol($ID.text)){
			if ( !($ID.line == ts.getLine() && $ID.pos == ts.getPosition()) ){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos) );
			}
		}
	}
	(args_def
	{
		local_errors.addAll($args_def.errors);
	}
	)? reconfiguration_block
	{
		local_errors.addAll($reconfiguration_block.errors);
	}
	) 
	
	{
		$reconfiguration_def.errors = local_errors;
	}
	;

args_def returns[ArrayList<SimpleError> errors]
scope{
	TinySymbolsTable scope;
}
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
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
	
arg_def returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

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
	
list_ids returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

}
	: (ID
	{
		//if ($reclang::ids_table
		if ($args_def::scope.containsSymbol($ID.text)){
			TinySymbol ts = $args_def::scope.getSymbols().get($ID.text);
			if ( !($ID.line == ts.getLine() && $ID.pos == ts.getPosition()) ){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos) );
			}
		}
	}
	)+
	
	{
		$list_ids.errors = local_errors;
	}
	;
	
	
reconfiguration_block returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

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
	
instruction returns[ArrayList<SimpleError> errors]
scope{
	TinySymbolsTable scope;
	String rec_type;
}
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
	$instruction::rec_type = "";
	$instruction::scope = this.getScope($reclang::id);
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
		$reclang::parent_id--;
		$reclang::id = $reclang::scope_rel.get($reclang::scope_id);
	}
	;
	
reconfiguration_apply returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

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
	
declaration returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

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
	
var_def returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

}
	: ID
	{
		if ($instruction::scope.containsSymbol($ID.text)){
			TinySymbol ts = $instruction::scope.getSymbols().get($ID.text);
			if ( !($ID.line == ts.getLine() && $ID.pos == ts.getPosition()) ){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos) );
			}
		}
		else {
			Integer s_id = $instruction::scope.getScopeRel().fst();
			TinySymbol ts = $reconfiguration_def::name.hasValue($ID.text, s_id);
			
			if ( ts != null ){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos) );
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
	
assignment[boolean isDeclaration] returns[ArrayList<SimpleError> errors]
scope{
	TinySymbol ts;
}
@init{
	$assignment::ts = new TinySymbol();
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

}
	: ^(ASSIGNMENT ID
	{	
		if (isDeclaration) {
			if ($instruction::scope.containsSymbol($ID.text)){
				TinySymbol ts = $instruction::scope.getSymbols().get($ID.text);
				if ( !($ID.line == ts.getLine() && $ID.pos == ts.getPosition()) ){
					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos) );
				}
			}
			else {
				Integer s_id = $instruction::scope.getScopeRel().fst();
				TinySymbol ts = $reconfiguration_def::name.hasValue($ID.text, s_id);
				
				if ( ts != null){
					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos) );
				}
			}
		}
		else{
			Integer s_id = $instruction::scope.getScopeRel().fst();
			TinySymbol ts = $reconfiguration_def::name.hasValue($ID.text, s_id);
			if (!$instruction::scope.containsSymbol($ID.text) && ts == null){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined($ID.text), $ID.line, $ID.pos) );
			}
		}
		Integer s_id = $instruction::scope.getScopeRel().fst();
		$assignment::ts = $instruction::scope.containsSymbol($ID.text) ? $instruction::scope.getSymbols().get($ID.text) : $reconfiguration_def::name.hasValue($ID.text, s_id);
	}
	assignment_member[$ID.line, $ID.pos]) 
	{
		local_errors.addAll($assignment_member.errors);
		$assignment.errors = local_errors;
	}
	; 
	
assignment_member[int id_line, int id_pos] returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
}
	: expression 
	{ 
		//System.out.println($expression.errors);
		if ($expression.errors != null){
			local_errors.addAll($expression.errors);
		}
		$assignment_member.errors = local_errors; 
	}
	| reconfiguration_apply 
	{ 
		
		if (!$assignment::ts.getDataType().equals(Type.PATTERN)){
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($assignment::ts.getId(), "Pattern") , $assignment_member.id_line, $assignment_member.id_pos) );
		}	
		else{
			local_errors.addAll($reconfiguration_apply.errors); 
		}
		$assignment_member.errors = local_errors; 
	}
	;
	
reconfiguration_call returns[ArrayList<SimpleError> errors]
scope{
	List<TinySymbol> args;
	String name;
}
@init{
	$reconfiguration_call::name = "";
	$reconfiguration_call::args = new ArrayList<TinySymbol>();
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
}
	: ^(OP_JOIN 	{ $instruction::rec_type = "join"; }
	operation_args) 
	{ 
		if($operation_args.start != null){
			local_errors.addAll($operation_args.errors);
		}
		else{
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments($OP_JOIN.text) , $OP_JOIN.line) ); //$ID.pos
		}
		$reconfiguration_call.errors = local_errors;
	}
	
	| ^(OP_SPLIT 	{ $instruction::rec_type = "split"; }
	operation_args) 
	{ 
		if($operation_args.start != null){
			local_errors.addAll($operation_args.errors);
		}
		else{
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments($OP_SPLIT.text) , $OP_SPLIT.line) ); //$ID.pos
		}
		$reconfiguration_call.errors = local_errors;
	}
	
	| ^(OP_PAR 	{ $instruction::rec_type = "par"; }
	operation_args)
	{ 
		if($operation_args.start != null){
			local_errors.addAll($operation_args.errors);
		}
		else{
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments($OP_PAR.text) , $OP_PAR.line) ); //$ID.pos
		}
		$reconfiguration_call.errors = local_errors;
	}
	
	| ^(OP_REMOVE 	{ $instruction::rec_type = "remove"; }
	operation_args)	
	{ 
		if($operation_args.start != null){
			local_errors.addAll($operation_args.errors);
		}
		else{
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments($OP_REMOVE.text) , $OP_REMOVE.line) ); //$ID.pos
		}
		$reconfiguration_call.errors = local_errors;
	}
	
	| ^(OP_CONST 	{ $instruction::rec_type = "const"; }
	operation_args)
	{ 
		if($operation_args.start != null){
			local_errors.addAll($operation_args.errors);
		}
		else{
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments($OP_CONST.text) , $OP_CONST.line) ); //$ID.pos
		}
		$reconfiguration_call.errors = local_errors;
	}
	
	| ^(OP_ID 	{ $instruction::rec_type = "id"; }
	operation_args)  
	{
		if($operation_args.start != null){
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments($instruction::rec_type) , $OP_ID.line) ); //$OP_ID.pos
			//local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.invalidArgument($operation_args.start.toString()) , $OP_ID.line, $OP_ID.pos+4) );			
			
			////is not necessary since 'id' has no arguments
			//local_errors.addAll($operation_args.errors);
		}
		
		
		$reconfiguration_call.errors = local_errors;
	}
	
	| ^(ID 		
	{ 
		$instruction::rec_type = "custom"; 
		$reconfiguration_call::name = $ID.text;
		
		if ($reclang::ids_table.containsSymbol($ID.text)){
			TinySymbol ts = $reclang::ids_table.getSymbols().get($ID.text);
			if (ts.getLine() > $reconfiguration_def::name.getLine()){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.recNotDefined($ID.text), $ID.line, $ID.pos) );
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
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.recNotDefined($ID.text), $ID.line, $ID.pos) );
		}
	}
	operation_args)	
	{	
		if($operation_args.start != null){
			local_errors.addAll($operation_args.errors);
		}
		else{
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments($ID.text) , $ID.line) ); //$ID.pos
		}
		$reconfiguration_call.errors = local_errors;
	}
	;
	
	
structure_operation_call
	: ^(OP_PATH operation_args)
	| ^(OP_UPDATE operation_args)
	;
	
	
operation_args returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
}
	: (args 
	{
		//reconfiguration of type "custom" can have more than one argument; id primitive tested before (do not even have one argument)
		if ($args.counter > 1 && !$instruction::rec_type.equals("custom") && !$instruction::rec_type.equals("id")){
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments($instruction::rec_type) , $args.start.getLine()) );
		}
		//if the number of arguments are correct, check their type (possible errors)
		else {
			if ($instruction::rec_type.equals("custom") && $args.counter < $reconfiguration_call::args.size()){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments($reconfiguration_call::name) , $args.start.getLine()) );
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
	
args returns[ArrayList<SimpleError> errors, int counter]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
	ArrayList<SimpleError> global_errors = new ArrayList<SimpleError>();
	int i = 0;
	boolean exceeded = false;
}
	: (expression
	{
		if ($instruction::rec_type.equals("custom")){
			if ($reconfiguration_call::args.size() > i){
				//original argument
				TinySymbol ts1 = $reconfiguration_call::args.get(i);

//			if (ts1 != null){				
				String value = $expression.value;
				Integer s_id = $instruction::scope.getScopeRel().fst();
				//if contains symbol, value of new argument is obtained from $instruction::scope, else from $reconfiguration_def::name
				TinySymbol ts2 = $instruction::scope.containsSymbol(value) ? $instruction::scope.getSymbols().get(value) : $reconfiguration_def::name.hasValue(value, s_id);
				if ( ts2 != null && !ts2.getDataType().equals(ts1.getDataType()) ){
					String datatype = ts1.dataTypeToString();
					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(value, datatype) , $expression.start.getLine()) );
				}
			}
			else{
				exceeded = true;
			}
		}
		local_errors.addAll($expression.errors);
		i++;
	}
	)+
	
	{
		if (exceeded){
			global_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments($reconfiguration_call::name) , $expression.start.getLine()) );
		}
		else{
			global_errors.addAll(local_errors);
		}
		$args.errors = global_errors;
		$args.counter = i;
	}
	
	;
		
	
for_instruction returns[ArrayList<SimpleError> errors]
@init{
	$reclang::scope_id++;
	$reclang::id = $reclang::scope_id;
	$reclang::scope_rel.put($reclang::scope_id, $reclang::parent_id);
	$reclang::parent_id++;
	
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
}
	: ^(FORALL datatype id1=ID
	{
		Integer s_id = $instruction::scope.getScopeRel().fst();
		TinySymbol ts = $reconfiguration_def::name.hasValue($id1.text, s_id);
		if ( ts != null ){
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined($id1.text, ts.getLine(), ts.getPosition()), $id1.line, $id1.pos) );
		}
	}
	
	id2=ID 
	{
		ts = $reconfiguration_def::name.hasValue($id2.text, s_id);
		if (!$instruction::scope.containsSymbol($id2.text) && ts == null){
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined($id2.text), $id2.line, $id2.pos) );
		}
		else{
			if (local_errors.isEmpty()){
				$instruction::scope = this.getScope($reclang::id);

				TinySymbol ts1 = $instruction::scope.containsSymbol($id1.text) ? $instruction::scope.getSymbols().get($id1.text) : $reconfiguration_def::name.hasValue($id1.text, s_id);
				TinySymbol ts2 = $instruction::scope.containsSymbol($id2.text) ? $instruction::scope.getSymbols().get($id2.text) : $reconfiguration_def::name.hasValue($id2.text, s_id);				

				if (!ts2.getDataType().get(0).equals(Type.SET)){
					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($id2.text, "Set<T>"), $id2.line, $id2.pos) );
				}
				else{
					if (ts1 != null){
						ts2.getDataType().remove(0);
						List<Type> datatype = ts2.getDataType();
						if (!ts1.getDataType().equals(datatype)){
							local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($id1.text, ts2.dataTypeToString()), $id1.line, $id1.pos) );
						}
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
	
	
expression returns[ArrayList<SimpleError> errors, String value]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
}
	: ^(OP_UNION e1=expression { local_errors.addAll($e1.errors);} e2=expression
	{
		if ($e2.errors != null){
			local_errors.addAll($e2.errors);
		}
		$expression.errors = local_errors; 
	}
	)
	
	| ^(OP_INTERSECTION e1=expression { local_errors.addAll($e1.errors);} e2=expression
	{
		if ($e2.errors != null){
			local_errors.addAll($e2.errors);
		}
		$expression.errors = local_errors; 
	}
	)
	
	| ^(OP_MINUS e1=expression { local_errors.addAll($e1.errors);} e2=expression
	{
		if ($e2.errors != null){
			local_errors.addAll($e2.errors);
		}
		$expression.errors = local_errors; 
	}
	)
	
	| factor 
	{ 
		$expression.errors = $factor.errors; 
		$expression.value = $factor.value; 
	}
	;


factor returns[ArrayList<SimpleError> errors, String value]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
}
	: ^(ID ID) { $factor.errors = local_errors; }
	| ID
	{
		$factor.value = $ID.text;
		Integer s_id = $instruction::scope.getScopeRel().fst();
		TinySymbol ts = $reconfiguration_def::name.hasValue($ID.text, s_id);
		if (!$instruction::scope.containsSymbol($ID.text) && ts == null){
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined($ID.text), $ID.line, $ID.pos) );
		}
		else{
			//System.out.println($ID.text);
			TinySymbol symbol = ts != null ? ts : $instruction::scope.getSymbols().get($ID.text);
			//System.out.println(ts);
			List<Type> dt = new ArrayList<Type>();
			dt.add(Type.PATTERN);
			if ($instruction::rec_type.equals("const") && !symbol.getDataType().containsAll(dt) ){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($ID.text, "Pattern"), $ID.line, $ID.pos) );
			}
			
			if ($instruction::rec_type.equals("par") && !symbol.getDataType().containsAll(dt) ){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($ID.text, "Pattern"), $ID.line, $ID.pos) );
			}
			
			dt.clear();
			dt.add(Type.SET);
			dt.add(Type.NODE);
			if ($instruction::rec_type.equals("join") && !symbol.getDataType().containsAll(dt) ){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($ID.text, "Set<Node>"), $ID.line, $ID.pos) );
											}
			
			dt.clear();
			dt.add(Type.NODE);
			if ($instruction::rec_type.equals("split") && !symbol.getDataType().containsAll(dt) ){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($ID.text, "Node"), $ID.line, $ID.pos) );
			}
			
			dt.clear();
			dt.add(Type.NAME);
			if ($instruction::rec_type.equals("remove") && !symbol.getDataType().containsAll(dt) ){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($ID.text, "Name"), $ID.line, $ID.pos) );
			}
		}
		$factor.errors = local_errors; 
	}
	| operation { $factor.errors = $operation.errors; }
	| constructor { $factor.errors = $constructor.errors; }
	;
	
operation returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
	
}
	: ^(ACCESS id1=ID
	{
		List<Type> datatype = new ArrayList<Type>();
		Integer s_id = $instruction::scope.getScopeRel().fst();
		//if contains symbol, tiny symbol is obtained from $instruction::scope, else from $reconfiguration_def::name
		TinySymbol ts = $instruction::scope.containsSymbol($id1.text) ? $instruction::scope.getSymbols().get($id1.text) : $reconfiguration_def::name.hasValue($id1.text, s_id);
//		System.out.println(ts);
		if (ts != null){
			datatype = ts.getDataType();
		}
		else{
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined($id1.text), $id1.line, $id1.pos) );
		}
	}
	(^(STRUCTURE id2=ID
	{
		//if contains symbol, tiny symbol is obtained from $instruction::scope, else from $reconfiguration_def::name
		ts = $instruction::scope.containsSymbol($id1.text) ? $instruction::scope.getSymbols().get($id1.text) : $reconfiguration_def::name.hasValue($id1.text, s_id);
//		System.out.println(ts);
		if (ts != null){
			datatype = ts.getDataType();
		}
		else{
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined($id1.text), $id1.line, $id1.pos) );
		}
	}
	))? attribute_call[datatype])
	{
	 	if (ts != null){
			Type t = datatype.get(0);
	 		if( ($attribute_call.op.equals("in") || $attribute_call.op.equals("out")) && !(t.equals(Type.PATTERN) || t.equals(Type.CHANNEL)) ) {
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($id1.text, "Pattern' or 'Channel"), $id1.line, $id1.pos) );
			}
			if( ($attribute_call.op.equals("name") || $attribute_call.op.equals("ends")) && !t.equals(Type.CHANNEL) ) {
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($id1.text, "Channel"), $id1.line, $id1.pos) );
			}
			if( ($attribute_call.op.equals("nodes") || $attribute_call.op.equals("names")) && !t.equals(Type.PATTERN) ) {
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($id1.text, "Pattern"), $id1.line, $id1.pos) );
			}
			if( ($attribute_call.op.equals("fst") || $attribute_call.op.equals("snd")) && !(t.equals(Type.PAIR) || t.equals(Type.TRIPLE)) ) {
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($id1.text, "Pair' or 'Triple"), $id1.line, $id1.pos) );
			}
			if( $attribute_call.op.equals("trd") && !t.equals(Type.TRIPLE) ) {
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($id1.text, "Triple"), $id1.line, $id1.pos) );
			}
		}
		
		if($attribute_call.errors != null){
			local_errors.addAll($attribute_call.errors);
		}
		$operation.errors = local_errors;
	}
	 
//	| single_return_operation
	| structure_operation_call 	{ $operation.errors = local_errors; }
	;	

constructor returns[ArrayList<SimpleError> errors]
	: triple_cons	{ $constructor.errors = $triple_cons.errors; }
	| pair_cons	{ $constructor.errors = $pair_cons.errors; }
	| set_cons	{ $constructor.errors = $set_cons.errors; }
	| node_cons	{ $constructor.errors = $node_cons.errors; }
	| xor_cons	{ $constructor.errors = $xor_cons.errors; }
	;
	
//single_return_operation
//	: ^(OP_FST operation_args)
//	| ^(OP_SND operation_args) 
//	| ^(OP_TRD operation_args)
//	;
	
attribute_call[List<Type> datatype] returns[ArrayList<SimpleError> errors, String op]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
	
}
	: ^(OP_IN (INT
	{
		List<Type> dt = new ArrayList<Type>();
		dt.add(Type.CHANNEL);
		if ( Integer.parseInt($INT.text) > 1 && datatype.containsAll(dt) ){
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments("attribute", $OP_IN.text) , $INT.line, $INT.pos) );
		}
	}
	)?) 	
	{
		$attribute_call.op = "in";
		$attribute_call.errors = local_errors;
	}
	
	| ^(OP_OUT (INT
	{
		List<Type> dt = new ArrayList<Type>();
		dt.add(Type.CHANNEL);
		if ( Integer.parseInt($INT.text) > 1 && datatype.containsAll(dt) ){
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments("attribute", $OP_OUT.text) , $INT.line, $INT.pos) );
		}
	}
	)?)	
	{
		$attribute_call.op = "out";
		$attribute_call.errors = local_errors;
	}
	
	| OP_NAME		{$attribute_call.op = "name";}
	| OP_NODES		{$attribute_call.op = "nodes";}
	| OP_NAMES		{$attribute_call.op = "names";}
	| ^(OP_ENDS expression) {$attribute_call.op = "ends";}
	| OP_FST		{$attribute_call.op = "fst";}//{ System.out.println(datatype); }
	| OP_SND		{$attribute_call.op = "snd";}
	| OP_TRD		{$attribute_call.op = "trd";}
	| OP_READ		{$attribute_call.op = "read";}
	| OP_WRITE		{$attribute_call.op = "write";}
	| ID			{$attribute_call.op = $ID.text;}
	;
	
	
triple_cons returns[ArrayList<SimpleError> errors]
	: ^(TRIPLE expression expression expression)
	;
	
	
pair_cons returns[ArrayList<SimpleError> errors]
	: ^(PAIR expression expression)
	;
	
	
	
set_cons returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
	
}
	: ^(SET (expression
	/*
	{
		//ts != null
		if(!$assignment::ts.getDataType().get(0).equals(Type.SET)){
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($assignment::ts.getId(), "Set<T>"), $expression.start.getLine()) );
		}
		//else
		if(local_errors.isEmpty()){
			Integer s_id = $instruction::scope.getScopeRel().fst();
			TinySymbol ts = $instruction::scope.containsSymbol($ID.text) ? $instruction::scope.getSymbols().get($ID.text) : $reconfiguration_def::name.hasValue($ID.text, s_id);
			
			if (ts == null){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined($ID.text), $ID.line, $ID.pos) );
			}
			else{
				$assignment::ts.getDataType().remove(0);
				List<Type> dt= $assignment::ts.getDataType();
				
				if (!ts.getDataType().equals(dt)){
					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($ID.text, $assignment::ts.dataTypeToString()), $ID.line, $ID.pos) );
				}
			}
		}
	}
	*/
	)*
	) 
	
	{
		$set_cons.errors = local_errors;
	}
	;
		
			
node_cons returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
	
}
	: ^(NODE ^(IDS (ID
	{
		List<Type> dt = new ArrayList<Type>();
		dt.add(Type.NODE);	//change
		
		if(!$assignment::ts.getDataType().equals(dt)){
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($assignment::ts.getId(), "Node"), $ID.line) );
		}
		else{
			Integer s_id = $instruction::scope.getScopeRel().fst();
			TinySymbol ts = $instruction::scope.containsSymbol($ID.text) ? $instruction::scope.getSymbols().get($ID.text) : $reconfiguration_def::name.hasValue($ID.text, s_id);
			
			if (ts == null){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined($ID.text), $ID.line, $ID.pos) );
			}
			else{
				if (!ts.getDataType().equals(dt)){
					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($ID.text, "Node"), $ID.line, $ID.pos) );
				}
			}
		}
	}
	)+) (^(STOCHASTIC INT INT))?
	
	{
		$node_cons.errors = local_errors;
	}
	)
	;


xor_cons returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
	
}
	: ^(XOR  ^(IN ID+) ^(OUT ID ID+) )
	{
		$xor_cons.errors = local_errors;
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

