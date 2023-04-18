package org.utn.integrador.fixture;

import java.util.ArrayList;

import org.utn.integrador.fixture.config.Config;

public class Fase extends Config{
    private int numeroFase;
	private ArrayList<Ronda> rondas;


public Fase(){
	this.rondas = new ArrayList<Ronda>();
	
}


public ArrayList<Ronda> getRondas() {
	return rondas;
}


public void setRondas(ArrayList<Ronda> rondas) {
	this.rondas = rondas;
}


public void puntosFase(ArrayList<Participante> part) {
	
	int totalPartidosFase = 0;

	for (Ronda r : this.rondas) {
		
		totalPartidosFase += r.totalPartidos();
	}
	
	System.out.println("TOTAL PARTIDOS DE LA FASE " + totalPartidosFase);
		
	for (Participante p : part) {
		
			int acertados = 0;
		   	
			for (Pronostico pron : p.getPronostico()) {
			  
			  acertados += pron.acertado();
			  
		   		}
		 
			//System.out.println(acertados);
		   	
			if (acertados == totalPartidosFase) {
			 
				p.guardarPuntosTotal(Integer.parseInt(this.getPuntosfase()));
			 
				System.out.println(p.getNombre() + " SUMA " + this.getPuntosfase() + " POR ACERTAR TODOS LOS PARTIDOS - " + "PUNTOS TOTALES " + p.getPuntosTotal() );
			}
			
			else {
				System.out.println(p.getNombre() + " - PUNTOS TOTALES " + p.getPuntosTotal() );
			}
		  
	  }
	
	
	
	
	
	
}


	
}

