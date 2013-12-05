parser grammar RecParser;

options{
	tokenVocab=RecLexer;
	output=AST;
	//k=2;
}

tokens {
	RECONFIGS; 
	IMPORT;
	RECONFIGURATION;
	ARGUMENTS;
	ARGUMENT;
	SUBTYPE;
	INSTRUCTIONS;
	DECLARATION;
	ASSIGNMENT;
	FORALL;
	TRIPLE;
	PAIR;
	SET;
	ACCESS;
	STRUCTURE;
	APPLICATION;
	SIGNATURE;
} 



@header{
	package pt.uminho.di.reolang.reclang; 
}



//GRAMMAR

reclang
	: 	directive_def* element*
		-> ^(RECONFIGS directive_def* element*)
	;




directive_def
	:	directive_import 
		-> directive_import
	;

	
directive_import
	:	RW_IMPORT STRING SEP_SEMICOLON 
		-> ^(IMPORT STRING)
	;





	
element
	:	reconfiguration_def	-> ^(RECONFIGURATION reconfiguration_def)
	|	applicaiton_def		-> ^(APPLICATION applicaiton_def)	
	;



reconfiguration_def
	:	RW_RECONFIGURATION ID SEP_ARGS_START args_def? SEP_ARGS_END reconfiguration_block
		-> ^(ID ^(ARGUMENTS args_def?) reconfiguration_block) 
	;

args_def
	:	datatype list_ids (SEP_SEMICOLON datatype list_ids)*
		-> ^(ARGUMENT datatype list_ids)+ 
	;
	
datatype
	: 	DT_PATTERN 
	| 	DT_CHANNEL
	|	other_type^ (SEP_SUBTYPE_START! subtype SEP_SUBTYPE_END!)? //-> ^(other_type subtype?)
	;
	
other_type
	:	DT_NAME | DT_NODE | DT_SET | DT_PAIR | DT_TRIPLE 
	;

subtype
	:	datatype 
	;
	
list_ids
	:	ID (SEP_COMMA ID)* -> ID+
	;
	
	
reconfiguration_block 
	:	SEP_BLOCK_START instruction+ SEP_BLOCK_END 
		-> ^(INSTRUCTIONS instruction+)
	;
	
instruction
	:	declaration SEP_SEMICOLON! 		//-> declaration
	|	assignment SEP_SEMICOLON!		//-> assignement
	|	reconfiguration_apply SEP_SEMICOLON!	//-> reconfiguration_apply
	|	for_instruction				//-> for_instruction
	;
	
reconfiguration_apply
	:	ID? OP_APPLY reconfiguration_call	-> ^(OP_APPLY reconfiguration_call ID?)
	;
	
declaration 
	:	datatype var_def (SEP_COMMA var_def)*	-> ^(DECLARATION datatype var_def+)
	;
	
var_def
	:	ID
	|	assignment
	;
	
assignment 
	:	ID OP_EQUAL assignment_member 		-> ^(ASSIGNMENT ID assignment_member) 
	; 
	
assignment_member
	:	expression 
	|	reconfiguration_apply
	;
	
reconfiguration_call
	: 	(OP_JOIN^ | OP_SPLIT^ | OP_PAR^ | OP_REMOVE^ | OP_CONST^ | OP_ID^ | ID^) operation_args
	;
	
	
structure_operation_call
	:	( OP_PATH^ | OP_UPDATE^ ) operation_args 
	;
	
	
operation_args
	:	SEP_ARGS_START! args? SEP_ARGS_END!	//-> args?
	;
	
args
	:	expression (SEP_COMMA expression)*
		-> expression+
	;
	
	
for_instruction	
	:	RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block
		-> ^(FORALL datatype ID ID reconfiguration_block)
	;
	
	
expression
	:	union_expr (OP_UNION^ union_expr)*
		//-> union_expr+
	;
	
union_expr
	:	intersect_expr (OP_INTERSECTION^ intersect_expr)*
		//-> intersect_expr+
	;
	
intersect_expr
	:	factor (OP_MINUS^ factor)? 
		//-> ^(factor factor?)
	;


factor
	:	ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END 	 	-> ^(ID ID)
	|	ID						 	-> ID
	|	ID (SEP_STRUCTURE ID)? SEP_ACCESSOR attribute_call 	-> ^(ACCESS ID ^(STRUCTURE ID)? attribute_call)
	|	single_return_operation				 	-> single_return_operation
	|	triple_cons					 	-> triple_cons
	|	pair_cons					 	-> pair_cons
	|	set_cons 					 	-> set_cons 
	| 	structure_operation_call 			 	-> structure_operation_call
	;


single_return_operation
	:	 ( OP_FST^ | OP_SND^ | OP_TRD^ ) operation_args
	;
	
attribute_call
	:	OP_IN (SEP_LIST_START INT SEP_LIST_END)?  	-> ^(OP_IN INT?)
	| 	OP_OUT (SEP_LIST_START INT SEP_LIST_END)?	-> ^(OP_OUT INT?)
	|	OP_NAME						-> OP_NAME
	|	OP_NODES					-> OP_NODES
	|	OP_NAMES					-> OP_NAMES
	|	OP_ENDS SEP_ARGS_START expression SEP_ARGS_END	-> ^(OP_ENDS expression) 
	|	ID						-> ID
	;
	
	
triple_cons
	:	CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END
		-> ^(TRIPLE expression expression expression)
	;
	
	
pair_cons 
	:	CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END
		-> ^(PAIR expression expression)
	;
	
	
	
set_cons
	:	CONS_SET SEP_ARGS_START  ( expression (SEP_COMMA expression)* )? SEP_ARGS_END
		-> ^(SET expression*) 
	;
	
		
	





applicaiton_def 
	:	ID OP_APPLY  list_reconfigurations  trigger_def?
		-> ID list_reconfigurations trigger_def?
	;
	
list_reconfigurations
	: 	SEP_BLOCK_START reconfiguration_call (SEP_COMMA reconfiguration_call)* SEP_BLOCK_END 	-> reconfiguration_call+
	|	reconfiguration_call									-> reconfiguration_call
	;
	
trigger_def
	:	SEP_TRIGGER trigger_block 
		-> trigger_block
	;
	
trigger_block
	:	SEP_BLOCK_START SEP_BLOCK_END
	;

