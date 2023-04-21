package preguntas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PreguntaSiNo implements Pregunta {
	private String pregunta;
	private List<String> respuestas = new ArrayList<>();
	private Scanner input = new Scanner(System.in);

	public PreguntaSiNo(String pregunta) {
		this.pregunta = pregunta;
	}

	@Override
	public void hacerPregunta() {
		System.out.println(pregunta);
		String respuesta = input.nextLine();
		while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
			System.out.println("Respuesta inválida. Por favor, responde con Si o No:");
			respuesta = input.nextLine();
		}
		respuestas.add(respuesta);
	}

	@Override
	public List<String> getRespuestas() {
		return respuestas;
	}

	public int getCantidadRespuestas(String valorRespuesta) {
		int cantidad = 0;
		for (String r : respuestas) {
			if (r.equalsIgnoreCase(valorRespuesta)) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public double getPromedioRespuestas() {
		int cantidadSi = getCantidadRespuestas("Si");
		int cantidadNo = getCantidadRespuestas("No");
		return (double) cantidadSi / (cantidadSi + cantidadNo);
	}
}
