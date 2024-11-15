package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class PanelResultado extends JPanel {
	private JLabel lblTitulo;
	private JLabel lblResultado;
	private JButton btnVolver;

	public PanelResultado() {
		setBounds(50,50,600,900);
		setLayout(null);
		setBackground(new Color(129, 246, 209)); // Fondo similar al de la imagen

		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {
		// Etiqueta de título
		lblTitulo = new JLabel("Tu resultado es:");
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 24));
		lblTitulo.setBounds(200, 100, 300, 30);
		add(lblTitulo);

		// Etiqueta para el resultado del proceso
		lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Arial", Font.PLAIN, 24));
		lblResultado.setBounds(200, 200, 300, 30);
		add(lblResultado);
		
		btnVolver = new JButton("Volver");

		btnVolver.setBounds(240, 300, 120, 50);
		add(btnVolver);
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTitulo = lblTitulo;
	}

	public JLabel getLblResultado() {
		return lblResultado;
	}

	public void setLblResultado(JLabel lblResultado) {
		this.lblResultado = lblResultado;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	
	
}