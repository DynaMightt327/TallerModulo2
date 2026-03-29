package co.edu.unbosque.model;

public class Persona {
	
	private String nombre;
	private String apellido;
	private char genero;
	private double documento;
	private String correo;
	private double telefono;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellido, char genero, double documento, String correo, double telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.documento = documento;
		this.correo = correo;
		this.telefono = telefono;
	}
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public double getDocumento() {
		return documento;
	}

	public void setDocumento(double documento) {
		this.documento = documento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public double getTelefono() {
		return telefono;
	}

	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "==Persona== \nNombre: " + nombre + "\nApellido: " + apellido + "\nGenero: " + genero + "\nDocumento="
				+ documento + "\nCorreo: " + correo + "\nTelefono: " + telefono;
	}
	

}
