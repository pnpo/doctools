package pt.uminho.di.imc.parsing;

import java.io.File;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.regex.Pattern;

import pt.uminho.di.imc.IMC;
import pt.uminho.di.imc.IMCTransformer;

public class TestMain {

	  public static void main(String args[]) {
	        
		  //IMCParserWrapper i1 = new IMCParserWrapper(new File("/Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/input/lossy_simple.ma"));
		  //IMCParserWrapper i2 = new IMCParserWrapper(new File("/Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/input/fifo_simple.ma"));
		  IMCParserWrapper i2 = new IMCParserWrapper(new File("/Users/nunooliveira/Desktop/example/lfmin_2.aut"));
		  try {
			 // i1.parse();
			 // IMC imc1 = i1.getImc();
			  i2.parse();
			  IMC imc2 = i2.getImc();
			  
			  System.out.println(imc2.toString());
			  LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
			  map.put("LOSSY_l1_TRl_[a]", 1);
			  System.out.println(new IMCTransformer(imc2).toPRISMTransitionMatrix(map));
			  
			  
			  
			  //Set<String> h = new HashSet<String>();
			  //h.add("b");
			  
			  //IMC imc_12 = imc1.composeAndHide(imc2, h);
			  //IMC imc3 = imc_12.maximalProgressionReduction();
			  //System.out.println((new IMCTransformer(imc3)).toAUTFormat(false));
			  //System.out.println("Transitions: " + imc3.getTransitions().size());
			  //System.out.println("States: " + imc3.getStates().size());
		  }
		  catch (Exception e2) {
			  e2.printStackTrace();
		  }
	  }

}
