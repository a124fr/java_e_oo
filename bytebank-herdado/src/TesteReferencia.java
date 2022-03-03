
public class TesteReferencia {
	
	public static void main(String[] args) {
		// Polimorfismo
		Funcionario g1 = new Gerente();
		g1.setNome("Marcos da Silva");
		String nome = g1.getNome();		
		
		System.out.println(nome);
		
		Object obtGerente = new Gerente();
	}
}
