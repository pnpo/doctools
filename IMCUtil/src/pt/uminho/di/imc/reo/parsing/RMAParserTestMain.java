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
			 lossy_ab.setAttribute("a", "b");
			 lossy_ab.setAttribute("b", "c");
			 lossy_ab.setAttribute("ga", "1.0");
			 lossy_ab.setAttribute("gb", "1.1");
			 lossy_ab.setAttribute("gaL", "1.2");
			 lossy_ab.setAttribute("gab", "1.3");
			 lossy_ab.setAttribute("id", "l1");
			 
			 //System.out.println(lossy_ab.toString() + "\n");
			 
			 StringTemplate fifo_bc = group.getInstanceOf("pt/uminho/di/imc/reo/templates/fifo1e");
			 fifo_bc.setAttribute("a", "c");
			 fifo_bc.setAttribute("b", "d");
			 fifo_bc.setAttribute("ga", "2.0");
			 fifo_bc.setAttribute("gb", "2.1");
			 fifo_bc.setAttribute("gaB", "2.2");
			 fifo_bc.setAttribute("gBb", "2.3");
			 fifo_bc.setAttribute("id", "f1");
			 
			 
			 //System.out.println(lossy_ab.toString() + "\n");
			
			 
			 
			 ReoMAParserLexer lex1 = new ReoMAParserLexer(new ANTLRStringStream(lossy_ab.toString()));
			 CommonTokenStream tokens1 = new CommonTokenStream(lex1);
			 ReoMAParserParser g1 = new ReoMAParserParser(tokens1);
			 g1.imc();
			 
			 ReoMAParserLexer lex2 = new ReoMAParserLexer(new ANTLRStringStream(fifo_bc.toString()));
			 CommonTokenStream tokens2 = new CommonTokenStream(lex2);
			 ReoMAParserParser g2 = new ReoMAParserParser(tokens2);
			 g2.imc();
			 
//			 ReoMAParserLexer lex3 = new ReoMAParserLexer(new ANTLRFileStream("/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/reo_imc/replicator_efg.rma", "UTF8"));
//			 CommonTokenStream tokens3 = new CommonTokenStream(lex3);
//			 ReoMAParserParser g3 = new ReoMAParserParser(tokens3);
//			 g3.imc();

			 IMCREOimc imc1 = g1.getIMC();
			 IMCREOimc imc2 = g2.getIMC();
			 
			 System.out.println(imc1);
			 System.out.println("++++++++++++++++++++++++++++++++\n+++++++++++++++++++++++++++++++++\n" );
			 System.out.println(imc2);
			 
//			 IMCREOimc<IMCREOState> imc3 = g3.getIMC();
		 
			//System.out.println(imc1.toString());
			//System.out.println(imc2.toString());
//			System.out.println(imc3.toString());
			 
			 HashSet<String> mixedports1 = new HashSet<String>(1);
			 mixedports1.add("c");
			 
//			 HashSet<String> mixedports2 = new HashSet<String>(1);
//			 mixedports2.add("e");
			 
//			 LinkedList<String> sorted_ports = new LinkedList<String>();
//			 sorted_ports.add("d");
//			 sorted_ports.add("a");
//			 sorted_ports.add("b");
//			 sorted_ports.add("c");
//			 so  rted_ports.add("e");
			 
			
			 long startTime = System.currentTimeMillis();
			 IMCREOimc res = imc1.compose(imc2, mixedports1);//.synchronise(mixedports1);
//			 res = res.compose(imc3, mixedports2).synchronise(mixedports2);
//			 IMCREOimc<IMCREOState> res = imc1.compose(imc2, mixedports1).synchronise(mixedports1, sorted_ports).compose(imc3, mixedports2).synchronise(mixedports2, sorted_ports);
			 
			//		 mixedports1.addAll(mixedports2);
//					 res.hide(mixedports1);
//			 
//			 
			 System.out.println("++++++++++++++++++++++++++++++++\n+++++++++++++++++++++++++++++++++\n" );
			 System.out.println(res.toString());
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
