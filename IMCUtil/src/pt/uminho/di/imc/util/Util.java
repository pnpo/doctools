
package pt.uminho.di.imc.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Map;


/**
 * @author Nuno Oliveira
 * @date 1 de Fev de 2013
 *
 */
public final class Util {
	
	public static void minimize(String file, String cadp, String cadp_bin, String cadp_com, String output) {
		String s;
		String CADP = cadp;
		String CADP_BIN = cadp_bin;
		String CADP_COM = cadp_com;
		String WORK_DIR = output;
		
		ProcessBuilder pb1 = new ProcessBuilder("../lib/minimizer.sh", file, output);
		//File f = new File(WORK_DIR);
		//String ss = f.getAbsolutePath();
		//pb1.directory(new File(ss));		
		try {
			Map<String, String> env = pb1.environment();
			env.put("CADP", CADP);
			env.put("PATH", env.get("PATH") + File.pathSeparator + CADP_BIN + File.pathSeparator + CADP_COM);
			
			Process p = pb1.start();
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

	        while ((s = stdInput.readLine()) != null) {
	            System.out.println(s);
	        }
		
			while ((s = stdError.readLine()) != null) {
			    System.out.println(s);
			}
			
			p.waitFor();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void convertToBCGorAUT(String file, String cadp, String cadp_bin, String cadp_com, String output){
		ProcessBuilder pb1 = new ProcessBuilder("bcg_io", file, output);
		processCommand(pb1, cadp, cadp_bin, cadp_com);
	}
	
	
	public static void test(String file, String cadp, String cadp_bin, String cadp_com, String output){
		ProcessBuilder pb1 = new ProcessBuilder("rm", file);
		processCommand(pb1, cadp, cadp_bin, cadp_com);
	}
	
	
	
	
	
	
	private static void setEnvironment(ProcessBuilder pb, String cadp, String cadp_bin, String cadp_com) {
		Map<String, String> env = pb.environment();
		env.clear();
		env.put("CADP", cadp);
		env.put("PATH", env.get("PATH") + File.pathSeparator + cadp_bin + File.pathSeparator + cadp_com);
	}
	
	
	private static void processCommand(ProcessBuilder pb, String cadp, String cadp_bin, String cadp_com) {
		try{
			String s;
			setEnvironment(pb, cadp, cadp_bin, cadp_com);
			
			System.out.println(pb.environment());
			
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
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
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
