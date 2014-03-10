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
	SimpleError se = new SimpleError();
}



//GRAMMAR

reclang[TinySymbolsTable global_table] returns[ArrayList<SimpleError> errors]
scope{
	TinySymbolsTable ids_table; 
}
@init{
	$reclang::ids_table = $reclang.global_table;
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
	ArrayList<TinySymbolsTable> scopes;
}
@init{
	$reconfiguration_def::scopes = new ArrayList<TinySymbolsTable>();
	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

}
	: ^(ID 
	{		
		TinySymbol ts = $reclang::ids_table.getSymbols().get($ID.text);
		$reconfiguration_def::scopes = (ArrayList<TinySymbolsTable>) ts.getScopes();
		
		if ($reclang::ids_table.containsSymbol($ID.text)){
			if ( !($ID.line == ts.getLine() && $ID.pos == ts.getPosition()) ){
				local_errors.add( se.report(ErrorType.ERROR, se.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos) );
			}
		}
	}
	(args_def
	{
		local_errors.addAll($args_def.errors);
	}
	)? reconfiguration_block) 
	
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
				local_errors.add( se.report(ErrorType.ERROR, se.nameAlreadyDefined($ID.text, ts.getLine(), ts.getPosition()), $ID.line, $ID.pos) );
			}
		}
	}
	)+
	
	{
		$list_ids.errors = local_errors;
	}
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

