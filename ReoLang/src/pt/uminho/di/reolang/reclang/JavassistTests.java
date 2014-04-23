package pt.uminho.di.reolang.reclang;

import java.util.ArrayList;

import javassist.*;

public class JavassistTests {
 
	public static final String JAVASSIST = "javassist";
	public static final String JAVA_UTIL = "java.util";
	public static final String CP_MODEL = "pt.uminho.di.cp.model";
	public static final String CP_RECONFIGURATIONS = "pt.uminho.di.cp.reconfigurations";
	public static final String REOLANG_PARSING_UTIL = "pt.uminho.di.reolang.parsing.util";

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception {
    
    	ClassPool pool = ClassPool.getDefault();
		
    	pool.importPackage(JAVASSIST);
    	
		pool.importPackage(CP_MODEL);
		pool.importPackage(JAVA_UTIL);
		pool.importPackage(REOLANG_PARSING_UTIL);
		pool.importPackage(CP_RECONFIGURATIONS);

		CtClass cc = pool.makeClass("pt.uminho.di.reolang.reclang.G");
		CtMethod generate = CtNewMethod.make("public static void generate() { return ; }", cc);
		cc.addMethod(generate);
		
	    try {
	    	ArrayList<String> lista = new ArrayList<String>(); 
	    	lista.add("System.out.println(\"CLASSE A\");");
	    	lista.add("System.out.println(\"CLASSE B\");");
	    	/*
	    	lista.add("ClassPool pool = ClassPool.getDefault();\n"
	    			+ "CtClass cc = pool.makeClass(\"OverlaP\");\n"
	    			+ "CtClass sc = pool.get(\"" + CP_RECONFIGURATIONS + ".Reconfiguration\");\n"
	    			+ "cc.setSuperclass(sc);\n");
	    	*/
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
	    		
//	            cc.writeFile();
	    	}
		}
		catch (NotFoundException exc) {
		    System.out.println(exc.toString());
		}
	    
	    
	    
	    
    	/*

		/*
		ClassPool pool = ClassPool.getDefault();
		CtClass cc = pool.get("pt.uminho.di.cp.reconfigurations.Reconfiguration");
		cc.setName("Overlap");
		/*
		
		CtClass cc = pool.makeClass("OverlaP");
		CtClass sc = pool.get(CP_RECONFIGURATIONS + ".Reconfiguration"); //import does not affect get() method in ClassPool
		cc.setSuperclass(sc);
		
		CtField p = CtField.make("private CoordinationPattern2 p;", cc);
		cc.addField(p);
		CtField X = CtField.make("private int X;", cc); //LinkedHashSet<Pair<Node,Node>>
		cc.addField(X);
		
		//cc.setGenericSignature(sig)
		CtConstructor c = CtNewConstructor.make(
				"public OverlapP(CoordinationPattern2 arg1, int arg2 ) { this.p = arg1; this.X = arg2; }", 
				cc);
		cc.addConstructor(c);

		CtMethod m = CtNewMethod.make(
                "public CoordinationPattern2 apply(CoordinationPattern2 cp) { return cp; }",
                cc);
		m.insertBefore("{ Par par; par = new Par(this.p); par.apply($1); }");
		//m.insertBefore("par = new Par(this.p);");
		cc.addMethod(m);


		try {
			cc.writeFile();
			System.out.println("class created");
		}
		catch (NotFoundException e) {
		    System.out.println(e);
		}
		*/
    }
}

