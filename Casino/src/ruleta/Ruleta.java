 package ruleta;

import java.awt.Color;
import java.util.ArrayList;

public class Ruleta {
	// Elementos estaticos
	static final int NUM_MAX_CASILLAS = 37; // Casillas totales
	static final int RADIO_RULETA = 300;
	static ArrayList<Casilla> casillas;
	
	/** Metodo inicializador de ruleta
	 * 
	 */
	public static void initRuleta() {
		Casilla aux = new Casilla();
		casillas.add( new Casilla( 0, Color.GREEN, new Posicion(0.0f,0.0f) ) ); // Casilla verde
		
		// Añadir todas las demas Casillas cada uno con su numero(del 1 al 36) y color
		for(int i = 1; i < NUM_MAX_CASILLAS; i++) { 
			casillas.add(aux.addCasillaNegra(i));
			casillas.add(aux.addCasillaRoja(i));
		}
		aux.colocarCasillas();
	}
	
	/** Metodo para añadir casillas al arraylist de las casillas, siendo NUM_MAX_CASILLAS el limite
	 * @param casilla para añadir al arraylist
	 * @return false si el ArrayList está lleno
	 */
	public boolean addCasilla(Casilla casilla) {
		if(casillas.size() < NUM_MAX_CASILLAS) return casillas.add(casilla);
		return false;
	}
	public ArrayList<Casilla> getCasillas() {
		return casillas;
	}
	public void setCasillas(ArrayList<Casilla> casillas) {
		this.casillas = casillas;
	}
}
