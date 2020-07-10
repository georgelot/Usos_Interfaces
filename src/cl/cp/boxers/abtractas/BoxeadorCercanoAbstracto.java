package cl.cp.boxers.abtractas;

import cl.cp.boxers.interfaces.BoxeadorCercano;

public class BoxeadorCercanoAbstracto extends BoxeadorAbstracto implements BoxeadorCercano{

	protected BoxeadorCercanoAbstracto(String nombre, double peso) {
		super(nombre, peso);

	}

}
