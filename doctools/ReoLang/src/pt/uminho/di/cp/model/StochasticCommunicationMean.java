package pt.uminho.di.cp.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class StochasticCommunicationMean extends CommunicationMean {

	
	private LinkedHashMap<String, Double> stochastic_map ;
	
	
	/**
	 * 
	 */
	public StochasticCommunicationMean() {
		super();
		this.stochastic_map = new LinkedHashMap<String, Double>();
	}
	
	/**
	 * @param inode
	 * @param id
	 * @param type
	 * @param fnode
	 */
	public StochasticCommunicationMean(String inode, String id, String type, String fnode) {
		super(inode, id, type, fnode);
		this.stochastic_map = new LinkedHashMap<String, Double>();
	}
	
	
	
	/**
	 * 
	 * @param inode
	 * @param id
	 * @param type
	 * @param fnode
	 * @param values
	 */
	public StochasticCommunicationMean(String inode, String id, String type, String fnode, LinkedHashMap<String, Double> values) {
		super(inode, id, type, fnode);
		this.stochastic_map = values;
	}
	
	
	
	public StochasticCommunicationMean(StochasticCommunicationMean scm) {
		this.setInode(new String(scm.getInode()));
		this.setFnode(new String(scm.getFnode()));
		this.setId(new String(scm.getId()));
		this.setType(new String(scm.getType()));
		this.stochastic_map = new LinkedHashMap<String, Double>(scm.getStochastic_map());
	}
	
	
	
	
	
	
	
	

	/**
	 * @return the stochastic_map
	 */
	public Map<String, Double> getStochastic_map() {
		return stochastic_map;
	}

	/**
	 * @param stochastic_map the stochastic_map to set
	 */
	public void setStochastic_map(LinkedHashMap<String, Double> stochastic_map) {
		this.stochastic_map = stochastic_map;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String sb_inode = "" ;
		String sb_fnode = "" ;
		String other = "@[" ;
		
		for( String s : this.stochastic_map.keySet()){
			if( s.equals(this.getInode()) )
			{ 
				sb_inode = "@" + this.stochastic_map.get(s) ;
			}
			else{
				if( s.equals(this.getFnode()) ) {
					sb_fnode = "@" + this.stochastic_map.get(s) ;
				}
				else {
					other += this.stochastic_map.get(s) + " " ;
				}
			}
		}
		other += "]";
		
		
		return "(" + this.getInode() + sb_inode + ", " + this.getId() + ", " + this.getType() + other + ", " + this.getFnode() + sb_fnode + ")";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((stochastic_map == null) ? 0 : stochastic_map.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof StochasticCommunicationMean))
			return false;
		StochasticCommunicationMean other = (StochasticCommunicationMean) obj;
		if (stochastic_map == null) {
			if (other.stochastic_map != null)
				return false;
		} else if (!stochastic_map.equals(other.stochastic_map))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	

}
