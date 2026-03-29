package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Mamifero;

public class MamiferoDAO implements DAO<Mamifero> {
	
	private ArrayList<Mamifero> listaMamiferos;
	
	public MamiferoDAO() {
		listaMamiferos = new ArrayList<>();
	}

	@Override
	public void crear(Mamifero nuevoDato) {
		listaMamiferos.add(nuevoDato);
		escribirArchivo();
		
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaMamiferos.size()) {
			return false;
		} else {
			listaMamiferos.remove(index);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Mamifero datoActualizado) {
		if (index < 0 || index >= listaMamiferos.size()) {
			return false;
		} else {
			listaMamiferos.set(index, datoActualizado);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0; 
		for (Mamifero mamifero : listaMamiferos) {
			dato+= posicion + " ";
			dato+= mamifero.toString() + "\n"; // el += es un acumulado
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaMamiferos.get(index).toString();
	}

	@Override
	public ArrayList<Mamifero> mostrarTodo() {
		return listaMamiferos;
	}

	@Override
	public void escribirArchivo() {
		/*StringBuilder sb = new StringBuilder();
		for (Mamifero mamifero : listaMamiferos) {
			sb.append(mamifero.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo("mamiferos.txt", sb.toString());*/
	}

	public ArrayList<Mamifero> getListaMamiferos() {
		return listaMamiferos;
	}

	public void setListaMamiferos(ArrayList<Mamifero> listaMamiferos) {
		this.listaMamiferos = listaMamiferos;
	}

}
