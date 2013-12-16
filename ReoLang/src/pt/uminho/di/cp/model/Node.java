package pt.uminho.di.cp.model;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;



/**
 * @author Nuno Oliveira
 * @date 16 Dec, 2013
 *
 */

public class Node {
	private LinkedHashSet<String> ends;
	
	public Node() {
		this.ends  = new LinkedHashSet<String>();
	}
	
	public Node(LinkedHashSet<String> ends) {
		this.ends  = new LinkedHashSet<String>(ends);
	}
	
	public Node(Node n) {
		this.ends = new LinkedHashSet<String>(n.getEnds());
	}

	
	
	
	/**
	 * @return the ends
	 */
	public LinkedHashSet<String> getEnds() {
		return ends;
	}

	/**
	 * @param ends the ends to set
	 */
	public void setEnds(LinkedHashSet<String> ends) {
		this.ends = ends;
	}

	
	//####### SPECIFIC METHODS ########//
	
	public void addEnd(String e) {
		this.ends.add(e);
	}
	
	
	public void removeEnd(String e){
		this.ends.remove(e);
	}
	
	
	public int size(){
		return this.getEnds().size();
	}
	
	/**
	 * Flats the set of nodes into a node
	 * @param N - the set of nodes to flat 
	 * @return a Node
	 */
	public static Node flat(LinkedHashSet<Node> N) {
		Node res = new Node();
		for(Node node : N) {
			for(String end : node.getEnds()) {
				res.addEnd(end);
			}
		}
		
		return res;
	}
	
	
	/**
	 * Restricts the set of nodes given to a set of representatives
	 * of each node in the provided parameter.
	 * 
	 * It follows a non-deterministic approach to obtain the representative
	 * end in each node. This is, the end is picked randomly from the nodes.
	 * 
	 * @param N the set of nodes
	 * @return a set with representatives of each node
	 */
	public static LinkedHashSet<String> restrict(LinkedHashSet<Node> N) {
		LinkedHashSet<String> res = new LinkedHashSet<String>();
		
		for(Node node : N) {
			Random generator = new Random();
			int size = node.getEnds().size();
			int choice = generator.nextInt(size);
			Iterator<String> iter = node.getEnds().iterator();
			int i = 0;
			String end = "";
			while(iter.hasNext() && i <= choice){
				end = iter.next();
				i++;
			}
			res.add(end);
		}
		return res;
	}
	
	
	//################################//
	
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Node [ends=" + ends + "]";
	}

	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ends == null) ? 0 : ends.hashCode());
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
		if (!(obj instanceof Node))
			return false;
		Node other = (Node) obj;
		if (ends == null) {
			if (other.ends != null)
				return false;
		} else if (!ends.equals(other.ends))
			return false;
		return true;
	}
	
	
	
	
}
