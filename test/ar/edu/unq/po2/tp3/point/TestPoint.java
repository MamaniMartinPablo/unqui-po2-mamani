package ar.edu.unq.po2.tp3.point;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPoint {
	
	private Point p1;
	private Point p2;

@BeforeEach
public void setup() {
	// TODO Auto-generated method stub
	p1 = new Point();
	p2 = new Point(7,3);

}
	@Test
	void testPuntoCeroCero() {
		assertEquals(p1.getX(),0);
		assertEquals(p1.getY(),0);
	}
	
	@Test
	void testPunto() {
		assertEquals(p2.getX(),7);
		assertEquals(p2.getY(),3);
	}
	
	@Test
	void testMoverPunto() {
		p2.movPoint(8,4);
		assertEquals(p2.getX(),8);
		assertEquals(p2.getY(),4);
	}
	
	@Test
	void testSumarPunto() {
		p2.sumPoint(3,7);
		assertEquals(p2.getX(),10);
		assertEquals(p2.getY(),10);
	}

}
