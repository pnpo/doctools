package pt.uminho.di.cp.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import pt.uminho.di.reolang.parsing.util.Pair;


/**
 * @author Nuno Oliveira
 * @date 16 Dec, 2013
 *
 */

public class CommunicationMean2 {
	//A node
	//set of input nodes
	private LinkedHashSet<Node> inodes;
	//set of output nodes
	private LinkedHashSet<Node> onodes;
	//comm. mean identifier
	private String id;
	//comm. mean type
	private String type;
	//stochastic table
	private LinkedHashMap<String, Double> delays;
	
	
	
	
	
	
	public CommunicationMean2() {
		super();
		this.inodes = new LinkedHashSet<Node>();
		this.onodes = new LinkedHashSet<Node>();
		this.id = "";
		this.type = "";
		this.delays = new LinkedHashMap<String, Double>();
		
	}

	

	/**
	 * @param inodes
	 * @param onodes
	 * @param id
	 * @param type
	 */
	public CommunicationMean2(LinkedHashSet<Node> inodes,
			LinkedHashSet<Node> onodes, String id, String type, LinkedHashMap<String, Double> delays) {
		super();
		this.inodes = inodes;
		this.onodes = onodes;
		this.id = id;
		this.type = type;
		this.delays = delays;
		
	}
	
	
	
	/**
	 * @param cm
	 */
	public CommunicationMean2(CommunicationMean2 cm) {
		super();
		this.inodes = new LinkedHashSet<Node>(cm.getInodes());
		this.onodes = new LinkedHashSet<Node>(cm.getOnodes());
		this.id = cm.getId();
		this.type = cm.getType();
		this.delays = new LinkedHashMap<String, Double>(cm.getDelays());
		
	}



	/**
	 * @return the inodes
	 */
	public LinkedHashSet<Node> getInodes() {
		return inodes;
	}



	/**
	 * @param inodes the inodes to set
	 */
	public void setInodes(LinkedHashSet<Node> inodes) {
		this.inodes = inodes;
	}



	/**
	 * @return the onodes
	 */
	public LinkedHashSet<Node> getOnodes() {
		return onodes;
	}



	/**
	 * @param onodes the onodes to set
	 */
	public void setOnodes(LinkedHashSet<Node> onodes) {
		this.onodes = onodes;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}



	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	/**
	 * @return the delays
	 */
	public LinkedHashMap<String, Double> getDelays() {
		return delays;
	}



	/**
	 * @param delays the delays to set
	 */
	public void setDelays(LinkedHashMap<String, Double> delays) {
		this.delays = delays;
	}
	
	
	

	
	
	
	
	///// SPECIFIC METHODS ////////
	
	
	// NEW METHODS //
	
	/**
	 * @return the inodes
	 */
	public LinkedHashSet<Node> getIn() {
		return this.getInodes();
	}

	
	/**
	 * @return the inode on position i
	 */
	public Node getIn(int i) {
		ArrayList<Node> inodes = new ArrayList<Node>(getInodes());
		return inodes.get(i);
	}
	
	/**
	 * @return the onodes
	 */
	public LinkedHashSet<Node> getOut() {
		return this.getOnodes();
	}
	
	/**
	 * @return the onode on position i
	 */
	public Node getOut(int i) {
		ArrayList<Node> onodes = new ArrayList<Node>(getOnodes());
		return onodes.get(i);
	}
	
	
	/**
	 * @return 
	 */
	public LinkedHashSet<Node> getEndsOf(CoordinationPattern2 p) {
		LinkedHashSet<Node> res = new LinkedHashSet<Node>();
		return res;
	}


	public LinkedHashSet<Node> getNodes() {
		return getEnds();
	}
	///////////////


	/**
	 * Takes all the nodes from the communication mean
	 * @return a set with the nodes of this communication mean
	 */
	public LinkedHashSet<Node> getEnds() {
		LinkedHashSet<Node> res = new LinkedHashSet<Node>(this.getInodes());
		res.addAll(new LinkedHashSet<Node>(this.getOnodes()));
		return res;
	}
	
	/**
	 * Takes all the mixed nodes from the communication mean.
	 * 
	 * A mixed node is a node with more than 1 end.
	 * 
	 * @return a set with mixed nodes of this communication mean
	 */
	public LinkedHashSet<Node> getMixed() {
		LinkedHashSet<Node> res = new LinkedHashSet<Node>();
		LinkedHashSet<Node> all_nodes = this.getEnds();
		for(Node n : all_nodes){
			if(n.size() > 1){
				res.add(n);
			}
		}
		return res;
	}
	
	
	
	
	/**
	 * 
	 * @return a Pair with source and target nodes of the comm. mean.
	 */
	public Pair<Node, Node> getSourceTarget(){
		Pair<Node, Node> s_t = new Pair<Node, Node> ();
		Object[] in =  this.getInodes().toArray();
		Object[] out = this.getOnodes().toArray();
		switch(in.length){
			case 1 : {
				s_t.setFirst((Node) in[0]);
				s_t.setSecond((Node) out[0]);
			} ; break ;
			
			case 2 : {
				s_t.setFirst((Node) in[0]);
				s_t.setSecond((Node) in[1]);
			} ; break ;
			
			default : {
				s_t.setFirst((Node) out[0]);
				s_t.setSecond((Node) out[1]);
			} ; break ;
		}
		
		return s_t;
	}
	
	////////////////////////////////
	
	
	
	
	



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  "<" + inodes + ", " +  id + ", " + type + ", " + onodes + " @ " + delays + ">\n" ;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((delays == null) ? 0 : delays.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inodes == null) ? 0 : inodes.hashCode());
		result = prime * result + ((onodes == null) ? 0 : onodes.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		if (!(obj instanceof CommunicationMean2))
			return false;
		CommunicationMean2 other = (CommunicationMean2) obj;
		if (delays == null) {
			if (other.delays != null)
				return false;
		} else if (!delays.equals(other.delays))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inodes == null) {
			if (other.inodes != null)
				return false;
		} else if (!inodes.equals(other.inodes))
			return false;
		if (onodes == null) {
			if (other.onodes != null)
				return false;
		} else if (!onodes.equals(other.onodes))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
