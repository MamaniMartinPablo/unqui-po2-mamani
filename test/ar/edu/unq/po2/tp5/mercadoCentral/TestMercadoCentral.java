package ar.edu.unq.po2.tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.supermercado.SupermercadoTest;

class TestMercadoCentral {
	
	private MercadoCentral mercado1;
	private Caja caja1;

	@BeforeEach
	void setUp() throws Exception {
		
		mercado1 = new MercadoCentral();
		caja1 = new Caja();
	}

	@Test
	void testConstructor() {
		assertTrue(mercado1.getCajas().isEmpty());
	}
	
	@Test
	void testCantidadDeCajas() {
		mercado1.agregarCaja(caja1);
		assertEquals(mercado1.getCajas().size(),1);
	}
	

}
