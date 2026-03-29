package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Cliente;

public class ClienteDAO implements DAO<Cliente>{
	
	private ArrayList<Cliente> listaClientes;
	
	public ClienteDAO() {
		listaClientes = new ArrayList<>();
	}

	@Override
	public void crear(Cliente nuevoDato) {
		listaClientes.add(nuevoDato);
		escribirArchivo();
		
	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaClientes.size()) {
			return false;
		} else {
			listaClientes.remove(index);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, Cliente datoActualizado) {
		if (index < 0 || index >= listaClientes.size()) {
			return false;
		} else {
			listaClientes.set(index, datoActualizado);
			escribirArchivo();
			return true;
		}
	}

	@Override
	public String mostrar() {
		String dato = "";
		int posicion = 0;
		for (Cliente clientes : listaClientes) {
			dato += posicion + " ";
			dato += clientes.toString() + "\n"; // el += es un acumulado
			posicion++;
		}
		return dato;
	}

	@Override
	public String mostrar(int index) {
		return listaClientes.get(index).toString();
	}

	@Override
	public ArrayList<Cliente> mostrarTodo() {
		return listaClientes;
	}

	@Override
	public void escribirArchivo() {
		StringBuilder sb = new StringBuilder();
		for (Cliente cliente : listaClientes) {
			sb.append(cliente.toString() + "\n");
		}
		FileHandler.crearYEscribirArchivo("clientes.txt", sb.toString());
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

}
