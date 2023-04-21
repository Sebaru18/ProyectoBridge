package preguntas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PreguntaNumerica implements Pregunta {
	private String pregunta;
	private List<Integer> respuestas = new ArrayList<>();
	private Scanner input = new Scanner(System.in);

	public PreguntaNumerica(String pregunta) {
		this.pregunta = pregunta;
	}

	@Override
	public void hacerPregunta() {
		System.out.println(pregunta);
		int respuesta = input.nextInt();
		while (respuesta < 1 || respuesta > 5) {
			System.out.println("Respuesta inválida. Por favor, introduce un número del 1 al 5:");
			respuesta = input.nextInt();
		}
		respuestas.add(respuesta);
	}

	@Override
	public List<String> getRespuestas() {
		List<String> respuestasString = new ArrayList<>();
		for (int r : respuestas) {
			respuestasString.add(Integer.toString(r));
		}
		return respuestasString;
	}

	public int getCantidadRespuestas(int valorRespuesta) {
		int cantidad = 0;
		for (int r : respuestas) {
			if (r == valorRespuesta) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public double getPromedioRespuestas() {
		double promedio = 0;
		for (int r : respuestas) {
			promedio += r;
		}
		return promedio / respuestas.size();
	}
}