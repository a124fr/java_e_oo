package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {		
		int idade = 29;// Integer
		
		// Classe que existem para cada Tipo Primitivo são chamado de Wrapper(Objeto que internamete guardo o valor primitivo)
		Integer idadeRef = Integer.valueOf(29);
		
		String s = args[0];
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
//		List numeros = new ArrayList();
		numeros.add(idade); // Autoboxing ->Transformação do Tipo Primitivo para Object
		numeros.add(idadeRef);
		
		int valor0 = idadeRef.intValue(); // Unboxing 
		int valor1 = numeros.get(0);// Unboxing Transformação do Object para o Tipo Primitivo
		
		
	}
}
