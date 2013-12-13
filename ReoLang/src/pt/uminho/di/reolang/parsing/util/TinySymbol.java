package pt.uminho.di.reolang.parsing.util;

import java.util.List;
import java.util.ArrayList;


public class TinySymbol {
	private String id;
	private List<Type> datatype;	//pattern, channel, name, node, set, triple, pair
	private Type classType; 		//reconfig, arg, var 
	private int line;
	private int position;
	private List<TinySymbolsTable> scopes;
	//private TinySymbolsTable main_scope;			//scope 1 (main)
	//private List<TinySymbolsTable> sub_scopes;	//functions scopes
	
	
	
	
	public TinySymbol(String id, List<Type> datatype, Type classType,
			int line, int position, List<TinySymbolsTable> scopes) {
		super();
		this.id = id;
		this.datatype = datatype;
		this.classType = classType;
		this.line = line;
		this.position = position;
		this.scopes = scopes;
	}
	
	
	
	public TinySymbol() {
		super();
		this.id = "";
		this.datatype = null;
		this.classType = null;
		this.line = 0;
		this.position = 0;
		this.scopes = new ArrayList<TinySymbolsTable>();
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public List<Type> getDataType() {
		return datatype;
	}



	public void setDataType(List<Type> datatype) {
		this.datatype = datatype;
	}



	public Type getClassType() {
		return classType;
	}



	public void setClassType(Type classType) {
		this.classType = classType;
	}



	public int getLine() {
		return line;
	}



	public void setLine(int line) {
		this.line = line;
	}



	public int getPosition() {
		return position;
	}



	public void setPosition(int position) {
		this.position = position;
	}



	public List<TinySymbolsTable> getScopes() {
		return scopes;
	}



	public void setScopes(List<TinySymbolsTable> scopes) {
		this.scopes = scopes;
	}
	
	public void addScope(TinySymbolsTable scope) {
		this.scopes.add(scope);
	}


/*  ORIGINAL
	@Override
	public String toString() {
		return "TinySymbol [id=" + id + ", datatype=" + datatype
				+ ", classType=" + classType + ", line=" + line + 
				", position=" + position + ", scopes=" + scopes + "]";
	}
*/

	

//CUSTOM toString
	
	@Override
	public String toString() {
		return "TinySymbol -> \n\t\t(\n\t\t id: " + id + ", \n\t\t datatype: " + datatype
				+ ", \n\t\t classType: " + classType + ", \n\t\t line: " + line + 
				", \n\t\t position: " + position + ", \n\t\t scopes: " + scopes + "\n\t\t)\n\t";
	}	
	
}
