package model;

import javax.persistence.Entity;
import javax.persistence.Table;

import model.Pessoa;
import lombok.Data;

@Data
@Entity
@Table(name = "pessoadto")
public class Usuario extends Pessoa{

	protected String senha;
	protected String nivelAcesso;
	 
}
