package co.edu.unbosque.model;

public class Administrativo extends Persona {
	
	private float salario;
	private String areaAsignada;
	private String horario;
	private int numEmpleado;
	
	public Administrativo() {
		// TODO Auto-generated constructor stub
	}

	public Administrativo(float salario, String areaAsignada, String horario, int numEmpleado) {
		super();
		this.salario = salario;
		this.areaAsignada = areaAsignada;
		this.horario = horario;
		this.numEmpleado = numEmpleado;
	}

	public Administrativo(String nombre, String apellido, char genero, double documento, String correo, double telefono,
			float salario, String areaAsignada, String horario, int numEmpleado) {
		super(nombre, apellido, genero, documento, correo, telefono);
		this.salario = salario;
		this.areaAsignada = areaAsignada;
		this.horario = horario;
		this.numEmpleado = numEmpleado;
	}

	public Administrativo(String nombre, String apellido, char genero, double documento, String correo,
			double telefono) {
		super(nombre, apellido, genero, documento, correo, telefono);
		// TODO Auto-generated constructor stub
	}
	
	


	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getAreaAsignada() {
		return areaAsignada;
	}

	public void setAreaAsignada(String areaAsignada) {
		this.areaAsignada = areaAsignada;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	
	@Override
	public String toString() {
		return super.toString() + "==Administrativo== \nSalario: " + salario + "\nArea asignada: " + areaAsignada + "\nHorario: " + horario
				+ "\nNumero de empleado: " + numEmpleado;
	}
	

}
