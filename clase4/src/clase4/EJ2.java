package clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length != 0 && args.length == 2 ) {
		Path archivo = Paths.get(args[0].replace("\\","\\\\"));
		
		
		
		if (args[1].toUpperCase().equals("S")) {
		
			suma(archivo);
		
	
       	
		}
	
		if (args[1].toUpperCase().equals("M")) {
			
			multiplica(archivo);
			
			
		}
		}
		else {
			System.out.print("aDEBE PASAR 2 PARAMETROS PATH OPERACION(S para suma M para multiplicacion) \n EJ: c:\\archivo.txt s");
		} 
			
		
	}
	
	
	public static void suma(Path path) {
		
        int resultado = 0; 
		
        try {
			
			
			for (String a : Files.readAllLines(path))  {
				
				resultado +=  Integer.parseInt(a) ;
				
				
			}
			
			
			System.out.print("EL RESULTADO DE LA SUMA ES: "+resultado);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}
	
	
	public static void multiplica(Path path) {
		
       int resultado = 1; 
		
        try {
			
			
			for (String a : Files.readAllLines(path))  {
				
				resultado = resultado * Integer.parseInt(a) ;
				
				
			}
			
			
			System.out.print("EL RESULTADO DE LA MULTIPLICACION ES: "+resultado);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	

}
