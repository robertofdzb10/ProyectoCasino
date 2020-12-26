package apuestas;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** 
 * Carreras, un "tipo" de apuesta con posiciones en opcion de apuesta
 */
public class Carreras extends JFrame implements Apuestas{
	ArrayList<CaballoCarrera> participantes = new ArrayList<CaballoCarrera>();
	
	public void apuestasPosibles() {
		CaballoCarrera p1 = new CaballoCarrera(4/15,"Justify",(float) 1.3);
		CaballoCarrera p2 = new CaballoCarrera(1/6,"Secretariat",2);
		CaballoCarrera p3 = new CaballoCarrera(1/6,"Frankel",2);
		CaballoCarrera p4 = new CaballoCarrera(1/6,"Cigar",2);
		CaballoCarrera p5 = new CaballoCarrera(1/10,"Seabiscuit",3);
		CaballoCarrera p6 = new CaballoCarrera(1/30,"Citation",10);
		CaballoCarrera p7 = new CaballoCarrera(1/10,"Tierr",3);
		participantes.add(p1);
		participantes.add(p2);
		participantes.add(p3);
		participantes.add(p4);
		participantes.add(p5);
		participantes.add(p6);
		participantes.add(p7);
	}
	
	public void ventana() {
		
		Carreras c = new Carreras();
		c.setSize(900, 900);
		JPanel panel = new JPanel();
		c.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		JLabel etiqueta = new JLabel("APUESTAS DE CARRERAS");	
		etiqueta.setSize(450, 40);
		etiqueta.setLocation(250,10 );
		etiqueta.setForeground(Color.GREEN);
		etiqueta.setFont(new Font("arial",Font.BOLD, 45));
		panel.add(etiqueta);
		
	}
	

	
	public void resultados() {
		
	}
}
