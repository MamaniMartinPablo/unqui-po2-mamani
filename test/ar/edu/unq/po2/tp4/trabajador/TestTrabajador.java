package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTrabajador {
	
	private Trabajador juan;
	private Ingreso ingreso1;
	private IngresoPorHorasExtras ingreso2;

	@BeforeEach
	void setUp() throws Exception {
		juan = new Trabajador();
		ingreso1 = new Ingreso("julio", "revestimiento", 100);
		ingreso2 = new IngresoPorHorasExtras("mayo", "soporte", 200, 5);
	    juan.registrarIngreso(ingreso1);
	    juan.registrarIngreso(ingreso2);
	}
	
	@Test
	void testCantDeIngresosDelTrabajador() {
		 assertEquals(2, juan.cantidadDeIngresos());
	}
	
	@Test
	void testgetTotalPercibido() {
		 assertEquals(300, juan.getTotalPercibido());
	}
	
	@Test
	void testgetMontoImponible() {
		 assertEquals(100, juan.getMontoImponible());
	}
	
	@Test
	void testgetImpuestoAPagar() {
		 assertEquals(2, juan.getImpuestoAPagar());
	}

}
