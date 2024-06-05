//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Complejo patero = new Complejo("Patero's");

        TipoCancha f5 = new TipoCancha(01,"Futbol 5",10,true);
        TipoCancha f7 = new TipoCancha(02,"Futbol 7",14,true);
        TipoCancha f9 = new TipoCancha(03,"Futbol 9",18,true);
        TipoCancha f11 = new TipoCancha(04,"Futbol 11",22,true);

        patero.agregarCanchas(f5);
        patero.agregarCanchas(f7);
        patero.agregarCanchas(f9);
        patero.agregarCanchas(f11);

        for (TipoCancha tipoCancha : patero.canchasComplejo){
            System.out.println(tipoCancha.getTipodecancha());
        }
    }
}