package ar.edu.unq.po2.tp6.pocker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPokerStatus {
	
	PokerStatus jugada;

	@BeforeEach
	void setUp() throws Exception {
		jugada = new PokerStatus();
	}

	@Test
	void testVerificarJugadaCon4CartasIgualesConValor2OseaPoker() {
		assertTrue(jugada.verificar("2P", "10P", "2C", "2D", "2T"));
	}
	
	@Test
	void testVerificarJugadaCon4CartasIgualesConValorDeReinaDeDiamantesOseaPoker() {
		assertTrue(jugada.verificar("QD", "3P", "QC", "QP", "QT"));
	}
	
	@Test
	void testVerificarJugadaCon4CartasIgualesConValorDe10OseaPoker() {
		assertTrue(jugada.verificar("10D", "10P", "2P", "10C", "10T"));
	}
	
	@Test
	void testVerificarJugadaConCartasDiferentesNoDePoker() {
		assertFalse(jugada.verificar("QD", "3P", "5P", "4C", "6T"));
	}
	
	@Test
	void testVerificarJugadaCon2CartasIgualesEnSuValorNoDaPoker() {
		assertFalse(jugada.verificar("4D", "4P", "5P", "10C", "3T"));
	}
	
	@Test
	void testVerificarJugadaCon3CartasIgualesEnSuValorNoDaPoker() {
		assertFalse(jugada.verificar("6D", "3P", "5P", "6C", "6T"));
	}

}
