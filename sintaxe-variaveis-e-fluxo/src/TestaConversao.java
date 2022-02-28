
public class TestaConversao {
	
	public static void main(String[] args) {
		// promoção chamando de conversão automática ou conversão implícita.
		double valor_antes = 3;
				
		double salario = 1270.50;		
		
		// type casting ou casting 
		int valor = (int)salario;
	
		System.out.println(valor);
		
		// 64 bit
		long numeroGrande = 3930930101L;
		System.out.println(numeroGrande);
		
		// 16 bit
		short valorPequeno = 200;
		
		// 8 bit
		byte b = 127;
		
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
