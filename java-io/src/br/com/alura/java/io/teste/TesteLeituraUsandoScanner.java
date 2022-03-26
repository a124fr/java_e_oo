package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraUsandoScanner {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner entrada = new Scanner(new File("contas.csv"));		
		while(entrada.hasNextLine()) {
			String linha = entrada.nextLine();
//			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);			
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipo = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt(); 
			String titular = linhaScanner.next();
			Double saldo = linhaScanner.nextDouble(); 
			
//			String valoresFormatado = String.format("%s - %04d-%08d, %15s: %07.2f", 
//					tipo, agencia, numero, titular, saldo);
			
//			String valoresFormatado = String.format(new Locale("pt", "BR"),
//					"%s - %04d-%08d, %15s: %07.2f", 
//					tipo, agencia, numero, titular, saldo);
//			System.out.println(valoresFormatado);
			
			System.out.format(new Locale("pt", "BR"),
					"%s - %04d-%08d, %15s: %07.2f" + System.lineSeparator(), 
					tipo, agencia, numero, titular, saldo);
			
			linhaScanner.close();
		}					
		entrada.close();
	}
}
