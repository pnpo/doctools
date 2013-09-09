tree grammar ReoLangSemantics;

options{
	tokenVocab=ReoLangParser;
	ASTLabelType = CommonTree;
}

import RL_DirectiveSemantics, RL_ChannelSemantics, RL_PatternSemantics;


@header{
	package pt.uminho.di.reolang;
	
	import java.text.*;
	import java.util.Date;
	import java.util.Iterator;	
	import pt.uminho.di.reolang.utils.Error;
	import pt.uminho.di.reolang.utils.*;
	import pt.uminho.di.reolang.parsing.*;
	
}


//RULES

reolang[String i_errors, String i_file, SymbolsTable i_gtable] returns [String errors, SymbolsTable symbols]	
	scope{SymbolsTable global_table; String file;}
	@init{
		$reolang::global_table = $reolang.i_gtable;
		$reolang::file = $reolang.i_file;
		String elems_errors = "";
	}
	:^(REO_LANG e1=element
	(
	 es=element
	{
		elems_errors += $es.o_errors;
	}
	)*
	{
		$reolang.errors = $reolang.i_errors + $e1.o_errors + elems_errors;
		$reolang.symbols = $reolang::global_table;
	}
	)
	;
	
element returns [String o_errors]
	:	^(ELEMENT directive_def[$reolang::file, $reolang::global_table] 
	{
		$element.o_errors = $directive_def.o_errors;
		$reolang::global_table = $directive_def.o_gtable;
	}
	)
	|	^(ELEMENT channel_def[$reolang::file, $reolang::global_table] 
	{
		$element.o_errors = $channel_def.o_errors;
		$reolang::global_table = $channel_def.o_gtable;
	}	
	)
	|	^(ELEMENT pattern_def[$reolang::file, $reolang::global_table] 
	{
		$element.o_errors = $pattern_def.o_errors;
		$reolang::global_table = $pattern_def.o_gtable;
	}
	)
	;

