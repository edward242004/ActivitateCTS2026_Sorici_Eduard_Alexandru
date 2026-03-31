package ro.ase.cts.main;

import ro.ase.cts.clase.Bautura;
import ro.ase.cts.clase.Ceai;
import ro.ase.cts.factory.BauturaFactory;
import ro.ase.cts.factory.BauturaType;

public class Main {
    public static void main(String[] args) {
        BauturaFactory factory= BauturaFactory.getInstance();
        Bautura cafea1 = factory.getBautura("Frapuccino",500,21, BauturaType.Cafea);
        Bautura ceai1=factory.getBautura("Bobba tea",330,25,BauturaType.Ceai);
        Bautura ciocolataCalda = factory.getBautura("LaFesta",500,15,BauturaType.CiocolataCalda);
        cafea1.afisareDescriere();
        cafea1.preparareBautura();
        ceai1.afisareDescriere();
        ceai1.preparareBautura();

        ciocolataCalda.afisareDescriere();
        ciocolataCalda.preparareBautura();
    }
}
