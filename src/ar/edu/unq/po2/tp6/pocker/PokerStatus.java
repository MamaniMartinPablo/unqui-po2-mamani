package ar.edu.unq.po2.tp6.pocker;

import java.util.ArrayList;

public class PokerStatus {
		
public Boolean verificar(String c1,String c2,String c3,String c4, String c5) {
		
		String primerLetra = c1.length() == 2?c1.substring(0,1):c1.substring(0, 2);
		int contador = 1;
		ArrayList<String> lista = new ArrayList<String>();
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		
		for (String string : lista) {
			
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

}
