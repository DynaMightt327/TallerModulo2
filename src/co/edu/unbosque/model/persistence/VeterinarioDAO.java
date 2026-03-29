package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Veterinario;

public class VeterinarioDAO implements DAO<Veterinario> {
	
	private ArrayList<Veterinario> listaVeterinarios;
	
	public VeterinarioDAO() {
		listaVeterinarios = new ArrayList<>();
	}

	@Override
	public void crear(Veterinario nuevoDato) {
		listaVeterinarios.add(nuevoDato);
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaVeterinarios.size()) {
			return false;
		} else {
			listaVeterinarios.remove(index);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Veterinario datoActualizado) {
		if (index < 0 || index >= listaVeterinarios.size()) {
			return false;
		} else {
			listaVeterinarios.set(index, datoActualizado);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0; 
		for (Veterinario veterinario : listaVeterinarios) {
			dato+= posicion + " ";
			dato+= veterinario.toString() + "\n"; // el += es un acumulado
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaVeterinarios.get(index).toString();
	}

	@Override
	public ArrayList<Veterinario> mostrarTodo() {
		return listaVeterinarios;
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Veterinario veterinario : listaVeterinarios) {
			sb.append(veterinario.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo("veterinarios.txt", sb.toString());
	}

	public ArrayList<Veterinario> getListaVeterinarios() {
		return listaVeterinarios;
	}

	public void setListaVeterinarios(ArrayList<Veterinario> listaVeterinarios) {
		this.listaVeterinarios = listaVeterinarios;
	}

}
