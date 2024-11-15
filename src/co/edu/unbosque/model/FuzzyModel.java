package co.edu.unbosque.model;

import net.sourceforge.jFuzzyLogic.FIS;

public class FuzzyModel {
	private FIS fis;
	private double resultado;

	public FuzzyModel(String fileName) {
		fis = FIS.load(fileName, true);
		if (fis == null) {
			System.err.println("No se pudo cargar el archivo: " + fileName);
			return;
		}
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

	@Override
	public String toString() {
		return "FuzzyModel [fis=" + fis + ", resultado=" + resultado + "]";
	}
}