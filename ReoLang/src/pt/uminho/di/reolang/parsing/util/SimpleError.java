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
    	return "Name '" + id + "' is not in the scope!";
    }
    
    
    public static String wrongDatatype(String id, String dt){
    	return "Variable '" + id + "' is not of type " + dt + "!";
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
	
}
