package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

	public void iniciarSesion() {
		
		
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
	
		
		final JButton boton1 = new JButton("COMPLETAR LOGIN");
		boton1.setSize(190, 30);
		boton1.setLocation(455, 425);
		boton1.setBackground(Color.GRAY);
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
		
		JTextField caja = new JTextField();
		caja.setBounds(455, 265, 75, 30);
		caja.setText("Nick");
		panel.add(caja);
		
		JTextField caja2 = new JTextField();
		caja2.setBounds(455, 345, 75, 30);
		caja2.setText("Password");
		panel.add(caja2);
		
		m2.setVisible(true);
	}
}
