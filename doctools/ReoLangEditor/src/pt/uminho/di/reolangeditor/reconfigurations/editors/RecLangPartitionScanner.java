package pt.uminho.di.reolangeditor.reconfigurations.editors;

import java.util.*;

import org.eclipse.jface.text.rules.*;

public class RecLangPartitionScanner extends RuleBasedPartitionScanner {
	public final static String RECONFLANG_MULTILINE_COMMENT = "__reconflang_multiline_comment";
	public final static String RECONFLANG_SINGLELINE_COMMENT = "__reconflang_singleline_comment";
	//public final static String REOLANG_CODE_BLOCK = "__reolang_code_block";
	public final static String[] PARTITIONS = new String[] {RECONFLANG_MULTILINE_COMMENT, RECONFLANG_SINGLELINE_COMMENT };
	
	public RecLangPartitionScanner() {

		IToken reconflang_multiline_comment = new Token(RECONFLANG_MULTILINE_COMMENT);
		IToken reconflang_singleline_comment = new Token(RECONFLANG_SINGLELINE_COMMENT);
		//IToken reolang_code_block = new Token(REOLANG_CODE_BLOCK);

		List<IPredicateRule> rules = new ArrayList<IPredicateRule>();
		
		//rule for singleline comment
        rules.add(new EndOfLineRule("//", reconflang_singleline_comment)); 

        //rule for multiline comment
		rules.add(new MultiLineRule("/*", "*/", reconflang_multiline_comment));
		
		//rules.add(new CodeBlockRule(reolang_code_block));

		IPredicateRule[] result= new IPredicateRule[rules.size()];
        rules.toArray(result);
		setPredicateRules(result);
	}
}
