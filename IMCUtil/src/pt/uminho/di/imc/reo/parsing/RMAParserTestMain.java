package pt.uminho.di.imc.reo.parsing;


import java.util.HashSet;


import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;


import pt.uminho.di.imc.IMCTransformer;
import pt.uminho.di.imc.reo.imc.IMCREOState;
import pt.uminho.di.imc.reo.imc.IMCREOimc;

public class RMAParserTestMain {

	

	
	
	  public static void main(String args[]) {
	        
		 try{
		
			 

			 StringTemplateGroup group = new StringTemplateGroup("imc_templates");
			 
			 
			 StringTemplate lossy_ab = group.getInstanceOf("pt/uminho/di/imc/reo/templates/lossy");
			 lossy_ab.setAttribute("a", "a");
			 lossy_ab.setAttribute("b", "b");
			 lossy_ab.setAttribute("ga", "1.0");
			 lossy_ab.setAttribute("gb", "1.1");
			 lossy_ab.setAttribute("gaL", "1.2");
			 lossy_ab.setAttribute("gab", "1.3");
			 lossy_ab.setAttribute("id", "l1");
			 
			 //System.out.println(lossy_ab.toString() + "\n");
			 
			 StringTemplate fifo_bc = group.getInstanceOf("pt/uminho/di/imc/reo/templates/fifo1e");
			 fifo_bc.setAttribute("a", "a");
			 fifo_bc.setAttribute("b", "b");
			 fifo_bc.setAttribute("ga", "2.0");
			 fifo_bc.setAttribute("gb", "2.1");
			 fifo_bc.setAttribute("gaB", "2.2");
			 fifo_bc.setAttribute("gBb", "2.3");
			 fifo_bc.setAttribute("id", "f1");
			 
			 StringTemplate fifo2_bc = group.getInstanceOf("pt/uminho/di/imc/reo/templates/fifo1f");
			 fifo2_bc.setAttribute("a", "b");
			 fifo2_bc.setAttribute("b", "a");
			 fifo2_bc.setAttribute("ga", "2.0");
			 fifo2_bc.setAttribute("gb", "2.1");
			 fifo2_bc.setAttribute("gaB", "2.2");
			 fifo2_bc.setAttribute("gBb", "2.3");
			 fifo2_bc.setAttribute("id", "f2");
			 
			 
			 //System.out.println(lossy_ab.toString() + "\n");
			
			 
			 StringTemplate sync_ab = group.getInstanceOf("pt/uminho/di/imc/reo/templates/sync");
			 sync_ab.setAttribute("a", "b");
			 sync_ab.setAttribute("b", "c");
			 sync_ab.setAttribute("ga", "2.0");
			 sync_ab.setAttribute("gb", "2.1");
			 sync_ab.setAttribute("gab", "2.2");
			 sync_ab.setAttribute("id", "s1");
			 
			 
			 
			 ReoMAParserLexer lex1 = new ReoMAParserLexer(new ANTLRStringStream(lossy_ab.toString()));
			 CommonTokenStream tokens1 = new CommonTokenStream(lex1);
			 ReoMAParserParser g1 = new ReoMAParserParser(tokens1);
			 g1.imc();
			 
			 ReoMAParserLexer lex2 = new ReoMAParserLexer(new ANTLRStringStream(fifo_bc.toString()));
			 CommonTokenStream tokens2 = new CommonTokenStream(lex2);
			 ReoMAParserParser g2 = new ReoMAParserParser(tokens2);
			 g2.imc();
			 
			 ReoMAParserLexer lex3 = new ReoMAParserLexer(new ANTLRStringStream(sync_ab.toString()));
			 CommonTokenStream tokens3 = new CommonTokenStream(lex3);
			 ReoMAParserParser g3 = new ReoMAParserParser(tokens3);
			 g3.imc();
			 
			 ReoMAParserLexer lex4 = new ReoMAParserLexer(new ANTLRStringStream(fifo2_bc.toString()));
			 CommonTokenStream tokens4 = new CommonTokenStream(lex4);
			 ReoMAParserParser g4 = new ReoMAParserParser(tokens4);
			 g4.imc();

			 IMCREOimc imc1 = g1.getIMC();
			 IMCREOimc imc2 = g2.getIMC();
			 IMCREOimc imc3 = g3.getIMC();
			 IMCREOimc imc4 = g4.getIMC();
			 
//			 System.out.println(imc1);
//			 System.out.println("++++++++++++++++++++++++++++++++\n+++++++++++++++++++++++++++++++++\n" );
//			 System.out.println(imc2);
			 
//			 IMCREOimc<IMCREOState> imc3 = g3.getIMC();
		 
			//System.out.println(imc1.toString());
			//System.out.println(imc2.toString());
//			System.out.println(imc3.toString());
			 
			 HashSet<String> mixedports1 = new HashSet<String>(1);
			 mixedports1.add("b");
//			 HashSet<String> mixedports2 = new HashSet<String>(2);
//			 mixedports2.add("c");
			 HashSet<String> mixedports3 = new HashSet<String>(2);
			 mixedports3.add("b");
			 mixedports3.add("a");
			 
//			 HashSet<String> mixedports2 = new HashSet<String>(1);
//			 mixedports2.add("e");
			 
//			 LinkedList<String> sorted_ports = new LinkedList<String>();
//			 sorted_ports.add("d");
//			 sorted_ports.add("a");
//			 sorted_ports.add("b");
//			 sorted_ports.add("c");
//			 so  rted_ports.add("e");
			 
			
			 long startTime = System.currentTimeMillis();
			 IMCREOimc res = imc2.compose(imc4, mixedports3);//.compose(imc3, mixedports2).mixedRequestsReduction(mixedports3);//.synchronise(mixedports1);
//			 res = res.compose(imc3, mixedports2).synchronise(mixedports2);
//			 IMCREOimc<IMCREOState> res = imc1.compose(imc2, mixedports1).synchronise(mixedports1, sorted_ports).compose(imc3, mixedports2).synchronise(mixedports2, sorted_ports);
			 
			//		 mixedports1.addAll(mixedports2);
//					 res.hide(mixedports1);
//			 
			 System.out.println("++++++++++++++++++++++++++++++++\n+++ COMOPSE +++\n+++++++++++++++++++++++++++++++++\n" );
			 System.out.println(res);
			 System.out.println("++++++++++++++++++++++++++++++++\n+++ REDUCTION +++\n+++++++++++++++++++++++++++++++++\n" );
			 res = res.mixedRequestsReduction(mixedports3);
			 System.out.println(res);
			 System.out.println("++++++++++++++++++++++++++++++++\n+++ NONDETERMINISM +++\n+++++++++++++++++++++++++++++++++\n" );
			 res = res.removeForcedNonDeterminism(mixedports3);
			 System.out.println(res);
			 System.out.println("++++++++++++++++++++++++++++++++\n+++ ORDER +++\n+++++++++++++++++++++++++++++++++\n" );
			 res = res.removeTransitionsIncorrectOrder();
			 System.out.println(res);
			 System.out.println("++++++++++++++++++++++++++++++++\n+++ ORDER +++\n+++++++++++++++++++++++++++++++++\n" );
			 res = res.removeUndesiredTransitions(mixedports3);
			 System.out.println(res);

//			 System.out.println(res.toReoMA());
//			 System.out.println(new IMCTransformer(res.toIMC(false)).toMAFormat());
			 
			 
			 
			 long endTime   = System.currentTimeMillis();
			 long totalTime = endTime - startTime;
			 System.out.println("took..." + totalTime);
			 
			 
			 
//			 HashSet<Pair<String, String>> hs = new HashSet<Pair<String,String>>();
//			 hs.add(new Pair<String, String>("a","b"));
//			 hs.add(new Pair<String, String>("b","c"));
//			 hs.add(new Pair<String, String>("c","d"));
//			 hs.add(new Pair<String, String>("c","e"));
//			 hs.add(new Pair<String, String>("e","f"));
//			 POPorts testset = new POPorts(hs);
//			 
//			 System.out.println(testset.toString());
//			 System.out.println(testset._transmit_before_("a", "d"));
			 
			
			 
			 
			 
			 
			 
		  }
		  catch (Exception e2) {
			  e2.printStackTrace();
		  }
	  }
	  
	  
	  

}
