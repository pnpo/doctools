/**
 * 
 */
package pt.uminho.di.cp.reconfigurations;

import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.cp.model.Node;

/**
 * @author Nuno Oliveira
 * @date 16 de Dez de 2013
 *
 */
public class Split implements IReconfiguration {

	
	private Node node;
	
	
	
	
	
	
	/**
	 * @param node
	 */
	public Split(Node node) {
		super();
		this.node = new Node(node);
	}

	
	





	/**
	 * @return the node
	 */
	public Node getNode() {
		return new Node(node);
	}








	/**
	 * @param node the node to set
	 */
	public void setNode(Node node) {
		this.node = new Node(node);
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
		return "Split [node=" + node + "]";
	}








	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((node == null) ? 0 : node.hashCode());
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
		if (!(obj instanceof Split))
			return false;
		Split other = (Split) obj;
		if (node == null) {
			if (other.node != null)
				return false;
		} else if (!node.equals(other.node))
			return false;
		return true;
	}
	
	
	
	
	

}
