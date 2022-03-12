package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ListaDeContas;
import br.com.bytebank.banco.modelo.ListaDeReferencia;

public class TesteListaDeContas {
	
	public static void main(String[] args) {
		ListaDeContas lista = new ListaDeContas();
		ListaDeReferencia listaDeReferencias = new ListaDeReferencia();
		
		Conta cc = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 22);
		
		lista.adiciona(cc);
		lista.adiciona(cc2);
		listaDeReferencias.adiciona(cc);
		listaDeReferencias.adiciona(cc2);
		
		int tamanho = lista.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = lista.getConta(0);
		System.out.println(ref);
		
		Conta ref2 = (Conta)listaDeReferencias.getReferencia(0);
		System.out.println(ref2);
	}
}
