package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tragaperras.Ranura;

/**
 * Ventana para el juego de las tragaperras
 */
public class VentanaTragaperras extends JFrame {
	
	private JFrame ventanaTragaperras;
	private Ranura ranura0;
	private Ranura ranura1;
	private Ranura ranura2;
	private boolean booleanHilo0;
	private boolean booleanHilo1;
	
	public VentanaTragaperras() {
		
	ventanaTragaperras = new JFrame();
	ranura0 = new Ranura("ranura0", 30, 1);
	ranura1 = new Ranura("ranura1", 45, 2);
	ranura2 = new Ranura("ranura2", 70, 3);
	

	//1. Configuracion de la ventana
	
	setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	setSize(600, 400); //Tama�o ventana
	setTitle("Tragaperras"); //No necesita getContentPane, ya que se hace sobre la ventana
	
	
	//2. Creaci�n de contenedores (paneles) y componenetes
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.WHITE);
	JPanel botonera = new JPanel();
	botonera.setBackground(Color.LIGHT_GRAY);
	JButton bStart = new JButton( "Start");
	JButton bStop = new JButton( "Stop");
	
	
	//3.Decoraciones
	
	
	
	//4.Asignacion de componenetes a contenedores
	
	getContentPane().add( panel, null);
	//panel.add(ranura0);
	getContentPane().add( botonera, BorderLayout.SOUTH);
	botonera.add(bStart);
	botonera.add(bStop);
	bStop.setEnabled(false); //El bot�n de Stop permanece desactivado hasta que se alcanze la Velocidad MAxima de la ranura.


	
	//5.Eventos
	
	bStart.addActionListener( new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			ranura0.Start( ranura0 );
			ranura0.Start( ranura1 );
			ranura0.Start( ranura2 );
			bStart.setEnabled(false);
			Thread Hilo0 = new Thread() {
				public void run() {
					booleanHilo0 = false;
					while (booleanHilo0 == false) {
						System.out.println("Ranura0 " + ranura0.getVelocidad());	
						System.out.println("Ranura1 " +ranura1.getVelocidad());	
						System.out.println("Ranura2 " +ranura2.getVelocidad());	
						System.out.println("\n");
					if (ranura0.getVelocidad() >= ranura0.getVelocidadMax() && ranura1.getVelocidad() >= ranura1.getVelocidadMax() && ranura2.getVelocidad() >= ranura2.getVelocidadMax()) {
						bStop.setEnabled(true);
						booleanHilo0 = true;
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("Error");;
					}
				}
				}
			};
			Hilo0.start();
		}
	});


	
	bStop.addActionListener( new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			ranura0.Stop( ranura0 );
			ranura1.Stop( ranura1 );
			ranura2.Stop( ranura2 );
			bStop.setEnabled(false);
			Thread Hilo1 = new Thread() {
				public void run() {
					booleanHilo1 = false;
					while (booleanHilo1 == false) {
						System.out.println("Ranura0 " + ranura0.getVelocidad());	
						System.out.println("Ranura1 " +ranura1.getVelocidad());	
						System.out.println("Ranura2 " +ranura2.getVelocidad());	
						System.out.println("\n");
						if (bStart.isEnabled() == false && ranura0.getVelocidad() == 0 && ranura1.getVelocidad() == 0 && ranura2.getVelocidad() == 0) {
							bStart.setEnabled(true);
							booleanHilo1 = true;
						}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("Error");;
					}
				}
				}
			};
			Hilo1.start();
		}
	});
		
	}
}

