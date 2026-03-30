package ro.ase.cts.clase;

public class Ceai extends Bautura {
    public Ceai(String nume, int mililitri, double pret) {
        super(nume, mililitri, pret);
    }

    @Override
    public void preparareBautura() {
        System.out.println("pui punga de ceai la infuzat");
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Ceai"+super.toString());
    }
}
