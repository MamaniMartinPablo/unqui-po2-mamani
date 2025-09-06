package ar.edu.unq.po2.tp2;

public class TestEmpresa {

	public static void main(String[] args) {
		// Punto a) completado
		// Punto b) completado
		// Punto c) completado . No necesitamos modificar la clase empresa por que 
		// en nuestro modelo la empresa trata a cualquier empleado de la misma manera.Osea
		// todos los empleados saben responder su sueldo y sus retenciones.
		
		// Punto d) completado
		
		Empresa mercadoLibre = new Empresa("mercadoLibre","503689780");
		EmpleadoPermanente emp1 = new EmpleadoPermanente("juan", "lorem123", false,"15/05/2000",500000,1,1);
		EmpleadoTemporario emp2 = new EmpleadoTemporario("damian","lorem12", true,"16/06/2000", 400000, "12/10/25",2);
		EmpleadoContratado emp3 = new EmpleadoContratado("maria", "lorem111", false, "20/10/20", 300000, 123456, "cheque");
		mercadoLibre.setEmpleados(emp1);
		mercadoLibre.setEmpleados(emp2);
		mercadoLibre.setEmpleados(emp3);
		System.out.println(mercadoLibre.montoTotalDeSueldosNetos());

		mercadoLibre.liquidacionDeSueldos();
		System.out.println(mercadoLibre.getRecibos());
		
	}

}
