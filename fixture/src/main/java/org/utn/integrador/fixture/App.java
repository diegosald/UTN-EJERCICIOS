package org.utn.integrador.fixture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.utn.integrador.fixture.conexion.Conexion;



public class App 
{
    public static void main( String[] args )
    {
       Conexion con = new Conexion();
       ResultSet aux ;
       
       ArrayList<Equipo> equipos= new ArrayList<Equipo>();
       ArrayList<Participante> participantes = new ArrayList<Participante>();
       
              
       //INICIO CARGO ARRAY LIST DE EQUIPOS DESDE LA BASE DE DATOS
        try {
		
        	aux = con.consultarDb("Select * from Equipos");
        	while (aux.next()) {
	    	
	    	equipos.add(new Equipo(aux.getString(1),aux.getString(2)));
	   
        	} 
			
       }catch (SQLException e) {
		
		e.printStackTrace();
	   }
       
      //FIN CARGO ARRAY LIST DE EQUIPOS DESDE LA BASE DE DATOS 
      
      //INICIO CARGO ARRAY LIST DE PARTICIPANTES DESDE LA BASE DE DATOS
        try {
		
        	aux = con.consultarDb("Select * from Participantes");
	    
        	while (aux.next()) {
	    	
	    	participantes.add(new Participante(aux.getInt(1),aux.getString(2)));
	   
        	} 
			
       }catch (SQLException e) {
		
		e.printStackTrace();
	   }
       
      //FIN CARGO ARRAY LIST DE PARTICIPANTES DESDE LA BASE DE DATOS
         
       
     Path archivoPartido = Paths.get("d:\\partidosnuevos.txt") ;
   	 String partidoPartes[];
   	 int banderaFase= 0;	
   	 int banderaRonda = 0;
   	 ArrayList <Fase> fases = new ArrayList<Fase>();
   	 try {
   		
      		 for (String auxSplit : Files.readAllLines(archivoPartido)) {
   				partidoPartes = auxSplit.split(","); 
   			     
   				if (banderaFase == Integer.parseInt(partidoPartes[0])){
   			    	
                       if (banderaRonda == Integer.parseInt(partidoPartes[1]) ){
   						
   					//	System.out.println("HAGO ADD RONDA PARTIDO " + partidoPartes[1] + " " + partidoPartes[2]+partidoPartes[3]);
   						fases.get(banderaFase-1).getRondas().get(banderaRonda-1).getPartidos().add(new Partido(buscarEquipo(equipos,partidoPartes[2]),buscarEquipo(equipos,partidoPartes[3]),Integer.parseInt(partidoPartes[4]) ,Integer.parseInt(partidoPartes[5])));
   					   } 
   					   else {
   					//	System.out.println("CREO RONDA Y HAGO ADD PARTIDO "+ partidoPartes[1] + " "+ partidoPartes[2]+partidoPartes[3]);
   						banderaRonda++;
   						fases.get(banderaFase-1).getRondas().add(new Ronda(banderaRonda));
   						fases.get(banderaFase-1).getRondas().get(banderaRonda-1).getPartidos().add(new Partido(buscarEquipo(equipos,partidoPartes[2]),buscarEquipo(equipos,partidoPartes[3]),Integer.parseInt(partidoPartes[4]) ,Integer.parseInt(partidoPartes[5])));
   						 						
   					     					   
   					   }
   			    	
   			    }
   				else{
   				//	System.out.println("FASE NO EXISTE");
   					fases.add(new Fase());
   					banderaFase++;			
   				    
   					
   					if (banderaRonda == Integer.parseInt(partidoPartes[1]) ){
   						
   					//	System.out.println("HAGO ADD RONDA PARTIDO "+ partidoPartes[1] + " " + partidoPartes[2]+partidoPartes[3]);
   						
   					} 
   					else {
   						banderaRonda=0;
   						fases.get(banderaFase-1).getRondas().add(new Ronda(banderaRonda + 1));
   						fases.get(banderaFase-1).getRondas().get(banderaRonda).getPartidos().add(new Partido(buscarEquipo(equipos,partidoPartes[2]),buscarEquipo(equipos,partidoPartes[3]),Integer.parseInt(partidoPartes[4]) ,Integer.parseInt(partidoPartes[5])));
   					//	System.out.println("CREO RONDA Y HAGO ADD PARTIDO "+ partidoPartes[1] + " "+ partidoPartes[2]+partidoPartes[3]);
   						banderaRonda++;
   					}
   					
   				}	
   				
   		 }
   	} catch (IOException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	}
        
        
  
        
        //INICIO CARGO ARRAY LIST DE PRONOSTICO DESDE LA BASE DE DATOS
        try {
		
        	aux = con.consultarDb("Select * from pronostico");
	    
        	while (aux.next()) {
	    	
	     	participantes.get(aux.getInt(4)).agregarprono(new Pronostico(aux.getInt(2),aux.getInt(3) ,buscarPartido(fases.get(aux.getInt(2)).getRondas().get(aux.getInt(3)).getPartidos(),aux.getString(5)),buscarEquipo(equipos,aux.getString(6)),ResultadoEnum.valueOf(aux.getString(7))));	
	    	          	
	   
        	} 
			
       }catch (SQLException e) {
		
		e.printStackTrace();
	   }
       
      //FIN CARGO ARRAY LIST DE PRONOSTICO DESDE LA BASE DE DATOS 
      
      
   
       for (Ronda ron : fases.get(0).getRondas()) {
    	   
    	   ron.puntos(participantes);
    	   
       }
//  
       for (Participante p : participantes) {
       	
    	   System.out.println(p.getNombre() + " TOTAL PUNTOS DE LAS RONDAS " + p.getPuntosTotal());
       
       } 
       
       
       fases.get(0).puntosFase(participantes);
       
           
       
    
    }


public static Equipo buscarEquipo(ArrayList<Equipo> aux,String auxStr) {
	
	//METODO PARA DEVOLVER OBJETO EQUIPO
	
	Equipo ret = null;
	for (Equipo a : aux) {
 	   
 	   if (a.getid().equals(auxStr)) {
 		   
 		    ret = a;  		   
 	  
 	   }
   
	}
		
    return ret;
}

public static Partido buscarPartido(ArrayList<Partido> aux,String auxStr) {
	
	//METODO PARA DEVOLVER OBJETO EQUIPO
	
	Partido ret = null;
	for (Partido a : aux) {
 	   
 	   if (a.verequipos().equals(auxStr)) {
 		   
 		    ret = a;  		   
 	  
 	   }
   
	}
		
    return ret;
}


}
