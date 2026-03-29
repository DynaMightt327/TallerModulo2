package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {
	
	private static File archivo;
	private Scanner lector;
	private static PrintWriter escritor;
	
	public static void crearCarpetaPrincipal() {
		archivo = new File("veterinaria");
		if(!archivo.isDirectory() || !archivo.exists()) {
			archivo.mkdir();
		}
	}
	
	public static void crearYEscribirArchivo(String url, String contenido) {
		try {
			archivo = new File("veterinaria/" + url);
			if(!archivo.exists()) {
				archivo.createNewFile();
			}
			escritor = new PrintWriter(archivo);
			escritor.println(contenido);
			escritor.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
