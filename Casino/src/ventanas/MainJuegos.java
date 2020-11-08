package ventanas;


/**Main encargado de lanzar las ventanas de los diferentes juegos.
 *
 */
public class MainJuegos {
	
	public static void main(String[] args) {
		
		VentanaRuleta ventanaRuleta = new VentanaRuleta();
		ventanaRuleta.setVisible(true);
		
		VentanaTragaperras ventanaTragaperras = new VentanaTragaperras();
		ventanaTragaperras.setVisible(false);
		MenuInicio m = new MenuInicio();
		m.setVisible(false);
		
	}
}
