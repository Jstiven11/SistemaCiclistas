public class Escalador extends Ciclista {
    private float aceleracionSubida;
    private float gradoRampa;

    public Escalador(int id, String nombre, float aceleracion, float grado) {
        super(id, nombre);
        this.aceleracionSubida = aceleracion;
        this.gradoRampa = grado;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Aceleración: " + aceleracionSubida + " m/s², Grado Rampa: " + gradoRampa + "°");
    }

    @Override
    public String imprimirTipo() {
        return "Es un Escalador";
    }
}