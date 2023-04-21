// Clase principal que lanza la encuesta
public class Launcher {
public static void main(String[] args) {
// Crear la pregunta
Pregunta preguntaNumerica = new PreguntaNumerica("¿Qué tan bueno te resultó esta app? (1-5)");
//Pregunta preguntaSiNo = new PreguntaSiNo("¿Recomendarías esta herramienta a un amigo? (Sí/No)");
    // Crear la encuesta y hacerla
    Encuesta encuesta = new EncuestaBasica(preguntaNumerica);
    encuesta.hacerEncuesta();
}
}