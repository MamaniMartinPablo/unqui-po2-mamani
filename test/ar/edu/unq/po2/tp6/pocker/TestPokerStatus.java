package ar.edu.unq.po2.tp6.pocker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPokerStatus {
	
	PokerStatus jugada1;
	PokerStatus jugada2;
	PokerStatus jugada3;
	PokerStatus jugada4;
	PokerStatus jugada5;
	PokerStatus jugada6;
	PokerStatus jugada7;

	@BeforeEach
	void setUp() throws Exception {
		jugada1 = new PokerStatus("2P", "10P", "2C", "2D", "2T");
		jugada2 = new PokerStatus("QD", "3P", "QC", "QP", "QT");
		jugada3 = new PokerStatus("10D", "10P", "2P", "10C", "10T");
		jugada4 = new PokerStatus("QD", "3P", "5P", "4C", "6T");
		jugada5 = new PokerStatus("4D", "4P", "5P", "10C", "3T");
		jugada6 = new PokerStatus("6D", "3P", "5P", "6C", "6T");
		jugada7 = new PokerStatus("6D", "3D", "5D", "10D", "2D");
	}

	@Test
	void testVerificarJugadaCon4CartasIgualesConValor2OseaPoker() {
		assertEquals("Poquer",jugada1.verificar());
	}
	
	@Test
	void testVerificarJugadaCon4CartasIgualesConValorDeReinaDeDiamantesOseaPoker() {
		assertEquals("Poquer",jugada2.verificar());
	}
	
	@Test
	void testVerificarJugadaCon4CartasIgualesConValorDe10OseaPoker() {
		assertEquals("Poquer",jugada3.verificar());
	}
	
	@Test
	void testVerificarJugadaConCartasDiferentesDaNada() {
		assertEquals("Nada",jugada4.verificar());
	}
	
	@Test
	void testVerificarJugadaCon2CartasIgualesEnSuValorDaNada() {
		assertEquals("Nada",jugada5.verificar());
	}
	
	@Test
	void testVerificarJugadaCon3CartasIgualesEnSuValorDaTrio() {
		assertEquals("Trio",jugada6.verificar());
	}
	
	@Test
	void testVerificarJugadaCon2CartasIgualesEnSuValorNoDaTrio() {
		assertEquals("Nada",jugada5.verificar());
	}
	
	@Test
	void testVerificarJugadaConCartasDiferentesNoDaTrio() {
		assertEquals("Nada",jugada5.verificar());
	}
	
	@Test
	void testVerificarJugadaCon5CartasDeIguaPaloEsColor() {
		assertEquals("Color",jugada7.verificar());
	}

}
