package clase1;

public class EJ2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float sueldototal;
		int cantcasas;
		int cantautos;
		int tienebarco; // 0 para no 1 para si
		int tieneaeronave; // 0 para no 1 para si
		int activosoc;
		
		
		sueldototal = 300000;
		cantcasas =2;
		cantautos = 2;
		tienebarco = 0;
		tieneaeronave = 1;
		activosoc = 0;
		
		
		if (sueldototal > 489083 || cantcasas >= 3 || cantautos >=3 || tienebarco == 1 || tieneaeronave == 1 || activosoc == 1) {
			
			System.out.println("SUELDO ALTO");
					
			
		}	
		
		
		
	}
	
		
}
