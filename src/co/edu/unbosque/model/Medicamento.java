package co.edu.unbosque.model;

public class Medicamento extends Producto {
	
	private String nombreComercial;
	private String nombreCientifico;
	private String fechaCaducidad;
	private boolean estaDisponible;
	private float dosis;
	
	public Medicamento() {
		// TODO Auto-generated constructor stub
	}

	public Medicamento(String nombreComercial, String nombreCientifico, String fechaCaducidad, boolean estaDisponible,
			float dosis) {
		super();
		this.nombreComercial = nombreComercial;
		this.nombreCientifico = nombreCientifico;
		this.fechaCaducidad = fechaCaducidad;
		this.estaDisponible = estaDisponible;
		this.dosis = dosis;
	}

	public Medicamento(String marca, float precio, int idProducto, String nombreComercial, String nombreCientifico,
			String fechaCaducidad, boolean estaDisponible, float dosis) {
		super(marca, precio, idProducto);
		this.nombreComercial = nombreComercial;
		this.nombreCientifico = nombreCientifico;
		this.fechaCaducidad = fechaCaducidad;
		this.estaDisponible = estaDisponible;
		this.dosis = dosis;
	}

	public Medicamento(String marca, float precio, int idProducto) {
		super(marca, precio, idProducto);
		// TODO Auto-generated constructor stub
	}
	


	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public boolean isEstaDisponible() {
		return estaDisponible;
	}

	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	public float getDosis() {
		return dosis;
	}

	public void setDosis(float dosis) {
		this.dosis = dosis;
	}
	
	@Override
	public String toString() {
		return super.toString() + "==Medicamento== \nNombre comercial: " + nombreComercial + "\nNombre cientifico: " + nombreCientifico
				+ "\nFecha de caducidad: " + fechaCaducidad + "\nEsta disponible: " + estaDisponible + "\nDosis: " + dosis;
	}
	
}
