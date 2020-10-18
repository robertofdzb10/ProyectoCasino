package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ventanas.VentanaGrafica;



/**
 * Menu que aparece antes de la principal para que el usuario entre con su username
 */
public class MenuLogin extends JFrame{
	
	private String nick;
	public MenuLogin() {
		portada();
	}


public void portada() {
		
		this.setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("EL GRAN CASINO ");
		setLocationRelativeTo(null);
		
		
		JPanel panel = new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(null);
	//	panel.setBackground(Color.BLACK);
		
		
		JLabel etiqueta = new JLabel("EL GRAN CASINO");	
		etiqueta.setSize(450, 60);
		etiqueta.setLocation(140,0 );
		etiqueta.setForeground(Color.RED);
		etiqueta.setFont(new Font("arial",Font.BOLD, 45));
		panel.add(etiqueta);
		
		ImageIcon imagen1 = new ImageIcon("2.png");
		JLabel etiqueta2 = new JLabel(imagen1);
		etiqueta2.setSize(450, 600);
		etiqueta2.setLocation(0, 55);
		panel.add(etiqueta2);
		
		ImageIcon imagen2 = new ImageIcon("1.png");
		JLabel etiqueta3 = new JLabel(imagen2);
		etiqueta3.setSize(300, 250);
		etiqueta3.setLocation(405,305);
		panel.add(etiqueta3);
		

		
		
		
		
		final JButton boton1 = new JButton("Iniciar sesión");
		boton1.setSize(120, 30);
		boton1.setLocation(455, 180);
		ActionListener escuchador = new ActionListener() {
			
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Thread Hilo = new Thread() {
						public void run() {
							
							
						
							
						}
						
					};
					Hilo.start();
					
				
					
					
				
			}
		};
		boton1.addActionListener(escuchador);
		panel.add(boton1);
		
		final JButton boton2 = new JButton("Registrarse");
		boton2.setSize(120, 30);
		boton2.setLocation(455, 220);
		ActionListener escuchador2 = new ActionListener() {
			
			

				@Override
				public void actionPerformed(ActionEvent e) {
					 
					 
					 
					
					
				
					
					 
					
					
					
					Thread Hilo = new Thread() {
						public void run() {
						
						}
						
					};
					Hilo.start();
				
				
			}

		

				
		};
		boton2.addActionListener(escuchador2);
		panel.add(boton2);
		
		
		
	
		
		
		
		
		
		
	
	}
}
