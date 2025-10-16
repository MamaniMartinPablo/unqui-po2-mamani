package ar.edu.unq.po2.tp6.pocker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPokerStatus {
	
	PokerStatus jugada1;PokerStatus jugada2;PokerStatus jugada3;
	PokerStatus jugada4;PokerStatus jugada5;PokerStatus jugada6;
	PokerStatus jugada7;
	
	Carta carta2p;Carta carta10p;Carta carta2c;Carta carta2d;Carta carta2t;
	Carta cartaqd;Carta carta3p;Carta cartaqc;Carta cartaqp;Carta cartaqt;
	Carta carta10d;Carta carta10c;Carta carta10t;
	Carta carta5p;Carta carta4c;Carta carta6t;
	Carta carta4d;Carta carta4p;Carta carta3t;
	Carta carta6d;Carta carta6c;
	Carta carta3d;Carta carta5d;

	@BeforeEach
	void setUp() throws Exception {
		
		carta2p = new Carta(2, "P");carta10p = new Carta(10,"P");
		carta2c = new Carta(2, "C");carta2d = new Carta(2, "D");
		carta2t = new Carta(2, "T");
		
		cartaqd = new Carta("QD");carta3p = new Carta(3,"P");
		cartaqc = new Carta("QC");cartaqp = new Carta("QP");
		cartaqt = new Carta("QT");
		
		carta10d = new Carta(10,"D");carta10p = new Carta(10,"P");
		carta10c = new Carta(10,"C");carta10t = new Carta(10,"T");
		
		carta5p = new Carta(5,"P");carta4c = new Carta(4,"C");
		carta6t = new Carta(6,"T");
		
		carta6d = new Carta(6,"D");carta6c = new Carta(6,"C");
		
		carta4d = new Carta(4,"D");carta4p = new Carta(4,"P");
		carta3t = new Carta(3,"T");
		
		carta3d = new Carta(3,"D");carta5d = new Carta(5,"D");
	
		jugada1 = new PokerStatus(carta2p, carta10p,carta2c ,carta2d ,carta2t );
		jugada2 = new PokerStatus(cartaqd, carta3p,cartaqc, cartaqp, cartaqt);
		jugada3 = new PokerStatus(carta10d, carta10p,carta2p,carta10c,carta10t);
		jugada4 = new PokerStatus(cartaqd, carta3p, carta5p,carta4c,carta6t);
		jugada5 = new PokerStatus(carta4d,carta4p,carta5p,carta10c, carta3t);
		jugada6 = new PokerStatus(carta6d, carta3p,carta5p,carta6c,carta6t);
		jugada7 = new PokerStatus(carta6d,carta3d,carta5d,carta10d, carta2d);
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
