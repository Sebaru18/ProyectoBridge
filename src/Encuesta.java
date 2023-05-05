import java.util.ArrayList;

public abstract class Encuesta {
	private ArrayList<Respuesta> Respuestas;
	private Respuesta rsta;
	public Encuesta() {
		this.Respuestas= new ArrayList<Respuesta>();
		//this.rsta = new Respuesta();
	}
	
	public void NuevaEncuesta() {
		rsta= new Respuesta();
	}
	
	public void Preguntar() {
		rsta.Preguntar();
	}
	
	public void Preguntar(int tipo) {
		rsta.Preguntar(tipo);
	}
	
	public String getPregunta() {
		return rsta.getPregunta();
	}
	
	public Respuesta getRespuesta(){
		return rsta;
	}

	/**
	 * @return the respuestas
	 */
	public ArrayList<Respuesta> getRespuestas() {
		return Respuestas;
	}
	
	public void vaciarEncuesta() {
		Respuestas= new ArrayList<Respuesta>();
	}
}
