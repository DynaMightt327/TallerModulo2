package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Ave;

public class AveDAO implements DAO<Ave> {
	
	private ArrayList<Ave> listaAves = new ArrayList<>();
	
	public AveDAO() {
		listaAves = new ArrayList<>();
	}

	@Override
	public void crear(Ave nuevoDato) {
		listaAves.add(nuevoDato);
		escribirArchivo();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaAves.size()) {
			return false;
		} else {
			listaAves.remove(index);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Ave datoActualizado) {
		if (index < 0 || index >= listaAves.size()) {
			return false;
		} else {
			listaAves.set(index, datoActualizado);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Ave aves : listaAves) {
			dato += posicion + " ";
			dato += aves.toString() + "\n"; // el += es un acumulado
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaAves.get(index).toString();
	}

	@Override
	public ArrayList<Ave> mostrarTodo() {
		return listaAves;
	}


	public ArrayList<Ave> getListaAves() {
		return listaAves;
	}

	public void setListaAves(ArrayList<Ave> listaAves) {
		this.listaAves = listaAves;
	}

	@Override
	public void escribirArchivo() {
		/*StringBuilder sb = new StringBuilder();
		for (Ave ave : listaAves) {
			sb.append(ave.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo("aves.txt", sb.toString());*/
	}
}
