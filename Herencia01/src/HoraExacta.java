public class HoraExacta extends Hora {

    int segundo;
    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        setSegundo(segundo);
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 60) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void inc() {
        if (getSegundo() == 59) {
            setSegundo(0);
            if (getMinuto() == 59) {
                setMinuto(0);
                if (getHora() == 24) {
                    setHora(0);
                } else {
                    setHora(hora + 1);
                }
            } else {
                setMinuto(minuto + 1);
            }
        } else {
            setSegundo(segundo + 1);;
        }

        if (getHora() == 24) {
            setHora(0);
        }
    }

    public String toString() {
        String respuesta;

        respuesta = "Son las " + getHora() + ":" + getMinuto() + ":" + getSegundo();

        return respuesta;
    }


}
