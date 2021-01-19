package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Menu para iniciar sesión 
 */
public class MenuLogin extends JFrame{

	

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void iniciarSesion(HashMap<String, String> mapa,HashMap<String, Float> mapaDinero) {
		
		
		MenuLogin m2 = new MenuLogin();
		m2.setSize(700, 700);
		JPanel panel = new JPanel();
		m2.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		JLabel etiqueta = new JLabel("EL GRAN CASINO");	
		etiqueta.setSize(450, 40);
		etiqueta.setLocation(125,10 );
		etiqueta.setForeground(Color.RED);
		etiqueta.setFont(new Font("arial",Font.BOLD, 45));
		panel.add(etiqueta);
		
		JLabel etiqueta2= new JLabel("INICIAR SESIÓN");	
		etiqueta2.setSize(510, 80);
		etiqueta2.setLocation(255,90 );
		etiqueta2.setForeground(Color.BLUE);
		etiqueta2.setFont(new Font("arial",Font.BOLD, 32));
		panel.add(etiqueta2);
		
		ImageIcon imagen1 = new ImageIcon("3.jpg");
		JLabel etiqueta3 = new JLabel(imagen1);
		etiqueta3.setSize(500, 600);
		etiqueta3.setLocation(0,100);
		panel.add(etiqueta3);
		
		JTextField caja = new JTextField();
		caja.setBounds(530, 265, 75, 30);
		caja.setText("Nick");
		panel.add(caja);
		
		JTextField caja2 = new JTextField();
		caja2.setBounds(530, 345, 75, 30);
		caja2.setText("Password");
		panel.add(caja2);
	
		
		final JButton boton1 = new JButton("COMPLETAR LOGIN");
		boton1.setSize(175, 30);
		boton1.setLocation(503, 425);
		boton1.setBackground(Color.GRAY);
		ActionListener escuchador = new ActionListener() {
			
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Thread Hilo = new Thread() {
						public void run() {
							boolean existe = false;
							existe = Ficheros(caja.getText(),caja2.getText(),mapa,existe);
							if(existe == true) {
								MenuJuegos m = new MenuJuegos();
								m.juegos(caja.getText(),mapaDinero);
							}
							
							
						}
						
					};
					Hilo.start();
					
				
					
					
				
			}
		};
		boton1.addActionListener(escuchador);
		panel.add(boton1);
		

		
		m2.setVisible(true);
	}
	
	public boolean Ficheros(String nick, String contraseña,HashMap<String, String> mapa,boolean existe){
		BufferedReader br;
		try {
			File fichero = new File("C:\\Users\\Anartz\\git\\ProyectoCasino\\Casino\\mapa.txt");
			if (fichero.exists()) {
				br = new BufferedReader(new FileReader("C:\\Users\\Anartz\\git\\ProyectoCasino\\Casino\\mapa.txt"));
				String linea = br.readLine();
				
				String linea2 = br.readLine();
				
				while(linea != null & linea2 != null) {
					mapa.put(linea,linea2);
					linea = br.readLine();
					linea2 = br.readLine();
					
					
				}
			}
			if(mapa.get(nick).equals(contraseña)) {
				existe = true;
			}
			else {
				System.out.println("Introduzca un nick válido con su respectiva contraseña o registrese.");
			}
			
		}
			 catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		return existe;
			
			}
	
			
}
