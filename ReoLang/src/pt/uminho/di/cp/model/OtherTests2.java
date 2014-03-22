/**
 * 
 */
package pt.uminho.di.cp.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import pt.uminho.di.cp.reconfigurations.*;


/**
 * @date 25 de Out de 2013
 *
 */
public class OtherTests2 {

	public static void main(String[] args) {
	    
		Node a = new Node();
		a.addEnd("a");
		
		Node bc = new Node();
		bc.addEnd("b");
		bc.addEnd("c");
		
		LinkedHashSet<Node> in = new LinkedHashSet<Node>();
		in.add(a);
		LinkedHashSet<Node> out = new LinkedHashSet<Node>();
		out.add(bc);
		CommunicationMean2 cm1 = new CommunicationMean2(); //"a", "s1", "sync", "b.c"
		cm1.setId("s1");
		cm1.setType("sync");
		cm1.setInodes(in);
		cm1.setOnodes(out);
		
		in = new LinkedHashSet<Node>();
		in.add(bc);
		Node d = new Node();
		d.addEnd("d");
		out = new LinkedHashSet<Node>();
		out.add(d);
		CommunicationMean2 cm2 = new CommunicationMean2(); //"b.c", "s2", "sync", "d"
		cm2.setId("s2");
		cm2.setType("sync");
		cm2.setInodes(in);
		cm2.setOnodes(out);
		
		Node e = new Node();
		e.addEnd("e");
		in = new LinkedHashSet<Node>();
		in.add(e);
		Node f = new Node();
		f.addEnd("f");
		out = new LinkedHashSet<Node>();
		out.add(f);
		CommunicationMean2 cm3 = new CommunicationMean2(); //"e", "f1", "fifo_e", "f"
		cm3.setId("f1");
		cm3.setType("fifo_e");
		cm3.setInodes(in);
		cm3.setOnodes(out);
		
		

		CoordinationPattern2 p = new CoordinationPattern2();
		p.setId("p1");
		Set<CommunicationMean2> cms = new HashSet<CommunicationMean2>();
		cms.add(cm1);
		cms.add(cm2);
		cms.add(cm3);
		p.setPattern(cms);
		
		System.out.println("INIT------------------");
		System.out.println(p);
		
		Id id = new Id();
		p = id.apply(p, true);
		System.out.println("ID------------------");
		System.out.println(p);
		
		
		Node g = new Node();
		g.addEnd("g");
		
		Node hi = new Node();
		hi.addEnd("h");
		hi.addEnd("i");
		
		in = new LinkedHashSet<Node>();
		in.add(g);
		out = new LinkedHashSet<Node>();
		out.add(hi);
		CommunicationMean2 cm4 = new CommunicationMean2(); //"g", "s3", "sync", "h.i"
		cm4.setId("s3");
		cm4.setType("sync");
		cm4.setInodes(in);
		cm4.setOnodes(out);
		
		in = new LinkedHashSet<Node>();
		in.add(hi);
		Node j = new Node();
		j.addEnd("j");
		out = new LinkedHashSet<Node>();
		out.add(j);
		CommunicationMean2 cm5 = new CommunicationMean2(); //"h.i", "s4", "sync", "j"
		cm5.setId("s4");
		cm5.setType("sync");
		cm5.setInodes(in);
		cm5.setOnodes(out);
		
		CoordinationPattern2 p2 = new CoordinationPattern2();
		p2.setId("p2");
		Set<CommunicationMean2> cms2 = new HashSet<CommunicationMean2>();
		cms2.add(cm4);
		cms2.add(cm5);
		p2.setPattern(cms2);
		
//		Const cons = new Const(p2);
//		p = cons.apply(p, true);
//		System.out.println("CONST------------------");
//		System.out.println(p);
		
		Par par = new Par(p2);
		p = par.apply(p, true);
		System.out.println("PAR------------------");
		System.out.println(p);
		
		LinkedHashSet<Node> n = new LinkedHashSet<Node>();
		n.add(d);
		n.add(e);
		n.add(g);
		Join join = new Join(n);
		p = join.apply(p, true);
		System.out.println("JOIN------------------");
		System.out.println(p);

//		Node deg = new Node();
//		deg.addEnd("d");
//		deg.addEnd("e");
//		deg.addEnd("g");
		Split split = new Split(hi);
		p = split.apply(p, true);
		System.out.println("SPLIT------------------");
		System.out.println(p);
		
		Remove remove = new Remove("s1");
		p = remove.apply(p, true);
		System.out.println("REMOVE------------------");
		System.out.println(p);
	}

}