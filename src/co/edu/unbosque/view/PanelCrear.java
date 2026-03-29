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
	
	//paneles para agrupar
	/*private JPanel pAdmin;
	private JPanel pVet;
	private JPanel pCliente;
	private JPanel pAve;
	private JPanel pMamifero;
	private JPanel pReptil;
	private JPanel pPez;
	private JPanel pJuguete;
	private JPanel pMedicamento;
	*/
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
		//1,1
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

		marca = new JLabel("Marca:");
		marca.setBounds(25, 85, 150, 30);
		marca.setFont(new Font("Agency FB", Font.BOLD, 22));
		marca.setForeground(Color.decode("#111d15"));
		add(marca);
		
		tMarca = new JTextField();
		tMarca.setBounds(30, 115, 164, 32);
		tMarca.setFont(new Font("Agency FB", Font.BOLD, 18));
		tMarca.setForeground(Color.decode("#111d15"));
		tMarca.setBackground(Color.decode("#e0ebe0"));
		tMarca.setBorder(null);
		add(tMarca);
		//1,2
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

		especie = new JLabel("Especie:");
		especie.setBounds(235, 85, 150, 30);
		especie.setFont(new Font("Agency FB", Font.BOLD, 22));
		especie.setForeground(Color.decode("#111d15"));
		add(especie);
		
		tEspecie = new JTextField();
		tEspecie.setBounds(240, 115, 164, 32);
		tEspecie.setFont(new Font("Agency FB", Font.BOLD, 18));
		tEspecie.setForeground(Color.decode("#111d15"));
		tEspecie.setBackground(Color.decode("#e0ebe0"));
		tEspecie.setBorder(null);
		add(tEspecie);
		
		precio = new JLabel("Precio:");
		precio.setBounds(235, 85, 150, 30);
		precio.setFont(new Font("Agency FB", Font.BOLD, 22));
		precio.setForeground(Color.decode("#111d15"));
		add(precio);
		
		tPrecio = new JTextField();
		tPrecio.setBounds(240, 115, 164, 32);
		tPrecio.setFont(new Font("Agency FB", Font.BOLD, 18));
		tPrecio.setForeground(Color.decode("#111d15"));
		tPrecio.setBackground(Color.decode("#e0ebe0"));
		tPrecio.setBorder(null);
		add(tPrecio);
		//1,3
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
		
		habitat = new JLabel("Habitat:");
		habitat.setBounds(440, 85, 150, 30);
		habitat.setFont(new Font("Agency FB", Font.BOLD, 22));
		habitat.setForeground(Color.decode("#111d15"));
		add(habitat);
		
		tHabitat = new JTextField();
		tHabitat.setBounds(445, 115, 164, 32);
		tHabitat.setFont(new Font("Agency FB", Font.BOLD, 18));
		tHabitat.setForeground(Color.decode("#111d15"));
		tHabitat.setBackground(Color.decode("#e0ebe0"));
		tHabitat.setBorder(null);
		add(tHabitat);
		
		idProducto = new JLabel("ID producto:");
		idProducto.setBounds(440, 85, 150, 30);
		idProducto.setFont(new Font("Agency FB", Font.BOLD, 22));
		idProducto.setForeground(Color.decode("#111d15"));
		add(idProducto);
		
		tIdProducto = new JTextField();
		tIdProducto.setBounds(445, 115, 164, 32);
		tIdProducto.setFont(new Font("Agency FB", Font.BOLD, 18));
		tIdProducto.setForeground(Color.decode("#111d15"));
		tIdProducto.setBackground(Color.decode("#e0ebe0"));
		tIdProducto.setBorder(null);
		add(tIdProducto);
		//2,1
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
		
		tipoAlimento = new JLabel("Tipo de alimento:");
		tipoAlimento.setBounds(25, 150, 150, 30);
		tipoAlimento.setFont(new Font("Agency FB", Font.BOLD, 22));
		tipoAlimento.setForeground(Color.decode("#111d15"));
		add(tipoAlimento);
		
		tTipoAlimento = new JTextField();
		tTipoAlimento.setBounds(30, 180, 164, 32);
		tTipoAlimento.setFont(new Font("Agency FB", Font.BOLD, 18));
		tTipoAlimento.setForeground(Color.decode("#111d15"));
		tTipoAlimento.setBackground(Color.decode("#e0ebe0"));
		tTipoAlimento.setBorder(null);
		add(tTipoAlimento);
		
		nombreComercial = new JLabel("Nombre comercial:");
		nombreComercial.setBounds(25, 150, 150, 30);
		nombreComercial.setFont(new Font("Agency FB", Font.BOLD, 22));
		nombreComercial.setForeground(Color.decode("#111d15"));
		add(nombreComercial);
		
		tNombreComercial = new JTextField();
		tNombreComercial.setBounds(30, 180, 164, 32);
		tNombreComercial.setFont(new Font("Agency FB", Font.BOLD, 18));
		tNombreComercial.setForeground(Color.decode("#111d15"));
		tNombreComercial.setBackground(Color.decode("#e0ebe0"));
		tNombreComercial.setBorder(null);
		add(tNombreComercial);
		
		color = new JLabel("Color juguete:");
		color.setBounds(25, 150, 150, 30);
		color.setFont(new Font("Agency FB", Font.BOLD, 22));
		color.setForeground(Color.decode("#111d15"));
		add(color);
		
		tColor = new JTextField();
		tColor.setBounds(30, 180, 164, 32);
		tColor.setFont(new Font("Agency FB", Font.BOLD, 18));
		tColor.setForeground(Color.decode("#111d15"));
		tColor.setBackground(Color.decode("#e0ebe0"));
		tColor.setBorder(null);
		add(tColor);
		//2,2
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
		
		nombreCientifico = new JLabel("Nombre Científico:");
		nombreCientifico.setBounds(235, 150, 150, 30);
		nombreCientifico.setFont(new Font("Agency FB", Font.BOLD, 22));
		nombreCientifico.setForeground(Color.decode("#111d15"));
		add(nombreCientifico);
		
		tNombreCientifico = new JTextField();
		tNombreCientifico.setBounds(240, 180, 164, 32);
		tNombreCientifico.setFont(new Font("Agency FB", Font.BOLD, 18));
		tNombreCientifico.setForeground(Color.decode("#111d15"));
		tNombreCientifico.setBackground(Color.decode("#e0ebe0"));
		tNombreCientifico.setBorder(null);
		add(tNombreCientifico);
		
		peso = new JLabel("Peso:");
		peso.setBounds(235, 150, 150, 30);
		peso.setFont(new Font("Agency FB", Font.BOLD, 22));
		peso.setForeground(Color.decode("#111d15"));
		add(peso);
		
		tPeso = new JTextField();
		tPeso.setBounds(240, 180, 164, 32);
		tPeso.setFont(new Font("Agency FB", Font.BOLD, 18));
		tPeso.setForeground(Color.decode("#111d15"));
		tPeso.setBackground(Color.decode("#e0ebe0"));
		tPeso.setBorder(null);
		add(tPeso);
		
		tipoJuguete = new JLabel("Tipo de juguete:");
		tipoJuguete.setBounds(235, 150, 150, 30);
		tipoJuguete.setFont(new Font("Agency FB", Font.BOLD, 22));
		tipoJuguete.setForeground(Color.decode("#111d15"));
		add(tipoJuguete);
		
		tTipoJuguete = new JComboBox<String>(new String[] { "...", "Peluche", "De goma"});
		tTipoJuguete.setBounds(240, 180, 164, 32);
		tTipoJuguete.setFont(new Font("Agency FB", Font.BOLD, 18));
		tTipoJuguete.setForeground(Color.decode("#111d15"));
		tTipoJuguete.setBackground(Color.decode("#e0ebe0"));
		tTipoJuguete.setBorder(null);
		add(tTipoJuguete);
		//2,3
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
		
		altura = new JLabel("Altura:");
		altura.setBounds(440, 150, 150, 30);
		altura.setFont(new Font("Agency FB", Font.BOLD, 22));
		altura.setForeground(Color.decode("#111d15"));
		add(altura);
		
		tAltura = new JTextField();
		tAltura.setBounds(445, 180, 164, 32);
		tAltura.setFont(new Font("Agency FB", Font.BOLD, 18));
		tAltura.setForeground(Color.decode("#111d15"));
		tAltura.setBackground(Color.decode("#e0ebe0"));
		tAltura.setBorder(null);
		add(tAltura);

		fechaCaducidad = new JLabel("Fecha caducidad:");
		fechaCaducidad.setBounds(440, 150, 150, 30);
		fechaCaducidad.setFont(new Font("Agency FB", Font.BOLD, 22));
		fechaCaducidad.setForeground(Color.decode("#111d15"));
		add(fechaCaducidad);
		
		tFechaCaducidad = new JTextField();
		tFechaCaducidad.setBounds(445, 180, 164, 32);
		tFechaCaducidad.setFont(new Font("Agency FB", Font.BOLD, 18));
		tFechaCaducidad.setForeground(Color.decode("#111d15"));
		tFechaCaducidad.setBackground(Color.decode("#e0ebe0"));
		tFechaCaducidad.setBorder(null);
		add(tFechaCaducidad);
		
		
		garantia = new JLabel("Garantía:");
		garantia.setBounds(440, 150, 150, 30);
		garantia.setFont(new Font("Agency FB", Font.BOLD, 22));
		garantia.setForeground(Color.decode("#111d15"));
		add(garantia);
		
		tGarantia = new JComboBox<String>(new String[] { "...", "Si", "No"});
		tGarantia.setBounds(445, 180, 164, 32);
		tGarantia.setFont(new Font("Agency FB", Font.BOLD, 18));
		tGarantia.setForeground(Color.decode("#111d15"));
		tGarantia.setBackground(Color.decode("#e0ebe0"));
		tGarantia.setBorder(null);
		add(tGarantia);
		
		//admin y vet
		//3,1
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

		edad = new JLabel("Edad:");
		edad.setBounds(25, 215, 150, 30);
		edad.setFont(new Font("Agency FB", Font.BOLD, 22));
		edad.setForeground(Color.decode("#111d15"));
		add(edad);
		
		tEdad = new JTextField();
		tEdad.setBounds(30, 245, 164, 32);
		tEdad.setFont(new Font("Agency FB", Font.BOLD, 18));
		tEdad.setForeground(Color.decode("#111d15"));
		tEdad.setBackground(Color.decode("#e0ebe0"));
		tEdad.setBorder(null);
		add(tSalario);
		//admiiin
		//3,2
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

		estaDisponible = new JLabel("Está disponible?:");
		estaDisponible.setBounds(235, 215, 150, 30);
		estaDisponible.setFont(new Font("Agency FB", Font.BOLD, 22));
		estaDisponible.setForeground(Color.decode("#111d15"));
		add(estaDisponible);
		
		tEstaDisponible = new JComboBox<String>(new String[] { "...", "Si", "No"});
		tEstaDisponible.setBounds(240, 245, 164, 32);
		tEstaDisponible.setFont(new Font("Agency FB", Font.BOLD, 18));
		tEstaDisponible.setForeground(Color.decode("#111d15"));
		tEstaDisponible.setBackground(Color.decode("#e0ebe0"));
		tEstaDisponible.setBorder(null);
		add(tEstaDisponible);

		formaPata = new JLabel("Forma pata:");
		formaPata.setBounds(235, 215, 150, 30);
		formaPata.setFont(new Font("Agency FB", Font.BOLD, 22));
		formaPata.setForeground(Color.decode("#111d15"));
		add(formaPata);
		
		tFormaPata = new JComboBox<String>(new String[] { "...", "anisodáctilos", " zigodáctilos", "palmeados", "rapaces", "lobulados"});
		tFormaPata.setBounds(240, 245, 164, 32);
		tFormaPata.setFont(new Font("Agency FB", Font.BOLD, 18));
		tFormaPata.setForeground(Color.decode("#111d15"));
		tFormaPata.setBackground(Color.decode("#e0ebe0"));
		tFormaPata.setBorder(null);
		add(tFormaPata);

		cantidadPelaje = new JLabel("Cantidad pelaje:");
		cantidadPelaje.setBounds(235, 215, 150, 30);
		cantidadPelaje.setFont(new Font("Agency FB", Font.BOLD, 22));
		cantidadPelaje.setForeground(Color.decode("#111d15"));
		add(cantidadPelaje);
		
		tCantidadPelaje = new JComboBox<String>(new String[] { "...", "Mucho", "Poco", "Medio"});
		tCantidadPelaje.setBounds(240, 245, 164, 32);
		tCantidadPelaje.setFont(new Font("Agency FB", Font.BOLD, 18));
		tCantidadPelaje.setForeground(Color.decode("#111d15"));
		tCantidadPelaje.setBackground(Color.decode("#e0ebe0"));
		tCantidadPelaje.setBorder(null);
		add(tCantidadPelaje);
		
		tipoDesplazamiento = new JLabel("Tipo desplazamiento:");
		tipoDesplazamiento.setBounds(235, 215, 150, 30);
		tipoDesplazamiento.setFont(new Font("Agency FB", Font.BOLD, 22));
		tipoDesplazamiento.setForeground(Color.decode("#111d15"));
		add(tipoDesplazamiento);
		
		tTipoDesplazamiento = new JComboBox<String>(new String[] { "...", "Patas", "Alas", "Cuerpo"});
		tTipoDesplazamiento.setBounds(240, 245, 164, 32);
		tTipoDesplazamiento.setFont(new Font("Agency FB", Font.BOLD, 18));
		tTipoDesplazamiento.setForeground(Color.decode("#111d15"));
		tTipoDesplazamiento.setBackground(Color.decode("#e0ebe0"));
		tTipoDesplazamiento.setBorder(null);
		add(tTipoDesplazamiento);
		
		tipoAgua = new JLabel("Tipo de agua:");
		tipoAgua.setBounds(235, 215, 150, 30);
		tipoAgua.setFont(new Font("Agency FB", Font.BOLD, 22));
		tipoAgua.setForeground(Color.decode("#111d15"));
		add(tipoAgua);
		
		tTipoAgua = new JComboBox<String>(new String[] { "...", "Dulce", "Salada"});
		tTipoAgua.setBounds(240, 245, 164, 32);
		tTipoAgua.setFont(new Font("Agency FB", Font.BOLD, 18));
		tTipoAgua.setForeground(Color.decode("#111d15"));
		tTipoAgua.setBackground(Color.decode("#e0ebe0"));
		tTipoAgua.setBorder(null);
		add(tTipoAgua);

		horario = new JLabel("Horario:");
		horario.setBounds(440, 215, 150, 30);
		horario.setFont(new Font("Agency FB", Font.BOLD, 22));
		horario.setForeground(Color.decode("#111d15"));
		add(horario);
		//3,3
		tHorario = new JComboBox<String>(new String[] { "...", "6am - 2pm", "2pm - 10pm", "10pm - 6am"});
		tHorario.setBounds(445, 245, 164, 32);
		tHorario.setFont(new Font("Agency FB", Font.BOLD, 18));
		tHorario.setForeground(Color.decode("#111d15"));
		tHorario.setBackground(Color.decode("#e0ebe0"));
		tHorario.setBorder(null);
		add(tHorario);
		
		dosis = new JLabel("Dosis:");
		dosis.setBounds(440, 215, 150, 30);
		dosis.setFont(new Font("Agency FB", Font.BOLD, 22));
		dosis.setForeground(Color.decode("#111d15"));
		add(dosis);
		
		tDosis = new JTextField();
		tDosis.setBounds(445, 245, 164, 32);
		tDosis.setFont(new Font("Agency FB", Font.BOLD, 18));
		tDosis.setForeground(Color.decode("#111d15"));
		tDosis.setBackground(Color.decode("#e0ebe0"));
		tDosis.setBorder(null);
		add(tDosis);
		
		colorPluma = new JLabel("Color de plumas:");
		colorPluma.setBounds(440, 215, 150, 30);
		colorPluma.setFont(new Font("Agency FB", Font.BOLD, 22));
		colorPluma.setForeground(Color.decode("#111d15"));
		add(colorPluma);
		
		tColorPluma = new JTextField();
		tColorPluma.setBounds(445, 245, 164, 32);
		tColorPluma.setFont(new Font("Agency FB", Font.BOLD, 18));
		tColorPluma.setForeground(Color.decode("#111d15"));
		tColorPluma.setBackground(Color.decode("#e0ebe0"));
		tColorPluma.setBorder(null);
		add(tColorPluma);
		
		colorPelaje = new JLabel("Color del pelaje:");
		colorPelaje.setBounds(440, 215, 150, 30);
		colorPelaje.setFont(new Font("Agency FB", Font.BOLD, 22));
		colorPelaje.setForeground(Color.decode("#111d15"));
		add(colorPelaje);
		
		tColorPelaje = new JTextField();
		tColorPelaje.setBounds(445, 245, 164, 32);
		tColorPelaje.setFont(new Font("Agency FB", Font.BOLD, 18));
		tColorPelaje.setForeground(Color.decode("#111d15"));
		tColorPelaje.setBackground(Color.decode("#e0ebe0"));
		tColorPelaje.setBorder(null);
		add(tColorPelaje);
		
		colorEscama = new JLabel("Color de escamas:");
		colorEscama.setBounds(440, 215, 150, 30);
		colorEscama.setFont(new Font("Agency FB", Font.BOLD, 22));
		colorEscama.setForeground(Color.decode("#111d15"));
		add(colorEscama);
		
		tColorEscama = new JTextField();
		tColorEscama.setBounds(445, 245, 164, 32);
		tColorEscama.setFont(new Font("Agency FB", Font.BOLD, 18));
		tColorEscama.setForeground(Color.decode("#111d15"));
		tColorEscama.setBackground(Color.decode("#e0ebe0"));
		tColorEscama.setBorder(null);
		add(tColorEscama);
		
		esVenenoso = new JLabel("Es venenoso?:");
		esVenenoso.setBounds(440, 215, 150, 30);
		esVenenoso.setFont(new Font("Agency FB", Font.BOLD, 22));
		esVenenoso.setForeground(Color.decode("#111d15"));
		add(esVenenoso);
		
		tEsVenenoso = new JComboBox<String>(new String[] { "...", "Si", "No"});
		tEsVenenoso.setBounds(445, 245, 164, 32);
		tEsVenenoso.setFont(new Font("Agency FB", Font.BOLD, 18));
		tEsVenenoso.setForeground(Color.decode("#111d15"));
		tEsVenenoso.setBackground(Color.decode("#e0ebe0"));
		tEsVenenoso.setBorder(null);
		add(tEsVenenoso);
		//4,1
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
		
		cantidadHuevo = new JLabel("Cantidad de huevos:");
		cantidadHuevo.setBounds(25, 280, 180, 30);
		cantidadHuevo.setFont(new Font("Agency FB", Font.BOLD, 22));
		cantidadHuevo.setForeground(Color.decode("#111d15"));
		add(cantidadHuevo);
		
		tCantidadHuevo = new JTextField();
		tCantidadHuevo.setBounds(30, 310, 164, 32);
		tCantidadHuevo.setFont(new Font("Agency FB", Font.BOLD, 18));
		tCantidadHuevo.setForeground(Color.decode("#111d15"));
		tCantidadHuevo.setBackground(Color.decode("#e0ebe0"));
		tCantidadHuevo.setBorder(null);
		add(tCantidadHuevo);
		
		tipoDiente = new JLabel("Tipo de dientes:");
		tipoDiente.setBounds(25, 280, 180, 30);
		tipoDiente.setFont(new Font("Agency FB", Font.BOLD, 22));
		tipoDiente.setForeground(Color.decode("#111d15"));
		add(tipoDiente);
		
		tTipoDiente = new JComboBox<String>(new String[] { "...", "heterodonta", " homodonta", "Tecodontos", "Pleurodontos","Acrodontos"});
		tTipoDiente.setBounds(30, 310, 164, 32);
		tTipoDiente.setFont(new Font("Agency FB", Font.BOLD, 18));
		tTipoDiente.setForeground(Color.decode("#111d15"));
		tTipoDiente.setBackground(Color.decode("#e0ebe0"));
		tTipoDiente.setBorder(null);
		add(tTipoDiente);
		
		tipoRespiracion = new JLabel("Tipo de repiración:");
		tipoRespiracion.setBounds(25, 280, 180, 30);
		tipoRespiracion.setFont(new Font("Agency FB", Font.BOLD, 22));
		tipoRespiracion.setForeground(Color.decode("#111d15"));
		add(tipoRespiracion);
		
		tTipoRespiracion = new JComboBox<String>(new String[] { "...","branquias"});
		tTipoRespiracion.setBounds(30, 310, 164, 32);
		tTipoRespiracion.setFont(new Font("Agency FB", Font.BOLD, 18));
		tTipoRespiracion.setForeground(Color.decode("#111d15"));
		tTipoRespiracion.setBackground(Color.decode("#e0ebe0"));
		tTipoRespiracion.setBorder(null);
		add(tTipoRespiracion);
		
		//vet
		//4,2
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

		tamanoPico = new JLabel("Tamaño pico:");
		tamanoPico.setBounds(235, 280, 150, 30);
		tamanoPico.setFont(new Font("Agency FB", Font.BOLD, 22));
		tamanoPico.setForeground(Color.decode("#111d15"));
		add(tamanoPico);
		
		tTamanoPico = new JTextField();
		tTamanoPico.setBounds(240, 310, 164, 32);
		tTamanoPico.setFont(new Font("Agency FB", Font.BOLD, 18));
		tTamanoPico.setForeground(Color.decode("#111d15"));
		tTamanoPico.setBackground(Color.decode("#e0ebe0"));
		tTamanoPico.setBorder(null);
		add(tTamanoPico);
		
		numeroDiente = new JLabel("Numero de dientes:");
		numeroDiente.setBounds(235, 280, 150, 30);
		numeroDiente.setFont(new Font("Agency FB", Font.BOLD, 22));
		numeroDiente.setForeground(Color.decode("#111d15"));
		add(numeroDiente);
		
		tNumeroDiente = new JTextField();
		tNumeroDiente.setBounds(240, 310, 164, 32);
		tNumeroDiente.setFont(new Font("Agency FB", Font.BOLD, 18));
		tNumeroDiente.setForeground(Color.decode("#111d15"));
		tNumeroDiente.setBackground(Color.decode("#e0ebe0"));
		tNumeroDiente.setBorder(null);
		add(tNumeroDiente);
		
		numeroAleta = new JLabel("Numero de aletas:");
		numeroAleta.setBounds(235, 280, 150, 30);
		numeroAleta.setFont(new Font("Agency FB", Font.BOLD, 22));
		numeroAleta.setForeground(Color.decode("#111d15"));
		add(numeroAleta);
		
		tNumeroAleta = new JTextField();
		tNumeroAleta.setBounds(240, 310, 164, 32);
		tNumeroAleta.setFont(new Font("Agency FB", Font.BOLD, 18));
		tNumeroAleta.setForeground(Color.decode("#111d15"));
		tNumeroAleta.setBackground(Color.decode("#e0ebe0"));
		tNumeroAleta.setBorder(null);
		add(tNumeroAleta);
		
		esEctoformo = new JLabel("Es ectoformo?:");
		esEctoformo.setBounds(235, 280, 150, 30);
		esEctoformo.setFont(new Font("Agency FB", Font.BOLD, 22));
		esEctoformo.setForeground(Color.decode("#111d15"));
		add(esEctoformo);
		
		tEsEctoformo =new JComboBox<String>(new String[] { "...", "Si", "No"});
		tEsEctoformo.setBounds(240, 310, 164, 32);
		tEsEctoformo.setFont(new Font("Agency FB", Font.BOLD, 18));
		tEsEctoformo.setForeground(Color.decode("#111d15"));
		tEsEctoformo.setBackground(Color.decode("#e0ebe0"));
		tEsEctoformo.setBorder(null);
		add(tEsEctoformo);
		//4,3
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

		esMigratoria = new JLabel("Es migratoria?:");
		esMigratoria.setBounds(440, 280, 150, 30);
		esMigratoria.setFont(new Font("Agency FB", Font.BOLD, 22));
		esMigratoria.setForeground(Color.decode("#111d15"));
		add(esMigratoria);
		
		tEsMigratoria = new JComboBox<String>(new String[] { "...", "Si", "No"});
		tEsMigratoria.setBounds(445, 310, 164, 32);
		tEsMigratoria.setFont(new Font("Agency FB", Font.BOLD, 18));
		tEsMigratoria.setForeground(Color.decode("#111d15"));
		tEsMigratoria.setBackground(Color.decode("#e0ebe0"));
		tEsMigratoria.setBorder(null);
		add(tEsMigratoria);
		
		medioDesplazamiento = new JLabel("Medio Desplazamiento:");
		medioDesplazamiento.setBounds(440, 280, 150, 30);
		medioDesplazamiento.setFont(new Font("Agency FB", Font.BOLD, 22));
		medioDesplazamiento.setForeground(Color.decode("#111d15"));
		add(medioDesplazamiento);
		
		tMedioDesplazamiento = new JComboBox<String>(new String[] { "...", "Patas", "Alas", "Cuerpo"});
		tMedioDesplazamiento.setBounds(445, 310, 164, 32);
		tMedioDesplazamiento.setFont(new Font("Agency FB", Font.BOLD, 18));
		tMedioDesplazamiento.setForeground(Color.decode("#111d15"));
		tMedioDesplazamiento.setBackground(Color.decode("#e0ebe0"));
		tMedioDesplazamiento.setBorder(null);
		add(tMedioDesplazamiento);
		
		temperaturaCorporal = new JLabel("Temperatura corporal:");
		temperaturaCorporal.setBounds(440, 280, 150, 30);
		temperaturaCorporal.setFont(new Font("Agency FB", Font.BOLD, 22));
		temperaturaCorporal.setForeground(Color.decode("#111d15"));
		add(temperaturaCorporal);
		
		tTemperaturaCorporal = new JTextField();
		tTemperaturaCorporal.setBounds(445, 310, 164, 32);
		tTemperaturaCorporal.setFont(new Font("Agency FB", Font.BOLD, 18));
		tTemperaturaCorporal.setForeground(Color.decode("#111d15"));
		tTemperaturaCorporal.setBackground(Color.decode("#e0ebe0"));
		tTemperaturaCorporal.setBorder(null);
		add(tTemperaturaCorporal);
		
		profundidadMaxima = new JLabel("Profundidad Maxima:");
		profundidadMaxima.setBounds(440, 280, 150, 30);
		profundidadMaxima.setFont(new Font("Agency FB", Font.BOLD, 22));
		profundidadMaxima.setForeground(Color.decode("#111d15"));
		add(profundidadMaxima);
		
		tProfundidadMaxima = new JTextField();
		tProfundidadMaxima.setBounds(445, 310, 164, 32);
		tProfundidadMaxima.setFont(new Font("Agency FB", Font.BOLD, 18));
		tProfundidadMaxima.setForeground(Color.decode("#111d15"));
		tProfundidadMaxima.setBackground(Color.decode("#e0ebe0"));
		tProfundidadMaxima.setBorder(null);
		add(tProfundidadMaxima);
		
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

	public JTextField gettEspecie() {
		return tEspecie;
	}

	public void settEspecie(JTextField tEspecie) {
		this.tEspecie = tEspecie;
	}

	public JTextField gettHabitat() {
		return tHabitat;
	}

	public void settHabitat(JTextField tHabitat) {
		this.tHabitat = tHabitat;
	}

	public JTextField gettTipoAlimento() {
		return tTipoAlimento;
	}

	public void settTipoAlimento(JTextField tTipoAlimento) {
		this.tTipoAlimento = tTipoAlimento;
	}

	public JTextField gettPeso() {
		return tPeso;
	}

	public void settPeso(JTextField tPeso) {
		this.tPeso = tPeso;
	}

	public JTextField gettAltura() {
		return tAltura;
	}

	public void settAltura(JTextField tAltura) {
		this.tAltura = tAltura;
	}

	public JTextField gettEdad() {
		return tEdad;
	}

	public void settEdad(JTextField tEdad) {
		this.tEdad = tEdad;
	}

	public JComboBox<String> gettFormaPata() {
		return tFormaPata;
	}

	public void settFormaPata(JComboBox<String> tFormaPata) {
		this.tFormaPata = tFormaPata;
	}

	public JTextField gettColorPluma() {
		return tColorPluma;
	}

	public void settColorPluma(JTextField tColorPluma) {
		this.tColorPluma = tColorPluma;
	}

	public JTextField gettCantidadHuevo() {
		return tCantidadHuevo;
	}

	public void settCantidadHuevo(JTextField tCantidadHuevo) {
		this.tCantidadHuevo = tCantidadHuevo;
	}

	public JTextField gettTamanoPico() {
		return tTamanoPico;
	}

	public void settTamanoPico(JTextField tTamanoPico) {
		this.tTamanoPico = tTamanoPico;
	}

	public JComboBox<String> gettEsMigratoria() {
		return tEsMigratoria;
	}

	public void settEsMigratoria(JComboBox<String> tEsMigratoria) {
		this.tEsMigratoria = tEsMigratoria;
	}

	public JComboBox<String> gettCantidadPelaje() {
		return tCantidadPelaje;
	}

	public void settCantidadPelaje(JComboBox<String> tCantidadPelaje) {
		this.tCantidadPelaje = tCantidadPelaje;
	}

	public JTextField gettColorPelaje() {
		return tColorPelaje;
	}

	public void settColorPelaje(JTextField tColorPelaje) {
		this.tColorPelaje = tColorPelaje;
	}

	public JComboBox<String> gettTipoDiente() {
		return tTipoDiente;
	}

	public void settTipoDiente(JComboBox<String> tTipoDiente) {
		this.tTipoDiente = tTipoDiente;
	}

	public JTextField gettNumeroDiente() {
		return tNumeroDiente;
	}

	public void settNumeroDiente(JTextField tNumeroDiente) {
		this.tNumeroDiente = tNumeroDiente;
	}

	public JComboBox<String> gettMedioDesplazamiento() {
		return tMedioDesplazamiento;
	}

	public void settMedioDesplazamiento(JComboBox<String> tMedioDesplazamiento) {
		this.tMedioDesplazamiento = tMedioDesplazamiento;
	}

	public JComboBox<String> gettTipoDesplazamiento() {
		return tTipoDesplazamiento;
	}

	public void settTipoDesplazamiento(JComboBox<String> tTipoDesplazamiento) {
		this.tTipoDesplazamiento = tTipoDesplazamiento;
	}

	public JTextField gettTemperaturaCorporal() {
		return tTemperaturaCorporal;
	}

	public void settTemperaturaCorporal(JTextField tTemperaturaCorporal) {
		this.tTemperaturaCorporal = tTemperaturaCorporal;
	}

	public JComboBox<String> gettEsVenenoso() {
		return tEsVenenoso;
	}

	public void settEsVenenoso(JComboBox<String> tEsVenenoso) {
		this.tEsVenenoso = tEsVenenoso;
	}

	public JComboBox<String> gettEsEctoformo() {
		return tEsEctoformo;
	}

	public void settEsEctoformo(JComboBox<String> tEsEctoformo) {
		this.tEsEctoformo = tEsEctoformo;
	}

	public JComboBox<String> gettTipoAgua() {
		return tTipoAgua;
	}

	public void settTipoAgua(JComboBox<String> tTipoAgua) {
		this.tTipoAgua = tTipoAgua;
	}

	public JTextField gettColorEscama() {
		return tColorEscama;
	}

	public void settColorEscama(JTextField tColorEscama) {
		this.tColorEscama = tColorEscama;
	}

	public JComboBox<String> gettTipoRespiracion() {
		return tTipoRespiracion;
	}

	public void settTipoRespiracion(JComboBox<String> tTipoRespiracion) {
		this.tTipoRespiracion = tTipoRespiracion;
	}

	public JTextField gettNumeroAleta() {
		return tNumeroAleta;
	}

	public void settNumeroAleta(JTextField tNumeroAleta) {
		this.tNumeroAleta = tNumeroAleta;
	}

	public JTextField gettProfundidadMaxima() {
		return tProfundidadMaxima;
	}

	public void settProfundidadMaxima(JTextField tProfundidadMaxima) {
		this.tProfundidadMaxima = tProfundidadMaxima;
	}

	public JTextField gettMarca() {
		return tMarca;
	}

	public void settMarca(JTextField tMarca) {
		this.tMarca = tMarca;
	}

	public JTextField gettPrecio() {
		return tPrecio;
	}

	public void settPrecio(JTextField tPrecio) {
		this.tPrecio = tPrecio;
	}

	public JTextField gettIdProducto() {
		return tIdProducto;
	}

	public void settIdProducto(JTextField tIdProducto) {
		this.tIdProducto = tIdProducto;
	}

	public JTextField gettNombreComercial() {
		return tNombreComercial;
	}

	public void settNombreComercial(JTextField tNombreComercial) {
		this.tNombreComercial = tNombreComercial;
	}

	public JTextField gettNombreCientifico() {
		return tNombreCientifico;
	}

	public void settNombreCientifico(JTextField tNombreCientifico) {
		this.tNombreCientifico = tNombreCientifico;
	}

	public JTextField gettFechaCaducidad() {
		return tFechaCaducidad;
	}

	public void settFechaCaducidad(JTextField tFechaCaducidad) {
		this.tFechaCaducidad = tFechaCaducidad;
	}

	public JComboBox<String> gettEstaDisponible() {
		return tEstaDisponible;
	}

	public void settEstaDisponible(JComboBox<String> tEstaDisponible) {
		this.tEstaDisponible = tEstaDisponible;
	}

	public JTextField gettDosis() {
		return tDosis;
	}

	public void settDosis(JTextField tDosis) {
		this.tDosis = tDosis;
	}

	public JTextField gettColor() {
		return tColor;
	}

	public void settColor(JTextField tColor) {
		this.tColor = tColor;
	}

	public JComboBox<String> gettTipoJuguete() {
		return tTipoJuguete;
	}

	public void settTipoJuguete(JComboBox<String> tTipoJuguete) {
		this.tTipoJuguete = tTipoJuguete;
	}

	public JComboBox<String> gettGarantia() {
		return tGarantia;
	}

	public void settGarantia(JComboBox<String> tGarantia) {
		this.tGarantia = tGarantia;
	}

}
