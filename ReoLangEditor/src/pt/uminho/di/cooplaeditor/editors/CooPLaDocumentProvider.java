package pt.uminho.di.cooplaeditor.editors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

public class CooPLaDocumentProvider extends FileDocumentProvider {

	
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		if (document != null) {
			IDocumentPartitioner partitioner = new FastPartitioner( new CooPLaPartitionScanner(), CooPLaPartitionScanner.PARTITIONS);
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