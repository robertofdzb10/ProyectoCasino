package tragaperras;

import java.util.ArrayList;
import java.util.Random;

/**Clase responsable de la creación de nuevos Iconos, que forman la ranura.
 */

public class Icono {

	private int probabilidad; //Probabilidad de que esa figura sea elegida (sobre 100).
	private String icono; //Indica el nombre del icono
	
	//Iconos que forman la ranura 
	
	public Icono naranja; //Icono de la naranaja.
	public Icono comodin; //Icono del comodín.
	public Icono bar; //Icono del BAR.
	public Icono pera; //Icono de la pera.
	public Icono platano; //Icono del platano.
	public Icono cereza; //Icono de la cereza.
	
	/**Crea una nueva Figura (NombreIcono , Probabilidad)
	 */
	public Icono( String icono, int probabilidad) {
	    this.probabilidad = probabilidad; //Probabilidad de que ese icono sea elegida (sobre 100).
	    this.icono = icono; //Indica el nombre del icono
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
	public static void main(String[] args) {
		;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}
	public void Imagen() {
		//TODO
	}
	
	public Icono devuelveIconoAleatorio(){
	    ArrayList<Icono> arrayIconos = new ArrayList<Icono>();
		naranja = new Icono("Naranja", 20); //Probabilidad de 0 a 20.
	    arrayIconos.add(naranja);
		comodin = new Icono("Comodín", 35); //Probabilidad de 20 en adelante a 35.
	    arrayIconos.add(comodin);
		bar = new Icono("Bar", 40); //Probabilidad de 35 en adelante a 40.
	    arrayIconos.add(bar);
		pera = new Icono("Pera", 60); //Probabilidad de 40 en adelante a 60.
	    arrayIconos.add(pera);
		platano = new Icono("Platano", 80); //Probabilidad de 60 en adelante a 80.
	    arrayIconos.add(platano);
		cereza = new Icono("Cereza", 100); //Probabilidad de 80 en adelante a 100.
	    arrayIconos.add(cereza);
	    int numAleatorio = (int)(Math.random() * 100);
	    int i = 0;
	    Icono returnIcono = null;
	    while( i < arrayIconos.size() ) { //Mientras que 
	    	if (numAleatorio <= (arrayIconos.get(i).getProbabilidad())) {
	    		returnIcono = arrayIconos.get(i);
	    		break;
	    	}
	    	i++;
	    }
	    return returnIcono;

	}
	@Override
	public boolean equals(Object obj) { //Mismo nombre
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
