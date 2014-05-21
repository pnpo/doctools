parser grammar RecParser;

options{
	tokenVocab=RecLexer; 
	output=AST;
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
	NODE;
	XOR;
	IN;
	OUT;
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
		-> ^(ID args_def? reconfiguration_block) 
	;

args_def
	:	arg_def (SEP_SEMICOLON arg_def)*
		-> ^(ARGUMENTS arg_def+)
	;
	
arg_def
	: 	datatype list_ids
		-> ^(ARGUMENT datatype list_ids)
	;
	
datatype
	: 	DT_PATTERN 
	| 	DT_CHANNEL
	|	DT_NAME
	|	DT_NODE
	|	DT_XOR
	|	other_type SEP_SUBTYPE_START subtype SEP_SUBTYPE_END -> ^(other_type subtype)
	;
	
other_type
	:	DT_SET | DT_PAIR | DT_TRIPLE 
	;

subtype
	:	datatype 
	;
	
list_ids
	:	ID (SEP_COMMA ID)* -> ID+
	;
	
	
reconfiguration_block 
	:	SEP_BLOCK_START instruction+ SEP_BLOCK_END 
		-> ^(INSTRUCTIONS instruction (instruction)*)
	;
	
instruction
	:	declaration SEP_SEMICOLON 		-> declaration
	|	assignment SEP_SEMICOLON		-> assignment
	|	reconfiguration_apply SEP_SEMICOLON	-> reconfiguration_apply
	|	for_instruction				-> for_instruction
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
	:	SEP_ARGS_START args? SEP_ARGS_END	-> args?
	;
	
args
	:	expression (SEP_COMMA expression)*
		-> expression+
	;
	
	
for_instruction	
	:	RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block
		-> ^(FORALL datatype ID ID reconfiguration_block)
	;
	
/*		
expression
	:	factor OP_UNION^ factor
	|	factor OP_INTERSECTION^ factor
	|	factor OP_MINUS^ factor
	|	factor
	;	
*/
expression
	:	factor (expr_op^ factor)? 
	;
	
expr_op
	:	OP_UNION
	|	OP_INTERSECTION
	| 	OP_MINUS
	;

factor
	:	ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END 	 	-> ^(ID ID)  //rever se faz falta
	|	ID						 	-> ID
	|	operation
	|	constructor
	;

operation
	: 	ID (SEP_STRUCTURE ID)? SEP_ACCESSOR attribute_call 	-> ^(ACCESS ID ^(STRUCTURE ID)? attribute_call)
//	| 	single_return_operation					-> single_return_operation
	| 	structure_operation_call 			 	-> structure_operation_call
	;
	
constructor
	:	triple_cons					 	-> triple_cons
	|	pair_cons					 	-> pair_cons
	|	set_cons 					 	-> set_cons 
	|	node_cons						-> node_cons
	|	xor_cons						-> xor_cons
	;

//single_return_operation
//	:	 ( OP_FST^ | OP_SND^ | OP_TRD^ ) operation_args
//	;
	
attribute_call
	:	OP_IN (SEP_LIST_START INT SEP_LIST_END)?  	-> ^(OP_IN INT?)
	| 	OP_OUT (SEP_LIST_START INT SEP_LIST_END)?	-> ^(OP_OUT INT?)
	|	OP_NAME						-> OP_NAME
//	|	OP_ENDS SEP_ARGS_START ID SEP_ARGS_END		-> ^(OP_ENDS ID)
	|	OP_NODES					-> OP_NODES
	|	OP_NAMES					-> OP_NAMES
	|	OP_FST						-> OP_FST
	|	OP_SND						-> OP_SND
	|	OP_TRD						-> OP_TRD
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
	
		
node_cons
	:	CONS_NODE SEP_ARGS_START  ID (SEP_COMMA ID)* SEP_ARGS_END
		-> ^(NODE ID+ ) 
	;
	
xor_cons
	:	CONS_XOR SEP_ARGS_START id1=ID (SEP_COMMA id2=ID)* SEP_COLON id3=ID (SEP_COMMA id4=ID)+ SEP_ARGS_END
		-> ^(XOR  ^(IN $id1 $id2*) ^(OUT $id3 $id4+) )
	;




applicaiton_def 
	:	ID OP_APPLY  list_reconfigurations  trigger_def?
		-> ID list_reconfigurations trigger_def?
	;
	
list_reconfigurations
	: 	SEP_BLOCK_START? reconfiguration_call (SEP_COMMA reconfiguration_call)* SEP_BLOCK_END? 	-> reconfiguration_call+
	;
	
trigger_def
	:	SEP_TRIGGER trigger_block 
		-> trigger_block
	;
	
trigger_block
	:	SEP_BLOCK_START SEP_BLOCK_END
	;

