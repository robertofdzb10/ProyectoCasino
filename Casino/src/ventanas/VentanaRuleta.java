package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

import ruleta.*;

/**
 * Ventana para la ruleta
 */
public class VentanaRuleta extends JFrame{
	public static final int ANCHO_VENTANA_RULETA = 1000;
	public static final int ALTO_VENTANA_RULETA = 700;
	
	private JFrame ventanaRuleta;
	private Pelota pelota;
	
	public VentanaRuleta(){
		
		pelota = new Pelota();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(ANCHO_VENTANA_RULETA, ALTO_VENTANA_RULETA); // Tamaño de la ventana
		setTitle("RULETA"); // Titulo de la ventana
		setLocationRelativeTo(null); // En el centro de la pantalla
		
		// PANELES
		JPanel panel = new JPanel();
		JPanel pBotones = new JPanel();
		getContentPane().add(panel, null);
		panel.setLayout(null);
		getContentPane().add(pBotones, BorderLayout.SOUTH);
		panel.setBackground(Color.darkGray);
		pBotones.setBackground(Color.GREEN);
		
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
		
		pBotones.add(bCobrar);
		pBotones.add(bRojo);
		pBotones.add(bNegro);
		pBotones.add(bIniciar);
		
	}
}
