package pt.uminho.di.cooplaeditor.reconfigurations.editors.reconciler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModelExtension;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IFileEditorInput;

import pt.uminho.di.cooplaeditor.reconfigurations.editors.RecLangEditor;
import pt.uminho.di.reolang.parsing.util.Error;
import pt.uminho.di.reolang.parsing.util.ErrorType;
import pt.uminho.di.reolang.parsing.util.TinySymbolsTable;
import pt.uminho.di.reolang.reclang.Processor;


public class RecLangReconcilingStrategy implements IReconcilingStrategy, IReconcilingStrategyExtension{

	private static final String PROBLEM="pt.uminho.di.cooplaeditor.annotations.error"; //$NON-NLS-1$
	private static final String WARNING="pt.uminho.di.cooplaeditor.annotations.warning"; //$NON-NLS-1$
	
	private IDocument document;
	private IProgressMonitor progressMonitor;
	private ISourceViewer viewer;
	private RecLangEditor editor;
	private Annotation[] previousAnnotations;
	
	
	
	public RecLangReconcilingStrategy(ISourceViewer viewer, RecLangEditor editor) {
		this.viewer = viewer;
		this.document = this.viewer.getDocument();
		this.editor = editor;
	}
	
	
	public void setDocument(IDocument document) {
		this.document = document;
	}

	
	public void setProgressMonitor(IProgressMonitor monitor) {
		this.progressMonitor = monitor;
	}
	
	
	/*To activate the reconcile when the document is first opened*/
	public void initialReconcile() {
		reconcile(new Region(0, document.getLength()));
	}
	
	/*
	 * Reconciler when incremental is set to true on SourceViewerConfiguration
	 * When the incremental is set to false, call the normal reconciler with the 
	 * subRegion as the part to reconcile.
	 */
	public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
		reconcile(subRegion);
	}

	

	public void reconcile(IRegion partition) {
		
		try{
			IResource resource = ((IFileEditorInput)editor.getEditorInput()).getFile();
			String file = resource.getLocation().toOSString();
			
			/*Lexer+Syntax*/
			Processor p = new Processor(file, this.document.get());
			annotateDocumentWithErrors(new ArrayList<Error>(), resource);
			
	    	ArrayList<Error> syntax_errors = p.getSyntaxErrors();
	    	if ( !syntax_errors.isEmpty() ){
	    		//System.out.println(syntax_errors);
	    		annotateDocumentWithErrors(syntax_errors, resource);
	    	}
	    	else{
	        	TinySymbolsTable ids_table = p.getIdentifiersTable(new TinySymbolsTable());
	        	ArrayList<Error> semantic_errors = p.getSemanticErrors(ids_table);

	        	if (semantic_errors == null || !semantic_errors.isEmpty()){
	        		//System.out.println(semantic_errors);
	        		annotateDocumentWithErrors(semantic_errors, resource);
	        	}
	    	}

		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
	


	/**
	 * Creates annotations and problem markers from a list of errors 
	 * @param errors the list of errors
	 * @param resource the resource where the errors occur
	 */
	private void annotateDocumentWithErrors(ArrayList<Error> errors, IResource resource) {
		
		this.cleanProblemMarkers(resource);
		Map<Annotation,Position> annotations = errorsToAnnotations(errors, resource);
		
		IAnnotationModelExtension model= (IAnnotationModelExtension) this.viewer.getAnnotationModel();
		model.replaceAnnotations(this.previousAnnotations, annotations);
		this.previousAnnotations= (Annotation[]) annotations.keySet().toArray(new Annotation[0]);
		
		
	}

	/**
	 * Converts a list of errors into document annotations
	 * @param errors the list of errors
	 * @param resource the resource where errors occur
	 * @return map with annotations and a position of the annotation
	 */
	private Map<Annotation,Position> errorsToAnnotations(ArrayList<Error> errors, IResource resource) {
		Map<Annotation, Position> error_annotations = new HashMap<Annotation, Position>(0);
		
		for(Error e : errors){
			Annotation a = null;
			ErrorType problem_type = e.getType();
			
			if(problem_type == ErrorType.ERROR){
				a = new Annotation(PROBLEM, false, e.getMessage());
			}
			else{
				a = new Annotation(WARNING, false, e.getMessage());
			}
			
			Position p = new Position(0,10);
			try{
				p = new Position(document.getLineOffset(e.getLine()-1) + e.getPosition() -3, 6);
			}
			catch(Exception ex){
				System.out.println(e.getLine());
			}
			
			error_annotations.put(a, p);
			//Create error marks in Problems View
			this.createProblemMarkers(e, resource);

		}
		
		return error_annotations;
	}

	
	
	
	/**
	 * Creates a problem marker for an error in a resource
	 * 
	 * @param err the error to mark
	 * @param resource the resource where the error occurs
	 */
	private void createProblemMarkers(Error err, IResource resource){
		try{
			IMarker marker = resource.createMarker(IMarker.PROBLEM);
			marker.setAttribute(IMarker.LINE_NUMBER, err.getLine());
			marker.setAttribute(IMarker.LOCATION, "line: " + err.getLine() + " col: " + err.getPosition());
			marker.setAttribute(IMarker.MESSAGE, err.getMessage());
			
			if(err.getType() == ErrorType.ERROR){
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			}
			else {
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
			}
			
		}	
		catch(CoreException coreexc){
			
		}
	}
	
	
	/**
	 * Clears all the problems associated to a resource!
	 * @param resource the resource from which one wants to remove the problems
	 */
	private void cleanProblemMarkers(IResource resource){
		
		int depth = IResource.DEPTH_INFINITE;
		   try {
		      resource.deleteMarkers(IMarker.PROBLEM, true, depth);
		   } catch (CoreException e) {
		      // something went wrong
		   }
	}
	
	
	
/*	
	
	//// ACCESS TO SWT THREAD ////
	
	 class TextOffsetGrabber implements Runnable {

		private int offset;
		private ISourceViewer viewer;
		
		public TextOffsetGrabber(final ISourceViewer v){
			this.offset = -1;
			this.viewer = v;
		}
		
		
		public int getOffset(){
			return this.offset;
		} 
		
		
		public void run() {
			this.offset = this.viewer.getSelectedRange().x;
		}
		
	}
	 
	private int getOffsetAtSWTThread(){
		int offset = -1;
		Display display = this.viewer.getTextWidget().getDisplay();
		TextOffsetGrabber tog = new TextOffsetGrabber(viewer); 
		
		if(display.getThread() == Thread.currentThread()){
			tog.run() ;
		}
		else {
			display.asyncExec(tog) ;
		}
		
		while(offset == -1){
			offset = tog.getOffset();
		}
		
		return offset;
		
	}

*/	
	 
	
	

}
