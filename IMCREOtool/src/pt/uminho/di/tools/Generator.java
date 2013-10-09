package pt.uminho.di.tools;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.PrintWriter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.antlr.runtime.tree.CommonTreeNodeStream;

import com.martiansoftware.jsap.FlaggedOption;
import com.martiansoftware.jsap.JSAP;
import com.martiansoftware.jsap.JSAPException;
import com.martiansoftware.jsap.JSAPResult;
import com.martiansoftware.jsap.Switch;
import com.martiansoftware.jsap.UnflaggedOption;

import pt.uminho.di.cp.model.CoordinationPattern;
import pt.uminho.di.imc.IMC;
import pt.uminho.di.imc.IMCTransformer;
import pt.uminho.di.imc.parsing.IMCParserWrapper;
import pt.uminho.di.imc.reo.imc.IMCREOimc;
import pt.uminho.di.imc.reo.composition.Composer;
import pt.uminho.di.imc.reo.composition.ScriptParser;
import pt.uminho.di.imc.reo.parsing.ReoMAParserFrontEnd;
import pt.uminho.di.reolang.ReoLangCPModel;
import pt.uminho.di.reolang.ReoLangSemantics;
import pt.uminho.di.reolang.parsing.CPBuilder;
import pt.uminho.di.reolang.parsing.Semantics;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;

public class Generator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	

		
		JSAP cmd_line = new JSAP();
		try {
			FlaggedOption reo_file = new FlaggedOption("reo_file")
								.setStringParser(JSAP.STRING_PARSER)
								.setShortFlag('f')
								.setLongFlag("reolang")
								.setListSeparator(',');
			reo_file.setHelp("The name of the reolang script with the pattern to convert.");
			cmd_line.registerParameter(reo_file);
			
			FlaggedOption patt = new FlaggedOption("pattern_name")
							.setStringParser(JSAP.STRING_PARSER)
							.setShortFlag('p')
							.setLongFlag("pattern")
							.setListSeparator(',');
			patt.setHelp("The name of the stochastic pattern instance to convert.");
			cmd_line.registerParameter(patt);

			
			UnflaggedOption rma_files = new UnflaggedOption("in_rma_files")
									.setUsageName("rmafile")
									.setStringParser(JSAP.STRING_PARSER)
									.setGreedy(true);
			rma_files.setHelp("The two (EXACTLY 2!!!) RMA files to compose.");
			cmd_line.registerParameter(rma_files);
		
			FlaggedOption mixedports = new FlaggedOption("mixed_ports")
											.setStringParser(JSAP.STRING_PARSER)
											.setShortFlag('m')
											.setLongFlag("mixedports")
											.setList(true)
											.setListSeparator(',');
			mixedports.setHelp("The name of the ports to join.");
			cmd_line.registerParameter(mixedports);
		
			Switch hide = new Switch("hide")
            				.setShortFlag('h')
            				.setLongFlag("hide");
			hide.setHelp("Whether the joined ports are hidden.");
			cmd_line.registerParameter(hide);
			
			Switch labels = new Switch("labels")
							.setShortFlag('l')
							.setLongFlag("labels");
			labels.setHelp("Whether the Interactive Transitions are left unchanged. \n"+
							"It has only effect on the generation of CADP files.\n" + 
							"In case -l or --labels is used, then actions are not \n"+
							"changed in the aut file, otherwise all the actions \n" + 
							"become internal, this is, \"i\".");
			cmd_line.registerParameter(labels);
			
			
			Switch verbose = new Switch("verbose")
							.setShortFlag('v')
							.setLongFlag("verbose");
			verbose.setHelp("Whether it is said whatever is being done.");
			cmd_line.registerParameter(verbose);
			
			//output related
			
			
			
			
			 
			FlaggedOption out_rma_file = new FlaggedOption("out_rma_file")
									.setStringParser(JSAP.STRING_PARSER)
									.setLongFlag("rma");
			out_rma_file.setHelp("The name of the RMA file to create.");
			cmd_line.registerParameter(out_rma_file);
			
			
			FlaggedOption out_ma_file = new FlaggedOption("out_ma_file")
										.setStringParser(JSAP.STRING_PARSER)
										.setLongFlag("ma");
			out_ma_file.setHelp("The name of the MA file to create.");
			cmd_line.registerParameter(out_ma_file);
			
			
			Switch readable = new Switch("readable")
								.setShortFlag('r')
								.setLongFlag("readable");
			readable.setHelp("Whether the generated ma file or dot file are readable or unreadable.");
			cmd_line.registerParameter(readable);
			
			
			
			FlaggedOption out_cadp_file = new FlaggedOption("out_aut_file")
									.setStringParser(JSAP.STRING_PARSER)
									.setLongFlag("cadp");
			out_cadp_file.setHelp("The name of the CADP AUT file to create.");
			cmd_line.registerParameter(out_cadp_file);
			
			FlaggedOption out_dot_file = new FlaggedOption("out_dot_file")
									.setStringParser(JSAP.STRING_PARSER)
									.setLongFlag("dot");
			out_dot_file.setHelp("The name of the DOT file to create.");
			cmd_line.registerParameter(out_dot_file);
			
			
//			FlaggedOption out_prism_trans = new FlaggedOption("prism_trans_matrix")
//											.setStringParser(JSAP.STRING_PARSER)
//											.setLongFlag("prism")
//											.setList(true)
//											.setListSeparator(' ');
//			mixedports.setHelp("The name of the input aut file, the name of the \n"+
//								"output file and a list of label names and their \n" +
//								"rewards. An examples would be: \n" +
//								"--prism in.aut out.sta fst_lbl 1 snd_lbl 2");
//			cmd_line.registerParameter(out_prism_trans);
			
			
			JSAPResult config = cmd_line.parse(args);
			
			
			
			if (!config.success()) {
	            
	            System.err.println();

	            for (java.util.Iterator<?> errs = config.getErrorMessageIterator(); errs.hasNext();) {
	                System.err.println("Error: " + errs.next());
	            }
	            
	            System.err.println();
	            System.err.println("Usage: java -jar IMCREOtool");
	            System.err.println("                "
	                                + cmd_line.getUsage());
	            System.err.println();
	            System.err.println(cmd_line.getHelp());
	            System.exit(1);
	        }
			
			
			
			//PROCESS
			
			IMCREOimc imc_result = null;
			LinkedHashSet<String> ports_set = null;
			
			String[] files = config.getStringArray("in_rma_files");
			if(files.length != 2 && ! config.userSpecified("reo_file")) {
				System.err.println("You must provide exactly 2 rma files or use -f to provide a reolang file!!");
				System.exit(1);
			}
			else {
				if(! config.userSpecified("mixed_ports") && files.length == 2) {
					System.err.println("You must specify nodes to join with -m option!");
					System.exit(1);
				}
				else {
					if(! config.userSpecified("reo_file")) {
						String[] ports = config.getStringArray("mixed_ports");
						
						ports_set = new LinkedHashSet<String>(); 
						for(int i = 0; i < ports.length ; i ++) {
							ports_set.add(ports[i]);
						}
						
						if(config.getBoolean("verbose")){
							System.out.println("Processing " + files[0] + "...");
						}
						IMCREOimc imc1 = ReoMAParserFrontEnd.parse(files[0], true);
						if(config.getBoolean("verbose")){
							System.out.println("Processing " + files[1] + "...");
						}
						IMCREOimc imc2 = ReoMAParserFrontEnd.parse(files[1], true);
						
						System.out.print("Composing and Synchronising...");
						long startTime = System.currentTimeMillis();
						imc_result = imc1.compose(imc2, ports_set).mixedRequestsReduction(ports_set).pruneIMCREO(ports_set);
						long endTime   = System.currentTimeMillis();
						long totalTime = endTime - startTime;
						System.out.println("OK, generated " + imc_result.getIMCProfile() + " in " + totalTime + "ms");
					}
				}
			}
			
			
			if(config.userSpecified("reo_file")) {
				if(!config.userSpecified("pattern_name")) {
					System.err.println("If you are using a ReoLang script, specify a pattern name to convert!");
					System.exit(1);
				}
				else {
					//Process reofile and obtain list of patterns
					String patt_name = config.getString("pattern_name");
					String file_name = config.getString("reo_file");
					Semantics sem = new Semantics(file_name);
					ReoLangSemantics.reolang_return res = sem.performSemanticAnalysis(new SymbolsTable());
					
					if(res!=null && res.errors.size()>0){
						System.out.println(res.errors.toString());
						System.exit(1);
					}
					else {
						if(sem.getErrors().size()>0) {
							System.out.println(sem.getErrors().toString());
							System.exit(1);
						}
					}
					
					CPBuilder cpb = new CPBuilder(file_name);
					ReoLangCPModel rlcpm = cpb.performModelConstruction(new CommonTreeNodeStream(res.getTree()), null, null, res.symbols);
					//LinkedHashMap<String, ReoLangCPModel.CPModelInternal> patterns = rlcpm.getPatterns();
					
					boolean found = false;
					Iterator<String> it = rlcpm.getStochInstances().keySet().iterator();
					String pattern_associated = "";
					while (it.hasNext() && !found){
						String _cp = it.next();
						if(rlcpm.getStochInstances().get(_cp).containsKey(patt_name)){
							found = true;
							pattern_associated = _cp;
						}
					}
					
					if(pattern_associated.equals("")){
						System.err.println("Stochastic Pattern '" + patt_name + "' could not be found... giving up!");
						System.exit(1);
					}
					else {
						if(config.getBoolean("verbose")){
							System.out.println("Applying Stochastic Mappings...");
						}
						CoordinationPattern not_stochastic_cp = rlcpm.getPatterns().get(pattern_associated).getCP();
						LinkedHashMap<String, Double> stoch_values = rlcpm.getStochInstances().get(pattern_associated).get(patt_name);
						CoordinationPattern stochastic_cp = CoordinationPattern.applyStochasticMap(not_stochastic_cp, stoch_values, patt_name);
						
						String imc_script;
						
						imc_script = stochastic_cp.intoIMCScript();
						System.out.println("Composing and Synchronising...");
						long startTime = System.currentTimeMillis();
						ScriptParser sp = new ScriptParser(imc_script);
						Composer cs = sp.parser();
						imc_result = cs.intelligentCompose();
						long endTime   = System.currentTimeMillis();
						long totalTime = endTime - startTime;
						System.out.println("OK, generated " + imc_result.getIMCProfile() + " in " + totalTime + "ms");
						
						ports_set = (LinkedHashSet<String>)cs.getMixed_ports();
						
					}
				}
			}
			
				
			if(config.getBoolean("hide")){
				if(config.getBoolean("verbose")){
					System.out.println("Hiding mixed ports...");
				}
				imc_result.hide(ports_set);
			}
			/*if(config.getBoolean("hide_all")){
				if(config.getBoolean("verbose")){
					System.out.println("Hiding all interactive transitions...");
				}
				imc_result.hide_all();
			}*/
			
			
			
			//output generation
			
			if(! (config.userSpecified("out_ma_file") || 
						config.userSpecified("out_dot_file") || 
							config.userSpecified("out_aut_file") || 
								config.userSpecified("out_rma_file")) ) {
				if(config.getBoolean("verbose")){
					System.out.println("Printing result... \n\n"); 
				}
				System.out.println(imc_result.toString());
			}
			
			if(config.userSpecified("out_rma_file")) {
				if(config.getBoolean("verbose")){
					System.out.println("Creating file " + config.getString("out_rma_file"));
				}
				createFile(config.getString("out_rma_file"), "rma", imc_result.toReoMA());
			}
			
			if(config.userSpecified("out_ma_file")) {
				if(config.getBoolean("verbose")){
					System.out.println("Creating file " + config.getString("out_ma_file"));
				}
				createFile(config.getString("out_ma_file"), "ma", 
						(new IMCTransformer(imc_result.toIMC(config.getBoolean("readable"), false)).toMAFormat()));
			}
			
			if(config.userSpecified("out_dot_file")) {
				if(config.getBoolean("verbose")){
					System.out.println("Creating file " + config.getString("out_dot_file")); 
				}
				createFile(config.getString("out_dot_file"), "dot", 
						(new IMCTransformer(imc_result.toIMC(config.getBoolean("readable"), false)).toDotFormat()));
			}
			
			if(config.userSpecified("out_aut_file")) {
				if(config.getBoolean("verbose")){
					System.out.println("Creating file " + config.getString("out_aut_file")); 
				}
				
				
				if(config.getBoolean("verbose") && !config.getBoolean("labels")){
					System.out.println("Hiding all interactive transitions...");
				}
				String full_content = new IMCTransformer(imc_result.toIMC(config.getBoolean("readable"), false)).toAUTFormat(!config.getBoolean("labels"));
				String content = full_content.substring(0, full_content.indexOf("-- STATES MAPPING --\n\n"));
				String mapping = full_content.substring(full_content.indexOf("-- STATES MAPPING --\n\n")); 
				createFile(config.getString("out_aut_file"), "aut", content);
				createFile(config.getString("out_aut_file"), "mapping", mapping);
			}
			
//			if(config.userSpecified("out_prism_trans")){
//				String[] prism_args = config.getStringArray("prism_trans_matrix");
//				if(config.getBoolean("verbose")){
//					System.out.println("Parsing arguments for prism option...");
//				}
//				String file_in = prism_args[0];
//				String file_out = prism_args[1];
//				LinkedHashMap<String, Integer> rewards = new LinkedHashMap<String, Integer>();
//				String lbl;
//				int rwd;
//				for(int i = 2; i < prism_args.length ; i +=2 ) {
//					if(prism_args.length > i + 1){
//						lbl = prism_args[i];
//						try{
//							rwd = Integer.parseInt(prism_args[i+1]);
//							rewards.put(lbl, rwd);
//						}
//						catch(Exception e){
//							System.err.println("Attention to the reward format. It should be an integer.");
//							System.exit(1);
//						}
//					}
//				}
//				if(config.getBoolean("verbose")){
//					System.out.println("Parsing content of file " + file_in);
//				}
//				IMCParserWrapper p = new IMCParserWrapper(new File(file_in));
//				try{
//					p.parse();
//					IMC imc = p.getImc(); 
//					if(config.getBoolean("verbose")){
//						System.out.println("Converting to prism matrix");
//					}
//					String full_content = new IMCTransformer(imc).toPRISMTransitionMatrix(rewards);
//					if(config.getBoolean("verbose")){
//						System.out.println("Converting to prism matrix");
//					}
//					String content = full_content.substring(0, full_content.indexOf("-- TRANSITION REWARDS --\n\n"));
//					String mapping = full_content.substring(full_content.indexOf("-- TRANSITION REWARDS --\n\n")); 
//					createFile(file_out, "tra", content);
//					createFile(file_out, "rewt", mapping);
//				}
//				catch(Exception e){
//					System.err.println(e.getMessage());
//					System.exit(1);
//				}
//			}
			
			
		} catch (JSAPException e) {
			e.printStackTrace();
		}
		
		
		
		//importar 1 CP em rlf -- PatternViewer Graph to CP.model -- transforma em IMCREOScript -- Compose -- IMCREOimc
		//importar 2 rma -- importar mixed ports -- Compose -- IMCREOimc
		//hide?
		
		//output:
		// 1 - to ReoMA (file)
		// 2 - readable/unreadable MA (file)
		// 2 - readable/unreadable IMC (deprecated) (file)
		// 3 - to AUT (CADP pre-input) (file) 
		// 4 - to DOT (file)
		
	}
	
	
	protected static void createFile(String path, String extension, String contents){
		try {
			
			if(! path.endsWith("." + extension)){
//				System.out.println("WARNING: you provided a wrong file extension. It should be " + extension);
//				System.out.println("\t Don't worry we correct it for you!");
				
				int dot_pos = path.lastIndexOf('.');
				if(dot_pos == -1){
					path += "." + extension;
				}
				else {
					String new_path = path.substring(0, dot_pos+1);
					path = new_path + extension;
				}
				
			}
			
			PrintWriter out = new PrintWriter(path);
			out.print(contents);
			out.close();
			
		} catch (FileNotFoundException e) {
			
			System.err.println("Ups some problems in writing your file!");
			System.err.println("Please check the path and/or the permissions.");
			System.err.println("Anyway, I'll print it to the stdio!");
			
			System.out.println(contents);
			
		}
	}
	
	
	
	
}
