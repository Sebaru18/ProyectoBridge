package Informe1;
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
		agregarPreguntas();
	}

	public void Preguntar() {
		if(getTipo() ==2) {
			System.out.println("Responde del 1 a 5, siendo 1 el peor y 5 el mejor:");
		}
		System.out.println(getPregunta());
	}
	
	public void definirPregunta() {
		Random r = new Random();
		int selector = r.nextInt(preguntas.size() - 1);
		this.pregunta = preguntas.get(selector);
		this.tipo = tiposPreguntas.get(selector);
		Preguntar();
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
		Preguntar();
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
	
	public void agregarPreguntas(){
		preguntas.add("¿Qué deporte prefieres practicar?");
		tiposPreguntas.add(1);
		preguntas.add("¿Cuál es tu deporte favorito para ver en la televisión?");
		tiposPreguntas.add(1);
		preguntas.add("¿Cómo crees que el deporte puede influir en la sociedad?");
		tiposPreguntas.add(1);
		preguntas.add("¿Qué deportes te gustaría probar en el futuro y por qué?");
		tiposPreguntas.add(1);
		preguntas.add("¿Cuál ha sido el momento más memorable que has experimentado en algún evento deportivo?");
		tiposPreguntas.add(1);
		preguntas.add("¿Cómo ha evolucionado tu interés por el deporte a lo largo de los años?");
		tiposPreguntas.add(1);
		preguntas.add("¿Qué habilidades son importantes para tener éxito en tu deporte favorito?");
		tiposPreguntas.add(1);
		preguntas.add("¿Cuál es la mejor forma de prepararse para competir en un deporte?");
		tiposPreguntas.add(1);
		preguntas.add("¿Qué retos enfrentan los deportistas profesionales y cómo pueden superarlos?");
		tiposPreguntas.add(1);
		preguntas.add("¿Qué importancia tiene el deporte en la educación?");
		tiposPreguntas.add(1);
		preguntas.add("¿Cuál ha sido el mayor desafío que has enfrentado en el deporte y cómo lo superaste?");
		tiposPreguntas.add(1);
		preguntas.add("¿Cómo puede el deporte ser utilizado como una herramienta para mejorar la salud mental?");
		tiposPreguntas.add(1);
		preguntas.add("¿Qué papel desempeñan los entrenadores en el éxito de un equipo o de un deportista?");
		tiposPreguntas.add(1);
		preguntas.add("¿Cuáles son los valores que el deporte puede enseñar a los jóvenes?");
		tiposPreguntas.add(1);
		preguntas.add("¿Cómo se pueden promover la igualdad de género y la inclusión en el deporte?");
		tiposPreguntas.add(1);
		
		
		preguntas.add("¿Qué tan importante crees que es la alimentación en el rendimiento deportivo?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan emocionante te resulta ver deportes en la televisión?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan justo crees que es el sistema de puntuación en algunos deportes?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan difícil es mantener una carrera a largo plazo en el mundo del deporte?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan importante es la mentalidad en el éxito deportivo?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan valiosa es la experiencia de los deportistas veteranos en los equipos deportivos?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan efectivos son los deportes como una herramienta para mejorar la salud física?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan importante es el trabajo en equipo en el deporte?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan influyentes son los entrenadores en el éxito de un equipo deportivo?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan emocionante es participar en un evento deportivo importante?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan significativo es el apoyo de los fanáticos en el éxito de un equipo deportivo?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan justas son las reglas y regulaciones en los deportes profesionales?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan importante es la tecnología en la mejora del rendimiento deportivo?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan difícil es equilibrar el deporte y la vida personal?");
		tiposPreguntas.add(2);
		preguntas.add("¿Qué tan importantes son las habilidades físicas en comparación con las habilidades mentales en el deporte?");
		tiposPreguntas.add(2);
		
		
		preguntas.add("¿En qué deporte se usa una red y una pelota para golpearla sobre ella?\r\n"
				+ "a) Tenis\r\n"
				+ "b) Vóleibol\r\n"
				+ "c) Fútbol\r\n"
				+ "d) Baloncesto");
		tiposPreguntas.add(3);
		preguntas.add("¿Cuál de los siguientes deportes es más asociado con el término \"gol\"?\r\n"
				+ "a) Tenis\r\n"
				+ "b) Baloncesto\r\n"
				+ "c) Fútbol\r\n"
				+ "d) Béisbol");
		tiposPreguntas.add(3);
		preguntas.add("¿Cuál es el objetivo principal del baloncesto?\r\n"
				+ "a) Meter goles en una portería\r\n"
				+ "b) Anotar touchdowns\r\n"
				+ "c) Anotar canastas en una canasta elevada\r\n"
				+ "d) Tirar la bola más lejos posible");
		tiposPreguntas.add(3);
		preguntas.add("¿En qué deporte los jugadores usan un bate para golpear una pelota?\r\n"
				+ "a) Fútbol\r\n"
				+ "b) Hockey\r\n"
				+ "c) Béisbol\r\n"
				+ "d) Vóleibol");
		tiposPreguntas.add(3);
		preguntas.add("¿Cuál es el nombre del evento deportivo mundial que se celebra cada cuatro años?\r\n"
				+ "a) Juegos de invierno\r\n"
				+ "b) Juegos Olímpicos\r\n"
				+ "c) Copa del Mundo\r\n"
				+ "d) Campeonato Mundial");
		tiposPreguntas.add(3);
		preguntas.add("¿En qué deporte los jugadores intentan colocar una bola en un hoyo con el menor número de golpes posible?\r\n"
				+ "a) Tenis\r\n"
				+ "b) Golf\r\n"
				+ "c) Esquí\r\n"
				+ "d) Boxeo");
		tiposPreguntas.add(3);
		preguntas.add("¿Cuál es el deporte que se practica en un ring y los boxeadores usan guantes para golpearse?\r\n"
				+ "a) Boxeo\r\n"
				+ "b) Karate\r\n"
				+ "c) Lucha libre\r\n"
				+ "d) Esgrima\r\n");
		tiposPreguntas.add(3);
		preguntas.add("¿Cuál de los siguientes deportes es más asociado con la palabra \"touchdown\"?\r\n"
				+ "a) Béisbol\r\n"
				+ "b) Fútbol\r\n"
				+ "c) Natación\r\n"
				+ "d) Atletismo");
		tiposPreguntas.add(3);
		preguntas.add("¿En qué deporte los jugadores compiten para correr la mayor distancia en el menor tiempo posible?\r\n"
				+ "a) Natación\r\n"
				+ "b) Ciclismo\r\n"
				+ "c) Atletismo\r\n"
				+ "d) Levantamiento de pesas");
		tiposPreguntas.add(3);
		preguntas.add("¿Cuál es el nombre del juego donde un equipo intenta atrapar al otro y hacerlos caer al suelo?\r\n"
				+ "a) Fútbol americano\r\n"
				+ "b) Baloncesto\r\n"
				+ "c) Hockey sobre hielo\r\n"
				+ "d) Lucha libre");
		tiposPreguntas.add(3);
		preguntas.add("¿Cuál es el nombre del juego donde los jugadores corren en un campo de hierba y tratan de anotar goles en una portería?\r\n"
				+ "a) Fútbol\r\n"
				+ "b) Baloncesto\r\n"
				+ "c) Golf\r\n"
				+ "d) Esquí");
		tiposPreguntas.add(3);
		preguntas.add("¿En qué deporte los jugadores compiten para saltar por encima de una barra?\r\n"
				+ "a) Gimnasia\r\n"
				+ "b) Atletismo\r\n"
				+ "c) Natación\r\n"
				+ "d) Esquí");
		tiposPreguntas.add(3);
		preguntas.add("¿Cuál es el deporte que se juega con un palo y una pelota pequeña y dura?\r\n"
				+ "a) Béisbol\r\n"
				+ "b) Golf\r\n"
				+ "c) Polo\r\n"
				+ "d) Rugby");
		tiposPreguntas.add(3);
		preguntas.add("¿Cuál de los siguientes deportes se juega con un disco y dos equipos que compiten por meterlo en una portería?\r\n"
				+ "a) Hockey sobre hielo\r\n"
				+ "b) Vóleibol\r\n"
				+ "c) Tenis\r\n"
				+ "d) Esquí");
		tiposPreguntas.add(3);
		preguntas.add("¿En qué deporte los jugadores compiten en un campo de hierba y tratan de hacer llegar la bola a una meta usando un stick o mazo?\r\n"
				+ "a) Lacrosse\r\n"
				+ "b) Rugby\r\n"
				+ "c) Hockey sobre césped\r\n"
				+ "d) Cricket");
		tiposPreguntas.add(3);
	}

}
