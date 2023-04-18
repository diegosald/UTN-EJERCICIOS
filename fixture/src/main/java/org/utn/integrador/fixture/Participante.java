package org.utn.integrador.fixture;

import java.util.ArrayList;

public class Participante {
	
	private int id;
	private String nombre;
	private ArrayList<Pronostico> pronostico;
	private int puntosTotal;
	
	public Participante(int id,String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.pronostico = new ArrayList<Pronostico>();	
	    this.puntosTotal = 0;
	}


	public int getId() {
		return this.id;
	}


	public String getNombre() {
		return this.nombre;
	}
	
		
	public ArrayList<Pronostico> getPronostico() {
		return pronostico;
	}


	public void agregarprono(Pronostico a) {
		
		pronostico.add(a);
		
	}
	

	
	public int getPuntosTotal() {
		return puntosTotal;
	}


	public void guardarPuntosTotal(int puntosTotal) {
		this.puntosTotal += puntosTotal;
	}


	public int puntos() {
		
		 int puntaje = 0;
	    
		 for (Pronostico ju : this.pronostico) {
	        
						 
			 puntaje += ju.puntos();
			     	
	      }
	     
	     return  puntaje;
	  	    
	    }
	
	public void todosPartidos() {
		
		
		    
			 for (Pronostico ju : this.pronostico) {
		        
				
				 System.out.println(ju.verEquipPron());
		     	
		      }
		     
		   
		     
		    
		    }
	}
	

