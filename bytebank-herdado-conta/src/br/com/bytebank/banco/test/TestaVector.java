package br.com.bytebank.banco.test;

import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaVector {

	public static void main(String[] args) {		
		
//		ArrayList<Conta> lista = new ArrayList<>();
//		List<Conta> lista = new LinkedList<>();
		List<Conta> lista = new Vector<>();
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaCorrente cc2 = new ContaCorrente(22, 22);
		Conta cc3 = new ContaCorrente(22, 22); 
		
		lista.add(cc1);		
		lista.add(cc2);
				
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe? " + existe);
		
		for(Conta conta : lista) {
			if (conta.equals(cc3)) {
				System.out.println("Já tenho essa conta!");
			}
		}
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}
	
}
