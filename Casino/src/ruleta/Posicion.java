package ruleta;

public class Posicion {
	double x,y;
	
	/** CONSTRUCTOR de la posicion dando sus dos atributos
	 * @param x
	 * @param y
	 */
	public Posicion(double x, double y) {
		this.x = x;
		this.y = y;
	}
	/**@return posicion en el eje X 
	 */
	public double getX() {
		return x;
	}
	/** Establece posicion eje X
	 * @param x
	 */
	public void setX(float x) {
		this.x = x;
	}
	/** @return la posicion en el eje Y
	 */
	public double getY() {
		return y;
	}
	/** Establecer la posicion en el eje Y
	 * @param y
	 */
	public void setY(float y) {
		this.y = y;
	}
	/** Metodo to string de la posicion
	 * devuelve la informacion de la posicion
	 */
	@Override
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}
	
}
