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
	
	
}
