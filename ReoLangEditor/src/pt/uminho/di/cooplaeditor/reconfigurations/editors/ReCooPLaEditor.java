package pt.uminho.di.cooplaeditor.reconfigurations.editors;

import org.eclipse.ui.editors.text.TextEditor;

import pt.uminho.di.cooplaeditor.editors.CooPLaColorManager;
import pt.uminho.di.cooplaeditor.editors.CooPLaDocumentProvider;
import pt.uminho.di.cooplaeditor.editors.CooPLaSourceViewerConfiguration;

public class ReCooPLaEditor extends TextEditor {

	private ReCooPLaColorManager colorManager;

	public ReCooPLaEditor() {
		super();
		colorManager = new ReCooPLaColorManager();
		setSourceViewerConfiguration(new ReCooPLaSourceViewerConfiguration(colorManager, this));
		setDocumentProvider(new ReCooPLaDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
