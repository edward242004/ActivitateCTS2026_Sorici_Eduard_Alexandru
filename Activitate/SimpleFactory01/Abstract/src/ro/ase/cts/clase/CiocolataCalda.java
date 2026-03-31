package ro.ase.cts.clase;

public class CiocolataCalda extends Bautura {

    public CiocolataCalda(String nume, int mililitri, double pret) {
        super(nume, mililitri, pret);
    }

    @Override
    public void preparareBautura() {
        System.out.println("pui plic ciocolata calda si lapte cald");
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Ciocolata calda "+super.toString());
    }
}
