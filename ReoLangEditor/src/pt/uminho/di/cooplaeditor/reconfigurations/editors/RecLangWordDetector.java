package pt.uminho.di.cooplaeditor.reconfigurations.editors;

import org.eclipse.jface.text.rules.IWordDetector;

public class RecLangWordDetector implements IWordDetector {

	public boolean isWordStart(char c) {
		String pattern = "\\w";
		return String.valueOf(c).matches(pattern);
	
	}

	public boolean isWordPart(char c) {
		String pattern = "\\w";
		return String.valueOf(c).matches(pattern);
	}

}
