package controller;
import java.util.Calendar;

import model.*;

public class Main {

	public static void main(String[] args) {
	
	// Creo examen y fecha
	Calendar fechaExamen = Calendar.getInstance();
	Pregunta[] preguntasExamen = {
			new Pregunta("¿Cuál de los siguientes son IDEs?", null),
			new Pregunta("¿Que lenguaje de programación estás usando?", null),
			new Pregunta("¿Quién desarrolló Java?", null)			
	};
	Examen nuevoExamen = new Examen(fechaExamen, "https://url.com/", Examen.Ciclo.DAW1, preguntasExamen);
	// Creo Aula
	Aula nuevoAula = new Aula("A21", Aula.edificio.Norte, 35);
	// Creo Alumno
	Alumno nuevoAlumno = new Alumno("Paco", "Rodríguez", "Fuentes", 2001, true, "Esta es la descripción de la adaptación");
	// Creo Opciones
	Opcion[] nuevasOpciones = {
			  new Opcion("Eclipse", true),
			  new Opcion("VSCode", false),
			  new Opcion("IntelliJ", true),
			  new Opcion("NetBeans", true)
			};
	
	// Creo Pregunta
	Pregunta nuevaPregunta = new Pregunta("¿Cuál de los siguientes son IDEs?", nuevasOpciones);
	
	
	// Imprimo datos
	
	System.out.println(nuevoExamen.mostrar_informacion());
	System.out.println(nuevoAula.mostrar_informacion());
	System.out.println(nuevoAlumno.mostrar_informacion());
	System.out.println(nuevaPregunta.mostrar_informacion());
	}
}
