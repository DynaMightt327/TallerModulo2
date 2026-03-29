package co.edu.unbosque.model;

public class Veterinario extends Persona {
	
	private String cargo;
	private float salario;
	private int horaTrabajo;
	private double numLicencia;
	
	public Veterinario() {
		// TODO Auto-generated constructor stub
	}

	public Veterinario(String cargo, float salario, int horaTrabajo, double numLicencia) {
		super();
		this.cargo = cargo;
		this.salario = salario;
		this.horaTrabajo = horaTrabajo;
		this.numLicencia = numLicencia;
	}

	public Veterinario(String nombre, String apellido, char genero, double documento, String correo, double telefono,
			String cargo, float salario, int horaTrabajo, double numLicencia) {
		super(nombre, apellido, genero, documento, correo, telefono);
		this.cargo = cargo;
		this.salario = salario;
		this.horaTrabajo = horaTrabajo;
		this.numLicencia = numLicencia;
	}

	public Veterinario(String nombre, String apellido, char genero, double documento, String correo, double telefono) {
		super(nombre, apellido, genero, documento, correo, telefono);
		// TODO Auto-generated constructor stub
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getHoraTrabajo() {
		return horaTrabajo;
	}

	public void setHoraTrabajo(int horaTrabajo) {
		this.horaTrabajo = horaTrabajo;
	}

	public double getNumLicencia() {
		return numLicencia;
	}

	public void setNumLicencia(double numLicencia) {
		this.numLicencia = numLicencia;
	}
	
	@Override
	public String toString() {
		return super.toString() + "==Veterinario== \nCargo: " + cargo + "\nSalario: " + salario + "\nHoras de trabajo: " + horaTrabajo
				+ "\nNumero de licencia: " + numLicencia;
	}
	

}
