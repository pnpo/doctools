/**
 * 
 */
package pt.uminho.di.cp.reconfigurations;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import pt.uminho.di.cp.model.CommunicationMean2;
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

		LinkedHashSet<Node> nodes = this.getNodes(); 
		
		Node new_node = new Node();
		for (Node n : nodes)
		{
			for (String e : n.getEnds()){
				new_node.addEnd(e);
			}
		}
		
		//Test if nodes exist in coordination pattern
		if ( cp.getNodes().containsAll(nodes) ) {
			Set<CommunicationMean2> pattern = cp.getPattern();
			Set<CommunicationMean2> aux_pattern = new LinkedHashSet<CommunicationMean2>();
			
			Iterator<CommunicationMean2> it = pattern.iterator();
			while(it.hasNext()){
				CommunicationMean2 cm = it.next();
				it.remove();
				
				LinkedHashSet<Node> inodes = cm.getInodes();
				LinkedHashSet<Node> onodes = cm.getOnodes();
				
				for (Node inode : inodes){
					if( nodes.contains(inode) ){
						cm.getInodes().remove(inode);
						cm.getInodes().add(new_node);
					}
				}
				for (Node onode : onodes){
					if( nodes.contains(onode) ){
						cm.getOnodes().remove(onode);
						cm.getOnodes().add(new_node);
					}
				}
				
				aux_pattern.add(cm);
			}
			cp.setPattern(aux_pattern);
		}
		return cp;
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
