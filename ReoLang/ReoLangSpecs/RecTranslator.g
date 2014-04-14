tree grammar RecTranslator;

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
}



//GRAMMAR

reclang
	: ^(RECONFIGS directive_def* element*) 
	
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
	: ^(ID args_def? reconfiguration_block) 
	;

args_def
	: ^(ARGUMENTS arg_def+)
	;
	
arg_def
	: ^(ARGUMENT datatype list_ids)
	;
	
datatype
	: DT_PATTERN
	| DT_CHANNEL 
	| DT_NAME 
	| DT_NODE
	| DT_XOR 
	|  ^( other_type subtype)
	;
	
other_type 
	: DT_SET    
	| DT_PAIR 
	| DT_TRIPLE
	;

subtype
	: datatype
	;
	
list_ids
	: (ID)+
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

