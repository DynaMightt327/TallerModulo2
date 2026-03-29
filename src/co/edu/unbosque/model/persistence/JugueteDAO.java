package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Juguete;

public class JugueteDAO implements DAO<Juguete>{
	
	private ArrayList<Juguete> listaJuguetes;
	
	public JugueteDAO() {
		listaJuguetes = new ArrayList<>();
	}

	@Override
	public void crear(Juguete nuevoDato) {
		listaJuguetes.add(nuevoDato);
		escribirArchivo();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaJuguetes.size()) {
			return false;
		} else {
			listaJuguetes.remove(index);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Juguete datoActualizado) {
		if (index < 0 || index >= listaJuguetes.size()) {
			return false;
		} else {
			listaJuguetes.set(index, datoActualizado);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Juguete juguetes : listaJuguetes) {
			dato += posicion + " ";
			dato += juguetes.toString() + "\n"; // el += es un acumulado
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaJuguetes.get(index).toString();
	}

	@Override
	public ArrayList<Juguete> mostrarTodo() {
		return listaJuguetes;
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Juguete juguete : listaJuguetes) {
			sb.append(juguete.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo("juguetes.txt", sb.toString());
	}

	public ArrayList<Juguete> getListaJuguetes() {
		return listaJuguetes;
	}

	public void setListaJuguetes(ArrayList<Juguete> listaJuguetes) {
		this.listaJuguetes = listaJuguetes;
	}

}
