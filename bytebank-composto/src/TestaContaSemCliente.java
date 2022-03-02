
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		
		// java.lang.NullPointerException
		// necessário instanciar o objeto antes de usar a referência		
		//contaDaMarcela.titular.nome = "Marcela";
		//System.out.println(contaDaMarcela.titular.nome);				
		System.out.println(contaDaMarcela.getTitular());
				
		contaDaMarcela.setTitular(new Cliente());
		contaDaMarcela.getTitular().nome = "Marcela";
		System.out.println(contaDaMarcela.getTitular());
		System.out.println(contaDaMarcela.getTitular().nome);
		
	}
}
