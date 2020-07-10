package cl.cp.boxers.impl;

import cl.cp.boxers.abtractas.BoxeadorAbstracto;
import cl.cp.boxers.interfaces.Estilista;

public class EstilistaImpl extends BoxeadorAbstracto implements Estilista{

	public EstilistaImpl(String nombre, double peso) {
		super(nombre, peso);

	}
	@Override
	public void pelear() {
		System.out.println(nombre + "Estilista");
		aplicarJab();
		mantieneDistancia();
	}
}
