parser grammar ReoLangParser;

options{
	tokenVocab=ReoLangLexer;
	output=AST;
	k = 2; //GRAMMAR IS LL(2) IN PATTENERNS DEFINITION
}

import RL_DirectiveParser, RL_ChannelParser, RL_PatternParser;

tokens{
	REO_LANG;
	ELEMENT;
}

@header{
	package pt.uminho.di.reolang;
	import java.text.*;
	import java.util.Date;
	import pt.uminho.di.reolang.utils.Error;
	import pt.uminho.di.reolang.utils.ErrorType;
}

@members{
	private String syntaxe_errors = "";
	
	public void emitErrorMessage(String msg) {
        syntaxe_errors += Error.report(ErrorType.ERROR, msg);
    }
	
	//Notice the access to the errors of the imported grammars
	public String getErrors() {
		return 	gRL_DirectiveParser.getErrors() + 
				gRL_ChannelParser.getErrors() + 
				gRL_PatternParser.getErrors() + 
				this.syntaxe_errors;
	}
}



//RULES

reolang 
	:	element element* -> ^(REO_LANG element element*)
	;
	
element
	:	directive_def 	-> ^(ELEMENT directive_def)
	|	channel_def		-> ^(ELEMENT channel_def)
	|	pattern_def		-> ^(ELEMENT pattern_def)
	;

