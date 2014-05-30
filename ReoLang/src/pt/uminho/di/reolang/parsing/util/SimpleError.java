package pt.uminho.di.reolang.parsing.util;

/**
 * @author Flávio Rodrigues
 *
 */

import java.text.*;
import java.util.Date;

public class SimpleError {
	
	public static SimpleError report (ErrorType type, String message, int line, int column)
    {
		return new SimpleError(type, message, line, column);
    }


    public static SimpleError report (ErrorType type, String message, int line)
    {
    	return new SimpleError(type, message, line, 0);
    }
    
    
    public static SimpleError report (ErrorType type, String message)
    {
    	return new SimpleError(type, message, 0, 0);
    }
  
    /*
    public static SimpleError report (ErrorType type, String message, boolean ofSystem)
    {
    	return new SimpleError(type, message);
    }
    */
  
    
    
    
    
    
    //****************ERROR/WARNING MESSAGES TEMPLATES:
    /**
     * @param id the name of the variable being redefined
     * @return string with a message
     */
    public static String nameAlreadyDefined(String id, int line, int pos){
    	return "Name '" + id + "' is already defined at line " + line + ":" + pos + "!";
    }
    
    /**
     * @param id the name of the variable not yet defined
     * @return string with a message
     */
    public static String nameNotDefined(String id){
    	return "Name '" + id + "' is not previously defined!";
    }
    
    public static String recNotDefined(String id){
    	return "Reconfiguration '" + id + "' is not previously defined!";
    }
    
    public static String patternNotDefined(String id){
    	return "Pattern '" + id + "' is not previously defined!";
    }
    
    public static String patternAlreadyDefined(String id){
    	return "Pattern '" + id + "' is previously defined!";
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
    
    public static String fileDoesNotExist(String file_path){
    	return "File '" + file_path + "' does not exist!";
    }
    
    public static String invalidFile(String file_path){
    	return "File '" + file_path + "' is not valid (only CooPLa and ReCooPLa files are accepted)!";
    }
    
    
    //****************INSTANCE PART****************//
    
    private String message;
    private ErrorType type;
    private int line;
    private int position;
    private String time_stamp;
    
    
    public SimpleError() { }
    
    public SimpleError(ErrorType type, String message, int line, int column) {
    	this.setMessage(message);
    	this.setType(type);
    	this.setLine(line);
    	this.setPosition(column);
    	
    	DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
    	Date date = new Date();
    	this.setTime_stamp(formatter.format(date.getTime()));
    }
	
    public SimpleError(ErrorType type, String full_message) {
    	
    	this.setFieldsFromFullMessage(full_message); //set fields 'message', 'line' and 'column'
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

	
	
	
	
	
	//****************UTILITIES****************//
	
	public String toString(){
		
		return 
		"< " + this.time_stamp + " > " + this.type.toString() + " line " + this.line + ":" + this.position + " -> " + this.message +  "\n"
		;
	}

	
	
	
	
	
	
	
	//****************PRIVATE****************//
	
	/**
     * This method processes the full formatted message
     * and sets the following fields:
     * . line
     * . position
     * . message 
     * 
     * @param full_message a formatted message of type:
     * (PATH_TO_FILE)? line LINE:COLUMN MESSAGE
     * 
     */
    private void setFieldsFromFullMessage(String full_message) {
    	int idx_first_space;
    	int idx_colon;
    	
    	String remaining = full_message;
    	idx_first_space = full_message.indexOf(' ');
    	
    	String regexp = "^line [0-9]+";
    	String initial_part = full_message.substring(0,6);

    	if(!initial_part.matches(regexp)){ //if matches it is because there is a name of a file
    		//file_path = full_message.substring(0,idx_first_space);
    		
        	remaining = full_message.substring(idx_first_space + 1);
        	idx_first_space = remaining.indexOf(' ');
    	}
    	
    	remaining = remaining.substring(idx_first_space + 1);
    	idx_colon = remaining.indexOf(':');
    	this.setLine(Integer.parseInt(remaining.substring(0,idx_colon)));
    	
    	remaining = remaining.substring(idx_colon + 1);
    	idx_first_space = remaining.indexOf(' ');
    	this.setPosition(Integer.parseInt(remaining.substring(0,idx_first_space)));
    	
    	remaining = remaining.substring(idx_first_space + 1);
    	this.setMessage(remaining + "!");
    }
}
