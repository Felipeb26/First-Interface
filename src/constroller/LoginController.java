package constroller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import model.Pessoa;
import repository.UsuarioRepository;
import view.login;


@Transactional
public class LoginController {
	
	@Autowired
	private UsuarioRepository userRepo;
	
	
	private final login view;
	
	public LoginController(login view) {
		this.view = view;
	}
	
	public void iMadeIt(){
		System.out.println("busquei do banco");
		
		this.view.showMessage("eu fiz isso");
	}
	
	public List<Pessoa> findAll(){
		return userRepo.findAll();
	}

}
