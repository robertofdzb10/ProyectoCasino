package ventanas;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
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
	private BufferedImage image03;
	private BufferedImage image04;
	private BufferedImage image05;
	private BufferedImage image06;
	private BufferedImage image07;
	private String icono1;
	private String icono2;
	private String icono3;
	
	public VentanaTragaperras() {
		
	ranura0 = new Ranura("ranura0", 18, 2);
	ranura1 = new Ranura("ranura1", 19, 3);
	ranura2 = new Ranura("ranura2", 20, 4);
	

	//1. Configuracion de la ventana
	
	setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	setSize(605, 660); //Tama�o ventana
	setLocationRelativeTo(null);//Centramos ventana
	setResizable(false);//Bloqueamos tama�o ventana
	setTitle("Tragaperras"); //No necesita getContentPane, ya que se hace sobre la ventana
	
	
	//2. Creaci�n de contenedores (paneles) y componenetes
	
	JPanel panel = new JPanel( null );//Hemos de crear primero el layout deseado
	panel.setBackground(Color.WHITE);
	JPanel botonera = new JPanel();
	botonera.setBackground(Color.LIGHT_GRAY);
	JButton bStart = new JButton( "Start");
	JButton bStop = new JButton( "Stop");
	
	
	//3.Decoraciones
	
	try {
		image00 = ImageIO.read(new File("src/imagenes/7.png"));
	} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Error grave contacta con desarrollador", "Error", JOptionPane.ERROR_MESSAGE);
	}
	JLabel picLabel00 = new JLabel(new ImageIcon(image00));
	JLabel picLabel05 = new JLabel(new ImageIcon(image00));
	JLabel picLabel06 = new JLabel(new ImageIcon(image00));
	
	try {
		image01 = ImageIO.read(new File("src/imagenes/fondoCasino_Tragaperras.png"));
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
	JLabel picLabel03 = new JLabel(new ImageIcon(image02));
	JLabel picLabel04 = new JLabel(new ImageIcon(image02));
	
	try {
		image03 = ImageIO.read(new File("src/imagenes/Naranja.png"));
	} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Error grave contacta con desarrollador", "Error", JOptionPane.ERROR_MESSAGE);
	}
	JLabel labelNaranja = new JLabel(new ImageIcon(image03));
	JLabel labelNaranja1 = new JLabel(new ImageIcon(image03));
	JLabel labelNaranja2 = new JLabel(new ImageIcon(image03));
	
	try {
		image04 = ImageIO.read(new File("src/imagenes/BAR.png"));
	} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Error grave contacta con desarrollador", "Error", JOptionPane.ERROR_MESSAGE);
	}
	JLabel labelBar = new JLabel(new ImageIcon(image04));
	JLabel labelBar1 = new JLabel(new ImageIcon(image04));
	JLabel labelBar2 = new JLabel(new ImageIcon(image04));
	
	try {
		image05 = ImageIO.read(new File("src/imagenes/Pera.png"));
	} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Error grave contacta con desarrollador", "Error", JOptionPane.ERROR_MESSAGE);
	}
	JLabel labelPera= new JLabel(new ImageIcon(image05));
	JLabel labelPera1 = new JLabel(new ImageIcon(image05));
	JLabel labelPera2 = new JLabel(new ImageIcon(image05));
	
	try {
		image06 = ImageIO.read(new File("src/imagenes/Platano.png"));
	} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Error grave contacta con desarrollador", "Error", JOptionPane.ERROR_MESSAGE);
	}
	JLabel labelPlatano= new JLabel(new ImageIcon(image06));
	JLabel labelPlatano1 = new JLabel(new ImageIcon(image06));
	JLabel labelPlatano2 = new JLabel(new ImageIcon(image06));
	
	try {
		image07 = ImageIO.read(new File("src/imagenes/Cereza.png"));
	} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Error grave contacta con desarrollador", "Error", JOptionPane.ERROR_MESSAGE);
	}
	JLabel labelCereza= new JLabel(new ImageIcon(image07));
	JLabel labelCereza1 = new JLabel(new ImageIcon(image07));
	JLabel labelCereza2 = new JLabel(new ImageIcon(image07));
	
	
	//4.Asignacion de componenetes a contenedores
	
	panel.add(picLabel01);
	picLabel01.setBounds( -200, -200, 1000, 1000);
	panel.add(picLabel00);
	picLabel00.setBounds(-297, -140, 1000, 1000);
	panel.add(picLabel05);
	picLabel05.setBounds(-200, -140, 1000, 1000);
	panel.add(picLabel06);
	picLabel06.setBounds(-103, -140, 1000, 1000);
	getContentPane().add( panel, null);
	getContentPane().add( botonera, BorderLayout.SOUTH);
	botonera.add(bStart);
	botonera.add(bStop);
	bStop.setEnabled(false); //El bot�n de Stop permanece desactivado hasta que se alcanze la Velocidad MAxima de la ranura.



	
	//5.Eventos
	
	bStart.addActionListener( new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			icono1 = ranura0.devuelveIconoAleatorio().getNombre();
			icono2 = ranura1.devuelveIconoAleatorio().getNombre();
			icono3 = ranura2.devuelveIconoAleatorio().getNombre();
			
			//****
			panel.remove(picLabel00);
			panel.remove(picLabel05);
			panel.remove(picLabel06);
			panel.add(picLabel02);
			picLabel02.setBounds(-295, -350, 1000, 1000);
			panel.add(picLabel03);
			picLabel03.setBounds(-200, -350, 1000, 1000);
			panel.add(picLabel04);
			picLabel04.setBounds(-100, -350, 1000, 1000);
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
			
			Thread HiloMovimiento = new Thread() {
				public void run() {
					while (isVisible()) {
						
						picLabel02.setLocation(picLabel02.getX() , picLabel02.getY()  + ranura0.getVelocidad());
						picLabel03.setLocation(picLabel03.getX() , picLabel03.getY()  + ranura1.getVelocidad());
						picLabel04.setLocation(picLabel04.getX() , picLabel04.getY()  + ranura2.getVelocidad());
						if (picLabel02.getY() > 100) {
							picLabel02.setLocation(picLabel02.getX(), -350);
						} else if(picLabel03.getY() > 100){
							picLabel03.setLocation(picLabel03.getX(), -350);
						} else if(picLabel04.getY() > 100) {
							picLabel04.setLocation(picLabel04.getX(), -350);
						}
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						System.out.println("Error");;
					}
				}
				}
			};
			HiloMovimiento.start();
		}
	});

		
	
	bStop.addActionListener( new ActionListener() {
		
		public void preparaTragaperras() {
			
			if (icono1 == "Naranja") {
				panel.remove(labelNaranja);
			} else if (icono1 == "Bar") {
				panel.remove(labelBar);
			} else if(icono1 == "Pera"){
				panel.remove(labelPera);
			} else if(icono1 == "Platano"){
				panel.remove(labelPlatano);
			} else if(icono1 == "Cereza"){
				panel.remove(labelCereza);
			} else if(icono1 == "Comodín") {
				panel.remove(picLabel00);
			}
			
			if (icono2 == "Naranja") {
				panel.remove(labelNaranja1);	
			} else if (icono2 == "Bar") {
				panel.remove(labelBar1);
			} else if(icono2 == "Pera"){
				panel.remove(labelPera1);
			} else if(icono2 == "Platano"){
				panel.remove(labelPlatano1);
			} else if(icono2 == "Cereza"){
				panel.remove(labelCereza1);
			} else if(icono2 == "Comodín") {
				panel.remove(picLabel05);
			}
			
			if (icono3 == "Naranja") {
				panel.remove(labelNaranja2);
			} else if (icono3 == "Bar") {
				panel.remove(labelBar2);
			} else if(icono3 == "Pera"){
				panel.remove(labelPera2);
			} else if(icono3 == "Platano"){
				panel.remove(labelPlatano2);
			} else if(icono3 == "Cereza"){
				panel.remove(labelCereza2);
			} else if(icono3 == "Comodín") {
				panel.remove(picLabel06);
			}
			
		}
		
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
							System.out.println( icono1 + "  " + icono2 + "  " + icono3);
							if (icono1 == icono2  || icono1 == "Bar" || icono1 == "Comodín" || icono1 == icono3 || ((icono2 == "Comodín" || icono2 == "Bar") && (icono3 == "Comodín" || icono3 == "Bar"))) {
								if(icono2 == icono3  || icono2 == "Bar" || icono2 == "Comodín"  || (icono3 == "Comodín" || icono3 == "Bar")) {
									JOptionPane.showMessageDialog(panel, "¡Ganador!");
									preparaTragaperras();
									panel.add(picLabel00);
									picLabel00.setBounds(-297, -140, 1000, 1000);
									panel.add(picLabel05);
									picLabel05.setBounds(-200, -140, 1000, 1000);
									panel.add(picLabel06);
									picLabel06.setBounds(-103, -140, 1000, 1000);
									panel.revalidate();
									repaint();
								} else {
									JOptionPane.showMessageDialog(panel,"Pruebe suerte otra vez");
									preparaTragaperras();
									panel.add(picLabel00);
									picLabel00.setBounds(-297, -140, 1000, 1000);
									panel.add(picLabel05);
									picLabel05.setBounds(-200, -140, 1000, 1000);
									panel.add(picLabel06);
									picLabel06.setBounds(-103, -140, 1000, 1000);
									panel.revalidate();
									repaint();
								}
							}else {
								JOptionPane.showMessageDialog(panel,"Pruebe suerte otra vez");
								preparaTragaperras();
								panel.add(picLabel00);
								picLabel00.setBounds(-297, -140, 1000, 1000);
								panel.add(picLabel05);
								picLabel05.setBounds(-200, -140, 1000, 1000);
								panel.add(picLabel06);
								picLabel06.setBounds(-103, -140, 1000, 1000);
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
			
			Thread HiloResultado = new Thread() {
				public void run() {
					while(booleanHilo2 == false) {
						if (ranura0.getVelocidad() <= 8) {
							ranura0.setVelocidad(0);
							panel.remove(picLabel02);
							
							if (icono1 == "Naranja") {
								panel.add(labelNaranja);
								labelNaranja.setBounds(-297, -140, 1000, 1000);
							} else if(icono1 == "Bar"){
								panel.add(labelBar);
								labelBar.setBounds(-297, -140, 1000, 1000);
							} else if(icono1 == "Pera"){
								panel.add(labelPera);
								labelPera.setBounds(-297, -140, 1000, 1000);
							} else if(icono1 == "Platano"){
								panel.add(labelPlatano);
								labelPlatano.setBounds(-297, -140, 1000, 1000);
							} else if(icono1 == "Cereza"){
								panel.add(labelCereza);
								labelCereza.setBounds(-290, -140, 1000, 1000);
							} else if(icono1 == "Comodín") {
								panel.add(picLabel00);
								picLabel00.setBounds(-297, -140, 1000, 1000);
							}
						}
						
						if (ranura1.getVelocidad() <= 8) {
							ranura1.setVelocidad(0);
							panel.remove(picLabel03);
							
							if (icono2 == "Naranja"){
								panel.add(labelNaranja1);
								labelNaranja1.setBounds(-200, -140, 1000, 1000);
							} else if (icono2 == "Bar") {
								panel.add(labelBar1);
								labelBar1.setBounds(-200, -140, 1000, 1000);
							} else if(icono2 == "Pera"){
								panel.add(labelPera1);
								labelPera1.setBounds(-200, -140, 1000, 1000);
							} else if(icono2 == "Platano"){
								panel.add(labelPlatano1);
								labelPlatano1.setBounds(-200, -140, 1000, 1000);
							} else if(icono2 == "Cereza"){
								panel.add(labelCereza1);
								labelCereza1.setBounds(-190, -140, 1000, 1000);
							} else if(icono2 == "Comodín") {
								panel.add(picLabel05);
								picLabel05.setBounds(-200, -140, 1000, 1000);
							}
							
						}
						
						if (ranura2.getVelocidad() <= 8) {
							ranura2.setVelocidad(0);
							panel.remove(picLabel04);
							
							if (icono3 == "Naranja") {
								panel.add(labelNaranja2);
								labelNaranja2.setBounds(-103, -140, 1000, 1000);
							} else if (icono3 == "Bar") {
								panel.add(labelBar2);
								labelBar2.setBounds(-103, -140, 1000, 1000);
							} else if(icono3 == "Pera"){
								panel.add(labelPera2);
								labelPera2.setBounds(-103, -140, 1000, 1000);
							} else if(icono3 == "Platano"){
								panel.add(labelPlatano2);
								labelPlatano2.setBounds(-103, -140, 1000, 1000);
							} else if(icono3 == "Cereza"){
								panel.add(labelCereza2);
								labelCereza2.setBounds(-93, -140, 1000, 1000);
							} else if(icono3 == "Comodín") {
								panel.add(picLabel06);
								picLabel06.setBounds(-103, -140, 1000, 1000);
							}
							
						}
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						System.out.println("Error");;
					}
				}
				}
			};
			HiloResultado.start();
		}
	
	});
		
	}
	

}

