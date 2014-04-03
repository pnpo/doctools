grammar IMCREOScriptParser;

@lexer::header {
	package pt.uminho.di.imc.reo.parsing;
}


@header{
	package pt.uminho.di.imc.reo.parsing;
	import pt.uminho.di.imc.reo.composition.*;
	import pt.uminho.di.imc.reo.imc.*;
	import java.lang.reflect.*;
	import java.util.LinkedHashSet;
}


@members{
	private Composer2 composer;
	
	private IMCREOimc element2IMC(String method_name, ArrayList<String> str_args) {
		Object[] args = new Object[str_args.size()];
		str_args.toArray(args);
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
	
channel	:	'sync' identification[new ArrayList<String>()] stoch
	{
		$identification.args.add($stoch.rate);
		this.composer.getElements().add(this.element2IMC("sync_", $identification.args));
	}
	|	'drain' identification[new ArrayList<String>()] stoch
	{
		$identification.args.add($stoch.rate);
		this.composer.getElements().add(this.element2IMC("drain_", $identification.args));
	}
	|	'lossy' identification[new ArrayList<String>()] s1=stoch s2=stoch
	{
		$identification.args.add($s1.rate);
		$identification.args.add($s2.rate);
		this.composer.getElements().add(this.element2IMC("lossy_", $identification.args));
	}
	|	'fifo1e' identification[new ArrayList<String>()] s1=stoch s2=stoch
	{
		$identification.args.add($s1.rate);
		$identification.args.add($s2.rate);
		this.composer.getElements().add(this.element2IMC("fifo1e_", $identification.args));
	}
	|	'fifo1f' identification[new ArrayList<String>()] s1=stoch s2=stoch
	{
		$identification.args.add($s1.rate);
		$identification.args.add($s2.rate);
		this.composer.getElements().add(this.element2IMC("fifo1f_", $identification.args));
	}
	;
	
identification [ArrayList<String> args_in] returns [ArrayList<String> args]
	:	 id=ID p1=ID p2=ID
	{
		$identification.args_in.add($id.text);
		$identification.args_in.add($p1.text);
		$identification.args_in.add($p2.text);
		$identification.args = $identification.args_in;
	}
	;

stoch 	returns [String rate, double d_rate]
	:	 NUMBER 
	{
		$stoch.rate = $NUMBER.text;
		$stoch.d_rate = Double.parseDouble($NUMBER.text);
	}
	;
	
node	:	'mer_rep' identification2 (s1=stoch s2=stoch)?
	{
		IMCREOimc res = null;
		if($s1.rate != null){
			res = Library.merger_replicator($s1.d_rate, $s2.d_rate, $identification2.ins, $identification2.outs);
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
			res = Library.merger_router($s1.d_rate, $s2.d_rate, $identification2.ins, $identification2.outs);
		}
		else {
			res = Library.merger_router($identification2.ins, $identification2.outs);
		}
		this.composer.getElements().add(res);
	}
	;
	


identification2 returns [LinkedHashSet<String> ins, LinkedHashSet<String> outs]
@init{
	LinkedHashSet<String> _ins = new LinkedHashSet<String>();
	LinkedHashSet<String> _outs = new LinkedHashSet<String>();
}
	:	'[' ( i1=ID { _ins.add($i1.text) ;} )+ ']' 
		'[' ( i2=ID { _outs.add($i2.text); } )+ ']'
	{
		$identification2.ins = _ins;
		$identification2.outs = _outs;
	}
	;
	
environment 
@init{
	ArrayList<String> args = new ArrayList<String>();
}
	:	'env' ID stoch
	{
		args.add($ID.text);
		args.add($stoch.rate);
		this.composer.getElements().add(this.element2IMC("env_", args));
	}
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

