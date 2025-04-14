import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotal = 0;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombreEquipo() { return nombreEquipo; }
    public void setNombreEquipo(String nombreEquipo) { this.nombreEquipo = nombreEquipo; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public void agregarCiclista(Ciclista c) {
        ciclistas.add(c);
    }

    public void listarCiclistas() {
        for (Ciclista c : ciclistas) {
            System.out.println(c.getNombre() + " - " + c.imprimirTipo());
        }
    }

    public void buscarCiclistaPorId(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                c.imprimirDatos();
                System.out.println(c.imprimirTipo());
                return;
            }
        }
        System.out.println("Ciclista no encontrado.");
    }

    public void calcularTiempoTotal() {
        tiempoTotal = 0;
        for (Ciclista c : ciclistas) {
            tiempoTotal += c.getTiempoAcumulado();
        }
    }

    public void imprimirDatosEquipo() {
        System.out.println("Equipo: " + nombreEquipo + " | País: " + pais + " | Tiempo Total: " + tiempoTotal + " min");
    }
}
