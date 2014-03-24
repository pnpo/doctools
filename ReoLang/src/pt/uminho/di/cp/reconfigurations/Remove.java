/**
 * 
 */
package pt.uminho.di.cp.reconfigurations;

import java.util.ArrayList;
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
public class Remove implements IReconfiguration {

	
	private String id;
	
	
	
	

	/**
	 * @param id
	 */
	public Remove(String id) {
		super();
		this.id = id;
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







	/* (non-Javadoc)
	 * @see pt.uminho.di.cp.reconfigurations.IReconfiguration#apply(pt.uminho.di.cp.model.CoordinationPattern2)
	 */
	@Override
	public CoordinationPattern2 apply(CoordinationPattern2 cp) {
		
		String ch_id = this.getId();
		if ( cp.getNames().contains(ch_id) ){
			Set<CommunicationMean2> pattern = cp.getPattern();
			
			CommunicationMean2 ch = new CommunicationMean2();
			for (CommunicationMean2 cm : pattern) {
				if (cm.getId().equals(ch_id)){
					ch = cm;
					break;
				}
			}
			
//			System.out.println(ch);
//			System.out.println(pattern.contains(ch));
			boolean removed = pattern.remove(ch);
//			System.out.println(pattern);
//			System.out.println(removed);

			if (removed){
				LinkedHashSet<Node> cm_nodes = new LinkedHashSet<Node>();
				cm_nodes.addAll( ch.getInodes() ); 	//add input nodes
				cm_nodes.addAll( ch.getOnodes() ); 	//add output nodes
				
				//cm_nodes are the nodes of the removed channel
				for(Node cm_node : cm_nodes){
	
					if(cm_node.getEnds().size() > 1){
						//after remove the channel, test if any of the other channels have equal nodes, and change them ids
						for (CommunicationMean2 cm : pattern) {

							LinkedHashSet<Node> inodes = cm.getInodes();
							LinkedHashSet<Node> onodes = cm.getOnodes();
							
							ArrayList<String> aux_node = new ArrayList<String>();
							for ( String end : cm_node.getEnds() ){
								aux_node.add(end);
							}
							aux_node.remove(aux_node.size() - 1);
							
							LinkedHashSet<String> ends = new LinkedHashSet<String>(aux_node);
							Node new_node = new Node(ends);
							
							for (Node inode : inodes){
								if( inode.equals(cm_node) ){
									cm.getInodes().remove(inode);
									cm.getInodes().add(new_node); 
								}
							}

							for (Node onode : onodes){
								if( onode.equals(cm_node) ){
									cm.getOnodes().remove(onode);
									cm.getOnodes().add(new_node);
								}
							}
						}
					}
					
				}
			}
		}
		
		return cp;
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Remove [id=" + id + "]";
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (!(obj instanceof Remove))
			return false;
		Remove other = (Remove) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
	
	
	
	
	
	
}
