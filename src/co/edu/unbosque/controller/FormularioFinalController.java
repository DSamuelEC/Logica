package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                calcularResultado();
            }
        });

        ventana.getpFormFinal().getBtnVolver().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCuestionario();
            }
        });
    }

    private void calcularResultado() {
        try {
            double horasSueno = Double.parseDouble(ventana.getpCuestionario().getTxtDuracionSueno().getText());
            double tiempoConciliar = Double.parseDouble(ventana.getpCuestionario().getTxtTiempoConciliarSueno().getText());
            double sensacionDescanso = Double.parseDouble(ventana.getpCuestionario().getTxtSensacionDescanso().getText());
            double edad = Double.parseDouble(ventana.getpCuestionario().getTxtEdad().getText());
            String resultado = model.calcularCalidadSueno(horasSueno, tiempoConciliar, sensacionDescanso, 0, edad);
            ventana.getPresultado().getLblResultado().setText(resultado);
            mostrarResultado();
        } catch (NumberFormatException ex) {
            ventana.getPresultado().getLblResultado().setText("Error: Entrada no válida");
            mostrarResultado();
        }
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