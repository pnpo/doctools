parser grammar RecParser;

options{
	tokenVocab=RecLexer;
	output=AST;
}

tokens {
	RECONFIGS; 
	IMPORT;
	RECONFIGURATION;
	APPLICATION;
	SIGNATURE;
} 



@header{
	package pt.uminho.di.reolang.reclang;
	import java.text.*;
	import java.util.Date;
	/*
	import pt.uminho.di.reolang.parsing.util.Error;
	import pt.uminho.di.reolang.parsing.util.ErrorType;
	*/
}

@members{
	/*
	private ArrayList<Error> syntax_errors = new ArrayList<Error>();
	private String file_path;
	
	public void emitErrorMessage(String msg) {
        syntax_errors.add(new Error(ErrorType.ERROR, msg, this.file_path));
    }
	
	//Notice the access to the errors of the imported grammars
	public ArrayList<Error> getErrors() {
		return this.syntax_errors;
	}
	
	public String getFilePath() {
		return this.file_path;
	}

	public void setFilePath(String file) {
		this.file_path = file;
	}
	*/
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
	:	RW_RECONFIGURATION ID SEP_ARGS_START args_def? (SEP_OPTIONAL args_def)? SEP_ARGS_END reconfiguration_block
	;

args_def
	:	datatype list_ids (SEP_SEMICOLON datatype list_ids)*
	;
	
datatype
	: 	DT_PATTERN 
	| 	DT_CHANNEL
	|	other_type (SEP_SUBTYPE_START subtype SEP_SUBTYPE_END)?
	;
	
other_type
	:	DT_NAME | DT_NODE | DT_SET | DT_PAIR | DT_TRIPLE 
	;

subtype
	:	datatype 
	;
	
list_ids
	:	ID (SEP_COMMA ID)*
	;
	
	
reconfiguration_block 
	:	SEP_BLOCK_START instruction+ SEP_BLOCK_END
	;
	
instruction
	:	declaration SEP_SEMICOLON
	|	assignement SEP_SEMICOLON
	|	reconfiguration_apply SEP_SEMICOLON
	|	for_instruction
	;
	
reconfiguration_apply
	:	OP_APPLY reconfiguration_call
	;
	
declaration 
	:	datatype var_def (SEP_COMMA var_def)*
	;
	
var_def
	:	ID
	|	assignement
	;
	
assignement 
	:	ID OP_EQUAL (expression | reconfiguration_apply)
	; 
	
	
reconfiguration_call
	: ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | OP_CONST | OP_ID | ID ) operation_args
	;
	
	
structure_operation_call
	:	( OP_PATH | OP_UPDATE ) operation_args
	;
	
	
operation_args
	:	SEP_ARGS_START args? (SEP_OPTIONAL args)? SEP_ARGS_END	
	;
	
args
	:	expression (SEP_COMMA expression)*
	;
	
	
for_instruction	
	:	RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block
	;
	
	
expression
	:	union_expr (OP_UNION union_expr)*
	;
	
union_expr
	:	intersect_expr (OP_INTERSECTION intersect_expr)*
	;
	
intersect_expr
	:	factor (OP_MINUS factor)? 
	;


factor
	:	ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END 
	|	ID SEP_ACCESSOR ID	
	|	SEP_ACCESSOR ID
	|	ID
	|	ID (SEP_OF ID)? SEP_ACCESSOR node_operation_call
	|	single_return_operation
	|	triple_cons
	|	pair_cons
	|	set_cons 
	| 	structure_operation_call 
	;


single_return_operation
	:	 ( OP_FST | OP_SND | OP_TRD | OP_FTH ) operation_args
	;
	
node_operation_call
	:	 ( OP_IN | OP_OUT ) SEP_LIST_START INT SEP_LIST_END 
	;
	
	
triple_cons
	:	CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END
	;
	
	
pair_cons 
	:	CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END
	;
	
	
	
set_cons
	:	CONS_SET SEP_ARGS_START  ( expression (SEP_COMMA expression)* )? SEP_ARGS_END
	;
	
		
	





applicaiton_def 
	:	ID OP_APPLY  list_reconfigurations  trigger_def?
	;
	
list_reconfigurations
	: 	SEP_BLOCK_START reconfiguration_call (SEP_COMMA reconfiguration_call)* SEP_BLOCK_END
	|	reconfiguration_call
	;
	
trigger_def
	:	SEP_TRIGGER trigger_block
	;
	
trigger_block
	:	SEP_BLOCK_START SEP_BLOCK_END
	;

