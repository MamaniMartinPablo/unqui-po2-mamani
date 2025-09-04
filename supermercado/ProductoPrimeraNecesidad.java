package supermercado;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean flag) {
		super(nombre, precio, flag);
		// TODO Auto-generated constructor stub
	}
@Override
public Double getPrecio() {
	// TODO Auto-generated method stub
	return super.getPrecio()*.9;
}
}