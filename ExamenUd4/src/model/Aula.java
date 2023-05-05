package model;

public class Aula {

	// atributos
	private String nombre;
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
	
	
}
