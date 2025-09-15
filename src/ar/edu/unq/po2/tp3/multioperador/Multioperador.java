package ar.edu.unq.po2.tp3.multioperador;

import java.util.ArrayList;

public class Multioperador {
	private ArrayList<Integer> numeros;
	
	
	
	public Multioperador() {
		super();
		this.numeros = new ArrayList<Integer>();
	}


	public ArrayList<Integer> getNumeros() {
		return this.numeros;
	}





	public void setNumeros(Integer numero) {
		this.numeros.add(numero);
	}





	public int suma() {
		int suma=0;
		for (Integer numero : this.numeros) {
			suma = suma + numero;
		}
		
		return suma;
	}
	
	public int resta() {
		int resta=0;
		for (Integer numero : this.numeros) {
			resta = resta - numero;
		}
		
		return resta;
	}
	

	public int multiplicacion() {
		int multi=1;
		for (Integer numero : this.numeros) {
			multi = multi * numero;
		}
		
		return multi;
	}
	
	
}


