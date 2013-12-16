/**
 * 
 */
package pt.uminho.di.cp.reconfigurations;

import java.util.LinkedHashSet;

import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.cp.model.Node;

/**
 * @author Nuno Oliveira
 * @date 16 de Dez de 2013
 *
 */
public class Join implements IReconfiguration {

	
	private LinkedHashSet<Node> nodes;
	

	
	/**
	 * @param nodes
	 */
	public Join(LinkedHashSet<Node> nodes) {
		super();
		this.nodes = new LinkedHashSet<Node>(nodes);
	}





	/**
	 * @return the nodes
	 */
	public LinkedHashSet<Node> getNodes() {
		return nodes;
	}





	/**
	 * @param nodes the nodes to set
	 */
	public void setNodes(LinkedHashSet<Node> nodes) {
		this.nodes = new LinkedHashSet<Node>(nodes);
	}





	/* (non-Javadoc)
	 * @see pt.uminho.di.cp.reconfigurations.IReconfiguration#apply(pt.uminho.di.cp.model.CoordinationPattern2)
	 */
	@Override
	public CoordinationPattern2 apply(CoordinationPattern2 cp) {
		// TODO Auto-generated method stub
		return null;
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Join [nodes=" + nodes + "]";
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nodes == null) ? 0 : nodes.hashCode());
		return result;
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Join))
			return false;
		Join other = (Join) obj;
		if (nodes == null) {
			if (other.nodes != null)
				return false;
		} else if (!nodes.equals(other.nodes))
			return false;
		return true;
	}
	
	
	
	
	

}
