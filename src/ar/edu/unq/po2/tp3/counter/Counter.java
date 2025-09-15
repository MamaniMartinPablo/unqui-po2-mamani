package ar.edu.unq.po2.tp3.counter;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> counter;

	public Counter() {
		super();
		this.counter = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getCounter() {
		return this.counter;
	}

	public void addNumer(int number) {
		this.counter.add(number);
		
	}

	public int getEvenOcurrences() {
		// TODO Auto-generated method stub
		return this.counter.size();
	}

}
