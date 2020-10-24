package ventanas;

import java.util.*;

import javax.swing.*;

import ruleta.*;

/**
 * Ventana para la ruleta
 */
public class VentanaRuleta {
	private static final int ANCHO_VENTANA_RULETA = 600;
	private static final int ALTO_VENTANA_RULETA = 400;

	private static JFrame vRuleta;
	public VentanaRuleta(){
		vRuleta = new JFrame();
		vRuleta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		vRuleta.setSize(ANCHO_VENTANA_RULETA, ALTO_VENTANA_RULETA);
		vRuleta.setTitle("Ruleta");
	}
}
