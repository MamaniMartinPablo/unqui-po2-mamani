package ar.edu.unq.po2.tp4.trabajador;

public class IngresoPorHorasExtras extends Ingreso {
	
	private int cantidadDeHorasExtras;
	
	
	@Override
	public double montoImponible() {
		return 0;
	}

	public IngresoPorHorasExtras(String mesDePercepcion, String concepto, double monto , int cantDeHorasExtras) {
		super(mesDePercepcion, concepto, monto);
		this.cantidadDeHorasExtras = cantDeHorasExtras;
		// TODO Auto-generated constructor stub
	}

	public Integer getcantidadDeHoras() {
		// TODO Auto-generated method stub
		return this.cantidadDeHorasExtras;
	}

}
