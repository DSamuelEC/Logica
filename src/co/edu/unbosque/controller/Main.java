package co.edu.unbosque.controller;

import co.edu.unbosque.model.FuzzyModel;
import co.edu.unbosque.view.FuzzyView;

public class Main {
    public static void main(String[] args) {
        FuzzyModel model = new FuzzyModel("data/archivo.fcl");
        FuzzyView view = new FuzzyView();
        new FuzzyController(model, view);
        view.setVisible(true);
    }
}