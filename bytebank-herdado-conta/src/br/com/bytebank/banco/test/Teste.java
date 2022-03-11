package br.com.bytebank.banco.test;

public class Teste {

	public static void main(String[] args) {
		
		int idades4[] = new int[5];
		idades4[0] = 8;
		idades4[1] = 99;
		
		int[] idades3 = { 1, 22, 39, 4, 7, 9 };
		
		int[] idades2 = new int[] { 1, 2, 3, 4, 5};
		
		int[] idades = new int[5]; // o array é inicializado com 0
		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 19;
		idades[3] = 69;
		idades[4] = 59;

		System.out.println("Percorrendo  array idades");
		for(int posicao = 0; posicao < idades.length; posicao++) {
			System.out.println(idades[posicao]);
		}
		
		System.out.println("Percorrendo array idades2");
		for(int posicao = 0; posicao < idades2.length; posicao++) {
			System.out.println(idades2[posicao]);
		}
		
		System.out.println("Percorrendo array idades3");
		for(int posicao = 0; posicao < idades3.length; posicao++) {
			System.out.println(idades3[posicao]);
		}
		
		System.out.println("Percorrendo array idades4");
		for(int posicao = 0; posicao < idades4.length; posicao++) {
			System.out.println(idades4[posicao]);
		}
	}
}
