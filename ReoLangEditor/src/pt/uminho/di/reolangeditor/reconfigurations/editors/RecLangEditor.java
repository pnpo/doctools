package pt.uminho.di.reolangeditor.reconfigurations.editors;

import java.util.Set;

import org.eclipse.ui.IViewReference;
import org.eclipse.ui.editors.text.TextEditor;

import pt.uminho.di.cp.model.graph.ArchPatternAbstractGraph;
import pt.uminho.di.reolangeditor.reconfigurations.views.RecLangPatternsView;
import pt.uminho.di.reolangeditor.views.ReoLangPatternView;

public class RecLangEditor extends TextEditor {

	private RecLangColorManager colorManager;



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
		IViewReference[] views = this.getSite().getPage().getViewReferences();
		for(int i =0 ; i<views.length; i++){
			if(views[i].getId().equals("reolangeditor.views.ReoLangPatternView")){
				ReoLangPatternView view = (ReoLangPatternView) views[i].getView(false);
				if(view!=null){ 
					view.updateSelectedPatternGraphModel(graph) ; 
				}
				return;
			}
		}	
	}
	
	public void setPatternsRepresentation(Set<ArchPatternAbstractGraph> model) {
		IViewReference[] views = this.getSite().getPage().getViewReferences();
		for(int i =0 ; i<views.length; i++){
			if(views[i].getId().equals("reolangeditor.reconfigurations.views.RecLangPatternsView")){
				RecLangPatternsView view = (RecLangPatternsView) views[i].getView(false);
				if(view!=null){ 
					view.updatePatternsRepresentation(model) ; 
				}
				return;
			}
		}
	}

}
