package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.util.ArrayList;

public class ServicioUsuarios {
	
	private ArrayList<Usuario> usuarios;

	
	public Usuario registrarUsuario(String nombre, String direccion, int dni) {
		Usuario user = new Usuario(nombre, direccion, dni); 
		usuarios.add(user);
		return user;
	}
	
}
