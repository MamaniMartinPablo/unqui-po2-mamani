package ar.edu.unq.po2.tp2;

import java.util.ArrayList;

public class Empresa {
	
	private String nombre;
	private String cuit;
	private ArrayList<Empleado> empleados ;
	private ArrayList<ReciboDeHaberes> recibos ;

	
	public Empresa(String nombre, String cuit) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = new ArrayList<Empleado>();;
		this.recibos = new ArrayList<ReciboDeHaberes>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<Empleado> getEmpleados() {
		return this.empleados;
	}

	public ArrayList<ReciboDeHaberes> getRecibos() {
		return this.recibos;
	}

	public String getCuit() {
		return this.cuit;
	}
	
	public void setEmpleados(Empleado emp) {
		this.empleados.add(emp);
	}

	public float montoTotalDeSueldosNetos() {
		float montoTotal = 0;
		for (Empleado empleado : this.empleados) {
			montoTotal = montoTotal + empleado.sueldoNeto();
		}
		return montoTotal;
	}	
	
	public float montoTotalDeSueldosBrutos() {
		float montoTotal = 0;
		for (Empleado empleado : this.empleados) {
			montoTotal = montoTotal + empleado.sueldoBruto();
		}
		return montoTotal;
	}
	
	public float montoTotalDeRetenciones() {
		float retencionesTotales = 0;
		for (Empleado empleado : this.empleados) {
			retencionesTotales = retencionesTotales + empleado.retenciones();
		}
		return retencionesTotales;
	}
	
	public ReciboDeHaberes generarRecibo(Empleado emp) { 
		return new ReciboDeHaberes(emp.getNombre(), emp.getDireccion(), emp.sueldoBruto(), emp.sueldoNeto());
	}
	
	public void liquidacionDeSueldos() {
		
		for (Empleado empleado : this.empleados) {
			this.recibos.add(this.generarRecibo(empleado));
		}
	}
	
}



