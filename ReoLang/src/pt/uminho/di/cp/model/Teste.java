/**
 * 
 */
package pt.uminho.di.cp.model;

import java.util.LinkedHashMap;
import java.util.Set;



/**
 * @author Nuno Oliveira
 * @date 4 de Abr de 2013
 *
 */
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashMap<String, Double> sv1 = new LinkedHashMap<String, Double>();
		sv1.put("a", new Double(1.0));
	    sv1.put("j1", new Double(1.1));
	    sv1.put("aj1", new Double(1.2));
	    CommunicationMean c1 = new StochasticCommunicationMean("a", "s1", "sync", "j1", sv1);
	    
	    LinkedHashMap<String, Double> sv2 = new LinkedHashMap<String, Double>();
		sv2.put("j1", new Double(2.0));
	    sv2.put("b", new Double(2.1));
	    sv2.put("j1b", new Double(2.2));
		CommunicationMean c2 = new StochasticCommunicationMean("j1", "s2", "sync", "b", sv2);
		
		LinkedHashMap<String, Double> sv3 = new LinkedHashMap<String, Double>();
		sv3.put("j1", new Double(3.0));
	    sv3.put("j2", new Double(3.1));
	    sv3.put("j1B", new Double(3.2));
	    sv3.put("Bj2", new Double(3.3));
		CommunicationMean c3 = new StochasticCommunicationMean("j1", "f1", "fifo1e", "j2", sv3);
		
		LinkedHashMap<String, Double> sv4 = new LinkedHashMap<String, Double>();
		sv4.put("j2", new Double(4.0));
	    sv4.put("c", new Double(4.1));
	    sv4.put("j2c", new Double(4.2));
		CommunicationMean c4 = new StochasticCommunicationMean("j2", "s3", "sync", "c", sv4);
		
		
		LinkedHashMap<String, Double> sv5 = new LinkedHashMap<String, Double>();
		sv5.put("j2", new Double(5.0));
	    sv5.put("d", new Double(5.1));
	    sv5.put("j2d", new Double(5.2));
		CommunicationMean c5 = new StochasticCommunicationMean("j2", "s4", "sync", "d", sv5);
		
		
		LinkedHashMap<String, Double> sv6 = new LinkedHashMap<String, Double>();
		sv6.put("j2", new Double(6.0));
	    sv6.put("e", new Double(6.1));
	    sv6.put("j2e", new Double(6.2));
		CommunicationMean c6 = new StochasticCommunicationMean("j2", "s5", "sync", "e", sv6);
		
		
		LinkedHashMap<String, Double> sv7 = new LinkedHashMap<String, Double>();
		sv7.put("j2", new Double(7.0));
	    sv7.put("f", new Double(7.1));
	    sv7.put("j2f", new Double(7.2));
		CommunicationMean c7 = new StochasticCommunicationMean("j2", "s5", "sync", "f", sv7);
		
		
		
		
		CoordinationPattern p = new CoordinationPattern();
		p.getPattern().add(c1);
		p.getPattern().add(c2);
		p.getPattern().add(c3);
		p.getPattern().add(c4);
		p.getPattern().add(c5);
		//p.getPattern().add(c6);
		//p.getPattern().add(c7);
		
		System.out.println(p);
		System.out.println(p.getInputPorts());
		System.out.println(p.getOutputPorts());
		
		p.intoIMCScript();
		
		
		
		
		/** Testes Flávio **/
		
		ReconfigurableCoordinationPattern p1 = new ReconfigurableCoordinationPattern();
		p1.getPattern().add(c1);
		p1.getPattern().add(c2);
//		p1.getPattern().add(c3);
		
		System.out.println("INIT------------------");
		System.out.println(p1);
		
		//ReconfigurableCoordinationPattern rp = new ReconfigurableCoordinationPattern();
		if (!(p1 instanceof ReconfigurableCoordinationPattern)){
			p1 = new ReconfigurableCoordinationPattern(p1);
		}
		
		//force reconfig
		p1 = new ReconfigurableCoordinationPattern(p1);
		
		System.out.println("RecCP------------------");
		System.out.println(p1);
		
		
		p1.id();
		System.out.println("ID------------------");
		System.out.println(p1);
		
		
		ReconfigurableCoordinationPattern p2 = new ReconfigurableCoordinationPattern("test1");
		p2.getPattern().add(c5);
		p2.getPattern().add(c6);
		//p2.getPattern().add(c7);
		
		p1.par(p2);
		System.out.println("PAR------------------");
		System.out.println(p1);
		

		p1.constant(p2);
		//p.constant(cp2);
		System.out.println("CONST------------------");
		System.out.println(p1);
		
		
		
		ReconfigurableCoordinationPattern p3 = new ReconfigurableCoordinationPattern("test2");
		p3.getPattern().add(c6);


		p1.par(p3).constant(p2);
		System.out.println("PAR+CONST------------------");
		System.out.println(p1);
		
		
		//PROBLEM: exemplo: p1.par(p2) e depois p1.par(p2).constant(p3)ou p1.par(p2).par(p2)
		////ConcurrentModificationException
		
//		Set<String> n = null;
//		n.add("unnamed.a");
//		n.add("unnamed.j1");
//		
//		p1.join(n, "z");
//		//p.constant(cp2);
//		System.out.println("JOIN------------------");
//		System.out.println(p1);
		
	}

}
