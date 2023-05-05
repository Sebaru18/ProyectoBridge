package Informe1;
// Clase principal que lanza la encuesta

public class Launcher {
    public static void main(String[] args) {
        Informe inf = new Informe();
        inf.hacerPreguntaAleatoriaTipo(5, 3);
        inf.cantidadRespuestasTipo();
        inf.PromedioTipo();
    }
}