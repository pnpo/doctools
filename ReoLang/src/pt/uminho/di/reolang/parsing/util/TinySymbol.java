package pt.uminho.di.reolang.parsing.util;

import java.util.List;
import java.util.ArrayList;


public class TinySymbol {
	private String id;
	private List<Type> datatype;	//pattern, channel, name, node, set, triple, pair
	private Type classType; 		//reconfig, var, arg, func, const, proc  		//type or string
	private int line;
	private int position;
	//private List<TinySymbolsTable> scopes;
	private TinySymbolsTable main_scope;		//scope 1 (main)
	private List<TinySymbolsTable> sub_scopes;	//functions scopes
	
	
	
	
	public TinySymbol(String id, List<Type> datatype, Type classType,
			int line, int position, TinySymbolsTable main_scope, List<TinySymbolsTable> sub_scopes) {
		super();
		this.id = id;
		this.datatype = datatype;
		this.classType = classType;
		this.line = line;
		this.position = position;
		this.main_scope = main_scope;
		this.sub_scopes = sub_scopes;
	}
	
	
	
	public TinySymbol() {
		super();
		this.id = "";
		this.datatype = null;
		this.classType = null;
		this.line = 0;
		this.position = 0;
		this.main_scope = new TinySymbolsTable();
		this.sub_scopes = new ArrayList<TinySymbolsTable>();
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public List<Type> getType() {
		return datatype;
	}



	public void setType(List<Type> datatype) {
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



	public TinySymbolsTable getMainScope() {
		return main_scope;
	}



	public void setMainScope(TinySymbolsTable main_scope) {
		this.main_scope = main_scope;
	}



	public List<TinySymbolsTable> getSubScopes() {
		return sub_scopes;
	}



	public void setSubScopes(List<TinySymbolsTable> sub_scopes) {
		this.sub_scopes = sub_scopes;
	}


	

	
	@Override
	public String toString() {
		return "TinySymbol [id=" + id + ", datatype=" + datatype
				+ ", classType=" + classType + ", line=" + line + 
				", position=" + position + ", main_scope=" + main_scope + 
				", sub_scopes=" + sub_scopes + "]";
	}	
	
}
