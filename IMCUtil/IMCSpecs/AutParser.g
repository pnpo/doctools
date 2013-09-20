grammar AutParser;

@lexer::header {
		package pt.uminho.di.imc.parsing;
}

@header{
	package pt.uminho.di.imc.parsing;
	
	import pt.uminho.di.imc.*;
	import java.util.regex.*;
}


@members {
	private IMC imc;
	
	public IMC getIMC() {
		return this.imc;
	}
	
}



aut
@init{
	imc=new IMC();
}	
	:	header body
	;
	
header	:	'des' '(' init=INT {this.imc.addInitialState("s" + $init.text) ;} ',' n_trans=INT ',' n_states=INT')'
	;
	
body	:	('(' source=INT ',' label=(STRING|'i') ',' target=INT ')'
	{
		Transition t ;
		String regex = ".*;\\s*rate\\s+(\\d.*)\"";
		if($label.text.equals("i") || ! $label.text.matches(regex)) {
			String _label = $label.text ;
			if($label.text.equals("i"))
			{
				_label = "tau";
			}
			else {
				_label = $text.substring(1,$label.text.length()-1);
			}
			t = new InteractiveTransition("s"+$source.text, "s"+$target.text, _label);
		}
		else {
			Pattern pattern = Pattern.compile(regex); 
    			Matcher matcher = pattern.matcher($label.text);
    			matcher.find();
			double _rate = Double.parseDouble(matcher.group(1));
			String _label = $label.text.substring(1,$label.text.indexOf(';'));
			t = new MarkovianTransition("s"+$source.text, "s"+$target.text, _rate, _label);
		}
		this.imc.addTransition(t);
		this.imc.addState("s"+$source.text);
		this.imc.addState("s"+$target.text);
	}	
	)+
	;










INT :	'0'..'9'+
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;