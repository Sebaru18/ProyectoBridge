public class Respuesta {
    private Pregunta pregunta= new Pregunta() {
	};
	
	private String respuesta;
	public int getTipo() {
		return pregunta.getTipo();
	}
	public String getPregunta() {
		return pregunta.getPregunta();
	}
	public void Preguntar() {
		pregunta.definirPregunta();
	}
	public void Preguntar(int tipo) {
		pregunta.definirPregunta(tipo);
	}
	
	/**
	 * @return the respuesta
	 */
	public String getRespuesta() {
		return respuesta;
	}
	/*
	 * toca determinar el tipo de la respuesta 
	 */
    //public abstract void agregarRespuesta();

    
}
