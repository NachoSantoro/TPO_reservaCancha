public class Main {
    public static void main(String[] args) {
        Complejo patero = new Complejo("Patero's");

        TipoCancha f5 = new TipoCancha(1, "Futbol 5", 10, true);
        TipoCancha f7 = new TipoCancha(2, "Futbol 7", 14, true);
        TipoCancha f9 = new TipoCancha(3, "Futbol 9", 18, true);
        TipoCancha f11 = new TipoCancha(4, "Futbol 11", 22, true);

        patero.agregarCanchas(f5);
        patero.agregarCanchas(f7);
        patero.agregarCanchas(f9);
        patero.agregarCanchas(f11);

        // Crear turnos para cada tipo de cancha
        Turno turno1F5 = new Turno(12, true, f5);
        Turno turno2F5 = new Turno(13, true, f5);
        Turno turno1F11 = new Turno(12, true, f11);
        Turno turno2F11 = new Turno(13, true, f11);

        patero.agregarTurnosDisponibles(turno1F5);
        patero.agregarTurnosDisponibles(turno2F5);
        patero.agregarTurnosDisponibles(turno1F11);
        patero.agregarTurnosDisponibles(turno2F11);

        System.out.println("Turnos disponibles iniciales:");
        patero.getTurnosDisponibles(f5);
        patero.getTurnosDisponibles(f11);
        System.out.println();

        // Caso 1: Dos usuarios intentan reservar el mismo horario y la misma cancha
        System.out.println("Caso 1: Dos usuarios intentan reservar el mismo horario y la misma cancha");
        patero.crearReserva(f11, turno1F11, "Tomy");
        patero.crearReserva(f11, turno1F11, "Luis");
        patero.getReserva(f5);
        patero.getReserva(f11);
        patero.getTurnosDisponibles(f5);
        patero.getTurnosDisponibles(f11);
        System.out.println();

        // Caso 2: Dos usuarios reservan la misma cancha en diferentes horarios
        System.out.println("Caso 2: Dos usuarios reservan la misma cancha en diferentes horarios");
        patero.crearReserva(f11, turno2F11, "Ana");
        patero.getReserva(f5);
        patero.getReserva(f11);
        patero.getTurnosDisponibles(f5);
        patero.getTurnosDisponibles(f11);
        System.out.println();

        // Caso 3: Dos usuarios reservan diferentes canchas en el mismo horario
        System.out.println("Caso 3: Dos usuarios reservan diferentes canchas en el mismo horario");
        patero.crearReserva(f5, turno1F5, "Carlos");
        patero.getReserva(f5);
        patero.getReserva(f11);
        patero.getTurnosDisponibles(f5);
        patero.getTurnosDisponibles(f11);
    }
}
