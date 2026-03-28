package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaAdmin extends JFrame {
	
	private PanelCrear panelCrear;
	
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
		this.setBounds(250, 30, 980, 550);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#fff4e4"));

		panelCrear = new PanelCrear();
		panelCrear.setVisible(true);
		
		add(panelCrear);
		

	}
}
