package clase5;

public class ItemCarrito {

	private Producto producto;
	private int cantidad;
	
	
	public ItemCarrito(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public double precio() {
		return producto.getprecio() + cantidad;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EL PRODUCTO ES: " + this.producto.getnombre() + " Y SU PRECIO ES: " + this.precio();
	}
	
	
	
	
}
