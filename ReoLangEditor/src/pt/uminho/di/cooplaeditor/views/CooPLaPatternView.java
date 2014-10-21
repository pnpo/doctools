package pt.uminho.di.cooplaeditor.views;


import java.util.Set;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;

import org.eclipse.zest.core.viewers.*;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.GridLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;



import pt.uminho.di.cp.model.graph.Node;
import pt.uminho.di.cp.model.graph.ArchPatternAbstractGraph;
import pt.uminho.di.cp.model.graph.Edge;


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

public class CooPLaPatternView extends ViewPart implements IAdaptable{

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "cooplaeditor.views.CooPLaPatternView";

	private GraphViewer viewer;
	private ArchPatternAbstractGraph model;
	
	 
	class ViewContentProvider implements IGraphContentProvider {

		public void dispose() {
			// TODO Auto-generated method stub
			
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// TODO Auto-generated method stub
			
		}

		public Object getSource(Object rel) {
			Node n = null;
			if(rel instanceof Edge){
				n = ((Edge) rel).getN1();
			}
			return n;
		}

		public Object getDestination(Object rel) {
			Node n = null;
			if(rel instanceof Edge){
				n = ((Edge) rel).getN2();
			}
			return n;
		}

		@SuppressWarnings("unchecked")
		public Object[] getElements(Object input) {
			Object[] elems = null;
			if(input instanceof Set<?>){
				elems = new Object[((Set<Edge>) input).size()];
				elems = ((Set<Edge>)input).toArray(elems);
			}
			return elems;
		}
	}
	
	
	
	class ViewLabelProvider extends LabelProvider implements IEntityStyleProvider, IConnectionStyleProvider {
		
		private Display display;
		private ArchPatternAbstractGraph model;
		
		public ViewLabelProvider(Display display) {
			this.display = display;
		}
		
		
		public void setModel(ArchPatternAbstractGraph model){
			this.model = model;
		}
		
		
		public String getText(Object element) {
			String s = "";
			if (element instanceof Node) {
				Node n = (Node) element;
				s= n.getName();
			}
			if (element instanceof Edge) {
				Edge e = (Edge) element;
				s= e.getLabel();
			}
			return s;
		}

		
		public Color getBackgroundColour(Object entity) {
			Color c = null;
			if(entity instanceof Node){
				if(this.model.getIn_nodes().contains((Node)entity)){
					c = new Color(display,0, 255, 0); 
				}
				else {
					if(this.model.getOut_nodes().contains((Node)entity)){
						c = new Color(display,255, 0, 0);
					}
				}
			}
			return c;
		}

		public Color getForegroundColour(Object entity) {
			return new Color(display,0, 0, 0);
		}
		
		
		
		public Color getNodeHighlightColor(Object entity) {
			return null;
		}

		public Color getBorderColor(Object entity) {
			return null;
		}

		public Color getBorderHighlightColor(Object entity) {
			return null;
		}

		public int getBorderWidth(Object entity) {
			return 0;
		}

		public IFigure getTooltip(Object entity) {
			return null;
		}

		public boolean fisheyeNode(Object entity) {
			return false;
		}


		
		
		public int getConnectionStyle(Object rel) {
			int style = 0;
			if(rel instanceof Edge){
				style = ((Edge) rel).isDirected() ? ZestStyles.CONNECTIONS_DIRECTED : ZestStyles.CONNECTIONS_SOLID;
			}
			return style;
		}
		
		


		public Color getColor(Object rel) {
			return null;
		}
				


		public Color getHighlightColor(Object rel) {
			return null;
		}
		


		public int getLineWidth(Object rel) {
			return 0;
		}

	}
	
	
	
	
	class NameSorter extends ViewerSorter {
	}


	
	public CooPLaPatternView(){}
	
	
	

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
			viewer = new GraphViewer(parent, SWT.BORDER);
			viewer.setContentProvider(new ViewContentProvider());
			viewer.setLabelProvider(new ViewLabelProvider(parent.getDisplay()));
			
			if(this.model!=null)
				viewer.setInput(this.model.getEdges());
			
			LayoutAlgorithm layout = setLayout();
			viewer.setLayoutAlgorithm(layout, true);
			viewer.applyLayout();
			//fillToolBar();
			 
	}
		
		/*graph = new Graph(parent, SWT.NONE);
		if(editor!=null)
			patternToZestGraphAdapter(graph, editor.getSelectedPatternGraphModel());*/	
	
				/*new  TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "ReoLangEditor.viewer");
	}*/


	
	private LayoutAlgorithm setLayout() {
		LayoutAlgorithm layout;
		layout = new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
		return layout;
	}
	
	
	

	
	
	
	
	public void updateSelectedPatternGraphModel(final ArchPatternAbstractGraph elem) {
		//ReoLangEditor ed = (ReoLangEditor) this.getSite().getWorkbenchWindow().getActivePage().getActiveEditor();
		this.model = elem;
		((ViewLabelProvider)viewer.getLabelProvider()).setModel(elem);
		final GraphViewer viewer = this.viewer;
		
		if (viewer == null || elem == null) return;
		
		runInSWTThread(viewer, new Runnable() {
			public void run() {
				viewer.setInput(elem.getEdges());
			}
		});
		
		
	}
	
	
	private void runInSWTThread(final GraphViewer viewer, Runnable runnable) {
		Display display = viewer.getControl().getDisplay();
		if (display.getThread() == Thread.currentThread())
			runnable.run();
		else
			display.asyncExec(runnable);
	}



	
	
	

	
	
	
	@Override
	public void setFocus() {
		
	}


	
	
	
}