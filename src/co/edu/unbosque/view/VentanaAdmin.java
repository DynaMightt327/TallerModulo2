package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaAdmin extends JFrame {
	
	private PanelCrear panelCrear;
	private PanelMostrar panelMostrar;
	private PanelActualizar panelActualizar;
	private PanelEliminar panelEliminar;
	
	private JButton crear;
	private JButton mostrar;
	private JButton actualizar;
	private JButton eliminar;
	private JButton volver;
	
	private JPanel banner;
	private JLabel titulo;
	
	public VentanaAdmin() {
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

		panelCrear = new PanelCrear();
		panelCrear.setVisible(false);
		add(panelCrear);
		
		panelMostrar = new PanelMostrar();
		panelMostrar.setVisible(false);
		add(panelMostrar);
		
		panelActualizar = new PanelActualizar();
		panelActualizar.setVisible(false);
		add(panelActualizar);
		
		panelEliminar = new PanelEliminar();
		panelEliminar.setVisible(false);
		add(panelEliminar);
		
		crear = new JButton("Crear");
		crear.setBounds(15, 190, 140, 30);
		crear.setBorderPainted(false);
		crear.setForeground(Color.decode("#060b37"));
		add(crear);
		
		mostrar = new JButton("Mostrar");
		mostrar.setBounds(15, 230, 140, 30);
		mostrar.setBorderPainted(false);
		mostrar.setForeground(Color.decode("#060b37"));
		add(mostrar);
		
		actualizar = new JButton("Actualizar");
		actualizar.setBounds(15, 270, 140, 30);
		actualizar.setBorderPainted(false);
		actualizar.setForeground(Color.decode("#060b37"));
		add(actualizar);
		
		eliminar = new JButton("Eliminar");
		eliminar.setBounds(15, 310, 140, 30);
		eliminar.setBorderPainted(false);
		eliminar.setForeground(Color.decode("#060b37"));
		add(eliminar);
		
		volver = new JButton("Volver");
		volver.setBounds(15, 350, 140, 30);
		volver.setBorderPainted(false);
		volver.setForeground(Color.decode("#060b37"));
		add(volver);
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
