package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);		
		contas[0] = cc1;
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		contas[1] = cc2;
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		System.out.println(contas[0].getNumero());
		System.out.println(contas[1].getNumero());
		
//		Object referenciaGenerica = contas2[1];
//		System.out.println(referenciaGenerica.getNumero()); //Exceção: java.lang.ClassCastException
		
//		Conta referencia = contas[1];
		ContaPoupanca referencia = (ContaPoupanca)contas[1];// type cast
//		ContaCorrente referencia = (ContaCorrente)contas[1];// Exceção: java.lang.ClassCastException		
		System.out.println(referencia.getNumero());
		
	}
}
