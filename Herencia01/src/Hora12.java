public class Hora12 extends Hora {
    String ampm;
    int horaAux;

    public Hora12(int hora, int minuto) {
        super(hora, minuto);
    }

    public String tostring() {
        String respuesta;

        if (hora > 12) {
            ampm = "pm";
            horaAux = hora - 12;

        } else {
            ampm = "am";
        }

        if (getMinuto() != 0) {
            respuesta = "Son las " + horaAux + ":" + getMinuto() + " " + ampm;
        } else {
            respuesta = "Son las " + horaAux + ":" + getMinuto() + "0 " + ampm;
        }

        return respuesta;
    };
}
