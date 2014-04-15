package pt.uminho.di.reolangeditor.wizards.imcreo;

import java.util.LinkedHashMap;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;


import pt.uminho.di.cp.model.CPModelInternal;
import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.reolang.ReoLangCP2;
import pt.uminho.di.reolang.ReoLangSemantics;
import pt.uminho.di.reolang.parsing.CPBuilder;
import pt.uminho.di.reolang.parsing.Semantics;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;

public class IMCREOToolSelectPage extends WizardPage {

	//private Composite container;
	//private Combo combo_box;
	
	
	protected IMCREOToolSelectPage() {
		super("Coordination Pattern Selection");
		this.setTitle("Coordination Pattern Selection");
		this.setDescription("Selection of a stochastic pattern.");
	}

	public void createControl(Composite parent) {
		
		final IMCREOToolWizard wiz = (IMCREOToolWizard)this.getWizard();
		final Composite container;
		final Combo combo_box;
		
		container = new Composite(parent, SWT.NONE);
		
		boolean processed = wiz.getModel().getPatterns() != null;
		if(! processed){
			this.setErrorMessage("There are errors in the current active file!\n" +
					"Could not process it. See Error view for more details.");
		}
		else {
			
		    GridLayout layout = new GridLayout();
		    container.setLayout(layout);
		    layout.numColumns = 2;
		    Label label1 = new Label(container, SWT.NONE);
		    label1.setText("Select pattern:");

		    combo_box = new Combo(container, SWT.BORDER | SWT.SINGLE);
		    combo_box.add("");
		    for(CPModelInternal cpmi : wiz.getModel().getPatterns().values()){
		    	for(String s : cpmi.getStochInstances().keySet()) {
		    		combo_box.add(s);
		    	}
		    }
		    
		    
		    combo_box.addSelectionListener(new SelectionListener() {
				
				public void widgetSelected(SelectionEvent e) {
					int sel = combo_box.getSelectionIndex();
					if( sel > 0 ) {
						
						String patt_name = combo_box.getItem(sel);
						wiz.getModel().setSelected(patt_name);
						setPageComplete(true);
						
					}
					else {
						setPageComplete(false);
					}
				}
				
				public void widgetDefaultSelected(SelectionEvent e) {
					setPageComplete(false);
					
				}
			});
		    
		}
	
	    // Required to avoid an error in the system
	    setControl(container);
	    setPageComplete(false);

	}
	
	
	public IWizardPage getNextPage(){
		   IMCREOToolDeploymentPage page = ((IMCREOToolWizard)this.getWizard()).getDeployment_page();
		   page.updateControl();
	       return page;
	}
	
	
	
	
	
	
	
	

}
