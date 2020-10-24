package ruleta;

import java.awt.Color;
import java.util.ArrayList;

public class Ruleta {
//	private static final int NUM_ROJOS = 18;  // Casillas negras
//	private static final int NUM_NEGROS = 18; // Casillas rojas
//	private static final int NUM_VERDES = 1;  // Casillas verdes
	private static final int NUM_MAX_CASILLAS = 37; // Casillas totales
	private static final int RADIO_RULETA = 400;
	private static ArrayList<Casilla> casillas;
	private static Pelota pelota;
	
	
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
	}
	/** Metodo para colocar las casillas 
	 * -- ESTABLECER POSICION --
	 */
	public void colocarCasillas() {
		float x,y;
		double distanciaCasillas = (2*Math.PI*RADIO_RULETA)/NUM_MAX_CASILLAS;
		double anguloCasillas = 360/distanciaCasillas;
		for(Casilla c: casillas) {
			x = (float)(Math.cos(anguloCasillas)) + RADIO_RULETA;
			y = (float)(Math.sin(anguloCasillas)) + RADIO_RULETA;
			c.setPosicion(new Posicion(x,y));
		}
	}
	/** Metodo para añadir casillas al arraylist de las casillas, siendo NUM_MAX_CASILLAS el limite
	 * @param casilla para añadir al arraylist
	 * @return false si el ArrayList está lleno
	 */
	public boolean addCasilla(Casilla casilla) {
		if(casillas.size() < NUM_MAX_CASILLAS) 
			return casillas.add(casilla);
		else
			return false;
	}
	
	public ArrayList<Casilla> getCasillas() {
		return casillas;
	}
	public void setCasillas(ArrayList<Casilla> casillas) {
		this.casillas = casillas;
	}
	public Pelota getPelota() {
		return pelota;
	}
	public void setPelota(Pelota pelota) {
		this.pelota = pelota;
	}
}
