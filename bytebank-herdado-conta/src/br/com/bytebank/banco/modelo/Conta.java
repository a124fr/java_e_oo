package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Francisco de Assis
 * 
 */
public abstract class Conta implements Comparable<Conta>, Serializable {
	protected double saldo;
	private int agencia;
	private int numero;
//	private Cliente titular;
	private transient Cliente titular; //transient -> Não faça parte da serialização
	private static int total = 0;
	
	// construtor padrão
	// Não é um método
	// É uma rotina de inicialização, é executado apenas uma vez
	// A inicialização de atributos é a principal responsabilidade do construtor.
//	public Conta() {		
//		System.out.println("Estou criando uma conta");
//	}
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {		
		if (agencia <= 0) {
			System.out.println("não pode valor menor ou igual a 0");
			return;
		}
				
		if (numero <= 0) {
			System.out.println("não pode valor menor ou igual a 0.");
			return;
		}
		
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
		//System.out.println("Estou criando uma conta n°: " + this.numero);
	}

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsufienteException
	 */
	public void saca(double valor) throws SaldoInsufienteException {
		if (this.saldo <= 0 || this.saldo < valor) {
			throw new SaldoInsufienteException("Saldo Insuficiente -> Saldo R$" + this.saldo + ", Valor a sacar R$" + valor);
		}		
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsufienteException {
		this.saca(valor);
		destino.deposita(valor);			
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
//	public void setNumero(int numero) {
//		if (numero <= 0) {
//			System.out.println("não pode valor menor ou igual a 0.");
//			return;
//		}
//		this.numero = numero;
//	}
	
	public int getAgencia() {		
		return this.agencia;
	}
	
//	public void setAgencia(int agencia) {
//		if (agencia <= 0) {
//			System.out.println("não pode valor menor ou igual a 0");
//			return;
//		}
//		this.agencia = agencia;
//	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "Número: " + this.getNumero() + ", Agência: " + this.getAgencia();
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outra = (Conta)obj;
		
		return this.numero == outra.numero && 
				this.agencia == outra.agencia;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
}
