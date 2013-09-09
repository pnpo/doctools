package pt.uminho.di.reolangeditor.editors;

import org.eclipse.jface.text.rules.IWordDetector;

public class ReoLangWordDetector implements IWordDetector {

	public boolean isWordStart(char c) {
		String pattern = "\\w";
		return String.valueOf(c).matches(pattern);
	
	}

	public boolean isWordPart(char c) {
		String pattern = "\\w";
		return String.valueOf(c).matches(pattern);
	}

}
