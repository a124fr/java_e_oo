
public class FluxoComTratamento3 {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch(Exception e) { //Exception -> Capturar qualquer exceção
			System.out.println("Exceção: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2(); 
		System.out.println("Fim do metodo1");
	}
// Faz o tratamento com try/catch ou informar o throws na assinatura do método.	
//	private static void metodo1() {
//		System.out.println("Ini do metodo1");
//		try {
//			metodo2();
//		} catch(MinhaExcecao ex) {}
//		System.out.println("Fim do metodo1");
//	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
		
		//throw new MinhaExcecao("Deu ruim!");
		//throw new NullPointerException("deu ruim!");
		throw new ArithmeticException("deu ruim!");
		
		// System.out.println("Fim do metodo2");
	}
}
