package br.com.bytebank.banco.test;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaArrayList {

	public static void main(String[] args) {		
		
		ArrayList lista = new ArrayList();		
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
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		
		System.out.println("\nUsando For para Coleções(Foreach)");
		for(Object objeto : lista) {
//			Conta c = (Conta)objeto;
//			System.out.println(c);
			System.out.println(objeto);
		}
	}

}
