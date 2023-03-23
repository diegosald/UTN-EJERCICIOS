package clase5;

import java.util.ArrayList;

public class Carrito {
private int id_carrito;
ArrayList<ItemCarrito> item = new ArrayList<ItemCarrito>();


public Carrito(int id) {
	this.id_carrito = id;
	
}

public void setitem(ItemCarrito primero) {
	
	item.add(primero);
	
}


public double importetotal() {
	double total = 0;
	
	for (ItemCarrito aux : item) {
	
	total += aux.precio();
	
	}
	
	return total;
}
public double importeTotalDesc(Descuento desc) {
	double total = 0;
	
	for (ItemCarrito aux : item) {
	
	total +=  desc.valorFinal(aux.precio()); 
			
	
	}
	
	return total;
}



public void listaproductos() {
	System.out.print("ID CARRITO "+this.id_carrito+"\n");
	
	
	for (ItemCarrito aux : item) {
	System.out.print(aux.toString() + "\n");
	
	}
	
	}







}
