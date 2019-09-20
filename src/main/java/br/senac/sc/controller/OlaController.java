package br.senac.sc.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaController {

	private String nome;
	private String sobrenome;
	private String nomeCompleto;

	public void dizerOla() {
		nomeCompleto = nome + " " + sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

}
