package org.utn.integrador.fixture;



public class Partido {
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	
	 
	 public Partido(Equipo equipo1,Equipo equipo2, int golesEquipo1 , int golesEquipo2 ){
		 this.equipo1 = equipo1;
		 this.equipo2 = equipo2;
		 this.golesEquipo1 = golesEquipo1;
		 this.golesEquipo2 = golesEquipo2;
		 
	 }
	
	 public String verequipos() {
		 
		 return this.equipo1.getid()+ "" + this.equipo2.getid();
		 
	 }
	 public String verPartido() {
		 
		 return " " + this.equipo1.getid()+ "" + this.equipo2.getid() + " GOLES " + this.golesEquipo1 + " " + this.golesEquipo2; 
		 
	 }
	 

     public ResultadoEnum resultado(Equipo a) {
    	 
    	 if(this.golesEquipo1 == this.golesEquipo2) { return ResultadoEnum.EMPATO;}
    	 
    	 if((this.golesEquipo1 >= this.golesEquipo2) && this.equipo1 == a){
    		 return ResultadoEnum.GANO;
    	 }
    	 else {
    		   
    		 if((this.golesEquipo2 >= this.golesEquipo1) && this.equipo2 == a){
        		 return ResultadoEnum.GANO;
        	 }
    		 
    		 else {
    			 return ResultadoEnum.PERDIO;
    		 
    		 }
    		 
    		 }
    	 
    	 
    	 
    	 
    	 
    	 
    	
     }

}
