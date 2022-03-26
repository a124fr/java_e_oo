package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Entrada com Arquivo
		InputStream fis = new FileInputStream("lorem.txt"); // leitura de bits e bytes do fluxo do arquivo
		Reader isr = new InputStreamReader(fis); // leitura de caractere do fluxo do arquivo
//		Reader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr); // leitura da linha do arquivo.
		
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();			
		}
		
		br.close();
	}

}
