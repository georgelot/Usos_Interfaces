package cl.cp.boxers.impl;

import cl.cp.boxers.abtractas.BoxeadorAbstracto;
import cl.cp.boxers.interfaces.Mixto;

public class MixtoImpl extends BoxeadorAbstracto implements Mixto{

	public MixtoImpl(String nombre, double peso) {
		super(nombre, peso);
	}
	
	@Override
	public void pelear() {
		System.out.println(nombre + "Mixto");
		aplicarCrochet();
		aplicarJab();
		aplicarLluviaDeGolpes();
		aplicarUpperCut();
		mantieneDistancia();
		contratacar();
		golpearYMoverse();
	}
}
