package ar.edu.unq.po2.tp6.pocker;

public class Carta {
	
	private int valor;
	private String palo;
	
	
	public Carta(int valor, String palo) {
		
		// TODO Auto-generated constructor stub
		this.valor = valor;
		this.palo = palo;
	}
    public Carta(String palo) {
		
		// TODO Auto-generated constructor stub
		this.valor = 0;
		this.palo = palo;
	}
	
	
	public Integer getValor() {
		// TODO Auto-generated method stub
		return this.valor;
	}


	public String getDiamante() {
		// TODO Auto-generated method stub
		return this.palo;
	}


	public boolean esSuperior(Carta carta2) {
		// TODO Auto-generated method stub
		return this.getValor()>carta2.getValor();
	}


	public boolean tieneMismoPalo(Carta carta2) {
		// TODO Auto-generated method stub
		return this.getPalo().equals(carta2.getPalo());
	}


	public String getPalo() {
		// TODO Auto-generated method stub
		return this.palo;
	}

}
