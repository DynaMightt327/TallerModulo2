package co.edu.unbosque.model;

public class Ave extends Animal {
	
	private String formaPata;
	private String colorPluma;
	private int cantidadHuevo;
	private String tamanoPico;
	private boolean esMigratoria;
	
	public Ave() {
		// TODO Auto-generated constructor stub
	}

	public Ave(String formaPata, String colorPluma, int cantidadHuevo, String tamanoPico, boolean esMigratoria) {
		super();
		this.formaPata = formaPata;
		this.colorPluma = colorPluma;
		this.cantidadHuevo = cantidadHuevo;
		this.tamanoPico = tamanoPico;
		this.esMigratoria = esMigratoria;
	}

	public Ave(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura, int edad,
			String formaPata, String colorPluma, int cantidadHuevo, String tamanoPico, boolean esMigratoria) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		this.formaPata = formaPata;
		this.colorPluma = colorPluma;
		this.cantidadHuevo = cantidadHuevo;
		this.tamanoPico = tamanoPico;
		this.esMigratoria = esMigratoria;
	}

	public Ave(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura, int edad) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}


	public String getFormaPata() {
		return formaPata;
	}

	public void setFormaPata(String formaPata) {
		this.formaPata = formaPata;
	}

	public String getColorPluma() {
		return colorPluma;
	}

	public void setColorPluma(String colorPluma) {
		this.colorPluma = colorPluma;
	}

	public int getCantidadHuevo() {
		return cantidadHuevo;
	}

	public void setCantidadHuevo(int cantidadHuevo) {
		this.cantidadHuevo = cantidadHuevo;
	}

	public String getTamanoPico() {
		return tamanoPico;
	}

	public void setTamanoPico(String tamanoPico) {
		this.tamanoPico = tamanoPico;
	}

	public boolean isEsMigratoria() {
		return esMigratoria;
	}

	public void setEsMigratoria(boolean esMigratoria) {
		this.esMigratoria = esMigratoria;
	}
	
	@Override
	public String toString() {
		return super.toString() + "==Ave== \nForma de la pata: " + formaPata + "\nColor de plumas: " + colorPluma + "\nCantidad maxima de huevos: " + cantidadHuevo
				+ "\nTamaño del pico: " + tamanoPico + "\nEs migratoria: " + esMigratoria;
	}
	

}
