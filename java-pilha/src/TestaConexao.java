
public class TestaConexao {
	
	public static void main(String[] args) {
		
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();			
		} catch(IllegalStateException e) {
			System.out.print("Deu erro na conexao! ");
			System.out.println("Exceção: " + e.getMessage());
		} finally {
			if (con != null)
				con.fecha();
		}
		
	}
}
