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
		default:
			break;
		}
		
	}
	
	public void iniciar() {
		vp.setVisible(true);
	}
}
