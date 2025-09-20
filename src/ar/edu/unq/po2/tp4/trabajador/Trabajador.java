package ar.edu.unq.po2.tp4.trabajador;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingreso> ingresos;

	public Trabajador() {
		super();
		this.ingresos = new ArrayList<Ingreso>();
	}
	
	public void registrarIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso);
	}
	
	
	public double getTotalPercibido() {
		double total = 0;
		for (Ingreso ingreso : this.ingresos) {
			total = total + ingreso.getMonto();
		}
		return total;
	}
	
	public double getMontoImponible() {
		double monto = 0;
		for (Ingreso ingreso : ingresos) {
			monto = monto + ingreso.montoImponible();
		}
		
		return monto;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible()*2/100;
	}

	public Integer cantidadDeIngresos() {
		// TODO Auto-generated method stub
		return this.ingresos.size();
	}

}
