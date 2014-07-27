package pt.uminho.di.reolangeditor.reconfigurations.editors;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.ui.IViewReference;
import org.eclipse.ui.editors.text.TextEditor;

import pt.uminho.di.cp.model.graph.ArchPatternAbstractGraph;
import pt.uminho.di.reolangeditor.editors.ReoLangColorManager;
import pt.uminho.di.reolangeditor.editors.ReoLangDocumentProvider;
import pt.uminho.di.reolangeditor.editors.ReoLangSourceViewerConfiguration;
import pt.uminho.di.reolangeditor.reconfigurations.editors.adapter.views.RecLangPatternsView2;
import pt.uminho.di.reolangeditor.views.ReoLangPatternView;

public class RecLangEditor extends TextEditor {

	private RecLangColorManager colorManager;
	private ArchPatternAbstractGraph selectedPatternGraphModel;
	private Set<String> patterns;
	private Set<ArchPatternAbstractGraph> models;



	public RecLangEditor() {
		super();
		colorManager = new RecLangColorManager();
		setSourceViewerConfiguration(new RecLangSourceViewerConfiguration(colorManager, this));
		setDocumentProvider(new RecLangDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}
	
	
	public void setSelectedPatternGraphModel(ArchPatternAbstractGraph graph){
		this.selectedPatternGraphModel = graph;
		IViewReference[] views = this.getSite().getPage().getViewReferences();
		for(int i =0 ; i<views.length; i++){
			if(views[i].getId().equals("reolangeditor.views.ReoLangPatternView")){
//			if(views[i].getId().equals("reolangeditor.reconfigurations.editors.adapter.views.RecLangPatternsView2")){
				ReoLangPatternView view = (ReoLangPatternView) views[i].getView(false);
				if(view!=null){ 
					view.updateSelectedPatternGraphModel(graph) ; 
				}
				return;
			}
		}	
	}
	
	public ArchPatternAbstractGraph getSelectedPatternGraphModel(){
		return this.selectedPatternGraphModel;
	}
	
	public void setPatternsRepresentation(Set<ArchPatternAbstractGraph> graphs) {
		//ReoLangEditor ed = (ReoLangEditor) this.getSite().getWorkbenchWindow().getActivePage().getActiveEditor();
		this.models = graphs;
		Set<String> patterns = new HashSet<String>();
		for (ArchPatternAbstractGraph model : graphs) {
			patterns.add(model.getGraphName());
		}
		this.patterns = patterns;
		
		IViewReference[] views = this.getSite().getPage().getViewReferences();
		for(int i =0 ; i<views.length; i++){
			if(views[i].getId().equals("reolangeditor.reconfigurations.editors.adapter.views.RecLangPatternsView2")){
				RecLangPatternsView2 view = (RecLangPatternsView2) views[i].getView(false);
				if(view!=null){ 
					view.updatePatternsRepresentation(patterns, graphs) ; 
				}
				return;
			}
		}
	}

}
