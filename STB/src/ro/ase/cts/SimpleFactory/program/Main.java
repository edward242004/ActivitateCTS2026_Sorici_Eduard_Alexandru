package ro.ase.cts.SimpleFactory.program;

import ro.ase.cts.SimpleFactory.clase.MijlocTransport;
import ro.ase.cts.SimpleFactory.factory.MijlocTransportFactory;
import ro.ase.cts.SimpleFactory.factory.MijlocTransportType;

public class Main {
    public static void afisareMijlocTransport(MijlocTransport mijlocTransport){
        mijlocTransport.afisareDescriere();

    }
    public static void main(String[] args) {
        MijlocTransportFactory factory = new MijlocTransportFactory();
        MijlocTransport autobuz = factory.getMijlocTransport("mercedes",432, MijlocTransportType.AUTOBUZ);
        MijlocTransport tramvai = factory.getMijlocTransport("mercecdesT",101,MijlocTransportType.TRAMVAI);
        MijlocTransport troleibuz = factory.getMijlocTransport("mercedesTR",101,MijlocTransportType.TROLEIBUZ);
        afisareMijlocTransport(troleibuz);
        afisareMijlocTransport(autobuz);
        afisareMijlocTransport(tramvai);
    }

}
