package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaVet extends JFrame{
	
	public VentanaVet() {
		initcomps();
		setVisible(false);
	}
	
	public void initcomps() {
		//====CONFIGURACION DE LA VENTANA====
		this.setTitle("Chupiveterinaria");
		this.setBounds(250, 30, 980, 550);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#fff4e4"));
	}

}
