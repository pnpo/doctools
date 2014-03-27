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
	import pt.uminho.di.reolang.parsing.*;
}

@members{
	//SimpleError se = new SimpleError();
}



//GRAMMAR

reclang[TinySymbolsTable global_table] returns[ArrayList<SimpleError> errors]
scope{
	TinySymbolsTable ids_table; 
	int scope_id;
}
@init{
	$reclang::ids_table = $reclang.global_table;
	$reclang::scope_id = 0;
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
	$reclang::scope_id++;
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

	Integer scope_id = $reclang::scope_id;
	for (int i = 0; i < $reconfiguration_def::scopes.size(); i++){
		TinySymbolsTable tst = $reconfiguration_def::scopes.get(i);
		if ( tst.getScopeRel().fst().equals(scope_id) ) {
			$instruction::scope = $reconfiguration_def::scopes.get(i-1);
			break;
		}
	}
}
	: declaration 
	{ 
		local_errors.addAll($declaration.errors); 
		$instruction.errors = local_errors;
	}
	| assignment[false] { $instruction.errors = local_errors; }
	| reconfiguration_apply 
	{ 
		local_errors.addAll($reconfiguration_apply.errors); 
		$instruction.errors = local_errors; 
	}
	| for_instruction
	{
		local_errors.addAll($for_instruction.errors);
		$instruction.errors = local_errors;
		$reclang::scope_id--;
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
@init{
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
				if ( ts != null ){
					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos) );
				}
			}
		}
	}
	assignment_member) 
	{
		local_errors.addAll($assignment_member.errors);
		$assignment.errors = local_errors;
	}
	; 
	
assignment_member returns[ArrayList<SimpleError> errors]
	: expression { $assignment_member.errors = new ArrayList<SimpleError>(); }
	| reconfiguration_apply { $assignment_member.errors = $reconfiguration_apply.errors; }
	;
	
reconfiguration_call returns[ArrayList<SimpleError> errors]
	: ^(OP_JOIN 	{ $instruction::rec_type = "join"; }
	operation_args) { $reconfiguration_call.errors = $operation_args.errors; }
	
	| ^(OP_SPLIT 	{ $instruction::rec_type = "split"; }
	operation_args) { $reconfiguration_call.errors = $operation_args.errors; }
	
	| ^(OP_PAR 	{ $instruction::rec_type = "par"; }
	operation_args) { $reconfiguration_call.errors = $operation_args.errors; }
	
	| ^(OP_REMOVE 	{ $instruction::rec_type = "remove"; }
	operation_args)	{ $reconfiguration_call.errors = $operation_args.errors; }
	
	| ^(OP_CONST 	{ $instruction::rec_type = "const"; }
	operation_args) { $reconfiguration_call.errors = $operation_args.errors; }
	
	| ^(OP_ID 	{ $instruction::rec_type = "id"; }
	operation_args) { $reconfiguration_call.errors = $operation_args.errors; }
	
	| ^(ID 		{ $instruction::rec_type = "custom"; }
	operation_args)	{ $reconfiguration_call.errors = $operation_args.errors; }
	;
	
	
structure_operation_call
	: ^(OP_PATH operation_args)
	| ^(OP_UPDATE operation_args)
	;
	
	
operation_args returns[ArrayList<SimpleError> errors]
	: (args { $operation_args.errors = $args.errors; })?
	;
	
args returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
}
	: (expression
	{
		local_errors.addAll($expression.errors);
	}
	)+
	
	{
		$args.errors = local_errors;
	}
	
	;
		
	
for_instruction returns[ArrayList<SimpleError> errors]
@init{
	$reclang::scope_id++;
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
	
	id2=ID reconfiguration_block
	{
		local_errors.addAll($reconfiguration_block.errors);
	}
	)
	
	{
		$for_instruction.errors = local_errors;
	}

	;
	
	
expression returns[ArrayList<SimpleError> errors]
	: ^(OP_UNION expression expression)
	| ^(OP_INTERSECTION expression expression)
	| ^(OP_MINUS expression expression)
	| factor { $expression.errors = $factor.errors; }
	;


factor returns[ArrayList<SimpleError> errors]
@init{
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

}
	: ^(ID ID) { $factor.errors = local_errors; }
	| ID
	{
		Integer s_id = $instruction::scope.getScopeRel().fst();
		TinySymbol ts = $reconfiguration_def::name.hasValue($ID.text, s_id);
		if (!$instruction::scope.containsSymbol($ID.text) && ts == null){
			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined($ID.text), $ID.line, $ID.pos) );
		}
		else{
			//System.out.println($ID.text);
			TinySymbol symbol = ts != null ? ts : $instruction::scope.getSymbols().get($ID.text);
			//System.out.println(ts);
			if ($instruction::rec_type.equals("par") && !symbol.getDataType().contains(Type.PATTERN) ){
				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype($ID.text, "Pattern"), $ID.line, $ID.pos) );
			}
		}
		$factor.errors = local_errors; 
	}
	| operation { $factor.errors = local_errors; }
	| constructor { $factor.errors = local_errors; }
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
	: ^(NODE ID+)
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

