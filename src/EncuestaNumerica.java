package preguntas;

public class EncuestaNumerica extends Encuesta {

	public EncuestaNumerica(Pregunta pregunta) {
		super(pregunta);
	}

	@Override
	public void hacerEncuesta() {
		int cantidadPreguntas = 2;
		for (int i = 0; i < cantidadPreguntas; i++) {
			pregunta.hacerPregunta();
		}

	
		if (pregunta instanceof PreguntaNumerica) {
			PreguntaNumerica preguntaNumerica = (PreguntaNumerica) pregunta;
			for (int i = 1; i <= 5; i++) {
				int cantidadRespuestas = preguntaNumerica.getCantidadRespuestas(i);
				System.out.println("Cantidad de respuestas con valor " + i + ": " + cantidadRespuestas);
			}
			System.out.println("Promedio de respuestas: " + preguntaNumerica.getPromedioRespuestas());
		}
	}
}
