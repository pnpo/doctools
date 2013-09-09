lexer grammar FuzzyPreProcessor;

@header{
	package pt.uminho.di.reolang;
	import pt.uminho.di.reolang.parsing.util.*;
}


@lexer::members{
	private String pre_processed_text = "";
	public String getPre_Processed_Text() {
		return this.pre_processed_text;
	}
}

COMMENT  
    :   '//' ~('\n'|'\r')* '\r'? '\n' {this.pre_processed_text += $text.replaceAll("[^\t]", " ") + "\n";}
    |   '/*' ( options {greedy=false;} : . )* '*/' {this.pre_processed_text += $text.replaceAll("[^\t\n\r]", " "); }
    ;   


REMAINING
	: . {this.pre_processed_text += $text ;}	
	;
