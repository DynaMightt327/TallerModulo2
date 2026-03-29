package co.edu.unbosque.model;

public class Producto {
	
	private String marca;
	private float precio;
	private int idProducto;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(String marca, float precio, int idProducto) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.idProducto = idProducto;
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	
	@Override
	public String toString() {
		return "Producto [marca=" + marca + ", precio=" + precio + ", idProducto=" + idProducto + "]";
	}
	

}
