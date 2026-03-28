package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
	
	public PanelCrear() {
		initComps();
		setVisible(false);
	}
	
	public void initComps() {
		this.setBounds(170, 120, 780, 375);
		this.setLayout(null);
		this.setBackground(Color.decode("#dba76d"));
		
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


}
