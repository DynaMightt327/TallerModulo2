package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaAdmin extends JFrame {
	
	private PanelCrear panelCrear;
	
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
		panelCrear.setVisible(true);
		add(panelCrear);
		
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
	}
}
