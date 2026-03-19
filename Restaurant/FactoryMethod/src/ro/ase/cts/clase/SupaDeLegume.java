package ro.ase.cts.clase;

public class SupaDeLegume extends Supa{
    public SupaDeLegume(double pret, int gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afisareDescriere() {
        System.out.printf("Supa de legume: "+super.toString());
    }
}
