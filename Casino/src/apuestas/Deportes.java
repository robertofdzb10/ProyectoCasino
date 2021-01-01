package apuestas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import ventanas.MenuJuegos;

/**
 * Deportes un tipo de apuesta donde habra multiples posibilidades de apuesta
 */
public class Deportes extends JFrame implements Apuestas {
	ArrayList<String []> partidos = new ArrayList<String []>();

public void apuestasPosibles() {

	

}

public void ventana() {
	
	
	Deportes d = new Deportes();
	d.setSize(900, 900);
	JPanel panel = new JPanel();
	d.getContentPane().add(panel);
	panel.setLayout(null);
	panel.setBackground(Color.BLACK);
	JLabel etiqueta = new JLabel("APUESTAS DEPORTIVAS");	
	etiqueta.setSize(450, 40);
	etiqueta.setLocation(250,10 );
	etiqueta.setForeground(Color.ORANGE);
	etiqueta.setFont(new Font("arial",Font.BOLD, 35));
	panel.add(etiqueta);
	
	String [] nombresColumnas = {"Partido","Equipo1","Equipo2","Ganador","Hora","Fecha","CuotaEquipo1","CuotaEmpate","CuotaEquipo2"};
	Object [] [] datosFila = {
			{"Partido1","Leicester","ManUnited","null","13:30","2020-12-26","2","2.2","3"},
			{"Partido2","AstonVilla","CrystalPalace","null","16:00","2020-12-26","1.7","2.45","2.3"},
			{"Partido3","ManCity","Newcastle","null","21:00","2020-12-26","1.3","2.6","2.5"}
	};
	
	JTable tabla = new JTable(datosFila,nombresColumnas);    
	tabla.setBounds(30,65,750,50);             
	panel.add(tabla);               
	String [] lista = {"Partido1","Partido2","Partido3"};
	JList<String> jlista = new JList<String>(lista);
	jlista.setVisibleRowCount(2);
	jlista.setBounds(30, 128, 100, 60);
	panel.add(jlista);
	ImageIcon imagen1 = new ImageIcon("deportes3.jpg");
	JLabel etiqueta3 = new JLabel(imagen1);
	etiqueta3.setSize(1000, 667);
	etiqueta3.setLocation(0,170);
	panel.add(etiqueta3);
	
	final JButton boton1 = new JButton("1");
	boton1.setSize(50, 42);
	boton1.setLocation(500, 128);
	boton1.setBackground(Color.GREEN);
	boton1.setForeground(Color.BLUE);
	ActionListener escuchador = new ActionListener() {
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread Hilo = new Thread() {
					public void run() {

						Deportes d = new Deportes();
						d.ventana();
						
						
					}
					
				};
				Hilo.start();
				
			
				
				
			
		}
	};
	boton1.addActionListener(escuchador);
	panel.add(boton1);
	
	final JButton boton2 = new JButton("X");
	boton2.setSize(50, 42);
	boton2.setLocation(570, 128);
	boton2.setBackground(Color.GREEN);
	boton2.setForeground(Color.BLUE);
	ActionListener escuchador2 = new ActionListener() {
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread Hilo = new Thread() {
					public void run() {

						Deportes d = new Deportes();
						d.ventana();
						
						
					}
					
				};
				Hilo.start();
				
			
				
				
			
		}
	};
	boton2.addActionListener(escuchador2);
	panel.add(boton2);
	
	final JButton boton3 = new JButton("2");
	boton3.setSize(50, 42);
	boton3.setLocation(640, 128);
	boton3.setBackground(Color.GREEN);
	boton3.setForeground(Color.BLUE);
	ActionListener escuchador3 = new ActionListener() {
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread Hilo = new Thread() {
					public void run() {

						Deportes d = new Deportes();
						d.ventana();
						
						
					}
					
				};
				Hilo.start();
				
			
				
				
			
		}
	};
	boton3.addActionListener(escuchador3);
	panel.add(boton3);

	
	d.setVisible(true);
}


public void resultados() {
	
}

	
}
