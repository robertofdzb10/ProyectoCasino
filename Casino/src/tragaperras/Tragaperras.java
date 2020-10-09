package tragaperras;

/**Clase padre del juego Tragaperras.
 */

public class Tragaperras {

	protected int casillaX; //Ubicaci�n de la casilla en el eje X .
	protected int casillaY; //Ubicaci�n de la casilla en el eje Y.
	protected int velocidadY; //Velocidad a la cual se desplazan las casillas en las columnas de la tragaperras.
	

	/**Devuelve la posici�n en el eje X de la casilla.
	 */
	public int getCasillaX() {
		return casillaX;
	}
	
	/**Cambia la posici�n del eje X de la casilla.
	 */
	public void setCasillaX(int casillaX) {
		this.casillaX = casillaX;
	}
	
	/**Devuelve la posici�n en el eje Y de la casilla.
	 */
	public int getCasillaY() {
		return casillaY;
	}
	
	/**Cambia la posici�n del eje Y de la casilla.
	 */
	public void setCasillaY(int casillaY) {
		this.casillaY = casillaY;
	}
	
	/**Devuelve la velocidad a la cual se desplaza la casilla en el eje Y.
	 */
	public int getVelocidadY() {
		return velocidadY;
	}
	
	/**Cambia la velocidad a la cual se desplaza la casilla en el eje Y.
	 */
	public void setVelocidadY(int velocidadY) {
		this.velocidadY = velocidadY;
	}
	 
}
