package ro.ase.cts.clase;

public class DubaElectrica extends Duba {
    public DubaElectrica(double costTransport, String marca, double consum) {
        super(costTransport, marca, consum);
    }

    @Override
    public void livreazaComanda() {
        System.out.println("Duba electrica" + super.toString() + " a livrat comanda!");
    }
}
