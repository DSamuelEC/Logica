package co.edu.unbosque.controller;

import co.edu.unbosque.model.FuzzyModel;
import co.edu.unbosque.view.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        FuzzyModel model = new FuzzyModel("data/archivo.fcl");
        VentanaPrincipal ventana = new VentanaPrincipal();
        new PrincipioController(ventana);
        new CuestionarioController(ventana);
        new FormularioFinalController(model, ventana);
        new ResultadoController(ventana);
    }
}