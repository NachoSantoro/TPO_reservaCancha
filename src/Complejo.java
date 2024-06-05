import java.util.HashSet;
import java.util.Set;

public class Complejo {

    String nombre;

    Set<TipoCancha> canchasComplejo = new HashSet<>();

    public Complejo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<TipoCancha> getCanchasComplejo() {
        return canchasComplejo;
    }

    public void setCanchasComplejo(Set<TipoCancha> canchasComplejo) {
        this.canchasComplejo = canchasComplejo;
    }

    public void agregarCanchas(TipoCancha tipoCancha){
        canchasComplejo.add(tipoCancha);
    }


}
