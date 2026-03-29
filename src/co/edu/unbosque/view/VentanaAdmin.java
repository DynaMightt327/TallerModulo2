package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaAdmin extends JFrame {

	private JLabel background;
	private PanelCrear panelCrear;
	private PanelMostrar panelMostrar;
	private PanelActualizar panelActualizar;
	private PanelEliminar panelEliminar;

	private JButton crear;
	private JButton mostrar;
	private JButton actualizar;
	private JButton eliminar;
	private JButton volver;

	public VentanaAdmin() {
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
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("imagen.png"));
		background = new JLabel(backgroundImage);
		background.setBounds(0, 0, 1000, 650);
		background.setLayout(null);
		this.add(background);

		panelCrear = new PanelCrear();
		panelCrear.setVisible(false);
		background.add(panelCrear);

		panelMostrar = new PanelMostrar();
		panelMostrar.setVisible(false);
		background.add(panelMostrar);

		panelActualizar = new PanelActualizar();
		panelActualizar.setVisible(false);
		background.add(panelActualizar);

		panelEliminar = new PanelEliminar();
		panelEliminar.setVisible(false);
		background.add(panelEliminar);

		crear = new JButton("CREAR");
		crear.setBounds(80, 162, 150, 30);
		crear.setBorderPainted(false);
		crear.setLayout(null);
		crear.setFont(new Font("Georgia", Font.BOLD, 12));
		crear.setBackground(Color.decode("#cca881"));
		crear.setForeground(Color.black);
		background.add(crear);

		mostrar = new JButton("MOSTRAR");
		mostrar.setBounds(245, 162, 150, 30);
		mostrar.setBorderPainted(false);
		mostrar.setLayout(null);
		mostrar.setFont(new Font("Georgia", Font.BOLD, 12));
		mostrar.setBackground(Color.decode("#cca881"));
		mostrar.setForeground(Color.black);
		background.add(mostrar);

		actualizar = new JButton("ACTUALIZAR");
		actualizar.setBounds(405, 162, 200, 30);
		actualizar.setBorderPainted(false);
		actualizar.setLayout(null);
		actualizar.setFont(new Font("Georgia", Font.BOLD, 12));
		actualizar.setBackground(Color.decode("#cca881"));
		actualizar.setForeground(Color.black);
		background.add(actualizar);

		eliminar = new JButton("ELIMINAR");
		eliminar.setBounds(615, 162, 150, 30);
		eliminar.setBorderPainted(false);
		eliminar.setLayout(null);
		eliminar.setFont(new Font("Georgia", Font.BOLD, 12));
		eliminar.setBackground(Color.decode("#cca881"));
		eliminar.setForeground(Color.black);
		background.add(eliminar);

		volver = new JButton("VOLVER");
		volver.setBounds(780, 162, 150, 30);
		volver.setBorderPainted(false);
		volver.setLayout(null);
		volver.setFont(new Font("Georgia", Font.BOLD, 12));
		volver.setBackground(Color.decode("#cca881"));
		volver.setForeground(Color.black);
		background.add(volver);
	}

	public PanelCrear getPanelCrear() {
		return panelCrear;
	}

	public void setPanelCrear(PanelCrear panelCrear) {
		this.panelCrear = panelCrear;
	}

	public JButton getCrear() {
		return crear;
	}

	public void setCrear(JButton crear) {
		this.crear = crear;
	}

	public JButton getMostrar() {
		return mostrar;
	}

	public void setMostrar(JButton mostrar) {
		this.mostrar = mostrar;
	}

	public JButton getActualizar() {
		return actualizar;
	}

	public void setActualizar(JButton actualizar) {
		this.actualizar = actualizar;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
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

	public PanelActualizar getPanelActualizar() {
		return panelActualizar;
	}

	public void setPanelActualizar(PanelActualizar panelActualizar) {
		this.panelActualizar = panelActualizar;
	}

	public PanelEliminar getPanelEliminar() {
		return panelEliminar;
	}

	public void setPanelEliminar(PanelEliminar panelEliminar) {
		this.panelEliminar = panelEliminar;
	}

}
