package ro.ase.cts.clase;

public class Cafea extends Bautura{
    public Cafea(String nume, int mililitri, double pret) {
        super(nume, mililitri, pret);
    }

    @Override
    public void preparareBautura() {
        System.out.println("pui plic cafea pui apa pui lapte");
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Cafea "+ super.toString());
    }
}
