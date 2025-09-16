package ar.edu.unq.po2.tp3.point;

public class Point {
	
	private int x;
	private int y;
	
	
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void movPoint(int a,int b) {
		this.x = a;
		this.y = b;
	}
	
	public void sumPoint(int a , int b) {
		this.x = this.x + a;
		this.y = this.y + b;
	}
	
	
	

}
