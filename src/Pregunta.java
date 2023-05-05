import java.util.ArrayList;
import java.util.Random;

public class Pregunta {
	private ArrayList<String> preguntas;
	private ArrayList<Integer> tiposPreguntas;
	private String pregunta;
	private int tipo;

	public Pregunta() {
		this.preguntas = new ArrayList<String>();
		this.tiposPreguntas = new ArrayList<Integer>();
	}

	public void definirPregunta() {
		Random r = new Random();
		int selector = r.nextInt(preguntas.size() - 1);
		pregunta = preguntas.get(selector);
		tipo = tiposPreguntas.get(selector);
	}

	public void definirPregunta(int tipoP) {
		ArrayList<String> preguntasT = new ArrayList<String>();
		ArrayList<Integer> tiposPreguntasT = new ArrayList<Integer>();
		for (int i = 0; i < preguntas.size(); i++) {
			if (tiposPreguntas.get(i) == tipoP) {
				preguntasT.add(preguntas.get(i));
				tiposPreguntasT.add(tipoP);
			}
		}
		
		Random r = new Random();
		int selector = r.nextInt(preguntasT.size() - 1);
		pregunta = preguntasT.get(selector);
		tipo = tiposPreguntasT.get(selector);
	}

	/**
	 * @return the pregunta
	 */
	public String getPregunta() {
		return pregunta;
	}

	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * @param preguntas the preguntas to set
	 */
	public void setPreguntas(ArrayList<String> preguntas) {
		this.preguntas = preguntas;
	}

	/**
	 * @param tiposPreguntas the tiposPreguntas to set
	 */
	public void setTiposPreguntas(ArrayList<Integer> tiposPreguntas) {
		this.tiposPreguntas = tiposPreguntas;
	}

}
