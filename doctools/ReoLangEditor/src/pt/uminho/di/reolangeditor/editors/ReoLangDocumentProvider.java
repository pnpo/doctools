package pt.uminho.di.reolangeditor.editors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

public class ReoLangDocumentProvider extends FileDocumentProvider {

	
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		if (document != null) {
			IDocumentPartitioner partitioner = new FastPartitioner( new ReoLangPartitionScanner(), ReoLangPartitionScanner.PARTITIONS);
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