package ro.ase.cts.factory;

import ro.ase.cts.clase.BicicletaElectrica;
import ro.ase.cts.clase.BicicletaSimpla;
import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.enums.TipBicicleta;
import ro.ase.cts.enums.TipMijlocTransport;

public class FabricaBicicleta implements FabricaTransport{
    public FabricaBicicleta() {
        super();
    }

    @Override
    public MijlocTransport creeazaTransport(TipMijlocTransport tip, double costTransport, String marca) {
        return switch(tip){
            case TipBicicleta.BicicletaElectrica -> new BicicletaElectrica(marca,costTransport);
            case TipBicicleta.BicicletaSimpla -> new BicicletaSimpla(marca,costTransport);
            default -> null;
        };
    }

    @Override
    public MijlocTransport creeazaTransport(TipMijlocTransport tip, double costTransport, String marca, double consum) {
        return null;
    }
}
