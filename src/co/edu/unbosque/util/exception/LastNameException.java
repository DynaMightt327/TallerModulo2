package co.edu.unbosque.util.exception;

public class LastNameException extends Exception {
	
	public LastNameException() {
		super("Debe contener minimo 3 letras, sin numeros ni simbolos");
	}

}
