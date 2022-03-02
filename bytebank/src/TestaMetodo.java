
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		boolean conseguiuRetirar = contaDoPaulo.saca(20.50);
		System.out.println("O saque de R$20,50 foi feito? " + (conseguiuRetirar ? "Sim" : "Não"));
		System.out.println(contaDoPaulo.saldo);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);

		if (sucessoTransferencia) {
			System.out.println("transferência com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}

		System.out.println("Saldo da Conta do Marcela: R$" + contaDaMarcela.saldo);
		System.out.println("Saldo da Conta do Paulo: R$" + contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "paulo silveira";
		System.out.println(contaDoPaulo.titular);
	}
}
