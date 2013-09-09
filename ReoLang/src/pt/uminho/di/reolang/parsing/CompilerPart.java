package pt.uminho.di.reolang.parsing;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRFileStream;


import pt.uminho.di.reolang.parsing.util.Error;

public abstract class CompilerPart {

	private String file;
	private String content;
	private ArrayList<Error> errors;
	
	public CompilerPart(){
		this.content = "";
		this.file = "";
		this.errors = new ArrayList<Error>(0);
	}
	
	public CompilerPart(String file){
		this.file = file;
		this.errors = new ArrayList<Error>(0);
		try {
			this.content = (new ANTLRFileStream(this.getFile(), "UTF8")).toString();
		} catch (IOException e) {
			//e.printStackTrace();
			this.content = "";
		}
	}
	
	public CompilerPart(String file, String content){
		this.content = content;
		this.file = file;
		this.errors = new ArrayList<Error>(0);
	}
	
	
	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
		try {
			this.content = (new ANTLRFileStream(this.getFile(), "UTF8")).toString();
		} catch (IOException e) {
			//e.printStackTrace();
			this.content = "";
		}
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the errors
	 */
	public ArrayList<Error> getErrors() {
		return errors;
	}

	/**
	 * @param errors the errors to set
	 */
	public void setErrors(ArrayList<Error> errors) {
		this.errors = errors;
	}
	
	
	
}
