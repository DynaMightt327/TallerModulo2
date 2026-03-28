package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaCliente extends JFrame {

	private PanelMostrar panelMostrar;

	private JButton mostrar;
	private JButton volver;

	private JPanel banner;
	private JLabel titulo;

	public VentanaCliente() {
		initcomps();
		setVisible(false);
	}

	public void initcomps() {
		// ====CONFIGURACION DE LA VENTANA====
		this.setTitle("Chupiveterinaria");
		this.setBounds(250, 30, 980, 550);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#fff4e4"));

		banner = new JPanel();
		banner.setBounds(0, 0, 980, 100);
		banner.setBackground(Color.white);
		add(banner);

		titulo = new JLabel("Veterinaria");
		titulo.setBounds(450, 0, 300, 100);
		titulo.setForeground(Color.black);
		titulo.setFont(new Font("Arial", Font.BOLD, 70));
		banner.add(titulo);

		panelMostrar = new PanelMostrar();
		panelMostrar.setVisible(false);
		add(panelMostrar);
		
		mostrar = new JButton("Mostrar");
		mostrar.setBounds(15, 230, 140, 30);
		mostrar.setBorderPainted(false);
		mostrar.setForeground(Color.decode("#060b37"));
		add(mostrar);

		volver = new JButton("Volver");
		volver.setBounds(15, 350, 140, 30);
		volver.setBorderPainted(false);
		volver.setForeground(Color.decode("#060b37"));
		add(volver);

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

	public JPanel getBanner() {
		return banner;
	}

	public void setBanner(JPanel banner) {
		this.banner = banner;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public PanelMostrar getPanelMostrar() {
		return panelMostrar;
	}

	public void setPanelMostrar(PanelMostrar panelMostrar) {
		this.panelMostrar = panelMostrar;
	}

}
