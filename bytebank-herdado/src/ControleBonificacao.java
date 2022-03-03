
public class ControleBonificacao {
	private double total;
	
	public void registra(Funcionario funcionario) {
		double boni = funcionario.getBonificacao();
		this.total += boni;
	}
	
	public double getTotal() {
		return this.total;
	}
}
