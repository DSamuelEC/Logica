package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelPrincipio extends JPanel {
	private JLabel lblBienvenida;
	private JButton btnInicia;

	public PanelPrincipio() {
		setBounds(200,200,300,120);
		setLayout(new GridLayout(2,1));
		setBackground(new Color(129, 246, 209));
		setBackground(Color.WHITE);
		

		inicializarComponentes();

		setVisible(true);
	}

	public void inicializarComponentes() {
		lblBienvenida = new JLabel("¡Mide tu calidad de sueño!", SwingConstants.CENTER);
		lblBienvenida.setOpaque(true);
		lblBienvenida.setBackground(new Color(129, 246, 209));
		

		btnInicia = new JButton("Inicia");
	
		btnInicia.setActionCommand("BTN_INICIA");

		add(lblBienvenida);
		add(btnInicia);
	}

	public JLabel getLblBienvenida() {
		return lblBienvenida;
	}

	public void setLblBienvenida(JLabel lblBienvenida) {
		this.lblBienvenida = lblBienvenida;
	}

	public JButton getBtnInicia() {
		return btnInicia;
	}

	public void setBtnInicia(JButton btnInicia) {
		this.btnInicia = btnInicia;
	}
}