package pt.uminho.di.reolangeditor.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import pt.uminho.di.reolangeditor.Activator;



public class ReoLangEditorPreferences extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	
	public ReoLangEditorPreferences() {
		super(GRID);
	}
	
	

	@Override
	protected void createFieldEditors() {
		
	}


	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preferences for the ReoLang Editor");
	}
	

}
