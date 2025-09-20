package ar.edu.unq.po2.tp4.trabajador;

public class Ingreso {
	
	private String mesDePercepcion;
	private String concepto;
	private double monto;
	
	
	public double getMonto() {
		return this.monto;
	}

	public double montoImponible() {
		return this.monto;
	}

	public Ingreso(String mesDePercepcion, String concepto, double monto) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.monto = monto;
	}

	public Object getMes() {
		// TODO Auto-generated method stub
		return this.mesDePercepcion;
	}

	public Object getConcepto() {
		// TODO Auto-generated method stub
		return this.concepto;
	}
	
	

}
