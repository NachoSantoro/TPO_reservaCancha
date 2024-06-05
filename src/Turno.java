public class Turno {

    int horario;
    Cancha cancha;
    boolean disponible;
    int idCliente;

    public Turno(int horario, Cancha cancha, boolean disponible, int idCliente) {
        this.horario = horario;
        this.cancha = cancha;
        this.disponible = disponible;
        this.idCliente = idCliente;
    }

}
