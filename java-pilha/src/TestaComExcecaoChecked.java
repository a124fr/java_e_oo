
public class TestaComExcecaoChecked {
	
//	public static void main(String[] args) throws MinhaExcecao {		
//		Conta c = new Conta();		
//		c.deposita();
//	}
	
	public static void main(String[] args){
		
		Conta c = new Conta();		
		
		try {
		c.deposita();
		} catch(MinhaExcecao e) {
			System.out.println("tratamento...");
			System.out.println(e.getMessage());
		}
	}
}
