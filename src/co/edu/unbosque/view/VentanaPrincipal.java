package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame {
	
	private JLabel background;
	private JButton bAdmin;
	private JButton bVeterinario;
	private JButton bCliente;

	public VentanaPrincipal() {
		initcomps();
		setVisible(true);
	}

	public void initcomps() {
		//====CONFIGURACION DE LA VENTANA====
		this.setTitle("Chupiveterinaria");
		this.setBounds(250, 30, 980, 550);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#fff4e4"));

		//====IMAGEN DE FONDO====
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("image.png"));
		background = new JLabel(backgroundImage);
		background.setBounds(0, 5, 980, 500);
		background.setLayout(null);
		this.add(background);
		
		//====BOTONES DE INGRESO====
		bAdmin = new JButton("Administrador");
		bAdmin.setBounds(235, 360, 140, 30);
		bAdmin.setBorderPainted(false);
		bAdmin.setForeground(Color.decode("#060b37"));
		background.add(bAdmin);
		
		bVeterinario = new JButton("Veterinario");
		bVeterinario.setBounds(425, 360, 140, 30);
		bVeterinario.setBorderPainted(false);
		bVeterinario.setForeground(Color.decode("#060b37"));
		background.add(bVeterinario);
		
		bCliente = new JButton("Cliente");
		bCliente.setBounds(635, 360, 140, 30);
		bCliente.setBorderPainted(false);
		bCliente.setForeground(Color.decode("#060b37"));
		background.add(bCliente);
		
	}

	public JButton getbAdmin() {
		return bAdmin;
	}

	public void setbAdmin(JButton bAdmin) {
		this.bAdmin = bAdmin;
	}

	public JButton getbVeterinario() {
		return bVeterinario;
	}

	public void setbVeterinario(JButton bVeterinario) {
		this.bVeterinario = bVeterinario;
	}

	public JButton getbCliente() {
		return bCliente;
	}

	public void setbCliente(JButton bCliente) {
		this.bCliente = bCliente;
	}
	
	

}
