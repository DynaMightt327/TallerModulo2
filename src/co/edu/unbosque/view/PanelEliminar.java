package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelEliminar extends JPanel{
		private JButton borrar;
		private JTextField campoIndex;
		private JComboBox<String> opcion;
		private JTextArea texto;
	
		public PanelEliminar() {
			initComps();
			setVisible(false);
		}
		
		public void initComps() {
			this.setBounds(105, 217, 780, 375);
			this.setLayout(null);
			this.setBackground(Color.decode("#80665c"));
			
			ImageIcon imageLogo = new ImageIcon(getClass().getResource("cry.JPG"));
			JLabel lIcon = new JLabel(imageLogo);
			lIcon.setBounds(450, 20, 320, 350);
			add(lIcon);
			
			borrar = new JButton("ELIMINAR");
			borrar.setBounds(150, 260, 110, 30);
			borrar.setBorderPainted(false);
			borrar.setLayout(null);
			borrar.setFont(new Font("Georgia", Font.BOLD, 12));
			borrar.setBackground(Color.decode("#e1c8ad"));
			borrar.setForeground(Color.black);
			add(borrar);
			
			texto = new JTextArea("Seleccione que desea eliminar e ingrese \nel indice de dicho elemento:");
			texto.setBounds(75, 100, 500, 60);
			texto.setFont(new Font("Agency FB", Font.BOLD, 22));
			texto.setEditable(false);
			texto.setForeground(Color.decode("#f6efe7"));
			texto.setBackground(Color.decode("#80665c"));
			add(texto);
			
			campoIndex = new JTextField();
			campoIndex.setBounds(125, 210, 164, 32);
			campoIndex.setFont(new Font("Agency FB", Font.BOLD, 18));
			campoIndex.setForeground(Color.decode("#111d15"));
			campoIndex.setBackground(Color.decode("#e1c8ad"));
			campoIndex.setBorder(null);
			add(campoIndex);
			
			opcion = new JComboBox<String>(new String[] { "...", "Administrativo", "Veterinario", "Cliente", "Ave", "Mamifero", "Reptil", "Pez", "Juguete", "Medicamento" });
			opcion.setBounds(125, 160, 164, 32);
			opcion.setFont(new Font("Agency FB", Font.BOLD, 18));
			opcion.setForeground(Color.decode("#111d15"));
			opcion.setBackground(Color.decode("#e1c8ad"));
			opcion.setBorder(null);
			add(opcion);
		}

		public JButton getBorrar() {
			return borrar;
		}

		public void setBorrar(JButton borrar) {
			this.borrar = borrar;
		}

		public JTextField getCampoIndex() {
			return campoIndex;
		}

		public void setCampoIndex(JTextField campoIndex) {
			this.campoIndex = campoIndex;
		}

		public JComboBox<String> getOpcion() {
			return opcion;
		}

		public void setOpcion(JComboBox<String> opcion) {
			this.opcion = opcion;
		}

		public JTextArea getTexto() {
			return texto;
		}

		public void setTexto(JTextArea texto) {
			this.texto = texto;
		}

}
