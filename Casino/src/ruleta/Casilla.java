package ruleta;

import java.awt.Color;

/**
 * Clase para la casilla que le corresponde a cada parte de la ruleta
 */
public class Casilla implements Iluminable{
	int numero;
	Color color;
	Posicion posicion;
	
	/** Metodo para añadir casillas rojas
	 * @param _numero de la casilla pertinente
	 * @return null si el numero no puede ser rojo
	 */
	public Casilla addCasillaRoja(int _numero) {
		int minParRojo = 12;
		int maxParRojo = 36;
		int minImparRojo = 1;
		int maxImparRojo = 8;
		// Si es par y se encuentra entre los pares que deben ser rojos
		if (_numero % 2 == 0 && _numero >= minParRojo && _numero <= maxParRojo) 
			return new Casilla(_numero, Color.RED, this.posicion);
		// Si es impar y se encuentra entre los impares que deben ser rojos
		if( _numero % 2 != 0 && _numero>=minImparRojo && _numero<=maxImparRojo)
			return new Casilla(_numero, Color.RED, this.posicion);
		else
			return null;
	}
	/** Para añadir casillas negras
	 * @param _numero de la casilla que se quiere añadir
	 * @return null si el numero no puede ser negro
	 */
	public Casilla addCasillaNegra(int _numero) {
		int minParNegro = 2;
		int maxParNegro = 10;
		int minImparNegro = 11;
		int maxImparNegro = 35;
		// Negros pares
		if (_numero % 2 == 0 && _numero >= minParNegro && _numero <= maxParNegro) 
			return new Casilla(_numero, Color.BLACK, this.posicion);
		// Negros impares
		if( _numero % 2 != 0 && _numero >= minImparNegro && _numero<=maxImparNegro)
			return new Casilla(_numero, Color.BLACK, this.posicion);
		else
			return null;
	}
	public Casilla(int numero, Color color, Posicion posicion) {
		this.numero = numero;
		this.color = color;
		this.posicion = new Posicion(0.0f,0.0f);
	}
	
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
