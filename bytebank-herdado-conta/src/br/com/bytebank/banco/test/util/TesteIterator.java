package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteIterator {
	
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi");
		nomes.add("Donkey kong");
		
		/*
		 * Uma Iterator é um objeto que possui no mínimo dois métodos: hasNext()e next(). 
		 * Ou seja, você pode usá-lo para perguntar se existe um próximo elemento e pedir 
		 * o próximo elemento.
		 * Também iterar com filas, conjuntos ou mapas. 
		 */
		
		Iterator<String> it = nomes.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
