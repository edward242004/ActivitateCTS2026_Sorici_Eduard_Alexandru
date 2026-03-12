package ro.ase.cts.SimpleFactory.clase;

public class Autobuz extends MijlocTransport{


    public Autobuz(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Autobuz" + super.toString());
    }
}