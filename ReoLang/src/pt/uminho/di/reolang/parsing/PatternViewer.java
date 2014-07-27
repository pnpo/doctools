package pt.uminho.di.reolang.parsing;

import java.util.HashMap;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;


import pt.uminho.di.cp.model.graph.ArchPatternAbstractGraph;
import pt.uminho.di.cp.model.graph.Edge;
import pt.uminho.di.cp.model.graph.Node;
import pt.uminho.di.reolang.FuzzyPatternViewReoLang;
import pt.uminho.di.reolang.FuzzyPreProcessor;
import pt.uminho.di.reolang.parsing.util.SimpleSymbol;


/***
 * 
 * @author Nuno
 * 
 * This classes is used to perform a single lexical analysis
 *
 */

public class PatternViewer extends CompilerPart {
	
	private ArchPatternAbstractGraph graph;
	private HashMap<String, String> replaceMap;
	private SimpleSymbol table;
	
	
	public PatternViewer(){
		super();
		this.graph = new ArchPatternAbstractGraph();
		this.replaceMap = new HashMap<String, String>();
		this.table = new SimpleSymbol();
	}
	
	public PatternViewer(String file, SimpleSymbol t){
		super(file);
		this.graph = new ArchPatternAbstractGraph();
		this.replaceMap = new HashMap<String, String>();
		this.table = t;
	}
	
	public PatternViewer(String file, String content, SimpleSymbol t){
		super(file, content);
		this.graph = new ArchPatternAbstractGraph();
		this.replaceMap = new HashMap<String, String>();
		this.table = t;
	}
	
	
	
	
	
	
	
	
	
	public ArchPatternAbstractGraph getGraph() {
		return graph;
	}

	public void setGraph(ArchPatternAbstractGraph graph) {
		this.graph = graph;
	}

	public HashMap<String, String> getReplaceMap() {
		return replaceMap;
	}

	public void setReplaceMap(HashMap<String, String> replaceMap) {
		this.replaceMap = replaceMap;
	}

	public SimpleSymbol getTable() {
		return table;
	}

	public void setTable(SimpleSymbol table) {
		this.table = table;
	}

	
	
	
	
	
	public void createPatternViewer() {
		
		try {
			CharStream input;
			input = new ANTLRStringStream(this.getContent());
		
			FuzzyPreProcessor lex = new FuzzyPreProcessor(input);
			TokenStream tokens = new CommonTokenStream(lex);
			tokens.toString();
			String cleaned_text = lex.getPre_Processed_Text();
			
			FuzzyPatternViewReoLang fpvrl = new FuzzyPatternViewReoLang(new ANTLRStringStream(cleaned_text), this.table );
			fpvrl.setFile(this.getFile());	
			TokenStream tokens2 = new CommonTokenStream(fpvrl);
			tokens2.toString();
			
			this.graph = fpvrl.getGraph();
			this.replaceMap = fpvrl.getReplacements();
			updateGraph();

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public void updateGraph(){
		for(Edge e : this.graph.getEdges()) {
			Node n1, n2;
			if(this.replaceMap.containsKey(e.getN1().toString())){
				n1 = new Node(this.replaceMap.get(e.getN1().toString()));
				e.setN1(n1);
				if(! (this.graph.getIn_nodes().contains(n1) || this.graph.getOut_nodes().contains(n1) || this.graph.getNodes().contains(n1))){
					this.graph.addNode(n1);
				}
			}
			if(this.replaceMap.containsKey(e.getN2().toString())){
				n2 = new Node(this.replaceMap.get(e.getN2().toString()));
				e.setN2(n2);
				if(! (this.graph.getIn_nodes().contains(n2) || this.graph.getOut_nodes().contains(n2) || this.graph.getNodes().contains(n2))){
					this.graph.addNode(n2);
				}
			}
		}
	}
	
	
}
