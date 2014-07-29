package pt.uminho.di.cooplaeditor.editors;

import java.util.*;

import org.eclipse.jface.text.rules.*;
import org.eclipse.jface.text.*;
import org.eclipse.swt.SWT;

public class ReoLangScanner extends RuleBasedScanner {

	private static String[] reolang_keywords = {"channel", "pattern", "import", "extends", "stochastic"};
	private static String[] reolang_special_keywords = {"as", "of", "NULL"};
	private static String[] reolang_separators = {"in", "use", "observers", "state"};
	private static String[] reolang_operators = {"remaining", "join", "flow", "to"};
	//private static String[] reolang_symbol_operators = {"@", "~"};
	
	private List<IRule> rules;
	private ReoLangColorManager manager;
	
	public ReoLangScanner(ReoLangColorManager manager) {
		IToken keywords = new Token( new TextAttribute( manager.getColor(IReoLangColorConstants.REOLANG_COLOR_KEYWORDS), null, SWT.ITALIC));
		IToken special_keywords = new Token( new TextAttribute( manager.getColor(IReoLangColorConstants.REOLANG_COLOR_SPECIAL_KEYWORDS), null, SWT.BOLD));
		IToken separators = new Token( new TextAttribute( manager.getColor(IReoLangColorConstants.REOLANG_COLOR_SEPARATORS), null, SWT.BOLD));
		IToken operators = new Token( new TextAttribute( manager.getColor(IReoLangColorConstants.REOLANG_COLOR_OPERATORS)));
		IToken sym_operators = new Token( new TextAttribute( manager.getColor(IReoLangColorConstants.REOLANG_COLOR_OPERATORS)));
		IToken sl_comment = new Token( new TextAttribute( manager.getColor(IReoLangColorConstants.REOLANG_COLOR_SINGLELINE_COMMENT)));
		IToken code_default = new Token( new TextAttribute( manager.getColor(IReoLangColorConstants.REOLANG_COLOR_DEFAULT)));
		//multiple-line comment is dealt at the SourceViewerConfiguration within the presentation reconciler
		
		this.manager = manager;
		this.rules= new ArrayList<IRule>();
		
		// Add rule for single line comments.
		rules.add(new EndOfLineRule("//", sl_comment));

		// Add generic whitespace rule.
		rules.add(new WhitespaceRule(new ReoLangWhitespaceDetector()));
		
		//Add rule for symbol operators
		rules.add(new ReoLangSymbolRule(sym_operators));
		
		// Add word rule for words.
        WordRule wordRule= new WordRule(new ReoLangWordDetector(), code_default);
        
        // Add word rule for keywords.
        for (int i= 0; i < reolang_keywords.length; i++)
            wordRule.addWord(reolang_keywords[i], keywords);
        //rules.add(wordRule);
        
        // Add word rule for special keywords
        for (int i= 0; i < reolang_special_keywords.length; i++)
            wordRule.addWord(reolang_special_keywords[i], special_keywords);
        //rules.add(wordRule);
        
        // Add word rule for special operators
        for (int i= 0; i < reolang_operators.length; i++)
            wordRule.addWord(reolang_operators[i], operators);
        //rules.add(wordRule);
        
        // Add word rule for separators
        for (int i= 0; i < reolang_separators.length; i++)
            wordRule.addWord(reolang_separators[i], separators);
        
        
        rules.add(wordRule);
        

        IRule[] result= new IRule[rules.size()];
        rules.toArray(result);
        setRules(result);

		
	}



	/**
	 * Convert the names in a list to rules, and add these dynamic rules to the static rules
	 * created at instantiation time...
	 * 
	 * @param names the words to be recognized by the scanner
	 */
	public void setIdsForSyntaxColoring(ArrayList<String> names) {
		List<IRule> dynamic_rules = new ArrayList<IRule>();
		dynamic_rules.addAll(rules);
		
		IToken patterns_channels = new Token( new TextAttribute( this.manager.getColor(IReoLangColorConstants.REOLANG_CHANNELS_AND_PATTERNS), null, SWT.BOLD));
		WordRule wordRule= new WordRule(new ReoLangWordDetector());
		
		for (String name : names)
            wordRule.addWord(name, patterns_channels);
		dynamic_rules.add(wordRule);
        IRule[] result= new IRule[dynamic_rules.size()];
        dynamic_rules.toArray(result);
        setRules(result);
	}
}
