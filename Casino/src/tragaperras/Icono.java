package tragaperras;

import java.util.ArrayList;
import java.util.Random;

/**Clase responsable de la creación de nuevos Iconos, que forman la ranura.
 */

public class Icono {

	private int probabilidad; //Probabilidad de que esa figura sea elegida (sobre 100).
	private String nombre; //Indica el nombre del icono
	
	/**Crea una nueva Figura (NombreIcono , Probabilidad)
	 */
	public Icono( String nombre, int probabilidad) {
	    this.probabilidad = probabilidad; //Probabilidad de que ese icono sea elegida (sobre 100).
	    this.nombre = nombre; //Indica el nombre del icono
	}

	/**Devuleve la probabilidad de el icono.
	 */
	public double getProbabilidad() {
		return probabilidad;
	}

	/**Cambia la probabilidad del icono.
	 */
	public void setProbabilidad(int probabilidad) {
		this.probabilidad = probabilidad;
	}

	/**Devuleve el nombre del icono.
	 */
	public String getNombre() {
		return nombre;
	}

	/**Cambia el nombre del icono.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**imagen del icono.
	 */
	public void Imagen() {
		//TODO
	}
	

	@Override
	public boolean equals(Object obj) { //Mismo nombre
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
