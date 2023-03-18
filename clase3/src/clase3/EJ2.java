package clase3;
import java.nio.file.*;
public class EJ2 {
 
	public static void main(String[] args) {
		
		
		String palabra = "hola que tal?";
	    int salto = 1; 
		
	
		encode(palabra,salto);
	   
		
	}
	
public static void encode(String palabra, int salto) {
	
	int valor;
	
	for (char letra : palabra.toCharArray()) { 
		 
		  
		 if ((int)letra + salto <= 122) {
			   			   
		   System.out.print((char)((int)letra + salto));
		  
		   
		 }
		 else {
			 
			valor = 96 + (((int)letra+ salto)-122);
			
			 System.out.print((char) valor );
		 }
	   
  }
	
	
	
	
	
	
	
	
	
}  	
	
}
