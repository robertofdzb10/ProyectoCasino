package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

import ruleta.*;

/**
 * Ventana para la ruleta
 */
public class VentanaRuleta extends JFrame{
	public static final int ANCHO_VENTANA_RULETA = 1200;
	public static final int ALTO_VENTANA_RULETA = 1000;
	
	private JFrame ventanaRuleta;
	private Pelota pelota;
	
	BufferedImage imagenPelota;
	
	public VentanaRuleta(){
		
		pelota = new Pelota();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(ANCHO_VENTANA_RULETA, ALTO_VENTANA_RULETA); // Tamaño de la ventana
		setTitle("RULETA"); // Titulo de la ventana
		setLocationRelativeTo(null); // En el centro de la pantalla
		
		// PANELES - Panel principal y panel de botones
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
		cDinero.setText("0,0€");
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
		
		// Añadir imagen de la ruleta al panel principal
		ImageIcon iRuleta = new ImageIcon("ruleta.png");
		JLabel lRuleta = new JLabel(iRuleta);
		lRuleta.setBounds(300, 100, 541, 541);
		panel.add(lRuleta); 
		
		// Imagen de la pelota
		try {
			imagenPelota = ImageIO.read(new File("pelota.png"));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error grave contacta con desarrollador", "Error", JOptionPane.ERROR_MESSAGE);
		}
		JLabel picLabel = new JLabel(new ImageIcon(imagenPelota));
		picLabel.setBounds(300, 100, 100, 100);
		panel.add(picLabel);
		panel.repaint();
		repaint();
		
		Thread hiloMover = new Thread() {
			public void run() {
				picLabel.setLocation((int)pelota.getX(), (int)pelota.getY());
				try {
					Thread.sleep(5);
				}
				catch(InterruptedException e) {
					System.out.println("ERROR");
				}
			}
		};hiloMover.start();
		
		ActionListener oyenteMover = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pelota.mover();
			}
			
		};
		bIniciar.addActionListener(oyenteMover);
	}
}
