package ar.edu.unq.po2.tp2;


public class EmpleadoPermanente extends Empleado {
	
	private int cantidadDeHijos;
	private int antiguedad;

	public EmpleadoPermanente(String nombre, String direccion, Boolean estadoCivil, String fechaNacimiento,
			float sueldoBasico , int cantidadHijos , int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadDeHijos = cantidadHijos;
		this.antiguedad = antiguedad;
	}

	@Override
	public float sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico() + this.salarioFamiliar();
	}

	@Override
	public float retenciones() {
		// TODO Auto-generated method stub
		return this.obraSocial()+this.aportesJubilatorios();
	}
	
	public float salarioFamiliar() {
		return this.asignacionPorHijo() + this.asignacionPorConyuge()+this.asignacionPorAntiguedad();
	}
	
	public int getCantidadDeHijos() {
		return this.cantidadDeHijos;
	}
	
	public int asignacionPorHijo() {
		return this.getCantidadDeHijos()*150;
	}
	
	public int asignacionPorConyuge() {
		
		if(this.getEstadoCivil())
			return 100;
		else {
			return 0;
		}
	}
	
	public int getAntiguedad() {
		return this.antiguedad;
	}
	
	public int asignacionPorAntiguedad() {
		return this.getAntiguedad()*50;
	}
	
	public float obraSocial() {
		return this.sueldoBruto()*0.1f + this.getCantidadDeHijos()*20;
	}
	
	public float aportesJubilatorios() {
		return this.sueldoBruto()*0.15f;
	}

}
