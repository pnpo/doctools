/**
 * 
 */
package pt.uminho.di.cp.model.util;

import pt.uminho.di.cp.model.CoordinationPattern2;

/**
 * @author Nuno Oliveira
 * @date 17 de Dez de 2013
 *
 */
public class Test {
	
	public static void main(String[] args) {
		String file = "/Users/nunooliveira/Documents/NetBeansProjects/ReoTestingStuff/drain_spout.reo";
		
		ReoXMLProcessor proc = new ReoXMLProcessor(file);
		CoordinationPattern2 cp = proc.toCoordinationPattern();
		
		System.out.println(cp);
		
		
	}
	
}
