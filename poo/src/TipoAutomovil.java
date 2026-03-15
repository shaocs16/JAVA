public enum TipoAutomovil {
    SEDAN("Senda", "Auto normal", 4),
    SATION_WAGON("Station Wagon", "Auto grande", 5),
    HATCHBACK("Hatchback", "Auto compacto", 5),
    PICKUP("Pickup", "Camioneta", 4),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    COUPE("Coupe", "Auto pequeño", 2),
    FURGON("Furgon", "Auto utilitario", 4),
    SUV("SUV", "Todo terreno", 5);

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
