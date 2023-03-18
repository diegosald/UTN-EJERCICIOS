package clase5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carrito carrito1 = new Carrito(1);
		
		Producto prueba = new Producto("ARVEJAS",(double) 7.54);
		Producto prueba2 = new Producto("LENTEJAS",(double) 10.30);
		Producto prueba3 = new Producto("POROTOS",(double) 9.70);
		
				
		carrito1.setprocducto1(prueba);
		carrito1.setprocducto2(prueba2);
		carrito1.setprocducto3(prueba3);
		
		carrito1.listaproductos();
        
		
		
		System.out.print("\nIMPORTE TOTAL: " + carrito1.importetotal());
	 System.out.print(carrito1.getProducto1().getnombre());
	}

}
