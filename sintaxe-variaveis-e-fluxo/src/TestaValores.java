
public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		
		// Tipo Valor - Valor do conteúdo da variável.
		// Copiando e colando valores, atribuindo valores.
		// Variáveis guardam valores e não referências do tipo primitivo
		
		System.out.println(segundo);
		
		segundo = primeiro;
		
		System.out.println(segundo);
		
		primeiro = 10;
		
		System.out.println(segundo);
	}
}
