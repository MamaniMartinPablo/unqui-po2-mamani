package ar.edu.unq.po2.tp5.mercadoCentral;

import java.util.ArrayList;

public class MercadoCentral {
	
	private ArrayList<Caja> cajas;
	
	

	public ArrayList<Caja> getCajas() {
		return this.cajas;
	}

	public MercadoCentral() {
		super();
		this.cajas = new ArrayList<Caja>();
	}
	
	public void agregarCaja(Caja caja) {
		this.cajas.add(caja);
	}
	
	
	

}
