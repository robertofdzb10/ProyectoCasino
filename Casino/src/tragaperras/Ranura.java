package tragaperras;

import java.util.ArrayList;

/**Calse ranura, las 3 ranuras de la máquina son objetos de la misma. De maenera que cada una puede tener diferentes aceleraciones y velocidades.
 */

public class Ranura {
	
	private int velocidad; //Velocidad a la cual se desplazará la ranua.
	private int aceleracion; //Aceleracion de la ranura.
	private int velocidadMax; //Velocidad Máxima que puede alcanzar la casilla.
	private String numRanura; //Indica el número de casilla creada (0, 1, 2).

	//Iconos que forman la ranura 
	
	public Icono naranja; //Icono de la naranaja.
	public Icono comodin; //Icono del comodín.
	public Icono bar; //Icono del BAR.
	public Icono pera; //Icono de la pera.
	public Icono platano; //Icono del platano.
	public Icono cereza; //Icono de la cereza.
	
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
	 * sTRING P
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
		if (ranura.getVelocidad() >= ranura.getVelocidadMax()) {
			Thread Hilo = new Thread() {
				public void run() {
					while ( ranura.getVelocidad() > 0) {
						if ((velocidad-(2*ranura.getAceleracion())) < 0){
							ranura.setVelocidad(0);
						} else { 
							ranura.setVelocidad(velocidad-(2*ranura.getAceleracion()));
						}
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							System.out.println("Error");;
						}
					}
				}
			};
			Hilo.start();
		}
	}
	
	/**Encuentra la psoción final de la ranura cuando se detiene.
	 */
	public void PosicionFinal() {
		Icono iconoFinal = devuelveIconoAleatorio();
	}

	/**Devuelve un Icono al azar, dependeindo de las probabilidades.
	 */
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
	
	/**Inicia el movimiento de la ranura.
	 */
	public void Movimiento( Ranura ranura ) {
		Thread Hilo = new Thread() {
			public void run() {
				while ( ranura.getVelocidad() < ranura.velocidadMax) {
					ranura.setVelocidad( ranura.getVelocidad() + ranura.aceleracion);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("Error");;
					}
				}
			}
		};
		Hilo.start();
	}


}
