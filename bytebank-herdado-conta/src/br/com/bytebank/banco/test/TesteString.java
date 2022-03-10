package br.com.bytebank.banco.test;

public class TesteString {
	
	public static void main(String[] args) {
				
		String nome = "EmpresA"; // object literal
		// String outroNome = new String("Empresa"); -> Má prática
		
		System.out.println(nome);
		
		///String outro = nome.replace("A", "a");
		//String outro = nome.replace("Em", "eM");
		
		char c = 'A';
		char a = 'a';
		
		String outro = nome.replace(c, a);
		System.out.println(outro);
		
		outro = nome.toLowerCase();		
		System.out.println(outro);
	}
}
