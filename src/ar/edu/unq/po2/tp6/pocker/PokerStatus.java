package ar.edu.unq.po2.tp6.pocker;

import java.util.ArrayList;

public class PokerStatus {
	
	private ArrayList<Carta> cartas;
		
public PokerStatus(Carta carta2p, Carta carta10p, Carta carta2c, Carta carta2d, Carta carta2t) {
		super();
		this.cartas = new ArrayList<Carta>();
		this.cartas.add(carta2p);
		this.cartas.add(carta10p);
		this.cartas.add(carta2c);
		this.cartas.add(carta2d);
		this.cartas.add(carta2t);
	}

public Boolean esPocker() {
		
		String primerLetra = this.cartas.get(0).getValor().toString();
		int contador = 0;
		for (Carta c : this.cartas) {
			
			if (c.getValor().toString().length() == 1 ) {
				if (c.getValor().toString().equals(primerLetra)) {
					contador = contador + 1;
				}
			}else {
				if(c.getValor().toString().length() == 2) {
					if (c.getValor().toString().equals(primerLetra)) {
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
	String palo = this.cartas.get(0).getPalo();
	int contador = 0;
	
	for (Carta c : this.cartas) {
		
		if (c.getValor().toString().length() == 1 ) {
			if (c.getPalo().equals(palo)) {
				contador = contador + 1;
			}
		}else {
			if(c.getValor().toString().length() == 2) {
				if (c.getPalo().equals(palo)) {
				contador = contador + 1;
				}
			}
		}
		
	}
	return contador == 5;
}

private boolean esTrio() {
	// TODO Auto-generated method stub
	String primerLetra = this.cartas.get(0).getValor().toString();
	int contador = 0;
	for (Carta c : this.cartas) {
		
		if (c.getValor().toString().length() == 1 ) {
			if (c.getValor().toString().equals(primerLetra)) {
				contador = contador + 1;
			}
		}else {
			if(c.getValor().toString().length() == 2) {
				if (c.getValor().toString().equals(primerLetra)) {
				contador = contador + 1;
				}
			}
		}
		
	}
	return contador == 3;
}

}
