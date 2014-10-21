package pt.uminho.di.reolang;



import org.antlr.runtime.*;
import pt.uminho.di.reolang.parsing.RSLTranformer;

public class Main {

    public static void main(String args[]) throws Exception {
        
    	String file = "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/runtime-EclipseApplication/Test/sequencer.cpla";
    	
    	RSLTranformer rsl = new RSLTranformer(file, new ANTLRFileStream(file, "UTF8").toString());
    	String rsl_code = rsl.translateToRSL();
    	System.out.println(rsl_code);
    	
    	
    	
    	
//    	Semantics c = new Semantics(file, new ANTLRFileStream(file, "UTF8").toString());
//    	c.performSemanticAnalysis(new SymbolsTable());
//    	System.out.println(c.getErrors());
//    	
//    	CPBuilder cpb = new CPBuilder(file);
//    	ReoLangCP2 rlcp = cpb.performModelConstruction(new LinkedHashMap<String, CPModelInternal>(), new SymbolsTable());
//    	System.out.println(rlcp.getPatterns().toString());
    }
  
    	
}