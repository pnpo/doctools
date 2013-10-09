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
	
header	:	'des' '(' init=INT {this.imc.addInitialState( $init.text) ;} ',' n_trans=INT ',' n_states=INT')'
	;
	
body	:	('(' source=INT ',' label=(STRING|ID) ',' target=INT ')'
	{
		Transition t ;
		if($label.text.equals("i") || ! $label.text.matches(".*\\s*rate\\s+\\d.*\"")) {
			String _label = "" ;
			if($label.text.equals("i"))
			{
				_label = "tau";
			}
			else {
				if($label.text.contains("\"")){
					_label = $label.text.substring(1,$label.text.length()-1);
				}
				else {
					_label = $label.text;
				}
				
			}
			t = new InteractiveTransition($source.text, $target.text, _label);
			//System.out.println(_label);
		}
		else {
			Pattern pattern = Pattern.compile("rate\\s+(\\d.+)"); 
    			Matcher matcher = pattern.matcher($label.text);
    			matcher.find();
			double _rate = Double.parseDouble(matcher.group(1).substring(0,matcher.group(1).length()-1));
			int idx_semicolon = $label.text.indexOf(';');
			String _label = "";
			if(idx_semicolon!=-1){
				_label = $label.text.substring(1,idx_semicolon);
			}
			t = new MarkovianTransition($source.text, $target.text, _rate, _label);
		}
		this.imc.addTransition(t);
		this.imc.addState($source.text);
		this.imc.addState($target.text);
	}	
	)+
	;










INT :	'0'..'9'+
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;
    
ID	: ('a'..'z'|'A'..'Z'|'0'..'9'|'~'|'['|']'|'$'|'#')+
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