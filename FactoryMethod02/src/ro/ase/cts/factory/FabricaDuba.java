package ro.ase.cts.factory;

import ro.ase.cts.clase.DubaDiesel;
import ro.ase.cts.clase.DubaElectrica;
import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.enums.TipDuba;
import ro.ase.cts.enums.TipMijlocTransport;

public class FabricaDuba implements FabricaTransport{
    @Override
    public MijlocTransport creeazaTransport(TipMijlocTransport tip, double costTransport, String marca, double consum) {
        return switch(tip){
            case TipDuba.DubaDiesel -> new DubaDiesel(costTransport,marca,consum);
            case TipDuba.DubaElectrica -> new DubaElectrica(costTransport,marca,consum);
            default -> null;
        };
    }

    @Override
    public MijlocTransport creeazaTransport(TipMijlocTransport tip, double costTransport, String marca) {
        return null;
    }
}
