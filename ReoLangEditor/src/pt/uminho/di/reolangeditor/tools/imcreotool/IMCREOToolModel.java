package pt.uminho.di.reolangeditor.tools.imcreotool;

import java.util.HashSet;
import java.util.LinkedHashMap;

import org.eclipse.swt.widgets.Text;

import pt.uminho.di.cp.model.CPModelInternal;
import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.cp.model.Node;
import pt.uminho.di.reolang.ReoLangCP2;
import pt.uminho.di.reolang.ReoLangSemantics;
import pt.uminho.di.reolang.parsing.CPBuilder;
import pt.uminho.di.reolang.parsing.Semantics;
import pt.uminho.di.reolang.parsing.util.Pair;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;

public class IMCREOToolModel {

	public enum ToolOptions {
		DEPLOY,
		VERBOSE,
		SEQUENTIAL,
		READABLE, 
		LABELS,
		HIDE
	}
	
	public enum OutputOptions {
		PRISM,
		CADP,
		IMCA,
		REOMA,
		DOT,
	}
	
	
	private String file;
	private LinkedHashMap<String, CPModelInternal> patterns;
	private String selected;
	private CPModelInternal completePattern;
	private LinkedHashMap<String, Pair<Text, Text>> nodes;
	private LinkedHashMap<String, Text> envs;
	private HashSet<ToolOptions> options;
	private HashSet<OutputOptions> outputs;
	private String path;
	
	
	




	/**
	 * 
	 */
	public IMCREOToolModel() {
		super();
		this.file = "";
		this.patterns = null;
		this.selected = "";
		this.completePattern = null;
		this.nodes = null;
		this.envs = null;
		this.options = new HashSet<ToolOptions>();
		this.outputs = new HashSet<OutputOptions>();
		this.path = "";

	}






//	/**
//	 * @param file
//	 * @param patterns
//	 * @param selected
//	 * @param nodes
//	 * @param envs
//	 * @param options
//	 * @param outputs
//	 */
//	public IMCREOToolModel(String file, String selected,
//			HashSet<ToolOptions> options,
//			HashSet<OutputOptions> outputs) {
//		super();
//		this.file = file;
//		this.patterns = null;
//		this.processPatternsInCurrentFile();
//		this.selected = selected;
//		this.completePattern = null;
//		this.setCompletePatternAutomatically();
//		this.nodes = null;
//		this.envs = null;
//		this.options = options;
//		this.outputs = outputs;
//		this.path = "";
//	}
	
	
	
	
	
	
	
	/**
	 * @return the output
	 */
	public String getPath() {
		return path;
	}






	/**
	 * @param output the output to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	
	
	/**
	 * @return the file
	 */
	public String getFile() {
		return file;
	}
	/**
	 * @param file the file to set
	 */
	public void setFile(String file) {
		this.file = file;
		this.processPatternsInCurrentFile();
	}
	/**
	 * @return the patterns
	 */
	public LinkedHashMap<String, CPModelInternal> getPatterns() {
		return patterns;
	}
//	/**
//	 * @param patterns the patterns to set
//	 */
//	public void setPatterns(LinkedHashMap<String, CPModelInternal> patterns) {
//		this.patterns = patterns;
//	}
	/**
	 * @return the selected
	 */
	public String getSelected() {
		return selected;
	}
	/**
	 * @param selected the selected to set
	 */
	public void setSelected(String selected) {
		this.selected = selected;
		this.setCompletePatternAutomatically();
	}
	/**
	 * @return the nodes
	 */
	public LinkedHashMap<String, Pair<Text, Text>> getNodes() {
		return nodes;
	}
	/**
	 * @param nodes the nodes to set
	 */
	public void setNodes(LinkedHashMap<String, Pair<Text, Text>> nodes) {
		this.nodes = nodes;
	}
	/**
	 * @return the envs
	 */
	public LinkedHashMap<String, Text> getEnvs() {
		return envs;
	}
	/**
	 * @param envs the envs to set
	 */
	public void setEnvs(LinkedHashMap<String, Text> envs) {
		this.envs = envs;
	}
	/**
	 * @return the options
	 */
	public HashSet<ToolOptions> getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(HashSet<ToolOptions> options) {
		this.options = options;
	}
	/**
	 * @return the outputs
	 */
	public HashSet<OutputOptions> getOutputs() {
		return outputs;
	}
	/**
	 * @param outputs the outputs to set
	 */
	public void setOutputs(HashSet<OutputOptions> outputs) {
		this.outputs = outputs;
	}
	/**
	 * @return the completePattern
	 */
	public CPModelInternal getCompletePattern() {
		return completePattern;
	}
//	/**
//	 * @param completePattern the completePattern to set
//	 */
//	public void setCompletePattern(CPModelInternal completePattern) {
//		this.completePattern = completePattern;
//	}

	
	
	
	
	
	
	
	/**
	 * 
	 * Processes the current active file to extract the model of
	 * all the patterns specified.
	 * 
	 * @param wizard the concrete wizard that contains this page 
	 * @return
	 */
	private boolean processPatternsInCurrentFile() {
		boolean worked = true;
		this.patterns = null;
		
		Semantics sem = new Semantics(file);
		ReoLangSemantics.reolang_return res = sem.performSemanticAnalysis(new SymbolsTable());
		
		if(res!=null && res.errors.size()>0){
			//System.err.println(res.errors.toString());
			worked = false;
		}
		else {
			if(sem.getErrors().size()>0) {
				//System.err.println(sem.getErrors().toString());
				worked = false;
			}
		}
		
		if(worked) {
			CPBuilder cpb = new CPBuilder(file);
			ReoLangCP2 rlcp = cpb.performModelConstruction(new LinkedHashMap<String, CPModelInternal>(), res.symbols);
			this.patterns = rlcp.getPatterns();
		}
		
		return worked;

	}
	
	
	
	
	
	private boolean setCompletePatternAutomatically() {
		this.completePattern = null;
		for(CPModelInternal p : this.patterns.values()){
			if(p.getStochInstances().containsKey(this.selected)){
				this.completePattern = p;
				break;
			}
		}
		
		return this.completePattern != null;
	}


	
	
	
	/**
	 * Updates the stochastic values for the nodes and environment ports of
	 * the selected stochastic coordination pattern...
	 * 
	 * It performs some verifications:
	 * negative values originate its absolute value
	 * 0 values originate highest possible double.
	 * empty values on env with toDeploy active sets highest possible double
	 * 
	 * @return coordination pattern (stochastic) with stochastic values updated.
	 */
	public CoordinationPattern2 updateStochastics() {
		
		CoordinationPattern2 cp = null;
		
		cp = this.completePattern.getStochInstances().get(this.getSelected());
		
		for(String n : this.nodes.keySet()){
			Node __n = this.completePattern.getNodes().get(n);
			if(! (this.nodes.get(n).fst().getText().equals("") || this.nodes.get(n).snd().getText().equals(""))){
				Double v1 = this.nodes.get(n).fst().getText().equals("") ? 
						0.0 : Double.parseDouble(this.nodes.get(n).fst().getText());
				Double v2 = this.nodes.get(n).snd().getText().equals("") ? 
						0.0 : Double.parseDouble(this.nodes.get(n).snd().getText());
				
				if(v1==0.0 && v2==0.0){
					v1 = Double.MAX_VALUE-1;
					v2 = Double.MAX_VALUE-1;
				} 
				else {
					if(! (v1 == 0.0 ^ v2 == 0.0)){
						v1 = Math.abs(v1);
						v2 = Math.abs(v2);
					}
				}

				Pair<Double, Double> v1v2 = new Pair<Double, Double>(v1, v2);
				
				cp.getDelays().remove(__n);
				cp.getDelays().put(__n, v1v2);
			}
			
		}
		
		for(String n : this.envs.keySet()) {
			Node __n = this.completePattern.getNodes().get(n);
			Double v1;
			Pair<Double, Double> pair_v1;
			
			if(! this.envs.get(n).getText().equals("")){
				v1 = Double.parseDouble(this.envs.get(n).getText());
				v1 = v1 == 0.0 ? Double.MAX_VALUE-1 : v1 < 0.0 ? Math.abs(v1) : v1;
			}
			else {
				v1 = Double.MAX_VALUE-1;
			}
			
			pair_v1 = new Pair<Double, Double>(v1, 0.0);
			cp.getDelays().remove(__n);
			cp.getDelays().put(__n, pair_v1);
			
		}
		
		return cp;
	}


	
	
	
	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IMCREOToolModel [file=" + file + ", patterns=" + patterns
				+ ", selected=" + selected + ", completePattern="
				+ completePattern + ", nodes=" + nodes + ", envs=" + envs
				+ ", options=" + options + ", outputs=" + outputs + ", path="
				+ path + "]";
	}






	
	
	
	
	
	
	
	
}
