public class Hora {
    int hora;
    int minuto;

    public Hora(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida");
        }

    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido");
        }
    }

    public void inc() {
        int aux;

        if (minuto == 59) {
            setMinuto(0);
            if (hora != 24) {
                aux = hora + 1;
                setHora(aux);
            } else {
                setHora(0);
            }
        } else {
            aux = minuto + 1;
            setMinuto(aux);
        }
    }

    public String toString() {
        String respuesta;

        if (getMinuto() != 0) {
            respuesta = "Son las " + getHora() + ":" + getMinuto();
        } else {
            respuesta = "Son las " + getHora() + ":" + getMinuto() + "0 ";
        }

        return respuesta;
    }
}
