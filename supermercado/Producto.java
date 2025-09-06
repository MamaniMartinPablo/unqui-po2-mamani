package supermercado;


public class Producto {
	
	private String nombre;
	private double precio;
	private boolean precioCuidado;
	
	public Producto(String nombre, double precio , boolean flag) {
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = flag;
		
		
	}
	public Producto(String nombre, double precio ) {
		this(nombre,precio,false);
		
		
	}
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return this.precio;
	}
	public Boolean esPrecioCuidado() {
		// TODO Auto-generated method stub
		return this.precioCuidado;
	}
	public void aumentarPrecio(double d) {
		// TODO Auto-generated method stub
		this.precio=this.precio *d;
	}
}
