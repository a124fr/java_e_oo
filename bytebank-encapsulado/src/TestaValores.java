
public class TestaValores {
	
	public static void main(String[] args) {
		// conta está incosistente a nossa regra de negócio.
//		Conta conta = new Conta();		
//		conta.setAgencia(-50);
//		conta.setNumero(-330);
		
		Conta conta = new Conta(1337, 24226);
		System.out.println(conta.getAgencia() + " - " + conta.getNumero());
		
		Conta conta2 = new Conta(1337, 24227);
		Conta conta3 = new Conta(2112, 12882);
		
		System.out.println("Total de contas: " + Conta.getTotal());		
	}
}
