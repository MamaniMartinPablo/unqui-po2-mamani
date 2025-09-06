package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private Boolean estadoCivil;
	private String fechaNacimiento;
	private float sueldoBasico;
	
	
	public Empleado(String nombre, String direccion, Boolean estadoCivil, String fechaNacimiento, float sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public int edad() {
		
		int edad = 0;
		LocalDate fechaActual = LocalDate.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(this.fechaNacimiento, formatter);
		
		Period periodo = Period.between(fechaNac, fechaActual);
		
		edad = periodo.getYears();
		return edad;
	}
	
	public float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	public float getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public Boolean getEstadoCivil() {
		return this.estadoCivil;
	}
	
	public abstract float sueldoBruto() ;
	
	public abstract float retenciones();
}
