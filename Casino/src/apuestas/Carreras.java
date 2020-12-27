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
	ArrayList<ArrayList<CaballoCarrera> > carreras = new ArrayList<ArrayList<CaballoCarrera> >();
	ArrayList<CaballoCarrera> participantes1 = new ArrayList<CaballoCarrera>();
	ArrayList<CaballoCarrera> participantes2 = new ArrayList<CaballoCarrera>();
	ArrayList<CaballoCarrera> participantes3 = new ArrayList<CaballoCarrera>();
	
	public void apuestasPosibles() {
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
		etiqueta.setForeground(Color.ORANGE);
		etiqueta.setFont(new Font("arial",Font.BOLD, 28));
		panel.add(etiqueta);
		
		
		
		c.setVisible(true);
		
		
		
	}
	

	
	public void resultados() {
		
	}
}
