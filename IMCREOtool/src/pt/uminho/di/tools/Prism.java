package pt.uminho.di.tools;

import java.io.File;
import java.util.LinkedHashMap;

import pt.uminho.di.imc.IMC;
import pt.uminho.di.imc.IMCTransformer;
import pt.uminho.di.imc.parsing.IMCParserWrapper;


public class Prism {
	public static void main(String[] args) {
		if(args.length >= 3){
//			if(config.getBoolean("verbose")){
//				System.out.println("Parsing arguments for prism option...");
//			}
			String file_in = args[1];
			String file_out = args[2];
			LinkedHashMap<String, Integer> rewards = new LinkedHashMap<String, Integer>();
			String lbl;
			int rwd;
			for(int i = 3; i < args.length ; i +=2 ) {
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
//			if(config.getBoolean("verbose")){
//				System.out.println("Parsing content of file " + file_in);
//			}
			IMCParserWrapper p = new IMCParserWrapper(new File(file_in));
			try{
				p.parse();
				IMC imc = p.getImc(); 
//				if(config.getBoolean("verbose")){
//					System.out.println("Converting to prism matrix");
//				}
				String full_content = new IMCTransformer(imc).toPRISM(file_out, rewards);
//				if(config.getBoolean("verbose")){
//					System.out.println("Converting to prism matrix");
//				}
				Main.createFile(file_out, "sm", full_content);
				
			}
			catch(Exception e){
				System.err.println(e.getMessage());
				System.exit(1);
			}
		}
	}
}
