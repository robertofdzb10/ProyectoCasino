package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Menu para registrarse
 */

public class MenuRegistro extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static HashMap<String, String> mapa = new HashMap<String, String>();
	public String nick;

	

	
	
	public void registarse() {
		
		
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
		
		JLabel etiqueta2= new JLabel("REGISTRARSE");	
		etiqueta2.setSize(510, 80);
		etiqueta2.setLocation(255,90 );
		etiqueta2.setForeground(Color.BLUE);
		etiqueta2.setFont(new Font("arial",Font.BOLD, 32));
		panel.add(etiqueta2);
	
		
		JTextField caja = new JTextField();
		caja.setBounds(455, 265, 75, 30);
		caja.setText("Nick");
		panel.add(caja);
		
		JTextField caja2 = new JTextField();
		caja2.setBounds(455, 345, 75, 30);
		caja2.setText("Password");
		panel.add(caja2);
		
		
		final JButton boton1 = new JButton("COMPLETAR REGISTRO");
		boton1.setSize(190, 30);
		boton1.setLocation(455, 425);
		boton1.setBackground(Color.GRAY);
		ActionListener escuchador = new ActionListener() {
			
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Thread Hilo = new Thread() {
						public void run() {
							 nick = caja.getText();
							
							
						}
						
					};
					Hilo.start();
					
				
					
					
				
			}
		};
		boton1.addActionListener(escuchador);
		panel.add(boton1);
		
		m2.setVisible(true);
	}
	
	public void Ficheros(){
		BufferedReader br;
		try {
			File fichero = new File("C:\\\\Users\\\\jogru\\\\git\\\\Casino\\\\Casino\\\\mapa.txt");
			if (fichero.exists()) {
				br = new BufferedReader(new FileReader("C:\\Users\\jogru\\git\\Casino\\Casino\\mapa.txt"));
				String linea = br.readLine();
				
				String linea2 = br.readLine();
				
				while(linea != null & linea2 != null) {
					
					mapa.put(linea,linea2);
					
					linea = br.readLine();
					linea2 = br.readLine();
					
					
				}
			}
		}
			 catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			}
	
			
	public static void GuardarNick(String punt,String nick, HashMap<String, String> mapa){
		if (punt != null) {
			mapa.put(nick,punt);
			File fichero = new File("C:\\\\Users\\\\jogru\\\\git\\\\Casino\\\\Casino\\\\mapa.txt");
			if (fichero.exists()) {
				fichero.delete();
			}
			;
			for (Entry<String, String> entry : mapa.entrySet()) {
				try {
					BufferedWriter bw= new BufferedWriter(new FileWriter("C:\\Users\\jogru\\git\\Casino\\Casino\\mapa.txt",true));
					String key = entry.getKey();
				    String value = entry.getValue();
				    bw.write(key);
					bw.newLine();
					bw.write(value);
					bw.newLine();
					bw.flush();
					bw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		
	}
}