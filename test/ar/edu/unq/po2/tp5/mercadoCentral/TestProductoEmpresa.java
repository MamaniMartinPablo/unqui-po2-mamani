package ar.edu.unq.po2.tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestProductoEmpresa {
	
	private ProductoEmpresa producto;

	@BeforeEach
	void setUp() throws Exception {
		
		producto = new ProductoEmpresa("Leche", 200, 4);
	}

	@Test
	void testConstructor() {
		assertEquals(producto.getNombre(), "Leche");
		assertEquals(producto.getPrecio(), 200);
		assertEquals(producto.getStock(), 4);
	}

}
