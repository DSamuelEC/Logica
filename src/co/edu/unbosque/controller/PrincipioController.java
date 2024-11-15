package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaPrincipal;

public class PrincipioController {
    private VentanaPrincipal ventana;

    public PrincipioController(VentanaPrincipal ventana) {
        this.ventana = ventana;

        ventana.getpPrincipio().getBtnInicia().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCuestionario();
            }
        });
    }

    private void mostrarCuestionario() {
        ventana.getpPrincipio().setVisible(false);
        ventana.getpCuestionario().setVisible(true);
    }


    /*private FuzzyModel model;
    private VentanaPrincipal ventana;

    public PrincipioController(FuzzyModel model, VentanaPrincipal ventana) {
        this.model = model;
        this.ventana = ventana;

        ventana.getpPrincipio().getBtnInicia().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.getpPrincipio().setVisible(false);
                ventana.getpCuestionario().setVisible(true);
            }
        });

        ventana.getpCuestionario().getBtnSubmit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.getpCuestionario().setVisible(false);
                ventana.getpFormFinal().setVisible(true);
            }
        });

        ventana.getpFormFinal().getBtnFinalizar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double horasSueno = Double.parseDouble(ventana.getpCuestionario().getTxtDuracionSueno().getText());
                    double tiempoConciliar = Double.parseDouble(ventana.getpCuestionario().getTxtTiempoConciliarSueno().getText());
                    double sensacionDescanso = Double.parseDouble(ventana.getpCuestionario().getTxtSensacionDescanso().getText());
                    double edad = Double.parseDouble(ventana.getpCuestionario().getTxtEdad().getText());
                    String resultado = model.calcularCalidadSueno(horasSueno, tiempoConciliar, sensacionDescanso, 0, edad);
                    ventana.getPresultado().getLblResultado().setText(resultado);
                    ventana.getpFormFinal().setVisible(false);
                    ventana.getPresultado().setVisible(true);
                } catch (NumberFormatException ex) {
                    ventana.getPresultado().getLblResultado().setText("Error: Entrada no válida");
                    ventana.getpFormFinal().setVisible(false);
                    ventana.getPresultado().setVisible(true);
                }
            }
        });
    }*/
}