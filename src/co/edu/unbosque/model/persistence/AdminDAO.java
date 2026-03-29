package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Administrativo;

public class AdminDAO implements DAO<Administrativo> {

	private ArrayList<Administrativo> listaAdmins;
	
	public AdminDAO() {
		listaAdmins = new ArrayList<>();
	}
	
	@Override
	public void crear(Administrativo nuevoDato) {
		listaAdmins.add(nuevoDato);
		escribirArchivo();
		
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaAdmins.size()) {
			return false;
		} else {
			listaAdmins.remove(index);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Administrativo datoActualizado) {
		if (index < 0 || index >= listaAdmins.size()) {
			return false;
		} else {
			listaAdmins.set(index, datoActualizado);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Administrativo admin : listaAdmins) {
			dato += posicion + " ";
			dato += admin.toString() + "\n";
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaAdmins.get(index).toString();
	}

	@Override
	public ArrayList<Administrativo> mostrarTodo() {
		return listaAdmins;
	}


	public ArrayList<Administrativo> getListaAdmins() {
		return listaAdmins;
	}

	public void setListaAdmins(ArrayList<Administrativo> listaAdmins) {
		this.listaAdmins = listaAdmins;
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Administrativo admin : listaAdmins) {
			sb.append(admin.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo("aministrativo.txt", sb.toString());
	}
}
