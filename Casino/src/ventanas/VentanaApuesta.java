package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import apuestas.Carreras;
import apuestas.Deportes;

public class VentanaApuesta extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void ventana(String nick,HashMap<String, Float> mapaDinero) {
		VentanaApuesta v = new VentanaApuesta();
		v.setSize(900, 900);
		JPanel panel = new JPanel();
		v.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		
		JLabel etiqueta = new JLabel("APUESTAS");	
		etiqueta.setSize(450, 40);
		etiqueta.setLocation(250,10 );
		etiqueta.setForeground(Color.RED);
		etiqueta.setForeground(Color.GREEN);
		etiqueta.setFont(new Font("arial",Font.BOLD, 45));
		panel.add(etiqueta);

		
		ImageIcon imagen1 = new ImageIcon("deportes.jpg");
		JLabel etiqueta3 = new JLabel(imagen1);
		etiqueta3.setSize(450, 227);
		etiqueta3.setLocation(50,140);
		panel.add(etiqueta3);
		
		ImageIcon imagen3 = new ImageIcon("deportes2.jpeg");
		JLabel etiqueta5 = new JLabel(imagen3);
		etiqueta5.setSize(608, 342);
		etiqueta5.setLocation(50,475);
		panel.add(etiqueta5);
		
		ImageIcon imagen2 = new ImageIcon("carreras.png");
		JLabel etiqueta4 = new JLabel(imagen2);
		etiqueta4.setSize(300, 300);
		etiqueta4.setLocation(520,120);
		panel.add(etiqueta4);
		
		final JButton boton1 = new JButton("APUESTAS DEPORTIVAS");
		boton1.setSize(215, 30);
		boton1.setLocation(135, 440);
		boton1.setBackground(Color.GRAY);
		boton1.setForeground(Color.BLUE);
		ActionListener escuchador = new ActionListener() {
			
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Thread Hilo = new Thread() {
						public void run() {

							Deportes d = new Deportes();
							d.ventana(nick,mapaDinero);
							
							
						}
						
					};
					Hilo.start();
					
				
					
					
				
			}
		};
		boton1.addActionListener(escuchador);
		panel.add(boton1);
		
		final JButton boton2 = new JButton("APUESTAS DE CARRERAS");
		boton2.setSize(215, 30);
		boton2.setLocation(425, 440);
		boton2.setBackground(Color.GRAY);
		boton2.setForeground(Color.BLUE);
		ActionListener escuchador2 = new ActionListener() {
			
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Thread Hilo = new Thread() {
						public void run() {

							
							Carreras c = new Carreras();
							c.ventana(nick,mapaDinero);
							
						}
						
					};
					Hilo.start();
					
				
					
					
				
			}
		};
		boton2.addActionListener(escuchador2);
		panel.add(boton2);
		
		
		v.setVisible(true);
	}

	
	
}
