/**
 * 
 */
package pt.uminho.di.cp.model;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import pt.uminho.di.cp.reconfigurations.*;
import pt.uminho.di.reolang.parsing.util.Pair;


/**
 * @date 25 de Out de 2013
 *
 */
public class OtherTests3 {

	public static void main(String[] args) {
	    
		Node fe = new Node();
		fe.addEnd("fe");
		
		Node hre = new Node();
		hre.addEnd("hre");
		
		LinkedHashSet<Node> in = new LinkedHashSet<Node>();
		in.add(fe);
		LinkedHashSet<Node> out = new LinkedHashSet<Node>();
		out.add(hre);
		CommunicationMean2 fifo = new CommunicationMean2(); //"a", "s1", "sync", "b.c"
		fifo.setId("f1");
		fifo.setType("fifo");
		fifo.setInodes(in);
		fifo.setOnodes(out);
		
		CoordinationPattern2 original = new CoordinationPattern2();
		original.setId("Original");
		Set<CommunicationMean2> cms = new HashSet<CommunicationMean2>();
		cms.add(fifo);
		original.setPattern(cms);
		
		
		
		
		Node a = new Node();
		fe.addEnd("a");
		
		Node hre1 = new Node();
		hre.addEnd("hre1");
		Node hre2 = new Node();
		hre.addEnd("hre2");
		
		Node x = new Node();
		hre.addEnd("x");
		
		in = new LinkedHashSet<Node>();
		in.add(a);
		out = new LinkedHashSet<Node>();
		out.add(x);
		CommunicationMean2 sync1 = new CommunicationMean2(); //"a", "s1", "sync", "x"
		sync1.setId("s1");
		sync1.setType("sync");
		sync1.setInodes(in);
		sync1.setOnodes(out);
		
		in = new LinkedHashSet<Node>();
		in.add(x);
		out = new LinkedHashSet<Node>();
		out.add(hre1);
		CommunicationMean2 sync2 = new CommunicationMean2(); //"x", "s2", "sync", "hre1"
		sync2.setId("s2");
		sync2.setType("sync");
		sync2.setInodes(in);
		sync2.setOnodes(out);
		
		in = new LinkedHashSet<Node>();
		in.add(x);
		out = new LinkedHashSet<Node>();
		out.add(hre2);
		CommunicationMean2 sync3 = new CommunicationMean2(); //"x", "s3", "sync", "hre2"
		sync3.setId("s3");
		sync3.setType("sync");
		sync3.setInodes(in);
		sync3.setOnodes(out);
		
		

		CoordinationPattern2 exrouter = new CoordinationPattern2();
		exrouter.setId("ExRouter");
		Set<CommunicationMean2> cms2 = new HashSet<CommunicationMean2>();
		cms2.add(sync1);
		cms2.add(sync2);
		cms2.add(sync3);
		exrouter.setPattern(cms2);
		
		
		
		
		System.out.println("INIT------------------");
		System.out.println(original);
		
		
		System.out.println("CP TO OVERLAP------------------");
		System.out.println(exrouter);
		
		Pair<Node,Node> pair = new Pair<Node,Node>();
		pair.setFirst(hre);
		//pair.setSecond(lm);
		pair.setSecond(a);
		LinkedHashSet<Pair<Node,Node>> nodes = new LinkedHashSet<Pair<Node,Node>>();
		nodes.add(pair);
		OverlapP overlap = new OverlapP(exrouter, nodes);
		original = overlap.apply(original);
		System.out.println("OVERLAP------------------");
		System.out.println(original);
	}

}
