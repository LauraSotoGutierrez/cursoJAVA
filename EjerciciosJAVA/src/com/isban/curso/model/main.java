package com.isban.curso.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.isban.curso.Laura.Utils.Utils;
import com.isban.curso.dao.TareasDAO;
import com.isban.curso.dao.UsuariosDAO;

public class main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-YYYY"); 
		
		
		
		Usuario usuario1=new Usuario(11,"Pedro","1234");  
		Usuario usuario2=new Usuario(22,"Maria","5555");    
		Usuario usuario3=new Usuario(33,"Luisa","9999");    
		
		UsuariosDAO usuarios = new UsuariosDAO();
		usuarios.setUsuario(usuario1);
		usuarios.setUsuario(usuario2);
		usuarios.setUsuario(usuario3);
		
		Tarea tarea1=new Tarea(5,usuario1.getId(),"Realizar la tarea asignada 1",formatoDelTexto.parse("18-01-2000"),formatoDelTexto.parse("31-12-9999"),"Alta",false);
		Tarea tarea2=new Tarea(10,usuario2.getId(),"Realizar la tarea asignada 2",formatoDelTexto.parse("18-01-2000"),formatoDelTexto.parse("31-12-9999"),"Alta",false);
		Tarea tarea3=new Tarea(15,usuario3.getId(),"Realizar la tarea asignada 3",formatoDelTexto.parse("18-01-2000"),formatoDelTexto.parse("31-12-9999"),"Alta",false);
		Tarea tarea4=new Tarea(20,usuario3.getId(),"Realizar esta otra tarea 4",formatoDelTexto.parse("18-01-2000"),formatoDelTexto.parse("31-12-9999"),"Alta",false);
		Tarea tarea5=new Tarea(25,usuario3.getId(),"Realizar esta otra tarea 5",formatoDelTexto.parse("18-01-2000"),formatoDelTexto.parse("31-12-9999"),"Alta",false);

		
		TareasDAO listaTareas = new TareasDAO();
		listaTareas.setTareas(tarea1);
		listaTareas.setTareas(tarea2);
		listaTareas.setTareas(tarea3);
		listaTareas.setTareas(tarea4);
		listaTareas.setTareas(tarea5);


        System.out.print("Tareas " + listaTareas.getTarea(11, 5).getTarea());

        listaTareas.recortaDetalle(listaTareas.getAllTareas(usuario3.getId()));
        
        Date fecha = Utils.fechaSumaDias(5);

        System.out.print("Tareas " + listaTareas.getTarea(11, 5).getTarea());

        

	}

}
