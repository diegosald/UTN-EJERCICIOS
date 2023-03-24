package clase5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carrito carrito1 = new Carrito(1);
		
		Producto prueba = new Producto("ARVEJAS",(double) 7.54);
		Producto prueba2 = new Producto("LENTEJAS",(double) 10.30);
		Producto prueba3 = new Producto("POROTOS",(double) 9.70);
		
				
		carrito1.setitem(new ItemCarrito(prueba,20));
		carrito1.setitem(new ItemCarrito(prueba2,20));
		carrito1.setitem(new ItemCarrito(prueba3,20));
		carrito1.listaproductos();
        
		
		
		System.out.print("\nIMPORTE TOTAL: " + carrito1.importetotal() + "\n");
	
		Descuento desc1 = new Descuentofijo();
		desc1.setValorDesc(1.0);
		
		System.out.print("\nIMPORTE TOTAL FIJO: " + carrito1.importeTotalDesc(desc1) + "\n");
		
		Descuento desc2 = new DescuentoPorc();
		desc2.setValorDesc(10);
		
		System.out.print("\nIMPORTE TOTAL FIJO: " + carrito1.importeTotalDesc(desc2) + "\n"); 
		
		
		
	}

}
