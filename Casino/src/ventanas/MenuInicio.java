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




/**
 * Menu que aparece antes de la principal para que el usuario escoja entre iniciar sesi√≥n o registrarse.
 */
public class MenuInicio extends JFrame{
	
	
	/**
	 * 
	 */
	public static HashMap<String, String> mapa = new HashMap<String, String>();
	private static final long serialVersionUID = 1L;


	public MenuInicio() {
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
		panel.setBackground(Color.BLACK);
		
		
		JLabel etiqueta = new JLabel("EL GRAN CASINO");	
		etiqueta.setSize(450, 40);
		etiqueta.setLocation(125,10 );
		etiqueta.setForeground(Color.RED);
		etiqueta.setFont(new Font("arial",Font.BOLD, 45));
		panel.add(etiqueta);
		
		ImageIcon imagen1 = new ImageIcon("1.jpg");
		JLabel etiqueta2 = new JLabel(imagen1);
		etiqueta2.setSize(700, 600);
		etiqueta2.setLocation(0, 30);
		panel.add(etiqueta2);
		
		
		final JButton boton1 = new JButton("INICIAR SESI”N");
		boton1.setSize(130, 30);
		boton1.setLocation(135, 615);
		boton1.setBackground(Color.GRAY);
		ActionListener escuchador = new ActionListener() {
			
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Thread Hilo = new Thread() {
						public void run() {
							MenuLogin m2 = new MenuLogin();
							m2.iniciarSesion(mapa);
							
							
						}
						
					};
					Hilo.start();
					
				
					
					
				
			}
		};
		boton1.addActionListener(escuchador);
		panel.add(boton1);
		
		final JButton boton2 = new JButton("REGISTRARSE");
		boton2.setSize(130, 30);
		boton2.setLocation(425, 615);
		boton2.setBackground(Color.GRAY);
		ActionListener escuchador2 = new ActionListener() {
			
			

				@Override
				public void actionPerformed(ActionEvent e) {
					 
					 
					 
					MenuRegistro m3 = new MenuRegistro();
					m3.registarse(mapa);
					
				
					
					 
					
					
					
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
