// Gerente é um Funcionario, Gerente herda da classe Funcionario
// A classe filha também é chamada de sub class
public class Gerente extends Autenticavel {
		
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
