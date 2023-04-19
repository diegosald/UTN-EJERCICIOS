package org.utn.integrador.fixture;

import java.util.ArrayList;

import org.utn.integrador.fixture.config.Config;


public class Ronda extends Config{
private int numeroRonda;
private int numeroFase; 
private ArrayList<Partido> partidos ;



public Ronda(int numero,int numeroFase) {
	
	this.numeroRonda = numero;
	this.numeroFase = numeroFase; 
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

public int totalPartidos(int numeroFase) {
	int cont=0;
	
	for (Partido par : partidos) {
	    if (par.numeroFase == this.numeroFase) {
	
		cont++;
	}

	}
 return cont;
}



public void verPartidos() {
	
	
	for (Partido p : partidos) {
		System.out.println(p.toString());
		
	}
}



public void puntos(ArrayList<Participante> part, int numeroFase) {
	
	
	
    for (Participante p : part  ) {
    	  
    	int sumaPuntosNro = 0;  
    	int acertados = 0;
    	
    	for (Pronostico pron : p.getPronostico()) {
    		    		  
    		  if (pron.getRondaNro() == (this.numeroRonda -1 ) && pron.getFaseNro() == numeroFase){
    			 // System.out.println(pron.verEquipPron());
    			  sumaPuntosNro += pron.puntos();
    			  acertados += pron.acertado();   			  
    		  }
    	 	  
    	}
    		  
    	if (this.partidos.size() == acertados)  {
    		
    		sumaPuntosNro += Integer.parseInt(this.getPuntosronda());
    	
    		System.out.println("RONDA "+ this.numeroRonda + " PARTICIPANTE: " + p.getNombre() + " ACERTADOS "+ acertados + " SUMA " + this.getPuntosronda() + 
    				" POR ACERTAR TODOS LOS PARTIDOS DE LA RONDA" +" PUNTOS " + sumaPuntosNro );	   
        	System.out.println("");
    		p.guardarPuntosTotal(sumaPuntosNro);
    	}
    		
    	else {
    		System.out.println("RONDA "+ this.numeroRonda + " PARTICIPANTE: " + p.getNombre() + " ACERTADOS "+ acertados +" PUNTOS " + sumaPuntosNro );	   
    		System.out.println("");
    		p.guardarPuntosTotal(sumaPuntosNro);
    		
    	}
    	
    		
    	
    	
    	
     }
      
      System.out.println("TOTAL PARTIDOS DE LA RONDA " + this.totalPartidos(0));
      System.out.println("");
}	


}








