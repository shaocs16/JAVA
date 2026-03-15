public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(60);
        Automovil subaru = new Automovil("Subaru", "Impruza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.ROJO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        System.out.println(Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println(Automovil.VELOCIDAD_MAXIMA_CIUDAD);

        Automovil mazda = new Automovil("Mazda", "Ranger");
        mazda.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        mazda.setTipo(TipoAutomovil.COUPE);
        //mazda.setTanque(new Tanque());
        System.out.println("mazda.fabricante " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.BENCINA));
        nissan.setTanque(new Tanque(50));

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.AZUL, new Motor(2.0, TipoMotor.DIESEL));
        nissan2.setTanque(new Tanque());
        nissan.setTipo(TipoAutomovil.COUPE);
        nissan2.setTipo(TipoAutomovil.COUPE);
        Automovil.setColorPatente(Color.AMARILLO);

        Automovil auto2 = new Automovil();
        //auto2.setTipo(TipoAutomovil.COUPE);
        auto2.setTanque(new Tanque(50));

        System.out.println(subaru.detalle() + "\n");
        System.out.println(mazda.detalle() + "\n");
        System.out.println(nissan.detalle() + "\n");
        System.out.println(nissan2.detalle() + "\n");
        System.out.println("Automovil.getColorPatente() " + Automovil.getColorPatente());
        System.out.println("KM/L = " + Automovil.calcularConsumoEstatico(300,60));

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("tipo subaru: " + tipoSubaru.getDescripcion());

        System.out.println(mazda.calcularConsumo(300, 70));

    }
}
