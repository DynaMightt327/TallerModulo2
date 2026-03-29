package co.edu.unbosque.util.exception;

public class IdException extends Exception {
	
	public IdException() {
		super("El documento debe contener 8 o 10 digitos, sin letras ni simbolos");
	}

}
