package br.senac.sc.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

public class NomesController {

	private Pessoa pessoa = new Pessoa();

	private List<Pessoa> pessoas = new ArrayList<>();

	public void adicionar() {
		if (pessoa.getNome().isEmpty() || pessoa.getEmail().isEmpty() || pessoa.getDataNascimento().isEmpty()) {
			return;
		} else {
			pessoas.add(pessoa);
			pessoa = new Pessoa();
		}

	}

	public void limpar() {
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
