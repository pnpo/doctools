tree grammar RL_PatternSemantics;


options{
	ASTLabelType = CommonTree;
}


@members{
	private SymbolsTable global_symbols_table;
	private String file;
}



pattern_def [String i_file, SymbolsTable i_gtable] returns [String o_errors, SymbolsTable o_gtable]
	scope{
		SymbolsTable pattern_table;
		String pattern_name;
		int pattern_line;
		int pattern_pos;
	}
	@init{
		this.global_symbols_table = $pattern_def.i_gtable;
		this.file = $pattern_def.i_file;
		$pattern_def::pattern_table = new SymbolsTable();
		$pattern_def::pattern_name = "";
		$pattern_def::pattern_line = 0;
		$pattern_def::pattern_pos = 0;
	}

	:	^(PATTERN pattern_signature pattern_body )

	{
		$pattern_def.o_errors = $pattern_signature.o_errors + $pattern_body.o_errors;
		$pattern_def.o_gtable = this.global_symbols_table;
	}

	;
	
	
	
	
	
	
	
	
	
	
	
	
	
pattern_signature returns [String o_errors]
	@init {
		String local_errors = "";
		Symbol patt_symbol = new Symbol();
	}
	
	:	^(PATTERN_SIGNATURE name=ID ^(PATTERN_PORTS (^(IN_PORTS in=ports[InspectionMode.DECLARATION, this.global_symbols_table, $pattern_def::pattern_table, PortOrientation.IN] 
	
	{
		$pattern_def::pattern_table = $in.o_scope; 
		this.global_symbols_table = $in.o_global_scope;
	} 
	
	))?  (^(OUT_PORTS out=ports[InspectionMode.DECLARATION, this.global_symbols_table, $pattern_def::pattern_table, PortOrientation.OUT] 
	
	{
		$pattern_def::pattern_table = $out.o_scope; 
		this.global_symbols_table = $out.o_global_scope;
	}
	
	))? ) )
	
	{
		//check if ID is globally declared
		if(this.global_symbols_table.isDefined($name.text)){
			local_errors += Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($name.text), $name.line, $name.pos, this.file);
		}	
		else { //if it is not declared yet...
			
			//add symbol to global table
			patt_symbol.setId($name.text);
			patt_symbol.setType(Type.PATTERN.toString());
			patt_symbol.setLine($name.line);
			patt_symbol.setPosition($name.pos);
			if($in.ports_list != null) {patt_symbol.setInArgs($in.ports_list);}
			if($out.ports_list != null) {patt_symbol.setOutArgs($out.ports_list);}	
			this.global_symbols_table.add(patt_symbol);
			
			//add fields to scope definition
			$pattern_def::pattern_name = $name.text;
			$pattern_def::pattern_line = $name.line;
			$pattern_def::pattern_pos = $name.pos;
		
			
			//check if number of ports > 0
			if(patt_symbol.getNumberOfPorts() <= 0) {
				local_errors+= Error.report(ErrorType.ERROR, Error.unauthorizedNumberOfPortsInPatterns($name.text), $name.line, $name.pos, this.file);
			}
		}
		
		
	
		$pattern_signature.o_errors = 	local_errors + 
										($in.o_errors != null ? $in.o_errors : "") +
										($out.o_errors != null ? $out.o_errors : "")
										;
	}
	
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
pattern_body  returns [String o_errors] 
	@init {
		String local_errors = "";
	}
	
	:	^(PATTERN_BODY pattern_declarations pattern_compositions[$pattern_declarations.access_words])
	
	{
		$pattern_body.o_errors = 	local_errors + 
									$pattern_declarations.o_errors + 
									$pattern_compositions.o_errors;
	}
	
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
pattern_declarations returns [String o_errors, ArrayList<String> access_words]
	@init {
		String local_errors = "";
		ArrayList<String> accesses = new ArrayList();
	}
	
	:	^(PATTERN_DECLARATIONS (declaration
	
	{
		local_errors += $declaration.o_errors;
		accesses.addAll($declaration.access_words);
	}
	
	)+)
	
	{
		$pattern_declarations.o_errors = local_errors;
		$pattern_declarations.access_words = accesses;
	}
	
	;
	
	
	
	
	
	
	
	
	
	
	
	
declaration returns [String o_errors, ArrayList<String> access_words]
	@init{
		String local_errors = "";
		ArrayList<String> accesses = new ArrayList<String>();
		ArrayList<String> ports = new ArrayList<String>();
	}
	
	:	^(DECLARATION INT reference_signature ID)
	
	{
	
		//INT should be greater than 0
		if(Integer.parseInt($INT.text) <= 0) {
			local_errors += Error.report(ErrorType.ERROR, Error.unauthorizedNumberOfInstancesDeclaration(), $INT.line, $INT.pos, this.file);
		}
		
		//ID should not exist in a local context
		if($pattern_def::pattern_table.isDefined($ID.text)) {
			local_errors += Error.report(ErrorType.ERROR, Error.nameAlreadyDefined($ID.text), $ID.line, $ID.pos, this.file);
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
			
		$declaration.o_errors = local_errors + $reference_signature.o_errors;
		$declaration.access_words = accesses;
	}
	
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
reference_signature returns [String o_errors, Symbol instance_type]
	@init {
		String local_errors = "";
		Symbol inst;
	}
	:	^(DECLARATION_TYPE ID? channel_signature[$pattern_def::pattern_table, InspectionMode.REF_BY_INSTANCE])
	
	{
		//Here we have a complete symbol that comes from channel_signature nonterminal
		//To check the errors, it is needed to inspect over the symbol structure...
	
		inst = $channel_signature.o_channel_sig;
	
		//check if the instance is a reference to a declared symbol
		if(!this.global_symbols_table.isDefined(inst.getId())){
			local_errors += Error.report(ErrorType.ERROR, Error.nameNotDefined(inst.getId()), inst.getLine(), inst.getPosition(), this.file);
		}
		else {
			
			Symbol reference = this.global_symbols_table.get(inst.getId()); 
			
			//check if ID exists but no state in the symbol definition
			if($ID.text != null && !reference.hasState()){
				local_errors += Error.report(ErrorType.ERROR, Error.stateNOTDefined(inst.getId()), inst.getLine(), inst.getPosition(), this.file);
			}
			
			//check if ID exists, symbol has state, but ID is not an observer
			if($ID.text != null && reference.hasState() && !reference.isReferenceToObserver($ID.text) ){
				local_errors += Error.report(ErrorType.ERROR, Error.nameShouldBeObserver($ID.text), $ID.line, $ID.pos, this.file);
			}
			
			
			//check if each port used is already defined locally
			Iterator<String> it_in 	= inst.getInArgs().iterator(); 
			Iterator<String> it_out = inst.getOutArgs().iterator();
			while(it_in.hasNext()){
				String it_in_name = it_in.next();
				if($pattern_def::pattern_table.isDefined(it_in_name)){
					local_errors += Error.report(ErrorType.ERROR, Error.nameAlreadyDefined(it_in_name), inst.getLine(), inst.getPosition(), this.file);
				}
			}
			
			while(it_out.hasNext()){
				String it_out_name = it_out.next();
				if($pattern_def::pattern_table.isDefined(it_out_name)){
					local_errors += Error.report(ErrorType.ERROR, Error.nameAlreadyDefined(it_out_name), inst.getLine(), inst.getPosition(), this.file);
				}
			}
			//------------------------
			
			//check if ports are repeated ports
			if(inst.areThereReplicatedPorts()){
				local_errors += Error.report(ErrorType.ERROR, Error.portsAreRepeted(inst.getId()), inst.getLine(), inst.getPosition(), this.file);
			}
			
			//check if the signature matches the globally declared symbol		
			local_errors += inst.isMatchForInstantiation(reference, this.file);
			
		}
		
		$reference_signature.o_errors = local_errors;
		$reference_signature.instance_type = inst;	
		
	}
	 
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
pattern_compositions [ArrayList<String> i_unused_accesses] returns [String o_errors]
	@init {
		String local_errors = "";
		ArrayList<String> pattern_ports = new ArrayList<String>();
		pattern_ports.addAll(this.global_symbols_table.get($pattern_def::pattern_name).getInArgs());
		pattern_ports.addAll(this.global_symbols_table.get($pattern_def::pattern_name).getOutArgs());
	}
	: 	^(PATTERN_COMPOSITIONS (port_definition[$pattern_compositions.i_unused_accesses, pattern_ports]
	
	{
		$pattern_compositions.i_unused_accesses = $port_definition.o_unused_accesses;
		pattern_ports = $port_definition.o_unused_ports;
		local_errors += $port_definition.o_errors;
	}
	
	)+ (join_operation[$pattern_compositions.i_unused_accesses]
	
	{
		$pattern_compositions.i_unused_accesses = $join_operation.o_unused_accesses;
		local_errors += $join_operation.o_errors;
	}
	
	)+)
	
	{
		
		//check if all ports of the pattern were used
		if($port_definition.o_unused_ports.size() > 0){
			local_errors += Error.report(ErrorType.ERROR, Error.patternPortsWereNotDefined($port_definition.o_unused_ports, $pattern_def::pattern_name), $pattern_def::pattern_line, $pattern_def::pattern_pos, this.file);
		}
		
		//check if all the accesses were used
		if($join_operation.o_unused_accesses.size() > 0){
			local_errors += Error.report(ErrorType.ERROR, Error.somePortsWereNotUsed($port_definition.o_unused_accesses, $pattern_def::pattern_name), $pattern_def::pattern_line, $pattern_def::pattern_pos, this.file);
		}
	
		$pattern_compositions.o_errors = local_errors ;
	}
	
	;
	
	
	
	
	
	
	
	
	
	
	
	
	
port_definition [ArrayList<String> i_unused_accesses, ArrayList<String> i_unused_ports] returns [String o_errors, ArrayList<String> o_unused_accesses, ArrayList<String> o_unused_ports]
	@init {
		String local_errors = "";
	}
	
	:	^(PORT_DEFINITION ID port_access[$port_definition.i_unused_accesses])
	
	{
		//check if ID is a port of the pattern  
		if(!$pattern_def::pattern_table.isDefined($ID.text)){
			local_errors += Error.report(ErrorType.ERROR, Error.nameNotDefined($ID.text), $ID.line, $ID.pos, this.file);
		}
		else {
			if(! $pattern_def::pattern_table.get($ID.text).getType().equals(Type.PORT.toString() ) ) {
				local_errors += Error.report(ErrorType.ERROR, Error.notAPortOfPattern($ID.text, $pattern_def::pattern_name), $ID.line, $ID.pos, this.file);
			}
			else {
				//check the orientation of the ID port and the port accessed
				if($pattern_def::pattern_table.get($ID.text).getOrientation() != $port_access.ori) {
					local_errors += Error.report(ErrorType.ERROR, Error.badPortOrientationDefinition($ID.text, $pattern_def::pattern_table.get($ID.text).getOrientation(), $port_access.ori), $ID.line, $ID.pos, this.file);
				}
			}
			
			//try to check & remove the port from the list of unused ports
			if(!$port_definition.i_unused_ports.remove($ID.text)){
				local_errors += Error.report(ErrorType.ERROR, Error.portAlreadyDefined($ID.text), $ID.line, $ID.pos, this.file);
			}
		}
		
		
		
		
	
		$port_definition.o_errors = local_errors + $port_access.o_errors;
		$port_definition.o_unused_accesses = $port_definition.i_unused_accesses;
		$port_definition.o_unused_ports = $port_definition.i_unused_ports;
	}
	
	;












port_access [ArrayList<String> i_unused_accesses]returns [String o_errors, ArrayList<String> o_unused_accesses, PortOrientation ori]
	@init {
		String local_errors = "";
		PortOrientation access_ori = null;
	}
	
	:	^(PORT_ACCESS id1=ID INT id2=ID)
	
	{
		
		//check id1 exists
		if(!$pattern_def::pattern_table.isDefined($id1.text)){
			local_errors += Error.report(ErrorType.ERROR, Error.nameNotDefined($id1.text), $id1.line, $id1.pos, this.file);
		}
		else {
			//check id1 is reference to instance name
			if($pattern_def::pattern_table.get($id1.text).getOptType() != Type.INSTANCE ) {
				local_errors += Error.report(ErrorType.ERROR, Error.nameShouldBeInstance($id1.text), $id1.line, $id1.pos, this.file);
			}
			
			
			//check INT is within the quantity of the instance
			if(Integer.parseInt($INT.text) > $pattern_def::pattern_table.get($id1.text).getQuantity() || Integer.parseInt($INT.text) < 0){
				local_errors += Error.report(ErrorType.ERROR, Error.indexOutOfBounds($INT.text), $INT.line, $INT.pos, this.file);
			}
			
			//check id2 is a port of the instance
			if(! $pattern_def::pattern_table.get($id1.text).isPort($id2.text)) {
				local_errors += Error.report(ErrorType.ERROR, Error.nameShouldBePort($id2.text), $id2.line, $id2.pos, this.file);
			}
			else {
				//get orientation of the port
				 access_ori =  $pattern_def::pattern_table.get($id1.text).isInPort($id2.text) ? PortOrientation.IN : PortOrientation.OUT ;
			}
			 
		}
		
		
		
		
		
		
		
		//try to remove access from accesses_list
		String port_access = $id1.text + "\'" + $INT.text + "\'" + $id2.text;
		if(!$port_access.i_unused_accesses.remove(port_access)) {
			local_errors += Error.report(ErrorType.ERROR, Error.portNotAvailable(port_access), $id1.line, $id1.pos, this.file);
		}
		
		
		$port_access.ori = access_ori;
		$port_access.o_errors = local_errors;
		$port_access.o_unused_accesses = $port_access.i_unused_accesses;
		
		
	}
	
	;










	
join_operation [ArrayList<String> i_unused_accesses] returns [String o_errors, ArrayList<String> o_unused_accesses]
	
	:	^(JOIN_OP port_access_list[$join_operation.i_unused_accesses])
	
	{
		$join_operation.o_errors = $port_access_list.o_errors;
		$join_operation.o_unused_accesses = $port_access_list.o_unused_accesses;
	}
	
	;











	
port_access_list [ArrayList<String> i_unused_accesses] returns [String o_errors, ArrayList<String> o_unused_accesses]
 	@init {
 		String local_errors = "";
 	}
 	
 	:	^(PORT_ACCESS_LIST (port_access[$port_access_list.i_unused_accesses]
 	
 	{
 		$port_access_list.i_unused_accesses = $port_access.o_unused_accesses;
 		local_errors += $port_access.o_errors; 
 	}
 	
 	)+)
 	
 	{
 		$port_access_list.o_errors = local_errors;
 		$port_access_list.o_unused_accesses = $port_access_list.i_unused_accesses;
 	}
 	
	|	^(PORT_ACCESS_LIST RW_REMAINING)
	
	{
		$port_access_list.o_unused_accesses = new ArrayList<String>(0);
		$port_acces	s_list.o_errors = "";
	}

	;

