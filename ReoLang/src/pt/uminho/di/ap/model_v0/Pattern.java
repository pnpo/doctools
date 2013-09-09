/**
 * 
 */
package pt.uminho.di.ap.model_v0;

import java.util.HashSet;
import java.util.Set;

import pt.uminho.di.ap.model.graph.Edge;

/**
 * @author Nuno Oliveira
 * @date 3 de Abr de 2012
 *
 */
public abstract class Pattern {
	private Set<Node> in; //in ports
	private Set<Node> out; //out ports
	private String name;
	
	public Pattern() {
		this.in = new HashSet<Node>(0);
		this.out = new HashSet<Node>(0);
		this.name = "";
	}
	
	public Pattern(Set<Node> in, Set<Node> out, String name){
		this.in = new HashSet<Node>(in);
		this.out = new HashSet<Node>(out);
		this.name = name;
	}

	/**
	 * @return the in
	 */
	public Set<Node> getIn() {
		return in;
	}

	/**
	 * @param in the in to set
	 */
	public void setIn(Set<Node> in) {
		this.in = in;
	}

	/**
	 * @return the out
	 */
	public Set<Node> getOut() {
		return out;
	}

	/**
	 * @param out the out to set
	 */
	public void setOut(Set<Node> out) {
		this.out = out;
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

	// ABSTRACT METHODS
	abstract public Set<Edge> extractEdges(); 

	
	
	
	
	
	// OVERRIDE
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.in.toString());
		sb.append(',');
		sb.append(this.out.toString());
		
		return sb.toString();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean retval;
		if(this == obj){
			retval = true;
		}
		else {
			if( ! (obj instanceof Pattern) ){
				retval = false;
			}
			else{
				Pattern p = (Pattern) obj;
				retval = this.in.equals(p.getIn()) && this.out.equals(p.getOut());
			}
			
		}
		return retval;
	}
	
	
}
