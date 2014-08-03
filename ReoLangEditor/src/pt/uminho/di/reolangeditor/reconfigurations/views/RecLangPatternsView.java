package pt.uminho.di.reolangeditor.reconfigurations.views;


import java.util.Set;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.part.*;
import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IConnectionStyleProvider;
import org.eclipse.zest.core.viewers.IEntityStyleProvider;
import org.eclipse.zest.core.viewers.IGraphContentProvider;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.eclipse.swt.SWT;

import pt.uminho.di.cp.model.graph.ArchPatternAbstractGraph;
import pt.uminho.di.cp.model.graph.Edge;
import pt.uminho.di.cp.model.graph.Node;


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

public class RecLangPatternsView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "pt.uminho.di.reolangeditor.reconfigurations.views.RecLangPatternsView";

	private TabFolder folder;
//	private GraphViewer viewer;
	private ArchPatternAbstractGraph model;
	
	


//***********************************************************************
//*************************** GRAPH VIEWER ******************************
//***********************************************************************
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
	
	private LayoutAlgorithm setLayout() {
		LayoutAlgorithm layout;
		layout = new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
		return layout;
	}
//***********************************************************************
//***********************************************************************
	
	
	
	class NameSorter extends ViewerSorter {
	}
	
	
	/**
	 * The constructor.
	 */
	public RecLangPatternsView() {
	}


	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
//			init(parent);
			Composite composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
			composite.setLayout(new FillLayout());
			this.folder = new TabFolder(composite, SWT.NONE ); //SWT.BORDER
	}

	@SuppressWarnings("unused")
	private void init(Composite parent){
		Composite composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
		composite.setLayout(new FillLayout());
		this.folder = new TabFolder(composite, SWT.NONE ); //SWT.BORDER
		RowLayout rowLayout = new RowLayout(); 
		rowLayout.wrap=true; 
		rowLayout.pack=false; 
		rowLayout.type = SWT.WRAP; 
		
		this.folder.setSize (400, 200);
		this.folder.setLayout(rowLayout); 
		
		
	    for (int i=0; i<6; i++) {
	        TabItem item = new TabItem (folder, SWT.NONE);
	        item.setText ("TabItem " + i);
	    	GraphViewer gv = new GraphViewer(folder, SWT.BORDER);
			//gv.setInput(graph);
	    	item.setControl(gv.getControl());
	    }
		
//		//VIEWER
//		viewer = new GraphViewer(folder, SWT.BORDER);
//		viewer.setContentProvider(new ViewContentProvider());
//		viewer.setLabelProvider(new ViewLabelProvider(folder.getDisplay()));
	}
	
	public void updatePatternsRepresentation(final Set<ArchPatternAbstractGraph> graphs) {
		
		for (final ArchPatternAbstractGraph graph : graphs){
			this.model = graph;
			final GraphViewer viewer = new GraphViewer(folder, SWT.BORDER);
			viewer.setContentProvider(new ViewContentProvider());
			viewer.setLabelProvider(new ViewLabelProvider(folder.getDisplay()));
			LayoutAlgorithm layout = setLayout();
			viewer.setLayoutAlgorithm(layout, true);
			viewer.applyLayout();
			
			((ViewLabelProvider)viewer.getLabelProvider()).setModel(model);
			//final GraphViewer viewer = this.viewer;
			
			if (viewer == null || graph == null) return;
			
			Runnable runnable = new Runnable() {
				public void run() {
					try{
						TabItem tab = new TabItem(folder, SWT.NONE);
					    tab.setText(graph.getGraphName());
					    
					    viewer.setInput(graph.getEdges());
					    tab.setControl(viewer.getControl());
					    
					} catch(Exception e){
	//					System.out.println(e);
						e.printStackTrace();
					}
				}
			};
			
	//		Display.getDefault().asyncExec(runnable);
			runnable.run();
		}
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
//		viewer.getControl().setFocus();
	}
}