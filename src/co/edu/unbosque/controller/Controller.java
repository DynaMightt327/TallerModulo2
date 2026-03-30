package co.edu.unbosque.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.print.attribute.standard.PrinterMakeAndModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import co.edu.unbosque.model.Administrativo;
import co.edu.unbosque.model.Ave;
import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.Juguete;
import co.edu.unbosque.model.Mamifero;
import co.edu.unbosque.model.Medicamento;
import co.edu.unbosque.model.Pez;
import co.edu.unbosque.model.Reptil;
import co.edu.unbosque.model.Veterinario;
import co.edu.unbosque.model.persistence.AdminDAO;
import co.edu.unbosque.model.persistence.AveDAO;
import co.edu.unbosque.model.persistence.ClienteDAO;
import co.edu.unbosque.model.persistence.JugueteDAO;
import co.edu.unbosque.model.persistence.MamiferoDAO;
import co.edu.unbosque.model.persistence.MedicamentoDAO;
import co.edu.unbosque.model.persistence.PezDAO;
import co.edu.unbosque.model.persistence.ReptilDAO;
import co.edu.unbosque.model.persistence.VeterinarioDAO;
import co.edu.unbosque.view.VentanaAdmin;
import co.edu.unbosque.view.VentanaCliente;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VentanaVet;

public class Controller implements ActionListener {

	private VentanaPrincipal vp;
	private VentanaAdmin va;
	private VentanaVet vv;
	private VentanaCliente vc;
	private AdminDAO aDAO;
	private ClienteDAO cDAO;
	private VeterinarioDAO vDAO;
	private AveDAO avDAO;
	private MamiferoDAO mDAO;
	private PezDAO pDAO;
	private ReptilDAO rDAO;
	private JugueteDAO jDAO;
	private MedicamentoDAO meDAO;

	public Controller() {
		vp = new VentanaPrincipal();
		va = new VentanaAdmin();
		vv = new VentanaVet();
		vc = new VentanaCliente();
		aDAO = new AdminDAO();
		cDAO = new ClienteDAO();
		vDAO = new VeterinarioDAO();
		avDAO = new AveDAO();
		mDAO = new MamiferoDAO();
		pDAO = new PezDAO();
		rDAO = new ReptilDAO();
		jDAO = new JugueteDAO();
		meDAO = new MedicamentoDAO();
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

		va.getPanelMostrar().getCmbTipo().addActionListener(this);
		va.getPanelMostrar().getCmbTipo().setActionCommand("cmb_tipo_mostrar_admin");

		va.getPanelMostrar().getCmbPersona().addActionListener(this);
		va.getPanelMostrar().getCmbPersona().setActionCommand("cmb_persona_mostrar_admin");

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

		va.getPanelCrear().getCmbProducto().addActionListener(this);
		va.getPanelCrear().getCmbProducto().setActionCommand("cmb_producto_crear_admin");

		va.getPanelCrear().getGuardar().addActionListener(this);
		va.getPanelCrear().getGuardar().setActionCommand("guardar_objeto_admin");

		va.getPanelActualizar().getBorrar().addActionListener(this);
		va.getPanelActualizar().getBorrar().setActionCommand("actualizar_objeto_admin");

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

		va.getPanelMostrar().getCmbMascota().addActionListener(this);
		va.getPanelMostrar().getCmbMascota().setActionCommand("cmb_mascota_mostrar_admin");

		va.getPanelMostrar().getCmbProducto().addActionListener(this);
		va.getPanelMostrar().getCmbProducto().setActionCommand("cmb_producto_mostrar_admin");

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
			ocultarCampos();
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
		case "cmb_producto_crear_admin": {
			actualizarPorProducto();
			break;
		}
		case "guardar_objeto_admin": {
			guardarSegunTipo();
			break;
		}
		case "mostrar_en_admin": {
			va.getPanelCrear().setVisible(false);
			va.getPanelMostrar().setVisible(true);
			va.getPanelActualizar().setVisible(false);
			va.getPanelEliminar().setVisible(false);
			break;
		}
		case "cmb_tipo_mostrar_admin": {
			ocultarCamposParaMostrar();
			String tipo = (String) va.getPanelMostrar().getCmbTipo().getSelectedItem();

			if (tipo == null || tipo.equals("...")) {
				ocultarCamposParaMostrar();
			}

			if (tipo.equals("Persona")) {
				va.getPanelMostrar().getPersona().setVisible(true);
				va.getPanelMostrar().getCmbPersona().setVisible(true);
				va.getPanelMostrar().getMascota().setVisible(false);
				va.getPanelMostrar().getCmbMascota().setVisible(false);
				va.getPanelMostrar().getProducto().setVisible(false);
				va.getPanelMostrar().getCmbProducto().setVisible(false);
			}
			if (tipo.equals("Mascota")) {
				va.getPanelMostrar().getPersona().setVisible(false);
				va.getPanelMostrar().getCmbPersona().setVisible(false);
				va.getPanelMostrar().getMascota().setVisible(true);
				va.getPanelMostrar().getCmbMascota().setVisible(true);
				va.getPanelMostrar().getProducto().setVisible(false);
				va.getPanelMostrar().getCmbProducto().setVisible(false);
			}
			if (tipo.equals("Producto")) {
				va.getPanelMostrar().getPersona().setVisible(false);
				va.getPanelMostrar().getCmbPersona().setVisible(false);
				va.getPanelMostrar().getMascota().setVisible(false);
				va.getPanelMostrar().getCmbMascota().setVisible(false);
				va.getPanelMostrar().getProducto().setVisible(true);
				va.getPanelMostrar().getCmbProducto().setVisible(true);
			}
			Component[] comps = va.getPanelMostrar().getComponents();
			for (int i = 0; i < comps.length; i++) {
				try {
					((JScrollPane) comps[i]).setVisible(false);
				} catch (ClassCastException ex) {
				}
			}
			va.getPanelMostrar().revalidate();
			va.getPanelMostrar().repaint();
			break;
		}

		case "cmb_persona_mostrar_admin": {
			hacerVisibleScrollSegunCmbPersona();

			String persona = String.valueOf(va.getPanelMostrar().getCmbPersona().getSelectedItem());

			if ("Cliente".equals(persona)) {
				DefaultTableModel modelo = (DefaultTableModel) va.getPanelMostrar().getTablaCliente().getModel();
				modelo.setRowCount(0);

				for (Cliente c : cDAO.mostrarTodo()) {
					modelo.addRow(new Object[] { c.getNombre(), c.getApellido(), c.getGenero(), c.getDocumento(),
							c.getCorreo(), c.getTelefono(), c.getNombreMascota(), c.getRazonVisita(),
							c.isEsClienteNuevo() });
				}
			}

			if ("Veterinario".equals(persona)) {
				DefaultTableModel modelo = (DefaultTableModel) va.getPanelMostrar().getTablaVet().getModel();
				modelo.setRowCount(0);

				for (Veterinario v : vDAO.mostrarTodo()) {
					modelo.addRow(new Object[] { v.getNombre(), v.getApellido(), v.getGenero(), v.getDocumento(),
							v.getCorreo(), v.getTelefono(), v.getCargo(), v.getSalario(), v.getHoraTrabajo(),
							v.getNumLicencia() });
				}
			}

			if ("Administrativo".equals(persona)) {
				DefaultTableModel modelo = (DefaultTableModel) va.getPanelMostrar().getTablaAdmin().getModel();
				modelo.setRowCount(0);

				for (Administrativo a : aDAO.mostrarTodo()) {
					modelo.addRow(new Object[] { a.getNombre(), a.getApellido(), a.getGenero(), a.getDocumento(),
							a.getCorreo(), a.getTelefono(), a.getSalario(), a.getAreaAsignada(), a.getHorario(),
							a.getNumEmpleado() });
				}
			}

			break;
		}
		case "cmb_mascota_mostrar_admin": {
			hacerVisibleScrollSegunCmbMascota();

			String mascota = String.valueOf(va.getPanelMostrar().getCmbMascota().getSelectedItem());

			if ("Ave".equals(mascota)) {
				DefaultTableModel modelo = (DefaultTableModel) va.getPanelMostrar().getTablaAve().getModel();
				modelo.setRowCount(0);

				for (Ave a : avDAO.mostrarTodo()) {
					modelo.addRow(new Object[] { a.getNombre(), a.getEspecie(), a.getHabitat(), a.getTipoAlimento(),
							a.getPeso(), a.getAltura(), a.getEdad(), a.getFormaPata(), a.getColorPluma(),
							a.getCantidadHuevo(), a.getTamanoPico(), a.isEsMigratoria() });
				}
			}

			if ("Mamífero".equals(mascota) || "Mamifero".equals(mascota)) {
				DefaultTableModel modelo = (DefaultTableModel) va.getPanelMostrar().getTablaMamifero().getModel();
				modelo.setRowCount(0);

				for (Mamifero m : mDAO.mostrarTodo()) {
					modelo.addRow(new Object[] { m.getNombre(), m.getEspecie(), m.getHabitat(), m.getTipoAlimento(),
							m.getPeso(), m.getAltura(), m.getEdad(), m.getCantidadPelaje(), m.getColorPelaje(),
							m.getTipoDiente(), m.getMedioDesplazamiento() });
				}
			}

			if ("Pez".equals(mascota)) {
				DefaultTableModel modelo = (DefaultTableModel) va.getPanelMostrar().getTablaPez().getModel();
				modelo.setRowCount(0);

				for (Pez p : pDAO.mostrarTodo()) {
					modelo.addRow(new Object[] { p.getNombre(), p.getEspecie(), p.getHabitat(), p.getTipoAlimento(),
							p.getPeso(), p.getAltura(), p.getEdad(), p.getTipoAgua(), p.getColorEscama(),
							p.getTipoRespiracion(), p.getNumeroAleta(), p.getProfundidadMaxima() });
				}
			}

			if ("Reptil".equals(mascota)) {
				DefaultTableModel modelo = (DefaultTableModel) va.getPanelMostrar().getTablaReptil().getModel();
				modelo.setRowCount(0);

				for (Reptil r : rDAO.mostrarTodo()) {
					modelo.addRow(new Object[] { r.getNombre(), r.getEspecie(), r.getHabitat(), r.getTipoAlimento(),
							r.getPeso(), r.getAltura(), r.getEdad(), r.getTipoDesplazamiento(), r.getTipoDiente(),
							r.getTemperaturaCorporal(), r.isEsVenenoso(), r.isEsEctoformo() });
				}
			}

			break;
		}

		case "cmb_producto_mostrar_admin": {
			hacerVisibleScrollSegunCmbProducto();

			String prod = String.valueOf(va.getPanelMostrar().getCmbProducto().getSelectedItem());

			if ("Juguete".equals(prod)) {
				DefaultTableModel modelo = (DefaultTableModel) va.getPanelMostrar().getTablaJuguete().getModel();
				modelo.setRowCount(0);

				for (Juguete j : jDAO.mostrarTodo()) {
					modelo.addRow(new Object[] { j.getMarca(), j.getPrecio(), j.getIdProducto(), j.getNombre(),
							j.getColor(), j.getTipoJuguete(), j.getGarantia() });
				}
			}

			if ("Medicamento".equals(prod)) {
				DefaultTableModel modelo = (DefaultTableModel) va.getPanelMostrar().getTablaMedicamento().getModel();
				modelo.setRowCount(0);

				for (Medicamento m : meDAO.mostrarTodo()) {
					modelo.addRow(new Object[] { m.getMarca(), m.getPrecio(), m.getIdProducto(), m.getNombreComercial(),
							m.getNombreCientifico(), m.getFechaCaducidad(), m.isEstaDisponible(), m.getDosis() });
				}
			}

			break;
		}

		case "actualizar_en_admin": {
			va.getPanelCrear().setVisible(false);
			va.getPanelMostrar().setVisible(false);
			va.getPanelActualizar().setVisible(true);
			va.getPanelEliminar().setVisible(false);
			break;
		}
		case "actualizar_objeto_admin": {
			actualizarSegunEleccion();
			break;
		}
		case "eliminar_en_admin": {
			va.getPanelCrear().setVisible(false);
			va.getPanelMostrar().setVisible(false);
			va.getPanelActualizar().setVisible(false);
			va.getPanelEliminar().setVisible(true);
			eliminarSegunSeleccion();
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

	public void ocultarCamposParaMostrar() {
		va.getPanelMostrar().getPersona().setVisible(false);
		va.getPanelMostrar().getCmbPersona().setVisible(false);
		va.getPanelMostrar().getMascota().setVisible(false);
		va.getPanelMostrar().getCmbMascota().setVisible(false);
		va.getPanelMostrar().getProducto().setVisible(false);
		va.getPanelMostrar().getCmbProducto().setVisible(false);
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
		if (persona == null || persona.equals("...")) {
			return;
		}
		if (persona.equals("Veterinario")) {
			va.getPanelCrear().getCargo().setVisible(true);
			va.getPanelCrear().gettCargo().setVisible(true);

			va.getPanelCrear().getSalario().setVisible(true);
			va.getPanelCrear().gettSalario().setVisible(true);

			va.getPanelCrear().getHorario().setVisible(true);
			va.getPanelCrear().gettHorario().setVisible(true);

			va.getPanelCrear().getNumLicencia().setVisible(true);
			va.getPanelCrear().gettNumLicencia().setVisible(true);

		}
		if (persona.equals("Administrativo")) {

			va.getPanelCrear().getSalario().setVisible(true);
			va.getPanelCrear().gettSalario().setVisible(true);

			va.getPanelCrear().getAreaAsignada().setVisible(true);
			va.getPanelCrear().gettAreaAsignada().setVisible(true);

			va.getPanelCrear().getHorario().setVisible(true);
			va.getPanelCrear().gettHorario().setVisible(true);

			va.getPanelCrear().getNumEmpleado().setVisible(true);
			va.getPanelCrear().gettNumEmpleado().setVisible(true);

		}
		if (persona.equals("Cliente")) {

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

		if (mascota == null || mascota.equals("...")) {
			return;
		}
		if (mascota.equals("Ave")) {

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
		if (mascota.equals("Mamífero")) {

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
		if (mascota.equals("Pez")) {

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
		if (mascota.equals("Reptil")) {

			va.getPanelCrear().getTipoDiente().setVisible(true);
			va.getPanelCrear().gettTipoDiente().setVisible(true);
			va.getPanelCrear().getTipoDesplazamiento().setVisible(true);
			va.getPanelCrear().gettTipoDesplazamiento().setVisible(true);
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

	public void actualizarPorProducto() {
		String producto = (String) va.getPanelCrear().getCmbProducto().getSelectedItem();
		ocultarCampoProducto();

		if (producto == null || producto.equals("...")) {
			return;
		}
		if (producto.equals("Medicamento")) {

			va.getPanelCrear().getNombreComercial().setVisible(true);
			va.getPanelCrear().gettNombreComercial().setVisible(true);
			va.getPanelCrear().getNombreCientifico().setVisible(true);
			va.getPanelCrear().gettNombreCientifico().setVisible(true);
			va.getPanelCrear().getFechaCaducidad().setVisible(true);
			va.getPanelCrear().gettFechaCaducidad().setVisible(true);
			va.getPanelCrear().getEstaDisponible().setVisible(true);
			va.getPanelCrear().gettEstaDisponible().setVisible(true);
			va.getPanelCrear().getDosis().setVisible(true);
			va.getPanelCrear().gettDosis().setVisible(true);

		}
		if (producto.equals("Juguete")) {

			va.getPanelCrear().getNombre().setVisible(true);
			va.getPanelCrear().gettNombre().setVisible(true);
			va.getPanelCrear().getColor().setVisible(true);
			va.getPanelCrear().gettColor().setVisible(true);
			va.getPanelCrear().getTipoJuguete().setVisible(true);
			va.getPanelCrear().gettTipoJuguete().setVisible(true);
			va.getPanelCrear().getGarantia().setVisible(true);
			va.getPanelCrear().gettGarantia().setVisible(true);

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

		va.getPanelCrear().getAreaAsignada().setVisible(false);
		va.getPanelCrear().gettAreaAsignada().setVisible(false);

		va.getPanelCrear().getNumEmpleado().setVisible(false);
		va.getPanelCrear().gettNumEmpleado().setVisible(false);

		va.getPanelCrear().getNombreMascota().setVisible(false);
		va.getPanelCrear().gettNombreMascota().setVisible(false);

		va.getPanelCrear().getRazonVisita().setVisible(false);
		va.getPanelCrear().gettRazonVisita().setVisible(false);

		va.getPanelCrear().getEsClienteNuevo().setVisible(false);
		va.getPanelCrear().gettEsClienteNuevo().setVisible(false);

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

		va.getPanelCrear().getTipoDesplazamiento().setVisible(false);
		va.getPanelCrear().gettTipoDesplazamiento().setVisible(false);
		va.getPanelCrear().getTemperaturaCorporal().setVisible(false);
		va.getPanelCrear().gettTemperaturaCorporal().setVisible(false);
		va.getPanelCrear().getEsVenenoso().setVisible(false);
		va.getPanelCrear().gettEsVenenoso().setVisible(false);
		va.getPanelCrear().getEsEctoformo().setVisible(false);
		va.getPanelCrear().gettEsEctoformo().setVisible(false);

	}

	public void ocultarCampoProducto() {

		va.getPanelCrear().getNombreComercial().setVisible(false);
		va.getPanelCrear().gettNombreComercial().setVisible(false);
		va.getPanelCrear().getNombreCientifico().setVisible(false);
		va.getPanelCrear().gettNombreCientifico().setVisible(false);
		va.getPanelCrear().getFechaCaducidad().setVisible(false);
		va.getPanelCrear().gettFechaCaducidad().setVisible(false);
		va.getPanelCrear().getEstaDisponible().setVisible(false);
		va.getPanelCrear().gettEstaDisponible().setVisible(false);
		va.getPanelCrear().getDosis().setVisible(false);
		va.getPanelCrear().gettDosis().setVisible(false);

		va.getPanelCrear().getNombre().setVisible(false);
		va.getPanelCrear().gettNombre().setVisible(false);
		va.getPanelCrear().getColor().setVisible(false);
		va.getPanelCrear().gettColor().setVisible(false);
		va.getPanelCrear().getTipoJuguete().setVisible(false);
		va.getPanelCrear().gettTipoJuguete().setVisible(false);
		va.getPanelCrear().getGarantia().setVisible(false);
		va.getPanelCrear().gettGarantia().setVisible(false);

	}

	public void guardarSegunTipo() {
		String tipo = (String) va.getPanelCrear().getCmbTipo().getSelectedItem();

		if (tipo == null || tipo.equals("...")) {
			JOptionPane.showMessageDialog(va, "Debe seleccionar un tipo (Persona/Mascota/Producto)");
			return;
		}
		try {
			if (tipo.equals("Persona")) {

				String nombre = va.getPanelCrear().gettNombre().getText();
				String apellido = va.getPanelCrear().gettApellido().getText();

				String gen = String.valueOf(va.getPanelCrear().gettGenero().getSelectedItem());
				char genero = gen.charAt(0);

				double documento = Double.parseDouble(va.getPanelCrear().gettDocumento().getText());
				String correo = va.getPanelCrear().gettCorreo().getText();
				double telefono = Double.parseDouble(va.getPanelCrear().gettTelefono().getText());

				String tipoPersona = (String) va.getPanelCrear().getCmbPersona().getSelectedItem();

				if (tipoPersona.equals("Cliente")) {
					String nombreMascota = va.getPanelCrear().gettNombreMascota().getText();
					String razonVisita = va.getPanelCrear().gettRazonVisita().getText();

					String s = String.valueOf(va.getPanelCrear().gettEsClienteNuevo().getSelectedItem());
					boolean esClienteNuevo = s.equalsIgnoreCase("si") || s.equalsIgnoreCase("sí")
							|| s.equalsIgnoreCase("true");

					cDAO.crear(new Cliente(nombre, apellido, genero, documento, correo, telefono, nombreMascota,
							razonVisita, esClienteNuevo));
				}
				if (tipoPersona.equals("Veterinario")) {
					String cargo = (String) va.getPanelCrear().gettCargo().getSelectedItem();
					float salario = (float) Float.parseFloat(va.getPanelCrear().gettSalario().getText());
					int horaTrabajo = (int) Integer.parseInt(va.getPanelCrear().gettHoraTrabajo().getText());
					double numLicencia = (double) Double.parseDouble(va.getPanelCrear().getNumLicencia().getText());

					vDAO.crear(new Veterinario(nombre, apellido, genero, documento, correo, telefono, cargo, salario,
							horaTrabajo, numLicencia));
				}
				if (tipoPersona.equals("Administrativo")) {
					float salario = (float) Float.parseFloat(va.getPanelCrear().gettSalario().getText());
					String areaAsignada = (String) va.getPanelCrear().gettAreaAsignada().getSelectedItem();
					String horario = (String) va.getPanelCrear().gettHorario().getSelectedItem();

					aDAO.crear(new Administrativo(nombre, apellido, genero, documento, correo, telefono, salario,
							areaAsignada, horario, genero));

				}

			} else if (tipo.equals("Mascota")) {
				String nombre = va.getPanelCrear().gettNombre().getText();
				String especie = (String) va.getPanelCrear().getCmbMascota().getSelectedItem();
				String habitat = va.getPanelCrear().gettHabitat().getText();
				String tipoAlimento = va.getPanelCrear().gettTipoAlimento().getText();
				float peso = (float) Float.parseFloat(va.getPanelCrear().gettPeso().getText());
				float altura = (float) Float.parseFloat(va.getPanelCrear().gettAltura().getText());
				int edad = (int) Integer.parseInt(va.getPanelCrear().gettEdad().getText());

				String tipoMascota = (String) va.getPanelCrear().getCmbMascota().getSelectedItem();

				if (tipoMascota.equals("Ave")) {
					String formaPata = (String) va.getPanelCrear().gettFormaPata().getSelectedItem();
					String colorPluma = (String) va.getPanelCrear().gettColorPluma().getText();
					int cantidadHuevo = (int) Integer.parseInt(va.getPanelCrear().gettCantidadHuevo().getText());
					String tamanoPico = (String) va.getPanelCrear().gettTamanoPico().getText();
					boolean esMigratoria = (boolean) va.getPanelCrear().gettEsMigratoria().getSelectedItem();

					avDAO.crear(new Ave(nombre, especie, habitat, tipoAlimento, peso, altura, edad, formaPata,
							colorPluma, cantidadHuevo, tamanoPico, esMigratoria));
				}
				if (tipoMascota.equals("Mamífero")) {
					String cantidadPelaje = (String) va.getPanelCrear().gettCantidadPelaje().getSelectedItem();
					String colorPelaje = (String) va.getPanelCrear().gettColorPelaje().getText();
					String tipoDiente = (String) va.getPanelCrear().gettTipoDiente().getSelectedItem();
					int numeroDiente = (int) Integer.parseInt(va.getPanelCrear().gettNumeroDiente().getText());
					String medioDesplazamiento = (String) va.getPanelCrear().gettMedioDesplazamiento()
							.getSelectedItem();

					mDAO.crear(new Mamifero(especie, especie, habitat, tipoAlimento, peso, altura, edad, cantidadPelaje,
							colorPelaje, tipoDiente, numeroDiente, medioDesplazamiento));
				}
				if (tipoMascota.equals("Reptil")) {
					String tipoDesplazamiento = (String) va.getPanelCrear().gettTipoDesplazamiento().getSelectedItem();
					String tipoDiente = (String) va.getPanelCrear().gettTipoDesplazamiento().getSelectedItem();
					float temperaturacorporal = (float) Float
							.parseFloat(va.getPanelCrear().gettTemperaturaCorporal().getText());
					boolean esVenenoso = (boolean) va.getPanelCrear().gettEsVenenoso().getSelectedItem();
					boolean esEctoformo = (boolean) va.getPanelCrear().gettEsEctoformo().getSelectedItem();

					rDAO.crear(new Reptil(nombre, especie, habitat, tipoAlimento, peso, altura, edad,
							tipoDesplazamiento, tipoDiente, temperaturacorporal, esVenenoso, esEctoformo));
				}
				if (tipoMascota.equals("Pez")) {
					String tipoAgua = (String) va.getPanelCrear().gettTipoAgua().getSelectedItem();
					String colorEscama = (String) va.getPanelCrear().gettColorEscama().getText();
					String tipoRespiracion = (String) va.getPanelCrear().gettTipoRespiracion().getSelectedItem();
					int numeroAleta = (int) Integer.parseInt(va.getPanelCrear().gettNumeroAleta().getText());
					double profundidadMaxima = (double) Double
							.parseDouble(va.getPanelCrear().gettProfundidadMaxima().getText());

					pDAO.crear(new Pez(nombre, especie, habitat, tipoAlimento, peso, altura, edad, tipoAgua,
							colorEscama, tipoRespiracion, numeroAleta, profundidadMaxima));
				}

			} else if (tipo.equals("Producto")) {
				String marca = va.getPanelCrear().gettMarca().getText();
				float precio = (float) Float.parseFloat(va.getPanelCrear().gettPrecio().getText());
				int idProducto = (int) Integer.parseInt(va.getPanelCrear().gettIdProducto().getText());

				String tipoProducto = (String) va.getPanelCrear().getCmbProducto().getSelectedItem();
				if (tipoProducto.equals("Juguete")) {
					String nombre = (String) va.getPanelCrear().gettNombre().getText();
					String color = (String) va.getPanelCrear().gettColor().getText();
					String tipoJuguete = (String) va.getPanelCrear().gettTipoJuguete().getSelectedItem();
					String garantia = (String) va.getPanelCrear().gettGarantia().getSelectedItem();

					jDAO.crear(new Juguete(marca, precio, idProducto, nombre, color, tipoJuguete, garantia));
				}
				if (tipoProducto.equals("Medicamento")) {
					String nombreComercial = (String) va.getPanelCrear().gettNombreComercial().getText();
					String nombreCientifico = (String) va.getPanelCrear().gettNombreCientifico().getText();
					String fechaCaducidad = (String) va.getPanelCrear().gettFechaCaducidad().getText();
					boolean estaDisponible = (boolean) va.getPanelCrear().gettEstaDisponible().getSelectedItem();
					float dosis = (float) Float.parseFloat(va.getPanelCrear().gettDosis().getText());

					meDAO.crear(new Medicamento(marca, precio, idProducto, nombreComercial, nombreCientifico,
							fechaCaducidad, estaDisponible, dosis));
				}
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(va, "Error creando: " + e.getMessage());
			e.printStackTrace();

		}

	}

	private void hacerVisibleScrollSegunCmbPersona() {

		String persona = String.valueOf(va.getPanelMostrar().getCmbPersona().getSelectedItem());
		JTable tablaObjetivo = null;

		if ("Cliente".equals(persona)) {
			tablaObjetivo = va.getPanelMostrar().getTablaCliente();
		} else if ("Veterinario".equals(persona)) {
			tablaObjetivo = va.getPanelMostrar().getTablaVet();
		} else if ("Administrativo".equals(persona)) {
			tablaObjetivo = va.getPanelMostrar().getTablaAdmin();
		} else {
			Component[] comps = va.getPanelMostrar().getComponents();
			for (int i = 0; i < comps.length; i++) {
				try {
					JScrollPane sp = (JScrollPane) comps[i];
					sp.setVisible(false);
				} catch (ClassCastException ex) {
				}
			}
			va.getPanelMostrar().revalidate();
			va.getPanelMostrar().repaint();
			return;
		}
		Component[] comps = va.getPanelMostrar().getComponents();

		for (int i = 0; i < comps.length; i++) {
			try {
				JScrollPane sp = (JScrollPane) comps[i];

				boolean esElCorrecto = (sp.getViewport().getView() == tablaObjetivo);
				sp.setVisible(esElCorrecto);

			} catch (ClassCastException ex) {

			}
		}

		va.getPanelMostrar().revalidate();
		va.getPanelMostrar().repaint();
	}

	private void hacerVisibleScrollSegunCmbMascota() {
		String mascota = String.valueOf(va.getPanelMostrar().getCmbMascota().getSelectedItem());
		JTable tablaObjetivo = null;

		if ("Ave".equals(mascota)) {
			tablaObjetivo = va.getPanelMostrar().getTablaAve();
		} else if ("Mamífero".equals(mascota) || "Mamifero".equals(mascota)) {
			tablaObjetivo = va.getPanelMostrar().getTablaMamifero();
		} else if ("Pez".equals(mascota)) {
			tablaObjetivo = va.getPanelMostrar().getTablaPez();
		} else if ("Reptil".equals(mascota)) {
			tablaObjetivo = va.getPanelMostrar().getTablaReptil();
		} else {
			Component[] comps = va.getPanelMostrar().getComponents();
			for (int i = 0; i < comps.length; i++) {
				try {
					((JScrollPane) comps[i]).setVisible(false);
				} catch (ClassCastException ex) {
				}
			}
			va.getPanelMostrar().revalidate();
			va.getPanelMostrar().repaint();
			return;
		}

		Component[] comps = va.getPanelMostrar().getComponents();
		for (int i = 0; i < comps.length; i++) {
			try {
				JScrollPane sp = (JScrollPane) comps[i];
				sp.setVisible(sp.getViewport().getView() == tablaObjetivo);
			} catch (ClassCastException ex) {
			}
		}
		va.getPanelMostrar().revalidate();
		va.getPanelMostrar().repaint();
	}

	private void hacerVisibleScrollSegunCmbProducto() {
		String prod = String.valueOf(va.getPanelMostrar().getCmbProducto().getSelectedItem());
		JTable tablaObjetivo = null;

		if ("Juguete".equals(prod)) {
			tablaObjetivo = va.getPanelMostrar().getTablaJuguete();
		} else if ("Medicamento".equals(prod)) {
			tablaObjetivo = va.getPanelMostrar().getTablaMedicamento();
		} else {
			Component[] comps = va.getPanelMostrar().getComponents();
			for (int i = 0; i < comps.length; i++) {
				try {
					((JScrollPane) comps[i]).setVisible(false);
				} catch (ClassCastException ex) {
				}
			}
			va.getPanelMostrar().revalidate();
			va.getPanelMostrar().repaint();
			return;
		}

		Component[] comps = va.getPanelMostrar().getComponents();
		for (int i = 0; i < comps.length; i++) {
			try {
				JScrollPane sp = (JScrollPane) comps[i];
				sp.setVisible(sp.getViewport().getView() == tablaObjetivo);
			} catch (ClassCastException ex) {
			}
		}
		va.getPanelMostrar().revalidate();
		va.getPanelMostrar().repaint();
	}

	private void eliminarSegunSeleccion() {
		String opcion = (String) va.getPanelEliminar().getOpcion().getSelectedItem();
		if (opcion == null || opcion.equals("...")) {
			JOptionPane.showMessageDialog(va, "No puede dejar el campo vacío, seleccione una opcion");
			return;
		}
		try {
			if (opcion.equals("Administrativo")) {
				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (aDAO.getListaAdmins().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay administrativos registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= aDAO.getListaAdmins().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + aDAO.getListaAdmins().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Administrativo eliminada = aDAO.getListaAdmins().remove(indiceLista);
						JOptionPane.showMessageDialog(null, "Administrativo eliminado:\n\n" + eliminada.toString(),
								"Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);
				}
			} else if (opcion.equals("Veterinario")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (vDAO.getListaVeterinarios().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay veterinarios registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= vDAO.getListaVeterinarios().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + vDAO.getListaVeterinarios().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Veterinario eliminada = vDAO.getListaVeterinarios().remove(indiceLista);
						JOptionPane.showMessageDialog(null, "Veterinario eliminado:\n\n" + eliminada.toString(),
								"Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Cliente")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (cDAO.getListaClientes().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay clientes registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= cDAO.getListaClientes().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + cDAO.getListaClientes().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Cliente eliminada = cDAO.getListaClientes().remove(indiceLista);
						JOptionPane.showMessageDialog(null, "Cliente eliminado:\n\n" + eliminada.toString(),
								"Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Ave")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (avDAO.getListaAves().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay aves registradas registradas.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= avDAO.getListaAves().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + avDAO.getListaAves().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Ave eliminada = avDAO.getListaAves().remove(indiceLista);
						JOptionPane.showMessageDialog(null, "Ave eliminada:\n\n" + eliminada.toString(),
								"Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Mamifero")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (mDAO.getListaMamiferos().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay mamiferos registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= mDAO.getListaMamiferos().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + mDAO.getListaMamiferos().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Mamifero eliminada = mDAO.getListaMamiferos().remove(indiceLista);
						JOptionPane.showMessageDialog(null, "Mamifero eliminado:\n\n" + eliminada.toString(),
								"Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Reptil")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (rDAO.getListaReptiles().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay reptiles registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= rDAO.getListaReptiles().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + rDAO.getListaReptiles().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Reptil eliminada = rDAO.getListaReptiles().remove(indiceLista);
						JOptionPane.showMessageDialog(null, "Reptil eliminado:\n\n" + eliminada.toString(),
								"Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Pez")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (pDAO.getListaPeces().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay peces registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= rDAO.getListaReptiles().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + rDAO.getListaReptiles().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Reptil eliminada = rDAO.getListaReptiles().remove(indiceLista);
						JOptionPane.showMessageDialog(null, "Reptil eliminado:\n\n" + eliminada.toString(),
								"Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Juguete")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (jDAO.getListaJuguetes().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay juguetes creados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= jDAO.getListaJuguetes().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + jDAO.getListaJuguetes().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Juguete eliminada = jDAO.getListaJuguetes().remove(indiceLista);
						JOptionPane.showMessageDialog(null, "Juguete eliminado:\n\n" + eliminada.toString(),
								"Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Medicamento")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (meDAO.getListaMedicamentos().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay medicamentos registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= meDAO.getListaMedicamentos().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + meDAO.getListaMedicamentos().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Medicamento eliminada = meDAO.getListaMedicamentos().remove(indiceLista);
						JOptionPane.showMessageDialog(null, "Medicamento eliminado:\n\n" + eliminada.toString(),
								"Eliminacion exitosa", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(va, "Error creando: " + e.getMessage());
			e.printStackTrace();

		}

	}

	public void actualizarSegunEleccion() {
		String opcion = (String) va.getPanelActualizar().getOpcion().getSelectedItem();
		if (opcion == null || opcion.equals("...")) {
			JOptionPane.showMessageDialog(va, "No puede dejar el campo vacío, seleccione una opcion");
			return;
		}
		try {
			if (opcion.equals("Administrativo")) {
				try {
					int indiceUsuario = Integer.parseInt(va.getPanelActualizar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (aDAO.getListaAdmins().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay administrativos registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= aDAO.getListaAdmins().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + aDAO.getListaAdmins().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Administrativo actualizado = aDAO.getListaAdmins().get(indiceLista);
						JOptionPane.showMessageDialog(null,
								"Administrativo a actualizar: (posicion" + indiceUsuario + "):\n\n"
										+ aDAO.getListaAdmins().toString(),
								"Informacion actual", JOptionPane.INFORMATION_MESSAGE);

						String nuevoNombre = JOptionPane.showInputDialog(null, "Nombre:", actualizado.getNombre());
						String nuevoApellido = JOptionPane.showInputDialog(null, "Apellido:",
								actualizado.getApellido());
						String nuevoGeneroStr = JOptionPane.showInputDialog(null, "Género:", actualizado.getGenero());
						String nuevoDocumentoStr = JOptionPane.showInputDialog(null, "Documento:",
								actualizado.getDocumento());
						String nuevoCorreo = JOptionPane.showInputDialog(null, "Correo:", actualizado.getCorreo());
						String nuevoTelefonoStr = JOptionPane.showInputDialog(null, "Telefono:",
								actualizado.getTelefono());
						String nuevoSalarioStr = JOptionPane.showInputDialog(null, "Salario:",
								actualizado.getSalario());
						String nuevaAreaAsignada = JOptionPane.showInputDialog(null, "Area asignada:",
								actualizado.getAreaAsignada());
						String nuevoHorario = JOptionPane.showInputDialog(null, "Horario:", actualizado.getHorario());
						String nuevoNumEmpleadoStr = JOptionPane.showInputDialog(null, "Numero de empleados:",
								actualizado.getNumEmpleado());

						double nuevoDocumento = Double.parseDouble(nuevoDocumentoStr);
						double nuevoTelefono = Double.parseDouble(nuevoTelefonoStr);
						float nuevoSalario = Float.parseFloat(nuevoSalarioStr);
						char nuevoGenero = nuevoGeneroStr.charAt(0);
						int numEmpleado = Integer.parseInt(nuevoNumEmpleadoStr);

						actualizado.setNombre(nuevoNombre);
						actualizado.setApellido(nuevoApellido);
						actualizado.setGenero(nuevoGenero);
						actualizado.setDocumento(nuevoDocumento);
						actualizado.setCorreo(nuevoCorreo);
						actualizado.setTelefono(nuevoTelefono);
						actualizado.setSalario(nuevoSalario);
						actualizado.setAreaAsignada(nuevaAreaAsignada);
						actualizado.setHorario(nuevoHorario);
						actualizado.setNumEmpleado(numEmpleado);
						aDAO.actualizar(indiceLista, actualizado);
						JOptionPane.showMessageDialog(null, "Administrativo actualizado:\n\n" + actualizado.toString(),
								"Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);

					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);
				}
			} else if (opcion.equals("Veterinario")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (vDAO.getListaVeterinarios().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay veterinarios registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= vDAO.getListaVeterinarios().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + vDAO.getListaVeterinarios().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Veterinario actualizado = vDAO.getListaVeterinarios().get(indiceLista);
						JOptionPane.showMessageDialog(null,
								"Veterinario a actualizar: (posicion" + indiceUsuario + "):\n\n"
										+ vDAO.getListaVeterinarios().toString(),
								"Informacion actual", JOptionPane.INFORMATION_MESSAGE);

						String nuevoNombre = JOptionPane.showInputDialog(null, "Nombre:", actualizado.getNombre());
						String nuevoApellido = JOptionPane.showInputDialog(null, "Apellido:",
								actualizado.getApellido());
						String nuevoGeneroStr = JOptionPane.showInputDialog(null, "Género:", actualizado.getGenero());
						String nuevoDocumentoStr = JOptionPane.showInputDialog(null, "Documento:",
								actualizado.getDocumento());
						String nuevoCorreo = JOptionPane.showInputDialog(null, "Correo:", actualizado.getCorreo());
						String nuevoTelefonoStr = JOptionPane.showInputDialog(null, "Telefono:",
								actualizado.getTelefono());
						String nuevoSalarioStr = JOptionPane.showInputDialog(null, "Salario:",
								actualizado.getSalario());
						String nuevoCargo = JOptionPane.showInputDialog(null, "Cargo:", actualizado.getCargo());
						String nuevaHoraTrabajoStr = JOptionPane.showInputDialog(null, "Horas Trabajo:",
								actualizado.getHoraTrabajo());
						String nuevoNumLicenciaStr = JOptionPane.showInputDialog(null, "Numero de licencia:",
								actualizado.getNumLicencia());

						double nuevoDocumento = Double.parseDouble(nuevoDocumentoStr);
						double nuevoTelefono = Double.parseDouble(nuevoTelefonoStr);
						char nuevoGenero = nuevoGeneroStr.charAt(0);
						double nuevoNumLicencia = Double.parseDouble(nuevoNumLicenciaStr);
						float nuevoSalario = Float.parseFloat(nuevoSalarioStr);
						int nuevoHoraTrabajo = Integer.parseInt(nuevaHoraTrabajoStr);

						actualizado.setNombre(nuevoNombre);
						actualizado.setApellido(nuevoApellido);
						actualizado.setGenero(nuevoGenero);
						actualizado.setDocumento(nuevoDocumento);
						actualizado.setCorreo(nuevoCorreo);
						actualizado.setTelefono(nuevoTelefono);
						actualizado.setSalario(nuevoSalario);
						actualizado.setHoraTrabajo(nuevoHoraTrabajo);
						actualizado.setNumLicencia(nuevoNumLicencia);
						actualizado.setCargo(nuevoCargo);

						vDAO.actualizar(indiceLista, actualizado);
						JOptionPane.showMessageDialog(null, "Veterinario actualizado:\n\n" + actualizado.toString(),
								"Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);

					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Cliente")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (cDAO.getListaClientes().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay clientes registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= cDAO.getListaClientes().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + cDAO.getListaClientes().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Cliente actualizado = cDAO.getListaClientes().get(indiceLista);
						JOptionPane.showMessageDialog(null,
								"Cliente a actualizar: (posicion" + indiceUsuario + "):\n\n"
										+ cDAO.getListaClientes().toString(),
								"Informacion actual", JOptionPane.INFORMATION_MESSAGE);

						String nuevoNombre = JOptionPane.showInputDialog(null, "Nombre:", actualizado.getNombre());
						String nuevoApellido = JOptionPane.showInputDialog(null, "Apellido:",
								actualizado.getApellido());
						String nuevoGeneroStr = JOptionPane.showInputDialog(null, "Género:", actualizado.getGenero());
						String nuevoDocumentoStr = JOptionPane.showInputDialog(null, "Documento:",
								actualizado.getDocumento());
						String nuevoCorreo = JOptionPane.showInputDialog(null, "Correo:", actualizado.getCorreo());
						String nuevoTelefonoStr = JOptionPane.showInputDialog(null, "Telefono:",
								actualizado.getTelefono());
						String nuevoNombreMascota = JOptionPane.showInputDialog(null, "Nombre mascota:",
								actualizado.getNombreMascota());
						String nuevaRazonVisita = JOptionPane.showInputDialog(null, "Razon visita:",
								actualizado.getRazonVisita());
						// String nuevoEsClienteNuevo = JOptionPane.showInputDialog(null, "Es cliente
						// nuevo?:",actualizado.get());

						double nuevoDocumento = Double.parseDouble(nuevoDocumentoStr);
						double nuevoTelefono = Double.parseDouble(nuevoTelefonoStr);
						char nuevoGenero = nuevoGeneroStr.charAt(0);

						actualizado.setNombre(nuevoNombre);
						actualizado.setApellido(nuevoApellido);
						actualizado.setGenero(nuevoGenero);
						actualizado.setDocumento(nuevoDocumento);
						actualizado.setCorreo(nuevoCorreo);
						actualizado.setTelefono(nuevoTelefono);
						actualizado.setNombreMascota(nuevoNombreMascota);
						actualizado.setRazonVisita(nuevaRazonVisita);
						cDAO.actualizar(indiceLista, actualizado);
						JOptionPane.showMessageDialog(null, "Cliente actualizado:\n\n" + actualizado.toString(),
								"Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);

					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Ave")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (avDAO.getListaAves().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay aves registradas registradas.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= avDAO.getListaAves().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + avDAO.getListaAves().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Ave actualizado = avDAO.getListaAves().get(indiceLista);
						JOptionPane.showMessageDialog(null,
								"Ave a actualizar: (posicion" + indiceUsuario + "):\n\n"
										+ avDAO.getListaAves().toString(),
								"Informacion actual", JOptionPane.INFORMATION_MESSAGE);

						String nuevoNombre = JOptionPane.showInputDialog(null, "Nombre:", actualizado.getNombre());
						String nuevaEspecie = JOptionPane.showInputDialog(null, "Especie:", actualizado.getEspecie());
						String nuevoHabitat = JOptionPane.showInputDialog(null, "Habitat:", actualizado.getHabitat());
						String nuevoTipoAlimento = JOptionPane.showInputDialog(null, "Tipo alimento:",
								actualizado.getTipoAlimento());
						String nuevoPesoStr = JOptionPane.showInputDialog(null, "Peso:", actualizado.getPeso());
						String nuevaAlturaStr = JOptionPane.showInputDialog(null, "Altura:", actualizado.getAltura());
						String nuevaEdadStr = JOptionPane.showInputDialog(null, "Edad:", actualizado.getEdad());
						String nuevaFormaPata = JOptionPane.showInputDialog(null, "Forma Patas:",
								actualizado.getFormaPata());
						String nuevoColorPluma = JOptionPane.showInputDialog(null, "Color plumas:",
								actualizado.getColorPluma());
						String nuevoCantidadHuevoStr = JOptionPane.showInputDialog(null, "Cantidad huevos:",
								actualizado.getCantidadHuevo());
						String nuevoTamanoPico = JOptionPane.showInputDialog(null, "Tamaño Pico:",
								actualizado.getTamanoPico());
						// String nuevoEsMigratorioStr = JOptionPane.showInputDialog(null, "Nombre:",
						// actualizado.get());

						float nuevoPeso = Float.parseFloat(nuevoPesoStr);
						float nuevaAltura = Float.parseFloat(nuevaAlturaStr);
						int nuevaEdad = Integer.parseInt(nuevaEdadStr);
						int nuevoCantidadHuevo = Integer.parseInt(nuevoCantidadHuevoStr);
						// boolean nuevoEsMigratorio = Boolean.parseBoolean(nuevoEsMigratorioStr);

						actualizado.setNombre(nuevoNombre);
						actualizado.setEspecie(nuevaEspecie);
						actualizado.setHabitat(nuevoHabitat);
						actualizado.setTipoAlimento(nuevoTipoAlimento);
						actualizado.setPeso(nuevoPeso);
						actualizado.setAltura(nuevaAltura);
						actualizado.setEdad(nuevaEdad);
						actualizado.setFormaPata(nuevaFormaPata);
						actualizado.setColorPluma(nuevoColorPluma);
						actualizado.setCantidadHuevo(nuevoCantidadHuevo);
						actualizado.setTamanoPico(nuevoTamanoPico);
						// actualizado.setEsMigratoria(nuevoEsMigratorio);

						avDAO.actualizar(indiceLista, actualizado);
						JOptionPane.showMessageDialog(null, "Ave actualizada:\n\n" + actualizado.toString(),
								"Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);

					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Mamifero")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (mDAO.getListaMamiferos().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay mamiferos registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= mDAO.getListaMamiferos().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + mDAO.getListaMamiferos().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Mamifero actualizado = mDAO.getListaMamiferos().get(indiceLista);
						JOptionPane.showMessageDialog(null,
								"Mamifero a actualizar: (posicion" + indiceUsuario + "):\n\n"
										+ mDAO.getListaMamiferos().toString(),
								"Informacion actual", JOptionPane.INFORMATION_MESSAGE);

						String nuevoNombre = JOptionPane.showInputDialog(null, "Nombre:", actualizado.getNombre());
						String nuevaEspecie = JOptionPane.showInputDialog(null, "Especie:", actualizado.getEspecie());
						String nuevoHabitat = JOptionPane.showInputDialog(null, "Habitat:", actualizado.getHabitat());
						String nuevoTipoAlimento = JOptionPane.showInputDialog(null, "Tipo alimento:",
								actualizado.getTipoAlimento());
						String nuevoPesoStr = JOptionPane.showInputDialog(null, "Peso:", actualizado.getPeso());
						String nuevaAlturaStr = JOptionPane.showInputDialog(null, "Altura:", actualizado.getAltura());
						String nuevaEdadStr = JOptionPane.showInputDialog(null, "Edad:", actualizado.getEdad());
						String nuevaCantidadPelaje = JOptionPane.showInputDialog(null, "Cantidad de pelaje:",
								actualizado.getCantidadPelaje());
						String nuevoColorPelaje = JOptionPane.showInputDialog(null, "Color pelaje:",
								actualizado.getColorPelaje());
						String nuevoTipoDiente = JOptionPane.showInputDialog(null, "Tipo Dientes:",
								actualizado.getTipoDiente());
						String nuevoNumeroDienteStr = JOptionPane.showInputDialog(null, "Numero de dientes:",
								actualizado.getNumeroDiente());
						String nuevoMedioDesplazamiento = JOptionPane.showInputDialog(null, "Medio desplazamiento:",
								actualizado.getMedioDesplazamiento());

						float nuevoPeso = Float.parseFloat(nuevoPesoStr);
						float nuevaAltura = Float.parseFloat(nuevaAlturaStr);
						int nuevaEdad = Integer.parseInt(nuevaEdadStr);
						int nuevoNumeroDiente = Integer.parseInt(nuevoNumeroDienteStr);

						actualizado.setNombre(nuevoNombre);
						actualizado.setEspecie(nuevaEspecie);
						actualizado.setHabitat(nuevoHabitat);
						actualizado.setTipoAlimento(nuevoTipoAlimento);
						actualizado.setPeso(nuevoPeso);
						actualizado.setAltura(nuevaAltura);
						actualizado.setEdad(nuevaEdad);
						actualizado.setCantidadPelaje(nuevaCantidadPelaje);
						actualizado.setColorPelaje(nuevoColorPelaje);
						actualizado.setTipoDiente(nuevoTipoDiente);
						actualizado.setNumeroDiente(nuevoNumeroDiente);
						actualizado.setMedioDesplazamiento(nuevoMedioDesplazamiento);

						mDAO.actualizar(indiceLista, actualizado);
						JOptionPane.showMessageDialog(null, "Mamifero actualizado:\n\n" + actualizado.toString(),
								"Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);

					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Reptil")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (rDAO.getListaReptiles().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay reptiles registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= rDAO.getListaReptiles().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + rDAO.getListaReptiles().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Reptil actualizado = rDAO.getListaReptiles().get(indiceLista);
						JOptionPane.showMessageDialog(null,
								"Reptil a actualizar: (posicion" + indiceUsuario + "):\n\n"
										+ rDAO.getListaReptiles().toString(),
								"Informacion actual", JOptionPane.INFORMATION_MESSAGE);

						String nuevoNombre = JOptionPane.showInputDialog(null, "Nombre:", actualizado.getNombre());
						String nuevaEspecie = JOptionPane.showInputDialog(null, "Especie:", actualizado.getEspecie());
						String nuevoHabitat = JOptionPane.showInputDialog(null, "Habitat:", actualizado.getHabitat());
						String nuevoTipoAlimento = JOptionPane.showInputDialog(null, "Tipo alimento:",
								actualizado.getTipoAlimento());
						String nuevoPesoStr = JOptionPane.showInputDialog(null, "Peso:", actualizado.getPeso());
						String nuevaAlturaStr = JOptionPane.showInputDialog(null, "Altura:", actualizado.getAltura());
						String nuevaEdadStr = JOptionPane.showInputDialog(null, "Edad:", actualizado.getEdad());
						String nuevoTipoDesplazamiento = JOptionPane.showInputDialog(null, "Tipo desplazamiento:",
								actualizado.getTipoDesplazamiento());
						String nuevoTipoDiente = JOptionPane.showInputDialog(null, "Tipo dientes:",
								actualizado.getTipoDiente());
						String nuevaTemperaturaCorporalStr = JOptionPane.showInputDialog(null, "Temperatura corporal:",
								actualizado.getTemperaturaCorporal());
						// String nuevoEsVenenosoStr = JOptionPane.showInputDialog(null, "Es
						// venenoso?:", actualizado.get());

						float nuevoPeso = Float.parseFloat(nuevoPesoStr);
						float nuevaAltura = Float.parseFloat(nuevaAlturaStr);
						int nuevaEdad = Integer.parseInt(nuevaEdadStr);
						float nuevaTemperaturaCorporal = Float.parseFloat(nuevaTemperaturaCorporalStr);

						actualizado.setNombre(nuevoNombre);
						actualizado.setEspecie(nuevaEspecie);
						actualizado.setHabitat(nuevoHabitat);
						actualizado.setTipoAlimento(nuevoTipoAlimento);
						actualizado.setPeso(nuevoPeso);
						actualizado.setAltura(nuevaAltura);
						actualizado.setEdad(nuevaEdad);
						actualizado.setTipoDesplazamiento(nuevoTipoDesplazamiento);
						actualizado.setTipoDiente(nuevoTipoDiente);
						actualizado.setTemperaturaCorporal(nuevaTemperaturaCorporal);

						rDAO.actualizar(indiceLista, actualizado);
						JOptionPane.showMessageDialog(null, "Reptil actualizado:\n\n" + actualizado.toString(),
								"Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);

					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Pez")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (pDAO.getListaPeces().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay peces registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= rDAO.getListaReptiles().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + rDAO.getListaReptiles().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Pez actualizado = pDAO.getListaPeces().get(indiceLista);
						JOptionPane.showMessageDialog(null,
								"Pez a actualizar: (posicion" + indiceUsuario + "):\n\n"
										+ pDAO.getListaPeces().toString(),
								"Informacion actual", JOptionPane.INFORMATION_MESSAGE);

						String nuevoNombre = JOptionPane.showInputDialog(null, "Nombre:", actualizado.getNombre());
						String nuevaEspecie = JOptionPane.showInputDialog(null, "Especie:", actualizado.getEspecie());
						String nuevoHabitat = JOptionPane.showInputDialog(null, "Habitat:", actualizado.getHabitat());
						String nuevoTipoAlimento = JOptionPane.showInputDialog(null, "Tipo alimento:",
								actualizado.getTipoAlimento());
						String nuevoPesoStr = JOptionPane.showInputDialog(null, "Peso:", actualizado.getPeso());
						String nuevaAlturaStr = JOptionPane.showInputDialog(null, "Altura:", actualizado.getAltura());
						String nuevaEdadStr = JOptionPane.showInputDialog(null, "Edad:", actualizado.getEdad());
						String nuevoTipoAgua = JOptionPane.showInputDialog(null, "Tipo Agua:",
								actualizado.getTipoAgua());
						String nuevoColorEscama = JOptionPane.showInputDialog(null, "Color escama:",
								actualizado.getColorEscama());
						String nuevoTipoRespiracion = JOptionPane.showInputDialog(null, "Tipo respiracion:",
								actualizado.getTipoRespiracion());
						String nuevoNumeroAletaStr = JOptionPane.showInputDialog(null, "Numero aleta:",
								actualizado.getNumeroAleta());
						String nuevaProfundidadMaximaStr = JOptionPane.showInputDialog(null, "Profundidad maxima:",
								actualizado.getProfundidadMaxima());

						float nuevoPeso = Float.parseFloat(nuevoPesoStr);
						float nuevaAltura = Float.parseFloat(nuevaAlturaStr);
						int nuevaEdad = Integer.parseInt(nuevaEdadStr);
						int nuevoNumeroAleta = Integer.parseInt(nuevoNumeroAletaStr);
						float nuevaProfundidadMaxima = Float.parseFloat(nuevaProfundidadMaximaStr);

						actualizado.setNombre(nuevoNombre);
						actualizado.setEspecie(nuevaEspecie);
						actualizado.setHabitat(nuevoHabitat);
						actualizado.setTipoAlimento(nuevoTipoAlimento);
						actualizado.setPeso(nuevoPeso);
						actualizado.setAltura(nuevaAltura);
						actualizado.setEdad(nuevaEdad);
						actualizado.setTipoAgua(nuevoTipoAgua);
						actualizado.setColorEscama(nuevoColorEscama);
						actualizado.setTipoRespiracion(nuevoTipoRespiracion);
						actualizado.setNumeroAleta(nuevoNumeroAleta);
						actualizado.setProfundidadMaxima(nuevaProfundidadMaxima);

						pDAO.actualizar(indiceLista, actualizado);
						JOptionPane.showMessageDialog(null, "Pez actualizado:\n\n" + actualizado.toString(),
								"Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);

					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Juguete")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (jDAO.getListaJuguetes().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay juguetes creados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= jDAO.getListaJuguetes().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + jDAO.getListaJuguetes().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Juguete actualizado = jDAO.getListaJuguetes().get(indiceLista);
						JOptionPane.showMessageDialog(null,
								"Juguete a actualizar: (posicion" + indiceUsuario + "):\n\n"
										+ jDAO.getListaJuguetes().toString(),
								"Informacion actual", JOptionPane.INFORMATION_MESSAGE);
						
						String nuevaMarca = JOptionPane.showInputDialog(null, "Marca:", actualizado.getMarca());
						String nuevoPrecioStr = JOptionPane.showInputDialog(null, "Precio:", actualizado.getPrecio());
						String nuevoIdProductoStr = JOptionPane.showInputDialog(null, "ID producto:", actualizado.getIdProducto());
						String nuevoNombre = JOptionPane.showInputDialog(null, "Nombre:", actualizado.getNombre());
						String nuevoColor = JOptionPane.showInputDialog(null, "Color:", actualizado.getColor());
						String nuevoTipoJuguete = JOptionPane.showInputDialog(null, "Tipo juguete:", actualizado.getTipoJuguete());
						String nuevaGarantia = JOptionPane.showInputDialog(null, "Garantia:", actualizado.getGarantia());
						
						float nuevoPrecio = Float.parseFloat(nuevoPrecioStr);
						int nuevoIdProducto = Integer.parseInt(nuevoIdProductoStr);
						
						actualizado.setNombre(nuevoNombre);
						actualizado.setPrecio(nuevoPrecio);
						actualizado.setIdProducto(nuevoIdProducto);
						actualizado.setNombre(nuevoNombre);
						actualizado.setColor(nuevoColor);
						actualizado.setTipoJuguete(nuevoTipoJuguete);
						actualizado.setGarantia(nuevaGarantia);
						
						jDAO.actualizar(indiceLista, actualizado);
						JOptionPane.showMessageDialog(null, "Juguete actualizado:\n\n" + actualizado.toString(),
								"Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);

						
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);

				}
			} else if (opcion.equals("Medicamento")) {

				try {
					int indiceUsuario = Integer.parseInt(va.getPanelEliminar().getCampoIndex().getText());
					int indiceLista = indiceUsuario - 1;
					if (meDAO.getListaMedicamentos().isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay medicamentos registrados.", "lista vacia",
								JOptionPane.WARNING_MESSAGE);

					} else if (indiceLista < 0 || indiceLista >= meDAO.getListaMedicamentos().size()) {
						JOptionPane.showMessageDialog(null,
								"Indice invalido. Debe estar entre 1 y " + meDAO.getListaMedicamentos().size(),
								"Indice incorrecto", JOptionPane.WARNING_MESSAGE);

					} else {
						Medicamento actualizado = meDAO.getListaMedicamentos().get(indiceLista);
						JOptionPane.showMessageDialog(null,
								"Medicamento a actualizar: (posicion" + indiceUsuario + "):\n\n"
										+ meDAO.getListaMedicamentos().toString(),
								"Informacion actual", JOptionPane.INFORMATION_MESSAGE);
						
						String nuevaMarca = JOptionPane.showInputDialog(null, "Marca:", actualizado.getMarca());
						String nuevoPrecioStr = JOptionPane.showInputDialog(null, "Precio:", actualizado.getPrecio());
						String nuevoIdProductoStr = JOptionPane.showInputDialog(null, "ID producto:", actualizado.getIdProducto());
						String nuevoNombreComercial = JOptionPane.showInputDialog(null, "Nombre comercial:", actualizado.getNombreComercial());
						String nuevoNombreCientifico = JOptionPane.showInputDialog(null, "Nombre cientifico:", actualizado.getNombreCientifico());
						String nuevaDosisStr = JOptionPane.showInputDialog(null, "Dosis:", actualizado.getDosis());
						
						float nuevoPrecio = Float.parseFloat(nuevoPrecioStr);
						int nuevoIdProducto = Integer.parseInt(nuevoIdProductoStr);
						float nuevaDosis = Float.parseFloat(nuevaDosisStr);
						
						actualizado.setMarca(nuevaMarca);
						actualizado.setPrecio(nuevoPrecio);
						actualizado.setIdProducto(nuevoIdProducto);
						actualizado.setNombreComercial(nuevoNombreComercial);
						actualizado.setNombreCientifico(nuevoNombreCientifico);
						actualizado.setDosis(nuevaDosis);
						
						meDAO.actualizar(indiceLista, actualizado);
						JOptionPane.showMessageDialog(null, "Medicamento actualizado:\n\n" + actualizado.toString(),
								"Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);

					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: el indice debe ser un numero entero.",
							"Error de formato", JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(va, "Error creando: " + e.getMessage());
			e.printStackTrace();

		}

	}

	public void iniciar() {
		vp.setVisible(true);
	}

}
