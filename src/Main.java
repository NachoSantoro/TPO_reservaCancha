import java.util.Scanner;

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

        Turno turno1F7 = new Turno(12, true, f7);
        Turno turno2F7 = new Turno(13, true, f7);

        Turno turno1F9 = new Turno(12, true, f9);
        Turno turno2F9 = new Turno(13, true, f9);

        Turno turno1F11 = new Turno(12, true, f11);
        Turno turno2F11 = new Turno(13, true, f11);

        patero.agregarTurnosDisponibles(turno1F5);
        patero.agregarTurnosDisponibles(turno2F5);

        patero.agregarTurnosDisponibles(turno1F7);
        patero.agregarTurnosDisponibles(turno2F7);

        patero.agregarTurnosDisponibles(turno1F9);
        patero.agregarTurnosDisponibles(turno2F9);

        patero.agregarTurnosDisponibles(turno1F11);
        patero.agregarTurnosDisponibles(turno2F11);

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar turnos disponibles");
            System.out.println("2. Mostrar canchas disponibles");
            System.out.println("3. Crear una reserva");
            System.out.println("4. Mostrar reservas");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Turnos disponibles:");
                    patero.getTurnosDisponibles();
                    break;
                case 2:
                    System.out.println("Canchas disponibles:");
                    patero.getCanchasComplejo();
                    break;
                case 3:
                    System.out.println("Ingrese el tipo de cancha (5, 7, 9, 11):");
                    int tipoCancha = scanner.nextInt();
                    scanner.nextLine();

                    TipoCancha canchaSeleccionada = null;
                    switch (tipoCancha) {
                        case 5:
                            canchaSeleccionada = f5;
                            break;
                        case 7:
                            canchaSeleccionada = f7;
                            break;
                        case 9:
                            canchaSeleccionada = f9;
                            break;
                        case 11:
                            canchaSeleccionada = f11;
                            break;
                        default:
                            System.out.println("Tipo de cancha no válido.");
                            continue;
                    }

                    System.out.println("Ingrese el horario (ej: 12, 13):");
                    int horario = scanner.nextInt();
                    scanner.nextLine();

                    Turno turnoSeleccionado = null;
                    for (Turno turno : patero.turnosDisponibles) {
                        if (turno.getHorario() == horario && turno.getTipoCancha().equals(canchaSeleccionada) && turno.isDisponible()) {
                            turnoSeleccionado = turno;
                            break;
                        }
                    }

                    if (turnoSeleccionado == null) {
                        System.out.println("Turno no disponible.");
                        break;
                    }

                    System.out.println("Ingrese el nombre del usuario:");
                    String nombre = scanner.nextLine();

                    patero.crearReserva(canchaSeleccionada, turnoSeleccionado, nombre);
                    System.out.println("Reserva creada con éxito.");
                    break;
                case 4:
                    System.out.println("Reservas:");
                    patero.getReserva();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
