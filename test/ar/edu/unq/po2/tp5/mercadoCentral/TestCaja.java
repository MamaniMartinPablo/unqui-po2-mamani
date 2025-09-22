package ar.edu.unq.po2.tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaja {
	
	private Caja caja1;
	private ProductoCooperativa producto1;
	private ProductoEmpresa producto2;

	@BeforeEach
	void setUp() throws Exception {
		caja1 = new Caja();
		producto1 = new ProductoCooperativa("Arroz", 100, 5);
		producto2 = new ProductoEmpresa("Fideo", 100, 3);
	}

	@Test
	void testConstructor() {
		assertEquals(caja1.getMontoAPagar(),0);
	}
	
	@Test
	void testRegistrarProductoCooperativa() {
		caja1.registrarProducto(producto1);
		assertEquals(caja1.getMontoAPagar(),90);
		assertEquals(producto1.getStock(),4);
	}
	
	@Test
	void testRegistrarProductoEmpresa() {
		caja1.registrarProducto(producto2);
		assertEquals(caja1.getMontoAPagar(),100);
		assertEquals(producto2.getStock(),2);
	}
	
	@Test
	void testRegistrarDosProductos() {
		caja1.registrarProducto(producto1);
		caja1.registrarProducto(producto2);
		assertEquals(caja1.getMontoAPagar(),190);
		assertEquals(producto1.getStock(),4);
		assertEquals(producto2.getStock(),2);
	}

}
