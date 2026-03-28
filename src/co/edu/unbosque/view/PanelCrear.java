package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCrear extends JPanel{
	//seleccionar que se desea crear
	private JButton selecPersona;
	private JButton cAdmin;
	private JButton cVet;
	private JButton cCliente;
	
	private JButton selectMascota;
	private JButton cAve;
	private JButton cMamifero;
	private JButton cPez;
	private JButton cReptil;
	
	private JButton selecProducto;
	private JButton cJuguete;
	private JButton cMedicamento;
	
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
	}

}
