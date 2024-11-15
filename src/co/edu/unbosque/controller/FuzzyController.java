package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.FuzzyModel;
import co.edu.unbosque.view.FuzzyView;

public class FuzzyController {
    private FuzzyModel model;
    private FuzzyView view;

    public FuzzyController(FuzzyModel model, FuzzyView view) {
        this.model = model;
        this.view = view;

        this.view.getCalcularButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double horasSueno = Double.parseDouble(view.getHorasSueno());
                    double tiempoConciliar = Double.parseDouble(view.getTiempoConciliar());
                    double sensacionDescanso = Double.parseDouble(view.getSensacionDescanso());
                    double puntosPreguntas = Double.parseDouble(view.getPuntosPreguntas());
                    double edad = Double.parseDouble(view.getEdad());
                    String resultado = model.calcularCalidadSueno(horasSueno, tiempoConciliar, sensacionDescanso, puntosPreguntas, edad);
                    view.setResultado(resultado);
                } catch (NumberFormatException ex) {
                    view.setResultado("Error: Entrada no válida");
                }
            }
        });
    }
}