package apuestas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import ventanas.MenuJuegos;

/**
 * Deportes un tipo de apuesta donde habrá multiples posibilidades de apuesta
 */
public class Deportes extends JFrame implements Apuestas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HashMap<String, String> mapaD = new HashMap<String, String>();
	HashMap<String, String> mapaResD = new HashMap<String, String>();
	String seleccion = "";
	int contador = 0;
	ArrayList<HashMap<String, String>> mapasD = new ArrayList<HashMap<String, String>>();
	ArrayList<String> resD = new ArrayList<String>();
	

public void ventana(String nick) {
	
	
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
	tabla.setBounds(30,55,750,50);             
	panel.add(tabla);             
	String [] lista = {"Partido1","Partido2","Partido3"};
	JList<String> jlista = new JList<String>(lista);
	jlista.setVisibleRowCount(2);
	jlista.setBounds(30, 110, 70, 55);
	panel.add(jlista);
	jlista.addListSelectionListener(new ListSelectionListener() {
		
		@Override
		public void valueChanged(ListSelectionEvent e) {
			seleccion = String.valueOf(jlista.getSelectedIndex() + 1);
		}
	});
	ImageIcon imagen1 = new ImageIcon("deportes3.jpg");
	JLabel etiqueta3 = new JLabel(imagen1);
	etiqueta3.setSize(1000, 667);
	etiqueta3.setLocation(0,170);
	panel.add(etiqueta3);
	
	final JButton boton1 = new JButton("1");
	boton1.setSize(50, 42);
	boton1.setLocation(500, 115);
	boton1.setBackground(Color.GREEN);
	boton1.setForeground(Color.BLUE);
	ActionListener escuchador = new ActionListener() {
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread Hilo = new Thread() {
					public void run() {

					
						seleccion += "-1";
						
					}
					
				};
				Hilo.start();
				
			
				
				
			
		}
	};
	boton1.addActionListener(escuchador);
	panel.add(boton1);
	
	final JButton boton2 = new JButton("X");
	boton2.setSize(50, 42);
	boton2.setLocation(570, 115);
	boton2.setBackground(Color.GREEN);
	boton2.setForeground(Color.BLUE);
	ActionListener escuchador2 = new ActionListener() {
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread Hilo = new Thread() {
					public void run() {

						seleccion += "-X";
						
						
					}
					
				};
				Hilo.start();
				
			
				
				
			
		}
	};
	boton2.addActionListener(escuchador2);
	panel.add(boton2);
	
	final JButton boton3 = new JButton("2");
	boton3.setSize(50, 42);
	boton3.setLocation(640, 115);
	boton3.setBackground(Color.GREEN);
	boton3.setForeground(Color.BLUE);
	ActionListener escuchador3 = new ActionListener() {
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread Hilo = new Thread() {
					public void run() {

						seleccion += "-2";
						
						
					}
					
				};
				Hilo.start();
				
			
				
				
			
		}
	};
	boton3.addActionListener(escuchador3);
	panel.add(boton3);
	
	final JButton boton4 = new JButton("APOSTAR");
	boton4.setSize(100, 42);
	boton4.setLocation(180, 115);
	boton4.setBackground(Color.red);
	boton4.setForeground(Color.white);
	ActionListener escuchador4 = new ActionListener() {
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread Hilo = new Thread() {
					public void run() {

						mapaD.put(seleccion,nick);
						seleccion = "";
						contador += 1;
						if(contador > 2) {
							mapasD.add(mapaD);
						}
					}
					
				};
				Hilo.start();
				
			
				
				
			
		}
	};
	boton4.addActionListener(escuchador4);
	panel.add(boton4);
	
	final JButton boton5 = new JButton("RESULTADOS");
	boton5.setSize(130, 42);
	boton5.setLocation(350, 115);
	boton5.setBackground(Color.blue);
	boton5.setForeground(Color.white);
	ActionListener escuchador5 = new ActionListener() {
		
		
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread Hilo = new Thread() {
					public void run() {

						resultados();
					}
					
				};
				Hilo.start();
				
			
				
				
			
		}
	};
	boton5.addActionListener(escuchador5);
	panel.add(boton5);
	
	

	
	d.setVisible(true);

    }
	
	



public void resultados() {
	resD.add("1-2");
	resD.add("2-X");
	resD.add("3-1");
	for(HashMap<String, String> mapa : mapasD) {
		for(String s : mapa.keySet()) {
			for(int i = 0; i < resD.size(); i++) {
				System.out.println(s);
				if(s.equals(resD.get(i))) {
					mapaResD.put(s, mapa.get(s));
				}
			}
			
		}
	}
	System.out.println(mapaResD);
}

@Override
public void ventana() {
	// TODO Auto-generated method stub
	
}
public void apuestasPosibles() {
}


	
}
