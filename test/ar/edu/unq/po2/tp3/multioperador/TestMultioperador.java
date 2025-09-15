package ar.edu.unq.po2.tp3.multioperador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestMultioperador {
	
	public Multioperador multi;
	
@BeforeEach
public void setup() {
	// TODO Auto-generated method stub
	multi = new Multioperador();
	multi.setNumeros(5);
	multi.setNumeros(2);
}
	@Test
	void testmultiplicacionNumeros() {
		assertEquals(multi.multiplicacion(), 10);
	}
	
	@Test
	void testSumaNumeros() {
		assertEquals(multi.suma(), 7);
	}
	
	@Test
	void testRestaNumeros() {
		assertEquals(multi.resta(), -7);
	}

}
