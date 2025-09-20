package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestIngreso {
	
	private Ingreso ingreso;

	@BeforeEach
	void setUp() throws Exception {
		ingreso = new Ingreso("julio", "revestimiento", 100);
		
	}

	@Test
	void testConstructor() {
		assertEquals("julio", ingreso.getMes());
		assertEquals("revestimiento", ingreso.getConcepto());
		assertEquals(100, ingreso.getMonto());
	}
	
	@Test
	void testMontoYMontoImponible() {
		assertEquals(100, ingreso.getMonto());
		assertEquals(100, ingreso.montoImponible());
	}

}
