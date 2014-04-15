package pt.uminho.di.reolangeditor.wizards.imcreo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.eclipse.swt.widgets.Text;

import pt.uminho.di.cp.model.CPModelInternal;
import pt.uminho.di.reolang.ReoLangCP2;
import pt.uminho.di.reolang.ReoLangSemantics;
import pt.uminho.di.reolang.parsing.CPBuilder;
import pt.uminho.di.reolang.parsing.Semantics;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;

public class IMCREOToolModel {

	enum ToolOptions {
		DEPLOY
	}
	
	enum OutputOptions {
		IMCA,
		CADP,
		PRISM,
		REOMA
	}
	
	
	private String file;
	private LinkedHashMap<String, CPModelInternal> patterns;
	private String selected;
	private CPModelInternal completePattern;
	private ArrayList<Text> nodes;
	private ArrayList<Text> envs;
	private HashMap<ToolOptions, Boolean> options;
	private HashMap<OutputOptions, String> outputs;
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 */
	public IMCREOToolModel() {
		super();
		this.file = "";
		this.patterns = null;
		this.selected = "";
		this.completePattern = null;
		this.nodes = new ArrayList<Text>();
		this.envs = new ArrayList<Text>();
		this.options = new LinkedHashMap<IMCREOToolModel.ToolOptions, Boolean>();
		this.outputs = new LinkedHashMap<IMCREOToolModel.OutputOptions, String>();

	}






	/**
	 * @param file
	 * @param patterns
	 * @param selected
	 * @param nodes
	 * @param envs
	 * @param options
	 * @param outputs
	 */
	public IMCREOToolModel(String file, String selected,
			ArrayList<Text> nodes, ArrayList<Text> envs,
			HashMap<ToolOptions, Boolean> options,
			HashMap<OutputOptions, String> outputs) {
		super();
		this.file = file;
		this.patterns = null;
		this.processPatternsInCurrentFile();
		this.selected = selected;
		this.completePattern = null;
		this.setCompletePatternAutomatically();
		this.nodes = nodes;
		this.envs = envs;
		this.options = options;
		this.outputs = outputs;
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
	public ArrayList<Text> getNodes() {
		return nodes;
	}
	/**
	 * @param nodes the nodes to set
	 */
	public void setNodes(ArrayList<Text> nodes) {
		this.nodes = nodes;
	}
	/**
	 * @return the envs
	 */
	public ArrayList<Text> getEnvs() {
		return envs;
	}
	/**
	 * @param envs the envs to set
	 */
	public void setEnvs(ArrayList<Text> envs) {
		this.envs = envs;
	}
	/**
	 * @return the options
	 */
	public HashMap<ToolOptions, Boolean> getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(HashMap<ToolOptions, Boolean> options) {
		this.options = options;
	}
	/**
	 * @return the outputs
	 */
	public HashMap<OutputOptions, String> getOutputs() {
		return outputs;
	}
	/**
	 * @param outputs the outputs to set
	 */
	public void setOutputs(HashMap<OutputOptions, String> outputs) {
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
	
	
	
	
}
