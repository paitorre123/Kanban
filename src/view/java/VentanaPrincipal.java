package view.java;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	
	public VentanaPrincipal(int ancho, int alto) {
		super("Java Kanban");
		super.setSize(ancho, alto);
		super.setVisible(true);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
