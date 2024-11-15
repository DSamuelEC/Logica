package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	private PanelPrincipio pPrincipio;
	private PanelCuestionario pCuestionario;
	private PanelFormularioFinal pFormFinal;
	private PanelResultado presultado;

	public VentanaPrincipal() {
		setTitle("Nivel de la Calidad de sueño");
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(129, 246, 209));
		getContentPane().setLayout(null);

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void inicializarComponentes() {
		pPrincipio = new PanelPrincipio();
		getContentPane().add(pPrincipio);
		
		pCuestionario = new PanelCuestionario();
		getContentPane().add(pCuestionario);
		
		pFormFinal = new PanelFormularioFinal();
		getContentPane().add(pFormFinal);
		
		presultado = new PanelResultado();
		getContentPane().add(presultado);
	}

	public PanelPrincipio getpPrincipio() {
		return pPrincipio;
	}

	public void setpPrincipio(PanelPrincipio pPrincipio) {
		this.pPrincipio = pPrincipio;
	}

	public PanelCuestionario getpCuestionario() {
		return pCuestionario;
	}

	public void setpCuestionario(PanelCuestionario pCuestionario) {
		this.pCuestionario = pCuestionario;
	}

	public PanelFormularioFinal getpFormFinal() {
		return pFormFinal;
	}

	public void setpFormFinal(PanelFormularioFinal pFormFinal) {
		this.pFormFinal = pFormFinal;
	}

	public PanelResultado getPresultado() {
		return presultado;
	}

	public void setPresultado(PanelResultado presultado) {
		this.presultado = presultado;
	}
}