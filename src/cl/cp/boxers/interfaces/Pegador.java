package cl.cp.boxers.interfaces;

public interface Pegador {
	
	default void aplicarUpperCut() {
		System.out.println("Aplicar un UpperCut");
	}
	
	default void aplicarCrochet() {
		System.out.println("Aplica un Crochet");
	}
}
