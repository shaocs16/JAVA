public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(60);
        Automovil subaru = new Automovil("Subaru", "Impruza");
        subaru.setCilindrada(11.5);
        subaru.setColor(Color.ROJO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "Ranger");
        mazda.setTipo(TipoAutomovil.COUPE);
        System.out.println("mazda.fabricante " + mazda.getFabricante());


        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo subaru: " + tipo.getNombre());
        System.out.println("tipo subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();

        switch (tipo) {
            case CONVERTIBLE ->
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE ->
                System.out.println("El automovil es pequeño de dos puertas y tipicamente deportivo");
            case FURGON ->
                System.out.println("Es un automovil utilitario de transporte, de empresas");
            case HATCHBACK ->
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP ->
                System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN ->
                System.out.println("Es un automovil mediano");
            case SATION_WAGON ->
                System.out.println("Es un automovil mas grande, con maleta grande....");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta: tipos) {
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " + ta.getDescripcion() +
                    ", " + ta.getNumeroPuertas());
            System.out.println();
        }
    }
}
