package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsufienteException;

public class TesteSaca {

//	public static void main(String[] args) {
//		Conta conta = new ContaCorrente(123, 321);
//		conta.deposita(200.2);
//		
//		try {
//			conta.saca(210.0);
//		} catch(SaldoInsufienteException e) {
//			System.out.println("Exceção: " + e.getMessage());
//		}
//		
//		System.out.println("Saldo Atual: " + conta.getSaldo());
//	}
	
	public static void main(String[] args) throws SaldoInsufienteException {
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200.2);
		
		conta.saca(210.0);
		
		System.out.println("Saldo Atual: " + conta.getSaldo());
	}

}
