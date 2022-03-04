// Gerente é um Funcionario, Gerente herda da classe Funcionario
// A classe filha também é chamada de sub class
public class Gerente extends Funcionario implements Autenticavel {
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	// Reescrita de método ou sobrescrita
	// A sobrescrita é um conceito importante na herança, pois permite 
	// redefinir um comportamento previsto na classe mãe através da classe filha
	// O método possui a mesma assinatura. Isto é, a mesma visibilidade, mesmo retorno, 
	// mesmo nome e os mesmos parâmetros.
	@Override
	public double getBonificacao() {
		return super.getSalario();
	}
}
