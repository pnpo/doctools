/**
 * 
 */
package pt.uminho.di.imc.reo.imc;

import java.util.LinkedList;
import java.util.List;

import pt.uminho.di.imc.util.Pair;


/**
 * @author Nuno Oliveira
 * @date 13 de Set de 2013
 *
 */
public class IMCREOState implements Comparable<IMCREOState> {

	private String id;
	private List<IMCREOBufferState> buffer;
	


	
	/**
	 * 
	 */
	public IMCREOState() {
		super();
		this.id = "NaS";
		this.buffer = new LinkedList<IMCREOBufferState>();
	}
	
	
	/**
	 * @param id
	 */
	public IMCREOState(String id, List<IMCREOBufferState> buffer) {
		super();
		this.id = id;
		this.buffer = new LinkedList<IMCREOBufferState>(buffer);
	}
	
	
	/**
	 * @param id
	 */
	public IMCREOState(IMCREOState s) {
		super();
		this.id = s.getId();
		this.buffer = new LinkedList<IMCREOBufferState>(s.getBuffer());
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
	 * @return the buffer
	 */
	public List<IMCREOBufferState> getBuffer() {
		return buffer;
	}


	/**
	 * @param buffer the buffer to set
	 */
	public void setBuffer(List<IMCREOBufferState> buffer) {
		this.buffer = buffer;
	}


	
	
	
	
	public IMCREOBufferState getInternalState() {
		IMCREOBufferState internal_state = 
				this.getBuffer().contains(IMCREOBufferState.EMPTY) ? IMCREOBufferState.EMPTY : 
					this.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL :
																			IMCREOBufferState.NONE;
		return internal_state;
	} 

	
	
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(id);
		sb.append("_");
		for(IMCREOBufferState bs : this.buffer){
			switch(bs) {
				case FULL : sb.append("f"); break;
				case EMPTY: sb.append("e"); break;
				default : sb.append("-"); break;
			}
		}
		return sb.toString() ;
	}

	
	
	
	
	
	
	




	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buffer == null) ? 0 : buffer.hashCode());
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
		if (!(obj instanceof IMCREOState))
			return false;
		IMCREOState other = (IMCREOState) obj;
		if (buffer == null) {
			if (other.buffer != null)
				return false;
		} else if (!buffer.equals(other.buffer))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public int compareTo(IMCREOState o) {
		return this.hashCode() - o.hashCode();
	}
	
	
	
	public IMCREOState copy() {
		return new IMCREOState(this);
	}
	
	
	
	
	
	//CLASS METHODS
	
	public static IMCREOState concatenate(Pair<IMCREOState,IMCREOState> pair){
		
		IMCREOState cat = new IMCREOState(pair.fst().getId() + "|" + pair.snd().getId(), concatenateBuffers(pair.fst(), pair.snd()));
		return cat;
	}
	
	
	/**
	 * @param other
	 */
	private static LinkedList<IMCREOBufferState> concatenateBuffers(IMCREOState fst, IMCREOState snd) {
		LinkedList<IMCREOBufferState> newbuffer = 
				new LinkedList<IMCREOBufferState>((LinkedList)fst.getBuffer());
		newbuffer.addAll((LinkedList)snd.getBuffer());
		
		return newbuffer;
	}


	
	
	
	
}
