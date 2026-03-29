package co.edu.unbosque.model;

public class Juguete extends Producto {
	
	private String nombre;
	private String color;
	private String tipoJuguete;
	private String garantia;
	
	public Juguete() {
		// TODO Auto-generated constructor stub
	}

	public Juguete(String nombre, String color, String tipoJuguete, String garantia) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.tipoJuguete = tipoJuguete;
		this.garantia = garantia;
	}

	public Juguete(String marca, float precio, int idProducto, String nombre, String color, String tipoJuguete,
			String garantia) {
		super(marca, precio, idProducto);
		this.nombre = nombre;
		this.color = color;
		this.tipoJuguete = tipoJuguete;
		this.garantia = garantia;
	}

	public Juguete(String marca, float precio, int idProducto) {
		super(marca, precio, idProducto);
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoJuguete() {
		return tipoJuguete;
	}

	public void setTipoJuguete(String tipoJuguete) {
		this.tipoJuguete = tipoJuguete;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	@Override
	public String toString() {
		return super.toString() + "==Juguete== \nNombre: " + nombre + "\nColor: " + color + "\nTipo de juguete: " + tipoJuguete + "\nGarantia: "
				+ garantia;
	}
	
	

}
