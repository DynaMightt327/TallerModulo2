package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelMostrar extends JPanel{
	
	//seleccionar que se desea mostrar
		private JButton selecPersona;
		private JButton mAdmin;
		private JButton mVet;
		private JButton mCliente;
		
		private JButton selectMascota;
		private JButton mAve;
		private JButton mMamifero;
		private JButton mPez;
		private JButton mReptil;
		
		private JButton selecProducto;
		private JButton mJuguete;
		private JButton mMedicamento;
	
	public PanelMostrar() {
		initComps();
		setVisible(false);
	}
	
	public void initComps() {
		this.setBounds(170, 120, 780, 375);
		this.setLayout(null);
		this.setBackground(Color.decode("#6d4c41"));
	}

}
