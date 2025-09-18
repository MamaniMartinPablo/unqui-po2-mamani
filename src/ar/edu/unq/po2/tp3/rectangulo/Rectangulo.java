package ar.edu.unq.po2.tp3.rectangulo;

import ar.edu.unq.po2.tp3.point.Point;

public class Rectangulo {
	
	private Point p1;
	private Point p3;
	
	/*
	 *private Point p2;
	 *; private Point p4;
	 */
	
	
	
	public Point getP1() {
		return this.p1;
	}

	public Point getP3() {
		return this.p3;
	}

	/*
	 * public Point getP2() { return this.p2; }
	 */

	/*
	 * public Point getP4() { return this.p4; }
	 */
	
	//                                    1. 1    3 . 2
	public boolean asegurarConsistencia(Point p1, Point p3) {
		// TODO Auto-generated method stub
		if(p1.getX() - p3.getX() == 0 && p1.getY() - p3.getY() == 0) {
			throw new IllegalArgumentException("Puntos Iguales");
		}else {
			if (p3.getX() - p1.getX() == 1 && p3.getY() - p1.getY() >= 2) {
				throw new IllegalArgumentException("vertical Diferencia en X de uno y diferencia de Y de dos o mas ");
			}else {
				if (p3.getY() - p1.getY() == 1 && p3.getX() - p1.getX() >= 2) {
					throw new IllegalArgumentException("horizontal Diferencia en Y de uno y diferencia de X de dos o mas ");
					
				}else {//1 1    5 3
					if (p3.getX() - p1.getX() >= 2 && p3.getY() - p1.getY() >= 2) {
						throw new IllegalArgumentException("Diferencia en X de dos o mas y diferencia en Y uno o mas");
					}
				}
			}
		}
		return false;
	}
	
	public Point setPoint(Point p1, Point p3) {
		if (this.asegurarConsistencia(p1, p3)) {
			return p3;
		}else {
			
			throw new IllegalArgumentException("Este segundo Point no es valido1");
		}
	}

	public Point setShapePoint(Point p12, Point p32) {
		if (this.asegurarConsistencia(p12, p32)) {
			return new Point(p12.getX(), p32.getY());
		}else {
			
			throw new IllegalArgumentException("Este segundo Point no es valido2");
		}
		// TODO Auto-generated method stub	
	}
	

	public Rectangulo(Point p1, Point p3) {
		super();
		this.p1 = p1;
		this.p3 = this.setPoint(p1,p3);
		//this.p2 = this.setShapePoint(p1,p3);
		//this.p4 = this.setShapePoint(p3,p1);
	}


}


