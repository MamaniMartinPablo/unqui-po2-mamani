package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean flag, double descuento) {
		super(nombre, precio, flag);
		this.descuento = descuento;
		// TODO Auto-generated constructor stub
	}
	
	
public double getDescuento() {
		return this.descuento;
	}

@Override
public Double getPrecio() {
	// TODO Auto-generated method stub
	return super.getPrecio() - super.getPrecio()*this.getDescuento()/100;
}
}