package clase5;

public class Descuentofijo extends Descuento{

	@Override
	public double valorFinal(double precio) {
		
		return precio - this.valordesc;
	}

	

}
