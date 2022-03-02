
public class TestaGeteSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		conta.setTitular(paulo);		
		conta.getTitular().setNome("Paulo Silveira");
		conta.getTitular().setProfissao("Programador");
		
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setCpf("222.222.222-22");
		
		System.out.println(conta.getTitular().getCpf() + " - " + conta.getTitular().getNome());
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}
