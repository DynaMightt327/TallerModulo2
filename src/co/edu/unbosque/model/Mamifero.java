package co.edu.unbosque.model;

public class Mamifero extends Animal {
	
	private String cantidadPelaje;
	private String colorPelaje;
	private String tipoDiente;
	private int numeroDiente;
	private String medioDesplazamiento;
	
	public Mamifero() {
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String cantidadPelaje, String colorPelaje, String tipoDiente, int numeroDiente,
			String medioDesplazamiento) {
		super();
		this.cantidadPelaje = cantidadPelaje;
		this.colorPelaje = colorPelaje;
		this.tipoDiente = tipoDiente;
		this.numeroDiente = numeroDiente;
		this.medioDesplazamiento = medioDesplazamiento;
	}

	public Mamifero(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura,
			int edad, String cantidadPelaje, String colorPelaje, String tipoDiente, int numeroDiente,
			String medioDesplazamiento) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		this.cantidadPelaje = cantidadPelaje;
		this.colorPelaje = colorPelaje;
		this.tipoDiente = tipoDiente;
		this.numeroDiente = numeroDiente;
		this.medioDesplazamiento = medioDesplazamiento;
	}

	public Mamifero(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura,
			int edad) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}


	public String getCantidadPelaje() {
		return cantidadPelaje;
	}

	public void setCantidadPelaje(String cantidadPelaje) {
		this.cantidadPelaje = cantidadPelaje;
	}

	public String getColorPelaje() {
		return colorPelaje;
	}

	public void setColorPelaje(String colorPelaje) {
		this.colorPelaje = colorPelaje;
	}

	public String getTipoDiente() {
		return tipoDiente;
	}

	public void setTipoDiente(String tipoDiente) {
		this.tipoDiente = tipoDiente;
	}

	public int getNumeroDiente() {
		return numeroDiente;
	}

	public void setNumeroDiente(int numeroDiente) {
		this.numeroDiente = numeroDiente;
	}

	public String getMedioDesplazamiento() {
		return medioDesplazamiento;
	}

	public void setMedioDesplazamiento(String medioDesplazamiento) {
		this.medioDesplazamiento = medioDesplazamiento;
	}
	
	@Override
	public String toString() {
		return super.toString() + "==Mamifero== \nCantidad de pelaje: " + cantidadPelaje + "\nColor de pelaje: " + colorPelaje + "\nTipo de dientes: "
				+ tipoDiente + "\nNumero de dientes: " + numeroDiente + "\nMedio de desplazamiento: " + medioDesplazamiento;
	}
	

}
