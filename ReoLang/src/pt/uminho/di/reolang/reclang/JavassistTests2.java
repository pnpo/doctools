package pt.uminho.di.reolang.reclang;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

import javassist.*;
import pt.uminho.di.reolang.reclang.Constants;

public class JavassistTests2 {

    @SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) throws Exception {
    
    	ClassPool pool = ClassPool.getDefault();
		
    	pool.importPackage(Constants.JAVASSIST);
    	
		pool.importPackage(Constants.CP_MODEL);
		pool.importPackage(Constants.JAVA_UTIL);
		pool.importPackage("java.lang");
		pool.importPackage(Constants.REOLANG_PARSING_UTIL);
		pool.importPackage(Constants.CP_RECONFIGURATIONS);

		CtClass cc = pool.makeClass("pt.uminho.di.reolang.reclang.G");
		CtMethod generate = CtNewMethod.make("public static void generate() { return ; }", cc);
		cc.addMethod(generate);
		
	    try {
	    	ArrayList<String> lista = new ArrayList<String>(); 
	    	//lista.add("System.out.println(\"CLASSE A\");");
	    	//lista.add("System.out.println(\"CLASSE B\");");

	    	/*
	    	lista.add("ClassPool pool = ClassPool.getDefault();\n"
	    			+ "CtClass cc = pool.makeClass(\"OverlaP\");\n"
	    			+ "CtClass sc = pool.get(\"" + PkgConstants.CP_RECONFIGURATIONS + ".Reconfiguration\");\n"
	    			+ "cc.setSuperclass(sc);\n");
	    	*/
	    	
	    	
	    	String hello = "ClassPool pool = ClassPool.getDefault();" +
					"pool.importPackage(\"" + Constants.JAVA_UTIL + "\");" +
	    			"pool.importPackage(\"java.lang\");" +
	    			"CtClass cc = pool.makeClass(\"Hello\");"  + 
	    			
					"CtField name = CtField.make(\"private String name;\", cc);" + 
					"cc.addField(name);" +
					
	    			"CtConstructor c = CtNewConstructor.make(" +
	                "\"public Hello(String n) { this.name = n; }\"," + 
	                "cc);"  +
	    			"cc.addConstructor(c);" +
	                
					"CtMethod m = CtNewMethod.make(" +
					"\"public String apply() { return this.name ; }\", " + 
					"cc);" + 
					"cc.addMethod(m);" +
	    			
	    			"try {" +
		    		"	cc.writeFile(\"bin/\");" +
		    		"	System.out.println(\"class Hello created\");" +
		    		"}" +
		    		"catch (NotFoundException e) {" +
		    		"    System.out.println(e);" + 
		    		"}";
	    	
	    	
	    	
	    	String head = "ClassPool pool = ClassPool.getDefault();" +
	    			"pool.importPackage(\"" + Constants.CP_MODEL + "\");" +
					"pool.importPackage(\"" + Constants.JAVA_UTIL + "\");" +
	    			"pool.importPackage(\"java.lang\");" +
					"pool.importPackage(\"" + Constants.REOLANG_PARSING_UTIL + "\");" +
					"pool.importPackage(\"" + Constants.CP_RECONFIGURATIONS + "\");" +
	    			"CtClass cc = pool.makeClass(\"pt.uminho.di.cp.reconfigurations.Overlap\");" +
	    			"CtClass sc = pool.get(\"pt.uminho.di.cp.reconfigurations.Reconfiguration\");" +
	    			"cc.setSuperclass(sc);" +
	    			"CtField p = CtField.make(\"private Integer p;\", cc);" + 
	    			"cc.addField(p);" +
	    			"CtField Xy = CtField.make(\"private Integer Xy;\", cc);" + 
	    			"cc.addField(Xy);" +
	    			"CtConstructor c = CtNewConstructor.make(" +
	    					"\"public Overlap(Integer p, Integer Xy)" + 
	    					"{  this.p = p; this.Xy = Xy; }\", " + 
	    					"cc);" +
	    			"cc.addConstructor(c);";
	    	
	    	String preb = "CtMethod m = CtNewMethod.make(" +
	                "\"public CoordinationPattern2 apply(CoordinationPattern2 __cp__) { return __cp__; }\"," + 
	                "cc);" + 
	                "m.insertBefore(\"{ ";
	    	
	    	String body = "Par par; " +
					"Join join ; " +
					"par = new Par(this.p); " +
					"par.apply($1); " +
					//"for(Pair n : this.X) { " +
					"ArrayList ns = new ArrayList(this.Xy);" + 
					"for(int i=0; i < ns.size(); i++) {" +
					//"Pair n = new Pair();" + 
					"	Pair n = (Pair)ns.get(i);" + 
					"	Node n1; Node n2; " +
					"	n1 = n.fst(); " +
					"	n2 = n.snd(); " +
					"	LinkedHashSet E = new LinkedHashSet(); " +
					"	E.add(n1); " +
					"	E.add(n2); " +
					"	join = new Join(E); " +
					"	join.apply($1); " +
					"} ";
	    	String posb = "}\");"+
	    		"cc.addMethod(m);" + 
	    		"try {" +
	    		"	cc.writeFile(\"bin/\");" +
	    		"	System.out.println(\"class created\");" +
	    		"}" +
	    		"catch (NotFoundException e) {" +
	    		"    System.out.println(e);" + 
	    		"}";
	    	
	    	//lista.add(head + preb + posb);
	    	lista.add(hello);
	    	
	    	for (String l : lista){
	    		CtMethod generate_to_remove = cc.getDeclaredMethod("generate");
	    		cc.defrost();
	    		cc.removeMethod(generate_to_remove);
	    		
	    		CtMethod generate_new = CtNewMethod.make(
	                    "public static void generate() { " + l + " }",
	                    cc);
	    		cc.addMethod(generate_new);
	    		cc.writeFile("bin/");
	    		
	    		Loader cl = new Loader(pool);
//	    		ClassLoader sl = new ClassLoader) { }; //rever
	            Class cls = cl.loadClass("pt.uminho.di.reolang.reclang.G");
	            cls.getDeclaredMethod("generate", new Class[] {}).invoke(null, new Object[] {});
	    		
	            
	            
	            ///////////////////////////////////////////////////////////////////////////
	    		
	    		//pool.get("pt.uminho.di.cp.reconfigurations.Overlap");
	    		//Loader _cl = new Loader(pool);
//	    		CtClass h = pool.get("Hello");
	            //h.writeFile("bin/");
	    		Class hello_class = cl.loadClass("Hello");
//	            Class overlap_class = cl.loadClass("pt.uminho.di.cp.reconfigurations.Overlap");

//	    		AuxInfo aux = new AuxInfo();
//	    		CoordinationPattern2 p = aux.getData().fst();
//	    		CoordinationPattern2 p3 = aux.getData().snd();
//	    		LinkedHashSet<Pair<Node,Node>> nodes = aux.getData().trd();
	    		
	            //OverlapP overlap = new OverlapP(p3, nodes);
				Object helloo = hello_class.getConstructor(String.class).newInstance(new Object[] {"world"});
//				Object overlap = overlap_class.getConstructor(Integer.class, Integer.class).newInstance(new Object[] {new Integer(1), new Integer(3)});



				System.out.println("---------------------------");
	    		Class cc_class = cl.loadClass("pt.uminho.di.reolang.reclang.G");

				System.out.println(cc_class.getConstructor().toString());
				for (Field ccf : cc_class.getFields()){
					System.out.println(ccf.toString());
				}
				for (Method ccm : cc_class.getDeclaredMethods()){
					System.out.println(ccm.toString());
				}
				
				System.out.println("---------------------------");
//				for (CtMethod hm : h.getDeclaredMethods()){
//					System.out.println(hm.getName());
//				}
				System.out.println(hello_class.getConstructor(String.class).toString());
				for (Field ccf : hello_class.getFields()){
					System.out.println(ccf.toString());
				}
				for (Method mm : hello_class.getDeclaredMethods()){
					System.out.println(mm.toString());
				}
				
				
//				Field x = overlap_class.getField("name");
//				System.out.println(x.toString());
				
				//System.out.println(h.getField("name"));
				

				//p = overlap.apply(p);
//				Method apply = overlap_class.getMethod("apply", new Class[] {});
//	            p = (CoordinationPattern2) apply.invoke(overlap, p);

			    Method apply = hello_class.getMethod("apply", new Class[] {});
				String res = (String) apply.invoke(helloo, new Object[] {} );
				System.out.println(res);
				
//	            System.out.println("OVERLAP------------------");
//	    		System.out.println(p);
	    	}
		}
		catch (NotFoundException exc) {
		    System.out.println(exc.toString());
		}
	    
	    
	    

		/*
		BufferedInputStream fin  = new BufferedInputStream(new FileInputStream("bin/pt/uminho/di/cp/reconfigurations/OverlapP.class"));
		ClassFile cf = new ClassFile(new DataInputStream(fin));
	  
		MethodInfo minfo = cf.getMethod("apply");
		CodeAttribute ca = minfo.getCodeAttribute();
		CodeIterator ci = ca.iterator();
		while (ci.hasNext()) {
		    int index = ci.next();
		    int op = ci.byteAt(index);
		    System.out.println(Mnemonic.OPCODE[op]);
		}
		*/
    }
}

