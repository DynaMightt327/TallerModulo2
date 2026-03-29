package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaCliente extends JFrame {

	private PanelMostrar panelMostrar;

	private JButton mostrar;
	private JButton volver;

	private JLabel background;

	public VentanaCliente() {
		initcomps();
		setVisible(false);
	}

	public void initcomps() {
		// ====CONFIGURACION DE LA VENTANA====
		this.setTitle("Chupiveterinaria");
		this.setBounds(250, 30, 1000, 650);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#fff4e4"));

		// ====IMAGEN DE FONDO====
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("imagen2.png"));
		background = new JLabel(backgroundImage);
		background.setBounds(0, 0, 1000, 650);
		background.setLayout(null);
		this.add(background);
		panelMostrar = new PanelMostrar();
		panelMostrar.setVisible(false);
		add(panelMostrar);

		mostrar = new JButton("MOSTRAR");
		mostrar.setBounds(345, 162, 150, 30);
		mostrar.setBorderPainted(false);
		mostrar.setLayout(null);
		mostrar.setFont(new Font("Georgia", Font.BOLD, 12));
		mostrar.setBackground(Color.decode("#cca881"));
		mostrar.setForeground(Color.black);
		background.add(mostrar);

		volver = new JButton("VOLVER");
		volver.setBounds(530, 162, 150, 30);
		volver.setBorderPainted(false);
		volver.setLayout(null);
		volver.setFont(new Font("Georgia", Font.BOLD, 12));
		volver.setBackground(Color.decode("#cca881"));
		volver.setForeground(Color.black);
		background.add(volver);

	}

	public JButton getMostrar() {
		return mostrar;
	}

	public void setMostrar(JButton mostrar) {
		this.mostrar = mostrar;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	public PanelMostrar getPanelMostrar() {
		return panelMostrar;
	}

	public void setPanelMostrar(PanelMostrar panelMostrar) {
		this.panelMostrar = panelMostrar;
	}

}
