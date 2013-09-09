package pt.uminho.di.reolangeditor.reconfigurations.editors;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class RecLangWhitespaceDetector implements IWhitespaceDetector {

	public boolean isWhitespace(char c) {
		return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}
}
