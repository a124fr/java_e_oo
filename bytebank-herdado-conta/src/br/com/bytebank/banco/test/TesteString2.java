package br.com.bytebank.banco.test;

public class TesteString2 {
	
	public static void main(String[] args) {
				
		String nome = "Alura "; // object literal
		// String outroNome = new String("Empresa"); -> Má prática
		
		String vazio = " ";
		vazio = vazio.trim();
		System.out.println(vazio.isEmpty());		
		
//		System.out.println(nome.length());
//		
//		for(int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		char c = nome.charAt(2);
//		char c = nome.charAt(0);
//		System.out.println(c);
		
//		int posicao = nome.indexOf("ur");
//		System.out.println(posicao);
		
//		char c = 'A';
//		char a = 'a';
//		
//		String outro = nome.replace(c, a);
//		System.out.println(outro);
		
//		outro = nome.toLowerCase();		
//		System.out.println(outro);
	}
}
