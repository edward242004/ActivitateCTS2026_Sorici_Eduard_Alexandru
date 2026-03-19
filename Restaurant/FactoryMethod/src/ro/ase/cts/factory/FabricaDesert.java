package ro.ase.cts.factory;

import ro.ase.cts.clase.Clatite;
import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Papanasi;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipFelDeMancare;

public class FabricaDesert implements FabricaFelDeMancare {

    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret) {
        return creeareFelDeMancare(tip, gramaj, pret, 500);
    }

    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int nrCalorii) {
        return switch (tip) {
            case TipDesert.Papanasi -> new Papanasi(nrCalorii, pret, gramaj);
            case TipDesert.Clatite -> new Clatite(nrCalorii, pret, gramaj);
            default -> null;
        };
    }
}
