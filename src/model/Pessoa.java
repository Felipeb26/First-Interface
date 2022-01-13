package model;

import java.util.Date;

public class Pessoa {
	 
	protected Long id;
	protected String nome;
	protected Date nascimento;
	protected String cpf;
	
	public Pessoa(Long id, String nome, Date nascimento, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
	}

	public Pessoa(Long id, String nome, Date nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public Pessoa(Long id, String nome, String senha) {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
}
