package ar.edu.unq.po2.tp2;

public class EmpleadoContratado extends Empleado {
	
	private int numeroDeContrato;
	private String medioDePago;

	public EmpleadoContratado(String nombre, String direccion, Boolean estadoCivil, String fechaNacimiento,
			float sueldoBasico , int numeroDeContrato , String medioPago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		// TODO Auto-generated constructor stub
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago = medioPago;
	}
	
	public int gastosAdminitrativosContractuales() {
		return 50;
	}

	@Override
	public float sueldoBruto() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico();
	}
	
	public int getNumeroDeContrato() {
		return this.numeroDeContrato;
	}

	public String getMedioDePago() {
		return this.medioDePago;
	}

	@Override
	public float retenciones() {
		// TODO Auto-generated method stub
		return this.gastosAdminitrativosContractuales();
	}

}
