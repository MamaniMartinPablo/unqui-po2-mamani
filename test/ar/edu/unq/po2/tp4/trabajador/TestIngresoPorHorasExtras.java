package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestIngresoPorHorasExtras {
	
	private IngresoPorHorasExtras ingreso;
	

	@BeforeEach
	void setUp() throws Exception {
		ingreso = new IngresoPorHorasExtras("mayo", "soporte", 200, 5);
		
	}

	@Test
	void testConstructor() {
		assertEquals("mayo", ingreso.getMes());
		assertEquals("soporte", ingreso.getConcepto());
		assertEquals(200, ingreso.getMonto());
		assertEquals(5, ingreso.getcantidadDeHoras());
	}
	
	@Test
	void testMontoYMontoImponible() {
		assertEquals(200, ingreso.getMonto());
		assertEquals(0, ingreso.montoImponible());
	}

}
