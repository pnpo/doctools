package pt.uminho.di.cp.reconfigurations;

import pt.uminho.di.cp.model.CoordinationPattern2;


/**
 * @author Nuno Oliveira
 * @date 16 Dec, 2013
 *
 */



public interface IReconfiguration {
	
	public CoordinationPattern2 apply(CoordinationPattern2 cp);
	
}
