package cl.cp.boxers.abtractas;

import cl.cp.boxers.interfaces.Boxeador;

public class BoxeadorAbstracto implements Boxeador{
	
	protected String nombre;
	protected double peso;
	
	protected BoxeadorAbstracto(String nombre, double peso) {
		
		this.nombre = nombre;
		this.peso = peso;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public void pelear() {
		// TODO Auto-generated method stub
		
	}
	
}
