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
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//channel sync
		Node i1 = new Node("i1");
		Node o1 = new Node("o1");
		Node i2 = new Node("i2");
		Node o2 = new Node("o2");
		Node i3 = new Node("i3");
		Node i4 = new Node("i4");
		Node i5 = new Node("i5");
		Node o3 = new Node("o3");
		Node i6 = new Node("i6");
		Node o4 = new Node("o4");
		Node i7 = new Node("i7");
		Node o5 = new Node("o5");
		Node i8 = new Node("i8");
		Node o6 = new Node("o6");
		Node i9 = new Node("i9");
		Node o7 = new Node("o7");
		
		
		Flow f1 = new Flow();
		f1.getRequest().add(i1);
		f1.getRequest().add(o1);
		f1.getFire().add(i1);
		f1.getFire().add(o1);
		
		Flow f2_1 = new Flow();
		f2_1.getRequest().add(i2);
		f2_1.getRequest().add(o2);
		f2_1.getFire().add(i2);
		f2_1.getFire().add(o2);
		
		Flow f2_2 = new Flow();
		f2_2.getRequest().add(i2);
		f2_2.getFire().add(i2);
		
		Flow f3 = new Flow();
		f3.getRequest().add(i3);
		f3.getRequest().add(i4);
		f3.getFire().add(i3);
		f3.getFire().add(i4);
		
		Flow f4 = new Flow();
		f4.getRequest().add(i5);
		f4.getRequest().add(o3);
		f4.getFire().add(i5);
		f4.getFire().add(o3);
		
		Flow f5 = new Flow();
		f5.getRequest().add(i6);
		f5.getRequest().add(o4);
		f5.getFire().add(i6);
		f5.getFire().add(o4);
		
		Flow f6_1 = new Flow();
		f6_1.getRequest().add(i7);
		f6_1.getRequest().add(o5);
		f6_1.getFire().add(i7);
		f6_1.getFire().add(o5);
		
		Flow f6_2 = new Flow();
		f6_2.getRequest().add(i7);
		f6_2.getFire().add(i7);
		
		
		Flow f7 = new Flow();
		f7.getRequest().add(i8);
		f7.getRequest().add(o6);
		f7.getFire().add(i8);
		f7.getFire().add(o6);
		
		Flow f8 = new Flow();
		f8.getRequest().add(i9);
		f8.getRequest().add(o7);
		f8.getFire().add(i9);
		f8.getFire().add(o7);
		
		Channel sync1 = new Channel();
		sync1.setName("sync1");
		sync1.getBehaviour().add(f1);
		sync1.getIn().add(i1);
		sync1.getOut().add(o1);
		
		Channel lossy = new Channel();
		lossy.setName("lossy");
		lossy.getBehaviour().add(f2_1);
		lossy.getBehaviour().add(f2_2);
		lossy.getIn().add(i2);
		lossy.getOut().add(o2);
		
		Channel sdrain = new Channel();
		sdrain.setName("sdrain");
		sdrain.getBehaviour().add(f3);
		sdrain.getIn().add(i3);
		sdrain.getIn().add(i4);
		
		Channel sync2 = new Channel();
		sync2.setName("sync2");
		sync2.getBehaviour().add(f4);
		sync2.getIn().add(i5);
		sync2.getOut().add(o3);
		
		
		Channel sync3 = new Channel();
		sync3.setName("sync3");
		sync3.getBehaviour().add(f5);
		sync3.getIn().add(i6);
		sync3.getOut().add(o4);
		
		Channel lossy2 = new Channel();
		lossy2.setName("lossy2");
		lossy2.getBehaviour().add(f6_1);
		lossy2.getBehaviour().add(f6_2);
		lossy2.getIn().add(i7);
		lossy2.getOut().add(o5);
		
		
		
		Channel sync4 = new Channel();
		sync4.setName("sync4");
		sync4.getBehaviour().add(f7);
		sync4.getIn().add(i8);
		sync4.getOut().add(o6);
		
		
		Channel sync5 = new Channel();
		sync5.setName("sync5");
		sync5.getBehaviour().add(f8);
		sync5.getIn().add(i9);
		sync5.getOut().add(o7);
		
		System.out.println("Canais");
		System.out.println(sync1.toString());
		System.out.println(lossy.toString());
		System.out.println(lossy2.toString());
		System.out.println(sdrain.toString());
		//System.out.println(sync2.toString());
		System.out.println(sync3.toString());
		System.out.println(sync4.toString());
		System.out.println(sync5.toString());
				
		ArchPattern  p = new ArchPattern();
		p.setName("Split");
		p.getIn().add(i1);
		p.getOut().add(o2);
		p.getOut().add(o5);
		p.getBehaviour().put(sync1.getName(), sync1);
		p.getBehaviour().put(lossy.getName(), lossy);
		p.getBehaviour().put(lossy2.getName(), lossy2);
		Set<Node> j1 = new HashSet<Node>(); 
		j1.add(i2); 
		j1.add(o1);
		j1.add(i7);
		p.getInternalNodes().put("j1", j1);
		
		
		ArchPattern  p2 = new ArchPattern();
		p2.setName("Synchroniser");
		p2.getIn().add(i6);
		p2.getIn().add(i9);
		p2.getOut().add(o6);
		p2.getBehaviour().put(sync3.getName(), sync3);
		p2.getBehaviour().put(sync4.getName(), sync4);
		p2.getBehaviour().put(sync5.getName(), sync5);
		p2.getBehaviour().put(sdrain.getName(), sdrain);
		
		Set<Node> j2 = new HashSet<Node>(); 
		j2.add(o4); 
		j2.add(i3);
		j2.add(i8);
		p2.getInternalNodes().put("j2", j2);
		Set<Node> j3 = new HashSet<Node>(); 
		j3.add(i4); 
		j3.add(o7);
		p2.getInternalNodes().put("j3", j3);
		
		
		
		
		ArchPattern  p3 = new ArchPattern();
		p3.setName("SplitSynchroniser");
		p3.getIn().add(i1);
		p3.getOut().add(o6);
		p3.getBehaviour().put(p.getName(), p);
		p3.getBehaviour().put(p2.getName(), p2);
		
		
		Set<Node> j4 = new HashSet<Node>(); 
		j4.add(o2); 
		j4.add(i6);
		p3.getInternalNodes().put("j4", j4);
		Set<Node> j5 = new HashSet<Node>(); 
		j5.add(o5); 
		j5.add(i9);
		p3.getInternalNodes().put("j5", j5);
		
		
		
		System.out.println("Padrao");
		System.out.println(p.toString());
		System.out.println("Padrao");
		System.out.println(p2.toString());
		System.out.println("Padrao");
		System.out.println(p3.toString());
		
		System.out.println("Grafos");
		System.out.println(p.toGraph().toString());
		System.out.println(p2.toGraph().toString());
		System.out.println(p3.toGraph().toString());
		
		p.toGraph().toDotFile("teste_reo2_graph.dot");
		p2.toGraph().toDotFile("teste_reo3_graph.dot");
		p3.toGraph().toDotFile("teste_reo4_graph.dot");
		
		
	}

}

/*

ExRouter
Canais
<[i1],[o1],[([i1, o1],[i1, o1])]>
<[i2],[o2],[([i2, o2],[i2, o2]), ([i2],[i2])]>
<[i4, i3],[],[([i4, i3],[i4, i3])]>
<[i5],[o3],[([o3, i5],[o3, i5])]>
<[i6],[o4],[([o4, i6],[o4, i6])]>
<[i7],[o5],[([i7, o5],[i7, o5]), ([i7],[i7])]>
<[i8],[o6],[([i8, o6],[i8, o6])]>
<[i9],[o7],[([o7, i9],[o7, i9])]>
Padrao
<[i1],[o4, o7],{lossy=<[i2],[o2],[([i2, o2],[i2, o2]), ([i2],[i2])]>, sync5=<[i9],[o7],[([o7, i9],[o7, i9])]>, sync4=<[i8],[o6],[([i8, o6],[i8, o6])]>, sync3=<[i6],[o4],[([o4, i6],[o4, i6])]>, sync2=<[i5],[o3],[([o3, i5],[o3, i5])]>, sync1=<[i1],[o1],[([i1, o1],[i1, o1])]>, lossy2=<[i7],[o5],[([i7, o5],[i7, o5]), ([i7],[i7])]>, sdrain=<[i4, i3],[],[([i4, i3],[i4, i3])]>},{j4=[i9, o5, i8], j2=[o2, i6, i5], j3=[o3, o6, i4], j1=[o1, i7, i3, i2]}>
Grafo
[(j1 >i2< ,j2 >o2< ), (j4 >i8< ,j3 >o6< ), (j4 >i9< ,o7), (j2 >i6< ,o4), (j1 >i7< ,j4 >o5< ), (j3 >i4< ,j1 >i3< ), (j2 >i5< ,j3 >o3< ), (i1,j1 >o1< )]



Canais
<[i1],[o1],[([i1, o1],[i1, o1])]>
<[i2],[o2],[([i2],[i2]), ([i2, o2],[i2, o2])]>
<[i7],[o5],[([i7, o5],[i7, o5]), ([i7],[i7])]>
<[i4, i3],[],[([i4, i3],[i4, i3])]>
<[i6],[o4],[([o4, i6],[o4, i6])]>
<[i8],[o6],[([i8, o6],[i8, o6])]>
<[i9],[o7],[([o7, i9],[o7, i9])]>
Padrao
<[i1],[o2, o5],{sync1=<[i1],[o1],[([i1, o1],[i1, o1])]>, lossy=<[i2],[o2],[([i2],[i2]), ([i2, o2],[i2, o2])]>, lossy2=<[i7],[o5],[([i7, o5],[i7, o5]), ([i7],[i7])]>},{j1=[o1, i7, i2]}>
Padrao
<[i6, i9],[o6],{sync5=<[i9],[o7],[([o7, i9],[o7, i9])]>, sync4=<[i8],[o6],[([i8, o6],[i8, o6])]>, sync3=<[i6],[o4],[([o4, i6],[o4, i6])]>, sdrain=<[i4, i3],[],[([i4, i3],[i4, i3])]>},{j2=[o4, i8, i3], j3=[o7, i4]}>
Padrao
<[i1],[o6],{Split=<[i1],[o2, o5],{sync1=<[i1],[o1],[([i1, o1],[i1, o1])]>, lossy=<[i2],[o2],[([i2],[i2]), ([i2, o2],[i2, o2])]>, lossy2=<[i7],[o5],[([i7, o5],[i7, o5]), ([i7],[i7])]>},{j1=[o1, i7, i2]}>, Synchroniser=<[i6, i9],[o6],{sync5=<[i9],[o7],[([o7, i9],[o7, i9])]>, sync4=<[i8],[o6],[([i8, o6],[i8, o6])]>, sync3=<[i6],[o4],[([o4, i6],[o4, i6])]>, sdrain=<[i4, i3],[],[([i4, i3],[i4, i3])]>},{j2=[o4, i8, i3], j3=[o7, i4]}>},{j4=[o2, i6], j5=[i9, o5]}>
Grafos
[(i1,j1 >o1< ), (j1 >i7< ,o5), (j1 >i2< ,o2)]
[(i6,j2 >o4< ), (j3 >i4< ,j2 >i3< ), (i9,j3 >o7< ), (j2 >i8< ,o6)]
[(j1 >i7< ,j5 >o5< ), (j1 >i2< ,j4 >o2< ), (j2 >i8< ,o6), (j3 >i4< ,j2 >i3< ), (i1,j1 >o1< ), (j5 >i9< ,j3 >o7< ), (j4 >i6< ,j2 >o4< )]



 */
