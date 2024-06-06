import java.util.HashSet;
import java.util.Set;

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
        for (TipoCancha tipoCancha : canchasComplejo) {
            System.out.println(tipoCancha.tipodecancha);
        }
    }

    public void getTurnosDisponibles() {
        for (Turno turno : turnosDisponibles) {
            if (turno.isDisponible())
                System.out.println(turno.getHorario());
        }
    }


}
