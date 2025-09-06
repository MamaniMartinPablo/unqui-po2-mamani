package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {
	
	private String nombreDeEmpleado;
	private String direccion;
	private LocalDate fechaDeEmision;
	private float sueldoBruto;
	private float sueldoNeto;
	
	public String getNombreDeEmpleado() {
		return nombreDeEmpleado;
	}

	public String getDireccion() {
		return direccion;
	}

	public LocalDate getFechaDeEmision() {
		return fechaDeEmision;
	}

	public float getSueldoBruto() {
		return sueldoBruto;
	}

	public float getSueldoNeto() {
		return sueldoNeto;
	}
	
	public ReciboDeHaberes(String nombreDeEmpleado, String direccion, float sueldoBruto,
			float sueldoNeto) {
		super();
		this.nombreDeEmpleado = nombreDeEmpleado;
		this.direccion = direccion;
		this.fechaDeEmision = LocalDate.now();
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
	}

}
