package ro.ase.cts.SimpleFactory.factory;

import ro.ase.cts.SimpleFactory.clase.Autobuz;
import ro.ase.cts.SimpleFactory.clase.MijlocTransport;
import ro.ase.cts.SimpleFactory.clase.Tramvai;
import ro.ase.cts.SimpleFactory.clase.Troleibuz;

public class MijlocTransportFactory {
    public MijlocTransport getMijlocTransport(String marca, int linie, MijlocTransportType tip)
    {
        if(tip==MijlocTransportType.TRAMVAI)
            return new Tramvai(marca,linie);
        if(tip==MijlocTransportType.TROLEIBUZ)
            return new Troleibuz(marca,linie);
        if(tip==MijlocTransportType.AUTOBUZ);
            return new Autobuz(marca,linie);
    }
}

