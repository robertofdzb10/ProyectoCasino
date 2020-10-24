package tragaperras;

/**Clase responsable de la creación de nuevos Iconos, que forman la ranura.
 */

public class Icono {

	private double probabilidad; //Probabilidad de que esa figura sea elegida (sobre 100).
	
	/**Crea una nueva Figura (NombreIcono , Probabilidad)
	 */
	public Icono( String icono, double probabilidad) {
	    this.probabilidad = probabilidad; //Probabilidad de que ese icono sea elegida (sobre 100).
	}

	/**Devuleve la probabilidad de el icono.
	 */
	public double getProbabilidad() {
		return probabilidad;
	}

	/**Cambia la probabilidad del icono.
	 */
	public void setProbabilidad(double probabilidad) {
		this.probabilidad = probabilidad;
	}
	
}
