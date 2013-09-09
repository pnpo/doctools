/**
 * 
 */
package pt.uminho.di.reolangeditor.editors.outline;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import pt.uminho.di.reolang.parsing.util.SimpleSymbol;
import pt.uminho.di.reolangeditor.editors.ReoLangEditor;

/**
 * @author Nuno Oliveira
 * @date 24 de Abr de 2012
 *
 */
public class ReoLangContentOutlinePage extends ContentOutlinePage {

	private ReoLangEditor editor;
	private IEditorInput input;
	
	public ReoLangContentOutlinePage(ReoLangEditor reoLangEditor) {
		this.editor = reoLangEditor;
	}
	
	
	
	public ReoLangEditor getEditor() {
		return editor;
	}
	
	public void setEditor(ReoLangEditor editor) {
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

		ReoLangContentOutlineProvider provider = new ReoLangContentOutlineProvider();		
		TreeViewer viewer = getTreeViewer();
	    if (viewer != null)
	    {
	        Control control = viewer.getControl();
	        if (control != null && !control.isDisposed())
	        {
	            control.setRedraw(false);
	            viewer.setContentProvider(provider);
	            viewer.setLabelProvider(provider);
	            viewer.setInput(this.editor.getReoLangOutlineModel());
	            viewer.expandAll();
	            control.setRedraw(true);
	            
	        }
	    }
	}
	
	
	
	
	public void updateReoLangOutlineModel(final SimpleSymbol elem) {
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
