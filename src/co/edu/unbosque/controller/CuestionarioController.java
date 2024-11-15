package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import co.edu.unbosque.view.VentanaPrincipal;

public class CuestionarioController {
    private VentanaPrincipal ventana;

    public CuestionarioController(VentanaPrincipal ventana) {
        this.ventana = ventana;

        ventana.getpCuestionario().getBtnSubmit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarDatos()) {
                    mostrarFormularioFinal();
                }
            }
        });

        ventana.getpCuestionario().getBtnVolver().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPrincipio();
            }
        });
    }

    private boolean validarDatos() {
        try {
            double edad = Double.parseDouble(ventana.getpCuestionario().getTxtEdad().getText());
            double sensacionDescanso = Double.parseDouble(ventana.getpCuestionario().getTxtSensacionDescanso().getText());
            double duracionSueno = Double.parseDouble(ventana.getpCuestionario().getTxtDuracionSueno().getText());
            double tiempoConciliarSueno = Double.parseDouble(ventana.getpCuestionario().getTxtTiempoConciliarSueno().getText());

            if (edad < 0 || edad > 100) {
                mostrarError("La edad debe estar entre 0 y 100.");
                return false;
            }
            if (sensacionDescanso < 0 || sensacionDescanso > 10) {
                mostrarError("La sensación de descanso debe estar entre 0 y 10.");
                return false;
            }
            if (duracionSueno < 0 || duracionSueno > 10) {
                mostrarError("La duración del sueño debe estar entre 0 y 10 horas.");
                return false;
            }
            if (tiempoConciliarSueno < 0 || tiempoConciliarSueno > 60) {
                mostrarError("El tiempo para conciliar el sueño debe estar entre 0 y 60 minutos.");
                return false;
            }
            return true;
        } catch (NumberFormatException ex) {
            mostrarError("Por favor, ingrese solo números.");
            return false;
        }
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(ventana, mensaje, "Error de validación", JOptionPane.ERROR_MESSAGE);
    }

    private void mostrarFormularioFinal() {
        ventana.getpCuestionario().setVisible(false);
        ventana.getpFormFinal().setVisible(true);
    }

    private void mostrarPrincipio() {
        ventana.getpCuestionario().setVisible(false);
        ventana.getpPrincipio().setVisible(true);
    }
}