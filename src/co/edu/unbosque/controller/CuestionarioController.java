package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaPrincipal;

public class CuestionarioController {
    private VentanaPrincipal ventana;

    public CuestionarioController(VentanaPrincipal ventana) {
        this.ventana = ventana;

        ventana.getpCuestionario().getBtnSubmit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFormularioFinal();
            }
        });

        ventana.getpCuestionario().getBtnVolver().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPrincipio();
            }
        });
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