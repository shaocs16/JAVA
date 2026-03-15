import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru", "Impruza");

        subaru.setMotor(motorSubaru);
        subaru.setTanque(new Tanque());
        subaru.setTipo(TipoAutomovil.COUPE);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.AZUL, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTanque(new Tanque(60));

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.BENCINA));
        nissan.setTanque(new Tanque(50));

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.AZUL, new Motor(2.0, TipoMotor.DIESEL));
        nissan2.setTanque(new Tanque());

        Automovil auto2 = new Automovil();
        auto2.setTanque(new Tanque());
        Date fecha = new Date();
        System.out.println("son iguales " + (nissan == nissan2));
        System.out.println("son iguales con equals " + (nissan.equals(nissan2)));

        System.out.println("son iguales con equals " + (auto2.equals(fecha)));
        System.out.println(nissan.toString());

        System.out.println(subaru.detalle() + "\n");
        System.out.println(subaru.acelerar(10)  + "\n");
        System.out.println(subaru.acelerarFrenar(1000) + "\n");

        System.out.println("Km/L " + subaru.calcularConsumo(300, 0.75f) + "\n");
        System.out.println("Km/L " + subaru.calcularConsumo(300, 15) + "\n");

    }
}
