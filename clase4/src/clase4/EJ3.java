package clase4;
import java.io.IOException;
import java.nio.file.*;
public class EJ3 {
 
	public static void main(String[] args) {
		
		
	//	String palabras[] = { "hola que tal ","mi nombre es","martin"};
		int salto = 1; 
		Path directorio = Paths.get("D:\\encode.txt");
		Path directorio2 = Paths.get("D:\\decode.txt");
	    
	  if (args[0].equals("E")) {
		
		
		  try {
				for (String linea : Files.readAllLines(directorio2)) {
					
					grabar(encode(linea.toLowerCase(),salto),directorio);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		  System.out.print("SE CODIFICO CON EXITO EL ARCHIVO");
	  }
	  
	  else {
	    try {
			for (String linea : Files.readAllLines(directorio)) {
				
				grabar(decode(linea.toLowerCase(),salto),directorio2);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  System.out.print("SE DECODIFICO CON EXITO EL ARCHIVO");
	  
	  
	  } 
	    
	    
	    
	}
	
  public static void grabar(String palabra,Path directorio ) {
	  
	  try {
			if (!Files.exists(directorio)){
	    	
	    	Files.createFile(directorio);
				    	
			}	    	
			
			Files.write(directorio, (palabra + "\n").getBytes() , StandardOpenOption.APPEND);
	    			
			
	    
	    
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		  
  }
	
  public static String encode(String palabra, int salto) {
	
	int valor;
	String resultado = "";
	for (char letra : palabra.toCharArray()) { 
		 
		  
		 if ((int)letra + salto <= 122) {
			   			   
		resultado += (char)((int)letra + salto);	  
		   
		 }
		 else {
			 
			valor = 96 + (((int)letra+ salto)-122);
			
			 resultado += (char) valor ;
		 }
	   
 
	}
	
	return resultado;
	
	
	
	
	
	
	
}  	
	
public static String decode(String palabra, int salto) {
	
	int valor;
	String resultado = "";
	for (char letra : palabra.toCharArray()) { 
		 
		  
		 if ((int)letra - salto <= 96 && (int)' ' != (int)letra - salto  ) {
			   			   
			 valor = 123 - salto;
				
			 resultado += (char) valor ;	  
		   
		 }
		 else {
			 
			 resultado += (char)((int)letra - salto);
		 }
	   
 
	}
	
	return resultado;
	
	
	
	
}	
	
	
	
	
	
	
	
}
