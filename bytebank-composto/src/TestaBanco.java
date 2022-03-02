
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "Programador";
				
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		// associa o cliente paulo a contaDoPaulo. Composição de objeto 
		contaDoPaulo.setTitular(paulo);
		
		System.out.println(contaDoPaulo.getTitular().nome);
		System.out.println(contaDoPaulo.getTitular());
		System.out.println(paulo);
		
	}
}
