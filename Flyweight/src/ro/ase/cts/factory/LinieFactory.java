package ro.ase.cts.factory;

import ro.ase.cts.clase.Linie;
import ro.ase.cts.clase.LinieTransport;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    public Map<Integer, LinieTransport> linie = new HashMap<>();

    public LinieTransport getLinie(int nrLinie, String primaStatie, String ultimaStatie) {
        if (linie.containsKey(nrLinie)) {
            return linie.get(nrLinie);
        } else {
            LinieTransport linie1 = new Linie(nrLinie, primaStatie, ultimaStatie);
            linie.put(nrLinie,linie1);
            return linie1;
        }
    }
}
