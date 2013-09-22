package pt.uminho.di.tools;

public class Main {

	public static void main(String[] args) {
		if(args.length > 0) {
			String tool = args[0];
			String[] tool_args = new String[args.length-1];
			for(int i=0 ; i < args.length -1 ; i++){
				tool_args[i] = args[i+1];
			}
			//generator
			if(tool.equals("generator")){
				Generator.main(tool_args);
				System.exit(0);
			}
			//prismer
			if(tool.equals("prismer")){
				Prismer.main(tool_args);
				System.exit(0);
			}
		}
	}
	
}
