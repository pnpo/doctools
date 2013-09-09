/**
 * 
 */
package pt.uminho.di.imc.reo.composition;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

/**
 * @author Nuno Oliveira
 * @date 5 de Abr de 2013
 *
 */
public final class Library {

	
	public static String path = "pt/uminho/di/imc/reo/templates/";
	
	
	public static String sync(String a, String b, String ga, String gb, String gab){
		
		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
		StringTemplate sync_ab = group.getInstanceOf(path + "sync");
		sync_ab.setAttribute("a", a);
		sync_ab.setAttribute("b", b);
		sync_ab.setAttribute("ga", ga);
		sync_ab.setAttribute("gb", gb);
		sync_ab.setAttribute("gab", gab);
		
		return sync_ab.toString();
		
	}
	
	
	
	public static String drain(String a, String b, String ga, String gb, String gab){
		
		
		
		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
		StringTemplate drain_ab = group.getInstanceOf(path + "drain");
		drain_ab.setAttribute("a", a);
		drain_ab.setAttribute("b", b);
		drain_ab.setAttribute("ga", ga);
		drain_ab.setAttribute("gb", gb);
		drain_ab.setAttribute("gab", gab);
		
		return drain_ab.toString();
		
		
	}
	
	
	
	
	public static String lossy(String a, String b, String ga, String gb, String gab, String gaL){
		
		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
		StringTemplate lossy_ab = group.getInstanceOf(path + "lossy");
		lossy_ab.setAttribute("a", a);
		lossy_ab.setAttribute("b", b);
		lossy_ab.setAttribute("ga", ga);
		lossy_ab.setAttribute("gb", gb);
		lossy_ab.setAttribute("gab", gab);
		lossy_ab.setAttribute("gaL", gaL);
		
		return lossy_ab.toString();
		
	}
	
	
	
	public static String fifo1e(String a, String b, String ga, String gb, String gaB, String gBb){
		
		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
		StringTemplate fifo_ab = group.getInstanceOf(path + "fifo1e");
		fifo_ab.setAttribute("a", a);
		fifo_ab.setAttribute("b", b);
		fifo_ab.setAttribute("ga", ga);
		fifo_ab.setAttribute("gb", gb);
		fifo_ab.setAttribute("gaB", gaB);
		fifo_ab.setAttribute("gBb", gBb);
		 
		return fifo_ab.toString();
		
	}
	
	
	public static String fifo1f(String a, String b, String ga, String gb, String gaB, String gBb){
		
		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
		StringTemplate fifo_ab = group.getInstanceOf(path + "fifo1f");
		fifo_ab.setAttribute("a", a);
		fifo_ab.setAttribute("b", b);
		fifo_ab.setAttribute("ga", ga);
		fifo_ab.setAttribute("gb", gb);
		fifo_ab.setAttribute("gaB", gaB);
		fifo_ab.setAttribute("gBb", gBb);
		 
		return fifo_ab.toString();
		
	}
	
	
	
	
	public static String merger(String a, String b, String c, String ga, String gb, String gc, String gac, String gbc){
		
		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
		StringTemplate merger_abc = group.getInstanceOf(path + "merger");
		merger_abc.setAttribute("a", a);
		merger_abc.setAttribute("b", b);
		merger_abc.setAttribute("c", c);
		merger_abc.setAttribute("ga", ga);
		merger_abc.setAttribute("gb", gb);
		merger_abc.setAttribute("gc", gc);
		merger_abc.setAttribute("gac", gac);
		merger_abc.setAttribute("gbc", gbc);
		 
		return merger_abc.toString();
		
	}
	
	
	
	public static String replicator(String a, String b, String c, String ga, String gb, String gc, String gabc){
		
		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
		StringTemplate replicator_abc = group.getInstanceOf(path + "replicator");
		replicator_abc.setAttribute("a", a);
		replicator_abc.setAttribute("b", b);
		replicator_abc.setAttribute("c", c);
		replicator_abc.setAttribute("ga", ga);
		replicator_abc.setAttribute("gb", gb);
		replicator_abc.setAttribute("gc", gc);
		replicator_abc.setAttribute("gabc", gabc);
		 
		return replicator_abc.toString();
		
	}
	
	
	
	
}
