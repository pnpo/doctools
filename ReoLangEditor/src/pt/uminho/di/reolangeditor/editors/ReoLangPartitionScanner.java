package pt.uminho.di.reolangeditor.editors;

import java.util.*;

import org.eclipse.jface.text.rules.*;

public class ReoLangPartitionScanner extends RuleBasedPartitionScanner {
	public final static String REOLANG_MULTILINE_COMMENT = "__reolang_multiline_comment";
	public final static String REOLANG_SINGLELINE_COMMENT = "__reolang_singleline_comment";
	//public final static String REOLANG_CODE_BLOCK = "__reolang_code_block";
	public final static String[] PARTITIONS = new String[] {REOLANG_MULTILINE_COMMENT, REOLANG_SINGLELINE_COMMENT };
	
	public ReoLangPartitionScanner() {

		IToken reolang_multiline_comment = new Token(REOLANG_MULTILINE_COMMENT);
		IToken reolang_singleline_comment = new Token(REOLANG_SINGLELINE_COMMENT);
		//IToken reolang_code_block = new Token(REOLANG_CODE_BLOCK);

		List<IPredicateRule> rules = new ArrayList<IPredicateRule>();
		
		//rule for singleline comment
        rules.add(new EndOfLineRule("//", reolang_singleline_comment)); 

        //rule for multiline comment
		rules.add(new MultiLineRule("/*", "*/", reolang_multiline_comment));
		
		//rules.add(new CodeBlockRule(reolang_code_block));

		IPredicateRule[] result= new IPredicateRule[rules.size()];
        rules.toArray(result);
		setPredicateRules(result);
	}
}
