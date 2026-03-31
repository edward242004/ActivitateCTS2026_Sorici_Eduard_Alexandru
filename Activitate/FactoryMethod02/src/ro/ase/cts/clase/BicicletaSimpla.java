package ro.ase.cts.clase;

public class BicicletaSimpla extends Bicicleta {
    public BicicletaSimpla(String marcaBicicleta, double costTransport) {
        super(marcaBicicleta, costTransport);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void livreazaComanda() {
        System.out.println("Bicicleta simpla " + super.toString() + " a livrat comanda!");
    }
}
