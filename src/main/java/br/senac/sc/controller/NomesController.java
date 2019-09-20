package br.senac.sc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

public class NomesController {

	private String nome;

	private List<String> nomes = new ArrayList<String>();

	public void adicionar() {
		nomes.add(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

}
