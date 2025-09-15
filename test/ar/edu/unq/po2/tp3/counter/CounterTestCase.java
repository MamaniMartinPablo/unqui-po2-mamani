package ar.edu.unq.po2.tp3.counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.counter.Counter;

import org.junit.jupiter.api.BeforeEach;

public class CounterTestCase {
	
	private Counter counter;
	
	
	
	@BeforeEach
	public void setUp() throws Exception{
		
		counter = new Counter();
		
		counter.addNumer(1);
		counter.addNumer(3);
		counter.addNumer(5);
		counter.addNumer(7);
		counter.addNumer(9);
		counter.addNumer(1);
		counter.addNumer(1);
		counter.addNumer(1);
		counter.addNumer(1);
		counter.addNumer(4);
	}

	@Test
	public void testEvenNumbers() {
		int amount = counter.getEvenOcurrences();
		assertEquals(amount,10);
	}

}
