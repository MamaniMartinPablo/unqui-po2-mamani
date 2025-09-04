package supermercado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private List<Producto> productos;

	public Supermercado(String nombre, String direccion) {
		// TODO Auto-generated constructor stub
		this.direccion=direccion;
		this.nombre = nombre;
		this.productos = new ArrayList<Producto>();
	}
	
	public Integer getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public void agregarProducto(Producto arroz) {
		this.productos.add(arroz);
	}
	
	public Double getPrecioTotal() {
		double total = 0;
		for (Producto producto : this.productos) {
			total = total + producto.getPrecio();
		}
		return total;
	}
	

	
	
	
}

