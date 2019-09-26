package br.senac.sc.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

public class CadastroPessoaController {

	private Pessoa pessoa;

	private List<Pessoa> pessoas;

	public CadastroPessoaController() {
		pessoa = new Pessoa();
		pessoas = new ArrayList<>();
	}

	public void adicionar() {
		pessoas.add(pessoa);
		limpar();

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
