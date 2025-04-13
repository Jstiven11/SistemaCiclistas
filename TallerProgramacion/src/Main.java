public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Team Colombia", "Colombia");

        Velocista v1 = new Velocista(1, "Juan Pérez", 420, 65);
        Escalador e1 = new Escalador(2, "Luis Gómez", 3.2f, 15.5f);
        Contrarrelojista c1 = new Contrarrelojista(3, "Carlos Ruiz", 72.5);

        v1.setTiempoAcumulado(120);
        e1.setTiempoAcumulado(130);
        c1.setTiempoAcumulado(115);

        equipo.agregarCiclista(v1);
        equipo.agregarCiclista(e1);
        equipo.agregarCiclista(c1);

        equipo.calcularTiempoTotal();
        equipo.imprimirDatosEquipo();
        equipo.listarCiclistas();

        System.out.println("\nBuscar ciclista con ID 2:");
        equipo.buscarCiclistaPorId(2);
    }
}