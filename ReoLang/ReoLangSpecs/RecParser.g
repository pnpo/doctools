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
	MAIN;
	IDS;
	SIGNATURE;
} 



@header{
	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.ReoLangLexer;
	import pt.uminho.di.reolang.ReoLangParser;	
	import pt.uminho.di.reolang.reclang.Constants;
	import pt.uminho.di.reolang.parsing.util.Error;
	import pt.uminho.di.reolang.parsing.util.SimpleError;
	import pt.uminho.di.reolang.parsing.util.ErrorType;
	import java.io.File;
}

@members{
	private ArrayList<SimpleError> syntax_errors = new ArrayList<SimpleError>();
	
	@Override
	public void emitErrorMessage(String msg) {
        	syntax_errors.add(new SimpleError(ErrorType.ERROR, msg));
	}
	
	//Notice the access to the errors of the imported grammars
	public ArrayList<SimpleError> getErrors() {
		return this.syntax_errors;
	}
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
	:	RW_IMPORT STRING
	{
		String file_name = $STRING.text;
		String file = file_name.substring(1, file_name.length()-1); //remove " from string
		
	    	File f = new File( file );
	    	if( f.exists() ){
			String file_extension = file_name.substring(file_name.length()-5, file_name.length()-1); //eg: "overlap.rpl" -> rpl
			
			if (file_extension.equals(Constants.RECOOPLA_FILE_EXTENSION)) {	//rpla
				Processor p = new Processor(file);
				ArrayList<SimpleError> imported_syntax_errors = p.getSyntaxErrors();
				if ( !imported_syntax_errors.isEmpty() ){
					this.syntax_errors.addAll( imported_syntax_errors );
				}
			}
			else if (file_extension.equals(Constants.COOPLA_FILE_EXTENSION)) {	//if is a CooPLa file
				ReoLangParser.reolang_return final_result = null;
				try{
					CharStream stream = new ANTLRFileStream(file, "UTF8");
					//LEXER
					ReoLangLexer lex = new ReoLangLexer(stream);
					CommonTokenStream tokens = new CommonTokenStream(lex);
			        	//PARSER
					ReoLangParser parser = new ReoLangParser(tokens);
					parser.setFilePath(file);
					final_result = parser.reolang();
					//this.setErrors(parser.getErrors());
					for (Error e : parser.getErrors()){
						this.syntax_errors.add( SimpleError.report(ErrorType.ERROR, e.getMessage(), e.getLine(), e.getPosition()) );
					}
				}
				catch(Throwable t){
					System.out.println("exception: " + t);
				        System.out.println(SimpleError.report(ErrorType.WARNING, "See Console for more details..."));
					t.printStackTrace();
				}
			}
			else {
				//emit error -> import file invalid
			}
		}
	}
	SEP_SEMICOLON 
		
		-> ^(IMPORT STRING)
	;





	
element
	:	reconfiguration_def	-> ^(RECONFIGURATION reconfiguration_def)
	|	applicaiton_def		-> ^(APPLICATION applicaiton_def)	
	| 	main_def		-> ^(MAIN main_def)
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




main_def
	:	RW_MAIN SEP_LIST_START main_args? SEP_LIST_END main_block
		-> main_args? main_block
	;

main_args
	:	main_arg (SEP_SEMICOLON main_arg)*
		-> ^(ARGUMENTS main_arg+)
	;

main_arg
	: 	dt=ID ids
		-> ^(ARGUMENT ID ids)
	;	

ids
	:	ID (SEP_COMMA ID)* -> ^(IDS ID+)
	;	
	

main_block
	:	SEP_BLOCK_START main_instruction+ SEP_BLOCK_END
		-> ^(INSTRUCTIONS main_instruction+)
	;

main_instruction
	:	main_declaration SEP_SEMICOLON 		-> main_declaration
	|	main_assignment SEP_SEMICOLON		-> main_assignment
	;

main_declaration
	:	dt=ID ids
		-> ^(DECLARATION $dt ids)
	;

main_assignment
	:	(dt=ID? ids OP_EQUAL)? id2=ID OP_APPLY reconfiguration_call
		-> ^(APPLICATION ( ^(DECLARATION $dt? ids) )? ^(OP_APPLY $id2 reconfiguration_call) )
	;