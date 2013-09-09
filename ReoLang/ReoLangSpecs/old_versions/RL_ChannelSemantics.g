tree grammar RL_ChannelSemantics;

options{
	ASTLabelType = CommonTree;
}

@members{
	private SymbolsTable global_symbols_table;
	private String file;
}












channel_def [String i_file, SymbolsTable i_gtable]  returns [String o_errors, SymbolsTable o_gtable]
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
		this.global_symbols_table = $channel_def.i_gtable;
		this.file = $channel_def.i_file;
	}
		//channel signature will receive the channel_table as scope for compatibility with other refs to this nonterminal 
	:	^(CHANNEL channel_signature[$channel_def::channel_table, InspectionMode.DECLARATION] (extension)? channel_body )
	
	{
		$channel_def.o_errors = $channel_signature.o_errors + 
								($extension.o_errors == null? "" : $extension.o_errors ) + 
								$channel_body.o_errors;
		$channel_def.o_gtable = this.global_symbols_table;
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
channel_signature [SymbolsTable i_scope, InspectionMode mode]  returns [String o_errors, Symbol o_channel_sig]
	@init{
		String local_errors = "";
		Symbol sym = new Symbol(); 
	}
	
	:	^(SIGNATURE name=ID (option[$channel_signature.mode] )? ^(CHANNEL_PORTS (^(IN_PORTS in=ports[$channel_signature.mode, this.global_symbols_table, $channel_signature.i_scope, PortOrientation.IN] 
	
	{ 
		$channel_signature.i_scope = $in.o_scope; 
		this.global_symbols_table = $in.o_global_scope;
	} 
	
	))? (^(OUT_PORTS out=ports[$channel_signature.mode, this.global_symbols_table, $channel_signature.i_scope, PortOrientation.OUT] 
	
	{ 
		$channel_signature.i_scope = $out.o_scope; 
		this.global_symbols_table = $out.o_global_scope; 
	} 
	
	))?) (^(CONDITION condname=ID condition[$channel_signature.mode]))?)
	
	{
		// MODE DECLARATION
		if(mode==InspectionMode.DECLARATION){
			
			//see if there's a channel with the name in ID in the symbols table
			if(this.global_symbols_table.isDefined($name.text)){
				local_errors+= Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($name.text), $name.line, $name.pos, this.file);
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
				this.global_symbols_table.add(sym);
			}
			
			//check existence of condname in scope 
			if($condname != null && (this.global_symbols_table.isDefined($condname.text) || $channel_def::channel_table.isDefined($condname.text))){
				local_errors += Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($condname.text), $condname.line, $condname.pos, this.file);
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
				local_errors+= Error.report(ErrorType.ERROR, Error.unauthorizedNumberOfPortsInChannels($name.text), $name.line, $name.pos, this.file);
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
		
		
		$channel_signature.o_errors = local_errors + 
									  ($option.o_errors == null ? "" : $option.o_errors) + 
									  ($in.o_errors == null ? "" : $in.o_errors) +
									  ($out.o_errors == null ? "" : $out.o_errors) +
									  ($condition.o_errors == null ? "" : $condition.o_errors)
									  ;
									  
		$channel_signature.o_channel_sig = sym;
		
	}
	;


















option[InspectionMode mode] returns [String o_errors, Type optionalType, ArrayList<Object> dimensions]
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
	
	
	
	
	
	
	
	
	
	
	
	
	
timed [InspectionMode mode] returns [String o_errors, Object time_value]
	:	^(TIMED time[$timed.mode] )
	{
		$timed.o_errors = $time.o_errors;
		$timed.time_value = $time.time_value;
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
time [InspectionMode mode] returns [String o_errors, Object time_value]
	@init{String local_errors = "";}
	
	: ^(TIME ID )
	
	{
		if($time.mode==InspectionMode.DECLARATION) { 
			//check for single and capital letter
			if( ($ID.text).length() > 1 || !Character.isUpperCase(($ID.text).charAt(0)) ) {
				local_errors += Error.report(ErrorType.WARNING, Error.nameConventionForDimension($ID.text), $ID.line, $ID.pos, this.file);
			}
			//check if the ID is defined globally or locally
			if( this.global_symbols_table.isDefined($ID.text) || $channel_def::channel_table.isDefined($ID.text)){
				local_errors += Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text), $ID.line, $ID.pos, this.file);
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
		
		if($time.mode==InspectionMode.REF_BY_USE){
			
			//check if ID is declared locally
			if(!$channel_def::channel_table.isDefined($ID.text)){
				local_errors += Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, this.file);
			}
			else { //if it is declared
				
				//check if the channel allows for time
				if( this.global_symbols_table.get($channel_def::channel_name).getOptType() != Type.TIME) {
					local_errors += Error.report(ErrorType.ERROR, Error.notATimeChannel($channel_def::channel_name), $ID.line, $ID.pos, this.file);
				} 
				else {
					//check if ID is time in the channel scope
					if(! $channel_def::channel_table.get($ID.text).getType().equals(Type.TIME.toString()) ){
						local_errors += Error.report(ErrorType.ERROR, Error.nameShouldBeTime($ID.text), $ID.line, $ID.pos, this.file);
					}
				}
				
			} 
			
			
		}
		
		$time_value = $ID.text;
		$time.o_errors = local_errors;
	}
	
	| ^(TIME FLOAT )
	
	{
		// In this case we don't add to channel scope as it is a constant 
		// and is accessible via optDimension attribute of the channel
		
		
		
		if($time.mode==InspectionMode.REF_BY_USE){
			
			//check if the channel allows for time
			if( this.global_symbols_table.get($channel_def::channel_name).getOptType() != Type.TIME) {
				local_errors += Error.report(ErrorType.ERROR, Error.notATimeChannel($channel_def::channel_name), $FLOAT.line, $FLOAT.pos, this.file);
			} 
			else {
				//check if FLOAT is declared as a dimension in the channel scope
				if(! this.global_symbols_table.get($channel_def::channel_name).getOptDimension().contains(Float.parseFloat($FLOAT.text))) {
					local_errors += Error.report(ErrorType.ERROR, Error.notAValidTimeDimension($FLOAT.text), $FLOAT.line, $FLOAT.pos, this.file);	
				}
			}			
			
		}
		
		$time.o_errors = local_errors;
		$time_value = Float.parseFloat($FLOAT.text);
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
structured [InspectionMode mode ]returns [String o_errors, ArrayList<Object> dimensions]
	@init{
		String local_errors = ""; 
		ArrayList<Object>dims = new ArrayList<Object>();
		String dim_type = "";
	}
	
	:	^(STRUCTURED (structure_dimension[mode, dim_type]
	
	{
		dims.add($structure_dimension.dimension);
		local_errors += $structure_dimension.o_errors;
		dim_type = $structure_dimension.o_dim_type;
	}
	
	)+)
	
	{
		$structured.o_errors = local_errors;
		$structured.dimensions = dims; 
	}
	
	;
	
	
	
	
	
	
	
	
	
	
structure_dimension [InspectionMode mode, String i_dim_type] returns [String o_errors, Object dimension, String o_dim_type]
	@init{
		String local_errors = "";
	}
	
	: ^(DIMENSION ID )
	
	{
		if($structure_dimension.mode==InspectionMode.DECLARATION) { 
			//check for single and capital letter
			if( ($ID.text).length() > 1 || !Character.isUpperCase(($ID.text).charAt(0)) ) {
				local_errors += Error.report(ErrorType.WARNING, Error.nameConventionForDimension($ID.text), $ID.line, $ID.pos, this.file);
			}
			//check if the type is mixed
			if($structure_dimension.i_dim_type.equals("INT")){
				local_errors += Error.report(ErrorType.ERROR, Error.unauthorizedMixedDimensions(), $ID.line, $ID.pos, this.file);
			}
			
			//check if the ID is defined globally 
			if( this.global_symbols_table.isDefined($ID.text) || $channel_def::channel_table.isDefined($ID.text)){
				local_errors += Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text), $ID.line, $ID.pos, this.file);
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
		//check if the type is the same as the previous one (avoid mixed types)
		if($structure_dimension.i_dim_type.equals("STRING")){
				local_errors += Error.report(ErrorType.ERROR, Error.unauthorizedMixedDimensions(), $INT.line, $INT.pos, this.file);
			}
	
		// Don't need to add to channel scope as it is a constant and is accessible 
		// from the optDimension attribute of the channel symbol
		$structure_dimension.dimension = Integer.parseInt($INT.text);
		$structure_dimension.o_errors = local_errors;
		$structure_dimension.o_dim_type = "INT";
		
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
ports [InspectionMode mode, SymbolsTable i_global_scope, SymbolsTable i_scope, PortOrientation i_orientation] returns [String o_errors, ArrayList<String> ports_list, SymbolsTable o_scope, SymbolsTable o_global_scope]
	@init{
		ArrayList<String> port_names = new ArrayList<String>();
		String local_errors = "";
	}
	:	^(PORT (id1=ID
	
	{
		if($ports.mode == InspectionMode.DECLARATION){
			//Test if the name is in scope (global or channel/pattern -- the one that is inherited)
			// This allows to verify whether there are repeated ports...
			if($ports.i_global_scope.isDefined($id1.text) || i_scope.isDefined($id1.text)){
				local_errors += Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($id1.text), $id1.line, $id1.pos, this.file);
			}
			else {
				//Add name to the scope
				Symbol new_port_symbol = new Symbol();
				new_port_symbol.setId($id1.text);
				new_port_symbol.setType(Type.PORT.toString());
				new_port_symbol.setOrientation(i_orientation);
				new_port_symbol.setLine($id1.line);
				new_port_symbol.setPosition($id1.pos);
				i_scope.add(new_port_symbol);
			}
		}
		port_names.add($id1.text);
	}
	
	)+) 
	
	{
		$ports.o_errors = local_errors;
		$ports.ports_list = port_names;
		$ports.o_scope = $ports.i_scope;
		$ports.o_global_scope = $ports.i_global_scope;
	}
	;
	
	
	
	
	
	
	
	
	
	
	

condition [InspectionMode mode] returns [String o_errors, ArrayList<String> patterns]
	@init{
		ArrayList<String> patterns_list = new ArrayList<String>();
		String local_errors = ""; 
	}
	
	:	^(COND_ELEMENTS (ID
	
	{
		if($condition.mode == InspectionMode.DECLARATION){
			//check if the name exists in global scope
			if(this.global_symbols_table.isDefined($ID.text)){
				local_errors += Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text), $ID.line, $ID.pos, this.file);
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
extension returns [String o_errors]
	@init{
		String local_errors = "";
	}
	
	:	^(EXTENSION name=ID )
	
	{
		//If symbol does not exist...
		if(!this.global_symbols_table.isDefined($name.text)){
			local_errors += Error.report(ErrorType.ERROR, Error.nameNotDefined($name.text), $name.line, $name.pos, this.file);
		}
		else { //if it exists...
			Symbol base_symbol = this.global_symbols_table.get($name.text);
			Symbol extending_symbol = this.global_symbols_table.get($channel_def::channel_name);
			
			local_errors += extending_symbol.isMatchForExtension(base_symbol, this.file);
			
			//set the extends name in the channel symbol
			this.global_symbols_table.get($channel_def::channel_name).setExtendsName($name.text);
			
			//if the base symbol has state + obs defined, the extending symbol inherits state + obs
			if(! base_symbol.getStateName().equals("")) {
				this.global_symbols_table.get($channel_def::channel_name).setStateName(base_symbol.getStateName());
				this.global_symbols_table.get($channel_def::channel_name).setObservers(base_symbol.getObservers());
				
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
channel_body returns [String o_errors]
	@init{
		String local_errors = "";
		boolean was_if_defined = false;
		boolean was_time_flow_defined = false;
	}
	
	:	^(CHANNEL_BODY st=state_def? ^( FLOWS (f=flow_def
	
	{
		local_errors += $f.o_errors;
		was_if_defined = was_if_defined || $f.defined_if;
		was_time_flow_defined = was_time_flow_defined || $f.defined_time;
	}	
	
	)+))
	
	{

		//check if the channel requires state and it is not defined
		if($st.o_errors == null && this.global_symbols_table.requiresStateDefinition($channel_def::channel_name)) {
			local_errors += Error.report(ErrorType.ERROR, Error.stateDefinitionIsRequired($channel_def::channel_name),$channel_def::channel_line, $channel_def::channel_pos, this.file);
		}
		
		 
		//check if the channel does not define a if flow but it is necessary
		if(! this.global_symbols_table.get($channel_def::channel_name).getCondName().equals("") && ! was_if_defined) {
			local_errors += Error.report(ErrorType.WARNING, Error.ifFlowIsRequired($channel_def::channel_name), $channel_def::channel_line, $channel_def::channel_pos, this.file);
		}
		
		//check if the channel allows for time, but never defined a timed flow
		if(this.global_symbols_table.get($channel_def::channel_name).getOptType() == Type.TIME && ! was_time_flow_defined) {
			local_errors += Error.report(ErrorType.WARNING, Error.timeFlowIsRequired($channel_def::channel_name), $channel_def::channel_line, $channel_def::channel_pos, this.file);
		}
		
		
		$channel_body.o_errors = ($st.o_errors == null ? "" : $state_def.o_errors) + 
								 local_errors;
		
	}
	
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
state_def returns [String o_errors]
	@init{
		String local_errors = "";
		ArrayList<String> observers_list = new ArrayList();
	}
	:	^(CHANNEL_STATE ^(STATE_REF i1=ID
	
	{
		//check existence of the symbol
		if(this.global_symbols_table.isDefined($i1.text) || $channel_def::channel_table.isDefined($i1.text)){
			local_errors += Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($i1.text), $i1.line, $i1.pos, this.file);
		}
		else {
		
			//check if the channel does not require state but state was defined... Warning!
			if(!this.global_symbols_table.requiresStateDefinition($channel_def::channel_name)) {
				local_errors += Error.report(ErrorType.WARNING, Error.stateDefinitionIsNotRequired($channel_def::channel_name),$channel_def::channel_line, $channel_def::channel_pos, this.file);
			}
			
			//Add state name to channel...
			(this.global_symbols_table.get($channel_def::channel_name)).setStateName($i1.text);
			
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
		if(this.global_symbols_table.isDefined($i2.text) || $channel_def::channel_table.isDefined($i2.text)){
			local_errors += Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($i2.text), $i2.line, $i2.pos, this.file);
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
		(this.global_symbols_table.get($channel_def::channel_name)).setObservers(observers_list);
	}
	
	;
	
	
	
	
	
	
	
	
	
	
flow_def returns [String o_errors, boolean defined_if, boolean defined_time]
	@init {
		String local_errors = "";
	}
	:	^(FLOW requests flow_type[$requests.o_requests] )

	{
		//check if all the requests were used as ports
		if($flow_type.o_requests.size() > 0){
			local_errors += Error.report(ErrorType.ERROR, Error.requestsNotActioned(), $requests.o_line, this.file);
		}
		
		$flow_def.o_errors = $requests.o_errors + local_errors + $flow_type.o_errors;
		$flow_def.defined_if = $flow_type.defined_if;
		$flow_def.defined_time = $flow_type.defined_time;
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
requests returns [String o_errors, ArrayList<String> o_requests, int o_line, int o_pos]
	@init{
		String local_errors = "";
		ArrayList<String> requests_list = new ArrayList<String>();
	}
	
	:	^(REQUESTS (a=request
	
	{
		local_errors += $a.o_errors;
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
	
	
	
	
	
	
	
	
	
	
	
	
request returns [String o_errors, String o_request_name, int o_line, int o_pos]
	@init{
		String local_errors = "";
		String final_name = "";
	}
	:	^(REQUEST ID )
	
	{
		final_name = $ID.text;
		
		//check if it exists -- IT MUST EXIST LOCALLY
		if(! $channel_def::channel_table.isDefined($ID.text)){
			local_errors += Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, this.file); 
		}
		else { //If exists...
			//check if it is a port or an observer
			if(! ($channel_def::channel_table.get($ID.text).getType().equals(Type.PORT.toString()) || $channel_def::channel_table.get($ID.text).getType().equals(Type.OBSERVER.toString()))){
				local_errors += Error.report(ErrorType.ERROR, Error.nameShouldBePortOrObserver($ID.text), $ID.line, $ID.pos, this.file);
			}
			
			//if it is an observer, set final_name as empty string...
			if($channel_def::channel_table.isObserver($ID.text)){
				final_name = "";//this.global_symbols_table.get($channel_def::channel_name).getStateName();
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
			local_errors += Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, this.file); 
		}
		else { //If exists...
			//check if it is an observer
			if(! $channel_def::channel_table.get($ID.text).getType().equals(Type.OBSERVER.toString())){
				local_errors += Error.report(ErrorType.ERROR, Error.nameShouldBeObserver($ID.text), $ID.line, $ID.pos, this.file);
			}
			final_name = this.global_symbols_table.get($channel_def::channel_name).getStateName();
		}
		
		
		
		$request.o_errors = local_errors;
		$request.o_request_name = final_name;
		$request.o_line = $ID.line;
		$request.o_pos = $ID.pos;
	}
	;
	
	
	
	
	
	
	
	
	
	
	
	
flow_type[ArrayList<String> i_requests] returns [String o_errors, ArrayList<String> o_requests, boolean defined_if, boolean defined_time]
		
	:	^(FLOW_TYPE nf1=normal_flow[(ArrayList<String>)$flow_type.i_requests.clone()] (flow_operation nf2=normal_flow[(ArrayList<String>)$flow_type.i_requests.clone()])? )
	
	{	
		$flow_type.o_errors = $nf1.o_errors + 
							  ($nf2.o_errors == null ? "" : $nf2.o_errors)
							  ;
		
		
		
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
	
	
	
	
	
	
	
	
	
	
	
	
normal_flow[ArrayList<String> i_requests] returns [String o_errors, ArrayList<String> o_requests_remaining, ArrayList<String> o_requests_used, boolean defined_if, boolean defined_time]
	
	:	^(NORMAL_FLOW fp1=flow_point[$normal_flow.i_requests, new ArrayList(2), PortOrientation.IN] (timed[InspectionMode.REF_BY_USE])? fp2=flow_point[$fp1.o_requests_remaining, $fp1.o_requests_used, PortOrientation.OUT] )
	
	{

		
	
		$normal_flow.o_errors = $fp1.o_errors +
								($timed.o_errors == null ? "" : $timed.o_errors) +
								$fp2.o_errors
								;
		$normal_flow.o_requests_remaining = $fp2.o_requests_remaining;
		$normal_flow.o_requests_used = $fp2.o_requests_used;
		$normal_flow.defined_if = false;
		$normal_flow.defined_time = $timed.time_value != null;
	}
	
	;
	
	
	
	
	
	
	
	
	
	
flow_point[ArrayList<String> i_requests, ArrayList<String> i_requests_used, PortOrientation i_orientation] returns [String o_errors, ArrayList<String> o_requests_remaining, ArrayList<String> o_requests_used]
	@init {
		String local_errors = "";
	}
	:	^(FLOW_POINT ID )
	
	{
		//check existence of ID in i_requests and is not a state reference
		if(! $channel_def::channel_table.isState($ID.text) && !$flow_point.i_requests.contains($ID.text)){
			local_errors += Error.report(ErrorType.ERROR, Error.noRequestForPort($ID.text), $ID.line, $ID.pos, this.file);
		}
		else { //If exists...
			//check if ID is a STATE or PORT
			switch(i_orientation){
				case IN : {
					//If it is not an in port nor a state
					if( ( !$channel_def::channel_table.isInPort($ID.text) ) && ( !$channel_def::channel_table.isState($ID.text) ) ){
						local_errors += Error.report(ErrorType.ERROR, Error.requiredAPortOrState($ID.text, i_orientation), $ID.line, $ID.pos, this.file);	
					}	
				} break;
				case OUT : {
					//If it is not an out port nor a state
					if( ( !$channel_def::channel_table.isOutPort($ID.text) ) && ( !$channel_def::channel_table.isState($ID.text) ) ){
						local_errors += Error.report(ErrorType.ERROR, Error.requiredAPortOrState($ID.text, i_orientation), $ID.line, $ID.pos, this.file);	
					}
				} break;
				default : break;
			}
			
			//Remove request from list...
			$flow_point.i_requests.remove($ID.text); 
			//Add requests actioned
			$flow_point.i_requests_used.add($ID.text);
			
		}
		
		
		$flow_point.o_errors = local_errors;
		$flow_point.o_requests_remaining = $flow_point.i_requests;
		$flow_point.o_requests_used = $flow_point.i_requests_used;
		
		
	}
	
	| 	^(FLOW_POINT RW_NULL)
	
	{
			$flow_point.o_errors = "";
			$flow_point.o_requests_remaining = $flow_point.i_requests;
			$flow_point.o_requests_used = $flow_point.i_requests_used;
	}
	;
	
	
	
	
	
	
	
	
	
	
	
flow_operation
	:	^(FLOW_OP OP_SYNC)
	;
	
	
	
	
	
	
	
	
	
	
if_flow[ArrayList<String> i_requests] returns [String o_errors,ArrayList<String> o_requests, boolean defined_if, boolean defined_time]
	@init {
		String local_errors = "";
	}
	:	^(IF_FLOW ID ^(FLOW_TRUE ft1=flow_type[(ArrayList<String>)$if_flow.i_requests.clone()]) ^(FLOW_FALSE ft2=flow_type[(ArrayList<String>)$if_flow.i_requests.clone()]) )
	
	{
		
		//ID must exist locally
		if(! $channel_def::channel_table.isDefined($ID.text)){
			local_errors += Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, this.file);
		}
		else {
			//ID must be a reference to a condition
			if(!$channel_def::channel_table.get($ID.text).getType().equals(Type.CONDITION.toString())){
				local_errors += Error.report(ErrorType.ERROR, Error.notAReferenceToConditionName($ID.text), $ID.line, $ID.pos, this.file);
			}
		}
		
		
		$if_flow.o_errors = $ft1.o_errors + $ft2.o_errors; 
		
		//set the list with less requests not fired
		$if_flow.o_requests = $ft1.o_requests.size() > $ft2.o_requests.size() ? $ft2.o_requests: $ft1.o_requests;
		
		$if_flow.defined_if = true; 
		$if_flow.defined_time = $ft1.defined_time || $ft2.defined_time; 
	}
	
	;
	
	
	