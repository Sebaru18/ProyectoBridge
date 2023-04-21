package preguntas;

public abstract class Encuesta {
	protected Pregunta pregunta;

	public Encuesta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	public void hacerEncuesta() {
		int cantidadPreguntas = 2;
		for (int i = 0; i < cantidadPreguntas; i++) {
			pregunta.hacerPregunta();
		}

		if (pregunta instanceof PreguntaNumerica) {
			PreguntaNumerica preguntaNumerica = (PreguntaNumerica) pregunta;
			for (int i = 1; i <= 5; i++) {
				int cantidadRespuestas = preguntaNumerica.getCantidadRespuestas(i);
				System.out.println("Respuestas de " + i + ": " + cantidadRespuestas);
			}
			System.out.println("Promedio de respuestas: " + preguntaNumerica.getPromedioRespuestas());
		}
		if (pregunta instanceof PreguntaSiNo) {
			PreguntaSiNo preguntaSiNo = (PreguntaSiNo) pregunta;
			int cantidadRespuestasSi = preguntaSiNo.getCantidadRespuestas("Si");
			int cantidadRespuestasNo = preguntaSiNo.getCantidadRespuestas("No");
			System.out.println("Cantidad de respuestas 'Si': " + cantidadRespuestasSi);
			System.out.println("Cantidad de respuestas 'No': " + cantidadRespuestasNo);
			System.out.println("Porcentaje de respuestas 'Si': " + preguntaSiNo.getPromedioRespuestas() * 100 + "%");
		}
	}
}