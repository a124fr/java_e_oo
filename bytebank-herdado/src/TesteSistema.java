
public class TesteSistema {
	
	public static void main(String[] args) {		
		Cliente cliente = new Cliente();
		
		Gerente g = new Gerente();
//		g.setNome("Nico Steppat");
//		g.setSalario(2600.0);
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(33333);
				
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);		
		si.autentica(adm);
		si.autentica(cliente);
		
	}
}
