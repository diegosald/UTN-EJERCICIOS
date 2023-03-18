package clase5;

public class Carrito {
private int id_carrito;
private Producto producto1;
private Producto producto2;
private Producto producto3;

public Carrito(int id) {
	this.id_carrito = id;
	
}

public void setprocducto1(Producto primero) {
	
	this.producto1 = primero;
	
}

public String getproducto1() {
	
	return this.producto1.getnombre();
	
}

public Producto getProducto1() {
	return producto1;
}

public void setprocducto2(Producto primero) {
	
	this.producto2 = primero;
	
}

public String getproducto2(){
	
	return this.producto2.getnombre();
	
}

public void setprocducto3(Producto primero) {
	
	this.producto3 = primero;
	
}

public String getproducto3() {
	
	return this.producto3.getnombre();
	
}




public double importetotal() {
	
	return this.producto1.getprecio() + this.producto2.getprecio() + this.producto3.getprecio();
	
}

public void listaproductos() {
	System.out.print("ID CARRITO "+this.id_carrito+"\n");
	System.out.print(producto1.getnombre() + "\t\t"+ producto1.getprecio() + "\n");
	System.out.print(producto2.getnombre() + "\t"+ producto2.getprecio() + "\n");
	System.out.print(producto3.getnombre() + "\t\t"+ producto3.getprecio());
}







}
