package ar.edu.unq.po2.tp4.supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoPrimeraNecesidad("Arroz", 10, true, 8);
		leche = new ProductoPrimeraNecesidad("Leche", 8, false,11);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.12), leche.getPrecio());
		assertEquals(9.2d, arroz.getPrecio());
	}
}
