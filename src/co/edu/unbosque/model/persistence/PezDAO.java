package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Pez;

public class PezDAO implements DAO<Pez>{
	
	private ArrayList<Pez> listaPeces;
	
	public PezDAO() {
		listaPeces = new ArrayList<>();
	}

	@Override
	public void crear(Pez nuevoDato) {
		listaPeces.add(nuevoDato);
		escribirArchivo();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaPeces.size()) {
			return false;
		} else {
			listaPeces.remove(index);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Pez datoActualizado) {
		if (index < 0 || index >= listaPeces.size()) {
			return false;
		} else {
			listaPeces.set(index, datoActualizado);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0; 
		for (Pez pez : listaPeces) {
			dato+= posicion + " ";
			dato+= pez.toString() + "\n"; // el += es un acumulado
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaPeces.get(index).toString();
	}

	@Override
	public ArrayList<Pez> mostrarTodo() {
		return listaPeces;
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Pez pez : listaPeces) {
			sb.append(pez.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo("peces.txt", sb.toString());
	}

	public ArrayList<Pez> getListaPeces() {
		return listaPeces;
	}

	public void setListaPeces(ArrayList<Pez> listaPeces) {
		this.listaPeces = listaPeces;
	}

}
