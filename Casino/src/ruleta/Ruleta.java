package ruleta;

import java.awt.Color;
import java.util.ArrayList;
import ventanas.VentanaRuleta;

public class Ruleta {
	// Elementos estaticos
	private static final int NUM_MAX_CASILLAS = 37; // Casillas totales
	private static final int RADIO_RULETA = 300;
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
	public static void main(String[] args) {
		colocarCasillas();
	}
	/** Metodo para colocar las casillas 
	 * -- ESTABLECER POSICION --
	 */
	public static void colocarCasillas() {
		float x,y; // posicion a colocar
		float xOrigen = VentanaRuleta.ANCHO_VENTANA_RULETA/2; // 1000/2
		float yOrigen = VentanaRuleta.ALTO_VENTANA_RULETA/2;  // 700/2
		double anguloCasillas = (2*Math.PI)/NUM_MAX_CASILLAS; 
		double angulo = 0; // Angulo que va cambiando
		for(Casilla c: casillas) {
			x = (float)(Math.cos(angulo))*RADIO_RULETA + xOrigen;
			y = (float)(Math.sin(angulo))*RADIO_RULETA + yOrigen;
			angulo += anguloCasillas;
			c.setPosicion(new Posicion(x,y)); 
		}
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
	public Pelota getPelota() {
		return pelota;
	}
	public void setPelota(Pelota pelota) {
		this.pelota = pelota;
	}
}
