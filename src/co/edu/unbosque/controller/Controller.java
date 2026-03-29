package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import co.edu.unbosque.view.PanelCrear;
import co.edu.unbosque.view.VentanaAdmin;
import co.edu.unbosque.view.VentanaCliente;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VentanaVet;

public class Controller implements ActionListener {

	private VentanaPrincipal vp;
	private VentanaAdmin va;
	private VentanaVet vv;
	private VentanaCliente vc;

	public Controller() {
		vp = new VentanaPrincipal();
		va = new VentanaAdmin();
		vv = new VentanaVet();
		vc = new VentanaCliente();
		asignarOyentes();
	}

	public void asignarOyentes() {
		vp.getbAdmin().addActionListener(this);
		vp.getbAdmin().setActionCommand("b_ventana_admin");

		vp.getbVeterinario().addActionListener(this);
		vp.getbVeterinario().setActionCommand("b_ventana_vet");

		vp.getbCliente().addActionListener(this);
		vp.getbCliente().setActionCommand("b_ventana_cliente");

		// ========
		va.getVolver().addActionListener(this);
		va.getVolver().setActionCommand("b_volver_admin");

		vv.getVolver().addActionListener(this);
		vv.getVolver().setActionCommand("b_volver_vet");

		vc.getVolver().addActionListener(this);
		vc.getVolver().setActionCommand("b_volver_cliente");

		// ========ADMINISTRADOR=========
		va.getCrear().addActionListener(this);
		va.getCrear().setActionCommand("crear_en_admin");

		va.getMostrar().addActionListener(this);
		va.getMostrar().setActionCommand("mostrar_en_admin");

		va.getActualizar().addActionListener(this);
		va.getActualizar().setActionCommand("actualizar_en_admin");

		va.getEliminar().addActionListener(this);
		va.getEliminar().setActionCommand("eliminar_en_admin");

		va.getPanelCrear().getCmbTipo().addActionListener(this);
		va.getPanelCrear().getCmbTipo().setActionCommand("cmb_tipo_crear_admin");
		
		va.getPanelCrear().getCmbPersona().addActionListener(this);
		va.getPanelCrear().getCmbPersona().setActionCommand("cmb_persona_crear_admin");
		
		va.getPanelCrear().getCmbMascota().addActionListener(this);
		va.getPanelCrear().getCmbMascota().setActionCommand("cmb_mascota_crear_admin");

		// =========VETERINARIO========
		vv.getCrear().addActionListener(this);
		vv.getCrear().setActionCommand("crear_en_vet");

		vv.getMostrar().addActionListener(this);
		vv.getMostrar().setActionCommand("mostrar_en_vet");

		vv.getActualizar().addActionListener(this);
		vv.getActualizar().setActionCommand("actualizar_en_vet");

		vv.getEliminar().addActionListener(this);
		vv.getEliminar().setActionCommand("eliminar_en_vet");

		// ========CLIENTE=========
		vc.getMostrar().addActionListener(this);
		vc.getMostrar().setActionCommand("mostrar_en_cliente");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		switch (alias) {
		case "b_ventana_admin": {
			vp.setVisible(false);
			va.setVisible(true);
			break;
		}
		case "b_ventana_vet": {
			vp.setVisible(false);
			vv.setVisible(true);
			break;
		}
		case "b_ventana_cliente": {
			vp.setVisible(false);
			vc.setVisible(true);
			break;
		}
		case "b_volver_admin": {
			va.setVisible(false);
			vp.setVisible(true);
			break;
		}
		case "b_volver_vet": {
			vv.setVisible(false);
			vp.setVisible(true);
			break;
		}
		case "b_volver_cliente": {
			vc.setVisible(false);
			vp.setVisible(true);
			break;
		}
		case "crear_en_admin": {
			va.getPanelCrear().setVisible(true);
			va.getPanelMostrar().setVisible(false);
			va.getPanelActualizar().setVisible(false);
			va.getPanelEliminar().setVisible(false);
			ocultarCampos();
			break;
		}
		case "cmb_tipo_crear_admin": {
			actualizarPorTipo();
			break;
		}
		
		case "cmb_persona_crear_admin": {
			actualizarPorPersona();
			break;
		}
		case "cmb_mascota_crear_admin": {
			actualizarPorMascota();
			break;
		}
		case "mostrar_en_admin": {
			va.getPanelCrear().setVisible(false);
			va.getPanelMostrar().setVisible(true);
			va.getPanelActualizar().setVisible(false);
			va.getPanelEliminar().setVisible(false);
			break;
		}
		case "actualizar_en_admin": {
			va.getPanelCrear().setVisible(false);
			va.getPanelMostrar().setVisible(false);
			va.getPanelActualizar().setVisible(true);
			va.getPanelEliminar().setVisible(false);
			break;
		}
		case "eliminar_en_admin": {
			va.getPanelCrear().setVisible(false);
			va.getPanelMostrar().setVisible(false);
			va.getPanelActualizar().setVisible(false);
			va.getPanelEliminar().setVisible(true);
			break;
		}
		case "crear_en_vet": {
			vv.getPanelCrear().setVisible(true);
			vv.getPanelMostrar().setVisible(false);
			vv.getPanelActualizar().setVisible(false);
			vv.getPanelEliminar().setVisible(false);

			break;
		}
		case "mostrar_en_vet": {
			vv.getPanelCrear().setVisible(false);
			vv.getPanelMostrar().setVisible(true);
			vv.getPanelActualizar().setVisible(false);
			vv.getPanelEliminar().setVisible(false);
			break;
		}
		case "actualizar_en_vet": {
			vv.getPanelCrear().setVisible(false);
			vv.getPanelMostrar().setVisible(false);
			vv.getPanelActualizar().setVisible(true);
			vv.getPanelEliminar().setVisible(false);
			break;
		}
		case "eliminar_en_vet": {
			vv.getPanelCrear().setVisible(false);
			vv.getPanelMostrar().setVisible(false);
			vv.getPanelActualizar().setVisible(false);
			vv.getPanelEliminar().setVisible(true);
			break;
		}
		case "mostrar_en_cliente": {
			vc.getPanelMostrar().setVisible(true);
			break;
		}
		default:
			break;
		}

	}

	
	public void ocultarCampos() {
		
		va.getPanelCrear().getPersona().setVisible(false);
		va.getPanelCrear().getCmbPersona().setVisible(false);
		va.getPanelCrear().getMascota().setVisible(false);
		va.getPanelCrear().getCmbMascota().setVisible(false);
		va.getPanelCrear().getProducto().setVisible(false);
		va.getPanelCrear().getCmbProducto().setVisible(false);

		va.getPanelCrear().getNombre().setVisible(false);
		va.getPanelCrear().gettNombre().setVisible(false);
		va.getPanelCrear().getMarca().setVisible(false);
		va.getPanelCrear().gettMarca().setVisible(false);

		va.getPanelCrear().getApellido().setVisible(false);
		va.getPanelCrear().gettApellido().setVisible(false);
		va.getPanelCrear().getEspecie().setVisible(false);
		va.getPanelCrear().gettEspecie().setVisible(false);
		va.getPanelCrear().getPrecio().setVisible(false);
		va.getPanelCrear().gettPrecio().setVisible(false);

		va.getPanelCrear().getGenero().setVisible(false);
		va.getPanelCrear().gettGenero().setVisible(false);
		va.getPanelCrear().getHabitat().setVisible(false);
		va.getPanelCrear().gettHabitat().setVisible(false);
		va.getPanelCrear().getIdProducto().setVisible(false);
		va.getPanelCrear().gettIdProducto().setVisible(false);

		va.getPanelCrear().getDocumento().setVisible(false);
		va.getPanelCrear().gettDocumento().setVisible(false);
		va.getPanelCrear().getTipoAlimento().setVisible(false);
		va.getPanelCrear().gettTipoAlimento().setVisible(false);
		va.getPanelCrear().getNombreComercial().setVisible(false);
		va.getPanelCrear().gettNombreComercial().setVisible(false);
		va.getPanelCrear().getColor().setVisible(false);
		va.getPanelCrear().gettColor().setVisible(false);

		va.getPanelCrear().getCorreo().setVisible(false);
		va.getPanelCrear().gettCorreo().setVisible(false);
		va.getPanelCrear().getPeso().setVisible(false);
		va.getPanelCrear().gettPeso().setVisible(false);
		va.getPanelCrear().getNombreCientifico().setVisible(false);
		va.getPanelCrear().gettNombreCientifico().setVisible(false);
		va.getPanelCrear().getTipoJuguete().setVisible(false);
		va.getPanelCrear().gettTipoJuguete().setVisible(false);

		va.getPanelCrear().getTelefono().setVisible(false);
		va.getPanelCrear().gettTelefono().setVisible(false);
		va.getPanelCrear().getAltura().setVisible(false);
		va.getPanelCrear().gettAltura().setVisible(false);
		va.getPanelCrear().getFechaCaducidad().setVisible(false);
		va.getPanelCrear().gettFechaCaducidad().setVisible(false);
		va.getPanelCrear().getGarantia().setVisible(false);
		va.getPanelCrear().gettGarantia().setVisible(false);

		va.getPanelCrear().getSalario().setVisible(false);
		va.getPanelCrear().gettSalario().setVisible(false);
		va.getPanelCrear().getEdad().setVisible(false);
		va.getPanelCrear().gettEdad().setVisible(false);
		va.getPanelCrear().getNombreMascota().setVisible(false);
		va.getPanelCrear().gettNombreMascota().setVisible(false);

		va.getPanelCrear().getAreaAsignada().setVisible(false);
		va.getPanelCrear().gettAreaAsignada().setVisible(false);
		va.getPanelCrear().getEstaDisponible().setVisible(false);
		va.getPanelCrear().gettEstaDisponible().setVisible(false);
		va.getPanelCrear().getFormaPata().setVisible(false);
		va.getPanelCrear().gettFormaPata().setVisible(false);
		va.getPanelCrear().getCantidadPelaje().setVisible(false);
		va.getPanelCrear().gettCantidadPelaje().setVisible(false);
		va.getPanelCrear().getTipoDesplazamiento().setVisible(false);
		va.getPanelCrear().gettTipoDesplazamiento().setVisible(false);
		va.getPanelCrear().getTipoAgua().setVisible(false);
		va.getPanelCrear().gettTipoAgua().setVisible(false);
		va.getPanelCrear().getRazonVisita().setVisible(false);
		va.getPanelCrear().gettRazonVisita().setVisible(false);
		va.getPanelCrear().getCargo().setVisible(false);
		va.getPanelCrear().gettCargo().setVisible(false);

		va.getPanelCrear().getHorario().setVisible(false);
		va.getPanelCrear().gettHorario().setVisible(false);
		va.getPanelCrear().getDosis().setVisible(false);
		va.getPanelCrear().gettDosis().setVisible(false);
		va.getPanelCrear().getColorPluma().setVisible(false);
		va.getPanelCrear().gettColorPluma().setVisible(false);
		va.getPanelCrear().getColorPelaje().setVisible(false);
		va.getPanelCrear().gettColorPelaje().setVisible(false);
		va.getPanelCrear().getEsVenenoso().setVisible(false);
		va.getPanelCrear().gettEsVenenoso().setVisible(false);
		va.getPanelCrear().getColorEscama().setVisible(false);
		va.getPanelCrear().gettColorEscama().setVisible(false);
		va.getPanelCrear().getHoraTrabajo().setVisible(false);
		va.getPanelCrear().gettHoraTrabajo().setVisible(false);
		va.getPanelCrear().getEsClienteNuevo().setVisible(false);
		va.getPanelCrear().gettEsClienteNuevo().setVisible(false);

		va.getPanelCrear().getNumEmpleado().setVisible(false);
		va.getPanelCrear().gettNumEmpleado().setVisible(false);
		va.getPanelCrear().getCantidadHuevo().setVisible(false);
		va.getPanelCrear().gettCantidadHuevo().setVisible(false);
		va.getPanelCrear().getTipoDiente().setVisible(false);
		va.getPanelCrear().gettTipoDiente().setVisible(false);
		va.getPanelCrear().getTipoRespiracion().setVisible(false);
		va.getPanelCrear().gettTipoRespiracion().setVisible(false);
		va.getPanelCrear().getNumLicencia().setVisible(false);
		va.getPanelCrear().gettNumLicencia().setVisible(false);

		va.getPanelCrear().getTamanoPico().setVisible(false);
		va.getPanelCrear().gettTamanoPico().setVisible(false);
		va.getPanelCrear().getNumeroDiente().setVisible(false);
		va.getPanelCrear().gettNumeroDiente().setVisible(false);
		va.getPanelCrear().getEsEctoformo().setVisible(false);
		va.getPanelCrear().gettEsEctoformo().setVisible(false);
		va.getPanelCrear().getNumeroAleta().setVisible(false);
		va.getPanelCrear().gettNumeroAleta().setVisible(false);

		va.getPanelCrear().getEsMigratoria().setVisible(false);
		va.getPanelCrear().gettEsMigratoria().setVisible(false);
		va.getPanelCrear().getMedioDesplazamiento().setVisible(false);
		va.getPanelCrear().gettMedioDesplazamiento().setVisible(false);
		va.getPanelCrear().getTemperaturaCorporal().setVisible(false);
		va.getPanelCrear().gettTemperaturaCorporal().setVisible(false);
		va.getPanelCrear().getProfundidadMaxima().setVisible(false);
		va.getPanelCrear().gettProfundidadMaxima().setVisible(false);
		
		va.getPanelCrear().revalidate();
		va.getPanelCrear().repaint();
		
	}
	
	public void actualizarPorTipo() {
		String tipo = (String) va.getPanelCrear().getCmbTipo().getSelectedItem();
		
		ocultarCampos();
		if (tipo.equals("...")) {
			return;
		}
		if (tipo.equals("Persona")) {
			va.getPanelCrear().getNombre().setVisible(true);
			va.getPanelCrear().gettNombre().setVisible(true);
			va.getPanelCrear().getApellido().setVisible(true);
			va.getPanelCrear().gettApellido().setVisible(true);
			va.getPanelCrear().getGenero().setVisible(true);
			va.getPanelCrear().gettGenero().setVisible(true);
			va.getPanelCrear().getDocumento().setVisible(true);
			va.getPanelCrear().gettDocumento().setVisible(true);
			va.getPanelCrear().getCorreo().setVisible(true);
			va.getPanelCrear().gettCorreo().setVisible(true);
			va.getPanelCrear().getTelefono().setVisible(true);
			va.getPanelCrear().gettTelefono().setVisible(true);
			va.getPanelCrear().getPersona().setVisible(true);
			va.getPanelCrear().getCmbPersona().setVisible(true);
			
		}
		if (tipo.equals("Mascota")) {
			va.getPanelCrear().getMascota().setVisible(true);
			va.getPanelCrear().getCmbMascota().setVisible(true);
			
			va.getPanelCrear().getNombre().setVisible(true);
			va.getPanelCrear().gettNombre().setVisible(true);
			va.getPanelCrear().getEspecie().setVisible(true);
			va.getPanelCrear().gettEspecie().setVisible(true);
			va.getPanelCrear().getHabitat().setVisible(true);
			va.getPanelCrear().gettHabitat().setVisible(true);
			va.getPanelCrear().getTipoAlimento().setVisible(true);
			va.getPanelCrear().gettTipoAlimento().setVisible(true);
			va.getPanelCrear().getPeso().setVisible(true);
			va.getPanelCrear().gettPeso().setVisible(true);
			va.getPanelCrear().getAltura().setVisible(true);
			va.getPanelCrear().gettAltura().setVisible(true);
			va.getPanelCrear().getEdad().setVisible(true);
			va.getPanelCrear().gettEdad().setVisible(true);
			
		}
		if (tipo.equals("Producto")) {
			va.getPanelCrear().getProducto().setVisible(true);
			va.getPanelCrear().getCmbProducto().setVisible(true);
			
			va.getPanelCrear().getMarca().setVisible(true);
			va.getPanelCrear().gettMarca().setVisible(true);
			va.getPanelCrear().getPrecio().setVisible(true);
			va.getPanelCrear().gettPrecio().setVisible(true);
			va.getPanelCrear().getIdProducto().setVisible(true);
			va.getPanelCrear().gettIdProducto().setVisible(true);
		
		}
		
		va.getPanelCrear().revalidate();
		va.getPanelCrear().repaint();
	}
	
	public void actualizarPorPersona() {
		String persona = (String) va.getPanelCrear().getCmbPersona().getSelectedItem();
		
		ocultarCampoPersona();
		if(persona == null || persona.equals("...")) {
			return;
		}
		if(persona.equals("Veterinario")) {
			va.getPanelCrear().getCargo().setVisible(true);
			va.getPanelCrear().gettCargo().setVisible(true);
			
			va.getPanelCrear().getSalario().setVisible(true);
			va.getPanelCrear().gettSalario().setVisible(true);
			
			va.getPanelCrear().getHorario().setVisible(true);
			va.getPanelCrear().gettHorario().setVisible(true);
			
			va.getPanelCrear().getNumLicencia().setVisible(true);
			va.getPanelCrear().gettNumLicencia().setVisible(true);
			
		}
		if(persona.equals("Administrativo")) {
			
			va.getPanelCrear().getSalario().setVisible(true);
			va.getPanelCrear().gettSalario().setVisible(true);
			
			va.getPanelCrear().getAreaAsignada().setVisible(true);
			va.getPanelCrear().gettAreaAsignada().setVisible(true);
			
			va.getPanelCrear().getHorario().setVisible(true);
			va.getPanelCrear().gettHorario().setVisible(true);
			
			va.getPanelCrear().getNumEmpleado().setVisible(true);
			va.getPanelCrear().gettNumEmpleado().setVisible(true);
			
		}
		if(persona.equals("Cliente")) {
			
			va.getPanelCrear().getNombreMascota().setVisible(true);
			va.getPanelCrear().gettNombreMascota().setVisible(true);
			
			va.getPanelCrear().getRazonVisita().setVisible(true);
			va.getPanelCrear().gettRazonVisita().setVisible(true);
			
			va.getPanelCrear().getEsClienteNuevo().setVisible(true);
			va.getPanelCrear().gettEsClienteNuevo().setVisible(true);
			
		}
		
		va.getPanelCrear().revalidate();
		va.getPanelCrear().repaint();
	}
	
	public void actualizarPorMascota() {
		String mascota = (String) va.getPanelCrear().getCmbMascota().getSelectedItem();
		ocultarCampoMascota();
		
		if(mascota == null || mascota.equals("...")) {
			return;
		}
		if(mascota.equals("Ave")) {
			
			va.getPanelCrear().getFormaPata().setVisible(true);
			va.getPanelCrear().gettFormaPata().setVisible(true);
			va.getPanelCrear().getColorPluma().setVisible(true);
			va.getPanelCrear().gettColorPluma().setVisible(true);
			va.getPanelCrear().getCantidadHuevo().setVisible(true);
			va.getPanelCrear().gettCantidadHuevo().setVisible(true);
			va.getPanelCrear().getTamanoPico().setVisible(true);
			va.getPanelCrear().gettTamanoPico().setVisible(true);
			va.getPanelCrear().getEsMigratoria().setVisible(true);
			va.getPanelCrear().gettEsMigratoria().setVisible(true);
			
		}
		if(mascota.equals("Mamifero")) {
			
			va.getPanelCrear().getCantidadPelaje().setVisible(true);
			va.getPanelCrear().gettCantidadPelaje().setVisible(true);
			va.getPanelCrear().getColorPelaje().setVisible(true);
			va.getPanelCrear().gettColorPelaje().setVisible(true);
			va.getPanelCrear().getTipoDiente().setVisible(true);
			va.getPanelCrear().gettTipoDiente().setVisible(true);
			va.getPanelCrear().getNumeroDiente().setVisible(true);
			va.getPanelCrear().gettNumeroDiente().setVisible(true);
			va.getPanelCrear().getMedioDesplazamiento().setVisible(true);
			va.getPanelCrear().gettMedioDesplazamiento().setVisible(true);
			
		}
		if(mascota.equals("Pez")) {
			
			va.getPanelCrear().getTipoAgua().setVisible(true);
			va.getPanelCrear().gettTipoAgua().setVisible(true);
			va.getPanelCrear().getColorEscama().setVisible(true);
			va.getPanelCrear().gettColorEscama().setVisible(true);
			va.getPanelCrear().getTipoRespiracion().setVisible(true);
			va.getPanelCrear().gettTipoRespiracion().setVisible(true);
			va.getPanelCrear().getNumeroAleta().setVisible(true);
			va.getPanelCrear().gettNumeroAleta().setVisible(true);
			va.getPanelCrear().getProfundidadMaxima().setVisible(true);
			va.getPanelCrear().gettProfundidadMaxima().setVisible(true);
			
		}
		if(mascota.equals("Reptil")) {
			
			va.getPanelCrear().getTipoDiente().setVisible(true);
			va.getPanelCrear().gettTipoDiente().setVisible(true);
			va.getPanelCrear().getMedioDesplazamiento().setVisible(true);
			va.getPanelCrear().gettMedioDesplazamiento().setVisible(true);
			va.getPanelCrear().getTemperaturaCorporal().setVisible(true);
			va.getPanelCrear().gettTemperaturaCorporal().setVisible(true);
			va.getPanelCrear().getEsVenenoso().setVisible(true);
			va.getPanelCrear().gettEsVenenoso().setVisible(true);
			va.getPanelCrear().getEsEctoformo().setVisible(true);
			va.getPanelCrear().gettEsEctoformo().setVisible(true);
			
		}
		va.getPanelCrear().revalidate();
		va.getPanelCrear().repaint();
		
	}
	

	public void ocultarCampoPersona() {
		va.getPanelCrear().getCargo().setVisible(false);
		va.getPanelCrear().gettCargo().setVisible(false);

		va.getPanelCrear().getSalario().setVisible(false);
		va.getPanelCrear().gettSalario().setVisible(false);

		va.getPanelCrear().getHorario().setVisible(false);
		va.getPanelCrear().gettHorario().setVisible(false);

		va.getPanelCrear().getNumLicencia().setVisible(false);
		va.getPanelCrear().gettNumLicencia().setVisible(false);
	}
	
	public void ocultarCampoMascota() {
		
		va.getPanelCrear().getFormaPata().setVisible(false);
		va.getPanelCrear().gettFormaPata().setVisible(false);
		va.getPanelCrear().getColorPluma().setVisible(false);
		va.getPanelCrear().gettColorPluma().setVisible(false);
		va.getPanelCrear().getCantidadHuevo().setVisible(false);
		va.getPanelCrear().gettCantidadHuevo().setVisible(false);
		va.getPanelCrear().getTamanoPico().setVisible(false);
		va.getPanelCrear().gettTamanoPico().setVisible(false);
		va.getPanelCrear().getEsMigratoria().setVisible(false);
		va.getPanelCrear().gettEsMigratoria().setVisible(false);
		
		va.getPanelCrear().getCantidadPelaje().setVisible(false);
		va.getPanelCrear().gettCantidadPelaje().setVisible(false);
		va.getPanelCrear().getColorPelaje().setVisible(false);
		va.getPanelCrear().gettColorPelaje().setVisible(false);
		va.getPanelCrear().getTipoDiente().setVisible(false);
		va.getPanelCrear().gettTipoDiente().setVisible(false);
		va.getPanelCrear().getNumeroDiente().setVisible(false);
		va.getPanelCrear().gettNumeroDiente().setVisible(false);
		va.getPanelCrear().getMedioDesplazamiento().setVisible(false);
		va.getPanelCrear().gettMedioDesplazamiento().setVisible(false);
		
		va.getPanelCrear().getTipoAgua().setVisible(false);
		va.getPanelCrear().gettTipoAgua().setVisible(false);
		va.getPanelCrear().getColorEscama().setVisible(false);
		va.getPanelCrear().gettColorEscama().setVisible(false);
		va.getPanelCrear().getTipoRespiracion().setVisible(false);
		va.getPanelCrear().gettTipoRespiracion().setVisible(false);
		va.getPanelCrear().getNumeroAleta().setVisible(false);
		va.getPanelCrear().gettNumeroAleta().setVisible(false);
		va.getPanelCrear().getProfundidadMaxima().setVisible(false);
		va.getPanelCrear().gettProfundidadMaxima().setVisible(false);
		
		va.getPanelCrear().getTemperaturaCorporal().setVisible(false);
		va.getPanelCrear().gettTemperaturaCorporal().setVisible(false);
		va.getPanelCrear().getEsVenenoso().setVisible(false);
		va.getPanelCrear().gettEsVenenoso().setVisible(false);
		va.getPanelCrear().getEsEctoformo().setVisible(false);
		va.getPanelCrear().gettEsEctoformo().setVisible(false);
		
	}

	public void iniciar() {
		vp.setVisible(true);
	}

}
