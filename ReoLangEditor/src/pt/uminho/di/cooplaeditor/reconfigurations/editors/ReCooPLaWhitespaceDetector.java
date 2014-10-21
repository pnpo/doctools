package pt.uminho.di.cooplaeditor.reconfigurations.editors;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class ReCooPLaWhitespaceDetector implements IWhitespaceDetector {

	public boolean isWhitespace(char c) {
		return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}
}
