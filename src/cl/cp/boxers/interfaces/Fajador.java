package cl.cp.boxers.interfaces;

public interface Fajador {

	default void golpearYMoverse() {
		System.out.println("Golpea y se mueve");
	}
	
	default void contratacar() {
		System.out.println("Contrataca");
	}
}
