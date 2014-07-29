package pt.uminho.di.cooplaeditor.reconfigurations.editors;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class RecLangSymbolRule implements IRule {

	protected static final int UNDEFINED= -1;
	protected IToken fToken;
	protected int fColumn= UNDEFINED;
	
	
	public RecLangSymbolRule(IToken token) {
				Assert.isNotNull(token);
				fToken= token;
	}
	
	
	public void setColumnConstraint(int column) {
				if (column < 0)
					column= UNDEFINED;
				fColumn= column;
	}
	
	
	public IToken evaluate(ICharacterScanner scanner) {
		
		String pattern = "[-@&#+]";
		
		int c= scanner.read();
				if (String.valueOf((char)c).matches(pattern)) {
					if (fColumn == UNDEFINED || (fColumn == scanner.getColumn() - 1)) {
						do {
							c= scanner.read();
						} while (String.valueOf((char)c).matches(pattern));
		
						scanner.unread();
						return fToken;
					}
				}
		
				scanner.unread();
				return Token.UNDEFINED;
	}

}
