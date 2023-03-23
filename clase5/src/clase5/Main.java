package clase5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carrito carrito1 = new Carrito(1);
		
		Producto prueba = new Producto("ARVEJAS",(double) 7.54);
		Producto prueba2 = new Producto("LENTEJAS",(double) 10.30);
		Producto prueba3 = new Producto("POROTOS",(double) 9.70);
		
				
		carrito1.setitem(new ItemCarrito(prueba,20));;
		
		carrito1.listaproductos();
        
		
		
		System.out.print("\nIMPORTE TOTAL: " + carrito1.importetotal());
	
	}

}
