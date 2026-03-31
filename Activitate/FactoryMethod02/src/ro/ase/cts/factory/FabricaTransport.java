package ro.ase.cts.factory;

import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.enums.TipMijlocTransport;

public interface FabricaTransport {
    MijlocTransport creeazaTransport(TipMijlocTransport tip, double costTransport, String marca);
    MijlocTransport creeazaTransport(TipMijlocTransport tip, double costTransport, String marca,double consum);

}
