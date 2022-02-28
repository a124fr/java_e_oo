
public class TestaEscopo {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais 2");
		int idade = 16;
		int quantidadePessoas = 3;

		//boolean acompanhado = quantidadePessoas >= 2; // Expressão booleana.
		
		//Escopo de variável - está variável só existe dentro desse bloco de código
//		if (quantidadePessoas >= 2) {
//			boolean acompanhado = true; 
//		} else {
//			boolean acompanhado = false;
//		}
		
		boolean acompanhado;
//		System.out.println(acompanhado);// Não tem valor padrão, é necessário atribuir um valor antes de usar.
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
				
		System.out.println("valor de acompanhado = " + acompanhado);
		// if (idade >= 18 || quantidadePessoas >= 2) {
		// if (idade >= 18 && quantidadePessoas >= 2) {
		if (idade >= 18 || acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
