package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		PrintStream ps = new PrintStream("lorem5.txt");
		PrintStream ps = new PrintStream(new File("lorem5.txt"));
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");		
		ps.println();
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
						
		ps.close();
		
		PrintWriter pWriter = new PrintWriter(new File("lorem6.txt"));
		pWriter.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");		
		pWriter.println();
		pWriter.println();
		pWriter.println();
		pWriter.println();
		pWriter.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		pWriter.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
						
		pWriter.close();
		
	}

}
