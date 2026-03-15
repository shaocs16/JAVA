public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {



        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impruza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.ROJO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
//        subaru.setRuedas(ruedasSubaru);
        Rueda[] ruedasSubaru = new Rueda[10];
        for (int i = 0; i < ruedasSubaru.length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "Ranger");
        mazda.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        mazda.setTipo(TipoAutomovil.COUPE);
        mazda.setConductor(pato);
//        mazda.setRuedas(ruedasMazda);
        Rueda[] ruedasMazda = new Rueda[5];
        for (int i = 0; i < ruedasMazda.length; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.BENCINA),
                new Tanque(50));
        nissan.setConductor(bea);
        nissan.addRueda( new Rueda("Pirellin", 20, 11.5)).addRueda( new Rueda("Pirellin", 20, 11.5))
                .addRueda( new Rueda("Pirellin", 20, 11.5))
                .addRueda( new Rueda("Pirellin", 20, 11.5))
                .addRueda( new Rueda("Pirellin", 20, 11.5));
        nissan.setTipo(TipoAutomovil.COUPE);

        Rueda[] ruedasNissan2 = {
                new Rueda("Pirellin", 20, 11.5),
                new Rueda("Pirellin", 20, 11.5),
                new Rueda("Pirellin", 20, 11.5),
                new Rueda("Pirellin", 20, 11.5),
                new Rueda("Pirellin", 20, 11.5),
        };

        Persona lado = new Persona("Lado", "Mena");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.AZUL, new Motor(2.0, TipoMotor.DIESEL), new Tanque(50), lado, ruedasNissan2);
        nissan2.setTipo(TipoAutomovil.COUPE);

        Automovil.setColorPatente(Color.AMARILLO);

        Automovil auto2 = new Automovil();
        //auto2.setTipo(TipoAutomovil.COUPE);
        auto2.setTanque(new Tanque(50));

        System.out.println(subaru.detalle());

        /* System.out.println("Conductor subaru " + subaru.getConductor());

        for(Rueda r: subaru.getRuedas()) {
            System.out.println(r.getFabricante());
        } */


    }
}
