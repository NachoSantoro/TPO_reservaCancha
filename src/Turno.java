public class Turno {
    int horario;
    boolean disponible;
    TipoCancha tipoCancha;

    public Turno(int horario, boolean disponible, TipoCancha tipoCancha) {
        this.horario = horario;
        this.disponible = disponible;
        this.tipoCancha = tipoCancha;
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

    public TipoCancha getTipoCancha() {
        return tipoCancha;
    }

    public void setTipoCancha(TipoCancha tipoCancha) {
        this.tipoCancha = tipoCancha;
    }

    @Override
    public String toString() {
        return "Cancha: " + tipoCancha.getTipodecancha() + "\n" +
                "Horario: " + horario + "\n" +
                "Disponible: " + disponible + "\n";
    }
}
