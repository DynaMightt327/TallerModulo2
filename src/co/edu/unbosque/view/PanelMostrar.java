package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
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
	
	private JPanel opcionInvalida;
	private JButton aceptar;

	public PanelMostrar() {
		initComps();
		setVisible(false);
	}

	public void initComps() {
		this.setBounds(60, 217, 870, 375);
		this.setLayout(null);
		this.setBackground(Color.decode("#80665c"));
		
		opcionInvalida = new JPanel();
		opcionInvalida.setBounds(310, 15, 250, 350);
		opcionInvalida.setBackground(Color.decode("#80665c"));
		opcionInvalida.setLayout(null);
		opcionInvalida.setVisible(false);
		add(opcionInvalida);
		
		ImageIcon imageLogo = new ImageIcon(getClass().getResource("warning.JPG"));
		JLabel lIcon = new JLabel(imageLogo);
		lIcon.setBounds(0, -80, 250, 450);
		opcionInvalida.add(lIcon);
		
		aceptar = new JButton("ACEPTAR");
		aceptar.setBounds(75, 310, 110, 30);
		aceptar.setBorderPainted(false);
		aceptar.setLayout(null);
		aceptar.setFont(new Font("Georgia", Font.BOLD, 12));
		aceptar.setBackground(Color.decode("#e1c8ad"));
		aceptar.setForeground(Color.black);
		opcionInvalida.add(aceptar);
		
		tipo = new JLabel("Seleccione que desea crear:");
		tipo.setBounds(20, 15, 300, 30);
		tipo.setFont(new Font("Agency FB", Font.BOLD, 22));
		tipo.setForeground(Color.decode("#f6efe7"));
		add(tipo);
		
		cmbTipo = new JComboBox<String>(new String[] { "...", "Persona", "Mascota", "Producto" });
		cmbTipo.setBounds(30, 50, 164, 32);
		cmbTipo.setFont(new Font("Agency FB", Font.BOLD, 18));
		cmbTipo.setForeground(Color.decode("#111d15"));
		cmbTipo.setBackground(Color.decode("#e1c8ad"));
		cmbTipo.setBorder(null);
		add(cmbTipo);
		
		persona = new JLabel("Tipo de persona:");
		persona.setBounds(235, 15, 150, 30);
		persona.setFont(new Font("Agency FB", Font.BOLD, 22));
		persona.setForeground(Color.decode("#f6efe7"));
		add(persona);
		
		cmbPersona = new JComboBox<String>(new String[] { "...", "Administrativo", "Veterinario", "Cliente" });
		cmbPersona.setBounds(240, 50, 164, 32);
		cmbPersona.setFont(new Font("Agency FB", Font.BOLD, 18));
		cmbPersona.setForeground(Color.decode("#111d15"));
		cmbPersona.setBackground(Color.decode("#e1c8ad"));
		cmbPersona.setBorder(null);
		add(cmbPersona);
		
		mascota = new JLabel("Tipo de mascota:");
		mascota.setBounds(235, 15, 150, 30);
		mascota.setFont(new Font("Agency FB", Font.BOLD, 22));
		mascota.setForeground(Color.decode("#f6efe7"));
		add(mascota);
		
		cmbMascota = new JComboBox<String>(new String[] { "...", "Ave", "Mamífero", "Pez", "Reptil" });
		cmbMascota.setBounds(240, 50, 164, 32);
		cmbMascota.setFont(new Font("Agency FB", Font.BOLD, 18));
		cmbMascota.setForeground(Color.decode("#111d15"));
		cmbMascota.setBackground(Color.decode("#e1c8ad"));
		cmbMascota.setBorder(null);
		add(cmbMascota);
		
		producto = new JLabel("Tipo de producto:");
		producto.setBounds(235, 15, 150, 30);
		producto.setFont(new Font("Agency FB", Font.BOLD, 22));
		producto.setForeground(Color.decode("#f6efe7"));
		add(producto);
		
		cmbProducto = new JComboBox<String>(new String[] { "...", "Medicamento", "Juguete"});
		cmbProducto.setBounds(240, 50, 164, 32);
		cmbProducto.setFont(new Font("Agency FB", Font.BOLD, 18));
		cmbProducto.setForeground(Color.decode("#111d15"));
		cmbProducto.setBackground(Color.decode("#e1c8ad"));
		cmbProducto.setBorder(null);
		add(cmbProducto);

		//tabla de admin
		String[] columnas = { "Nombre", "Apellido", "Género", "Documento", "Correo", "Telefono", "Salario", "Area", "Horario", "# empleados" };
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		tablaAdmin = new JTable(modelo);
		tablaAdmin.setBackground(Color.decode("#e1c8ad"));
		JScrollPane scroll = new JScrollPane(tablaAdmin);
		scroll.setBounds(20, 100, 830, 255);
		scroll.setBackground(Color.decode("#e1c8ad"));
		add(scroll);
		
		//tabla de veterinario
		String[] columnas1 = { "Nombre", "Apellido", "Género", "Documento", "Correo", "Telefono", "Cargo", "Salario", "Horas trabajo", "# licencia" };
		DefaultTableModel modelo1 = new DefaultTableModel(columnas1, 0);
		tablaVet = new JTable(modelo1);
		tablaVet.setBackground(Color.decode("#e1c8ad"));
		JScrollPane scroll1 = new JScrollPane(tablaVet);
		scroll1.setBounds(20, 100, 830, 255);
		scroll1.setBackground(Color.decode("#e1c8ad"));
		add(scroll1);
		
		//tabla de cliente
		String[] columnas2 = { "Nombre", "Apellido", "Género", "Documento", "Correo", "Telefono", "Mascota", "Razon visita", "Cliente nuevo?"};
		DefaultTableModel modelo2 = new DefaultTableModel(columnas2, 0);
		tablaCliente = new JTable(modelo2);
		tablaCliente.setBackground(Color.decode("#e1c8ad"));
		JScrollPane scroll2 = new JScrollPane(tablaCliente);
		scroll2.setBounds(20, 100, 830, 255);
		scroll2.setBackground(Color.decode("#e1c8ad"));
		add(scroll2);
		
		//tabla de ave
		String[] columnas3 = { "Nombre", "Especie", "Habitat", "Alimento", "Peso", "Altura", "Edad", "Pata", "Color pluma", "Huevos", "Tamaño pico", "Migratoria?"};
		DefaultTableModel modelo3 = new DefaultTableModel(columnas3, 0);
		tablaAve = new JTable(modelo3);
		tablaAve.setBackground(Color.decode("#e1c8ad"));
		JScrollPane scroll3 = new JScrollPane(tablaAve);
		scroll3.setBounds(20, 100, 830, 255);
		scroll3.setBackground(Color.decode("#e1c8ad"));
		add(scroll3);
		//tabla de mamifero
		String[] columnas4 = { "Nombre", "Especie", "Habitat", "Alimento", "Peso", "Altura", "Edad", "Cantidad pelaje", "Color Pelaje", "Dientes", "Desplazamiento"};
		DefaultTableModel modelo4 = new DefaultTableModel(columnas4, 0);
		tablaMamifero = new JTable(modelo4);
		tablaMamifero.setBackground(Color.decode("#e1c8ad"));
		JScrollPane scroll4 = new JScrollPane(tablaMamifero);
		scroll4.setBounds(20, 100, 830, 255);
		scroll4.setBackground(Color.decode("#e1c8ad"));
		add(scroll4);

		//tabla de reptil
		String[] columnas5 = { "Nombre", "Especie", "Habitat", "Alimento", "Peso", "Altura", "Edad", "Desplazamiento", "Dientes", "Temperatura", "Venenoso?", "Ectoformo?"};
		DefaultTableModel modelo5 = new DefaultTableModel(columnas5, 0);
		tablaReptil = new JTable(modelo5);
		tablaReptil.setBackground(Color.decode("#e1c8ad"));
		JScrollPane scroll5 = new JScrollPane(tablaReptil);
		scroll5.setBounds(20, 100, 830, 255);
		scroll5.setBackground(Color.decode("#e1c8ad"));
		add(scroll5);
		//tabla de pez
		String[] columnas6 = { "Nombre", "Especie", "Habitat", "Alimento", "Peso", "Altura", "Edad", "Tipo Agua", "Color escamas", "Respiración", "Numero aletas", "Profundidad max"};
		DefaultTableModel modelo6 = new DefaultTableModel(columnas6, 0);
		tablaPez = new JTable(modelo6);
		tablaPez.setBackground(Color.decode("#e1c8ad"));
		JScrollPane scroll6 = new JScrollPane(tablaPez);
		scroll6.setBounds(20, 100, 830, 255);
		scroll6.setBackground(Color.decode("#e1c8ad"));
		add(scroll6);
		//tabla de juguete
		String[] columnas7 = { "Marca", "Precio", "Id Producto", "Nombre", "Color", "Tipo Juguete", "Garantia"};
		DefaultTableModel modelo7 = new DefaultTableModel(columnas7, 0);
		tablaJuguete = new JTable(modelo7);
		tablaJuguete.setBackground(Color.decode("#e1c8ad"));
		JScrollPane scroll7 = new JScrollPane(tablaJuguete);
		scroll7.setBounds(20, 100, 830, 255);
		scroll7.setBackground(Color.decode("#e1c8ad"));
		add(scroll7);
		//tabla de medicamentos
		String[] columnas8 = { "Marca", "Precio", "Id Producto", "Nombre comercial", "Nombre cientifico", "fecha caducidad", "disponible?", "dosis"};
		DefaultTableModel modelo8 = new DefaultTableModel(columnas8, 0);
		tablaMedicamento = new JTable(modelo8);
		tablaMedicamento.setBackground(Color.decode("#e1c8ad"));
		JScrollPane scroll8 = new JScrollPane(tablaMedicamento);
		scroll8.setBounds(20, 100, 830, 255);
		scroll8.setBackground(Color.decode("#e1c8ad"));
		add(scroll8);
		
		
	}

	public JButton getAceptar() {
		return aceptar;
	}

	public void setAceptar(JButton aceptar) {
		this.aceptar = aceptar;
	}

	public JPanel getOpcionInvalida() {
		return opcionInvalida;
	}

	public void setOpcionInvalida(JPanel opcionInvalida) {
		this.opcionInvalida = opcionInvalida;
	}

	public JButton getSelecPersona() {
		return selecPersona;
	}

	public void setSelecPersona(JButton selecPersona) {
		this.selecPersona = selecPersona;
	}

	public JButton getmAdmin() {
		return mAdmin;
	}

	public void setmAdmin(JButton mAdmin) {
		this.mAdmin = mAdmin;
	}

	public JButton getmVet() {
		return mVet;
	}

	public void setmVet(JButton mVet) {
		this.mVet = mVet;
	}

	public JButton getmCliente() {
		return mCliente;
	}

	public void setmCliente(JButton mCliente) {
		this.mCliente = mCliente;
	}

	public JButton getSelectMascota() {
		return selectMascota;
	}

	public void setSelectMascota(JButton selectMascota) {
		this.selectMascota = selectMascota;
	}

	public JButton getmAve() {
		return mAve;
	}

	public void setmAve(JButton mAve) {
		this.mAve = mAve;
	}

	public JButton getmMamifero() {
		return mMamifero;
	}

	public void setmMamifero(JButton mMamifero) {
		this.mMamifero = mMamifero;
	}

	public JButton getmPez() {
		return mPez;
	}

	public void setmPez(JButton mPez) {
		this.mPez = mPez;
	}

	public JButton getmReptil() {
		return mReptil;
	}

	public void setmReptil(JButton mReptil) {
		this.mReptil = mReptil;
	}

	public JButton getSelecProducto() {
		return selecProducto;
	}

	public void setSelecProducto(JButton selecProducto) {
		this.selecProducto = selecProducto;
	}

	public JButton getmJuguete() {
		return mJuguete;
	}

	public void setmJuguete(JButton mJuguete) {
		this.mJuguete = mJuguete;
	}

	public JButton getmMedicamento() {
		return mMedicamento;
	}

	public void setmMedicamento(JButton mMedicamento) {
		this.mMedicamento = mMedicamento;
	}

	public JTable getTablaAdmin() {
		return tablaAdmin;
	}

	public void setTablaAdmin(JTable tablaAdmin) {
		this.tablaAdmin = tablaAdmin;
	}

	public JTable getTablaVet() {
		return tablaVet;
	}

	public void setTablaVet(JTable tablaVet) {
		this.tablaVet = tablaVet;
	}

	public JTable getTablaCliente() {
		return tablaCliente;
	}

	public void setTablaCliente(JTable tablaCliente) {
		this.tablaCliente = tablaCliente;
	}

	public JTable getTablaAve() {
		return tablaAve;
	}

	public void setTablaAve(JTable tablaAve) {
		this.tablaAve = tablaAve;
	}

	public JTable getTablaMamifero() {
		return tablaMamifero;
	}

	public void setTablaMamifero(JTable tablaMamifero) {
		this.tablaMamifero = tablaMamifero;
	}

	public JTable getTablaReptil() {
		return tablaReptil;
	}

	public void setTablaReptil(JTable tablaReptil) {
		this.tablaReptil = tablaReptil;
	}

	public JTable getTablaPez() {
		return tablaPez;
	}

	public void setTablaPez(JTable tablaPez) {
		this.tablaPez = tablaPez;
	}

	public JTable getTablaJuguete() {
		return tablaJuguete;
	}

	public void setTablaJuguete(JTable tablaJuguete) {
		this.tablaJuguete = tablaJuguete;
	}

	public JTable getTablaMedicamento() {
		return tablaMedicamento;
	}

	public void setTablaMedicamento(JTable tablaMedicamento) {
		this.tablaMedicamento = tablaMedicamento;
	}

	public JLabel getTipo() {
		return tipo;
	}

	public void setTipo(JLabel tipo) {
		this.tipo = tipo;
	}

	public JComboBox<String> getCmbTipo() {
		return cmbTipo;
	}

	public void setCmbTipo(JComboBox<String> cmbTipo) {
		this.cmbTipo = cmbTipo;
	}

	public JLabel getPersona() {
		return persona;
	}

	public void setPersona(JLabel persona) {
		this.persona = persona;
	}

	public JComboBox<String> getCmbPersona() {
		return cmbPersona;
	}

	public void setCmbPersona(JComboBox<String> cmbPersona) {
		this.cmbPersona = cmbPersona;
	}

	public JLabel getMascota() {
		return mascota;
	}

	public void setMascota(JLabel mascota) {
		this.mascota = mascota;
	}

	public JComboBox<String> getCmbMascota() {
		return cmbMascota;
	}

	public void setCmbMascota(JComboBox<String> cmbMascota) {
		this.cmbMascota = cmbMascota;
	}

	public JLabel getProducto() {
		return producto;
	}

	public void setProducto(JLabel producto) {
		this.producto = producto;
	}

	public JComboBox<String> getCmbProducto() {
		return cmbProducto;
	}

	public void setCmbProducto(JComboBox<String> cmbProducto) {
		this.cmbProducto = cmbProducto;
	}

}
