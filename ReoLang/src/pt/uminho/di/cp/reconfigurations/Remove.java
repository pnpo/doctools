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


			boolean removed = pattern.remove(ch);
			if (removed){
				LinkedHashSet<Node> cm_nodes = new LinkedHashSet<Node>();
				cm_nodes.addAll( ch.getInodes() ); 	//add input nodes
				cm_nodes.addAll( ch.getOnodes() ); 	//add output nodes


				//cm_nodes are the nodes of the removed channel				
				for(Node cm_node : cm_nodes){
	
					if(cm_node.getEnds().size() > 1){
						
						ArrayList<String> aux_node = new ArrayList<String>( cm_node.getEnds() );
						aux_node.remove( aux_node.size()-1 ); //remove one end -> change name of new node (eg: a.b.c -> a.b)

						LinkedHashSet<String> ends = new LinkedHashSet<String>(aux_node);
						Node new_node = new Node(ends);
						
						
						//after remove the channel, test if any of the other channels have equal nodes, and change them ids
						Set<CommunicationMean2> aux_pattern = new LinkedHashSet<CommunicationMean2>();

						Iterator<CommunicationMean2> it = new LinkedHashSet<CommunicationMean2>(pattern).iterator();						
						while(it.hasNext()){
							CommunicationMean2 cm = it.next();
						    it.remove();
						
							LinkedHashSet<Node> inodes = new LinkedHashSet<Node>(cm.getInodes());
							LinkedHashSet<Node> onodes = new LinkedHashSet<Node>(cm.getOnodes());
							
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
							
							aux_pattern.add(cm);
						}
						
						cp.setPattern(aux_pattern);
						

						//remove node from xors, if it is a xor
						LinkedHashSet<Node> xors = cp.getXors();

						boolean isXor = xors.remove(cm_node);
						if (isXor){
							int in = 0;
							int out = 0;
							for (CommunicationMean2 cm : cp.getPattern()){
								if (cm.getInodes().contains(new_node)){
									in++;
								} 
								if (cm.getOnodes().contains(new_node)){
									out++;
								}
							}
						
							if (in >= 1 && out >= 2){
								xors.add(new_node);
							}
						}
						
						//update cp delays
						Map<Node, Pair<Double,Double>> delays = cp.getDelays();
						Pair<Double,Double> value = null;
						if (delays.containsKey(cm_node)){
							value = delays.get(cm_node);
							delays.remove(cm_node);
							
							Set<Node> mixed_nodes = cp.getMixed();
							if (mixed_nodes.contains(new_node)){
								delays.put( new_node, value );
							} else{
								delays.put( new_node, new Pair<Double,Double>(value.fst(), null) );
							}
						}
					}
					
				}
			}
		}

		return new CoordinationPattern2(cp);
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
