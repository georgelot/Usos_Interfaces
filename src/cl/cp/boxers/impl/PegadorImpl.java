package cl.cp.boxers.impl;

import cl.cp.boxers.abtractas.BoxeadorAbstracto;
import cl.cp.boxers.interfaces.Pegador;

public class PegadorImpl extends BoxeadorAbstracto implements Pegador{

	protected PegadorImpl(String nombre, double peso) {
		super(nombre, peso);

	}

	@Override
	public void pelear() {
		System.out.println(nombre + "Pegador");
		aplicarCrochet();
		aplicarUpperCut();
	}
}
