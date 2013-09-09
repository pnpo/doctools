package pt.uminho.di.reolang.parsing.util;

import java.util.ArrayList;


public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Symbol s = new Symbol();
		
		s.setId("fifo");
		s.setType(Type.CHANNEL.toString());
		ArrayList<String> ins = new ArrayList<String>();
		ins.add("i");
		s.setInArgs(ins);
		ArrayList<String> outs = new ArrayList<String>();
		outs.add("o");
		s.setOutArgs(outs);
		s.setLine(1);
		s.setPosition(5);
		
		SymbolsTable st = new SymbolsTable();
		st.add(s);
		
		String ss = st.toString();
		System.out.println(ss);
		
		ArrayList<Error> e1 = new ArrayList<Error>();
		e1.add(new Error(ErrorType.ERROR, "/Users/macbook/teste.java line 8:60 Error1", "/Users/macbook/teste.java"));
		e1.add(new Error(ErrorType.ERROR, "Error 2", 1, 3, "/Users/macbook/teste.java"));
		e1.add(new Error(ErrorType.ERROR, "Error 3", 3, 3, "/Users/macbook/teste.java"));
		ArrayList<Error> e2 = new ArrayList<Error>();
		e2.add(new Error(ErrorType.ERROR, "Error 4", 5, 5, "/Users/macbook/teste2.java"));
		ArrayList<Error> e3 = new ArrayList<Error>();
		e3.add(new Error(ErrorType.ERROR, "Error 5", 10, 5, "/Users/macbook/teste3.java"));
		e3.add(new Error(ErrorType.ERROR, "Error 6", 500, 5, "/Users/macbook/teste3.java"));
		ArrayList<Error> e4 = new ArrayList<Error>();
		e4.add(new Error(ErrorType.ERROR, "/Users/macbook/teste4.java line 187:6 Error7", "/Users/macbook/teste4.java"));
		
		e1.addAll(e2);
		e1.addAll(e3);
		e1.addAll(e4);
	
		System.out.println(e1.toString());
		
	}

}
