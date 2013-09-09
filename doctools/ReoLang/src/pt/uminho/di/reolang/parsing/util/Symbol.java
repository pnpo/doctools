/*
 * @author: Nuno Oliveira 
 */

package pt.uminho.di.reolang.parsing.util;

import java.util.ArrayList;
import java.util.Iterator;


public class Symbol {
	
	private String id;							//affects all
	private String type;						//affects all
	private String condName;					//affects channels
	private String stateName;					//affects channels
	private String extendsName;					//affects channels
	private ArrayList<String> inArgs;			//affects channels, patterns, instances
	private ArrayList<String> outArgs;			//affects channels, patterns, instances
	private ArrayList<String> condPatterns;		//affects channels
	private ArrayList<String> observers;		//affects channels
	private ArrayList<String> flowLabels;		//affects channels
	private ArrayList<Object> optDimension;		//affects channels
	private Type optType;						//affects channels
	private PortOrientation orientation;		//affects ports
	private int quantity;						//affects instances
	private int line;							//affects all
	private int position;						//affects all
	
	
	
	public Symbol() {
		this.id 			= "";
		this.type 			= "";
		this.condName		= "";
		this.stateName 		= "";
		this.extendsName	= "";
		this.inArgs 		= new ArrayList<String>(0);
		this.outArgs 		= new ArrayList<String>(0);
		this.condPatterns 	= new ArrayList<String>(0);
		this.observers 		= new ArrayList<String>(0);
		this.flowLabels		= new ArrayList<String>(0);
		this.optDimension 	= new ArrayList<Object>(0);
		this.optType 		= null;
		this.orientation 	= null;
		this.quantity 		= 0;
		this.line 			= 0;
		this.position 		= 0;
	}
	
	
	
	public Symbol(	String id, 
					String type,
					String cname,
					String sname,
					String ename,
					ArrayList<String> inArgs, 
					ArrayList<String> outArgs, 
					ArrayList<String> condPatterns, 
					ArrayList<String> observers,
					ArrayList<String> flowLabels,
					ArrayList<Object> optDimenstion,
					Type optType, 
					PortOrientation orientation,
					int quantity,
					int line,
					int position
			) {
		this.id 			= id;
		this.type 			= type;
		this.condName		= cname;
		this.stateName 		= sname;
		this.extendsName	= ename;
		this.inArgs 		= new ArrayList<String>(inArgs);
		this.outArgs 		= new ArrayList<String>(outArgs);
		this.condPatterns 	= new ArrayList<String>(condPatterns);
		this.observers 		= new ArrayList<String>(observers);
		this.flowLabels 		= new ArrayList<String>(flowLabels);
		this.optDimension 	= new ArrayList<Object>(optDimenstion);
		this.optType 		= optType;
		this.orientation 	= orientation;
		this.quantity 		= quantity;
		this.line 			= line;
		this.position 		= position;
	}


	
	
	
	

	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	/**
	 * @return the condName
	 */
	public String getCondName() {
		return condName;
	}



	/**
	 * @param condName the condName to set
	 */
	public void setCondName(String condName) {
		this.condName = condName;
	}



	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}



	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}



	/**
	 * @return the extendsName
	 */
	public String getExtendsName() {
		return extendsName;
	}



	/**
	 * @param extendsName the extendsName to set
	 */
	public void setExtendsName(String extendsName) {
		this.extendsName = extendsName;
	}



	/**
	 * @return the inArgs
	 */
	public ArrayList<String> getInArgs() {
		return inArgs;
	}
	/**
	 * @param inArgs the inArgs to set
	 */
	public void setInArgs(ArrayList<String> inArgs) {
		inArgs.trimToSize();
		this.inArgs = inArgs;
	}
	
	/**
	 * @return the outArgs
	 */
	public ArrayList<String> getOutArgs() {
		return outArgs;
	}
	/**
	 * @param outArgs the outArgs to set
	 */
	public void setOutArgs(ArrayList<String> outArgs) {
		outArgs.trimToSize();
		this.outArgs = outArgs;
	}
	
	/**
	 * @return the condPatterns
	 */
	public ArrayList<String> getCondPatterns() {
		return condPatterns;
	}
	/**
	 * @param condPatterns the condPatterns to set
	 */
	public void setCondPatterns(ArrayList<String> condPatterns) {
		condPatterns.trimToSize();
		this.condPatterns = condPatterns;
	}
	
	/**
	 * @return the observers
	 */
	public ArrayList<String> getObservers() {
		return observers;
	}
	/**
	 * @param observers the observers to set
	 */
	public void setObservers(ArrayList<String> observers) {
		observers.trimToSize();
		this.observers = observers;
	}
	
	
	
	
	
	/**
	 * @return the flowLabels
	 */
	public ArrayList<String> getFlowLabels() {
		return flowLabels;
	}



	/**
	 * @param flowLabels the flowLabels to set
	 */
	public void setFlowLabels(ArrayList<String> flowLabels) {
		this.flowLabels = flowLabels;
	}



	/**
	 * @return the optType
	 */
	public Type getOptType() {
		return optType;
	}
	/**
	 * @param optType the optType to set
	 */
	public void setOptType(Type optType) {
		this.optType = optType;
	}
	
	
	/**
	 * @return the optDimension
	 */
	public ArrayList<Object> getOptDimension() {
		return optDimension;
	}
	/**
	 * @param optDimension the optDimension to set
	 */
	public void setOptDimension(ArrayList<Object> optDimension) {
		optDimension.trimToSize();
		this.optDimension = optDimension;
	}
	
	
	/**
	 * @return the orientation
	 */
	public PortOrientation getOrientation() {
		return orientation;
	}
	/**
	 * @param orientation the orientation to set
	 */
	public void setOrientation(PortOrientation orientation) {
		this.orientation = orientation;
	}
	
	
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	/**
	 * @return the line
	 */
	public int getLine() {
		return line;
	}
	/**
	 * @param line the line to set
	 */
	public void setLine(int line) {
		this.line = line;
	}
	
	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}
	
	
	
	//// SEMANTIC ANALYSIS
	
	
	/**
	 * @param port the id/name of a port
	 * @return true if the given ID is an in port 
	 */
	public boolean isInPort(String port){
		return this.inArgs == null ? false : this.inArgs.contains(port);	
	}
	
	
	/**
	 * @param port the id/name of a port
	 * @return true if the given ID is an out port 
	 */
	public boolean isOutPort(String port){
		return this.outArgs == null ? false : this.outArgs.contains(port);	
	}
	
	
	/**
	 * @param port the id/name of a port
	 * @return true if the given ID is a port of this symbol 
	 */
	public boolean isPort(String port){
		return this.isInPort(port) || this.isOutPort(port);
	}
	
	
	/**
	 * @return the number of ports in total 
	 */
	public int getNumberOfPorts(){
		return ((this.inArgs == null ? 0 : this.inArgs.size()) + (this.outArgs == null ? 0 : this.outArgs.size()));	
	}
	
	
	/**
	 * 
	 * @return the number of wildcards, '_', in the symbol 
	 */
	public int getNumberOfWildcardsInPatterns() {
		int n_wildcards = 0; 
		
		Iterator<String> it = this.condPatterns.iterator();
		while(it.hasNext()){
			String pat = it.next();
			if(pat.equals("_")){
				n_wildcards++;
			}
		}
		
		return n_wildcards;
	}
	
	
	
	/**
	 * @return true if there is any out port in the in port sets  
	 */
	public boolean areThereReplicatedPorts(){
		String elem;
		boolean found_replicated = false;
		if(this.inArgs != null && this.outArgs != null ){
			Iterator<String> iter = this.outArgs.iterator();
			while(iter.hasNext() && !found_replicated){
				elem = iter.next();
				found_replicated = this.inArgs.contains(elem);
			}
		}	
		
		return found_replicated;
		
	}
	
	
	
	/**
	 * 
	 * @return true if the state is needed to be defined
	 */
	public boolean requiresState(){
		return this.optType == Type.STRUCTURE && this.stateName.equals("");
	}
	
	
	/**
	 * 
	 * @return true if the state is defined
	 */
	public boolean hasState(){
		return this.optType == Type.STRUCTURE && !this.stateName.equals("");
	}
	
	
	
	/**
	 * 
	 * @param id the name to check if it is an observer of the symbol  
	 * @return true if id is an observer of the symbol
	 */
	public boolean isReferenceToObserver(String id){
		return this.getObservers().contains(id);
	}
	
	
	
	
	/**
	 * This method checks if the present symbol may extend the given symbol
	 * Several reasons may invalidate such possibility... here they are:
	 * . symbols must be channels;
	 * . symbols must have the same number of in and out ports
	 * . the symbols must have optType equal (sync and async incompatibility: 
	 *   a sync channel cannot extend an async, and vice versa)
	 * . if the type is structured, the number of dimensions must be the same
	 * . if condition is present, it must be present in both and the number of 
	 *   patterns should be the same
	 * 
	 * @param base the symbol (must be channel) to be extended
	 * @param file the name of the file where the match is being performed
	 * @return true if this symbol may extend the given symbol
	 */
	public ArrayList<Error> isMatchForExtension(Symbol base, String file){
		ArrayList<Error> errors = new ArrayList<Error>();
		//type channel?
		if(!this.type.equals(Type.CHANNEL.toString()) && !base.getType().equals(Type.CHANNEL.toString())){
			errors.add(Error.report(ErrorType.ERROR, Error.incompatibleTypesForExtension(this.id, base.getId()), this.line, this.position, file));
		}
		
		//number of in ports?
		if(this.inArgs.size() != base.getInArgs().size()){
			errors.add(Error.report(ErrorType.ERROR, Error.incompatibleNumberOfPorts(base.getId(), base.getInArgs().size(), PortOrientation.IN), this.line, this.position, file));
		}
		
		// number of out ports?
		if(this.outArgs.size() != base.getOutArgs().size()){
			errors.add(Error.report(ErrorType.ERROR, Error.incompatibleNumberOfPorts(base.getId(), base.getOutArgs().size(), PortOrientation.OUT), this.line, this.position, file));
		}
		
		//optType equal?
		if(this.optType != base.getOptType()) {
			errors.add(Error.report(ErrorType.ERROR, Error.incompatibleSubTypesForExtension(this.id, base.getId(), this.optType, base.getOptType()), this.line, this.position, file));
		}
		else { 
			//if type is equal and is strucure... dimension equal?
			if(this.optType == Type.STRUCTURE && this.optDimension.size() != base.getOptDimension().size()){
				errors.add(Error.report(ErrorType.ERROR, Error.incompatibleStructureDimensions(this.id, base.getId()), this.line, this.position, file));
			}
		}
		
		// one is conditioned and the other is not?
		if((this.condName.equals("") && !base.getCondName().equals("")) || (! this.condName.equals("") && base.getCondName().equals(""))){
			errors.add(Error.report(ErrorType.ERROR, Error.incompatibleConditionedExtension(this.id, base.getId()), this.line, this.position, file));
		}
		
		//both conditioned... the patterns are the same?
		if(!this.condName.equals("") && !base.getCondName().equals("")) {
			//is there a wildcard?
			if((this.condPatterns.size() != base.getCondPatterns().size()) && !(this.condPatterns.contains("_") || base.getCondPatterns().contains("_"))){
				errors.add(Error.report(ErrorType.ERROR, Error.incompatibleConditionPatternsNumber(this.id, base.getId()), this.line, this.position, file));
			}
			else {
				//there is wildcards but the number of wildcards in instance is bigger than that in the declaration
				if(this.getNumberOfWildcardsInPatterns() > base.getNumberOfWildcardsInPatterns()) {
					errors.add(Error.report(ErrorType.ERROR, Error.incompatibleConditionPatternsNumber(this.id, base.getId()), this.line, this.position, file));
				}
				//there is no wildcard? then check the pattern names... 
				if(!(this.condPatterns.contains("_") || base.getCondPatterns().contains("_"))){
					boolean error_found = false;
					Iterator<String> it1 = this.condPatterns.iterator();
					Iterator<String> it2 = base.getCondPatterns().iterator();
					while(it1.hasNext() && !error_found){
						String p1, p2;
						p1 = it1.next();
						p2 = it2.next();
						if(!p1.equals(p2)){
							errors.add(Error.report(ErrorType.ERROR, Error.incompatibleConditionPatternsNames(this.id, base.getId()), this.line, this.position, file));
							error_found = true;
						}					
					}
				}
			}
		}
		
		return errors;
	}
	
	
	/**
	 * A symbol is a match for instantiation if it has exactly the same 
	 * structure and definitions of the previously declared symbol to which
	 * it refers to.
	 * . The number of in ports must be the same
	 * . The number of out ports must be the same
	 * . The name of the patter must be the same, if existing
	 * . If condition is present, it must be present in both and the number of 
	 *   patterns should be the same
	 * . The optional type must be the same
	 * . If the optType is TIME, the dimension used should be numeric
	 * . IF the optType is STRUCTURE the dimensions should be all ids (unbounded) or all numerics (bounded)  
	 * 
	 * @param declared the symbol (pattern/channel) that will be instantiated  
	 * @param file the name of the file where the match is being performed 
	 * @return a string with the errors generated
	 */
	public ArrayList<Error> isMatchForInstantiation(Symbol declared, String file) {
		ArrayList<Error> errors = new ArrayList<Error>();
		
		//the number of in ports must be the same
		if(this.inArgs.size() != declared.getInArgs().size()){
			errors.add(Error.report(ErrorType.ERROR, Error.incompatibleNumberOfPorts(declared.getId(), declared.getInArgs().size(), PortOrientation.IN), this.line, this.position, file));
		}
		
		//the number of out ports must be the same
		if(this.outArgs.size() != declared.getOutArgs().size()){
			errors.add(Error.report(ErrorType.ERROR, Error.incompatibleNumberOfPorts(declared.getId(), declared.getInArgs().size(), PortOrientation.OUT), this.line, this.position, file));
		}
		
		
		// one is conditioned and the other is not?
		if((this.condName.equals("") && !declared.getCondName().equals("")) || (! this.condName.equals("") && declared.getCondName().equals(""))){
			errors.add(Error.report(ErrorType.ERROR, Error.incompatibleConditionedInstance(declared.getId()), this.line, this.position, file));
		}
		
		//both conditioned... the patterns are the same?
		if(!this.condName.equals("") && !declared.getCondName().equals("")) {
			//no wildcards and diferent number of patterns?
			if((this.condPatterns.size() != declared.getCondPatterns().size()) && !(this.condPatterns.contains("_") || declared.getCondPatterns().contains("_"))){
				errors.add(Error.report(ErrorType.ERROR, Error.incompatibleConditionPatternsNumberInstance(declared.getId()), this.line, this.position, file));
			}
			else {
				//there is wildcards but the number of wildcards in instance is bigger than that in the declaration
				if(this.getNumberOfWildcardsInPatterns() > declared.getNumberOfWildcardsInPatterns()) {
					errors.add(Error.report(ErrorType.ERROR, Error.incompatibleConditionPatternsNumberInstance(declared.getId()), this.line, this.position, file));
				}
				//there is no wildcard? then check the pattern names... 
				if(!(this.condPatterns.contains("_") || declared.getCondPatterns().contains("_"))){
					boolean error_found = false;
					Iterator<String> it1 = this.condPatterns.iterator();
					Iterator<String> it2 = declared.getCondPatterns().iterator();
					while(it1.hasNext() && !error_found){
						String p1, p2;
						p1 = it1.next();
						p2 = it2.next();
						if(!p1.equals(p2)){
							errors.add(Error.report(ErrorType.ERROR, Error.incompatibleConditionPatternsNamesInstance(declared.getId(), p1), this.line, this.position, file));
							error_found = true;
						}					
					}
				}
			}
		}
		
		//the subtypes are different
		if(this.optType != declared.getOptType()){
			errors.add(Error.report(ErrorType.ERROR, Error.incompatibleSubTypesForInstance(declared.getId(), declared.getType(), declared.getOptType(), this.optType), this.line, this.position, file));
		}
		else { // if they are equal
			//if is not a pattern reference
			if(!declared.getType().equals(Type.PATTERN.toString())){
				//if they are a timed channel
				if(declared.getOptType() != null){
					switch(declared.getOptType()){
						case TIME : {
							//if the instance is not a int
							if(!(this.optDimension.get(0) instanceof Integer)){
								errors.add(Error.report(ErrorType.ERROR, Error.concreteDimensionIsRequired(), this.line, this.position, file));
							} 
							else { //if it is a int
								//if it is not equal to the declared...
								if(declared.getOptDimension().get(0) instanceof Integer && !((Integer)declared.getOptDimension().get(0)).equals((Integer) this.optDimension.get(0)) ){
									errors.add(Error.report(ErrorType.ERROR, Error.incompatibleTimeDimension(declared.getId()), this.line, this.position, file));
								}
							}
						} break;
						
						case STRUCTURE : {
							//if the number of dimensions is different
							if( this.getOptDimension().size() != declared.getOptDimension().size()){
								errors.add(Error.report(ErrorType.ERROR, Error.incompatibleNumberOfDimensions(declared.getId()), this.line, this.position, file));
							} 
							else { // if the dims number is the same
								Iterator<Object> it1 = this.optDimension.iterator();
								Iterator<Object> it2 = declared.getOptDimension().iterator();
								boolean error_found = false;
								String actual_type = "";
								String previous_type = "";
								int it = 0;
								while(it1.hasNext() && it2.hasNext() && !error_found){
									Object ob1 = it1.next();
									Object ob2 = it2.next();
									//check if all dimensions are of the same type
									if(it!=0){
										actual_type = ob1.getClass().toString();
										if(!actual_type.equals(previous_type)){
											errors.add(Error.report(ErrorType.ERROR, Error.unauthorizedMixedDimensions(), this.line, this.position, file));
											error_found = true;
										}
										else {
											previous_type = actual_type;
										}
									}
									else {
										previous_type = ob1.getClass().toString();
									}
									it++;
									
									//if the dimensions are different and the declared is Integer
									if( !ob1.equals(ob2) && (ob2 instanceof Integer)){
										errors.add(Error.report(ErrorType.ERROR, Error.incompatibleDimension(declared.getId(), ob1), this.line, this.position, file));
										error_found = true;
									}
									else { //if the dimensions are the same and the declared is string
										if((ob2 instanceof String) && (ob1 instanceof String) && !ob1.equals(ob2)){
											errors.add(Error.report(ErrorType.ERROR, Error.incompatibleNamesOfDimension(declared.getId(), (String)ob1), this.line, this.position, file));
										}
									}
								}
							}
						} break;
						
						default : break;
					}
				}
				
			}
		}
		
		
		
		return errors;
	}

	
	
	
	
	
	



	////// UTILITIES
	
	
	
	/**
	 * @return the formated String
	 */
	public String toString(){
		String res = "";
		res += (!this.id.equals("")) ? "ID		" + this.id: "";
		res += (!this.type.equals("")) ? "\nTYPE		" + this.type : "";
		res += (!this.extendsName.equals("")) ? "\nEXTENDS		" + this.extendsName : "";
		res += this.inArgs.size()>0 ? "\nIN_ARGS		" + this.inArgs : ""; 	
		res += this.outArgs.size()>0 ? "\nOUT_ARGS	" + this.outArgs : "";
		res += (!this.condName.equals("")) ? "\nCOND_NAME	" + this.condName : "";
		res += this.condPatterns.size()>0 ? "\nCOND_PATT	" + this.condPatterns : "";
		res += (! this.stateName.equals("")) ? "\nSTATE_NAME	" + this.stateName : "";
		res += this.observers.size()>0 ? "\nOBS		" + this.observers : "";
		res += this.flowLabels.size()>0 ? "\nFlows		" + this.flowLabels : "";
		res += this.optDimension.size()>0 ? "\nDIMENSION	" + this.optDimension : ""; 	
		res += this.optType != null ? "\nOPT_TYPE	" + this.optType.toString() : ""; 		
		res += this.orientation != null ? "\nORIEN		" + this.orientation.toString() : ""; 	
		res += this.quantity != 0? "\nQUANTITY	" + this.quantity : ""; 		
		res += this.line != 0 ? "\nLINE		" + this.line : ""; 			
		res += this.position!= 0 ? "\nPOS		" + this.position : "";
		res += "\n---------------------------\n";
		
		return res; 
	} 
	
	
	
	
	
}
