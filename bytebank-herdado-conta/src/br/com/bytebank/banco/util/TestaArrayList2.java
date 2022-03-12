package br.com.bytebank.banco.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaArrayList2 {

	public static void main(String[] args) {		
		
//		ArrayList lista = new ArrayList();	
		
		// Problema de utilizar ArrayList não genérico. -> Guarda qualquer referencia, seja uma conta ou cliente ou quqlquer objeto.
//		Cliente cliente = new Cliente();
//		lista.add(cliente);
		// Solução é usar um Lista Genérica do tipo Conta, onde é especificado o tipo de objeto.
		ArrayList<Conta> lista = new ArrayList<>();
		
		lista.add(new ContaCorrente(22, 11));		
		lista.add(new ContaCorrente(22, 22));
		
		System.out.println(lista.size());
		
		Conta ref = (Conta)lista.get(0);
		System.out.println(ref);
		
		lista.remove(0);
		System.out.println(lista.size());
		
		lista.add(new ContaCorrente(33, 311));		
		lista.add(new ContaCorrente(33, 422));
		
		System.out.println("\nPercorendo Coleções com o For");
		for(int i = 0; i < lista.size(); i++) {
			Conta conta = lista.get(i);
			System.out.println(conta);
		}
		
		
		System.out.println("\nUsando For para Coleções(Foreach)");
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
