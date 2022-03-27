package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no ByteBank
 * 
 * @author Francisco de Assis
 * @version 0.1 
 */

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 9205117266306915548L;
	
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNomeCpf() {
		return nome + ", " + cpf;
	}
	
	public String getNomeCpfProfissao() {
		return nome + ", " + cpf + ", " + profissao;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
