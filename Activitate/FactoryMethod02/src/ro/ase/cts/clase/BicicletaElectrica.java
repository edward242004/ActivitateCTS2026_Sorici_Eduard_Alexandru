package ro.ase.cts.clase;

public class BicicletaElectrica extends Bicicleta {
    public BicicletaElectrica(String marcaBicicleta, double costTransport) {
        super(marcaBicicleta, costTransport);
    }

    @Override
    public void livreazaComanda() {
        System.out.println("Bicicleta electrica: " + super.toString() + " a livrat comanda");
    }

}
