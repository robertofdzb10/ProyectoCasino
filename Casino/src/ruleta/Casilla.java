package ruleta;

import java.awt.Color;

import ventanas.VentanaRuleta;

/**
 * Clase para la casilla que le corresponde a cada parte de la ruleta
 */
public class Casilla implements Iluminable{
	int numero;
	Color color;
	Posicion posicion;
	// Constructor vacío
	public Casilla() {}
	/** Constructor Casilla con todos sus atributos	 */
	public Casilla(int numero, Color color, Posicion posicion) {
		this.numero = numero;
		this.color = color;
		this.posicion = new Posicion(0.0f,0.0f);
	}
	/** Metodo para añadir casillas rojas
	 * @param _numero de la casilla pertinente
	 * @return null si el numero no puede ser rojo
	 */
	public Casilla addCasillaRoja(int _numero) {
		// Rangos de casillas rojas
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
		return null;
	}
	/** Para añadir casillas negras
	 * @param _numero de la casilla que se quiere añadir
	 * @return null si el numero no puede ser negro
	 */
	public Casilla addCasillaNegra(int _numero) {
		// Rangos de casillas negras
		int minParNegro = 2;
		int maxParNegro = 10;
		int minImparNegro = 11;
		int maxImparNegro = 35;	
		// Negros pares
		if (_numero % 2 == 0 && _numero >= minParNegro && _numero <= maxParNegro) 
			return new Casilla(_numero, Color.BLACK, this.posicion);	
		// Negros impares
		if( _numero % 2 != 0 && _numero >= minImparNegro && _numero <= maxImparNegro)
			return new Casilla(_numero, Color.BLACK, this.posicion);
		else
			return null;
	}
	/** Metodo para colocar las casillas 
	 * -- ESTABLECER POSICION --
	 */
	public void colocarCasillas() {
		double x,y; // posicion a colocar
		double xOrigen = VentanaRuleta.ANCHO_VENTANA_RULETA/2; // 1000/2
		double yOrigen = VentanaRuleta.ALTO_VENTANA_RULETA/2;  // 700/2
		double anguloCasillas = (2*Math.PI)/Ruleta.NUM_MAX_CASILLAS; 
		double angulo = 0; // Angulo que va cambiando
		for(Casilla c: Ruleta.casillas) {
			x = Math.cos(angulo)*Ruleta.RADIO_RULETA + xOrigen;
			y = Math.sin(angulo)*Ruleta.RADIO_RULETA + yOrigen;
			angulo += anguloCasillas;
			c.setPosicion(new Posicion(x,y)); 
		}
	}	
	
	/** Metodo para iluminar la casilla donde ha caido la pelota
	 * ilumina la casilla con otro color. por ejemplo cyan
	 */
	public void iluminar() {
		color = Color.cyan;
	}
	/** @return numero de casilla
	 */
	public int getNumero() {
		return numero;
	}
	/** Establecer numero a nueva casilla
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/** @return el color de la casilla
	 */
	public Color getColor() {
		return color;
	}
	/** Establecer color de casilla
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/** @return posicion de la casilla
	 */
	public Posicion getPosicion() {
		return posicion;
	}
	/** Establecer posicion de casilla
	 * @param posicion
	 */
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
}
