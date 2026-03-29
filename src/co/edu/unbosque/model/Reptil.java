package co.edu.unbosque.model;

public class Reptil extends Animal {
	
	private String tipoDesplazamiento;
	private String tipoDiente;
	private float temperaturaCorporal;
	private boolean esVenenoso;
	private boolean esEctoformo;
	
	public Reptil() {
		// TODO Auto-generated constructor stub
	}

	public Reptil(String tipoDesplazamiento, String tipoDiente, float temperaturaCorporal, boolean esVenenoso,
			boolean esEctoformo) {
		super();
		this.tipoDesplazamiento = tipoDesplazamiento;
		this.tipoDiente = tipoDiente;
		this.temperaturaCorporal = temperaturaCorporal;
		this.esVenenoso = esVenenoso;
		this.esEctoformo = esEctoformo;
	}

	public Reptil(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura,
			int edad, String tipoDesplazamiento, String tipoDiente, float temperaturaCorporal, boolean esVenenoso,
			boolean esEctoformo) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		this.tipoDesplazamiento = tipoDesplazamiento;
		this.tipoDiente = tipoDiente;
		this.temperaturaCorporal = temperaturaCorporal;
		this.esVenenoso = esVenenoso;
		this.esEctoformo = esEctoformo;
	}

	public Reptil(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura,
			int edad) {
		super(nombre, especie, habitat, tipoAlimento, peso, altura, edad);
		// TODO Auto-generated constructor stub
	}


	public String getTipoDesplazamiento() {
		return tipoDesplazamiento;
	}

	public void setTipoDesplazamiento(String tipoDesplazamiento) {
		this.tipoDesplazamiento = tipoDesplazamiento;
	}

	public String getTipoDiente() {
		return tipoDiente;
	}

	public void setTipoDiente(String tipoDiente) {
		this.tipoDiente = tipoDiente;
	}

	public float getTemperaturaCorporal() {
		return temperaturaCorporal;
	}

	public void setTemperaturaCorporal(float temperaturaCorporal) {
		this.temperaturaCorporal = temperaturaCorporal;
	}

	public boolean isEsVenenoso() {
		return esVenenoso;
	}

	public void setEsVenenoso(boolean esVenenoso) {
		this.esVenenoso = esVenenoso;
	}

	public boolean isEsEctoformo() {
		return esEctoformo;
	}

	public void setEsEctoformo(boolean esEctoformo) {
		this.esEctoformo = esEctoformo;
	}
	@Override
	public String toString() {
		return super.toString() + "==Reptil== \nTipo de desplazamiento: " + tipoDesplazamiento + "\nTipo de dientes: " + tipoDiente
				+ "\nTemperatura corporal:" + temperaturaCorporal + "\nEs venenoso: " + esVenenoso + "\nEs ectoformo: "
				+ esEctoformo;
	}	
	
	
}