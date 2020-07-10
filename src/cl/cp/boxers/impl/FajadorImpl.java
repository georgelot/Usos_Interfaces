package cl.cp.boxers.impl;

import cl.cp.boxers.abtractas.BoxeadorAbstracto;
import cl.cp.boxers.interfaces.Fajador;

public class FajadorImpl  extends BoxeadorAbstracto implements Fajador{

	public FajadorImpl(String nombre, double peso) {
		super(nombre, peso);
	}
	
	@Override
	public void pelear() {
		System.out.println(nombre + "Fajador");
		golpearYMoverse();
		contratacar();

	}
}
