package ventanas;

import javax.swing.JFrame;

/**Main encargado de lanzar las ventanas de los diferentes juegos.
 *
 */
public class MainJuegos {
	
	public static void main(String[] args) {
		
		VentanaTragaperras ventanaTragaperras = new VentanaTragaperras();
		ventanaTragaperras.setVisible(true);
		MenuInicio m = new MenuInicio();
		m.setVisible(true);
	}
}
