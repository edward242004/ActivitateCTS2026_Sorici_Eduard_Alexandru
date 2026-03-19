package ro.ase.cts.clase;

public class Supa implements FelDeMancare {
    int gramaj;
    double pret;

    public Supa(double pret, int gramaj) {
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        return sb.toString();
    }

    @Override
    public void afisareDescriere() {

    }
}
