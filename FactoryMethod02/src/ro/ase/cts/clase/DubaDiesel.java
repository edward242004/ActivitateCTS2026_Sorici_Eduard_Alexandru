package ro.ase.cts.clase;

public class DubaDiesel extends Duba {

    public DubaDiesel(double costTransport, String marca, double consum) {
        super(costTransport, marca, consum);
    }

    @Override
    public void livreazaComanda() {
        System.out.println("Duba diesel " + super.toString() + " a livrat comanda!");
    }
}
