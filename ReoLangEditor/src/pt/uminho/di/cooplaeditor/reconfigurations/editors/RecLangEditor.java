package pt.uminho.di.cooplaeditor.reconfigurations.editors;

import org.eclipse.ui.editors.text.TextEditor;

import pt.uminho.di.cooplaeditor.editors.ReoLangColorManager;
import pt.uminho.di.cooplaeditor.editors.ReoLangDocumentProvider;
import pt.uminho.di.cooplaeditor.editors.ReoLangSourceViewerConfiguration;

public class RecLangEditor extends TextEditor {

	private RecLangColorManager colorManager;

	public RecLangEditor() {
		super();
		colorManager = new RecLangColorManager();
		setSourceViewerConfiguration(new RecLangSourceViewerConfiguration(colorManager, this));
		setDocumentProvider(new RecLangDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
