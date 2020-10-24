package ruleta;

import java.util.ArrayList;

public class Ruleta {
	private static final int NUM_MAX_CASILLAS = 37; // Casillas totales
	private static final int NUM_ROJOS = 18;  // Casillas negras
	private static final int NUM_NEGROS = 18; // Casillas rojas
	private static final int NUM_VERDES = 1;  // Casillas verdes
	ArrayList<Casilla> casillas;
	Pelota pelota;
	
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
