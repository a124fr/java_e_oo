package br.com.bytebank.banco.modelo;

public class ListaDeReferencia {
	
	private Object[] referencias;
	private int posicao;
	
	public ListaDeReferencia() {
		this.referencias = new Object[10];
		this.posicao = 0;
	}

	public void adiciona(Object objeto) {
		this.referencias[posicao] = objeto;
		this.posicao++;
	}
	
	public Object getReferencia(int posicao) {
		return this.referencias[posicao];
	}
	
	public int getQuantidadeDeElementos() {
		return this.posicao;
	}
}
