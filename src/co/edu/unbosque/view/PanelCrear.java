package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCrear extends JPanel{
	//seleccionar que se desea crear
	private JLabel tipo;
	private JLabel persona;
	private JLabel mascota;
	private JLabel producto;
	
	private JComboBox<String> cmbTipo; 
	private JComboBox<String> cmbPersona;
	private JComboBox<String> cmbMascota;
	private JComboBox<String> cmbProducto;
	
	//labels de la info que se pide
	private JLabel nombre;
	private JLabel apellido;
	private JLabel genero;
	private JLabel documento;
	private JLabel correo;
	private JLabel telefono;
	private JLabel cargo;
	private JLabel salario;
	private JLabel horaTrabajo;
	private JLabel numLicencia;
	private JLabel areaAsignada;
	private JLabel horario;
	private JLabel numEmpleado;
	private JLabel nombreMascota;
	private JLabel razonVisita;
	private JLabel esClienteNuevo;
	
	private JLabel especie;
	private JLabel habitat;
	private JLabel tipoAlimento;
	private JLabel peso;
	private JLabel altura;
	private JLabel edad;
	private JLabel formaPata;
	private JLabel colorPluma;
	private JLabel cantidadHuevo;
	private JLabel tamanoPico;
	private JLabel esMigratoria;
	private JLabel cantidadPelaje;
	private JLabel colorPelaje;
	private JLabel tipoDiente;
	private JLabel numeroDiente;
	private JLabel medioDesplazamiento;
	private JLabel tipoDesplazamiento;
	private JLabel temperaturaCorporal;
	private JLabel esVenenoso;
	private JLabel esEctoformo;
	private JLabel tipoAgua;
	private JLabel colorEscama;
	private JLabel tipoRespiracion;
	private JLabel numeroAleta;
	private JLabel profundidadMaxima;
	
	private JLabel marca;
	private JLabel precio;
	private JLabel idProducto;
	private JLabel nombreComercial;
	private JLabel nombreCientifico;
	private JLabel fechaCaducidad;
	private JLabel estaDisponible;
	private JLabel dosis;
	private JLabel color;
	private JLabel tipoJuguete;
	private JLabel garantia;
	
	//campos de texto
	private JTextField tNombre;
	private JTextField tApellido;
	private JComboBox<String> tGenero;
	private JTextField tDocumento;
	private JTextField tCorreo;
	private JTextField tTelefono;
	private JComboBox<String> tCargo;
	private JTextField tSalario;
	private JTextField tHoraTrabajo;
	private JTextField tNumLicencia;
	private JComboBox<String> tAreaAsignada;
	private JComboBox<String> tHorario;
	private JTextField tNumEmpleado;
	private JTextField tNombreMascota;
	private JTextField tRazonVisita;
	private JComboBox<String> tEsClienteNuevo;
	
	private JTextField tEspecie;
	private JTextField tHabitat;
	private JTextField tTipoAlimento;
	private JTextField tPeso;
	private JTextField tAltura;
	private JTextField tEdad;
	private JComboBox<String> tFormaPata;
	private JTextField tColorPluma;
	private JTextField tCantidadHuevo;
	private JTextField tTamanoPico;
	private JComboBox<String> tEsMigratoria;
	private JComboBox<String> tCantidadPelaje;
	private JTextField tColorPelaje;
	private JComboBox<String> tTipoDiente;
	private JTextField tNumeroDiente;
	private JComboBox<String> tMedioDesplazamiento;
	private JComboBox<String> tTipoDesplazamiento;
	private JTextField tTemperaturaCorporal;
	private JComboBox<String> tEsVenenoso;
	private JComboBox<String> tEsEctoformo;
	private JComboBox<String> tTipoAgua;
	private JTextField tColorEscama;
	private JComboBox<String> tTipoRespiracion;
	private JTextField tNumeroAleta;
	private JTextField tProfundidadMaxima;
	
	private JTextField tMarca;
	private JTextField tPrecio;
	private JTextField tIdProducto;
	private JTextField tNombreComercial;
	private JTextField tNombreCientifico;
	private JTextField tFechaCaducidad;
	private JComboBox<String> tEstaDisponible;
	private JTextField tDosis;
	private JTextField tColor;
	private JComboBox<String> tTipoJuguete;
	private JComboBox<String> tGarantia;
	
	public PanelCrear() {
		initComps();
		setVisible(false);
	}
	
	public void initComps() {
		this.setBounds(115, 217, 780, 375);
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
		
		//campos para llenar info
		nombre = new JLabel("Nombre:");
		nombre.setBounds(25, 85, 150, 30);
		nombre.setFont(new Font("Agency FB", Font.BOLD, 22));
		nombre.setForeground(Color.decode("#111d15"));
		add(nombre);
		
		tNombre = new JTextField();
		tNombre.setBounds(30, 115, 164, 32);
		tNombre.setFont(new Font("Agency FB", Font.BOLD, 18));
		tNombre.setForeground(Color.decode("#111d15"));
		tNombre.setBackground(Color.decode("#e0ebe0"));
		tNombre.setBorder(null);
		add(tNombre);
		
		apellido = new JLabel("Apellido:");
		apellido.setBounds(235, 85, 150, 30);
		apellido.setFont(new Font("Agency FB", Font.BOLD, 22));
		apellido.setForeground(Color.decode("#111d15"));
		add(apellido);
		
		tApellido = new JTextField();
		tApellido.setBounds(240, 115, 164, 32);
		tApellido.setFont(new Font("Agency FB", Font.BOLD, 18));
		tApellido.setForeground(Color.decode("#111d15"));
		tApellido.setBackground(Color.decode("#e0ebe0"));
		tApellido.setBorder(null);
		add(tApellido);
		
		genero = new JLabel("Género:");
		genero.setBounds(440, 85, 150, 30);
		genero.setFont(new Font("Agency FB", Font.BOLD, 22));
		genero.setForeground(Color.decode("#111d15"));
		add(genero);
		
		tGenero = new JComboBox<String>(new String[] { "...", "Femenino", "Masculino"});
		tGenero.setBounds(445, 115, 164, 32);
		tGenero.setFont(new Font("Agency FB", Font.BOLD, 18));
		tGenero.setForeground(Color.decode("#111d15"));
		tGenero.setBackground(Color.decode("#e0ebe0"));
		tGenero.setBorder(null);
		add(tGenero);
		
		documento = new JLabel("Documento:");
		documento.setBounds(25, 150, 150, 30);
		documento.setFont(new Font("Agency FB", Font.BOLD, 22));
		documento.setForeground(Color.decode("#111d15"));
		add(documento);
		
		tDocumento = new JTextField();
		tDocumento.setBounds(30, 180, 164, 32);
		tDocumento.setFont(new Font("Agency FB", Font.BOLD, 18));
		tDocumento.setForeground(Color.decode("#111d15"));
		tDocumento.setBackground(Color.decode("#e0ebe0"));
		tDocumento.setBorder(null);
		add(tDocumento);
		
		correo = new JLabel("Correo:");
		correo.setBounds(235, 150, 150, 30);
		correo.setFont(new Font("Agency FB", Font.BOLD, 22));
		correo.setForeground(Color.decode("#111d15"));
		add(correo);
		
		tCorreo = new JTextField();
		tCorreo.setBounds(240, 180, 164, 32);
		tCorreo.setFont(new Font("Agency FB", Font.BOLD, 18));
		tCorreo.setForeground(Color.decode("#111d15"));
		tCorreo.setBackground(Color.decode("#e0ebe0"));
		tCorreo.setBorder(null);
		add(tCorreo);
		
		telefono = new JLabel("Telefono:");
		telefono.setBounds(440, 150, 150, 30);
		telefono.setFont(new Font("Agency FB", Font.BOLD, 22));
		telefono.setForeground(Color.decode("#111d15"));
		add(telefono);
		
		tTelefono = new JTextField();
		tTelefono.setBounds(445, 180, 164, 32);
		tTelefono.setFont(new Font("Agency FB", Font.BOLD, 18));
		tTelefono.setForeground(Color.decode("#111d15"));
		tTelefono.setBackground(Color.decode("#e0ebe0"));
		tTelefono.setBorder(null);
		add(tTelefono);
		//admin y vet
		salario = new JLabel("Salario:");
		salario.setBounds(25, 215, 150, 30);
		salario.setFont(new Font("Agency FB", Font.BOLD, 22));
		salario.setForeground(Color.decode("#111d15"));
		add(salario);
		
		tSalario = new JTextField();
		tSalario.setBounds(30, 245, 164, 32);
		tSalario.setFont(new Font("Agency FB", Font.BOLD, 18));
		tSalario.setForeground(Color.decode("#111d15"));
		tSalario.setBackground(Color.decode("#e0ebe0"));
		tSalario.setBorder(null);
		add(tSalario);
		//admiiin
		areaAsignada = new JLabel("Área asignada:");
		areaAsignada.setBounds(235, 215, 150, 30);
		areaAsignada.setFont(new Font("Agency FB", Font.BOLD, 22));
		areaAsignada.setForeground(Color.decode("#111d15"));
		add(areaAsignada);
		
		tAreaAsignada = new JComboBox<String>(new String[] { "...", "Gestion contable", "Logistica", "Atencion al cliente", "Proveedores", "Archivo"});
		tAreaAsignada.setBounds(240, 245, 164, 32);
		tAreaAsignada.setFont(new Font("Agency FB", Font.BOLD, 18));
		tAreaAsignada.setForeground(Color.decode("#111d15"));
		tAreaAsignada.setBackground(Color.decode("#e0ebe0"));
		tAreaAsignada.setBorder(null);
		add(tAreaAsignada);

		horario = new JLabel("Horario:");
		horario.setBounds(440, 215, 150, 30);
		horario.setFont(new Font("Agency FB", Font.BOLD, 22));
		horario.setForeground(Color.decode("#111d15"));
		add(horario);
		
		tHorario = new JComboBox<String>(new String[] { "...", "6am - 2pm", "2pm - 10pm", "10pm - 6am"});
		tHorario.setBounds(445, 245, 164, 32);
		tHorario.setFont(new Font("Agency FB", Font.BOLD, 18));
		tHorario.setForeground(Color.decode("#111d15"));
		tHorario.setBackground(Color.decode("#e0ebe0"));
		tHorario.setBorder(null);
		add(tHorario);

		numEmpleado = new JLabel("Numero de empleados:");
		numEmpleado.setBounds(25, 280, 180, 30);
		numEmpleado.setFont(new Font("Agency FB", Font.BOLD, 22));
		numEmpleado.setForeground(Color.decode("#111d15"));
		add(numEmpleado);
		
		tNumEmpleado = new JTextField();
		tNumEmpleado.setBounds(30, 310, 164, 32);
		tNumEmpleado.setFont(new Font("Agency FB", Font.BOLD, 18));
		tNumEmpleado.setForeground(Color.decode("#111d15"));
		tNumEmpleado.setBackground(Color.decode("#e0ebe0"));
		tNumEmpleado.setBorder(null);
		add(tNumEmpleado);
		//vet
		cargo = new JLabel("Cargo:");
		cargo.setBounds(235, 215, 150, 30);
		cargo.setFont(new Font("Agency FB", Font.BOLD, 22));
		cargo.setForeground(Color.decode("#111d15"));
		add(cargo);
		
		tCargo = new JComboBox<String>(new String[] { "...", "Cirujano", "Dermatologia", "Oncologia", "Cardiologia", "Anestesiologia", "Odontologia", "Cuidados criticos"});
		tCargo.setBounds(240, 245, 164, 32);
		tCargo.setFont(new Font("Agency FB", Font.BOLD, 18));
		tCargo.setForeground(Color.decode("#111d15"));
		tCargo.setBackground(Color.decode("#e0ebe0"));
		tCargo.setBorder(null);
		add(tCargo);
	
		horaTrabajo = new JLabel("Horas de trabajo:");
		horaTrabajo.setBounds(440, 215, 150, 30);
		horaTrabajo.setFont(new Font("Agency FB", Font.BOLD, 22));
		horaTrabajo.setForeground(Color.decode("#111d15"));
		add(horaTrabajo);
		
		tHoraTrabajo = new JTextField();
		tHoraTrabajo.setBounds(445, 245, 164, 32);
		tHoraTrabajo.setFont(new Font("Agency FB", Font.BOLD, 18));
		tHoraTrabajo.setForeground(Color.decode("#111d15"));
		tHoraTrabajo.setBackground(Color.decode("#e0ebe0"));
		tHoraTrabajo.setBorder(null);
		add(tHoraTrabajo);
		
		numLicencia = new JLabel("Numero de licencia:");
		numLicencia.setBounds(25, 280, 180, 30);
		numLicencia.setFont(new Font("Agency FB", Font.BOLD, 22));
		numLicencia.setForeground(Color.decode("#111d15"));
		add(numLicencia);
		
		tNumLicencia = new JTextField();
		tNumLicencia.setBounds(30, 310, 164, 32);
		tNumLicencia.setFont(new Font("Agency FB", Font.BOLD, 18));
		tNumLicencia.setForeground(Color.decode("#111d15"));
		tNumLicencia.setBackground(Color.decode("#e0ebe0"));
		tNumLicencia.setBorder(null);
		add(tNumLicencia);
		//cliente
		nombreMascota = new JLabel("Nombre mascota:");
		nombreMascota.setBounds(25, 215, 150, 30);
		nombreMascota.setFont(new Font("Agency FB", Font.BOLD, 22));
		nombreMascota.setForeground(Color.decode("#111d15"));
		add(nombreMascota);
		
		tNombreMascota = new JTextField();
		tNombreMascota.setBounds(30, 245, 164, 32);
		tNombreMascota.setFont(new Font("Agency FB", Font.BOLD, 18));
		tNombreMascota.setForeground(Color.decode("#111d15"));
		tNombreMascota.setBackground(Color.decode("#e0ebe0"));
		tNombreMascota.setBorder(null);
		add(tNombreMascota);
		
		razonVisita = new JLabel("Razón de la visita:");
		razonVisita.setBounds(235, 215, 150, 30);
		razonVisita.setFont(new Font("Agency FB", Font.BOLD, 22));
		razonVisita.setForeground(Color.decode("#111d15"));
		add(razonVisita);
		
		tRazonVisita = new JTextField();
		tRazonVisita.setBounds(240, 245, 164, 32);
		tRazonVisita.setFont(new Font("Agency FB", Font.BOLD, 18));
		tRazonVisita.setForeground(Color.decode("#111d15"));
		tRazonVisita.setBackground(Color.decode("#e0ebe0"));
		tRazonVisita.setBorder(null);
		add(tRazonVisita);
		
		esClienteNuevo = new JLabel("Es cliente nuevo? (si/no):");
		esClienteNuevo.setBounds(440, 215, 150, 30);
		esClienteNuevo.setFont(new Font("Agency FB", Font.BOLD, 22));
		esClienteNuevo.setForeground(Color.decode("#111d15"));
		add(esClienteNuevo);
		
		tEsClienteNuevo = new JComboBox<String>(new String[] { "...", "Si", "No"});
		tEsClienteNuevo.setBounds(445, 245, 164, 32);
		tEsClienteNuevo.setFont(new Font("Agency FB", Font.BOLD, 18));
		tEsClienteNuevo.setForeground(Color.decode("#111d15"));
		tEsClienteNuevo.setBackground(Color.decode("#e0ebe0"));
		tEsClienteNuevo.setBorder(null);
		add(tEsClienteNuevo);

	}

	public JLabel getTipo() {
		return tipo;
	}

	public void setTipo(JLabel tipo) {
		this.tipo = tipo;
	}

	public JLabel getPersona() {
		return persona;
	}

	public void setPersona(JLabel persona) {
		this.persona = persona;
	}

	public JLabel getMascota() {
		return mascota;
	}

	public void setMascota(JLabel mascota) {
		this.mascota = mascota;
	}

	public JLabel getProducto() {
		return producto;
	}

	public void setProducto(JLabel producto) {
		this.producto = producto;
	}

	public JComboBox<String> getCmbTipo() {
		return cmbTipo;
	}

	public void setCmbTipo(JComboBox<String> cmbTipo) {
		this.cmbTipo = cmbTipo;
	}

	public JComboBox<String> getCmbPersona() {
		return cmbPersona;
	}

	public void setCmbPersona(JComboBox<String> cmbPersona) {
		this.cmbPersona = cmbPersona;
	}

	public JComboBox<String> getCmbMascota() {
		return cmbMascota;
	}

	public void setCmbMascota(JComboBox<String> cmbMascota) {
		this.cmbMascota = cmbMascota;
	}

	public JComboBox<String> getCmbProducto() {
		return cmbProducto;
	}

	public void setCmbProducto(JComboBox<String> cmbProducto) {
		this.cmbProducto = cmbProducto;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getApellido() {
		return apellido;
	}

	public void setApellido(JLabel apellido) {
		this.apellido = apellido;
	}

	public JLabel getGenero() {
		return genero;
	}

	public void setGenero(JLabel genero) {
		this.genero = genero;
	}

	public JLabel getDocumento() {
		return documento;
	}

	public void setDocumento(JLabel documento) {
		this.documento = documento;
	}

	public JLabel getCorreo() {
		return correo;
	}

	public void setCorreo(JLabel correo) {
		this.correo = correo;
	}

	public JLabel getTelefono() {
		return telefono;
	}

	public void setTelefono(JLabel telefono) {
		this.telefono = telefono;
	}

	public JLabel getCargo() {
		return cargo;
	}

	public void setCargo(JLabel cargo) {
		this.cargo = cargo;
	}

	public JLabel getSalario() {
		return salario;
	}

	public void setSalario(JLabel salario) {
		this.salario = salario;
	}

	public JLabel getHoraTrabajo() {
		return horaTrabajo;
	}

	public void setHoraTrabajo(JLabel horaTrabajo) {
		this.horaTrabajo = horaTrabajo;
	}

	public JLabel getNumLicencia() {
		return numLicencia;
	}

	public void setNumLicencia(JLabel numLicencia) {
		this.numLicencia = numLicencia;
	}

	public JLabel getAreaAsignada() {
		return areaAsignada;
	}

	public void setAreaAsignada(JLabel areaAsignada) {
		this.areaAsignada = areaAsignada;
	}

	public JLabel getHorario() {
		return horario;
	}

	public void setHorario(JLabel horario) {
		this.horario = horario;
	}

	public JLabel getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(JLabel numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public JLabel getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(JLabel nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public JLabel getRazonVisita() {
		return razonVisita;
	}

	public void setRazonVisita(JLabel razonVisita) {
		this.razonVisita = razonVisita;
	}

	public JLabel getEsClienteNuevo() {
		return esClienteNuevo;
	}

	public void setEsClienteNuevo(JLabel esClienteNuevo) {
		this.esClienteNuevo = esClienteNuevo;
	}

	public JLabel getEspecie() {
		return especie;
	}

	public void setEspecie(JLabel especie) {
		this.especie = especie;
	}

	public JLabel getHabitat() {
		return habitat;
	}

	public void setHabitat(JLabel habitat) {
		this.habitat = habitat;
	}

	public JLabel getTipoAlimento() {
		return tipoAlimento;
	}

	public void setTipoAlimento(JLabel tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}

	public JLabel getPeso() {
		return peso;
	}

	public void setPeso(JLabel peso) {
		this.peso = peso;
	}

	public JLabel getAltura() {
		return altura;
	}

	public void setAltura(JLabel altura) {
		this.altura = altura;
	}

	public JLabel getEdad() {
		return edad;
	}

	public void setEdad(JLabel edad) {
		this.edad = edad;
	}

	public JLabel getFormaPata() {
		return formaPata;
	}

	public void setFormaPata(JLabel formaPata) {
		this.formaPata = formaPata;
	}

	public JLabel getColorPluma() {
		return colorPluma;
	}

	public void setColorPluma(JLabel colorPluma) {
		this.colorPluma = colorPluma;
	}

	public JLabel getCantidadHuevo() {
		return cantidadHuevo;
	}

	public void setCantidadHuevo(JLabel cantidadHuevo) {
		this.cantidadHuevo = cantidadHuevo;
	}

	public JLabel getTamanoPico() {
		return tamanoPico;
	}

	public void setTamanoPico(JLabel tamanoPico) {
		this.tamanoPico = tamanoPico;
	}

	public JLabel getEsMigratoria() {
		return esMigratoria;
	}

	public void setEsMigratoria(JLabel esMigratoria) {
		this.esMigratoria = esMigratoria;
	}

	public JLabel getCantidadPelaje() {
		return cantidadPelaje;
	}

	public void setCantidadPelaje(JLabel cantidadPelaje) {
		this.cantidadPelaje = cantidadPelaje;
	}

	public JLabel getColorPelaje() {
		return colorPelaje;
	}

	public void setColorPelaje(JLabel colorPelaje) {
		this.colorPelaje = colorPelaje;
	}

	public JLabel getTipoDiente() {
		return tipoDiente;
	}

	public void setTipoDiente(JLabel tipoDiente) {
		this.tipoDiente = tipoDiente;
	}

	public JLabel getNumeroDiente() {
		return numeroDiente;
	}

	public void setNumeroDiente(JLabel numeroDiente) {
		this.numeroDiente = numeroDiente;
	}

	public JLabel getMedioDesplazamiento() {
		return medioDesplazamiento;
	}

	public void setMedioDesplazamiento(JLabel medioDesplazamiento) {
		this.medioDesplazamiento = medioDesplazamiento;
	}

	public JLabel getTipoDesplazamiento() {
		return tipoDesplazamiento;
	}

	public void setTipoDesplazamiento(JLabel tipoDesplazamiento) {
		this.tipoDesplazamiento = tipoDesplazamiento;
	}

	public JLabel getTemperaturaCorporal() {
		return temperaturaCorporal;
	}

	public void setTemperaturaCorporal(JLabel temperaturaCorporal) {
		this.temperaturaCorporal = temperaturaCorporal;
	}

	public JLabel getEsVenenoso() {
		return esVenenoso;
	}

	public void setEsVenenoso(JLabel esVenenoso) {
		this.esVenenoso = esVenenoso;
	}

	public JLabel getEsEctoformo() {
		return esEctoformo;
	}

	public void setEsEctoformo(JLabel esEctoformo) {
		this.esEctoformo = esEctoformo;
	}

	public JLabel getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(JLabel tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public JLabel getColorEscama() {
		return colorEscama;
	}

	public void setColorEscama(JLabel colorEscama) {
		this.colorEscama = colorEscama;
	}

	public JLabel getTipoRespiracion() {
		return tipoRespiracion;
	}

	public void setTipoRespiracion(JLabel tipoRespiracion) {
		this.tipoRespiracion = tipoRespiracion;
	}

	public JLabel getNumeroAleta() {
		return numeroAleta;
	}

	public void setNumeroAleta(JLabel numeroAleta) {
		this.numeroAleta = numeroAleta;
	}

	public JLabel getProfundidadMaxima() {
		return profundidadMaxima;
	}

	public void setProfundidadMaxima(JLabel profundidadMaxima) {
		this.profundidadMaxima = profundidadMaxima;
	}

	public JLabel getMarca() {
		return marca;
	}

	public void setMarca(JLabel marca) {
		this.marca = marca;
	}

	public JLabel getPrecio() {
		return precio;
	}

	public void setPrecio(JLabel precio) {
		this.precio = precio;
	}

	public JLabel getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(JLabel idProducto) {
		this.idProducto = idProducto;
	}

	public JLabel getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(JLabel nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public JLabel getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(JLabel nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public JLabel getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(JLabel fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public JLabel getEstaDisponible() {
		return estaDisponible;
	}

	public void setEstaDisponible(JLabel estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	public JLabel getDosis() {
		return dosis;
	}

	public void setDosis(JLabel dosis) {
		this.dosis = dosis;
	}

	public JLabel getColor() {
		return color;
	}

	public void setColor(JLabel color) {
		this.color = color;
	}

	public JLabel getTipoJuguete() {
		return tipoJuguete;
	}

	public void setTipoJuguete(JLabel tipoJuguete) {
		this.tipoJuguete = tipoJuguete;
	}

	public JLabel getGarantia() {
		return garantia;
	}

	public void setGarantia(JLabel garantia) {
		this.garantia = garantia;
	}

	public JTextField gettNombre() {
		return tNombre;
	}

	public void settNombre(JTextField tNombre) {
		this.tNombre = tNombre;
	}

	public JTextField gettApellido() {
		return tApellido;
	}

	public void settApellido(JTextField tApellido) {
		this.tApellido = tApellido;
	}

	public JComboBox<String> gettGenero() {
		return tGenero;
	}

	public void settGenero(JComboBox<String> tGenero) {
		this.tGenero = tGenero;
	}

	public JTextField gettDocumento() {
		return tDocumento;
	}

	public void settDocumento(JTextField tDocumento) {
		this.tDocumento = tDocumento;
	}

	public JTextField gettCorreo() {
		return tCorreo;
	}

	public void settCorreo(JTextField tCorreo) {
		this.tCorreo = tCorreo;
	}

	public JTextField gettTelefono() {
		return tTelefono;
	}

	public void settTelefono(JTextField tTelefono) {
		this.tTelefono = tTelefono;
	}

	public JComboBox<String> gettCargo() {
		return tCargo;
	}

	public void settCargo(JComboBox<String> tCargo) {
		this.tCargo = tCargo;
	}

	public JTextField gettSalario() {
		return tSalario;
	}

	public void settSalario(JTextField tSalario) {
		this.tSalario = tSalario;
	}

	public JTextField gettHoraTrabajo() {
		return tHoraTrabajo;
	}

	public void settHoraTrabajo(JTextField tHoraTrabajo) {
		this.tHoraTrabajo = tHoraTrabajo;
	}

	public JTextField gettNumLicencia() {
		return tNumLicencia;
	}

	public void settNumLicencia(JTextField tNumLicencia) {
		this.tNumLicencia = tNumLicencia;
	}

	public JComboBox<String> gettAreaAsignada() {
		return tAreaAsignada;
	}

	public void settAreaAsignada(JComboBox<String> tAreaAsignada) {
		this.tAreaAsignada = tAreaAsignada;
	}

	public JComboBox<String> gettHorario() {
		return tHorario;
	}

	public void settHorario(JComboBox<String> tHorario) {
		this.tHorario = tHorario;
	}

	public JTextField gettNumEmpleado() {
		return tNumEmpleado;
	}

	public void settNumEmpleado(JTextField tNumEmpleado) {
		this.tNumEmpleado = tNumEmpleado;
	}

	public JTextField gettNombreMascota() {
		return tNombreMascota;
	}

	public void settNombreMascota(JTextField tNombreMascota) {
		this.tNombreMascota = tNombreMascota;
	}

	public JTextField gettRazonVisita() {
		return tRazonVisita;
	}

	public void settRazonVisita(JTextField tRazonVisita) {
		this.tRazonVisita = tRazonVisita;
	}

	public JComboBox<String> gettEsClienteNuevo() {
		return tEsClienteNuevo;
	}

	public void settEsClienteNuevo(JComboBox<String> tEsClienteNuevo) {
		this.tEsClienteNuevo = tEsClienteNuevo;
	}

}
