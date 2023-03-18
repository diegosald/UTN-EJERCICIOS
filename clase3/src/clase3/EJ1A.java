package clase3;

public class EJ1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String palabra;
	int contador=0;
	palabra = "hola que tal a";

	System.out.print(palabra + "\n");

	char prueba[] =  palabra.toCharArray();


	for (int i = 0;i<palabra.length() ;i++) {
		
		if  (prueba[i] == 'a'){
					
	      
		      contador++;
		}
		
		
	}
	System.out.print("total de letras a: " + contador);

	
	
	
	
	
	}

}
