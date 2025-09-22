package ar.edu.unq.po2.tp5.mercadoCentral;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(String nombre, double precio, int stock) {
		super(nombre, precio, stock);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getPrecio() {
		return super.getPrecio()*0.9;
	}

}
