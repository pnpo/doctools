/**
 * 
 */
package pt.uminho.di.cooplaeditor.editors.outline;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import pt.uminho.di.cooplaeditor.editors.CooPLaEditor;
import pt.uminho.di.reolang.parsing.util.SimpleSymbol;

/**
 * @author Nuno Oliveira
 * @date 24 de Abr de 2012
 *
 */
public class CooPLaContentOutlinePage extends ContentOutlinePage {

	private CooPLaEditor editor;
	private IEditorInput input;
	
	public CooPLaContentOutlinePage(CooPLaEditor cooplaEditor) {
		this.editor = cooplaEditor;
	}
	
	
	
	public CooPLaEditor getEditor() {
		return editor;
	}
	
	public void setEditor(CooPLaEditor editor) {
		this.editor = editor;
	}
	
	
	public IEditorInput getInput() {
		return input;
	}
	
	public void setInput(IEditorInput input) {
		this.input = input;
	}
	

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		CooPLaContentOutlineProvider provider = new CooPLaContentOutlineProvider();		
		TreeViewer viewer = getTreeViewer();
	    if (viewer != null)
	    {
	        Control control = viewer.getControl();
	        if (control != null && !control.isDisposed())
	        {
	            control.setRedraw(false);
	            viewer.setContentProvider(provider);
	            viewer.setLabelProvider(provider);
	            viewer.setInput(this.editor.getCooPLaOutlineModel());
	            viewer.expandAll();
	            control.setRedraw(true);
	            
	        }
	    }
	}
	
	
	
	
	public void updateCooPLaOutlineModel(final SimpleSymbol elem) {
		final TreeViewer viewer = getTreeViewer();
		if (viewer == null || elem == null) return;
		
		
		runInSWTThread(viewer, new Runnable() {
			public void run() {
				viewer.setInput(elem);
				viewer.expandAll();
			}
		});
	}

	private void runInSWTThread(final TreeViewer viewer, Runnable runnable) {
		Display display= viewer.getControl().getDisplay();
		if (display.getThread() == Thread.currentThread())
			runnable.run();
		else
			display.asyncExec(runnable);
	}
	

}
