package ar.edu.unq.po2.tp6.pocker;

import java.util.ArrayList;

public class PokerStatus {
	
	private ArrayList<String> cartas;
		
public PokerStatus(String c1, String c2, String c3, String c4, String c5) {
		super();
		this.cartas = new ArrayList<String>();
		this.cartas.add(c1);
		this.cartas.add(c2);
		this.cartas.add(c3);
		this.cartas.add(c4);
		this.cartas.add(c5);
	}

public Boolean esPocker() {
		
		String primerLetra = this.cartas.get(0).length() == 2?this.cartas.get(0).substring(0,1):this.cartas.get(0).substring(0, 2);
		int contador = 0;
		for (String string : this.cartas) {
			
			if (string.length() == 2 ) {
				if (string.substring(0,1).equals(primerLetra)) {
					contador = contador + 1;
				}
			}else {
				if(string.length() == 3) {
					if (string.substring(0,2).equals(primerLetra)) {
					contador = contador + 1;
					}
				}
			}
			
		}
		return contador == 4;
	}

public String verificar() {
	// TODO Auto-generated method stub
	if (this.esPocker()) {
		return "Poquer";
	}
	else {
		if (this.esTrio()) {
			return "Trio";
		}
		else {
			if (this.esColor()) {
				return "Color";
			}else {
				return "Nada";
			}
		}
	}
	
}

private boolean esColor() {
	// TODO Auto-generated method stub
	String palo = this.cartas.get(0).length() == 2 ?this.cartas.get(0).substring(1,2):this.cartas.get(0).substring(2,3);
	int contador = 0;
	System.out.println(this.cartas.get(0).substring(0, 1));
	System.out.println(this.cartas.get(0).substring(1, 2));
	
	for (String string : this.cartas) {
		
		if (string.length() == 2 ) {
			if (string.substring(1,2).equals(palo)) {
				contador = contador + 1;
			}
		}else {
			if(string.length() == 3) {
				if (string.substring(2,3).equals(palo)) {
				contador = contador + 1;
				}
			}
		}
		
	}
	return contador == 5;
}

private boolean esTrio() {
	// TODO Auto-generated method stub
	String primerLetra = this.cartas.get(0).length() == 2?this.cartas.get(0).substring(0,1):this.cartas.get(0).substring(0, 2);
	int contador = 0;
	for (String string : this.cartas) {
		
		if (string.length() == 2 ) {
			if (string.substring(0,1).equals(primerLetra)) {
				contador = contador + 1;
			}
		}else {
			if(string.length() == 3) {
				if (string.substring(0,2).equals(primerLetra)) {
				contador = contador + 1;
				}
			}
		}
		
	}
	return contador == 3;
}

}
