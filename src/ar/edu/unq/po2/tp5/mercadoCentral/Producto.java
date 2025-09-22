package ar.edu.unq.po2.tp5.mercadoCentral;

public abstract class Producto {
	
	private String nombre;
	private double precio;
	private int stock;
	
	
	public double getPrecio() {
		return this.precio;
	}

	public String getNombre() {
		return nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}


	public Producto(String nombre, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}


	public void descontarStock() {
		this.stock = this.stock - 1;
	}
}
