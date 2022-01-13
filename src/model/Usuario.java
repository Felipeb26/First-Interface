package model;

import java.util.Date;

public class Usuario extends Pessoa{

	protected String senha;
	protected String nivelAcesso;
	  
	public Usuario(Long id, String nome, Date nascimento, String telefone, String email, String cpf, String senha,
			String nivelAcesso) {
		super(id, nome, nascimento);
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}

	public Usuario(Long id, String nome, Date nascimento, String email, String senha, String nivelAcesso) {
		super(id, nome, nascimento, email);
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
}
