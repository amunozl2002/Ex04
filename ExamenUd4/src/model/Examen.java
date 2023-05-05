package model;
import java.util.Arrays;
import java.util.Locale;
import java.util.Calendar;

public class Examen {
	
	// atributos
	
	private Calendar fecha;
	private String url;
	public enum Ciclo {
		SMR1,
		SMR2,
		DAW1,
		DAW2,
	}	
	public Ciclo ciclo;
	Pregunta[] preguntas = new Pregunta[50];

	// constructor
	
	public Examen(Calendar fecha, String url, Ciclo ciclo, Pregunta[] preguntas) {
		setFecha(fecha);
		setUrl(url);
		setCiclo(ciclo);
		setPreguntas(preguntas);
	}
	
	private void setCiclo(Ciclo ciclo2) {
		this.ciclo = ciclo2;
		
	}

	public Examen(Calendar fecha, String url, Ciclo ciclo) {
		setFecha(fecha);
		setUrl(url);
		setCiclo(ciclo);

	}
	
	public Examen(Calendar fecha, String url) {
		setFecha(fecha);
		setUrl(url);
	}

	// getters, setters
	
	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Pregunta[] getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(Pregunta[] preguntas) {
		this.preguntas = preguntas;
	}
	
	// métodos
	
	public String mostrar_informacion() {
		
		
		String respuesta = 
	
				"---------- DATOS DEL EXAMEN ------------------------------------------------------------------------------" +
				"\n" +
				"\nFECHA DEL EXAMEN: " + String.format(Locale.US, "%1$tA, %1$tB %1$te, %1$tY", fecha) + 
				"\nURL: " + url + 
				"\nCICLO: " + ciclo + 
				"\nPREGUNTAS: " + Arrays.toString(preguntas);
	
		return respuesta;
			
	}

	public void añadirPregunta(String enunciado) {
		
		
		
	}
	

}
