package pt.uminho.di.cooplaeditor.reconfigurations.editors;

import java.util.Set;

import org.eclipse.ui.IViewReference;
import org.eclipse.ui.editors.text.TextEditor;

import pt.uminho.di.cooplaeditor.editors.CooPLaColorManager;
import pt.uminho.di.cooplaeditor.editors.CooPLaDocumentProvider;
import pt.uminho.di.cooplaeditor.editors.CooPLaSourceViewerConfiguration;
import pt.uminho.di.cooplaeditor.reconfigurations.views.ReCooPLaPatternsView;
import pt.uminho.di.cooplaeditor.views.CooPLaPatternView;
import pt.uminho.di.cp.model.graph.ArchPatternAbstractGraph;

public class ReCooPLaEditor extends TextEditor {

	private ReCooPLaColorManager colorManager;

	public ReCooPLaEditor() {
		super();
		colorManager = new ReCooPLaColorManager();
		setSourceViewerConfiguration(new ReCooPLaSourceViewerConfiguration(colorManager, this));
		setDocumentProvider(new ReCooPLaDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}
	
	
	public void setSelectedPatternGraphModel(ArchPatternAbstractGraph graph){
		IViewReference[] views = this.getSite().getPage().getViewReferences();
		for(int i =0 ; i<views.length; i++){
			if(views[i].getId().equals("cooplaeditor.views.CooPLaPatternView")){
				CooPLaPatternView view = (CooPLaPatternView) views[i].getView(false);
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
			if(views[i].getId().equals("cooplaeditor.views.ReCooPLaPatternView")){
				ReCooPLaPatternsView view = (ReCooPLaPatternsView) views[i].getView(false);
				if(view!=null){ 
					view.updatePatternsRepresentation(model) ; 
				}
				return;
			}
		}
	}

}
