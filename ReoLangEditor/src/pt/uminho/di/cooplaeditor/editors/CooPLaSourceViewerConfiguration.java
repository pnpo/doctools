package pt.uminho.di.cooplaeditor.editors;

import java.util.ArrayList;


import org.eclipse.jface.text.IDocument;
//import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

import pt.uminho.di.cooplaeditor.editors.reconciler.CooPLaReconcilingStrategy;
import pt.uminho.di.reolang.parsing.util.SimpleSymbol;
import pt.uminho.di.reolang.parsing.util.Type;

public class CooPLaSourceViewerConfiguration extends SourceViewerConfiguration {
	//private XMLDoubleClickStrategy doubleClickStrategy;
	//private XMLTagScanner tagScanner;
	private CooPLaScanner scanner;
	private CooPLaColorManager colorManager;
	private CooPLaEditor editor;
	
	
	public CooPLaSourceViewerConfiguration(CooPLaColorManager colorManager, CooPLaEditor editor) {
		this.colorManager = colorManager;
		this.editor = editor;
	}
	
	
	
	
	
	
	
	/*
	 * Connecting the Partitioner with the SourceViewerConfiguration!
	 * Informs this coordinator module in which types of content the document is divided
	 * In this case it is divided into the default content, the multiple line comments and the
	 * single line comments. 
	 */
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] {
			IDocument.DEFAULT_CONTENT_TYPE,
			CooPLaPartitionScanner.COOPLA_MULTILINE_COMMENT,
			CooPLaPartitionScanner.COOPLA_SINGLELINE_COMMENT};
	}
	
	
	
	
/*	public ITextDoubleClickStrategy getDoubleClickStrategy(
		ISourceViewer sourceViewer,
		String contentType) {
		if (doubleClickStrategy == null)
			doubleClickStrategy = new XMLDoubleClickStrategy();
		return doubleClickStrategy;
	}

*/	protected CooPLaScanner getCooPLaScanner() {
		if (scanner == null) {
			scanner = new CooPLaScanner(colorManager);
			scanner.setDefaultReturnToken(
				new Token(
					new TextAttribute(
						colorManager.getColor(ICooPLaColorConstants.COOPLA_COLOR_DEFAULT))));
		}
		return scanner;
	}



	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getCooPLaScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
		
		dr = new DefaultDamagerRepairer(getCooPLaScanner());
		reconciler.setDamager(dr, CooPLaPartitionScanner.COOPLA_SINGLELINE_COMMENT);
		reconciler.setRepairer(dr, CooPLaPartitionScanner.COOPLA_SINGLELINE_COMMENT);

		NonRuleBasedDamagerRepairer ndr =
			new NonRuleBasedDamagerRepairer(
				new TextAttribute(
					colorManager.getColor(ICooPLaColorConstants.COOPLA_COLOR_MULTILINE_COMMENT)));
		reconciler.setDamager(ndr, CooPLaPartitionScanner.COOPLA_MULTILINE_COMMENT);
		reconciler.setRepairer(ndr, CooPLaPartitionScanner.COOPLA_MULTILINE_COMMENT);

		return reconciler;
	}

	
	
	/*
	 * The reconciler is a framework that allows for running a lexer + parser 
	 * in the editor background.
	 * It records all the changes in the text... and is invoked periodically!
	 */
	@Override
	public IReconciler getReconciler(ISourceViewer sourceViewer) {
		
		MonoReconciler reconciler = new MonoReconciler(new CooPLaReconcilingStrategy(sourceViewer, this.editor), false);
		reconciler.install(sourceViewer);
		return reconciler;
	}


	@Override
	public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
		return new CooPLaAnnotationHover();
	}
	
	
	
	/*
	 * This content assistant is only for the default content type
	 */
	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		ContentAssistant assistant= new ContentAssistant();
		assistant.setContentAssistProcessor(new CooPLaCompletionProcessor(this.editor), IDocument.DEFAULT_CONTENT_TYPE);
		assistant.enableAutoActivation(true);
		assistant.setAutoActivationDelay(500);
		assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
		assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
		//assistant.setContextInformationPopupBackground(JavaEditorEnvironment.getJavaColorProvider().getColor(new RGB(150, 150, 0)));

		
		return assistant;
	}
	
	

}