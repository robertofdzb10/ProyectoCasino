package tragaperras;


/**Calse ranura, las 3 ranuras de la máquina son objetos de la misma. De maenera que cada una puede tener diferentes aceleraciones y velocidades.
 */

public class Ranura {
	
	private int velocidad; //Velocidad a la cual se desplazará la ranua.
	private int aceleracion; //Aceleracion de la ranura.
	private int velocidadMax; //Velocidad Máxima que puede alcanzar la casilla.
	private String numRanura; //Indica el número de casilla creada (0, 1, 2).

	
	/**Crea una nueva ranura (NúmeroRanura , VelocidadMaxima, Aceleración)
	 */
	public Ranura( String ranura, int max , int aceleracion) {
	    this.velocidad = 0; //Velocidad de la ranura.
	    this.aceleracion = aceleracion; //La velocidad aumentará a este ritmo.
	    //this.intervalo = null; //holds setInterval object for the given slot
	    this.numRanura = ranura; //Número de casilla creada (0, 1, 2).
	    this.velocidadMax = max; //velocidad máxima que puede tener esta ranura.
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

	/**Devuleve la aceleración de la ranura.
	 */
	public int getAceleracion() {
		return aceleracion;
	}

	/**Cambia la aceleración de la ranura.
	 */
	public void setAceleracion(int aceleracion) {
		this.aceleracion = aceleracion;
	}

	/**Devuelve la velocidad máxima de la ranura.
	 */
	public int getVelocidadMax() {
		return velocidadMax;
	}

	/**Cambia la velocidad máxima de la ranura.
	 */
	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	/**Devuelve el número de la ranura.
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
	
	/**Encuentra la posición final de la ranura cuando se detiene.
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
