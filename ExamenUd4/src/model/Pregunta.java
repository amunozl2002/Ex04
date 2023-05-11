package model;

public class Pregunta implements mostrable {
	
	// atributos
	
	private String enunciado;
	private Opcion[] opciones = new Opcion[4];

	// constructor

	public Pregunta(String enunciado, Opcion[] opciones) {
		setEnunciado(enunciado);
		setOpciones(opciones);
	}

	// getters, setters
	
	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public Opcion[] getOpciones() {
		return opciones;
	}

	public void setOpciones(Opcion[] opciones) {
		// TODO No admitir todas falsas ni todas verdaderas

		this.opciones = opciones;
	}
	
	public String mostrar_informacion() {
	    String respuesta = ("\n---------- DATOS DE LA PREGUNTA ------------------------------------------------------------------------------" +
	            "\n" +"\nENUNCIADO: " + enunciado +
	            "\nOPCIONES: ");
	    for (int i = 0; i < opciones.length; i++) {
	        respuesta += "\n" + "    " + opciones[i].getTextoRespuesta() + " (" + (opciones[i].getValor() ? "correcta" : "incorrecta") + ")";
	    }
	    return respuesta;
	}

}
