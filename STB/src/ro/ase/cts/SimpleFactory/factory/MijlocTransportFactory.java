package ro.ase.cts.SimpleFactory.factory;

import ro.ase.cts.SimpleFactory.clase.Autobuz;
import ro.ase.cts.SimpleFactory.clase.MijlocTransport;
import ro.ase.cts.SimpleFactory.clase.Tramvai;
import ro.ase.cts.SimpleFactory.clase.Troleibuz;

public class MijlocTransportFactory {
    private static MijlocTransportFactory instanta = null;

    public static synchronized MijlocTransportFactory getInstance() {
        if (instanta == null) {
            instanta = new MijlocTransportFactory();
        }
        return instanta;
    }

    private MijlocTransportFactory() {
    }

    public MijlocTransport getMijlocTransport(String marca, int linie, MijlocTransportType tip) throws Exception {
        if (tip == MijlocTransportType.TRAMVAI)
            return new Tramvai(marca, linie);

        if (tip == MijlocTransportType.TROLEIBUZ)
            return new Troleibuz(marca, linie);

        if (tip == MijlocTransportType.AUTOBUZ)
            return new Autobuz(marca, linie);
        throw new Exception("Tip invalid!");
    }
}

