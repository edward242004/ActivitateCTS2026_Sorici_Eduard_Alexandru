package ro.ase.cts.clase;

public class Ceai extends BauturaAbstract {

    public Ceai(String nume, int volum, int pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparareBautura() {
        System.out.println("pui punga de ceai la infuzat");
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Ceai " + super.toString());
    }
}
