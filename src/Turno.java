public class Turno {

    int horario;
    boolean disponible;


    public Turno(int horario, boolean disponible) {
        this.horario = horario;
        this.disponible = disponible;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "horario=" + horario +
                ", disponible=" + disponible +
                '}';
    }
}
