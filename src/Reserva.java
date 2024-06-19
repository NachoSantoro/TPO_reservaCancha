import java.util.ArrayList;
import java.util.List;

public class Reserva {

    TipoCancha cancha;
    Turno horario;
    String nombre;

    public Reserva(TipoCancha cancha, Turno horario, String nombre) {
        this.cancha = cancha;
        this.horario = horario;
        this.nombre = nombre;
    }

}
