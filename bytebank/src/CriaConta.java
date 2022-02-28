
public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		primeiraConta.titular = "Francisco de Assis";
		
		System.out.println(primeiraConta.titular + ", meu saldo é: " + primeiraConta.saldo);
	}

}
