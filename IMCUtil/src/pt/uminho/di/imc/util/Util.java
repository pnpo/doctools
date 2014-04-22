
package pt.uminho.di.imc.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * @author Nuno Oliveira
 * @date 1 de Fev de 2013
 *
 */
public final class Util {
	
		//this must be synchronised as we are calling forked processes in sequence,
		//but they may finish executing in different order than that we call them...
		/**
		 * Minimizes the given File (expected to be AUT file with only internal interactive transitions) 
		 * according to the reductor and bcg_min tools of CADP...
		 * 
		 *  This converts the input IMC file into a CTMC file...
		 *  
		 * @param file the file with the IMC model to be minimized (expected .aut)
		 * @param cadp the path to cadp 
		 * @param cadp_bin the path to cadp bin directory
		 * @param cadp_com the path to cadp com directory
		 * @param directory the working directory
		 */
		@SuppressWarnings("serial")
		public static synchronized void minimize(String file, String cadp, String cadp_bin, String cadp_com, final String directory){
			convertToBCGorAUT(file + ".aut", cadp, cadp_bin, cadp_com, directory + "temp1.bcg");
			reduceBCG(directory + "temp1.bcg", cadp, cadp_bin, cadp_com, directory + "temp2.bcg");
			minimizeBCG(directory + "temp2.bcg", cadp, cadp_bin, cadp_com, directory + "temp3.bcg");
			convertToBCGorAUT(directory + "temp3.bcg", cadp, cadp_bin, cadp_com, file+ "_minimized.aut");
			LinkedList<String> temp_files = new LinkedList<String>() {
			{
				add(directory + "temp1.bcg"); add(directory + "temp2.bcg");
				add(directory + "temp3.bcg"); add(directory + "temp1@1.o");
				add(directory + "temp2@1.o"); add(directory + "temp3@1.o");
				//add(directory + "reductor");
			}};
			clean(temp_files);	
		}
		
		
		/**
		 * Converts a BCG or AUT file into AUT or BCG, resp.
		 * <p>
		 * Basically it calls the process: <tt>bcg_io file output</tt>
		 * 
		 * @param file the file with the IMC model to be minimized (expected .aut)
		 * @param cadp the path to cadp 
		 * @param cadp_bin the path to cadp bin directory
		 * @param cadp_com the path to cadp com directory
		 * @param output the name of the file to generate
		 */
		private static void convertToBCGorAUT(String file, String cadp, String cadp_bin, String cadp_com, String output){
			ProcessBuilder pb1 = new ProcessBuilder(
					cadp_bin + File.separator + "bcg_io", file, output
				);
			processCommand(pb1, cadp, cadp_bin, cadp_com);
		}
		
		
		/**
		 * Reduces a BCG file
		 * <p>
		 * Basically, it calls the process: <tt> bcg_open file reductor -weaktrace output </tt>
		 * 
		 * @param file the file with the IMC model to be minimized (expected .aut)
		 * @param cadp the path to cadp 
		 * @param cadp_bin the path to cadp bin directory
		 * @param cadp_com the path to cadp com directory
		 * @param output the name of the file to generate
		 */
		private static void reduceBCG(String file, String cadp, String cadp_bin, String cadp_com, String output){
			ProcessBuilder pb1 = new ProcessBuilder(
					cadp_com + File.separator + "bcg_open", file, "reductor", "-weaktrace", output
				);
			processCommand(pb1, cadp, cadp_bin, cadp_com);
		}
		
		
		/**
		 * Minimizes a BCG file (and produces an output file)
		 * <p>
		 * Basically it call the process: <tt>bcg_min -branching -rate -self file output</tt>
		 * 
		 * @param file the file with the IMC model to be minimized (expected .aut)
		 * @param cadp the path to cadp 
		 * @param cadp_bin the path to cadp bin directory
		 * @param cadp_com the path to cadp com directory
		 * @param output the name of the file to generate
		 */
		private static void minimizeBCG(String file, String cadp, String cadp_bin, String cadp_com, String output){
			ProcessBuilder pb1 = new ProcessBuilder(
					cadp_bin + File.separator + "bcg_min", "-branching", "-rate", "-self", file, output
				);
			processCommand(pb1, cadp, cadp_bin, cadp_com);
		}
		
		
		/**
		 * Generic process to remove files.
		 * It is SO dependent...
		 * 
		 * @param files a list of files (absolute path) to remove
		 */
		private static synchronized void clean(List<String> files){
			String os = System.getProperty("os.name");
			String remove = os.matches("[Ww][Ii][Nn][Dd][Oo][Ww][Ss]") ? "del" : "rm" ;
			LinkedList<String> remove_args = new LinkedList<String>();
			remove_args.add(remove);
			remove_args.addAll(files);
			ProcessBuilder pb1 = new ProcessBuilder(remove_args);
			processCommand(pb1, "", "", "");
		}
		
		
		
		/**
		 * Sets the environment to the subprocesses of the called process.
		 * 
		 * @param pb the process builder that contains the command to execute.
		 * @param cadp the path to cadp 
		 * @param cadp_bin the path to cadp bin directory
		 * @param cadp_com the path to cadp com directory
		 */
		private static void setEnvironment(ProcessBuilder pb, String cadp, String cadp_bin, String cadp_com) {
			Map<String, String> env = pb.environment();
			env.put("CADP", cadp);
			env.put("PATH", env.get("PATH") + File.pathSeparator + cadp_bin + File.pathSeparator + cadp_com);
		}
		
		
		/**
		 * Generic method to process a command related with CADP...
		 * 
		 * @param pb the process builder that contains the command to execute.
		 * @param cadp the path to cadp 
		 * @param cadp_bin the path to cadp bin directory
		 * @param cadp_com the path to cadp com directory
		 */
		private static synchronized void processCommand(ProcessBuilder pb, String cadp, String cadp_bin, String cadp_com) {
			try{
				String s;
				setEnvironment(pb, cadp, cadp_bin, cadp_com);
				
				Process p = pb.start();
				BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
				BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

		        while ((s = stdInput.readLine()) != null) {
		            System.out.println(s);
		        }
			
				while ((s = stdError.readLine()) != null) {
				    System.out.println(s);
				}
				
				p.waitFor();
				p.destroy();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	
		
		
		
		
	
	
	/**
	 * 
	 * @param path The path of a file to be generated
	 * @param extension the extension of the file (without .)
	 * @param contents the string with the contents of the file.
	 */
	public static void createFile(String path, String extension, String contents){
		try {
			
			if(! path.endsWith("." + extension)){
				
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
			System.err.println("The file path is: " + path);
			System.err.println("Anyway, I'll print it to the stdio!");
			
			System.out.println(contents);
			
		}
	}
	
}
