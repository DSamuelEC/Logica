package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Archivo;
import net.sourceforge.jFuzzyLogic.FIS;

public class FuzzyModel {
    private FIS fis;
    private double resultado;
    private Archivo arch;
    private String texto;

    public FuzzyModel(String fileName) {
        fis = FIS.load(fileName, true);
        arch = new Archivo();
        System.out.println(texto);
        if (fis == null) {
            System.err.println("No se pudo cargar el archivo: " + fileName);
            return;
        }
    }

    public String leerTxt() {
        texto = arch.leerArchivo();
        return texto;
    }

    public String actualizarTxt(String frase) {
        return arch.escribirArchivo(frase);
    }

    public String calcularCalidadSueno(double horasSueno, double tiempoConciliar, double sensacionDescanso,
                                       double puntosPreguntas, double edad) {
        fis.setVariable("horas_sueno", horasSueno);
        fis.setVariable("tiempo_conciliar", tiempoConciliar);
        fis.setVariable("sensacion_descanso", sensacionDescanso);
        fis.setVariable("puntos_preguntas", puntosPreguntas);
        fis.setVariable("edad", edad);
        fis.evaluate();
        resultado = fis.getVariable("calidad_sueno").getValue();

        if (resultado <= 15) {
            System.out.println(resultado);
            return "Muy mala";
        } else if (resultado <= 23 && resultado >= 16) {
            System.out.println(resultado);
            return "Mala";
        } else if (resultado >= 24 && resultado <= 32) {
            System.out.println(resultado);
            return "Adecuada";
        } else {
            System.out.println(resultado);
            return "Valor fuera del rango";
        }
    }

    public FIS getFis() {
        return fis;
    }

    public void setFis(FIS fis) {
        this.fis = fis;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Archivo getArch() {
        return arch;
    }

    public void setArch(Archivo arch) {
        this.arch = arch;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "FuzzyModel [fis=" + fis + ", resultado=" + resultado + "]";
    }
}