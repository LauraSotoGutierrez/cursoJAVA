package com.isban.curso.Laura.Utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Utils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letraNointroducida="";
//		palabra(letraNointroducida);
		
		String numero="";
		String tipo="";
//		telefonoValido(numero,tipo);
		
		int[] numerocuadrados={0,1,2};
//		sumacuadrados(numerocuadrados);
		
		double euros=0;
		String moneda="";
//		convertidorMoneda(euros,moneda);
		
        System.out.print("Fecha: " + fechaSumaDias(2));

	}
	
	public Utils(){
		super();
	}
	
	public static String palabra (String letra){
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una letra: ");
        letra = sc.next();

		switch ( letra ) {
	      case "a":
	          System.out.print("alta");
	    	  return "alta";
	      case "b":
	          System.out.print("media");
	    	  return "media";
	      case "c":
	          System.out.print("baja");
	    	  return "baja";
	      case "":
	    	  return "";
	      default:
	    	  return "No ha introducido una letra reconocida";
		}
	 }
		
		public static boolean telefonoValido (String numeroTelefono, String tipoTelefono){
			
			String[] numerosValidos = {"809","808","807","806","805","804","803","802","801"};
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduzca un número de teléfono: ");
	        numeroTelefono = sc.next();
	        System.out.print("Introduzca el tipo de teléfono: ");
	        tipoTelefono = sc.next();
	        
	        boolean valido=false;
	        
	        if(tipoTelefono.equals("Movil")){

	        	if(numeroTelefono.length()==9 && (numeroTelefono.substring(0, 1).equals("6") || numeroTelefono.substring(0, 1).equals("7"))){
	        		valido=true;
	        	}
	        }else if(tipoTelefono.equals("Fijo")){
	        	if(numeroTelefono.length()==9 && (numeroTelefono.substring(0, 1).equals("8") || numeroTelefono.substring(0, 1).equals("9"))){
	        		for(String item : numerosValidos){
	        			if(item.equals(numeroTelefono.substring(0, 3))){
	    	        		valido=true;
	        			}
	        		}
	        	}
	        }
	          System.out.print(valido);

	        return valido;
	       				
	}	
		
		public static int sumacuadrados (int[] numeros){
			
			int[] arrayNumeros = {2,4,6,8};
	        int suma=0;	
	        
	        for(int item : arrayNumeros){
	        	suma += Math.pow(2,item);
	        }

	          System.out.print(suma);

	        return suma;
	       				
	}	
		
		public static double convertidorMoneda (double euros, String moneda){
			
			double eurosint=0;
			double conversion=0;
			double parametrolibra=0.86;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduzca los euros y el tipo de moneda (EUR MONEDA): ");
	        eurosint = sc.nextDouble();
	        moneda = sc.next();

			switch ( moneda ) {
		      case "libra":  	  
		    	  conversion = eurosint*parametrolibra;
		    	  break;
		      case "dolar":
		    	  conversion = eurosint*1.28611 ;
		    	  break;
		      case "yen":
		    	  conversion = eurosint*129.852 ;
		    	  break;
			}
	          System.out.print("conversion: " + conversion);		    	  

	        return conversion;		
	}
		
		public static Date fechaSumaDias (int numeroDias){
			
			Date fecha = new Date(); 
			
		      Calendar calendar = Calendar.getInstance();
		      calendar.setTime(fecha); // Configuramos la fecha que se recibe
		      calendar.add(Calendar.DAY_OF_YEAR, numeroDias);  // numero de días a añadir, o restar en caso de días<0
		      return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
	       				
	}	
}
