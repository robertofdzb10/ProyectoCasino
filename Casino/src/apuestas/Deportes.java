package apuestas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	
	String [] nombresColumnas = {"Equipo1","Equipo2","Ganador","Hora","Fecha","CuotaEquipo1","CuotaEmpate","CuotaEquipo2"};
	Object [] [] datosFila = {
			{"Leicester","ManUnited","null","13:30","2020-12-26","2","2.2","3"},
			{"AstonVilla","CrystalPalace","null","16:00","2020-12-26","1.7","2.45","2.3"},
			{"ManCity","Newcastle","null","21:00","2020-12-26","1.3","2.6","2.5"}
	};
	
	JTable tabla = new JTable(datosFila,nombresColumnas);
	add(new JScrollPane(tabla),BorderLayout.CENTER);
	final JButton boton1 = new JButton("APUESTAS DEPORTIVAS");

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
	final JButton boton = new JButton("Imprimir");
	boton.setSize(175, 30);
	boton.setLocation(135, 440);
	boton.setBackground(Color.GRAY);
	boton.setForeground(Color.BLUE);
	boton.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				tabla.print(getGraphics());
			}catch(Exception e2){
				e2.printStackTrace();
			}
			
		}
		
	});
	

	panel.add(new JScrollPane(tabla));
	panel.add(boton);
	d.setVisible(true);
}


public void resultados() {
	
}

	
}
