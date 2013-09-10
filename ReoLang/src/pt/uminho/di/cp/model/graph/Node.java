/**
 * 
 */
package pt.uminho.di.cp.model.graph;

/**
 * @author Nuno Oliveira
 *
 */
public class Node {
	private String name;
	
	public Node(){
		this.setName("");
	}
	
	public Node(String name){
		this.setName(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return this.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj!=null && obj instanceof Node && this.name.equals(((Node) obj).getName());
	}
	
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	
}
