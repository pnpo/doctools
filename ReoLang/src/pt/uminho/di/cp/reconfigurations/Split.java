/**
 * 
 */
package pt.uminho.di.cp.reconfigurations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import pt.uminho.di.cp.model.CommunicationMean2;
import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.cp.model.Node;
import pt.uminho.di.reolang.parsing.util.Pair;

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
	
	public CoordinationPattern2 apply(CoordinationPattern2 cp) {
		Node node = this.getNode();
		
		//remove node from xors, if it is a xor
		LinkedHashSet<Node> xors = cp.getXors();
		if (xors.contains(node)){
			xors.remove(node);
		}

		Map<Node, Pair<Double,Double>> delays = cp.getDelays();
		Pair<Double,Double> value = null;
		if (delays.containsKey(node)){
			value = delays.get(node);
			delays.remove(node);
		}
		
		//Test if node exists in coordination pattern
		if ( cp.getNodes().contains(node) ) {
			ArrayList<Node> sn = new ArrayList<Node>();
			for ( String end : node.getEnds() ){
				Node n = new Node();
				n.addEnd(end);
				sn.add(n);
			}
			
			//get all channels
			Set<CommunicationMean2> pattern = cp.getPattern();
			Set<CommunicationMean2> aux_pattern = new LinkedHashSet<CommunicationMean2>();
	
			int i = 0; //sn.size() - 1 --> i--
			Iterator<CommunicationMean2> it = pattern.iterator();
			
			while(it.hasNext()){
				CommunicationMean2 cm = it.next();
			    it.remove();
			
				LinkedHashSet<Node> inodes = new LinkedHashSet<Node>(cm.getInodes());
				LinkedHashSet<Node> onodes = new LinkedHashSet<Node>(cm.getOnodes());
				
				for (Node inode : inodes){
					if( inode.equals(node) ){
						cm.getInodes().remove(inode);
						cm.getInodes().add( sn.get(i) );
						if (value != null) {
							delays.put( sn.get(i), new Pair<Double,Double>(value.fst(), null) );
						}
						i++;
					}
				}
				for (Node onode : onodes){
					if( onode.equals(node) ){
						cm.getOnodes().remove(onode);
						cm.getOnodes().add( sn.get(i) );
						if (value != null) {
							delays.put( sn.get(i), new Pair<Double,Double>(value.fst(), null) );	
						}
						i++;
					}
				}
				
				aux_pattern.add(cm);
			}
			cp.setPattern(aux_pattern);
		}

		return new CoordinationPattern2(cp);
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
