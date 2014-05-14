package pt.uminho.di.reolang.parsing.util;

public class Triple<FIRST, SECOND, THIRD> implements Comparable<Triple<FIRST,SECOND,THIRD>> {

	private FIRST first;
	private SECOND second;
	private THIRD third; 

	public Triple() {
	    this.first = null;
	    this.second = null;
	    this.third = null;
	}
	
	public Triple(FIRST first, SECOND second, THIRD third) {
	    this.first = first;
	    this.second = second;
	    this.third = third;
	}


	public static <FIRST, SECOND, THIRD> Triple<FIRST, SECOND, THIRD> of(FIRST first, SECOND second, THIRD third) {
	    return new Triple<FIRST, SECOND, THIRD>(first, second, third);
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

	/**
	 * @return the third
	 */
	public THIRD trd() {
		return third;
	}


	/**
	 * @param second the second to set
	 */
	public void setThird(THIRD third) {
		this.third = third;
	}
	
	
	public String concatenate(){
		return this.first + "_" + this.second + "_" + this.third;
	}

	
	
	@Override
	public int compareTo(Triple<FIRST, SECOND, THIRD> o) {
		int cmp1 = compare(first, o.first);
		int cmp2 = cmp1 == 0 ? compare(second, o.second) : cmp1;
	    return cmp2 == 0 ? compare(third, o.third) : cmp2;
	}
	
	// todo move this to a helper class.
	@SuppressWarnings({ "rawtypes", "unchecked"})
	private static int compare(Object o1, Object o2) {
	    return o1 == null ? o2 == null ? 0 : -1 : o2 == null ? +1 : ((Comparable) o1).compareTo(o2);
	}
	//*/



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		result = prime * result + ((third == null) ? 0 : third.hashCode());
		return result;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triple other = (Triple) obj;
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
		if (third == null) {
			if (other.third != null)
				return false;
		} else if (!third.equals(other.third))
			return false;
		return true;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ")";
	}

}
