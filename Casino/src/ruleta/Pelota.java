package ruleta;

import ventanas.VentanaRuleta; // para utilizar las medidas de la ventana

public class Pelota implements Movible{
	private int velocidad, aceleracion, velocidadMax;
	private double x;
	private double y;
	
	/**CONSTRUCTOR PELOTA*/
	public Pelota() {
	}
	/**	Metodo para hacer que la pelota se mueva
	 * alrededor de la ruleta hasta caer en una casilla
	 */
	public void mover() {
		Thread hilo = new Thread() {
			public void run() { 
				Pelota p = new Pelota();
				double x,y;
				double xOrigen = VentanaRuleta.ANCHO_VENTANA_RULETA/2;
				double yOrigen = VentanaRuleta.ALTO_VENTANA_RULETA/2;
				double radio = Ruleta.RADIO_RULETA + 60;
				double anguloCasillas = (2*Math.PI)/Ruleta.NUM_MAX_CASILLAS; 
				double angulo = 0;
				double limiteMovimiento = 10000;
				// Movimiento circular
				for(int i = 0; i<limiteMovimiento;i++) {
					x = Math.cos(angulo)*(radio) + xOrigen;
					y = Math.sin(angulo)*(radio) + yOrigen;
					angulo += anguloCasillas;
					p.setX(x);
					p.setY(y);
					
					// Al final del movimiento se va acercando a las casillas
					if(i >= (limiteMovimiento - 60)) {
						if(radio > Ruleta.RADIO_RULETA);
							radio--;
					}
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		hilo.start();
	}
	
	/** 
	 * @return la posicion de la pelota en el eje X
	 */
	public double getX() {
		return x;
	}
	/** Establecer posicion x
	 * @param x
	 */
	public void setX(Double x) {
		this.x = x;
	}
	/**
	 * @return la posicion de la pelota en el eje Y
	 */
	public double getY() {
		return y;
	}
	/** Establecer posicion y
	 * @param y
	 */
	public void setY(Double y) {
		this.y = y;
	}

}
