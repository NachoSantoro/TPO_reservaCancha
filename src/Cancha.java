public class Cancha {

    int id;
    String tipodecancha;
    int capMax;
    boolean techada;

    public Cancha(int id, String tipodecancha, int capMax, boolean techada) {
        this.id = id;
        this.tipodecancha = tipodecancha;
        this.capMax = capMax;
        this.techada = techada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipodecancha() {
        return tipodecancha;
    }

    public void setTipodecancha(String tipodecancha) {
        this.tipodecancha = tipodecancha;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public boolean isTechada() {
        return techada;
    }

    public void setTechada(boolean techada) {
        this.techada = techada;
    }
}
