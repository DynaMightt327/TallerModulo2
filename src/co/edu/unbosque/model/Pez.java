package co.edu.unbosque.model;

public class Pez extends Animal{
	
	private String tipoAgua;
	private String colorEscama;
	private String tipoRespiracion;
	private int numeroAleta;
	private double profundidadMaxima;
	
	public Pez() {
		// TODO Auto-generated constructor stub
	}

	public Pez(String tipoAgua, String colorEscama, String tipoRespiracion, int numeroAleta, double profundidadMaxima) {
		super();
		this.tipoAgua = tipoAgua;
		this.colorEscama = colorEscama;
		this.tipoRespiracion = tipoRespiracion;
		this.numeroAleta = numeroAleta;
		this.profundidadMaxima = profundidadMaxima;
	}

	public Pez(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura, int edad,
			String tipoAgua, String colorEscama, String tipoRespiracion, int numeroAleta, double profundidadMaxima) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		this.tipoAgua = tipoAgua;
		this.colorEscama = colorEscama;
		this.tipoRespiracion = tipoRespiracion;
		this.numeroAleta = numeroAleta;
		this.profundidadMaxima = profundidadMaxima;
	}

	public Pez(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura, int edad) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}


	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public String getColorEscama() {
		return colorEscama;
	}

	public void setColorEscama(String colorEscama) {
		this.colorEscama = colorEscama;
	}

	public String getTipoRespiracion() {
		return tipoRespiracion;
	}

	public void setTipoRespiracion(String tipoRespiracion) {
		this.tipoRespiracion = tipoRespiracion;
	}

	public int getNumeroAleta() {
		return numeroAleta;
	}

	public void setNumeroAleta(int numeroAleta) {
		this.numeroAleta = numeroAleta;
	}

	public double getProfundidadMaxima() {
		return profundidadMaxima;
	}

	public void setProfundidadMaxima(double profundidadMaxima) {
		this.profundidadMaxima = profundidadMaxima;
	}
	
	@Override
	public String toString() {
		return super.toString() +  "==Pez== \nTipo de agua: " + tipoAgua + "\nColor de escamas: " + colorEscama + "\nTipo de respiracion: " + tipoRespiracion
				+ "\nNumero de aletas: " + numeroAleta + "\nProfundidad maxima: " + profundidadMaxima;
	}	

}
