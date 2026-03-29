package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Reptil;

public class ReptilDAO implements DAO<Reptil> {
	
	private ArrayList<Reptil> listaReptiles;
	
	public ReptilDAO() {
		listaReptiles = new ArrayList<>();
	}

	@Override
	public void crear(Reptil nuevoDato) {
		listaReptiles.add(nuevoDato);
		escribirArchivo();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaReptiles.size()) {
			return false;
		} else {
			listaReptiles.remove(index);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Reptil datoActualizado) {
		if (index < 0 || index >= listaReptiles.size()) {
			return false;
		} else {
			listaReptiles.set(index, datoActualizado);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0; 
		for (Reptil reptil : listaReptiles) {
			dato+= posicion + " ";
			dato+= reptil.toString() + "\n"; // el += es un acumulado
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaReptiles.get(index).toString();
	}

	@Override
	public ArrayList<Reptil> mostrarTodo() {
		return listaReptiles;
	}

	@Override
	public void escribirArchivo() {
		/*StringBuilder sb = new StringBuilder();
		for (Reptil reptil : listaReptiles) {
			sb.append(reptil.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo("reptiles.txt", sb.toString());*/
	}

	public ArrayList<Reptil> getListaReptiles() {
		return listaReptiles;
	}

	public void setListaReptiles(ArrayList<Reptil> listaReptiles) {
		this.listaReptiles = listaReptiles;
	}

}
