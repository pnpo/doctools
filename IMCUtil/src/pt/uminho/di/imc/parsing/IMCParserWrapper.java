package pt.uminho.di.imc.parsing;

/**
 * @author Nuno Oliveira
 * @date 28 de Nov de 2012
 *
 */

import java.io.File;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import pt.uminho.di.imc.IMC;

public class IMCParserWrapper {

	private IMC imc;
	private String file_name;
	private File file;
	
	public IMCParserWrapper(File f) {
		this.imc = new IMC();
		this.file = f;
		this.file_name = f.getAbsolutePath();
	}
	
	
	
	/**
	 * @return the imc
	 */
	public IMC getImc() {
		return imc;
	}

	/**
	 * @param imc the imc to set
	 */
	public void setImc(IMC imc) {
		this.imc = imc;
	}

	/**
	 * @return the file_name
	 */
	public String getFile_name() {
		return file_name;
	}

	/**
	 * @param file_name the file_name to set
	 */
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	
	
	/**
	 * Parses the file given to the wrapper choosing among 
	 * IMC or MA type of parser, based on the file extension.
	 * 
	 * Generates an IMC and sets it to the class field imc.
	 * 
	 * @throws InvalidIMCFileException
	 * @throws RecognitionException
	 * @throws IOException
	 */
	public void parse() throws InvalidIMCFileException, RecognitionException, IOException {
		int ext_index = this.file_name.lastIndexOf(".");
		String ext = this.file_name.substring(ext_index+1);
		if( ext.equals("imc") || ext.equals("ma") || ext.equals("aut")) {
			if(ext.equals("imc")) {
				this.parseIMC();
			}
			else {
				if(ext.equals("ma")) {
					this.parseMA();
				}
				else {
					if(ext.equals("aut")) {
						this.parseAUT();
					}
				}
			}
		}
		else {
			throw new InvalidIMCFileException();
		}
	}

	
	private void parseIMC() throws RecognitionException, IOException {
		ImcParserLexer lex1 = new ImcParserLexer(new ANTLRFileStream(this.file.getAbsolutePath(), "UTF8"));
        CommonTokenStream tokens1 = new CommonTokenStream(lex1);
        
        ImcParserParser g = new ImcParserParser(tokens1);
        g.imc();
        this.imc = g.getIMC();
	}

	private void parseMA() throws RecognitionException, IOException {
		MAParserLexer lex1 = new MAParserLexer(new ANTLRFileStream(this.file.getAbsolutePath(), "UTF8"));
        CommonTokenStream tokens1 = new CommonTokenStream(lex1);
        
        MAParserParser g = new MAParserParser(tokens1);
        g.imc();
        this.imc = g.getIMC();
	}
	
	
	private void parseAUT() throws RecognitionException, IOException {
		AutParserLexer lex1 = new AutParserLexer(new ANTLRFileStream(this.file.getAbsolutePath(), "UTF8"));
        CommonTokenStream tokens1 = new CommonTokenStream(lex1);
        
        AutParserParser g = new AutParserParser(tokens1);
        g.aut();
        this.imc = g.getIMC();
	}

}
