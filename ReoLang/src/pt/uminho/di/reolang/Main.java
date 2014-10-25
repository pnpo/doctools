package pt.uminho.di.reolang;



import java.util.LinkedHashMap;

import org.antlr.runtime.*;

import pt.uminho.di.cp.model.CPModelInternal;
import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.reolang.parsing.CPBuilder;
import pt.uminho.di.reolang.parsing.RSLTranformer;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;

public class Main {

    public static void main(String args[]) throws Exception {
        
    	String file = "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/runtime-EclipseApplication(1)/teste/channels.cpla";
    	
//    	RSLTranformer rsl = new RSLTranformer(file, new ANTLRFileStream(file, "UTF8").toString());
//    	String rsl_code = rsl.translateToRSL();
//    	System.out.println(rsl_code);
    	
    	
    	
    	
//    	Semantics c = new Semantics(file, new ANTLRFileStream(file, "UTF8").toString());
//    	c.performSemanticAnalysis(new SymbolsTable());
//    	System.out.println(c.getErrors());
//    	
    	CPBuilder cpb = new CPBuilder(file);
    	ReoLangCP2 rlcp = cpb.performModelConstruction(new LinkedHashMap<String, CPModelInternal>(), new SymbolsTable());
    	System.out.println(rlcp.getPatterns().toString());
    	for(String cpname : rlcp.getPatterns().keySet()){
    		System.out.println(rlcp.getPatterns().get(cpname).getSimplePattern().toCooPLa());
    		for(String iname: rlcp.getPatterns().get(cpname).getStochInstances().keySet()){
    			System.out.println(rlcp.getPatterns().get(cpname).getStochInstances().get(iname).toCooPLaStoch(iname));
    		}
    	}
    }
  
    	
}