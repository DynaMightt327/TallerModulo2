package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaAdmin;
import co.edu.unbosque.view.VentanaCliente;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VentanaVet;

public class Controller implements ActionListener{
	
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
		
		//========
		va.getVolver().addActionListener(this);
		va.getVolver().setActionCommand("b_volver_admin");
		
		vv.getVolver().addActionListener(this);
		vv.getVolver().setActionCommand("b_volver_vet");
		
		vc.getVolver().addActionListener(this);
		vc.getVolver().setActionCommand("b_volver_cliente");
		
		//========ADMINISTRADOR=========
		va.getCrear().addActionListener(this);
		va.getCrear().setActionCommand("crear_en_admin");
		
		va.getMostrar().addActionListener(this);
		va.getMostrar().setActionCommand("mostrar_en_admin");

		va.getActualizar().addActionListener(this);
		va.getActualizar().setActionCommand("actualizar_en_admin");
		
		va.getEliminar().addActionListener(this);
		va.getEliminar().setActionCommand("eliminar_en_admin");
		

		//=================
		vv.getCrear().addActionListener(this);
		vv.getCrear().setActionCommand("crear_en_vet");
		
		vv.getMostrar().addActionListener(this);
		vv.getMostrar().setActionCommand("mostrar_en_vet");
		
		vv.getActualizar().addActionListener(this);
		vv.getActualizar().setActionCommand("actualizar_en_vet");
		
		vv.getEliminar().addActionListener(this);
		vv.getEliminar().setActionCommand("eliminar_en_vet");

		//=================
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
		case "b_ventana_vet":{
			vp.setVisible(false);
			vv.setVisible(true);
			break;
		}
		case "b_ventana_cliente":{
			vp.setVisible(false);
			vc.setVisible(true);
			break;
		}
		case "b_volver_admin":{
			va.setVisible(false);
			vp.setVisible(true);
			break;
		}
		case "b_volver_vet":{
			vv.setVisible(false);
			vp.setVisible(true);
			break;
		}
		case "b_volver_cliente":{
			vc.setVisible(false);
			vp.setVisible(true);
			break;
		}
		case "crear_en_admin":{
			va.getPanelCrear().setVisible(true);
			va.getPanelMostrar().setVisible(false);
			va.getPanelActualizar().setVisible(false);
			va.getPanelEliminar().setVisible(false);

			break;
		}
		case "mostrar_en_admin":{
			va.getPanelCrear().setVisible(false);
			va.getPanelMostrar().setVisible(true);
			va.getPanelActualizar().setVisible(false);
			va.getPanelEliminar().setVisible(false);
			break;
		}
		case "actualizar_en_admin":{
			va.getPanelCrear().setVisible(false);
			va.getPanelMostrar().setVisible(false);
			va.getPanelActualizar().setVisible(true);
			va.getPanelEliminar().setVisible(false);
			break;
		}
		case "eliminar_en_admin":{
			va.getPanelCrear().setVisible(false);
			va.getPanelMostrar().setVisible(false);
			va.getPanelActualizar().setVisible(false);
			va.getPanelEliminar().setVisible(true);
			break;
		}
		case "crear_en_vet":{
			vv.getPanelCrear().setVisible(true);
			vv.getPanelMostrar().setVisible(false);
			vv.getPanelActualizar().setVisible(false);
			vv.getPanelEliminar().setVisible(false);
			
			break;
		}
		case "mostrar_en_vet":{
			vv.getPanelCrear().setVisible(false);
			vv.getPanelMostrar().setVisible(true);
			vv.getPanelActualizar().setVisible(false);
			vv.getPanelEliminar().setVisible(false);
			break;
		}
		case "actualizar_en_vet":{
			vv.getPanelCrear().setVisible(false);
			vv.getPanelMostrar().setVisible(false);
			vv.getPanelActualizar().setVisible(true);
			vv.getPanelEliminar().setVisible(false);
			break;
		}
		case "eliminar_en_vet":{
			vv.getPanelCrear().setVisible(false);
			vv.getPanelMostrar().setVisible(false);
			vv.getPanelActualizar().setVisible(false);
			vv.getPanelEliminar().setVisible(true);
			break;
		}
		case "mostrar_en_cliente":{
			vc.getPanelMostrar().setVisible(true);
			break;
		}
		default:
			break;
		}
		
	}
	
	public void actualizarCampoTipo() {
		//String cmbTipo = (String) va.getcm
	}
	
	public void iniciar() {
		vp.setVisible(true);
	}
	

}
