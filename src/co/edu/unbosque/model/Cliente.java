package co.edu.unbosque.model;

public class Cliente extends Persona {
	
	private String nombreMascota;
	private String razonVisita;
	private boolean esClienteNuevo;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombreMascota, String razonVisita, boolean esClienteNuevo) {
		super();
		this.nombreMascota = nombreMascota;
		this.razonVisita = razonVisita;
		this.esClienteNuevo = esClienteNuevo;
	}

	public Cliente(String nombre, String apellido, char genero, double documento, String correo, double telefono,
			String nombreMascota, String razonVisita, boolean esClienteNuevo) {
		super(nombre, apellido, genero, documento, correo, telefono);
		this.nombreMascota = nombreMascota;
		this.razonVisita = razonVisita;
		this.esClienteNuevo = esClienteNuevo;
	}

	public Cliente(String nombre, String apellido, char genero, double documento, String correo, double telefono) {
		super(nombre, apellido, genero, documento, correo, telefono);
		// TODO Auto-generated constructor stub
	}


	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getRazonVisita() {
		return razonVisita;
	}

	public void setRazonVisita(String razonVisita) {
		this.razonVisita = razonVisita;
	}

	public boolean isEsClienteNuevo() {
		return esClienteNuevo;
	}

	public void setEsClienteNuevo(boolean esClienteNuevo) {
		this.esClienteNuevo = esClienteNuevo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "==Cliente== \nNombre de la mascota: " + nombreMascota + "\nRazon de la visita: " + razonVisita + "\nEs cliente nuevo: "
				+ esClienteNuevo;
	}
	

}
