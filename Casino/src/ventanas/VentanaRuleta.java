package ventanas;

import java.awt.Color;
import java.util.*;

import javax.swing.*;

import ruleta.*;

/**
 * Ventana para la ruleta
 */
public class VentanaRuleta {
	private static final int ANCHO_VENTANA_RULETA = 1000;
	private static final int ALTO_VENTANA_RULETA = 700;
	
	// Main para hacer pruebas
	public static void main(String[] args) {
		VentanaRuleta v = new VentanaRuleta();;
	}
	
	private static JFrame vRuleta;
	public VentanaRuleta(){
		vRuleta = new JFrame();
		vRuleta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vRuleta.setSize(ANCHO_VENTANA_RULETA, ALTO_VENTANA_RULETA); // Tamaño de la ventana
		vRuleta.setTitle("RULETA"); // Titulo de la ventana
		vRuleta.setLocationRelativeTo(null); // En el centro de la pantalla
		vRuleta.setVisible(true); // Ventana visible = true
		
		JPanel panel = new JPanel();
		vRuleta.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.GREEN);
		
		// BOTONES
		final JButton bCobrar,bRojo,bNegro,bIniciar;
		bCobrar = new JButton("COBRAR");
		bRojo = new JButton("ROJO");
		bNegro = new JButton("NEGRO");
		bIniciar = new JButton("COMENZAR");
		bCobrar.setSize(130, 30);
		bRojo.setSize(130, 30);
		bNegro.setSize(130, 30);
		bIniciar.setSize(260,60);
		bCobrar.setLocation(30, 20);
		panel.add(bCobrar);
		
	}
}
