
public class ContaCorrente extends Conta {

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
}
