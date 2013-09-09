/**
 * 
 */
package pt.uminho.di.reolang.parsing.util;

/**
 * @author Nuno Oliveira
 * @date 10 de Abr de 2012
 */


public class SimpleSymbol {
	private String id;
	private Type type;
	private int offsetStart;
	private int offsetStop;
	private String file;
	private SimpleSymbolsTable scope;
	private SimpleSymbol parent;
	
	
	
	
	
	/**
	 * 
	 */
	public SimpleSymbol() {
		this.id = "";
		this.type = Type.NULL;
		this.offsetStart = -1;
		this.offsetStop = -1;
		this.file = "";
		this.scope = new SimpleSymbolsTable();
		this.parent = null;
	}



	/**
	 * @param id
	 * @param type
	 * @param line
	 * @param line_pos
	 * @param file
	 * @param scope
	 * @param parent
	 */
	public SimpleSymbol(String id, Type type, int start, int stop, String file, SimpleSymbolsTable scope, SimpleSymbol parent) {
		this.id = id;
		this.type = type;
		this.offsetStart = start;
		this.offsetStop = stop;
		this.file = file;
		this.scope = scope==null? new SimpleSymbolsTable() : scope;
		this.parent = parent;
	}
	
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the start offset
	 */
	public int getOffsetStart() {
		return offsetStart;
	}
	/**
	 * @param offset the start Offset to set
	 */
	public void setOffsetStart(int offset) {
		this.offsetStart = offset;
	}
	/**
	 * @return the stop offset
	 */
	public int getOffsetStop() {
		return offsetStop;
	}
	/**
	 * @param offset the stop offset to set
	 */
	public void setOffsetStop(int offset) {
		this.offsetStop = offset;
	}
	/**
	 * @return the file
	 */
	public String getFile() {
		return file;
	}
	/**
	 * @param file the file to set
	 */
	public void setFile(String file) {
		this.file = file;
	}
	/**
	 * @return the scope
	 */
	public SimpleSymbolsTable getScope() {
		return scope;
	}
	/**
	 * @param scope the scope to set
	 */
	public void setScope(SimpleSymbolsTable scope) {
		this.scope = scope;
	}


	/**
	 * @return the type 
	 */
	public Type getType(){
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}
	
	public SimpleSymbol getParent() {
		return parent;
	}



	public void setParent(SimpleSymbol parent) {
		this.parent = parent;
	}



	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("\nID\t").append(this.id).append("\n");
		s.append("TYPE\t").append(this.type.toString()).append("\n");
		s.append("LINE\t").append(this.offsetStart).append("\n");
		s.append("POS\t").append(this.offsetStop).append("\n");
		s.append("FILE\t").append(this.file).append("\n");
		s.append("SCOPE\t").append(this.scope.toString()).append("\n---------END SYMBOL " + this.id + " ----\n");
		
		
		return s.toString();
	}
	
	
	
}
