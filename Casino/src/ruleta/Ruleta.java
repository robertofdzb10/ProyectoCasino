package ruleta;

import java.util.ArrayList;

public class Ruleta {
	private static final int NUM_MAX_CASILLAS = 37; // Casillas totales
	private static final int NUM_ROJOS = 18;  // Casillas negras
	private static final int NUM_NEGROS = 18; // Casillas rojas
	private static final int NUM_VERDES = 1;  // Casillas verdes
	ArrayList<Casilla> casillas;
	Pelota pelota;
	
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
