import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Subaru", "Impruza");

        auto.setCilindrada(11.5);

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.55, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.55, 50);

        Automovil auto2 = new Automovil();
        Date fecha = new Date();
        System.out.println("son iguales " + (nissan == nissan2));
        System.out.println("son iguales con equals " + (nissan.equals(nissan2)));

        System.out.println("son iguales con equals " + (auto2.equals(fecha)));
        System.out.println(nissan.toString());

        System.out.println(auto.detalle() + "\n");
        System.out.println(auto.acelerar(10)  + "\n");
        System.out.println(auto.acelerarFrenar(1000) + "\n");

        System.out.println("Km/L " + auto.calcularConsumo(300, 0.75f) + "\n");
        System.out.println("Km/L " + auto.calcularConsumo(300, 15) + "\n");

    }
}
