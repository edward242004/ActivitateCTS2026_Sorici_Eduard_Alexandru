package ro.ase.cts.clase;

import java.lang.foreign.AddressLayout;

public class Linie implements LinieTransport {
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void afiseazaAutobuzLinie(Autobuz autobuz) {
        System.out.print(autobuz.toString() + " ");
        System.out.println(this.toString());
    }

    @Override
    public void afiseazaNumarCalatoriPerTraseu(Autobuz autobuz) {
        System.out.println("De la statia " + this.primaStatie +
                " pana la " + this.ultimaStatie + " sunt " + autobuz.getNrLocuri() + " calatori");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
