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
		this.setBounds(60, 217, 870, 375);
		this.setLayout(null);
		this.setBackground(Color.decode("#80665c"));
		
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
		scroll.setBounds(20, 100, 780, 255);
		scroll.setBackground(Color.WHITE);
		add(scroll);
		
		//tabla de veterinario
		String[] columnas1 = { "Nombre", "Apellido", "Género", "Documento", "Correo", "Telefono", "Cargo", "Salario", "Horas trabajo", "# licencia" };
		DefaultTableModel modelo1 = new DefaultTableModel(columnas1, 0);
		tablaVet = new JTable(modelo1);
		JScrollPane scroll1 = new JScrollPane(tablaVet);
		scroll1.setBounds(20, 100, 780, 255);
		scroll1.setBackground(Color.WHITE);
		add(scroll1);
		
		//tabla de cliente
		String[] columnas2 = { "Nombre", "Apellido", "Género", "Documento", "Correo", "Telefono", "Mascota", "Razon visita", "Cliente nuevo?"};
		DefaultTableModel modelo2 = new DefaultTableModel(columnas2, 0);
		tablaCliente = new JTable(modelo2);
		JScrollPane scroll2 = new JScrollPane(tablaCliente);
		scroll2.setBounds(20, 100, 780, 255);
		scroll2.setBackground(Color.WHITE);
		add(scroll2);
		
		//tabla de ave
		String[] columnas3 = { "Nombre", "Especie", "Habitat", "Alimento", "Peso", "Altura", "Edad", "Pata", "Color pluma", "Huevos", "Tamaño pico", "Migratoria?"};
		DefaultTableModel modelo3 = new DefaultTableModel(columnas3, 0);
		tablaAve = new JTable(modelo3);
		JScrollPane scroll3 = new JScrollPane(tablaAve);
		scroll3.setBounds(20, 100, 780, 255);
		scroll3.setBackground(Color.WHITE);
		add(scroll3);
		//tabla de mamifero
		String[] columnas4 = { "Nombre", "Especie", "Habitat", "Alimento", "Peso", "Altura", "Edad", "Cantidad pelaje", "Color Pelaje", "Dientes", "Desplazamiento"};
		DefaultTableModel modelo4 = new DefaultTableModel(columnas4, 0);
		tablaMamifero = new JTable(modelo4);
		JScrollPane scroll4 = new JScrollPane(tablaMamifero);
		scroll4.setBounds(20, 100, 780, 255);
		scroll4.setBackground(Color.WHITE);
		add(scroll4);

		//tabla de reptil
		String[] columnas5 = { "Nombre", "Especie", "Habitat", "Alimento", "Peso", "Altura", "Edad", "Desplazamiento", "Dientes", "Temperatura", "Venenoso?", "Ectoformo?"};
		DefaultTableModel modelo5 = new DefaultTableModel(columnas5, 0);
		tablaReptil = new JTable(modelo5);
		JScrollPane scroll5 = new JScrollPane(tablaReptil);
		scroll5.setBounds(20, 100, 780, 255);
		scroll5.setBackground(Color.WHITE);
		add(scroll5);
		//tabla de pez
		String[] columnas6 = { "Nombre", "Especie", "Habitat", "Alimento", "Peso", "Altura", "Edad", "Tipo Agua", "Color escamas", "Respiración", "Numero aletas", "Profundidad max"};
		DefaultTableModel modelo6 = new DefaultTableModel(columnas6, 0);
		tablaPez = new JTable(modelo6);
		JScrollPane scroll6 = new JScrollPane(tablaPez);
		scroll6.setBounds(20, 100, 780, 255);
		scroll6.setBackground(Color.WHITE);
		add(scroll6);
		//tabla de juguete
		String[] columnas7 = { "Marca", "Precio", "Id Producto", "Nombre", "Color", "Tipo Juguete", "Garantia"};
		DefaultTableModel modelo7 = new DefaultTableModel(columnas7, 0);
		tablaJuguete = new JTable(modelo7);
		JScrollPane scroll7 = new JScrollPane(tablaJuguete);
		scroll7.setBounds(20, 100, 780, 255);
		scroll7.setBackground(Color.WHITE);
		add(scroll7);
		//tabla de medicamentos
		String[] columnas8 = { "Marca", "Precio", "Id Producto", "Nombre comercial", "Nombre cientifico", "fecha caducidad", "disponible?", "dosis"};
		DefaultTableModel modelo8 = new DefaultTableModel(columnas8, 0);
		tablaMedicamento = new JTable(modelo8);
		JScrollPane scroll8 = new JScrollPane(tablaMedicamento);
		scroll8.setBounds(20, 100, 780, 255);
		scroll8.setBackground(Color.WHITE);
		add(scroll8);
		
		
	}

}
