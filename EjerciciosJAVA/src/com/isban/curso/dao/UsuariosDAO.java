package com.isban.curso.dao;

import java.util.HashMap;
import java.util.Map;

import com.isban.curso.model.Usuario;

public class UsuariosDAO {
	
	Map<Integer,Usuario> Usuarios = new HashMap<Integer, Usuario>();

	public UsuariosDAO(){
		super();
	}
	
	public Map<Integer, Usuario> getUsuarios() {
		return Usuarios;
	}

	public void setUsuarios(Map<Integer, Usuario> usuarios) {
		Usuarios = usuarios;
	}

	public Usuario getUsuario(Integer id) {
		
		Usuario usuarioRecogido = Usuarios.get(id);
		return usuarioRecogido;
		
	}
	
	public boolean setUsuario(Usuario usuario) {
	
		//Necesito pasarle una key? hay alguna opcion de añadir en la posicion siguiente?
		if (Usuarios.containsKey(usuario.getId())){
			return false;
		}else{
			Usuarios.put(usuario.getId(), usuario);
			return true;
		}
				
	}
	
}
