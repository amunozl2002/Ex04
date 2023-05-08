public class Main {
    public static void main(String[] args) {

       // Formato 24h
        Hora hora = new Hora(15, 59);
        System.out.println(hora.toString());
        hora.inc();
        System.out.println(hora.toString());

        System.out.println("---------------------------------------------------");

        // Formato 12h
        Hora12 hora12 = new Hora12(15, 59);
        System.out.println(hora12.tostring());
        hora12.inc();
        System.out.println(hora12.tostring());

        System.out.println("---------------------------------------------------");

        // Hora exacta
        HoraExacta he = new HoraExacta(15, 54, 22);
        System.out.println(he.toString());
        he.inc();
        System.out.println(he.toString());
    }
}