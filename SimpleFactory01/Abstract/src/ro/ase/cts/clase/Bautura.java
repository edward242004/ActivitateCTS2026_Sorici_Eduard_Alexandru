package ro.ase.cts.clase;

public abstract class Bautura {
    private String nume;
    private double pret;
    private int mililitri;

    public Bautura(String nume, int mililitri, double pret) {
        this.nume = nume;
        this.mililitri = mililitri;
        this.pret = pret;
    }
    public abstract void preparareBautura();
    public abstract void afisareDescriere();
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" nume ").append(nume);
        sb.append(", pret ").append(pret);
        sb.append(", mililitri ").append(mililitri);
        return sb.toString();
    }

}
