package cl.cp.boxers.main;

import cl.cp.boxers.impl.FajadorImpl;
import cl.cp.boxers.impl.MixtoImpl;
import cl.cp.boxers.interfaces.Boxeador;

public class Principal {

	public static void main(String[] args) {

		// Boxeador destructor = new EstilistaImpl("Alonso ", 87);
		Boxeador escarlata = new MixtoImpl("Patricio ", 67);
		Boxeador heavyMachine = new FajadorImpl("Pedro ", 74);

		AltoNivel encuentro = new AltoNivel(heavyMachine, escarlata);
		encuentro.iniciarPelea();

	}
}
