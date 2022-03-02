
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.saldo);

		// java.lang.NullPointerException
		// necessário instanciar o objeto antes referência nula		
		//contaDaMarcela.titular.nome = "Marcela";
		//System.out.println(contaDaMarcela.titular.nome);				
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular);
		System.out.println(contaDaMarcela.titular.nome);
		
	}
}
