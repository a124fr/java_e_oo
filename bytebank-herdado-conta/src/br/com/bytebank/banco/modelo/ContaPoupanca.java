package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		if (valor > 0) {
			super.saldo += valor;			
		} else {		
			System.out.println("Não é possível realizar deposito de valores negativos");
		}		
	}
}
