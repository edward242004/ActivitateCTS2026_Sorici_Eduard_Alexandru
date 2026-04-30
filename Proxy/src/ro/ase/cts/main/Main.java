package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.AutobuzCursaSpeciala;
import ro.ase.cts.clase.AutobuzDeNoapte;
import ro.ase.cts.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport mijlocTransport = new Autobuz("1", 3);
        mijlocTransport.opresteInStatie();
        mijlocTransport.opresteInStatie();
        MijlocTransport mijlocTransport1 = new AutobuzDeNoapte(mijlocTransport);
        mijlocTransport1.opresteInStatie();
        mijlocTransport1.getNrCalatori();
        MijlocTransport autobuz2 = new Autobuz("2", 0);
        MijlocTransport autobuzNoapte2 = new AutobuzDeNoapte(autobuz2);
        autobuzNoapte2.opresteInStatie();
        autobuz2.opresteInStatie();

        MijlocTransport autobuz3 = new Autobuz("3speciala",0);
        MijlocTransport autobuz4 = new AutobuzCursaSpeciala(autobuz3);
        autobuz4.opresteInStatie();

    }
}
