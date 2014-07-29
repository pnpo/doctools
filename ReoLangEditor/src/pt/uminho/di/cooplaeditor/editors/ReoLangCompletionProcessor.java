/**
 * 
 */
package pt.uminho.di.cooplaeditor.editors;

import java.util.ArrayList;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

import pt.uminho.di.cooplaeditor.editors.context.ReoLangContextUtil;
import pt.uminho.di.reolang.parsing.util.SimpleSymbol;
import pt.uminho.di.reolang.parsing.util.Type;

/**
 * @author Nuno Oliveira
 * @date 27 de Abr de 2012
 *
 */
public class ReoLangCompletionProcessor implements IContentAssistProcessor {

	
	private static String[] reolang_keywords = {"channel", 	"pattern", 	"import", 	"extends",
												"as", 		"NULL", 	"in", 		"use", 		
												"state", 	"join",		"observers",
												"flow", 	"to", 		"remaining"
												};
	
	private ReoLangEditor editor;
	
	public ReoLangCompletionProcessor(ReoLangEditor e) {
		this.editor = e; 
	}
	
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeCompletionProposals(org.eclipse.jface.text.ITextViewer, int)
	 */
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		
		//get text until the first space at the left of the completion request
		//Heuristic: there will be at list one white space (or line change) within HEURISTIC_SIZE characters
		IDocument doc = viewer.getDocument();
		int heuristic_size = 25;
		int realistic_heuristic_size = offset > heuristic_size ? heuristic_size : offset;
		String text_with_garbage = "";
		try {
			text_with_garbage = doc.get(offset-realistic_heuristic_size, realistic_heuristic_size);
		} catch (BadLocationException e) { 
			
		}
		char last_char = text_with_garbage.charAt(text_with_garbage.length()-1);
		text_with_garbage = text_with_garbage.replaceAll("[\\[\\](),;:\\n\\t\\r]", " ");
		int last_space_index = text_with_garbage.lastIndexOf(' ');
		String word = text_with_garbage.substring(last_space_index+1);
		int word_length = word.length();
		
		
		ArrayList<ICompletionProposal> result = new ArrayList<ICompletionProposal>(reolang_keywords.length);
		
		SimpleSymbol context = ReoLangContextUtil.findMainContext(this.editor, offset);
		
		switch(last_char){
			case '.' : {result = intellisenseForDOT(offset, context, doc, word.substring(0, word.length()-1)); } break;
			case '=' : {result = intellisenseForEQUAL(offset, context, doc); } break;
			default : {result= intellisenseByDEFAULT(offset, word, word_length, context); } break;
		}
		
		
		
		
		
		
		ICompletionProposal[] array_result = new ICompletionProposal[result.size()];
		return result.toArray(array_result);
		
	}



	/**
	 * @param offset
	 * @param word
	 * @param word_length
	 * @param result
	 */
	private  ArrayList<ICompletionProposal> intellisenseByDEFAULT(int offset, String word, int word_length, SimpleSymbol context) {
		ArrayList<ICompletionProposal> result = new ArrayList<ICompletionProposal>();
		ArrayList<SimpleSymbol> symbols = ReoLangContextUtil.extractSuitableSymbols(editor, context, word);
		ArrayList<String> ids = new ArrayList<String>();
		for(SimpleSymbol s : symbols){
			ids.add(s.getId());
		}
			
		String[] words = new String[ids.size()+reolang_keywords.length];
		ids.toArray(words);
		System.arraycopy(reolang_keywords, 0 , words, ids.size(), reolang_keywords.length);
		
		for (int i= 0; i < words.length; i++) {
			if(word_length > 0 && ((i >= ids.size() && reolang_keywords[i-ids.size()].startsWith(word)) || i < ids.size())){	
				result.add(new CompletionProposal(words[i], offset - word_length, word_length, words[i].length()));
			}
			else {
				if(word_length == 0){
					result.add(new CompletionProposal(words[i], offset, 0, words[i].length()));
				}
			}					
		}
		return result;
	}


	
	
	/**
	 * Context sensitiveness after the '=' character
	 * Gets all the accesses possible for the port being bound (type of port (in or out) is take into account...)
	 * Remove all those already used 
	 * 
	 * @param offset
	 * @param context
	 * @param doc
	 * @return Proposals with access ports for the port being bound  
	 */
	private ArrayList<ICompletionProposal> intellisenseForEQUAL(int offset, SimpleSymbol context, IDocument doc) {
		ArrayList<ICompletionProposal> result = new ArrayList<ICompletionProposal>();
		
		String text_in_context = ReoLangContextUtil.extractText(context.getOffsetStop(), offset, doc);
		String text_after_context = ReoLangContextUtil.extractTextUntilContextIsFinished(offset, doc);
		String[] words = text_in_context.split("\\W");
		try{
			String word = words[words.length-1] ;
			SimpleSymbol symbol = context.getScope().getSymbols().get(word);
			if(symbol.getType() == Type.IN_PORT || symbol.getType() == Type.OUT_PORT) {
				for(SimpleSymbol instance : context.getScope().getSymbols().values()){
					if(instance.getType() == Type.INSTANCE){
						for(SimpleSymbol inst_scope_symbol : instance.getScope().getSymbols().values()){
							if(inst_scope_symbol.getType() == symbol.getType()){
								String access = instance.getId() + "." + inst_scope_symbol.getId();
								if((text_in_context+" "+text_after_context).lastIndexOf(access) == -1){ //not used yet
									result.add(new CompletionProposal(" "+ access , offset, 0, access.length() + 1, null, access, null, null));
								}
							}
						}
					}
				}
			}
			//add the join to the proposal list
			result.add(new CompletionProposal(" join [ ", offset, 0, (" join [ ").length() , null, "join", null, null));
		}
		catch(Exception e) {
			
		}
		
		return result;
	}




	/**
	 *  
	 * Context sensitiveness after the '.' character
	 * Get all Ports used for the WORD before the DOT
	 * Remove the already used ports from the proposal by inspecting the text in the context
	 * 
	 * @param offset the offset where intellisense is requested
	 * @param context the context where the intellisense is requested
	 * @param doc the document where the intellisense is requested 
	 * @param word the word before the DOT
	 *
	 * @return A list of ports proposed for completion
	 */
	private ArrayList<ICompletionProposal> intellisenseForDOT(int offset, SimpleSymbol context, IDocument doc, String word) {
		ArrayList<ICompletionProposal> result = new ArrayList<ICompletionProposal>();
		SimpleSymbol symbol = context.getScope().getSymbols().get(word);
		
		String text_in_context = ReoLangContextUtil.extractText(context.getOffsetStop(), offset, doc);
		String text_after_context = ReoLangContextUtil.extractTextUntilContextIsFinished(offset, doc);
		
		for(String sid : symbol.getScope().getSymbols().keySet()){
			SimpleSymbol s = symbol.getScope().getSymbols().get(sid);
			if(s.getType() == Type.IN_PORT || s.getType() == Type.OUT_PORT) {
				
				if((text_in_context+" "+text_after_context).lastIndexOf(word + "." + sid) == -1 && (text_in_context+" "+text_after_context).lastIndexOf("remaining") == -1){
					result.add(new CompletionProposal(s.getId(), offset, 0, s.getId().length()));
				}
				
			}
		}
		return result;
	}
	
	
	



	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeContextInformation(org.eclipse.jface.text.ITextViewer, int)
	 */
	public IContextInformation[] computeContextInformation(ITextViewer viewer,
			int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getCompletionProposalAutoActivationCharacters()
	 */
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] {'.', '='} ;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationAutoActivationCharacters()
	 */
	public char[] getContextInformationAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getErrorMessage()
	 */
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationValidator()
	 */
	public IContextInformationValidator getContextInformationValidator() {
		// TODO Auto-generated method stub
		return null;
	}

}
