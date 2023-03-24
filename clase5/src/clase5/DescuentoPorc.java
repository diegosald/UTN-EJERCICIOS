package clase5;

public class DescuentoPorc extends Descuento {

	@Override
	public double valorFinal(double precio) {
		// TODO Auto-generated method stub
		double porcent = this.valordesc / 100;
		return precio - (precio * porcent);
	}

}
