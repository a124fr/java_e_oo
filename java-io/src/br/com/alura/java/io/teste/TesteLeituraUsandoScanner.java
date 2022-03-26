package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeituraUsandoScanner {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner entrada = new Scanner(new File("contas.csv"));		
		while(entrada.hasNextLine()) {
			String linha = entrada.nextLine();
			System.out.println(linha);
		}		
		entrada.close();
	}
}
