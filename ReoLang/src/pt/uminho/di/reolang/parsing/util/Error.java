
/*
 * @author Nuno Oliveira
 */


package pt.uminho.di.reolang.parsing.util;


import java.text.*;
import java.util.ArrayList;
import java.util.Date;

public class Error {
	
	public static Error report (ErrorType type, String message, int line, int column, String file_path)
    {
		return new Error(type, message, line, column, file_path);
    }


    public static Error report (ErrorType type, String message, int line, String file_path)
    {
    	return new Error(type, message, line, file_path);
    }
    
    
    public static Error report (ErrorType type, String full_message, String file_path)
    {
    	return new Error(type, full_message, file_path);
    }
  
    
    
    
    
    
    //ERROR/WARNING MESSAGES TEMPLATES:
    /**
     * @param id the name of the variable being redefined
     * @return string with a message
     */
    public static String nameAlreadyDefined(String id){
    	return "Name '" + id + "' is already defined!";
    }
    
    /**
     * @param id the name of the variable not yet defined
     * @return string with a message
     */
    public static String nameNotDefined(String id){
    	return "Name '" + id + "' is not in the scope!";
    }
    
    public static String nameConventionForDimension(String id){
    	return "By convention, name '" + id + "' should be a single capital letter!";
    }
    
    public static String unauthorizedNumberOfPortsInChannels(String id){
    	return "The number of ports in channel '" + id + "' should be exactly 2!";
    }
    
    public static String incompatibleNumberOfPorts(String id, int n_ports, PortOrientation ori){
    	return "Incampatible number of " + ori.toString() + " ports: name '" + id + "' was previously defined with '"+ n_ports +" port'!";
    }
    
    public static String incompatibleTypesForExtension(String id1, String id2){
    	return "Incompatible types for names '" + id1 + "' and '"+ id2 +"': can not extend NON-CHANNEL elements!";
    }
 
    
    public static String incompatibleSubTypesForExtension(String id1, String id2, Type t1, Type t2){
    	String type1 = "Simple", type2 = "Simple";
    	if(t1 != null){
    		switch(t1){
	    		case TIME : type1 = "Timed"; break;
	    		case STRUCTURE : type1 = "Structured" ; break;
	    		default : break;
	    	}
    	}
    	
    	if(t2 != null){
    		switch(t2){
				case TIME : type2 = "Timed"; break;
				case STRUCTURE : type2 = "Structure" ; break;
				default : break;
			}
    	}
    	
    	return "Incompatible types for channels '" + id1 + "' and '" + id2 + "': can not extend a '" + type2 +"' with a '"+ type1 +"' cahnnel!"; 
    }
    
    
    public static String incompatibleStructureDimensions(String id1, String id2){
    	return "Incompatible structure dimensions for channels '" + id1 + "' and '" + id2 + "'!";
    }
    
    
    public static String incompatibleConditionedExtension(String id1, String id2) {
    	return "Incompatible types for channels '" + id1 + "' and '" + id2 + "': can not extend a Conditioned with a non Conditioned channel (and vice-versa)!";
    } 
    
    public static String incompatibleConditionPatternsNumber(String id1, String id2) {
    	return "Incompatible number of patterns in conditions for channels '"+ id1 +"' and '" + id2 + "'!";
    }
    
    
    public static String incompatibleConditionPatternsNames(String id1, String id2) {
    	return "Incompatible name of patterns in conditions for channels '"+ id1 +"' and '" + id2 + "'!";
    }
    
    public static String stateDefinitionIsRequired(String id) {
    	return "State definition is required for channel '" + id + "'!";
    }
 
    public static String stateDefinitionIsNotRequired(String id) {
    	return "State definition is NOT required for channel '" + id + "'!";
    }
 
    public static String nameShouldBePortOrObserver(String id) {
    	return "Name '" + id + "' should refer to a PORT or an OBSERVER!";
    }
    
    public static String nameShouldBeObserver(String id) {
    	return "Name '" + id + "' should refer to an OBSERVER!";
    }
    
    public static String requestsNotActioned() {
    	return "Some requests were not actioned in the channel ports!";
    }
    
    public static String noRequestForPort(String id){
    	return "No requests were made for port '"+ id +"!'";
    }
    
    public static String requiredAPortOrState(String id, PortOrientation ori){
    	return "Name '" + id + "' must be a reference to either an "+ ori.toString() + " port or a state name!" ;
    }
    
    public static String requiredAState(String id){
    	return "Name '" + id + "' must be a reference to a state name!" ;
    }
    
    
    public static String ifFlowIsRequired(String id) {
    	return "Channel '"+ id +"' defines a pattern condition, but it is never used in a flow!";
    }
    
    
    public static String notAReferenceToConditionName(String id) {
    	return "Name '" + id + "' must be a reference to a condition in the scope!";
    }
    
    public static String nameShouldBeTime(String id) {
    	return "Name '" + id + "' should refer to TIME dimension!";
    }
    
    public static String notATimeChannel(String id) {
    	return "Channel '" + id + "' uses a timed flow, but it does not declare a time dimension!";
    }
    
    public static String notAValidTimeDimension(String value) {
    	return "Dimension '"+ value +"' differs from the declared time dimension!";
    }
    
    public static String timeFlowIsRequired(String id) {
    	return "Channel '"+ id +"' declared a time dimension, but time is never used in a flow!";
    }
    
    
    
    
    
    
    public static String unauthorizedNumberOfPortsInPatterns(String id){
    	return "The number of ports in pattern '" + id + "' should be 1 or more!";
    }
    
    public static String stateNOTDefined(String id){
    	return "Name '" + id + "' does not define a state!";
    }
    
    public static String incompatibleConditionedInstance(String id) {
    	return "Incompatible condition name used in reference to channel '" + id + "'!";
    } 
   
    public static String incompatibleConditionPatternsNumberInstance(String id) {
    	return "Incompatible number of patterns in condition used in reference to channel '"+ id +"'!";
    }
    
    public static String incompatibleConditionPatternsNamesInstance(String id, String pname) {
    	return "Incompatible pattern element '" + pname + "' used in reference to channel '" + id + "'!";
    }
    
    public static String incompatibleSubTypesForInstance(String id, String base_type, Type t1, Type t2){
    	String type1 = "Channel-Simple", type2 = "Channel-Simple";
    	
    	if(base_type.equals(Type.PATTERN.toString())){
    		type1 = base_type;
    	}
    	if(t1 != null ){
    		switch(t1){
	    		case TIME : type1 = "Channel-Timed"; break;
	    		case STRUCTURE : type1 = "Channel-Structured" ; break;
	    		default : break;
	    	}
    	}
    	
    	if(t2 != null){
    		switch(t2){
				case TIME : type2 = "Channel-Timed"; break;
				case STRUCTURE : type2 = "Channel-Structure" ; break;
				default : break;
			}
    	}
    	return "Incompatible type of symbol (" + type2 + ") used in reference to '" + id + " (" + type1 + ") '!"; 
    }
    
    
    public static String concreteDimensionIsRequired(){
    	return "A concrete dimension is required!";
    }
    
    public static String incompatibleTimeDimension(String id){
    	return "Incompatible time dimension used in reference to channel '"+ id +"'!";
    }
    
    public static String incompatibleNumberOfDimensions(String id) {
    	return "Incompatible number of structure dimensions used in reference to channel '" + id + "'!";
    }
    
    public static String unauthorizedMixedDimensions() {
    	return "Use of unauthorized mixed dimensions!";
    }
    
    public static String incompatibleDimension(String id, Object o) {
    	return "Incampatible dimension '" + o.toString() + "' used in reference to channel '" + id + "'!";
    }
    
    public static String incompatibleNamesOfDimension(String id, String o) {
    	return "Incampatible dimension name '" + o.toString() + "' used in reference to channel '" + id + "'!";
    }
    
    public static String portsAreRepeted(String id) {
    	return "There repeated ports in instance declaration of type '" + id + "'!";
    }
    
    public static String unauthorizedNumberOfInstancesDeclaration(){
    	return "The number of instances must be greater than 0!";
    }
    
    public static String patternPortsWereNotDefined(ArrayList<String> ports, String pat) {
    	return "The following ports were not defined: " + ports + " for pattern '" + pat + "'!";
    }
    
    public static String somePortsWereNotUsed(ArrayList<String> accesses, String pat) {
    	return "The following ports were not used: " + accesses+ " in pattern '" + pat + "'!";
    }
    
    public static String notAPortOfPattern(String port, String pat){
    	return "Name '" + port + "' is not a port of pattern '" + pat + "'";
    }
    
    public static String nameShouldBeInstance(String id) {
    	return "Name '" + id + "' should refer to an INSTANCE name!";
    }
    
    public static String nameShouldBePort(String id) {
    	return "Name '" + id + "' should refer to a PORT!";
    }
    
    public static String indexOutOfBounds(String idx) {
    	return "Index '" + idx + "' is out of bounds!";
    }
    
    public static String badPortOrientationDefinition(String id, PortOrientation po1, PortOrientation po2) {
    	return "Name '" + id + "' refers to an '" + po1.toString() + "' port and is being defined by a '" + (po2!=null ? po2 : "NOT DEFINED") + "' port!";
    }
    
    public static String badPortOrientationUsage(String id, PortOrientation po1) {
    	return "Port '" + id + "' should be a '" + po1.toString() + "' port!";
    }
    
    public static String portNotAvailable(String port) {
    	return "Port '" + port + "' is not available!";
    }
    
    public static String portAlreadyDefined(String port) {
    	return "Port  '" + port + "'  is already defined!";
    }
    
    public static String noMorePortsAvailable(){
    	return "No more ports available!";
    }
    
    
    
    
    public static String nameShouldBePattern(String id) {
    	return "Name '" + id + "' should refer to a PATTERN!";
    }
    
    
    
    
    public static String stochasticLabelAlreadyDefined(String label) {
    	return "Stochastic value " + label + " is already defined or not in scope !";
    }
    
    
    public static String noStochasticLabelDefined(String label, String patt) {
    	return "Stochastic label " + label + " was not defined for " + patt +"!";
    }
    
    public static String incompleteStochasticValuesList(ArrayList<String> stoch_values) {
    	boolean plural = stoch_values.size()>1;
    	return "Stochastic value" + (plural ? "s " : " ") + stoch_values + " " +(plural ? "were" : "was")+" not defined!";
    }
    
    
  //****************ERROR/WARNING MESSAGES TEMPLATES (ReCooPLa):
    /**
     * @param id the name of the variable being redefined
     * @return string with a message
     */
    public static String nameAlreadyDefined(String id, int line, int pos){
    	return "Name '" + id + "' is already defined at line " + line + ":" + pos + "!";
    }
    
    
    public static String recAlreadyDefined(String id, int line, int pos, String file_path){
		int idx = file_path.lastIndexOf('/');
		String resource = file_path.substring(idx + 1);
    	return "Name '" + id + "' is already defined at line " + line + ":" + pos + ", in file " + resource + "!";
    }
    
    
    public static String multipleMain(int line, int pos, String file_path){
		int idx = file_path.lastIndexOf('/');
		String resource = file_path.substring(idx + 1);
    	return "Multiple main reconfigurations were found. Assuming the main in file " + resource + ", at line " + line + ":" + pos + "!";
    }
    
    
    /*
    public static String nameNotDefined(String id){
    	return "Name '" + id + "' is not previously defined!";
    }
    */
    
    public static String recNotDefined(String id){
    	return "Reconfiguration '" + id + "' is not previously defined!";
    }
    
    public static String patternNotDefined(String id){
    	return "Pattern '" + id + "' is not previously defined!";
    }
    
    public static String patternAlreadyDefined(String id){
    	return "Pattern '" + id + "' is previously defined!";
    }
    
    public static String structurelessPattern(String id){
    	return "The pattern '" + id + "' is structureless!";
    }
    
    public static String wrongDatatype(String id, String dt){
    	return "Variable '" + id + "' is not of type '" + dt + "'!";
    }
    
    public static String numberOfArguments(String reconf){
    	return "Wrong number of arguments for the reconfiguration '" + reconf + "'!";
    }    
    
    public static String numberOfArguments(String type, String name){
    	return "Wrong number of arguments for the "+ type +" '" + name + "'!";
    }

    public static String invalidElements(String constructor){
    	return "The elements of " + constructor + " are not all of the same type!";
    }
    
    public static String fileDoesNotExist(){
    	return "File does not exist!";
    }
    
    public static String fileDoesNotExist(String file_path){
		int idx = file_path.lastIndexOf('/');
		String resource = file_path.substring(idx + 1);
    	return "File '" + resource + "' does not exist!";
    }
    
    public static String invalidFile(String file_path){
		int idx = file_path.lastIndexOf('/');
		String resource = file_path.substring(idx + 1);
    	return "File '" + resource + "' is not valid (only CooPLa and ReCooPLa files are accepted)!";
    }
    
    
    
    
    
    ////////////INSTANCE PART////////////
    
    private String message;
    private String resource;
    private String file_path;
    private ErrorType type;
    private int line;
    private int position;
    private String time_stamp;
    
    
    public Error() { }
    
    public Error(ErrorType type, String message, int line, int column, String file_path) {
    	this.setMessage(message);
    	this.setResource(this.retriveResourceFromFilePath(file_path));
    	this.setFilePath(file_path);
    	this.setType(type);
    	this.setLine(line);
    	this.setPosition(column);
    	
    	DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
    	Date date = new Date();
    	this.setTime_stamp(formatter.format(date.getTime()));
    }
    
    
    public Error(ErrorType type, String message, int line, String file_path) {
    	this.setMessage(message);
    	this.setResource(this.retriveResourceFromFilePath(file_path));
    	this.setFilePath(file_path);
    	this.setType(type);
    	this.setLine(line);
    	this.setPosition(0);
    	
    	DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
    	Date date = new Date();
    	this.setTime_stamp(formatter.format(date.getTime()));
    }
    
    
    public Error(ErrorType type, String full_message, String file_path) {
    	
    	this.setFieldsFromFullMessage(full_message, file_path);
    	
    	this.setType(type);
    	
    	DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
    	Date date = new Date();
    	this.setTime_stamp(formatter.format(date.getTime()));
    }
    
    
    
    /**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}


	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}


	/**
	 * @return the resource
	 */
	public String getResource() {
		return resource;
	}


	/**
	 * @param resource the resource to set
	 */
	public void setResource(String resource) {
		this.resource = resource;
	}


	/**
	 * @return the file_path
	 */
	public String getFilePath() {
		return file_path;
	}


	/**
	 * @param file_path the file_path to set
	 */
	public void setFilePath(String file_path) {
		this.file_path = file_path;
	}


	/**
	 * @return the type
	 */
	public ErrorType getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(ErrorType type) {
		this.type = type;
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


	/**
	 * @return the time_stamp
	 */
	public String getTime_stamp() {
		return time_stamp;
	}


	/**
	 * @param time_stamp the time_stamp to set
	 */
	public void setTime_stamp(String time_stamp) {
		this.time_stamp = time_stamp;
	}


	
	
	
	
	
	////// UTILITIES ///////////
	
	public String toString(){
		
		return 
		"< " + this.time_stamp + " > " + this.type.toString() + " " + this.resource + " line " + this.line + ":" + this.position + " >> " + this.message +  "\n"
		;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	///////// PRIVATE ////////////////
	
	
	
	
	
	
	/**
     * This method processes the full formatted message of type:
     * PATH_TO_FILE line LINE:COLUMN MESSAGE
     * and sets the following fields:
     * . file_path
     * . resource
     * . line
     * . position
     * . message 
     * 
     * @param full_message a formatted message of type:
     * (PATH_TO_FILE)? line LINE:COLUMN MESSAGE
     * 
     */
    private void setFieldsFromFullMessage(String full_message, String file_path) {
    	int idx_first_space;
    	int idx_colon;
    	
    	String remaining = full_message;
    	String path = file_path;
    	idx_first_space = full_message.indexOf(' ');
    	
    	String regexp = "^line [0-9]+";
    	String initial_part = full_message.substring(0,6);

    	if(!initial_part.matches(regexp)){ //if matches it is because there is a name of a file
    		path = full_message.substring(0,idx_first_space);
    		
        	remaining = full_message.substring(idx_first_space + 1);
       	 
        	idx_first_space = remaining.indexOf(' ');
    	}
    	
    	this.setFilePath(path);
    	this.setResource(retriveResourceFromFilePath(path));
    	
    	remaining = remaining.substring(idx_first_space + 1);
    	idx_colon = remaining.indexOf(':');
    	this.setLine(Integer.parseInt(remaining.substring(0,idx_colon)));
    	
    	remaining = remaining.substring(idx_colon + 1);
    	idx_first_space = remaining.indexOf(' ');
    	this.setPosition(Integer.parseInt(remaining.substring(0,idx_first_space)));
    	
    	remaining = remaining.substring(idx_first_space + 1);
    	this.setMessage(remaining + "!");
    }
    
    

    /**
     * This method retrieves the name of a file given a file path separated by '/'
     * 
     * @param file_path a path to a file separated by '/' and without whitespaces
     * @return the name of the file to which the file_path refers
     */
	private String retriveResourceFromFilePath(String file_path) {
		int idx = file_path.lastIndexOf('/');
		String resource = file_path.substring(idx + 1);
		return resource;
	}
	
}
