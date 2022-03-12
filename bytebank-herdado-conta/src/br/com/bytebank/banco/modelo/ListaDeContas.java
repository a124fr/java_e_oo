package br.com.bytebank.banco.modelo;

public class ListaDeContas {
	
	private Conta[] referencias;
	private int posicao;
	
	public ListaDeContas() {
		this.referencias = new Conta[10];
		this.posicao = 0;
	}

	public void adiciona(Conta conta) {
		this.referencias[posicao] = conta;
		this.posicao++;
	}
	
	public Conta getConta(int posicao) {
		return this.referencias[posicao];
	}
	
	public int getQuantidadeDeElementos() {
		return this.posicao;
	}
}
