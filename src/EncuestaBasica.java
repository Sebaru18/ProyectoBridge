public class EncuestaBasica extends Encuesta{
    public EncuestaBasica(Pregunta pregunta) {
        super(pregunta);
    }

    @Override
    public void hacerEncuesta() {
        // Hacer dos veces la pregunta
        for (int i = 0; i < 2; i++) {
            pregunta.hacerPregunta();
        }

        // Obtener la cantidad de respuestas para cada valor en la pregunta numérica
        if (pregunta instanceof PreguntaNumerica) {
            PreguntaNumerica preguntaNumerica = (PreguntaNumerica) pregunta;
            for (int i = 1; i <= 5; i++) {
                int cantidadRespuestas = preguntaNumerica.getCantidadRespuestas(i);
                System.out.println("Respuestas con valor " + i + ": " + cantidadRespuestas);
            }
            double promedio = preguntaNumerica.getPromedioRespuestas();
            System.out.println("Promedio de las respuestas numéricas: " + promedio);
        }

        // Obtener el porcentaje de respuestas "Sí" en la pregunta de Sí/No
        if (pregunta instanceof PreguntaSiNo) {
            PreguntaSiNo preguntaSiNo = (PreguntaSiNo) pregunta;
            double porcentajeSi = preguntaSiNo.getPromedioRespuestas() * 100;
            System.out.println("Porcentaje de respuestas \"Sí\": " + porcentajeSi + "%");
        }
    }
}
