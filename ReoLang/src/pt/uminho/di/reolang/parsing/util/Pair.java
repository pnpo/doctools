package pt.uminho.di.reolang.parsing.util;

/**
 * @author Nuno Oliveira
 * @date 20 de Nov de 2012
 *
 */

public class Pair<FIRST, SECOND> implements Comparable<Pair<FIRST,SECOND>> {

	private  FIRST first;
	private  SECOND second;


	public Pair() {
	    this.first = null;
	    this.second = null;
	}
	
	public Pair(FIRST first, SECOND second) {
	    this.first = first;
	    this.second = second;
	}


	public static <FIRST, SECOND> Pair<FIRST, SECOND> of(FIRST first, SECOND second) {
	    return new Pair<FIRST, SECOND>(first, second);
	}

	

/**
	 * @return the first
	 */
	public FIRST fst() {
		return first;
	}


	/**
	 * @param first the first to set
	 */
	public void setFirst(FIRST first) {
		this.first = first;
	}


	/**
	 * @return the second
	 */
	public SECOND snd() {
		return second;
	}


	/**
	 * @param second the second to set
	 */
	public void setSecond(SECOND second) {
		this.second = second;
	}

	
	public String concatenate(){
		return this.first + "_" + this.second;
	}

	@Override
	public int compareTo(Pair<FIRST, SECOND> o) {
	    int cmp = compare(first, o.first);
	    return cmp == 0 ? compare(second, o.second) : cmp;
	}
	
	// todo move this to a helper class.
	@SuppressWarnings({ "rawtypes", "unchecked"})
	private static int compare(Object o1, Object o2) {
	    return o1 == null ? o2 == null ? 0 : -1 : o2 == null ? +1 : ((Comparable) o1).compareTo(o2);
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
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
		if (!(obj instanceof Pair))
			return false;
		@SuppressWarnings("rawtypes")
		Pair other = (Pair) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}


	@Override
	public String toString() {
	    return "(" + first + ", " + second + ')';
	}

}
