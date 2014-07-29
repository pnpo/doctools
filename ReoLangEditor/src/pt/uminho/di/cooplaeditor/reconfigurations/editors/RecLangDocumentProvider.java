package pt.uminho.di.cooplaeditor.reconfigurations.editors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

public class RecLangDocumentProvider extends FileDocumentProvider {

	
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		if (document != null) {
			IDocumentPartitioner partitioner = new FastPartitioner( new RecLangPartitionScanner(), RecLangPartitionScanner.PARTITIONS);
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		return document;
	}
	
	
	@Override
	protected IDocument createEmptyDocument() {
		return super.createEmptyDocument();
	}
	
	
	
}