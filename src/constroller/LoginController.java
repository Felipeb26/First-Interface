package constroller;

import view.login;

public class LoginController {
	
	private final login view;
	
	public LoginController(login view) {
		this.view = view;
	}
	
	public void iMadeIt(){
		System.out.println("busquei do banco");
		
		this.view.showMessage("eu fiz isso");
	}
	
	
	public void fazerLogin() {
		
		String nome = view.getInputNome().getText();
		String senha = view.getInputSenha().getText();
	}
	
}
