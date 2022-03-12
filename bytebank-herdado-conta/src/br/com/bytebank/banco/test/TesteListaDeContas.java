package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ListaDeContas;

public class TesteListaDeContas {
	
	public static void main(String[] args) {
		ListaDeContas lista = new ListaDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 22);
		
		lista.adiciona(cc);
		lista.adiciona(cc2);
		
		int tamanho = lista.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = lista.getConta(0);
		System.out.println(ref);		
	}
}
