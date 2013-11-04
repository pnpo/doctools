/**
 * 
 */
package pt.uminho.di.cp.model;

/**
 * @author Nuno Oliveira
 * @date 4 de Abr de 2013
 *
 */
public class CommunicationMean {

	private String inode;		//initial node
	private String fnode;		//final node
	private String id;			//communication mean identifier
	private String type;		//communication mean type
	
	
	
	/**
	 * 
	 */
	public CommunicationMean() {
		super();
	}
	
	
	
	/**
	 * @param inode
	 * @param fnode
	 * @param id
	 * @param type
	 */
	public CommunicationMean(String inode, String id, String type, String fnode) {
		super();
		this.inode = inode;
		this.fnode = fnode;
		this.id = id;
		this.type = type;
	}

	
	
	public CommunicationMean(CommunicationMean cm) {
		this.inode = new String(cm.getInode());
		this.fnode = new String(cm.getFnode());
		this.id = new String(cm.getId());
		this.type = new String(cm.getType());
	}
	

	/**
	 * @return the inode
	 */
	public String getInode() {
		return inode;
	}



	/**
	 * @param inode the inode to set
	 */
	public void setInode(String inode) {
		this.inode = inode;
	}



	/**
	 * @return the fnode
	 */
	public String getFnode() {
		return fnode;
	}



	/**
	 * @param fnode the fnode to set
	 */
	public void setFnode(String fnode) {
		this.fnode = fnode;
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



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + inode + ", " + id + ", " + type + ", " + fnode + ")";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fnode == null) ? 0 : fnode.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inode == null) ? 0 : inode.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommunicationMean other = (CommunicationMean) obj;
		if (fnode == null) {
			if (other.fnode != null)
				return false;
		} else if (!fnode.equals(other.fnode))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inode == null) {
			if (other.inode != null)
				return false;
		} else if (!inode.equals(other.inode))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
}
