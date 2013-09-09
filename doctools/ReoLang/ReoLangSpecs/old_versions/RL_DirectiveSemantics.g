tree grammar RL_DirectiveSemantics;

options{
	ASTLabelType = CommonTree;
}

@members{
	private SymbolsTable symbols_table;
	private String file;
}

directive_def [String i_file, SymbolsTable i_gtable] returns [String o_errors, SymbolsTable o_gtable]
	@init{
		this.symbols_table = $directive_def.i_gtable;
		this.file=$directive_def.i_file;
	}
	:	^(DIRECTIVE directive_body
	{ 
		$directive_def.o_errors = $directive_body.o_errors;
		$directive_def.o_gtable = this.symbols_table;
	}
	)
	;
	
directive_body returns [String o_errors]
	:	^(DIRECTIVE_BODY directive_import
	{
		$directive_body.o_errors = $directive_import.o_errors;
	}
	)
	;
	
directive_import returns [String o_errors]
	:	^(IMPORT FILE_PATH
	{
		ReoLangSemantics.reolang_return imported_atts = Parsing.performParsing($FILE_PATH.text, this.symbols_table);
		$directive_import.o_errors = imported_atts != null ? imported_atts.errors : "";
		this.symbols_table = imported_atts != null ? imported_atts.symbols : this.symbols_table ;
	}
	)
	;
	

