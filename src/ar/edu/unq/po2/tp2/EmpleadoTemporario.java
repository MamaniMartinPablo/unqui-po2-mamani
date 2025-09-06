package ar.edu.unq.po2.tp2;
public class EmpleadoTemporario extends Empleado {
	
	private String fechaFinDesignacion;
	private int cantidadDeHorasExtras;
	

	public EmpleadoTemporario(String nombre, String direccion, Boolean estadoCivil, String fechaNacimiento,
			float sueldoBasico , String fechaDesignacion , int cantidadDeHoras) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		// TODO Auto-generated constructor stub
		this.fechaFinDesignacion = fechaDesignacion;
		this.cantidadDeHorasExtras = cantidadDeHoras;
	}
	
	public String getFechaFinDesignacion() {
		return this.fechaFinDesignacion;
	}

	@Override
	public float sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico() + this.sueldoPorHorasExtras();
	}

	@Override
	public float retenciones() {
		// TODO Auto-generated method stub
		return this.obraSocial()+this.montoPorSerMayorDe50()+this.aportesJubilatorios()+this.porcentajePorHorasExtras();
	}
	
	public int getCantidadDeHorasExtras() {
		return this.cantidadDeHorasExtras;
	}
	
	public int sueldoPorHorasExtras() {
		return this.getCantidadDeHorasExtras()*40;
	}
	
	public float obraSocial() {
		return this.sueldoBruto()*0.1f;
	}
	
	public float aportesJubilatorios() {
		return this.sueldoBruto()*0.1f;
	}
	
	public int montoPorSerMayorDe50() {
		if(this.edad()>50)
			return 25;
		else {
			return 0;
		}
	}
	
	public int porcentajePorHorasExtras() {
		return this.getCantidadDeHorasExtras()*5;
	}

}
