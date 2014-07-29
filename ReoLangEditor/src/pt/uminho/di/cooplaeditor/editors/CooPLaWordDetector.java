package pt.uminho.di.cooplaeditor.editors;

import org.eclipse.jface.text.rules.IWordDetector;

public class CooPLaWordDetector implements IWordDetector {

	public boolean isWordStart(char c) {
		String pattern = "\\w";
		return String.valueOf(c).matches(pattern);
	
	}

	public boolean isWordPart(char c) {
		String pattern = "\\w";
		return String.valueOf(c).matches(pattern);
	}

}
