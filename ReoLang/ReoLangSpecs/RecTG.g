tree grammar RecTG;

options{
	tokenVocab = RecParser;
	ASTLabelType = CommonTree;
	//backtrack = true;
}

@header{
	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.parsing.util.*;
}

@members{
	private TinySymbolsTable ids_table = new TinySymbolsTable();
}



//GRAMMAR

reclang returns[TinySymbolsTable global_table]
scope{
	int scope_id;
	int parent_id;
	int aux_id;
	List<Integer> scopes;
}
@init{
	$reclang::scope_id = 0;
	$reclang::parent_id = 0;
	$reclang::aux_id = 0;
	
	$reclang::scopes = new ArrayList<Integer>(); //LinkedList or Stack
	$reclang::scopes.add(0);
	
}
	: ^(RECONFIGS directive_def* element*
	
	{
		//ids_table.removeRepeatedSymbols();
		$reclang.global_table = ids_table;
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
	List<TinySymbolsTable> sub_scopes;
	List<Type> datatype;
	String scope;
}
@init{
	$reconfiguration_def::rec_symbol = new TinySymbol();
	$reconfiguration_def::main_scope = new TinySymbolsTable();
	$reconfiguration_def::sub_scopes = new ArrayList<TinySymbolsTable>();
	$reconfiguration_def::datatype = new ArrayList<Type>();
	$reconfiguration_def::scope = "main";
	
	$reclang::scope_id = 0;
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
		$reconfiguration_def::rec_symbol.addScopes($reconfiguration_def::main_scope, $reconfiguration_def::sub_scopes);
		
		$reconfiguration_def::rec_symbol.removeRepeatedIds();
		if(!ids_table.containsSymbol($ID.text)){
			ids_table.addSymbol($reconfiguration_def::rec_symbol);
		}
	}
	) 
	;

args_def
@init{
	$reconfiguration_def::main_scope.setScopeRel( new Pair<Integer, Integer>($reclang::scope_id, $reclang::parent_id) );
	$reclang::scope_id++;
}
	: ^(ARGUMENTS arg_def+
	)
	;
	
arg_def
@init{
	$reconfiguration_def::datatype = new ArrayList<Type>();
}
	: ^(ARGUMENT datatype list_ids)
	;
	
datatype
	: DT_PATTERN { $reconfiguration_def::datatype.add( Type.PATTERN ); }
	| DT_CHANNEL { $reconfiguration_def::datatype.add( Type.CHANNEL ); }
	| DT_NAME { $reconfiguration_def::datatype.add( Type.NAME ); }
	| DT_NODE { $reconfiguration_def::datatype.add( Type.NODE ); }	
	| DT_XOR { $reconfiguration_def::datatype.add( Type.XOR ); }
	
	|  ^( other_type
	{
		$reconfiguration_def::datatype.add( $other_type.type );
	}
	subtype
	)
	;
	
other_type returns[Type type]
	: DT_SET    { $other_type.type = Type.SET; }
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
		
		if (!$reconfiguration_def::main_scope.containsSymbol($ID.text)){
			$reconfiguration_def::main_scope.addSymbol(s);
		}
	}
	)+
	;
	
	
reconfiguration_block
	: ^(INSTRUCTIONS instruction+)
	;
	
instruction
	: declaration
	| assignment
	| reconfiguration_apply
	| for_instruction
	{
		$reclang::scopes.remove($reclang::scopes.size()-1);
		$reclang::parent_id = $reclang::scopes.get($reclang::scopes.size()-1);
		$reclang::aux_id--;
			
		if ($reclang::parent_id == 0) {
			$reconfiguration_def::scope = "main";
		}
	}
	;
	
reconfiguration_apply
	: ^(OP_APPLY reconfiguration_call ID?)
	;
	
declaration 
@init{
	$reconfiguration_def::datatype = new ArrayList<Type>();
}
	: ^(DECLARATION datatype var_def+)
	;
	
var_def
	: ID
	{
		TinySymbol s = new TinySymbol();
		s.setId($ID.text);
		
		s.setDataType( $reconfiguration_def::datatype );
		
		Type classtype = Type.VAR;
		s.setClassType(classtype);
		
		s.setLine($ID.line);
		s.setPosition($ID.pos);
		
		if ($reconfiguration_def::scope.equals("main")){
			if (!$reconfiguration_def::main_scope.containsSymbol($ID.text)){
				$reconfiguration_def::main_scope.addSymbol(s);
			}
		}
		else {
			if (!$for_instruction::forall_table.containsSymbol($ID.text)){
				$for_instruction::forall_table.addSymbol(s);
			}
		}
		
	
	}
	| assignment
	{
		if ($reconfiguration_def::scope.equals("main")){
			if ( !$reconfiguration_def::main_scope.containsSymbol($assignment.symbol.getId()) ){
				$reconfiguration_def::main_scope.addSymbol($assignment.symbol);
			}
		}
		else {
			if ( !$for_instruction::forall_table.containsSymbol($assignment.symbol.getId()) ){
				$for_instruction::forall_table.addSymbol($assignment.symbol);
			}
		}
	}
	;
	
assignment returns[TinySymbol symbol]
	: ^(ASSIGNMENT ID 
	{
		TinySymbol s = new TinySymbol();
		s.setId($ID.text);
		
		s.setDataType( $reconfiguration_def::datatype );
		
		Type classtype = Type.VAR;
		s.setClassType(classtype);
		
		s.setLine($ID.line);
		s.setPosition($ID.pos);
		
		$assignment.symbol = s;
	}
	
	assignment_member) 
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
scope{
	TinySymbolsTable forall_table;
}
@init{
	
	$reconfiguration_def::datatype = new ArrayList<Type>();
	$for_instruction::forall_table = new TinySymbolsTable();
	$reconfiguration_def::scope = "forall";
	
	if ($reclang::scopes.contains($reclang::aux_id)){
		$reclang::parent_id = $reclang::aux_id;
	}
	else{
		$reclang::parent_id = $reclang::scopes.get($reclang::scopes.size()-1);
	}
	
	$for_instruction::forall_table.setScopeRel( new Pair<Integer, Integer>($reclang::scope_id, $reclang::parent_id) );
	
	$reclang::scopes.add($reclang::scope_id);	
	$reclang::scope_id++;
	$reclang::aux_id++;
}
	: ^(FORALL datatype id1=ID
	{
		TinySymbol s = new TinySymbol();
		s.setId($id1.text);
		
		s.setDataType( $reconfiguration_def::datatype );
		
		Type classtype = Type.VAR;
		s.setClassType(classtype);
		
		s.setLine($id1.line);
		s.setPosition($id1.pos);
		
		if (!$for_instruction::forall_table.containsSymbol($id1.text)){
			$for_instruction::forall_table.addSymbol(s);
		}
	}
	
	id2=ID reconfiguration_block
	{
		$reconfiguration_def::sub_scopes.add($for_instruction::forall_table);
	}
	)
	;
	
	
expression
	: ^(OP_UNION factor factor)
	| ^(OP_INTERSECTION factor factor)
	| ^(OP_MINUS factor factor)
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
	| ^(OP_ENDS ID) 
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

