package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {
				 
//		OutputStream fos = new FileOutputStream("lorem4.txt"); 
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter fw = new FileWriter("lorem4.txt");				
//		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//		fw.write(System.lineSeparator());
//		fw.write("Olá");
		
		FileWriter fw = new FileWriter("lorem4.txt");
		BufferedWriter bw = new BufferedWriter(fw);		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.write("Olá");
				
		bw.close();
	}

}
