package apuestas;

import java.util.ArrayList;

/** 
 * Carreras, un "tipo" de apuesta con posiciones en opcion de apuesta
 */
public class Carreras extends Apuestas{
	ArrayList<CaballoCarrera> participantes = new ArrayList<CaballoCarrera>();
	
	public void crearCaballos() {
		CaballoCarrera p1 = new CaballoCarrera(4/15,"Justify",(float) 1.3);
		CaballoCarrera p2 = new CaballoCarrera(1/6,"Secretariat",2);
		CaballoCarrera p3 = new CaballoCarrera(1/6,"Frankel",2);
		CaballoCarrera p4 = new CaballoCarrera(1/6,"Cigar",2);
		CaballoCarrera p5 = new CaballoCarrera(1/10,"Seabiscuit",3);
		CaballoCarrera p6 = new CaballoCarrera(1/30,"Citation",10);
		CaballoCarrera p7 = new CaballoCarrera(1/10,"Tierr",3);
		participantes.add(p1);
		participantes.add(p2);
		participantes.add(p3);
		participantes.add(p4);
		participantes.add(p5);
		participantes.add(p6);
		participantes.add(p7);
	}
}
