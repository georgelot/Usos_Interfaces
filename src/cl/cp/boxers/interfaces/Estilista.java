package cl.cp.boxers.interfaces;

public interface Estilista {
	
	default void mantieneDistancia() {
		System.out.println("Mantiene distancia");
	}
	
	default void aplicarJab() {
		System.out.println("Aplica un JAB");
	}
}
