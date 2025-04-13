public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadSprint;

    public Velocista(int id, String nombre, double potencia, double velocidad) {
        super(id, nombre);
        this.potenciaPromedio = potencia;
        this.velocidadSprint = velocidad;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia: " + potenciaPromedio + " W, Vel. Sprint: " + velocidadSprint + " km/h");
    }

    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }
}
