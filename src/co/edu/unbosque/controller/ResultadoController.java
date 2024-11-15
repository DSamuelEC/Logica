package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaPrincipal;

public class ResultadoController {
    private VentanaPrincipal ventana;

    public ResultadoController(VentanaPrincipal ventana) {
        this.ventana = ventana;

        ventana.getPresultado().getBtnVolver().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFormularioFinal();
            }
        });
    }

    private void mostrarFormularioFinal() {
        ventana.getPresultado().setVisible(false);
        ventana.getpFormFinal().setVisible(true);
    }
}