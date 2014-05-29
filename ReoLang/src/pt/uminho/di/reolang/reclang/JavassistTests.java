package pt.uminho.di.reolang.reclang;

import javassist.*;
import javassist.bytecode.MethodInfo;

import pt.uminho.di.reolang.reclang.Constants;

public class JavassistTests {

	public static void main(String[] args) throws Exception {
    
    	ClassPool pool = ClassPool.getDefault();
		
    	pool.importPackage(Constants.JAVASSIST);
    	
		pool.importPackage(Constants.CP_MODEL);
		pool.importPackage(Constants.JAVA_UTIL);
		pool.importPackage("java.lang");
		pool.importPackage(Constants.REOLANG_PARSING_UTIL);
		pool.importPackage(Constants.CP_RECONFIGURATIONS);


		/*
		ClassPool pool = ClassPool.getDefault();
		CtClass cc = pool.get("pt.uminho.di.cp.reconfigurations.Reconfiguration");
		cc.setName("Overlap");
		*/
		
		CtClass cc = pool.makeClass("OverlaP");
		CtClass sc = pool.get(Constants.CP_RECONFIGURATIONS + ".Reconfiguration"); //import does not affect get() method in ClassPool
		cc.setSuperclass(sc);

		CtField p = CtField.make("private CoordinationPattern2 p;", cc);
		cc.addField(p);
		CtField X = CtField.make("private LinkedHashSet X;", cc); //LinkedHashSet<Pair<Node,Node>>
		cc.addField(X);


		CtConstructor c = CtNewConstructor.make(
				"public OverlapP(CoordinationPattern2 arg1, LinkedHashSet arg2 ) { this.p = arg1; this.X = arg2; }", 
				cc);
		cc.addConstructor(c);
		
		MethodInfo methodInfo = c.getMethodInfo();
		System.out.println(methodInfo);
//		
////		"()Ljava/util/LinkedHashSet<Ljava/lang/String;>;");
//		SignatureAttribute signatureAttribute = new SignatureAttribute(methodInfo.getConstPool(),
//				"()Ljava/util/LinkedHashSet<Lpt/uminho/di/recolang/parsing/util/Pair<Lpt/uminho/di/cp/model/Node;Lpt/uminho/di/cp/model/Node;>;>;");
//
//		
////		methodInfo.getAttributes().add(signatureAttribute);
//		methodInfo.addAttribute(signatureAttribute);
//
//		c.getMethodInfo().addAttribute(signatureAttribute);
//		
		//c.getMethodInfo().setDescriptor("(Lpt/uminho/di/cp/model/CoordinationPattern2;Ljava/util/LinkedHashSet<Lpt/uminho/di/recolang/parsing/util/Pair<Lpt/uminho/di/cp/model/Node;Lpt/uminho/di/cp/model/Node;>;>;)V");
		System.out.println(c.getMethodInfo());
		
		
		CtMethod m = CtNewMethod.make(
                "public CoordinationPattern2 apply(CoordinationPattern2 cp) { return cp; }",
                cc);
		
		//m.insertBefore("{ Par par; Join join; par = new Par(this.p); par.apply($cp); for(Pair n : this.X) { Node n1, n2; n1 = n.fst(); n2 = n.snd(); LinkedHashSet E = new LinkedHashSet(); E.add(n1); E.add(n2); join = new Join(E); join.apply($cp); } }");
		m.insertBefore("{ " +
				"Par par; " +
				"Join join ; " +
				"par = new Par(this.p); " +
				"par.apply($1); " +
				//"for(Pair n : this.X) { " +
				"ArrayList ns = new ArrayList(this.X);" + 
				"for(int i=0; i < ns.size(); i++) {" +
				//"Pair n = new Pair();" + 
				"	Pair n = ns.get(i);" + 
				"	Node n1; Node n2; " +
				"	n1 = n.fst(); " +
				"	n2 = n.snd(); " +
				"	LinkedHashSet E = new LinkedHashSet(); " +
				"	E.add(n1); " +
				"	E.add(n2); " +
				"	join = new Join(E); " +
				"	join.apply($1); " +
				"} " +
			"}");

		cc.addMethod(m);


		try {
			cc.writeFile();
			System.out.println("class created");
		}
		catch (NotFoundException e) {
		    System.out.println(e);
		}

    }
}

