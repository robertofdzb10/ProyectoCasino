package ruleta;

import ventanas.VentanaRuleta; // para utilizar las medidas de la ventana

public class Pelota implements Movible{
	private int velocidad, aceleracion, velocidadMax;
	private Posicion posicion;
	
	/**CONSTRUCTOR PELOTA*/
	public Pelota() {
		this.velocidad = 0;
		this.aceleracion = 3;
		this.velocidadMax = 80;
	}
	/** Metodo para hacer que la pelota se mueva
	 * alrededor de la ruleta hasta caer en una casilla
	 */
	public void mover(){
		double x,y;
		double xOrigen = VentanaRuleta.ANCHO_VENTANA_RULETA/2;
		double yOrigen = VentanaRuleta.ALTO_VENTANA_RULETA/2;
		double angulo = 0;
		double radio = Ruleta.RADIO_RULETA + 20;
		double anguloCasillas = (2*Math.PI)/Ruleta.NUM_MAX_CASILLAS; 
		for(int i = 0; i<100;i++) {
			x = Math.cos(angulo)*(radio) + xOrigen;
			y = Math.sin(angulo)*(radio) + yOrigen;
			angulo += anguloCasillas;
			this.posicion = new Posicion(x,y);
		}
	}
	/**  @return la velocidad de la pelota
	 */
	public int getVelocidad() {
		return velocidad;
	}
	/** Establecer la velocidad a la pelota
	 * @param velocidad
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	/** @return la aceleracion de la pelota
	 */
	public int getAceleracion() {
		return aceleracion;
	}
	/** Establecer aceleracion de la pelota
	 * @param aceleracion
	 */
	public void setAceleracion(int aceleracion) {
		this.aceleracion = aceleracion;
	}
	/** Devuelve la velocidad maxima de la pelota
	 * @return la velocidad maxima 
	 */
	public int getVelocidadMax() {
		return velocidadMax;
	}
	/** Establecer velocidad maxima de pelota
	 * @param velocidadMax
	 */
	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	/** @return la posicion de la pelota
	 */
	public Posicion getPosicion() {
		return posicion;
	}
	/** Establecer la posicion de la pelota
	 * @param posicion
	 */
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
}
