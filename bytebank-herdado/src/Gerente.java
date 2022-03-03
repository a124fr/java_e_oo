// Gerente é um Funcionario, Gerente herda da classe Funcionario
// A classe filha também é chamada de sub class
public class Gerente extends Funcionario {	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;		
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}		
		return false;
	}
	
	// Sobrecarga de método
	// Na mesma classe que variam na quantidade ou tipos de parâmetros. 
	// Isso se chama sobrecarga de métodos.
	// A sobrecarga não leva em conta a visibilidade ou retorno do método, 
	// apenas os parâmetros e não depende da herança.
	public boolean autentica(String login, int senha) {
		return false;
	}
	
	// Reescrita de método ou sobrescrita
	// A sobrescrita é um conceito importante na herança, pois permite 
	// redefinir um comportamento previsto na classe mãe através da classe filha
	// O método possui a mesma assinatura. Isto é, a mesma visibilidade, mesmo retorno, 
	// mesmo nome e os mesmos parâmetros.
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
}
