
public class TesteReferencia {
	
	public static void main(String[] args) {
		// Polimorfismo
		Funcionario g1 = new Gerente();
		g1.setSalario(5000.0);
		g1.setNome("Marcos da Silva");		
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		
		System.out.println(controle.getTotal());
		
	}
}
