package pt.uminho.di.reolangeditor.wizards.imcreo;


import java.io.File;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;


import pt.uminho.di.reolangeditor.tools.imcreotool.IMCREOToolModel.OutputOptions;
import pt.uminho.di.reolangeditor.tools.imcreotool.IMCREOToolModel.ToolOptions;

public class IMCREOToolOutputPage extends WizardPage {

	
	private Composite container;
	private Text output_dir;
	private Text output_name;
	
	protected IMCREOToolOutputPage() {
		super("IMCREO output options");
		super.setTitle("IMCREO output options");
		this.setDescription("Select output options.");
	}

	
	
	public void createControl(Composite parent) {
		final IMCREOToolWizard wiz = (IMCREOToolWizard)this.getWizard();
		
		container = new Composite(parent, SWT.NONE);
	    GridLayout layout = new GridLayout(3, false);
	    container.setLayout(layout);
	    
	    Label label1 = new Label(container, SWT.NONE);
	    label1.setText("Output path:");

	    output_dir = new Text(container, SWT.SINGLE | SWT.BORDER);
		GridData gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalAlignment = GridData.FILL;
		output_dir.setLayoutData(gd);
		
		//get object which represents the workspace  
		IWorkspace workspace = ResourcesPlugin.getWorkspace();  
		//get location of workspace (java.io.File)  
		String workspaceDirectory = workspace.getRoot().getLocation().toFile().getPath();  
		
		int last_dir_sep = wiz.getModel().getFile().lastIndexOf(File.separator);
		final String default_dir = wiz.getModel().getFile().substring(workspaceDirectory.length()+1,last_dir_sep);
		output_dir.setText(default_dir);
		
 
 
		Button choose_btn= new Button(container, SWT.NONE);
		choose_btn.setText("...");
		choose_btn.addSelectionListener(new SelectionListener() {
 
			public void widgetDefaultSelected(SelectionEvent e) {
			}
 
			public void widgetSelected(SelectionEvent e) {
				ContainerSelectionDialog dialog = 
					    new ContainerSelectionDialog(container.getShell(), null, true, "Select a folder:");
					dialog.setTitle("Folder Selection");
					dialog.open();
					Object[] res = dialog.getResult();
					String path = res[0].toString().substring(1);
				if (path != null) {
					output_dir.setText(path);
					setPageComplete(
							! output_name.getText().equals("") &&
							! output_dir.getText().equals("")
						);
					wiz.getModel().setPath(createFinalPath());
				}
			}
		});
		
		
		label1 = new Label(container, SWT.NONE);
	    label1.setText("Output name:");

	    output_name = new Text(container, SWT.SINGLE | SWT.BORDER);
	    gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalAlignment = GridData.FILL;
		output_name.setLayoutData(gd);
	    output_name.setText("imcreo_output");
	    output_name.addKeyListener(new KeyListener() {
			
			public void keyReleased(KeyEvent e) {
				setPageComplete(
						! output_name.getText().equals("") &&
						! output_dir.getText().equals("")
					);
				wiz.getModel().setPath(createFinalPath());
			}
			
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	    
	    
		
		Group options_grp = new Group(container, SWT.NONE);
		options_grp.setText("Output Options");
		GridLayout layout2 = new GridLayout(2,false);
		options_grp.setLayout(layout2);
		gd = new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1);
		options_grp.setLayoutData(gd);
	
		for(OutputOptions o : OutputOptions.values()) {
			switch(o){
				case CADP : {
					makeOutputOptionEntry(options_grp, o, "CADP (creates file with .aut extension)", wiz);
				} break;
				case IMCA : {
					makeOutputOptionEntry(options_grp, o, "IMCA (creates file with .ma extension)", wiz);
				} break;
				case REOMA : {
					makeOutputOptionEntry(options_grp, o, "Reo MA (creates file with .rma extension)", wiz);
				} break;
				case DOT : {
					makeOutputOptionEntry(options_grp, o, "DOT (creates file with .dot extension)", wiz);
				} break;
				default : break;
			}
		}
		
		
		
		Group tool_options_grp = new Group(container, SWT.NONE);
		options_grp.setText("Tool Options");
		layout2 = new GridLayout(2,false);
		tool_options_grp.setLayout(layout2);
		gd = new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1);
		tool_options_grp.setLayoutData(gd);
	
		for(ToolOptions o : ToolOptions.values()) {
			switch(o){
				case VERBOSE : {
					makeToolOptionEntry(tool_options_grp, o, "verbose (prints info to the output)", wiz);
				} break;
				case SEQUENTIAL : {
					makeToolOptionEntry(tool_options_grp, o, "sequential (composes IMCReo a channel at a time)", wiz);
				} break;
				case READABLE : {
					makeToolOptionEntry(tool_options_grp, o, "readable (makes the generated states readable)", wiz);
				} break;
				case LABELS : {
					makeToolOptionEntry(tool_options_grp, o, "labels (??)", wiz);
				} break;
				case HIDE : {
					makeToolOptionEntry(tool_options_grp, o, "hide (performs the hiding of mixed nodes)", wiz);
				} break;
				default : break;
			}
		}
		

		//update model 1st time
		wiz.getModel().setPath(this.createFinalPath());
		
	    // Required to avoid an error in the system
	    setControl(container);
	    setPageComplete(
				! output_name.getText().equals("") &&
				! output_dir.getText().equals("")
			);
	}



	private void makeToolOptionEntry(Group options_grp, final ToolOptions o, String text, final IMCREOToolWizard wiz) {
		Button btn = new Button(options_grp, SWT.CHECK);
		btn.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent e) {
				//if selected
				if(((Button)e.widget).getSelection()){
					wiz.getModel().getOptions().add(o);
				}
				else {
					wiz.getModel().getOptions().remove(o);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		Label lbl = new Label(options_grp, SWT.NONE);
		lbl.setText(text);
	}
	
	
	



	private void makeOutputOptionEntry(Group options_grp, final OutputOptions o, String text, final IMCREOToolWizard wiz) {
		Button btn = new Button(options_grp, SWT.CHECK);
		if(o.equals(OutputOptions.CADP)){
			btn.setSelection(true);
			wiz.getModel().getOutputs().add(o);
		}
		btn.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent e) {
				//if selected
				if(((Button)e.widget).getSelection()){
					wiz.getModel().getOutputs().add(o);
				}
				else {
					wiz.getModel().getOutputs().remove(o);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		Label lbl = new Label(options_grp, SWT.NONE);
		lbl.setText(text);
	}
	
	
	
	private String createFinalPath(){  
		IWorkspace workspace = ResourcesPlugin.getWorkspace();  
		String workspaceDirectory = workspace.getRoot().getLocation().toFile().getPath() ;
		String selected_dir = output_dir.getText(); 
		String file_name = output_name.getText();
		String path = workspaceDirectory + File.separator + selected_dir + File.separator + file_name;
		
		return path;
	}

}
