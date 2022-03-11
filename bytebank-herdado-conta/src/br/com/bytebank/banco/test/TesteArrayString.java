package br.com.bytebank.banco.test;

public class TesteArrayString {
	
	public static void main(String[] args) {
		System.out.println("Funcionou!");
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}

/*
 * OBS:
 * Dentro da pasta bin.
 * $ java br.com.bytebank.banco.test.TesteArrayString 1 2 oi nico java
	 Funcionou!
	 1
	 2
	 oi
	 nico
	 java 
 */

