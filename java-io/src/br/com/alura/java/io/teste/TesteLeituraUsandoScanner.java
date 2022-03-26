package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraUsandoScanner {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner entrada = new Scanner(new File("contas.csv"));		
		while(entrada.hasNextLine()) {
			String linha = entrada.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);			
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numeroDaConta = linhaScanner.nextInt(); 
			String titular = linhaScanner.next();
			Double saldo = linhaScanner.nextDouble(); 
			
			System.out.println(tipoConta 
					+ ", Agência: " + agencia 
					+ ", Número: " + numeroDaConta					
					+ ", Titular: " + titular
					+ ", Saldo: " + saldo);						
		}					
		entrada.close();
	}
}
