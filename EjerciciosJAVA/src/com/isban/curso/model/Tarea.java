package com.isban.curso.model;

import java.util.Date;

public class Tarea {

	Integer id;
	Integer idUsuario;
	String tarea;
	Date fechaCreacion;
	Date fechaLimite;
	String prioridad;
	Boolean terminada;
	
	public Tarea(){
		super();
	}
	public Tarea(Integer id,Integer idUsuario,String tarea,Date fechaCreacion,Date fechaLimite,String prioridad,Boolean terminada){
		this.id=id;
		this.idUsuario=idUsuario;
		this.tarea=tarea;
		this.fechaCreacion=fechaCreacion;
		this.fechaLimite=fechaLimite;
		this.prioridad=prioridad;
		this.terminada=terminada;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getTarea() {
		return tarea;
	}
	public void setTarea(String tarea) {
		this.tarea = tarea;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaLimite() {
		return fechaLimite;
	}
	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	public Boolean getTerminada() {
		return terminada;
	}
	public void setTerminada(Boolean terminada) {
		this.terminada = terminada;
	}
	
	


}
