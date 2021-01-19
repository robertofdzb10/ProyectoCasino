package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import BD.BaseDeDatos;

/**
 * Menu principal con los juegos a elegir y un boton para acceder al perfil y al historial(solo administradores).
 */
public class MenuJuegos extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ArrayList<String> vip = new ArrayList<String>();
	
	public  void juegos(String nick,HashMap<String, Float> mapaDinero){
	
	
	MenuJuegos m2 = new MenuJuegos();
	m2.setSize(900, 900);
	JPanel panel = new JPanel();
	m2.getContentPane().add(panel);
	panel.setLayout(null);
	panel.setBackground(Color.BLACK);
	JLabel etiqueta = new JLabel("EL GRAN CASINO");	
	etiqueta.setSize(450, 40);
	etiqueta.setLocation(250,10 );
	etiqueta.setForeground(Color.RED);
	etiqueta.setFont(new Font("arial",Font.BOLD, 45));
	panel.add(etiqueta);
	
	ImageIcon imagen2 = new ImageIcon("5.jpg");
	JLabel etiqueta2 = new JLabel(imagen2);
	etiqueta2.setSize(450, 600);
	etiqueta2.setLocation(450,0);
	panel.add(etiqueta2);
	
	ImageIcon imagen3 = new ImageIcon("6.jpg");
	JLabel etiqueta4 = new JLabel(imagen3);
	etiqueta4.setSize(450, 600);
	etiqueta4.setLocation(225,350);
	panel.add(etiqueta4);
	
	ImageIcon imagen1 = new ImageIcon("4.jpg");
	JLabel etiqueta3 = new JLabel(imagen1);
	etiqueta3.setSize(450, 600);
	etiqueta3.setLocation(0,0);
	panel.add(etiqueta3);
	
	final JButton boton1 = new JButton("HISTORIAL");
	boton1.setSize(110, 30);
	boton1.setLocation(790,0);
	boton1.setBackground(Color.GRAY);
	ActionListener escuchador = new ActionListener() {
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread Hilo = new Thread() {
					public void run() {
						
						
						try {
							historial(nick);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				};
				Hilo.start();
				
			
				
				
			
		}
	};
	boton1.addActionListener(escuchador);
	panel.add(boton1);
	
	final JButton boton2 = new JButton("PERFIL");
	boton2.setSize(100, 30);
	boton2.setLocation(0,0);
	boton2.setBackground(Color.GRAY);
	ActionListener escuchador2 = new ActionListener() {
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread Hilo = new Thread() {
					public void run() {
						
						
						try {
							perfil(nick);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				};
				Hilo.start();
				
			
				
				
			
		}
	};
	boton2.addActionListener(escuchador2);
	panel.add(boton2);
	
	final JButton boton3 = new JButton("RULETA");
	boton3.setSize(110, 30);
	boton3.setLocation(0, 485);
	boton3.setBackground(Color.GRAY);
	ActionListener escuchador3 = new ActionListener() {
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread Hilo = new Thread() {
					public void run() {
						
						
						
					}
					
				};
				Hilo.start();
				
			
				
				
			
		}
	};
	boton3.addActionListener(escuchador3);
	panel.add(boton3);
	
	final JButton boton4 = new JButton("TRAGAPERRAS");
	boton4.setSize(125, 30);
	boton4.setLocation(770, 485);
	boton4.setBackground(Color.GRAY);
	ActionListener escuchador4 = new ActionListener() {
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread Hilo = new Thread() {
					public void run() {
						
						VentanaTragaperras v = new VentanaTragaperras();
						v.setVisible(true);
						
					}
					
				};
				Hilo.start();
				
			
				
				
			
		}
	};
	boton4.addActionListener(escuchador4);
	panel.add(boton4);
	
	final JButton boton5 = new JButton("APUESTAS");
	boton5.setSize(175, 30);
	boton5.setLocation(380, 825);
	//boton5.setLocation(770,465);
	boton5.setBackground(Color.GRAY);
	ActionListener escuchador5 = new ActionListener() {
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread Hilo = new Thread() {
					public void run() {
					
						VentanaApuesta v = new VentanaApuesta();
						v.ventana(nick,mapaDinero);
						
					}
					
				};
				Hilo.start();
				
			
				
				
			
		}
	};
	boton5.addActionListener(escuchador5);
	panel.add(boton5);
	
	m2.setVisible(true);
	
	}

	
	public void historial(String nick) throws SQLException {
		boolean ok = false;
		for(int i = 0;i < vip.size(); i++) {
			if(nick.equals(vip.get(i))) {
				ok = true;
			}
		}
		
		if(ok == true) {
			BaseDeDatos bd = new BaseDeDatos();
			Statement st = (Statement) bd.establecerConexion().createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery("SELECT * FROM APUESTAS");
			while(rs.next()) {
			System.out.println("USUARIO: " + rs.getString("APUESTA"));
			}
			bd.cerrarConexion();
		}
		
	}
	
	public void perfil(String nick) throws SQLException {
		BaseDeDatos bd = new BaseDeDatos();
		Statement st = (Statement) bd.establecerConexion().createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery("SELECT * FROM APUESTAS WHERE USUARIO = '"+nick+"'");
		while(rs.next()) {
		System.out.println("USUARIO: " + rs.getString("APUESTA"));
		}
		bd.cerrarConexion();
	}
	
}
