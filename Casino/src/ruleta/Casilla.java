package ruleta;

import java.awt.Color;

/**
 * Clase para la casilla que le corresponde a cada parte de la ruleta
 */
public class Casilla implements Iluminable{
	int numero;
	Color color;
	Posicion posicion;
	
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public Posicion getPosicion() {
		return posicion;
	}


	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}


	/** Metodo para iluminar la casilla donde ha caido la pelota
	 * ilumina la casilla con otro color. por ejemplo cyan
	 */
	public void iluminar() {
		color = Color.cyan;
	}
}
