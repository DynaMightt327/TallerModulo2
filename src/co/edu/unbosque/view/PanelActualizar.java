package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelActualizar extends JPanel{
	//seleccionar que se desea crear
		private JButton selecPersona;
		private JButton cAdmin;
		private JButton cVet;
		private JButton cCliente;
		
		private JButton selectMascota;
		private JButton cAve;
		private JButton cMamifero;
		private JButton cPez;
		private JButton cReptil;
		
		private JButton selecProducto;
		private JButton cJuguete;
		private JButton cMedicamento;
		
		public PanelActualizar() {
			initComps();
			setVisible(false);
		}
		
		public void initComps() {
			this.setBounds(170, 120, 780, 375);
			this.setLayout(null);
			this.setBackground(Color.decode("#622347"));
		}

}
