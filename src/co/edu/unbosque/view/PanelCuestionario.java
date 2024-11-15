package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelCuestionario extends JPanel {
	 private JTextField txtEdad;
	    private JTextField txtSensacionDescanso;
	    private JTextField txtDuracionSueno;
	    private JTextField txtTiempoConciliarSueno;
	    private JButton btnSubmit;
	    private JButton btnVolver;

	    public PanelCuestionario() {
	        setBounds(200, 200, 300, 300);
	        setLayout(new GridLayout(5, 2));
	        setBackground(new Color(129, 246, 209));

	        inicializarComponentes();

	        setVisible(false);
	    }

	    public void inicializarComponentes() {
	        add(new JLabel("Edad:", SwingConstants.CENTER));
	        txtEdad = new JTextField();
	        add(txtEdad);

	        add(new JLabel("Sensación de Descanso:", SwingConstants.CENTER));
	        txtSensacionDescanso = new JTextField();
	        add(txtSensacionDescanso);

	        add(new JLabel("Duración del Sueño:", SwingConstants.CENTER));
	        txtDuracionSueno = new JTextField();
	        add(txtDuracionSueno);

	        add(new JLabel("Tiempo para Conciliar el Sueño:", SwingConstants.CENTER));
	        txtTiempoConciliarSueno = new JTextField();
	        add(txtTiempoConciliarSueno);

	        btnSubmit = new JButton("Enviar");
	        add(btnSubmit);
	        
	        btnVolver = new JButton("Volver");
	        add(btnVolver);
	    }

		public JTextField getTxtEdad() {
			return txtEdad;
		}

		public void setTxtEdad(JTextField txtEdad) {
			this.txtEdad = txtEdad;
		}

		public JTextField getTxtSensacionDescanso() {
			return txtSensacionDescanso;
		}

		public void setTxtSensacionDescanso(JTextField txtSensacionDescanso) {
			this.txtSensacionDescanso = txtSensacionDescanso;
		}

		public JTextField getTxtDuracionSueno() {
			return txtDuracionSueno;
		}

		public void setTxtDuracionSueno(JTextField txtDuracionSueno) {
			this.txtDuracionSueno = txtDuracionSueno;
		}

		public JTextField getTxtTiempoConciliarSueno() {
			return txtTiempoConciliarSueno;
		}

		public void setTxtTiempoConciliarSueno(JTextField txtTiempoConciliarSueno) {
			this.txtTiempoConciliarSueno = txtTiempoConciliarSueno;
		}

		public JButton getBtnSubmit() {
			return btnSubmit;
		}

		public void setBtnSubmit(JButton btnSubmit) {
			this.btnSubmit = btnSubmit;
		}

		public JButton getBtnVolver() {
			return btnVolver;
		}

		public void setBtnVolver(JButton btnVolver) {
			this.btnVolver = btnVolver;
		}

	    
	/*private JTextField txtEdad;
	private JTextField txtSensacionDescanso;
	private JTextField txtDuracionSueno;
	private JTextField txtTiempoConciliarSueno;
	private JButton btnSubmit;

	public PanelCuestionario() {
		setLayout(null);
		setBackground(Color.WHITE);

		inicializarComponentes();

		setVisible(true);
	}

	public void inicializarComponentes() {
		txtEdad = new JTextField();
		txtEdad.setBounds(200, 100, 320, 80);
		configurarPlaceholder(txtEdad, "Indicanos tu edad, de 0 a 100");

		txtSensacionDescanso = new JTextField();
		txtSensacionDescanso.setBounds(200, 200, 320, 80);
		configurarPlaceholder(txtSensacionDescanso, "De 0 a 10, cuál es tu sensación de descanso?");

		txtDuracionSueno = new JTextField();
		txtDuracionSueno.setBounds(200, 300, 320, 80);
		configurarPlaceholder(txtDuracionSueno, "Cuántas horas de sueño duermes? Siendo 10 el máximo");

		txtTiempoConciliarSueno = new JTextField();
		txtTiempoConciliarSueno.setBounds(200, 400, 320, 80);
		configurarPlaceholder(txtTiempoConciliarSueno, "Cuántos minutos te demoras en dormir? de 0 a 60");

		btnSubmit = new JButton("Enviar");
		btnSubmit.setBounds(280, 500, 80, 50);
		btnSubmit.setActionCommand("BTN_SUBMIT_CUESTIONARIO");

		add(txtEdad);
		add(txtSensacionDescanso);
		add(txtDuracionSueno);
		add(txtTiempoConciliarSueno);
		add(btnSubmit);
	}

	private void configurarPlaceholder(JTextField textField, String placeholder) {
		// Establecer el placeholder inicialmente
		textField.setText(placeholder);
		textField.setForeground(Color.GRAY);

		textField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				// Si el texto es igual al placeholder, lo borra y cambia el color
				if (textField.getText().equals(placeholder)) {
					textField.setText("");
					textField.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				// Si el campo está vacío al perder el foco, restablece el placeholder
				if (textField.getText().isEmpty()) {
					textField.setForeground(Color.GRAY);
					textField.setText(placeholder);
				}
			}
		});
	}

	public JTextField getTxtEdad() {
		return txtEdad;
	}

	public void setTxtEdad(JTextField txtEdad) {
		this.txtEdad = txtEdad;
	}

	public JTextField getTxtSensacionDescanso() {
		return txtSensacionDescanso;
	}

	public void setTxtSensacionDescanso(JTextField txtSensacionDescanso) {
		this.txtSensacionDescanso = txtSensacionDescanso;
	}

	public JTextField getTxtDuracionSueno() {
		return txtDuracionSueno;
	}

	public void setTxtDuracionSueno(JTextField txtDuracionSueno) {
		this.txtDuracionSueno = txtDuracionSueno;
	}

	public JTextField getTxtTiempoConciliarSueno() {
		return txtTiempoConciliarSueno;
	}

	public void setTxtTiempoConciliarSueno(JTextField txtTiempoConciliarSueno) {
		this.txtTiempoConciliarSueno = txtTiempoConciliarSueno;
	}

	public JButton getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(JButton btnSubmit) {
		this.btnSubmit = btnSubmit;
	}*/
}