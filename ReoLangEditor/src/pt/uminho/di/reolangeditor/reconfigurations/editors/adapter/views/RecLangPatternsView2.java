package pt.uminho.di.reolangeditor.reconfigurations.editors.adapter.views;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Panel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;

import pt.uminho.di.cp.model.CPModelInternal;
import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.cp.model.graph.ArchPatternAbstractGraph;
import pt.uminho.di.reolangeditor.reconfigurations.editors.adapter.model.DataModel;
//import pt.uminho.di.reolangeditor.views.ReoLangPatternView.ViewLabelProvider;



/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class RecLangPatternsView2 extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "pt.uminho.di.reolangeditor.reconfigurations.editor.adapter.views.RecLangPatternsView2";

	private TableViewer viewer;
	private Action action1;
	private Action action2;
	private Action doubleClickAction;
	
	private Set<String> patterns;
	private Set<ArchPatternAbstractGraph> models;

	/*
	 * The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	 
	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
//		public Object[] getElements(Object parent) {
		public Object[] getElements(Object parent) {
			//aqui
			return new String[] { "One", "Two", "Three" };
//			return new String[] { };
		}
	}
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}
	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public RecLangPatternsView2() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
		//Frame f = SWT_AWT.new_Frame(composite);
		
		  //Panel panel = new Panel(new BorderLayout());
		  //Composite myTabs = new Composite(myTabs, SWT.EMBEDDED | SWT.NO_BACKGROUND);
		  Composite loginMainPanel = new Composite(composite, SWT.EMBEDDED | SWT.NO_BACKGROUND);
		  final GraphViewer gv = new GraphViewer(loginMainPanel, SWT.BORDER);
		  if (gv == null) return;
			
		  runInSWTThread(gv, new Runnable() {
			  public void run() {
				  Iterator iter = models.iterator();
				  ArchPatternAbstractGraph graph = (ArchPatternAbstractGraph) iter.next();
				  gv.setInput(graph.getEdges());
			  }
		  });
		  
		  //Composite loginMainPanel2 = new Composite(myTabs, SWT.EMBEDDED | SWT.NO_BACKGROUND);
		  //myTabs.add("PATT 1", loginMainPanel);
		  //myTabs.add("PATT 2", displayMainPanel);
		  
		  //composite.add(myTabs);
		  //f.add(loginMainPanel);
		
		/*viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "ReoLangEditor.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();*/
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				RecLangPatternsView2.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
	}

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"Output Patterns View",
			message);
	}

	
	public void updatePatternsRepresentation(final Set<String> patterns, final Set<ArchPatternAbstractGraph> graphs) {
		//ReoLangEditor ed = (ReoLangEditor) this.getSite().getWorkbenchWindow().getActivePage().getActiveEditor();
		this.models = graphs;
		this.patterns = patterns;
		
//		((ViewLabelProvider)viewer.getLabelProvider()).setModel(elem);
//		final GraphViewer viewer = this.viewer;
//		
//		if (viewer == null || elem == null) return;
//		
//		runInSWTThread(viewer, new Runnable() {
//			public void run() {
//				viewer.setInput(elem.getEdges());
//			}
//		});
		
		
	}
	
	
	private void runInSWTThread(final GraphViewer viewer, Runnable runnable) {
		Display display = viewer.getControl().getDisplay();
		if (display.getThread() == Thread.currentThread())
			runnable.run();
		else
			display.asyncExec(runnable);
	}
	
	
	
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}