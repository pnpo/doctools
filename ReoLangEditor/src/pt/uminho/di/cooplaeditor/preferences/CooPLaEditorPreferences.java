package pt.uminho.di.cooplaeditor.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import pt.uminho.di.cooplaeditor.Activator;



public class CooPLaEditorPreferences extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	
	public CooPLaEditorPreferences() {
		super(GRID);
	}
	
	

	@Override
	protected void createFieldEditors() {
		
	}


	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preferences for the CooPLa Editor");
	}
	

}
