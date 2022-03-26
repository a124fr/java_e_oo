package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteMedindoTempoDeEscrita {

	public static void main(String[] args) throws IOException {
		
		long inicio = System.currentTimeMillis();		 
		
		OutputStream fos = new FileOutputStream("lorem7.txt"); 
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.write("Olá");
				
		bw.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (fim - inicio));
	}

}
