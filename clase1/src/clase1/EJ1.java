package clase1;
public class EJ1 {

	public static void main(String[] args) {
		
		imprimir();
	}

	
	public static void imprimir() {
		// TODO Auto-generated method stub
		int numeroInicio = 5;
		int numeroFin = 15;
        int numeroact = 0;
        
       // 1A - TODOS LOS NUMEROS 
        numeroact = numeroInicio;
        System.out.print("TODOS LOS NUMEROS ");	
        while (numeroact <= numeroFin ) {
        	
        	
        	System.out.print(numeroact + " ");
        	
        	numeroact = numeroact +1;
        	
        }
        
        // 1B - SOLO PARES       
        numeroact = numeroInicio;
        System.out.print("\nPARES ");
        while (numeroact <= numeroFin){ 
        	
        	 if (numeroact % 2 == 0) {
        	     System.out.print(numeroact + " ");
        		 //System.out.println(numeroact);
        	
        	 }
        	 
        	 
        	 numeroact = numeroact +1;
                	
        }
        
        
        //1C - SOLO IMPARES
        numeroact = numeroInicio;
        System.out.print("\nIMPARES ");
        while (numeroact <= numeroFin){ 
        	
       	      if (numeroact % 2 != 0) {
       	         System.out.print(numeroact + " ");
       		     //System.out.println(numeroact);
       	
       	 }
       	 
       	 
       	 numeroact = numeroact +1;
               	
       }
        
        //1D - PARES DE MAYOR A MENOR	
        numeroact = numeroInicio;
        System.out.print("\nPARES DE MAYOR A MENOR ");	
        	
        for(numeroact = numeroFin;numeroact>=numeroInicio;numeroact--){
        	
        	
        	 if (numeroact % 2 == 0) {
        	     System.out.print(numeroact + " ");
        		 //System.out.println(numeroact);
        	
        	 }
        	 }	
		}
	
	
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


