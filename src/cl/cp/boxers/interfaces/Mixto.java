package cl.cp.boxers.interfaces;

public interface Mixto extends BoxeadorCercano, Estilista, Enjambre, Fajador, Pegador{
	
	@Override
	default void aplicarUpperCut() {
		System.out.println("Aplica UpperCut mixto 2.0 !!!");
	}
}
