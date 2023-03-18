package clase4;

import java.util.Scanner;

public class EJ1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	String valores[] = args;
	int numeros[] ;
	String orden = "";       
	 
		
		valores = ingresadatos(args);
		
		
		
	    numeros = new int[valores.length-1]; //defino el tamaño del arreglo 
		       
	          for (int i = 0 ; i < valores.length ; i++ ) {
				 		
			          if (valores[i].matches("\\d*")) {
			    	 
			             	 numeros[i] = Integer.parseInt(valores[i]);
			    	
			                  }
			     
			          else {
			    	 
			        	  		orden = valores[i];
			          		}
			
		
		        }
	
		  
		ordena(numeros,orden);
		
		
		
		
		
	}

public static String[] ingresadatos(String[] datos) {
	
	
	Scanner scn = new Scanner(System.in);
	String carga[] = new String[4];
	int posicion = 0;
	
	
	if (datos.length == 4) {
		scn.close();
		carga = datos;
	System.out.print("SE RECIBIERON TODOS LOS PARAMETROS DEL MAIN");
	}
	
	else {
	  
		for(int j= 0 ; j <datos.length ; j++) {
	         carga[j] = datos[j]; // CARGO ARRAY CON LOS ARGUMENTOS QUE TRAIGO DEL MAIN
		}
	  
	  posicion = datos.length;
	  
	  System.out.print("FALTAN COMPLETAR "+ (4 - posicion)  +" DATOS \n" );
		
	  for (int i=posicion ; i < 4 - posicion ; i++) {
	
	     System.out.print("INGRESE UN VALOR " + (i + 1)+ " ");
	     carga[i] = scn.nextLine();
	//System.out.print(carga[i]);
	
	}
	System.out.print("INGRESE A PARA ASCENDENTE O D PARA DESCENDENTE ");
	carga[carga.length -1] = scn.nextLine();
	
	
	
	}
	scn.close();
	return carga;
}	
	
public static void ordena(int[] numeros, String orden) {
	
	int aux;
	
	for (int i = 0; i < numeros.length; i++) {
		
		for (int j = 0; j< numeros.length -1 ; j++) {
			
				if 	(numeros[j+1] < numeros[j]) {
					
					aux = numeros [j];
					numeros[j]=numeros[j+1];
					numeros[j+1] = aux;
											
					                  }
						
                           		}
						
	                        }
	
	if (orden.equals("A")) {
	
	System.out.print("ORDEN ASCENDENTE: ");	
		for(int k = 0; k<numeros.length;k++) {
		
			System.out.print(numeros[k] + " ");
			
			
		}
		
	}
		
	if (orden.equals("D")) {
	
	System.out.print("ORDEN DESCENDENTE: ");		
		for(int k = numeros.length-1;0 <= k ;k--) {
			
			System.out.print(numeros[k] + " ");
			
			
		}
		
	}
		
 }


}
	
	

