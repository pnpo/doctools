package pt.uminho.di.tools;

import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedHashMap;
import java.util.Properties;

import pt.uminho.di.imc.IMC;
import pt.uminho.di.imc.IMCTransformer;
import pt.uminho.di.imc.parsing.IMCParserWrapper;
import pt.uminho.di.imc.util.Util;


public class Prismer {
	public static void main(String[] args) {
		if(args.length >= 2){
//			if(config.getBoolean("verbose")){
//				System.out.println("Parsing arguments for prism option...");
//			}
			String file_in = args[0];
			String module_name = args[1];
			LinkedHashMap<String, Integer> rewards = new LinkedHashMap<String, Integer>();
			String lbl;
			int rwd;
			for(int i = 2; i < args.length ; i +=2 ) {
				if(args.length > i + 1){
					lbl = args[i];
					try{
						rwd = Integer.parseInt(args[i+1]);
						rewards.put(lbl, rwd);
					}
					catch(Exception e){
						System.err.println("Attention to the reward format. It should be an integer. \nLeaving the program...\n"+e.getMessage() );
						System.exit(1);
					}
				}
			}
			IMCParserWrapper p = new IMCParserWrapper(new File(file_in));
			try{
				
				String OUTPUT = "";
				
				//load a properties file
	    		Properties prop = new Properties();
	    		prop.load(new FileInputStream("../conf/imcreotools.properties"));
	 
	    		//get the property value and print it out
	    		OUTPUT = prop.getProperty("output");
				
				p.parse();
				IMC imc = p.getImc(); 
				
				String full_content = new IMCTransformer(imc).toPRISM(module_name, rewards);
				
				Util.createFile(OUTPUT + File.pathSeparator + module_name, "sm", full_content);
				
			}
			catch(Exception e){
				System.err.println(e.getMessage());
				System.exit(1);
			}
		}
	}
}
