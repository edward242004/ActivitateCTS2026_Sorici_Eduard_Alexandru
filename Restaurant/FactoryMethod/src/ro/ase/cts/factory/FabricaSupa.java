package ro.ase.cts.factory;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.SupaDeLegume;
import ro.ase.cts.clase.SupaDeVita;
import ro.ase.cts.enums.TipFelDeMancare;
import ro.ase.cts.enums.TipSupa;

public class FabricaSupa implements FabricaFelDeMancare {
    public FabricaSupa() {
        super();
    }

    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret) {
        return switch (tip) {
            case TipSupa.SupaDeLegume -> new SupaDeLegume(pret, gramaj);
            case TipSupa.SupaDeVita -> new SupaDeVita(pret, gramaj);
            default -> null;
        };
    }

    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int nrCalorii) {
        return null;
    }
}
