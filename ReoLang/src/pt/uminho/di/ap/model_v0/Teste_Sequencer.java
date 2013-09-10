/**
 * 
 */
package pt.uminho.di.ap.model_v0;

import java.util.HashSet;
import java.util.Set;

import pt.uminho.di.cp.model.graph.Node;

/**
 * @author Nuno Oliveira
 * @date 4 de Abr de 2012
 *
 */
public class Teste_Sequencer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//channel sync
		Node i1 = new Node("in");
		Node o1 = new Node("o1");
		
		Node i2 = new Node("i2");
		Node o2 = new Node("crm");
		
		Node i3 = new Node("i3");
		Node o3 = new Node("o3");
		
		Node i4 = new Node("i4");
		Node o4 = new Node("erp");
		
		Node i5 = new Node("i5");
		Node o5 = new Node("o5");
		
		Node i6 = new Node("i6");
		Node o6 = new Node("ts");
		
		Node i7 = new Node("i7");
		Node o7 = new Node("out");
		
		
		
		Flow f1 = new Flow();
		f1.getRequest().add(i1);
		f1.getRequest().add(o1);
		f1.getFire().add(i1);
		f1.getFire().add(o1);

		
		Flow f2 = new Flow();
		f2.getRequest().add(i2);
		f2.getRequest().add(o2);
		f2.getFire().add(i2);
		f2.getFire().add(o2);
		
		
		Flow f3_1 = new Flow();
		f3_1.getRequest().add(i3);
		f3_1.getFire().add(i3);
		f3_1.setIstate(1);
		f3_1.setFstate(2);
		
		Flow f3_2 = new Flow();
		f3_2.getRequest().add(o3);
		f3_2.getFire().add(o3);
		f3_2.setIstate(2);
		f3_2.setFstate(1);
		
		
		
		Flow f4 = new Flow();
		f4.getRequest().add(i4);
		f4.getRequest().add(o4);
		f4.getFire().add(i4);
		f4.getFire().add(o4);
		
		
		Flow f5_1 = new Flow();
		f5_1.getRequest().add(i5);
		f5_1.getFire().add(i5);
		f5_1.setIstate(1);
		f5_1.setFstate(2);
		
		Flow f5_2 = new Flow();
		f5_2.getRequest().add(o5);
		f5_2.getFire().add(o5);
		f5_2.setIstate(2);
		f5_2.setFstate(1);
		
		
		
		Flow f7 = new Flow();
		f7.getRequest().add(i6);
		f7.getRequest().add(o6);
		f7.getFire().add(i6);
		f7.getFire().add(o6);
		
		Flow f8 = new Flow();
		f8.getRequest().add(i7);
		f8.getRequest().add(o7);
		f8.getFire().add(i7);
		f8.getFire().add(o7);
		
		
		
		Channel sync1 = new Channel();
		sync1.setName("s1");
		sync1.getBehaviour().add(f1);
		sync1.getIn().add(i1);
		sync1.getOut().add(o1);
		
		Channel sync2 = new Channel();
		sync2.setName("s2");
		sync2.getBehaviour().add(f2);
		sync2.getIn().add(i2);
		sync2.getOut().add(o2);
		
		Channel fifo1 = new Channel();
		fifo1.setName("f1");
		fifo1.getBehaviour().add(f3_1);
		fifo1.getBehaviour().add(f3_2);
		fifo1.getIn().add(i3);
		fifo1.getOut().add(o3);
		
		
		Channel sync3 = new Channel();
		sync3.setName("s3");
		sync3.getBehaviour().add(f4);
		sync3.getIn().add(i4);
		sync3.getOut().add(o4);
		
		
		Channel fifo2 = new Channel();
		fifo2.setName("f2");
		fifo2.getBehaviour().add(f5_1);
		fifo2.getBehaviour().add(f5_2);
		fifo2.getIn().add(i5);
		fifo2.getOut().add(o5);
		
		
		Channel sync4 = new Channel();
		sync4.setName("s4");
		sync4.getBehaviour().add(f7);
		sync4.getIn().add(i6);
		sync4.getOut().add(o6);
		
		
		Channel sync5 = new Channel();
		sync5.setName("s5");
		sync5.getBehaviour().add(f8);
		sync5.getIn().add(i7);
		sync5.getOut().add(o7);
		
		System.out.println("Canais");
		System.out.println(sync1.toString());
		System.out.println(sync2.toString());
		System.out.println(fifo1.toString());
		System.out.println(sync3.toString());
		System.out.println(fifo2.toString());
		System.out.println(sync4.toString());
		System.out.println(sync5.toString());
				
		ArchPattern  p = new ArchPattern();
		p.setName("ExRouterPart");
		p.getIn().add(i1);
		p.getOut().add(o2);
		p.getOut().add(o4);
		p.getOut().add(o6);
		p.getOut().add(o7);
		p.getBehaviour().put(sync1.getName(), sync1);
		p.getBehaviour().put(fifo1.getName(), fifo1);
		p.getBehaviour().put(fifo2.getName(),fifo2);
		p.getBehaviour().put(sync2.getName(), sync2);
		p.getBehaviour().put(sync3.getName(), sync3);
		p.getBehaviour().put(sync4.getName(), sync4);
		p.getBehaviour().put(sync5.getName(), sync5);

		Set<Node> j1 = new HashSet<Node>(); 
		j1.add(o1); 
		j1.add(i2);
		j1.add(i3);
		p.getInternalNodes().put("j1", j1);
		Set<Node> j2 = new HashSet<Node>(); 
		j2.add(o3); 
		j2.add(i4);
		j2.add(i5);
		p.getInternalNodes().put("j2", j2);
		Set<Node> j3 = new HashSet<Node>(); 
		j3.add(o5); 
		j3.add(i6);
		j3.add(i7);
		p.getInternalNodes().put("j3", j3);
		
		System.out.println("Padrao");
		System.out.println(p.toString());
		
		System.out.println("Grafo");
		System.out.println(p.toGraph().toString());
		
		p.toGraph().toDotFile("teste_sequencer_graph.dot");
		
		
	}

}


