package ar.edu.unq.po2.tp6.pocker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCarta {
	
	private Carta carta;
	private Carta carta1;
	private Carta carta2;

	@BeforeEach
	void setUp() throws Exception {
		
		carta = new Carta(2,"Picas");
		carta1 = new Carta(15,"Diamantes");
		carta2 = new Carta(4,"Diamantes");
	}

	@Test
	void testConstructor() {
		assertEquals(2, carta.getValor());
		assertEquals("Picas", carta.getDiamante());
		
	}
	@Test
	void testCarta1EsSuperiorALaCarta2EnValor() {
		assertTrue(carta1.esSuperior(carta2));
		
	}
	@Test
	void testCartaNoEsSuperiorALaCarta2EnValor() {
		assertFalse(carta.esSuperior(carta2));
		
	}
	@Test
	void testCarta1TieneElMismoPaloQueLaCarta2() {
		assertTrue(carta1.tieneMismoPalo(carta2));
		
	}
	@Test
	void testCartaNoTieneElMismoPaloQueLaCarta2() {
		assertFalse(carta.tieneMismoPalo(carta2));
		
	}

}
