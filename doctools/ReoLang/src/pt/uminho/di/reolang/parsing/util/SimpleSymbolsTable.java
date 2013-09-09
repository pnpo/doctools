/**
 * 
 */
package pt.uminho.di.reolang.parsing.util;

import java.util.HashMap;

/**
 * @author Nuno Oliveira
 * @date 10 de Abr de 2012
 *
 */
public class SimpleSymbolsTable {
	private HashMap<String, SimpleSymbol> symbols;

	
	public SimpleSymbolsTable(SimpleSymbolsTable t) {
		symbols = new HashMap<String, SimpleSymbol>(t.getSymbols());
	}
	
	public SimpleSymbolsTable() {
		symbols = new HashMap<String, SimpleSymbol>();
	}

	/**
	 * @return the symbols
	 */
	public HashMap<String, SimpleSymbol> getSymbols() {
		return symbols;
	}

	/**
	 * @param symbols the symbols to set
	 */
	public void setSymbols(HashMap<String, SimpleSymbol> symbols) {
		this.symbols = symbols;
	}
	
	
	public void put(String k, SimpleSymbol v){
		this.symbols.put(k, v);
	}
	
	
	@Override
	public String toString() {
		return symbols.toString();
	}
	
	
	
}
