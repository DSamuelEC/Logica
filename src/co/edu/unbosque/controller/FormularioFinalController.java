package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.FuzzyModel;
import co.edu.unbosque.view.VentanaPrincipal;

public class FormularioFinalController {
    private FuzzyModel model;
    private VentanaPrincipal ventana;

    public FormularioFinalController(FuzzyModel model, VentanaPrincipal ventana) {
        this.model = model;
        this.ventana = ventana;

        ventana.getpFormFinal().getBtnFinalizar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarRespuestas()) {
                    calcularResultado();
                }
            }
        });

        ventana.getpFormFinal().getBtnVolver().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCuestionario();
            }
        });
    }

    private boolean validarRespuestas() {
        if (!ventana.getpFormFinal().getCb1SI().isSelected() && !ventana.getpFormFinal().getCb1NO().isSelected()) {
            mostrarError("Por favor, responda la pregunta 1.");
            return false;
        }
        if (!ventana.getpFormFinal().getCb2SI().isSelected() && !ventana.getpFormFinal().getCb2NO().isSelected()) {
            mostrarError("Por favor, responda la pregunta 2.");
            return false;
        }
        if (!ventana.getpFormFinal().getCb3SI().isSelected() && !ventana.getpFormFinal().getCb3NO().isSelected()) {
            mostrarError("Por favor, responda la pregunta 3.");
            return false;
        }
        if (!ventana.getpFormFinal().getCb4SI().isSelected() && !ventana.getpFormFinal().getCb4NO().isSelected()) {
            mostrarError("Por favor, responda la pregunta 4.");
            return false;
        }
        if (!ventana.getpFormFinal().getCb5SI().isSelected() && !ventana.getpFormFinal().getCb5NO().isSelected()) {
            mostrarError("Por favor, responda la pregunta 5.");
            return false;
        }
        if (!ventana.getpFormFinal().getCb6SI().isSelected() && !ventana.getpFormFinal().getCb6NO().isSelected()) {
            mostrarError("Por favor, responda la pregunta 6.");
            return false;
        }
        if (!ventana.getpFormFinal().getCb7SI().isSelected() && !ventana.getpFormFinal().getCb7NO().isSelected()) {
            mostrarError("Por favor, responda la pregunta 7.");
            return false;
        }
        if (!ventana.getpFormFinal().getCb8SI().isSelected() && !ventana.getpFormFinal().getCb8NO().isSelected()) {
            mostrarError("Por favor, responda la pregunta 8.");
            return false;
        }
        return true;
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(ventana, mensaje, "Error de validación", JOptionPane.ERROR_MESSAGE);
    }

    private void calcularResultado() {
        try {
            double horasSueno = Double.parseDouble(ventana.getpCuestionario().getTxtDuracionSueno().getText());
            double tiempoConciliar = Double.parseDouble(ventana.getpCuestionario().getTxtTiempoConciliarSueno().getText());
            double sensacionDescanso = Double.parseDouble(ventana.getpCuestionario().getTxtSensacionDescanso().getText());
            double edad = Double.parseDouble(ventana.getpCuestionario().getTxtEdad().getText());
            double puntosPreguntas = calcularPuntosPreguntas();
            String resultado = model.calcularCalidadSueno(horasSueno, tiempoConciliar, sensacionDescanso, puntosPreguntas, edad);
            ventana.getPresultado().getLblResultado().setText(resultado);
            mostrarResultado();
        } catch (NumberFormatException ex) {
            ventana.getPresultado().getLblResultado().setText("Error: Entrada no válida");
            mostrarResultado();
        }
    }

    private double calcularPuntosPreguntas() {
        double puntos = 0;
        if (ventana.getpFormFinal().getCb1SI().isSelected()) puntos += 2;
        if (ventana.getpFormFinal().getCb2NO().isSelected()) puntos += 2;
        if (ventana.getpFormFinal().getCb3SI().isSelected()) puntos += 2;
        if (ventana.getpFormFinal().getCb4SI().isSelected()) puntos += 1;
        if (ventana.getpFormFinal().getCb5SI().isSelected()) puntos += 1;
        if (ventana.getpFormFinal().getCb6SI().isSelected()) puntos += 2;
        if (ventana.getpFormFinal().getCb7NO().isSelected()) puntos += 2;
        if (ventana.getpFormFinal().getCb8NO().isSelected()) puntos += 2;
        return puntos;
    }

    private void mostrarResultado() {
        ventana.getpFormFinal().setVisible(false);
        ventana.getPresultado().setVisible(true);
    }

    private void mostrarCuestionario() {
        ventana.getpFormFinal().setVisible(false);
        ventana.getpCuestionario().setVisible(true);
    }
}