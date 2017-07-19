package com.isban.curso.model;

import java.util.Date;

public class Usuario {

	Integer id;
	String nombre;
	String password;
	
	
	public Usuario(){
		super();
	}
	public Usuario(Integer id,String nombre,String password){
		this.id=id;
		this.nombre=nombre;
		this.password=password;

	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
