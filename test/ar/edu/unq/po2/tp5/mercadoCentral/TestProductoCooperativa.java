package ar.edu.unq.po2.tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestProductoCooperativa {
	
	private ProductoCooperativa producto;

	@BeforeEach
	void setUp() throws Exception {
		
		producto = new ProductoCooperativa("Arroz",100,2);
	}

	@Test
	void testConstructor() {
		assertEquals(producto.getNombre(), "Arroz");
		assertEquals(producto.getPrecio(), 90);
		assertEquals(producto.getStock(), 2);
	}

}
