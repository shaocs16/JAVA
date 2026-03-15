public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private int capacidadTanque = 40;

    // Hace que todos los nuevos objetos se creen tenga este atributo
    private static Color colorPatente = Color.NARANJA;
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    // Valor que nunca va a cambiar en tu programa
    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAXIMA_CIUDAD = 60;

//    public static final String COLOR_ROJO = "Rojo";
//    public static final String COLOR_AMARILLO = "Amarillo";
//    public static final String COLOR_AZUL = "Azul";
//    public static final String COLOR_BLANCO = "Blanco";
//    public static final String COLOR_GRIS = "Gris Oscuro";

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadTanque) {
        this(fabricante,modelo,color,cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String detalle() {
        return "auto.id " + this.id +
                "\ncilindrada " + this.cilindrada +
                "\nfabricante " + this.fabricante +
                "\nmodelo " + this.modelo +
                "\"auto.patenteColor " + Automovil.colorPatente +
                "\ncolor " + this.color;
    }

    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + " \n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (this.capacidadTanque * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (this.capacidadTanque * (porcentajeBencina / 100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
        return km / (Automovil.capacidadEstanqueEstatico * (porcentajeBencina / 100f));
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }

        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                &&   this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + fabricante + " " +  modelo;
    }
}
