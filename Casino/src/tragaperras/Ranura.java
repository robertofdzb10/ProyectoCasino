package tragaperras;


/**Calse ranura, las 3 ranuras de la m�quina son objetos de la misma. De maenera que cada una puede tener diferentes aceleraciones y velocidades.
 */

public class Ranura {
	
	private int velocidad; //Velocidad a la cual se desplazar� la ranua.
	private int aceleracion; //Aceleracion de la ranura.
	private int velocidadMax; //Velocidad M�xima que puede alcanzar la casilla.
	private String numRanura; //Indica el n�mero de casilla creada (0, 1, 2).

	
	/**Crea una nueva ranura (N�meroRanura , VelocidadMaxima, Aceleraci�n)
	 */
	public Ranura( String ranura, int max , int aceleracion) {
	    this.velocidad = 0; //Velocidad de la ranura.
	    this.aceleracion = aceleracion; //La velocidad aumentar� a este ritmo.
	    //this.intervalo = null; //holds setInterval object for the given slot
	    this.numRanura = ranura; //N�mero de casilla creada (0, 1, 2).
	    this.velocidadMax = max; //velocidad m�xima que puede tener esta ranura.
	}
	
	/**Devuleve la velocidad de la ranura.
	 */
	public int getVelocidad() {
		return velocidad;
	}

	
	/**Cambia la velocidad de la ranura.
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	/**Devuleve la aceleraci�n de la ranura.
	 */
	public int getAceleracion() {
		return aceleracion;
	}

	/**Cambia la aceleraci�n de la ranura.
	 */
	public void setAceleracion(int aceleracion) {
		this.aceleracion = aceleracion;
	}

	/**Devuelve la velocidad m�xima de la ranura.
	 */
	public int getVelocidadMax() {
		return velocidadMax;
	}

	/**Cambia la velocidad m�xima de la ranura.
	 */
	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	/**Devuelve el n�mero de la ranura.
	 */
	public String getNumRanura() {
		return numRanura;
	}
	
	/**Comienza el movimiento de una ranura.
	 */
	public void Start( Ranura ranura) {
		Movimiento( ranura );
	}
	
	/**Detiene el movimiento de una ranura.
	 */
	public void Stop( Ranura ranura) {
		if (ranura.getVelocidad() == ranura.getVelocidadMax()) {
			ranura.setVelocidad(velocidad-(2*ranura.getAceleracion()));
		}
	}
	
	/**Encuentra la posici�n final de la ranura cuando se detiene.
	 */
	public void PosicionFina() {
		//TODO
	}

	
	/**Inicia el movimiento de la ranura.
	 */
	public void Movimiento( Ranura ranura ) {
		while ( ranura.getVelocidad() < ranura.velocidadMax) {
			 ranura.setVelocidad( ranura.getVelocidad() + ranura.aceleracion);
		}
	}

}
