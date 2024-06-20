import java.util.*;
import java.util.stream.Collectors;

public class Complejo {

    String nombre;

    Set<TipoCancha> canchasComplejo = new HashSet<>();
    Set<Turno> turnosDisponibles = new HashSet<>();

    public Complejo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    public Set<TipoCancha> getCanchasComplejo() {
//        return canchasComplejo;
//    }

//    public void setCanchasComplejo(Set<TipoCancha> canchasComplejo) {
//        this.canchasComplejo = canchasComplejo;
//    }

    public void agregarCanchas(TipoCancha tipoCancha){
        canchasComplejo.add(tipoCancha);
    }

    public void agregarTurnosDisponibles(Turno turno){
        turnosDisponibles.add(turno);
    }

    public void getCanchasComplejo() {
//        for (TipoCancha tipoCancha : canchasComplejo) {
//            System.out.println(tipoCancha.tipodecancha);
//        }
        List<TipoCancha> ordenados = canchasComplejo
                .stream()
                .sorted(Comparator.comparingInt(Cancha::getId))
                .toList();

        // Printing the sorted names
        System.out.println("Canchas List (A a Z):" + ordenados);

    }

    // Actualización de este método
    public void getTurnosDisponibles(TipoCancha canchaDeseada) {
        List<Turno> ordenados = turnosDisponibles
                .stream()
                .filter(turno -> turno.isDisponible() && turno.getTipoCancha().equals(canchaDeseada))
                .sorted(Comparator.comparingInt(Turno::getHorario))
                .toList();

        System.out.println("Horarios disponibles para la cancha " + canchaDeseada.getTipodecancha() + ": " + ordenados);
    }


    public List<Reserva> listado = new ArrayList<>();

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

    public void getReserva(TipoCancha cancha) {
        boolean found = false;
        for (Reserva reserva : listado) {
            if (reserva.cancha.equals(cancha)) {
                System.out.println(reserva.nombre + " reservó la cancha de: " + reserva.cancha.getTipodecancha() + " en el horario: " + reserva.horario.getHorario());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No hay reservas para la cancha: " + cancha.getTipodecancha());
        }
    }


}
