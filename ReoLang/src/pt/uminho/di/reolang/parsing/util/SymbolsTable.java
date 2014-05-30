/**
 * @author: Nuno Oliveira
 */

package pt.uminho.di.reolang.parsing.util;


import java.util.*;


public class SymbolsTable {
	
	private HashMap<String, Symbol> symbols;
	
	 

 

     public SymbolsTable() {
         this.symbols = new HashMap<String, Symbol>();
     }

     public SymbolsTable(HashMap<String, Symbol> st) {
         this.symbols= st;
     }

     /**
      * @param s the symbol to be added
      */
     public void add(Symbol s) {
    	 this.symbols.put(s.getId(), s);
     }
     
     /**
      * @param s the symbol to be added
      */
     public Symbol get(String s) {
    	 return this.symbols.get(s);
     }
     
     public HashMap<String, Symbol> getSymbols(){
    	 return this.symbols;
     }
     
     
     
     //// SEMANTIC ANALYSIS
     
     
     /**
      * @param id the id of the symbol to check whether it is defined
      * @return true if the symbol is already defined 
      */
     public boolean isDefined(String id) {
    	 return this.symbols.containsKey(id);
     }
     
     
     /**
 	 * @param  id the id of the symbol to check the type
 	 * @param type the type to check against
 	 * @return true if the id is not of the given type
 	 * It is assumed that the id is a reference to a symbol
 	 * @see isDefined
 	 */
 	public boolean isReferenceToType(String id, Type type){
 		Symbol s = this.symbols.get(id);
 		return s!= null ? s.getType().equals(type.toString()) : false; 
 	}
 	
 	
 	/**
 	 * @param id the id of the symbol to check the number of ports
	 * @return the number of ports in total
	 * It is assumed that the id is a reference to a symbol
 	 * @see isDefined 
	 */
	public int getNumberOfPortsOfSymbol(String id){
		Symbol s = this.symbols.get(id);
		return s!=null ? s.getNumberOfPorts() : -1;
	}
	
	
	/**
 	 * @param id the name of the symbol to check the number of in ports
	 * @return the number of in ports 
	 * It is assumed that the id is a reference to a symbol
 	 * @see isDefined 
	 */
	public int getNumberOfInPortsOfSymbol(String id){
		Symbol s = this.symbols.get(id);
		return s!=null ? s.getInArgs().size() : -1;
	}
	
	
	/**
	 * @param id the name of the symbol to check the in Ports
	 * @param port_id the name of the port to check if is an in port
	 * @return true if the port_id is an in port of the symbol with name id.
	 * It is assumed that the id is a reference to a symbol
 	 * @see isDefined
	 */
	public boolean isInPortOfSymbol(String id, String port_id){
		Symbol s = this.symbols.get(id);
		return s!=null ? s.isInPort(port_id) : false;
	}
	
	/**
	 * @param id the name of the symbol to check the out Ports
	 * @param port_id the name of the port to check if is an out port
	 * @return true if the port_id is an out port of the symbol with name id.
	 * It is assumed that the id is a reference to a symbol
 	 * @see isDefined
	 */
	public boolean isOutPortOfSymbol(String id, String port_id){
		Symbol s = this.symbols.get(id);
		return s!=null ? s.isOutPort(port_id) : false;
	}
	
	
	/**
	 * @param id the name of the symbol to check the Ports
	 * @param port_id the name of the symbol to check if is a port
	 * @return true if the port_id is a port of the symbol with name id.
	 * It is assumed that the id is a reference to a symbol
 	 * @see isDefined
	 */
	public boolean isPortOfSymbol(String id, String port_id){
		Symbol s = this.symbols.get(id);
		return s!=null ? s.isOutPort(port_id) || s.isInPort(port_id) : false;
	}
	
	
	
	
	/**
	 * @param port_id the name of the port to check if is an in port
	 * @return true if the port_id is defined as an in port.
	 * It is assumed that the id is a reference to a symbol
 	 * @see isDefined
	 */
	public boolean isInPort(String port_id){
		Symbol s = this.symbols.get(port_id);
		return s!=null ? (s.getType().equals(Type.PORT.toString()) && s.getOrientation() == PortOrientation.IN) : false; 
		
	}
	
	/**
	 * @param port_id the name of the port to check if is an out port
	 * @return true if the port_id is an out port of the symbol with name id.
	 * It is assumed that the id is a reference to a symbol
 	 * @see isDefined
	 */
	public boolean isOutPort(String port_id){
		Symbol s = this.symbols.get(port_id);
		return s!=null ? (s.getType().equals(Type.PORT.toString()) && s.getOrientation() == PortOrientation.OUT) : false;
	}
	
	
	
	
	
	
	/**
	 * 
	 * @param id the name to check if it is a port 
	 * @return true if the id refers to a port
	 */
	public boolean isPort(String id){
		Symbol s = this.symbols.get(id);
		return s!=null ? s.getType().equals(Type.PORT.toString()) : false; 
	}
	
	
	/**
	 * 
	 * @param id the name to check if is a state
	 * @return true if the id is a state
	 */
	public boolean isState(String id){
		Symbol s = this.symbols.get(id);
		return s!=null ? s.getType().equals(Type.STATE.toString()) : false;
	}
	
	
	/**
	 * 
	 * @param id the name to check if is an observer
	 * @return true if the id is an observer
	 */
	public boolean isObserver(String id){
		Symbol s = this.symbols.get(id);
		return s!=null ? s.getType().equals(Type.OBSERVER.toString()) : false;
	}
	
	
	
	
	/**
	 * @param id the symbol to check if it requires the definition of a state
	 * @return true if the symbol requires definition of state
	 */
	public boolean requiresStateDefinition(String id){
		Symbol s = this.symbols.get(id);
		return s.requiresState();
	}
	
	
 	
 	///UTILITIES
     
     /**
      * @return the string formated
      */
     public String toString() {
         String res = "";
         for (String key : this.symbols.keySet())
         {
             res += (this.symbols.get(key)).toString();
             res += "\n";
         }

         return res;
     }
	
}
