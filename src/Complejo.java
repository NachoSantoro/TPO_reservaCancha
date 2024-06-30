import java.util.*;

public class Complejo {

    String nombre;
    Set<TipoCancha> canchasComplejo = new HashSet<>();
    Set<Turno> turnosDisponibles = new HashSet<>();
    public List<Reserva> listado = new ArrayList<>();

    public Complejo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCanchas(TipoCancha tipoCancha) {
        canchasComplejo.add(tipoCancha);
    }

    public void agregarTurnosDisponibles(Turno turno) {
        turnosDisponibles.add(turno);
    }

    public void getCanchasComplejo() {
        for (TipoCancha tipoCancha : canchasComplejo) {
            System.out.println(tipoCancha.getTipodecancha());
        }
    }

    public void getTurnosDisponibles(TipoCancha canchaDeseada) {
        List<Turno> ordenados = turnosDisponibles
                .stream()
                .filter(turno -> turno.isDisponible() && turno.getTipoCancha().equals(canchaDeseada))
                .sorted(Comparator.comparingInt(Turno::getHorario))
                .toList();

        System.out.println("Horarios disponibles para la cancha " + canchaDeseada.getTipodecancha() + ":");
        for (Turno turno : ordenados) {
            System.out.println("Horario: " + turno.getHorario());
            System.out.println("Disponible: " + turno.isDisponible());
            System.out.println("------------");
        }
    }

    public void crearReserva(TipoCancha cancha, Turno horario, String nombre) {
        boolean turnoDisponible = false;

        for (Turno turno : turnosDisponibles) {
            if (turno.getHorario() == horario.getHorario() && turno.getTipoCancha().equals(cancha) && turno.isDisponible()) {
                turnoDisponible = true;
                turno.setDisponible(false);
                Reserva nuevaReserva = new Reserva(cancha, turno, nombre);
                listado.add(nuevaReserva);
                break;
            }
        }

        if (!turnoDisponible) {
            System.out.println("El turno no está disponible.");
        }
    }

    public void getReserva() {
        for (Reserva reserva : listado) {
            System.out.println(reserva.nombre + " reservó la cancha de: " + reserva.cancha.getTipodecancha() + " en el horario: " + reserva.horario.getHorario());
        }
    }
}
