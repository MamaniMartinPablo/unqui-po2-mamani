package ar.edu.unq.po2.tp5.mercadoCentral;

public class Caja {
	
	private double montoAPagar;
	

	public double getMontoAPagar() {
		return this.montoAPagar;
	}
	
	public void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}

	public Caja() {
		super();
		this.montoAPagar = 0;
	}
	
	public void registrarProducto(Producto producto) {
		this.setMontoAPagar(this.getMontoAPagar()+producto.getPrecio());
		producto.descontarStock();
	}

	

}
