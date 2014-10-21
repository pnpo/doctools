package pt.uminho.di.cp.reconfigurations;


/**
 * @author Nuno Oliveira
 * @date 16 Dec, 2013
 *
 */


import pt.uminho.di.cp.model.CoordinationPattern2;

public class Id implements IReconfiguration {

	
	
	public CoordinationPattern2 apply(CoordinationPattern2 cp) {
		return new CoordinationPattern2(cp);
	}

}
