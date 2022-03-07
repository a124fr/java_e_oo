
public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	// construtor padrão
	// Não é um método
	// É uma rotina de inicialização, é executado apenas uma vez
	// A inicialização de atributos é a principal responsabilidade do construtor.
//	public Conta() {		
//		System.out.println("Estou criando uma conta");
//	}
	
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
}
