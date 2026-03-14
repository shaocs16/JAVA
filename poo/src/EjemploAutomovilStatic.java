public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(60);
        Automovil subaru = new Automovil("Subaru", "Impruza");
        subaru.setCilindrada(11.5);
        subaru.setColor(Automovil.COLOR_BLANCO);

        System.out.println(Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println(Automovil.VELOCIDAD_MAXIMA_CIUDAD);

        Automovil mazda = new Automovil("Mazda", "Ranger");
        System.out.println("mazda.fabricante " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Automovil.COLOR_ROJO, 3.55, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Automovil.COLOR_GRIS, 3.55, 50);

        Automovil.setColorPatente("Rojo");

        Automovil auto2 = new Automovil();


        System.out.println(subaru.detalle() + "\n");
        System.out.println(mazda.detalle() + "\n");
        System.out.println(nissan.detalle() + "\n");
        System.out.println(nissan2.detalle() + "\n");
        System.out.println("Automovil.getColorPatente() " + Automovil.getColorPatente());
        System.out.println("KM/L = " + Automovil.calcularConsumoEstatico(300,60));

    }
}
