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
        setBounds(150, 180, 400, 300);
        setLayout(new GridLayout(5, 2));
        setBackground(new Color(129, 246, 209));

        inicializarComponentes();

        setVisible(false);
    }

    public void inicializarComponentes() {
        add(new JLabel("Edad:", SwingConstants.CENTER));
        txtEdad = new JTextField();
        configurarPlaceholder(txtEdad, "En años");
        add(txtEdad);

        add(new JLabel("Sensación de Descanso:", SwingConstants.CENTER));
        txtSensacionDescanso = new JTextField();
        configurarPlaceholder(txtSensacionDescanso, "De 0 a 10");
        add(txtSensacionDescanso);

        add(new JLabel("Duración del Sueño:", SwingConstants.CENTER));
        txtDuracionSueno = new JTextField();
        configurarPlaceholder(txtDuracionSueno, "En horas");
        add(txtDuracionSueno);

        add(new JLabel("Tiempo para Conciliar el Sueño:", SwingConstants.CENTER));
        txtTiempoConciliarSueno = new JTextField();
        configurarPlaceholder(txtTiempoConciliarSueno, "En minutos");
        add(txtTiempoConciliarSueno);

        btnVolver = new JButton("Volver");
        add(btnVolver);

        btnSubmit = new JButton("Enviar");
        add(btnSubmit);
    }

    private void configurarPlaceholder(JTextField textField, String placeholder) {
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);

        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
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
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }
}