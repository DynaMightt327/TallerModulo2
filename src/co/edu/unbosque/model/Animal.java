package co.edu.unbosque.model;

public abstract class Animal {
	
	private String nombre;
	private String especie;
	private String habitat;
	private String tipoAlimento;
	private float peso;
	private float altura;
	private int edad;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String nombre, String especie, String habitat, String tipoAlimento, float peso, float altura,
			int edad) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.habitat = habitat;
		this.tipoAlimento = tipoAlimento;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getTipoAlimento() {
		return tipoAlimento;
	}

	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "==Animal== \nNombre: " + nombre + "\nEspecie: " + especie + "\nHabitat: " + habitat + "\nTipo de alimento: "
				+ tipoAlimento + "\nPeso: " + peso + "\nAltura: " + altura + "\nEdad: " + edad;
	}
	
	

}
