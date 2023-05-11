package model;

public class Opcion implements mostrable {

    // atributos

    String textoRespuesta;
    boolean valor;

    // constructor

    public Opcion(String textoRespuesta, boolean valor) {
        setTextoRespuesta(textoRespuesta);
        setValor(valor);
    }

    // getters, setters

    public String getTextoRespuesta() {
        return textoRespuesta;
    }


    public void setTextoRespuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }


    public boolean getValor() {
        return valor;
    }


    public void setValor(boolean valor) {
        this.valor = valor;
    }

    public String mostrar_informacion() {
        String respuesta = ("\n---------- DATOS DEL AULA ------------------------------------------------------------------------------" +
                "\n" + "\nTEXTO: " + textoRespuesta +
                "\nVALOR: " + valor);
        return respuesta;
    }


}
