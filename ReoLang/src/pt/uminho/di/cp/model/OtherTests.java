/**
 * 
 */
package pt.uminho.di.cp.model;

import java.util.LinkedHashSet;
import java.util.Set;


/**
 * @date 25 de Out de 2013
 *
 */
public class OtherTests {

	public static void main(String[] args) {
	    
		CommunicationMean c1 = new CommunicationMean("a", "s1", "sync", "b.c");
		CommunicationMean c2 = new CommunicationMean("b.c", "s2", "sync", "d");
		CommunicationMean c3 = new CommunicationMean("e", "f1", "fifo1e", "f");
		CommunicationMean c4 = new CommunicationMean("g", "s3", "sync", "h.i.j");
		CommunicationMean c5 = new CommunicationMean("h.i.j", "s4", "sync", "k");
		CommunicationMean c6 = new CommunicationMean("h.i.j", "s5", "sync", "l");
		CommunicationMean c7 = new CommunicationMean("m", "s6", "sync", "n");
		
		try{
			CoordinationPattern p1 = new CoordinationPattern("p1");
			p1.getPattern().add(c1);
			p1.getPattern().add(c2);
	//		p1.getPattern().add(c3);
			
			System.out.println("INIT------------------");
			System.out.println(p1);
			
			p1.id();
			System.out.println("ID------------------");
			System.out.println(p1);
			
//			//ReconfigurableCoordinationPattern rp = new ReconfigurableCoordinationPattern();
//			if (!(p1 instanceof ReconfigurableCoordinationPattern)){
//				p1 = new ReconfigurableCoordinationPattern(p1);
//			}
//			
//			//force reconfig
//			p1 = new ReconfigurableCoordinationPattern(p1);
//			
//			System.out.println("RecCP------------------");
//			System.out.println(p1);
			
			CoordinationPattern p2 = new CoordinationPattern("p2");
			p2.getPattern().add(c4);
			p2.getPattern().add(c5);
			p2.getPattern().add(c6);
			
			//System.out.println(p2);
			p1.par(p2);
			System.out.println("PAR------------------");
			System.out.println(p1);
			
	
//			p1.constant(p2);
//			//p.constant(cp2);
//			System.out.println("CONST------------------");
//			System.out.println(p1);		
//			
//			
//			CoordinationPattern p3 = new CoordinationPattern("p3");
//			p3.getPattern().add(c7);
//	
//	
//			p1.par(p3).constant(p2);
//			System.out.println("PAR+CONST------------------");
//			System.out.println(p1);
//			
//			System.out.println("NAMES OF------------------");
//			System.out.println(p1.names_of().toString());
//			System.out.println("NODES OF------------------");
//			System.out.println(p1.nodes_of().toString());
			
			
			Set<String> n = new LinkedHashSet<String>();
			n.add("a");
			n.add("g");
//			n.add("k");
//			n.add("e");
			
			p1.join(n);
			System.out.println("JOIN------------------");
			System.out.println(p1);
			
			
			p1.split("h.i.j");
			System.out.println("SPLIT------------------");
			System.out.println(p1);
			
			
			//s1 e s3 não estão a funcionar / ser removidos (??)
//			p1.remove("s2");
//			System.out.println("REMOVE------------------");
//			System.out.println(p1);
		}
		
		catch(InvalidReconfigurationOperationException rne){
			rne.printStackTrace();
		}
	}

}
