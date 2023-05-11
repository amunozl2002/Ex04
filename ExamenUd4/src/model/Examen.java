package model;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Calendar;

public class Examen implements mostrable {

    // atributos

    private Calendar fecha;
    private String url;
    public Ciclo ciclo;
    ArrayList<Pregunta> preguntas;

    // constructor

    public Examen(Calendar fecha, String url, Ciclo ciclo, ArrayList<Pregunta> preguntas) {
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

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        if (preguntas.size() <= 50)
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
                        "\nPREGUNTAS: ";
        for (Pregunta pregunta : preguntas) {
            respuesta += "\n    " + (pregunta.getEnunciado());
        }
        ;

        return respuesta;

    }

    public void addPregunta(Pregunta pregunta) {
        this.preguntas.add(pregunta);
    }


}
