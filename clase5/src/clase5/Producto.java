package clase5;

public class Producto {

	private String nombre;
	private String descripcion;
	private double precio;
	private static final double minPrecio = 0.1;
	
	
public Producto(String nombre,double precio) {
	this.nombre = nombre;
	this.precio = precio;
	
}	

public double getprecio(){
	
	return this.precio;
	
}
public String getnombre() {
	
	return this.nombre;
}	
	
	
}
