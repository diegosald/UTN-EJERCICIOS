package org.utn.integrador.fixture;

import java.util.ArrayList;

import org.utn.integrador.fixture.config.Config;


public class Ronda extends Config{
int numeroRonda;
private ArrayList<Partido> partidos ;



public Ronda(int numero) {
	
	this.numeroRonda = numero;
	this.partidos = new ArrayList<Partido>();
	
}



public int getNumeroRonda() {
	
	return numeroRonda;

}



public void setNumeroRonda(int numeroRonda) {
	
	this.numeroRonda = numeroRonda;

}



public ArrayList<Partido> getPartidos() {

	return partidos;

}



public void setPartidos(ArrayList<Partido> partidos) {

	this.partidos = partidos;

}

public int totalPartidos() {
	
	
	return partidos.size();
	
}



public void verPartidos() {
	
	
	for (Partido p : partidos) {
		System.out.println(p.toString());
		
	}
}



public void puntos(ArrayList<Participante> part) {
	
	
	
    for (Participante p : part  ) {
    	  
    	int sumaPuntosNro = 0;  
    	int acertados = 0;
    	
    	for (Pronostico pron : p.getPronostico()) {
    		    		  
    		  if (pron.getRondaNro() == (this.numeroRonda -1)){
    		//	  System.out.println(pron.verEquipPron());
    			  sumaPuntosNro += pron.puntos();
    			  acertados += pron.acertado();   			  
    		  }
    	 	  
    	}
    		  
    	if (this.partidos.size() == acertados)  {
    		
    		sumaPuntosNro += Integer.parseInt(this.getPuntosronda());
    	
    		System.out.println("RONDA "+ this.numeroRonda + " PARTICIPANTE: " + p.getNombre() + " ACERTADOS "+ acertados + " SUMA " + this.getPuntosronda() + 
    				" POR ACERTAR TODOS LOS PARTIDOS" +" PUNTOS " + sumaPuntosNro );	   
        	p.guardarPuntosTotal(sumaPuntosNro);
    	}
    		
    	else {
    		System.out.println("RONDA "+ this.numeroRonda + " PARTICIPANTE: " + p.getNombre() + " ACERTADOS "+ acertados +" PUNTOS " + sumaPuntosNro );	   
        	p.guardarPuntosTotal(sumaPuntosNro);
    		
    	}
    	
    		
    	
    	
    	
     }
      
       	System.out.println("TOTAL PARTIDOS DE LA RONDA " + this.totalPartidos());

}	


}








