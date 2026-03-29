package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

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
		this.setBounds(250, 30, 1000, 650);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#fff4e4"));

		//====IMAGEN DE FONDO====
		ImageIcon backgroundImage = new ImageIcon(getClass().getResource("chupiveterinaria.png"));
		background = new JLabel(backgroundImage);
		background.setBounds(0, 0, 1000, 650);
		background.setLayout(null);
		this.add(background);
		
		//====BOTONES DE INGRESO====
		bAdmin = new JButton("ADMINISTRATIVO");
		bAdmin.setBounds(200, 385, 168, 45);
		bAdmin.setBorderPainted(false);
		bAdmin.setLayout(null);
		bAdmin.setFont(new Font("Georgia", Font.BOLD, 12));
		bAdmin.setBackground(Color.decode("#eba66e"));
		bAdmin.setForeground(Color.black);
		background.add(bAdmin);
		
		bVeterinario = new JButton("VETERINARIO");
		bVeterinario.setBounds(425, 375, 140, 60);
		bVeterinario.setBorderPainted(false);
		bVeterinario.setLayout(null);
		bVeterinario.setFont(new Font("Georgia", Font.BOLD, 12));
		bVeterinario.setBackground(Color.decode("#eba66e"));
		bVeterinario.setForeground(Color.black);
		background.add(bVeterinario);
		
		bCliente = new JButton("CLIENTE");
		bCliente.setBounds(644, 375, 140, 60);
		bCliente.setBorderPainted(false);
		bCliente.setLayout(null);
		bCliente.setFont(new Font("Georgia", Font.BOLD, 12));
		bCliente.setBackground(Color.decode("#eba66e"));
		bCliente.setForeground(Color.black);
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
