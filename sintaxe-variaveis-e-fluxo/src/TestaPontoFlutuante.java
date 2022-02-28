
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario;
		salario = 1250.70;
		System.out.println("Salário: " + salario);		
		System.out.printf("Salaŕio %.2f\n", salario);
		
		double divisao = 3.14 / 2;
		System.out.println("PI / 2 = " + divisao);
		
		int outraDivisao = 5 / 2;
		// Resultado de divisão de números inteiros é um inteiros
		System.out.println("5 / 2 = " + outraDivisao);
		
		double novaTentativa = 5 / 2;
		System.out.println("Resultado: " + novaTentativa);
		
		double novaTentativa2 = 5.0 / 2;
		System.out.println("Resultado: " + novaTentativa2);
	}
}
