package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class FuzzyView extends JFrame {
    private JTextField horasSuenoField;
    private JTextField tiempoConciliarField;
    private JTextField sensacionDescansoField;
    private JTextField puntosPreguntasField;
    private JTextField edadField;
    private JLabel resultadoLabel;
    private JButton calcularButton;

    public FuzzyView() {
        setTitle("Calidad del Sueño");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Horas de Sueño:"));
        horasSuenoField = new JTextField();
        add(horasSuenoField);

        add(new JLabel("Tiempo para Conciliar el Sueño:"));
        tiempoConciliarField = new JTextField();
        add(tiempoConciliarField);

        add(new JLabel("Sensación de Descanso:"));
        sensacionDescansoField = new JTextField();
        add(sensacionDescansoField);

        add(new JLabel("Puntos de Preguntas:"));
        puntosPreguntasField = new JTextField();
        add(puntosPreguntasField);

        add(new JLabel("Edad:"));
        edadField = new JTextField();
        add(edadField);

        calcularButton = new JButton("Calcular");
        add(calcularButton);

        add(new JLabel("Calidad del Sueño:"));
        resultadoLabel = new JLabel();
        add(resultadoLabel);
    }

    public String getHorasSueno() {
        return horasSuenoField.getText();
    }

    public String getTiempoConciliar() {
        return tiempoConciliarField.getText();
    }

    public String getSensacionDescanso() {
        return sensacionDescansoField.getText();
    }

    public String getPuntosPreguntas() {
        return puntosPreguntasField.getText();
    }

    public String getEdad() {
        return edadField.getText();
    }

    public void setResultado(String resultado) {
        resultadoLabel.setText(resultado);
    }

    public JButton getCalcularButton() {
        return calcularButton;
    }
}