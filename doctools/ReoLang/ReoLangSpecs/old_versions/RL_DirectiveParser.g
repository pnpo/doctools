parser grammar RL_DirectiveParser;

options{
	output=AST;
}

tokens{
	DIRECTIVE;
	DIRECTIVE_BODY;
	IMPORT;
}


@members {
	private String syntaxe_errors = "";
	
	public void emitErrorMessage(String msg) {
        syntaxe_errors += Error.report(ErrorType.ERROR, msg);
    }
	
	public String getErrors() {
		return syntaxe_errors;
	}
}

directive_def
	:	DIRECTIVE_START directive_body -> ^(DIRECTIVE directive_body)
	;
	
directive_body
	:	directive_import -> ^(DIRECTIVE_BODY directive_import)
	;
	
directive_import
	:	RW_IMPORT FILE_OPEN FILE_PATH FILE_CLOSE -> ^(IMPORT FILE_PATH)
	;
	

