tree grammar ReoLangSemantics;

options{
	tokenVocab=ReoLangParser;
	ASTLabelType = CommonTree;
}


@header{
	package pt.uminho.di.reolang;
	
	import java.text.*;
	import java.util.Date;
	import java.util.Iterator;	
	import pt.uminho.di.reolang.parsing.util.Error;
	import pt.uminho.di.reolang.parsing.util.*;
	import pt.uminho.di.reolang.parsing.*;
	
}


//RULES

reolang[ArrayList<Error> i_errors, String i_file, SymbolsTable i_gtable] returns [ArrayList<Error> errors, SymbolsTable symbols]	
	scope{
		SymbolsTable global_table; 
		String file;
		SymbolsTable actual_scope;
	}
	
	@init{
		$reolang::global_table = $reolang.i_gtable;
		$reolang::file = $reolang.i_file;
		$reolang::actual_scope = null;
		ArrayList<Error> local_errors = new ArrayList<Error>();
		
	}
	
	:^(REO_LANG (e1=directive_def 
	{
		local_errors.addAll($e1.o_errors);
	}
	)* (e2=element
	
	{
		local_errors.addAll($e2.o_errors);
	}
	
	)+ )
	
	{
		local_errors.addAll($reolang.i_errors);
		$reolang.errors = local_errors;
		$reolang.symbols = $reolang::global_table;
	}
	
	;
	
	
	
	
element returns [ArrayList<Error> o_errors]
	
	:	^(ELEMENT channel_def )
	
	{
		$element.o_errors = $channel_def.o_errors;
	}	

	|	^(ELEMENT pattern_def ) 

	{
		$element.o_errors = $pattern_def.o_errors;
	}
	
	;
	
	
	
	
	
	


// ------------------------
// DIRECTIVES
//-------------------------

	
	
	



directive_def returns [ArrayList<Error> o_errors]
	
	:	^(DIRECTIVE directive_import )
	{
		$directive_def.o_errors = $directive_import.o_errors;
	}
	
	;
	
directive_import returns [ArrayList<Error> o_errors]
	:	^(IMPORT FILE_PATH )
	{
		String file_string = $FILE_PATH.text;
		String file = file_string.substring(1,file_string.length()-1);
		Semantics semantics = new Semantics(file);
		ReoLangSemantics.reolang_return imported_atts = semantics.performSemanticAnalysis($reolang::global_table);
		$directive_import.o_errors = imported_atts != null ? imported_atts.errors : new ArrayList<Error>(0);
		$reolang::global_table = imported_atts != null ? imported_atts.symbols : $reolang::global_table ;
	}
	
	;
	







// -------------------
// CHANNELS
// -------------------	
	
	
	
	
	

channel_def  returns [ArrayList<Error> o_errors]
	scope{
		SymbolsTable channel_table; 
		String channel_name; 
		int channel_line; 
		int channel_pos;
	}
	@init{
		$channel_def::channel_table = new SymbolsTable();
		$channel_def::channel_name = "";
		$channel_def::channel_line = 0;
		$channel_def::channel_pos = 0;
		$reolang::actual_scope = $channel_def::channel_table;
		ArrayList<Error> local_errors = new ArrayList<Error>();
	}
		 
	:	^(CHANNEL channel_signature[InspectionMode.DECLARATION] (extension)? channel_body )
	
	{
		local_errors.addAll($channel_signature.o_errors);
		local_errors.addAll($extension.o_errors == null? new ArrayList<Error>(0) : $extension.o_errors );
		local_errors.addAll($channel_body.o_errors);
		$channel_def.o_errors = local_errors;
	}
	;
	
	
	
	
	
	
	
	
	
	

	
	
	
	
channel_signature [InspectionMode mode]  returns [ArrayList<Error> o_errors, Symbol o_channel_sig]
	@init{
		ArrayList<Error> local_errors = new ArrayList<Error>();
		Symbol sym = new Symbol(); 
	}
	
	:	^(SIGNATURE name=ID (option[$channel_signature.mode] )? ^(CHANNEL_PORTS (^(IN_PORTS in=ports[$channel_signature.mode, PortOrientation.IN] ))? (^(OUT_PORTS out=ports[$channel_signature.mode, PortOrientation.OUT] ))?) (^(CONDITION condname=ID condition[$channel_signature.mode]))?)
	
	{
		// MODE DECLARATION
		if(mode==InspectionMode.DECLARATION){
			
			//see if there's a channel with the name in ID in the symbols table
			if($reolang::global_table.isDefined($name.text)){
				local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($name.text), $name.line, $name.pos, $reolang::file));
			}
			else{ //Create new global symbol and add to the table
				
				sym.setId($name.text);
				sym.setLine($name.line);
				sym.setPosition($name.pos);
				sym.setType(Type.CHANNEL.toString());
				if($option.dimensions != null) {sym.setOptDimension($option.dimensions);}
				if($option.optionalType != null) {sym.setOptType($option.optionalType);}
				if($in.ports_list != null) {sym.setInArgs($in.ports_list);}
				if($out.ports_list != null) {sym.setOutArgs($out.ports_list);}
				if($condname.text != null) {sym.setCondName($condname.text);}
				if($condition.patterns !=null) {sym.setCondPatterns($condition.patterns);}
				$reolang::global_table.add(sym);
			}
			
			//check existence of condname in scope 
			if($condname != null && ($reolang::global_table.isDefined($condname.text) || $channel_def::channel_table.isDefined($condname.text))){
				local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($condname.text), $condname.line, $condname.pos, $reolang::file));
			}
			else {
				if($condname != null){
					Symbol local_symbol = new Symbol();
					local_symbol.setId($condname.text);
					local_symbol.setType(Type.CONDITION.toString());
					local_symbol.setLine($condname.line);
					local_symbol.setPosition($condname.pos);
					$channel_def::channel_table.add(local_symbol);
				}
			}
			
			//check number of ports in total
			if(sym.getNumberOfPorts() != 2){
				local_errors.add(Error.report(ErrorType.ERROR, Error.unauthorizedNumberOfPortsInChannels($name.text), $name.line, $name.pos, $reolang::file));
			}
			
			$channel_def::channel_name = $name.text;
			$channel_def::channel_line = $name.line;
			$channel_def::channel_pos = $name.pos;
			
		}
		
		//MODE REFERENCE
		if($channel_signature.mode == InspectionMode.REF_BY_INSTANCE){
			sym.setId($name.text);
			sym.setLine($name.line);
			sym.setPosition($name.pos);
			//sym.setType(Type.CHANNEL.toString()); //we don't know the type
			if($option.dimensions != null) {sym.setOptDimension($option.dimensions);}
			if($option.optionalType != null) {sym.setOptType($option.optionalType);}
			if($in.ports_list != null) {sym.setInArgs($in.ports_list);}
			if($out.ports_list != null) {sym.setOutArgs($out.ports_list);}
			if($condname.text != null) {sym.setCondName($condname.text);}
			if($condition.patterns !=null) {sym.setCondPatterns($condition.patterns);}
		}
		
		
		local_errors.addAll(($option.o_errors == null ? new ArrayList<Error>(0) : $option.o_errors));
		local_errors.addAll(($in.o_errors == null ? new ArrayList<Error>(0) : $in.o_errors));
		local_errors.addAll(($out.o_errors == null ? new ArrayList<Error>(0) : $out.o_errors));
		local_errors.addAll(($condition.o_errors == null ? new ArrayList<Error>(0) : $condition.o_errors));
		
		$channel_signature.o_errors = local_errors ;
									  
		$channel_signature.o_channel_sig = sym;
		
	}
	;















option[InspectionMode mode] returns [ArrayList<Error> o_errors, Type optionalType, ArrayList<Object> dimensions]
	@init {
		ArrayList<Object> dims = new ArrayList<Object>();
	}
	:	^(OPTION timed[$option.mode] )
	{
		$option.o_errors = $timed.o_errors;
		$option.optionalType = Type.TIME;
		dims.add($timed.time_value);
		$option.dimensions = dims;
	}
	
	|	^(OPTION structured[$option.mode] )
	
	{
		$option.o_errors = $structured.o_errors;
		$option.optionalType = Type.STRUCTURE;
		$option.dimensions = $structured.dimensions; 
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
timed [InspectionMode mode] returns [ArrayList<Error> o_errors, Object time_value]
	:	^(TIMED time[$timed.mode] )
	{
		$timed.o_errors = $time.o_errors;
		$timed.time_value = $time.time_value;
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
time [InspectionMode mode] returns [ArrayList<Error> o_errors, Object time_value]
	@init{
		ArrayList<Error> local_errors = new ArrayList<Error>();
	}
	
	: ^(TIME ID )
	
	{
		if($time.mode==InspectionMode.DECLARATION) { 
			//check for single and capital letter
			if( ($ID.text).length() > 1 || !Character.isUpperCase(($ID.text).charAt(0)) ) {
				local_errors.add(Error.report(ErrorType.WARNING, Error.nameConventionForDimension($ID.text), $ID.line, $ID.pos, $reolang::file));
			}
			//check if the ID is defined globally or locally
			if( $reolang::global_table.isDefined($ID.text) || $channel_def::channel_table.isDefined($ID.text)){
				local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text), $ID.line, $ID.pos, $reolang::file));
			}
			else {
				Symbol new_local_symb = new Symbol();
				new_local_symb.setId($ID.text);
				new_local_symb.setType(Type.TIME.toString());
				new_local_symb.setLine($ID.line);
				new_local_symb.setPosition($ID.pos);
				//Add symbol to local scope
				$channel_def::channel_table.add(new_local_symb);
			}	
		}
		
		if($time.mode==InspectionMode.REF_BY_USE) {
			
			//check if ID is declared locally
			if(!$channel_def::channel_table.isDefined($ID.text)){
				local_errors.add(Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, $reolang::file));
			}
			else { //if it is declared
				
				//check if the channel allows for time
				if( $reolang::global_table.get($channel_def::channel_name).getOptType() != Type.TIME) {
					local_errors.add(Error.report(ErrorType.ERROR, Error.notATimeChannel($channel_def::channel_name), $ID.line, $ID.pos, $reolang::file));
				} 
				else {
					//check if ID is time in the channel scope
					if(! $channel_def::channel_table.get($ID.text).getType().equals(Type.TIME.toString()) ){
						local_errors.add(Error.report(ErrorType.ERROR, Error.nameShouldBeTime($ID.text), $ID.line, $ID.pos, $reolang::file));
					}
				}
			} 
		}
		
		$time_value = $ID.text;
		$time.o_errors = local_errors;
	}
	
	| ^(TIME INT )
	
	{
		// In this case we don't add to channel scope as it is a constant 
		// and is accessible via optDimension attribute of the channel
		
		
		if($time.mode==InspectionMode.REF_BY_USE){
			
			//check if the channel allows for time
			if( $reolang::global_table.get($channel_def::channel_name).getOptType() != Type.TIME) {
				local_errors.add(Error.report(ErrorType.ERROR, Error.notATimeChannel($channel_def::channel_name), $INT.line, $INT.pos, $reolang::file));
			} 
			else {
				//check if INT is declared as a dimension in the channel scope
				if(! $reolang::global_table.get($channel_def::channel_name).getOptDimension().contains(Integer.parseInt($INT.text))) {
					local_errors.add(Error.report(ErrorType.ERROR, Error.notAValidTimeDimension($INT.text), $INT.line, $INT.pos, $reolang::file));	
				}
			}			
			
		}
		
		$time.o_errors = local_errors;
		$time_value = Integer.parseInt($INT.text);
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
structured [InspectionMode mode ]returns [ ArrayList<Error> o_errors, ArrayList<Object> dimensions]
	@init{
		ArrayList<Error> local_errors = new ArrayList<Error>(); 
		ArrayList<Object>dims = new ArrayList<Object>();
		String dim_type = "";
	}
	
	:	^(STRUCTURED (structure_dimension[mode, dim_type]
	
	{
		dims.add($structure_dimension.dimension);
		local_errors.addAll($structure_dimension.o_errors);
		dim_type = $structure_dimension.o_dim_type;
	}
	
	)+)
	
	{
		$structured.o_errors = local_errors;
		$structured.dimensions = dims; 
	}
	
	;
	
	
	
	
	
	
	
	
	
	
structure_dimension [InspectionMode mode, String i_dim_type] returns [ArrayList<Error> o_errors, Object dimension, String o_dim_type]
	@init{
		ArrayList<Error> local_errors = new ArrayList<Error>();
	}
	
	: ^(DIMENSION ID )
	
	{
		if($structure_dimension.mode==InspectionMode.DECLARATION) { 
			//check for single and capital letter
			if( ($ID.text).length() > 1 || !Character.isUpperCase(($ID.text).charAt(0)) ) {
				local_errors.add( Error.report(ErrorType.WARNING, Error.nameConventionForDimension($ID.text), $ID.line, $ID.pos, $reolang::file));
			}
			//check if the type is mixed
			if($structure_dimension.i_dim_type.equals("INT")){
				local_errors.add(Error.report(ErrorType.ERROR, Error.unauthorizedMixedDimensions(), $ID.line, $ID.pos, $reolang::file));
			}
			
			//check if the ID is defined globally 
			if( $reolang::global_table.isDefined($ID.text) || $channel_def::channel_table.isDefined($ID.text)){
				local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text), $ID.line, $ID.pos, $reolang::file));
			}
			else {
				Symbol new_local_symb = new Symbol();
				new_local_symb.setId($ID.text);
				new_local_symb.setType(Type.STRUCTURE.toString());
				new_local_symb.setLine($ID.line);
				new_local_symb.setPosition($ID.pos);
				//Add symbol to local scope
				$channel_def::channel_table.add(new_local_symb);
			}
		}
		
		$structure_dimension.dimension = $ID.text;
		$structure_dimension.o_errors = local_errors;
		$structure_dimension.o_dim_type = "STRING";
	}
	
	| ^(DIMENSION INT )
	
	{
		if($structure_dimension.mode==InspectionMode.DECLARATION) {
			//check if the type is the same as the previous one (avoid mixed types)
			if($structure_dimension.i_dim_type.equals("STRING")){
					local_errors.add(Error.report(ErrorType.ERROR, Error.unauthorizedMixedDimensions(), $INT.line, $INT.pos, $reolang::file));
				}
		}
		
		// Don't need to add to channel scope as it is a constant and is accessible 
		// from the optDimension attribute of the channel symbol
		$structure_dimension.dimension = Integer.parseInt($INT.text);
		$structure_dimension.o_errors = local_errors;
		$structure_dimension.o_dim_type = "INT";
		
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
ports [InspectionMode mode, PortOrientation i_orientation] returns [ArrayList<Error> o_errors, ArrayList<String> ports_list]
	@init{
		ArrayList<String> port_names = new ArrayList<String>();
		ArrayList<Error> local_errors = new ArrayList<Error>();
	}
	:	^(PORT (id1=ID
	
	{
		if($ports.mode == InspectionMode.DECLARATION){
			//Test if the name is in scope (global or channel/pattern -- the one that is inherited)
			// This allows to verify whether there are repeated ports...
			if($reolang::global_table.isDefined($id1.text) || $reolang::actual_scope.isDefined($id1.text)){
				local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($id1.text), $id1.line, $id1.pos, $reolang::file));
			}
			else {
				//Add name to the scope
				Symbol new_port_symbol = new Symbol();
				new_port_symbol.setId($id1.text);
				new_port_symbol.setType(Type.PORT.toString());
				new_port_symbol.setOrientation(i_orientation);
				new_port_symbol.setLine($id1.line);
				new_port_symbol.setPosition($id1.pos);
				$reolang::actual_scope.add(new_port_symbol);
			}
		}
		port_names.add($id1.text);
	}
	
	)+) 
	
	{
		$ports.o_errors = local_errors;
		$ports.ports_list = port_names;
	}
	;
	
	
	
	
	
	
	
	
	
	
	

condition [InspectionMode mode] returns [ArrayList<Error> o_errors, ArrayList<String> patterns]
	@init{
		ArrayList<String> patterns_list = new ArrayList<String>();
		ArrayList<Error> local_errors = new ArrayList<Error>(); 
	}
	
	:	^(COND_ELEMENTS (ID
	
	{
		if($condition.mode == InspectionMode.DECLARATION){
			//check if the name exists in global scope
			if($reolang::global_table.isDefined($ID.text)){
				local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text), $ID.line, $ID.pos, $reolang::file));
			}
			if(!$channel_def::channel_table.isDefined($ID.text)){
				Symbol new_local_symbol = new Symbol();
				new_local_symbol.setId($ID.text);
				new_local_symbol.setType(Type.CONDITION_ELEMENT.toString());
				new_local_symbol.setLine($ID.line);
				new_local_symbol.setPosition($ID.pos);
				$channel_def::channel_table.add(new_local_symbol); 
			}	
		}
		patterns_list.add($ID.text);
	}	
	
	)+)
	
	{
			$condition.o_errors = local_errors;
			$condition.patterns = patterns_list;
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
extension returns [ArrayList<Error> o_errors]
	@init{
		ArrayList<Error> local_errors = new ArrayList<Error>();
	}
	
	:	^(EXTENSION name=ID )
	
	{
		//If symbol does not exist...
		if(!$reolang::global_table.isDefined($name.text)){
			local_errors.add(Error.report(ErrorType.ERROR, Error.nameNotDefined($name.text), $name.line, $name.pos, $reolang::file));
		}
		else { //if it exists...
			Symbol base_symbol = $reolang::global_table.get($name.text);
			Symbol extending_symbol = $reolang::global_table.get($channel_def::channel_name);
			
			//check if there is a match between the two symbols
			local_errors.addAll(extending_symbol.isMatchForExtension(base_symbol, $reolang::file));
			
			//set the extends name in the channel symbol
			$reolang::global_table.get($channel_def::channel_name).setExtendsName($name.text);
			
			//if the base symbol has state + obs defined, the extending symbol inherits state + obs
			if(! base_symbol.getStateName().equals("")) {
				$reolang::global_table.get($channel_def::channel_name).setStateName(base_symbol.getStateName());
				$reolang::global_table.get($channel_def::channel_name).setObservers(base_symbol.getObservers());
				
				//The local table is added of the obs + state  
				Symbol state_inh = new Symbol();
				state_inh.setId(base_symbol.getStateName());
				state_inh.setType(Type.STATE.toString());
				$channel_def::channel_table.add(state_inh);
				
				Iterator<String> it =  base_symbol.getObservers().iterator();
				Symbol obs_inh;
				while(it.hasNext()){
					obs_inh = new Symbol();
					obs_inh.setId(it.next());
					obs_inh.setType(Type.OBSERVER.toString());
					$channel_def::channel_table.add(obs_inh);
				}
			}
		}
	
		$extension.o_errors = local_errors;
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
channel_body returns [ArrayList<Error> o_errors]
	@init{
		ArrayList<Error> local_errors = new ArrayList<Error>();
		boolean was_if_defined = false;
		boolean was_time_flow_defined = false;
	}
	
	:	^(CHANNEL_BODY st=state_def? ^( FLOWS (f=flow_def
	
	{
		local_errors.addAll($f.o_errors);
		was_if_defined = was_if_defined || $f.defined_if;
		was_time_flow_defined = was_time_flow_defined || $f.defined_time;
	}	
	
	)+))
	
	{

		//check if the channel requires state and it is not defined
		if($st.o_errors == null && $reolang::global_table.requiresStateDefinition($channel_def::channel_name)) {
			local_errors.add(Error.report(ErrorType.ERROR, Error.stateDefinitionIsRequired($channel_def::channel_name),$channel_def::channel_line, $channel_def::channel_pos, $reolang::file));
		}
		
		 
		//check if the channel does not define a if flow but it is necessary
		if(! $reolang::global_table.get($channel_def::channel_name).getCondName().equals("") && ! was_if_defined) {
			local_errors.add(Error.report(ErrorType.WARNING, Error.ifFlowIsRequired($channel_def::channel_name), $channel_def::channel_line, $channel_def::channel_pos, $reolang::file));
		}
		
		//check if the channel allows for time, but never defined a timed flow
		if($reolang::global_table.get($channel_def::channel_name).getOptType() == Type.TIME && ! was_time_flow_defined) {
			local_errors.add(Error.report(ErrorType.WARNING, Error.timeFlowIsRequired($channel_def::channel_name), $channel_def::channel_line, $channel_def::channel_pos, $reolang::file));
		}
		
		local_errors.addAll(($st.o_errors == null ? new ArrayList<Error>(0) : $state_def.o_errors));
		$channel_body.o_errors = local_errors;
		
	}
	
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
state_def returns [ArrayList<Error> o_errors]
	@init{
		ArrayList<Error> local_errors = new ArrayList<Error>();
		ArrayList<String> observers_list = new ArrayList();
	}
	:	^(CHANNEL_STATE ^(STATE_REF i1=ID
	
	{
		//check existence of the symbol
		if($reolang::global_table.isDefined($i1.text) || $channel_def::channel_table.isDefined($i1.text)){
			local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($i1.text), $i1.line, $i1.pos, $reolang::file));
		}
		else {
		
			//check if the channel does not require state but state was defined... Warning!
			if(!$reolang::global_table.requiresStateDefinition($channel_def::channel_name)) {
				local_errors.add(Error.report(ErrorType.WARNING, Error.stateDefinitionIsNotRequired($channel_def::channel_name),$channel_def::channel_line, $channel_def::channel_pos, $reolang::file));
			}
			
			//Add state name to channel...
			($reolang::global_table.get($channel_def::channel_name)).setStateName($i1.text);
			
			//Add symbol to local_table
			Symbol local_symbol = new Symbol();
			local_symbol.setId($i1.text);
			local_symbol.setLine($i1.line);
			local_symbol.setPosition($i1.pos);
			local_symbol.setType(Type.STATE.toString());
			$channel_def::channel_table.add(local_symbol);
			 
		}
	}
	
	) ^(STATE_OBS  (i2=ID
	
	{
		if($reolang::global_table.isDefined($i2.text) || $channel_def::channel_table.isDefined($i2.text)){
			local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($i2.text), $i2.line, $i2.pos, $reolang::file));
		}
		else {
			//Add symbol to local_table
			Symbol local_symbol = new Symbol();
			local_symbol.setId($i2.text);
			local_symbol.setLine($i2.line);
			local_symbol.setPosition($i1.pos);
			local_symbol.setType(Type.OBSERVER.toString());
			$channel_def::channel_table.add(local_symbol);
			observers_list.add($i2.text); 
		}
	}
	
	)+))
	
	{	
		$state_def.o_errors = local_errors;
		
		//Add observers to channel...
		($reolang::global_table.get($channel_def::channel_name)).setObservers(observers_list);
	}
	
	;
	
	
	
	
	
	
	
	
	
	
flow_def returns [ArrayList<Error> o_errors, boolean defined_if, boolean defined_time]
	@init {
		ArrayList<Error> local_errors = new ArrayList<Error>();
	}
	:	^(FLOW requests flow_type[$requests.o_requests] )

	{
		//check if all the requests were used as ports
		if($flow_type.o_requests.size() > 0){
			local_errors.add(Error.report(ErrorType.ERROR, Error.requestsNotActioned(), $requests.o_line, $reolang::file));
		}
		
		local_errors.addAll($requests.o_errors);
		local_errors.addAll($flow_type.o_errors);
		
		$flow_def.o_errors = local_errors; 
		$flow_def.defined_if = $flow_type.defined_if;
		$flow_def.defined_time = $flow_type.defined_time;
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
requests returns [ArrayList<Error> o_errors, ArrayList<String> o_requests, int o_line, int o_pos]
	@init{
		ArrayList<Error> local_errors = new ArrayList<Error>();
		ArrayList<String> requests_list = new ArrayList<String>();
	}
	
	:	^(REQUESTS (a=request
	
	{
		local_errors.addAll($a.o_errors);
		if(!$a.o_request_name.equals("")){
			requests_list.add($a.o_request_name);
		}
	}
	
	)+)
	
	{
		$requests.o_errors = local_errors;
		$requests.o_requests = requests_list;
		$requests.o_line = $a.o_line;
		$requests.o_pos = $a.o_pos;
	} 
	;
	
	
	
	
	
	
	
	
	
	
	
	
request returns [ArrayList<Error> o_errors, String o_request_name, int o_line, int o_pos]
	@init{
		ArrayList<Error> local_errors = new ArrayList<Error>();
		String final_name = "";
	}
	:	^(REQUEST ID )
	
	{
		final_name = $ID.text;
		
		//check if it exists -- IT MUST EXIST LOCALLY
		if(! $channel_def::channel_table.isDefined($ID.text)){
			local_errors.add(Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, $reolang::file)); 
		}
		else { //If exists...
			//check if it is a port or an observer
			if(! ($channel_def::channel_table.get($ID.text).getType().equals(Type.PORT.toString()) || $channel_def::channel_table.get($ID.text).getType().equals(Type.OBSERVER.toString()))){
				local_errors.add(Error.report(ErrorType.ERROR, Error.nameShouldBePortOrObserver($ID.text), $ID.line, $ID.pos, $reolang::file));
			}
			
			//if it is an observer, set final_name as empty string...
			if($channel_def::channel_table.isObserver($ID.text)){
				final_name = "";//$reolang::global_table.get($channel_def::channel_name).getStateName();
			} 
		}
		
		$request.o_errors = local_errors;
		$request.o_request_name = final_name;
		$request.o_line = $ID.line;
		$request.o_pos = $ID.pos;
	}
	
	|	^(REQUEST NOT_MARK ID)
	
	{
		
		final_name = $ID.text;
		
		//check if it exists -- IT MUST EXIST LOCALLY
		if(! $channel_def::channel_table.isDefined($ID.text)){
			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, $reolang::file)); 
		}
		else { //If exists...
			//check if it is an observer
			if(! $channel_def::channel_table.get($ID.text).getType().equals(Type.OBSERVER.toString())){
				local_errors.add(Error.report(ErrorType.ERROR, Error.nameShouldBeObserver($ID.text), $ID.line, $ID.pos, $reolang::file));
			}
			final_name = $reolang::global_table.get($channel_def::channel_name).getStateName();
		}
		
		
		
		$request.o_errors = local_errors;
		$request.o_request_name = final_name;
		$request.o_line = $ID.line;
		$request.o_pos = $ID.pos;
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
flow_type[ArrayList<String> i_requests] returns [ArrayList<Error> o_errors, ArrayList<String> o_requests, boolean defined_if, boolean defined_time]	
	@init {
		ArrayList<Error> local_errors = new ArrayList<Error>();
	}	
	
	:	^(FLOW_TYPE nf1=normal_flow[(ArrayList<String>)$flow_type.i_requests.clone()] (flow_operation nf2=normal_flow[(ArrayList<String>)$flow_type.i_requests.clone()])? )
	
	{	
		
		ArrayList<String> less_remaining_requests = $nf1.o_requests_remaining; 
		ArrayList<String> other_used;
		
		//remove from the smallest remaining the used ports of the other member
		if($nf2.o_requests_remaining != null){
			if($nf2.o_requests_remaining.size() < $nf1.o_requests_remaining.size()){
				less_remaining_requests = $nf2.o_requests_remaining;
				other_used = $nf1.o_requests_used;
			}
			else{
				other_used = $nf2.o_requests_used;
			}
			
			Iterator<String> it = other_used.iterator();
			while(it.hasNext()){
				less_remaining_requests.remove(it.next());
			}
		}
		
		local_errors.addAll($nf1.o_errors);
		local_errors.addAll(($nf2.o_errors == null ? new ArrayList<Error>(0): $nf2.o_errors));
		
		$flow_type.o_errors =  local_errors ;
		$flow_type.o_requests = less_remaining_requests;
		$flow_type.defined_if = $nf1.defined_if || ($nf2.o_requests_remaining != null ? nf2.defined_if : false );
		$flow_type.defined_time = $nf1.defined_time || ($nf2.o_requests_remaining != null ? nf2.defined_time : false );
		
		
	}
	
	|	^(FLOW_TYPE if_flow[$flow_type.i_requests] )
	
	{
		$flow_type.o_errors = $if_flow.o_errors;
		$flow_type.o_requests = $if_flow.o_requests;
		$flow_type.defined_if = $if_flow.defined_if;
		$flow_type.defined_time = $if_flow.defined_time;
	}
	
	;
	
	
	
	
	
	
	
	
	
	
	
	
normal_flow[ArrayList<String> i_requests] returns [ArrayList<Error> o_errors, ArrayList<String> o_requests_remaining, ArrayList<String> o_requests_used, boolean defined_if, boolean defined_time]
	@init{
		ArrayList<Error> local_errors = new ArrayList<Error>();
	}
	:	^(NORMAL_FLOW fp1=flow_point[$normal_flow.i_requests, new ArrayList(2), PortOrientation.IN] (timed[InspectionMode.REF_BY_USE])? fp2=flow_point[$fp1.o_requests_remaining, $fp1.o_requests_used, PortOrientation.OUT] )
	
	{

		
		local_errors.addAll($fp1.o_errors);
		local_errors.addAll(($timed.o_errors == null ? new ArrayList<Error>(0) : $timed.o_errors));
		local_errors.addAll($fp2.o_errors);
		$normal_flow.o_errors =  local_errors;
		
		$normal_flow.o_requests_remaining = $fp2.o_requests_remaining;
		$normal_flow.o_requests_used = $fp2.o_requests_used;
		$normal_flow.defined_if = false;
		$normal_flow.defined_time = $timed.time_value != null;
	}
	
	;
	
	
	
	
	
	
	
	
	
	
flow_point[ArrayList<String> i_requests, ArrayList<String> i_requests_used, PortOrientation i_orientation] returns [ArrayList<Error> o_errors, ArrayList<String> o_requests_remaining, ArrayList<String> o_requests_used]
	@init {
		ArrayList<Error> local_errors = new ArrayList<Error>();
	}
	:	^(FLOW_POINT ID )
	
	{
		if(!$channel_def::channel_table.isDefined($ID.text)){
			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, $reolang::file)); 
		}
		else{
			//check existence of ID in i_requests and is not a state reference
			if(! $channel_def::channel_table.isState($ID.text) && !$flow_point.i_requests.contains($ID.text)){
				local_errors.add(Error.report(ErrorType.ERROR, Error.noRequestForPort($ID.text), $ID.line, $ID.pos, $reolang::file));
			}
			else { //If exists...
				//check if ID is a STATE or PORT
				switch(i_orientation){
					case IN : {
						//If it is not an in port nor a state
						if( ( !$channel_def::channel_table.isInPort($ID.text) ) && ( !$channel_def::channel_table.isState($ID.text) ) ){
							local_errors.add(Error.report(ErrorType.ERROR, Error.requiredAPortOrState($ID.text, i_orientation), $ID.line, $ID.pos, $reolang::file));	
						}	
					} break;
					case OUT : {
						//If it is not an out port nor a state
						if( ( !$channel_def::channel_table.isOutPort($ID.text) ) && ( !$channel_def::channel_table.isState($ID.text) ) ){
							local_errors.add(Error.report(ErrorType.ERROR, Error.requiredAPortOrState($ID.text, i_orientation), $ID.line, $ID.pos, $reolang::file));	
						}
					} break;
					default : break;
				}
				
				//Remove request from list...
				$flow_point.i_requests.remove($ID.text); 
				//Add requests actioned
				$flow_point.i_requests_used.add($ID.text);
				
			}
		}		
		
		$flow_point.o_errors = local_errors;
		$flow_point.o_requests_remaining = $flow_point.i_requests;
		$flow_point.o_requests_used = $flow_point.i_requests_used;
		
		
	}
	
	| 	^(FLOW_POINT RW_NULL)
	
	{
			$flow_point.o_errors = new ArrayList<Error>(0);
			$flow_point.o_requests_remaining = $flow_point.i_requests;
			$flow_point.o_requests_used = $flow_point.i_requests_used;
	}
	;
	
	
	
	
	
	
	
	
	
	
	
flow_operation
	:	^(FLOW_OP OP_SYNC)
	;
	
	
	
	
	
	
	
	
	
	
if_flow[ArrayList<String> i_requests] returns [ArrayList<Error> o_errors, ArrayList<String> o_requests, boolean defined_if, boolean defined_time]
	@init {
		ArrayList<Error> local_errors = new ArrayList<Error>();
	}
	:	^(IF_FLOW ID ^(FLOW_TRUE ft1=flow_type[(ArrayList<String>)$if_flow.i_requests.clone()]) ^(FLOW_FALSE ft2=flow_type[(ArrayList<String>)$if_flow.i_requests.clone()]) )
	
	{
		
		//ID must exist locally
		if(! $channel_def::channel_table.isDefined($ID.text)){
			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, $reolang::file));
		}
		else {
			//ID must be a reference to a condition
			if(!$channel_def::channel_table.get($ID.text).getType().equals(Type.CONDITION.toString())){
				local_errors.add(Error.report(ErrorType.ERROR, Error.notAReferenceToConditionName($ID.text), $ID.line, $ID.pos, $reolang::file));
			}
		}
		
		local_errors.addAll($ft1.o_errors);
		local_errors.addAll($ft2.o_errors);
		
		$if_flow.o_errors =  local_errors;
		
		//set the list with less requests not fired
		$if_flow.o_requests = $ft1.o_requests.size() > $ft2.o_requests.size() ? $ft2.o_requests: $ft1.o_requests;
		
		$if_flow.defined_if = true; 
		$if_flow.defined_time = $ft1.defined_time || $ft2.defined_time; 
	}
	
	;
	








//--------------------
// PATTERNS
//--------------------








pattern_def returns [ArrayList<Error> o_errors]
	scope{
		SymbolsTable pattern_table;
		String pattern_name;
		int pattern_line;
		int pattern_pos;
	}
	@init{
		$pattern_def::pattern_table = new SymbolsTable();
		$pattern_def::pattern_name = "";
		$pattern_def::pattern_line = 0;
		$pattern_def::pattern_pos = 0;
		$reolang::actual_scope = $pattern_def::pattern_table;
		
		ArrayList<Error> local_errors = new ArrayList<Error>();
		
	}

	:	^(PATTERN pattern_signature pattern_body )

	{
		local_errors.addAll($pattern_signature.o_errors);
		local_errors.addAll($pattern_body.o_errors);
		$pattern_def.o_errors =  local_errors;
	}

	;
	
	
	
	
	
	
	
	
	
	
	
	
	
pattern_signature returns [ArrayList<Error> o_errors]
	@init {
		ArrayList<Error> local_errors = new ArrayList<Error>();
		Symbol patt_symbol = new Symbol();
	}
	
	:	^(PATTERN_SIGNATURE name=ID ^(PATTERN_PORTS (^(IN_PORTS in=ports[InspectionMode.DECLARATION, PortOrientation.IN] ))?  (^(OUT_PORTS out=ports[InspectionMode.DECLARATION, PortOrientation.OUT]))? ) )
	
	{
		//check if ID is globally declared
		if($reolang::global_table.isDefined($name.text)){
			local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($name.text), $name.line, $name.pos, $reolang::file));
		}	
		else { //if it is not declared yet...
			
			//add symbol to global table
			patt_symbol.setId($name.text);
			patt_symbol.setType(Type.PATTERN.toString());
			patt_symbol.setLine($name.line);
			patt_symbol.setPosition($name.pos);
			if($in.ports_list != null) {patt_symbol.setInArgs($in.ports_list);}
			if($out.ports_list != null) {patt_symbol.setOutArgs($out.ports_list);}	
			$reolang::global_table.add(patt_symbol);
			
			//add fields to scope definition
			$pattern_def::pattern_name = $name.text;
			$pattern_def::pattern_line = $name.line;
			$pattern_def::pattern_pos = $name.pos;
		
			
			//check if number of ports > 0
			if(patt_symbol.getNumberOfPorts() <= 0) {
				local_errors.add( Error.report(ErrorType.ERROR, Error.unauthorizedNumberOfPortsInPatterns($name.text), $name.line, $name.pos, $reolang::file));
			}
		}
		
		local_errors.addAll(($in.o_errors != null ? $in.o_errors : new ArrayList<Error>(0)));
		local_errors.addAll(($out.o_errors != null ? $out.o_errors : new ArrayList<Error>(0)));
			
		$pattern_signature.o_errors = local_errors ;
	}
	
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
pattern_body  returns [ArrayList<Error> o_errors] 
	@init {
		ArrayList<Error> local_errors = new ArrayList<Error>();
	}
	
	:	^(PATTERN_BODY pattern_declarations pattern_compositions[$pattern_declarations.access_words])
	
	{
		local_errors.addAll($pattern_declarations.o_errors);
		local_errors.addAll($pattern_compositions.o_errors);
		$pattern_body.o_errors = local_errors ;
	}
	
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
pattern_declarations returns [ArrayList<Error> o_errors, ArrayList<String> access_words]
	@init {
		ArrayList<Error> local_errors = new ArrayList<Error>();
		ArrayList<String> accesses = new ArrayList();
	}
	
	:	^(PATTERN_DECLARATIONS (declaration
	
	{
		local_errors.addAll($declaration.o_errors);
		accesses.addAll($declaration.access_words);
	}
	
	)+)
	
	{
		$pattern_declarations.o_errors = local_errors;
		$pattern_declarations.access_words = accesses;
	}
	
	;
	
	
	
	
	
	
	
	
	
	
	
	
declaration returns [ArrayList<Error> o_errors, ArrayList<String> access_words]
	@init{
		ArrayList<Error> local_errors = new ArrayList<Error>();
		ArrayList<String> accesses = new ArrayList<String>();
		ArrayList<String> ports = new ArrayList<String>();
	}
	
	:	^(DECLARATION INT reference_signature ID)
	
	{
	
		//INT should be greater than 0
		if(Integer.parseInt($INT.text) <= 0) {
			local_errors.add(Error.report(ErrorType.ERROR, Error.unauthorizedNumberOfInstancesDeclaration(), $INT.line, $INT.pos, $reolang::file));
		}
		
		//ID should not exist in a local context
		if($pattern_def::pattern_table.isDefined($ID.text)) {
			local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text), $ID.line, $ID.pos, $reolang::file));
		}
		else {
			//add the instance name to local scope
			Symbol local_symbol = new Symbol();
			local_symbol.setId($ID.text);
			local_symbol.setQuantity(Integer.parseInt($INT.text));
			local_symbol.setLine($ID.line);
			local_symbol.setPosition($ID.pos);
			local_symbol.setInArgs($reference_signature.instance_type.getInArgs());
			local_symbol.setOutArgs($reference_signature.instance_type.getOutArgs());
			local_symbol.setType($reference_signature.instance_type.getId());
			local_symbol.setOptType(Type.INSTANCE);
			$pattern_def::pattern_table.add(local_symbol);
		}
		
		
		//create list of access_words
		ports.addAll($reference_signature.instance_type.getInArgs());
		ports.addAll($reference_signature.instance_type.getOutArgs());
		 
		for (String p : ports) {
			for(int i = 1; i <= Integer.parseInt($INT.text); i++){
				accesses.add($ID.text + "\'" + i + "\'" + p);
			}
		}
		
		local_errors.addAll($reference_signature.o_errors);
		$declaration.o_errors = local_errors ;
		$declaration.access_words = accesses;
	}
	
	;
	
	
	
	
	
	

	
	
	
	
	
reference_signature returns [ArrayList<Error> o_errors, Symbol instance_type]
	@init {
		ArrayList<Error> local_errors = new ArrayList<Error>(0);
		Symbol inst;
	}
	:	^(DECLARATION_TYPE ID? channel_signature[InspectionMode.REF_BY_INSTANCE])
	
	{
		//Here we have a complete symbol that comes from channel_signature nonterminal
		//To check the errors, it is needed to inspect over the symbol structure...
	
		inst = $channel_signature.o_channel_sig;
	
		//check if the instance is a reference to a declared symbol
		if(!$reolang::global_table.isDefined(inst.getId())){
			local_errors.add(Error.report(ErrorType.ERROR, Error.nameNotDefined(inst.getId()), inst.getLine(), inst.getPosition(), $reolang::file));
		}
		else {
			
			Symbol reference = $reolang::global_table.get(inst.getId()); 
			
			//check if ID exists but no state in the symbol definition
			if($ID.text != null && !reference.hasState()){
				local_errors.add(Error.report(ErrorType.ERROR, Error.stateNOTDefined(inst.getId()), inst.getLine(), inst.getPosition(), $reolang::file));
			}
			
			//check if ID exists, symbol has state, but ID is not an observer
			if($ID.text != null && reference.hasState() && !reference.isReferenceToObserver($ID.text) ){
				local_errors.add( Error.report(ErrorType.ERROR, Error.nameShouldBeObserver($ID.text), $ID.line, $ID.pos, $reolang::file));
			}
			
			
			//check if each port used is already defined locally
			Iterator<String> it_in 	= inst.getInArgs().iterator(); 
			Iterator<String> it_out = inst.getOutArgs().iterator();
			while(it_in.hasNext()){
				String it_in_name = it_in.next();
				if($pattern_def::pattern_table.isDefined(it_in_name)){
					local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined(it_in_name), inst.getLine(), inst.getPosition(), $reolang::file));
				}
			}
			
			while(it_out.hasNext()){
				String it_out_name = it_out.next();
				if($pattern_def::pattern_table.isDefined(it_out_name)){
					local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined(it_out_name), inst.getLine(), inst.getPosition(), $reolang::file));
				}
			}
			//------------------------
			
			//check if ports are repeated ports
			if(inst.areThereReplicatedPorts()){
				local_errors.add(Error.report(ErrorType.ERROR, Error.portsAreRepeted(inst.getId()), inst.getLine(), inst.getPosition(), $reolang::file));
			}
			
			//check if the signature matches the globally declared symbol		
			local_errors.addAll(inst.isMatchForInstantiation(reference, $reolang::file));
			
		}
		
		$reference_signature.o_errors = local_errors;
		$reference_signature.instance_type = inst;	
		
	}
	 
	;
	
	
	
	
	

	
	
	
	
	
	
	
	
	
pattern_compositions [ArrayList<String> i_unused_accesses] returns [ArrayList<Error> o_errors]
	@init {
		ArrayList<Error> local_errors = new ArrayList<Error>();
		ArrayList<String> pattern_ports = new ArrayList<String>();
		pattern_ports.addAll($reolang::global_table.get($pattern_def::pattern_name).getInArgs());
		pattern_ports.addAll($reolang::global_table.get($pattern_def::pattern_name).getOutArgs());
	}
	: 	^(PATTERN_COMPOSITIONS (port_definition[$pattern_compositions.i_unused_accesses, pattern_ports]
	
	{
		$pattern_compositions.i_unused_accesses = $port_definition.o_unused_accesses;
		pattern_ports = $port_definition.o_unused_ports;
		local_errors.addAll($port_definition.o_errors);
	}
	
	)+ (join_operation[$pattern_compositions.i_unused_accesses]
	
	{
		$pattern_compositions.i_unused_accesses = $join_operation.o_unused_accesses;
		local_errors.addAll($join_operation.o_errors);
	}
	
	)+)
	
	{
		
		//check if all ports of the pattern were used
		if($port_definition.o_unused_ports.size() > 0){
			local_errors.add(Error.report(ErrorType.ERROR, Error.patternPortsWereNotDefined($port_definition.o_unused_ports, $pattern_def::pattern_name), $pattern_def::pattern_line, $pattern_def::pattern_pos, $reolang::file));
		}
		
		//check if all the accesses were used
		if($join_operation.o_unused_accesses.size() > 0){
			local_errors.add(Error.report(ErrorType.ERROR, Error.somePortsWereNotUsed($port_definition.o_unused_accesses, $pattern_def::pattern_name), $pattern_def::pattern_line, $pattern_def::pattern_pos, $reolang::file));
		}
	
		$pattern_compositions.o_errors = local_errors ;
	}
	
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
port_definition [ArrayList<String> i_unused_accesses, ArrayList<String> i_unused_ports] returns [ArrayList<Error> o_errors, ArrayList<String> o_unused_accesses, ArrayList<String> o_unused_ports]
	@init {
		ArrayList<Error> local_errors = new ArrayList<Error>();
	}
	
	:	^(PORT_DEFINITION ID port_access[$port_definition.i_unused_accesses])
	
	{
		//check if ID is a port of the pattern  
		if(!$pattern_def::pattern_table.isDefined($ID.text)){
			local_errors.add(Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, $reolang::file));
		}
		else {
			if(! $pattern_def::pattern_table.get($ID.text).getType().equals(Type.PORT.toString() ) ) {
				local_errors.add(Error.report(ErrorType.ERROR, Error.notAPortOfPattern($ID.text, $pattern_def::pattern_name), $ID.line, $ID.pos, $reolang::file));
			}
			else {
				//check the orientation of the ID port and the port accessed
				if($pattern_def::pattern_table.get($ID.text).getOrientation() != $port_access.ori) {
					local_errors.add(Error.report(ErrorType.ERROR, Error.badPortOrientationDefinition($ID.text, $pattern_def::pattern_table.get($ID.text).getOrientation(), $port_access.ori), $ID.line, $ID.pos, $reolang::file));
				}
			}
			
			//try to check & remove the port from the list of unused ports
			if(!$port_definition.i_unused_ports.remove($ID.text)){
				local_errors.add(Error.report(ErrorType.ERROR, Error.portAlreadyDefined($ID.text), $ID.line, $ID.pos, $reolang::file));
			}
		}
		
		
		
		
		local_errors.addAll($port_access.o_errors);
		$port_definition.o_errors = local_errors;
		$port_definition.o_unused_accesses = $port_definition.i_unused_accesses;
		$port_definition.o_unused_ports = $port_definition.i_unused_ports;
	}
	
	;












port_access [ArrayList<String> i_unused_accesses]returns [ArrayList<Error> o_errors, ArrayList<String> o_unused_accesses, PortOrientation ori]
	@init {
		ArrayList<Error> local_errors = new ArrayList<Error>();
		PortOrientation access_ori = null;
	}
	
	:	^(PORT_ACCESS id1=ID INT id2=ID)
	
	{
		
		//check id1 exists
		if(!$pattern_def::pattern_table.isDefined($id1.text)){
			local_errors.add(Error.report(ErrorType.ERROR, Error.nameNotDefined($id1.text), $id1.line, $id1.pos, $reolang::file));
		}
		else {
			//check id1 is reference to instance name
			if($pattern_def::pattern_table.get($id1.text).getOptType() != Type.INSTANCE ) {
				local_errors.add(Error.report(ErrorType.ERROR, Error.nameShouldBeInstance($id1.text), $id1.line, $id1.pos, $reolang::file));
			}
			
			
			//check INT is within the quantity of the instance
			if(Integer.parseInt($INT.text) > $pattern_def::pattern_table.get($id1.text).getQuantity() || Integer.parseInt($INT.text) < 0){
				local_errors.add(Error.report(ErrorType.ERROR, Error.indexOutOfBounds($INT.text), $INT.line, $INT.pos, $reolang::file));
			}
			
			//check id2 is a port of the instance
			if(! $pattern_def::pattern_table.get($id1.text).isPort($id2.text)) {
				local_errors.add(Error.report(ErrorType.ERROR, Error.nameShouldBePort($id2.text), $id2.line, $id2.pos, $reolang::file));
			}
			else {
				//get orientation of the port
				 access_ori =  $pattern_def::pattern_table.get($id1.text).isInPort($id2.text) ? PortOrientation.IN : PortOrientation.OUT ;
			}
			 
		}
		
		
		
		
		
		
		
		//try to remove access from accesses_list
		String port_access = $id1.text + "\'" + $INT.text + "\'" + $id2.text;
		if(!$port_access.i_unused_accesses.remove(port_access)) {
			local_errors.add(Error.report(ErrorType.ERROR, Error.portNotAvailable(port_access), $id1.line, $id1.pos, $reolang::file));
		}
		
		
		$port_access.ori = access_ori;
		$port_access.o_errors = local_errors;
		$port_access.o_unused_accesses = $port_access.i_unused_accesses;
		
		
	}
	
	;










	
join_operation [ArrayList<String> i_unused_accesses] returns [ArrayList<Error> o_errors, ArrayList<String> o_unused_accesses]
@init{
	ArrayList<Error> local_errors = new ArrayList<Error>();
}	
	:	^(JOIN_OP port_access_list[$join_operation.i_unused_accesses] ID)
	
	{
		//TODO
		//verify if ID is a NODE and is in the symbols table (as a node)
		//if it is -- error
		//if it is not, add to symbols table (as a node)  
		if($pattern_def::pattern_table.isDefined($ID.text)){
			local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text), $ID.line, $ID.pos, $reolang::file));
		}
		else{
			Symbol local_symbol = new Symbol();
			local_symbol.setId($ID.text);
			local_symbol.setLine($ID.line);
			local_symbol.setPosition($ID.pos);
			local_symbol.setType(Type.NODE.toString());
			$pattern_def::pattern_table.add(local_symbol);
		}
		
		local_errors.addAll($port_access_list.o_errors);
		$join_operation.o_errors = local_errors;
		$join_operation.o_unused_accesses = $port_access_list.o_unused_accesses;
	}
	
	;











	
port_access_list [ArrayList<String> i_unused_accesses] returns [ArrayList<Error> o_errors, ArrayList<String> o_unused_accesses]
 	@init {
 		ArrayList<Error> local_errors = new ArrayList<Error>();
 	}
 	
 	:	^(PORT_ACCESS_LIST (port_access[$port_access_list.i_unused_accesses]
 	
 	{
 		$port_access_list.i_unused_accesses = $port_access.o_unused_accesses;
 		local_errors.addAll($port_access.o_errors); 
 	}
 	
 	)+)
 	
 	{
 		$port_access_list.o_errors = local_errors;
 		$port_access_list.o_unused_accesses = $port_access_list.i_unused_accesses;
 	}
 	
	|	^(PORT_ACCESS_LIST RW_REMAINING)
	
	{
		$port_access_list.o_unused_accesses = new ArrayList<String>(0);
		$port_access_list.o_errors = new ArrayList<Error>(0);
	}

	;

