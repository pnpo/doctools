tree grammar RecTG;

options{
	tokenVocab = RecParser;
	ASTLabelType = CommonTree;
	//backtrack = true;
}

@header{
	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.parsing.util.*;
	import java.util.HashMap;	
	import java.io.File;
}

@members{
	private TinySymbolsTable ids_table = new TinySymbolsTable();
	
	
	private String file_path;

	public void setFilePath(String file) {
		this.file_path = file;
	}
	
	private String retriveResourceFromFilePath(String file_path) {
		int idx = file_path.lastIndexOf('/');
		String resource = file_path.substring(idx + 1);
		return resource;
	}
}



//GRAMMAR

reclang[TinySymbolsTable i_global_table] returns[TinySymbolsTable o_global_table]
scope{
	int scope_id;
	int parent_id;
	int aux_id;
	List<Integer> scopes;
}
@init{
	this.ids_table = $reclang.i_global_table;
	$reclang::scope_id = 0;
	$reclang::parent_id = 0;
	$reclang::aux_id = 0;
	
	$reclang::scopes = new ArrayList<Integer>(); //LinkedList or Stack
	$reclang::scopes.add(0);
	
}
	: ^(RECONFIGS directive_def* content
	
	{
		//ids_table.removeRepeatedSymbols();
		$reclang.o_global_table = ids_table;
	}
	) 
	
	;




directive_def
	: directive_import
	;

	
directive_import
	: ^(IMPORT STRING
	{
		String file_name = $STRING.text;
		String file = file_name.substring(1, file_name.length()-1); //remove " from string
		
	    	File f = new File( file );
	    	if( f.exists() ){
			String file_extension = file_name.substring(file_name.length()-5, file_name.length()-1); //eg: "overlap.rpl" -> rpl
			
			if (file_extension.equals(Constants.RECOOPLA_FILE_EXTENSION)) {	//*.rpla
				ReCooPLaProcessor p = new ReCooPLaProcessor(file, "");
				
				TinySymbolsTable imported_ids_table = p.getIdentifiersTable(this.ids_table);
				if (imported_ids_table.containsSymbol("\$main")){
					imported_ids_table.getSymbols().remove("\$main"); //ignore imported main's
				}
				this.ids_table = imported_ids_table;
				
				/*
				TinySymbolsTable changed_table = new TinySymbolsTable(imported_ids_table);
				for (TinySymbol ts : changed_table.getSymbols().values()){
					ts.setLine(0);
				}
				this.ids_table = changed_table;
				*/
				
			}
		}
	}
	)
	;




content
	: element* main?
	;
	
element
	: ^(RECONFIGURATION reconfiguration_def)
	| ^(APPLICATION applicaiton_def)
	;

main
	: ^(MAIN main_def)
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
				
		$reconfiguration_def::rec_symbol.setFile( this.file_path ); //retriveResourceFromFilePath(this.file_path)
		
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
//	| node_cons
//	| xor_cons
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
//	| ^(OP_ENDS ID) 
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
	
/*		
node_cons
	: ^(NODE ID+ ) 
	;

xor_cons
	: ^(XOR  ^(IN ID ID*) ^(OUT ID ID+) )
	;
*/


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




main_def
scope{
	TinySymbol symbol;
	TinySymbolsTable scope;
}
@init{
	$main_def::symbol = new TinySymbol();
	$main_def::scope = new TinySymbolsTable();
}
	: main_args? main_block
	{
		
		$main_def::symbol.setId("\$main");
		
		List<Type> datatype = new ArrayList<Type>();
		datatype.add( Type.NULL ); 	//main returns void
		$main_def::symbol.setDataType(datatype);
		
		Type classtype = Type.MAIN; 	//Type.valueOf("MAIN")
		$main_def::symbol.setClassType(classtype);
		
		$main_def::symbol.setLine( $main_block.start.getLine() );
		$main_def::symbol.setPosition( 0 );
		$main_def::symbol.setFile( this.file_path ); //retriveResourceFromFilePath(this.file_path)
		
		List<TinySymbolsTable> scopes = new ArrayList<TinySymbolsTable>();
		scopes.add($main_def::scope);
		$main_def::symbol.setScopes( scopes );
		
		//$main_def::symbol.removeRepeatedIds();
		if(!ids_table.containsSymbol("\$main")){
			ids_table.addSymbol($main_def::symbol);
		}
	}
	;

main_args
	: ^(ARGUMENTS main_arg+)
	;

main_arg
	: ^(ARGUMENT ID ids[true, true])
	;	

ids[boolean toAdd, boolean isArg]
	: ^(IDS (ID
	{
		if (toAdd){
			TinySymbol s = new TinySymbol();
			s.setId($ID.text);
			
			List<Type> datatype = new ArrayList<Type>();
			datatype.add( Type.PATTERN );
			s.setDataType(datatype);
			
			Type classtype;
			if (isArg){ 
				classtype = Type.ARG;
			} else {
				classtype = Type.VAR;
			}
			s.setClassType(classtype);
			
			s.setLine($ID.line);
			s.setPosition($ID.pos);
			
			if (!$main_def::scope.containsSymbol($ID.text)){
				$main_def::scope.addSymbol(s);
			}
		}
	}
	)+
	)
	;	
	

main_block
	: ^(INSTRUCTIONS main_instruction+)
	;

main_instruction
	: main_declaration
	| main_assignment
	;

main_declaration
	: ^(DECLARATION ID ids[true, false])
	;

main_assignment
	: ^( APPLICATION ( ^(DECLARATION dt=ID? 
	{	
		boolean toAdd = false;
		if ($dt.text != null){ //if is declaration
			toAdd = true;
		}
	}
	ids[toAdd, false]) )? ^(OP_APPLY ID reconfiguration_call) )
	;