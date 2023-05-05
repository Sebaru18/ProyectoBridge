import java.util.ArrayList;

public class Informe {
	private Encuesta encuesta = new Encuesta();

	public void PromedioTipo() {
		ArrayList<Respuesta> lista;
		System.out.println("**********************Informe************************");
		for (int i = 1; i < 4; i++) {

			lista = encuesta.getRespuestasTipo(i);
			if (i == 1) {
				System.out.println(lista.size() + " personas respondieron preguntas abiertas");
			} else if (i == 2) {
				float[] array = new float[5];
				;
				for (int j = 0; j < array.length; j++) {
					array[i] = 0;
				}
				for (Respuesta respuesta : lista) {
					for (int j = 1; j < 6; j++) {
						if (Integer.parseInt(respuesta.getRespuesta()) == j) {
							array[j - 1] += 1;
							break;
						}
					}
				}
				System.out.println("Promedios de respuestas del 1 a 5:");
				int k = 1;
				for (float j : array) {
					if(j!=0) {
						System.out.println(k + ": " + (j/lista.size())*100+"%");
					}else {
						System.out.println(k + ": no tiene respuestas");
					}
					k++;
				}
			} else if (i == 3) {
				float[] array = new float[4];
				;
				for (int j = 0; j < array.length; j++) {
					array[i] = 0;
				}
				for (Respuesta respuesta : lista) {
					if (respuesta.getRespuesta().compareToIgnoreCase("A") == 0
							|| respuesta.getRespuesta().compareToIgnoreCase("a") == 0) {
						array[0] += 1;
						
					} else if (respuesta.getRespuesta().compareToIgnoreCase("B") == 0
							|| respuesta.getRespuesta().compareToIgnoreCase("b") == 0) {
						array[1] += 1;
						
					}

					else if (respuesta.getRespuesta().compareToIgnoreCase("C") == 0
							|| respuesta.getRespuesta().compareToIgnoreCase("c") == 0) {
						array[2] += 1;
						
					}

					else if (respuesta.getRespuesta().compareToIgnoreCase("D") == 0
							|| respuesta.getRespuesta().compareToIgnoreCase("d") == 0) {
						array[3] += 1;
						
					}
				}
				System.out.println("Promedios de respuestas de a,b,c y d:");
				for (float j : array) {
					if(j!=0) {
						System.out.println("a: " + j/lista.size()*100+"%");
					}else {
						System.out.println("a: no tiene respuestas");
					}
				}
			}
		}
	}

	public int cantidadRespuestas() {
		return encuesta.getRespuestas().size();
	}

	public void cantidadRespuestasTipo() {
		ArrayList<Respuesta> lista;

		for (int i = 0; i < 3; i++) {

			lista = encuesta.getRespuestasTipo(i);
			if (i == 0) {
				System.out.println(lista.size() + " personas respondieron preguntas abiertas");
			} else if (i == 1) {
				System.out.println(lista.size() + " personas que respondieron preguntas del 1 al 5");
			} else if (i == 2) {
				System.out.println(lista.size() + " personas que respondieron preguntas de respuesta unica");
			}
		}
	}

	public void hacerPreguntaAleatoria(int cantidadPreguntas) {
		for (int i = 0; i < cantidadPreguntas; i++) {
			encuesta.Preguntar();
		}
	}

	public void hacerPreguntaAleatoriaTipo(int cant, int tipo) {
		for (int i = 0; i < cant; i++) {
			encuesta.Preguntar(tipo);
		}
	}

}
