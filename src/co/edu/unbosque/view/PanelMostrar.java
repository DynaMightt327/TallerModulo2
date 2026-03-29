package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelMostrar extends JPanel {

	// seleccionar que se desea mostrar
	private JButton selecPersona;
	private JButton mAdmin;
	private JButton mVet;
	private JButton mCliente;

	private JButton selectMascota;
	private JButton mAve;
	private JButton mMamifero;
	private JButton mPez;
	private JButton mReptil;

	private JButton selecProducto;
	private JButton mJuguete;
	private JButton mMedicamento;

	private JTable tablaAdmin;
	private JTable tablaVet;
	private JTable tablaCliente;
	private JTable tablaAve;
	private JTable tablaMamifero;
	private JTable tablaReptil;
	private JTable tablaPez;
	private JTable tablaJuguete;
	private JTable tablaMedicamento;
	
	private JLabel tipo;
	private JComboBox<String> cmbTipo;
	private JLabel persona;
	private JComboBox<String> cmbPersona;
	private JLabel mascota;
	private JComboBox<String> cmbMascota;
	private JLabel producto;
	private JComboBox<String> cmbProducto;

	public PanelMostrar() {
		initComps();
		setVisible(false);
	}

	public void initComps() {
		this.setBounds(170, 120, 780, 375);
		this.setLayout(null);
		this.setBackground(Color.decode("#6d4c41"));
		
		tipo = new JLabel("Seleccione que desea crear:");
		tipo.setBounds(20, 15, 300, 30);
		tipo.setFont(new Font("Agency FB", Font.BOLD, 22));
		tipo.setForeground(Color.decode("#111d15"));
		add(tipo);
		
		cmbTipo = new JComboBox<String>(new String[] { "...", "Persona", "Mascota", "Producto" });
		cmbTipo.setBounds(30, 50, 164, 32);
		cmbTipo.setFont(new Font("Agency FB", Font.BOLD, 18));
		cmbTipo.setForeground(Color.decode("#111d15"));
		cmbTipo.setBackground(Color.decode("#e0ebe0"));
		cmbTipo.setBorder(null);
		add(cmbTipo);
		
		persona = new JLabel("Tipo de persona:");
		persona.setBounds(235, 15, 150, 30);
		persona.setFont(new Font("Agency FB", Font.BOLD, 22));
		persona.setForeground(Color.decode("#111d15"));
		add(persona);
		
		cmbPersona = new JComboBox<String>(new String[] { "...", "Administrativo", "Veterinario", "Cliente" });
		cmbPersona.setBounds(240, 50, 164, 32);
		cmbPersona.setFont(new Font("Agency FB", Font.BOLD, 18));
		cmbPersona.setForeground(Color.decode("#111d15"));
		cmbPersona.setBackground(Color.decode("#e0ebe0"));
		cmbPersona.setBorder(null);
		add(cmbPersona);
		
		mascota = new JLabel("Tipo de mascota:");
		mascota.setBounds(235, 15, 150, 30);
		mascota.setFont(new Font("Agency FB", Font.BOLD, 22));
		mascota.setForeground(Color.decode("#111d15"));
		add(mascota);
		
		cmbMascota = new JComboBox<String>(new String[] { "...", "Ave", "Mamífero", "Pez", "Reptil" });
		cmbMascota.setBounds(240, 50, 164, 32);
		cmbMascota.setFont(new Font("Agency FB", Font.BOLD, 18));
		cmbMascota.setForeground(Color.decode("#111d15"));
		cmbMascota.setBackground(Color.decode("#e0ebe0"));
		cmbMascota.setBorder(null);
		add(cmbMascota);
		
		producto = new JLabel("Tipo de producto:");
		producto.setBounds(235, 15, 150, 30);
		producto.setFont(new Font("Agency FB", Font.BOLD, 22));
		producto.setForeground(Color.decode("#111d15"));
		add(producto);
		
		cmbProducto = new JComboBox<String>(new String[] { "...", "Medicamento", "Juguete"});
		cmbProducto.setBounds(240, 50, 164, 32);
		cmbProducto.setFont(new Font("Agency FB", Font.BOLD, 18));
		cmbProducto.setForeground(Color.decode("#111d15"));
		cmbProducto.setBackground(Color.decode("#e0ebe0"));
		cmbProducto.setBorder(null);
		add(cmbProducto);

		//tabla de admin
		String[] columnas = { "Nombre", "Apellido", "Género", "Documento", "Correo", "Telefono", "Salario", "Area", "Horario", "# empleados" };
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		tablaAdmin = new JTable(modelo);
		JScrollPane scroll = new JScrollPane(tablaAdmin);
		scroll.setBounds(45, 100, 690, 200);
		scroll.setBackground(Color.WHITE);
		add(scroll);
		
		String[] columnas1 = { "Nombre", "Apellido", "Género", "Documento", "Correo", "Telefono" };
		DefaultTableModel modelo1 = new DefaultTableModel(columnas, 0);
		tablaAdmin = new JTable(modelo1);
		JScrollPane scroll1 = new JScrollPane(tablaVet);
		scroll1.setBounds(45, 100, 690, 200);
		scroll1.setBackground(Color.WHITE);
		add(scroll1);
		
		
	}

}
