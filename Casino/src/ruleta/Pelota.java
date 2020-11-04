package ruleta;

import ventanas.VentanaRuleta;

public class Pelota implements Movible{
	Posicion posicion;
	
	
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
	
	
	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
}
