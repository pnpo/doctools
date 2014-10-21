package pt.uminho.di.cooplaeditor.editors;

import java.util.*;

import org.eclipse.jface.text.rules.*;

public class CooPLaPartitionScanner extends RuleBasedPartitionScanner {
	public final static String COOPLA_MULTILINE_COMMENT = "__coopla_multiline_comment";
	public final static String COOPLA_SINGLELINE_COMMENT = "__coopla_singleline_comment";
	//public final static String REOLANG_CODE_BLOCK = "__reolang_code_block";
	public final static String[] PARTITIONS = new String[] {COOPLA_MULTILINE_COMMENT, COOPLA_SINGLELINE_COMMENT };
	
	public CooPLaPartitionScanner() {

		IToken coopla_multiline_comment = new Token(COOPLA_MULTILINE_COMMENT);
		IToken coopla_singleline_comment = new Token(COOPLA_SINGLELINE_COMMENT);
		//IToken reolang_code_block = new Token(REOLANG_CODE_BLOCK);

		List<IPredicateRule> rules = new ArrayList<IPredicateRule>();
		
		//rule for singleline comment
        rules.add(new EndOfLineRule("//", coopla_singleline_comment)); 

        //rule for multiline comment
		rules.add(new MultiLineRule("/*", "*/", coopla_multiline_comment));
		
		//rules.add(new CodeBlockRule(reolang_code_block));

		IPredicateRule[] result= new IPredicateRule[rules.size()];
        rules.toArray(result);
		setPredicateRules(result);
	}
}
