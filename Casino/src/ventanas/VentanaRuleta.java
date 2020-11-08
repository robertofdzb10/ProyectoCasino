package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

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
		JPanel pBotones = new JPanel(new FlowLayout(FlowLayout.LEFT));
		getContentPane().add(panel, null);
		panel.setLayout(null);
		getContentPane().add(pBotones, BorderLayout.SOUTH);
		panel.setBackground(new Color(5, 104, 54)); // Verde medio oscuro
		pBotones.setBackground(new Color(6,43,22)); // Verde mas oscuro
		
		// Dinero o fichas
		JLabel dinero = new JLabel("Dinero:");
		dinero.setSize(100,100);
		dinero.setForeground(Color.WHITE);
		pBotones.add(dinero);
		JTextField cDinero = new JTextField(7); // cajetin donde pondrá el dinero disponible
		cDinero.setEditable(false);
		pBotones.add(cDinero);
		
		// BOTONES
		try {
			UIManager.setLookAndFeel(new MetalLookAndFeel());
		}	
		catch(Exception e) {}
		
		final JButton bCobrar,bRojo,bNegro,bIniciar;
		bCobrar = new JButton("COBRAR");
		bRojo = new JButton("ROJO");
		bNegro = new JButton("NEGRO");
		bIniciar = new JButton("COMENZAR");
		
		bRojo.setSize(130, 30);
		bRojo.setOpaque(true);
		bRojo.setBackground(Color.red);
		bRojo.setForeground(Color.WHITE);
		bNegro.setSize(130, 30);
		bNegro.setOpaque(true);
		bNegro.setBackground(Color.BLACK);
		bNegro.setForeground(Color.WHITE);
		bCobrar.setSize(130, 30);
		bIniciar.setSize(260,60);
		pBotones.add(bIniciar);
		pBotones.add(bCobrar);
		pBotones.add(bRojo);
		pBotones.add(bNegro);
		
		
	}
}
