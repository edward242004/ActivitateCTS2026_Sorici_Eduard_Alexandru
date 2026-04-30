package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Linie;
import ro.ase.cts.clase.LinieTransport;
import ro.ase.cts.factory.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("electric",2026,200);
        Autobuz autobuz2 = new Autobuz("diesel",2001,200);
        Autobuz autobuz3= new Autobuz("petrol",2010,200);
        LinieFactory fabrica = new LinieFactory();
        fabrica.getLinie(97,"Romana","Gara de Nord").afiseazaAutobuzLinie(autobuz2);
        fabrica.getLinie(12,"Romana","cfr").afiseazaAutobuzLinie(autobuz);
        fabrica.getLinie(13,"Romana","berceni").afiseazaAutobuzLinie(autobuz3);
    }

}
