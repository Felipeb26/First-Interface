package view;

import model.Cliente;
import model.Usuario;

public class Main {

	public static void main(String[] args) {
		
		 Cliente cliente = new Cliente(null, "felipe", null, "50982861826", "11971404157", "felipe@gmail.com");
		 
		 System.out.println(cliente);
		 
		 Usuario user = new Usuario(null, "felipe", null, "felipeb2silva", "12345", "admin");
		 System.out.println(user);
	}

}
