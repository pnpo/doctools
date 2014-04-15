package pt.uminho.di.reolangeditor.wizards.imcreo;

import java.util.ArrayList;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import pt.uminho.di.cp.model.CPModelInternal;
import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.cp.model.Node;
import pt.uminho.di.reolang.parsing.util.Pair;

public class IMCREOToolDeploymentPage extends WizardPage {
	
	private Composite container;
	
	protected IMCREOToolDeploymentPage() {
		super("Coordination Pattern Deployment");
		this.setTitle("Coordination Pattern Deployment");
		this.setDescription("Review stochastic information. \n" +
				"Empty fields in the Environment section will be assumed 1.0 if Deploy? is checked.");
	}

	
	
	public void createControl(Composite parent) {
	
		container = new Composite(parent, SWT.NONE);
		
	    // Required to avoid an error in the system
	    setControl(container);
	    setPageComplete(false);
	}
	
	
	
	/**
	 * Method to call when this page is accessed.
	 * 
	 * It defined the layout of the page as it is dependent on the selection 
	 * made on the previous page.
	 *  
	 */
	public void updateControl() {
		final IMCREOToolWizard wiz = (IMCREOToolWizard)this.getWizard();
		final CPModelInternal cpmi = wiz.getModel().getCompletePattern();
		final CoordinationPattern2 sp = cpmi.getStochInstances().get(wiz.getModel().getSelected());
		
		final Button toDeploy;
		
		//clean the container...
		for(Control c : container.getChildren()){
			c.dispose();
		}
		
		//now redo it
		//container = new Composite(container.getParent(), SWT.NONE);
		GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 3;
	    
	    
		//nodes
	    Label label_title = new Label(container, SWT.NONE);
	    label_title.setText("Nodes");
	    
	    label_title = new Label(container, SWT.CENTER);
	    label_title.setText("RD");
	    
	    label_title = new Label(container, SWT.CENTER);
	    label_title.setText("WR");
	
	    // create new layout data
	    //GridData data = new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1);
	    //label_title.setLayoutData(data);
	    
	    
	    ArrayList<Text> nodes_info = new ArrayList<Text>();
	    Label node_label;
	    Text node_info_rd, node_info_wr;
	    for(String n : cpmi.getNodes().keySet()) {
	    	Node __n = new Node();
	    	__n.addEnd(n);
	    	if(!cpmi.getEnvironment().contains(__n)){
	    		node_label = new Label(container, SWT.NONE);
			    node_label.setText(n);
			    __n = cpmi.getNodes().get(n);
			    node_label.setToolTipText(__n.toString());
			    
			    node_info_rd = new Text(container, SWT.SINGLE);
			    node_info_wr = new Text(container, SWT.SINGLE);
			    if(sp.getDelays().containsKey(__n)){
			    	Pair<Double, Double> stoch_val = sp.getDelays().get(__n);
			    	node_info_rd.setText(stoch_val.fst() == 0.0 ? "" : stoch_val.fst().toString());
			    	node_info_wr.setText(stoch_val.snd() == 0.0 ? "" : stoch_val.snd().toString());
			    }
			    else {
			    	node_info_rd.setText("");
			    	node_info_wr.setText("");
			    }
			    
			    nodes_info.add(node_info_rd);
			    nodes_info.add(node_info_wr);
	    	}
	    	
	    } 
	    
	    
	    label_title = new Label(container, SWT.NONE);
	    label_title.setText("Environment ");
	    // create new layout data
	    GridData data = new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1);
	    label_title.setLayoutData(data);
		
	    //deploy?
	    Label label1 = new Label(container, SWT.NONE);
	    label1.setText("Deploy?");
	    toDeploy = new Button(container, SWT.CHECK );
	    toDeploy.setSelection(false);
	    data = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1);
	    toDeploy.setLayoutData(data);
		
	    
	    
	    
	    
	    
	    final Composite container2 = new Composite(container, SWT.NONE);
	    GridLayout layout2 = new GridLayout();
	    container2.setLayout(layout2);
	    layout2.numColumns = 2;
	    data = new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1);
	    container2.setLayoutData(data);
	    
	    ArrayList<Text> envs_info = new ArrayList<Text>();
	    Label env_label;
	    Text env_info;
	    for(String n : cpmi.getNodes().keySet()) {
	    	Node __n = new Node();
	    	__n.addEnd(n);
	    	if(cpmi.getEnvironment().contains(__n)){
	    		env_label = new Label(container2, SWT.NONE);
			    env_label.setText(n);
			    __n = cpmi.getNodes().get(n);
			    env_label.setToolTipText(__n.toString());
			    
			    env_info = new Text(container2, SWT.SINGLE);
			    if(sp.getDelays().containsKey(__n)){
			    	Double stoch_val = sp.getDelays().get(__n).fst();
			    	env_info.setText(stoch_val == 0.0 ? "" : stoch_val.toString());
			    }
			    else {
			    	env_info.setText("");
			    }
			    
			    envs_info.add(env_info);
	    	}
	    	
	    } 
	    
	    container2.setVisible(false);
	    
	    
	    
	    
	    toDeploy.addListener(SWT.Selection, new Listener() {
			
			public void handleEvent(Event event) {
				if(toDeploy.getSelection()){
					container2.setVisible(true);
					container.update();
				}
				else {
					container2.setVisible(false);
					container.update();
				}
				
			}
		});
	    
	    
	  //env
	    
	    
	    container.layout(true);
	    setPageComplete(true);
	}
	
	
	

	
	
	
	
}
