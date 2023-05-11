package model;

import java.util.ArrayList;

public class Aula implements mostrable {

	// atributos
	private ArrayList<Alumno> alumnos = new ArrayList<>();
	private String nombre;

	private Edificio edificio;
	private int alumnosMaximos;

	// constructor
	public Aula(String nombre, Edificio edificio, int alumnosMaximos) {
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

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
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

	public int addAlumno(Alumno alumno) {
		// Verifico si el aula está llena
		int errCode = 0;
		if (alumnos.size() >= alumnosMaximos) {{
			//System.err.println("No se puede añadir alumno. El aula está llena.");
			errCode = 1;
		}}
		// Verifico si el alumno ya está en la clase
		else if (alumnos.contains(alumno)) {
			//System.err.println("No se puede añadir alumno. El alumno ya está en la clase.");
			errCode = 2;
		}
		// Agrego al alumno y lo enseño por pantalla
		else {
			alumnos.add(alumno);
			System.out.println("Alumno " + alumno.getNombre() + " " + alumno.getApellido1() + " " + alumno.getApellido2() + " añadido al Aula " + getNombre());
		}
		return errCode;
	}

	public boolean delAlumno(Alumno alumno) {
		boolean isOK = false;
		// Verifico que el alumno esté asignado al aula antes de borrarlo
		if (!alumnos.contains(alumno)) {
			System.err.println("No se puede borrar alumno. Este alumno no está asignado a la clase.");
		}
		// Elimino al alumno del aula y lo enseño por pantalla
		else {
			isOK = alumnos.remove(alumno);
			//isOK = true;
			System.err.println("Alumno " + alumno.getNombre() + " " + alumno.getApellido1() + " " + alumno.getApellido2() + " eliminado del Aula " + getNombre());
		}
		return isOK;


		//return alumnos.remove(alumno);
	}
	
	
}
