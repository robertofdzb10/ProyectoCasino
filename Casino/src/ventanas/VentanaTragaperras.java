package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import tragaperras.Ranura;

/**
 * Ventana para el juego de las tragaperras
 */
public class VentanaTragaperras extends JFrame {
	
	private Ranura ranura0;
	private Ranura ranura1;
	private Ranura ranura2;
	private boolean booleanHilo0;
	private boolean booleanHilo1;
	private boolean booleanHilo2;
	private BufferedImage image00;
	private BufferedImage image01;
	private BufferedImage image02;
	
	public VentanaTragaperras() {
		
	ranura0 = new Ranura("ranura0", 30, 1);
	ranura1 = new Ranura("ranura1", 45, 2);
	ranura2 = new Ranura("ranura2", 70, 3);
	

	//1. Configuracion de la ventana
	
	setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	setSize(600, 400); //Tamaño ventana
	setTitle("Tragaperras"); //No necesita getContentPane, ya que se hace sobre la ventana
	
	
	//2. Creación de contenedores (paneles) y componenetes
	
	JPanel panel = new JPanel( null );//Hemos de crear primero el layout deseado
	panel.setBackground(Color.WHITE);
	JPanel botonera = new JPanel();
	botonera.setBackground(Color.LIGHT_GRAY);
	JButton bStart = new JButton( "Start");
	JButton bStop = new JButton( "Stop");
	
	
	//3.Decoraciones
	
	try {
		image00 = ImageIO.read(new File("src/imagenes/maquinaTragaperras.png"));
	} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Error grave contacta con desarrollador", "Error", JOptionPane.ERROR_MESSAGE);
	}
	JLabel picLabel00 = new JLabel(new ImageIcon(image00));
	
	try {
		image01 = ImageIO.read(new File("src/imagenes/maquinaTragaperrasBlanca.png"));
	} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Error grave contacta con desarrollador", "Error", JOptionPane.ERROR_MESSAGE);
	}
	JLabel picLabel01 = new JLabel(new ImageIcon(image01));
	try {
		image02 = ImageIO.read(new File("src/imagenes/ranuraMovimiento.png"));
	} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Error grave contacta con desarrollador", "Error", JOptionPane.ERROR_MESSAGE);
	}
	JLabel picLabel02 = new JLabel(new ImageIcon(image02));
	
	//4.Asignacion de componenetes a contenedores
	
	panel.add(picLabel00);
	picLabel00.setBounds(-190, -350, 1000, 1000);//
	getContentPane().add( panel, null);
	getContentPane().add( botonera, BorderLayout.SOUTH);
	botonera.add(bStart);
	botonera.add(bStop);
	bStop.setEnabled(false); //El botón de Stop permanece desactivado hasta que se alcanze la Velocidad MAxima de la ranura.


	
	//5.Eventos
	
	bStart.addActionListener( new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			//****
			panel.remove(picLabel00);
			panel.add(picLabel01);
			picLabel01.setBounds(10, 10, 1000, 1000);//
			panel.add(picLabel02);
			picLabel02.setBounds(100, 10, 1000, 1000);//
			panel.revalidate();//Necesario para validar la accion, de agregar un nuevo elemento a un panel.
			repaint();
			//****
			
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
			Thread Hilo2 = new Thread() {
				public void run() {
					booleanHilo2 = false;
					while (booleanHilo2 == false) {
						if (ranura0.getVelocidad() <= 8 && ranura1.getVelocidad() <= 8 && ranura2.getVelocidad() <= 8) {
							String icono1 = ranura0.devuelveIconoAleatorio().getNombre();
							String icono2 =ranura1.devuelveIconoAleatorio().getNombre();
							String icono3 =ranura2.devuelveIconoAleatorio().getNombre();
							System.out.println( icono1 + "  " + icono2 + "  " + icono3);
							if (icono1 == icono2  || icono1 == "Bar" || icono1 == "Comodín" || icono1 == icono3 || ((icono2 == "Comodín" || icono2 == "Bar") && (icono3 == "Comodín" || icono3 == "Bar"))) {
								if(icono2 == icono3  || icono2 == "Bar" || icono2 == "Comodín"  || (icono3 == "Comodín" || icono3 == "Bar")) {
									JOptionPane.showMessageDialog(panel, "¡Ganador!");
									panel.remove(picLabel01);
									panel.add(picLabel00);
									picLabel00.setBounds(10, 10, 100, 100);//
									panel.revalidate();
									repaint();
								} else {
									JOptionPane.showMessageDialog(panel,"Pruebe suerte otra vez");
									panel.remove(picLabel01);
									panel.add(picLabel00);
									picLabel00.setBounds(10, 10, 100, 100);//
									panel.revalidate();
									repaint();
								}
							}else {
								JOptionPane.showMessageDialog(panel,"Pruebe suerte otra vez");
								panel.remove(picLabel01);
								panel.add(picLabel00);
								picLabel00.setBounds(10, 10, 100, 100);//
								panel.revalidate();
								repaint();
							}
							booleanHilo2 = true;
						}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("Error");;
					}
				}
				}
			};
			Hilo2.start();
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

