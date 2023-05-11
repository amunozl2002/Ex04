package start;
import java.util.ArrayList;
import java.util.Calendar;

import model.*;

public class Main {

	public static void main(String[] args) {

		// Creo examen y fecha
		Calendar fechaExamen = Calendar.getInstance();
		ArrayList<Pregunta> preguntasExamen = new ArrayList<>();
		Examen nuevoExamen = new Examen(fechaExamen, "https://url.com/", Ciclo.DAW1, preguntasExamen);
		// Creo 2 aulas
		Aula nuevoAula1 = new Aula("A21", Edificio.Norte, 35);
		Aula nuevoAula2 = new Aula("A35", Edificio.Centro, 27);
		// Creo 4 alumnos y añado 2 acada aula.
		Alumno nuevoAlumno1 = new Alumno("Paco", "Rodríguez", "Fuentes", 2001, true, "Esta es la descripción de la adaptación de Paco");
		Alumno nuevoAlumno2 = new Alumno("Alejandro", "Martinez", "Lopez", 2003, false, null);
		Alumno nuevoAlumno3 = new Alumno("Isabel", "Muñoz", "Gutierrez", 2002, true, "Esta es la descripción de la adaptación de Isabel");
		Alumno nuevoAlumno4 = new Alumno("Fernando", "Campos", "Moreno", 2000, false, null);
		// Creo Opciones
		Opcion[] opcionesPregunta1 = {
				new Opcion("Eclipse", true),
				new Opcion("VSCode", false),
				new Opcion("IntelliJ", true),
				new Opcion("NetBeans", true)
		};

		Opcion[] opcionesPregunta2 = {
				new Opcion("Python", true),
				new Opcion("Java", true),
				new Opcion("C++", true),
				new Opcion("Paint", false)
		};

		// Creo las dos preguntas y les asigno sus opciones
		Pregunta nuevaPregunta1 = new Pregunta("¿Cuáles de los siguientes son IDEs?", opcionesPregunta1);
		Pregunta nuevaPregunta2 = new Pregunta("¿Cuales de los siguientes son lenguajes de programación?", opcionesPregunta2);

		// Asigno las preguntas al Examen
		nuevoExamen.addPregunta(nuevaPregunta1);
		nuevoExamen.addPregunta(nuevaPregunta2);


		// Imprimo datos

		System.out.println(nuevoExamen.mostrar_informacion());
		System.out.println(nuevoAula1.mostrar_informacion());
		System.out.println(nuevoAula2.mostrar_informacion());
		System.out.println(nuevoAlumno1.mostrar_informacion());
		System.out.println(nuevoAlumno2.mostrar_informacion());
		System.out.println(nuevoAlumno3.mostrar_informacion());
		System.out.println(nuevoAlumno4.mostrar_informacion());
		System.out.println("\n---------- ASIGNANDO ALUMNOS ------------------------------------------------------------------------------ \n" );
		nuevoAula1.addAlumno(nuevoAlumno1);
		nuevoAula1.addAlumno(nuevoAlumno2);
		nuevoAula2.addAlumno(nuevoAlumno3);
		nuevoAula2.addAlumno(nuevoAlumno4);
		System.out.println(nuevaPregunta1.mostrar_informacion());
		System.out.println(nuevaPregunta2.mostrar_informacion());

		// String msg = nuevoAula1.delAlumno(nuevoAlumno1) ? "Borrado" : msgErr[3];
		// System.out.println(msg);


		}

	}

