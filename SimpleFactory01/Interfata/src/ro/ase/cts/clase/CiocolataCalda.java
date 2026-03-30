package ro.ase.cts.clase;

public class CiocolataCalda extends BauturaAbstract{
    public CiocolataCalda(String nume, int volum, int pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparareBautura() {
        System.out.println("Pui plic cioco calda");
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Ciocolata calda "+super.toString());
    }
}
