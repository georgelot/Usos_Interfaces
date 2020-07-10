package cl.cp.boxers.impl;

import cl.cp.boxers.abtractas.BoxeadorCercanoAbstracto;
import cl.cp.boxers.interfaces.Enjambre;

public class EnjambreImpl extends BoxeadorCercanoAbstracto implements Enjambre{
	
	protected EnjambreImpl(String nombre, double peso) {
		super(nombre, peso);
	}
	
	@Override
	public void pelear() {
		System.out.println(nombre + "Estilista");
		aplicarLluviaDeGolpes();
	}
}
