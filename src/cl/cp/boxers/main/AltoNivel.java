package cl.cp.boxers.main;

import cl.cp.boxers.interfaces.Boxeador;

public class AltoNivel {

	private Boxeador boxerUno;
	private Boxeador boxerDos;
	
	public AltoNivel(Boxeador boxerUno, Boxeador boxerDos) {
		this.boxerUno = boxerUno;
		this.boxerDos = boxerDos;
	}
	
	public void iniciarPelea() {
		
		boxerUno.pelear();
		System.out.println("");
		boxerDos.pelear();
		System.out.println("");
	}
}
