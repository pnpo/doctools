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
		String file = "Resources/default.reo";
		
		ReoXMLProcessor proc = new ReoXMLProcessor(file);
		CoordinationPattern2 cp = proc.toCoordinationPattern();
		System.out.println(cp);
		proc.toReoXML(cp, "reconfigd.reo");
		
		System.out.println(cp.getIn());
		System.out.println(cp.getOut());
		
		System.out.println(cp.toCooPLa());
		
	}
	
}
