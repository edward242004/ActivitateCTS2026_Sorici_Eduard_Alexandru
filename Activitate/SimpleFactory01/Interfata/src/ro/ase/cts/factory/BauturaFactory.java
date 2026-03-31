package ro.ase.cts.factory;


import ro.ase.cts.clase.Bautura;
import ro.ase.cts.clase.Cafea;
import ro.ase.cts.clase.Ceai;
import ro.ase.cts.clase.CiocolataCalda;

public class BauturaFactory {
    private static BauturaFactory instanta = null;

    private BauturaFactory() {
    }

    public static BauturaFactory getInstance() {
        if (instanta == null) {
            instanta = new BauturaFactory();
        }
        return instanta;
    }

    public Bautura getBautura(String nume, int pret, int volum, BauturaType tip){
        return switch (tip){
            case BauturaType.Ceai -> new Ceai(nume,pret,volum);
            case BauturaType.CiocolataCalda -> new CiocolataCalda(nume,volum,pret);
            case BauturaType.Cafea -> new Cafea(nume, volum, pret);
        };
    }

}
