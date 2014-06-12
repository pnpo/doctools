package pt.uminho.di.reolangeditor.reconfigurations.editors;

import java.util.*;

import org.eclipse.jface.text.rules.*;
import org.eclipse.jface.text.*;
import org.eclipse.swt.SWT;

public class RecLangScanner extends RuleBasedScanner {

	private static String[] reconflang_keywords = {"reconfiguration", "import", "main"};
	private static String[] reconflang_special_keywords = {"forall"};
	private static String[] reconflang_types = {"Pattern", "Channel", "Name", "Node", "Set", "Pair", "Triple"};
	private static String[] reconflang_operators = {"par", "join", "split", "remove", "id", "const", "fst", "snd", "trd", "in", "out", "nodes", "names", "name"};
	//private static String[] reolang_symbol_operators = {"@", "~"};
	
	private List<IRule> rules;
	private RecLangColorManager manager;
	
	public RecLangScanner(RecLangColorManager manager) {
		IToken keywords = new Token( new TextAttribute( manager.getColor(IRecLangColorConstants.RECONFLANG_COLOR_KEYWORDS), null, SWT.ITALIC));
		IToken special_keywords = new Token( new TextAttribute( manager.getColor(IRecLangColorConstants.RECONFLANG_COLOR_SPECIAL_KEYWORDS), null, SWT.BOLD));
		IToken types = new Token( new TextAttribute( manager.getColor(IRecLangColorConstants.RECONFLANG_COLOR_TYPES), null, SWT.BOLD));
		IToken operators = new Token( new TextAttribute( manager.getColor(IRecLangColorConstants.RECONFLANG_COLOR_OPERATORS)));
		IToken sym_operators = new Token( new TextAttribute( manager.getColor(IRecLangColorConstants.RECONFLANG_COLOR_OPERATORS)));
		IToken sl_comment = new Token( new TextAttribute( manager.getColor(IRecLangColorConstants.RECONFLANG_COLOR_SINGLELINE_COMMENT)));
		IToken code_default = new Token( new TextAttribute( manager.getColor(IRecLangColorConstants.RECONFLANG_COLOR_DEFAULT)));
		//multiple-line comment is dealt at the SourceViewerConfiguration within the presentation reconciler
		
		this.manager = manager;
		this.rules= new ArrayList<IRule>();
		
		// Add rule for single line comments.
		rules.add(new EndOfLineRule("//", sl_comment));

		// Add generic whitespace rule.
		rules.add(new WhitespaceRule(new RecLangWhitespaceDetector()));
		
		//Add rule for symbol operators
		rules.add(new RecLangSymbolRule(sym_operators));
		
		// Add word rule for words.
        WordRule wordRule= new WordRule(new RecLangWordDetector(), code_default);
        
        // Add word rule for keywords.
        for (int i= 0; i < reconflang_keywords.length; i++)
            wordRule.addWord(reconflang_keywords[i], keywords);
        //rules.add(wordRule);
        
        // Add word rule for special keywords
        for (int i= 0; i < reconflang_special_keywords.length; i++)
            wordRule.addWord(reconflang_special_keywords[i], special_keywords);
        //rules.add(wordRule);
        
        // Add word rule for special operators
        for (int i= 0; i < reconflang_operators.length; i++)
            wordRule.addWord(reconflang_operators[i], operators);
        //rules.add(wordRule);
        
        // Add word rule for separators
        for (int i= 0; i < reconflang_types.length; i++)
            wordRule.addWord(reconflang_types[i], types);
        
        
        rules.add(wordRule);
        

        IRule[] result= new IRule[rules.size()];
        rules.toArray(result);
        setRules(result);

		
	}
	
	
}
