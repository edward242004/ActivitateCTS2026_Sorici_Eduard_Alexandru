package ro.ase.cts.main;

import ro.ase.cts.clase.Bautura;
import ro.ase.cts.clase.CasaDeMarcat;
import ro.ase.cts.clase.ComandaManager;
import ro.ase.cts.factory.BauturaFactory;
import ro.ase.cts.factory.BauturaType;

public class Main {
    public static void main(String[] args) {
        BauturaFactory factory = BauturaFactory.getInstance();
        Bautura ceai = factory.getBautura("Bobba tea", 10, 150, BauturaType.Ceai);
        Bautura cafea = factory.getBautura("Frapucino", 10, 150, BauturaType.Cafea);
        Bautura ciocolataCaldaNeagra = factory.getBautura("Ciocolata calda neagra", 10, 150, BauturaType.CiocolataCalda);
        Bautura ciocolataCaldaAlba = factory.getBautura("Ciocolata calda alba", 10, 150, BauturaType.CiocolataCalda);

        ceai.afisareDescriere();
        ceai.preparareBautura();

        cafea.afisareDescriere();
        cafea.preparareBautura();

        ciocolataCaldaAlba.afisareDescriere();
        ciocolataCaldaAlba.preparareBautura();

        ciocolataCaldaNeagra.afisareDescriere();
        ciocolataCaldaNeagra.preparareBautura();

        ComandaManager comanda1 = CasaDeMarcat.getInstance();
        ComandaManager comanda2 = CasaDeMarcat.getInstance();
        comanda1.afiseazaComanda();
        comanda1.adaugaBautura(cafea);
        comanda1.adaugaBautura(ceai);
        comanda1.calculeazaPret();
        System.out.println("Comanda 1:\n");
        comanda1.afiseazaComanda();
        comanda1.comandaFinalizata();
        System.out.println("Comanda 2:\n");
        comanda2.adaugaBautura(cafea);
        comanda2.adaugaBautura(ciocolataCaldaAlba);
        comanda2.afiseazaComanda();


    }
}
