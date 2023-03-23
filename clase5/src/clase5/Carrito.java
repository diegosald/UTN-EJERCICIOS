package clase5;

public class Carrito {
private int id_carrito;
private ItemCarrito item1;
private ItemCarrito item2;
private ItemCarrito item3;

public Carrito(int id) {
	this.id_carrito = id;
	
}

public void setitem1(ItemCarrito primero) {
	
	this.item1 = primero;
	
}

public ItemCarrito getitem1() {
	
	return this.item1;
	
}





public double importetotal() {
	
	return this.item1.precio();
			//+ this.producto2.getprecio() + this.producto3.getprecio();
	
}

public void listaproductos() {
	System.out.print("ID CARRITO "+this.id_carrito+"\n");
	System.out.print(item1.toString());
	//System.out.print(producto2.getnombre() + "\t"+ producto2.getprecio() + "\n");
	//System.out.print(producto3.getnombre() + "\t\t"+ producto3.getprecio());
}







}
