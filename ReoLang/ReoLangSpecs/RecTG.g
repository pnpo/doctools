tree grammar RecTG;

options{
	tokenVocab = RecParser;
	ASTLabelType = CommonTree;
	//backtrack = true;
	//k = 2;
}

@header{
	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.parsing.util.*;
}

@members{
	private TinySymbolsTable ids_table = new TinySymbolsTable();
	
	int scope = 0;
}



//GRAMMAR

reclang returns[String test]
	: ^(RECONFIGS directive_def* element*
	
	{
		$reclang.test = "...";
	}
	) 
	
	;




directive_def
	: directive_import
	;

	
directive_import
	: ^(IMPORT STRING)
	;





	
element
	: ^(RECONFIGURATION reconfiguration_def)
	| ^(APPLICATION applicaiton_def)	
	;



reconfiguration_def
scope{
	TinySymbol rec_symbol;
	TinySymbolsTable main_scope;
	List<Type> datatype;
}
@init{
	$reconfiguration_def::rec_symbol = new TinySymbol();
	$reconfiguration_def::main_scope = new TinySymbolsTable();
	$reconfiguration_def::datatype = new ArrayList<Type>();
	//scope++;
	//reconfig.setScopeRel( new Pair<Integer, Integer>(scope, 0) );	//scope_id, parent_id
	
	//List<TinySymbolsTable> scopes = new ArrayList<TinySymbolsTable>();
}
	: ^(ID 
	{
		
		$reconfiguration_def::rec_symbol.setId($ID.text);
		
		$reconfiguration_def::datatype.add( Type.PATTERN );	//Type.values()[0]
		$reconfiguration_def::rec_symbol.setDataType($reconfiguration_def::datatype);
		
		Type classtype = Type.RECONFIG; 	//Type.valueOf("RECONFIG")
		$reconfiguration_def::rec_symbol.setClassType(classtype);
		
		$reconfiguration_def::rec_symbol.setLine($ID.line);
		$reconfiguration_def::rec_symbol.setPosition($ID.pos);
	}
	
	args_def? reconfiguration_block
	{
		$reconfiguration_def::rec_symbol.addScope($reconfiguration_def::main_scope);
		ids_table.addSymbol($reconfiguration_def::rec_symbol);
		System.out.println(ids_table.toString());
	}
	) 
	;

args_def returns[TinySymbolsTable table]
@init{
	//$reconfiguration_def.main_scope.setScopeRel( new Pair<Integer, Integer>(scope, parent) );	//scope_id, parent_id
}
	: ^(ARGUMENTS arg_def+
	)
	;
	
arg_def
@init{
	$reconfiguration_def::datatype = new ArrayList<Type>();
}
	: ^(ARGUMENT datatype 
	{
		System.out.println( $reconfiguration_def::datatype.toString() );
	}
	
	list_ids
	)
	;
	
datatype
	: DT_PATTERN 
	{
		$reconfiguration_def::datatype.add( Type.PATTERN );
	}
	
	| DT_CHANNEL
	{
		$reconfiguration_def::datatype.add( Type.CHANNEL );
	}
	
	|  ^( other_type 
	{
		$reconfiguration_def::datatype.add( $other_type.type );
	}
	
	subtype? 
	)
	;
	
other_type returns[Type type]
	: DT_NAME   { $other_type.type = Type.NAME; }
	| DT_NODE   { $other_type.type = Type.NODE; }
	| DT_SET    { $other_type.type = Type.SET; }
	| DT_PAIR   { $other_type.type = Type.PAIR; }
	| DT_TRIPLE { $other_type.type = Type.TRIPLE; }
	;

subtype
	: datatype
	;
	
list_ids
	: (ID
	{
		TinySymbol s = new TinySymbol();
		s.setId($ID.text);
		
		s.setDataType( $reconfiguration_def::datatype );
		
		Type classtype = Type.ARG;
		s.setClassType(classtype);
		
		s.setLine($ID.line);
		s.setPosition($ID.pos);
		
		$reconfiguration_def::main_scope.addSymbol(s);
	}
	)+
	;
	
	
reconfiguration_block 
	: ^(INSTRUCTIONS instruction (instruction)*)
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
	: ^(FORALL datatype ID ID reconfiguration_block)
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
	| ^(ACCESS ID (^(STRUCTURE ID))? attribute_call)
	| single_return_operation
	| triple_cons
	| pair_cons
	| set_cons
	| structure_operation_call
	;


single_return_operation
	: ^(OP_FST operation_args)
	| ^(OP_SND operation_args) 
	| ^(OP_TRD operation_args)
	;
	
attribute_call
	: ^(OP_IN INT?)
	| ^(OP_OUT INT?)
	| OP_NAME
	| OP_NODES
	| OP_NAMES
	| ^(OP_ENDS expression) 
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

