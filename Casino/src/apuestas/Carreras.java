package apuestas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

/** 
 * Carreras, un "tipo" de apuesta con posiciones en opcion de apuesta
 */
public class Carreras extends JFrame implements Apuestas{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<ArrayList<CaballoCarrera> > carreras = new ArrayList<ArrayList<CaballoCarrera> >();
	ArrayList<CaballoCarrera> participantes1 = new ArrayList<CaballoCarrera>();
	ArrayList<CaballoCarrera> participantes2 = new ArrayList<CaballoCarrera>();
	ArrayList<CaballoCarrera> participantes3 = new ArrayList<CaballoCarrera>();
	String seleccion = "";
	int contador = 0;
	HashMap<String, String> mapaC = new HashMap<String, String>();
	HashMap<String, String> mapaResC = new HashMap<String, String>();
	ArrayList<String> resC = new ArrayList<String>();
	ArrayList<HashMap<String, String>> mapasC = new ArrayList<HashMap<String, String>>();
	
	public void apuestasPosibles(String nick) {
		CaballoCarrera p11 = new CaballoCarrera(4/15,"Justify",(float) 1.3);
		CaballoCarrera p12 = new CaballoCarrera(1/6,"Secretariat",2);
		CaballoCarrera p13 = new CaballoCarrera(1/6,"Frankel",2);
		CaballoCarrera p14 = new CaballoCarrera(1/6,"Cigar",2);
		CaballoCarrera p15 = new CaballoCarrera(1/10,"Seabiscuit",3);
		CaballoCarrera p16 = new CaballoCarrera(1/30,"Citation",10);
		CaballoCarrera p17 = new CaballoCarrera(1/10,"Tierry",3);
		participantes1.add(p11);
		participantes1.add(p12);
		participantes1.add(p13);
		participantes1.add(p14);
		participantes1.add(p15);
		participantes1.add(p16);
		participantes1.add(p17);
		
		CaballoCarrera p21 = new CaballoCarrera(1/10,"ManOfWar",3);
		CaballoCarrera p22 = new CaballoCarrera(1/6,"Henry",2);
		CaballoCarrera p23 = new CaballoCarrera(1/30,"Admiral",10);
		CaballoCarrera p24 = new CaballoCarrera(1/10,"Ruffian",3);
		CaballoCarrera p25 = new CaballoCarrera(4/15,"Brew",(float) 1.3);
		CaballoCarrera p26 = new CaballoCarrera(1/6,"Spectacular",2);
		CaballoCarrera p27 = new CaballoCarrera(1/6,"Jones",2);
		participantes2.add(p21);
		participantes2.add(p22);
		participantes2.add(p23);
		participantes2.add(p24);
		participantes2.add(p25);
		participantes2.add(p26);
		participantes2.add(p27);
		
		CaballoCarrera p31 = new CaballoCarrera(1/30,"Brave",10);
		CaballoCarrera p32 = new CaballoCarrera(1/10,"Fire",3);
		CaballoCarrera p33 = new CaballoCarrera(1/6,"Water",2);
		CaballoCarrera p34 = new CaballoCarrera(1/10,"Wind",3);
		CaballoCarrera p35 = new CaballoCarrera(1/6,"Snow",2);
		CaballoCarrera p36 = new CaballoCarrera(4/15,"Earth",(float) 1.3);
		CaballoCarrera p37 = new CaballoCarrera(1/6,"Hurricane",2);
		participantes3.add(p31);
		participantes3.add(p32);
		participantes3.add(p33);
		participantes3.add(p34);
		participantes3.add(p35);
		participantes3.add(p36);
		participantes3.add(p37);
		carreras.add(participantes1);
		carreras.add(participantes2);
		carreras.add(participantes3);
	}
	
	public void ventana(String nick) {
		
		Carreras c = new Carreras();
		c.setSize(900, 900);
		JPanel panel = new JPanel();
		c.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		JLabel etiqueta = new JLabel("APUESTAS DE CARRERAS");	
		etiqueta.setSize(450, 40);
		etiqueta.setLocation(250,10 );
		etiqueta.setForeground(Color.ORANGE);
		etiqueta.setFont(new Font("arial",Font.BOLD, 28));
		panel.add(etiqueta);
		
		String [] nombresColumnas = {"Carrera","Caballo1-cuota","Caballo2-cuota","Caballo3-cuota","Caballo4-cuota","Caballo5-cuota","Caballo6-cuota","Caballo7-cuota"};
		Object [] [] datosFila = {
				{"Carrera1","Justify-1.3","Secretariat-2","Frankel-2","Cigar-2","Seabiscuit-3","Citacion-10","Tierry-3"},
				{"Carrera2","ManOfWar-3","Henry-2","Admiral-10","Ruffian-3","Brew-1.3","Spectacular-2","Jones-2"},
				{"Carrera3","Brave-10","Fire-3","Water-2","Wind-3","Snow-2","Earth-1.3","Hurricane-2"}
		};
		
		JTable tabla = new JTable(datosFila,nombresColumnas);    
		tabla.setBounds(30,75,750,50);          
		panel.add(tabla);  
		String [] lista = {"Carrera1","Carrera2","Carrera3"};
		JList<String> jlista = new JList<String>(lista);
		jlista.setVisibleRowCount(2);
		jlista.setBounds(30, 150, 70, 55);
		panel.add(jlista);
		jlista.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				seleccion = String.valueOf(jlista.getSelectedIndex() + 1);
			}
		});
		
		ImageIcon imagen1 = new ImageIcon("carreras2.jpg");
		JLabel etiqueta3 = new JLabel(imagen1);
		etiqueta3.setSize(1024, 578);
		etiqueta3.setLocation(0,230);
		panel.add(etiqueta3);
		
		
		final JButton boton1 = new JButton("Caballo1");
		boton1.setSize(100, 42);
		boton1.setLocation(115, 150);
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
		
		final JButton boton2 = new JButton("Caballo2");
		boton2.setSize(100, 42);
		boton2.setLocation(225, 150);
		boton2.setBackground(Color.GREEN);
		boton2.setForeground(Color.BLUE);
		ActionListener escuchador2 = new ActionListener() {
			
			
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
		boton2.addActionListener(escuchador2);
		panel.add(boton2);
		
		final JButton boton3 = new JButton("Caballo3");
		boton3.setSize(100, 42);
		boton3.setLocation(335, 150);
		boton3.setBackground(Color.GREEN);
		boton3.setForeground(Color.BLUE);
		ActionListener escuchador3 = new ActionListener() {
			
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Thread Hilo = new Thread() {
						public void run() {

							seleccion += "-3";
							
						}
						
					};
					Hilo.start();
					
				
					
					
				
			}
		};
		boton3.addActionListener(escuchador3);
		panel.add(boton3);

		
		final JButton boton4 = new JButton("Caballo4");
		boton4.setSize(100, 42);
		boton4.setLocation(445, 150);
		boton4.setBackground(Color.GREEN);
		boton4.setForeground(Color.BLUE);
		ActionListener escuchador4 = new ActionListener() {
			
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Thread Hilo = new Thread() {
						public void run() {

							seleccion += "-4";
							
							
						}
						
					};
					Hilo.start();
					
				
					
					
				
			}
		};
		boton4.addActionListener(escuchador4);
		panel.add(boton4);
		
		final JButton boton5 = new JButton("Caballo5");
		boton5.setSize(100, 42);
		boton5.setLocation(555, 150);
		boton5.setBackground(Color.GREEN);
		boton5.setForeground(Color.BLUE);
		ActionListener escuchador5 = new ActionListener() {
			
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Thread Hilo = new Thread() {
						public void run() {

							seleccion += "-5";
							
						}
						
					};
					Hilo.start();
					
				
					
					
				
			}
		};
		boton5.addActionListener(escuchador5);
		panel.add(boton5);
		
		final JButton boton6 = new JButton("Caballo6");
		boton6.setSize(100, 42);
		boton6.setLocation(665, 150);
		boton6.setBackground(Color.GREEN);
		boton6.setForeground(Color.BLUE);
		ActionListener escuchador6 = new ActionListener() {
			
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Thread Hilo = new Thread() {
						public void run() {

							seleccion += "-6";
							
						}
						
					};
					Hilo.start();
					
				
					
					
				
			}
		};
		boton6.addActionListener(escuchador6);
		panel.add(boton6);

		
		final JButton boton7 = new JButton("Caballo7");
		boton7.setSize(100, 42);
		boton7.setLocation(775, 150);
		boton7.setBackground(Color.GREEN);
		boton7.setForeground(Color.BLUE);
		ActionListener escuchador7 = new ActionListener() {
			
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Thread Hilo = new Thread() {
						public void run() {

					
							seleccion += "-7";
							
						}
						
					};
					Hilo.start();
					
				
					
					
				
			}
		};
		boton7.addActionListener(escuchador7);
		panel.add(boton7);
		

		final JButton boton8 = new JButton("APOSTAR");
		boton8.setSize(100, 42);
		boton8.setLocation(785, 75);
		boton8.setBackground(Color.red);
		boton8.setForeground(Color.white);
		ActionListener escuchador8 = new ActionListener() {
			
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Thread Hilo = new Thread() {
						public void run() {

							mapaC.put(seleccion,nick);
							System.out.println(mapaC);
							seleccion = "";
							contador += 1;
							if(contador > 6) {
								mapasC.add(mapaC);
							}
						}
						
					};
					Hilo.start();
					
				
					
					
				
			}
		};
		boton8.addActionListener(escuchador8);
		panel.add(boton8);
		
		final JButton boton9 = new JButton("RESULTADOS");
		boton9.setSize(150, 42);
		boton9.setLocation(725, 25);
		boton9.setBackground(Color.blue);
		boton9.setForeground(Color.white);
		ActionListener escuchador9 = new ActionListener() {
			
			
				@Override
				public void actionPerformed(ActionEvent e) {
					Thread Hilo = new Thread() {
						public void run() {

							mapaC.put(seleccion,nick);
							System.out.println(mapaC);
							seleccion = "";
							contador += 1;
							if(contador > 6) {
								mapasC.add(mapaC);
							}
						}
						
					};
					Hilo.start();
					
				
					
					
				
			}
		};
		boton9.addActionListener(escuchador9);
		panel.add(boton9);
	
		
		

		
		c.setVisible(true);
		
		
		
	}
	

	
	public void resultados() {
		
		resC.add("1-7");
		resC.add("2-1");
		resC.add("3-5");
		for(HashMap<String, String> mapa : mapasC) {
			for(String s : mapa.keySet()) {
				for(int i = 0; i < resC.size(); i++) {
					System.out.println(s);
					if(s.equals(resC.get(i))) {
						mapaResC.put(s, mapa.get(s));
					}
				}
				
			}
		}
		System.out.println(mapaResC);
	}

	@Override
	public void apuestasPosibles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ventana() {
		// TODO Auto-generated method stub
		
	}
}
