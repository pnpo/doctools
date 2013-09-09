/**
 * 
 */
package pt.uminho.di.reolangeditor.editors.context;

import java.util.ArrayList;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;

import pt.uminho.di.reolang.parsing.util.SimpleSymbol;
import pt.uminho.di.reolang.parsing.util.Type;
import pt.uminho.di.reolangeditor.editors.ReoLangEditor;

/**
 * @author Nuno Oliveira
 * @date 7 de Mai de 2012
 *
 */
public class ReoLangContextUtil {

	
	
	
	/**
	 * Retireves the text from the context start offset until its end...
	 * It is added a small initial text like "  pattern  " or "  channel  "
	 * for processing purposes;  
	 * 
	 * @param viewer the viewer of the document opened
	 * @param context the symbol in context
	 * @param offset the position of the caret within the text
	 * @return the text from the start of the context until its end
	 */
	public static String extractTextInContext(ITextViewer viewer, SimpleSymbol context, int offset){
		String text = "";
		IDocument doc = viewer.getDocument();
		text += extractText(context.getOffsetStart(), offset, doc);
		text += extractTextUntilContextIsFinished(offset, doc);
		String text_aux = "";
		if(context.getOffsetStart()-15 > 0){
			try{
				text_aux = doc.get(context.getOffsetStart()-15, 15);
			}
			catch(BadLocationException ble){
				ble.printStackTrace();
			}
		}
		
		return text_aux + text;
	}
	
	
	
	
	
	
	
	
	
	/**
	 * Retrieves the text from the context start_offset until a given end_offset
	 * 
	 * @param start_offset
	 * @param end_offset
	 * @param doc
	 */
	public static String extractText(int start_offset, int end_offset, IDocument doc) {
		String text = "";
		try {
			text = doc.get(start_offset, end_offset - start_offset);
		} catch (BadLocationException e) {}
		return text;
	}

	
	

	/**
	 * Retrieves the text from the offset until the first occurrence of a } (or all if } does not exists)
	 * @param offset
	 * @param doc
	 * @return
	 */
	public static String extractTextUntilContextIsFinished(int offset, IDocument doc) {
		String text_after_context = "";
		String all_text_after_offset = "";
		try {
			all_text_after_offset = doc.get(offset, doc.getLength()-offset);
		} catch (BadLocationException e) {}
		
		int index_of_curly = all_text_after_offset.indexOf('}');
		text_after_context = index_of_curly != -1 ? all_text_after_offset.substring(1, index_of_curly) : all_text_after_offset;
		
		return text_after_context;
	}



	/**
	 * Searches for a probable scope, based on a given offset.
	 * The algorithm is quite simple:
	 * 1 - gets the document model - root (in our case the root of a symbols table, but it may be a tree or whatever)
	 * 2 - the root symbol is set as the initial probable context
	 * 3 - for each symbol S in the scope of our root
	 * 		4 - compares the end offset of S with the given offset and the offset of the previous probable_context
	 *    	5 - if it is less than the offset but greater than the previous probable context...
	 *      6 - S is the new probable context
	 *      
	 * The context is only probable because it uses the model from a FuzzyAnalysis strategy... 
	 * so, it is the truly context within a certain degree of completeness and correctness of the source code...  
	 * 
	 * @param offset
	 * @return The main symbol (Channel or Pattern) where the offset is in
	 */
	public static SimpleSymbol findMainContext(ReoLangEditor editor, int offset) {
		SimpleSymbol root = editor.getReoLangOutlineModel();
		SimpleSymbol probable_context = root; //offsets are always 0... unless there is no channel or pattern defined, there will be always a more probable context
		for(String sid : root.getScope().getSymbols().keySet()){
			SimpleSymbol s = root.getScope().getSymbols().get(sid);
			if(s.getOffsetStop() > probable_context.getOffsetStop() && s.getOffsetStop() < offset ){
				probable_context = s; 
			}
		}
		return probable_context;
	}
	
	
	
	
	public static ArrayList<SimpleSymbol> extractSuitableSymbols(ReoLangEditor editor, SimpleSymbol context, String word) {
		ArrayList<SimpleSymbol> result = new ArrayList<SimpleSymbol>();
		boolean is_a_prefix;
		SimpleSymbol model = editor.getReoLangOutlineModel();
		if(model != null){
			for(SimpleSymbol e : model.getScope().getSymbols().values()){
				
				switch(e.getType()){
					
					case CHANNEL : {
						is_a_prefix = e.getId().startsWith(word); 
						if(is_a_prefix){
							result.add(e);
						}
					} ; break ; 
					//END CHANNEL
					
					case PATTERN : {
						is_a_prefix = e.getId().startsWith(word); 
						if(is_a_prefix){
							result.add(e);
						}
					} ; break ;
					//END PATTERN
					
					default : break ;
					//END DEFAULT
				}

			}
		}
		
		for(SimpleSymbol ee : context.getScope().getSymbols().values()){
			if(ee.getType() == Type.INSTANCE){
				is_a_prefix = ee.getId().startsWith(word); 
				if(is_a_prefix){
					result.add(ee);
				}
			}
		}
		
		return result;
	}
	
	
}
