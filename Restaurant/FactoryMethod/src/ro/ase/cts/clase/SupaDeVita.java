package ro.ase.cts.clase;

public class SupaDeVita extends Supa {
    public SupaDeVita(double pret, int gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afisareDescriere() {
        System.out.printf("Supa de vita" + super.toString());
    }
}
