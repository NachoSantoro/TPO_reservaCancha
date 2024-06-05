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

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
