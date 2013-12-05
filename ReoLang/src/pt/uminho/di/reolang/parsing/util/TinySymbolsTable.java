package pt.uminho.di.reolang.parsing.util;

import java.util.HashMap;

public class TinySymbolsTable {
	private HashMap<String, TinySymbol> symbols;
	private Pair<Integer, Integer> scope_rel; 	//relation between scopes (first integer: scope_id; second integer: parent_scope_id)

	public TinySymbolsTable (){
		this.symbols = new HashMap<String, TinySymbol>();
		this.scope_rel = new Pair<Integer, Integer>(0, 0);
	}
	
	
	
	public HashMap<String, TinySymbol> getSymbols(){
		return this.symbols;
	}
	
	
	
	public void setSymbols(HashMap<String, TinySymbol> symbols) {
		this.symbols = symbols;
	}
	
	
	
	public void addSymbol(TinySymbol ts) {
		this.symbols.put(ts.getId(), ts);
	}
	
/*
	public String toString2(){
		String res = "";
		
		for(String ch : this.symbols.keySet()) {
			res += ">> " + ch + " << " + this.symbols.get(ch) + "\n";
		}
		return res;
	}
*/


	@Override
	public String toString() {
		return "TinySymbolsTable [symbols=" + symbols + ", scope_rel="
				+ scope_rel + "]";
	}
	
	
}
