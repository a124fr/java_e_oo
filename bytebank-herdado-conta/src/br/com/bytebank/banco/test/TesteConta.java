package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsufienteException;

public class TesteConta {
	
	public static void main(String[] args) {
		
		// classe abstrata não é possível instanciar.
		//new Conta();
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		try {
			cc.transfere(10.0, cp);			
		} catch(SaldoInsufienteException e) {
			System.out.println("Exceção: " + e.getMessage());
		}
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
