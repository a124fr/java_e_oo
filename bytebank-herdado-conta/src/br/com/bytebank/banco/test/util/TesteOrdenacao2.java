package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao2 {
	
	public static void main(String[] args) {
		 Conta cc1 = new ContaCorrente(22, 33);
         Cliente clienteCC1 = new Cliente();
         clienteCC1.setNome("Nico");
         cc1.setTitular(clienteCC1);
         cc1.deposita(333.0);

         Conta cc2 = new ContaPoupanca(22, 44);
         Cliente clienteCC2 = new Cliente();
         clienteCC2.setNome("Guilherme");
         cc2.setTitular(clienteCC2);
         cc2.deposita(444.0);

         Conta cc3 = new ContaCorrente(22, 11);
         Cliente clienteCC3 = new Cliente();
         clienteCC3.setNome("Paulo");
         cc3.setTitular(clienteCC3);
         cc3.deposita(111.0);

         Conta cc4 = new ContaPoupanca(22, 22);
         Cliente clienteCC4 = new Cliente();
         clienteCC4.setNome("Ana");
         cc4.setTitular(clienteCC4);
         cc4.deposita(222.0);

         List<Conta> lista = new ArrayList<>();
         lista.add(cc1);
         lista.add(cc2);
         lista.add(cc3);
         lista.add(cc4);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		NumeroDaContaComparator comparador = new NumeroDaContaComparator();
		lista.sort(comparador);
		
		System.out.println("\nLista Ordenada Por Número da Conta");
		for(Conta conta : lista) {
			System.out.println(conta);
		}
						
		//lista.sort(new TitularDaContaComparator()); // versão 1.8 do java.
		Collections.sort(lista, new TitularDaContaComparator()); // Antes da versão 1.8 do java.		
				
		System.out.println("\nLista Ordenada Por Nome do Titular da Conta");
		for(Conta conta : lista) {
			System.out.print(conta);
			System.out.print(", Saldo: " + conta.getSaldo());
			System.out.println(", Titular: " + conta.getTitular().getNome());
		}
		
		//lista.sort(null);
		Collections.sort(lista);// Ordem natural(objeto da lista define ordem natural de comparação).
		/* É a ordem definida pelo próprio elemento da lista.
		   A classe Conta define o seu próprio critério de ordenação implementando a interface java.lang.Comparable.
		   Nesse caso não é utilizado nenhum Comparator.
		 */
		
		System.out.println("\nLista Ordenada Por Saldo");
		for(Conta conta : lista) {
			System.out.print(conta);
			System.out.print(", Saldo: " + conta.getSaldo());
			System.out.println(", Titular: " + conta.getTitular().getNome());
		}
	}
}
