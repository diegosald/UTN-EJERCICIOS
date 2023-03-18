package clase3;

public class EJ1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aux;
		int numero[] = {18,5,9};
	    boolean orden = true; // true para ordenar de menor a mayor - false para ordenar de mayor a menor
		
		
		for (int i = 0;i<numero.length;i++){
			
			   for (int j=0;j<numero.length-1;j++) {
		
			     if (numero[j] > numero[j+1]) {
				
				      aux = numero[j];
				      numero[j]=numero[j+1];
				      numero[j+1]=aux;
							
			                                 }
			
			
			                           }
	                        	}
	
		
		
		
		if (orden) { 
		
		for (int l= 0;l<numero.length;l++) {
			
			System.out.print(numero[l]+ " ");
			
		}
	
		}
		
		else {
			
			
			for (int l= numero.length-1;l>=0;l--) {
				
				System.out.print(numero[l]+ " ");
				
			}
			
		}
		
		
		
	}

}
