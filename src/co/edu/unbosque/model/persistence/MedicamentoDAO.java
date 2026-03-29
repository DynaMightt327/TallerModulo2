package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Medicamento;

public class MedicamentoDAO implements DAO<Medicamento>{
	
	private ArrayList<Medicamento> listaMedicamentos;
	
	public MedicamentoDAO() {
		listaMedicamentos = new ArrayList<>();
	}

	@Override
	public void crear(Medicamento nuevoDato) {
		listaMedicamentos.add(nuevoDato);
		escribirArchivo();
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaMedicamentos.size()) {
			return false;
		} else {
			listaMedicamentos.remove(index);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Medicamento datoActualizado) {
		if (index < 0 || index >= listaMedicamentos.size()) {
			return false;
		} else {
			listaMedicamentos.set(index, datoActualizado);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0; 
		for (Medicamento medicamento : listaMedicamentos) {
			dato+= posicion + " ";
			dato+= medicamento.toString() + "\n"; // el += es un acumulado
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaMedicamentos.get(index).toString();
	}

	@Override
	public ArrayList<Medicamento> mostrarTodo() {
		return listaMedicamentos;
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Medicamento medicamento : listaMedicamentos) {
			sb.append(medicamento.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo("Medicamentos.txt", sb.toString());
	}

	public ArrayList<Medicamento> getListaMedicamentos() {
		return listaMedicamentos;
	}

	public void setListaMedicamentos(ArrayList<Medicamento> listaMedicamentos) {
		this.listaMedicamentos = listaMedicamentos;
	}
	

}
