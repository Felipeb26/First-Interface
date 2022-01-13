package model;

import javax.persistence.Entity;
import model.Pessoa;
import lombok.Data;

@Data
@Entity
public class Cliente extends Pessoa{
	
	private String telefone;
	private String email;	
}
