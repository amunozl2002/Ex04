package model;

import java.util.ArrayList;

public class Aula implements mostrable {

	// atributos
	private ArrayList<Alumno> alumnos = new ArrayList<>();
	private String nombre;

	// Necesito que el enum sea público para poder crear aulas desde Main
	public enum edificio {
		Norte,
		Sur,
		Centro
	}
	
	private edificio edificio;
	private int alumnosMaximos;

	// constructor
	public Aula(String nombre, model.Aula.edificio edificio, int alumnosMaximos) {
		super();
		setNombre(nombre);
		setEdificio(edificio);
		setAlumnosMaximos(alumnosMaximos); 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(edificio edificio) {
		this.edificio = edificio;
	}

	public int getAlumnosMaximos() {
		return alumnosMaximos;
	}

	public void setAlumnosMaximos(int alumnosMaximos) {
		this.alumnosMaximos = alumnosMaximos;
	}

	public String mostrar_informacion() {
		String respuesta = ("\n---------- DATOS DEL AULA ------------------------------------------------------------------------------" +
				"\n" +"\nNOMBRE: " + nombre + 
				"\nEDIFICIO: " + edificio + 
				"\nCANTIDAD MÁXIMA DE ALUMNOS: " + alumnosMaximos); 
		return respuesta;
	}

	public void añadirAlumno(Alumno alumno) {
		// Verifico si el aula está llena

		if (alumnos.size() >= alumnosMaximos) {{
			System.out.println("No se puede añadir alumno. El aula está llena.");
		}}
		// Verifico si el alumno ya está en la clase
		else if (alumnos.contains(alumno)) {
			System.out.println("No se puede añadir alumno. El alumno ya está en la clase.");
		}
		// Agrego al alumno y lo enseño por pantalla
		else {
			alumnos.add(alumno);
			System.out.println("Alumno " + alumno.getNombre() + " " + alumno.getApellido1() + " " + alumno.getApellido2() + " añadido al Aula " + getNombre());
		}
	}

	public void eliminarAlumno(Alumno alumno) {
		// Verifico que el alumno esté asignado al aula antes de borrarlo
		if (!alumnos.contains(alumno)) {
			System.out.println("No se puede borrar alumno. Este alumno no está asignado a la clase.");
		}
		// Elimino al alumno del aula y lo enseño por pantalla
		else {
			alumnos.remove(alumno);
			System.out.println("Alumno " + alumno.getNombre() + " " + alumno.getApellido1() + " " + alumno.getApellido2() + " eliminado del Aula " + getNombre());
		}
	}
	
	
}
