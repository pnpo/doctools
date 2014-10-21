package pt.uminho.di.cooplaeditor.editors;

//import org.eclipse.ui.editors.text.TextEditor;

import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import pt.uminho.di.cooplaeditor.editors.outline.CooPLaContentOutlinePage;
import pt.uminho.di.cooplaeditor.views.CooPLaPatternView;
import pt.uminho.di.cp.model.graph.ArchPatternAbstractGraph;
import pt.uminho.di.reolang.parsing.util.SimpleSymbol;

public class CooPLaEditor extends AbstractDecoratedTextEditor {

	private CooPLaColorManager colorManager;
	private CooPLaContentOutlinePage outlinePage;
	private SimpleSymbol cooplaOutlineModel;
	private ArchPatternAbstractGraph selectedPatternGraphModel;

	public CooPLaEditor() {
		super();
		colorManager = new CooPLaColorManager();
		setSourceViewerConfiguration(new CooPLaSourceViewerConfiguration(colorManager, this));
		setDocumentProvider(new CooPLaDocumentProvider());
	}
	
	
	
	@Override
	public Object getAdapter(Class adapter) {
		if (IContentOutlinePage.class.equals(adapter)) {
	        if (outlinePage == null) {	
	            createOutlinePage();
	        }
	        return outlinePage;
	    }
		
		
	    return super.getAdapter(adapter);
	}
	



	@Override
	protected void editorSaved() {
		super.editorSaved();
		/*if(outlinePage!=null)
			//right now is getting the last model produced by the reconciller... do not parse last changed text...
			this.outlinePage.updateReoLangOutlineModel(this.reolangOutlineModel);
		 */
	}
	
	
	
	
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

	
	
	
	private void createOutlinePage() {
		this.outlinePage= new CooPLaContentOutlinePage(this);
		outlinePage.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection= event.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection ss= (IStructuredSelection) selection;
					Object element= ss.getFirstElement();
					if (element instanceof SimpleSymbol) {
						SimpleSymbol sse= (SimpleSymbol) element;
						selectAndReveal(sse.getOffsetStart(), sse.getOffsetStop()-sse.getOffsetStart());
					}
				}
			}
		});
	}
	
	
	
	


	public void setCooPLaOutlineModel(SimpleSymbol rootElement) {
		this.cooplaOutlineModel = rootElement;
		if (this.outlinePage != null)
			this.outlinePage.updateCooPLaOutlineModel(rootElement);
	}
	
	
	public SimpleSymbol getCooPLaOutlineModel(){
		return this.cooplaOutlineModel;
	}
	
	
	
	

	public void setSelectedPatternGraphModel(ArchPatternAbstractGraph graph){
		this.selectedPatternGraphModel = graph;
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

	
	public ArchPatternAbstractGraph getSelectedPatternGraphModel(){
		return this.selectedPatternGraphModel;
	}
}
