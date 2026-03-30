package ro.ase.cts.clase;

public class Cafea extends BauturaAbstract {
    public Cafea(String nume, int volum, int pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparareBautura() {
        System.out.println("Se pune cafeaua in lapte ok");
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Cafea " + super.toString());
    }
}
