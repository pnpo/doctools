package pt.uminho.di.reolang.reclang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;

import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.cp.model.Node;

public class LoadMain2 {
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	public static void main(String[] args){
		try {
			Node n = new Node();
			n.addEnd("d");
			n.addEnd("e");
			//n.addEnd("g");
			
			Node mi = new Node();
			mi.addEnd("o");
			
			Node mo = new Node();
			mo.addEnd("k");
			
			LinkedHashSet<String> Cs = new LinkedHashSet<String>(){{
				add("s4");
				add("s3");
				add("f2");
			}};
			
			AuxInfo ai = new AuxInfo();
			CoordinationPattern2 p = ai.getData().fst();
			System.out.println("BEFORE--------------");
			System.out.println(p.toString());
			
			
			
			//************ RemoveP ************//
			Class c = Class.forName( "RemoveP" );
			
			Constructor constructor = c.getConstructor(LinkedHashSet.class); //.newInstance( Cs );
			Object removeP = constructor.newInstance(Cs);
//			System.out.println(removeP.toString());
			
			Method apply = c.getMethod("apply", CoordinationPattern2.class);
			CoordinationPattern2 cp = (CoordinationPattern2) apply.invoke(removeP, p );
			
			System.out.println("AFTER--------------");
			System.out.println(cp);
			
			
			
			CoordinationPattern2 p2 = ai.getData().snd();
			System.out.println("Pattern to insert--------------");
			System.out.println(p2.toString());
			
			//************ InsertP ************//
			Class c2 = Class.forName( "InsertP" );
			
			Constructor constructor2 = c2.getConstructor(CoordinationPattern2.class, Node.class, Node.class, Node.class, Node.class, Node.class); //.newInstance(p, n, mi, mo, j1, j2);
			Object insertP = constructor2.newInstance(p2, n, mi, mo, null, null);
			
			Method apply2 = c2.getMethod("apply", CoordinationPattern2.class);
			CoordinationPattern2 cp2 = (CoordinationPattern2) apply2.invoke(insertP, cp );
			
			System.out.println("AFTER InsertP--------------");
			System.out.println(cp2);
            
		}  
        catch (Throwable e) {  
            System.err.println(e);  
        }  
	}
}
