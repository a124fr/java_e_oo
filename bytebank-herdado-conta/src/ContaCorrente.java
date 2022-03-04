
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	// A anotaççao @Override É usada para sobrescrever o método da classe mãe, 
	// indicando que o método original foi alterado.
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		if (valor > 0) {
			super.saldo += valor;			
		} else {		
			System.out.println("Não é possível realizar deposito de valores negativos");
		}
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
}
