grammar IMCREOScriptParser;

@lexer::header {
	package pt.uminho.di.imc.reo.parsing;
}


@header{
	package pt.uminho.di.imc.reo.parsing;
	import pt.uminho.di.imc.reo.composition.*;
}


@members{
	private Composer2 composer;
	
	private IMCREOimc element2IMC(String method_name, Object[] args) {
		IMCREOimc imc = null;
		String class_name = "pt.uminho.di.imc.reo.composition.Library";
		Class<?>[] arg_types = new Class[args.length];
			
		//define the type of each argument (all of them are strings)
		for(int i = 0 ; i < arg_types.length ; i ++) {   
			arg_types[i] = String.class ;
		}
		//invoke the method dynamically and store the result in the
		//structure_to_text map
		try {
			Class<?> cls = Class.forName(class_name);
			Method mthd = cls.getMethod(method_name, arg_types);
			String res = (String) mthd.invoke(null, args);
			
			imc = ReoMAParserFrontEnd.parse(res, false);					
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			return imc;
		}
	}
	
}


script
@init{
	composer = new Composer2();
}
	:	element+ environment+
	;

element	:	channel 
	| 	node
	;
	
channel	:	'sync_' identification[new Object[4]] stoch
	{
		$identification.args[3] = $stoch.rate;
		this.composer.getElements().add(this.element2IMC('sync_', $identification.args));
	}
	|	'drain_' identification[new Object[4]] stoch
	{
		$identification.args[3] = $stoch.rate;
		this.composer.getElements().add(this.element2IMC('drain_', $identification.args));
	}
	|	'lossy_' identification[new Object[5]] s1=stoch s2=stoch
	{
		$identification.args[3] = $s1.rate;
		$identification.args[4] = $s2.rate;
		this.composer.getElements().add(this.element2IMC('lossy_', $identification.args));
	}
	|	'fifo1e_' identification s1=stoch s2=stoch
	{
		$identification.args[3] = $s1.rate;
		$identification.args[4] = $s2.rate;
		this.composer.getElements().add(this.element2IMC('lossy_', $identification.args));
	}
	|	'fifo1f_' identification s1=stoch s2=stoch
	{
		$identification.args[3] = $s1.rate;
		$identification.args[4] = $s2.rate;
		this.composer.getElements().add(this.element2IMC('lossy_', $identification.args));
	}
	;
	
identification returns [Object[] args]
	:	 id=ID p1=ID p2=ID
	{
		$identification.args[0] = $id.text;
		$identification.args[1] = $p1.text;
		$identification.args[2] = $p2.text;
	}
	;

stoch 	returns [String rate]
	:	 NUMBER 
	{
		$stoch.rate = NUMBER.text;
	}
	;
	
node	:	'mer_rep' identification2 (s1=stoch s2=stoch)?
	{
		IMCREOimc res = null;
		if($s1.rate !=null){
			res = Library.merger_replicator($identification2.ins, $identification2.outs, $s1.rate, $s2.rate);
		}
		else {
			res = Library.merger_replicator($identification2.ins, $identification2.outs);
		}
		this.composer.getElements().add(res);
	}
	|	'mer_xor' identification2 (s1=stoch s2=stoch)?
	{
		IMCREOimc res = null;
		if($s1.rate !=null){
			res = Library.merger_router($identification2.ins, $identification2.outs, $s1.rate, $s2.rate);
		}
		else {
			res = Library.merger_router($identification2.ins, $identification2.outs);
		}
		this.composer.getElements().add(res);
	}
	;
	


identification2 returns [LinkedHashSet<String> ins, LinkedHashSet<String> outs]
@init{
	ins = new LinkedHashSet<String>();
	outs = new LinkedHashSet<String>();
}
	:	'[' ID {($identification2.ins.add($ID.text)})+ ']' 
		'[' ID {($identificaiton2.outs.add($ID.text))}+ ']'
	;
	
environment 
	:	'env' ID stoch
	;
	

	
	
	

NUMBER
	:	('0'..'9')+
	| FLOAT
	;


ID  :	('a'..'z'|'0'..'9'|'_'|'$') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$'|'|')*
    ;


LABEL  
	:	('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'['|']'|','|'|')*
    	;

fragment
FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n'
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

