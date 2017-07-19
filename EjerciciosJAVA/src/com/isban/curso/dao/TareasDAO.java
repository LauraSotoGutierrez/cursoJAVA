package com.isban.curso.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.isban.curso.model.Tarea;

public class TareasDAO {
	
	//El Integer corresponde al idUsuario y 
	Map<Integer,List<Tarea>> tareas = new HashMap<Integer, List<Tarea>>();

	public TareasDAO(){
		super();
	}
	
	
	public List<Tarea> getAllTareas(Integer idUsuario) {
		
		List<Tarea> listaTareas = tareas.get(idUsuario);		
		return listaTareas;
	}
	
	public Tarea getTarea(Integer idUsuario,Integer idTarea) {
		
		List<Tarea> listaTareas = tareas.get(idUsuario);
		Tarea tareaRecogida=null;
		for(Tarea item : listaTareas){
			if(item.getId()==idTarea){
				tareaRecogida = item;
			}
		}
		return tareaRecogida;
	}
	

	
	public Map<Integer, List<Tarea>> getTareas() {
		return tareas;
	}

	
	public void setTareas(Tarea tarea) {

				List<Tarea> listaUsuario = getAllTareas(tarea.getIdUsuario());
				

				if (listaUsuario == null) {
					
					List<Tarea> listaTareas = new ArrayList<Tarea>();
					listaTareas.add(tarea);
					tareas.put(tarea.getIdUsuario(), listaTareas);

				} else {

					listaUsuario.add(tarea);
				}

	} 
	public void recortaDetalle (List<Tarea> lista){
				
		for (Tarea item : lista){
			String detalleTarea = item.getTarea();
			if(detalleTarea.length()>=8){
				item.setTarea("");
				detalleTarea = detalleTarea.substring(0,8);
				detalleTarea = detalleTarea.concat("...");
				item.setTarea(detalleTarea);
			}
		}
		
		//return lista;
	}


}
