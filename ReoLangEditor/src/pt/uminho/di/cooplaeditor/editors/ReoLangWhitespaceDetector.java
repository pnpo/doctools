package pt.uminho.di.cooplaeditor.editors;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class ReoLangWhitespaceDetector implements IWhitespaceDetector {

	public boolean isWhitespace(char c) {
		return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}
}
