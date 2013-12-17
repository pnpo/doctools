package pt.uminho.di.cp.model;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * @author Nuno Oliveira
 * @date 16 Dec, 2013
 *
 */

public class CoordinationPattern2 {

	private Set<CommunicationMean2> pattern;
	private String id;
	
	
	
	
	
	

	public CoordinationPattern2() {
		super();
		this.pattern = new LinkedHashSet<CommunicationMean2>();
		this.id = "unnamed";
	}
	
	
	
	/**
	 * @param pattern
	 * @param id
	 */
	public CoordinationPattern2(Set<CommunicationMean2> pattern, String id) {
		super();
		this.pattern = new LinkedHashSet<CommunicationMean2>(pattern);
		this.id = id;
	}
	

	/**
	 * @param cp
	 * @param id
	 */
	public CoordinationPattern2(CoordinationPattern2 cp) {
		super();
		this.pattern = new LinkedHashSet<CommunicationMean2>(cp.getPattern());
		this.id = cp.getId();
	}
	
	
	
	
	
	
	/**
	 * @return the pattern
	 */
	public Set<CommunicationMean2> getPattern() {
		return pattern;
	}
	/**
	 * @param pattern the pattern to set
	 */
	public void setPattern(Set<CommunicationMean2> pattern) {
		this.pattern = pattern;
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



	
	
	
	
	
	//// SPECIFIC METHODS //////
	
	/**
	 * This method implements the I(p) operations as
	 * described in: 
	 * 
	 * "Reasoning about reconfigurations: the behavioural and structural perspectives"
	 * 
	 * for the retrieval of input ports of the
	 * coordination patterns.
	 *
	 * @return input nodes of the coordination pattern
	 * 
	 */
	public Set<Node> getIn() {
		Set<Node> ports = new LinkedHashSet<Node>();
		
		for(CommunicationMean2 c : this.pattern) {
			for(Node n : c.getInodes()){
				if(isIn(n)){
					ports.add(new Node(n));
				}
			}
			
		}
		
		return ports;
	}
	
	
	private boolean isIn(Node n) {
		
		boolean is_in = true;
		
		Iterator<CommunicationMean2> it_comm = this.pattern.iterator();
		while(it_comm.hasNext() && is_in) {
			CommunicationMean2 cm = it_comm.next();
			if(cm.getOnodes().contains(n)){
				is_in = false;
			}
		}
		
		return is_in;
	}
	
	
	
	
	/**
	 * This method implements the O(p) operations as
	 * described in: 
	 * 
	 * "Reasoning about reconfigurations: the behavioural and structural perspectives"
	 * 
	 * for the retrieval of output ports of the
	 * coordination patterns.
	 *
	 * @return output nodes of the coordination pattern
	 * 
	 */
	public Set<Node> getOut() {
		Set<Node> ports = new LinkedHashSet<Node>();
		
		for(CommunicationMean2 c : this.pattern) {
			for(Node n : c.getOnodes()){
				if(isOut(n)){
					ports.add(new Node(n));
				}
			}
			
		}
		
		return ports;
	}
	
	
	private boolean isOut(Node n) {
		
		boolean is_out = true;
		
		Iterator<CommunicationMean2> it_comm = this.pattern.iterator();
		while(it_comm.hasNext() && is_out) {
			CommunicationMean2 cm = it_comm.next();
			if(cm.getInodes().contains(n)){
				is_out = false;
			}
		}
		
		return is_out;
	}
	
	
	
	/**
	 * This method implements the nodes_of(p) as described in:
	 * 
	 * "Reasoning about reconfigurations: the behavioural and structural perspectives"
	 * 
	 * It retrieves all the nodes of the pattern.
	 *  
	 * @return A set with all nodes within the pattern
	 */
	public Set<Node> getNodes() {
		Set<Node> nodes = new LinkedHashSet<Node>();
		
		for(CommunicationMean2 cm : this.getPattern()) {
			nodes.addAll(new LinkedHashSet<Node>(cm.getEnds()));
		}
		
		return nodes;
	}
	
	
	/**
	 * This method implements the mixed_of(p) as described in:
	 * 
	 * "Reasoning about reconfigurations: the behavioural and structural perspectives"
	 * 
	 * It retrieves all the nodes of the pattern with more than one end
	 * 
	 * @return A set with all mixed nodes 
	 */
	public Set<Node> getMixed() {
		Set<Node> mixeds = new LinkedHashSet<Node>();
		Set<Node> nodes = this.getNodes();
		for(Node n : nodes){
			if(n.size() > 1) {
				mixeds.add(new Node(n));
			}
		}
		return mixeds;
	}
	
	
	
	/**
	 * This method implements the names_of(p) as described in:
	 * 
	 * "Reasoning about reconfigurations: the behavioural and structural perspectives"
	 * 
	 * It retrieves all the names of the communication means within the pattern
	 * 
	 * @return A set with all the communication means identifiers
	 */
	public Set<String> getNames() {
		Set<String> names =  new LinkedHashSet<String>();
		for(CommunicationMean2 cm : this.getPattern()) {
			names.add(cm.getId());
		}
		
		return names;
	}
	
	
	
	public Set<Node> getEndsOf(String id) {
		Set<Node> ends = new LinkedHashSet<Node>();
		
		for(CommunicationMean2 cm : this.getPattern()) {
			if(cm.getId().equals(id)) {
				ends = new LinkedHashSet<Node>(cm.getEnds());
			}
		}
		
		return ends;
	}
	
	
	
	
	////////////////////////////
	
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return id+"\n" + pattern + "";
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pattern == null) ? 0 : pattern.hashCode());
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
		if (!(obj instanceof CoordinationPattern2))
			return false;
		CoordinationPattern2 other = (CoordinationPattern2) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pattern == null) {
			if (other.pattern != null)
				return false;
		} else if (!pattern.equals(other.pattern))
			return false;
		return true;
	}
	
	
	
	
	
}
