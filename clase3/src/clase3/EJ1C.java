package clase3;

public class EJ1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = {7,8,9,6,5,4,2,11,22,45,7};
		int suma = 0;
		int x = 10;
		for (int minumero : numeros) {
			
			if (minumero > x ) {
				
				suma = suma + minumero;
				System.out.println(minumero);
			}
			
		}
		
	System.out.print(suma);
	
	}

}
