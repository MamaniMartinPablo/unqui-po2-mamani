package ar.edu.unq.po2.tp3.rectangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.point.Point;

class TestRectangulo {
	
	private Rectangulo rectangulo;
	private Point p1;
	private Point p2;
	private Point p3;

@BeforeEach
public void setup() {
	// TODO Auto-generated method
	p1 = new Point(1,1);
	p2 = new Point(2,2);
	p3 = new Point(0,0);
	rectangulo = new Rectangulo(p1,p2);

}
	@Test
	void testMismoPunto() {
		assertEquals(rectangulo.getP1().getX(),1);
		assertEquals(rectangulo.getP1().getY(),1);
		assertEquals(rectangulo.getP3().getX(),3);
		assertEquals(rectangulo.getP3().getY(),2);
		//assertEquals(rectangulo.getP2().getX(),p3.getX());
		//assertEquals(rectangulo.getP2().getY(),p3.getY());
		//assertEquals(rectangulo.getP4().getX(),p3.getX());
		//assertEquals(rectangulo.getP4().getY(),p3.getY());
		
	}

}
