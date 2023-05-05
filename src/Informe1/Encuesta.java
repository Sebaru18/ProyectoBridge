package Informe1;
import java.util.ArrayList;

public class Encuesta {
	private ArrayList<Respuesta> Respuestas;
	private Respuesta rsta;
	public Encuesta() {
		this.Respuestas= new ArrayList<Respuesta>();
		//this.rsta = new Respuesta();
	}
	
	private void NuevaEncuesta() {
		rsta= new Respuesta();
	}
	
	public void Preguntar() {
		NuevaEncuesta();
		rsta.Preguntar();
		Respuestas.add(rsta);
		
	}
	
	public void Preguntar(int tipo) {
		NuevaEncuesta();
		rsta.Preguntar(tipo);
		Respuestas.add(rsta);
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
	
	
	public ArrayList<Respuesta> getRespuestasTipo(int Tipo){
		ArrayList<Respuesta> rstas = new ArrayList<Respuesta>();
		for (int i = 0; i < Respuestas.size(); i++) {
			if (Respuestas.get(i).getTipo() == Tipo) {
				rstas.add(Respuestas.get(i));
			}
		}
		return rstas;
	}
}

