import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impruza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.ROJO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);


        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "Ranger");
        mazda.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        mazda.setTipo(TipoAutomovil.COUPE);
        mazda.setConductor(pato);


        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.BENCINA),
                new Tanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.COUPE);


        Persona lado = new Persona("Lado", "Mena");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.AZUL, new Motor(1.6, TipoMotor.DIESEL),
                new Tanque(50));
        suzuki.setConductor(lado);
        suzuki.setTipo(TipoAutomovil.SUV);

        Automovil.setColorPatente(Color.AMARILLO);

        Automovil audi = new Automovil("Audi", "A5");
        audi.setConductor(new Persona("Jano", "Perez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);
        }

    }
}
