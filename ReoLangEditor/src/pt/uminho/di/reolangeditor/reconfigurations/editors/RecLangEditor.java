package pt.uminho.di.reolangeditor.reconfigurations.editors;

import org.eclipse.ui.editors.text.TextEditor;

import pt.uminho.di.reolangeditor.editors.ReoLangColorManager;
import pt.uminho.di.reolangeditor.editors.ReoLangDocumentProvider;
import pt.uminho.di.reolangeditor.editors.ReoLangSourceViewerConfiguration;

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
