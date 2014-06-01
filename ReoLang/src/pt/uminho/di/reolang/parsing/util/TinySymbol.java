package pt.uminho.di.reolang.parsing.util;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class TinySymbol {
	private String id;
	private List<Type> datatype;	//pattern, channel, name, node, set, triple, pair
	private Type classType; 		//reconfig, arg, var 
	private int line;
	private int position;
	private String file;
	private List<TinySymbolsTable> scopes;
	//private TinySymbolsTable main_scope;			//scope 1 (main)
	//private List<TinySymbolsTable> sub_scopes;	//functions scopes
	
	
	
	
	public TinySymbol(String id, List<Type> datatype, Type classType,
			int line, int position, String file, List<TinySymbolsTable> scopes) {
		super();
		this.id = id;
		this.datatype = datatype;
		this.classType = classType;
		this.line = line;
		this.position = position;
		this.file = file;
		this.scopes = scopes;
	}
	
	
	
	public TinySymbol() {
		super();
		this.id = "";
		this.datatype = null;
		this.classType = null;
		this.line = 0;
		this.position = 0;
		this.file = "";
		this.scopes = new ArrayList<TinySymbolsTable>();
	}



	public TinySymbol(TinySymbol s) {
		this.id = s.getId();
		this.datatype = s.getDataType();
		this.classType = s.getClassType();
		this.line = s.getLine();
		this.position = s.getPosition();
		this.file = s.getFile();
		this.scopes = new ArrayList<TinySymbolsTable>(s.getScopes());
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



	public String getFile() {
		return file;
	}



	public void setFile(String file) {
		this.file = file;
	}
	
	
	
	public List<TinySymbolsTable> getScopes() {
		return scopes;
	}



	public void setScopes(List<TinySymbolsTable> scopes) {
		this.scopes = scopes;
	}
	
	
	public void addScopes(TinySymbolsTable main_scope, List<TinySymbolsTable> sub_scopes) {
		List<TinySymbolsTable> s = new ArrayList<TinySymbolsTable>(sub_scopes);
		s.add(0, main_scope);
		
		for (TinySymbolsTable forall : sub_scopes){
			int scope_id = forall.getScopeRel().fst();
			s.set(scope_id, forall);
		}
		this.scopes.addAll(s);
	}

	
	public void removeRepeatedIds(){		
		List<TinySymbolsTable> scopes = this.getScopes();
		Collections.reverse(scopes);	//last to first
		for (TinySymbolsTable scope : scopes){

			List<TinySymbol> to_remove = new ArrayList<TinySymbol>();
			
			Collection<TinySymbol> all_symbols = scope.getSymbols().values();
			for (TinySymbol symbol : all_symbols){
				
				int scope_id = scope.getScopeRel().fst();
				String symbol_id = symbol.getId();
				
				List<TinySymbolsTable> parent_scopes = new ArrayList<TinySymbolsTable>();
				for (TinySymbolsTable s : scopes){
					Pair<Integer, Integer> scope_relation = s.getScopeRel();
					if( scope_relation.fst().equals(scope_id) ){
						parent_scopes.add(s);
						scope_id = scope_relation.snd();
					}
				}
				
				parent_scopes.remove(0); //remove self_scope					
				for (TinySymbolsTable parent : parent_scopes){
					if (parent.containsSymbol(symbol_id)){
						TinySymbol parent_symbol = parent.getSymbols().get(symbol_id);
						if ( parent_symbol.getLine() < symbol.getLine() ){
							to_remove.add(symbol);
							break;		//one parent with same symbol_id is enough
						}
					}
				}
			}

			for (TinySymbol rs : to_remove){
				scope.removeSymbol(rs);
			}
		}

		Collections.reverse(scopes);	//first to last
		//this.setScopes(scopes);
	}
	
	
	/**
	 * 
	 * @param name
	 * @param scope_id
	 * @return TinySymbol if any "parent" has symbol previously declared (checked by scope_id) with the same name
	 */
	public TinySymbol hasValue(String name, Integer scope_id){
		TinySymbol ts = null;//new TinySymbol();
		
		List<TinySymbolsTable> scopes = this.getScopes();
		Collections.reverse(scopes);	//last to first
		
		List<TinySymbolsTable> parent_scopes = new ArrayList<TinySymbolsTable>();
		for (TinySymbolsTable scope : scopes){
			Pair<Integer, Integer> scope_relation = scope.getScopeRel();
			if( scope_relation.fst().equals(scope_id) ){
				parent_scopes.add(scope);
				scope_id = scope_relation.snd();
			}
		}		
		for (TinySymbolsTable parent : parent_scopes){
			if (parent.containsSymbol(name)){
				ts = parent.getSymbols().get(name);
				break;		//one parent with same name is enough
			}
		}

		Collections.reverse(scopes);	//first to last
		return ts;
	}

	public String dataTypeToString(){
		String datatype = "";
		for (Type dt : this.getDataType()){
			datatype += "<";
			datatype += dt.toString();
		}
		for(int j = 0; j < this.getDataType().size()-1; j++) {
		    datatype += '>';
		}
		
		//remove first '<'
		return datatype.substring(1);
	}
	
	
/*	//SHORT VERSION
	@Override
	public String toString() {
		return  scopes + "\n";
	} 
*/	

	//CUSTOM toString
	@Override
	public String toString() {
		
		return  "TinySymbol -> \n\t\t(\n\t\t id: " + id + ", \n\t\t datatype: " + datatype
				+ ", \n\t\t classType: " + classType + ", \n\t\t line: " + line + 
				", \n\t\t position: " + position + ", \n\t\t file: " + file + 
				", \n\t\t scopes: " + scopes + "\n\t\t)\n\t";
		/*
		String res = "";
		res += (!this.id.equals("")) ? "ID		" + this.id: "";
		res += this.datatype.size() > 0 ? "\nDATATYPE	" + this.datatype : "";
		res += this.classType != null ? "\nCLASSTYPE	" + this.classType : "";		
		res += this.line != 0 ? "\nLINE		" + this.line : ""; 			
		res += this.position!= 0 ? "\nPOS		" + this.position : "";
		res += (!this.file.equals("")) ? "FILE		" + this.file: "";
		res += this.scopes.size() > 0 ? "\n\nSCOPES		" + this.scopes : "";
		res += "\n---------------------------\n";
		
		return res; 
		*/
	}
	
}
