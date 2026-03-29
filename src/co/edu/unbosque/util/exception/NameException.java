package co.edu.unbosque.util.exception;

public class NameException extends Exception {
	
	public NameException() {
		super ("El nombre debe contener minimo 3 letras, sin numeros ni simbolos");
	}

}
